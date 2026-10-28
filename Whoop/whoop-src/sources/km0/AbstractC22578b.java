package km0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.AbstractC2890e;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15676d;
import hy0.AbstractC17746g1;
import hy0.C17750h1;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import jp1.C21851c;
import jp1.C21852d;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kf0.C22429d;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p095dp.AbstractC12240d;
import p098dt.AbstractC12350b;
import p163g1.AbstractC14959b1;
import p163g1.C15127r1;
import p208i2.C17903p;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: km0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lkm0/a;", "bottomSheetSelectorItemState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Lkm0/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "bottomsheet-item-selector_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22578b {
    /* JADX WARN: Code duplicated, block: B:101:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:105:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:107:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:110:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:62:0x0110  */
    /* JADX WARN: Code duplicated, block: B:64:0x0187  */
    /* JADX WARN: Code duplicated, block: B:68:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x0280  */
    /* JADX WARN: Code duplicated, block: B:84:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:87:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:93:0x0325 A[LOOP:0: B:91:0x031f->B:93:0x0325, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x0390  */
    /* JADX WARN: Code duplicated, block: B:98:0x0394  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public static final void m65404d(C22577a c22577a, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        String strConcat;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        float f14;
        String str;
        C0209i c0209i4;
        C0209i c0209i5;
        C0209i c0209i6;
        C28676v0 c28676v1;
        Function1 function5;
        boolean z13;
        int iHashCode2;
        boolean z14;
        C28655q c28655q;
        C17750h1 c17750h1M65396c;
        C2314t c2314t2;
        Iterator<T> it;
        C28655q c28655q2;
        char c3;
        boolean z15;
        Object objM87133R;
        Function1 function6;
        Object objM87133R2;
        C22577a bottomSheetSelectorItemState = c22577a;
        AbstractC22676k.m65750j(bottomSheetSelectorItemState, "bottomSheetSelectorItemState");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1168194123);
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87157i(bottomSheetSelectorItemState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q3.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q3.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q3.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i18 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q3.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C22429d(23);
                            c28655q3.m87172p0(objM87133R2);
                        }
                        function4 = (Function1) objM87133R2;
                    } else {
                        function4 = function2;
                    }
                    strConcat = AbstractC39421y.m125926K(bottomSheetSelectorItemState.getId(), " ", "_", false).concat("_Checkbox");
                    f13 = 4;
                    Modifier modifierM3405b = AbstractC1102d.m3405b(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, 11 * f13, 1);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q3, 48);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3405b);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m);
                    c0209i3 = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        f14 = f13;
                    } else {
                        f14 = f13;
                        if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i7 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N);
                        if (bottomSheetSelectorItemState.getIcon() != null) {
                            c28655q3.m87150e0(-592091358);
                            c0209i5 = c0209i2;
                            c0209i4 = c0209i;
                            str = strConcat;
                            c28676v1 = c28676v0;
                            c0209i6 = c0209i3;
                            function5 = function4;
                            z13 = false;
                            AbstractC29125c.m88522c(AbstractC22404p.m64500i(bottomSheetSelectorItemState.getIcon(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(6 * f14, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, ((float) 1.75d) * 8, 0.0f, 11)), null, null, 0.0f, new C17903p(C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getWhite30(), 5), c28655q3, 432, 56);
                            c28655q3 = c28655q3;
                            c28655q3.m87173q(false);
                        } else {
                            str = strConcat;
                            c0209i4 = c0209i;
                            c0209i5 = c0209i2;
                            c0209i6 = c0209i3;
                            c28676v1 = c28676v0;
                            function5 = function4;
                            z13 = false;
                            c28655q3.m87150e0(-591749893);
                            c28655q3.m87173q(false);
                        }
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                        iHashCode2 = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement);
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i4, c23010xM66775a);
                        AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m2);
                        if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
                        }
                        AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N2);
                        TextResource textResourceM65398e = bottomSheetSelectorItemState.getTitle();
                        int i19 = TextResource.$stable;
                        String strM21274h = AbstractC8693b.m21274h(textResourceM65398e, c28655q3, i19);
                        C2886a b6 = AbstractC2890e.m8450e().getB1();
                        C38072d c38072d = C38072d.f163053a;
                        int i24 = C38072d.f163054b;
                        long brandWhite = c38072d.m121949b(c28655q3, i24).getBrandWhite();
                        int i25 = C2886a.f11498d << 18;
                        C28655q c28655q4 = c28655q3;
                        z14 = z13;
                        Modifier modifier5 = modifier4;
                        AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q4, 0, i25, 196602);
                        c28655q = c28655q4;
                        if (c22577a.getSubtitle() == null && AbstractC8693b.m21270d(c22577a.getSubtitle())) {
                            c28655q.m87150e0(-2069388903);
                            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c22577a.getSubtitle(), c28655q, i19), null, c38072d.m121949b(c28655q, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, AbstractC2890e.m8450e().getB3(), null, c28655q, 0, i25, 196602);
                            c28655q = c28655q;
                            c28655q.m87173q(z14);
                        } else {
                            c28655q.m87150e0(-2069167439);
                            c28655q.m87173q(z14);
                        }
                        c17750h1M65396c = c22577a.getTag();
                        if (c17750h1M65396c == null) {
                            c28655q.m87150e0(-2069116910);
                            c28655q.m87173q(z14);
                            c2314t2 = c2314t;
                        } else {
                            c28655q.m87150e0(-2069116909);
                            c2314t2 = c2314t;
                            AbstractC18489d0.m53380u((float) 0.5d, 8, c2314t2, c28655q);
                            AbstractC17746g1.m50872h(c17750h1M65396c, null, null, c28655q, C17750h1.f69012w, 6);
                            c28655q.m87173q(z14);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87150e0(1366414991);
                        it = c22577a.m65399f().iterator();
                        while (it.hasNext()) {
                            AbstractC17746g1.m50872h((C17750h1) it.next(), AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * 8, 0.0f, 11), null, c28655q, C17750h1.f69012w | 48, 4);
                        }
                        c28655q.m87173q(z14);
                        Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC12350b.m34565N(1.1f, c2314t2), str);
                        boolean zM65400g = c22577a.getIsChecked();
                        C38072d c38072d2 = C38072d.f163053a;
                        int i26 = C38072d.f163054b;
                        c28655q2 = c28655q;
                        C15127r1 c15127r1M34081r = AbstractC12240d.m34081r(c22577a.getActiveColor().mo134584toComposableColorWaAFU9c(c28655q, z14 ? 1 : 0), c38072d2.m121949b(c28655q, i26).getBrandWhite(), c38072d2.m121949b(c28655q, i26).getBrandBlack(), 0L, c28655q2, 0, 24);
                        if ((i15 & 896) == 256) {
                            c3 = 1;
                        } else {
                            c3 = z14 ? 1 : 0;
                        }
                        bottomSheetSelectorItemState = c22577a;
                        z15 = (c28655q2.m87157i(bottomSheetSelectorItemState) ? 1 : 0) | c3;
                        objM87133R = c28655q2.m87133R();
                        if (z15 == 0 || objM87133R == c28676v1) {
                            function6 = function5;
                            objM87133R = new C21851c(11, function6, bottomSheetSelectorItemState);
                            c28655q2.m87172p0(objM87133R);
                        } else {
                            function6 = function5;
                        }
                        AbstractC14959b1.m43082a(zM65400g, (Function1) objM87133R, modifierM44101d, false, c15127r1M34081r, c28655q2, 0, 24);
                        c28655q3 = c28655q2;
                        c28655q3.m87173q(true);
                        function3 = function6;
                        modifier3 = modifier5;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i8, modifierM118962N);
                    if (bottomSheetSelectorItemState.getIcon() != null) {
                        c28655q3.m87150e0(-592091358);
                        c0209i5 = c0209i2;
                        c0209i4 = c0209i;
                        str = strConcat;
                        c28676v1 = c28676v0;
                        c0209i6 = c0209i3;
                        function5 = function4;
                        z13 = false;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(bottomSheetSelectorItemState.getIcon(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(6 * f14, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, ((float) 1.75d) * 8, 0.0f, 11)), null, null, 0.0f, new C17903p(C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getWhite30(), 5), c28655q3, 432, 56);
                        c28655q3 = c28655q3;
                        c28655q3.m87173q(false);
                    } else {
                        str = strConcat;
                        c0209i4 = c0209i;
                        c0209i5 = c0209i2;
                        c0209i6 = c0209i3;
                        c28676v1 = c28676v0;
                        function5 = function4;
                        z13 = false;
                        c28655q3.m87150e0(-591749893);
                        c28655q3.m87173q(false);
                    }
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement2);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m3);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i8, modifierM118962N3);
                    TextResource textResourceM65398e2 = bottomSheetSelectorItemState.getTitle();
                    int i110 = TextResource.$stable;
                    String strM21274h2 = AbstractC8693b.m21274h(textResourceM65398e2, c28655q3, i110);
                    C2886a b8 = AbstractC2890e.m8450e().getB1();
                    C38072d c38072d3 = C38072d.f163053a;
                    int i27 = C38072d.f163054b;
                    long brandWhite2 = c38072d3.m121949b(c28655q3, i27).getBrandWhite();
                    int i28 = C2886a.f11498d << 18;
                    C28655q c28655q5 = c28655q3;
                    z14 = z13;
                    Modifier modifier6 = modifier4;
                    AbstractC30795n.m94707h(strM21274h2, null, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b8, null, c28655q5, 0, i28, 196602);
                    c28655q = c28655q5;
                    if (c22577a.getSubtitle() == null) {
                        c28655q.m87150e0(-2069167439);
                        c28655q.m87173q(z14);
                    } else {
                        c28655q.m87150e0(-2069167439);
                        c28655q.m87173q(z14);
                    }
                    c17750h1M65396c = c22577a.getTag();
                    if (c17750h1M65396c == null) {
                        c28655q.m87150e0(-2069116910);
                        c28655q.m87173q(z14);
                        c2314t2 = c2314t;
                    } else {
                        c28655q.m87150e0(-2069116909);
                        c2314t2 = c2314t;
                        AbstractC18489d0.m53380u((float) 0.5d, 8, c2314t2, c28655q);
                        AbstractC17746g1.m50872h(c17750h1M65396c, null, null, c28655q, C17750h1.f69012w, 6);
                        c28655q.m87173q(z14);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87150e0(1366414991);
                    it = c22577a.m65399f().iterator();
                    while (it.hasNext()) {
                        AbstractC17746g1.m50872h((C17750h1) it.next(), AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * 8, 0.0f, 11), null, c28655q, C17750h1.f69012w | 48, 4);
                    }
                    c28655q.m87173q(z14);
                    Modifier modifierM44101d2 = AbstractC15676d.m44101d(AbstractC12350b.m34565N(1.1f, c2314t2), str);
                    boolean zM65400g2 = c22577a.getIsChecked();
                    C38072d c38072d4 = C38072d.f163053a;
                    int i29 = C38072d.f163054b;
                    c28655q2 = c28655q;
                    C15127r1 c15127r1M34081r2 = AbstractC12240d.m34081r(c22577a.getActiveColor().mo134584toComposableColorWaAFU9c(c28655q, z14 ? 1 : 0), c38072d4.m121949b(c28655q, i29).getBrandWhite(), c38072d4.m121949b(c28655q, i29).getBrandBlack(), 0L, c28655q2, 0, 24);
                    if ((i15 & 896) == 256) {
                        c3 = 1;
                    } else {
                        c3 = z14 ? 1 : 0;
                    }
                    bottomSheetSelectorItemState = c22577a;
                    z15 = (c28655q2.m87157i(bottomSheetSelectorItemState) ? 1 : 0) | c3;
                    objM87133R = c28655q2.m87133R();
                    if (z15 == 0) {
                        function6 = function5;
                        objM87133R = new C21851c(11, function6, bottomSheetSelectorItemState);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        function6 = function5;
                        objM87133R = new C21851c(11, function6, bottomSheetSelectorItemState);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC14959b1.m43082a(zM65400g2, (Function1) objM87133R, modifierM44101d2, false, c15127r1M34081r2, c28655q2, 0, 24);
                    c28655q3 = c28655q2;
                    c28655q3.m87173q(true);
                    function3 = function6;
                    modifier3 = modifier6;
                } else {
                    c28655q3.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q3.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C21852d(bottomSheetSelectorItemState, modifier3, function3, i13, i14, 13);
                }
            }
            i15 |= 384;
            function2 = function1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C22429d(23);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                strConcat = AbstractC39421y.m125926K(bottomSheetSelectorItemState.getId(), " ", "_", false).concat("_Checkbox");
                f13 = 4;
                Modifier modifierM3405b2 = AbstractC1102d.m3405b(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, 11 * f13, 1);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q3, 48);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, modifierM3405b2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a2);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m4);
                c0209i3 = C0217k.f732j;
                if (c28655q3.f115903S) {
                    f14 = f13;
                    if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i9 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N4);
                    if (bottomSheetSelectorItemState.getIcon() != null) {
                        c28655q3.m87150e0(-592091358);
                        c0209i5 = c0209i2;
                        c0209i4 = c0209i;
                        str = strConcat;
                        c28676v1 = c28676v0;
                        c0209i6 = c0209i3;
                        function5 = function4;
                        z13 = false;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(bottomSheetSelectorItemState.getIcon(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(6 * f14, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, ((float) 1.75d) * 8, 0.0f, 11)), null, null, 0.0f, new C17903p(C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getWhite30(), 5), c28655q3, 432, 56);
                        c28655q3 = c28655q3;
                        c28655q3.m87173q(false);
                    } else {
                        str = strConcat;
                        c0209i4 = c0209i;
                        c0209i5 = c0209i2;
                        c0209i6 = c0209i3;
                        c28676v1 = c28676v0;
                        function5 = function4;
                        z13 = false;
                        c28655q3.m87150e0(-591749893);
                        c28655q3.m87173q(false);
                    }
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(1.0f, true);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement3);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m5);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i9, modifierM118962N5);
                    TextResource textResourceM65398e3 = bottomSheetSelectorItemState.getTitle();
                    int i111 = TextResource.$stable;
                    String strM21274h3 = AbstractC8693b.m21274h(textResourceM65398e3, c28655q3, i111);
                    C2886a b14 = AbstractC2890e.m8450e().getB1();
                    C38072d c38072d5 = C38072d.f163053a;
                    int i210 = C38072d.f163054b;
                    long brandWhite3 = c38072d5.m121949b(c28655q3, i210).getBrandWhite();
                    int i211 = C2886a.f11498d << 18;
                    C28655q c28655q6 = c28655q3;
                    z14 = z13;
                    Modifier modifier7 = modifier4;
                    AbstractC30795n.m94707h(strM21274h3, null, brandWhite3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b14, null, c28655q6, 0, i211, 196602);
                    c28655q = c28655q6;
                    if (c22577a.getSubtitle() == null) {
                        c28655q.m87150e0(-2069167439);
                        c28655q.m87173q(z14);
                    } else {
                        c28655q.m87150e0(-2069167439);
                        c28655q.m87173q(z14);
                    }
                    c17750h1M65396c = c22577a.getTag();
                    if (c17750h1M65396c == null) {
                        c28655q.m87150e0(-2069116910);
                        c28655q.m87173q(z14);
                        c2314t2 = c2314t;
                    } else {
                        c28655q.m87150e0(-2069116909);
                        c2314t2 = c2314t;
                        AbstractC18489d0.m53380u((float) 0.5d, 8, c2314t2, c28655q);
                        AbstractC17746g1.m50872h(c17750h1M65396c, null, null, c28655q, C17750h1.f69012w, 6);
                        c28655q.m87173q(z14);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87150e0(1366414991);
                    it = c22577a.m65399f().iterator();
                    while (it.hasNext()) {
                        AbstractC17746g1.m50872h((C17750h1) it.next(), AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * 8, 0.0f, 11), null, c28655q, C17750h1.f69012w | 48, 4);
                    }
                    c28655q.m87173q(z14);
                    Modifier modifierM44101d3 = AbstractC15676d.m44101d(AbstractC12350b.m34565N(1.1f, c2314t2), str);
                    boolean zM65400g3 = c22577a.getIsChecked();
                    C38072d c38072d6 = C38072d.f163053a;
                    int i212 = C38072d.f163054b;
                    c28655q2 = c28655q;
                    C15127r1 c15127r1M34081r3 = AbstractC12240d.m34081r(c22577a.getActiveColor().mo134584toComposableColorWaAFU9c(c28655q, z14 ? 1 : 0), c38072d6.m121949b(c28655q, i212).getBrandWhite(), c38072d6.m121949b(c28655q, i212).getBrandBlack(), 0L, c28655q2, 0, 24);
                    if ((i15 & 896) == 256) {
                        c3 = 1;
                    } else {
                        c3 = z14 ? 1 : 0;
                    }
                    bottomSheetSelectorItemState = c22577a;
                    z15 = (c28655q2.m87157i(bottomSheetSelectorItemState) ? 1 : 0) | c3;
                    objM87133R = c28655q2.m87133R();
                    if (z15 == 0) {
                        function6 = function5;
                        objM87133R = new C21851c(11, function6, bottomSheetSelectorItemState);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        function6 = function5;
                        objM87133R = new C21851c(11, function6, bottomSheetSelectorItemState);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC14959b1.m43082a(zM65400g3, (Function1) objM87133R, modifierM44101d3, false, c15127r1M34081r3, c28655q2, 0, 24);
                    c28655q3 = c28655q2;
                    c28655q3.m87173q(true);
                    function3 = function6;
                    modifier3 = modifier7;
                } else {
                    f14 = f13;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
                C0209i c0209i10 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i10, modifierM118962N4);
                if (bottomSheetSelectorItemState.getIcon() != null) {
                    c28655q3.m87150e0(-592091358);
                    c0209i5 = c0209i2;
                    c0209i4 = c0209i;
                    str = strConcat;
                    c28676v1 = c28676v0;
                    c0209i6 = c0209i3;
                    function5 = function4;
                    z13 = false;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(bottomSheetSelectorItemState.getIcon(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(6 * f14, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, ((float) 1.75d) * 8, 0.0f, 11)), null, null, 0.0f, new C17903p(C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getWhite30(), 5), c28655q3, 432, 56);
                    c28655q3 = c28655q3;
                    c28655q3.m87173q(false);
                } else {
                    str = strConcat;
                    c0209i4 = c0209i;
                    c0209i5 = c0209i2;
                    c0209i6 = c0209i3;
                    c28676v1 = c28676v0;
                    function5 = function4;
                    z13 = false;
                    c28655q3.m87150e0(-591749893);
                    c28655q3.m87173q(false);
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement4);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m6);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i10, modifierM118962N6);
                TextResource textResourceM65398e4 = bottomSheetSelectorItemState.getTitle();
                int i112 = TextResource.$stable;
                String strM21274h4 = AbstractC8693b.m21274h(textResourceM65398e4, c28655q3, i112);
                C2886a b15 = AbstractC2890e.m8450e().getB1();
                C38072d c38072d7 = C38072d.f163053a;
                int i213 = C38072d.f163054b;
                long brandWhite4 = c38072d7.m121949b(c28655q3, i213).getBrandWhite();
                int i214 = C2886a.f11498d << 18;
                C28655q c28655q7 = c28655q3;
                z14 = z13;
                Modifier modifier8 = modifier4;
                AbstractC30795n.m94707h(strM21274h4, null, brandWhite4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b15, null, c28655q7, 0, i214, 196602);
                c28655q = c28655q7;
                if (c22577a.getSubtitle() == null) {
                    c28655q.m87150e0(-2069167439);
                    c28655q.m87173q(z14);
                } else {
                    c28655q.m87150e0(-2069167439);
                    c28655q.m87173q(z14);
                }
                c17750h1M65396c = c22577a.getTag();
                if (c17750h1M65396c == null) {
                    c28655q.m87150e0(-2069116910);
                    c28655q.m87173q(z14);
                    c2314t2 = c2314t;
                } else {
                    c28655q.m87150e0(-2069116909);
                    c2314t2 = c2314t;
                    AbstractC18489d0.m53380u((float) 0.5d, 8, c2314t2, c28655q);
                    AbstractC17746g1.m50872h(c17750h1M65396c, null, null, c28655q, C17750h1.f69012w, 6);
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(true);
                c28655q.m87150e0(1366414991);
                it = c22577a.m65399f().iterator();
                while (it.hasNext()) {
                    AbstractC17746g1.m50872h((C17750h1) it.next(), AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * 8, 0.0f, 11), null, c28655q, C17750h1.f69012w | 48, 4);
                }
                c28655q.m87173q(z14);
                Modifier modifierM44101d4 = AbstractC15676d.m44101d(AbstractC12350b.m34565N(1.1f, c2314t2), str);
                boolean zM65400g4 = c22577a.getIsChecked();
                C38072d c38072d8 = C38072d.f163053a;
                int i215 = C38072d.f163054b;
                c28655q2 = c28655q;
                C15127r1 c15127r1M34081r4 = AbstractC12240d.m34081r(c22577a.getActiveColor().mo134584toComposableColorWaAFU9c(c28655q, z14 ? 1 : 0), c38072d8.m121949b(c28655q, i215).getBrandWhite(), c38072d8.m121949b(c28655q, i215).getBrandBlack(), 0L, c28655q2, 0, 24);
                if ((i15 & 896) == 256) {
                    c3 = 1;
                } else {
                    c3 = z14 ? 1 : 0;
                }
                bottomSheetSelectorItemState = c22577a;
                z15 = (c28655q2.m87157i(bottomSheetSelectorItemState) ? 1 : 0) | c3;
                objM87133R = c28655q2.m87133R();
                if (z15 == 0) {
                    function6 = function5;
                    objM87133R = new C21851c(11, function6, bottomSheetSelectorItemState);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    function6 = function5;
                    objM87133R = new C21851c(11, function6, bottomSheetSelectorItemState);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC14959b1.m43082a(zM65400g4, (Function1) objM87133R, modifierM44101d4, false, c15127r1M34081r4, c28655q2, 0, 24);
                c28655q3 = c28655q2;
                c28655q3.m87173q(true);
                function3 = function6;
                modifier3 = modifier8;
            } else {
                c28655q3.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q3.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(bottomSheetSelectorItemState, modifier3, function3, i13, i14, 13);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q3.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C22429d(23);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                strConcat = AbstractC39421y.m125926K(bottomSheetSelectorItemState.getId(), " ", "_", false).concat("_Checkbox");
                f13 = 4;
                Modifier modifierM3405b3 = AbstractC1102d.m3405b(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, 11 * f13, 1);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q3, 48);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q3.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q3, modifierM3405b3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a3);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m7);
                c0209i3 = C0217k.f732j;
                if (c28655q3.f115903S) {
                    f14 = f13;
                    if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i11 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q3, c0209i11, modifierM118962N7);
                    if (bottomSheetSelectorItemState.getIcon() != null) {
                        c28655q3.m87150e0(-592091358);
                        c0209i5 = c0209i2;
                        c0209i4 = c0209i;
                        str = strConcat;
                        c28676v1 = c28676v0;
                        c0209i6 = c0209i3;
                        function5 = function4;
                        z13 = false;
                        AbstractC29125c.m88522c(AbstractC22404p.m64500i(bottomSheetSelectorItemState.getIcon(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(6 * f14, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, ((float) 1.75d) * 8, 0.0f, 11)), null, null, 0.0f, new C17903p(C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getWhite30(), 5), c28655q3, 432, 56);
                        c28655q3 = c28655q3;
                        c28655q3.m87173q(false);
                    } else {
                        str = strConcat;
                        c0209i4 = c0209i;
                        c0209i5 = c0209i2;
                        c0209i6 = c0209i3;
                        c28676v1 = c28676v0;
                        function5 = function4;
                        z13 = false;
                        c28655q3.m87150e0(-591749893);
                        c28655q3.m87173q(false);
                    }
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement5 = new LayoutWeightElement(1.0f, true);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                    iHashCode2 = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q3.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement5);
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i4, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m8);
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
                    }
                    AbstractC28683x.m87239G(c28655q3, c0209i11, modifierM118962N8);
                    TextResource textResourceM65398e5 = bottomSheetSelectorItemState.getTitle();
                    int i113 = TextResource.$stable;
                    String strM21274h5 = AbstractC8693b.m21274h(textResourceM65398e5, c28655q3, i113);
                    C2886a b16 = AbstractC2890e.m8450e().getB1();
                    C38072d c38072d9 = C38072d.f163053a;
                    int i216 = C38072d.f163054b;
                    long brandWhite5 = c38072d9.m121949b(c28655q3, i216).getBrandWhite();
                    int i217 = C2886a.f11498d << 18;
                    C28655q c28655q8 = c28655q3;
                    z14 = z13;
                    Modifier modifier9 = modifier4;
                    AbstractC30795n.m94707h(strM21274h5, null, brandWhite5, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b16, null, c28655q8, 0, i217, 196602);
                    c28655q = c28655q8;
                    if (c22577a.getSubtitle() == null) {
                        c28655q.m87150e0(-2069167439);
                        c28655q.m87173q(z14);
                    } else {
                        c28655q.m87150e0(-2069167439);
                        c28655q.m87173q(z14);
                    }
                    c17750h1M65396c = c22577a.getTag();
                    if (c17750h1M65396c == null) {
                        c28655q.m87150e0(-2069116910);
                        c28655q.m87173q(z14);
                        c2314t2 = c2314t;
                    } else {
                        c28655q.m87150e0(-2069116909);
                        c2314t2 = c2314t;
                        AbstractC18489d0.m53380u((float) 0.5d, 8, c2314t2, c28655q);
                        AbstractC17746g1.m50872h(c17750h1M65396c, null, null, c28655q, C17750h1.f69012w, 6);
                        c28655q.m87173q(z14);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87150e0(1366414991);
                    it = c22577a.m65399f().iterator();
                    while (it.hasNext()) {
                        AbstractC17746g1.m50872h((C17750h1) it.next(), AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * 8, 0.0f, 11), null, c28655q, C17750h1.f69012w | 48, 4);
                    }
                    c28655q.m87173q(z14);
                    Modifier modifierM44101d5 = AbstractC15676d.m44101d(AbstractC12350b.m34565N(1.1f, c2314t2), str);
                    boolean zM65400g5 = c22577a.getIsChecked();
                    C38072d c38072d10 = C38072d.f163053a;
                    int i218 = C38072d.f163054b;
                    c28655q2 = c28655q;
                    C15127r1 c15127r1M34081r5 = AbstractC12240d.m34081r(c22577a.getActiveColor().mo134584toComposableColorWaAFU9c(c28655q, z14 ? 1 : 0), c38072d10.m121949b(c28655q, i218).getBrandWhite(), c38072d10.m121949b(c28655q, i218).getBrandBlack(), 0L, c28655q2, 0, 24);
                    if ((i15 & 896) == 256) {
                        c3 = 1;
                    } else {
                        c3 = z14 ? 1 : 0;
                    }
                    bottomSheetSelectorItemState = c22577a;
                    z15 = (c28655q2.m87157i(bottomSheetSelectorItemState) ? 1 : 0) | c3;
                    objM87133R = c28655q2.m87133R();
                    if (z15 == 0) {
                        function6 = function5;
                        objM87133R = new C21851c(11, function6, bottomSheetSelectorItemState);
                        c28655q2.m87172p0(objM87133R);
                    } else {
                        function6 = function5;
                        objM87133R = new C21851c(11, function6, bottomSheetSelectorItemState);
                        c28655q2.m87172p0(objM87133R);
                    }
                    AbstractC14959b1.m43082a(zM65400g5, (Function1) objM87133R, modifierM44101d5, false, c15127r1M34081r5, c28655q2, 0, 24);
                    c28655q3 = c28655q2;
                    c28655q3.m87173q(true);
                    function3 = function6;
                    modifier3 = modifier9;
                } else {
                    f14 = f13;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
                C0209i c0209i12 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i12, modifierM118962N7);
                if (bottomSheetSelectorItemState.getIcon() != null) {
                    c28655q3.m87150e0(-592091358);
                    c0209i5 = c0209i2;
                    c0209i4 = c0209i;
                    str = strConcat;
                    c28676v1 = c28676v0;
                    c0209i6 = c0209i3;
                    function5 = function4;
                    z13 = false;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(bottomSheetSelectorItemState.getIcon(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(6 * f14, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, ((float) 1.75d) * 8, 0.0f, 11)), null, null, 0.0f, new C17903p(C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getWhite30(), 5), c28655q3, 432, 56);
                    c28655q3 = c28655q3;
                    c28655q3.m87173q(false);
                } else {
                    str = strConcat;
                    c0209i4 = c0209i;
                    c0209i5 = c0209i2;
                    c0209i6 = c0209i3;
                    c28676v1 = c28676v0;
                    function5 = function4;
                    z13 = false;
                    c28655q3.m87150e0(-591749893);
                    c28655q3.m87173q(false);
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement6 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q3.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement6);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m9);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i12, modifierM118962N9);
                TextResource textResourceM65398e6 = bottomSheetSelectorItemState.getTitle();
                int i114 = TextResource.$stable;
                String strM21274h6 = AbstractC8693b.m21274h(textResourceM65398e6, c28655q3, i114);
                C2886a b17 = AbstractC2890e.m8450e().getB1();
                C38072d c38072d11 = C38072d.f163053a;
                int i219 = C38072d.f163054b;
                long brandWhite6 = c38072d11.m121949b(c28655q3, i219).getBrandWhite();
                int i2110 = C2886a.f11498d << 18;
                C28655q c28655q9 = c28655q3;
                z14 = z13;
                Modifier modifier10 = modifier4;
                AbstractC30795n.m94707h(strM21274h6, null, brandWhite6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b17, null, c28655q9, 0, i2110, 196602);
                c28655q = c28655q9;
                if (c22577a.getSubtitle() == null) {
                    c28655q.m87150e0(-2069167439);
                    c28655q.m87173q(z14);
                } else {
                    c28655q.m87150e0(-2069167439);
                    c28655q.m87173q(z14);
                }
                c17750h1M65396c = c22577a.getTag();
                if (c17750h1M65396c == null) {
                    c28655q.m87150e0(-2069116910);
                    c28655q.m87173q(z14);
                    c2314t2 = c2314t;
                } else {
                    c28655q.m87150e0(-2069116909);
                    c2314t2 = c2314t;
                    AbstractC18489d0.m53380u((float) 0.5d, 8, c2314t2, c28655q);
                    AbstractC17746g1.m50872h(c17750h1M65396c, null, null, c28655q, C17750h1.f69012w, 6);
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(true);
                c28655q.m87150e0(1366414991);
                it = c22577a.m65399f().iterator();
                while (it.hasNext()) {
                    AbstractC17746g1.m50872h((C17750h1) it.next(), AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * 8, 0.0f, 11), null, c28655q, C17750h1.f69012w | 48, 4);
                }
                c28655q.m87173q(z14);
                Modifier modifierM44101d6 = AbstractC15676d.m44101d(AbstractC12350b.m34565N(1.1f, c2314t2), str);
                boolean zM65400g6 = c22577a.getIsChecked();
                C38072d c38072d12 = C38072d.f163053a;
                int i2111 = C38072d.f163054b;
                c28655q2 = c28655q;
                C15127r1 c15127r1M34081r6 = AbstractC12240d.m34081r(c22577a.getActiveColor().mo134584toComposableColorWaAFU9c(c28655q, z14 ? 1 : 0), c38072d12.m121949b(c28655q, i2111).getBrandWhite(), c38072d12.m121949b(c28655q, i2111).getBrandBlack(), 0L, c28655q2, 0, 24);
                if ((i15 & 896) == 256) {
                    c3 = 1;
                } else {
                    c3 = z14 ? 1 : 0;
                }
                bottomSheetSelectorItemState = c22577a;
                z15 = (c28655q2.m87157i(bottomSheetSelectorItemState) ? 1 : 0) | c3;
                objM87133R = c28655q2.m87133R();
                if (z15 == 0) {
                    function6 = function5;
                    objM87133R = new C21851c(11, function6, bottomSheetSelectorItemState);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    function6 = function5;
                    objM87133R = new C21851c(11, function6, bottomSheetSelectorItemState);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC14959b1.m43082a(zM65400g6, (Function1) objM87133R, modifierM44101d6, false, c15127r1M34081r6, c28655q2, 0, 24);
                c28655q3 = c28655q2;
                c28655q3.m87173q(true);
                function3 = function6;
                modifier3 = modifier10;
            } else {
                c28655q3.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q3.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(bottomSheetSelectorItemState, modifier3, function3, i13, i14, 13);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C22429d(23);
                    c28655q3.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            strConcat = AbstractC39421y.m125926K(bottomSheetSelectorItemState.getId(), " ", "_", false).concat("_Checkbox");
            f13 = 4;
            Modifier modifierM3405b4 = AbstractC1102d.m3405b(AbstractC1102d.m3409f(1.0f, modifier4), 0.0f, 11 * f13, 1);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q3, 48);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q3.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q3, modifierM3405b4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a4);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m10);
            c0209i3 = C0217k.f732j;
            if (c28655q3.f115903S) {
                f14 = f13;
                if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i13, modifierM118962N10);
                if (bottomSheetSelectorItemState.getIcon() != null) {
                    c28655q3.m87150e0(-592091358);
                    c0209i5 = c0209i2;
                    c0209i4 = c0209i;
                    str = strConcat;
                    c28676v1 = c28676v0;
                    c0209i6 = c0209i3;
                    function5 = function4;
                    z13 = false;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(bottomSheetSelectorItemState.getIcon(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(6 * f14, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, ((float) 1.75d) * 8, 0.0f, 11)), null, null, 0.0f, new C17903p(C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getWhite30(), 5), c28655q3, 432, 56);
                    c28655q3 = c28655q3;
                    c28655q3.m87173q(false);
                } else {
                    str = strConcat;
                    c0209i4 = c0209i;
                    c0209i5 = c0209i2;
                    c0209i6 = c0209i3;
                    c28676v1 = c28676v0;
                    function5 = function4;
                    z13 = false;
                    c28655q3.m87150e0(-591749893);
                    c28655q3.m87173q(false);
                }
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement7 = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q3.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement7);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m11);
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i13, modifierM118962N11);
                TextResource textResourceM65398e7 = bottomSheetSelectorItemState.getTitle();
                int i115 = TextResource.$stable;
                String strM21274h7 = AbstractC8693b.m21274h(textResourceM65398e7, c28655q3, i115);
                C2886a b18 = AbstractC2890e.m8450e().getB1();
                C38072d c38072d13 = C38072d.f163053a;
                int i2112 = C38072d.f163054b;
                long brandWhite7 = c38072d13.m121949b(c28655q3, i2112).getBrandWhite();
                int i2113 = C2886a.f11498d << 18;
                C28655q c28655q10 = c28655q3;
                z14 = z13;
                Modifier modifier11 = modifier4;
                AbstractC30795n.m94707h(strM21274h7, null, brandWhite7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b18, null, c28655q10, 0, i2113, 196602);
                c28655q = c28655q10;
                if (c22577a.getSubtitle() == null) {
                    c28655q.m87150e0(-2069167439);
                    c28655q.m87173q(z14);
                } else {
                    c28655q.m87150e0(-2069167439);
                    c28655q.m87173q(z14);
                }
                c17750h1M65396c = c22577a.getTag();
                if (c17750h1M65396c == null) {
                    c28655q.m87150e0(-2069116910);
                    c28655q.m87173q(z14);
                    c2314t2 = c2314t;
                } else {
                    c28655q.m87150e0(-2069116909);
                    c2314t2 = c2314t;
                    AbstractC18489d0.m53380u((float) 0.5d, 8, c2314t2, c28655q);
                    AbstractC17746g1.m50872h(c17750h1M65396c, null, null, c28655q, C17750h1.f69012w, 6);
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(true);
                c28655q.m87150e0(1366414991);
                it = c22577a.m65399f().iterator();
                while (it.hasNext()) {
                    AbstractC17746g1.m50872h((C17750h1) it.next(), AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * 8, 0.0f, 11), null, c28655q, C17750h1.f69012w | 48, 4);
                }
                c28655q.m87173q(z14);
                Modifier modifierM44101d7 = AbstractC15676d.m44101d(AbstractC12350b.m34565N(1.1f, c2314t2), str);
                boolean zM65400g7 = c22577a.getIsChecked();
                C38072d c38072d14 = C38072d.f163053a;
                int i2114 = C38072d.f163054b;
                c28655q2 = c28655q;
                C15127r1 c15127r1M34081r7 = AbstractC12240d.m34081r(c22577a.getActiveColor().mo134584toComposableColorWaAFU9c(c28655q, z14 ? 1 : 0), c38072d14.m121949b(c28655q, i2114).getBrandWhite(), c38072d14.m121949b(c28655q, i2114).getBrandBlack(), 0L, c28655q2, 0, 24);
                if ((i15 & 896) == 256) {
                    c3 = 1;
                } else {
                    c3 = z14 ? 1 : 0;
                }
                bottomSheetSelectorItemState = c22577a;
                z15 = (c28655q2.m87157i(bottomSheetSelectorItemState) ? 1 : 0) | c3;
                objM87133R = c28655q2.m87133R();
                if (z15 == 0) {
                    function6 = function5;
                    objM87133R = new C21851c(11, function6, bottomSheetSelectorItemState);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    function6 = function5;
                    objM87133R = new C21851c(11, function6, bottomSheetSelectorItemState);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC14959b1.m43082a(zM65400g7, (Function1) objM87133R, modifierM44101d7, false, c15127r1M34081r7, c28655q2, 0, 24);
                c28655q3 = c28655q2;
                c28655q3.m87173q(true);
                function3 = function6;
                modifier3 = modifier11;
            } else {
                f14 = f13;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
            C0209i c0209i14 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i14, modifierM118962N10);
            if (bottomSheetSelectorItemState.getIcon() != null) {
                c28655q3.m87150e0(-592091358);
                c0209i5 = c0209i2;
                c0209i4 = c0209i;
                str = strConcat;
                c28676v1 = c28676v0;
                c0209i6 = c0209i3;
                function5 = function4;
                z13 = false;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(bottomSheetSelectorItemState.getIcon(), null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(6 * f14, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, ((float) 1.75d) * 8, 0.0f, 11)), null, null, 0.0f, new C17903p(C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getWhite30(), 5), c28655q3, 432, 56);
                c28655q3 = c28655q3;
                c28655q3.m87173q(false);
            } else {
                str = strConcat;
                c0209i4 = c0209i;
                c0209i5 = c0209i2;
                c0209i6 = c0209i3;
                c28676v1 = c28676v0;
                function5 = function4;
                z13 = false;
                c28655q3.m87150e0(-591749893);
                c28655q3.m87173q(false);
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement8 = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, c28655q3, 54);
            iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q3.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement8);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m12);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i14, modifierM118962N12);
            TextResource textResourceM65398e8 = bottomSheetSelectorItemState.getTitle();
            int i116 = TextResource.$stable;
            String strM21274h8 = AbstractC8693b.m21274h(textResourceM65398e8, c28655q3, i116);
            C2886a b19 = AbstractC2890e.m8450e().getB1();
            C38072d c38072d15 = C38072d.f163053a;
            int i2115 = C38072d.f163054b;
            long brandWhite8 = c38072d15.m121949b(c28655q3, i2115).getBrandWhite();
            int i2116 = C2886a.f11498d << 18;
            C28655q c28655q11 = c28655q3;
            z14 = z13;
            Modifier modifier12 = modifier4;
            AbstractC30795n.m94707h(strM21274h8, null, brandWhite8, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b19, null, c28655q11, 0, i2116, 196602);
            c28655q = c28655q11;
            if (c22577a.getSubtitle() == null) {
                c28655q.m87150e0(-2069167439);
                c28655q.m87173q(z14);
            } else {
                c28655q.m87150e0(-2069167439);
                c28655q.m87173q(z14);
            }
            c17750h1M65396c = c22577a.getTag();
            if (c17750h1M65396c == null) {
                c28655q.m87150e0(-2069116910);
                c28655q.m87173q(z14);
                c2314t2 = c2314t;
            } else {
                c28655q.m87150e0(-2069116909);
                c2314t2 = c2314t;
                AbstractC18489d0.m53380u((float) 0.5d, 8, c2314t2, c28655q);
                AbstractC17746g1.m50872h(c17750h1M65396c, null, null, c28655q, C17750h1.f69012w, 6);
                c28655q.m87173q(z14);
            }
            c28655q.m87173q(true);
            c28655q.m87150e0(1366414991);
            it = c22577a.m65399f().iterator();
            while (it.hasNext()) {
                AbstractC17746g1.m50872h((C17750h1) it.next(), AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 1 * 8, 0.0f, 11), null, c28655q, C17750h1.f69012w | 48, 4);
            }
            c28655q.m87173q(z14);
            Modifier modifierM44101d8 = AbstractC15676d.m44101d(AbstractC12350b.m34565N(1.1f, c2314t2), str);
            boolean zM65400g8 = c22577a.getIsChecked();
            C38072d c38072d16 = C38072d.f163053a;
            int i2117 = C38072d.f163054b;
            c28655q2 = c28655q;
            C15127r1 c15127r1M34081r8 = AbstractC12240d.m34081r(c22577a.getActiveColor().mo134584toComposableColorWaAFU9c(c28655q, z14 ? 1 : 0), c38072d16.m121949b(c28655q, i2117).getBrandWhite(), c38072d16.m121949b(c28655q, i2117).getBrandBlack(), 0L, c28655q2, 0, 24);
            if ((i15 & 896) == 256) {
                c3 = 1;
            } else {
                c3 = z14 ? 1 : 0;
            }
            bottomSheetSelectorItemState = c22577a;
            z15 = (c28655q2.m87157i(bottomSheetSelectorItemState) ? 1 : 0) | c3;
            objM87133R = c28655q2.m87133R();
            if (z15 == 0) {
                function6 = function5;
                objM87133R = new C21851c(11, function6, bottomSheetSelectorItemState);
                c28655q2.m87172p0(objM87133R);
            } else {
                function6 = function5;
                objM87133R = new C21851c(11, function6, bottomSheetSelectorItemState);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC14959b1.m43082a(zM65400g8, (Function1) objM87133R, modifierM44101d8, false, c15127r1M34081r8, c28655q2, 0, 24);
            c28655q3 = c28655q2;
            c28655q3.m87173q(true);
            function3 = function6;
            modifier3 = modifier12;
        } else {
            c28655q3.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q3.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(bottomSheetSelectorItemState, modifier3, function3, i13, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m65405e(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m65406f(Function1 function1, C22577a c22577a, boolean z4) {
        function1.invoke(new AbstractC22579c.a(c22577a.getId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m65407g(C22577a c22577a, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m65404d(c22577a, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
