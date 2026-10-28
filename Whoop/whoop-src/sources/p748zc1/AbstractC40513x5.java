package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import jz0.AbstractC22070c;
import kd1.AbstractC22399k;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import w81.AbstractC36945c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.x5 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0005²\u0006\u000e\u0010\u0004\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Ll83/a0;", "c", "(Landroidx/compose/runtime/Composer;I)V", "", "currentPage", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40513x5 {
    /* JADX INFO: renamed from: c */
    public static final void m131184c(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1632774052);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 8;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            c28655q.m87150e0(-415667765);
            int i14 = 0;
            while (i14 < 10) {
                int i15 = i14 + 1;
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11895b.m32005x(0, c28655q);
                }
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                AbstractC22399k.m64473c("Pagination Control - " + i15 + " Item(s)", c28655q, 0);
                int iM131185d = m131185d(interfaceC28601c1);
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C40413n5(5, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC36945c.m118620i(null, i15, iM131185d, (Function1) objM87133R2, null, C40310e1.f174236a.m129622b(), c28655q, 199680, 17);
                C28655q c28655q2 = c28655q;
                i14 = i15;
                AbstractC22070c.m63138d(i14, m131185d(interfaceC28601c1), AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, 6 * f13, 7), 0L, 0L, c28655q2, 384, 24);
                c28655q = c28655q2;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40270a5(i13, 24);
        }
    }

    /* JADX INFO: renamed from: d */
    private static final int m131185d(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: renamed from: e */
    private static final void m131186e(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m131187f(InterfaceC28601c1 interfaceC28601c1, int i13) {
        m131186e(interfaceC28601c1, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m131188g(int i13, Composer composer, int i14) {
        m131184c(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
