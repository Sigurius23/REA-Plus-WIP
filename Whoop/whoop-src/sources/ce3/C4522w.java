package ce3;

import de3.C11991a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.TimeZone;
import ne3.C26616h;
import ne3.C26637r0;
import ne3.InterfaceC26633p0;
import okhttp3.internal.http2.StreamResetException;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37174h;

/* JADX INFO: renamed from: ce3.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C4522w implements InterfaceC26633p0 {

    /* JADX INFO: renamed from: E */
    public boolean f18232E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C4524y f18233F;

    /* JADX INFO: renamed from: w */
    public final long f18234w;

    /* JADX INFO: renamed from: x */
    public boolean f18235x;

    /* JADX INFO: renamed from: y */
    public final C26616h f18236y = new C26616h();

    /* JADX INFO: renamed from: z */
    public final C26616h f18237z = new C26616h();

    public C4522w(C4524y c4524y, long j7, boolean z4) {
        this.f18233F = c4524y;
        this.f18234w = j7;
        this.f18235x = z4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j7;
        C4524y c4524y = this.f18233F;
        synchronized (c4524y) {
            this.f18232E = true;
            C26616h c26616h = this.f18237z;
            j7 = c26616h.f105866x;
            c26616h.m79200b();
            c4524y.notifyAll();
        }
        if (j7 > 0) {
            C4524y c4524y2 = this.f18233F;
            TimeZone timeZone = AbstractC37174h.f158962a;
            c4524y2.f18249x.m14137m(j7);
        }
        this.f18233F.m14149a();
    }

    @Override // ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h sink, long j7) throws Throwable {
        boolean z4;
        Throwable streamResetException;
        long jMo9164h1;
        AbstractC22676k.m65750j(sink, "sink");
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "byteCount < 0: ").toString());
        }
        do {
            C4524y c4524y = this.f18233F;
            synchronized (c4524y) {
                c4524y.f18249x.getClass();
                C4521v c4521v = c4524y.f18243I;
                z4 = true;
                boolean z13 = c4521v.f18230y || c4521v.f18228w;
                if (z13) {
                    c4524y.f18244J.m79170i();
                }
                try {
                    if (c4524y.m14155g() == null || this.f18235x) {
                        streamResetException = null;
                    } else {
                        streamResetException = c4524y.f18247M;
                        if (streamResetException == null) {
                            EnumC4496a enumC4496aM14155g = c4524y.m14155g();
                            AbstractC22676k.m65747g(enumC4496aM14155g);
                            streamResetException = new StreamResetException(enumC4496aM14155g);
                        }
                    }
                    if (this.f18232E) {
                        throw new IOException("stream closed");
                    }
                    C26616h c26616h = this.f18237z;
                    long j13 = c26616h.f105866x;
                    if (j13 > 0) {
                        jMo9164h1 = c26616h.mo9164h1(sink, Math.min(j7, j13));
                        C11991a.m33037b(c4524y.f18250y, jMo9164h1, 0L, 2);
                        long jM33038a = c4524y.f18250y.m33038a();
                        if (streamResetException == null && jM33038a >= c4524y.f18249x.f18197R.m14118a() / 2) {
                            c4524y.f18249x.m14132J(c4524y.f18248w, jM33038a);
                            C11991a.m33037b(c4524y.f18250y, 0L, jM33038a, 1);
                        }
                        z4 = false;
                    } else {
                        if (this.f18235x || streamResetException != null) {
                            z4 = false;
                        } else {
                            try {
                                c4524y.wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        jMo9164h1 = -1;
                    }
                    if (z13) {
                        c4524y.f18244J.m14148l();
                    }
                } catch (Throwable th3) {
                    if (z13) {
                        c4524y.f18244J.m14148l();
                    }
                    throw th3;
                }
            }
            this.f18233F.f18249x.f18196Q.getClass();
        } while (z4);
        if (jMo9164h1 != -1) {
            return jMo9164h1;
        }
        if (streamResetException == null) {
            return -1L;
        }
        throw streamResetException;
    }

    @Override // ne3.InterfaceC26633p0
    public final C26637r0 timeout() {
        return this.f18233F.f18244J;
    }
}
