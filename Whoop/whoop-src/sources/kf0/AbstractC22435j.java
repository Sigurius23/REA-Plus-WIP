package kf0;

import a41.C0377m;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b01.C2188i;
import b91.C2886a;
import c41.C4092p2;
import d41.AbstractC11684j;
import d41.C11682h;
import e81.C12840n;
import e81.EnumC12838l;
import f01.C13890q;
import gb1.AbstractC15676d;
import h51.C16934f;
import hy0.C17736e;
import ig0.C18464d;
import ih1.C18522f;
import iz0.AbstractC21048g;
import iz0.C21053l;
import iz0.C21054m;
import java.util.Iterator;
import l01.C23032d;
import l83.C23454a0;
import lf0.C23972t1;
import md0.AbstractC25448c;
import n81.C26453f;
import ny0.C27256h;
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
import p291l0.C22957g;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p736sz0.C33194k1;
import q21.C29850i;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: kf0.j */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\r\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lkf0/k;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Lkf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "Lm91/u;", "item", "", "sectionId", "l", "(Landroidx/compose/ui/Modifier;Lm91/u;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "m", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22435j {
    /* JADX INFO: renamed from: f */
    public static final void m64723f(C22436k state, Function1 function1, Composer composer, int i13) {
        C28655q c28655q;
        Object obj;
        Object next;
        boolean z4;
        C0209i c0209i;
        C0213j c0213j;
        C0209i c0209i2;
        C2305k c2305k;
        boolean z13;
        int i14;
        C28655q c28655q2;
        boolean z14;
        boolean z15;
        Function1 onViewEvent = function1;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-213869778);
        int i15 = (i13 & 6) == 0 ? i13 | (c28655q3.m87157i(state) ? 4 : 2) : i13;
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(onViewEvent) ? 32 : 16;
        }
        int i16 = i15;
        if (c28655q3.m87135U(i16 & 1, (i16 & 19) != 18)) {
            Iterator<T> it = state.m64734e().iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((InterfaceC25312u) next) instanceof C16934f));
            boolean z16 = next != null;
            for (Object obj2 : state.m64734e()) {
                if (((InterfaceC25312u) obj2) instanceof C26453f) {
                    obj = obj2;
                    break;
                }
            }
            boolean z17 = obj != null;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM64730m = m64730m(AbstractC1102d.m3409f(1.0f, c2314t), state.getId());
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q3, 0);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM64730m);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j2);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i3 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i3, c23010xM66775a);
            C0209i c0209i4 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i4, interfaceC28653p1M87165m);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i5);
            }
            C0209i c0209i6 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i6, modifierM118962N);
            String strM64735f = state.getHeaderText();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (strM64735f == null) {
                c28655q3.m87150e0(375607800);
                c28655q3.m87173q(false);
                z4 = z16;
                c2305k = c2305k2;
                c0209i = c0209i5;
                c0213j = c0213j2;
                z13 = false;
                c28655q = c28655q3;
                c0209i2 = c0209i4;
            } else {
                c28655q3.m87150e0(375607801);
                C38072d c38072d = C38072d.f163053a;
                z4 = z16;
                int i17 = C38072d.f163054b;
                C2886a t14 = c38072d.m121952e(c28655q3, i17).getT3();
                long brandWhite = c38072d.m121949b(c28655q3, i17).getBrandWhite();
                boolean z18 = z4 || z17;
                Object objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C22429d(2);
                    c28655q3.m87172p0(objM87133R);
                }
                c0209i = c0209i5;
                c0213j = c0213j2;
                c0209i2 = c0209i4;
                c2305k = c2305k2;
                AbstractC30795n.m94707h(strM64735f, AbstractC15676d.m44099b(c2314t, z18, (Function1) objM87133R), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q3, 0, C2886a.f11498d << 18, 196600);
                c28655q = c28655q3;
                z13 = false;
                c28655q.m87173q(false);
            }
            String strM64733c = state.getBodyText();
            if (strM64733c == null) {
                c28655q.m87150e0(376025339);
                c28655q.m87173q(z13);
                i14 = 8;
            } else {
                c28655q.m87150e0(376025340);
                C21053l c21053l = C21053l.f79834a;
                C38072d c38072d2 = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                C28655q c28655q4 = c28655q;
                i14 = 8;
                C21054m c21054mM58880a = c21053l.m58880a(AbstractC33745d.m106661t(c38072d2, c28655q, i18), c38072d2.m121949b(c28655q, i18).getWhite70(), c38072d2.m121949b(c28655q, i18).getStrain(), 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q4, 0, C21053l.f79835b << 15, 32760);
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 1 * 8, 0.0f, 0.0f, 13);
                boolean z19 = z4 || z17;
                Object objM87133R2 = c28655q4.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C22429d(3);
                    c28655q2 = c28655q4;
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    c28655q2 = c28655q4;
                }
                C28655q c28655q5 = c28655q2;
                AbstractC21048g.m58807M(strM64733c, AbstractC15676d.m44099b(modifierM3398t, z19, (Function1) objM87133R2), false, c21054mM58880a, null, 0, 0, 0, false, c28655q5, C21054m.f79836p << 9, 500);
                c28655q = c28655q5;
                c28655q.m87173q(false);
            }
            if ((state.getHeaderText() == null && state.getBodyText() == null) || state.m64734e().isEmpty()) {
                z14 = true;
                z15 = false;
                c28655q.m87150e0(376735550);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(376679812);
                z14 = true;
                z15 = false;
                AbstractC31061c.m95650z(1, i14, c2314t, c28655q, false);
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(i14), c2305k, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
            c28655q.m87150e0(1399745993);
            for (InterfaceC25312u interfaceC25312uM36029c : state.m64734e()) {
                if (interfaceC25312uM36029c instanceof C12840n) {
                    interfaceC25312uM36029c = C12840n.m36029c((C12840n) interfaceC25312uM36029c, null, null, null, null, null, null, null, null, 0.8f, 255, null);
                }
                AbstractC25303l.m74291r(interfaceC25312uM36029c, AbstractC25448c.m74678B0(), new C18522f(8, interfaceC25312uM36029c, state), function1, c28655q, (C25307p.f99300b << 3) | ((i16 << 6) & 7168), 0);
            }
            onViewEvent = function1;
            AbstractC25012a.m73392y(c28655q, z15, z14, z14);
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18464d(state, onViewEvent, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Modifier m64724g(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1099a.m3396r(applyIf, 16, 0.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Modifier m64725h(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1099a.m3396r(applyIf, 16, 0.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final Modifier m64726i(InterfaceC25312u interfaceC25312u, C22436k c22436k, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1974344108);
        Modifier modifierM64729l = m64729l(C2314t.f9131w, interfaceC25312u, c22436k.getId());
        boolean z4 = (interfaceC25312u instanceof C12840n) && ((C12840n) interfaceC25312u).getOrientation() == EnumC12838l.PIE_BOTTOM;
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = new C22429d(4);
            c28655q.m87172p0(objM87133R);
        }
        Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM64729l, z4, (Function1) objM87133R);
        c28655q.m87173q(false);
        return modifierM44099b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Modifier m64727j(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        C2314t c2314t = C2314t.f9131w;
        return AbstractC1102d.m3428y(AbstractC1102d.m3409f(1.0f, c2314t), null, false, 3).mo3471e(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * 8, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m64728k(C22436k c22436k, Function1 function1, int i13, Composer composer, int i14) {
        m64723f(c22436k, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final Modifier m64729l(Modifier modifier, InterfaceC25312u item, String sectionId) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(item, "item");
        AbstractC22676k.m65750j(sectionId, "sectionId");
        if (item instanceof C17736e) {
            return AbstractC1099a.m3396r(modifier, 0.0f, 16, 1);
        }
        if (item instanceof C11682h) {
            return ((C11682h) item).getType() instanceof AbstractC11684j.e ? AbstractC1099a.m3398t(modifier, 0.0f, 0.0f, 0.0f, 2 * 8, 7) : modifier;
        }
        if (item instanceof C33194k1) {
            return AbstractC1099a.m3398t(modifier, 0.0f, 0.0f, 0.0f, 2 * 8, 7);
        }
        if (item instanceof C23972t1) {
            return AbstractC1099a.m3396r(modifier, 0.0f, 3 * 8, 1);
        }
        if (item instanceof C29850i) {
            return AbstractC1099a.m3392n(modifier, 0.0f, ((float) (-2.5d)) * 8, 1);
        }
        if (item instanceof C2188i) {
            return AbstractC1099a.m3398t(modifier, 0.0f, 0.0f, 0.0f, 2 * 8, 7);
        }
        if (item instanceof C23032d) {
            return AbstractC1099a.m3398t(modifier, 0.0f, 0.0f, 0.0f, ((float) 1.5d) * 8, 7);
        }
        if (item instanceof C0377m) {
            float f13 = 2 * 8;
            return AbstractC1099a.m3398t(modifier, f13, f13, f13, 0.0f, 8);
        }
        if (!(item instanceof C27256h)) {
            if (item instanceof C4092p2) {
                return sectionId.equals("feature_list_section") ? AbstractC1099a.m3398t(modifier, 0.0f, 0.0f, 0.0f, 1 * 8, 7) : modifier;
            }
            return ((item instanceof C13890q) && AbstractC22676k.m65745e(((C13890q) item).getId(), "home_upsell_featured_card")) ? AbstractC1099a.m3398t(modifier, 0.0f, 2 * 8, 0.0f, 0.0f, 13) : modifier;
        }
        if (!AbstractC22676k.m65745e(((C27256h) item).getId(), "coaching_carousel_start_testing_standard_button")) {
            return modifier;
        }
        float f14 = 8;
        float f15 = 1 * f14;
        return AbstractC1099a.m3397s(modifier, f15, f15, f15, 2 * f14);
    }

    /* JADX INFO: renamed from: m */
    public static final Modifier m64730m(Modifier modifier, String sectionId) {
        AbstractC22676k.m65750j(modifier, "<this>");
        AbstractC22676k.m65750j(sectionId, "sectionId");
        return sectionId.equals("faq_section") ? AbstractC1099a.m3396r(modifier, 0.0f, 2 * 8, 1) : modifier;
    }
}
