package mm1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2626t2;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.service.network.model.UserSessionDto;
import e93.AbstractC12889b;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.util.List;
import l83.C23454a0;
import lz0.AbstractC24818c;
import lz0.C24816a;
import lz0.C24817b;
import m01.C24875c;
import mi2.C25592o;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24671c;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: mm1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\"\"\u0010\u000e\u001a\u00020\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lmm1/f;", "pregnancyTileState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Lmm1/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "a", "Lmm1/f;", "getSamplePregnancyTileState", "()Lmm1/f;", "setSamplePregnancyTileState", "(Lmm1/f;)V", "samplePregnancyTileState", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25691e {

    /* JADX INFO: renamed from: a */
    private static C25692f f101181a;

    static {
        EnumC16313m0 enumC16313m0 = EnumC16313m0.PREGNANCY;
        EnumC39333f enumC39333f = EnumC39333f.STRAIN_ZONE_3;
        TextResource textResourceM21278l = AbstractC8693b.m21278l("PREGNANCY - WEEK 32");
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l("3RD TRIMESTER");
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l("March 6, 2024");
        C9598e c9598e = new C9598e(null, null, null, 7, null);
        List listM118959K = AbstractC37056f.m118959K(new C24816a(enumC39333f, 0.0f, 0.33f, null, false), new C24816a(enumC39333f, 0.34f, 0.67f, null, false), new C24816a(enumC39333f, 0.68f, 1.0f, Float.valueOf(0.85f), true));
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
        EnumC39333f enumC39333f2 = EnumC39333f.WHITE_50;
        f101181a = new C25692f(enumC16313m0, textResourceM21278l, textResourceM21278l2, null, enumC39333f, textResourceM21278l3, listM118959K, AbstractC37056f.m118959K(new C24817b(0.0f, textResourceM21278l4, enumC39333f2, false, 8, null), new C24817b(0.32f, AbstractC8693b.m21278l("14"), enumC39333f2, false, 8, null), new C24817b(0.66f, AbstractC8693b.m21278l("28"), enumC39333f2, false, 8, null), new C24817b(0.83f, AbstractC8693b.m21278l("32"), enumC39333f, true), new C24817b(0.98f, AbstractC8693b.m21278l("40"), enumC39333f2, false, 8, null)), c9598e, 8, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:57:0x0110  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m75660e(C25692f pregnancyTileState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        FeatureFlagChecker featureFlagChecker;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        long white5;
        Object objM87133R2;
        AbstractC22676k.m65750j(pregnancyTileState, "pregnancyTileState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1650202955);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(pregnancyTileState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C24875c(29);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
                if (!featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA) || featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA)) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                zM87157i = c28655q.m87157i(pregnancyTileState) | ((i15 & 112) == 32);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C25592o(2, function4, pregnancyTileState);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15);
                float f13 = 4;
                C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * f13);
                if (z13) {
                    c28655q.m87150e0(1002125682);
                    white5 = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                } else {
                    c28655q.m87150e0(1002126673);
                    white5 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5();
                    c28655q.m87173q(false);
                }
                AbstractC12889b.m36263b(modifierM3362g, c33252iM105489e, white5, null, 0 * f13, AbstractC37817c.m121344e(556423432, c28655q, new C2626t2(pregnancyTileState, z13, 7)), c28655q, 1769472, 24);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C24671c(pregnancyTileState, i13, function3, i14, 15);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C24875c(29);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            if (featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                z13 = true;
            } else {
                z13 = true;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            zM87157i = c28655q.m87157i(pregnancyTileState) | ((i15 & 112) == 32);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C25592o(2, function4, pregnancyTileState);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C25592o(2, function4, pregnancyTileState);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) objM87133R, 15);
            float f14 = 4;
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(3 * f14);
            if (z13) {
                c28655q.m87150e0(1002125682);
                white5 = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
            } else {
                c28655q.m87150e0(1002126673);
                white5 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5();
                c28655q.m87173q(false);
            }
            AbstractC12889b.m36263b(modifierM3362g2, c33252iM105489e2, white5, null, 0 * f14, AbstractC37817c.m121344e(556423432, c28655q, new C2626t2(pregnancyTileState, z13, 7)), c28655q, 1769472, 24);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24671c(pregnancyTileState, i13, function3, i14, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m75661f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m75662g(Function1 function1, C25692f c25692f) {
        function1.invoke(c25692f.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v29 */
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
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m75663h(C25692f c25692f, boolean z4, Composer composer, int i13) throws XmlPullParserException, IOException {
        C0209i c0209i;
        C2886a h7;
        int i14;
        float f13;
        boolean z13;
        long jM73366B;
        C38072d c38072d;
        ?? r10;
        C2886a h13;
        boolean z14;
        C2886a b6;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1102d.m3409f(1.0f, c2314t));
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
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C2306l c2306l = C2299e.f9108K;
            C22961h c22961h = AbstractC22977m.f90656g;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            C23000t1 c23000t1 = C23000t1.f90727a;
            Modifier modifierMo66772c = c23000t1.mo66772c(c23000t1.m66773d(), true, 2.0f);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo66772c);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            if (z4) {
                c0209i4 = c0209i4;
                c0209i = c0209i5;
                c22961h = c22961h;
                c28655q.m87150e0(-513395112);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1402049108);
                EnumC16313m0 enumC16313m0M75669e = c25692f.getIcon();
                if (enumC16313m0M75669e == null) {
                    c28655q.m87150e0(-513849387);
                    c28655q.m87173q(false);
                    c0209i = c0209i5;
                } else {
                    float f14 = 4;
                    c0209i = c0209i5;
                    AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q, -513849386, enumC16313m0M75669e, c28655q, 6), null, AbstractC1102d.m3419p(6 * f14, c2314t), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite30(), c28655q, 432, 0);
                    AbstractC31061c.m95650z(f14, f14, c2314t, c28655q, false);
                }
                c28655q.m87173q(false);
            }
            TextResource textResourceM75672h = c25692f.getTitle();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM75672h, c28655q, i15);
            if (z4) {
                c28655q.m87150e0(-1402029235);
                h7 = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getSh4();
            } else {
                c28655q.m87150e0(-1402028244);
                h7 = C38072d.f163053a.m121952e(c28655q, C38072d.f163054b).getH4();
            }
            c28655q.m87173q(false);
            C2886a c2886a = h7;
            C38072d c38072d2 = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long brandWhite = c38072d2.m121949b(c28655q, i16).getBrandWhite();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, c28655q, 0, i17, 196602);
            c28655q.m87173q(true);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d2.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q, 6);
            if (z4) {
                f13 = 5;
                i14 = 4;
            } else {
                i14 = 4;
                f13 = 6;
            }
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13 * i14, c2314t);
            if (z4) {
                C38072d c38072d3 = c38072d2;
                jM73366B = AbstractC31061c.m95627c(c28655q, -973680491, c38072d3, c28655q, i16);
                z13 = false;
                c38072d = c38072d3;
            } else {
                C38072d c38072d4 = c38072d2;
                z13 = false;
                jM73366B = AbstractC25012a.m73366B(c28655q, -973679496, c38072d4, c28655q, i16);
                c38072d = c38072d4;
            }
            c28655q.m87173q(z13);
            AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, jM73366B, c28655q, 48, 0);
            c28655q.m87173q(true);
            float f15 = 4;
            AbstractC18489d0.m53380u(f15, f15, c2314t, c28655q);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22961h, C2299e.f9107J, c28655q, 6);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a3);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i, modifierM118962N4);
            String strM21274h2 = AbstractC8693b.m21274h(c25692f.getSubtitle(), c28655q, i15);
            Modifier modifierMo66772c2 = c23000t1.mo66772c(c23000t1.m66773d(), true, 2.0f);
            if (z4) {
                c28655q.m87150e0(-576108359);
                h13 = c38072d.m121952e(c28655q, i16).getH4();
                r10 = 0;
            } else {
                r10 = 0;
                c28655q.m87150e0(-576107399);
                h13 = c38072d.m121952e(c28655q, i16).getH5();
            }
            c28655q.m87173q(r10);
            C38072d c38072d5 = c38072d;
            AbstractC30795n.m94707h(strM21274h2, modifierMo66772c2, c25692f.getActiveColor().mo134584toComposableColorWaAFU9c(c28655q, r10), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h13, null, c28655q, 0, i17, 196600);
            String strM21274h3 = AbstractC8693b.m21274h(c25692f.getDueDate(), c28655q, i15);
            Modifier modifierM66773d = c23000t1.m66773d();
            if (z4) {
                c28655q.m87150e0(-576097415);
                b6 = c38072d5.m121952e(c28655q, i16).getB3();
                z14 = false;
            } else {
                z14 = false;
                c28655q.m87150e0(-576096455);
                b6 = c38072d5.m121952e(c28655q, i16).getB4();
            }
            c28655q.m87173q(z14);
            AbstractC30795n.m94707h(strM21274h3, modifierM66773d, c38072d5.m121949b(c28655q, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, b6, null, c28655q, 0, i17 | 3072, 188408);
            c28655q.m87173q(true);
            AbstractC24818c.m72728d(null, null, c25692f.m75671g(), c25692f.m75670f(), c28655q, 0, 3);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m75664i(C25692f c25692f, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m75660e(c25692f, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
