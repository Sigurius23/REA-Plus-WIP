package jd2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import cp0.C10941a;
import e81.C12828g;
import gy0.AbstractC16272a;
import hd2.C17199a;
import hy0.C17737e0;
import io2.C20769k0;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p181h2.C16620e;
import p208i2.AbstractC17897m;
import p208i2.C17891j;
import p208i2.C17903p;
import p270k2.C22135i;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import pf.AbstractC29125c;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: jd2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a3\u0010\u000b\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lhd2/a;", "state", "Ll83/a0;", "n", "(Landroidx/compose/ui/Modifier;Lhd2/a;Landroidx/compose/runtime/Composer;II)V", "", "Ll83/k;", "", "coordinates", "i", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "p", "(Landroidx/compose/runtime/Composer;I)V", "", "activityIconUrl", "g", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "share_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21613b {
    /* JADX INFO: renamed from: g */
    private static final void m60783g(String str, Composer composer, int i13) {
        int i14;
        AbstractC22403o aVar;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1904138690);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            if (str != null) {
                aVar = new AbstractC22403o.c(str, AbstractC16272a.f61968N2, 0, 0, 12, null);
            } else {
                aVar = new AbstractC22403o.a(AbstractC16272a.f61968N2);
            }
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(aVar, null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(40, C2314t.f9131w), null, null, 0.0f, new C17903p(C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 5), c28655q, 432, 56);
            c28655q = c28655q;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10941a(str, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m60784h(String str, int i13, Composer composer, int i14) {
        m60783g(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final void m60785i(List<C23465k> list, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        List<C23465k> list2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1165721768);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(list) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifier2 = modifier;
            if (list.size() < 2) {
                C28677v1 c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C12828g(list, modifier2, i13, i14, 2);
                    return;
                }
                return;
            }
            list2 = list;
            long jM125430y = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite();
            boolean zM87157i = c28655q.m87157i(list2) | c28655q.m87151f(jM125430y);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C21612a(list2, 0, jM125430y);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifier2, (Function1) objM87133R, c28655q, (i15 >> 3) & 14);
            modifier = modifier2;
        } else {
            list2 = list;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u2 = c28655q.m87180u();
        if (c28677v1M87180u2 != null) {
            c28677v1M87180u2.f115982d = new C12828g(list2, modifier, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m60786j(List list, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m60785i(list, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m60787k(List list, long j7, InterfaceC22131e Canvas) {
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Number) ((C23465k) it.next()).f92937w).doubleValue()));
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Double.valueOf(((Number) ((C23465k) it3.next()).f92938x).doubleValue()));
        }
        double dM74122Z0 = AbstractC25265s.m74122Z0(arrayList);
        double dM74118V0 = AbstractC25265s.m74118V0(arrayList);
        double dM74122Z1 = AbstractC25265s.m74122Z0(arrayList2);
        double dM74118V1 = AbstractC25265s.m74118V0(arrayList2);
        double d3 = dM74118V0 - dM74122Z0;
        double d14 = d3 < 1.0E-4d ? 1.0E-4d : d3;
        double d15 = dM74118V1 - dM74122Z1;
        double d16 = d15 < 1.0E-4d ? 1.0E-4d : d15;
        float fM47212d = C16620e.m47212d(Canvas.mo731d()) * 0.1f;
        char c3 = ' ';
        float f13 = 2 * fM47212d;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo731d() >> 32)) - f13;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (Canvas.mo731d() & 4294967295L)) - f13;
        C17891j c17891jM51478a = AbstractC17897m.m51478a();
        int i13 = 0;
        for (Object obj : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C23465k c23465k = (C23465k) obj;
            long jM60788l = m60788l(fM47212d, dM74122Z1, d16, fIntBitsToFloat, fM47212d, dM74118V0, d14, fIntBitsToFloat2, ((Number) c23465k.f92937w).doubleValue(), ((Number) c23465k.f92938x).doubleValue());
            if (i13 == 0) {
                c17891jM51478a.m51462i(Float.intBitsToFloat((int) (jM60788l >> c3)), Float.intBitsToFloat((int) (jM60788l & 4294967295L)));
            } else {
                c17891jM51478a.m51461h(Float.intBitsToFloat((int) (jM60788l >> c3)), Float.intBitsToFloat((int) (jM60788l & 4294967295L)));
            }
            i13 = i14;
            c3 = ' ';
        }
        InterfaceC22131e.m63386z(Canvas, c17891jM51478a, j7, 0.0f, new C22135i(Canvas.mo743q0(3), 0.0f, 1, 1, null, 18), 52);
        float fMo743q0 = Canvas.mo743q0(5);
        C23465k c23465k2 = (C23465k) AbstractC25265s.m74096F0(list);
        double dDoubleValue = ((Number) c23465k2.f92937w).doubleValue();
        double dDoubleValue2 = ((Number) c23465k2.f92938x).doubleValue();
        C23465k c23465k3 = (C23465k) AbstractC25265s.m74112P0(list);
        double dDoubleValue3 = ((Number) c23465k3.f92937w).doubleValue();
        double dDoubleValue4 = ((Number) c23465k3.f92938x).doubleValue();
        InterfaceC22131e.m63379M(Canvas, j7, fMo743q0, m60788l(fM47212d, dM74122Z1, d16, fIntBitsToFloat, fM47212d, dM74118V0, d14, fIntBitsToFloat2, dDoubleValue, dDoubleValue2), 0.0f, null, 120);
        InterfaceC22131e.m63379M(Canvas, j7, fMo743q0, m60788l(fM47212d, dM74122Z1, d16, fIntBitsToFloat, fM47212d, dM74118V0, d14, fIntBitsToFloat2, dDoubleValue3, dDoubleValue4), 0.0f, null, 120);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final long m60788l(float f13, double d3, double d14, float f14, float f15, double d15, double d16, float f16, double d17, double d18) {
        return (((long) Float.floatToRawIntBits(f13 + ((float) (((d18 - d3) / d14) * ((double) f14))))) << 32) | (((long) Float.floatToRawIntBits(f15 + ((float) (((d15 - d17) / d16) * ((double) f16))))) & 4294967295L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m60789m(List list, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m60785i(list, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m60790n(Modifier modifier, C17199a state, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1883253349);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(modifier) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier = c2314t;
            }
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, modifier), 0.0f, 5 * f13, 1);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m60792p(c28655q, 0);
            m60785i(state.m48569b(), AbstractC1102d.m3419p(160, c2314t), c28655q, 48, 0);
            float f14 = 2 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
            m60783g(state.getActivityIconUrl(), c28655q, 0);
            if (state.m48570c().isEmpty()) {
                c28655q.m87150e0(1486242515);
                c28655q.m87173q(false);
            } else {
                AbstractC33745d.m106667z(c28655q, 1486061847, c2314t, f14, c28655q);
                Iterator<T> it = state.m48570c().iterator();
                while (it.hasNext()) {
                    AbstractC25303l.m74290q((C25306o) it.next(), null, null, null, c28655q, C25306o.f99297c, 14);
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(modifier2, i13, state, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m60791o(Modifier modifier, C17199a c17199a, int i13, int i14, Composer composer, int i15) {
        m60790n(modifier, c17199a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m60792p(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-213021575);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(AbstractC16272a.f61988Q4, c28655q, 0), null, AbstractC1102d.m3411h(16, AbstractC1102d.m3424u(75, C2314t.f9131w)), null, null, 0.0f, new C17903p(C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 5), c28655q, 432, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17737e0(i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m60793q(int i13, Composer composer, int i14) {
        m60792p(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
