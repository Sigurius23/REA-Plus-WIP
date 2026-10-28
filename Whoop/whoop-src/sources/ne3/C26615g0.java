package ne3;

import java.io.IOException;
import java.io.OutputStream;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26615g0 extends OutputStream {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C26617h0 f105864w;

    public C26615g0(C26617h0 c26617h0) {
        this.f105864w = c26617h0;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f105864w.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        C26617h0 c26617h0 = this.f105864w;
        if (c26617h0.f105869y) {
            return;
        }
        c26617h0.flush();
    }

    public final String toString() {
        return this.f105864w + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i13) throws IOException {
        C26617h0 c26617h0 = this.f105864w;
        if (c26617h0.f105869y) {
            throw new IOException("closed");
        }
        c26617h0.f105868x.m79219m1((byte) i13);
        c26617h0.m79237b();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i13, int i14) throws IOException {
        AbstractC22676k.m65750j(data, "data");
        C26617h0 c26617h0 = this.f105864w;
        if (!c26617h0.f105869y) {
            c26617h0.f105868x.m134463write(data, i13, i14);
            c26617h0.m79237b();
            return;
        }
        throw new IOException("closed");
    }
}
