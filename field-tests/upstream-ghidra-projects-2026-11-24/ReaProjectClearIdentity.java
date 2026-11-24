import ghidra.app.script.GhidraScript;

/** Explicit malformed owned-project control, never a target execution. */
public final class ReaProjectClearIdentity extends GhidraScript {
    @Override public void run() throws Exception {
        currentProgram.setExecutableSHA256(null);
        String observed = currentProgram.getExecutableSHA256();
        if (observed != null && observed.matches("(?i)[0-9a-f]{64}"))
            throw new IllegalStateException("Owned identity removal did not persist");
        println("REA_PROJECT_IDENTITY_REMOVED " + observed);
    }
}
