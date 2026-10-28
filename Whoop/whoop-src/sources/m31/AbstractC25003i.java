package m31;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import hy0.AbstractC17755i2;
import java.util.Iterator;
import l83.C23454a0;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: m31.i */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lm31/j;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "b", "(Landroidx/compose/ui/Modifier;Lm31/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25003i {
    /* JADX INFO: renamed from: b */
    public static final void m73341b(Modifier modifier, C25004j state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        boolean z4;
        boolean z13;
        int i16;
        Function1 onViewEvent = function1;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1741596141);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        int i18 = i15;
        if (c28655q.m87135U(i18 & 1, (i18 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i17 != 0 ? c2314t : modifier2;
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (state.getIsSearching() || state.m73343a().isEmpty()) {
                z4 = true;
                z13 = false;
                c28655q.m87150e0(956112069);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(955791095);
                float f13 = 1 * 8;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), c2305k, c28655q, 6);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                c28655q.m87150e0(1255958102);
                Iterator<T> it = state.m73343a().iterator();
                while (it.hasNext()) {
                    AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, onViewEvent, c28655q, (i18 << 3) & 7168, 6);
                    onViewEvent = function1;
                }
                z13 = false;
                c28655q.m87173q(false);
                z4 = true;
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
                c28655q.m87173q(false);
            }
            c28655q.m87150e0(307937811);
            for (C25000f c25000f : state.m73344b()) {
                AbstractC24999e.m73333c(null, c25000f, function1, c28655q, i18 & 896, 1);
                if (AbstractC22676k.m65745e(c25000f, AbstractC25265s.m74112P0(state.m73344b()))) {
                    i16 = i18;
                    c28655q.m87150e0(19808829);
                    c28655q.m87173q(z13);
                } else {
                    c28655q.m87150e0(19764623);
                    i16 = i18;
                    AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, c28655q, 0, 255);
                    c28655q.m87173q(z13);
                }
                i18 = i16;
            }
            c28655q.m87173q(z13);
            c28655q.m87173q(z4);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25002h(modifier3, state, function1, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m73342c(Modifier modifier, C25004j c25004j, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m73341b(modifier, c25004j, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
