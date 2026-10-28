package p746ye1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p707gt1.C16193g;
import p715kotlin.Metadata;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import yc2.C39434a;

/* JADX INFO: renamed from: ye1.a, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0003\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onBack", "c", "(Lc93/a;Landroidx/compose/runtime/Composer;II)V", "entitlements-ui_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function0 {
    /* JADX INFO: renamed from: c */
    public static final void m126132c(InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        InterfaceC4339a interfaceC4339a2;
        int i15;
        InterfaceC4339a interfaceC4339a3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-78059018);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            interfaceC4339a2 = interfaceC4339a;
        } else if ((i13 & 6) == 0) {
            interfaceC4339a2 = interfaceC4339a;
            i15 = (c28655q.m87157i(interfaceC4339a2) ? 4 : 2) | i13;
        } else {
            interfaceC4339a2 = interfaceC4339a;
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C39434a(5);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a3 = interfaceC4339a2;
            }
            AbstractC33199m0.m105214F(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC16277f.f62364p1), false, null, 6, null), AbstractC8693b.m21267a(), null, AbstractC8693b.m21277k(AbstractC16277f.f62360o1), interfaceC4339a3, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9) | ((i15 << 12) & 57344), 0, 4068);
            interfaceC4339a2 = interfaceC4339a3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16193g(interfaceC4339a2, i13, i14, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m126133d() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m126134e(InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m126132c(interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
