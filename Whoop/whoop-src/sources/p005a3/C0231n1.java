package p005a3;

import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.compose.p018ui.platform.AndroidComposeView;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import gb.C15647h;
import l83.C23454a0;
import p027b3.C2459w2;
import p040c0.InterfaceC3764o;
import p079d2.ViewOnAttachStateChangeListenerC11482d;
import p098dt.AbstractC12350b;
import p114eb.C12977n0;
import p114eb.C12982q;
import p208i2.C17920x0;
import p208i2.InterfaceC17915v;
import p209i3.C18034p;
import p293l2.C23226c;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p602x1.C37816b;
import p634y1.InterfaceC39030c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: a3.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0231n1 extends AbstractC22680m implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f798w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f799x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f800y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0231n1(int i13, Object obj, Object obj2) {
        super(2);
        this.f798w = i13;
        this.f799x = obj;
        this.f800y = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0059  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f798w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj3 = this.f800y;
        Object obj4 = this.f799x;
        switch (i13) {
            case 0:
                InterfaceC17915v interfaceC17915v = (InterfaceC17915v) obj;
                C23226c c23226c = (C23226c) obj2;
                NodeCoordinator nodeCoordinator = (NodeCoordinator) obj4;
                C0230n0 c0230n0 = nodeCoordinator.f4858O;
                if (!c0230n0.m606Y()) {
                    nodeCoordinator.f4877h0 = true;
                } else {
                    nodeCoordinator.f4874e0 = interfaceC17915v;
                    nodeCoordinator.f4873d0 = c23226c;
                    C0188c2 snapshotObserver = AbstractC0242q0.m750a(c0230n0).getSnapshotObserver();
                    C17920x0 c17920x0 = NodeCoordinator.f4853k0;
                    snapshotObserver.m457a(nodeCoordinator, C0197f.f647z, (C0235o1) obj3);
                    nodeCoordinator.f4877h0 = false;
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                AndroidCompositionLocals_androidKt.m3595a((AndroidComposeView) obj4, (InterfaceC4351m) obj3, (Composer) obj, AbstractC28683x.m87244L(1));
                break;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                C18034p c18034p = (C18034p) obj2;
                ViewOnAttachStateChangeListenerC11482d viewOnAttachStateChangeListenerC11482d = (ViewOnAttachStateChangeListenerC11482d) obj3;
                if (!((C2459w2) obj4).f9602b.m62b(c18034p.f69992g)) {
                    viewOnAttachStateChangeListenerC11482d.m30904l(iIntValue, c18034p);
                    viewOnAttachStateChangeListenerC11482d.f36902H.mo32218s(c23454a0);
                }
                break;
            case 3:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    AbstractC12350b.m34584e((InterfaceC39030c) obj4, (C37816b) obj3, composer, 0);
                } else {
                    C28655q c28655q = (C28655q) composer;
                    if (!c28655q.m87121F()) {
                        AbstractC12350b.m34584e((InterfaceC39030c) obj4, (C37816b) obj3, composer, 0);
                    } else {
                        c28655q.m87138X();
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                C12982q c12982q = (C12982q) obj4;
                if ((((Number) obj2).intValue() & 3) != 2) {
                    C12977n0 c12977n0 = c12982q.f44844x;
                    AbstractC22676k.m65748h(c12977n0, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                    ((C15647h) c12977n0).f58726L.invoke((InterfaceC3764o) obj3, c12982q, composer2, 0);
                } else {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (!c28655q2.m87121F()) {
                        C12977n0 c12977n1 = c12982q.f44844x;
                        AbstractC22676k.m65748h(c12977n1, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                        ((C15647h) c12977n1).f58726L.invoke((InterfaceC3764o) obj3, c12982q, composer2, 0);
                    } else {
                        c28655q2.m87138X();
                    }
                }
                break;
        }
        return c23454a0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0231n1(AndroidComposeView androidComposeView, InterfaceC4351m interfaceC4351m, int i13) {
        super(2);
        this.f798w = 1;
        this.f799x = androidComposeView;
        this.f800y = interfaceC4351m;
    }
}
