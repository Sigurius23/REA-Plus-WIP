package mh0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.material.C1119d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.models.items.ActionButtonStyle;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15680h;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import java.util.Locale;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15210z4;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p292l1.C23108i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24958m;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: mh0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ae\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/design/util/TextResource;", "title", "Lgz0/m0;", "icon", "Lcom/whoop/design/models/items/ActionButtonStyle;", "style", "Ly81/e;", "foregroundColor", "iconColor", "backgroundColor", "", "enabled", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "c", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/models/items/ActionButtonStyle;Ly81/e;Ly81/e;Ly81/e;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25552d {

    /* JADX INFO: renamed from: mh0.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f100194a;

        static {
            int[] iArr = new int[ActionButtonStyle.values().length];
            try {
                iArr[ActionButtonStyle.ICON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionButtonStyle.PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActionButtonStyle.SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f100194a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0162  */
    /* JADX WARN: Code duplicated, block: B:105:0x0167  */
    /* JADX WARN: Code duplicated, block: B:108:0x017c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0180  */
    /* JADX WARN: Code duplicated, block: B:112:0x0183  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:123:0x0216  */
    /* JADX WARN: Code duplicated, block: B:126:0x0220  */
    /* JADX WARN: Code duplicated, block: B:127:0x022d  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:134:0x0323  */
    /* JADX WARN: Code duplicated, block: B:135:0x0327  */
    /* JADX WARN: Code duplicated, block: B:140:0x0348  */
    /* JADX WARN: Code duplicated, block: B:143:0x0352  */
    /* JADX WARN: Code duplicated, block: B:144:0x035d  */
    /* JADX WARN: Code duplicated, block: B:146:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:148:0x0420  */
    /* JADX WARN: Code duplicated, block: B:149:0x0424  */
    /* JADX WARN: Code duplicated, block: B:154:0x0445  */
    /* JADX WARN: Code duplicated, block: B:157:0x044f  */
    /* JADX WARN: Code duplicated, block: B:159:0x045c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0493  */
    /* JADX WARN: Code duplicated, block: B:165:0x049f  */
    /* JADX WARN: Code duplicated, block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:81:0x0100  */
    /* JADX WARN: Code duplicated, block: B:85:0x0111  */
    /* JADX WARN: Code duplicated, block: B:86:0x0113  */
    /* JADX WARN: Code duplicated, block: B:89:0x011c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0120  */
    /* JADX WARN: Code duplicated, block: B:93:0x0123  */
    /* JADX WARN: Code duplicated, block: B:96:0x0128  */
    /* JADX WARN: Code duplicated, block: B:98:0x012e  */
    /* JADX INFO: renamed from: c */
    public static final void m75133c(Modifier modifier, TextResource title, EnumC16313m0 enumC16313m0, ActionButtonStyle style, InterfaceC39332e foregroundColor, InterfaceC39332e iconColor, InterfaceC39332e backgroundColor, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z13;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        int i18;
        boolean z14;
        C28655q c28655q;
        boolean z15;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a3;
        long jMo134584toComposableColorWaAFU9c;
        long jMo134584toComposableColorWaAFU9c2;
        long jMo134584toComposableColorWaAFU9c3;
        float f13;
        C33252i c33252iM105489e;
        float f14;
        Modifier modifierM107879c;
        int i19;
        boolean z16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z17;
        C28655q c28655q2;
        boolean z18;
        InterfaceC4339a interfaceC4339a4;
        boolean z19;
        int iHashCode2;
        C0213j c0213j2;
        C0209i c0209i2;
        C28655q c28655q3;
        Object objM87133R;
        int iHashCode3;
        C0213j c0213j3;
        C0209i c0209i3;
        C28655q c28655q4;
        Object objM87133R2;
        C2306l c2306l = C2299e.f9108K;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(foregroundColor, "foregroundColor");
        AbstractC22676k.m65750j(iconColor, "iconColor");
        AbstractC22676k.m65750j(backgroundColor, "backgroundColor");
        C28655q c28655q5 = (C28655q) composer;
        c28655q5.m87154g0(-2112513841);
        int i24 = i14 & 1;
        if (i24 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q5.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q5.m87153g(title) : c28655q5.m87157i(title) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q5.m87149e(enumC16313m0 == null ? -1 : enumC16313m0.ordinal()) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q5.m87149e(style.ordinal()) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q5.m87157i(foregroundColor) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i15 |= c28655q5.m87157i(iconColor) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q5.m87157i(backgroundColor) ? 1048576 : 524288;
        }
        int i25 = i14 & 128;
        if (i25 == 0) {
            if ((12582912 & i13) == 0) {
                z13 = z4;
                i15 |= c28655q5.m87155h(z13) ? 8388608 : 4194304;
            }
            i16 = i14 & 256;
            if (i16 != 0) {
                i15 |= 100663296;
                interfaceC4339a2 = interfaceC4339a;
            } else {
                interfaceC4339a2 = interfaceC4339a;
                if ((i13 & 100663296) == 0) {
                    if (c28655q5.m87157i(interfaceC4339a2)) {
                        i17 = 67108864;
                    } else {
                        i17 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 |= i17;
                }
            }
            i18 = i15;
            if ((i18 & 38347923) != 38347922) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q5.m87135U(i18 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if (i25 != 0) {
                    z13 = true;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q5.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C24958m(24);
                        c28655q5.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                }
                jMo134584toComposableColorWaAFU9c = foregroundColor.mo134584toComposableColorWaAFU9c(c28655q5, (i18 >> 12) & 14);
                jMo134584toComposableColorWaAFU9c2 = iconColor.mo134584toComposableColorWaAFU9c(c28655q5, (i18 >> 15) & 14);
                jMo134584toComposableColorWaAFU9c3 = backgroundColor.mo134584toComposableColorWaAFU9c(c28655q5, (i18 >> 18) & 14);
                f13 = 4;
                c33252iM105489e = AbstractC33253j.m105489e(2 * f13);
                if (z13) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.4f;
                }
                modifierM107879c = AbstractC34132o.m107879c(f14, c2314t);
                i19 = a.f100194a[style.ordinal()];
                if (i19 != 1) {
                    if (i19 != 2) {
                        Modifier modifier3 = modifier2;
                        c28655q2 = c28655q5;
                        modifier2 = modifier3;
                        z18 = z13;
                        interfaceC4339a4 = interfaceC4339a3;
                        c28655q2.m87150e0(1393772643);
                        Modifier modifierM3362g = AbstractC1092a.m3362g(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3428y(modifier2.mo3471e(modifierM107879c), null, false, 3), c33252iM105489e), jMo134584toComposableColorWaAFU9c3, c33252iM105489e), z18, null, null, interfaceC4339a3, 14);
                        float f15 = 8;
                        float f16 = 1 * f15;
                        Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM3362g, f16, ((float) 1.5d) * f15);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f16), c2306l, c28655q2, 54);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
                        InterfaceC0221l.f734a.getClass();
                        c0213j2 = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            z19 = z18;
                            c28655q2.m87163l(c0213j2);
                        } else {
                            z19 = z18;
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i2 = C0217k.f732j;
                        if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                        if (enumC16313m0 == null) {
                            c28655q2.m87150e0(1794164107);
                            c28655q2.m87173q(false);
                        } else {
                            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(enumC16313m0.toWhoopIcon(), c28655q2, 0), null, AbstractC18489d0.m53365f(c28655q2, 1794164108, f13, f13, c2314t), jMo134584toComposableColorWaAFU9c2, c28655q2, 432, 0);
                            c28655q2 = c28655q2;
                            c28655q2.m87173q(false);
                        }
                        C28655q c28655q6 = c28655q2;
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(title, c28655q2, TextResource.$stable | ((i18 >> 3) & 14)), null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getH5(), null, c28655q6, 0, C2886a.f11498d << 18, 196602);
                        c28655q3 = c28655q6;
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(false);
                    } else {
                        if (i19 == 3) {
                            throw AbstractC11895b.m32003v(1393751339, c28655q5, false);
                        }
                        c28655q5.m87150e0(1393804436);
                        Modifier modifierM3428y = AbstractC1102d.m3428y(AbstractC15680h.m44112a(modifier2, z13), null, false, 3);
                        C1119d c1119dM43228a = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                        objM87133R = c28655q5.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC11266d.m30453g(c28655q5);
                        }
                        boolean z24 = z13;
                        InterfaceC4339a interfaceC4339a5 = interfaceC4339a3;
                        z19 = z24;
                        interfaceC4339a4 = interfaceC4339a5;
                        float f17 = 8;
                        float f18 = 1 * f17;
                        Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1092a.m3360e(modifierM3428y, (InterfaceC21083i) objM87133R, c1119dM43228a, z24, new C18027i(0), interfaceC4339a5, 8), ((float) 1.5d) * f17, f18);
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f18), c2306l, c28655q5, 54);
                        iHashCode3 = Long.hashCode(c28655q5.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q5.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q5, modifierM3395q2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j3 = C0217k.f724b;
                        c28655q5.m87158i0();
                        if (c28655q5.f115903S) {
                            c28655q5.m87163l(c0213j3);
                        } else {
                            c28655q5.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q5, C0217k.f729g, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q5, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i3 = C0217k.f732j;
                        if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q5, C0217k.f726d, modifierM118962N2);
                        if (enumC16313m0 == null) {
                            c28655q5.m87150e0(1659581418);
                            c28655q5.m87173q(false);
                            c28655q4 = c28655q5;
                        } else {
                            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(enumC16313m0.toWhoopIcon(), c28655q5, 0), null, AbstractC18489d0.m53365f(c28655q5, 1659581419, f13, f13, c2314t), jMo134584toComposableColorWaAFU9c2, c28655q5, 432, 0);
                            c28655q4 = c28655q5;
                            c28655q4.m87173q(false);
                        }
                        String upperCase = AbstractC8693b.m21274h(title, c28655q4, TextResource.$stable | ((i18 >> 3) & 14)).toUpperCase(Locale.ROOT);
                        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                        C28655q c28655q7 = c28655q4;
                        AbstractC30795n.m94707h(upperCase, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q4, C38072d.f163054b).getBtS(), null, c28655q7, 0, C2886a.f11498d << 18, 196602);
                        c28655q3 = c28655q7;
                        c28655q3.m87173q(true);
                        c28655q3.m87173q(false);
                    }
                    z16 = z19;
                    interfaceC4339a3 = interfaceC4339a4;
                    c28655q = c28655q3;
                } else {
                    modifier2 = modifier2;
                    c28655q5.m87150e0(1393750731);
                    z16 = z13;
                    Modifier modifierM3362g2 = AbstractC1092a.m3362g(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(10 * f13, modifier2.mo3471e(modifierM107879c)), c33252iM105489e), jMo134584toComposableColorWaAFU9c3, c33252iM105489e), z16, null, null, interfaceC4339a3, 14);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q5.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q5, modifierM3362g2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q5, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q5.f115903S || !AbstractC22676k.m65745e(c28655q5.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q5, C0217k.f726d, modifierM118962N3);
                    if (enumC16313m0 == null) {
                        c28655q5.m87150e0(1004512533);
                        z17 = false;
                        c28655q5.m87173q(false);
                        c28655q = c28655q5;
                    } else {
                        z17 = false;
                        AbstractC15005f3.m43107a(AbstractC29125c.m88500I(enumC16313m0.toWhoopIcon(), c28655q5, 0), AbstractC8693b.m21274h(title, c28655q5, TextResource.$stable | ((i18 >> 3) & 14)), AbstractC18489d0.m53365f(c28655q5, 1004512534, f13, f13, c2314t), jMo134584toComposableColorWaAFU9c2, c28655q5, 384, 0);
                        c28655q = c28655q5;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(z17);
                }
                z15 = z16;
                interfaceC4339a2 = interfaceC4339a3;
            } else {
                c28655q = c28655q5;
                c28655q.m87138X();
                modifier2 = modifier2;
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23108i(modifier2, title, enumC16313m0, style, foregroundColor, iconColor, backgroundColor, z15, interfaceC4339a2, i13, i14);
            }
        }
        i15 |= 12582912;
        z13 = z4;
        i16 = i14 & 256;
        if (i16 != 0) {
            i15 |= 100663296;
            interfaceC4339a2 = interfaceC4339a;
        } else {
            interfaceC4339a2 = interfaceC4339a;
            if ((i13 & 100663296) == 0) {
                if (c28655q5.m87157i(interfaceC4339a2)) {
                    i17 = 67108864;
                } else {
                    i17 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 |= i17;
            }
        }
        i18 = i15;
        if ((i18 & 38347923) != 38347922) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q5.m87135U(i18 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier2 = c2314t;
            }
            if (i25 != 0) {
                z13 = true;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q5.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C24958m(24);
                    c28655q5.m87172p0(objM87133R2);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a3 = interfaceC4339a2;
            }
            jMo134584toComposableColorWaAFU9c = foregroundColor.mo134584toComposableColorWaAFU9c(c28655q5, (i18 >> 12) & 14);
            jMo134584toComposableColorWaAFU9c2 = iconColor.mo134584toComposableColorWaAFU9c(c28655q5, (i18 >> 15) & 14);
            jMo134584toComposableColorWaAFU9c3 = backgroundColor.mo134584toComposableColorWaAFU9c(c28655q5, (i18 >> 18) & 14);
            f13 = 4;
            c33252iM105489e = AbstractC33253j.m105489e(2 * f13);
            if (z13) {
                f14 = 1.0f;
            } else {
                f14 = 0.4f;
            }
            modifierM107879c = AbstractC34132o.m107879c(f14, c2314t);
            i19 = a.f100194a[style.ordinal()];
            if (i19 != 1) {
                if (i19 != 2) {
                    Modifier modifier4 = modifier2;
                    c28655q2 = c28655q5;
                    modifier2 = modifier4;
                    z18 = z13;
                    interfaceC4339a4 = interfaceC4339a3;
                    c28655q2.m87150e0(1393772643);
                    Modifier modifierM3362g3 = AbstractC1092a.m3362g(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3428y(modifier2.mo3471e(modifierM107879c), null, false, 3), c33252iM105489e), jMo134584toComposableColorWaAFU9c3, c33252iM105489e), z18, null, null, interfaceC4339a3, 14);
                    float f19 = 8;
                    float f110 = 1 * f19;
                    Modifier modifierM3395q3 = AbstractC1099a.m3395q(modifierM3362g3, f110, ((float) 1.5d) * f19);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f110), c2306l, c28655q2, 54);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3395q3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        z19 = z18;
                        c28655q2.m87163l(c0213j2);
                    } else {
                        z19 = z18;
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i2 = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                    if (enumC16313m0 == null) {
                        c28655q2.m87150e0(1794164107);
                        c28655q2.m87173q(false);
                    } else {
                        AbstractC15005f3.m43107a(AbstractC29125c.m88500I(enumC16313m0.toWhoopIcon(), c28655q2, 0), null, AbstractC18489d0.m53365f(c28655q2, 1794164108, f13, f13, c2314t), jMo134584toComposableColorWaAFU9c2, c28655q2, 432, 0);
                        c28655q2 = c28655q2;
                        c28655q2.m87173q(false);
                    }
                    C28655q c28655q8 = c28655q2;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(title, c28655q2, TextResource.$stable | ((i18 >> 3) & 14)), null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getH5(), null, c28655q8, 0, C2886a.f11498d << 18, 196602);
                    c28655q3 = c28655q8;
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(false);
                } else {
                    if (i19 == 3) {
                        throw AbstractC11895b.m32003v(1393751339, c28655q5, false);
                    }
                    c28655q5.m87150e0(1393804436);
                    Modifier modifierM3428y2 = AbstractC1102d.m3428y(AbstractC15680h.m44112a(modifier2, z13), null, false, 3);
                    C1119d c1119dM43228a2 = AbstractC15210z4.m43228a(0L, 7, false, 0.0f);
                    objM87133R = c28655q5.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC11266d.m30453g(c28655q5);
                    }
                    boolean z25 = z13;
                    InterfaceC4339a interfaceC4339a6 = interfaceC4339a3;
                    z19 = z25;
                    interfaceC4339a4 = interfaceC4339a6;
                    float f111 = 8;
                    float f112 = 1 * f111;
                    Modifier modifierM3395q4 = AbstractC1099a.m3395q(AbstractC1092a.m3360e(modifierM3428y2, (InterfaceC21083i) objM87133R, c1119dM43228a2, z25, new C18027i(0), interfaceC4339a6, 8), ((float) 1.5d) * f111, f112);
                    C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f112), c2306l, c28655q5, 54);
                    iHashCode3 = Long.hashCode(c28655q5.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q5.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q5, modifierM3395q4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j3 = C0217k.f724b;
                    c28655q5.m87158i0();
                    if (c28655q5.f115903S) {
                        c28655q5.m87163l(c0213j3);
                    } else {
                        c28655q5.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q5, C0217k.f729g, c22994r1M66759a4);
                    AbstractC28683x.m87239G(c28655q5, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i3 = C0217k.f732j;
                    if (c28655q5.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q5, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q5, C0217k.f726d, modifierM118962N5);
                    if (enumC16313m0 == null) {
                        c28655q5.m87150e0(1659581418);
                        c28655q5.m87173q(false);
                        c28655q4 = c28655q5;
                    } else {
                        AbstractC15005f3.m43107a(AbstractC29125c.m88500I(enumC16313m0.toWhoopIcon(), c28655q5, 0), null, AbstractC18489d0.m53365f(c28655q5, 1659581419, f13, f13, c2314t), jMo134584toComposableColorWaAFU9c2, c28655q5, 432, 0);
                        c28655q4 = c28655q5;
                        c28655q4.m87173q(false);
                    }
                    String upperCase2 = AbstractC8693b.m21274h(title, c28655q4, TextResource.$stable | ((i18 >> 3) & 14)).toUpperCase(Locale.ROOT);
                    AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                    C28655q c28655q9 = c28655q4;
                    AbstractC30795n.m94707h(upperCase2, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q4, C38072d.f163054b).getBtS(), null, c28655q9, 0, C2886a.f11498d << 18, 196602);
                    c28655q3 = c28655q9;
                    c28655q3.m87173q(true);
                    c28655q3.m87173q(false);
                }
                z16 = z19;
                interfaceC4339a3 = interfaceC4339a4;
                c28655q = c28655q3;
            } else {
                modifier2 = modifier2;
                c28655q5.m87150e0(1393750731);
                z16 = z13;
                Modifier modifierM3362g4 = AbstractC1092a.m3362g(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(10 * f13, modifier2.mo3471e(modifierM107879c)), c33252iM105489e), jMo134584toComposableColorWaAFU9c3, c33252iM105489e), z16, null, null, interfaceC4339a3, 14);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q5.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q5.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q5, modifierM3362g4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q5.m87158i0();
                if (c28655q5.f115903S) {
                    c28655q5.m87163l(c0213j);
                } else {
                    c28655q5.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q5, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q5, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q5.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q5, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q5, C0217k.f726d, modifierM118962N6);
                if (enumC16313m0 == null) {
                    c28655q5.m87150e0(1004512533);
                    z17 = false;
                    c28655q5.m87173q(false);
                    c28655q = c28655q5;
                } else {
                    z17 = false;
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(enumC16313m0.toWhoopIcon(), c28655q5, 0), AbstractC8693b.m21274h(title, c28655q5, TextResource.$stable | ((i18 >> 3) & 14)), AbstractC18489d0.m53365f(c28655q5, 1004512534, f13, f13, c2314t), jMo134584toComposableColorWaAFU9c2, c28655q5, 384, 0);
                    c28655q = c28655q5;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(z17);
            }
            z15 = z16;
            interfaceC4339a2 = interfaceC4339a3;
        } else {
            c28655q = c28655q5;
            c28655q.m87138X();
            modifier2 = modifier2;
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23108i(modifier2, title, enumC16313m0, style, foregroundColor, iconColor, backgroundColor, z15, interfaceC4339a2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m75134d() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m75135e(Modifier modifier, TextResource textResource, EnumC16313m0 enumC16313m0, ActionButtonStyle actionButtonStyle, InterfaceC39332e interfaceC39332e, InterfaceC39332e interfaceC39332e2, InterfaceC39332e interfaceC39332e3, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m75133c(modifier, textResource, enumC16313m0, actionButtonStyle, interfaceC39332e, interfaceC39332e2, interfaceC39332e3, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
