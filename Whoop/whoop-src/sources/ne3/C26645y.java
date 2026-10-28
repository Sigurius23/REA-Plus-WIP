package ne3;

import java.io.IOException;
import java.io.InputStream;
import oe3.AbstractC27891k;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C26645y implements InterfaceC26633p0 {

    /* JADX INFO: renamed from: w */
    public final InputStream f105928w;

    /* JADX INFO: renamed from: x */
    public final C26637r0 f105929x;

    public C26645y(InputStream input, C26637r0 c26637r0) {
        AbstractC22676k.m65750j(input, "input");
        this.f105928w = input;
        this.f105929x = c26637r0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f105928w.close();
    }

    @Override // ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h sink, long j7) throws IOException {
        AbstractC22676k.m65750j(sink, "sink");
        if (j7 == 0) {
            return 0L;
        }
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "byteCount < 0: ").toString());
        }
        try {
            this.f105929x.mo79276f();
            C26623k0 c26623k0M79216k1 = sink.m79216k1(1);
            int i13 = this.f105928w.read(c26623k0M79216k1.f105874a, c26623k0M79216k1.f105876c, (int) Math.min(j7, 8192 - c26623k0M79216k1.f105876c));
            if (i13 != -1) {
                c26623k0M79216k1.f105876c += i13;
                long j13 = i13;
                sink.f105866x += j13;
                return j13;
            }
            if (c26623k0M79216k1.f105875b != c26623k0M79216k1.f105876c) {
                return -1L;
            }
            sink.f105865w = c26623k0M79216k1.m79243a();
            AbstractC26625l0.m79267a(c26623k0M79216k1);
            return -1L;
        } catch (AssertionError e5) {
            if (AbstractC27891k.m84162b(e5)) {
                throw new IOException(e5);
            }
            throw e5;
        }
    }

    @Override // ne3.InterfaceC26633p0
    public final C26637r0 timeout() {
        return this.f105929x;
    }

    public final String toString() {
        return "source(" + this.f105928w + ')';
    }
}
