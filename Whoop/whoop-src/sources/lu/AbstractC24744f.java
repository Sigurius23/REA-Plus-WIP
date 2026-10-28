package lu;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: lu.f */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC24744f {

    /* JADX INFO: renamed from: a */
    public static final Charset f96763a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b */
    public static final Charset f96764b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static void m72450a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e5) {
                throw e5;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m72451b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m72451b(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
