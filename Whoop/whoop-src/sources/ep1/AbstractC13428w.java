package ep1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aq1.C1910d;
import b30.C2663y4;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import com.whoop.profile.view.edit.C9790n;
import cp1.AbstractC11022i;
import cp1.C11016c;
import cp1.C11031r;
import d30.C11546l;
import d30.C11558r;
import d62.C11736b;
import eo2.C13390j;
import gb1.AbstractC15673b0;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import ny0.AbstractC27265l0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x21.AbstractC37861d;
import x81.C38072d;
import y71.C39274g;
import zo1.C40925b;

/* JADX INFO: renamed from: ep1.w */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcp1/r;", "viewState", "Lkotlin/Function1;", "Lcp1/i;", "Ll83/a0;", "onViewEvent", "k", "(Lcp1/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "selectedNumber", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13428w {
    /* JADX WARN: Code duplicated, block: B:102:0x020d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0215  */
    /* JADX WARN: Code duplicated, block: B:109:0x0233  */
    /* JADX WARN: Code duplicated, block: B:112:0x0349  */
    /* JADX WARN: Code duplicated, block: B:113:0x0356  */
    /* JADX WARN: Code duplicated, block: B:116:0x0360  */
    /* JADX WARN: Code duplicated, block: B:120:0x0378  */
    /* JADX WARN: Code duplicated, block: B:123:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:125:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:127:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:133:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:137:0x03f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:143:0x0416  */
    /* JADX WARN: Code duplicated, block: B:164:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:167:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:168:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:171:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:175:0x04da  */
    /* JADX WARN: Code duplicated, block: B:177:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:180:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:59:0x0116  */
    /* JADX WARN: Code duplicated, block: B:61:0x011b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0120  */
    /* JADX WARN: Code duplicated, block: B:71:0x0135  */
    /* JADX WARN: Code duplicated, block: B:74:0x013b  */
    /* JADX WARN: Code duplicated, block: B:75:0x013e  */
    /* JADX WARN: Code duplicated, block: B:81:0x014e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0160  */
    /* JADX WARN: Code duplicated, block: B:85:0x0163  */
    /* JADX WARN: Code duplicated, block: B:91:0x0171  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r4v15, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k */
    public static final void m38121k(C11031r viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        TextResource textResourceM29681k;
        boolean z13;
        TextResource textResource;
        int i16;
        boolean z14;
        int i17;
        boolean z15;
        boolean z16;
        Object objM87133R2;
        boolean z17;
        Object objM87133R3;
        Function1 function4;
        int iHashCode2;
        String strM21274h;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R5;
        boolean zM87153g;
        Object objM87133R6;
        InterfaceC28601c1 interfaceC28601c3;
        boolean z18;
        C11031r c11031r;
        boolean z19;
        boolean z24;
        Object objM87133R7;
        Function1 function5;
        C2314t c2314t2;
        ?? r10;
        int i18;
        ?? r14;
        Object objM87133R8;
        Function1 function6;
        Object objM87133R9;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(290733733);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R9 = c28655q2.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C13406a(24);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    function3 = (Function1) objM87133R9;
                } else {
                    function3 = function2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Integer.valueOf(viewState.getCurrentValue()));
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c2314t = C2314t.f9131w;
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66722k);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (!c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                TextResource textResourceM29677g = viewState.getNavigationTitle();
                TextResource textResourceM29676f = viewState.getNavigationSubtitle();
                textResourceM29681k = viewState.getSkipTitle();
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null && viewState.getSkipNextId() != null && AbstractC8693b.m21270d(textResourceM29681k)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    textResource = textResourceM29681k;
                } else {
                    textResource = null;
                }
                i16 = i15 & 14;
                if (i16 != 4 || ((i15 & 8) != 0 && c28655q2.m87157i(viewState))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                i17 = i15 & 112;
                if (i17 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z14 | z15;
                objM87133R2 = c28655q2.m87133R();
                if (z16 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C11546l(20, viewState, function3);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                if (i17 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R3 = c28655q2.m87133R();
                if (z17 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C13390j(function3, 19);
                    c28655q2.m87172p0(objM87133R3);
                }
                int i24 = TextResource.$stable;
                int i25 = i24 | (i24 << 3);
                function4 = function3;
                AbstractC13424s.m38062e(textResourceM29677g, textResourceM29676f, 0, textResource, interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q2, i25 | (i24 << 9), 4);
                float f13 = 3;
                float f14 = 8;
                float f15 = f13 * f14;
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3397s(c2314t, f15, f15, f15, ((float) 1.5d) * f14), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierMo3471e = modifierM92116f0.mo3471e(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                C2305k c2305k = C2299e.f9111N;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, c2305k, c28655q2, 54);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                String strM21274h2 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, i24);
                ?? r15 = C38072d.f163053a;
                int i26 = C38072d.f163054b;
                long jM125430y = r15.m121949b(c28655q2, i26).getBrandWhite();
                C2886a c2886aM8416N = r15.m121952e(c28655q2, i26).getT1();
                int i27 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h2, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q2, 0, i27, 196602);
                float f16 = 4;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(2 * f16, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescriptionDisplay(), c28655q2, i24), null, r15.m121949b(c28655q2, i26).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r15.m121952e(c28655q2, i26).getB1(), null, c28655q2, 0, i27, 196602);
                float f17 = f13 * f16;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f17, c2314t));
                strM21274h = AbstractC8693b.m21274h(viewState.getTrailingText(), c28655q2, i24);
                TextResource textResourceM29683m = viewState.getTrailingText();
                int iM38123m = m38123m(interfaceC28601c1);
                int iM29675e = viewState.getMinValue();
                int iM29674d = viewState.getMaxValue();
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    interfaceC28601c2 = interfaceC28601c1;
                    objM87133R4 = new C1910d(29, interfaceC28601c2);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                }
                Function1 function7 = (Function1) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C13406a(25);
                    c28655q2.m87172p0(objM87133R5);
                }
                Function1 function8 = (Function1) objM87133R5;
                zM87153g = c28655q2.m87153g(strM21274h);
                objM87133R6 = c28655q2.m87133R();
                if (zM87153g || objM87133R6 == c28676v0) {
                    objM87133R6 = new C2663y4(strM21274h, 16);
                    c28655q2.m87172p0(objM87133R6);
                }
                interfaceC28601c3 = interfaceC28601c2;
                AbstractC37861d.m121396i(null, iM38123m, iM29675e, iM29674d, false, function7, function8, false, false, textResourceM29683m, (Function1) objM87133R6, c28655q2, (i24 << 27) | 102457350, 0, 128);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f15, ((float) 0.5d) * f14, f15, 0.0f, 8);
                C11016c c11016cM29679i = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                TextResource textResourceM29671a = viewState.getButtonTitle();
                if (i17 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (i16 != 4) {
                    c11031r = viewState;
                    if ((i15 & 8) != 0 || !c28655q.m87157i(c11031r)) {
                        z19 = false;
                    }
                    z24 = z18 | z19;
                    objM87133R7 = c28655q.m87133R();
                    if (!z24 || objM87133R7 == c28676v0) {
                        function5 = function4;
                        objM87133R7 = new C11558r(function5, c11031r, interfaceC28601c3, 10);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        function5 = function4;
                    }
                    AbstractC13410e.m37926c(c11016cM29679i, textResourceM29671a, modifierM3398t, false, (InterfaceC4339a) objM87133R7, c28655q, i25, 8);
                    if (c11031r.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null || c11031r.getSkipNextId() == null) {
                        c2314t2 = c2314t;
                        r10 = 1;
                        i18 = i17;
                        c28655q.m87150e0(-291002105);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-291403803);
                        Modifier modifierM38560g = AbstractC13673n.m38560g(c2305k, AbstractC1099a.m3398t(c2314t, 0.0f, f17, 0.0f, 0.0f, 13));
                        TextResource textResourceM29681k2 = c11031r.getSkipTitle();
                        C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(r15), null, 2, 0 == true ? 1 : 0);
                        boolean z25 = (i16 == 4 || ((i15 & 8) != 0 && c28655q.m87157i(c11031r))) | (i17 == 32);
                        Object objM87133R10 = c28655q.m87133R();
                        if (z25 || objM87133R10 == c28676v0) {
                            objM87133R10 = new C9790n(20, function5, c11031r);
                            c28655q.m87172p0(objM87133R10);
                        }
                        c2314t2 = c2314t;
                        i18 = i17;
                        r10 = 1;
                        AbstractC27265l0.m82217i(modifierM38560g, null, textResourceM29681k2, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R10, c28655q, (i24 << 6) | (C39274g.f168929c << 12), 0, 4074);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    AbstractC30007c.m91851u(c2314t2, f15, c28655q, r10);
                    if (i18 == 32) {
                        r14 = r10;
                    } else {
                        r14 = 0;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (r14 == 0 || objM87133R8 == c28676v0) {
                        function6 = function5;
                        objM87133R8 = new C13390j(function6, 20);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        function6 = function5;
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, false, c28655q, 0, r10);
                    function2 = function6;
                } else {
                    c11031r = viewState;
                }
                z19 = true;
                z24 = z18 | z19;
                objM87133R7 = c28655q.m87133R();
                if (z24) {
                    function5 = function4;
                    objM87133R7 = new C11558r(function5, c11031r, interfaceC28601c3, 10);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    function5 = function4;
                    objM87133R7 = new C11558r(function5, c11031r, interfaceC28601c3, 10);
                    c28655q.m87172p0(objM87133R7);
                }
                AbstractC13410e.m37926c(c11016cM29679i, textResourceM29671a, modifierM3398t, false, (InterfaceC4339a) objM87133R7, c28655q, i25, 8);
                if (c11031r.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                    c2314t2 = c2314t;
                    r10 = 1;
                    i18 = i17;
                    c28655q.m87150e0(-291002105);
                    c28655q.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    r10 = 1;
                    i18 = i17;
                    c28655q.m87150e0(-291002105);
                    c28655q.m87173q(false);
                }
                AbstractC30007c.m91851u(c2314t2, f15, c28655q, r10);
                if (i18 == 32) {
                    r14 = r10;
                } else {
                    r14 = 0;
                }
                objM87133R8 = c28655q.m87133R();
                if (r14 == 0) {
                    function6 = function5;
                    objM87133R8 = new C13390j(function6, 20);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    function6 = function5;
                    objM87133R8 = new C13390j(function6, 20);
                    c28655q.m87172p0(objM87133R8);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, false, c28655q, 0, r10);
                function2 = function6;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11736b(viewState, i13, function2, i14, 17);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R9 = c28655q2.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C13406a(24);
                    c28655q2.m87172p0(objM87133R9);
                }
                function3 = (Function1) objM87133R9;
            } else {
                function3 = function2;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Integer.valueOf(viewState.getCurrentValue()));
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            c2314t = C2314t.f9131w;
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM66722k2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (!c28655q2.f115903S) {
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            TextResource textResourceM29677g2 = viewState.getNavigationTitle();
            TextResource textResourceM29676f2 = viewState.getNavigationSubtitle();
            textResourceM29681k = viewState.getSkipTitle();
            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                z13 = false;
            } else {
                z13 = false;
            }
            if (z13) {
                textResource = textResourceM29681k;
            } else {
                textResource = null;
            }
            i16 = i15 & 14;
            if (i16 != 4) {
                z14 = true;
            } else {
                z14 = true;
            }
            i17 = i15 & 112;
            if (i17 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z14 | z15;
            objM87133R2 = c28655q2.m87133R();
            if (z16) {
                objM87133R2 = new C11546l(20, viewState, function3);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C11546l(20, viewState, function3);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            if (i17 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R3 = c28655q2.m87133R();
            if (z17) {
                objM87133R3 = new C13390j(function3, 19);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C13390j(function3, 19);
                c28655q2.m87172p0(objM87133R3);
            }
            int i28 = TextResource.$stable;
            int i29 = i28 | (i28 << 3);
            function4 = function3;
            AbstractC13424s.m38062e(textResourceM29677g2, textResourceM29676f2, 0, textResource, interfaceC4339a2, (InterfaceC4339a) objM87133R3, c28655q2, i29 | (i28 << 9), 4);
            float f18 = 3;
            float f19 = 8;
            float f110 = f18 * f19;
            Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3397s(c2314t, f110, f110, f110, ((float) 1.5d) * f19), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierMo3471e2 = modifierM92116f1.mo3471e(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            C2305k c2305k2 = C2299e.f9111N;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, c2305k2, c28655q2, 54);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            String strM21274h3 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q2, i28);
            ?? r16 = C38072d.f163053a;
            int i210 = C38072d.f163054b;
            long jM125430y2 = r16.m121949b(c28655q2, i210).getBrandWhite();
            C2886a c2886aM8416N2 = r16.m121952e(c28655q2, i210).getT1();
            int i211 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h3, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N2, null, c28655q2, 0, i211, 196602);
            float f111 = 4;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(2 * f111, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescriptionDisplay(), c28655q2, i28), null, r16.m121949b(c28655q2, i210).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r16.m121952e(c28655q2, i210).getB1(), null, c28655q2, 0, i211, 196602);
            float f112 = f18 * f111;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f112, c2314t));
            strM21274h = AbstractC8693b.m21274h(viewState.getTrailingText(), c28655q2, i28);
            TextResource textResourceM29683m2 = viewState.getTrailingText();
            int iM38123m2 = m38123m(interfaceC28601c1);
            int iM29675e2 = viewState.getMinValue();
            int iM29674d2 = viewState.getMaxValue();
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                interfaceC28601c2 = interfaceC28601c1;
                objM87133R4 = new C1910d(29, interfaceC28601c2);
                c28655q2.m87172p0(objM87133R4);
            } else {
                interfaceC28601c2 = interfaceC28601c1;
            }
            Function1 function9 = (Function1) objM87133R4;
            objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                objM87133R5 = new C13406a(25);
                c28655q2.m87172p0(objM87133R5);
            }
            Function1 function10 = (Function1) objM87133R5;
            zM87153g = c28655q2.m87153g(strM21274h);
            objM87133R6 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R6 = new C2663y4(strM21274h, 16);
                c28655q2.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C2663y4(strM21274h, 16);
                c28655q2.m87172p0(objM87133R6);
            }
            interfaceC28601c3 = interfaceC28601c2;
            AbstractC37861d.m121396i(null, iM38123m2, iM29675e2, iM29674d2, false, function9, function10, false, false, textResourceM29683m2, (Function1) objM87133R6, c28655q2, (i28 << 27) | 102457350, 0, 128);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f110, ((float) 0.5d) * f19, f110, 0.0f, 8);
            C11016c c11016cM29679i2 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
            TextResource textResourceM29671a2 = viewState.getButtonTitle();
            if (i17 == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (i16 != 4) {
                c11031r = viewState;
                if ((i15 & 8) != 0) {
                }
                z19 = false;
                z24 = z18 | z19;
                objM87133R7 = c28655q.m87133R();
                if (z24) {
                    function5 = function4;
                    objM87133R7 = new C11558r(function5, c11031r, interfaceC28601c3, 10);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    function5 = function4;
                    objM87133R7 = new C11558r(function5, c11031r, interfaceC28601c3, 10);
                    c28655q.m87172p0(objM87133R7);
                }
                AbstractC13410e.m37926c(c11016cM29679i2, textResourceM29671a2, modifierM3398t2, false, (InterfaceC4339a) objM87133R7, c28655q, i29, 8);
                if (c11031r.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                    c2314t2 = c2314t;
                    r10 = 1;
                    i18 = i17;
                    c28655q.m87150e0(-291002105);
                    c28655q.m87173q(false);
                } else {
                    c2314t2 = c2314t;
                    r10 = 1;
                    i18 = i17;
                    c28655q.m87150e0(-291002105);
                    c28655q.m87173q(false);
                }
                AbstractC30007c.m91851u(c2314t2, f110, c28655q, r10);
                if (i18 == 32) {
                    r14 = r10;
                } else {
                    r14 = 0;
                }
                objM87133R8 = c28655q.m87133R();
                if (r14 == 0) {
                    function6 = function5;
                    objM87133R8 = new C13390j(function6, 20);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    function6 = function5;
                    objM87133R8 = new C13390j(function6, 20);
                    c28655q.m87172p0(objM87133R8);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, false, c28655q, 0, r10);
                function2 = function6;
            } else {
                c11031r = viewState;
            }
            z19 = true;
            z24 = z18 | z19;
            objM87133R7 = c28655q.m87133R();
            if (z24) {
                function5 = function4;
                objM87133R7 = new C11558r(function5, c11031r, interfaceC28601c3, 10);
                c28655q.m87172p0(objM87133R7);
            } else {
                function5 = function4;
                objM87133R7 = new C11558r(function5, c11031r, interfaceC28601c3, 10);
                c28655q.m87172p0(objM87133R7);
            }
            AbstractC13410e.m37926c(c11016cM29679i2, textResourceM29671a2, modifierM3398t2, false, (InterfaceC4339a) objM87133R7, c28655q, i29, 8);
            if (c11031r.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                c2314t2 = c2314t;
                r10 = 1;
                i18 = i17;
                c28655q.m87150e0(-291002105);
                c28655q.m87173q(false);
            } else {
                c2314t2 = c2314t;
                r10 = 1;
                i18 = i17;
                c28655q.m87150e0(-291002105);
                c28655q.m87173q(false);
            }
            AbstractC30007c.m91851u(c2314t2, f110, c28655q, r10);
            if (i18 == 32) {
                r14 = r10;
            } else {
                r14 = 0;
            }
            objM87133R8 = c28655q.m87133R();
            if (r14 == 0) {
                function6 = function5;
                objM87133R8 = new C13390j(function6, 20);
                c28655q.m87172p0(objM87133R8);
            } else {
                function6 = function5;
                objM87133R8 = new C13390j(function6, 20);
                c28655q.m87172p0(objM87133R8);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R8, false, c28655q, 0, r10);
            function2 = function6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11736b(viewState, i13, function2, i14, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m38122l(AbstractC11022i it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final int m38123m(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: renamed from: n */
    private static final void m38124n(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m38125o(C11031r c11031r, Function1 function1) {
        HormonalScreenId hormonalScreenIdM29680j = c11031r.getSkipNextId();
        if (hormonalScreenIdM29680j != null) {
            function1.invoke(new AbstractC11022i.f(hormonalScreenIdM29680j));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m38126p(Function1 function1) {
        function1.invoke(AbstractC11022i.a.f34542a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m38127q(InterfaceC28601c1 interfaceC28601c1, int i13) {
        m38124n(interfaceC28601c1, i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m38128r(int i13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final String m38129s(String str, int i13) {
        return i13 + " " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m38130t(Function1 function1, C11031r c11031r, InterfaceC28601c1 interfaceC28601c1) {
        function1.invoke(new AbstractC11022i.d(c11031r.getNextId(), new C40925b(null, null, Integer.valueOf(m38123m(interfaceC28601c1)), null, null, null, null, 123, null)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m38131u(Function1 function1, C11031r c11031r, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC11022i.f(c11031r.getSkipNextId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m38132v(Function1 function1) {
        function1.invoke(AbstractC11022i.a.f34542a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m38133w(C11031r c11031r, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m38121k(c11031r, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
