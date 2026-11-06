import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import ghidra.program.database.SpecExtension;
import ghidra.program.model.address.Address;
import ghidra.program.model.lang.PrototypeModel;
import ghidra.program.model.lang.Register;
import ghidra.program.model.listing.*;
import ghidra.program.model.pcode.HighFunction;
import ghidra.program.model.pcode.XmlEncode;
import ghidra.program.model.symbol.*;
import ghidra.util.task.TaskMonitor;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.*;
import java.util.concurrent.TimeUnit;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

/** Private-Program call effects for proved synchronous Swift throwing callees. */
final class ReaGhidraSwiftErrorCalls implements AutoCloseable {
    // Independent subprocess, output, cache and per-request resource budgets.
    private static final int MAX_SYMBOL_CHARS = 8192;
    private static final int MAX_DEMANGLE_BYTES = 65536;
    private static final long DEMANGLE_TIMEOUT_MS = 2000;
    private static final long REQUEST_DEMANGLE_MS = 10000;
    private final Program program;
    private final TaskMonitor monitor;
    private final Set<Process> ownedProcesses = new HashSet<>();
    private final Set<ProcessHandle> ownedDescendants = new HashSet<>();
    private final Map<String, String> models = new HashMap<>();
    private final Map<Address, Adjustment> adjustments = new HashMap<>();
    private final Map<Address, List<Uncertainty>> uncertainties = new HashMap<>();
    private final Map<String, Proof> proofs = new LinkedHashMap<>(16, 0.75f, true) {
        protected boolean removeEldestEntry(Map.Entry<String, Proof> entry) {
            return size() > 256;
        }
    };
    private boolean supported;
    private String setupFailure;
    private record Proof(boolean throwing, String demangled, String outputSha256, String reason) {}
    private record Adjustment(Address target, String symbol, Proof proof,
                              String originalConvention, String effectiveConvention) {}
    private record Uncertainty(Address address, String reason) {}
    private record ExpandedNode(String kind, List<ExpandedNode> children) {}

    ReaGhidraSwiftErrorCalls(Program program, TaskMonitor monitor) {
        this.program = program;
        this.monitor = monitor;
    }

    void initialize() throws Exception {
        supported = !System.getProperty("os.name", "").startsWith("Windows") &&
            program.getExecutableFormat().contains("Mach-O") &&
            program.getLanguageID().getIdAsString().startsWith("AARCH64:LE:") &&
            program.getDefaultPointerSize() == 8 &&
            program.getCompilerSpec().getCompilerSpecID().getIdAsString().equals("swift");
        if (!supported) return;
        for (String original : List.of("__swiftcall", "__thiscall")) {
            PrototypeModel model = program.getCompilerSpec().getCallingConvention(original);
            if (model == null || model.getAliasParent() != null) continue;
            Register error = program.getRegister("x21");
            if (error == null || Arrays.stream(model.getUnaffectedList()).noneMatch(v ->
                v.getAddress().equals(error.getAddress()) && v.getSize() == 8)) continue;
            String effective = "__rea_" + original.substring(2) + "_throws_x21";
            int transaction = program.startTransaction("REA+ synchronous Swift error-register model");
            boolean commit = false;
            try {
                new SpecExtension(program).addReplaceCompilerSpecExtension(
                    throwingModel(model, effective, error), monitor);
                if (program.getCompilerSpec().getCallingConvention(effective) == null)
                    throw new IOException("The installed compiler rejected the private convention");
                commit = true;
            } catch (Exception failure) {
                monitor.checkCancelled();
                setupFailure = "The private Swift error-register model could not be installed: " +
                    failure.getClass().getSimpleName();
            } finally {
                program.endTransaction(transaction, commit);
            }
            if (commit) models.put(original, effective);
        }
    }

