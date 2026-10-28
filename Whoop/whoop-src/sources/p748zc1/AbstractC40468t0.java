package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import gy0.AbstractC16272a;
import hy0.C17749h0;
import hy0.EnumC17729c0;
import ih0.AbstractC18489d0;
import kd1.AbstractC22399k;
import kd1.AbstractC22403o;
import l83.C23454a0;
import n51.AbstractC26300g;
import n51.C26294a;
import n51.C26301h;
import n51.EnumC26295b;
import n51.EnumC26296c;
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
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.t0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"", "width", "Lhy0/h0;", "d", "(I)Lhy0/h0;", "Ll83/a0;", "b", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40468t0 {
    /* JADX INFO: renamed from: b */
    public static final void m130857b(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2097009226);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            float f14 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13 * f14, AbstractC1102d.m3409f(1.0f, c2314t));
            C2305k c2305k = C2299e.f9111N;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
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
            AbstractC22399k.m64473c("Centered, SMALL spacing", c28655q, 6);
            float f15 = 2 * f14;
            C26301h c26301h = new C26301h(null, AbstractC37056f.m118959K(m130859d(160), m130859d(100)), f15, c2305k, null, 17, null);
            int i14 = C26301h.f104529f << 3;
            AbstractC26300g.m78043i(null, c26301h, null, c28655q, i14, 5);
            AbstractC18489d0.m53380u(f13, f13, c2314t, c28655q);
            AbstractC22399k.m64473c("Staggered entrance (APPEAR_FROM_TOP)", c28655q, 6);
            AbstractC26300g.m78043i(null, new C26301h(null, AbstractC37056f.m118959K(m130859d(160), m130859d(120), m130859d(90)), f15, c2305k, new C26294a(EnumC26296c.STAGGERED, EnumC26295b.APPEAR_FROM_TOP), 1, null), null, c28655q, i14, 5);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40363j(i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m130858c(int i13, Composer composer, int i14) {
        m130857b(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    private static final C17749h0 m130859d(int i13) {
        return new C17749h0(new AbstractC22403o.a(AbstractC16272a.f61976O4), null, EnumC17729c0.CENTER, Integer.valueOf(i13), Integer.valueOf(i13 / 3), null, false, 98, null);
    }
}
