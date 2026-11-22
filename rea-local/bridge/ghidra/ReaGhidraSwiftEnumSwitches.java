import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import ghidra.app.cmd.disassemble.DisassembleCommand;
import ghidra.app.cmd.function.CreateFunctionCmd;
import ghidra.app.util.PseudoDisassembler;
import ghidra.program.database.mem.FileBytes;
import ghidra.program.model.address.*;
import ghidra.program.model.lang.Register;
import ghidra.program.model.listing.*;
import ghidra.program.model.mem.MemoryBlock;
import ghidra.program.model.pcode.JumpTable;
import ghidra.program.model.pcode.PcodeOp;
import ghidra.program.model.reloc.Relocation;
import ghidra.program.model.symbol.*;
import ghidra.util.task.TaskMonitor;
import java.util.*;
import java.util.regex.*;

/**
 * Source-immutable analysis of an AArch64 Swift multi-payload enum dispatch.
 * Bounds come from ABI metadata, never table length or neighboring symbols.
 * Repairs are committed before the bridge serves any observations. Unsupported
 * accessors, aliases, control flow and resource extents leave the Program alone.
 */
final class ReaGhidraSwiftEnumSwitches {
    // Bound allocation/output from untrusted metadata independently of the file's
    // declared counts. This is a recovery budget, not a Swift format limit.
    private static final int MAX_CASES = 4096;
    private static final int MAX_QUERIES = 100000;
    private static final String DARWIN_PROBE_ABI = "trusted-darwin-arm64-chkstk-v1";
    private static final String SNAPSHOT_ABI = "swift-dynamic-typed-snapshot-v1";
    private final Map<Address,String> snapshotProofs = new HashMap<>();
    private final Map<Address,Value> snapshotTags = new HashMap<>();
    private final Program program;
    private final TaskMonitor monitor;
    private final Map<Address, EnumInfo> accessors = new HashMap<>();
    private final Map<Address, FixedEnum> fixedEnums = new HashMap<>();
    private final Set<Address> memcpyCallees = new HashSet<>();
    private final Map<Address,String> outlinedProofs = new HashMap<>();
    private final Map<Address, Recovery> recovered = new LinkedHashMap<>();
    private final Set<Address> tagCallees = new HashSet<>();
    private final Set<Address> singletonCallees = new HashSet<>();
    private final Map<Address,ProbeImport> probeImports = new HashMap<>();
    private List<String> probeLibraries = List.of();
    private ProbeImport uniqueProbeImport;
    private record EnumInfo(Address descriptor, Address fields, Address accessor, Address cache,
                            int payloads, int empty, List<String> names) {
        int count() { return payloads + empty; }
    }
    private record Value(String kind, long number, EnumInfo type, Address origin) {}
    private record Query(String register, Long slot, Address before) {}
    private record MemoryOperand(String base, long offset) {}
    private record Recovery(Function owner, Address dispatch, Address table, Address anchor,
                            Address tagCall, Address limit, EnumInfo type, List<Address> targets,
                            Address interveningLoad, String probeProof) {}
    private record FixedEnum(EnumInfo type, Address metadata, Address witness, Address getter, long size) {}
    private record ProjectionQuery(Address before, boolean copied) {}
    private record FrameWrite(long start, int size) {}
    private record ProbeImport(Address external, String library, long ordinal) {}
    private record ProbeTarget(ProbeImport binding, Address slot) {}
    private record ProbeEffect(ProbeTarget target, FrameWrite scratch) {}
    private static final Pattern MEMORY = Pattern.compile(
        "(?i)^\\[([xw]\\d+|sp)(?:,\\s*#?(-?0x[0-9a-f]+|-?\\d+))?\\]!?$");
    private static final Pattern INDEXED = Pattern.compile(
        "(?i)^\\[([x]\\d+),\\s*([x]\\d+),\\s*LSL\\s*#?(0x2|2)\\]$");

    ReaGhidraSwiftEnumSwitches(Program program, TaskMonitor monitor) {
        this.program = program;
        this.monitor = monitor;
    }

    void analyze() throws Exception {
        if (!program.getExecutableFormat().contains("Mach-O") ||
            !program.getLanguageID().getIdAsString().startsWith("AARCH64:LE:") ||
            program.getDefaultPointerSize() != 8) return;
        collectImports("swift_getEnumCaseMultiPayload", tagCallees);
        collectImports("swift_getSingletonMetadata", singletonCallees);
        collectMemcpyImports();
        collectProbeImports();
        if (tagCallees.isEmpty() || singletonCallees.isEmpty()) return;
        readEnums();
        readAccessorEnums();
        accessors.values().removeIf(Objects::isNull);
        if (accessors.isEmpty()) return;
        Set<Function> owners = new LinkedHashSet<>();
        for (Address callee : tagCallees) {
            for (Reference ref : program.getReferenceManager().getReferencesTo(callee)) {
                monitor.checkCancelled();
                if (!ref.getReferenceType().isCall()) continue;
                Function owner = program.getFunctionManager().getFunctionContaining(ref.getFromAddress());
                if (owner != null && !owner.isThunk() && !owner.isExternal()) owners.add(owner);
            }
        }
        for (Function owner : owners) {
            monitor.checkCancelled();
            Graph graph = new Graph(owner);
            for (Instruction instruction : graph.instructions.values()) {
                if (!name(instruction).equals("BR")) continue;
                Recovery candidate = match(graph, instruction);
                if (candidate != null && repair(candidate)) recovered.put(candidate.dispatch, candidate);
            }
        }
    }

    private void collectImports(String abiName, Set<Address> result) {
        for (Function external : program.getFunctionManager().getExternalFunctions()) {
            String symbol = external.getName();
            if (!symbol.equals(abiName) && !symbol.equals("_" + abiName)) continue;
            ExternalLocation location = external.getExternalLocation();
            if (location == null || !location.getLibraryName().replace('\\','/').matches("(?:.*/)?libswiftCore\\.dylib")) continue;
            result.add(external.getEntryPoint());
            Address[] thunks = external.getFunctionThunkAddresses(true);
            if (thunks != null) Collections.addAll(result, thunks);
        }
    }

    private void readEnums() throws Exception {
        for (MemoryBlock block : program.getMemory().getBlocks()) {
            if (!block.isInitialized() || !block.getName().endsWith("__swift5_types")) continue;
            for (long offset = 0; offset + 4 <= block.getSize(); offset += 4) {
                monitor.checkCancelled();
                Address slot = block.getStart().add(offset);
                int relative = program.getMemory().getInt(slot);
                // Indirect/type-reference forms have distinct ABI semantics.
                if (relative == 0 || (relative & 3) != 0) continue;
                try {
                    Address descriptor = slot.addNoWrap(relative);
                    EnumInfo info = readEnum(descriptor);
                    if (info != null && (accessorMatches(info) || sharedAccessorMatches(info))) {
                        // An ambiguous accessor cannot establish a unique enum.
                        retainAccessor(info);
                    }
                    FixedEnum fixed = readFixedEnum(descriptor);
                    if (fixed != null) {
                        fixedEnums.put(descriptor, fixed);
                    }
                } catch (ghidra.program.model.mem.MemoryAccessException |
                         AddressOverflowException invalid) {
                    // Malformed file-backed metadata is not a recovery authority.
                }
            }
        }
    }

    private void retainAccessor(EnumInfo info) {
        if (accessors.containsKey(info.accessor)) {
            EnumInfo prior=accessors.get(info.accessor);
            if (prior==null || !prior.descriptor.equals(info.descriptor)) accessors.put(info.accessor,null);
        } else accessors.put(info.accessor,info);
    }

    /** Noncopyable outer enums need not occur in __swift5_types. An actual
     * singleton call can identify the existing complete -Onone accessor shape;
     * require its declared descriptor to point back to that same accessor.
     * Neither a symbol spelling nor a scan for descriptor-looking bytes binds it.
     */
    private void readAccessorEnums() throws Exception {
        Set<Address> seen=new HashSet<>();
        int probes=0;
        for (Address singleton:singletonCallees) {
            for (Reference reference:program.getReferenceManager().getReferencesTo(singleton)) {
                monitor.checkCancelled();
                if (++probes>MAX_QUERIES) return;
                if (!reference.getReferenceType().isCall()) continue;
                Function owner=program.getFunctionManager().getFunctionContaining(reference.getFromAddress());
                if (owner==null || owner.isExternal() || owner.isThunk() || !seen.add(owner.getEntryPoint())) continue;
                Address start=owner.getEntryPoint();
                Instruction[] pair=decode(start.add(52),"ADRP","ADD");
                if (pair==null || !op(pair[0],0).equals("x1") || !sameOperands(pair[1],"x1","x1")) continue;
                Long page=immediate(pair[0],1),delta=immediate(pair[1],2);
                if (page==null || delta==null) continue;
                try {
                    EnumInfo info=readEnum(address(page+delta));
                    if (info!=null && info.accessor.equals(start) && accessorMatches(info)) retainAccessor(info);
                } catch (ghidra.program.model.mem.MemoryAccessException | AddressOverflowException invalid) {
                    // A malformed cold-path candidate cannot establish identity.
                }
            }
        }
    }

    private void collectMemcpyImports() {
        for (Function external : program.getFunctionManager().getExternalFunctions()) {
            if (!external.getName().equals("_memcpy") && !external.getName().equals("memcpy")) continue;
            ExternalLocation location = external.getExternalLocation();
            if (location == null || !location.getLibraryName().replace('\\','/').matches(
                    "(?:.*/)?(?:libSystem\\.B|libsystem_c)\\.dylib")) continue;
            memcpyCallees.add(external.getEntryPoint());
            Address[] thunks = external.getFunctionThunkAddresses(true);
            if (thunks != null) Collections.addAll(memcpyCallees, thunks);
        }
    }

    /** Literal imported Mach-O spelling and system install names only. This is
     * a named normal-return ABI assumption, not an Arc/runtime byte binding.
     */
    private void collectProbeImports() throws Exception {
        probeLibraries=probeLibraryOrder();
        if (probeLibraries.isEmpty()) return;
        Long ordinal=originalProbeOrdinal();
        if (ordinal==null) return;
        int examined=0;
        String library=probeLibraries.get(ordinal.intValue()-1);
        if (!Set.of("/usr/lib/libSystem.B.dylib", "/usr/lib/system/libcompiler_rt.dylib").contains(library)) return;
        ExternalLocation selected=null;
        for (String name:program.getExternalManager().getExternalLibraryNames()) {
            ExternalLocationIterator locations=program.getExternalManager().getExternalLocations(name);
            while (locations.hasNext()) {
                monitor.checkCancelled();
                if (++examined>MAX_QUERIES) return;
                ExternalLocation location=locations.next();
                if (location.getSource()!=SourceType.IMPORTED || !"___chkstk_darwin".equals(importedName(location))) continue;
                if (selected!=null || !library.equals(location.getLibraryName())) return;
                selected=location;
            }
        }
        if (selected==null || selected.getExternalSpaceAddress()==null) return;
        uniqueProbeImport=new ProbeImport(selected.getExternalSpaceAddress(),library,ordinal);
        probeImports.put(selected.getExternalSpaceAddress(),uniqueProbeImport);
    }

    private static String importedName(ExternalLocation location) {
        String original=location.getOriginalImportedName();
        return original==null?location.getLabel():original;
    }

    /** Original Mach-O load-command order, not ExternalManager enumeration. */
    private List<String> probeLibraryOrder() throws Exception {
        Address header=program.getImageBase();
        if (!initialized(header,32) || program.getMemory().getInt(header)!=0xfeedfacf ||
            program.getMemory().getInt(header.add(4))!=0x100000c ||
            (program.getMemory().getInt(header.add(24))&0x80)==0) return List.of();
        long count=Integer.toUnsignedLong(program.getMemory().getInt(header.add(16)));
        long size=Integer.toUnsignedLong(program.getMemory().getInt(header.add(20)));
        if (count>MAX_CASES || size>4L*MAX_QUERIES || !initialized(header,32+size)) return List.of();
        List<String> libraries=new ArrayList<>();
        long offset=32, end=32+size;
        for (long index=0;index<count;index++) {
            monitor.checkCancelled();
            if (offset+8>end) return List.of();
            Address command=header.add(offset);
            int kind=program.getMemory().getInt(command);
            long length=Integer.toUnsignedLong(program.getMemory().getInt(command.add(4)));
            if (length<8 || (length&7)!=0 || length>end-offset) return List.of();
            if (Set.of(0x10,0x15,0x20).contains(kind)) return List.of();
            if (Set.of(0xc,0x80000018,0x8000001f,0x80000023).contains(kind)) {
                if (length<24) return List.of();
                long nameOffset=Integer.toUnsignedLong(program.getMemory().getInt(command.add(8)));
                if (nameOffset<24 || nameOffset>=length) return List.of();
                String name=cString(command.add(nameOffset));
                if (name==null || name.getBytes(java.nio.charset.StandardCharsets.UTF_8).length+1>length-nameOffset) return List.of();
                libraries.add(name);
            }
            offset+=length;
        }
        return offset==end?libraries:List.of();
    }

