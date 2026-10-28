package c41;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bg0.C3226h;
import com.whoop.design.util.AbstractC8693b;
import gb1.AbstractC15680h;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.v4 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aS\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a/\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "filledCount", "totalCount", "resourceId", "Ly81/f;", "iconColor", "backgroundColor", "", "showCount", "fillMaxWidth", "Ll83/a0;", "e", "(Landroidx/compose/ui/Modifier;IIILy81/f;Ly81/f;ZZLandroidx/compose/runtime/Composer;II)V", "isFilled", "c", "(Ly81/f;Ly81/f;IZLandroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4136v4 {
    /* JADX INFO: renamed from: c */
    public static final void m12834c(EnumC39333f iconColor, EnumC39333f backgroundColor, int i13, boolean z4, Composer composer, int i14) {
        int i15;
        AbstractC22676k.m65750j(iconColor, "iconColor");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1856341504);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87149e(iconColor.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87149e(backgroundColor.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87149e(i13) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            EnumC39333f enumC39333f = z4 ? backgroundColor : EnumC39333f.TRANSPARENT;
            float f13 = 4;
            int i16 = i15 & 14;
            C13825t c13825tM48880a = AbstractC17269i.m48880a(((float) 0.3d) * f13, C17919x.m51541c(!z4 ? 0.5f : 1.0f, iconColor.mo134584toComposableColorWaAFU9c(c28655q, i16)));
            C33252i c33252i = AbstractC33253j.f138651a;
            float f14 = c13825tM48880a.f49345a;
            AbstractC17911t abstractC17911t = c13825tM48880a.f49346b;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44112a = AbstractC15680h.m44112a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(8 * f13, AbstractC15751g.m44456i(f14, c2314t, abstractC17911t, c33252i)), c33252i), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q, 0), AbstractC17918w0.f69621a), true);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44112a);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (z4) {
                c28655q.m87150e0(126837983);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q, ((i15 >> 3) & 112) | 6), AbstractC8693b.m21275i("null", c28655q, 6), AbstractC1102d.m3419p(3 * f13, AbstractC15680h.m44112a(c2314t, true)), iconColor.mo134584toComposableColorWaAFU9c(c28655q, i16), c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(127154152);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(iconColor, backgroundColor, i13, z4, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m12835d(EnumC39333f enumC39333f, EnumC39333f enumC39333f2, int i13, boolean z4, int i14, Composer composer, int i15) {
        m12834c(enumC39333f, enumC39333f2, i13, z4, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m12836e(Modifier modifier, int i13, int i14, int i15, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, boolean z4, boolean z13, Composer composer, int i16, int i17) {
        Modifier modifier2;
        int i18;
        boolean z14;
        boolean z15;
        Modifier modifier3;
        boolean z16;
        EnumC39333f iconColor = enumC39333f;
        C2306l c2306l = C2299e.f9107J;
        AbstractC22676k.m65750j(iconColor, "iconColor");
        EnumC39333f backgroundColor = enumC39333f2;
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(145286480);
        int i19 = i17 & 1;
        if (i19 != 0) {
            i18 = i16 | 6;
            modifier2 = modifier;
        } else if ((i16 & 6) == 0) {
            modifier2 = modifier;
            i18 = (c28655q.m87153g(modifier2) ? 4 : 2) | i16;
        } else {
            modifier2 = modifier;
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i18 |= c28655q.m87149e(i14) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i18 |= c28655q.m87149e(i15) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i16 & 24576) == 0) {
            i18 |= c28655q.m87149e(iconColor.ordinal()) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i16) == 0) {
            i18 |= c28655q.m87149e(backgroundColor.ordinal()) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i16) == 0) {
            i18 |= c28655q.m87155h(z4) ? 1048576 : 524288;
        }
        int i24 = i17 & 128;
        if (i24 != 0) {
            i18 |= 12582912;
            z14 = z13;
        } else {
            z14 = z13;
            if ((i16 & 12582912) == 0) {
                i18 |= c28655q.m87155h(z14) ? 8388608 : 4194304;
            }
        }
        int i25 = i18;
        if (c28655q.m87135U(i25 & 1, (i18 & 4793491) != 4793490)) {
            Modifier modifierM3409f = C2314t.f9131w;
            if (i19 != 0) {
                modifier2 = modifierM3409f;
            }
            boolean z17 = i24 != 0 ? true : z14;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(2 * 4);
            if (z17) {
                modifierM3409f = AbstractC1102d.m3409f(1.0f, modifierM3409f);
            }
            Modifier modifierMo3471e = modifier2.mo3471e(modifierM3409f);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(1162999030);
            int i26 = 0;
            while (i26 < i14) {
                if (i26 < i13) {
                    c28655q.m87150e0(1693290774);
                    int i27 = i25 >> 12;
                    m12834c(iconColor, backgroundColor, i15, true, c28655q, (i27 & 112) | (i27 & 14) | 3072 | ((i25 >> 3) & 896));
                    c28655q.m87173q(false);
                    iconColor = enumC39333f;
                } else {
                    c28655q.m87150e0(1693384053);
                    int i28 = i25 >> 12;
                    int i29 = (i28 & 112) | (i28 & 14) | 3072 | ((i25 >> 3) & 896);
                    iconColor = enumC39333f;
                    m12834c(iconColor, enumC39333f2, i15, false, c28655q, i29);
                    c28655q.m87173q(false);
                }
                i26++;
                backgroundColor = enumC39333f2;
            }
            c28655q.m87173q(false);
            if (z4) {
                c28655q.m87150e0(1693529443);
                C22949e c22949e = AbstractC22977m.f90651b;
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier2);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 6);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                modifier3 = modifier2;
                z16 = true;
                AbstractC30795n.m94707h(AbstractC8693b.m21275i(i13 + "/" + i14, c28655q, 0), null, iconColor.mo134584toComposableColorWaAFU9c(c28655q, (i25 >> 12) & 14), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN6(), null, c28655q, 0, 0, 196602);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                modifier3 = modifier2;
                z16 = true;
                c28655q.m87150e0(1693888206);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z16);
            modifier2 = modifier3;
            z15 = z17;
        } else {
            c28655q.m87138X();
            z15 = z14;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4129u4(modifier2, i13, i14, i15, iconColor, enumC39333f2, z4, z15, i16, i17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m12837f(Modifier modifier, int i13, int i14, int i15, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, boolean z4, boolean z13, int i16, int i17, Composer composer, int i18) {
        m12836e(modifier, i13, i14, i15, enumC39333f, enumC39333f2, z4, z13, composer, AbstractC28683x.m87244L(i16 | 1), i17);
        return C23454a0.f92919a;
    }
}
