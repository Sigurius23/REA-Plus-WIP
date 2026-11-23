import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import ghidra.program.database.SpecExtension;
import ghidra.program.model.address.Address;
import ghidra.program.model.data.PointerDataType;
import ghidra.program.model.data.UnsignedLongLongDataType;
import ghidra.program.model.lang.CompilerSpec;
import ghidra.program.model.lang.CompilerSpecID;
import ghidra.program.model.lang.PrototypeModel;
import ghidra.program.model.listing.*;
import ghidra.program.model.pcode.HighFunction;
import ghidra.program.model.pcode.XmlEncode;
import ghidra.program.model.symbol.*;
import ghidra.util.task.TaskMonitor;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

/** Exact imported runtime signatures. This supplies no memory-effect summary. */
final class ReaGhidraRuntimeCalls {
    private static final String MODEL = "__rea_apple_cdecl";
    private final Program program;
    private final TaskMonitor monitor;
    private final Map<Address, Adjustment> adjustments = new HashMap<>();
    private final Map<Address, List<String>> unknowns = new HashMap<>();
    private boolean supported;
    private String setupFailure;
    private record Adjustment(String symbol, String library, String original, String effective) {}

    ReaGhidraRuntimeCalls(Program program, TaskMonitor monitor) {
        this.program = program;
        this.monitor = monitor;
    }

    void initialize() throws Exception {
        supported = !System.getProperty("os.name", "").startsWith("Windows") &&
            program.getExecutableFormat().contains("Mach-O") &&
            program.getLanguageID().getIdAsString().equals("AARCH64:LE:64:AppleSilicon") &&
            program.getDefaultPointerSize() == 8 &&
            program.getCompilerSpec().getCompilerSpecID().getIdAsString().equals("swift");
        if (!supported) return;
        int transaction = program.startTransaction("REA+ Apple C runtime calling model");
        boolean commit = false;
        try {
            CompilerSpec cSpec = program.getLanguage().getCompilerSpecByID(new CompilerSpecID("default"));
            PrototypeModel cModel = cSpec.getDefaultCallingConvention();
            if (!cModel.getName().equals("__cdecl")) throw new IOException("The Apple C model is unavailable");
            XmlEncode encoded = new XmlEncode();
            cModel.encode(encoded, cSpec.getPcodeInjectLibrary());
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
            factory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
            Document document = factory.newDocumentBuilder().parse(new ByteArrayInputStream(encoded.toString().getBytes(StandardCharsets.UTF_8)));
            Element root = document.getDocumentElement();
            root.setAttribute("name", MODEL);
            NodeList returns = root.getElementsByTagName("returnaddress");
            if (returns.getLength() == 1 && (cModel.getReturnAddress() == null || cModel.getReturnAddress().length == 0)) root.removeChild(returns.item(0));
            TransformerFactory transformers = TransformerFactory.newInstance();
            transformers.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
            transformers.setAttribute(XMLConstants.ACCESS_EXTERNAL_STYLESHEET, "");
            Transformer transformer = transformers.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            StringWriter xml = new StringWriter();
            transformer.transform(new DOMSource(document), new StreamResult(xml));
            new SpecExtension(program).addReplaceCompilerSpecExtension(xml.toString(), monitor);
            if (program.getCompilerSpec().getCallingConvention(MODEL) == null) throw new IOException("The private Apple C model was rejected");
            commit = true;
        } catch (Exception failure) {
            monitor.checkCancelled();
            setupFailure = "The private Apple C runtime model is unavailable: " + failure.getClass().getSimpleName();
        } finally { program.endTransaction(transaction, commit); }
    }

