package ne3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25269w;
import p333n4.C26250f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.a0 */
/* JADX INFO: loaded from: classes5.dex */
public class C26603a0 extends AbstractC26632p {
    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: J */
    public final List mo79147J(C26611e0 c26611e0) throws IOException {
        File file = c26611e0.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                throw new IOException("failed to list " + c26611e0);
            }
            throw new FileNotFoundException("no such file: " + c26611e0);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            AbstractC22676k.m65747g(str);
            arrayList.add(c26611e0.m79176e(str));
        }
        AbstractC25269w.m74165k0(arrayList);
        return arrayList;
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: a0 */
    public C26250f mo79148a0(C26611e0 path) {
        AbstractC22676k.m65750j(path, "path");
        File file = path.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new C26250f(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: b */
    public final InterfaceC26629n0 mo79149b(C26611e0 file) {
        AbstractC22676k.m65750j(file, "file");
        return AbstractC26604b.m79164i(new FileOutputStream(file.toFile(), true));
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: b0 */
    public final C26646z mo79150b0(C26611e0 file) {
        AbstractC22676k.m65750j(file, "file");
        return new C26646z(false, new RandomAccessFile(file.toFile(), "r"));
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: h */
    public void mo79151h(C26611e0 source, C26611e0 target) throws IOException {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: k */
    public final void mo79152k(C26611e0 dir) throws IOException {
        AbstractC22676k.m65750j(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        C26250f c26250fMo79148a0 = mo79148a0(dir);
        if (c26250fMo79148a0 == null || !c26250fMo79148a0.f104373c) {
            throw new IOException("failed to create directory: " + dir);
        }
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: m */
    public final void mo79153m(C26611e0 path) throws IOException {
        AbstractC22676k.m65750j(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + path);
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: o0 */
    public final C26646z mo79154o0(C26611e0 file) {
        AbstractC22676k.m65750j(file, "file");
        return new C26646z(true, new RandomAccessFile(file.toFile(), "rw"));
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: p0 */
    public final InterfaceC26629n0 mo37080p0(C26611e0 file, boolean z4) throws IOException {
        AbstractC22676k.m65750j(file, "file");
        if (!z4 || !m79274x(file)) {
            return AbstractC26604b.m79164i(new FileOutputStream(file.toFile(), false));
        }
        throw new IOException(file + " already exists.");
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // ne3.AbstractC26632p
    /* JADX INFO: renamed from: x0 */
    public final InterfaceC26633p0 mo79155x0(C26611e0 file) {
        AbstractC22676k.m65750j(file, "file");
        return new C26645y(new FileInputStream(file.toFile()), C26637r0.f105903d);
    }
}