    /** Identity admission scans the bounded original import table, not every
     * unrelated rebase in the loaded Program. In particular, a large image's
     * rebase count cannot consume the binding-identity decode budget.
     * Mixed classic binding/section-relocation carriers remain unsupported:
     * their discarded ordinals cannot establish global same-name uniqueness.
     */
    private Long originalProbeOrdinal() throws Exception {
        List<FileBytes> sources=program.getMemory().getAllFileBytes();
        if (sources.size()!=1) return null;
        ProbeSource source=new ProbeSource(sources.get(0));
        try {
            if (!source.span(0,32)) return null;
            long commandBytes=source.u32(20),commands=source.u32(16);
            if (commands>MAX_CASES || commandBytes>4L*MAX_QUERIES || !source.span(0,32+commandBytes)) return null;
            byte[] original=source.read(0,(int)(32+commandBytes)),loaded=new byte[original.length];
            if (program.getMemory().getBytes(program.getImageBase(),loaded)!=loaded.length || !Arrays.equals(original,loaded)) return null;
            long at=32,end=32+commandBytes,fixups=-1,fixupsBytes=0;
            for (long index=0;index<commands;index++) {
                monitor.checkCancelled();
                if (at+8>end) return null;
                long kind=source.u32(at),length=source.u32(at+4);
                if (length<8 || (length&7)!=0 || length>end-at) return null;
                if (kind==0x80000034L) {
                    if (fixups>=0 || length!=16) return null;
                    fixups=source.u32(at+8);fixupsBytes=source.u32(at+12);
                } else if (kind==0x22 || kind==0x80000022L) {
                    if (length!=48 || source.u32(at+20)!=0 || source.u32(at+28)!=0 || source.u32(at+36)!=0) return null;
                } else if (kind==0xb) {
                    if (length!=80 || source.u32(at+68)!=0) return null;
                } else if (kind==0x19) {
                    if (length<72) return null;
                    long sections=source.u32(at+64);
                    if (sections>(length-72)/80 || 72+80*sections!=length) return null;
                    for (long section=0;section<sections;section++)
                        if (source.u32(at+72+80*section+60)!=0) return null;
                }
                at+=length;
            }
            if (at!=end || fixups<0 || fixupsBytes<28 || !source.span(fixups,fixupsBytes) || source.u32(fixups)!=0) return null;
            long imports=source.u32(fixups+8),symbols=source.u32(fixups+12),count=source.u32(fixups+16);
            long format=source.u32(fixups+20),symbolsFormat=source.u32(fixups+24);
            int width=format==1?4:format==2?8:format==3?16:0;
            if (width==0 || symbolsFormat!=0 || count>MAX_QUERIES || imports<28 || imports>fixupsBytes ||
                count>(fixupsBytes-imports)/width || symbols<imports+count*width || symbols>=fixupsBytes) return null;
            String literal="___chkstk_darwin";
            byte[] name=(literal+"\0").getBytes(java.nio.charset.StandardCharsets.US_ASCII);
            Long selected=null;
            for (long index=0;index<count;index++) {
                monitor.checkCancelled();
                long record=fixups+imports+index*width,value=format==3?source.u64(record):source.u32(record);
                long nameOffset=format==3?value>>>32:value>>>9;
                if (nameOffset>=fixupsBytes-symbols) return null;
                // Ghidra reads US-ASCII then replaces each invalid symbol
                // character with one underscore. Both operations preserve the
                // byte/character count here, so a longer name cannot collide.
                byte[] rawName=source.read(fixups+symbols+nameOffset,(int)Math.min(name.length,fixupsBytes-symbols-nameOffset));
                int terminated=0;while (terminated<rawName.length && rawName[terminated]!=0) terminated++;
                if (terminated==rawName.length) { if (rawName.length<name.length) return null;continue; }
                String decoded=new String(rawName,0,terminated,java.nio.charset.StandardCharsets.US_ASCII);
                if (!literal.equals(SymbolUtilities.replaceInvalidChars(decoded,true))) continue;
                if (!Arrays.equals(rawName,name)) return null; // normalized lookalikes cannot supply literal identity
                // Ghidra 12.1.4 does not apply the import-table addend when
                // fixing up this pointer. Its loaded target alone therefore
                // cannot attest a nonzero addend's actual dyld destination.
                if ((format==2 && source.u32(record+4)!=0) || (format==3 && source.u64(record+8)!=0)) return null;
                long ordinal=format==3?value&0xffff:value&0xff;
                if (format==3 && ordinal>0xfff0) ordinal=(short)ordinal;
                else if (format!=3 && ordinal>0xf0) ordinal=(byte)ordinal;
                if (ordinal<=0 || ordinal>probeLibraries.size() || (selected!=null && selected.longValue()!=ordinal)) return null;
                selected=ordinal;
            }
            return selected;
        } catch (java.io.IOException | ArithmeticException invalid) { return null; }
    }

    private static final class ProbeSource {
        final FileBytes bytes;
        ProbeSource(FileBytes bytes) { this.bytes=bytes; }
        boolean span(long start,long length) { return start>=0 && length>=0 && start<=bytes.getSize() && length<=bytes.getSize()-start; }
        byte[] read(long start,int length) throws java.io.IOException {
            if (!span(start,length)) throw new java.io.IOException("Original Mach-O span exceeds carrier");
            byte[] result=new byte[length];
            if (bytes.getOriginalBytes(start,result)!=length) throw new java.io.IOException("Incomplete original Mach-O span");
            return result;
        }
        long u32(long start) throws java.io.IOException {
            return Integer.toUnsignedLong(java.nio.ByteBuffer.wrap(read(start,4)).order(java.nio.ByteOrder.LITTLE_ENDIAN).getInt());
        }
        long u64(long start) throws java.io.IOException {
            return java.nio.ByteBuffer.wrap(read(start,8)).order(java.nio.ByteOrder.LITTLE_ENDIAN).getLong();
        }
    }

    private Long probeOrdinal(Relocation relocation) {
        long[] values=relocation.getValues();
        return relocation.getStatus()==Relocation.Status.APPLIED && relocation.getType()==0x8888 &&
            relocation.getLength()==8 && values!=null && values.length==1 &&
            values[0]>0 && values[0]<=probeLibraries.size()?values[0]:null;
    }

    private boolean probePlaceholder(Address target) {
        if (uniqueProbeImport==null) return false;
        if (probeImports.containsKey(target)) return true;
        MemoryBlock block=program.getMemory().getBlock(target);
        if (block==null) return false;
        boolean placeholder=block.getName().equals("EXTERNAL") && (block.getFlags()&MemoryBlock.ARTIFICIAL)!=0;
        if (!placeholder && !block.getName().endsWith("__stubs")) return false;
        // Ghidra may turn an imported data placeholder into a DEFAULT-source
        // function thunk. Its canonical imported destination, never that local
        // symbol's spelling or source, supplies the binding in this form.
        Function function=program.getFunctionManager().getFunctionAt(target);
        Function external=function==null || !function.isThunk()?null:function.getThunkedFunction(true);
        if (external!=null && probeImports.containsKey(external.getEntryPoint())) return true;
        if (placeholder) {
            Symbol[] symbols=program.getSymbolTable().getSymbols(target);
            return symbols.length==1 && symbols[0].getSource()==SourceType.IMPORTED &&
                symbols[0].getName().equals("___chkstk_darwin");
        }
        return false;
    }

    private ProbeTarget probeSlot(Address slot) throws Exception {
        MemoryBlock block=program.getMemory().getBlock(slot);
        if (block==null || (!block.getName().endsWith("__got") &&
            !block.getName().endsWith("__la_symbol_ptr")) || (slot.getOffset()&7)!=0 || !initialized(slot,8)) return null;
        List<Relocation> relocations=program.getRelocationTable().getRelocations(slot);
        if (uniqueProbeImport==null || relocations.size()!=1) return null;
        Relocation relocation=relocations.get(0);
        Long ordinal=probeOrdinal(relocation);
        if (ordinal==null || ordinal.longValue()!=uniqueProbeImport.ordinal || !"___chkstk_darwin".equals(relocation.getSymbolName()) ||
            !probeLibraries.get(ordinal.intValue()-1).equals(uniqueProbeImport.library)) return null;
        Address target=address(program.getMemory().getLong(slot));
        Reference[] references=program.getReferenceManager().getReferencesFrom(slot);
        if (references.length!=1 || references[0].getSource()!=SourceType.DEFAULT ||
            !references[0].getReferenceType().equals(RefType.DATA) || !references[0].getToAddress().equals(target) ||
            !probePlaceholder(target)) return null;
        return new ProbeTarget(uniqueProbeImport,slot);
    }

    private ProbeTarget probeLoad(Instruction page,Instruction load) throws Exception {
        if (page==null || load==null || !name(page).equals("ADRP") || !op(page,0).equals("x16") ||
            !name(load).equals("LDR") || !op(load,0).equals("x16") || load.getNumOperands()!=2 ||
            !op(load,1).endsWith("]")) return null;
        MemoryOperand memory=memory(load,1);
        Long base=immediate(page,1);
        if (memory==null || !memory.base.equals("r16") || memory.offset<0 || memory.offset>=4096 ||
            base==null || (base&4095)!=0) return null;
        try { return probeSlot(address(Math.addExact(base,memory.offset))); }
        catch (ArithmeticException overflow) { return null; }
    }

    private ProbeTarget probeStub(Address target) throws Exception {
        MemoryBlock block=target==null?null:program.getMemory().getBlock(target);
        if (block==null || !block.getName().endsWith("__stubs")) return null;
        Instruction[] code=decode(target,"ADRP","LDR","BR");
        if (code==null || !op(code[2],0).equals("x16")) return null;
        for (int index=1;index<3;index++)
            for (Reference ref:program.getReferenceManager().getReferencesTo(code[index].getAddress()))
                if (ref.getReferenceType().isFlow() && !ref.getFromAddress().equals(code[index-1].getAddress())) return null;
        return probeLoad(code[0],code[1]);
    }

    private Instruction[] decode(Address start, String... shape) throws Exception {
        if ((start.getOffset()&3)!=0 || !executable(start) || !initialized(start,4L*shape.length)) return null;
        Instruction[] code = new Instruction[shape.length];
        PseudoDisassembler decoder = new PseudoDisassembler(program);
        for (int index=0;index<shape.length;index++) {
            try { code[index]=decoder.disassemble(start.add(4L*index)); }
            catch (ghidra.program.model.lang.InsufficientBytesException |
                   ghidra.program.model.lang.UnknownInstructionException |
                   ghidra.program.model.lang.UnknownContextException invalid) { return null; }
            if (code[index]==null || !name(code[index]).equals(shape[index])) return null;
        }
        return code;
    }

    /** A descriptor-declared shared cache accessor, with both return paths proved. */
    private boolean sharedAccessorMatches(EnumInfo info) throws Exception {
        Instruction[] a=decode(info.accessor,"ADRP","ADD","ADRP","ADD","B");
        if (a==null || !op(a[0],0).equals("x1") || !sameOperands(a[1],"x1","x1") ||
            !op(a[2],0).equals("x2") || !sameOperands(a[3],"x2","x2")) return false;
        Long cp=immediate(a[0],1),co=immediate(a[1],2),dp=immediate(a[2],1),d=immediate(a[3],2);
        if (program.getMemory().getLong(info.cache)!=0 || cp==null || co==null || dp==null || d==null ||
            !address(cp+co).equals(info.cache) || !address(dp+d).equals(info.descriptor)) return false;
        Address target=directTarget(a[4]);
        if (target==null) return false;
        Instruction[] c=decode(target,"MOV","LDR","CBZ","MOV","RET","STP","MOV","MOV","MOV","BL","LDP","RET");
        return c!=null && sameOperands(c[0],"x8","x0") && op(c[1],0).equals("x0") &&
            op(c[1],1).equals("[x1]") && op(c[2],0).equals("x0") && flowIs(c[2],c[5]) &&
            op(c[3],0).equals("x1") && Objects.equals(immediate(c[3],1),0L) &&
            op(c[5],0).equals("x29") && op(c[5],1).equals("x30") &&
            op(c[5],2).equals("[sp, #-0x10]!") && sameOperands(c[6],"x29","sp") &&
            sameOperands(c[7],"x0","x8") && sameOperands(c[8],"x1","x2") &&
            callIs(c[9],singletonCallees) && op(c[10],0).equals("x29") &&
            op(c[10],1).equals("x30") && op(c[10],2).equals("[sp], #0x10");
    }

    private FixedEnum readFixedEnum(Address descriptor) throws Exception {
        EnumInfo type=readEnumLayout(descriptor,0);
        if (type==null) return null;
        Address accessor=type.accessor;
        Instruction[] c=decode(accessor,"ADRP","ADD","MOV","RET");
        long headerOffset=0;
        if (c==null) {
            c=decode(accessor,"ADRP","ADD","ADD","MOV","RET");
            if (c==null || !op(c[0],0).equals("x8") || !sameOperands(c[1],"x8","x8") ||
                !sameOperands(c[2],"x0","x8") || !Objects.equals(immediate(c[2],2),16L) ||
                !op(c[3],0).equals("x1") || !Objects.equals(immediate(c[3],1),0L)) return null;
            headerOffset=16;
        } else if (!op(c[0],0).equals("x0") || !sameOperands(c[1],"x0","x0") ||
            !op(c[2],0).equals("x1") || !Objects.equals(immediate(c[2],1),0L)) return null;
        Long page=immediate(c[0],1),offset=immediate(c[1],2);
        if (page==null || offset==null) return null;
        Address metadata=address(page+offset+headerOffset);
        if (!initialized(metadata.subtract(8),24) || program.getMemory().getLong(metadata)!=0x201L ||
            program.getMemory().getLong(metadata.add(8))!=descriptor.getOffset()) return null;
        Address witness=address(program.getMemory().getLong(metadata.subtract(8)));
        if (!initialized(witness,112)) return null;
        long size=program.getMemory().getLong(witness.add(64));
        if (size<8 || size>4096) return null;
        Address getter=address(program.getMemory().getLong(witness.add(88)));
        if (!pureTagHelper(getter,type.payloads,size)) return null;
        return new FixedEnum(type,metadata,witness,getter,size);
    }

