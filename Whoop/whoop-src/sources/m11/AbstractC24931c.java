package m11;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import gy0.AbstractC16272a;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24671c;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: m11.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lm11/d;", "state", "Ll83/a0;", "e", "(Landroidx/compose/ui/Modifier;Lm11/d;Landroidx/compose/runtime/Composer;II)V", "Lm11/a;", "cell", "c", "(Landroidx/compose/ui/Modifier;Lm11/a;Landroidx/compose/runtime/Composer;II)V", "a", "Lm11/d;", "exerciseBreakdownPreviewState", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24931c {

    /* JADX INFO: renamed from: a */
    private static final C24932d f97626a = new C24932d(3, AbstractC37056f.m118959K("REPS", "WEIGHT", "TIME"), AbstractC37056f.m118958J(AbstractC37056f.m118959K(new C24929a("8", null, null, null), new C24929a("150", "lbs", null, null), new C24929a("45", "sec", Integer.valueOf(AbstractC16272a.f61936I0), null))));

    /* JADX INFO: renamed from: c */
    private static final void m73032c(Modifier modifier, C24929a c24929a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C24929a c24929a2;
        Modifier modifier3;
        C17919x c17919xM31989h;
        long jM95624D;
        C2314t c2314t;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2080369074);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            c24929a2 = c24929a;
            i15 |= c28655q.m87153g(c24929a2) ? 32 : 16;
        } else {
            c24929a2 = c24929a;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t2 : modifier2;
            C2306l c2306l = C2299e.f9109L;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 8 * 0.5f;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            EnumC39333f valueColorKey = c24929a2.getValueColorKey();
            if (valueColorKey == null) {
                c28655q.m87150e0(1884413464);
                c28655q.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q.m87150e0(2138997513);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, valueColorKey.mo134584toComposableColorWaAFU9c(c28655q, 0));
            }
            if (c17919xM31989h == null) {
                c28655q.m87150e0(2138999328);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(2138996941);
                c28655q.m87173q(false);
                jM95624D = c17919xM31989h.f69639a;
            }
            Modifier modifier5 = modifier4;
            String value = c24929a2.getValue();
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(value, null, jM95624D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN6(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            String units = c24929a.getUnits();
            if (units == null) {
                c28655q.m87150e0(1884668253);
                c28655q.m87173q(false);
                z4 = false;
                c2314t = c2314t2;
            } else {
                c28655q.m87150e0(1884668254);
                c2314t = c2314t2;
                AbstractC30795n.m94707h(units, AbstractC1099a.m3392n(c2314t2, 0.0f, ((float) (-0.5d)) * 4, 1), c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196600);
                c28655q = c28655q;
                z4 = false;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            Integer achievementIconRes = c24929a.getAchievementIconRes();
            if (achievementIconRes == null) {
                c28655q.m87150e0(954693944);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(954693945);
                float f14 = 4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(achievementIconRes.intValue(), c28655q, 6), null, AbstractC1099a.m3392n(AbstractC1102d.m3419p(4.0f * f14, AbstractC1099a.m3398t(c2314t, f13, 0.0f, 0.0f, 0.0f, 14)), 0.0f, ((float) (-0.5d)) * f14, 1), C17919x.f69637n, c28655q, 3120, 0);
                c28655q.m87173q(z4);
            }
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24671c(modifier3, c24929a, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m73033d(Modifier modifier, C24929a c24929a, int i13, int i14, Composer composer, int i15) {
        m73032c(modifier, c24929a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m73034e(Modifier modifier, C24932d state, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        double d3;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1097852719);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q2.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(state) ? 32 : 16;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            modifier3 = i16 != 0 ? c2314t : modifier2;
            float f13 = 1.0f;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier3);
            int i17 = 6;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q2, 6);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            c28655q2.m87150e0(508080271);
            int numberOfColumns = state.getNumberOfColumns();
            int i18 = 0;
            while (true) {
                d3 = 0.0d;
                if (i18 >= numberOfColumns) {
                    break;
                }
                if (f13 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f13, true);
                String str = (String) AbstractC25265s.m74102I0(i18, state.m73038c());
                if (str == null) {
                    str = "";
                }
                C38072d c38072d = C38072d.f163053a;
                C28655q c28655q3 = c28655q2;
                AbstractC30795n.m94707h(str, layoutWeightElement, c38072d.m121949b(c28655q2, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getH5(), null, c28655q3, 0, 0, 196600);
                i18++;
                c28655q2 = c28655q3;
                numberOfColumns = numberOfColumns;
                i17 = i17;
                c2314t = c2314t;
                f13 = 1.0f;
            }
            c28655q = c28655q2;
            C2314t c2314t2 = c2314t;
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            c28655q.m87150e0(371887198);
            Iterator<T> it = state.m73037b().iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                C2314t c2314t3 = c2314t2;
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t3);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9109L, c28655q, 54);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                double d14 = d3;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                C0209i c0209i5 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                c28655q.m87150e0(-1549286592);
                int numberOfColumns2 = state.getNumberOfColumns();
                for (int i19 = 0; i19 < numberOfColumns2; i19++) {
                    C24929a c24929a = (C24929a) AbstractC25265s.m74102I0(i19, list);
                    if (c24929a != null) {
                        c28655q.m87150e0(256431852);
                        if (1.0f <= d14) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        m73032c(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c24929a, c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(256628733);
                        if (1.0f <= d14) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        AbstractC22989q.m66760a(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c28655q, 0);
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                c2314t2 = c2314t3;
                d3 = d14;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24671c(modifier3, state, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m73035f(Modifier modifier, C24932d c24932d, int i13, int i14, Composer composer, int i15) {
        m73034e(modifier, c24932d, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
