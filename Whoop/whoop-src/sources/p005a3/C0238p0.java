package p005a3;

import androidx.compose.p018ui.node.NodeCoordinator;
import java.util.ArrayList;
import p026b2.AbstractC2316v;
import p031b9.AbstractC2875y;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17921y;
import p208i2.C17885g;
import p208i2.InterfaceC17910s0;
import p208i2.InterfaceC17912t0;
import p208i2.InterfaceC17915v;
import p270k2.AbstractC22132f;
import p270k2.C22127a;
import p270k2.C22128b;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p293l2.C23226c;
import p446r1.C30849c;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;
import v63.AbstractC35744b;

/* JADX INFO: renamed from: a3.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0238p0 implements InterfaceC22131e, InterfaceC22129c {

    /* JADX INFO: renamed from: w */
    public final C22128b f815w = new C22128b();

    /* JADX INFO: renamed from: x */
    public InterfaceC0245r f816x;

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: B */
    public final void mo720B(InterfaceC17910s0 interfaceC17910s0, AbstractC17911t abstractC17911t, float f13, AbstractC22132f abstractC22132f, int i13) {
        this.f815w.mo720B(interfaceC17910s0, abstractC17911t, f13, abstractC22132f, i13);
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: B0 */
    public final long mo721B0() {
        return this.f815w.mo721B0();
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: D0 */
    public final long mo722D0(long j7) {
        return this.f815w.mo722D0(j7);
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: E0 */
    public final void mo723E0(InterfaceC17910s0 interfaceC17910s0, long j7, float f13, AbstractC22132f abstractC22132f) {
        this.f815w.mo723E0(interfaceC17910s0, j7, f13, abstractC22132f);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: F */
    public final int mo724F(float f13) {
        return this.f815w.mo724F(f13);
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: I */
    public final void mo725I(C17885g c17885g, long j7, long j13, long j14, float f13, AbstractC17921y abstractC17921y, int i13) {
        this.f815w.mo725I(c17885g, j7, j13, j14, f13, abstractC17921y, i13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: K */
    public final float mo726K(long j7) {
        return this.f815w.mo726K(j7);
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: R */
    public final void mo727R(AbstractC17911t abstractC17911t, long j7, long j13, float f13, InterfaceC17912t0 interfaceC17912t0, float f14) {
        this.f815w.mo727R(abstractC17911t, j7, j13, f13, interfaceC17912t0, f14);
    }

    /* JADX INFO: renamed from: a */
    public final void m728a() {
        C22128b c22128b = this.f815w;
        InterfaceC17915v interfaceC17915vM716w = c22128b.f85852x.m716w();
        InterfaceC0229n interfaceC0229n = this.f816x;
        if (interfaceC0229n == null) {
            throw AbstractC2875y.m8310w("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        AbstractC2316v abstractC2316v = (AbstractC2316v) interfaceC0229n;
        AbstractC2316v abstractC2316vM504d = abstractC2316v.f9142w.f9133F;
        if (abstractC2316vM504d != null && (abstractC2316vM504d.f9145z & 4) != 0) {
            while (true) {
                if (abstractC2316vM504d != null) {
                    int i13 = abstractC2316vM504d.f9144y;
                    if ((i13 & 2) == 0) {
                        if ((i13 & 4) != 0) {
                            break;
                        } else {
                            abstractC2316vM504d = abstractC2316vM504d.f9133F;
                        }
                    }
                }
                abstractC2316vM504d = null;
                break;
            }
        } else {
            abstractC2316vM504d = null;
            break;
        }
        if (abstractC2316vM504d == null) {
            NodeCoordinator nodeCoordinatorM514n = AbstractC0201g.m514n(interfaceC0229n, 4);
            if (nodeCoordinatorM514n.mo3533g1() == abstractC2316v.f9142w) {
                nodeCoordinatorM514n = nodeCoordinatorM514n.f4859P;
                AbstractC22676k.m65747g(nodeCoordinatorM514n);
            }
            nodeCoordinatorM514n.mo3552v1(interfaceC17915vM716w, (C23226c) c22128b.f85852x.f813y);
            return;
        }
        C30849c c30849c = null;
        while (abstractC2316vM504d != null) {
            if (abstractC2316vM504d instanceof InterfaceC0245r) {
                InterfaceC0245r interfaceC0245r = (InterfaceC0245r) abstractC2316vM504d;
                C23226c c23226c = (C23226c) c22128b.f85852x.f813y;
                NodeCoordinator nodeCoordinatorM514n2 = AbstractC0201g.m514n(interfaceC0245r, 4);
                long jM113239l = AbstractC35744b.m113239l(nodeCoordinatorM514n2.f168213y);
                C0230n0 c0230n0 = nodeCoordinatorM514n2.f4858O;
                c0230n0.getClass();
                AbstractC0242q0.m750a(c0230n0).getSharedDrawScope().m730b(interfaceC17915vM716w, jM113239l, nodeCoordinatorM514n2, interfaceC0245r, c23226c);
            } else if ((abstractC2316vM504d.f9144y & 4) != 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                int i14 = 0;
                for (AbstractC2316v abstractC2316v2 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v2 != null; abstractC2316v2 = abstractC2316v2.f9133F) {
                    if ((abstractC2316v2.f9144y & 4) != 0) {
                        i14++;
                        if (i14 == 1) {
                            abstractC2316vM504d = abstractC2316v2;
                        } else {
                            if (c30849c == null) {
                                c30849c = new C30849c(new AbstractC2316v[16]);
                            }
                            if (abstractC2316vM504d != null) {
                                c30849c.m94885b(abstractC2316vM504d);
                                abstractC2316vM504d = null;
                            }
                            c30849c.m94885b(abstractC2316v2);
                        }
                    }
                }
                if (i14 == 1) {
                }
            }
            abstractC2316vM504d = AbstractC0201g.m504d(c30849c);
        }
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: a0 */
    public final void mo729a0(AbstractC17911t abstractC17911t, long j7, long j13, float f13, AbstractC22132f abstractC22132f, int i13) {
        this.f815w.mo729a0(abstractC17911t, j7, j13, f13, abstractC22132f, i13);
    }

    /* JADX INFO: renamed from: b */
    public final void m730b(InterfaceC17915v interfaceC17915v, long j7, NodeCoordinator nodeCoordinator, InterfaceC0245r interfaceC0245r, C23226c c23226c) {
        InterfaceC0245r interfaceC0245r2 = this.f816x;
        this.f816x = interfaceC0245r;
        EnumC39181m enumC39181m = nodeCoordinator.f4858O.f777Y;
        C22128b c22128b = this.f815w;
        C0237p c0237p = c22128b.f85852x;
        C22127a c22127a = ((C22128b) c0237p.f814z).f85851w;
        InterfaceC39171c interfaceC39171c = c22127a.f85847a;
        EnumC39181m enumC39181m2 = c22127a.f85848b;
        InterfaceC17915v interfaceC17915vM716w = c0237p.m716w();
        C0237p c0237p2 = c22128b.f85852x;
        long jM670A = c0237p2.m670A();
        C23226c c23226c2 = (C23226c) c0237p2.f813y;
        c0237p2.m686Q(nodeCoordinator);
        c0237p2.m689T(enumC39181m);
        c0237p2.m685P(interfaceC17915v);
        c0237p2.m690U(j7);
        c0237p2.f813y = c23226c;
        interfaceC17915v.mo51426q();
        try {
            interfaceC0245r.mo459O(this);
            interfaceC17915v.mo51417g();
            c0237p2.m686Q(interfaceC39171c);
            c0237p2.m689T(enumC39181m2);
            c0237p2.m685P(interfaceC17915vM716w);
            c0237p2.m690U(jM670A);
            c0237p2.f813y = c23226c2;
            this.f816x = interfaceC0245r2;
        } catch (Throwable th3) {
            interfaceC17915v.mo51417g();
            c0237p2.m686Q(interfaceC39171c);
            c0237p2.m689T(enumC39181m2);
            c0237p2.m685P(interfaceC17915vM716w);
            c0237p2.m690U(jM670A);
            c0237p2.f813y = c23226c2;
            throw th3;
        }
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: d */
    public final long mo731d() {
        return this.f815w.mo731d();
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: d0 */
    public final void mo732d0(long j7, long j13, long j14, float f13, int i13, InterfaceC17912t0 interfaceC17912t0) {
        this.f815w.mo732d0(j7, j13, j14, f13, i13, interfaceC17912t0);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: e0 */
    public final float mo733e0(int i13) {
        return this.f815w.mo733e0(i13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: f0 */
    public final float mo734f0(float f13) {
        return f13 / this.f815w.getDensity();
    }

    @Override // p636y3.InterfaceC39171c
    public final float getDensity() {
        return this.f815w.getDensity();
    }

    @Override // p270k2.InterfaceC22131e
    public final EnumC39181m getLayoutDirection() {
        return this.f815w.f85851w.f85848b;
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: h */
    public final long mo735h(float f13) {
        return this.f815w.mo735h(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: i */
    public final long mo736i(long j7) {
        return this.f815w.mo736i(j7);
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: k0 */
    public final void mo737k0(long j7, float f13, float f14, long j13, long j14, float f15, AbstractC22132f abstractC22132f) {
        this.f815w.mo737k0(j7, f13, f14, j13, j14, f15, abstractC22132f);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: l */
    public final float mo738l(long j7) {
        return this.f815w.mo738l(j7);
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: m */
    public final void mo739m(AbstractC17911t abstractC17911t, long j7, long j13, long j14, float f13, AbstractC22132f abstractC22132f) {
        this.f815w.mo739m(abstractC17911t, j7, j13, j14, f13, abstractC22132f);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: m0 */
    public final float getFontScale() {
        return this.f815w.getFontScale();
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: n0 */
    public final void mo741n0(long j7, long j13, long j14, float f13, AbstractC17921y abstractC17921y, int i13) {
        this.f815w.mo741n0(j7, j13, j14, f13, abstractC17921y, i13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: q */
    public final long mo742q(float f13) {
        return this.f815w.mo742q(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: q0 */
    public final float mo743q0(float f13) {
        return this.f815w.getDensity() * f13;
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: t0 */
    public final C0237p mo744t0() {
        return this.f815w.f85852x;
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: u0 */
    public final void mo745u0(long j7, float f13, long j13, float f14, AbstractC22132f abstractC22132f) {
        this.f815w.mo745u0(j7, f13, j13, f14, abstractC22132f);
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: w */
    public final void mo746w(AbstractC17911t abstractC17911t, float f13, float f14, boolean z4, long j7, long j13, AbstractC22132f abstractC22132f, int i13) {
        this.f815w.mo746w(abstractC17911t, f13, f14, z4, j7, j13, abstractC22132f, i13);
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: x */
    public final void mo747x(AbstractC17911t abstractC17911t, float f13, long j7, float f14, AbstractC22132f abstractC22132f) {
        this.f815w.mo747x(abstractC17911t, f13, j7, f14, abstractC22132f);
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: y0 */
    public final void mo748y0(ArrayList arrayList, long j7, float f13) {
        this.f815w.mo748y0(arrayList, j7, f13);
    }

    @Override // p270k2.InterfaceC22131e
    /* JADX INFO: renamed from: z0 */
    public final void mo749z0(long j7, long j13, long j14, long j15, AbstractC22132f abstractC22132f, float f13, int i13) {
        this.f815w.mo749z0(j7, j13, j14, j15, abstractC22132f, f13, i13);
    }
}