    private Address directPayloadDescriptor(EnumInfo type,int index) throws Exception {
        if (index<0 || index>=type.payloads) return null;
        // An indirect case stores a box pointer, not an inline value of the
        // reflected payload type. Unknown flags cannot establish its layout.
        if (program.getMemory().getInt(type.fields.add(16+12L*index))!=0) return null;
        Address mangled=relative(type.fields.add(16+12L*index+4));
        if (mangled==null || !initialized(mangled,6) || program.getMemory().getByte(mangled)!=1 ||
            program.getMemory().getByte(mangled.add(5))!=0) return null;
        return mangled.add(1).addNoWrap(program.getMemory().getInt(mangled.add(1)));
    }

    /** Complete, straight-line fixed-layout getters only; never a source of a count. */
    private boolean pureTagHelper(Address start,int payloads,long size) throws Exception {
        Instruction[] c=decode(start,"LDR","LDR","LSR","ADD","CMP","CSEL","RET");
        boolean masked=false;
        if (c==null) { c=decode(start,"LDR","LDR","LSR","AND","ADD","SUBS","CSEL","RET");masked=true; }
        if (c==null) return false;
        int add=masked?4:3,compare=add+1,select=add+2;
        MemoryOperand low=memory(c[0],1),tag=memory(c[1],1);
        if (low==null || tag==null || !low.base.equals("r0") || low.offset!=0 || !tag.base.equals("r0") ||
            tag.offset<0 || tag.offset+4>size || !Set.of("w8","x8").contains(op(c[0],0)) ||
            !op(c[1],0).equals("w9") || !sameOperands(c[2],"w9","w9") ||
            !Objects.equals(immediate(c[2],2),28L) || !sameOperands(c[add],"w8","w8") ||
            !Objects.equals(immediate(c[add],2),(long)payloads) ||
            !op(c[select],0).equals("w0") || !op(c[select],1).equals("w8") || !op(c[select],2).equals("w9")) return false;
        if (masked) return sameOperands(c[3],"w9","w9") && Objects.equals(immediate(c[3],2),15L) &&
            op(c[compare],0).equals("w10") && op(c[compare],1).equals("w9") &&
            Objects.equals(immediate(c[compare],2),(long)payloads) && Set.of("cs","hs").contains(op(c[select],3));
        return op(c[0],0).equals("w8") && op(c[compare],0).equals("w9") &&
            Objects.equals(immediate(c[compare],1),(long)payloads-1) && op(c[select],3).equals("hi");
    }

    private int tagHelperLength(Address start) throws Exception {
        if (decode(start,"LDR","LDR","LSR","ADD","CMP","CSEL","RET")!=null) return 28;
        return decode(start,"LDR","LDR","LSR","AND","ADD","SUBS","CSEL","RET")!=null?32:0;
    }

    private boolean sameGetter(FixedEnum type,Address target) throws Exception {
        if (type.getter.equals(target)) return true;
        int length=tagHelperLength(type.getter);
        if (length==0 || tagHelperLength(target)!=length || !pureTagHelper(target,type.type.payloads,type.size)) return false;
        byte[] declared=new byte[length],called=new byte[length];
        program.getMemory().getBytes(type.getter,declared);
        program.getMemory().getBytes(target,called);
        return Arrays.equals(declared,called);
    }

    /** The caller's reflected payload, never a shared helper, selects the count.
     * This lane intentionally accepts only an unchanged incoming object copied
     * by the exact C memcpy import into ABI-private fixed frame storage. Dynamic
     * stack allocations and inline projections use the separate conditional
     * typed-snapshot lane below; this legacy proof is unchanged.
     */
    private Value outlinedTag(Graph graph, Instruction call, Address target) throws Exception {
        Value snapshot=dynamicSnapshotTag(graph,call,target);
        if (snapshot!=null) return snapshot;
        Value destination=graph.register("r0",call.getAddress());
        if (!kind(destination,"frame") || !graph.privateHistoryBefore(call.getAddress())) return null;
        for (Instruction prior : graph.runtimeTags) {
            monitor.checkCancelled();
            if (++graph.work>MAX_QUERIES) return null;
            Value metadata=graph.register("r1",prior.getAddress());
            Value source=graph.register("r0",prior.getAddress());
            if (!kind(metadata,"metadata") || !kind(source,"input") || source.number!=0) continue;
            int selected=graph.selectedCase(prior,call,metadata.type);
            if (selected<0 || selected>=metadata.type.payloads) continue;
            Address descriptor=directPayloadDescriptor(metadata.type,selected);
            FixedEnum child=fixedEnums.get(descriptor);
            if (child==null || !sameGetter(child,target) ||
                !graph.privateFrame(destination.number,child.size,call.getAddress()) ||
                !graph.privateMemcpyProjection(prior,call,source,destination,child.size)) continue;
            if (graph.frameEscapedBefore(call.getAddress())) continue;
            outlinedProofs.put(call.getAddress(),"Outer enum descriptor " + hex(metadata.type.descriptor) +
                " and its ABI-declared cached singleton accessor " + hex(metadata.type.accessor) +
                " establish the metadata passed to the exact libswiftCore runtime tag call at " + hex(prior.getAddress()) +
                ". Every incoming path to the outlined getter is dominated by that call and selects outer tag " + selected +
                "; reflection field " + hex(metadata.type.fields.add(16+12L*selected)) +
                " directly references fixed enum descriptor " + hex(child.type.descriptor) +
                ". Its static enum metadata " + hex(child.metadata) + " points back to that descriptor and declares value-witness table " +
                hex(child.witness) + ", value size " + child.size + " and complete straight-line getEnumTag function " + hex(child.getter) +
                ". On every path the unchanged incoming outer object is copied at offset zero by the exact libSystem memcpy import into a fixed private frame interval of that size; no intervening unknown call or overlapping write is admitted. " +
                "The getter called at " + hex(call.getAddress()) + " targets " + hex(target) +
                ", either that declared getter or an equal complete straight-line body, and reads only that interval. Shared helper code never supplies enum identity or count.");
            return new Value("tag-low32",0,child.type,call.getAddress());
        }
        return null;
    }

    /** Independent forward domain: fixed offsets minus a monotonic sequence of
     * align16(N) allocations. No symbolic values enter the legacy Graph lattice. */
    private record StackPoint(long fixed,List<Address> allocations) {
        StackPoint shift(long delta) { return new StackPoint(Math.addExact(fixed,delta),allocations); }
    }
    private record SnapshotFact(String kind,long number,EnumInfo type,Address identity,StackPoint pointer) {}
    private record SnapshotAllocation(StackPoint parent,StackPoint result,SnapshotFact metadata) {}
    private final class SnapshotState {
        final Map<String,SnapshotFact> registers=new HashMap<>();
        final Map<String,int[]> vectors=new HashMap<>();
        int[] bytes;
        SnapshotState(int size) { bytes=new int[size];Arrays.fill(bytes,-1); }
        SnapshotState copy() {
            SnapshotState result=new SnapshotState(bytes.length);
            result.registers.putAll(registers);
            for (var entry:vectors.entrySet()) result.vectors.put(entry.getKey(),entry.getValue().clone());
            result.bytes=bytes.clone();return result;
        }
        void meet(SnapshotState other) {
            registers.entrySet().removeIf(e->!e.getValue().equals(other.registers.get(e.getKey())));
            vectors.entrySet().removeIf(e->!Arrays.equals(e.getValue(),other.vectors.get(e.getKey())));
            for (int j=0;j<bytes.length;j++) if (bytes[j]!=other.bytes[j]) bytes[j]=-1;
        }
    }
    private SnapshotFact snapshotFact(String kind,long number,EnumInfo type,Address identity,StackPoint pointer) {
        return new SnapshotFact(kind,number,type,identity,pointer);
    }
    private SnapshotFact snapshotRead(Map<String,SnapshotFact> registers,String register) {
        return Set.of("xzr","wzr").contains(register)?snapshotFact("constant",0,null,null,null):registers.get(register);
    }
    private boolean snapshotDestination(String register) { return register.equals("sp") || register.matches("r(?:[0-9]|[12][0-9]|30)"); }
    private SnapshotFact stackFact(StackPoint pointer) { return snapshotFact("stack",0,null,null,pointer); }
    private boolean snapshotKind(SnapshotFact fact,String kind) { return fact!=null && fact.kind.equals(kind); }
    private static String vectorRegister(String register) {
        return register.matches("[zvqdshb]\\d+")?"v"+register.substring(1):null;
    }
    private final class SnapshotPrefix {
        final Graph graph;
        final Map<Address,SnapshotAllocation> allocations=new HashMap<>();
        final SnapshotState state=new SnapshotState(0);
        long fixedFloor;
        boolean dynamic;
        boolean visibleBindingsIntact=true;
        final Map<Address,ProbeTarget> probes=new LinkedHashMap<>();
        SnapshotPrefix(Graph graph) { this.graph=graph;state.registers.put("sp",stackFact(new StackPoint(0,List.of()))); }
        SnapshotFact get(String register) { return snapshotRead(state.registers,register); }
        StackPoint stack() { SnapshotFact fact=get("sp");return snapshotKind(fact,"stack")?fact.pointer:null; }
        void put(String register,SnapshotFact fact) { if (!snapshotDestination(register)) return;if (fact==null) state.registers.remove(register);else state.registers.put(register,fact); }
        boolean build(Instruction runtime) throws Exception {
            Address at=graph.owner.getEntryPoint(),previous=null;
            Set<Address> seen=new HashSet<>();
            while (!at.equals(runtime.getAddress())) {
                monitor.checkCancelled();
                if (++graph.work>MAX_QUERIES || !seen.add(at) || graph.foreignEntries.contains(at)) return false;
                Instruction i=graph.instructions.get(at);
                if (i==null || (previous!=null && !graph.predecessors.getOrDefault(at,List.of()).equals(List.of(previous))) ||
                    i.getFlowType().isJump() || i.getFlowType().isTerminal() || i.getFallThrough()==null || !step(i)) return false;
                previous=at;at=i.getFallThrough();
            }
            return previous!=null && !graph.foreignEntries.contains(at) &&
                graph.predecessors.getOrDefault(at,List.of()).equals(List.of(previous));
        }
        /** Unknown normal-return calls preserve SP and ABI callee-saved GPRs,
         * but kill all spills, volatile registers, and Swift-error X21. */
        void call(Instruction i) throws Exception {
            ProbeTarget probe=graph.probeTarget(i);
            Map<String,SnapshotFact> before=new HashMap<>(state.registers);
            state.registers.keySet().removeIf(r->volatileRegister(r) || r.equals("r21") || Set.of("nzcv","n","z","c","v").contains(r));
            state.vectors.clear();
            if (probe!=null && visibleBindingsIntact) {
                probes.put(i.getAddress(),probe);
                for (String r:List.of("r2","r8","r12")) {
                SnapshotFact preserved=before.get(r);if (preserved!=null) state.registers.put(r,preserved);
            }
            }
            EnumInfo type=accessors.get(directTarget(i));
            if (type!=null && snapshotKind(before.get("r0"),"constant") && before.get("r0").number==0)
                put("r0",snapshotFact("metadata",0,type,i.getAddress(),null));
        }
        SnapshotFact arithmetic(Instruction i,Map<String,SnapshotFact> before) {
            String mnemonic=name(i);SnapshotFact base=snapshotRead(before,reg(op(i,1)));Long delta=immediate(i,2);
            if (op(i,0).startsWith("w")) return null;
            if (delta!=null) {
                if (snapshotKind(base,"constant")) return snapshotFact("constant",Math.addExact(base.number,mnemonic.equals("SUB")?-delta:delta),null,null,null);
                if (snapshotKind(base,"stack")) return stackFact(base.pointer.shift(mnemonic.equals("SUB")?-delta:delta));
                if (mnemonic.equals("ADD") && delta==15 && snapshotKind(base,"size")) return snapshotFact("padded-size",0,base.type,base.identity,null);
            } else if (mnemonic.equals("SUB") && snapshotKind(base,"stack") && base.pointer.equals(stack())) {
                SnapshotFact amount=snapshotRead(before,reg(op(i,2)));
                // Earlier unsigned subtracts supply upper bounds only. They
                // do not acquire a type or a VWT contract. Normal nonwrapping
                // monotonic stack semantics is an explicit lane premise.
                if (snapshotKind(amount,"constant")) {
                    return amount.number<0?null:stackFact(base.pointer.shift(-amount.number));
                }
                if (op(i,2).matches("x\\d+")) {
                    List<Address> terms=new ArrayList<>(base.pointer.allocations);terms.add(i.getAddress());
                    StackPoint result=new StackPoint(base.pointer.fixed,List.copyOf(terms));
                    SnapshotFact metadata=snapshotKind(amount,"aligned-size") && amount.type!=null?
                        snapshotFact("metadata",0,amount.type,amount.identity,null):null;
                    allocations.put(i.getAddress(),new SnapshotAllocation(base.pointer,result,metadata));
                    return stackFact(result);
                }
            }
            return null;
        }
        boolean moveStack(StackPoint old,SnapshotFact result) {
            if (!snapshotKind(result,"stack") || old==null) return false;
            StackPoint next=result.pointer;
            if (next.allocations.equals(old.allocations)) {
                if (next.fixed>=old.fixed) return false; // reject restores/increases, including stale aliases
            } else {
                if (next.allocations.size()!=old.allocations.size()+1) return false;
                SnapshotAllocation allocation=allocations.get(next.allocations.get(next.allocations.size()-1));
                if (allocation==null || !allocation.parent.equals(old) || !allocation.result.equals(next)) return false;
            }
            if (!dynamic && !next.allocations.isEmpty()) { fixedFloor=old.fixed;dynamic=true; }
            if (!dynamic) fixedFloor=next.fixed;
            return true;
        }
        String proof() {
            StringBuilder result=new StringBuilder();
            for (var entry:probes.entrySet()) {
                ProbeTarget target=entry.getValue();
                result.append("Under ").append(DARWIN_PROBE_ABI).append(" on normal return, prefix probe ")
                    .append(hex(entry.getKey())).append(" binds imported ").append(hex(target.binding.external))
                    .append(" from ").append(target.binding.library)
                    .append(target.slot==null?" via its exact import/stub":" through original applied chained GOT slot "+hex(target.slot))
                    .append("; only X2/X8/X12/SP gain special preservation. Other volatile registers, flags and Swift-error X21 are killed. ")
                    .append("Its possible [symbolic-SP-16,symbolic-SP) scratch write is before the snapshot; all pre-tag memory facts are discarded. ")
                    .append("No allocation, nonfaulting execution or actual runtime binding is established. ");
            }
            return result.toString();
        }
        boolean step(Instruction i) throws Exception {
            if (i.getFlowType().isCall()) { call(i);return stack()!=null; }
            if (hasOpaqueEffect(i)) return false;
            Map<String,SnapshotFact> before=new HashMap<>(state.registers);
            StackPoint old=stack();String mnemonic=name(i);SnapshotFact result=null;
            String destination=i.getNumOperands()>0?reg(op(i,0)):"";
            if (mnemonic.equals("MOV")) {
                Long literal=immediate(i,1);
                result=literal==null?snapshotRead(before,reg(op(i,1))):snapshotFact("constant",literal,null,null,null);
                if (op(i,0).startsWith("w") && !snapshotKind(result,"constant")) result=null;
            } else if (Set.of("ADD","SUB").contains(mnemonic)) result=arithmetic(i,before);
            else if (mnemonic.equals("AND") && !op(i,0).startsWith("w")) {
                SnapshotFact base=snapshotRead(before,reg(op(i,1)));
                if (snapshotKind(base,"padded-size") && Objects.equals(immediate(i,2),-16L))
                    result=snapshotFact("aligned-size",0,base.type,base.identity,null);
            } else if (Set.of("ADR","ADRP").contains(mnemonic)) {
                Long literal=immediate(i,1);if (literal!=null) result=snapshotFact("constant",literal,null,null,null);
            } else if (Set.of("LDR","LDUR").contains(mnemonic) && i.getNumOperands()==2 && op(i,1).endsWith("]")) {
                MemoryOperand memory=memory(i,1);SnapshotFact base=memory==null?null:before.get(memory.base);
                if (op(i,0).startsWith("x") && memory!=null) {
                    if (snapshotKind(base,"metadata") && memory.offset==-8) result=snapshotFact("witness",0,base.type,base.identity,null);
                    else if (snapshotKind(base,"witness") && memory.offset==64) result=snapshotFact("size",0,base.type,base.identity,null);
                }
            }
            if (hasMemoryEffect(i)) {
                int operand=mnemonic.equals("STP")?2:1;
                MemoryOperand memory=isStore(i)?memory(i,operand):null;
                SnapshotFact base=memory==null?null:before.get(memory.base);
                if (!snapshotKind(base,"stack")) visibleBindingsIntact=false;
            }
            // No pre-tag memory fact is retained: earlier stores/calls are not
            // classified as pure and stack spills cannot establish identity.
            for (Object object:i.getResultObjects()) if (object instanceof Register written) state.registers.remove(reg(written.getBaseRegister().getName()));
            if (result!=null) put(destination,result);
            if (writesRegister(i,"sp")) {
                SnapshotFact next=state.registers.get("sp");
                if (mnemonic.equals("STP") && op(i,2).endsWith("!")) {
                    MemoryOperand memory=memory(i,2);
                    if (memory==null || !memory.base.equals("sp") || memory.offset>=0) return false;
                    next=stackFact(old.shift(memory.offset));put("sp",next);
                }
                if (!moveStack(old,next)) return false;
            }
            return stack()!=null;
        }
    }

