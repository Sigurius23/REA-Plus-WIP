package p031b9;

import androidx.media3.exoplayer.ExoPlaybackException;
import p010a9.C0580e;
import p047c9.C4323n;
import p299l9.C23488c0;
import p299l9.InterfaceC23540z0;
import p361o9.C27677q;
import p516u8.AbstractC34609o0;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.C38061p;
import qg3.C30352d;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: b9.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2829f implements InterfaceC2828e1 {

    /* JADX INFO: renamed from: E */
    public int f11081E;

    /* JADX INFO: renamed from: F */
    public C4323n f11082F;

    /* JADX INFO: renamed from: G */
    public C38061p f11083G;

    /* JADX INFO: renamed from: H */
    public int f11084H;

    /* JADX INFO: renamed from: I */
    public InterfaceC23540z0 f11085I;

    /* JADX INFO: renamed from: J */
    public C34610p[] f11086J;

    /* JADX INFO: renamed from: K */
    public long f11087K;

    /* JADX INFO: renamed from: L */
    public long f11088L;

    /* JADX INFO: renamed from: N */
    public boolean f11090N;

    /* JADX INFO: renamed from: O */
    public boolean f11091O;

    /* JADX INFO: renamed from: Q */
    public C27677q f11093Q;

    /* JADX INFO: renamed from: x */
    public final int f11095x;

    /* JADX INFO: renamed from: z */
    public C2840i1 f11097z;

    /* JADX INFO: renamed from: w */
    public final Object f11094w = new Object();

    /* JADX INFO: renamed from: y */
    public final C30352d f11096y = new C30352d(4, (char) 0);

    /* JADX INFO: renamed from: M */
    public long f11089M = Long.MIN_VALUE;

    /* JADX INFO: renamed from: P */
    public AbstractC34609o0 f11092P = AbstractC34609o0.f145755a;

    public AbstractC2829f(int i13) {
        this.f11095x = i13;
    }

    /* JADX INFO: renamed from: f */
    public static int m8055f(int i13, int i14, int i15, int i16) {
        return i13 | i14 | i15 | 128 | i16;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m8056m(int i13, boolean z4) {
        int i14 = i13 & 7;
        if (i14 != 4) {
            return z4 && i14 == 3;
        }
        return true;
    }

    /* JADX INFO: renamed from: A */
    public abstract int mo8057A(C34610p c34610p);

    /* JADX INFO: renamed from: B */
    public int mo8058B() {
        return 0;
    }

    @Override // p031b9.InterfaceC2828e1
    /* JADX INFO: renamed from: a */
    public void mo8047a(int i13, Object obj) {
    }

    /* JADX INFO: renamed from: g */
    public final ExoPlaybackException m8059g(Exception exc, C34610p c34610p, boolean z4, int i13) {
        int iMo8057A;
        if (c34610p == null || this.f11091O) {
            iMo8057A = 4;
        } else {
            this.f11091O = true;
            try {
                iMo8057A = mo8057A(c34610p) & 7;
                this.f11091O = false;
            } catch (ExoPlaybackException unused) {
                this.f11091O = false;
                iMo8057A = 4;
            } catch (Throwable th3) {
                this.f11091O = false;
                throw th3;
            }
        }
        return new ExoPlaybackException(1, exc, i13, mo8062j(), this.f11081E, c34610p, c34610p == null ? 4 : iMo8057A, z4);
    }

    /* JADX INFO: renamed from: h */
    public void mo8060h() {
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC2858p0 mo8061i() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public abstract String mo8062j();

    /* JADX INFO: renamed from: k */
    public final boolean m8063k() {
        return this.f11089M == Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: l */
    public abstract boolean mo8064l();

    /* JADX INFO: renamed from: n */
    public abstract boolean mo8065n();

    /* JADX INFO: renamed from: o */
    public abstract void mo8066o();

    /* JADX INFO: renamed from: p */
    public void mo8067p(boolean z4, boolean z13) {
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo8068q(long j7, boolean z4);

    /* JADX INFO: renamed from: r */
    public void mo8069r() {
    }

    /* JADX INFO: renamed from: s */
    public void mo8070s() {
    }

    /* JADX INFO: renamed from: t */
    public void mo8071t() {
    }

    /* JADX INFO: renamed from: u */
    public void mo8072u() {
    }

    /* JADX INFO: renamed from: v */
    public void mo8073v(C34610p[] c34610pArr, long j7, long j13, C23488c0 c23488c0) {
    }

    /* JADX INFO: renamed from: w */
    public final int m8074w(C30352d c30352d, C0580e c0580e, int i13) {
        InterfaceC23540z0 interfaceC23540z0 = this.f11085I;
        interfaceC23540z0.getClass();
        int iMo36172l = interfaceC23540z0.mo36172l(c30352d, c0580e, i13);
        if (iMo36172l == -4) {
            if (c0580e.m1496f(4)) {
                this.f11089M = Long.MIN_VALUE;
                return this.f11090N ? -4 : -3;
            }
            long j7 = c0580e.f2065G + this.f11087K;
            c0580e.f2065G = j7;
            this.f11089M = Math.max(this.f11089M, j7);
            return iMo36172l;
        }
        if (iMo36172l == -5) {
            C34610p c34610p = (C34610p) c30352d.f124536y;
            c34610p.getClass();
            long j13 = c34610p.f145788s;
            if (j13 != Long.MAX_VALUE) {
                C34608o c34608oM109410a = c34610p.m109410a();
                c34608oM109410a.f145746r = j13 + this.f11087K;
                c30352d.f124536y = new C34610p(c34608oM109410a);
            }
        }
        return iMo36172l;
    }

    /* JADX INFO: renamed from: x */
    public abstract void mo8075x(long j7, long j13);

    /* JADX INFO: renamed from: y */
    public final void m8076y(C34610p[] c34610pArr, InterfaceC23540z0 interfaceC23540z0, long j7, long j13, C23488c0 c23488c0) {
        AbstractC35849g.m113807i(!this.f11090N);
        this.f11085I = interfaceC23540z0;
        if (this.f11089M == Long.MIN_VALUE) {
            this.f11089M = j7;
        }
        this.f11086J = c34610pArr;
        this.f11087K = j13;
        mo8073v(c34610pArr, j7, j13, c23488c0);
    }

    /* JADX INFO: renamed from: z */
    public void mo8077z(float f13, float f14) {
    }
}
