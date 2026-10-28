package p667z0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4353o;
import l83.C23454a0;
import p025b1.InterfaceC2215f;
import p390p1.C28655q;
import p601x0.InterfaceC37796g;

/* JADX INFO: renamed from: z0.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C39925g implements InterfaceC4353o {

    /* JADX INFO: renamed from: x */
    public static final C39925g f172359x = new C39925g(0);

    /* JADX INFO: renamed from: y */
    public static final C39925g f172360y = new C39925g(1);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f172361w;

    public /* synthetic */ C39925g(int i13) {
        this.f172361w = i13;
    }

    @Override // c93.InterfaceC4353o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i13;
        int i14;
        switch (this.f172361w) {
            case 0:
                InterfaceC37796g interfaceC37796g = (InterfaceC37796g) obj;
                InterfaceC2215f interfaceC2215f = (InterfaceC2215f) obj2;
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj3;
                Composer composer = (Composer) obj4;
                int iIntValue = ((Number) obj5).intValue();
                if ((iIntValue & 6) == 0) {
                    i13 = ((iIntValue & 8) == 0 ? ((C28655q) composer).m87153g(interfaceC37796g) : ((C28655q) composer).m87157i(interfaceC37796g) ? 4 : 2) | iIntValue;
                } else {
                    i13 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i13 |= (iIntValue & 64) == 0 ? ((C28655q) composer).m87153g(interfaceC2215f) : ((C28655q) composer).m87157i(interfaceC2215f) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i13 |= ((C28655q) composer).m87157i(interfaceC4339a) ? 256 : 128;
                }
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(i13 & 1, (i13 & 1171) != 1170)) {
                    AbstractC39927i.m128087c(interfaceC37796g, interfaceC2215f, interfaceC4339a, c28655q, i13 & 1022);
                } else {
                    c28655q.m87138X();
                }
                break;
            default:
                InterfaceC37796g interfaceC37796g2 = (InterfaceC37796g) obj;
                InterfaceC2215f interfaceC2215f2 = (InterfaceC2215f) obj2;
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) obj3;
                Composer composer2 = (Composer) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i14 = ((iIntValue2 & 8) == 0 ? ((C28655q) composer2).m87153g(interfaceC37796g2) : ((C28655q) composer2).m87157i(interfaceC37796g2) ? 4 : 2) | iIntValue2;
                } else {
                    i14 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i14 |= (iIntValue2 & 64) == 0 ? ((C28655q) composer2).m87153g(interfaceC2215f2) : ((C28655q) composer2).m87157i(interfaceC2215f2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i14 |= ((C28655q) composer2).m87157i(interfaceC4339a2) ? 256 : 128;
                }
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
                    AbstractC39927i.m128087c(interfaceC37796g2, interfaceC2215f2, interfaceC4339a2, c28655q2, i14 & 1022);
                } else {
                    c28655q2.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