    /** Local post-tag representation proof. Earlier calls/escapes are neither
     * classified nor declared pure; validity and stability are named premises. */
    private Value dynamicSnapshotTag(Graph graph,Instruction getter,Address target) throws Exception {
        if (snapshotProofs.containsKey(getter.getAddress())) return snapshotTags.get(getter.getAddress());
        for (Instruction runtime:graph.runtimeTags) {
            if (++graph.work>MAX_QUERIES) return null;
            SnapshotPrefix prefix=new SnapshotPrefix(graph);
            try {
                if (!prefix.build(runtime)) continue;
                SnapshotFact metadata=prefix.get("r1"),source=prefix.get("r0");StackPoint sp=prefix.stack();
                if (!snapshotKind(metadata,"metadata") || !snapshotKind(source,"stack") || sp==null ||
                    sp.allocations.isEmpty() || !source.pointer.equals(sp)) continue;
                SnapshotAllocation last=prefix.allocations.get(sp.allocations.get(sp.allocations.size()-1));
                if (last==null || !last.result.equals(sp) || !metadata.equals(last.metadata)) continue;
                Set<Address> window=snapshotAncestors(graph,runtime,getter);
                if (window==null) continue;
                int selected=graph.selectedCase(runtime,getter,metadata.type);
                if (selected<0 || selected>=metadata.type.payloads) continue;
                FixedEnum child=fixedEnums.get(directPayloadDescriptor(metadata.type,selected));
                Value destination=graph.register("r0",getter.getAddress());
                if (child==null || !sameGetter(child,target) || !kind(destination,"frame") ||
                    destination.number<prefix.fixedFloor || Math.addExact(destination.number,child.size)>0 ||
                    sp.fixed>destination.number || !snapshotProjection(graph,prefix,runtime,getter,source.pointer,destination.number,child.size,window)) continue;
                String proof="Under " + SNAPSHOT_ABI + ", the exact libswiftCore runtime tag call at " + hex(runtime.getAddress()) +
                    " receives metadata from accessor " + hex(metadata.type.accessor) + " for outer enum descriptor " + hex(metadata.type.descriptor) +
                    ". Its source is the current SP after the last align16(N) allocation at " + hex(sp.allocations.get(sp.allocations.size()-1)) +
                    ", where N is VWT+64 of that same metadata value. The straight-line entry prefix proves only register/stack identities; unknown earlier calls and escapes are allowed and their memory history is discarded. " +
                    "Assumptions: a recursively valid active outer payload at this call's normal return; stable ABI metadata layout; ordinary nonwrapping, nonaliasing stack allocation with N<=align16(N), N large enough for the active payload; live source and destination until the child getter, and no asynchronous interference throughout the checked post-tag window through dispatch. " +
                    "Stable imported-call/GOT bindings throughout the prefix (no interposition or mutation by earlier unknown calls) are assumed; visible non-stack writes cannot establish probe effects. " + prefix.proof() +
                    "Every incoming path selects outer tag " + selected + "; direct reflection field " + hex(metadata.type.fields.add(16+12L*selected)) +
                    " binds inline offset-zero child descriptor " + hex(child.type.descriptor) + ". Static child metadata " + hex(child.metadata) +
                    " declares VWT " + hex(child.witness) + ", size " + child.size + " and pure complete getter " + hex(child.getter) +
                    ". Complete inline SIMD byte origins prove destination byte j equals snapshot source byte j for all " + child.size +
                    " bytes, with live/disjoint fixed destination and dynamic source. No unknown post-tag call/write, SP change, foreign entry or bypass is admitted. Getter call " + hex(getter.getAddress()) +
                    " reads that representation. A separate straight-line getter-return-to-dispatch proof rejects calls, SP changes, foreign/bypass entries and unmodeled stores, including effects on escaped tag spills. Shared helper code never supplies identity/count. This proof does not establish preceding copy/witness correctness, pre-tag nonescape, ownership/retention, or later lifetime semantics.";
                snapshotProofs.put(getter.getAddress(),proof);outlinedProofs.put(getter.getAddress(),proof);
                Value tag=new Value("tag-low32",0,child.type,getter.getAddress());snapshotTags.put(getter.getAddress(),tag);return tag;
            } catch (ArithmeticException invalid) { /* nonwrapping proof failed */ }
        }
        return null;
    }
    private Set<Address> snapshotAncestors(Graph graph,Instruction runtime,Instruction getter) throws Exception {
        if (!graph.dominatedBy(runtime.getAddress(),getter.getAddress())) return null;
        Set<Address> nodes=new HashSet<>();Deque<Address> pending=new ArrayDeque<>(List.of(getter.getAddress()));
        while (!pending.isEmpty()) {
            Address at=pending.removeFirst();if (at.equals(runtime.getAddress()) || !nodes.add(at)) continue;
            if (++graph.work>MAX_QUERIES || graph.foreignEntries.contains(at)) return null;
            List<Address> incoming=graph.predecessors.getOrDefault(at,List.of());if (incoming.isEmpty()) return null;pending.addAll(incoming);
        }
        return nodes;
    }
    private boolean snapshotProjection(Graph graph,SnapshotPrefix prefix,Instruction runtime,Instruction getter,StackPoint source,long destination,long size,Set<Address> nodes) throws Exception {
        if (size>4096) return false;
        Deque<Address> pending=new ArrayDeque<>();
        Map<Address,Integer> degree=new HashMap<>();Map<Address,SnapshotState> states=new HashMap<>();
        for (Address at:nodes) degree.put(at,(int)graph.predecessors.getOrDefault(at,List.of()).stream().filter(nodes::contains).count());
        SnapshotState initial=prefix.state.copy();initial.bytes=new int[(int)size];Arrays.fill(initial.bytes,-1);
        prefix.call(runtime);initial.registers.clear();initial.registers.putAll(prefix.state.registers);
        Address first=runtime.getFallThrough();if (first==null || !nodes.contains(first)) return false;
        states.put(first,initial);pending.add(first);int visited=0;
        while (!pending.isEmpty()) {
            monitor.checkCancelled();Address at=pending.removeFirst();if (++graph.work>MAX_QUERIES || degree.get(at)!=0) return false;
            SnapshotState state=states.get(at);if (state==null) return false;visited++;
            if (at.equals(getter.getAddress())) {
                SnapshotFact actual=state.registers.get("r0");
                if (!snapshotKind(actual,"stack") || !actual.pointer.equals(new StackPoint(destination,List.of()))) return false;
                for (int j=0;j<size;j++) if (state.bytes[j]!=j) return false;
                continue;
            }
            Instruction i=graph.instructions.get(at);
            if (i==null || i.getFlowType().isCall() || writesRegister(i,"sp") || hasOpaqueEffect(i) ||
                (i.getFlowType().isJump() && (i.getFlowType().isComputed() || i.getFlows().length==0)) ||
                !snapshotStep(prefix,state,i,source,destination,size)) return false;
            List<Address> next=new ArrayList<>();if (i.getFallThrough()!=null) next.add(i.getFallThrough());
            if (i.getFlowType().isJump()) Collections.addAll(next,i.getFlows());
            for (Address successor:new LinkedHashSet<>(next)) if (nodes.contains(successor)) {
                SnapshotState prior=states.get(successor);if (prior==null) states.put(successor,state.copy());else prior.meet(state);
                int remaining=degree.merge(successor,-1,Integer::sum);if (remaining==0) pending.addLast(successor);
            }
        }
        return visited==nodes.size(); // cycles, unreachable/bypass entries fail closed
    }
    private boolean snapshotStep(SnapshotPrefix prefix,SnapshotState state,Instruction i,StackPoint source,long destination,long size) {
        String mnemonic=name(i);Map<String,SnapshotFact> before=new HashMap<>(state.registers);
        boolean load=Set.of("LDR","LDUR","LDP").contains(mnemonic),store=isStore(i),pair=Set.of("LDP","STP").contains(mnemonic);
        int operand=pair?2:1;MemoryOperand memory=(load||store)?memory(i,operand):null;
        for (PcodeOp operation:i.getPcode()) if (operation.getOpcode()==PcodeOp.LOAD && !load) return false;
        if ((load||store) && (memory==null || i.getNumOperands()!=operand+1 || !op(i,operand).endsWith("]"))) return false;
        SnapshotFact base=memory==null?null:before.get(memory.base);
        StackPoint location=snapshotKind(base,"stack")?base.pointer.shift(memory.offset):null;
        int width=store?storeWidth(i):load?width(op(i,0)):0,count=pair?2:1;
        List<int[]> loaded=new ArrayList<>();
        if (load) {
            if (location==null) return false;
            boolean vector=op(i,0).matches("q\\d+");
            if (vector) {
                if (pair && !op(i,1).matches("q\\d+")) return false;
                if (!location.allocations.equals(source.allocations)) return false;
                long start=Math.subtractExact(location.fixed,source.fixed);
                if (start<0 || Math.addExact(start,(long)width*count)>size) return false;
                for (int n=0;n<count;n++) { int[] bytes=new int[16];for (int j=0;j<16;j++) bytes[j]=(int)start+16*n+j;loaded.add(bytes); }
            } else if (!location.allocations.isEmpty() || location.fixed<prefix.fixedFloor || Math.addExact(location.fixed,(long)width*count)>0) return false;
        }
        if (store || hasMemoryEffect(i)) {
            if (!store || location==null || !location.allocations.isEmpty() || location.fixed<prefix.fixedFloor ||
                Math.addExact(location.fixed,(long)width*count)>0 || !dataRegister(op(i,0)) ||
                (pair && (!dataRegister(op(i,1)) || width(op(i,0))!=width(op(i,1))))) return false;
            // Every admitted store is in the fixed frame, above the source's
            // pre-allocation upper bound; the regions cannot overlap.
            for (int n=0;n<count;n++) {
                String vector=vectorRegister(op(i,n));int[] origins=width==16 && vector!=null?state.vectors.get(vector):null;
                for (int j=0;j<width;j++) {
                    long relative=location.fixed+width*n+j-destination;
                    if (relative>=0 && relative<size) state.bytes[(int)relative]=origins==null?-1:origins[j];
                }
            }
        }
        SnapshotFact result=null;
        if (mnemonic.equals("MOV") && op(i,0).startsWith("x")) result=snapshotRead(before,reg(op(i,1)));
        else if (Set.of("ADD","SUB").contains(mnemonic) && op(i,0).startsWith("x")) {
            SnapshotFact pointer=snapshotRead(before,reg(op(i,1)));Long delta=immediate(i,2);
            if (snapshotKind(pointer,"stack") && delta!=null) result=stackFact(pointer.pointer.shift(mnemonic.equals("SUB")?-delta:delta));
        }
        for (Object object:i.getResultObjects()) if (object instanceof Register written) {
            String register=written.getBaseRegister().getName().toLowerCase(Locale.ROOT);
            state.registers.remove(reg(register));String vector=vectorRegister(register);if (vector!=null) state.vectors.remove(vector);
        }
        if (result!=null && snapshotDestination(reg(op(i,0)))) state.registers.put(reg(op(i,0)),result);
        for (int n=0;n<loaded.size();n++) state.vectors.put(vectorRegister(op(i,n)),loaded.get(n));
        return true;
    }

