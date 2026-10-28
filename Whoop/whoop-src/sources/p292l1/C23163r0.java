package p292l1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p026b2.C2314t;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l1.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23163r0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91618w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC23098g1 f91619x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23204y f91620y;

    public /* synthetic */ C23163r0(InterfaceC23098g1 interfaceC23098g1, C23204y c23204y, int i13) {
        this.f91618w = i13;
        this.f91619x = interfaceC23098g1;
        this.f91620y = c23204y;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f91618w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C23067b0.f90984a.m67044b(this.f91620y.f91828b, AbstractC1099a.m3393o(AbstractC23092f1.f91171e, C2314t.f9131w), ((C23104h1) this.f91619x).m67084a(), c28655q, 3120);
                } else {
                    c28655q.m87138X();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Modifier modifierM3393o = AbstractC1099a.m3393o(AbstractC23092f1.f91170d, C2314t.f9131w);
                    InterfaceC23098g1 interfaceC23098g1 = this.f91619x;
                    int iM67084a = ((C23104h1) interfaceC23098g1).m67084a();
                    boolean zM87153g = c28655q2.m87153g(interfaceC23098g1);
                    Object objM87133R = c28655q2.m87133R();
                    if (zM87153g || objM87133R == C28635l.f115821a) {
                        objM87133R = new C23169s0(interfaceC23098g1, 0);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC23092f1.m67072f(modifierM3393o, iM67084a, (Function1) objM87133R, this.f91620y, c28655q2, 6);
                } else {
                    c28655q2.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
