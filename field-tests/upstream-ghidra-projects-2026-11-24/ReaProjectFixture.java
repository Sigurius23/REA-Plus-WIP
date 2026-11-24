import ghidra.app.script.GhidraScript;
import ghidra.program.model.listing.Function;
import ghidra.program.model.listing.Program;
import ghidra.program.model.symbol.SourceType;

/** Qualify the source-built saved project; never execute the fixture Program. */
public final class ReaProjectFixture extends GhidraScript {
    @Override public void run() throws Exception {
        Function function = getFunctionAt(toAddr(getScriptArgs()[0]));
        if (function == null)
            throw new IllegalStateException("Owned seed function missing from saved project");
        function.setName("rea_saved_project_annotation", SourceType.USER_DEFINED);
        if (currentProgram.getOptions(Program.PROGRAM_INFO).getString("REA+ analysis seeds", null) == null)
            throw new IllegalStateException("Owned project has no historical seed report");
        println("REA_PROJECT_FIXTURE_READY " + currentProgram.getExecutableSHA256());
    }
}