    /** Escaped earlier aliases cannot be allowed to invalidate a tag spill
     * through a later unknown call. The new lane checks the whole suffix. */
    private boolean snapshotTagSuffix(Graph graph,Address getter,Instruction branch) throws Exception {
        Address at=branch.getAddress();Set<Address> seen=new HashSet<>();
        while (!at.equals(getter)) {
            if (++graph.work>MAX_QUERIES || !seen.add(at) || graph.foreignEntries.contains(at)) return false;
            Instruction i=graph.instructions.get(at);
            if (i==null || i.getFlowType().isCall() || writesRegister(i,"sp") || hasOpaqueEffect(i) ||
                (hasMemoryEffect(i) && graph.privateStore(i)==null) ||
                (!at.equals(branch.getAddress()) && i.getFlowType().isJump())) return false;
            List<Address> incoming=graph.predecessors.getOrDefault(at,List.of());
            if (incoming.size()!=1) return false;
            Instruction previous=graph.instructions.get(incoming.get(0));
            if (previous==null || !Objects.equals(previous.getFallThrough(),at)) return false;
            at=previous.getAddress();
        }
        return true;
    }

    private EnumInfo readEnum(Address descriptor) throws Exception { return readEnumLayout(descriptor,1); }

    private EnumInfo readEnumLayout(Address descriptor,int initialization) throws Exception {
        if (!initialized(descriptor, initialization==1?40:28)) return null;
        int flags = program.getMemory().getInt(descriptor);
        if ((flags & 0x1f) != 18 || (flags & 0x80) != 0 || ((flags >>> 8) & 0xff) != 0 ||
            ((flags >>> 16) & 3) != initialization) return null;
        int payloads = program.getMemory().getInt(descriptor.add(20)) & 0xffffff;
        long empty = Integer.toUnsignedLong(program.getMemory().getInt(descriptor.add(24)));
        long count = payloads + empty;
        if (payloads < 1 || count < 2 || count > MAX_CASES) return null;
        Address accessor = relative(descriptor.add(12));
        Address fields = relative(descriptor.add(16));
        // A non-generic enum's SingletonMetadataInitialization immediately
        // follows its 28-byte fixed descriptor. Its cache's first word is the
        // completed metadata pointer; the accessor must load this exact word.
        Address cache = initialization==1?relative(descriptor.add(28)):null;
        if (initialization==1 && (cache == null || !initialized(cache,16))) return null;
        if (accessor == null || fields == null || !executable(accessor) || !initialized(fields, 16)) return null;
        int fieldKind=Short.toUnsignedInt(program.getMemory().getShort(fields.add(8)));
        if ((fieldKind != 2 && fieldKind != 3) ||
            program.getMemory().getShort(fields.add(10)) != 12 ||
            Integer.toUnsignedLong(program.getMemory().getInt(fields.add(12))) != count ||
            !initialized(fields, 16 + 12 * count)) return null;
        List<String> names = new ArrayList<>();
        for (int index = 0; index < count; index++) {
            Address record = fields.add(16 + 12L * index);
            boolean hasPayload = program.getMemory().getInt(record.add(4)) != 0;
            if (hasPayload != (index < payloads)) return null;
            names.add(cString(relative(record.add(8))));
        }
        return new EnumInfo(descriptor, fields, accessor, cache, payloads, (int) empty, names);
    }

    /** The non-generic cached singleton accessor emitted by Swift at -Onone. */
    private boolean accessorMatches(EnumInfo info) throws Exception {
        String[] shape = {"SUB","STP","ADD","STR","ADRP","LDR","MOV","MOV","STR","STUR",
            "CBNZ","B","LDR","ADRP","ADD","BL","STR","STUR","B","LDR","LDUR","LDP","ADD","RET"};
        if (!initialized(info.accessor, shape.length * 4)) return false;
        Instruction[] code = new Instruction[shape.length];
        PseudoDisassembler decoder = new PseudoDisassembler(program);
        for (int index = 0; index < shape.length; index++) {
            try { code[index] = decoder.disassemble(info.accessor.add(4L * index)); }
            catch (ghidra.program.model.lang.InsufficientBytesException |
                   ghidra.program.model.lang.UnknownInstructionException |
                   ghidra.program.model.lang.UnknownContextException invalid) { return false; }
            if (code[index] == null || !name(code[index]).equals(shape[index])) return false;
        }
        // The descriptor itself declares this accessor. Check both the cold
        // runtime path and the cached/returned value paths; symbol spelling of
        // the accessor or enum name alone is never used as a bound.
        if (!callIs(code[15], singletonCallees) ||
            !sameOperands(code[0], "sp", "sp") || !sameOperands(code[22], "sp", "sp") ||
            immediate(code[0], 2) == null || !Objects.equals(immediate(code[0], 2), immediate(code[22], 2)) ||
            !op(code[1],0).equals("x29") || !op(code[1],1).equals("x30") ||
            !op(code[21],0).equals("x29") || !op(code[21],1).equals("x30") ||
            !op(code[1],2).equals(op(code[21],2)) ||
            !sameOperands(code[2], "x29", "sp") ||
            !op(code[3],0).equals("x0") || !op(code[12],0).equals("x0") ||
            !op(code[3],1).equals(op(code[12],1)) ||
            !op(code[6],0).equals("x9") || !Objects.equals(immediate(code[6],1),0L) ||
            !sameOperands(code[7], "x0", "x8") ||
            !op(code[8],0).equals("x0") || !op(code[16],0).equals("x0") ||
            !op(code[19],0).equals("x0") ||
            !op(code[8],1).equals(op(code[16],1)) || !op(code[8],1).equals(op(code[19],1)) ||
            !op(code[9],0).equals("x9") || !op(code[17],0).equals("x1") || !op(code[20],0).equals("x1") ||
            !op(code[9],1).equals(op(code[17],1)) || !op(code[9],1).equals(op(code[20],1)) ||
            !op(code[4],0).equals("x8") || !op(code[5],0).equals("x8") ||
            memory(code[5],1) == null || !memory(code[5],1).base.equals("r8") ||
            !op(code[10],0).equals("x8") || !flowIs(code[10],code[19]) ||
            !flowIs(code[11],code[12]) || !flowIs(code[18],code[19]) ||
            !sameOperands(code[14],"x1","x1")) return false;
        Long page = immediate(code[13],1), offset = immediate(code[14],2);
        Long size = immediate(code[0],2), fp = immediate(code[2],2), cachePage = immediate(code[4],1);
        MemoryOperand saved = memory(code[1],2), argument = memory(code[3],1),
            metadata = memory(code[8],1), status = memory(code[9],1), cache = memory(code[5],1);
        if (size == null || fp == null || fp != size - 16 || saved == null ||
            !saved.base.equals("sp") || saved.offset != fp ||
            argument == null || !argument.base.equals("sp") ||
            metadata == null || !metadata.base.equals("sp") ||
            status == null || !status.base.equals("r29") || cachePage == null || cache == null) return false;
        long[] slots = {argument.offset,metadata.offset,fp + status.offset};
        for (int index = 0; index < slots.length; index++) {
            if (slots[index] < 0 || slots[index] + 8 > fp) return false;
            for (int other = 0; other < index; other++) if (Math.abs(slots[index] - slots[other]) < 8) return false;
        }
        Address cacheAddress = address(cachePage + cache.offset);
        return cacheAddress.equals(info.cache) && program.getMemory().getLong(cacheAddress) == 0 &&
            op(code[13],0).equals("x1") && page != null && offset != null && address(page + offset).equals(info.descriptor);
    }

    private Recovery match(Graph graph, Instruction branch) throws Exception {
        Instruction add = graph.instructions.get(branch.getAddress().subtract(4));
        Instruction load = graph.instructions.get(branch.getAddress().subtract(8));
        Instruction interveningLoad = null;
        // A non-writeback integer load may be scheduled after the destination
        // calculation. Its memory result is irrelevant to this computed edge
        // only when it cannot overwrite the branch register (including aliases).
        if (add != null && name(add).equals("LDR") && add.getNumOperands() == 2 &&
            op(add,0).startsWith("x") && memory(add,1) != null && op(add,1).endsWith("]") &&
            !reg(op(add,0)).equals(reg(op(branch,0)))) {
            interveningLoad = add;
            add = load;
            load = graph.instructions.get(branch.getAddress().subtract(12));
        }
        if (add == null || load == null || !name(add).equals("ADD") || !name(load).equals("LDRSW") ||
            add.getNumOperands() != 3 || load.getNumOperands() != 2 ||
            !op(add,0).equals(op(branch,0)) || !op(load,0).startsWith("x")) return null;
        // Owned predecessors are insufficient when a known external flow can
        // enter the suffix after its reaching definitions were established.
        if (graph.foreignEntries.contains(load.getAddress()) || graph.foreignEntries.contains(add.getAddress()) ||
            graph.foreignEntries.contains(branch.getAddress()) ||
            (interveningLoad != null && graph.foreignEntries.contains(interveningLoad.getAddress()))) return null;
        Matcher indexed = INDEXED.matcher(op(load,1));
        if (!indexed.matches()) return null;
        String entry = reg(op(load,0));
        String left = reg(op(add,1)), right = reg(op(add,2));
        String base = entry.equals(left) ? right : entry.equals(right) ? left : null;
        if (base == null || base.equals(entry)) return null;
        if (!graph.predecessors.getOrDefault(add.getAddress(),List.of()).equals(List.of(load.getAddress())) ||
            !graph.predecessors.getOrDefault(branch.getAddress(),List.of()).equals(List.of(
                interveningLoad == null ? add.getAddress() : interveningLoad.getAddress())) ||
            (interveningLoad != null && !graph.predecessors.getOrDefault(interveningLoad.getAddress(),List.of())
                .equals(List.of(add.getAddress())))) return null;
        Value anchor = graph.register(base, add.getAddress());
        Value table = graph.register(reg(indexed.group(1)), load.getAddress());
        Value tag = graph.register(reg(indexed.group(2)), load.getAddress());
        if (!kind(anchor,"constant") || !kind(table,"constant") || !kind(tag,"tag")) return null;
        if (snapshotProofs.containsKey(tag.origin)) {
            if (!snapshotTagSuffix(graph,tag.origin,branch)) return null;
        } else if (graph.frameEscapedBefore(tag.origin)) return null;
        Address tableAddress = address(table.number), anchorAddress = address(anchor.number);
        if (!initialized(tableAddress, 4L * tag.type.count())) return null;
        MemoryBlock tableBlock = program.getMemory().getBlock(tableAddress);
        if (tableBlock.isWrite()) return null;
        FunctionIterator following = program.getFunctionManager().getFunctions(graph.owner.getEntryPoint().add(1),true);
        Function next = following.hasNext() ? following.next() : null;
        Address end = next != null && next.getEntryPoint().getAddressSpace().equals(branch.getAddress().getAddressSpace())
            ? next.getEntryPoint() : program.getMemory().getBlock(branch.getAddress()).getEnd().add(1);
        List<Address> targets = new ArrayList<>();
        for (int index = 0; index < tag.type.count(); index++) {
            monitor.checkCancelled();
            Address target;
            try { target = anchorAddress.addNoWrap(program.getMemory().getInt(tableAddress.add(index * 4L))); }
            catch (AddressOverflowException invalid) { return null; }
            if ((target.getOffset() & 3) != 0 || !executable(target) ||
                target.compareTo(graph.owner.getEntryPoint()) < 0 || target.compareTo(end) >= 0 ||
                (target.compareTo(tableAddress) >= 0 && target.compareTo(tableAddress.add(4L * tag.type.count())) < 0)) return null;
            Function other = program.getFunctionManager().getFunctionContaining(target);
            if (other != null && !other.equals(graph.owner)) return null;
            targets.add(target);
        }
        return new Recovery(graph.owner, branch.getAddress(), tableAddress, anchorAddress, tag.origin, end, tag.type, targets,
            interveningLoad == null ? null : interveningLoad.getAddress(), graph.probeProof());
    }

