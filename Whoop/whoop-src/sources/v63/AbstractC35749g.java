package v63;

import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p478s3.AbstractC32098d;
import p479s4.AbstractC32120a;
import p715kotlin.jvm.internal.AbstractC22676k;
import s30.AbstractC32100b;
import w63.C36866a;
import x63.InterfaceC38034f;

/* JADX INFO: renamed from: v63.g */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC35749g implements Closeable {

    /* JADX INFO: renamed from: E */
    public int f152029E;

    /* JADX INFO: renamed from: F */
    public long f152030F;

    /* JADX INFO: renamed from: G */
    public boolean f152031G;

    /* JADX INFO: renamed from: w */
    public final InterfaceC38034f f152032w;

    /* JADX INFO: renamed from: x */
    public C36866a f152033x;

    /* JADX INFO: renamed from: y */
    public ByteBuffer f152034y;

    /* JADX INFO: renamed from: z */
    public int f152035z;

    public AbstractC35749g(C36866a head, long j7, InterfaceC38034f pool) {
        AbstractC22676k.m65750j(head, "head");
        AbstractC22676k.m65750j(pool, "pool");
        this.f152032w = pool;
        this.f152033x = head;
        this.f152034y = (ByteBuffer) head.f77291g;
        int i13 = head.f77286b;
        this.f152035z = i13;
        int i14 = head.f77287c;
        this.f152029E = i14;
        this.f152030F = j7 - ((long) (i14 - i13));
    }

    /* JADX INFO: renamed from: J */
    public final void m113262J(C36866a c36866a) {
        C36866a c36866aM118244g = c36866a.m118244g();
        if (c36866aM118244g == null) {
            c36866aM118244g = C36866a.f157703m;
        }
        m113264a0(c36866aM118244g);
        m113263T(this.f152030F - ((long) (c36866aM118244g.f77287c - c36866aM118244g.f77286b)));
        c36866a.m118247j(this.f152032w);
    }

    /* JADX INFO: renamed from: T */
    public final void m113263T(long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "tailRemaining shouldn't be negative: ").toString());
        }
        this.f152030F = j7;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m113264a0(C36866a c36866a) {
        this.f152033x = c36866a;
        this.f152034y = (ByteBuffer) c36866a.f77291g;
        this.f152035z = c36866a.f77286b;
        this.f152029E = c36866a.f77287c;
    }

    /* JADX INFO: renamed from: b */
    public final void m113265b(int i13) throws EOFException {
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Negative discard is not allowed: ").toString());
        }
        int i14 = 0;
        int i15 = i13;
        while (i15 != 0) {
            C36866a c36866aM113269m = m113269m();
            if (this.f152029E - this.f152035z < 1) {
                c36866aM113269m = m113271x(1, c36866aM113269m);
            }
            if (c36866aM113269m == null) {
                break;
            }
            int iMin = Math.min(c36866aM113269m.f77287c - c36866aM113269m.f77286b, i15);
            c36866aM113269m.m56793d(iMin);
            this.f152035z += iMin;
            if (c36866aM113269m.f77287c - c36866aM113269m.f77286b == 0) {
                m113262J(c36866aM113269m);
            }
            i15 -= iMin;
            i14 += iMin;
        }
        if (i14 != i13) {
            throw new EOFException(AbstractC2875y.m8296i(i13, "Unable to discard ", " bytes due to end of packet"));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        C36866a c36866aM113269m = m113269m();
        C36866a c36866a = C36866a.f157703m;
        if (c36866aM113269m != c36866a) {
            m113264a0(c36866a);
            m113263T(0L);
            AbstractC32120a.m99984j(c36866aM113269m, this.f152032w);
        }
        if (this.f152031G) {
            return;
        }
        this.f152031G = true;
    }

    /* JADX INFO: renamed from: h */
    public final C36866a m113266h(C36866a c36866a) {
        C36866a c36866a2 = C36866a.f157703m;
        while (c36866a != c36866a2) {
            C36866a c36866aM118244g = c36866a.m118244g();
            c36866a.m118247j(this.f152032w);
            if (c36866aM118244g == null) {
                m113264a0(c36866a2);
                m113263T(0L);
                c36866a = c36866a2;
            } else {
                if (c36866aM118244g.f77287c > c36866aM118244g.f77286b) {
                    m113264a0(c36866aM118244g);
                    m113263T(this.f152030F - ((long) (c36866aM118244g.f77287c - c36866aM118244g.f77286b)));
                    return c36866aM118244g;
                }
                c36866a = c36866aM118244g;
            }
        }
        if (this.f152031G) {
            return null;
        }
        this.f152031G = true;
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final void m113267i(C36866a c36866a) throws EOFException {
        if (this.f152031G && c36866a.m118245h() == null) {
            this.f152035z = c36866a.f77286b;
            this.f152029E = c36866a.f77287c;
            m113263T(0L);
            return;
        }
        int i13 = c36866a.f77287c - c36866a.f77286b;
        int iMin = Math.min(i13, 8 - (c36866a.f77290f - c36866a.f77289e));
        InterfaceC38034f interfaceC38034f = this.f152032w;
        if (i13 > iMin) {
            C36866a c36866a2 = (C36866a) interfaceC38034f.mo55796t0();
            C36866a c36866a3 = (C36866a) interfaceC38034f.mo55796t0();
            c36866a2.m56795f();
            c36866a3.m56795f();
            c36866a2.m118249l(c36866a3);
            c36866a3.m118249l(c36866a.m118244g());
            AbstractC32098d.m99855v(c36866a2, c36866a, i13 - iMin);
            AbstractC32098d.m99855v(c36866a3, c36866a, iMin);
            m113264a0(c36866a2);
            m113263T(AbstractC32120a.m99985k(c36866a3));
        } else {
            C36866a c36866a4 = (C36866a) interfaceC38034f.mo55796t0();
            c36866a4.m56795f();
            c36866a4.m118249l(c36866a.m118244g());
            AbstractC32098d.m99855v(c36866a4, c36866a, i13);
            m113264a0(c36866a4);
        }
        c36866a.m118247j(interfaceC38034f);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m113268k() {
        if (this.f152029E - this.f152035z != 0 || this.f152030F != 0) {
            return false;
        }
        boolean z4 = this.f152031G;
        if (!z4 && !z4) {
            this.f152031G = true;
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final C36866a m113269m() throws EOFException {
        C36866a c36866a = this.f152033x;
        int i13 = this.f152035z;
        if (i13 < 0 || i13 > c36866a.f77287c) {
            int i14 = c36866a.f77286b;
            AbstractC32100b.m99860e(i13 - i14, c36866a.f77287c - i14);
            throw null;
        }
        if (c36866a.f77286b != i13) {
            c36866a.f77286b = i13;
        }
        return c36866a;
    }

    /* JADX INFO: renamed from: s */
    public final long m113270s() {
        return ((long) (this.f152029E - this.f152035z)) + this.f152030F;
    }

    /* JADX INFO: renamed from: x */
    public final C36866a m113271x(int i13, C36866a c36866a) throws EOFException {
        while (true) {
            int i14 = this.f152029E - this.f152035z;
            if (i14 >= i13) {
                break;
            }
            C36866a c36866aM118245h = c36866a.m118245h();
            if (c36866aM118245h == null) {
                if (this.f152031G) {
                    return null;
                }
                this.f152031G = true;
                return null;
            }
            if (i14 == 0) {
                if (c36866a != C36866a.f157703m) {
                    m113262J(c36866a);
                }
                c36866a = c36866aM118245h;
            } else {
                int iM99855v = AbstractC32098d.m99855v(c36866a, c36866aM118245h, i13 - i14);
                this.f152029E = c36866a.f77287c;
                m113263T(this.f152030F - ((long) iM99855v));
                int i15 = c36866aM118245h.f77287c;
                int i16 = c36866aM118245h.f77286b;
                if (i15 <= i16) {
                    c36866a.m118244g();
                    c36866a.m118249l(c36866aM118245h.m118244g());
                    c36866aM118245h.m118247j(this.f152032w);
                } else {
                    if (iM99855v < 0) {
                        throw new IllegalArgumentException(AbstractC2875y.m8295h(iM99855v, "startGap shouldn't be negative: ").toString());
                    }
                    if (i16 >= iM99855v) {
                        c36866aM118245h.f77288d = iM99855v;
                    } else {
                        if (i16 != i15) {
                            AbstractC32100b.m99871u(iM99855v, c36866aM118245h);
                            throw null;
                        }
                        if (iM99855v > c36866aM118245h.f77289e) {
                            AbstractC32100b.m99872v(iM99855v, c36866aM118245h);
                            throw null;
                        }
                        c36866aM118245h.f77287c = iM99855v;
                        c36866aM118245h.f77286b = iM99855v;
                        c36866aM118245h.f77288d = iM99855v;
                    }
                }
                if (c36866a.f77287c - c36866a.f77286b >= i13) {
                    break;
                }
                if (i13 > 8) {
                    throw new IllegalStateException(AbstractC2875y.m8296i(i13, "minSize of ", " is too big (should be less than 8)"));
                }
            }
        }
        return c36866a;
    }
}
