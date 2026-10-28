package ne3;

import java.util.zip.CRC32;
import java.util.zip.Deflater;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C26641u implements InterfaceC26629n0 {

    /* JADX INFO: renamed from: E */
    public final CRC32 f105913E;

    /* JADX INFO: renamed from: w */
    public final C26617h0 f105914w;

    /* JADX INFO: renamed from: x */
    public final Deflater f105915x;

    /* JADX INFO: renamed from: y */
    public final C26626m f105916y;

    /* JADX INFO: renamed from: z */
    public boolean f105917z;

    public C26641u(InterfaceC26618i sink) {
        AbstractC22676k.m65750j(sink, "sink");
        C26617h0 c26617h0 = new C26617h0(sink);
        this.f105914w = c26617h0;
        Deflater deflater = new Deflater(-1, true);
        this.f105915x = deflater;
        this.f105916y = new C26626m(c26617h0, deflater);
        this.f105913E = new CRC32();
        C26616h c26616h = c26617h0.f105868x;
        c26616h.m79228r1(8075);
        c26616h.m79219m1(8);
        c26616h.m79219m1(0);
        c26616h.m79226p1(0);
        c26616h.m79219m1(0);
        c26616h.m79219m1(0);
    }

    @Override // ne3.InterfaceC26629n0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f105915x;
        C26617h0 c26617h0 = this.f105914w;
        if (this.f105917z) {
            return;
        }
        C26626m c26626m = this.f105916y;
        c26626m.f105890x.finish();
        c26626m.m79269b(false);
        c26617h0.mo79233v0((int) this.f105913E.getValue());
        c26617h0.mo79233v0((int) deflater.getBytesRead());
        th = null;
        try {
            deflater.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            c26617h0.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f105917z = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // ne3.InterfaceC26629n0, java.io.Flushable
    public final void flush() {
        this.f105916y.flush();
    }

    @Override // ne3.InterfaceC26629n0
    public final C26637r0 timeout() {
        return this.f105914w.f105867w.timeout();
    }

    @Override // ne3.InterfaceC26629n0
    public final void write(C26616h source, long j7) {
        AbstractC22676k.m65750j(source, "source");
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "byteCount < 0: ").toString());
        }
        if (j7 == 0) {
            return;
        }
        C26623k0 c26623k0 = source.f105865w;
        AbstractC22676k.m65747g(c26623k0);
        long j13 = j7;
        while (j13 > 0) {
            int iMin = (int) Math.min(j13, c26623k0.f105876c - c26623k0.f105875b);
            this.f105913E.update(c26623k0.f105874a, c26623k0.f105875b, iMin);
            j13 -= (long) iMin;
            c26623k0 = c26623k0.f105879f;
            AbstractC22676k.m65747g(c26623k0);
        }
        this.f105916y.write(source, j7);
    }
}