    private boolean repair(Recovery recovery) throws Exception {
        int transaction = program.startTransaction("REA+ ABI-verified Swift enum switch");
        boolean commit = false;
        try {
            Function owner = recovery.owner;
            AddressSet allowed = new AddressSet(owner.getEntryPoint(), recovery.limit.subtract(1));
            for (Function other : program.getFunctionManager().getFunctions(true)) {
                monitor.checkCancelled();
                if (!other.equals(owner)) allowed.delete(other.getBody());
            }
            AddressSet starts = new AddressSet();
            for (Address target : new LinkedHashSet<>(recovery.targets)) {
                starts.add(target);
                program.getReferenceManager().addMemoryReference(recovery.dispatch, target,
                    RefType.COMPUTED_JUMP, SourceType.ANALYSIS, 0);
            }
            DisassembleCommand command = new DisassembleCommand(starts, allowed, true);
            if (!command.applyTo(program, monitor)) return false;
            AddressSet body = new AddressSet(owner.getBody());
            body.add(CreateFunctionCmd.getFunctionBody(program, owner.getEntryPoint(), monitor));
            for (Address target : recovery.targets) {
                if (!body.contains(target) || program.getListing().getInstructionAt(target) == null) return false;
            }
            // setBody rejects overlap; unlike fixupFunctionBody, do not carve
            // addresses away from independently identified functions.
            owner.setBody(body);
            new JumpTable(recovery.dispatch, new ArrayList<>(recovery.targets), true, 0).writeOverride(owner);
            commit = true;
            return true;
        } finally { program.endTransaction(transaction, commit); }
    }

    JsonArray tables(Function function) {
        JsonArray result = new JsonArray();
        for (Recovery item : recovered.values()) {
            if (!item.owner.equals(function)) continue;
            JsonObject table = new JsonObject();
            table.addProperty("dispatch_address", hex(item.dispatch));
            JsonArray sources = new JsonArray();
            JsonObject source = new JsonObject();
            source.addProperty("address",hex(item.table));
            source.addProperty("provenance","rea-swift-enum-signed-word-table");
            source.addProperty("entry_size_bytes",4);
            source.addProperty("entry_count",item.targets.size());
            source.addProperty("confidence","high");
            String proof = "Swift enum descriptor " + hex(item.type.descriptor) + " declares " + item.type.payloads +
                " payload and " + item.type.empty + " empty cases; field descriptor " + hex(item.type.fields) +
                " agrees. " + (outlinedProofs.containsKey(item.tagCall) ? outlinedProofs.get(item.tagCall) :
                "Its ABI-declared accessor " + hex(item.type.accessor) +
                " loads its declared singleton cache " + hex(item.type.cache) +
                " and has the verified swift_getSingletonMetadata path. Exact libswiftCore external swift_getEnumCaseMultiPayload at " +
                hex(item.tagCall) + " receives that metadata.") + " Its unchanged tag reaches the LDRSW index after an explicit 32-bit zero-extending write. Signed 32-bit entries at " +
                hex(item.table) + " are added to " + hex(item.anchor) +
                (item.interveningLoad == null ? "" : "; the simple non-writeback LDR at " + hex(item.interveningLoad) +
                    " does not overwrite the computed branch register and has a single fallthrough predecessor/successor in this suffix") +
                ". REA+ restored computed edges, disassembled destinations and extended the owning function before observations;" +
                " generated override labels are analysis metadata, not source/caller declarations." + item.probeProof;
            source.add("evidence",evidence(proof));
            sources.add(source);
            table.add("data_sources",sources);
            JsonArray mappings = new JsonArray();
            for (int index = 0; index < item.targets.size(); index++) {
                JsonObject mapping = new JsonObject();
                mapping.addProperty("case_value",index);
                mapping.addProperty("target_address",hex(item.targets.get(index)));
                mapping.addProperty("confidence","high");
                String label = item.type.names.get(index);
                mapping.add("evidence",evidence("Swift ABI tag " + index + (label == null ? "" : " (field name " + label + ")") +
                    " selects signed word at " + hex(item.table.add(index * 4L)) + ", reaching " + hex(item.targets.get(index)) +
                    ". Complete type/value provenance and ABI assumptions are retained once in this jump table's data source " + hex(item.table) + "."));
                mappings.add(mapping);
            }
            table.add("mappings",mappings);
            table.add("default_targets",new JsonArray());
            JsonArray limitations = new JsonArray();
            limitations.add("Case values are Swift ABI runtime tags, with payload cases before empty cases; field names are reflection metadata. Valid enum values supply the bound; this does not establish state reachability or original source order.");
            if (snapshotProofs.containsKey(item.tagCall)) limitations.add(SNAPSHOT_ABI + ": conditional on a recursively valid active outer value at the exact runtime tag call, stable ABI layout and imported-call/GOT bindings during the prefix (no interposition/mutation), live/disjoint stack regions, nonwrapping monotonic allocations and a stable checked post-tag window. Pre-tag nonescape, preceding copy/ownership and later lifetime semantics are not proved.");
            else limitations.add("Control-flow recovery assumes the normal AArch64 ABI and private non-escaped frame storage. It does not execute the target or prove each case's high-level semantics.");
            if (!item.probeProof.isEmpty() || (snapshotProofs.containsKey(item.tagCall) && snapshotProofs.get(item.tagCall).contains(DARWIN_PROBE_ABI))) limitations.add("Darwin stack-probe effects assume " + DARWIN_PROBE_ABI +
                " on normal return. Import identity does not establish Arc's runtime binding, absence of interposition, nonfaulting reads or completed allocation.");
            table.add("limitations",limitations);
            result.add(table);
        }
        return result;
    }

    boolean owns(Address dispatch) { return recovered.containsKey(dispatch); }
    String summary() { return "REA+ Swift enum switch recovery: tag_callees=" + tagCallees.size() +
        " verified_accessors=" + accessors.size() + " recovered=" + recovered.size(); }

    private JsonArray evidence(String detail) {
        JsonObject item = new JsonObject();
        item.addProperty("kind","jump-table");
        item.addProperty("source","rea-swift-abi-instruction-and-memory");
        item.addProperty("detail",detail);
        JsonArray result = new JsonArray(); result.add(item); return result;
    }

    /** Backward reaching definitions over the actual owned instruction CFG.
     * All incoming paths must agree. Calls kill volatile registers. Only normal
     * ABI-private, non-escaped frame slots can carry values across calls.
     */
    private final class Graph {
        final Function owner;
        final Map<Address,Instruction> instructions = new LinkedHashMap<>();
        final Map<Address,List<Address>> predecessors = new HashMap<>();
        final Map<Query,Value> memo = new HashMap<>();
        final Set<Query> active = new HashSet<>();
        final Set<Address> foreignEntries = new HashSet<>();
        final List<Instruction> runtimeTags = new ArrayList<>();
        final Map<Address,ProbeEffect> probeEffects = new LinkedHashMap<>();
        final Set<Address> activeProbes = new HashSet<>();
        int work;
        Graph(Function owner) throws Exception {
            this.owner = owner;
            // Fixed-width AArch64 code gives an allocation bound before building
            // the CFG. A declared giant body cannot allocate an unbounded map.
            if (owner.getBody().getNumAddresses() > 4L * MAX_QUERIES) { work = MAX_QUERIES + 1; return; }
            for (Instruction i : program.getListing().getInstructions(owner.getBody(),true)) {
                monitor.checkCancelled();
                if (++work > MAX_QUERIES) return;
                instructions.put(i.getAddress(),i);
                if (i.getFlowType().isCall() && callIs(i,tagCallees)) runtimeTags.add(i);
            }
            for (Instruction i : instructions.values()) {
                monitor.checkCancelled();
                if (++work > MAX_QUERIES) return;
                for (Reference ref : program.getReferenceManager().getReferencesTo(i.getAddress())) {
                    if (++work > MAX_QUERIES) return;
                    if (ref.getReferenceType().isFlow() && !owner.getBody().contains(ref.getFromAddress()) &&
                        !i.getAddress().equals(owner.getEntryPoint())) foreignEntries.add(i.getAddress());
                }
                List<Address> successors = new ArrayList<>();
                if (i.getFallThrough() != null) successors.add(i.getFallThrough());
                if (i.getFlowType().isJump()) Collections.addAll(successors,i.getFlows());
                for (Address successor : successors) if (instructions.containsKey(successor))
                    predecessors.computeIfAbsent(successor,k -> new ArrayList<>()).add(i.getAddress());
            }
        }
        /** No predecessor may enter the candidate without the runtime tag call. */
        boolean dominatedBy(Address start, Address stop) throws Exception {
            Set<Address> seen=new HashSet<>();
            Deque<Address> pending=new ArrayDeque<>(List.of(stop));
            while (!pending.isEmpty()) {
                monitor.checkCancelled();
                Address at=pending.removeFirst();
                if (at.equals(start) || !seen.add(at)) continue;
                if (++work>MAX_QUERIES || at.equals(owner.getEntryPoint()) || foreignEntries.contains(at)) return false;
                List<Address> incoming=predecessors.getOrDefault(at,List.of());
                if (incoming.isEmpty()) return false;
                pending.addAll(incoming);
            }
            return work<=MAX_QUERIES;
        }
        /** Finite tag-domain propagation over all owned CFG paths, with unions
         * at joins. Unknown conditions retain every possible tag on both edges.
         */
        int selectedCase(Instruction runtime, Instruction destination, EnumInfo type) throws Exception {
            if (!dominatedBy(runtime.getAddress(),destination.getAddress()) || runtime.getFallThrough()==null) return -1;
            Map<Address,BitSet> domains=new HashMap<>();
            BitSet initial=new BitSet(type.count()); initial.set(0,type.count());
            domains.put(runtime.getFallThrough(),initial);
            Deque<Address> pending=new ArrayDeque<>(List.of(runtime.getFallThrough()));
            while (!pending.isEmpty()) {
                monitor.checkCancelled();
                if (++work>MAX_QUERIES) return -1;
                Address at=pending.removeFirst();
                if (at.equals(destination.getAddress())) continue;
                if (at.equals(runtime.getAddress()) || foreignEntries.contains(at)) return -1;
                Instruction instruction=instructions.get(at);
                if (instruction==null) continue;
                if (instruction.getFlowType().isJump() &&
                    (instruction.getFlowType().isComputed() || instruction.getFlows().length==0)) return -1;
                List<Address> next=new ArrayList<>();
                if (instruction.getFallThrough()!=null) next.add(instruction.getFallThrough());
                if (instruction.getFlowType().isJump()) Collections.addAll(next,instruction.getFlows());
                for (Address successor:next) {
                    if (!instructions.containsKey(successor)) return -1;
                    BitSet edge=(BitSet)domains.get(at).clone();
                    filterTagEdge(instruction,successor,runtime.getAddress(),type,edge);
                    if (edge.isEmpty()) continue;
                    BitSet prior=domains.get(successor);
                    if (prior==null) { domains.put(successor,edge);pending.addLast(successor); }
                    else { BitSet merged=(BitSet)prior.clone();merged.or(edge);
                        if (!merged.equals(prior)) { domains.put(successor,merged);pending.addLast(successor); }
                    }
                }
            }
            BitSet result=domains.get(destination.getAddress());
            return result!=null && result.cardinality()==1 ? result.nextSetBit(0) : -1;
        }
        void filterTagEdge(Instruction branch,Address successor,Address runtime,EnumInfo type,BitSet values) throws Exception {
            String mnemonic=name(branch),condition=null; Long threshold=null; String source=null;
            boolean taken=Arrays.asList(branch.getFlows()).contains(successor);
            // If both alternatives have the same destination, the edge carries
            // their union. Treating it as only the taken edge invents a bound.
            if (taken && successor.equals(branch.getFallThrough())) return;
            Instruction definition=branch;
            if ((mnemonic.equals("CBZ") || mnemonic.equals("CBNZ")) && op(branch,0).startsWith("w")) {
                source=op(branch,0);threshold=0L;condition=mnemonic.equals("CBZ")?"eq":"ne";
            } else if (mnemonic.startsWith("B.")) {
                definition=instructions.get(branch.getAddress().subtract(4));
                if (definition==null || !predecessors.getOrDefault(branch.getAddress(),List.of()).equals(List.of(definition.getAddress()))) return;
                if (name(definition).equals("CMP")) { source=op(definition,0);threshold=immediate(definition,1); }
                else if (name(definition).equals("SUBS")) { source=op(definition,1);threshold=immediate(definition,2); }
                if (source==null || !source.startsWith("w")) return;
                condition=mnemonic.substring(2).toLowerCase(Locale.ROOT);
            }
            if (source==null || threshold==null || threshold<0 || threshold>0xffffffffL) return;
            Value tag=register(reg(source),definition.getAddress());
            if ((!kind(tag,"tag") && !kind(tag,"tag-low32")) || !tag.origin.equals(runtime) || !tag.type.equals(type)) return;
            for (int value=values.nextSetBit(0);value>=0;value=values.nextSetBit(value+1)) {
                if (++work>MAX_QUERIES) return;
                Boolean accepts=switch(condition) {
                    case "eq" -> value==threshold; case "ne" -> value!=threshold;
                    case "hi","gt" -> value>threshold; case "hs","cs","ge" -> value>=threshold;
                    case "lo","cc","lt" -> value<threshold; case "ls","le" -> value<=threshold;
                    default -> null;
                };
                if (accepts!=null && accepts!=taken) values.clear(value);
            }
        }
        /** Exact whole-value copy, with explicit memory effects on every path.
         * All intervening writes must use private fixed frame addresses. The
         * input object is unchanged and cannot alias that unescaped frame under
         * the same normal ABI/private-frame assumption as scalar spill recovery.
         */
        boolean privateMemcpyProjection(Instruction runtime,Instruction getter,Value input,Value destination,long size) throws Exception {
            Deque<ProjectionQuery> pending=new ArrayDeque<>(List.of(new ProjectionQuery(getter.getAddress(),false)));
            Set<ProjectionQuery> seen=new HashSet<>();
            while (!pending.isEmpty()) {
                monitor.checkCancelled();
                ProjectionQuery query=pending.removeFirst();
                if (!seen.add(query)) continue;
                if (++work>MAX_QUERIES || foreignEntries.contains(query.before)) return false;
                if (query.before.equals(runtime.getAddress())) { if (!query.copied) return false;continue; }
                List<Address> incoming=predecessors.getOrDefault(query.before,List.of());
                if (incoming.isEmpty()) return false;
                for (Address previous:incoming) {
                    Instruction instruction=instructions.get(previous);
                    if (instruction==null) return false;
                    boolean copied=query.copied;
                    if (previous.equals(runtime.getAddress())) { pending.add(new ProjectionQuery(previous,copied));continue; }
                    if (instruction.getFlowType().isCall()) {
                        ProbeEffect probe=probeEffect(instruction);
                        if (probe!=null) {
                            if (overlaps(probe.scratch.start,probe.scratch.size,destination.number,size)) return false;
                        } else {
                            if (copied || !callIs(instruction,memcpyCallees) ||
                                !destination.equals(register("r0",previous)) || !input.equals(register("r1",previous)) ||
                                !Objects.equals(constant(register("r2",previous)),size)) return false;
                            copied=true;
                        }
                    } else if (hasMemoryEffect(instruction)) {
                        FrameWrite write=privateStore(instruction);
                        if (write==null || (!copied && overlaps(write.start,write.size,destination.number,size))) return false;
                    }
                    if (!copied && writesRegister(instruction,"sp") &&
                        (instruction.getFallThrough()==null ||
                         !privateFrame(destination.number,size,instruction.getAddress()) ||
                         !privateFrame(destination.number,size,instruction.getFallThrough()))) return false;
                    pending.addLast(new ProjectionQuery(previous,copied));
                }
            }
            return work<=MAX_QUERIES;
        }
        boolean privateMemcpy(Instruction call) throws Exception {
            if (!callIs(call,memcpyCallees)) return false;
            Long size=constant(register("r2",call.getAddress()));
            Value destination=register("r0",call.getAddress());
            return kind(destination,"frame") && size!=null && size>=0 && size<=4096 &&
                privateFrame(destination.number,size,call.getAddress());
        }
        boolean privateFrame(long start,long size,Address before) throws Exception {
            Value stack=register("sp",before);
            try { return kind(stack,"frame") && size>=0 && start>=stack.number && Math.addExact(start,size)<=0; }
            catch (ArithmeticException overflow) { return false; }
        }
        /** The original runtime-tag lane retains its normal-ABI private-frame
         * assumption when dynamic SP is unknown. Known live bounds still reject
         * retired slots. The typed projection never relies on this fallback:
         * privateHistoryBefore independently proves exact non-increasing SP.
         */
        boolean spillFrame(long start,long size,Address before) throws Exception {
            Value stack=register("sp",before);
            if (stack!=null) return privateFrame(start,size,before);
            try { return size>=0 && start<0 && Math.addExact(start,size)<=0; }
            catch (ArithmeticException overflow) { return false; }
        }
        /** One representation for supported stores and their complete live
         * private interval. A pre-decrement prologue allocates in the same
         * instruction, so its bound is the proved post-instruction SP.
         */
        FrameWrite privateStore(Instruction instruction) throws Exception {
            return frameStore(instruction,true);
        }
        FrameWrite frameStore(Instruction instruction,boolean live) throws Exception {
            if (!isStore(instruction) || hasOpaqueEffect(instruction)) return null;
            boolean pair=name(instruction).equals("STP");
            int operand=pair?2:1;
            if (instruction.getNumOperands()!=operand+1 || !dataRegister(op(instruction,0)) ||
                (pair && (!dataRegister(op(instruction,1)) || width(op(instruction,0))!=width(op(instruction,1))))) return null;
            MemoryOperand memory=memory(instruction,operand);
            Value base=memory==null?null:register(memory.base,instruction.getAddress());
            if (!kind(base,"frame")) return null;
            int size=storeWidth(instruction)*(pair?2:1);
            long start;
            try { start=Math.addExact(base.number,memory.offset); }
            catch (ArithmeticException overflow) { return null; }
            Address bound=instruction.getAddress();
            if (op(instruction,operand).endsWith("!")) {
                if (!pair || !memory.base.equals("sp") || memory.offset>0 || instruction.getFallThrough()==null) return null;
                bound=instruction.getFallThrough();
            }
            return (live?privateFrame(start,size,bound):spillFrame(start,size,bound))?new FrameWrite(start,size):null;
        }
        boolean nonEscapingCall(Instruction call) throws Exception {
            Address target=directTarget(call);
            return tagCallees.contains(target) || privateMemcpy(call) ||
                (accessors.containsKey(target) && Objects.equals(constant(register("r0",call.getAddress())),0L)) ||
                probeEffect(call)!=null;
        }

