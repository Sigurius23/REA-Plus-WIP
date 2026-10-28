package ce3;

import java.io.InterruptedIOException;
import java.util.TimeZone;
import ne3.C26616h;
import ne3.C26637r0;
import ne3.InterfaceC26629n0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37174h;

/* JADX INFO: renamed from: ce3.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C4521v implements InterfaceC26629n0 {

    /* JADX INFO: renamed from: w */
    public final boolean f18228w;

    /* JADX INFO: renamed from: x */
    public final C26616h f18229x = new C26616h();

    /* JADX INFO: renamed from: y */
    public boolean f18230y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C4524y f18231z;

    public C4521v(C4524y c4524y, boolean z4) {
        this.f18231z = c4524y;
        this.f18228w = z4;
    }

    /* JADX INFO: renamed from: b */
    public final void m14146b(boolean z4) {
        long jMin;
        boolean z13;
        C4524y c4524y = this.f18231z;
        synchronized (c4524y) {
            c4524y.f18245K.m79170i();
            while (c4524y.f18251z >= c4524y.f18239E && !this.f18228w && !this.f18230y && c4524y.m14155g() == null) {
                try {
                    try {
                        c4524y.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th3) {
                    c4524y.f18245K.m14148l();
                    throw th3;
                }
            }
            c4524y.f18245K.m14148l();
            c4524y.m14150b();
            jMin = Math.min(c4524y.f18239E - c4524y.f18251z, this.f18229x.f105866x);
            c4524y.f18251z += jMin;
            z13 = z4 && jMin == this.f18229x.f105866x;
        }
        this.f18231z.f18245K.m79170i();
        try {
            C4524y c4524y2 = this.f18231z;
            c4524y2.f18249x.m14138s(c4524y2.f18248w, z13, this.f18229x, jMin);
        } finally {
            this.f18231z.f18245K.m14148l();
        }
    }

    @Override // ne3.InterfaceC26629n0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C4524y c4524y = this.f18231z;
        TimeZone timeZone = AbstractC37174h.f158962a;
        synchronized (c4524y) {
            if (this.f18230y) {
                return;
            }
            boolean z4 = c4524y.m14155g() == null;
            C4524y c4524y2 = this.f18231z;
            if (!c4524y2.f18243I.f18228w) {
                if (this.f18229x.f105866x > 0) {
                    while (this.f18229x.f105866x > 0) {
                        m14146b(true);
                    }
                } else if (z4) {
                    c4524y2.f18249x.m14138s(c4524y2.f18248w, true, null, 0L);
                }
            }
            C4524y c4524y3 = this.f18231z;
            synchronized (c4524y3) {
                this.f18230y = true;
                c4524y3.notifyAll();
            }
            this.f18231z.f18249x.f18203X.flush();
            this.f18231z.m14149a();
        }
    }

    @Override // ne3.InterfaceC26629n0, java.io.Flushable
    public final void flush() {
        C4524y c4524y = this.f18231z;
        TimeZone timeZone = AbstractC37174h.f158962a;
        synchronized (c4524y) {
            c4524y.m14150b();
        }
        while (this.f18229x.f105866x > 0) {
            m14146b(false);
            this.f18231z.f18249x.f18203X.flush();
        }
    }

    @Override // ne3.InterfaceC26629n0
    public final C26637r0 timeout() {
        return this.f18231z.f18245K;
    }

    @Override // ne3.InterfaceC26629n0
    public final void write(C26616h source, long j7) {
        AbstractC22676k.m65750j(source, "source");
        TimeZone timeZone = AbstractC37174h.f158962a;
        C26616h c26616h = this.f18229x;
        c26616h.write(source, j7);
        while (c26616h.f105866x >= 16384) {
            m14146b(false);
        }
    }
}
