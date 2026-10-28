package p329n0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p012ab.C0682h0;
import p353o0.C27322f;
import p353o0.C27324h;
import p353o0.C27327k;
import p389p0.C28526h;
import p389p0.InterfaceC28509b0;
import p390p1.C28655q;
import p409q0.C29684h;
import p409q0.C29691o;
import p409q0.C29695s;

/* JADX INFO: renamed from: n0.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C26055h implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103127w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f103128x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28509b0 f103129y;

    public /* synthetic */ C26055h(InterfaceC28509b0 interfaceC28509b0, int i13, int i14) {
        this.f103127w = i14;
        this.f103129y = interfaceC28509b0;
        this.f103128x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f103127w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C26056i c26056i = (C26056i) this.f103129y;
                    C0682h0 c0682h0 = c26056i.f103131b.f103125c;
                    int i13 = this.f103128x;
                    C28526h c28526hM1698m = c0682h0.m1698m(i13);
                    ((C26051d) c28526hM1698m.f115435c).f103122c.invoke(c26056i.f103132c, Integer.valueOf(i13 - c28526hM1698m.f115433a), c28655q, 0);
                } else {
                    c28655q.m87138X();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C0682h0 c0682h1 = ((C27324h) this.f103129y).f109400b.f109398d;
                    int i14 = this.f103128x;
                    C28526h c28526hM1698m2 = c0682h1.m1698m(i14);
                    ((C27322f) c28526hM1698m2.f115435c).f109395c.invoke(C27327k.f109404a, Integer.valueOf(i14 - c28526hM1698m2.f115433a), c28655q2, 6);
                } else {
                    c28655q2.m87138X();
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C28655q c28655q3 = (C28655q) composer3;
                if (c28655q3.m87135U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    C0682h0 c0682h0Mo77527m = ((C29691o) this.f103129y).f121367b.mo77527m();
                    int i15 = this.f103128x;
                    C28526h c28526hM1698m3 = c0682h0Mo77527m.m1698m(i15);
                    ((C29684h) c28526hM1698m3.f115435c).f121317b.invoke(C29695s.f121400a, Integer.valueOf(i15 - c28526hM1698m3.f115433a), c28655q3, 0);
                } else {
                    c28655q3.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
