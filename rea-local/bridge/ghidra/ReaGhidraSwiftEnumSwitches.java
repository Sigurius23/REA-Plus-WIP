import com.google.gson.JsonArray;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import ghidra.app.cmd.disassemble.DisassembleCommand;
import ghidra.app.cmd.function.CreateFunctionCmd;
import ghidra.app.util.PseudoDisassembler;
import ghidra.program.model.address.*;
import ghidra.program.model.lang.Register;
import ghidra.program.model.listing.*;
import ghidra.program.model.mem.MemoryBlock;
import ghidra.program.model.pcode.JumpTable;
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
    private final Program program;
    private final TaskMonitor monitor;
    private final Map<Address, EnumInfo> accessors = new HashMap<>();
    private final Map<Address, Recovery> recovered = new LinkedHashMap<>();
    private final Set<Address> tagCallees = new HashSet<>();
    private final Set<Address> singletonCallees = new HashSet<>();
    private record EnumInfo(Address descriptor, Address fields, Address accessor, Address cache,
                            int payloads, int empty, List<String> names) {
        int count() { return payloads + empty; }
    }
    private record Value(String kind, long number, EnumInfo type, Address origin) {}
    private record Query(String register, Long slot, Address before) {}
    private record MemoryOperand(String base, long offset) {}
    private record Recovery(Function owner, Address dispatch, Address table, Address anchor,
                            Address tagCall, Address limit, EnumInfo type, List<Address> targets) {}
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
        if (tagCallees.isEmpty() || singletonCallees.isEmpty()) return;
        readEnums();
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
                    if (info != null && accessorMatches(info)) {
                        // An ambiguous accessor cannot establish a unique enum.
                        if (accessors.containsKey(info.accessor)) {
                            EnumInfo prior = accessors.get(info.accessor);
                            if (prior == null || !prior.descriptor.equals(info.descriptor)) accessors.put(info.accessor, null);
                        }
                        else accessors.put(info.accessor, info);
                    }
                } catch (ghidra.program.model.mem.MemoryAccessException |
                         AddressOverflowException invalid) {
                    // Malformed file-backed metadata is not a recovery authority.
                }
            }
        }
        accessors.values().removeIf(Objects::isNull);
    }

    private EnumInfo readEnum(Address descriptor) throws Exception {
        if (!initialized(descriptor, 40)) return null;
        int flags = program.getMemory().getInt(descriptor);
        if ((flags & 0x1f) != 18 || (flags & 0x80) != 0 || ((flags >>> 8) & 0xff) != 0 ||
            ((flags >>> 16) & 3) != 1) return null;
        int payloads = program.getMemory().getInt(descriptor.add(20)) & 0xffffff;
        long empty = Integer.toUnsignedLong(program.getMemory().getInt(descriptor.add(24)));
        long count = payloads + empty;
        if (payloads < 1 || count < 2 || count > MAX_CASES) return null;
        Address accessor = relative(descriptor.add(12));
        Address fields = relative(descriptor.add(16));
        // A non-generic enum's SingletonMetadataInitialization immediately
        // follows its 28-byte fixed descriptor. Its cache's first word is the
        // completed metadata pointer; the accessor must load this exact word.
        Address cache = relative(descriptor.add(28));
        if (cache == null || !initialized(cache,16)) return null;
        if (accessor == null || fields == null || !executable(accessor) || !initialized(fields, 16)) return null;
        if (program.getMemory().getShort(fields.add(8)) != 2 ||
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
        if (add == null || load == null || !name(add).equals("ADD") || !name(load).equals("LDRSW") ||
            add.getNumOperands() != 3 || load.getNumOperands() != 2 ||
            !op(add,0).equals(op(branch,0)) || !op(load,0).startsWith("x")) return null;
        Matcher indexed = INDEXED.matcher(op(load,1));
        if (!indexed.matches()) return null;
        String entry = reg(op(load,0));
        String left = reg(op(add,1)), right = reg(op(add,2));
        String base = entry.equals(left) ? right : entry.equals(right) ? left : null;
        if (base == null || base.equals(entry)) return null;
        if (!graph.predecessors.getOrDefault(add.getAddress(),List.of()).equals(List.of(load.getAddress())) ||
            !graph.predecessors.getOrDefault(branch.getAddress(),List.of()).equals(List.of(add.getAddress()))) return null;
        Value anchor = graph.register(base, add.getAddress());
        Value table = graph.register(reg(indexed.group(1)), load.getAddress());
        Value tag = graph.register(reg(indexed.group(2)), load.getAddress());
        if (!kind(anchor,"constant") || !kind(table,"constant") || !kind(tag,"tag")) return null;
        if (graph.frameEscapedBefore(tag.origin)) return null;
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
        return new Recovery(graph.owner, branch.getAddress(), tableAddress, anchorAddress, tag.origin, end, tag.type, targets);
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
                " agrees. Its ABI-declared accessor " + hex(item.type.accessor) +
                " loads its declared singleton cache " + hex(item.type.cache) +
                " and has the verified swift_getSingletonMetadata path. Exact libswiftCore external swift_getEnumCaseMultiPayload at " +
                hex(item.tagCall) + " receives that metadata; its unchanged tag reaches the LDRSW index after an explicit 32-bit zero-extending write. Signed 32-bit entries at " +
                hex(item.table) + " are added to " + hex(item.anchor) +
                ". REA+ restored computed edges, disassembled destinations and extended the owning function before observations;" +
                " generated override labels are analysis metadata, not source/caller declarations.";
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
                    " selects signed word at " + hex(item.table.add(index * 4L)) + ", reaching " + hex(item.targets.get(index)) + ". " + proof));
                mappings.add(mapping);
            }
            table.add("mappings",mappings);
            table.add("default_targets",new JsonArray());
            JsonArray limitations = new JsonArray();
            limitations.add("Case values are Swift ABI runtime tags, with payload cases before empty cases; field names are reflection metadata. Valid enum values supply the bound; this does not establish state reachability or original source order.");
            limitations.add("Control-flow recovery assumes the normal AArch64 ABI and private non-escaped frame storage. It does not execute the target or prove each case's high-level semantics.");
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
                    for (int index = 0; index < 8; index++)
                        if (kind(register("r"+index,i.getAddress()),"frame")) return true;
                } else if (isStore(i)) {
                    int operand = name(i).equals("STP") ? 2 : 1;
                    MemoryOperand destination = memory(i,operand);
                    if (destination == null || !kind(register(destination.base,i.getAddress()),"frame")) {
                        for (int index = 0; index < operand; index++)
                            if (kind(register(reg(op(i,index)),i.getAddress()),"frame")) return true;
                    }
                }
                pending.addAll(predecessors.getOrDefault(at,List.of()));
            }
            return work > MAX_QUERIES;
        }
        Value register(String register, Address before) throws Exception { return value(new Query(register,null,before)); }
        Value slot(long slot, Address before) throws Exception { return value(new Query(null,slot,before)); }
        Value value(Query query) throws Exception {
            monitor.checkCancelled();
            if (++work > MAX_QUERIES || active.size() > 256) return null;
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
                    result = "sp".equals(query.register) ? new Value("frame",0,null,null) : null; break;
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
            if (query.slot != null) return isStore(instruction) || instruction.getFlowType().isCall();
            if (instruction.getFlowType().isCall() && volatileRegister(query.register)) return true;
            for (Object object : instruction.getResultObjects())
                if (object instanceof Register written && reg(written.getBaseRegister().getName()).equals(query.register)) return true;
            return false;
        }
        Value definition(Query query, Instruction instruction) throws Exception {
            Address at = instruction.getAddress(); String mnemonic = name(instruction);
            if (query.slot != null) {
                if (instruction.getFlowType().isCall()) {
                    for (int index = 0; index < 8; index++) {
                        Value argument = register("r"+index,at);
                        if (kind(argument,"frame")) return null;
                    }
                    return slot(query.slot,at);
                }
                int operand = mnemonic.equals("STP") ? 2 : 1;
                MemoryOperand destination = memory(instruction,operand);
                if (destination == null) return null;
                Value base = register(destination.base,at);
                if (!kind(base,"frame")) return null;
                long start = base.number + destination.offset;
                int width = width(op(instruction,0));
                if (mnemonic.equals("STRB") || mnemonic.equals("STURB")) width = 1;
                if (mnemonic.equals("STRH") || mnemonic.equals("STURH")) width = 2;
                int elements = mnemonic.equals("STP") ? 2 : 1;
                if (query.slot + 8 <= start || query.slot >= start + width * elements) return slot(query.slot,at);
                long displacement = query.slot - start;
                if (width != 8 || displacement < 0 || displacement % 8 != 0 || displacement / 8 >= elements) return null;
                String source = op(instruction,(int)(displacement / 8));
                return source.startsWith("x") ? register(reg(source),at) : null;
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
                return null;
            }
            if (mnemonic.equals("MOV")) return copied(register(reg(op(instruction,1)),at),op(instruction,0));
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
                MemoryOperand source = memory(instruction,1);
                if (source == null || width(op(instruction,0)) != 8) return null;
                Value base = register(source.base,at);
                return kind(base,"frame") ? slot(base.number + source.offset,at) : null;
            }
            if (query.register.equals("sp") && mnemonic.equals("STP") && op(instruction,2).endsWith("!")) {
                MemoryOperand target = memory(instruction,2);
                Value base = target == null ? null : register(target.base,at);
                return kind(base,"frame") ? new Value("frame",base.number+target.offset,null,null) : null;
            }
            return null;
        }
    }

    private static boolean isStore(Instruction i) { return name(i).startsWith("STR") || name(i).startsWith("STUR") || name(i).equals("STP"); }
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
