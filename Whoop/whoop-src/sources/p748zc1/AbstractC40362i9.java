package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import hc3.AbstractC17176i;
import i81.C18216b;
import java.util.Iterator;
import kd1.AbstractC22399k;
import l83.C23454a0;
import l83.C23465k;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p026b2.InterfaceC2300f;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import q83.AbstractC30060g;
import s81.AbstractC32264g;
import s81.C32265h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.i9 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40362i9 {
    /* JADX INFO: renamed from: b */
    public static final void m130059b(Composer composer, int i13) {
        C2305k c2305k = C2299e.f9110M;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1586008832);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC30060g.m92116f0(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
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
            AbstractC22399k.m64473c("Fill text beside hugging image", c28655q, 6);
            C18216b c18216b = C18216b.f70794a;
            C32265h c32265hM52408g = c18216b.m52408g();
            int i14 = C32265h.f133531i << 3;
            AbstractC32264g.m100405i(null, c32265hM52408g, null, c28655q, i14, 5);
            float f13 = 4;
            float f14 = f13 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("Hugging emoji and ring beside fill text", c28655q, 6);
            AbstractC32264g.m100405i(null, c18216b.m52409h(), null, c28655q, i14, 5);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("Weighted 1:9 day rows", c28655q, 6);
            c28655q.m87150e0(1965816139);
            Iterator<T> it = c18216b.m52406e().iterator();
            while (it.hasNext()) {
                C28655q c28655q2 = c28655q;
                AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, null, c28655q2, 0, 14);
                c28655q = c28655q2;
            }
            AbstractC17176i.m48516r(c28655q, false, c2314t, f14, c28655q);
            AbstractC22399k.m64473c("Main axis alignment: start, center, end", c28655q, 6);
            c28655q.m87150e0(1965824799);
            for (C23465k c23465k : AbstractC37056f.m118959K(new C23465k(c2305k, "start"), new C23465k(C2299e.f9111N, "center"), new C23465k(C2299e.f9112O, "end"))) {
                AbstractC32264g.m100405i(null, C18216b.f70794a.m52411j((InterfaceC2300f) c23465k.f92937w, (String) c23465k.f92938x), null, c28655q, C32265h.f133531i << 3, 5);
            }
            AbstractC17176i.m48516r(c28655q, false, c2314t, f14, c28655q);
            AbstractC22399k.m64473c("Spacer distribution with padding", c28655q, 6);
            C18216b c18216b2 = C18216b.f70794a;
            C32265h c32265hM52410i = c18216b2.m52410i();
            int i15 = C32265h.f133531i << 3;
            AbstractC32264g.m100405i(null, c32265hM52410i, null, c28655q, i15, 5);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("Cross axis fill, items at end", c28655q, 6);
            AbstractC32264g.m100405i(AbstractC1102d.m3411h(15 * f13, c2314t), c18216b2.m52405d(), null, c28655q, i15 | 6, 4);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("Equal fill", c28655q, 6);
            AbstractC32264g.m100405i(null, c18216b2.m52407f(), null, c28655q, i15, 5);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40506w8(i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m130060c(int i13, Composer composer, int i14) {
        m130059b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
