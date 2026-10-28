package v71;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.util.AbstractC8693b;
import ih0.AbstractC18489d0;
import java.io.IOException;
import l83.C23454a0;
import l83.InterfaceC23459e;
import no.nordicsemi.android.dfu.DfuBaseService;
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
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22949e;
import p291l0.C22994r1;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31918g;
import p733ry2.C31919h;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import v40.C35652d;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: v71.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lv71/e;", "headerState", "", "showCta", "Lkotlin/Function0;", "Ll83/a0;", "ctaAction", "d", "(Landroidx/compose/ui/Modifier;Lv71/e;ZLc93/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35763d {
    /* JADX WARN: Code duplicated, block: B:102:0x025c  */
    /* JADX WARN: Code duplicated, block: B:104:0x026d  */
    /* JADX WARN: Code duplicated, block: B:106:0x027a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0293  */
    /* JADX WARN: Code duplicated, block: B:110:0x0295  */
    /* JADX WARN: Code duplicated, block: B:113:0x029c  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:71:0x0101  */
    /* JADX WARN: Code duplicated, block: B:74:0x0114  */
    /* JADX WARN: Code duplicated, block: B:77:0x0125  */
    /* JADX WARN: Code duplicated, block: B:81:0x014e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0152  */
    /* JADX WARN: Code duplicated, block: B:85:0x015f  */
    /* JADX WARN: Code duplicated, block: B:87:0x016d  */
    /* JADX WARN: Code duplicated, block: B:90:0x017f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0190  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f6  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX INFO: renamed from: d */
    public static final void m113314d(Modifier modifier, C35764e headerState, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        boolean z13;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        int i18;
        boolean z14;
        Modifier modifier3;
        boolean z15;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        boolean z16;
        C28676v0 c28676v0;
        FeatureFlagChecker featureFlagChecker;
        boolean z17;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z18;
        int iHashCode2;
        float f13;
        ?? r10;
        float f14;
        int i19;
        long jM53358D;
        C38072d c38072d;
        boolean z19;
        long jM73366B;
        boolean z24;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(headerState, "headerState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(325964410);
        int i24 = i14 & 1;
        if (i24 != 0) {
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
            i15 |= c28655q.m87157i(headerState) ? 32 : 16;
        }
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i15;
                if ((i18 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i18 & 1, z14)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i25 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35652d(13);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
                    if (!featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA) || featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA)) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    Modifier modifierMo3471e = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier2);
                    C22949e c22949e = AbstractC22953f.f90591c;
                    C2306l c2306l = C2299e.f9108K;
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 54);
                    Modifier modifier4 = modifier2;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    C0209i c0209i2 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                    C0209i c0209i3 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        z18 = z16;
                    } else {
                        z18 = z16;
                        if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i4 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 54);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                        AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        if (headerState.getTitleIcon() == null) {
                            c28655q.m87150e0(2012566622);
                            r10 = 0;
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(2012566623);
                            C27430e c27430eM107874S = AbstractC34132o.m107874S(headerState.getTitleIcon().intValue(), c28655q, 6);
                            long jM125382b1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, ((float) 0.5d) * 8, 0.0f, 2);
                            if (z17) {
                                float f15 = 4;
                                f13 = f15 * f15;
                            } else {
                                f13 = 6 * 4;
                            }
                            r10 = 0;
                            AbstractC15005f3.m43108b(c27430eM107874S, null, AbstractC1102d.m3419p(f13, modifierM3396r), jM125382b1, c28655q, 48, 0);
                            c28655q.m87173q(false);
                        }
                        String strM21275i = AbstractC8693b.m21275i(headerState.getTitle(), c28655q, r10);
                        f14 = ((float) 0.5d) * 8;
                        Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, f14, f14);
                        if (z17) {
                            c28655q.m87150e0(-904889236);
                            i19 = 6;
                            jM53358D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, r10);
                        } else {
                            i19 = 6;
                            c28655q.m87150e0(-904888151);
                            jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, r10);
                        }
                        c38072d = C38072d.f163053a;
                        AbstractC30795n.m94707h(strM21275i, modifierM3395q, jM53358D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getSh4(), null, c28655q, 0, 0, 196600);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        if (z18) {
                            c28655q.m87150e0(-261388731);
                            C27430e c27430eM107874S2 = AbstractC34132o.m107874S(headerState.getCtaIcon(), c28655q, 6);
                            if (z17) {
                                jM73366B = AbstractC31061c.m95627c(c28655q, -424069787, c38072d, c28655q, 6);
                                z19 = false;
                            } else {
                                z19 = false;
                                jM73366B = AbstractC25012a.m73366B(c28655q, -424068792, c38072d, c28655q, 6);
                            }
                            c28655q.m87173q(z19);
                            long j7 = jM73366B;
                            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "items_card_header_cta");
                            if ((i18 & 7168) == 2048) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            objM87133R = c28655q.m87133R();
                            if (z24 || objM87133R == c28676v0) {
                                objM87133R = new C31918g(interfaceC4339a2, 12);
                                c28655q.m87172p0(objM87133R);
                            }
                            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1092a.m3362g(modifierM3599a, false, null, null, (InterfaceC4339a) objM87133R, 15), f14, 0.0f, 2);
                            float f16 = 4;
                            AbstractC15005f3.m43108b(c27430eM107874S2, null, AbstractC1102d.m3419p(f16 * f16, modifierM3396r2), j7, c28655q, 48, 0);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-260918492);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        interfaceC4339a3 = interfaceC4339a2;
                        z15 = z18;
                        modifier3 = modifier4;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    C0209i c0209i5 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a3);
                    AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                    if (headerState.getTitleIcon() == null) {
                        c28655q.m87150e0(2012566622);
                        r10 = 0;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(2012566623);
                        C27430e c27430eM107874S3 = AbstractC34132o.m107874S(headerState.getTitleIcon().intValue(), c28655q, 6);
                        long jM125382b2 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                        Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, ((float) 0.5d) * 8, 0.0f, 2);
                        if (z17) {
                            float f17 = 4;
                            f13 = f17 * f17;
                        } else {
                            f13 = 6 * 4;
                        }
                        r10 = 0;
                        AbstractC15005f3.m43108b(c27430eM107874S3, null, AbstractC1102d.m3419p(f13, modifierM3396r3), jM125382b2, c28655q, 48, 0);
                        c28655q.m87173q(false);
                    }
                    String strM21275i2 = AbstractC8693b.m21275i(headerState.getTitle(), c28655q, r10);
                    f14 = ((float) 0.5d) * 8;
                    Modifier modifierM3395q2 = AbstractC1099a.m3395q(c2314t, f14, f14);
                    if (z17) {
                        c28655q.m87150e0(-904889236);
                        i19 = 6;
                        jM53358D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, r10);
                    } else {
                        i19 = 6;
                        c28655q.m87150e0(-904888151);
                        jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, r10);
                    }
                    c38072d = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21275i2, modifierM3395q2, jM53358D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getSh4(), null, c28655q, 0, 0, 196600);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    if (z18) {
                        c28655q.m87150e0(-261388731);
                        C27430e c27430eM107874S4 = AbstractC34132o.m107874S(headerState.getCtaIcon(), c28655q, 6);
                        if (z17) {
                            jM73366B = AbstractC31061c.m95627c(c28655q, -424069787, c38072d, c28655q, 6);
                            z19 = false;
                        } else {
                            z19 = false;
                            jM73366B = AbstractC25012a.m73366B(c28655q, -424068792, c38072d, c28655q, 6);
                        }
                        c28655q.m87173q(z19);
                        long j13 = jM73366B;
                        Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, "items_card_header_cta");
                        if ((i18 & 7168) == 2048) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z24) {
                            objM87133R = new C31918g(interfaceC4339a2, 12);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C31918g(interfaceC4339a2, 12);
                            c28655q.m87172p0(objM87133R);
                        }
                        Modifier modifierM3396r4 = AbstractC1099a.m3396r(AbstractC1092a.m3362g(modifierM3599a2, false, null, null, (InterfaceC4339a) objM87133R, 15), f14, 0.0f, 2);
                        float f18 = 4;
                        AbstractC15005f3.m43108b(c27430eM107874S4, null, AbstractC1102d.m3419p(f18 * f18, modifierM3396r4), j13, c28655q, 48, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-260918492);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    interfaceC4339a3 = interfaceC4339a2;
                    z15 = z18;
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    z15 = z13;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C31919h(modifier3, (Object) headerState, z15, (InterfaceC23459e) interfaceC4339a3, i13, i14, 7);
                }
            }
            i15 |= 3072;
            interfaceC4339a2 = interfaceC4339a;
            i18 = i15;
            if ((i18 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i18 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if (i25 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35652d(13);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
                if (featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                Modifier modifierMo3471e2 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier2);
                C22949e c22949e2 = AbstractC22953f.f90591c;
                C2306l c2306l2 = C2299e.f9108K;
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e2, c2306l2, c28655q, 54);
                Modifier modifier5 = modifier2;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i6 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a4);
                C0209i c0209i7 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    z18 = z16;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i8 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N4);
                    C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a5);
                    AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N5);
                    if (headerState.getTitleIcon() == null) {
                        c28655q.m87150e0(2012566622);
                        r10 = 0;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(2012566623);
                        C27430e c27430eM107874S5 = AbstractC34132o.m107874S(headerState.getTitleIcon().intValue(), c28655q, 6);
                        long jM125382b3 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                        Modifier modifierM3396r5 = AbstractC1099a.m3396r(c2314t, ((float) 0.5d) * 8, 0.0f, 2);
                        if (z17) {
                            float f19 = 4;
                            f13 = f19 * f19;
                        } else {
                            f13 = 6 * 4;
                        }
                        r10 = 0;
                        AbstractC15005f3.m43108b(c27430eM107874S5, null, AbstractC1102d.m3419p(f13, modifierM3396r5), jM125382b3, c28655q, 48, 0);
                        c28655q.m87173q(false);
                    }
                    String strM21275i3 = AbstractC8693b.m21275i(headerState.getTitle(), c28655q, r10);
                    f14 = ((float) 0.5d) * 8;
                    Modifier modifierM3395q3 = AbstractC1099a.m3395q(c2314t, f14, f14);
                    if (z17) {
                        c28655q.m87150e0(-904889236);
                        i19 = 6;
                        jM53358D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, r10);
                    } else {
                        i19 = 6;
                        c28655q.m87150e0(-904888151);
                        jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, r10);
                    }
                    c38072d = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21275i3, modifierM3395q3, jM53358D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getSh4(), null, c28655q, 0, 0, 196600);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    if (z18) {
                        c28655q.m87150e0(-261388731);
                        C27430e c27430eM107874S6 = AbstractC34132o.m107874S(headerState.getCtaIcon(), c28655q, 6);
                        if (z17) {
                            jM73366B = AbstractC31061c.m95627c(c28655q, -424069787, c38072d, c28655q, 6);
                            z19 = false;
                        } else {
                            z19 = false;
                            jM73366B = AbstractC25012a.m73366B(c28655q, -424068792, c38072d, c28655q, 6);
                        }
                        c28655q.m87173q(z19);
                        long j14 = jM73366B;
                        Modifier modifierM3599a3 = AbstractC1136a.m3599a(c2314t, "items_card_header_cta");
                        if ((i18 & 7168) == 2048) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z24) {
                            objM87133R = new C31918g(interfaceC4339a2, 12);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C31918g(interfaceC4339a2, 12);
                            c28655q.m87172p0(objM87133R);
                        }
                        Modifier modifierM3396r6 = AbstractC1099a.m3396r(AbstractC1092a.m3362g(modifierM3599a3, false, null, null, (InterfaceC4339a) objM87133R, 15), f14, 0.0f, 2);
                        float f110 = 4;
                        AbstractC15005f3.m43108b(c27430eM107874S6, null, AbstractC1102d.m3419p(f110 * f110, modifierM3396r6), j14, c28655q, 48, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-260918492);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    interfaceC4339a3 = interfaceC4339a2;
                    z15 = z18;
                    modifier3 = modifier5;
                } else {
                    z18 = z16;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i9 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N4);
                C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a6);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N6);
                if (headerState.getTitleIcon() == null) {
                    c28655q.m87150e0(2012566622);
                    r10 = 0;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2012566623);
                    C27430e c27430eM107874S7 = AbstractC34132o.m107874S(headerState.getTitleIcon().intValue(), c28655q, 6);
                    long jM125382b4 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                    Modifier modifierM3396r7 = AbstractC1099a.m3396r(c2314t, ((float) 0.5d) * 8, 0.0f, 2);
                    if (z17) {
                        float f111 = 4;
                        f13 = f111 * f111;
                    } else {
                        f13 = 6 * 4;
                    }
                    r10 = 0;
                    AbstractC15005f3.m43108b(c27430eM107874S7, null, AbstractC1102d.m3419p(f13, modifierM3396r7), jM125382b4, c28655q, 48, 0);
                    c28655q.m87173q(false);
                }
                String strM21275i4 = AbstractC8693b.m21275i(headerState.getTitle(), c28655q, r10);
                f14 = ((float) 0.5d) * 8;
                Modifier modifierM3395q4 = AbstractC1099a.m3395q(c2314t, f14, f14);
                if (z17) {
                    c28655q.m87150e0(-904889236);
                    i19 = 6;
                    jM53358D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, r10);
                } else {
                    i19 = 6;
                    c28655q.m87150e0(-904888151);
                    jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, r10);
                }
                c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21275i4, modifierM3395q4, jM53358D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getSh4(), null, c28655q, 0, 0, 196600);
                c28655q = c28655q;
                c28655q.m87173q(true);
                if (z18) {
                    c28655q.m87150e0(-261388731);
                    C27430e c27430eM107874S8 = AbstractC34132o.m107874S(headerState.getCtaIcon(), c28655q, 6);
                    if (z17) {
                        jM73366B = AbstractC31061c.m95627c(c28655q, -424069787, c38072d, c28655q, 6);
                        z19 = false;
                    } else {
                        z19 = false;
                        jM73366B = AbstractC25012a.m73366B(c28655q, -424068792, c38072d, c28655q, 6);
                    }
                    c28655q.m87173q(z19);
                    long j15 = jM73366B;
                    Modifier modifierM3599a4 = AbstractC1136a.m3599a(c2314t, "items_card_header_cta");
                    if ((i18 & 7168) == 2048) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z24) {
                        objM87133R = new C31918g(interfaceC4339a2, 12);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C31918g(interfaceC4339a2, 12);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3396r8 = AbstractC1099a.m3396r(AbstractC1092a.m3362g(modifierM3599a4, false, null, null, (InterfaceC4339a) objM87133R, 15), f14, 0.0f, 2);
                    float f112 = 4;
                    AbstractC15005f3.m43108b(c27430eM107874S8, null, AbstractC1102d.m3419p(f112 * f112, modifierM3396r8), j15, c28655q, 48, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-260918492);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a2;
                z15 = z18;
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31919h(modifier3, (Object) headerState, z15, (InterfaceC23459e) interfaceC4339a3, i13, i14, 7);
            }
        }
        i15 |= 384;
        z13 = z4;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i15;
            if ((i18 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i18 & 1, z14)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if (i25 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35652d(13);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
                if (featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                    z17 = true;
                } else {
                    z17 = true;
                }
                Modifier modifierMo3471e3 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier2);
                C22949e c22949e3 = AbstractC22953f.f90591c;
                C2306l c2306l3 = C2299e.f9108K;
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(c22949e3, c2306l3, c28655q, 54);
                Modifier modifier6 = modifier2;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i10 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i10, c22994r1M66759a7);
                C0209i c0209i11 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    z18 = z16;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i12 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N7);
                    C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l3, c28655q, 54);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i10, c22994r1M66759a8);
                    AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i12, modifierM118962N8);
                    if (headerState.getTitleIcon() == null) {
                        c28655q.m87150e0(2012566622);
                        r10 = 0;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(2012566623);
                        C27430e c27430eM107874S9 = AbstractC34132o.m107874S(headerState.getTitleIcon().intValue(), c28655q, 6);
                        long jM125382b5 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                        Modifier modifierM3396r9 = AbstractC1099a.m3396r(c2314t, ((float) 0.5d) * 8, 0.0f, 2);
                        if (z17) {
                            float f113 = 4;
                            f13 = f113 * f113;
                        } else {
                            f13 = 6 * 4;
                        }
                        r10 = 0;
                        AbstractC15005f3.m43108b(c27430eM107874S9, null, AbstractC1102d.m3419p(f13, modifierM3396r9), jM125382b5, c28655q, 48, 0);
                        c28655q.m87173q(false);
                    }
                    String strM21275i5 = AbstractC8693b.m21275i(headerState.getTitle(), c28655q, r10);
                    f14 = ((float) 0.5d) * 8;
                    Modifier modifierM3395q5 = AbstractC1099a.m3395q(c2314t, f14, f14);
                    if (z17) {
                        c28655q.m87150e0(-904889236);
                        i19 = 6;
                        jM53358D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, r10);
                    } else {
                        i19 = 6;
                        c28655q.m87150e0(-904888151);
                        jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, r10);
                    }
                    c38072d = C38072d.f163053a;
                    AbstractC30795n.m94707h(strM21275i5, modifierM3395q5, jM53358D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getSh4(), null, c28655q, 0, 0, 196600);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    if (z18) {
                        c28655q.m87150e0(-261388731);
                        C27430e c27430eM107874S10 = AbstractC34132o.m107874S(headerState.getCtaIcon(), c28655q, 6);
                        if (z17) {
                            jM73366B = AbstractC31061c.m95627c(c28655q, -424069787, c38072d, c28655q, 6);
                            z19 = false;
                        } else {
                            z19 = false;
                            jM73366B = AbstractC25012a.m73366B(c28655q, -424068792, c38072d, c28655q, 6);
                        }
                        c28655q.m87173q(z19);
                        long j16 = jM73366B;
                        Modifier modifierM3599a5 = AbstractC1136a.m3599a(c2314t, "items_card_header_cta");
                        if ((i18 & 7168) == 2048) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z24) {
                            objM87133R = new C31918g(interfaceC4339a2, 12);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C31918g(interfaceC4339a2, 12);
                            c28655q.m87172p0(objM87133R);
                        }
                        Modifier modifierM3396r10 = AbstractC1099a.m3396r(AbstractC1092a.m3362g(modifierM3599a5, false, null, null, (InterfaceC4339a) objM87133R, 15), f14, 0.0f, 2);
                        float f114 = 4;
                        AbstractC15005f3.m43108b(c27430eM107874S10, null, AbstractC1102d.m3419p(f114 * f114, modifierM3396r10), j16, c28655q, 48, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-260918492);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    interfaceC4339a3 = interfaceC4339a2;
                    z15 = z18;
                    modifier3 = modifier6;
                } else {
                    z18 = z16;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                C0209i c0209i13 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N7);
                C22994r1 c22994r1M66759a9 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l3, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i10, c22994r1M66759a9);
                AbstractC28683x.m87239G(c28655q, c0209i11, interfaceC28653p1M87165m9);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i13, modifierM118962N9);
                if (headerState.getTitleIcon() == null) {
                    c28655q.m87150e0(2012566622);
                    r10 = 0;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2012566623);
                    C27430e c27430eM107874S11 = AbstractC34132o.m107874S(headerState.getTitleIcon().intValue(), c28655q, 6);
                    long jM125382b6 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                    Modifier modifierM3396r11 = AbstractC1099a.m3396r(c2314t, ((float) 0.5d) * 8, 0.0f, 2);
                    if (z17) {
                        float f115 = 4;
                        f13 = f115 * f115;
                    } else {
                        f13 = 6 * 4;
                    }
                    r10 = 0;
                    AbstractC15005f3.m43108b(c27430eM107874S11, null, AbstractC1102d.m3419p(f13, modifierM3396r11), jM125382b6, c28655q, 48, 0);
                    c28655q.m87173q(false);
                }
                String strM21275i6 = AbstractC8693b.m21275i(headerState.getTitle(), c28655q, r10);
                f14 = ((float) 0.5d) * 8;
                Modifier modifierM3395q6 = AbstractC1099a.m3395q(c2314t, f14, f14);
                if (z17) {
                    c28655q.m87150e0(-904889236);
                    i19 = 6;
                    jM53358D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, r10);
                } else {
                    i19 = 6;
                    c28655q.m87150e0(-904888151);
                    jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, r10);
                }
                c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21275i6, modifierM3395q6, jM53358D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getSh4(), null, c28655q, 0, 0, 196600);
                c28655q = c28655q;
                c28655q.m87173q(true);
                if (z18) {
                    c28655q.m87150e0(-261388731);
                    C27430e c27430eM107874S12 = AbstractC34132o.m107874S(headerState.getCtaIcon(), c28655q, 6);
                    if (z17) {
                        jM73366B = AbstractC31061c.m95627c(c28655q, -424069787, c38072d, c28655q, 6);
                        z19 = false;
                    } else {
                        z19 = false;
                        jM73366B = AbstractC25012a.m73366B(c28655q, -424068792, c38072d, c28655q, 6);
                    }
                    c28655q.m87173q(z19);
                    long j17 = jM73366B;
                    Modifier modifierM3599a6 = AbstractC1136a.m3599a(c2314t, "items_card_header_cta");
                    if ((i18 & 7168) == 2048) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z24) {
                        objM87133R = new C31918g(interfaceC4339a2, 12);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C31918g(interfaceC4339a2, 12);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3396r12 = AbstractC1099a.m3396r(AbstractC1092a.m3362g(modifierM3599a6, false, null, null, (InterfaceC4339a) objM87133R, 15), f14, 0.0f, 2);
                    float f116 = 4;
                    AbstractC15005f3.m43108b(c27430eM107874S12, null, AbstractC1102d.m3419p(f116 * f116, modifierM3396r12), j17, c28655q, 48, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-260918492);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a2;
                z15 = z18;
                modifier3 = modifier6;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                z15 = z13;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C31919h(modifier3, (Object) headerState, z15, (InterfaceC23459e) interfaceC4339a3, i13, i14, 7);
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        i18 = i15;
        if ((i18 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i18 & 1, z14)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier2 = c2314t;
            }
            if (i25 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C35652d(13);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            }
            featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            if (featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA)) {
                z17 = true;
            } else {
                z17 = true;
            }
            Modifier modifierMo3471e4 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier2);
            C22949e c22949e4 = AbstractC22953f.f90591c;
            C2306l c2306l4 = C2299e.f9108K;
            C22994r1 c22994r1M66759a10 = AbstractC22988p1.m66759a(c22949e4, c2306l4, c28655q, 54);
            Modifier modifier7 = modifier2;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i14 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a10);
            C0209i c0209i15 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m10);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                z18 = z16;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i16 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N10);
                C22994r1 c22994r1M66759a11 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l4, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a11);
                AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m11);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i16, modifierM118962N11);
                if (headerState.getTitleIcon() == null) {
                    c28655q.m87150e0(2012566622);
                    r10 = 0;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2012566623);
                    C27430e c27430eM107874S13 = AbstractC34132o.m107874S(headerState.getTitleIcon().intValue(), c28655q, 6);
                    long jM125382b7 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                    Modifier modifierM3396r13 = AbstractC1099a.m3396r(c2314t, ((float) 0.5d) * 8, 0.0f, 2);
                    if (z17) {
                        float f117 = 4;
                        f13 = f117 * f117;
                    } else {
                        f13 = 6 * 4;
                    }
                    r10 = 0;
                    AbstractC15005f3.m43108b(c27430eM107874S13, null, AbstractC1102d.m3419p(f13, modifierM3396r13), jM125382b7, c28655q, 48, 0);
                    c28655q.m87173q(false);
                }
                String strM21275i7 = AbstractC8693b.m21275i(headerState.getTitle(), c28655q, r10);
                f14 = ((float) 0.5d) * 8;
                Modifier modifierM3395q7 = AbstractC1099a.m3395q(c2314t, f14, f14);
                if (z17) {
                    c28655q.m87150e0(-904889236);
                    i19 = 6;
                    jM53358D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, r10);
                } else {
                    i19 = 6;
                    c28655q.m87150e0(-904888151);
                    jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, r10);
                }
                c38072d = C38072d.f163053a;
                AbstractC30795n.m94707h(strM21275i7, modifierM3395q7, jM53358D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getSh4(), null, c28655q, 0, 0, 196600);
                c28655q = c28655q;
                c28655q.m87173q(true);
                if (z18) {
                    c28655q.m87150e0(-261388731);
                    C27430e c27430eM107874S14 = AbstractC34132o.m107874S(headerState.getCtaIcon(), c28655q, 6);
                    if (z17) {
                        jM73366B = AbstractC31061c.m95627c(c28655q, -424069787, c38072d, c28655q, 6);
                        z19 = false;
                    } else {
                        z19 = false;
                        jM73366B = AbstractC25012a.m73366B(c28655q, -424068792, c38072d, c28655q, 6);
                    }
                    c28655q.m87173q(z19);
                    long j18 = jM73366B;
                    Modifier modifierM3599a7 = AbstractC1136a.m3599a(c2314t, "items_card_header_cta");
                    if ((i18 & 7168) == 2048) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z24) {
                        objM87133R = new C31918g(interfaceC4339a2, 12);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C31918g(interfaceC4339a2, 12);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3396r14 = AbstractC1099a.m3396r(AbstractC1092a.m3362g(modifierM3599a7, false, null, null, (InterfaceC4339a) objM87133R, 15), f14, 0.0f, 2);
                    float f118 = 4;
                    AbstractC15005f3.m43108b(c27430eM107874S14, null, AbstractC1102d.m3419p(f118 * f118, modifierM3396r14), j18, c28655q, 48, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-260918492);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a2;
                z15 = z18;
                modifier3 = modifier7;
            } else {
                z18 = z16;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            C0209i c0209i17 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N10);
            C22994r1 c22994r1M66759a12 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l4, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
            Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i14, c22994r1M66759a12);
            AbstractC28683x.m87239G(c28655q, c0209i15, interfaceC28653p1M87165m12);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i17, modifierM118962N12);
            if (headerState.getTitleIcon() == null) {
                c28655q.m87150e0(2012566622);
                r10 = 0;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2012566623);
                C27430e c27430eM107874S15 = AbstractC34132o.m107874S(headerState.getTitleIcon().intValue(), c28655q, 6);
                long jM125382b8 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                Modifier modifierM3396r15 = AbstractC1099a.m3396r(c2314t, ((float) 0.5d) * 8, 0.0f, 2);
                if (z17) {
                    float f119 = 4;
                    f13 = f119 * f119;
                } else {
                    f13 = 6 * 4;
                }
                r10 = 0;
                AbstractC15005f3.m43108b(c27430eM107874S15, null, AbstractC1102d.m3419p(f13, modifierM3396r15), jM125382b8, c28655q, 48, 0);
                c28655q.m87173q(false);
            }
            String strM21275i8 = AbstractC8693b.m21275i(headerState.getTitle(), c28655q, r10);
            f14 = ((float) 0.5d) * 8;
            Modifier modifierM3395q8 = AbstractC1099a.m3395q(c2314t, f14, f14);
            if (z17) {
                c28655q.m87150e0(-904889236);
                i19 = 6;
                jM53358D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, r10);
            } else {
                i19 = 6;
                c28655q.m87150e0(-904888151);
                jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, r10);
            }
            c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21275i8, modifierM3395q8, jM53358D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getSh4(), null, c28655q, 0, 0, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
            if (z18) {
                c28655q.m87150e0(-261388731);
                C27430e c27430eM107874S16 = AbstractC34132o.m107874S(headerState.getCtaIcon(), c28655q, 6);
                if (z17) {
                    jM73366B = AbstractC31061c.m95627c(c28655q, -424069787, c38072d, c28655q, 6);
                    z19 = false;
                } else {
                    z19 = false;
                    jM73366B = AbstractC25012a.m73366B(c28655q, -424068792, c38072d, c28655q, 6);
                }
                c28655q.m87173q(z19);
                long j19 = jM73366B;
                Modifier modifierM3599a8 = AbstractC1136a.m3599a(c2314t, "items_card_header_cta");
                if ((i18 & 7168) == 2048) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z24) {
                    objM87133R = new C31918g(interfaceC4339a2, 12);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C31918g(interfaceC4339a2, 12);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3396r16 = AbstractC1099a.m3396r(AbstractC1092a.m3362g(modifierM3599a8, false, null, null, (InterfaceC4339a) objM87133R, 15), f14, 0.0f, 2);
                float f1110 = 4;
                AbstractC15005f3.m43108b(c27430eM107874S16, null, AbstractC1102d.m3419p(f1110 * f1110, modifierM3396r16), j19, c28655q, 48, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-260918492);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a2;
            z15 = z18;
            modifier3 = modifier7;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            z15 = z13;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31919h(modifier3, (Object) headerState, z15, (InterfaceC23459e) interfaceC4339a3, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m113315e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m113316f(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m113317g(Modifier modifier, C35764e c35764e, boolean z4, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m113314d(modifier, c35764e, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
