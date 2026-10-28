package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import gz0.EnumC16313m0;
import kd1.AbstractC22399k;
import kd1.AbstractC22403o;
import l83.C23454a0;
import n01.C26085b;
import n01.C26088e;
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
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import ry0.C31909d;
import ry0.EnumC31908c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: zc1.i7 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Ll83/a0;", "j", "(Landroidx/compose/runtime/Composer;I)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40360i7 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final void m130029j(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-234692426);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 8;
            float f14 = 2 * f13;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(3 * f13), C2299e.f9110M, c28655q, 6);
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
            AbstractC22399k.m64473c("Single Select List (max_selection = 1)", c28655q, 6);
            C26085b c26085b = new C26085b();
            EnumC16313m0 enumC16313m0 = EnumC16313m0.BLOOD_OXYGEN;
            EnumC31908c enumC31908c = EnumC31908c.MCI_FLOW;
            Object obj = null;
            boolean z4 = false;
            int i14 = 32560;
            DefaultConstructorMarker defaultConstructorMarker = null;
            boolean z13 = false;
            Object obj2 = null;
            boolean z14 = false;
            String str = null;
            boolean z15 = false;
            C26088e c26088e = new C26088e("single-select-example", 1, 0, AbstractC37056f.m118959K(new C31909d("single-light", "Light Flow", "Minimal menstrual flow", enumC16313m0, null, false, enumC31908c, false, false, null, obj, false, z4, null, null, 32560, null), new C31909d("single-medium", "Medium Flow", "Normal menstrual flow", enumC16313m0, null, false, enumC31908c, true, z13, obj, obj2, z4, z14, 0 == true ? 1 : 0, str, i14, defaultConstructorMarker), new C31909d("single-heavy", "Heavy Flow", "Heavy menstrual flow", enumC16313m0, 0 == true ? 1 : 0, z15, enumC31908c, false, z13, obj, obj2, z4, z14, 0 == true ? 1 : 0, str, i14, defaultConstructorMarker)), null, 0 == true ? 1 : 0, z15, 116, null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C40473t5(23);
                c28655q.m87172p0(objM87133R);
            }
            int i15 = (C26088e.f103319h << 3) | 390 | (C26085b.f103311a << 9);
            c26085b.Compose(c2314t, c26088e, (Function1) objM87133R, c28655q, i15);
            AbstractC22399k.m64473c("Multi-Select List (max_selection = 3)", c28655q, 6);
            C26085b c26085b2 = new C26085b();
            EnumC16313m0 enumC16313m1 = EnumC16313m0.ACTIVITY;
            EnumC31908c enumC31908c2 = EnumC31908c.CERVICAL_MUCUS;
            boolean z16 = false;
            Object obj3 = null;
            boolean z17 = false;
            C31909d c31909d = new C31909d("multi-creamy", "Creamy", "Smooth, lotion-like consistency", enumC16313m1, null, false, enumC31908c2, true, z16, null, obj3, false, z17, null, null, 32560, null);
            int i16 = 32560;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            boolean z18 = false;
            boolean z19 = false;
            Object obj4 = null;
            boolean z24 = false;
            String str2 = null;
            C31909d c31909d2 = new C31909d("multi-sticky", "Sticky", "Thick, tacky texture", enumC16313m1, null, z18, enumC31908c2, z16, z19, obj3, obj4, z17, z24, 0 == true ? 1 : 0, str2, i16, defaultConstructorMarker2);
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            String str3 = "multi-select-example";
            C26088e c26088e2 = new C26088e(str3, 3, 0, AbstractC37056f.m118959K(c31909d, c31909d2, new C31909d("multi-egg-white", "Egg White", "Clear, stretchy consistency", enumC16313m1, 0 == true ? 1 : 0, z18, enumC31908c2, true, z19, obj3, obj4, z17, z24, objArr, str2, i16, defaultConstructorMarker2), new C31909d("multi-dry", "Dry", "No noticeable mucus", enumC16313m1, 0 == true ? 1 : 0, z18, enumC31908c2, false, z19, obj3, obj4, z17, z24, objArr2, str2, i16, defaultConstructorMarker2)), null, 0 == true ? 1 : 0, z18, 116, null);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C40473t5(24);
                c28655q.m87172p0(objM87133R2);
            }
            c26085b2.Compose(c2314t, c26088e2, (Function1) objM87133R2, c28655q, i15);
            AbstractC22399k.m64473c("Mandatory Selection (max_selection = 1, min_selection = 1)", c28655q, 6);
            C26085b c26085b3 = new C26085b();
            EnumC16313m0 enumC16313m2 = EnumC16313m0.HOME;
            EnumC31908c enumC31908c3 = EnumC31908c.DEFAULT;
            boolean z25 = false;
            Object obj5 = null;
            boolean z26 = false;
            C26088e c26088e3 = new C26088e("mandatory-select-example", 1, 1, AbstractC37056f.m118959K(new C31909d("mandatory-yes", "Yes", "Tapping the selected cell again can't unselect it", enumC16313m2, null, false, enumC31908c3, true, z25, null, obj5, false, z26, null, null, 32560, null), new C31909d("mandatory-no", "No", "Selecting a different cell swaps the choice", enumC16313m2, null, false, enumC31908c3, z25, false, obj5, null, z26, false, 0 == true ? 1 : 0, null, 32560, null)), null, null, false, 112, null);
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C40473t5(25);
                c28655q.m87172p0(objM87133R3);
            }
            c26085b3.Compose(c2314t, c26088e3, (Function1) objM87133R3, c28655q, i15);
            AbstractC22399k.m64473c("Unlimited Selection (max_selection = 4)", c28655q, 6);
            C26085b c26085b4 = new C26085b();
            int i17 = 32560;
            DefaultConstructorMarker defaultConstructorMarker3 = null;
            AbstractC22403o abstractC22403o = null;
            boolean z27 = false;
            boolean z28 = false;
            Object obj6 = null;
            Object obj7 = null;
            boolean z29 = false;
            boolean z34 = false;
            C39174f c39174f = null;
            String str4 = null;
            boolean z35 = true;
            C26088e c26088e4 = new C26088e("unlimited-select-example", 4, 0, AbstractC37056f.m118959K(new C31909d("unlimited-option1", "Option 1", "First unlimited option", enumC16313m2, abstractC22403o, z27, enumC31908c3, true, z28, obj6, obj7, z29, z34, c39174f, str4, i17, defaultConstructorMarker3), new C31909d("unlimited-option2", "Option 2", "Second unlimited option", enumC16313m2, abstractC22403o, z27, enumC31908c3, false, z28, obj6, obj7, z29, z34, c39174f, str4, i17, defaultConstructorMarker3), new C31909d("unlimited-option3", "Option 3", "Third unlimited option", enumC16313m2, abstractC22403o, z27, enumC31908c3, z35, z28, obj6, obj7, z29, z34, c39174f, str4, i17, defaultConstructorMarker3), new C31909d("unlimited-option4", "Option 4", "Fourth unlimited option", enumC16313m2, abstractC22403o, z27, enumC31908c3, z35, z28, obj6, obj7, z29, z34, c39174f, str4, i17, defaultConstructorMarker3)), null, null, false, 116, null);
            Object objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C40473t5(26);
                c28655q.m87172p0(objM87133R4);
            }
            c26085b4.Compose(c2314t, c26088e4, (Function1) objM87133R4, c28655q, i15);
            AbstractC22399k.m64473c("Bindable Single Select (state_update_value_key)", c28655q, 6);
            C26085b c26085b5 = new C26085b();
            DefaultConstructorMarker defaultConstructorMarker4 = null;
            String str5 = null;
            AbstractC22403o abstractC22403o2 = null;
            boolean z36 = false;
            boolean z37 = true;
            Object obj8 = null;
            Object obj9 = null;
            boolean z38 = false;
            boolean z39 = false;
            C39174f c39174f2 = null;
            String str6 = null;
            C26088e c26088e5 = new C26088e("bindable-country-list", 1, 1, AbstractC37056f.m118959K(new C31909d("AU", "Australia", str5, enumC16313m2, abstractC22403o2, z36, enumC31908c3, false, z37, obj8, obj9, z38, z39, c39174f2, str6, 32436, defaultConstructorMarker4), new C31909d("CA", "Canada", str5, enumC16313m2, abstractC22403o2, z36, enumC31908c3, true, z37, obj8, obj9, z38, z39, c39174f2, str6, 32308, defaultConstructorMarker4), new C31909d("US", "United States", str5, enumC16313m2, abstractC22403o2, z36, enumC31908c3, false, z37, obj8, obj9, z38, z39, c39174f2, str6, 32436, defaultConstructorMarker4)), null, "$country", false, 80, null);
            Object objM87133R5 = c28655q.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C40473t5(27);
                c28655q.m87172p0(objM87133R5);
            }
            c26085b5.Compose(c2314t, c26088e5, (Function1) objM87133R5, c28655q, i15);
            AbstractC22399k.m64473c("Bindable Multi Select (state_update_value_key)", c28655q, 6);
            C26085b c26085b6 = new C26085b();
            DefaultConstructorMarker defaultConstructorMarker5 = null;
            String str7 = null;
            AbstractC22403o abstractC22403o3 = null;
            boolean z44 = false;
            boolean z45 = true;
            Object obj10 = null;
            Object obj11 = null;
            boolean z46 = false;
            boolean z47 = false;
            C39174f c39174f3 = null;
            String str8 = null;
            int i18 = 32436;
            boolean z48 = false;
            C26088e c26088e6 = new C26088e("bindable-activity-list", 2, 0, AbstractC37056f.m118959K(new C31909d("RUNNING", "Running", str7, enumC16313m1, abstractC22403o3, z44, enumC31908c3, true, z45, obj10, obj11, z46, z47, c39174f3, str8, 32308, defaultConstructorMarker5), new C31909d("CYCLING", "Cycling", str7, enumC16313m1, abstractC22403o3, z44, enumC31908c3, z48, z45, obj10, obj11, z46, z47, c39174f3, str8, i18, defaultConstructorMarker5), new C31909d("SWIMMING", "Swimming", str7, enumC16313m1, abstractC22403o3, z44, enumC31908c3, z48, z45, obj10, obj11, z46, z47, c39174f3, str8, i18, defaultConstructorMarker5)), null, "$activities", z44, 84, null);
            Object objM87133R6 = c28655q.m87133R();
            if (objM87133R6 == c28676v0) {
                objM87133R6 = new C40473t5(28);
                c28655q.m87172p0(objM87133R6);
            }
            c26085b6.Compose(c2314t, c26088e6, (Function1) objM87133R6, c28655q, i15);
            AbstractC22399k.m64473c("Disabled List (is_disabled)", c28655q, 6);
            C26085b c26085b7 = new C26085b();
            EnumC31908c enumC31908c4 = EnumC31908c.BLUE_OUTLINED;
            DefaultConstructorMarker defaultConstructorMarker6 = null;
            AbstractC22403o abstractC22403o4 = null;
            boolean z49 = false;
            boolean z52 = true;
            Object obj12 = null;
            Object obj13 = null;
            boolean z54 = false;
            boolean z55 = false;
            C39174f c39174f4 = null;
            String str9 = null;
            C26088e c26088e7 = new C26088e("disabled-list-example", 1, 0, AbstractC37056f.m118959K(new C31909d("disabled-skin-type-1", "Skin Type 1", "The whole list is disabled in one flag", enumC16313m2, abstractC22403o4, z49, enumC31908c4, false, z52, obj12, obj13, z54, z55, c39174f4, str9, 32432, defaultConstructorMarker6), new C31909d("disabled-skin-type-2", "Skin Type 2", "Selected cells stay selected, just untappable", enumC16313m2, abstractC22403o4, z49, enumC31908c4, true, z52, obj12, obj13, z54, z55, c39174f4, str9, 32304, defaultConstructorMarker6), new C31909d("disabled-skin-type-3", "Skin Type 3", "Already disabled on its own", enumC16313m2, abstractC22403o4, z49, enumC31908c4, false, z52, obj12, obj13, z54, true, c39174f4, str9, 28336, defaultConstructorMarker6)), null, null, true, 52, null);
            Object objM87133R7 = c28655q.m87133R();
            if (objM87133R7 == c28676v0) {
                objM87133R7 = new C40473t5(29);
                c28655q.m87172p0(objM87133R7);
            }
            c26085b7.Compose(c2314t, c26088e7, (Function1) objM87133R7, c28655q, i15);
            AbstractC22399k.m64473c("Grouped List (section_title)", c28655q, 6);
            C26085b c26085b8 = new C26085b();
            DefaultConstructorMarker defaultConstructorMarker7 = null;
            EnumC16313m0 enumC16313m3 = null;
            AbstractC22403o abstractC22403o5 = null;
            boolean z56 = false;
            boolean z57 = true;
            Object obj14 = null;
            Object obj15 = null;
            boolean z58 = false;
            boolean z59 = false;
            C39174f c39174f5 = null;
            boolean z60 = false;
            String str10 = "grouped-list-example";
            C26088e c26088e8 = new C26088e(str10, 200, 0, AbstractC37056f.m118959K(new C31909d("running", "Running", "Listed again under All Activities", enumC16313m3, abstractC22403o5, z56, enumC31908c4, true, z57, obj14, obj15, z58, z59, c39174f5, "FREQUENTLY RECORDED", 15928, defaultConstructorMarker7), new C31909d("walking", "Walking", "Same section, so no second header", enumC16313m3, abstractC22403o5, z56, enumC31908c4, z60, z57, obj14, obj15, z58, z59, c39174f5, "FREQUENTLY RECORDED", 16056, defaultConstructorMarker7), new C31909d("boxing", "Boxing", null, enumC16313m3, abstractC22403o5, z56, enumC31908c4, z60, z57, obj14, obj15, z58, z59, c39174f5, "ALL ACTIVITIES", 16060, defaultConstructorMarker7), new C31909d("running", "Running", "Same id as above, ticks together", enumC16313m3, abstractC22403o5, z56, enumC31908c4, true, z57, obj14, obj15, z58, z59, c39174f5, "ALL ACTIVITIES", 15928, defaultConstructorMarker7)), null, null, false, 116, null);
            Object objM87133R8 = c28655q.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = new C40349h7(0);
                c28655q.m87172p0(objM87133R8);
            }
            c26085b8.Compose(c2314t, c26088e8, (Function1) objM87133R8, c28655q, i15);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40337g6(i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m130030k(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m130031l(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m130032m(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m130033n(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m130034o(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m130035p(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m130036q(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m130037r(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m130038s(int i13, Composer composer, int i14) {
        m130029j(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
