package ne3;

import java.io.IOException;
import java.util.zip.Deflater;
import oe3.AbstractC27882b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C26626m implements InterfaceC26629n0 {

    /* JADX INFO: renamed from: w */
    public final C26617h0 f105889w;

    /* JADX INFO: renamed from: x */
    public final Deflater f105890x;

    /* JADX INFO: renamed from: y */
    public boolean f105891y;

    public C26626m(C26617h0 c26617h0, Deflater deflater) {
        this.f105889w = c26617h0;
        this.f105890x = deflater;
    }

    /* JADX INFO: renamed from: b */
    public final void m79269b(boolean z4) throws IOException {
        C26623k0 c26623k0M79216k1;
        int iDeflate;
        C26617h0 c26617h0 = this.f105889w;
        C26616h c26616h = c26617h0.f105868x;
        while (true) {
            c26623k0M79216k1 = c26616h.m79216k1(1);
            byte[] bArr = c26623k0M79216k1.f105874a;
            Deflater deflater = this.f105890x;
            if (z4) {
                try {
                    int i13 = c26623k0M79216k1.f105876c;
                    iDeflate = deflater.deflate(bArr, i13, 8192 - i13, 2);
                } catch (NullPointerException e5) {
                    throw new IOException("Deflater already closed", e5);
                }
            } else {
                int i14 = c26623k0M79216k1.f105876c;
                iDeflate = deflater.deflate(bArr, i14, 8192 - i14);
            }
            if (iDeflate > 0) {
                c26623k0M79216k1.f105876c += iDeflate;
                c26616h.f105866x += (long) iDeflate;
                c26617h0.m79237b();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (c26623k0M79216k1.f105875b == c26623k0M79216k1.f105876c) {
            c26616h.f105865w = c26623k0M79216k1.m79243a();
            AbstractC26625l0.m79267a(c26623k0M79216k1);
        }
    }

    @Override // ne3.InterfaceC26629n0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f105890x;
        if (this.f105891y) {
            return;
        }
        deflater.finish();
        m79269b(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f105889w.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f105891y = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // ne3.InterfaceC26629n0, java.io.Flushable
    public final void flush() {
        m79269b(true);
        this.f105889w.flush();
    }

    @Override // ne3.InterfaceC26629n0
    public final C26637r0 timeout() {
        return this.f105889w.f105867w.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f105889w + ')';
    }

    @Override // ne3.InterfaceC26629n0
    public final void write(C26616h source, long j7) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC26604b.m79160e(source.f105866x, 0L, j7);
        while (true) {
            Deflater deflater = this.f105890x;
            if (j7 <= 0) {
                deflater.setInput(AbstractC27882b.f112428b, 0, 0);
                return;
            }
            C26623k0 c26623k0 = source.f105865w;
            AbstractC22676k.m65747g(c26623k0);
            int iMin = (int) Math.min(j7, c26623k0.f105876c - c26623k0.f105875b);
            deflater.setInput(c26623k0.f105874a, c26623k0.f105875b, iMin);
            m79269b(false);
            long j13 = iMin;
            source.f105866x -= j13;
            int i13 = c26623k0.f105875b + iMin;
            c26623k0.f105875b = i13;
            if (i13 == c26623k0.f105876c) {
                source.f105865w = c26623k0.m79243a();
                AbstractC26625l0.m79267a(c26623k0);
            }
            j7 -= j13;
        }
    }
}