    /** A true result invalidates cached decompiler call effects. */
    boolean prepare(Function owner) throws Exception {
        if (!supported || owner.isExternal() || owner.isThunk()) return false;
        List<Uncertainty> unknown = new ArrayList<>();
        uncertainties.put(owner.getEntryPoint(), unknown);
        long deadline = System.nanoTime() + TimeUnit.MILLISECONDS.toNanos(REQUEST_DEMANGLE_MS);
        boolean changed = false;
        for (Instruction call : program.getListing().getInstructions(owner.getBody(), true)) {
            monitor.checkCancelled();
            if (!call.getFlowType().isCall()) continue;
            Instruction guard = guardedCall(owner, call);
            if (hasPrototypeOverride(owner, call.getAddress())) {
                if (guard != null) unknown.add(new Uncertainty(guard.getAddress(),
                    "The caller's explicit prototype override is preserved; this Swift x21 guard's call effects were not changed."));
                continue;
            }
            Function callee = target(call);
            if (callee == null) {
                if (guard != null) unknown.add(new Uncertainty(guard.getAddress(),
                    "An x21 guard follows an unresolved Swift call; synchronous error-register effects remain unknown."));
                continue;
            }
            Adjustment old = adjustments.get(callee.getEntryPoint());
            if (old != null && Objects.equals(callee.getCallingConventionName(), old.effectiveConvention)) continue;
            String symbol = originalSymbol(callee);
            if (symbol == null) {
                if (guard != null) unknown.add(new Uncertainty(guard.getAddress(),
                    "An x21 guard follows a call without a retained original symbol; throwing behavior is unproved."));
                continue;
            }
            if (!isSwiftSymbol(symbol)) continue; // Ordinary C ABI calls preserve x21.
            Proof proof = proof(symbol, deadline);
            if (!proof.throwing) {
                if (proof.reason != null) unknown.add(new Uncertainty(
                    guard == null ? call.getAddress() : guard.getAddress(), proof.reason));
                continue;
            }
            String convention = Objects.requireNonNullElse(callee.getCallingConventionName(), "unknown");
            String base = convention.equals("default") || convention.equals("unknown")
                ? program.getCompilerSpec().getDefaultCallingConvention().getName() : convention;
            String effective = models.get(base);
            if (callee.getSignatureSource() == SourceType.USER_DEFINED || effective == null) {
                unknown.add(new Uncertainty(guard == null ? call.getAddress() : guard.getAddress(), setupFailure != null ? setupFailure :
                    "The proved throwing callee retains an explicit or unsupported calling model; x21 effects were not changed."));
                continue;
            }
            int transaction = program.startTransaction("REA+ proved synchronous throwing callee");
            boolean commit = false;
            try {
                // Unlike a call-site signature override, this does not lock
                // guessed parameter sizes or change input/output storage rules.
                callee.setCallingConvention(effective);
                commit = true;
            } finally {
                program.endTransaction(transaction, commit);
            }
            adjustments.put(callee.getEntryPoint(), new Adjustment(callee.getEntryPoint(), symbol,
                proof, convention, effective));
            changed = true;
        }
        return changed;
    }

    JsonArray observations(Function owner) {
        JsonArray result = new JsonArray();
        if (!supported) return result;
        for (Instruction call : program.getListing().getInstructions(owner.getBody(), true)) {
            if (!call.getFlowType().isCall() || hasPrototypeOverride(owner, call.getAddress())) continue;
            Function callee = target(call);
            Adjustment adjustment = callee == null ? null : adjustments.get(callee.getEntryPoint());
            if (adjustment == null ||
                !Objects.equals(callee.getCallingConventionName(), adjustment.effectiveConvention)) continue;
            JsonObject value = new JsonObject();
            value.addProperty("call_address", address(call.getAddress()));
            value.addProperty("callee_address", address(adjustment.target));
            value.addProperty("callee_address_space", adjustment.target.getAddressSpace().getName());
            value.addProperty("original_symbol", adjustment.symbol);
            value.addProperty("demangled_signature", adjustment.proof.demangled);
            value.addProperty("demangler_output_sha256", adjustment.proof.outputSha256);
            value.addProperty("original_calling_convention", adjustment.originalConvention);
            value.addProperty("effective_calling_convention", adjustment.effectiveConvention);
            value.addProperty("register", "x21");
            value.addProperty("previous_effect", "preserved");
            value.addProperty("effective_effect", "unknown-after-call");
            value.addProperty("provenance", "swift-synchronous-throws-abi");
            value.addProperty("proof", "The original symbol's outer FunctionType has a direct ThrowsAnnotation and no AsyncAnnotation; ARM64 Swift uses x21 for synchronous error returns.");
            result.add(value);
        }
        return result;
    }

