import ghidra.app.script.GhidraScript;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/** Controlled producer oracle; never fills a host volume or executes the input. */
public class ReaDiskClassificationProbe extends GhidraScript {
    public void run() throws Exception {
        var classifier = ReaGhidraBridge.class.getDeclaredMethod("isDiskExhaustion", Exception.class);
        classifier.setAccessible(true);
        IOException cycle = new IOException("ordinary failure");
        cycle.initCause(new Exception("wrapper", cycle));
        Exception[] values = {
            new IOException("No space left on device"),
            new FileNotFoundException("/owned/project (No space left on device)"),
            new FileSystemException("/owned/project", null, "No space left on device"),
            new Exception("wrapped", new IOException("No space left on device")),
            new IOException("Permission denied"),
            new IOException("quoted No space left on device"),
            new FileNotFoundException("/No space left on device (Permission denied)"),
            new FileSystemException("/No space left on device", null, "Permission denied"),
            new Exception("No space left on device"), cycle
        };
        JsonArray cases = new JsonArray();
        for (int i = 0; i < values.length; i++) {
            boolean expected = i < 4;
            boolean actual = (Boolean) classifier.invoke(null, values[i]);
            if (actual != expected) throw new AssertionError("Disk classification case " + i);
            JsonObject row = new JsonObject();
            row.addProperty("case", i); row.addProperty("class", values[i].getClass().getName());
            row.addProperty("expected", expected); row.addProperty("actual", actual); cases.add(row);
        }
        println("REA_DISK_CLASSIFICATION " + cases.toString());
    }
}
