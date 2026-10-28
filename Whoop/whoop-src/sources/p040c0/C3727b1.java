package p040c0;

import androidx.compose.animation.AbstractC1091c;
import c93.InterfaceC4339a;
import m83.C25272z;
import p026b2.C2299e;
import p026b2.InterfaceC2302h;
import p028b4.C2696g;
import p077d0.C11397r1;
import p077d0.C11400s1;
import p077d0.C11421z1;
import p208i2.C17881e1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39130s0;
import p635y2.InterfaceC39133t0;
import p636y3.AbstractC39170b;
import p636y3.C39178j;
import p636y3.C39180l;
import p636y3.EnumC39181m;

/* JADX INFO: renamed from: c0.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3727b1 extends AbstractC3754k1 {

    /* JADX INFO: renamed from: P */
    public C11421z1 f15219P;

    /* JADX INFO: renamed from: Q */
    public C11400s1 f15220Q;

    /* JADX INFO: renamed from: R */
    public C11400s1 f15221R;

    /* JADX INFO: renamed from: S */
    public C11400s1 f15222S;

    /* JADX INFO: renamed from: T */
    public AbstractC3730c1 f15223T;

    /* JADX INFO: renamed from: U */
    public AbstractC3736e1 f15224U;

    /* JADX INFO: renamed from: V */
    public InterfaceC4339a f15225V;

    /* JADX INFO: renamed from: W */
    public C3774r0 f15226W;

    /* JADX INFO: renamed from: X */
    public long f15227X;

    /* JADX INFO: renamed from: Y */
    public InterfaceC2302h f15228Y;

    /* JADX INFO: renamed from: Z */
    public final C3724a1 f15229Z;

    /* JADX INFO: renamed from: a0 */
    public final C3724a1 f15230a0;

    public C3727b1(C11421z1 c11421z1, C11400s1 c11400s1, C11400s1 c11400s2, C11400s1 c11400s3, AbstractC3730c1 abstractC3730c1, AbstractC3736e1 abstractC3736e1, InterfaceC4339a interfaceC4339a, C3774r0 c3774r0) {
        super(0);
        this.f15219P = c11421z1;
        this.f15220Q = c11400s1;
        this.f15221R = c11400s2;
        this.f15222S = c11400s3;
        this.f15223T = abstractC3730c1;
        this.f15224U = abstractC3736e1;
        this.f15225V = interfaceC4339a;
        this.f15226W = c3774r0;
        this.f15227X = AbstractC1091c.f4474a;
        AbstractC39170b.m124770b(0, 0, 15);
        this.f15229Z = new C3724a1(this, 0);
        this.f15230a0 = new C3724a1(this, 1);
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        this.f15227X = AbstractC1091c.f4474a;
    }

    /* JADX INFO: renamed from: Z0 */
    public final InterfaceC2302h m11561Z0() {
        InterfaceC2302h interfaceC2302h;
        InterfaceC2302h interfaceC2302h2;
        if (this.f15219P.m30664f().m30637d(EnumC3771q0.f15392w, EnumC3771q0.f15393x)) {
            C3753k0 c3753k0 = ((C3733d1) this.f15223T).f15271b.f15432c;
            if (c3753k0 != null && (interfaceC2302h2 = c3753k0.f15341a) != null) {
                return interfaceC2302h2;
            }
            C3753k0 c3753k1 = ((C3739f1) this.f15224U).f15302c.f15432c;
            if (c3753k1 != null) {
                return c3753k1.f15341a;
            }
            return null;
        }
        C3753k0 c3753k2 = ((C3739f1) this.f15224U).f15302c.f15432c;
        if (c3753k2 != null && (interfaceC2302h = c3753k2.f15341a) != null) {
            return interfaceC2302h;
        }
        C3753k0 c3753k3 = ((C3733d1) this.f15223T).f15271b.f15432c;
        if (c3753k3 != null) {
            return c3753k3.f15341a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c7  */
    @Override // p040c0.AbstractC3754k1, p005a3.InterfaceC0186c0
    /* JADX INFO: renamed from: b */
    public final InterfaceC39130s0 mo434b(InterfaceC39133t0 interfaceC39133t0, InterfaceC39124q0 interfaceC39124q0, long j7) {
        C17881e1 c17881e1;
        long j13;
        long j14;
        C11397r1 c11397r1M30630a = null;
        if (this.f15219P.f36630a.mo2428y0() == this.f15219P.f36633d.getValue()) {
            this.f15228Y = null;
        } else if (this.f15228Y == null) {
            InterfaceC2302h interfaceC2302hM11561Z0 = m11561Z0();
            if (interfaceC2302hM11561Z0 == null) {
                interfaceC2302hM11561Z0 = C2299e.f9114w;
            }
            this.f15228Y = interfaceC2302hM11561Z0;
        }
        boolean zMo781A = interfaceC39133t0.mo781A();
        C25272z c25272z = C25272z.f99163w;
        if (zMo781A) {
            AbstractC39104j1 abstractC39104j1Mo448T = interfaceC39124q0.mo448T(j7);
            long j15 = (((long) abstractC39104j1Mo448T.f168211w) << 32) | (((long) abstractC39104j1Mo448T.f168212x) & 4294967295L);
            this.f15227X = j15;
            return interfaceC39133t0.mo86822W((int) (j15 >> 32), (int) (4294967295L & j15), c25272z, new C3790x0(abstractC39104j1Mo448T, 0));
        }
        if (!((Boolean) this.f15225V.invoke()).booleanValue()) {
            AbstractC39104j1 abstractC39104j1Mo448T2 = interfaceC39124q0.mo448T(j7);
            return interfaceC39133t0.mo86822W(abstractC39104j1Mo448T2.f168211w, abstractC39104j1Mo448T2.f168212x, c25272z, new C3790x0(abstractC39104j1Mo448T2, 1));
        }
        C3774r0 c3774r0 = this.f15226W;
        C11400s1 c11400s1 = c3774r0.f15402a;
        C11400s1 c11400s2 = c3774r0.f15403b;
        C11421z1 c11421z1 = c3774r0.f15404c;
        AbstractC3730c1 abstractC3730c1 = c3774r0.f15405d;
        AbstractC3736e1 abstractC3736e1 = c3774r0.f15406e;
        C11400s1 c11400s3 = c3774r0.f15407f;
        C11397r1 c11397r1M30630a2 = c11400s1 != null ? c11400s1.m30630a(new C3777s0(abstractC3730c1, abstractC3736e1, 0), new C3777s0(abstractC3730c1, abstractC3736e1, 1)) : null;
        C11397r1 c11397r1M30630a3 = c11400s2 != null ? c11400s2.m30630a(new C3777s0(abstractC3730c1, abstractC3736e1, 2), new C3777s0(abstractC3730c1, abstractC3736e1, 3)) : null;
        if (c11421z1.f36630a.mo2428y0() == EnumC3771q0.f15392w) {
            C3757l1 c3757l1 = ((C3733d1) abstractC3730c1).f15271b.f15433d;
            if (c3757l1 != null) {
                c17881e1 = new C17881e1(c3757l1.f15354b);
            } else {
                C3757l1 c3757l2 = ((C3739f1) abstractC3736e1).f15302c.f15433d;
                if (c3757l2 != null) {
                    c17881e1 = new C17881e1(c3757l2.f15354b);
                } else {
                    c17881e1 = null;
                }
            }
        } else {
            C3757l1 c3757l3 = ((C3739f1) abstractC3736e1).f15302c.f15433d;
            if (c3757l3 != null) {
                c17881e1 = new C17881e1(c3757l3.f15354b);
            } else {
                C3757l1 c3757l4 = ((C3733d1) abstractC3730c1).f15271b.f15433d;
                if (c3757l4 != null) {
                    c17881e1 = new C17881e1(c3757l4.f15354b);
                } else {
                    c17881e1 = null;
                }
            }
        }
        C3743h c3743h = new C3743h(c11397r1M30630a2, c11397r1M30630a3, c11400s3 != null ? c11400s3.m30630a(C3728c.f15234H, new C2696g(c17881e1, abstractC3730c1, abstractC3736e1, 1)) : null, 1);
        AbstractC39104j1 abstractC39104j1Mo448T3 = interfaceC39124q0.mo448T(j7);
        long j16 = (((long) abstractC39104j1Mo448T3.f168212x) & 4294967295L) | (((long) abstractC39104j1Mo448T3.f168211w) << 32);
        long j17 = !C39180l.m124799a(this.f15227X, AbstractC1091c.f4474a) ? this.f15227X : j16;
        C11400s1 c11400s4 = this.f15220Q;
        if (c11400s4 != null) {
            c11397r1M30630a = c11400s4.m30630a(this.f15229Z, new C3794z0(this, j17, 0));
        }
        if (c11397r1M30630a != null) {
            j16 = ((C39180l) c11397r1M30630a.getValue()).f168422a;
        }
        long jM124772d = AbstractC39170b.m124772d(j7, j16);
        C11400s1 c11400s5 = this.f15221R;
        long jMo7156a = 0;
        long j18 = c11400s5 != null ? ((C39178j) c11400s5.m30630a(C3728c.f15238L, new C3794z0(this, j17, 1)).getValue()).f168416a : 0L;
        C11400s1 c11400s6 = this.f15222S;
        if (c11400s6 != null) {
            j13 = ((C39178j) c11400s6.m30630a(this.f15230a0, new C3794z0(this, j17, 2)).getValue()).f168416a;
        } else {
            j13 = 0;
        }
        InterfaceC2302h interfaceC2302h = this.f15228Y;
        if (interfaceC2302h != null) {
            long j19 = j17;
            j14 = j13;
            jMo7156a = interfaceC2302h.mo7156a(j19, jM124772d, EnumC39181m.f168423w);
        } else {
            j14 = j13;
        }
        return interfaceC39133t0.mo86822W((int) (jM124772d >> 32), (int) (jM124772d & 4294967295L), c25272z, new C3792y0(abstractC39104j1Mo448T3, C39178j.m124794d(jMo7156a, j14), j18, c3743h));
    }
}
