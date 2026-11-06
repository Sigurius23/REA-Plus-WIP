//@category REA+ Verification
import com.google.gson.*;
import generic.jar.ResourceFile;
import ghidra.app.script.*;
import ghidra.app.decompiler.*;
import ghidra.program.model.address.Address;
import ghidra.program.model.data.FunctionDefinitionDataType;
import ghidra.program.model.listing.*;
import ghidra.program.model.pcode.*;
import ghidra.program.model.symbol.SourceType;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.file.*;
import java.util.*;

/** Real compiler/decompiler checks, without executing the owned dylib. */
public class ReaSwiftErrorProbe extends GhidraScript {
    private final JsonArray checks = new JsonArray();
    private void require(String name, boolean value) {
        if (!value) throw new IllegalStateException("Swift error-register assertion failed: " + name);
        checks.add(name);
    }
    private String signature(Function function) {
        StringBuilder result = new StringBuilder(function.getReturnType().getPathName())
            .append('|').append(function.getReturn().getVariableStorage())
            .append('|').append(function.getSignatureSource()).append('|').append(function.hasCustomVariableStorage());
        for (Parameter parameter : function.getParameters()) result.append('|').append(parameter.getDataType().getPathName())
            .append(':').append(parameter.getVariableStorage()).append(':').append(parameter.getSource());
        return result.toString();
    }
    private GhidraScript bridge(File directory) throws Exception {
        ResourceFile source = GhidraScriptUtil.findScriptByName("ReaGhidraBridge.java");
        if (source == null || !new File(source.getAbsolutePath()).getCanonicalFile().equals(new File(directory, "ReaGhidraBridge.java")))
            throw new IllegalStateException("Unexpected Ghidra bridge source");
        GhidraScript bridge = GhidraScriptUtil.getProvider(source).getScriptInstance(source, errorWriter);
        bridge.set(getState(), getControls());
        return bridge;
    }
    private Object invoke(Object object, String name, Class<?>[] types, Object... arguments) throws Exception {
        Method method = object.getClass().getDeclaredMethod(name, types);
        method.setAccessible(true);
        return method.invoke(object, arguments);
    }
    private void verifyCleanup(GhidraScript bridge, Path output) throws Exception {
        Function owner = null;
        for (Function function : currentProgram.getFunctionManager().getFunctions(true))
            if (function.getName(true).contains("ownedDecodeWithCleanup")) { owner = function; break; }
        if (owner == null) throw new IllegalStateException("Owned cleanup function absent");
        Instruction decode = null;
        for (Instruction instruction : currentProgram.getListing().getInstructions(owner.getBody(), true)) {
            Address[] targets = instruction.getFlows();
            if (!instruction.getFlowType().isCall() || targets.length != 1) continue;
            Function callee = getFunctionAt(targets[0]);
            if (callee != null && callee.isThunk()) callee = callee.getThunkedFunction(true);
            if (callee != null && callee.getExternalLocation() != null &&
                Objects.requireNonNullElse(callee.getExternalLocation().getOriginalImportedName(), "").contains("JSONDecoderC6decode_4from")) {
                decode = instruction; break;
            }
        }
        if (decode == null) throw new IllegalStateException("Owned JSONDecoder call absent");
        Instruction guard = decode;
        boolean cleanupCall = false;
        while ((guard = currentProgram.getListing().getInstructionAfter(guard.getAddress())) != null && owner.getBody().contains(guard.getAddress())) {
            if ((guard.getMnemonicString().equalsIgnoreCase("CBZ") || guard.getMnemonicString().equalsIgnoreCase("CBNZ")) &&
                guard.getDefaultOperandRepresentation(0).equals("x21")) break;
            if (guard.getFlowType().isCall()) cleanupCall = true;
        }
        require("cleanup_call_precedes_error_guard", guard != null && cleanupCall);
        DecompInterface before = new DecompInterface();
        before.openProgram(currentProgram);
        boolean baselineBranch = false;
        try {
            DecompileResults result = before.decompileFunction(owner, 60, monitor);
            for (var operations = result.getHighFunction().getPcodeOps(guard.getAddress()); operations.hasNext();)
                if (operations.next().getOpcode() == PcodeOp.CBRANCH) baselineBranch = true;
        } finally { before.dispose(); }
        require("cleanup_baseline_reproduces_missing_guard", !baselineBranch);
        JsonObject query = new JsonObject();
        query.addProperty("procedure", "0x" + Long.toUnsignedString(owner.getEntryPoint().getOffset(), 16));
        JsonObject dossier = (JsonObject) invoke(bridge, "analyzeFunction", new Class<?>[] {JsonObject.class}, query);
        boolean retained = false;
        String guardAddress = "0x" + Long.toUnsignedString(guard.getAddress().getOffset(), 16);
        for (JsonElement value : dossier.getAsJsonObject("native_value_flow").getAsJsonArray("operations")) {
            JsonObject operation = value.getAsJsonObject();
            if (operation.get("opcode").getAsString().equals("CBRANCH") && operation.get("address").getAsString().equals(guardAddress)) retained = true;
        }
        require("cleanup_error_guard_restored", retained);
        require("cleanup_throws_proof", dossier.getAsJsonObject("native_api").getAsJsonArray("call_model_adjustments").asList().stream().anyMatch(value ->
            value.getAsJsonObject().get("original_symbol").getAsString().contains("JSONDecoderC6decode_4from")));
        Files.writeString(output.resolve("cleanup.dossier.json"), new GsonBuilder().setPrettyPrinting().create().toJson(dossier));
    }
    @Override public void run() throws Exception {
        String[] args = getScriptArgs();
        if (args.length != 4) throw new IllegalArgumentException("Expected bridge directory, witness address, control mode, output directory");
        File directory = new File(args[0]).getCanonicalFile();
        Path output = Path.of(args[3]);
        Function witness = getFunctionAt(toAddr(args[1]));
        if (witness == null) throw new IllegalStateException("Owned witness absent");
        Instruction decode = null;
        Function target = null;
        for (Instruction instruction : currentProgram.getListing().getInstructions(witness.getBody(), true)) {
            Address[] targets = instruction.getFlows();
            if (!instruction.getFlowType().isCall() || targets.length != 1) continue;
            Function function = getFunctionAt(targets[0]);
            if (function != null && function.isThunk()) function = function.getThunkedFunction(true);
            if (function != null && function.getExternalLocation() != null &&
                Objects.requireNonNullElse(function.getExternalLocation().getOriginalImportedName(), "").contains("6decode_6forKey")) {
                decode = instruction; target = function; break;
            }
        }
        if (decode == null || target == null) throw new IllegalStateException("Owned String decode call absent");
        Instruction guard = decode;
        while ((guard = currentProgram.getListing().getInstructionAfter(guard.getAddress())) != null &&
               !guard.getMnemonicString().equalsIgnoreCase("CBZ")) {}
        if (guard == null) throw new IllegalStateException("Owned x21 guard absent");
        String originalConvention = target.getCallingConventionName();
        String originalSignature = signature(target);
        DecompInterface baseline = new DecompInterface();
        baseline.openProgram(currentProgram);
        DecompileResults before = baseline.decompileFunction(witness, 60, monitor);
        String beforeText = before.getDecompiledFunction().getC();
        boolean beforeBranch = false;
        for (var iterator = before.getHighFunction().getPcodeOps(guard.getAddress()); iterator.hasNext();)
            if (iterator.next().getOpcode() == PcodeOp.CBRANCH) beforeBranch = true;
        baseline.dispose();
        require("owned_machine_guard", guard.getDefaultOperandRepresentation(0).equals("x21"));
        require("baseline_reproduces_missing_guard", !beforeBranch);
        if (args[2].equals("override")) {
            FunctionDefinitionDataType definition = new FunctionDefinitionDataType("owned_explicit", currentProgram.getDataTypeManager());
            definition.setArguments(target.getSignature().getArguments());
            definition.setReturnType(target.getReturnType());
            definition.setCallingConvention(originalConvention);
            HighFunctionDBUtil.writeOverride(witness, decode.getAddress(), definition);
        } else if (args[2].equals("user-signature")) {
            target.setSignatureSource(SourceType.USER_DEFINED);
            originalSignature = signature(target);
        }
        GhidraScript bridge = bridge(directory);
        var addressSpaceField = bridge.getClass().getDeclaredField("sessionDefaultAddressSpace");
        addressSpaceField.setAccessible(true);
        addressSpaceField.set(null, currentProgram.getAddressFactory().getDefaultAddressSpace());
        invoke(bridge, "initializeDecompiler", new Class<?>[] {});
        JsonObject query = new JsonObject();
        query.addProperty("procedure", "0x" + Long.toUnsignedString(witness.getEntryPoint().getOffset(), 16));
        JsonObject result;
        try {
            result = (JsonObject) invoke(bridge, "analyzeFunction", new Class<?>[] { JsonObject.class }, query);
            Files.writeString(output.resolve(args[2] + ".dossier.json"), new GsonBuilder().setPrettyPrinting().create().toJson(result));
            JsonArray adjustments = result.getAsJsonObject("native_api").getAsJsonArray("call_model_adjustments");
            JsonArray unknowns = result.getAsJsonObject("native_value_flow").getAsJsonArray("control_flow_uncertainties");
            String guardAddress = "0x" + Long.toUnsignedString(guard.getAddress().getOffset(), 16);
            boolean afterBranch = false;
            for (JsonElement item : result.getAsJsonObject("native_value_flow").getAsJsonArray("operations")) {
                JsonObject operation = item.getAsJsonObject();
                if (operation.get("address").getAsString().equals(guardAddress) &&
                    operation.get("opcode").getAsString().equals("CBRANCH")) afterBranch = true;
            }
            if (args[2].equals("positive")) {
                require("guard_restored_in_high_pcode", afterBranch);
                require("error_cleanup_not_unreachable", !result.get("pseudocode").getAsString().contains("Removing unreachable block"));
                require("structured_model_proof", adjustments.asList().stream().anyMatch(item ->
                    item.getAsJsonObject().get("original_symbol").getAsString().contains("6decode_6forKey")));
                require("error_register_output", result.get("pseudocode").getAsString().contains("extraout_x21"));
                verifyCleanup(bridge, output);
            } else {
                require("explicit_model_preserved", target.getCallingConventionName().equals(originalConvention));
                require("uncertainty_not_hidden", unknowns.asList().stream().anyMatch(item ->
                    item.getAsJsonObject().get("address").getAsString().equals(guardAddress)));
            }
            require("parameter_return_storage_and_source_preserved", originalSignature.equals(signature(target)));
            require("source_digest_available", currentProgram.getExecutableSHA256() != null);
            // Actual expanded trees from owned Swift symbols, saved by the verifier.
            var field = bridge.getClass().getDeclaredField("swiftErrorCalls"); field.setAccessible(true);
            Object helper = field.get(bridge);
            for (String name : List.of("nonthrowing", "callback", "context", "async")) {
                String text = Files.readString(output.resolve(name + ".expanded.txt"));
                Method classify = helper.getClass().getDeclaredMethod("classify", String.class, String.class);
                classify.setAccessible(true);
                String symbol = text.lines().findFirst().orElseThrow().substring("Demangling for ".length());
                Object proof = classify.invoke(null, text, symbol);
                Method throwing = proof.getClass().getDeclaredMethod("throwing"); throwing.setAccessible(true);
                require(name + "_not_synchronous_throwing", Boolean.FALSE.equals(throwing.invoke(proof)));
                Method reason = proof.getClass().getDeclaredMethod("reason"); reason.setAccessible(true);
                require(name + "_tree_classified", reason.invoke(proof) == null);
            }
            Files.writeString(output.resolve(args[2] + ".before.c"), beforeText);
            JsonObject report = new JsonObject(); report.addProperty("status", "passed"); report.add("checks", checks);
            Files.writeString(output.resolve(args[2] + ".probe.json"), report.toString());
            println("REA_SWIFT_ERROR_PROBE_JSON " + report);
        } finally {
            var field = bridge.getClass().getDeclaredField("decompiler"); field.setAccessible(true);
            DecompInterface decompiler = (DecompInterface) field.get(bridge);
            if (decompiler != null) decompiler.dispose();
            field = bridge.getClass().getDeclaredField("swiftErrorCalls"); field.setAccessible(true);
            Object helper = field.get(bridge);
            if (helper != null) ((AutoCloseable) helper).close();
        }
    }
}
