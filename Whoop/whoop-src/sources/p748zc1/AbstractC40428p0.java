package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import kd1.AbstractC22399k;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p01.AbstractC28586f;
import p01.C28582b;
import p01.EnumC28588h;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import wr0.C37564y;

/* JADX INFO: renamed from: zc1.p0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a#\u0010\u0006\u001a\u00020\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Ll83/a0;", "c", "(Landroidx/compose/runtime/Composer;I)V", "", "Lp01/b;", "states", "e", "([Lp01/b;Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40428p0 {
    /* JADX INFO: renamed from: c */
    public static final void m130572c(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1811434916);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f13, AbstractC1102d.m3407d(1.0f, c2314t));
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
            AbstractC22399k.m64473c("Steps", c28655q, 6);
            C28582b c28582b = new C28582b(6, 0, 0.0f, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, null, null, 1048572, null);
            C28582b c28582b2 = new C28582b(6, 3, 0.0f, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, null, null, 1048572, null);
            Boolean bool = Boolean.TRUE;
            C28582b[] c28582bArr = {c28582b, c28582b2, new C28582b(6, 6, 0.0f, null, null, null, bool, null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, null, null, 1048508, null)};
            int i14 = C28582b.f115652u;
            m130574e(c28582bArr, c28655q, i14);
            float f14 = f13 * 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("Percentage", c28655q, 6);
            EnumC28588h enumC28588h = EnumC28588h.PERCENTAGE;
            m130574e(new C28582b[]{new C28582b(0, 0, 0.0f, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, enumC28588h, null, 786427, null), new C28582b(0, 0, 0.45f, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, enumC28588h, null, 786427, null), new C28582b(0, 0, 1.0f, null, null, null, bool, null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, enumC28588h, null, 786363, null)}, c28655q, i14);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("Custom Label", c28655q, 6);
            m130574e(new C28582b[]{new C28582b(4, 2, 0.0f, "2", null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, null, null, 1048564, null), new C28582b(0, 0, 0.6f, "6h", null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, enumC28588h, null, 786419, null)}, c28655q, i14);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("Empty", c28655q, 6);
            m130574e(new C28582b[]{new C28582b(0, 0, 0.0f, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, false, false, 0L, null, null, 1048575, null)}, c28655q, i14);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40363j(i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m130573d(int i13, Composer composer, int i14) {
        m130572c(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    private static final void m130574e(C28582b[] c28582bArr, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1351795505);
        c28655q.m87144b0(1995358018, Integer.valueOf(c28582bArr.length));
        int i14 = (c28655q.m87149e(c28582bArr.length) ? 4 : 0) | i13;
        for (C28582b c28582b : c28582bArr) {
            i14 |= (i13 & 8) == 0 ? c28655q.m87153g(c28582b) : c28655q.m87157i(c28582b) ? 4 : 0;
        }
        c28655q.m87173q(false);
        if ((i14 & 14) == 0) {
            i14 |= 2;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 1 * f13, 1);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * f13), C2299e.f9107J, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(70357418);
            for (C28582b c28582b2 : c28582bArr) {
                AbstractC28586f.m86944i(null, c28582b2, c28655q, C28582b.f115652u << 3, 1);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37564y(c28582bArr, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m130575f(C28582b[] c28582bArr, int i13, Composer composer, int i14) {
        m130574e(c28582bArr, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
