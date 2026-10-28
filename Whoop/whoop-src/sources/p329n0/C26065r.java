package p329n0;

import e93.AbstractC12889b;
import java.util.Collection;
import m83.AbstractC25265s;
import p108e4.AbstractC12667a;
import p180h0.InterfaceC16413k2;
import p180h0.InterfaceC16478x2;
import p390p1.C28617g1;
import p390p1.C28621h1;
import p409q0.AbstractC29701y;
import p409q0.C29678d;
import se.AbstractC32410a;

/* JADX INFO: renamed from: n0.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C26065r implements InterfaceC16413k2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f103208a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC16413k2 f103209b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC16478x2 f103210c;

    public /* synthetic */ C26065r(InterfaceC16413k2 interfaceC16413k2, InterfaceC16478x2 interfaceC16478x2, int i13) {
        this.f103208a = i13;
        this.f103210c = interfaceC16478x2;
        this.f103209b = interfaceC16413k2;
    }

    @Override // p180h0.InterfaceC16413k2
    /* JADX INFO: renamed from: a */
    public final float mo29373a(float f13) {
        switch (this.f103208a) {
            case 0:
                break;
        }
        return this.f103209b.mo29373a(f13);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public final int m77557b(int i13) {
        Object obj;
        switch (this.f103208a) {
            case 0:
                C26061n c26061nM77565h = ((C26068u) this.f103210c).m77565h();
                if (c26061nM77565h.f103177k.isEmpty()) {
                    return 0;
                }
                int iM77558c = m77558c();
                if (i13 > m77560e() || iM77558c > i13) {
                    return ((i13 - m77558c()) * AbstractC32410a.m101039k0(c26061nM77565h)) - m77559d();
                }
                ?? r10 = c26061nM77565h.f103177k;
                int size = ((Collection) r10).size();
                int i14 = 0;
                while (true) {
                    if (i14 < size) {
                        obj = r10.get(i14);
                        if (((C26062o) ((InterfaceC26054g) obj)).f103184a != i13) {
                            i14++;
                        }
                    } else {
                        obj = null;
                    }
                }
                InterfaceC26054g interfaceC26054g = (InterfaceC26054g) obj;
                if (interfaceC26054g != null) {
                    return ((C26062o) interfaceC26054g).f103198o;
                }
                return 0;
            default:
                AbstractC29701y abstractC29701y = (AbstractC29701y) this.f103210c;
                return (int) (AbstractC12889b.m36286p(AbstractC12667a.m35468t(abstractC29701y) + ((long) AbstractC12889b.m36258X(((abstractC29701y.m91165o() * (i13 - abstractC29701y.m91162k())) - (((C28617g1) abstractC29701y.f121433d.f93080d).m87022x() * abstractC29701y.m91165o())) + 0)), abstractC29701y.f121437h, abstractC29701y.f121436g) - AbstractC12667a.m35468t(abstractC29701y));
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m77558c() {
        switch (this.f103208a) {
            case 0:
                return ((C28621h1) ((C26068u) this.f103210c).f103222e.f91958b).m87024x();
            default:
                return ((AbstractC29701y) this.f103210c).f121434e;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m77559d() {
        switch (this.f103208a) {
            case 0:
                return ((C28621h1) ((C26068u) this.f103210c).f103222e.f91959c).m87024x();
            default:
                return ((AbstractC29701y) this.f103210c).f121435f;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: e */
    public final int m77560e() {
        switch (this.f103208a) {
            case 0:
                InterfaceC26054g interfaceC26054g = (InterfaceC26054g) AbstractC25265s.m74114R0(((C26068u) this.f103210c).m77565h().f103177k);
                if (interfaceC26054g != null) {
                    return ((C26062o) interfaceC26054g).f103184a;
                }
                return 0;
            default:
                return ((C29678d) AbstractC25265s.m74112P0(((AbstractC29701y) this.f103210c).m91163l().f121381a)).f121294a;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m77561f(int i13, int i14) {
        switch (this.f103208a) {
            case 0:
                ((C26068u) this.f103210c).m77568k(i13, i14);
                break;
            default:
                AbstractC29701y abstractC29701y = (AbstractC29701y) this.f103210c;
                abstractC29701y.m91171w(i14 / abstractC29701y.m91165o(), i13, true);
                break;
        }
    }
}