    JsonArray controlFlowUncertainties(Function owner) {
        JsonArray result = new JsonArray();
        for (Uncertainty item : uncertainties.getOrDefault(owner.getEntryPoint(), List.of())) {
            JsonObject value = new JsonObject();
            value.addProperty("address", address(item.address));
            value.addProperty("reason", item.reason);
            result.add(value);
        }
        return result;
    }

    List<String> limitations(Function owner) {
        List<String> result = new ArrayList<>();
        if (!observations(owner).isEmpty()) result.add(
            "REA+ models x21 as unknown after proved synchronous Swift throwing callees in this private Program. Original parameters, return types and bytes are preserved; this is static ABI modeling, not observed execution.");
        for (Uncertainty item : uncertainties.getOrDefault(owner.getEntryPoint(), List.of()))
            result.add("Swift control-flow uncertainty at " + address(item.address) + ": " + item.reason +
                " Consult assembly and machine CFG before inferring success/failure paths.");
        return result;
    }

    private Function target(Instruction call) {
        Address[] flows = call.getFlows();
        Function function = flows.length == 1 ? program.getFunctionManager().getFunctionAt(flows[0]) : null;
        return function != null && function.isThunk() ? function.getThunkedFunction(true) : function;
    }

    private Instruction guardedCall(Function owner, Instruction call) {
        Instruction next = call;
        while ((next = program.getListing().getInstructionAfter(next.getAddress())) != null &&
               owner.getBody().contains(next.getAddress())) {
            String mnemonic = next.getMnemonicString().toUpperCase(Locale.ROOT);
            if ((mnemonic.equals("CBZ") || mnemonic.equals("CBNZ")) &&
                next.getNumOperands() == 2 && next.getOpObjects(0).length == 1 &&
                next.getOpObjects(0)[0] instanceof Register register && register.getName().equals("x21")) return next;
            if (next.getFlowType().isCall() || next.getFlowType().isJump() || next.getFlowType().isTerminal()) return null;
            for (Object output : next.getResultObjects())
                if (output instanceof Register register && register.getBaseRegister().getName().equals("x21")) return null;
        }
        return null;
    }

    private boolean hasPrototypeOverride(Function owner, Address call) {
        Namespace overrides = HighFunction.findOverrideSpace(owner);
        if (overrides == null) return false;
        SymbolIterator symbols = program.getSymbolTable().getSymbols(overrides);
        while (symbols.hasNext()) {
            Symbol symbol = symbols.next();
            if (symbol.getAddress().equals(call) && symbol.getName().startsWith("prt")) return true;
        }
        return false;
    }

    private String originalSymbol(Function function) {
        ExternalLocation external = function.getExternalLocation();
        if (external != null && external.getOriginalImportedName() != null) return external.getOriginalImportedName();
        if (isSwiftSymbol(function.getName())) return function.getName();
        for (Symbol symbol : program.getSymbolTable().getSymbols(function.getEntryPoint()))
            if (isSwiftSymbol(symbol.getName())) return symbol.getName();
        return function.isExternal() ? function.getName() : null;
    }

    private static boolean isSwiftSymbol(String symbol) {
        return List.of("$s", "_$s", "$S", "_$S", "_T").stream().anyMatch(symbol::startsWith);
    }

