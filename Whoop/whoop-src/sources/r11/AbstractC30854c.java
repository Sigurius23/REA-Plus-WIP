package r11;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17755i2;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import wy0.AbstractC37692c;
import wy0.EnumC37693d;
import x81.AbstractC38073e;
import x81.C38072d;
import xy0.AbstractC38699b;
import z51.AbstractC40093d;
import z51.AbstractC40097h;
import z51.EnumC40100k;

/* JADX INFO: renamed from: r11.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ac\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"", "showOptimalStrain", "", "optimalStrainPercentage", "Ll83/k;", "optimalStrainRange", "recoveryPercentage", "Lz51/k;", "recoveryType", "strainScorePercentage", "Lcom/whoop/design/util/TextResource;", "descriptionSubText", "descriptionText", "hasDivider", "Ll83/a0;", "b", "(ZFLl83/k;FLz51/k;FLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30854c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    /* JADX INFO: renamed from: b */
    public static final void m94907b(final boolean z4, final float f13, final C23465k optimalStrainRange, final float f14, final EnumC40100k recoveryType, final float f15, TextResource descriptionSubText, TextResource descriptionText, final boolean z13, Composer composer, final int i13) {
        int i14;
        final TextResource textResource;
        final TextResource textResource2;
        C28655q c28655q;
        C22957g c22957g;
        C0209i c0209i;
        int i15;
        boolean z14;
        char c3;
        C28655q c28655q2;
        C38072d c38072d;
        C0209i c0209i2;
        C0209i c0209i3;
        C2314t c2314t;
        float f16;
        C28655q c28655q3;
        ?? r10;
        C28655q c28655q4;
        C28655q c28655q5;
        C28655q c28655q6;
        AbstractC22676k.m65750j(optimalStrainRange, "optimalStrainRange");
        Object obj = optimalStrainRange.f92938x;
        Object obj2 = optimalStrainRange.f92937w;
        AbstractC22676k.m65750j(recoveryType, "recoveryType");
        AbstractC22676k.m65750j(descriptionSubText, "descriptionSubText");
        AbstractC22676k.m65750j(descriptionText, "descriptionText");
        C28655q c28655q7 = (C28655q) composer;
        c28655q7.m87154g0(-160003449);
        if ((i13 & 6) == 0) {
            i14 = (c28655q7.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q7.m87147d(f13) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q7.m87153g(optimalStrainRange) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q7.m87147d(f14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q7.m87149e(recoveryType.ordinal()) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q7.m87147d(f15) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q7.m87153g(descriptionSubText) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q7.m87153g(descriptionText) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i14 |= c28655q7.m87155h(z13) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        int i16 = i14;
        if (c28655q7.m87135U(i16 & 1, (i16 & 38347923) != 38347922)) {
            boolean zIsFeatureEnabled = ((FeatureFlagChecker) c28655q7.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.WTE_NEW_GAUGE);
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q7, 0);
            int iHashCode = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q7.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q7, c2314t2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q7.m87158i0();
            if (c28655q7.f115903S) {
                c28655q7.m87163l(c0213j);
            } else {
                c28655q7.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q7, c0209i4, c23010xM66775a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q7, c0209i7, modifierM118962N);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q7, 48);
            int iHashCode2 = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q7.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q7, c2314t2);
            c28655q7.m87158i0();
            if (c28655q7.f115903S) {
                c28655q7.m87163l(c0213j);
            } else {
                c28655q7.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q7, c0209i4, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m2);
            if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q7, iHashCode2, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q7, c0209i7, modifierM118962N2);
            Modifier modifierM3419p = AbstractC1102d.m3419p(AbstractC40097h.m128564N(), c2314t2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode3 = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q7.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q7, modifierM3419p);
            c28655q7.m87158i0();
            if (c28655q7.f115903S) {
                c28655q7.m87163l(c0213j);
            } else {
                c28655q7.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q7, c0209i4, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q7, c0209i5, interfaceC28653p1M87165m3);
            if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q7, iHashCode3, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q7, c0209i7, modifierM118962N3);
            if (z4) {
                c28655q7.m87150e0(1460179005);
                if (zIsFeatureEnabled) {
                    c28655q7.m87150e0(1460202596);
                    float fM128568R = AbstractC40097h.m128568R();
                    Number number = (Number) obj2;
                    float fFloatValue = number.floatValue() * 360.0f;
                    float fFloatValue2 = ((Number) obj).floatValue() - number.floatValue();
                    C38072d c38072d2 = C38072d.f163053a;
                    AbstractC18247a abstractC18247aM52577o = AbstractC18249c.m52577o(c38072d2.m121949b(c28655q7, 6).getWhite20());
                    EnumC37693d enumC37693d = EnumC37693d.ARC;
                    c22957g = c22957g2;
                    c0209i = c0209i5;
                    c3 = 2;
                    i15 = 4;
                    AbstractC37692c.m121117c(null, fM128568R, fFloatValue2, abstractC18247aM52577o, AbstractC40097h.m128565O(), false, fFloatValue, 0, enumC37693d, c28655q7, 100884528, 129);
                    AbstractC37692c.m121117c(null, AbstractC40097h.m128568R(), f13, AbstractC18249c.m52577o(c38072d2.m121949b(c28655q7, 6).getTransparent()), AbstractC40097h.m128565O(), true, 0.0f, 0, enumC37693d, c28655q7, ((i16 << 3) & 896) | 100884528, 193);
                    C28655q c28655q8 = c28655q7;
                    z14 = false;
                    c28655q8.m87173q(false);
                    c28655q6 = c28655q8;
                } else {
                    c22957g = c22957g2;
                    c0209i = c0209i5;
                    i15 = 4;
                    c3 = 2;
                    c28655q7.m87150e0(1461325881);
                    AbstractC37692c.m121117c(null, AbstractC40097h.m128568R(), f13, AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q7, 6).getWhite20()), AbstractC40097h.m128565O(), true, 0.0f, 0, EnumC37693d.ARC, c28655q7, ((i16 << 3) & 896) | 100884528, 193);
                    C28655q c28655q9 = c28655q7;
                    AbstractC38699b.m124109c(AbstractC40097h.m128564N() / 2, ((Number) obj2).floatValue(), ((Number) obj).floatValue(), c28655q9, 6);
                    z14 = false;
                    c28655q9.m87173q(false);
                    c28655q6 = c28655q9;
                }
                c28655q6.m87173q(z14);
                c28655q2 = c28655q6;
            } else {
                c0213j = c0213j;
                c22957g = c22957g2;
                c0209i = c0209i5;
                i15 = 4;
                z14 = false;
                c3 = 2;
                c28655q7.m87150e0(1461929947);
                c28655q7.m87173q(false);
                c28655q2 = c28655q7;
            }
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(5 * i15, c2314t2);
            C38072d c38072d3 = C38072d.f163053a;
            C28655q c28655q10 = c28655q2;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d3.m121951d().getLogo().getWhoop(), c28655q2, 6), null, modifierM3419p2, c38072d3.m121949b(c28655q2, 6).getBrandWhite(), c28655q10, 432, 0);
            C28655q c28655q11 = c28655q10;
            if (f14 > 0.0f) {
                c28655q11.m87150e0(1462317602);
                AbstractC37692c.m121117c(null, AbstractC40097h.m128567Q(), 1.0f, AbstractC18249c.m52577o(c38072d3.m121949b(c28655q11, 6).getWhite10()), AbstractC40097h.m128565O(), false, 0.0f, 0, null, c28655q11, 25008, 481);
                C28655q c28655q12 = c28655q11;
                f16 = 0.0f;
                c0209i3 = c0209i;
                c38072d = c38072d3;
                c2314t = c2314t2;
                c0209i2 = c0209i6;
                r10 = 0;
                AbstractC37692c.m121117c(null, AbstractC40097h.m128567Q(), f14, AbstractC18249c.m52577o(AbstractC40093d.m128548t(recoveryType, c28655q12, (i16 >> 12) & 14)), AbstractC40097h.m128565O(), false, 0.0f, zIsFeatureEnabled ? 1 : 0, null, c28655q12, ((i16 >> 3) & 896) | 24624, 353);
                c28655q12.m87173q(false);
                c28655q3 = c28655q12;
            } else {
                c38072d = c38072d3;
                c0209i2 = c0209i6;
                boolean z15 = z14;
                c0209i3 = c0209i;
                c2314t = c2314t2;
                f16 = 0.0f;
                c28655q11.m87150e0(1462987419);
                c28655q11.m87173q(z15);
                r10 = z15;
                c28655q3 = c28655q11;
            }
            if (f15 > f16) {
                c28655q3.m87150e0(1463088262);
                C28655q c28655q13 = c28655q3;
                AbstractC37692c.m121117c(null, AbstractC40097h.m128568R(), 1.0f, AbstractC18249c.m52577o(c38072d.m121949b(c28655q3, 6).getWhite10()), AbstractC40097h.m128565O(), false, 0.0f, 0, null, c28655q13, 25008, 481);
                C28655q c28655q14 = c28655q13;
                AbstractC37692c.m121117c(null, AbstractC40097h.m128568R(), f15, AbstractC18249c.m52577o(c38072d.m121949b(c28655q14, 6).getStrain()), AbstractC40097h.m128565O(), false, 0.0f, zIsFeatureEnabled ? 1 : 0, null, c28655q14, ((i16 >> 9) & 896) | 24624, 353);
                c28655q14.m87173q(r10);
                c28655q4 = c28655q14;
            } else {
                c28655q3.m87150e0(1463754235);
                c28655q3.m87173q(r10);
                c28655q4 = c28655q3;
            }
            c28655q4.m87173q(true);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, r10);
            int iHashCode4 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
            C2314t c2314t3 = c2314t;
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, c2314t3);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(c0213j);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i4, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q4, iHashCode4, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i7, modifierM118962N4);
            float f17 = 2 * 8;
            textResource2 = descriptionText;
            C28655q c28655q15 = c28655q4;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q4, (i16 >> 21) & 14), AbstractC1099a.m3396r(c2314t3, f17, f16, 2), c38072d.m121949b(c28655q4, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q4, 6).getN6(), null, c28655q15, 48, 0, 196088);
            textResource = descriptionSubText;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q15, (i16 >> 18) & 14), AbstractC1099a.m3396r(c2314t3, f17, 0.0f, 2), c38072d.m121949b(c28655q15, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q15, 6).getB2(), null, c28655q15, 48, 0, 196088);
            C28655q c28655q16 = c28655q15;
            c28655q16.m87173q(true);
            c28655q16.m87173q(true);
            if (z13) {
                c28655q16.m87150e0(-2099227881);
                AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t3, f17, 0.0f, 2), null, null, null, null, 0L, 0L, null, c28655q16, 6, 254);
                C28655q c28655q17 = c28655q16;
                c28655q17.m87173q(r10);
                c28655q5 = c28655q17;
            } else {
                c28655q16.m87150e0(-2099091419);
                c28655q16.m87173q(r10);
                c28655q5 = c28655q16;
            }
            c28655q5.m87173q(true);
            c28655q = c28655q5;
        } else {
            textResource = descriptionSubText;
            textResource2 = descriptionText;
            c28655q7.m87138X();
            c28655q = c28655q7;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: r11.b
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj4).intValue();
                    return AbstractC30854c.m94908c(z4, f13, optimalStrainRange, f14, recoveryType, f15, textResource, textResource2, z13, i13, (Composer) obj3, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m94908c(boolean z4, float f13, C23465k c23465k, float f14, EnumC40100k enumC40100k, float f15, TextResource textResource, TextResource textResource2, boolean z13, int i13, Composer composer, int i14) {
        m94907b(z4, f13, c23465k, f14, enumC40100k, f15, textResource, textResource2, z13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
