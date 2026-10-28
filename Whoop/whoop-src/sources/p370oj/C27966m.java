package p370oj;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.Action;
import com.amplitude.android.engagement.types.Nudge;
import com.amplitude.android.engagement.types.SimulationContext;
import hg3.AbstractC17269i;
import l83.C23454a0;
import o73.C27648a;
import p005a3.C0271z0;
import p026b2.C2314t;
import p048ce.AbstractC4482w;
import p132f0.C13825t;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p291l0.C22976l1;
import p292l1.AbstractC23096g;
import p292l1.AbstractC23124k3;
import p292l1.AbstractC23138n;
import p292l1.C23090f;
import p292l1.C23132m;
import p342nj.C26741f;
import p354o1.AbstractC27372k;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p463rj.AbstractC31484o;
import p463rj.C31477h;
import p525uj.AbstractC35027e;
import p525uj.C35023a;
import p525uj.C35024b;
import p525uj.C35031i;
import p602x1.AbstractC37817c;
import p636y3.C39174f;
import p715kotlin.jvm.internal.AbstractC22680m;
import sj.C32555f;

/* JADX INFO: renamed from: oj.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C27966m extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f112785E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f112786w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f112787x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f112788y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f112789z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27966m(Nudge nudge, SimulationContext simulationContext, C4861a c4861a, boolean z4, int i13) {
        super(2);
        this.f112787x = nudge;
        this.f112788y = simulationContext;
        this.f112785E = c4861a;
        this.f112789z = z4;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f112786w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj3 = this.f112785E;
        Object obj4 = this.f112788y;
        Object obj5 = this.f112787x;
        switch (i13) {
            case 0:
                ((Number) obj2).intValue();
                int iM87244L = AbstractC28683x.m87244L(73);
                C27648a.m83583f((Nudge) obj5, (SimulationContext) obj4, this.f112789z, (InterfaceC4339a) obj3, (Composer) obj, iM87244L);
                break;
            case 1:
                ((Number) obj2).intValue();
                AbstractC4482w.m14007q((Nudge) obj5, (SimulationContext) obj4, (C4861a) obj3, this.f112789z, (Composer) obj, AbstractC28683x.m87244L(585));
                break;
            case 2:
                Composer composer = (Composer) obj;
                int i14 = 2;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    }
                }
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87152f0(1263696394);
                float f13 = ((C39174f) c28655q2.m87161k(AbstractC35027e.f148224j)).f168413w;
                c28655q2.m87173q(false);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(f13, C2314t.f9131w));
                float f14 = 0;
                C22976l1 c22976l1 = new C22976l1(f14, f14, f14, f14);
                C22976l1 c22976l2 = AbstractC23096g.f91202a;
                c28655q2.m87152f0(-1524190068);
                C28674u2 c28674u2 = AbstractC35027e.f148221g;
                C35023a c35023a = (C35023a) c28655q2.m87161k(c28674u2);
                c28655q2.m87173q(false);
                long j7 = c35023a.f148203a;
                c28655q2.m87152f0(-1524190068);
                C35023a c35023a2 = (C35023a) c28655q2.m87161k(c28674u2);
                c28655q2.m87173q(false);
                long j13 = c35023a2.f148205c;
                long j14 = C17919x.f69637n;
                C23132m c23132m = (C23132m) c28655q2.m87161k(AbstractC23138n.f91494a);
                C23090f c23090f = c23132m.f91433W;
                if (c23090f == null) {
                    c23090f = new C23090f(AbstractC23138n.m67117c(c23132m, AbstractC27372k.f109889a), AbstractC23138n.m67117c(c23132m, AbstractC27372k.f109898j), C17919x.m51541c(AbstractC27372k.f109893e, AbstractC23138n.m67117c(c23132m, AbstractC27372k.f109891c)), C17919x.m51541c(AbstractC27372k.f109895g, AbstractC23138n.m67117c(c23132m, AbstractC27372k.f109894f)));
                    c23132m.f91433W = c23090f;
                }
                C23090f c23090fM67066a = c23090f.m67066a(j7, j13, j14, j14);
                c28655q2.m87152f0(-1524190068);
                C35023a c35023a3 = (C35023a) c28655q2.m87161k(c28674u2);
                c28655q2.m87173q(false);
                C13825t c13825tM48880a = AbstractC17269i.m48880a(2, c35023a3.f148204b);
                c28655q2.m87152f0(-828405687);
                InterfaceC17869a1 interfaceC17869a1 = ((C35024b) c28655q2.m87161k(AbstractC35027e.f148222h)).f148207a;
                c28655q2.m87173q(false);
                C32555f c32555f = (C32555f) obj5;
                Action action = (Action) obj4;
                boolean zM87153g = c28655q2.m87153g(c32555f) | c28655q2.m87153g(action);
                Object objM87133R = c28655q2.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C0271z0(26, c32555f, action);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC23124k3.m67097a((InterfaceC4339a) objM87133R, modifierM3409f, this.f112789z, interfaceC17869a1, c23090fM67066a, null, c13825tM48880a, c22976l1, AbstractC37817c.m121341b(-2109302217, c28655q2, new C26741f((String) obj3, i14)), c28655q2, 817889280, 288);
                break;
            default:
                ((Number) obj2).intValue();
                int iM87244L2 = AbstractC28683x.m87244L(1);
                AbstractC31484o.m96952d(this.f112789z, (C31477h) obj5, (C35031i) obj4, (Modifier) obj3, (Composer) obj, iM87244L2);
                break;
        }
        return c23454a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27966m(Nudge nudge, SimulationContext simulationContext, boolean z4, InterfaceC4339a interfaceC4339a, int i13) {
        super(2);
        this.f112787x = nudge;
        this.f112788y = simulationContext;
        this.f112789z = z4;
        this.f112785E = interfaceC4339a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27966m(C32555f c32555f, Action action, int i13, boolean z4, String str) {
        super(2);
        this.f112787x = c32555f;
        this.f112788y = action;
        this.f112789z = z4;
        this.f112785E = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27966m(boolean z4, C31477h c31477h, C35031i c35031i, Modifier modifier, int i13) {
        super(2);
        this.f112789z = z4;
        this.f112787x = c31477h;
        this.f112788y = c35031i;
        this.f112785E = modifier;
    }
}
