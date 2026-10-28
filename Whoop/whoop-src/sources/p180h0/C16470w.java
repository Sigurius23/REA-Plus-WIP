package p180h0;

import ad3.C0783z;
import androidx.compose.p018ui.node.NodeCoordinator;
import bc3.AbstractC3006f0;
import bc3.EnumC2998d0;
import p005a3.AbstractC0201g;
import p005a3.InterfaceC0178a0;
import p005a3.InterfaceC0225m;
import p026b2.AbstractC2316v;
import p026b2.C2319y;
import p181h2.C16618c;
import p268k0.AbstractC22086a;
import p446r1.C30849c;
import p635y2.InterfaceC39147y;
import p636y3.C39180l;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import v63.AbstractC35744b;

/* JADX INFO: renamed from: h0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C16470w extends AbstractC2316v implements InterfaceC0225m, InterfaceC0178a0 {

    /* JADX INFO: renamed from: O */
    public EnumC16377d2 f63277O;

    /* JADX INFO: renamed from: P */
    public final C16372c3 f63278P;

    /* JADX INFO: renamed from: Q */
    public boolean f63279Q;

    /* JADX INFO: renamed from: R */
    public InterfaceC16450s f63280R;

    /* JADX INFO: renamed from: T */
    public InterfaceC39147y f63282T;

    /* JADX INFO: renamed from: U */
    public boolean f63283U;

    /* JADX INFO: renamed from: V */
    public boolean f63284V;

    /* JADX INFO: renamed from: X */
    public boolean f63286X;

    /* JADX INFO: renamed from: S */
    public final C0783z f63281S = new C0783z(11);

    /* JADX INFO: renamed from: W */
    public long f63285W = 0;

    public C16470w(EnumC16377d2 enumC16377d2, C16372c3 c16372c3, boolean z4, InterfaceC16450s interfaceC16450s) {
        this.f63277O = enumC16377d2;
        this.f63278P = c16372c3;
        this.f63279Q = z4;
        this.f63280R = interfaceC16450s;
    }

    /* JADX INFO: renamed from: X0 */
    public static final float m46638X0(C16470w c16470w, InterfaceC16450s interfaceC16450s) {
        C16618c c16618c;
        int iCompare;
        if (C39180l.m124799a(c16470w.f63285W, 0L)) {
            return 0.0f;
        }
        C30849c c30849c = (C30849c) c16470w.f63281S.f2818x;
        int i13 = c30849c.f127229y - 1;
        Object[] objArr = c30849c.f127227w;
        if (i13 < objArr.length) {
            c16618c = null;
            while (i13 >= 0) {
                C16618c c16618c2 = (C16618c) ((C16465v) objArr[i13]).f63260a.invoke();
                if (c16618c2 != null) {
                    long jM47199e = c16618c2.m47199e();
                    long jM113239l = AbstractC35744b.m113239l(c16470w.f63285W);
                    int iOrdinal = c16470w.f63277O.ordinal();
                    if (iOrdinal == 0) {
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM47199e & 4294967295L)), Float.intBitsToFloat((int) (jM113239l & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iCompare = Float.compare(Float.intBitsToFloat((int) (jM47199e >> 32)), Float.intBitsToFloat((int) (jM113239l >> 32)));
                    }
                    if (iCompare > 0) {
                        if (c16618c != null) {
                            break;
                        }
                        c16618c = c16618c2;
                        break;
                    }
                    c16618c = c16618c2;
                }
                i13--;
            }
        } else {
            c16618c = null;
        }
        if (c16618c == null) {
            C16618c c16618cM46639Y0 = c16470w.f63283U ? c16470w.m46639Y0() : null;
            if (c16618cM46639Y0 == null) {
                return 0.0f;
            }
            c16618c = c16618cM46639Y0;
        }
        long jM113239l2 = AbstractC35744b.m113239l(c16470w.f63285W);
        int iOrdinal2 = c16470w.f63277O.ordinal();
        if (iOrdinal2 == 0) {
            float f13 = c16618c.f63940b;
            return interfaceC16450s.mo46636a(f13, c16618c.f63942d - f13, Float.intBitsToFloat((int) (jM113239l2 & 4294967295L)));
        }
        if (iOrdinal2 != 1) {
            throw new NoWhenBranchMatchedException();
        }
        float f14 = c16618c.f63939a;
        return interfaceC16450s.mo46636a(f14, c16618c.f63941c - f14, Float.intBitsToFloat((int) (jM113239l2 >> 32)));
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: M0 */
    public final boolean mo3462M0() {
        return false;
    }

    /* JADX INFO: renamed from: Y0 */
    public final C16618c m46639Y0() {
        if (this.f9141N) {
            NodeCoordinator nodeCoordinatorM515o = AbstractC0201g.m515o(this);
            InterfaceC39147y interfaceC39147y = this.f63282T;
            if (interfaceC39147y != null) {
                if (!interfaceC39147y.mo3532g()) {
                    interfaceC39147y = null;
                }
                if (interfaceC39147y != null) {
                    return nodeCoordinatorM515o.mo3547r(interfaceC39147y, false);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Z0 */
    public final boolean m46640Z0(C16618c c16618c, long j7) {
        long jM46642b1 = m46642b1(c16618c, j7);
        return Math.abs(Float.intBitsToFloat((int) (jM46642b1 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (jM46642b1 & 4294967295L))) <= 0.5f;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m46641a1() {
        InterfaceC16450s interfaceC16450sM46643c1 = m46643c1();
        if (this.f63286X) {
            AbstractC22086a.m63160c("launchAnimation called when previous animation was running");
        }
        m46643c1().getClass();
        AbstractC3006f0.m8732z(m7158L0(), null, EnumC2998d0.f12007z, new C2319y(this, new C16379d4(InterfaceC16450s.m46635b()), interfaceC16450sM46643c1, null, 11), 1);
    }

    /* JADX INFO: renamed from: b1 */
    public final long m46642b1(C16618c c16618c, long j7) {
        long jFloatToRawIntBits;
        long j13;
        long jM113239l = AbstractC35744b.m113239l(j7);
        int iOrdinal = this.f63277O.ordinal();
        if (iOrdinal == 0) {
            InterfaceC16450s interfaceC16450sM46643c1 = m46643c1();
            float f13 = c16618c.f63940b;
            float fMo46636a = interfaceC16450sM46643c1.mo46636a(f13, c16618c.f63942d - f13, Float.intBitsToFloat((int) (jM113239l & 4294967295L)));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fMo46636a);
            j13 = jFloatToRawIntBits2 << 32;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC16450s interfaceC16450sM46643c2 = m46643c1();
            float f14 = c16618c.f63939a;
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(interfaceC16450sM46643c2.mo46636a(f14, c16618c.f63941c - f14, Float.intBitsToFloat((int) (jM113239l >> 32))));
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j13 = jFloatToRawIntBits3 << 32;
        }
        return j13 | (jFloatToRawIntBits & 4294967295L);
    }

    /* JADX INFO: renamed from: c1 */
    public final InterfaceC16450s m46643c1() {
        InterfaceC16450s interfaceC16450s = this.f63280R;
        return interfaceC16450s == null ? (InterfaceC16450s) AbstractC0201g.m506f(this, AbstractC16460u.m46637a()) : interfaceC16450s;
    }

    @Override // p005a3.InterfaceC0178a0
    /* JADX INFO: renamed from: g */
    public final void mo423g(long j7) {
        int iM65751k;
        C16618c c16618cM46639Y0;
        long j13 = this.f63285W;
        this.f63285W = j7;
        int iOrdinal = this.f63277O.ordinal();
        if (iOrdinal == 0) {
            iM65751k = AbstractC22676k.m65751k((int) (j7 & 4294967295L), (int) (4294967295L & j13));
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            iM65751k = AbstractC22676k.m65751k((int) (j7 >> 32), (int) (j13 >> 32));
        }
        if (iM65751k >= 0 || this.f63286X || this.f63283U || (c16618cM46639Y0 = m46639Y0()) == null || !m46640Z0(c16618cM46639Y0, j13)) {
            return;
        }
        this.f63284V = true;
    }
}
