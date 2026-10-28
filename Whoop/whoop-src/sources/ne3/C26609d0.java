package ne3;

import java.io.IOException;
import java.io.OutputStream;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C26609d0 implements InterfaceC26629n0 {

    /* JADX INFO: renamed from: w */
    public final OutputStream f105846w;

    /* JADX INFO: renamed from: x */
    public final C26637r0 f105847x;

    public C26609d0(OutputStream outputStream, C26637r0 c26637r0) {
        this.f105846w = outputStream;
        this.f105847x = c26637r0;
    }

    @Override // ne3.InterfaceC26629n0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f105846w.close();
    }

    @Override // ne3.InterfaceC26629n0, java.io.Flushable
    public final void flush() throws IOException {
        this.f105846w.flush();
    }

    @Override // ne3.InterfaceC26629n0
    public final C26637r0 timeout() {
        return this.f105847x;
    }

    public final String toString() {
        return "sink(" + this.f105846w + ')';
    }

    @Override // ne3.InterfaceC26629n0
    public final void write(C26616h source, long j7) throws IOException {
        AbstractC22676k.m65750j(source, "source");
        AbstractC26604b.m79160e(source.f105866x, 0L, j7);
        while (j7 > 0) {
            this.f105847x.mo79276f();
            C26623k0 c26623k0 = source.f105865w;
            AbstractC22676k.m65747g(c26623k0);
            int iMin = (int) Math.min(j7, c26623k0.f105876c - c26623k0.f105875b);
            this.f105846w.write(c26623k0.f105874a, c26623k0.f105875b, iMin);
            int i13 = c26623k0.f105875b + iMin;
            c26623k0.f105875b = i13;
            long j13 = iMin;
            j7 -= j13;
            source.f105866x -= j13;
            if (i13 == c26623k0.f105876c) {
                source.f105865w = c26623k0.m79243a();
                AbstractC26625l0.m79267a(c26623k0);
            }
        }
    }
}