    private Proof proof(String symbol, long requestDeadline) throws Exception {
        Proof cached = proofs.get(symbol);
        if (cached != null) return cached;
        if (symbol.length() > MAX_SYMBOL_CHARS) return unknown("The original Swift symbol exceeds the 8192-character demangling budget.");
        long remaining = TimeUnit.NANOSECONDS.toMillis(requestDeadline - System.nanoTime());
        if (remaining <= 0) return unknown("The 10-second per-procedure Swift demangling budget was exhausted.");
        String executable = System.getenv("GHIDRA_SWIFT_DEMANGLER");
        if (executable == null || executable.isBlank()) executable = "/usr/bin/swift";
        List<String> command = new ArrayList<>(List.of(executable));
        if (!new File(executable).getName().contains("-demangle")) command.add("demangle");
        command.addAll(List.of("--compact", "--expand", "--", symbol));
        Process process;
        try { process = new ProcessBuilder(command).redirectErrorStream(true).start(); }
        catch (IOException unavailable) { return unknown("The configured Swift demangler is unavailable."); }
        ownedProcesses.add(process);
        Set<ProcessHandle> descendants = new HashSet<>();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try {
            long deadline = System.nanoTime() + TimeUnit.MILLISECONDS.toNanos(Math.min(remaining, DEMANGLE_TIMEOUT_MS));
            InputStream input = process.getInputStream();
            byte[] buffer = new byte[4096];
            while (true) {
                monitor.checkCancelled();
                if (System.nanoTime() >= deadline) return unknown("Swift demangling exceeded its 2-second deadline.");
                process.descendants().forEach(descendants::add);
                ownedDescendants.addAll(descendants);
                int available = input.available();
                if (available > 0) {
                    int count = input.read(buffer, 0, Math.min(available, buffer.length));
                    if (count > 0) output.write(buffer, 0, count);
                    if (output.size() > MAX_DEMANGLE_BYTES) return unknown("Swift demangling exceeds the 65536-byte output budget.");
                    continue;
                }
                if (!process.isAlive()) break;
                process.waitFor(20, TimeUnit.MILLISECONDS);
            }
            if (process.exitValue() != 0) return unknown("The Swift demangler failed.");
            String text = output.toString(StandardCharsets.UTF_8);
            Proof result = classify(text, symbol);
            proofs.put(symbol, result);
            return result;
        } finally {
            for (ProcessHandle child : descendants) if (child.isAlive()) child.destroyForcibly();
            try { retire(process); } finally { retireDescendants(); }
        }
    }

    private static Proof unknown(String detail) {
        return new Proof(false, null, null, detail + " Synchronous throwing effects remain unproved.");
    }

    private void retire(Process process) throws Exception {
        if (process.isAlive()) process.destroyForcibly();
        process.getInputStream().close();
        process.getOutputStream().close();
        process.getErrorStream().close();
        if (!process.waitFor(2000, TimeUnit.MILLISECONDS))
            throw new IOException("Owned Swift demangler did not terminate; its cleanup handle is retained");
        ownedProcesses.remove(process);
    }

    public void close() throws Exception {
        Exception failure = null;
        for (Process process : new ArrayList<>(ownedProcesses)) {
            try { retire(process); } catch (Exception error) { failure = error; }
        }
        try { retireDescendants(); } catch (Exception error) { failure = error; }
        if (failure != null) throw failure;
    }

    private void retireDescendants() throws Exception {
        for (ProcessHandle child : new ArrayList<>(ownedDescendants)) {
            if (child.isAlive()) child.destroyForcibly();
            if (child.isAlive()) child.onExit().get(2000, TimeUnit.MILLISECONDS);
            if (!child.isAlive()) ownedDescendants.remove(child);
        }
    }