    boolean prepare(Function owner) throws Exception {
        if (!supported || owner.isExternal() || owner.isThunk()) return false;
        List<String> unknown = new ArrayList<>();
        unknowns.put(owner.getEntryPoint(), unknown);
        boolean changed = false;
        for (Instruction call : program.getListing().getInstructions(owner.getBody(), true)) {
            monitor.checkCancelled();
            if (!call.getFlowType().isCall()) continue;
            Function target = target(call);
            if (target == null || !target.isExternal()) continue;
            ExternalLocation external = target.getExternalLocation();
            String symbol = external == null ? null : external.getOriginalImportedName();
            if (symbol == null) symbol = target.getName();
            if (!symbol.equals("_swift_allocObject") && !symbol.equals("swift_allocObject")) continue;
            if (overridden(owner, call.getAddress()) || target.getSignatureSource() == SourceType.USER_DEFINED || target.getSignatureSource() == SourceType.IMPORTED) {
                unknown.add("An explicit signature/call-site override for the allocator is preserved; its runtime ABI was not changed.");
                continue;
            }
            String library = external == null ? null : external.getLibraryName();
            if (!Set.of("libswiftCore.dylib", "libswiftCore", "/usr/lib/swift/libswiftCore.dylib").contains(library == null ? "" : library)) {
                unknown.add("The allocator name is not bound to the supported libswiftCore import; no runtime signature was applied.");
                continue;
            }
            if (setupFailure != null) { unknown.add(setupFailure); continue; }
            Adjustment existing = adjustments.get(target.getEntryPoint());
            if (existing != null && target.getCallingConventionName().equals(MODEL) && target.getSignature().getPrototypeString().equals(existing.effective)) continue;
            String original = target.getSignature().getPrototypeString();
            int transaction = program.startTransaction("REA+ exact libswiftCore allocator C signature");
            boolean commit = false;
            try {
                var manager = program.getDataTypeManager();
                var pointer = new PointerDataType(manager);
                var size = UnsignedLongLongDataType.dataType;
                target.updateFunction(MODEL, new ReturnParameterImpl(pointer, program),
                    List.of(new ParameterImpl("metadata", pointer, program), new ParameterImpl("requiredSize", size, program), new ParameterImpl("requiredAlignmentMask", size, program)),
                    Function.FunctionUpdateType.DYNAMIC_STORAGE_ALL_PARAMS, true, SourceType.ANALYSIS);
                commit = true;
            } finally { program.endTransaction(transaction, commit); }
            adjustments.put(target.getEntryPoint(), new Adjustment(symbol, library, original, target.getSignature().getPrototypeString()));
            changed = true;
        }
        return changed;
    }

    JsonArray observations(Function owner) {
        JsonArray result = new JsonArray();
        if (!supported) return result;
        for (Instruction call : program.getListing().getInstructions(owner.getBody(), true)) {
            if (!call.getFlowType().isCall() || overridden(owner, call.getAddress())) continue;
            Function target = target(call);
            Adjustment adjustment = target == null ? null : adjustments.get(target.getEntryPoint());
            if (adjustment == null || target.getSignatureSource() != SourceType.ANALYSIS || !Objects.equals(target.getCallingConventionName(), MODEL) || !target.getSignature().getPrototypeString().equals(adjustment.effective)) continue;
            JsonObject row = new JsonObject();
            row.addProperty("call_address", ReaGhidraBridge.canonicalAddress(call.getAddress()));
            row.addProperty("callee_address", ReaGhidraBridge.canonicalAddress(target.getEntryPoint()));
            row.addProperty("original_symbol", adjustment.symbol);
            row.addProperty("library", adjustment.library);
            row.addProperty("original_signature", adjustment.original);
            row.addProperty("effective_signature", adjustment.effective);
            row.addProperty("effective_calling_convention", MODEL);
            row.addProperty("contract", "swift-alloc-object-c-abi-v1");
            row.addProperty("return_register", "x0");
            JsonArray parameters = new JsonArray();
            for (String register : List.of("x0", "x1", "x2")) parameters.add(register);
            row.add("parameter_registers", parameters);
            row.addProperty("memory_effects", "unknown");
            row.addProperty("provenance", "external-library-runtime-contract");
            result.add(row);
        }
        return result;
    }

    List<String> limitations(Function owner) {
        List<String> result = new ArrayList<>(unknowns.getOrDefault(owner.getEntryPoint(), List.of()));
        if (observations(owner).size() > 0) result.add("The exact libswiftCore swift_allocObject import uses its declared normal C ABI (metadata/size/alignment in x0/x1/x2, pointer result in x0). This is a runtime contract assumption, not dynamic library authenticity, pure memory effects, noescape, allocation success, or closed constructor/dependency provenance. Explicit signatures and call-site overrides are preserved.");
        return result;
    }

    private Function target(Instruction call) {
        Address[] flows = call.getFlows();
        if (flows.length != 1) return null;
        Function function = program.getFunctionManager().getFunctionAt(flows[0]);
        if (function != null && function.isThunk()) function = function.getThunkedFunction(true);
        return function;
    }

    private boolean overridden(Function owner, Address address) {
        Namespace overrides = HighFunction.findOverrideSpace(owner);
        if (overrides == null) return false;
        SymbolIterator symbols = program.getSymbolTable().getSymbols(overrides);
        while (symbols.hasNext()) {
            Symbol symbol = symbols.next();
            if (symbol.getAddress().equals(address) && symbol.getName().startsWith("prt")) return true;
        }
        return false;
    }

}
