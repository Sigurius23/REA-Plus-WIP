import ghidra.app.script.GhidraScript;
import ghidra.program.model.address.*;
import ghidra.program.model.listing.*;
import ghidra.program.model.mem.*;
import ghidra.program.model.reloc.*;
import ghidra.program.model.symbol.*;
import java.util.*;

public class ProbeBindingDebug extends GhidraScript {
    public void run() throws Exception {
        for (String library:currentProgram.getExternalManager().getExternalLibraryNames()) {
            ExternalLocationIterator locations=currentProgram.getExternalManager().getExternalLocations(library);
            while(locations.hasNext()) {
                ExternalLocation location=locations.next();
                if ((location.getLabel()+location.getOriginalImportedName()).contains("chkstk"))
                    println("PROBE external library="+library+" label="+location.getLabel()+" original="+location.getOriginalImportedName()+" source="+location.getSource()+" canonical="+location.getExternalSpaceAddress()+" location="+location.getAddress());
            }
        }
        Iterator<Relocation> relocations=currentProgram.getRelocationTable().getRelocations();
        while(relocations.hasNext()) {
            Relocation relocation=relocations.next();
            if (!"___chkstk_darwin".equals(relocation.getSymbolName())) continue;
            Address slot=relocation.getAddress();
            Address target=currentProgram.getAddressFactory().getDefaultAddressSpace().getAddress(currentProgram.getMemory().getLong(slot));
            MemoryBlock block=currentProgram.getMemory().getBlock(target);
            println("PROBE relocation="+slot+" status="+relocation.getStatus()+" type="+relocation.getType()+" length="+relocation.getLength()+" values="+Arrays.toString(relocation.getValues())+" slotblock="+currentProgram.getMemory().getBlock(slot).getName()+" target="+target+" targetblock="+(block==null?null:block.getName())+" flags="+(block==null?null:block.getFlags()));
            for (Reference ref:currentProgram.getReferenceManager().getReferencesFrom(slot)) println("PROBE ref="+ref+" source="+ref.getSource()+" type="+ref.getReferenceType()+" to="+ref.getToAddress());
            for (Symbol symbol:currentProgram.getSymbolTable().getSymbols(target)) println("PROBE symbol name="+symbol.getName()+" source="+symbol.getSource()+" type="+symbol.getSymbolType()+" namespace="+symbol.getParentNamespace());
            Function function=currentProgram.getFunctionManager().getFunctionAt(target);
            println("PROBE function="+function+" thunk="+(function==null?null:function.getThunkedFunction(true)));
        }
    }
}