    /** A throwing callback/returned closure is not the outer function's ThrowsAnnotation. */
    static Proof classify(String output, String symbol) throws Exception {
        String[] lines = output.split("\\R");
        if (lines.length == 0 || !lines[0].equals("Demangling for " + symbol)) return unknown("Swift demangling did not produce the selected symbol's expanded tree.");
        List<ExpandedNode> path = new ArrayList<>();
        ExpandedNode root = null;
        String demangled = null;
        for (String line : lines) {
            int spaces = 0;
            while (spaces < line.length() && line.charAt(spaces) == ' ') spaces++;
            String node = line.substring(spaces);
            if (!node.startsWith("kind=")) {
                if (!line.isBlank() && !line.startsWith("Demangling for ")) demangled = line;
                continue;
            }
            if ((spaces & 1) != 0) return unknown("Swift demangling tree indentation is unsupported.");
            int depth = spaces / 2;
            while (path.size() > depth) path.remove(path.size() - 1);
            if (path.size() != depth) return unknown("Swift demangling tree nesting is incomplete.");
            ExpandedNode selected = new ExpandedNode(node.substring(5).split(",", 2)[0], new ArrayList<>());
            if (path.isEmpty()) {
                if (root != null) return unknown("Swift demangling has multiple roots.");
                root = selected;
            } else path.get(path.size() - 1).children.add(selected);
            path.add(selected);
        }
        if (demangled == null || demangled.equals(symbol) || root == null ||
            !root.kind.equals("Global") || root.children.size() != 1)
            return unknown("The original Swift symbol's native callable signature is unavailable.");
        ExpandedNode entity = root.children.get(0);
        while (entity.kind.equals("DispatchThunk") || entity.kind.equals("Static")) {
            if (entity.children.size() != 1) return unknown("The Swift callable wrapper is unsupported.");
            entity = entity.children.get(0);
        }
        if (!List.of("Function", "Allocator", "Constructor").contains(entity.kind))
            return unknown("The Swift symbol is outside the native function/initializer ABI profile.");
        // Read the declaration's own Type, never a function type in its
        // generic context, a callback, return type, or an ABI-changing thunk.
        ExpandedNode signature = uniqueTypeChild(entity);
        while (signature != null &&
               (signature.kind.equals("Type") || signature.kind.equals("DependentGenericType"))) {
            signature = signature.kind.equals("Type")
                ? (signature.children.size() == 1 ? signature.children.get(0) : null)
                : uniqueTypeChild(signature);
        }
        if (signature == null || !signature.kind.equals("FunctionType"))
            return unknown("The native Swift declaration's own function type is unavailable.");
        boolean throwing = signature.children.stream().anyMatch(n -> n.kind.equals("ThrowsAnnotation"));
        boolean async = signature.children.stream().anyMatch(n -> n.kind.equals("AsyncAnnotation"));
        String digest = HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(output.getBytes(StandardCharsets.UTF_8)));
        return new Proof(throwing && !async, demangled, digest, null);
    }

    private static ExpandedNode uniqueTypeChild(ExpandedNode node) {
        ExpandedNode result = null;
        for (ExpandedNode child : node.children) if (child.kind.equals("Type")) {
            if (result != null) return null;
            result = child;
        }
        return result;
    }

    private String throwingModel(PrototypeModel model, String name, Register register) throws Exception {
        XmlEncode encoded = new XmlEncode();
        model.encode(encoded, program.getCompilerSpec().getPcodeInjectLibrary());
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
        factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
        Document document = factory.newDocumentBuilder().parse(new ByteArrayInputStream(encoded.toString().getBytes(StandardCharsets.UTF_8)));
        Element root = document.getDocumentElement();
        root.setAttribute("name", name);
        // PrototypeModel.encode emits <returnaddress/> for an absent override,
        // while compiler-extension XML requires a register/varnode when present.
        NodeList returns = root.getElementsByTagName("returnaddress");
        if (returns.getLength() == 1 &&
            (model.getReturnAddress() == null || model.getReturnAddress().length == 0))
            root.removeChild(returns.item(0));
        Element unaffected = (Element) root.getElementsByTagName("unaffected").item(0);
        Element killed = (Element) root.getElementsByTagName("killedbycall").item(0);
        if (unaffected == null || killed == null) throw new IOException("The Swift prototype has no register effects");
        Node selected = null;
        for (Node child = unaffected.getFirstChild(); child != null; child = child.getNextSibling()) {
            if (!(child instanceof Element element)) continue;
            String offset = element.getAttribute("offset");
            long value = Long.parseUnsignedLong(offset.startsWith("0x") ? offset.substring(2) : offset, 16);
            if (element.getAttribute("space").equals(register.getAddress().getAddressSpace().getName()) &&
                value == register.getAddress().getOffset() && element.getAttribute("size").equals("8")) selected = child;
        }
        if (selected == null) throw new IOException("The Swift prototype's preserved x21 is not represented");
        unaffected.removeChild(selected);
        killed.appendChild(selected);
        TransformerFactory transformers = TransformerFactory.newInstance();
        transformers.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
        transformers.setAttribute(XMLConstants.ACCESS_EXTERNAL_STYLESHEET, "");
        Transformer transformer = transformers.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        StringWriter result = new StringWriter();
        transformer.transform(new DOMSource(document), new StreamResult(result));
        return result.toString();
    }

    private static String address(Address address) {
        return "0x" + Long.toUnsignedString(address.getOffset(), 16);
    }
}
