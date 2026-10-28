package p00;

import android.content.Context;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import ar2.C1935f;
import b30.C2633u2;
import c30.C3911b;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.model.ConsentUi;
import com.whoop.android.R;
import g00.AbstractC14936g;
import g00.C14931b;
import g00.C14934e;
import g40.C15399o1;
import i20.C17930b1;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import oe2.C27878c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p023ay.C2147u;
import p026b2.C2299e;
import p026b2.C2314t;
import p026b2.C2319y;
import p027b3.AbstractC2453v1;
import p027b3.InterfaceC2464x2;
import p048ce.AbstractC4482w;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15067l1;
import p163g1.C14970c1;
import p164g2.C15247s;
import p164g2.InterfaceC15237i;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p386oy.C28467d;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p530up.AbstractC35148d;
import p550vd.AbstractC35903f;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import se.AbstractC32411b;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: p00.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC28571h {
    /* JADX INFO: renamed from: a */
    public static final void m86898a(String str, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1123540244);
        int i14 = i13 | (c28655q2.m87153g(str) ? 4 : 2) | (c28655q2.m87155h(z4) ? 32 : 16) | (c28655q2.m87157i(interfaceC4339a) ? 256 : 128);
        if ((i14 & 147) == 146 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9107J, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC15011f9.m43114b(str, new LayoutWeightElement(1.0f, false), AbstractC4482w.m13975K(c28655q2).f55676o, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, AbstractC4482w.m13983T(c28655q2).f55695b, c28655q2, i14 & 14, 3120, 55288);
            AbstractC15011f9.m43114b(AbstractC30060g.m92103Y(c28655q2, R.string.stripe_verification_change_email_new), AbstractC1092a.m3361f(AbstractC1099a.m3398t(AbstractC1136a.m3599a(c2314t, "verification_change_email_tag"), 4, 0.0f, 0.0f, 0.0f, 14), !z4, null, interfaceC4339a, 6), AbstractC4482w.m13975K(c28655q2).f55678q, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, AbstractC4482w.m13983T(c28655q2).f55696c, c28655q2, 0, 3072, 57336);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28569f(str, z4, interfaceC4339a, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m86899b(ConsentUi.ConsentSection consentSection, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1700891841);
        if ((((c28655q.m87157i(consentSection) ? 4 : 2) | i13) & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 8, 0.0f, 0.0f, 13);
            String disclaimer = consentSection.getDisclaimer();
            c28655q.m87150e0(-1418551394);
            C14934e c14934e = (C14934e) c28655q.m87161k(AbstractC14936g.f55705b);
            c28655q.m87173q(false);
            C23285v0 c23285v0M67364b = C23285v0.m67364b(c14934e.f55699f, 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447);
            c28655q.m87150e0(-443512897);
            C14931b c14931b = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
            c28655q.m87173q(false);
            AbstractC35148d.m111173d(disclaimer, modifierM3398t, null, c14931b.f55676o, c23285v0M67364b, false, null, 0, null, c28655q, 48, 484);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27878c(consentSection, i13, 11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m86900c(C28580q c28580q, InterfaceC15237i interfaceC15237i, InterfaceC2464x2 interfaceC2464x2, C15247s c15247s, InterfaceC4339a interfaceC4339a, Context context, InterfaceC4339a interfaceC4339a2, Composer composer, int i13) {
        Boolean bool;
        boolean z4;
        boolean z13;
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1473149422);
        int i15 = (c28655q.m87153g(c28580q) ? 4 : 2) | i13 | (c28655q.m87157i(interfaceC15237i) ? 32 : 16) | (c28655q.m87153g(interfaceC2464x2) ? 256 : 128);
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i16 = i15 | (c28655q.m87157i(context) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST);
        if ((1572864 & i13) == 0) {
            i16 |= c28655q.m87157i(interfaceC4339a2) ? 1048576 : 524288;
        }
        int i17 = i16;
        if ((599187 & i17) == 599186 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            Boolean boolValueOf = Boolean.valueOf(c28580q.f115648w);
            c28655q.m87150e0(-258481862);
            int i18 = i17 & 14;
            int i19 = i17 & 896;
            boolean zM87157i = (i18 == 4) | c28655q.m87157i(interfaceC15237i) | (i19 == 256);
            Object objM87133R = c28655q.m87133R();
            InterfaceC30057d interfaceC30057d = null;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                bool = boolValueOf;
                z4 = false;
                C2147u c2147u = new C2147u(c28580q, interfaceC15237i, interfaceC2464x2, interfaceC30057d, 16);
                c28655q.m87172p0(c2147u);
                objM87133R = c2147u;
            } else {
                bool = boolValueOf;
                z4 = false;
            }
            c28655q.m87173q(z4);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, bool);
            Boolean boolValueOf2 = Boolean.valueOf(c28580q.f115649x);
            c28655q.m87150e0(-258476240);
            boolean z14 = (i19 == 256 ? true : z4) | (i18 == 4 ? true : z4) | ((57344 & i17) == 16384 ? true : z4);
            Object objM87133R2 = c28655q.m87133R();
            if (z14 || objM87133R2 == c28676v0) {
                z13 = z4;
                i14 = i18;
                C2319y c2319y = new C2319y(c28580q, c15247s, interfaceC2464x2, interfaceC4339a, (InterfaceC30057d) null, 20);
                c28655q.m87172p0(c2319y);
                objM87133R2 = c2319y;
            } else {
                i14 = i18;
                z13 = z4;
            }
            c28655q.m87173q(z13);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf2);
            Boolean boolValueOf3 = Boolean.valueOf(c28580q.f115640E);
            c28655q.m87150e0(-258467908);
            boolean zM87157i2 = c28655q.m87157i(context) | (i14 == 4 ? true : z13) | ((3670016 & i17) != 1048576 ? z13 : true);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                C2147u c2147u2 = new C2147u(c28580q, context, interfaceC4339a2, interfaceC30057d, 17);
                c28655q.m87172p0(c2147u2);
                objM87133R3 = c2147u2;
            }
            c28655q.m87173q(z13);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, boolValueOf3);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2633u2(c28580q, interfaceC15237i, interfaceC2464x2, c15247s, interfaceC4339a, context, interfaceC4339a2, i13, 11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m86901d(boolean z4, boolean z13, InterfaceC4339a onClick, Composer composer, int i13) {
        float f13;
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1362496471);
        int i14 = i13 | (c28655q.m87155h(z4) ? 4 : 2) | (c28655q.m87155h(z13) ? 32 : 16) | (c28655q.m87157i(onClick) ? 256 : 128);
        if ((i14 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3361f = AbstractC1092a.m3361f(AbstractC1136a.m3599a(c2314t, "verification_resend_code_button_tag"), (z4 || z13) ? false : true, null, onClick, 6);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3361f);
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
                c28655q.m87150e0(-191520478);
                long j7 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                if (((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    AbstractC17918w0.m51536x(j7);
                } else {
                    AbstractC17918w0.m51536x(j7);
                }
                c28655q.m87173q(false);
                f13 = 0.38f;
            } else if (z13) {
                c28655q.m87150e0(-191448651);
                c28655q.m87173q(false);
                f13 = 0.0f;
            } else {
                c28655q.m87150e0(-191416442);
                long j13 = ((C17919x) c28655q.m87161k(AbstractC15067l1.f56420a)).f69639a;
                f13 = (!((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43094i() ? ((double) AbstractC17918w0.m51536x(j13)) < 0.5d : ((double) AbstractC17918w0.m51536x(j13)) > 0.5d) ? 0.87f : 1.0f;
                c28655q.m87173q(false);
            }
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, R.string.stripe_verification_resend);
            c28655q.m87150e0(-1418551394);
            C14934e c14934e = (C14934e) c28655q.m87161k(AbstractC14936g.f55705b);
            c28655q.m87173q(false);
            C23285v0 c23285v0 = c14934e.f55696c;
            c28655q.m87150e0(-443512897);
            C14931b c14931b = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
            c28655q.m87173q(false);
            AbstractC15011f9.m43114b(strM92103Y, AbstractC34132o.m107879c(f13, c2314t), c14931b.f55678q, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c23285v0, c28655q, 0, 0, 65528);
            c28655q = c28655q;
            AbstractC1090b.m3351f(z13, null, null, null, null, AbstractC28567d.f115575b, c28655q, ((i14 >> 3) & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21, 30);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28467d(z4, z13, onClick, i13, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m86902e(boolean z4, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1246127343);
        if ((((c28655q.m87155h(z4) ? 4 : 2) | i13) & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C2314t c2314t = C2314t.f9131w;
            if (z4) {
                c28655q.m87150e0(1584634607);
                String strM92103Y = AbstractC30060g.m92103Y(c28655q, R.string.stripe_verification_dialog_header);
                Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "verification_title");
                c28655q.m87150e0(-1418551394);
                C14934e c14934e = (C14934e) c28655q.m87161k(AbstractC14936g.f55705b);
                c28655q.m87173q(false);
                C23285v0 c23285v0 = c14934e.f55694a;
                c28655q.m87150e0(-443512897);
                C14931b c14931b = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                c28655q.m87173q(false);
                AbstractC15011f9.m43114b(strM92103Y, modifierM3599a, c14931b.f55674m, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c23285v0, c28655q, 48, 0, 65016);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1584980133);
                String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, R.string.stripe_verification_dialog_header);
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1136a.m3599a(c2314t, "verification_title"), 0.0f, 4, 1);
                c28655q.m87150e0(-1418551394);
                C14934e c14934e2 = (C14934e) c28655q.m87161k(AbstractC14936g.f55705b);
                c28655q.m87173q(false);
                C23285v0 c23285v1 = c14934e2.f55694a;
                c28655q.m87150e0(-443512897);
                C14931b c14931b2 = (C14931b) c28655q.m87161k(AbstractC14936g.f55706c);
                c28655q.m87173q(false);
                AbstractC15011f9.m43114b(strM92103Y2, modifierM3396r, c14931b2.f55674m, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c23285v1, c28655q, 48, 0, 65016);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3911b(z4, i13, 3);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m86903f(final C28580q state, final C15399o1 otpElement, final InterfaceC4339a onBack, final InterfaceC4339a onFocusRequested, final InterfaceC4339a didShowCodeSentNotification, final InterfaceC4339a onChangeEmailClick, final InterfaceC4339a onResendCodeClick, final InterfaceC4339a onConsentShown, Composer composer, final int i13) {
        InterfaceC4339a interfaceC4339a;
        C28655q c28655q;
        AbstractC22676k.m65750j(state, "state");
        boolean z4 = state.f115643H;
        AbstractC22676k.m65750j(otpElement, "otpElement");
        AbstractC22676k.m65750j(onBack, "onBack");
        AbstractC22676k.m65750j(onFocusRequested, "onFocusRequested");
        AbstractC22676k.m65750j(didShowCodeSentNotification, "didShowCodeSentNotification");
        AbstractC22676k.m65750j(onChangeEmailClick, "onChangeEmailClick");
        AbstractC22676k.m65750j(onResendCodeClick, "onResendCodeClick");
        AbstractC22676k.m65750j(onConsentShown, "onConsentShown");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(294909272);
        int i14 = (c28655q2.m87153g(state) ? 4 : 2) | i13 | (c28655q2.m87157i(otpElement) ? 32 : 16);
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onBack) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(onFocusRequested) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(didShowCodeSentNotification) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87157i(onChangeEmailClick) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q2.m87157i(onResendCodeClick) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q2.m87157i(onConsentShown) ? 8388608 : 4194304;
        }
        if ((4793491 & i14) == 4793490 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
            interfaceC4339a = onBack;
        } else {
            c28655q2.m87150e0(1393478927);
            if (state.f115647L) {
                m86904g(z4, onBack, AbstractC28567d.f115574a, c28655q2, ((i14 >> 3) & 112) | 384);
                c28655q2.m87173q(false);
                C28677v1 c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u != null) {
                    final int i15 = 0;
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: p00.e
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i15) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    AbstractC28571h.m86903f(state, otpElement, onBack, onFocusRequested, didShowCodeSentNotification, onChangeEmailClick, onResendCodeClick, onConsentShown, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    AbstractC28571h.m86903f(state, otpElement, onBack, onFocusRequested, didShowCodeSentNotification, onChangeEmailClick, onResendCodeClick, onConsentShown, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                                    break;
                            }
                            return C23454a0.f92919a;
                        }
                    };
                    return;
                }
                return;
            }
            interfaceC4339a = onBack;
            c28655q2.m87173q(false);
            Context context = (Context) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q2.m87161k(AbstractC2453v1.f9570i);
            c28655q2.m87150e0(1393489844);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC33745d.m106649h(c28655q2);
            }
            C15247s c15247s = (C15247s) objM87133R;
            c28655q2.m87173q(false);
            c28655q = c28655q2;
            m86900c(state, interfaceC15237i, (InterfaceC2464x2) c28655q2.m87161k(AbstractC2453v1.f9577p), c15247s, onFocusRequested, context, didShowCodeSentNotification, c28655q, (i14 & 14) | 3072 | ((i14 << 3) & 57344) | (3670016 & (i14 << 6)));
            c28655q.m87150e0(1393506077);
            boolean zM87157i = c28655q.m87157i(interfaceC15237i) | ((i14 & 896) == 256);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C17930b1(interfaceC15237i, interfaceC4339a, 4);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            m86904g(z4, (InterfaceC4339a) objM87133R2, AbstractC37817c.m121344e(-692610689, c28655q, new C28570g(state, onResendCodeClick, onChangeEmailClick, otpElement, c15247s, onConsentShown)), c28655q, 384);
        }
        C28677v1 c28677v1M87180u2 = c28655q.m87180u();
        if (c28677v1M87180u2 != null) {
            final int i16 = 1;
            final InterfaceC4339a interfaceC4339a2 = interfaceC4339a;
            c28677v1M87180u2.f115982d = new InterfaceC4351m() { // from class: p00.e
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    switch (i16) {
                        case 0:
                            ((Integer) obj2).getClass();
                            AbstractC28571h.m86903f(state, otpElement, interfaceC4339a2, onFocusRequested, didShowCodeSentNotification, onChangeEmailClick, onResendCodeClick, onConsentShown, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            AbstractC28571h.m86903f(state, otpElement, interfaceC4339a2, onFocusRequested, didShowCodeSentNotification, onChangeEmailClick, onResendCodeClick, onConsentShown, (Composer) obj, AbstractC28683x.m87244L(i13 | 1));
                            break;
                    }
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m86904g(boolean z4, InterfaceC4339a interfaceC4339a, C37816b c37816b, Composer composer, int i13) {
        int i14;
        Function3 function3;
        C37816b c37816b2 = c37816b;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-157383319);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(c37816b2) ? 256 : 128;
        }
        if ((i14 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
            function3 = c37816b2;
        } else if (z4) {
            c28655q.m87150e0(-70535657);
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 24;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1102d.m3409f(1.0f, c2314t));
            int i15 = i14;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(R.drawable.stripe_link_logo, c28655q, 0), AbstractC30060g.m92103Y(c28655q, R.string.stripe_link), AbstractC1136a.m3599a(c2314t, "verification_header_image_tag"), null, null, 0.0f, null, c28655q, 384, 120);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f, true));
            AbstractC32411b.m101085b(AbstractC1136a.m3599a(c2314t, "verification_header_button_tag"), AbstractC30060g.m92103Y(c28655q, R.string.stripe_close), interfaceC4339a, R.drawable.stripe_link_close, ((i15 << 6) & 7168) | 384, c28655q, 0);
            c28655q.m87173q(true);
            Modifier modifierM3397s = AbstractC1099a.m3397s(c2314t, f13, 2, f13, f13);
            int i16 = ((i15 << 3) & 7168) | 384;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9111N, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3397s);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            Function3 function4 = c37816b;
            function4.invoke(C23016z.f90757a, c28655q, Integer.valueOf(((i16 >> 6) & 112) | 6));
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
            function3 = function4;
        } else {
            c28655q.m87150e0(-69266083);
            AbstractC35903f.m114008c(null, c37816b2, c28655q, (i14 >> 3) & 112);
            c28655q.m87173q(false);
            function3 = c37816b2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(z4, interfaceC4339a, function3, i13, 26);
        }
    }
}
