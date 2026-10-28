package j21;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import b91.EnumC2888c;
import c41.C4092p2;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import e93.AbstractC12889b;
import gb1.AbstractC15676d;
import gz0.EnumC16313m0;
import hy0.AbstractC17755i2;
import hy0.AbstractC17808z1;
import hy0.C17731c2;
import hy0.C17794v;
import ih0.AbstractC18489d0;
import iz0.C21045d;
import j11.C21214q;
import java.io.IOException;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.C27256h;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import v51.AbstractC35703b;
import v51.C35704c;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: j21.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lj21/i;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Lj21/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21246e {

    /* JADX INFO: renamed from: j21.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f81107a;

        static {
            int[] iArr = new int[EnumC21251j.values().length];
            try {
                iArr[EnumC21251j.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21251j.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f81107a = iArr;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m59571e(Modifier modifier, C21250i state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1182211011);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, modifier4), AbstractC33253j.m105489e(12), C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), null, 0, AbstractC37817c.m121344e(-1227590112, c28655q, new C21245d(0, state, onViewEvent)), c28655q, 1769472, 24);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 24, modifier3, (Object) state, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v55 */
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
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m59572f(C21250i c21250i, Function1 function1, Composer composer, int i13) throws XmlPullParserException, IOException {
        ?? r14;
        C17919x c17919xM31989h;
        long jM95624D;
        C2314t c2314t;
        float f13;
        C28655q c28655q;
        boolean z4;
        float f14;
        C2314t c2314t2;
        float f15;
        C28655q c28655q2;
        C2314t c2314t3;
        C28655q c28655q3;
        boolean z13;
        float f16;
        C28655q c28655q4;
        C28655q c28655q5 = (C28655q) composer;
        if (c28655q5.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t4 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t4);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q5, 0);
            int iHashCode = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q5.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q5, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(interfaceC4339a);
            } else {
                c28655q5.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N);
            float f17 = 8;
            float f18 = 2 * f17;
            Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1099a.m3394p(f18, c2314t4), "InsightsItem");
            boolean zM87157i = c28655q5.m87157i(c21250i) | c28655q5.m87153g(function1);
            Object objM87133R = c28655q5.m87133R();
            Object obj = C28635l.f115821a;
            if (zM87157i || objM87133R == obj) {
                objM87133R = new C21214q(c21250i, function1, 1);
                c28655q5.m87172p0(objM87133R);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM44101d, false, null, null, (InterfaceC4339a) objM87133R, 15);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q5, 0);
            int iHashCode2 = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q5.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q5, modifierM3362g);
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(interfaceC4339a);
            } else {
                c28655q5.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q5, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N2);
            float f19 = 1 * f17;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f19), c2305k, c28655q5, 6);
            int iHashCode3 = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q5.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q5, c2314t4);
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(interfaceC4339a);
            } else {
                c28655q5.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q5, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N3);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t4);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f19), AbstractC39414r.m125890i0(c21250i.getDescription()) ? C2299e.f9107J : C2299e.f9108K, c28655q5, 6);
            int iHashCode4 = Long.hashCode(c28655q5.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q5.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q5, modifierM3409f2);
            c28655q5.m87158i0();
            if (c28655q5.f115903S) {
                c28655q5.m87163l(interfaceC4339a);
            } else {
                c28655q5.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q5, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q5, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q5, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q5, c0209i4, modifierM118962N4);
            C17731c2 trend = c21250i.getTrend();
            TextResource text = c21250i.getTrend().getText();
            TextResource textResource = (text == null || !AbstractC8693b.m21270d(text)) ? null : text;
            float f24 = ((float) 0.5d) * f17;
            AbstractC17808z1.m51175c(trend.m50800a((28671 & 1) != 0 ? trend.text : textResource, (28671 & 2) != 0 ? trend.includeBackground : false, (28671 & 4) != 0 ? trend.trendTypeState : null, (28671 & 8) != 0 ? trend.isPressed : false, (28671 & 16) != 0 ? trend.icon : null, (28671 & 32) != 0 ? trend.removeSideRadius : null, (28671 & 64) != 0 ? trend.withIcon : false, (28671 & 128) != 0 ? trend.showBorder : false, (28671 & 256) != 0 ? trend.overflow : 0, (28671 & 512) != 0 ? trend.maxLines : 0, (28671 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? trend.iconSize : c21250i.getLeadingIconStyle().getIconSize(), (28671 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? trend.destination : null, (28671 & 4096) != 0 ? trend.maxFontScaling : null, (28671 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? trend.radius : 0.0f, (28671 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? trend.backgroundPaddingValues : new C22976l1(f24, f24, f24, f24)), c28655q5, C9598e.f28134d);
            String title = c21250i.getTitle();
            EnumC2888c titleStyle = c21250i.getTitleStyle();
            C2886a c2886aM8402a = titleStyle != null ? EnumC2888c.INSTANCE.m8402a(titleStyle) : null;
            if (c2886aM8402a == null) {
                c28655q5.m87150e0(954018024);
                c2886aM8402a = C38072d.f163053a.m121952e(c28655q5, 6).getB1();
                r14 = 0;
            } else {
                r14 = 0;
                c28655q5.m87150e0(954015265);
            }
            c28655q5.m87173q(r14);
            C2886a c2886a = c2886aM8402a;
            EnumC39333f titleColor = c21250i.getTitleColor();
            if (titleColor == 0) {
                c28655q5.m87150e0(-490154264);
                c28655q5.m87173q(r14);
                c17919xM31989h = null;
            } else {
                c28655q5.m87150e0(954019897);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q5, r14, titleColor.mo134584toComposableColorWaAFU9c(c28655q5, r14));
            }
            if (c17919xM31989h == null) {
                c28655q5.m87150e0(954021200);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q5, 6, r14);
            } else {
                c28655q5.m87150e0(954019371);
                c28655q5.m87173q(r14);
                jM95624D = c17919xM31989h.f69639a;
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(title, AbstractC15676d.m44101d(new LayoutWeightElement(1.0f, true), "InsightsItem_Title"), jM95624D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, c28655q5, 0, 0, 196600);
            C28655q c28655q6 = c28655q5;
            EnumC16313m0 rightIcon = c21250i.getRightIcon();
            if (rightIcon == null) {
                c28655q6.m87150e0(-489860260);
                c28655q6.m87173q(false);
                c2314t = c2314t4;
                f13 = f18;
                c28655q = c28655q6;
            } else {
                C27430e c27430eM53378s = AbstractC18489d0.m53378s(c28655q6, -489860259, rightIcon, c28655q6, 6);
                long white50 = C38072d.f163053a.m121949b(c28655q6, 6).getWhite50();
                c2314t = c2314t4;
                Modifier modifierM3419p = AbstractC1102d.m3419p(16, AbstractC1099a.m3398t(c2314t4, f18, 0.0f, 0.0f, 0.0f, 14));
                f13 = f18;
                AbstractC15005f3.m43108b(c27430eM53378s, null, modifierM3419p, white50, c28655q6, 432, 0);
                C28655q c28655q7 = c28655q6;
                c28655q7.m87173q(false);
                c28655q = c28655q7;
            }
            c28655q.m87173q(true);
            int i14 = a.f81107a[c21250i.getTextAlignment().ordinal()];
            if (i14 == 1) {
                z4 = false;
                f14 = 0;
            } else {
                if (i14 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f14 = ((float) 3.5d) * f17;
                z4 = false;
            }
            String description = c21250i.getDescription();
            String str = !AbstractC39414r.m125890i0(description) ? description : null;
            if (str == null) {
                c28655q.m87150e0(1563622097);
                c28655q.m87173q(z4);
                f15 = f14;
                c28655q2 = c28655q;
                c2314t2 = c2314t;
            } else {
                c28655q.m87150e0(1563622098);
                C38072d c38072d = C38072d.f163053a;
                C2886a b6 = c38072d.m121952e(c28655q, 6).getB2();
                long white70 = c38072d.m121949b(c28655q, 6).getWhite70();
                float f25 = f14;
                C28655q c28655q8 = c28655q;
                C2314t c2314t5 = c2314t;
                c2314t2 = c2314t5;
                f15 = f25;
                AbstractC30795n.m94707h(str, AbstractC1099a.m3398t(c2314t5, f25, 0.0f, 0.0f, 0.0f, 14), white70, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q8, 0, 0, 196600);
                C28655q c28655q9 = c28655q8;
                z4 = false;
                c28655q9.m87173q(false);
                c28655q2 = c28655q9;
            }
            String actionRecommendation = c21250i.getActionRecommendation();
            if (actionRecommendation == null) {
                c28655q2.m87150e0(1564003118);
                c28655q2.m87173q(z4);
                c28655q3 = c28655q2;
                c2314t3 = c2314t2;
            } else {
                c28655q2.m87150e0(1564003119);
                C38072d c38072d2 = C38072d.f163053a;
                C2886a b8 = c38072d2.m121952e(c28655q2, 6).getB2();
                long brandWhite = c38072d2.m121949b(c28655q2, 6).getBrandWhite();
                C2314t c2314t6 = c2314t2;
                C28655q c28655q10 = c28655q2;
                c2314t3 = c2314t6;
                AbstractC30795n.m94707h(actionRecommendation, AbstractC1099a.m3398t(c2314t6, f15, 0.0f, 0.0f, 0.0f, 14), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b8, null, c28655q10, 0, 0, 196600);
                C28655q c28655q11 = c28655q10;
                c28655q11.m87173q(false);
                c28655q3 = c28655q11;
            }
            c28655q3.m87173q(true);
            boolean z14 = (c21250i.getCallout() == null && c21250i.getActionButton() == null) ? false : true;
            Object objM87133R2 = c28655q3.m87133R();
            if (objM87133R2 == obj) {
                objM87133R2 = new C21045d(16);
                c28655q3.m87172p0(objM87133R2);
            }
            Modifier modifierM44099b = AbstractC15676d.m44099b(c2314t3, z14, (Function1) objM87133R2);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), c2305k, c28655q3, 6);
            int iHashCode5 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM44099b);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m5);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode5))) {
                AbstractC11266d.m30471y(iHashCode5, c28655q3, iHashCode5, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N5);
            C4092p2 callout = c21250i.getCallout();
            if (callout == null) {
                c28655q3.m87150e0(-1884682376);
                z13 = false;
                c28655q3.m87173q(false);
                f16 = f13;
            } else {
                z13 = false;
                c28655q3.m87150e0(-1884682375);
                f16 = f13;
                AbstractC25303l.m74291r(callout, null, null, function1, c28655q3, 0, 6);
                c28655q3.m87173q(false);
            }
            C27256h actionButton = c21250i.getActionButton();
            if (actionButton == null) {
                c28655q3.m87150e0(-1884434438);
                c28655q3.m87173q(z13);
            } else {
                c28655q3.m87150e0(-1884434437);
                AbstractC25303l.m74291r(actionButton, null, null, function1, c28655q3, 0, 6);
                c28655q3.m87173q(z13);
            }
            c28655q3.m87173q(true);
            c28655q3.m87173q(true);
            C35704c expandableContent = c21250i.getExpandableContent();
            if (expandableContent == null) {
                c28655q3.m87150e0(1679518952);
                c28655q3.m87173q(z13);
                c28655q4 = c28655q3;
            } else {
                c28655q3.m87150e0(1679518953);
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t3, f16, 0.0f, 2);
                C38072d c38072d3 = C38072d.f163053a;
                C28655q c28655q12 = c28655q3;
                AbstractC17755i2.m50938j(modifierM3396r, null, null, null, null, 0L, c38072d3.m121949b(c28655q3, 6).getWhite10(), null, c28655q12, 6, 190);
                C28655q c28655q13 = c28655q12;
                AbstractC35703b.m113153h(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t3), f16, 0.0f, 2), C35704c.m113165b(expandableContent, null, null, null, null, null, false, null, false, new C17919x(c38072d3.m121949b(c28655q13, 6).getBlack20()), new C39174f(f16), null, null, null, 7423, null), function1, c28655q13, 6, 0);
                c28655q13.m87173q(false);
                c28655q4 = c28655q13;
            }
            c28655q4.m87173q(true);
        } else {
            c28655q5.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m59573g(C21250i c21250i, Function1 function1) {
        C9598e destination = c21250i.getDestination();
        if (destination != null) {
            function1.invoke(new AbstractC21243b.b(destination));
        } else {
            function1.invoke(new AbstractC21243b.a(c21250i.getId()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Modifier m59574h(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1099a.m3398t(applyIf, 0.0f, 2 * 8, 0.0f, 0.0f, 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m59575i(Modifier modifier, C21250i c21250i, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m59571e(modifier, c21250i, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
