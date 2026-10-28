package p741vn1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import gy0.AbstractC16276e;
import gy0.AbstractC16277f;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p707gt1.C16193g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import ve.C35916a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: vn1.h, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0003\u001a\u00020\u00012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onComplete", "c", "(Lc93/a;Landroidx/compose/runtime/Composer;II)V", "home-notifications-center_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function0 {
    /* JADX INFO: renamed from: c */
    public static final void m115217c(InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        InterfaceC4339a interfaceC4339a2;
        int i15;
        InterfaceC4339a interfaceC4339a3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1373540886);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            interfaceC4339a2 = interfaceC4339a;
        } else if ((i13 & 6) == 0) {
            interfaceC4339a2 = interfaceC4339a;
            i15 = i13 | (c28655q.m87157i(interfaceC4339a2) ? 4 : 2);
        } else {
            interfaceC4339a2 = interfaceC4339a;
            i15 = i13;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C35916a(17);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a3 = interfaceC4339a2;
            }
            C22949e c22949e = AbstractC22977m.f90650a;
            C22971k c22971kM66748k = AbstractC22977m.m66748k(2 * 8, C2299e.f9108K);
            C2305k c2305k = C2299e.f9111N;
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(35 * f13, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66748k, c2305k, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC35684p.m113047h(AbstractC34132o.m107879c(0.5f, AbstractC1102d.m3419p(12 * f13, c2314t)), InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62209c)), false, 0.0f, 1, interfaceC4339a3, null, null, null, c28655q, ((i15 << 15) & 458752) | 24966, 456);
            String strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62368q1, c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21273g, null, c38072d.m121949b(c28655q, i17).getWhite20(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getT3(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            interfaceC4339a2 = interfaceC4339a3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16193g(interfaceC4339a2, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m115218d() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m115219e(InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m115217c(interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