        /** The first lane deliberately requires the adjacent X16 GOT sequence.
         * No general indirect-call name inference or pointer-memory evaluation.
         */
        ProbeTarget probeTarget(Instruction call) throws Exception {
            if (!call.getFlowType().isCall()) return null;
            if (name(call).equals("BL")) {
                Address target=directTarget(call);
                if (target==null) return null;
                ProbeImport binding=probeImports.get(target);
                return binding==null?probeStub(target):new ProbeTarget(binding,null);
            }
            if (!name(call).equals("BLR") || call.getNumOperands()!=1 || !op(call,0).equals("x16")) return null;
            Instruction load=instructions.get(call.getAddress().subtract(4));
            Instruction page=instructions.get(call.getAddress().subtract(8));
            if (load==null || page==null || foreignEntries.contains(call.getAddress()) ||
                foreignEntries.contains(load.getAddress()) || foreignEntries.contains(page.getAddress()) ||
                !predecessors.getOrDefault(call.getAddress(),List.of()).equals(List.of(load.getAddress())) ||
                !predecessors.getOrDefault(load.getAddress(),List.of()).equals(List.of(page.getAddress()))) return null;
            return probeLoad(page,load);
        }

        ProbeEffect probeEffect(Instruction call) throws Exception {
            Address at=call.getAddress();
            if (probeEffects.containsKey(at)) return probeEffects.get(at);
            if (!activeProbes.add(at)) return null;
            ProbeEffect effect=null;
            try {
                ProbeTarget target=probeTarget(call);
                if (target!=null) {
                    Value stack=register("sp",at);
                    // This existing prefix proof excludes visible GOT writes,
                    // unknown calls, foreign entries, escapes and retired frames.
                    if (kind(stack,"frame") && privateHistoryBefore(at)) {
                        try { effect=new ProbeEffect(target,new FrameWrite(Math.subtractExact(stack.number,16),16)); }
                        catch (ArithmeticException overflow) { effect=null; }
                    }
                }
            } finally { activeProbes.remove(at); }
            probeEffects.put(at,effect);
            return effect;
        }

