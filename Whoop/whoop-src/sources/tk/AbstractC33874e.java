package tk;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: tk.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC33874e {

    /* JADX INFO: renamed from: a */
    public static final Charset f141891a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    /* JADX INFO: renamed from: a */
    public static void m107123a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m107123a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
