import ghidra.app.script.GhidraScript;
import ghidra.program.model.address.Address;
import ghidra.program.model.mem.Memory;
import java.io.ByteArrayInputStream;
import ghidra.program.model.address.AddressSpace;

/** Create owned test memory in a disposable project; the input file is unchanged. */
public class ReaByteSearchFixture extends GhidraScript {
    @Override
    public void run() throws Exception {
        Memory memory = currentProgram.getMemory();
        Address base = toAddr("60000000");
        int transaction = currentProgram.startTransaction("REA search-boundary fixture");
        try {
            memory.createInitializedBlock("cross_first", base,
                new ByteArrayInputStream(new byte[] {(byte) 0xde, (byte) 0xad}), 2, monitor, false);
            memory.createInitializedBlock("cross_second", base.add(2),
                new ByteArrayInputStream(new byte[] {0x11, 0x22}), 2, monitor, false);
            memory.createInitializedBlock("cross_third", base.add(4),
                new ByteArrayInputStream(new byte[] {(byte) 0xbe, (byte) 0xef}), 2, monitor, false);
            Address gap = base.add(0x100);
            memory.createInitializedBlock("gap_first", gap,
                new ByteArrayInputStream(new byte[] {(byte) 0xde, (byte) 0xad}), 2, monitor, false);
            memory.createUninitializedBlock("gap_middle", gap.add(2), 2, false);
            memory.createInitializedBlock("gap_second", gap.add(4),
                new ByteArrayInputStream(new byte[] {(byte) 0xbe, (byte) 0xef}), 2, monitor, false);
            memory.createInitializedBlock("overlay_test", base,
                new ByteArrayInputStream(new byte[] {(byte) 0xde, (byte) 0xad, 0x11, 0x22, (byte) 0xbe, (byte) 0xef}), 6, monitor, true);
            memory.createInitializedBlock("overlapping", base.add(0x300),
                new ByteArrayInputStream(new byte[] {(byte) 0xa1,(byte) 0xa1,(byte) 0xa1,(byte) 0xa1,(byte) 0xa1}), 5, monitor, false);
            memory.createInitializedBlock("not_loaded", AddressSpace.OTHER_SPACE.getAddress(0x60000400L),
                new ByteArrayInputStream(new byte[] {(byte) 0xde,(byte) 0xad,0x11,0x22,(byte) 0xbe,(byte) 0xef}), 6, monitor, false);
            var auxiliary = memory.createFileBytes("auxiliary-six-bytes", 0, 6,
                new ByteArrayInputStream(new byte[] {(byte) 0xde,(byte) 0xad,0x11,0x22,(byte) 0xbe,(byte) 0xef}), monitor);
            memory.createInitializedBlock("auxiliary_source", base.add(0x500), auxiliary, 0, 6, false);
            currentProgram.endTransaction(transaction, true);
            println("REA_BYTE_SEARCH_FIXTURE_READY " + currentProgram.getExecutableSHA256());
        } catch (Exception failure) {
            currentProgram.endTransaction(transaction, false);
            throw failure;
        }
    }
}
