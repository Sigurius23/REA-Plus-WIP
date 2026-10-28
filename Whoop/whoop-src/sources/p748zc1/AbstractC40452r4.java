package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import kd1.AbstractC22399k;
import l83.C23454a0;
import o21.AbstractC27464b;
import o21.AbstractC27466d;
import o21.C27465c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.r4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40452r4 {
    /* JADX INFO: renamed from: b */
    public static final void m130750b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2025039260);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC22399k.m64473c("Cards", c28655q, 6);
            float f13 = 2;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f13, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            c28655q.m87150e0(-996216610);
            Iterator<T> it = AbstractC27466d.m82885a(c28655q, 0).iterator();
            while (it.hasNext()) {
                AbstractC27464b.m82877d(null, (C27465c) it.next(), null, c28655q, C27465c.f110669e << 3, 5);
                AbstractC18489d0.m53380u(f13, 4, c2314t, c28655q);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40461s3(i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m130751c(int i13, Composer composer, int i14) {
        m130750b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
