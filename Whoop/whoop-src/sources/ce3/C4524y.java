package ce3;

import de3.C11991a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import ne3.InterfaceC26629n0;
import ne3.InterfaceC26631o0;
import ne3.InterfaceC26633p0;
import okhttp3.internal.http2.StreamResetException;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34807d0;
import wd3.AbstractC37174h;

/* JADX INFO: renamed from: ce3.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C4524y implements InterfaceC26631o0 {

    /* JADX INFO: renamed from: E */
    public long f18239E;

    /* JADX INFO: renamed from: F */
    public final ArrayDeque f18240F;

    /* JADX INFO: renamed from: G */
    public boolean f18241G;

    /* JADX INFO: renamed from: H */
    public final C4522w f18242H;

    /* JADX INFO: renamed from: I */
    public final C4521v f18243I;

    /* JADX INFO: renamed from: J */
    public final C4523x f18244J;

    /* JADX INFO: renamed from: K */
    public final C4523x f18245K;

    /* JADX INFO: renamed from: L */
    public EnumC4496a f18246L;

    /* JADX INFO: renamed from: M */
    public IOException f18247M;

    /* JADX INFO: renamed from: w */
    public final int f18248w;

    /* JADX INFO: renamed from: x */
    public final C4516q f18249x;

    /* JADX INFO: renamed from: y */
    public final C11991a f18250y;

    /* JADX INFO: renamed from: z */
    public long f18251z;

    public C4524y(int i13, C4516q connection, boolean z4, boolean z13, C34807d0 c34807d0) {
        AbstractC22676k.m65750j(connection, "connection");
        this.f18248w = i13;
        this.f18249x = connection;
        this.f18250y = new C11991a(i13);
        this.f18239E = connection.f18198S.m14118a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f18240F = arrayDeque;
        this.f18242H = new C4522w(this, connection.f18197R.m14118a(), z13);
        this.f18243I = new C4521v(this, z4);
        this.f18244J = new C4523x(this);
        this.f18245K = new C4523x(this);
        if (c34807d0 == null) {
            if (!m14156h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (m14156h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(c34807d0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    /* JADX INFO: renamed from: a */
    public final void m14149a() {
        boolean z4;
        boolean zM14157i;
        TimeZone timeZone = AbstractC37174h.f158962a;
        synchronized (this) {
            try {
                C4522w c4522w = this.f18242H;
                if (c4522w.f18235x || !c4522w.f18232E) {
                    z4 = false;
                } else {
                    C4521v c4521v = this.f18243I;
                    if (c4521v.f18228w || c4521v.f18230y) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                zM14157i = m14157i();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z4) {
            m14151c(EnumC4496a.CANCEL, null);
        } else {
            if (zM14157i) {
                return;
            }
            this.f18249x.m14135i(this.f18248w);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14150b() throws IOException {
        C4521v c4521v = this.f18243I;
        if (c4521v.f18230y) {
            throw new IOException("stream closed");
        }
        if (c4521v.f18228w) {
            throw new IOException("stream finished");
        }
        if (m14155g() != null) {
            IOException iOException = this.f18247M;
            if (iOException != null) {
                throw iOException;
            }
            EnumC4496a enumC4496aM14155g = m14155g();
            AbstractC22676k.m65747g(enumC4496aM14155g);
            throw new StreamResetException(enumC4496aM14155g);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14151c(EnumC4496a enumC4496a, IOException iOException) {
        if (m14153e(enumC4496a, iOException)) {
            this.f18249x.f18203X.m14166x(this.f18248w, enumC4496a);
        }
    }

    @Override // ne3.InterfaceC26631o0
    public final void cancel() {
        m14154f(EnumC4496a.CANCEL);
    }

    @Override // ne3.InterfaceC26631o0
    /* JADX INFO: renamed from: d */
    public final InterfaceC26629n0 mo14152d() {
        return this.f18243I;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m14153e(EnumC4496a enumC4496a, IOException iOException) {
        TimeZone timeZone = AbstractC37174h.f158962a;
        synchronized (this) {
            if (m14155g() != null) {
                return false;
            }
            this.f18246L = enumC4496a;
            this.f18247M = iOException;
            notifyAll();
            if (this.f18242H.f18235x && this.f18243I.f18228w) {
                return false;
            }
            this.f18249x.m14135i(this.f18248w);
            return true;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m14154f(EnumC4496a enumC4496a) {
        if (m14153e(enumC4496a, null)) {
            this.f18249x.m14139x(this.f18248w, enumC4496a);
        }
    }

    /* JADX INFO: renamed from: g */
    public final EnumC4496a m14155g() {
        EnumC4496a enumC4496a;
        synchronized (this) {
            enumC4496a = this.f18246L;
        }
        return enumC4496a;
    }

    @Override // ne3.InterfaceC26631o0
    public final InterfaceC26633p0 getSource() {
        return this.f18242H;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m14156h() {
        boolean z4 = (this.f18248w & 1) == 1;
        this.f18249x.getClass();
        return true == z4;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m14157i() {
        synchronized (this) {
            try {
                if (m14155g() != null) {
                    return false;
                }
                C4522w c4522w = this.f18242H;
                if (c4522w.f18235x || c4522w.f18232E) {
                    C4521v c4521v = this.f18243I;
                    if ((c4521v.f18228w || c4521v.f18230y) && this.f18241G) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m14158j(C34807d0 headers, boolean z4) {
        boolean zM14157i;
        AbstractC22676k.m65750j(headers, "headers");
        TimeZone timeZone = AbstractC37174h.f158962a;
        synchronized (this) {
            try {
                if (this.f18241G && headers.m109863a(":status") == null && headers.m109863a(":method") == null) {
                    this.f18242H.getClass();
                } else {
                    this.f18241G = true;
                    this.f18240F.add(headers);
                }
                if (z4) {
                    this.f18242H.f18235x = true;
                }
                zM14157i = m14157i();
                notifyAll();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (zM14157i) {
            return;
        }
        this.f18249x.m14135i(this.f18248w);
    }
}
