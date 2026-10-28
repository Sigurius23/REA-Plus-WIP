package p132f0;

import a11.C0134l;
import p005a3.AbstractC0201g;
import p005a3.C0238p0;
import p005a3.InterfaceC0216j2;
import p005a3.InterfaceC0245r;
import p005a3.InterfaceC0263w1;
import p026b2.AbstractC2316v;
import p181h2.C16618c;
import p181h2.C16619d;
import p181h2.C16620e;
import p208i2.AbstractC17904p0;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17898m0;
import p208i2.C17900n0;
import p208i2.C17902o0;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p208i2.InterfaceC17910s0;
import p209i3.InterfaceC18044z;
import p270k2.C22128b;
import p270k2.C22134h;
import p270k2.InterfaceC22131e;
import p636y3.EnumC39181m;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C13807n extends AbstractC2316v implements InterfaceC0245r, InterfaceC0263w1, InterfaceC0216j2 {

    /* JADX INFO: renamed from: O */
    public long f49259O;

    /* JADX INFO: renamed from: P */
    public AbstractC17911t f49260P;

    /* JADX INFO: renamed from: Q */
    public float f49261Q;

    /* JADX INFO: renamed from: R */
    public InterfaceC17869a1 f49262R;

    /* JADX INFO: renamed from: S */
    public long f49263S;

    /* JADX INFO: renamed from: T */
    public EnumC39181m f49264T;

    /* JADX INFO: renamed from: U */
    public AbstractC17904p0 f49265U;

    /* JADX INFO: renamed from: V */
    public InterfaceC17869a1 f49266V;

    /* JADX INFO: renamed from: W */
    public AbstractC17904p0 f49267W;

    @Override // p005a3.InterfaceC0263w1
    /* JADX INFO: renamed from: C */
    public final void mo796C() {
        this.f49263S = 9205357640488583168L;
        this.f49264T = null;
        this.f49265U = null;
        this.f49266V = null;
        AbstractC0201g.m508h(this);
    }

    @Override // p005a3.InterfaceC0245r
    /* JADX INFO: renamed from: O */
    public final void mo459O(C0238p0 c0238p0) {
        AbstractC17904p0 abstractC17904p0;
        AbstractC17911t abstractC17911t;
        InterfaceC17910s0 interfaceC17910s0;
        C22128b c22128b = c0238p0.f815w;
        if (this.f49262R == AbstractC17918w0.f69621a) {
            if (!C17919x.m51542d(this.f49259O, C17919x.f69637n)) {
                InterfaceC22131e.m63383i0(c0238p0, this.f49259O, 0L, 0L, 0.0f, null, 0, 126);
            }
            AbstractC17911t abstractC17911t2 = this.f49260P;
            if (abstractC17911t2 != null) {
                InterfaceC22131e.m63385u(c0238p0, abstractC17911t2, 0L, 0L, this.f49261Q, null, 0, 118);
            }
        } else {
            if (C16620e.m47210b(c22128b.mo731d(), this.f49263S) && c0238p0.getLayoutDirection() == this.f49264T && AbstractC22676k.m65745e(this.f49266V, this.f49262R)) {
                abstractC17904p0 = this.f49265U;
                AbstractC22676k.m65747g(abstractC17904p0);
            } else {
                AbstractC0201g.m512l(this, new C0134l(17, this, c0238p0));
                abstractC17904p0 = this.f49267W;
                this.f49267W = null;
            }
            this.f49265U = abstractC17904p0;
            this.f49263S = c22128b.mo731d();
            this.f49264T = c0238p0.getLayoutDirection();
            this.f49266V = this.f49262R;
            AbstractC22676k.m65747g(abstractC17904p0);
            if (!C17919x.m51542d(this.f49259O, C17919x.f69637n)) {
                AbstractC17918w0.m51529q(c0238p0, abstractC17904p0, this.f49259O);
            }
            AbstractC17911t abstractC17911t3 = this.f49260P;
            if (abstractC17911t3 != null) {
                float f13 = this.f49261Q;
                boolean z4 = abstractC17904p0 instanceof C17900n0;
                C22134h c22134h = C22134h.f85857a;
                if (z4) {
                    C16618c c16618c = ((C17900n0) abstractC17904p0).f69601a;
                    float f14 = c16618c.f63939a;
                    c0238p0.mo729a0(abstractC17911t3, (4294967295L & ((long) Float.floatToRawIntBits(c16618c.f63940b))) | (Float.floatToRawIntBits(f14) << 32), AbstractC17918w0.m51501C(c16618c), f13, c22134h, 3);
                } else {
                    if (abstractC17904p0 instanceof C17902o0) {
                        C17902o0 c17902o0 = (C17902o0) abstractC17904p0;
                        abstractC17911t = abstractC17911t3;
                        interfaceC17910s0 = c17902o0.f69603b;
                        if (interfaceC17910s0 == null) {
                            C16619d c16619d = c17902o0.f69602a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (c16619d.f63950h >> 32));
                            c0238p0.mo739m(abstractC17911t, (((long) Float.floatToRawIntBits(c16619d.f63943a)) << 32) | (((long) Float.floatToRawIntBits(c16619d.f63944b)) & 4294967295L), (((long) Float.floatToRawIntBits(c16619d.m47208b())) << 32) | (((long) Float.floatToRawIntBits(c16619d.m47207a())) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), f13, c22134h);
                        }
                    } else {
                        if (!(abstractC17904p0 instanceof C17898m0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC17910s0 interfaceC17910s1 = ((C17898m0) abstractC17904p0).f69599a;
                        abstractC17911t = abstractC17911t3;
                        interfaceC17910s0 = interfaceC17910s1;
                    }
                    c0238p0.mo720B(interfaceC17910s0, abstractC17911t, f13, c22134h, 3);
                }
            }
        }
        c0238p0.m728a();
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: e */
    public final boolean mo543e() {
        return false;
    }

    @Override // p005a3.InterfaceC0216j2
    /* JADX INFO: renamed from: n */
    public final void mo471n(InterfaceC18044z interfaceC18044z) {
    }
}
