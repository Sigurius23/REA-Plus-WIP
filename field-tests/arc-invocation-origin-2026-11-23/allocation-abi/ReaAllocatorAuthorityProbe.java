//@category REA+ Verification
import com.google.gson.*;
import generic.jar.ResourceFile;
import ghidra.app.script.*;
import ghidra.app.decompiler.DecompInterface;
import ghidra.program.model.data.FunctionDefinitionDataType;
import ghidra.program.model.listing.*;
import ghidra.program.model.pcode.*;
import ghidra.program.model.symbol.*;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.file.*;
import java.util.*;

/** Production-boundary override checks unavailable through public annotation tools. */
public class ReaAllocatorAuthorityProbe extends GhidraScript {
    private Object invoke(Object object, String name, Class<?>[] types, Object... args) throws Exception {
        Method method = object.getClass().getDeclaredMethod(name, types);
        method.setAccessible(true);
        return method.invoke(object, args);
    }
    private void require(boolean condition, String detail) {
        if (!condition) throw new IllegalStateException(detail);
    }
    @Override public void run() throws Exception {
        String[] args = getScriptArgs();
        File directory = new File(args[0]).getCanonicalFile();
        String mode = args[2];
        Path out = Path.of(args[3]);
        Function owner = getFunctionAt(toAddr(args[1]));
        require(owner != null, "Owned caller absent");
        Instruction call = null; Function target = null;
        for (Instruction instruction : currentProgram.getListing().getInstructions(owner.getBody(), true)) {
            if (!instruction.getFlowType().isCall() || instruction.getFlows().length != 1) continue;
            Function candidate = getFunctionAt(instruction.getFlows()[0]);
            if (candidate != null && candidate.isThunk()) candidate = candidate.getThunkedFunction(true);
            if (candidate != null && candidate.isExternal() && candidate.getName().contains("swift_allocObject")) { call = instruction; target = candidate; break; }
        }
        require(call != null && target != null, "Owned allocator import absent");
        if (mode.equals("renamed-external")) {
            boolean found = false;
            for (Function candidateOwner : currentProgram.getFunctionManager().getFunctions(true)) {
                for (Instruction instruction : currentProgram.getListing().getInstructions(candidateOwner.getBody(), true)) {
                    if (!instruction.getFlowType().isCall() || instruction.getFlows().length != 1) continue;
                    Function candidate = getFunctionAt(instruction.getFlows()[0]);
                    if (candidate != null && candidate.isThunk()) candidate = candidate.getThunkedFunction(true);
                    if (candidate != null && candidate.isExternal() && candidate.getName().equals("_swift_retain")) {
                        target.setName("actual_allocator_display", SourceType.USER_DEFINED);
                        owner = candidateOwner;call = instruction;target = candidate;
                        target.setName("_swift_allocObject", SourceType.USER_DEFINED);
                        found = true;break;
                    }
                }
                if (found) break;
            }
            require(found,"A distinct imported retain call is required for the display-name control");
        }
        if (mode.equals("analyst-external")) {
            Function stub = getFunctionAt(call.getFlows()[0]);
            String libraryName = "/usr/lib/swift/libswiftCore.dylib";
            target.setName("loader_allocator_display", SourceType.USER_DEFINED);
            ExternalLocation created = currentProgram.getExternalManager().addExtFunction(libraryName,"_swift_allocObject",null,SourceType.USER_DEFINED);
            target = created.getFunction();
            stub.setThunkedFunction(target);
        }
        ExternalLocation external = target.getExternalLocation();
        String importedName = external.getOriginalImportedName(), library = external.getLibraryName();
        if (mode.equals("override")) {
            FunctionDefinitionDataType definition = new FunctionDefinitionDataType("explicit_allocator", currentProgram.getDataTypeManager());
            definition.setArguments(target.getSignature().getArguments());
            definition.setReturnType(target.getReturnType());
            definition.setCallingConvention(target.getCallingConventionName());
            HighFunctionDBUtil.writeOverride(owner, call.getAddress(), definition);
        } else if (mode.equals("user-signature")) target.setSignatureSource(SourceType.USER_DEFINED);
        else if (mode.equals("imported-signature")) target.setSignatureSource(SourceType.IMPORTED);
        String before = target.getPrototypeString(true, true);
        SourceType source = target.getSignatureSource();
        ResourceFile script = GhidraScriptUtil.findScriptByName("ReaGhidraBridge.java");
        require(script != null && new File(script.getAbsolutePath()).getCanonicalFile().equals(new File(directory, "ReaGhidraBridge.java")), "Unexpected bridge source");
        GhidraScript bridge = GhidraScriptUtil.getProvider(script).getScriptInstance(script, errorWriter);
        bridge.set(getState(), getControls());
        var field = bridge.getClass().getDeclaredField("sessionDefaultAddressSpace");field.setAccessible(true);field.set(null,currentProgram.getAddressFactory().getDefaultAddressSpace());
        invoke(bridge, "initializeDecompiler", new Class<?>[] {});
        try {
            JsonObject query = new JsonObject();query.addProperty("procedure","0x"+Long.toUnsignedString(owner.getEntryPoint().getOffset(),16));
            JsonObject dossier = (JsonObject)invoke(bridge,"analyzeFunction",new Class<?>[]{JsonObject.class},query);
            JsonArray signatures = dossier.getAsJsonObject("native_api").getAsJsonArray("runtime_call_signatures");
            String selectedCall = "0x"+Long.toUnsignedString(call.getAddress().getOffset(),16);
            long selectedSignatures = signatures.asList().stream().filter(row -> row.getAsJsonObject().get("call_address").getAsString().equals(selectedCall)).count();
            Files.writeString(out.resolve(mode+".dossier.json"),new GsonBuilder().setPrettyPrinting().create().toJson(dossier)+"\n");
            JsonObject identity = new JsonObject();identity.addProperty("selected_call",selectedCall);identity.addProperty("original_imported_name",importedName);identity.addProperty("label",external.getLabel());identity.addProperty("label_source",external.getSymbol().getSource().name());identity.addProperty("function_source",target.getSymbol().getSource().name());identity.addProperty("selected_signature_count",selectedSignatures);
            Files.writeString(out.resolve(mode+".identity.json"),new GsonBuilder().setPrettyPrinting().create().toJson(identity)+"\n");
            if (mode.equals("positive")) {
                require(selectedSignatures==1,"Exact import was not modeled");
                require(target.getReturn().getVariableStorage().toString().contains("x0"),"Wrong C return storage");
                require(target.getParameterCount()==3,"Wrong explicit C parameter count");
                require(target.getParameter(0).getVariableStorage().toString().contains("x0"),"Wrong metadata storage");
                require(target.getParameter(1).getVariableStorage().toString().contains("x1"),"Wrong size storage");
                require(target.getParameter(2).getVariableStorage().toString().contains("x2"),"Wrong alignment storage");
            } else {
                require(selectedSignatures==0,"Explicit override acquired automatic ABI proof");
                require(before.equals(target.getPrototypeString(true,true)),"Explicit prototype changed");
                require(source==target.getSignatureSource(),"Explicit signature authority changed");
                require(dossier.getAsJsonArray("limitations").toString().contains("preserved"),"Override limitation absent");
            }
            Files.writeString(out.resolve(mode+".dossier.json"),new GsonBuilder().setPrettyPrinting().create().toJson(dossier)+"\n");
            JsonObject receipt = new JsonObject();receipt.addProperty("status","passed");receipt.addProperty("mode",mode);receipt.addProperty("original_imported_name",importedName);receipt.addProperty("library",library);receipt.addProperty("import_label_source",external.getSymbol().getSource().name());receipt.addProperty("before_signature",before);receipt.addProperty("after_signature",target.getPrototypeString(true,true));receipt.addProperty("source_preserved",source==target.getSignatureSource());receipt.addProperty("target_executed",false);
            Files.writeString(out.resolve(mode+".probe.json"),new GsonBuilder().setPrettyPrinting().create().toJson(receipt)+"\n");
        } finally {
            field=bridge.getClass().getDeclaredField("decompiler");field.setAccessible(true);var decompiler=(DecompInterface)field.get(bridge);if(decompiler!=null)decompiler.dispose();
            field=bridge.getClass().getDeclaredField("swiftErrorCalls");field.setAccessible(true);var errors=(AutoCloseable)field.get(bridge);if(errors!=null)errors.close();
        }
    }
}