        String probeProof() {
            StringBuilder result=new StringBuilder();
            for (Map.Entry<Address,ProbeEffect> entry:probeEffects.entrySet()) {
                ProbeEffect effect=entry.getValue();
                if (effect==null) continue;
                result.append(" Under ").append(DARWIN_PROBE_ABI).append(
                    ", normal-return call at ").append(hex(entry.getKey())).append(" binds exact ___chkstk_darwin from ")
                    .append(effect.target.binding.library).append(" (external ").append(hex(effect.target.binding.external))
                    .append(effect.target.slot==null?", direct external":", import slot " + hex(effect.target.slot))
                    .append("). X2/X8/X12/SP retain reaching values; other volatile registers, including X9/X10/X16/X17/X30, and flags remain unknown. ")
                    .append("The probe may read stack/thread state and fault; its 16-byte scratch write is [")
                    .append(effect.scratch.start).append(",").append(effect.scratch.start+16)
                    .append(") relative to function-entry SP, disjoint from admitted live private storage. No allocation or exact runtime binding is inferred.");
            }
            return result.toString();
        }
        /** Prove the whole reachable prefix before a projected getter. Unknown
         * calls, writes and control transfers cannot be silently dropped from
         * its private-storage/non-escape argument.
         */
        boolean privateHistoryBefore(Address limit) throws Exception {
            Set<Address> ancestors=new HashSet<>();
            Deque<Address> reverse=new ArrayDeque<>(List.of(limit));
            while (!reverse.isEmpty()) {
                monitor.checkCancelled();
                Address at=reverse.removeFirst();
                if (!ancestors.add(at)) continue;
                if (++work>MAX_QUERIES) return false;
                reverse.addAll(predecessors.getOrDefault(at,List.of()));
            }
            Set<Address> seen=new HashSet<>();
            Deque<Address> pending=new ArrayDeque<>(List.of(owner.getEntryPoint()));
            while (!pending.isEmpty()) {
                monitor.checkCancelled();
                Address at=pending.removeFirst();
                if (at.equals(limit) || !seen.add(at)) continue;
                if (++work>MAX_QUERIES || foreignEntries.contains(at)) return false;
                Instruction instruction=instructions.get(at);
                if (instruction==null || (hasMemoryEffect(instruction) && privateStore(instruction)==null)) return false;
                if (ancestors.contains(at)) {
                    Value before=register("sp",at);
                    if (!kind(before,"frame")) return false;
                    if (writesRegister(instruction,"sp")) {
                        Address following=instruction.getFallThrough();
                        Value after=following==null?null:register("sp",following);
                        if (!kind(after,"frame") || after.number>before.number) return false;
                    }
                }
                if (instruction.getFlowType().isCall() && !nonEscapingCall(instruction)) return false;
                if (instruction.getFlowType().isJump() &&
                    (instruction.getFlowType().isComputed() || instruction.getFlows().length==0)) return false;
                if (name(instruction).equals("RET")) continue;
                List<Address> next=new ArrayList<>();
                if (instruction.getFallThrough()!=null) next.add(instruction.getFallThrough());
                if (instruction.getFlowType().isJump()) Collections.addAll(next,instruction.getFlows());
                if (next.isEmpty()) return false;
                for (Address successor:next) {
                    if (!instructions.containsKey(successor)) return false;
                    pending.addLast(successor);
                }
            }
            return work<=MAX_QUERIES;
        }
        /** Unknown AArch64 callees can receive pointers outside X0..X7 too:
         * X8 is the indirect-result location, X20 Swift self/context and X22
         * Swift async context. Callee-saved does not mean unused as an input.
         * Both historical escape and post-call spill retention use this rule.
         */
        boolean passesFrameAddress(Instruction call) throws Exception {
            for (int index : new int[]{0,1,2,3,4,5,6,7,8,20,22})
                if (kind(register("r"+index,call.getAddress()),"frame")) return true;
            return false;
        }
        boolean frameEscapedBefore(Address limit) throws Exception {
            // A pointer retained by an earlier call can alias a later store as
            // well. Do not look only at the most recent call after that store.
            // "Before" is CFG ancestry, not address order: a predecessor may
            // be laid out after the dispatch (for example an outlined block).
            Set<Address> visited = new HashSet<>();
            Deque<Address> pending = new ArrayDeque<>(predecessors.getOrDefault(limit,List.of()));
            while (!pending.isEmpty()) {
                monitor.checkCancelled();
                Address at = pending.removeFirst();
                if (!visited.add(at)) continue;
                if (++work > MAX_QUERIES) return true;
                Instruction i = instructions.get(at);
                if (i == null) return true;
                if (i.getFlowType().isCall()) {
                    // C memcpy copies the bytes, without retaining its pointer
                    // arguments; the destination is another private frame span.
                    if (nonEscapingCall(i)) { pending.addAll(predecessors.getOrDefault(at,List.of()));continue; }
                    if (passesFrameAddress(i)) return true;
                } else if (hasMemoryEffect(i) && frameStore(i,false)==null) {
                    return true;
                }
                pending.addAll(predecessors.getOrDefault(at,List.of()));
            }
            return work > MAX_QUERIES;
        }
        Value register(String register, Address before) throws Exception { return value(new Query(register,null,before)); }
        Value slot(long slot, Address before) throws Exception { return value(new Query(null,slot,before)); }
        Value slot32(long slot, Address before) throws Exception { return value(new Query("slot32",slot,before)); }
        Value priorSlot(Query query,Address before) throws Exception { return value(new Query(query.register,query.slot,before)); }
        Value value(Query query) throws Exception {
            monitor.checkCancelled();
            if (++work > MAX_QUERIES || active.size() > 256) return null;
            if (query.slot!=null && !spillFrame(query.slot,"slot32".equals(query.register)?4:8,query.before)) return null;
            if (memo.containsKey(query)) return memo.get(query);
            if (!active.add(query)) return null;
            Value result;
            try { result = reaching(query,query.before,new HashSet<>()); }
            finally { active.remove(query); }
            memo.put(query,result); return result;
        }
        Value reaching(Query query, Address before, Set<Address> seen) throws Exception {
            List<Address> traversed = new ArrayList<>();
            Value result;
            while (true) {
                monitor.checkCancelled();
                Query at = new Query(query.register,query.slot,before);
                if (memo.containsKey(at)) { result = memo.get(at); break; }
                traversed.add(before);
                if (++work > MAX_QUERIES || !seen.add(before) || foreignEntries.contains(before)) { result = null; break; }
                if (before.equals(owner.getEntryPoint())) {
                    result = "sp".equals(query.register) ? new Value("frame",0,null,null) :
                        query.slot==null && "r0".equals(query.register) ? new Value("input",0,null,owner.getEntryPoint()) : null; break;
                }
                List<Address> incoming = predecessors.getOrDefault(before,List.of());
                if (incoming.isEmpty()) { result = null; break; }
                if (incoming.size() > 1) {
                    Value common = null;
                    boolean agrees = true;
                    for (Address predecessor : incoming) {
                        Value candidate = after(query,instructions.get(predecessor),new HashSet<>(seen));
                        if (candidate == null || (common != null && !common.equals(candidate))) { agrees = false; break; }
                        common = candidate;
                    }
                    result = agrees ? common : null; break;
                }
                Instruction previous = instructions.get(incoming.get(0));
                if (defines(query,previous)) { result = definition(query,previous); break; }
                before = previous.getAddress();
            }
            for (Address at : traversed) memo.putIfAbsent(new Query(query.register,query.slot,at),result);
            return result;
        }
        Value after(Query query, Instruction instruction, Set<Address> seen) throws Exception {
            return defines(query,instruction) ? definition(query,instruction) : reaching(query,instruction.getAddress(),seen);
        }
        boolean defines(Query query, Instruction instruction) throws Exception {
            if (query.slot != null) return hasMemoryEffect(instruction) || instruction.getFlowType().isCall() || writesRegister(instruction,"sp");
            if (instruction.getFlowType().isCall() && Set.of("nzcv","n","z","c","v").contains(query.register)) return true;
            if (instruction.getFlowType().isCall() && Set.of("r2","r8","r12","sp").contains(query.register) &&
                probeEffect(instruction)!=null) return false;
            if (instruction.getFlowType().isCall() && volatileRegister(query.register)) return true;
            for (Object object : instruction.getResultObjects())
                if (object instanceof Register written && reg(written.getBaseRegister().getName()).equals(query.register)) return true;
            return false;
        }
        Value definition(Query query, Instruction instruction) throws Exception {
            Address at = instruction.getAddress(); String mnemonic = name(instruction);
            if (query.slot != null) {
                if (instruction.getFlowType().isCall()) {
                    ProbeEffect probe=probeEffect(instruction);
                    if (probe!=null) return overlaps(probe.scratch.start,probe.scratch.size,query.slot,
                        "slot32".equals(query.register)?4:8)?null:priorSlot(query,at);
                    if (probeTarget(instruction)!=null) return null;
                    if (privateMemcpy(instruction)) {
                        Value destination=register("r0",at);
                        long size=constant(register("r2",at));
                        int wanted="slot32".equals(query.register)?4:8;
                        return overlaps(destination.number,size,query.slot,wanted)?null:priorSlot(query,at);
                    }
                    if (!nonEscapingCall(instruction) && passesFrameAddress(instruction)) return null;
                    return priorSlot(query,at);
                }
                if (!hasMemoryEffect(instruction)) {
                    // A writeback load changes SP even when its loaded value
                    // is discarded. Unsupported SP definitions must not turn a
                    // provable pop into the legacy dynamic-allocation fallback.
                    if (writesRegister(instruction,"sp") &&
                        !Set.of("MOV","ADD","SUB").contains(mnemonic)) return null;
                    Address after=instruction.getFallThrough();
                    return after!=null && spillFrame(query.slot,"slot32".equals(query.register)?4:8,after)
                        ?priorSlot(query,at):null;
                }
                int operand = mnemonic.equals("STP") ? 2 : 1;
                FrameWrite write=frameStore(instruction,false);
                if (write==null) return null;
                long start=write.start;
                int width = storeWidth(instruction);
                int elements = mnemonic.equals("STP") ? 2 : 1;
                int wanted="slot32".equals(query.register)?4:8;
                if (!overlaps(query.slot,wanted,start,width*elements)) return priorSlot(query,at);
                long displacement = query.slot - start;
                if (width != wanted || displacement < 0 || displacement % width != 0 || displacement / width >= elements) return null;
                String source = op(instruction,(int)(displacement / width));
                if (wanted==8 && source.startsWith("x")) return register(reg(source),at);
                return wanted==4 && source.startsWith("w") ? copied(register(reg(source),at),source) : null;
            }
            if (instruction.getFlowType().isCall()) {
                if (!query.register.equals("r0")) return null;
                Address target = directTarget(instruction);
                EnumInfo type = accessors.get(target);
                if (type != null) return new Value("metadata",0,type,at);
                if (tagCallees.contains(target)) {
                    Value metadata = register("r1",at);
                    // The ABI returns an unsigned 32-bit tag. Its upper bits
                    // cannot bound an X-register index until a W write clears
                    // them; preserve that distinction through copies/spills.
                    if (kind(metadata,"metadata")) return new Value("tag-low32",0,metadata.type,at);
                }
                return target!=null && tagHelperLength(target)>0 ? outlinedTag(this,instruction,target) : null;
            }
            if (mnemonic.equals("MOV")) {
                Long literal=immediate(instruction,1);
                return copied(literal==null?register(reg(op(instruction,1)),at):new Value("constant",literal,null,null),op(instruction,0));
            }
            if (mnemonic.equals("ADR") || mnemonic.equals("ADRP")) {
                Long number = immediate(instruction,1);
                return number == null ? null : new Value("constant",number,null,null);
            }
            if (mnemonic.equals("ADD") || mnemonic.equals("SUB")) {
                Long delta = immediate(instruction,2);
                Value base = register(reg(op(instruction,1)),at);
                if (delta == null || base == null) return null;
                if (delta == 0) return copied(base,op(instruction,0));
                if (op(instruction,0).startsWith("w")) return null;
                if (!kind(base,"constant") && !kind(base,"frame")) return null;
                return new Value(base.kind,base.number + (mnemonic.equals("SUB") ? -delta : delta),null,null);
            }
            if (mnemonic.equals("LDR") || mnemonic.equals("LDUR")) {
                if (instruction.getNumOperands()!=2 || !op(instruction,1).endsWith("]") ||
                    !query.register.equals(reg(op(instruction,0)))) return null;
                MemoryOperand source = memory(instruction,1);
                if (source == null || (!op(instruction,0).startsWith("x") && !op(instruction,0).startsWith("w"))) return null;
                Value base = register(source.base,at);
                if (!kind(base,"frame")) return null;
                if (!spillFrame(base.number+source.offset,width(op(instruction,0)),at)) return null;
                return op(instruction,0).startsWith("w") ? copied(slot32(base.number+source.offset,at),op(instruction,0)) : slot(base.number + source.offset,at);
            }
            if (query.register.equals("sp") && mnemonic.equals("STP") && op(instruction,2).endsWith("!")) {
                MemoryOperand target = memory(instruction,2);
                Value base = target == null ? null : register(target.base,at);
                return kind(base,"frame") ? new Value("frame",base.number+target.offset,null,null) : null;
            }
            return null;
        }
    }

    private static boolean isStore(Instruction i) { return Set.of("STR","STRB","STRH","STUR","STURB","STURH","STP").contains(name(i)); }
    private static boolean hasOpaqueEffect(Instruction i) {
        for (PcodeOp operation:i.getPcode()) if (operation.getOpcode()==PcodeOp.CALLOTHER) return true;
        return false;
    }
    private static boolean hasMemoryEffect(Instruction i) {
        if (isStore(i) || hasOpaqueEffect(i)) return true;
        for (PcodeOp operation:i.getPcode()) if (operation.getOpcode()==PcodeOp.STORE) return true;
        return false;
    }
    private static boolean writesRegister(Instruction i,String register) {
        for (Object object:i.getResultObjects())
            if (object instanceof Register written && reg(written.getBaseRegister().getName()).equals(register)) return true;
        return false;
    }
    private static boolean dataRegister(String operand) { return operand.matches("(?:[xwqdsbh](?:[0-9]|[12][0-9]|3[01])|[xw]zr)"); }
    private static int storeWidth(Instruction instruction) {
        String mnemonic=name(instruction);
        if (mnemonic.equals("STRB") || mnemonic.equals("STURB")) return 1;
        if (mnemonic.equals("STRH") || mnemonic.equals("STURH")) return 2;
        return width(op(instruction,0));
    }
    private static Long constant(Value value) { return kind(value,"constant")?value.number:null; }
    private static boolean overlaps(long left,long leftSize,long right,long rightSize) {
        try { return left<Math.addExact(right,rightSize) && right<Math.addExact(left,leftSize); }
        catch (ArithmeticException overflow) { return true; }
    }
    private static boolean volatileRegister(String register) {
        return register.matches("r(?:[0-9]|1[0-8]|30)");
    }
    private static boolean kind(Value value, String kind) { return value != null && value.kind.equals(kind); }
    private static Value copied(Value value, String destination) {
        if (value == null || !destination.startsWith("w")) return value;
        if (kind(value,"tag-low32")) return new Value("tag",0,value.type,value.origin);
        if (kind(value,"tag")) return value; // ABI bound is at most MAX_CASES.
        return kind(value,"constant") ? new Value("constant",value.number & 0xffffffffL,null,null) : null;
    }
    private static String name(Instruction i) { return i.getMnemonicString().toUpperCase(Locale.ROOT); }
    private static String op(Instruction i, int operand) { return i.getDefaultOperandRepresentation(operand).toLowerCase(Locale.ROOT).replaceAll("\\s+"," ").trim(); }
    private static String reg(String raw) {
        String register = raw.toLowerCase(Locale.ROOT);
        return register.matches("[wx]\\d+") ? "r"+register.substring(1) : register;
    }
    private static int width(String register) {
        if (register.startsWith("q")) return 16;
        if (register.startsWith("h")) return 2;
        if (register.startsWith("b")) return 1;
        return register.startsWith("x") || register.startsWith("d") ? 8 : 4;
    }
    private static MemoryOperand memory(Instruction i, int operand) {
        Matcher match = MEMORY.matcher(op(i,operand));
        if (!match.matches()) return null;
        return new MemoryOperand(reg(match.group(1)),match.group(2) == null ? 0 : integer(match.group(2)));
    }
    private static Long immediate(Instruction i, int operand) {
        if (operand >= i.getNumOperands()) return null;
        Matcher match = Pattern.compile("^#?(-?(?:0x[0-9a-f]+|[0-9]+))(?:, lsl #?(0xc|12))?$").matcher(op(i,operand));
        if (!match.matches()) return null;
        return integer(match.group(1)) << (match.group(2) == null ? 0 : 12);
    }
    private static long integer(String value) {
        boolean negative = value.startsWith("-");
        String number = negative ? value.substring(1) : value;
        long result = number.startsWith("0x") ? Long.parseUnsignedLong(number.substring(2),16) : Long.parseLong(number);
        return negative ? -result : result;
    }
    private static boolean sameOperands(Instruction i, String first, String second) { return op(i,0).equals(first) && op(i,1).equals(second); }
    private static Address directTarget(Instruction i) { Address[] flows = i.getFlows(); return flows.length == 1 ? flows[0] : null; }
    private static boolean callIs(Instruction i, Set<Address> targets) { return targets.contains(directTarget(i)); }
    private static boolean flowIs(Instruction i, Instruction target) { return Objects.equals(directTarget(i),target.getAddress()); }
    private Address address(long offset) { return program.getAddressFactory().getDefaultAddressSpace().getAddress(offset); }
    private static String hex(Address address) { return "0x"+Long.toUnsignedString(address.getOffset(),16); }
    private Address relative(Address slot) throws Exception { int value = program.getMemory().getInt(slot); return value == 0 ? null : slot.addNoWrap(value); }
    private boolean initialized(Address start, long length) {
        if (length <= 0) return false;
        MemoryBlock block = program.getMemory().getBlock(start);
        try { return block != null && block.isInitialized() && block.contains(start.addNoWrap(length-1)); }
        catch (AddressOverflowException invalid) { return false; }
    }
    private boolean executable(Address address) {
        MemoryBlock block = program.getMemory().getBlock(address);
        return block != null && block.isInitialized() && block.isExecute();
    }
    private String cString(Address start) throws Exception {
        if (start == null) return null;
        java.io.ByteArrayOutputStream bytes = new java.io.ByteArrayOutputStream();
        for (int index = 0; index < 1024; index++) {
            if (!initialized(start.add(index),1)) return null;
            byte value = program.getMemory().getByte(start.add(index));
            if (value == 0) {
                try { return java.nio.charset.StandardCharsets.UTF_8.newDecoder()
                    .decode(java.nio.ByteBuffer.wrap(bytes.toByteArray())).toString(); }
                catch (java.nio.charset.CharacterCodingException invalid) { return null; }
            }
            bytes.write(value);
        }
        return null;
    }
}
