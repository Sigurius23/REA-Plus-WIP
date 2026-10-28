package p484s9;

import android.content.Context;
import android.text.SpannableStringBuilder;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1620r;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2549j2;
import b30.C2552j5;
import b30.C2580n1;
import b30.C2654x2;
import br2.C3565g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.stripe.android.p056ui.core.elements.SharedDataSpec;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import d13.AbstractC11478a;
import d40.AbstractC11673r;
import d40.C11669n;
import d40.C11671p;
import d40.EnumC11663h;
import g40.AbstractC15376j4;
import g40.C15341e;
import g40.C15351f3;
import g40.C15435v2;
import g40.C15454z1;
import g40.InterfaceC15361h1;
import g40.InterfaceC15391m3;
import g40.InterfaceC15452z;
import g40.InterfaceC15455z2;
import h20.C16689l1;
import h20.EnumC16677j1;
import h20.EnumC16683k1;
import i20.C17934d;
import i20.C17959l0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.getstream.chat.android.p226ui.viewmodel.messages.C19940d;
import io.sentry.config.AbstractC20301a;
import j00.C21090a0;
import j00.C21110m;
import j93.InterfaceC21467g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.Inflater;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25271y;
import n20.C26185t;
import no.C26873f;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import p00.C28573j;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p097ds.AbstractC12314q;
import p098dt.AbstractC12350b;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15018g5;
import p163g1.C15069l3;
import p245j8.AbstractC21412c;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C23010x;
import p294l3.C23285v0;
import p298l8.C23418a;
import p309lo.C24561s;
import p319m4.AbstractC25012a;
import p323m8.AbstractC25218a;
import p353o0.C27325i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p477s2.AbstractC32069a;
import p477s2.AbstractC32072d;
import p478s3.AbstractC32098d;
import p479s4.AbstractC32128i;
import p481s6.AbstractC32229a;
import p484s9.AbstractC32281f;
import p508ty.C34249c;
import p530up.AbstractC35148d;
import p547v8.AbstractC35785b;
import p571w3.C36775k;
import p598wy.InterfaceC37689b;
import p602x1.AbstractC37817c;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p696zy.C41210b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p733ry2.C31918g;
import p734sl0.C32676t1;
import pf.AbstractC29125c;
import pp2.C29451o;
import q20.C29810c;
import q83.AbstractC30060g;
import s20.C32077a;
import s30.AbstractC32100b;
import s51.C32209f;
import se.AbstractC32410a;
import sr2.C32940v;
import t00.C33254a;
import t20.C33321b;
import t20.C33322c;
import t20.C33326g;
import t20.C33329j;
import t20.C33333n;
import t20.C33334o;
import t20.C33336q;
import t20.C33337r;
import t20.C33342w;
import u00.C34378f;
import um0.C35076b;
import v00.AbstractC35485p0;
import v00.C35459c0;
import v00.C35479m0;
import v00.InterfaceC35457b0;
import v00.InterfaceC35481n0;
import v00.InterfaceC35483o0;
import v00.InterfaceC35487q0;
import v63.AbstractC35745c;
import v90.C35813e;
import ve.InterfaceC35921f;
import wb3.AbstractC37056f;
import wr0.C37526f;
import x20.AbstractC37837e;
import x20.AbstractC37857y;
import x20.C37848p;
import x20.C37855w;
import x30.C37897i1;
import x30.C37912n1;
import xa3.InterfaceC38150k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: s9.f */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32281f implements InterfaceC37689b {
    /* JADX INFO: renamed from: A */
    public static final String m100435A(char c3) {
        String strValueOf = String.valueOf(c3);
        AbstractC22676k.m65748h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c3));
        }
        if (c3 == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        String strSubstring = upperCase.substring(1);
        AbstractC22676k.m65749i(strSubstring, "substring(...)");
        String lowerCase = strSubstring.toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }

    /* JADX INFO: renamed from: a */
    public static final void m100436a(Modifier modifier, boolean z4, boolean z13, String str, String str2, C33322c c33322c, C37897i1 c37897i1, C37912n1 c37912n1, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        String str3;
        C33322c c33322c2;
        boolean z14 = z13;
        String str4 = str2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1712712382);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z14) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            str3 = str;
            i14 |= c28655q.m87153g(str3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            str3 = str;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(str4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            c33322c2 = c33322c;
            i14 |= c28655q.m87153g(c33322c2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            c33322c2 = c33322c;
        }
        if ((1572864 & i13) == 0) {
            i14 |= (2097152 & i13) == 0 ? c28655q.m87153g(c37897i1) : c28655q.m87157i(c37897i1) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= (16777216 & i13) == 0 ? c28655q.m87153g(c37912n1) : c28655q.m87157i(c37912n1) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        int i15 = i14;
        if ((i15 & 38347923) == 38347922 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            Object[] objArr = new Object[0];
            c28655q.m87150e0(1846433404);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C32940v(25);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124459e(objArr, null, (InterfaceC4339a) objM87133R, c28655q, 3072, 6);
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, modifier), "TEST_TAG_ACCOUNT_DETAILS");
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
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
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, R.string.stripe_title_bank_account);
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            AbstractC5583n.m16769b(strM92103Y, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7), false, c28655q, 48, 4);
            c28655q.m87150e0(-670094829);
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C27325i(22, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            int i16 = i15 >> 6;
            int i17 = i16 & 896;
            c28655q = c28655q;
            str4 = str2;
            m100440e(str3, z14, str4, c33322c2, (InterfaceC4339a) objM87133R2, c28655q, (i16 & 7168) | ((i15 >> 9) & 14) | ((i15 >> 3) & 112) | i17);
            z14 = z14;
            c28655q.m87150e0(-670092205);
            if (z4) {
                int i18 = (i16 & 14) | 448;
                AbstractC32072d.m99700i(z14, c37897i1, AbstractC1099a.m3398t(c2314t, 0.0f, f13, 0.0f, 0.0f, 13), c28655q, ((i15 >> 15) & 112) | i18);
                if (c37912n1 != null) {
                    AbstractC32098d.m99837c(z14, c37912n1, AbstractC1099a.m3398t(c2314t, 0.0f, f13, 0.0f, 0.0f, 13), c28655q, i18);
                }
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            if (((Boolean) interfaceC28601c1.getValue()).booleanValue() && str4 != null) {
                c28655q.m87150e0(1846470933);
                boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C27325i(23, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                c28655q.m87173q(false);
                c28655q.m87150e0(1846473556);
                boolean z15 = (i15 & 234881024) == 67108864;
                Object objM87133R4 = c28655q.m87133R();
                if (z15 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C31918g(interfaceC4339a, 6);
                    c28655q.m87172p0(objM87133R4);
                }
                c28655q.m87173q(false);
                m100437b(str4, interfaceC4339a2, (InterfaceC4339a) objM87133R4, c28655q, i17);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2580n1(modifier, z4, z14, str, str4, c33322c, c37897i1, c37912n1, interfaceC4339a, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m100437b(String str, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(488911789);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(str) ? 256 : 128;
        }
        if ((i14 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, R.string.stripe_paymentsheet_remove_bank_account_title);
            String strM92102X = AbstractC30060g.m92102X(R.string.stripe_bank_account_ending_in, new Object[]{str}, c28655q);
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, R.string.stripe_remove);
            String strM92103Y3 = AbstractC30060g.m92103Y(c28655q, R.string.stripe_cancel);
            c28655q.m87150e0(1353535528);
            int i15 = i14 & 14;
            boolean z4 = ((i14 & 112) == 32) | (i15 == 4);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C19940d(1, interfaceC4339a, interfaceC4339a2);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
            c28655q.m87173q(false);
            c28655q.m87150e0(1353538538);
            boolean z13 = i15 == 4;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C31918g(interfaceC4339a, 5);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            AbstractC32100b.m99857b(strM92103Y, strM92102X, strM92103Y2, strM92103Y3, true, interfaceC4339a3, (InterfaceC4339a) objM87133R2, c28655q, 24576);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33334o(interfaceC4339a, interfaceC4339a2, str, i13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m100438c(long j7, InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, Composer composer, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(882210043);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87151f(j7) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87149e(i13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C2305k c2305k = C2299e.f9111N;
            C22961h c22961h = AbstractC22977m.f90654e;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, modifier), 0.0f, AbstractC35148d.m111190u(c28655q, R.dimen.stripe_paymentsheet_outer_spacing_top), 1);
            C11669n c11669n = C11671p.f37680a;
            Modifier modifierM3393o = AbstractC1099a.m3393o(AbstractC11673r.m31081j(), modifierM3396r);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3393o);
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
            float f13 = AbstractC37857y.f162059a;
            C2314t c2314t = C2314t.f9131w;
            AbstractC12314q.m34325e(AbstractC11673r.m31082k(c28655q).f37675h, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7), 6, c28655q, 0);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, R.string.stripe_upi_polling_header);
            C23285v0 c23285v0 = C15069l3.m43149c(c28655q).f56277d;
            float f14 = AbstractC37857y.f162060b;
            AbstractC15011f9.m43114b(strM92103Y, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f14, 7), 0L, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c23285v0, c28655q, 48, 0, 65020);
            int i16 = (i15 & 14) | ((i15 >> 6) & 112);
            c28655q.m87150e0(-1139194821);
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            c28655q.m87150e0(211879540);
            boolean z4 = (((i16 & 14) ^ 6) > 4 && c28655q.m87151f(j7)) || (i16 & 6) == 4;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                long jM134274getInWholeMinutesimpl = Duration.m134274getInWholeMinutesimpl(j7);
                int iM134279getSecondsComponentimpl = Duration.m134279getSecondsComponentimpl(j7);
                Duration.m134278getNanosecondsComponentimpl(j7);
                objM87133R = context.getString(i13, jM134274getInWholeMinutesimpl + ":" + AbstractC39414r.m125895n0(2, String.valueOf(iM134279getSecondsComponentimpl)));
                c28655q.m87172p0(objM87133R);
            }
            String str = (String) objM87133R;
            c28655q.m87173q(false);
            AbstractC22676k.m65747g(str);
            c28655q.m87173q(false);
            long j13 = C15069l3.m43149c(c28655q).f56282i.f92255a.f92192b;
            AbstractC35745c.m113242a(j13);
            AbstractC15011f9.m43114b(str, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f14, 7), 0L, 0L, null, null, null, 0L, null, new C36775k(3), AbstractC11478a.m30852d(j13, 1095216660480L & j13, 1.3f), 0, false, 0, 0, null, null, c28655q, 48, 0, 129532);
            AbstractC12350b.m34583d(interfaceC4339a, null, false, null, null, null, null, AbstractC37837e.f161998a, c28655q, ((i15 >> 3) & 14) | 805306368, 510);
            c28655q = c28655q;
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3565g(j7, interfaceC4339a, modifier, i13, i14, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x011b  */
    /* JADX WARN: Code duplicated, block: B:67:0x011f  */
    /* JADX WARN: Code duplicated, block: B:72:0x013a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0177  */
    /* JADX INFO: renamed from: d */
    public static final void m100439d(boolean z4, C15341e c15341e, IdentifierSpec identifierSpec, C15435v2 c15435v2, Modifier modifier, Composer composer, int i13) {
        int i14;
        InterfaceC28601c1 interfaceC28601c1;
        int iHashCode;
        boolean z13;
        C15341e c15341e2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1272277033);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c15341e) : c28655q.m87157i(c15341e) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(identifierSpec) : c28655q.m87157i(identifierSpec) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(c15435v2) : c28655q.m87157i(c15435v2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87153g(modifier) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i14 & 9363) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
            c15341e2 = c15341e;
            z13 = z4;
        } else {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(c15341e.f57649b, c28655q, 0);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(0, AbstractC1102d.m3409f(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9103F, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                interfaceC28601c1 = interfaceC28601c1M83597t;
            } else {
                interfaceC28601c1 = interfaceC28601c1M83597t;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                z13 = z4;
                c15341e2 = c15341e;
                AbstractC32410a.m101045o(AbstractC32128i.m100064s(R.string.stripe_billing_details, new Object[0], C25271y.f99162w), (InterfaceC15361h1) interfaceC28601c1.getValue(), null, false, AbstractC37817c.m121344e(1444792713, c28655q, new C2552j5(z13, c15341e2, identifierSpec)), c28655q, 24576, 12);
                c28655q.m87150e0(-433066654);
                if (c15435v2 != null) {
                    AbstractC20301a.m56344l(c15435v2.f58019b, AbstractC1099a.m3398t(c2314t, 0.0f, 12, 0.0f, 0.0f, 13), c28655q, 56);
                }
                AbstractC25012a.m73392y(c28655q, false, true, true);
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            z13 = z4;
            c15341e2 = c15341e;
            AbstractC32410a.m101045o(AbstractC32128i.m100064s(R.string.stripe_billing_details, new Object[0], C25271y.f99162w), (InterfaceC15361h1) interfaceC28601c1.getValue(), null, false, AbstractC37817c.m121344e(1444792713, c28655q, new C2552j5(z13, c15341e2, identifierSpec)), c28655q, 24576, 12);
            c28655q.m87150e0(-433066654);
            if (c15435v2 != null) {
                AbstractC20301a.m56344l(c15435v2.f58019b, AbstractC1099a.m3398t(c2314t, 0.0f, 12, 0.0f, 0.0f, 13), c28655q, 56);
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2549j2(z13, (InterfaceC15455z2) c15341e2, (Object) identifierSpec, (Object) c15435v2, modifier, i13, 14);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m100440e(String str, boolean z4, String str2, C33322c c33322c, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C33322c c33322c2;
        InterfaceC4339a interfaceC4339a2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2029602721);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(str2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            c33322c2 = c33322c;
            i14 |= c28655q.m87153g(c33322c2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            c33322c2 = c33322c;
        }
        if ((i13 & 24576) == 0) {
            interfaceC4339a2 = interfaceC4339a;
            i14 |= c28655q.m87157i(interfaceC4339a2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            interfaceC4339a2 = interfaceC4339a;
        }
        if ((i14 & 9363) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            EnumC11663h enumC11663h = (EnumC11663h) c28655q.m87161k(AbstractC11673r.f37715g);
            c28655q.m87150e0(-1996903258);
            boolean zM87153g = ((i14 & 14) == 4) | c28655q.m87153g(enumC11663h);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = Integer.valueOf(C33329j.m105695a(enumC11663h == EnumC11663h.f37649x ? R.drawable.stripe_ic_paymentsheet_pm_bank_outlined : R.drawable.stripe_ic_paymentsheet_pm_bank, str));
                c28655q.m87172p0(objM87133R);
            }
            int iIntValue = ((Number) objM87133R).intValue();
            c28655q.m87173q(false);
            AbstractC32410a.m101046p(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), null, false, 0L, null, AbstractC37817c.m121344e(1816408804, c28655q, new C33336q(interfaceC4339a2, z4, iIntValue, str, str2, c33322c2)), c28655q, 196614, 30);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2549j2(str, z4, str2, c33322c, interfaceC4339a, i13, 13);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m100441f(C33326g state, final C32077a formArgs, final boolean z4, final boolean z13, final boolean z14, final InterfaceC15391m3 nameController, final InterfaceC15391m3 emailController, final C15454z1 phoneController, final C15341e addressController, final IdentifierSpec identifierSpec, final C15435v2 c15435v2, final C37897i1 saveForFutureUseElement, final C37912n1 c37912n1, final Modifier modifier, final boolean z15, final InterfaceC4339a onRemoveAccount, Composer composer, final int i13, final int i14) {
        int i15;
        int i16;
        C28655q c28655q;
        final C33326g c33326g;
        AbstractC22676k.m65750j(state, "state");
        String str = state.f139009x;
        C33321b c33321b = state.f139011z;
        AbstractC22676k.m65750j(formArgs, "formArgs");
        AbstractC22676k.m65750j(nameController, "nameController");
        AbstractC22676k.m65750j(emailController, "emailController");
        AbstractC22676k.m65750j(phoneController, "phoneController");
        AbstractC22676k.m65750j(addressController, "addressController");
        AbstractC22676k.m65750j(saveForFutureUseElement, "saveForFutureUseElement");
        AbstractC22676k.m65750j(onRemoveAccount, "onRemoveAccount");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-261034153);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q2.m87153g(state) : c28655q2.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(formArgs) : c28655q2.m87157i(formArgs) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        int i17 = i13 & 3072;
        int i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i17 == 0) {
            i15 |= c28655q2.m87155h(z13) ? 2048 : 1024;
        }
        int i19 = i13 & 24576;
        int i24 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i19 == 0) {
            i15 |= c28655q2.m87155h(z14) ? 16384 : 8192;
        }
        int i25 = i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21;
        int i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i25 == 0) {
            i15 |= c28655q2.m87157i(nameController) ? 131072 : 65536;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= c28655q2.m87157i(emailController) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i15 |= (i13 & 16777216) == 0 ? c28655q2.m87153g(phoneController) : c28655q2.m87157i(phoneController) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= (i13 & 134217728) == 0 ? c28655q2.m87153g(addressController) : c28655q2.m87157i(addressController) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= (i13 & 1073741824) == 0 ? c28655q2.m87153g(identifierSpec) : c28655q2.m87157i(identifierSpec) ? 536870912 : 268435456;
        }
        if ((i14 & 6) == 0) {
            i16 = i14 | ((i14 & 8) == 0 ? c28655q2.m87153g(c15435v2) : c28655q2.m87157i(c15435v2) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? c28655q2.m87153g(saveForFutureUseElement) : c28655q2.m87157i(saveForFutureUseElement) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? c28655q2.m87153g(c37912n1) : c28655q2.m87157i(c37912n1) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if (c28655q2.m87153g(modifier)) {
                i18 = 2048;
            }
            i16 |= i18;
        }
        if ((i14 & 24576) == 0) {
            if (c28655q2.m87155h(z15)) {
                i24 = 16384;
            }
            i16 |= i24;
        }
        if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q2.m87157i(onRemoveAccount)) {
                i26 = 131072;
            }
            i16 |= i26;
        }
        if ((i15 & 306783379) == 306783378 && (i16 & 74899) == 74898 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c33326g = state;
            c28655q = c28655q2;
        } else {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            int i27 = (i16 >> 6) & 896;
            int i28 = i15 >> 3;
            int i29 = ((i15 >> 6) & 14) | 64 | (i15 & 112) | i27 | (i15 & 7168) | (57344 & i28) | (458752 & i28) | 2097152 | (i28 & 3670016) | 16777216 | (i28 & 29360128) | (IdentifierSpec.$stable << 24) | (i28 & 234881024) | 1073741824 | ((i16 << 27) & 1879048192);
            int i34 = i15;
            m100442g(z4, formArgs, z15, z13, nameController, emailController, phoneController, addressController, identifierSpec, c15435v2, c28655q2, i29);
            c28655q = c28655q2;
            c28655q.m87150e0(1872725525);
            C2314t c2314t = C2314t.f9131w;
            C41210b c41210bM100064s = null;
            if (c33321b != null) {
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 16, 0.0f, 0.0f, 13);
                int i35 = i16 << 15;
                m100436a(modifierM3398t, z14, z15, c33321b.f139000x, c33321b.f139001y, str != null ? new C33322c(str, c33321b.f138998H) : null, saveForFutureUseElement, c37912n1, onRemoveAccount, c28655q, i27 | ((i34 >> 9) & 112) | 6 | 2097152 | (i35 & 3670016) | 16777216 | (i35 & 29360128) | ((i16 << 9) & 234881024));
            }
            c28655q.m87173q(false);
            if (str == null || !(c33321b == null || c33321b.f138998H)) {
                c33326g = state;
            } else {
                c33326g = state;
                boolean z16 = c33326g.f139008w;
                C25271y c25271y = C25271y.f99162w;
                c41210bM100064s = z16 ? AbstractC32128i.m100064s(R.string.stripe_paymentsheet_bank_payment_promo_for_payment, new Object[]{str}, c25271y) : AbstractC32128i.m100064s(R.string.stripe_paymentsheet_bank_payment_promo_for_setup, new Object[]{str}, c25271y);
            }
            c28655q.m87150e0(1872745064);
            if (c41210bM100064s != null) {
                m100447l(AbstractC35785b.m113396S(c41210bM100064s, c28655q), AbstractC1099a.m3398t(c2314t, 0.0f, 12, 0.0f, 0.0f, 13), c28655q, 48);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: t20.p
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM87244L = AbstractC28683x.m87244L(i13 | 1);
                    int iM87244L2 = AbstractC28683x.m87244L(i14);
                    AbstractC32281f.m100441f(c33326g, formArgs, z4, z13, z14, nameController, emailController, phoneController, addressController, identifierSpec, c15435v2, saveForFutureUseElement, c37912n1, modifier, z15, onRemoveAccount, (Composer) obj, iM87244L, iM87244L2);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01b2 A[PHI: r13
      0x01b2: PHI (r13v4 s20.a) = (r13v1 s20.a), (r13v5 s20.a) binds: [B:115:0x01be, B:111:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x01b4 A[PHI: r13
      0x01b4: PHI (r13v2 s20.a) = (r13v1 s20.a), (r13v5 s20.a) binds: [B:115:0x01be, B:111:0x01b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: g */
    public static final void m100442g(boolean z4, C32077a c32077a, boolean z13, boolean z14, InterfaceC15391m3 interfaceC15391m3, InterfaceC15391m3 interfaceC15391m4, C15454z1 c15454z1, C15341e c15341e, IdentifierSpec identifierSpec, C15435v2 c15435v2, Composer composer, int i13) {
        int i14;
        String strM92103Y;
        C32077a c32077a2;
        boolean z15;
        C2307m c2307m;
        C2314t c2314t;
        C0213j c0213j;
        float f13;
        boolean z16;
        IdentifierSpec identifierSpec2;
        C16689l1 c16689l1;
        C2314t c2314t2;
        int i15;
        C2307m c2307m2 = C2299e.f9103F;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-741145595);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c32077a) : c28655q.m87157i(c32077a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87155h(z14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(interfaceC15391m3) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(interfaceC15391m4) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= (2097152 & i13) == 0 ? c28655q.m87153g(c15454z1) : c28655q.m87157i(c15454z1) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= (16777216 & i13) == 0 ? c28655q.m87153g(c15341e) : c28655q.m87157i(c15341e) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i14 |= (134217728 & i13) == 0 ? c28655q.m87153g(identifierSpec) : c28655q.m87157i(identifierSpec) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((805306368 & i13) == 0) {
            i14 |= (1073741824 & i13) == 0 ? c28655q.m87153g(c15435v2) : c28655q.m87157i(c15435v2) ? 536870912 : 268435456;
        }
        int i16 = i14;
        if ((i16 & 306783379) == 306783378 && c28655q.m87121F()) {
            c28655q.m87138X();
            c32077a2 = c32077a;
        } else {
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t3), "TEST_TAG_BILLING_DETAILS");
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
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
            if (z14) {
                c28655q.m87150e0(-1178264370);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, R.string.stripe_paymentsheet_pay_with_bank_title);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1178163310);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, R.string.stripe_paymentsheet_save_bank_title);
                c28655q.m87173q(false);
            }
            AbstractC5583n.m16769b(strM92103Y, null, false, c28655q, 0, 6);
            if (z4) {
                c32077a2 = c32077a;
                if (c32077a2.f133030i.f64189w == EnumC16683k1.f64151y) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            } else {
                c32077a2 = c32077a;
                if (c32077a2.f133030i.f64189w != EnumC16683k1.f64150x) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            c28655q.m87150e0(100555793);
            if (z15) {
                Modifier modifierM3394p = AbstractC1099a.m3394p(0, AbstractC1102d.m3409f(1.0f, c2314t3));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m2, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                c2314t = c2314t3;
                c0213j = c0213j2;
                c2307m = c2307m2;
                f13 = 1.0f;
                AbstractC15376j4.m43589e(AbstractC1099a.m3398t(c2314t3, 0.0f, 16, 0.0f, 0.0f, 13), interfaceC15391m3, false, AbstractC37817c.m121344e(1091024005, c28655q, new C2654x2(interfaceC15391m3, z13)), c28655q, ((i16 >> 9) & 112) | 24582, 12);
                c28655q.m87173q(true);
            } else {
                c2307m = c2307m2;
                c2314t = c2314t3;
                c0213j = c0213j2;
                f13 = 1.0f;
            }
            boolean z17 = false;
            c28655q.m87173q(false);
            c28655q.m87150e0(100576720);
            C16689l1 c16689l2 = c32077a2.f133030i;
            if (c16689l2.f64191y != EnumC16683k1.f64150x) {
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(0, AbstractC1102d.m3409f(f13, c2314t));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                i15 = 16;
                c2314t2 = c2314t;
                z16 = z13;
                identifierSpec2 = identifierSpec;
                c16689l1 = c16689l2;
                AbstractC15376j4.m43589e(AbstractC1099a.m3398t(c2314t2, 0.0f, 16, 0.0f, 0.0f, 13), interfaceC15391m4, false, AbstractC37817c.m121344e(408850478, c28655q, new C2552j5(interfaceC15391m4, z16, identifierSpec2, 4)), c28655q, ((i16 >> 12) & 112) | 24582, 12);
                c28655q.m87173q(true);
                z17 = false;
            } else {
                z16 = z13;
                identifierSpec2 = identifierSpec;
                c16689l1 = c16689l2;
                c2314t2 = c2314t;
                i15 = 16;
            }
            c28655q.m87173q(z17);
            c28655q.m87150e0(100605134);
            if (c16689l1.f64190x == EnumC16683k1.f64151y) {
                IdentifierSpec.Companion.getClass();
                m100444i(z16, c15454z1, AbstractC22676k.m65745e(identifierSpec2, IdentifierSpec.Phone) ? 7 : 6, AbstractC1099a.m3398t(c2314t2, 0.0f, i15, 0.0f, 0.0f, 13), c28655q, ((i16 >> 6) & 14) | 3136 | ((i16 >> 15) & 112));
                c28655q = c28655q;
            }
            c28655q.m87173q(false);
            c28655q.m87150e0(100620536);
            if (c16689l1.f64192z == EnumC16677j1.f64133y) {
                int i17 = i16 >> 18;
                m100439d(z13, c15341e, identifierSpec2, c15435v2, AbstractC1099a.m3398t(c2314t2, 0.0f, i15, 0.0f, 0.0f, 13), c28655q, ((i16 >> 6) & 14) | 24640 | (i17 & 112) | (IdentifierSpec.$stable << 6) | (i17 & 896) | 4096 | (i17 & 7168));
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21090a0(z4, c32077a2, z13, z14, interfaceC15391m3, interfaceC15391m4, c15454z1, c15341e, identifierSpec, c15435v2, i13);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m100443h(Modifier modifier, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-826407987);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(interfaceC4339a) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(modifier) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            c28655q = c28655q2;
            AbstractC15018g5.m43116a(modifier, null, AbstractC37817c.m121344e(108078738, c28655q2, new C17959l0(interfaceC4339a, 2)), null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, AbstractC37837e.f162001d, c28655q, ((i14 >> 3) & 14) | 384, 12582912, 131066);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(interfaceC4339a, modifier, i13, 16);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m100444i(boolean z4, C15454z1 c15454z1, int i13, Modifier modifier, Composer composer, int i14) {
        int i15;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(745689175);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87155h(z4) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? c28655q.m87153g(c15454z1) : c28655q.m87157i(c15454z1) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87149e(i13) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87153g(modifier) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier2 = modifier;
        } else {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(c15454z1.f58059n, c28655q, 0);
            Modifier modifierM3394p = AbstractC1099a.m3394p(0, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9103F, false);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC32410a.m101045o(null, (InterfaceC15361h1) interfaceC28601c1M83597t.getValue(), modifier, false, AbstractC37817c.m121344e(-167506789, c28655q, new C33337r(i13, c15454z1, z4)), c28655q, ((i15 >> 3) & 896) | 24582, 8);
            modifier2 = modifier;
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32676t1(z4, c15454z1, i13, modifier2, i14);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m100445j(C37848p c37848p, InterfaceC4339a interfaceC4339a, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1466224530);
        int i16 = (c28655q.m87153g(c37848p) ? 4 : 2) | i13;
        if ((i13 & 48) == 0) {
            i16 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 = i16 | 384;
        } else {
            i15 = i16 | (c28655q.m87153g(modifier) ? 256 : 128);
        }
        if ((i15 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = i17 != 0 ? C2314t.f9131w : modifier;
            int iOrdinal = c37848p.f162025c.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                c28655q.m87150e0(1570430552);
                m100438c(c37848p.f162023a, interfaceC4339a, modifier3, c37848p.f162024b, c28655q, i15 & MessageListItemViewType.GIPHY);
                c28655q.m87173q(false);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw AbstractC11895b.m32003v(50655432, c28655q, false);
                }
                c28655q.m87150e0(1570430552);
                m100438c(c37848p.f162023a, interfaceC4339a, modifier3, c37848p.f162024b, c28655q, i15 & MessageListItemViewType.GIPHY);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1570689154);
                m100443h(modifier3, interfaceC4339a, c28655q, (i15 >> 3) & 126);
                c28655q.m87173q(false);
            }
            modifier2 = modifier3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(c37848p, interfaceC4339a, modifier2, i13, i14, 8);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m100446k(C37855w c37855w, Modifier modifier, Composer composer, int i13) {
        Modifier modifier2;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1574771667);
        if ((((c28655q2.m87157i(c37855w) ? 4 : 2) | i13 | 48) & 19) == 18 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            modifier2 = modifier;
            c28655q = c28655q2;
        } else {
            InterfaceC1585g0 interfaceC1585g0 = (InterfaceC1585g0) c28655q2.m87161k(AbstractC21412c.f82093a);
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(c37855w.f162054z, c28655q2, 0);
            c28655q2.m87150e0(50638743);
            boolean zM87157i = c28655q2.m87157i(c37855w) | c28655q2.m87157i(interfaceC1585g0);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C35076b(28, c37855w, interfaceC1585g0);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q2.m87173q(false);
            AbstractC28683x.m87251e(interfaceC1585g0, (Function1) objM87133R, c28655q2);
            C37848p c37848p = (C37848p) interfaceC28601c1M83597t.getValue();
            c28655q2.m87150e0(50647513);
            boolean zM87157i2 = c28655q2.m87157i(c37855w);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                C28573j c28573j = new C28573j(0, c37855w, C37855w.class, "handleCancel", "handleCancel()V", 0, 28);
                c28655q2.m87172p0(c28573j);
                objM87133R2 = c28573j;
            }
            c28655q2.m87173q(false);
            modifier2 = C2314t.f9131w;
            c28655q = c28655q2;
            m100445j(c37848p, (InterfaceC4339a) ((InterfaceC21467g) objM87133R2), AbstractC1102d.m3406c(0.67f, modifier2), c28655q, 0, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29451o(c37855w, modifier2, i13, 28);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m100447l(String str, Modifier modifier, Composer composer, int i13) {
        String str2;
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1104697245);
        int i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
            str2 = str;
            modifier2 = modifier;
        } else {
            str2 = str;
            modifier2 = modifier;
            AbstractC32069a.m99663a(str2, modifier2, 0, 0, null, c28655q, i14 & 126, 28);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21110m(str2, modifier2, i13, 2);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m100448n(C32077a formArgs, C33333n usBankAccountFormArgs, InterfaceC4339a onCompleted, Modifier modifier, boolean z4, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(formArgs, "formArgs");
        AbstractC22676k.m65750j(usBankAccountFormArgs, "usBankAccountFormArgs");
        AbstractC22676k.m65750j(onCompleted, "onCompleted");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-358694232);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(formArgs) : c28655q.m87157i(formArgs) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(usBankAccountFormArgs) : c28655q.m87157i(usBankAccountFormArgs) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onCompleted) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(modifier) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i14 & 9363) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            InterfaceC15452z interfaceC15452z = usBankAccountFormArgs.f139034m;
            c28655q.m87150e0(-163336358);
            int i15 = i14 & 112;
            boolean z13 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(formArgs))) | (i15 == 32 || ((i14 & 64) != 0 && c28655q.m87157i(usBankAccountFormArgs)));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new C32209f(13, usBankAccountFormArgs, formArgs);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            C26185t c26185t = new C26185t(interfaceC15452z, (InterfaceC4339a) objM87133R);
            c28655q.m87152f0(1729797275);
            InterfaceC1583f2 interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
            if (interfaceC1583f2M73844a == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            AbstractC1637w1 abstractC1637w1M88523c0 = AbstractC29125c.m88523c0(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33342w.class), interfaceC1583f2M73844a, null, c26185t, interfaceC1583f2M73844a instanceof InterfaceC1620r ? ((InterfaceC1620r) interfaceC1583f2M73844a).getDefaultViewModelCreationExtras() : C23418a.f92771b, c28655q);
            c28655q.m87173q(false);
            C33342w c33342w = (C33342w) abstractC1637w1M88523c0;
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(c33342w.f139125Z, c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(c33342w.f139120U, c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t3 = C27648a.m83597t(c33342w.f139118S.mo43553g(), c28655q, 0);
            C33326g c33326g = (C33326g) interfaceC28601c1M83597t.getValue();
            boolean z14 = !(c33326g.f139010y && c33326g.f139011z == null) && z4;
            AbstractC32229a.m100254a(c33342w, usBankAccountFormArgs, onCompleted, c28655q, 64 | i15 | (i14 & 896));
            C33326g c33326g2 = (C33326g) interfaceC28601c1M83597t.getValue();
            boolean z15 = usBankAccountFormArgs.f139022a;
            boolean z16 = usBankAccountFormArgs.f139028g;
            boolean z17 = usBankAccountFormArgs.f139026e;
            C15351f3 c15351f3 = c33342w.f139110K;
            C15351f3 c15351f4 = c33342w.f139112M;
            C15454z1 c15454z1 = c33342w.f139115P;
            C15341e c15341e = (C15341e) interfaceC28601c1M83597t3.getValue();
            IdentifierSpec identifierSpec = (IdentifierSpec) interfaceC28601c1M83597t2.getValue();
            C15435v2 c15435v2 = c33342w.f139117R;
            C37897i1 c37897i1 = c33342w.f139121V;
            C37912n1 c37912n1 = c33342w.f139123X;
            c28655q.m87150e0(-163247171);
            boolean zM87157i = c28655q.m87157i(c33342w);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C17934d(0, c33342w, C33342w.class, "reset", "reset(Lcom/stripe/android/core/strings/ResolvableString;)V", 0, 1);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            m100441f(c33326g2, formArgs, z15, z16, z17, c15351f3, c15351f4, c15454z1, c15341e, identifierSpec, c15435v2, c37897i1, c37912n1, modifier, z14, (InterfaceC4339a) objM87133R2, c28655q, ((i14 << 3) & 112) | 150995016 | (IdentifierSpec.$stable << 27), 584 | (i14 & 7168));
            c28655q = c28655q;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2549j2(formArgs, usBankAccountFormArgs, onCompleted, modifier, z4, i13);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m100449o(SpannableStringBuilder spannableStringBuilder, Object obj, int i13, int i14) {
        for (Object obj2 : spannableStringBuilder.getSpans(i13, i14, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i13 && spannableStringBuilder.getSpanEnd(obj2) == i14 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i13, i14, 33);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    public static boolean m100450r(InterfaceC35487q0 interfaceC35487q0, InterfaceC35457b0 interfaceC35457b0, List list) {
        if ((interfaceC35487q0 instanceof AbstractC35485p0) || (interfaceC35487q0 instanceof InterfaceC35481n0)) {
            return true;
        }
        if (!(interfaceC35487q0 instanceof InterfaceC35483o0)) {
            throw new NoWhenBranchMatchedException();
        }
        for (Object obj : list) {
            if (AbstractC22676k.m65745e(((SharedDataSpec) obj).getType(), interfaceC35457b0.getType().f167132w)) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static List m100451s(InterfaceC35487q0 interfaceC35487q0, InterfaceC35457b0 interfaceC35457b0, C35459c0 c35459c0, List list, C35479m0 c35479m0) {
        Object next;
        if (interfaceC35487q0 instanceof AbstractC35485p0) {
            return ((AbstractC35485p0) interfaceC35487q0).m112557h(c35459c0, c35479m0);
        }
        if (interfaceC35487q0 instanceof InterfaceC35481n0) {
            return ((InterfaceC35481n0) interfaceC35487q0).mo112550h(c35459c0, c35479m0);
        }
        if (!(interfaceC35487q0 instanceof InterfaceC35483o0)) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((SharedDataSpec) next).getType(), interfaceC35457b0.getType().f167132w));
        SharedDataSpec sharedDataSpec = (SharedDataSpec) next;
        if (sharedDataSpec != null) {
            return ((InterfaceC35483o0) interfaceC35487q0).mo112553j(c35459c0, sharedDataSpec, new C34249c(c35479m0, 2), c35479m0);
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static C33254a m100452t(InterfaceC35487q0 interfaceC35487q0, InterfaceC35457b0 interfaceC35457b0, C35459c0 c35459c0, List list, boolean z4) {
        Object next;
        C29810c c29810c = c35459c0.f150979V;
        if (interfaceC35487q0 instanceof AbstractC35485p0) {
            return ((AbstractC35485p0) interfaceC35487q0).mo112560l(c35459c0).m108679a(c29810c);
        }
        if (interfaceC35487q0 instanceof InterfaceC35481n0) {
            return ((InterfaceC35481n0) interfaceC35487q0).mo112548d(z4, c29810c);
        }
        if (!(interfaceC35487q0 instanceof InterfaceC35483o0)) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((SharedDataSpec) next).getType(), interfaceC35457b0.getType().f167132w));
        SharedDataSpec sharedDataSpec = (SharedDataSpec) next;
        if (sharedDataSpec != null) {
            return ((InterfaceC35483o0) interfaceC35487q0).mo112551c(c35459c0, sharedDataSpec, c29810c);
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m100453u(InterfaceC38150k interfaceC38150k) {
        return interfaceC38150k.mo122203g().f163287w;
    }

    /* JADX INFO: renamed from: v */
    public static boolean m100454v(InterfaceC38150k interfaceC38150k) {
        return interfaceC38150k.mo122203g().f163288x;
    }

    /* JADX INFO: renamed from: w */
    public static final String m100455w(InterfaceC35921f interfaceC35921f) {
        AbstractC22676k.m65750j(interfaceC35921f, "<this>");
        String simpleName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(interfaceC35921f.getClass()).getSimpleName();
        return simpleName == null ? "AnonymousCredentialsProvider" : simpleName;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX INFO: renamed from: x */
    public static ArrayList m100456x(C38059n c38059n) {
        char c3;
        ArrayList arrayList;
        boolean z4;
        Object c32279d;
        C38059n c38059n2 = c38059n;
        ArrayList arrayList2 = null;
        arrayList2 = null;
        arrayList2 = null;
        if (c38059n2.m121867t() == 0) {
            char c7 = 7;
            c38059n2.m121847G(7);
            int iM121854g = c38059n2.m121854g();
            boolean z13 = true;
            if (iM121854g == 1684433976) {
                C38059n c38059n3 = new C38059n();
                Inflater inflater = new Inflater(true);
                try {
                    if (!AbstractC38065t.m121891E(c38059n2, c38059n3, inflater)) {
                        inflater.end();
                        return null;
                    }
                    inflater.end();
                    c38059n2 = c38059n3;
                } catch (Throwable th3) {
                    inflater.end();
                    throw th3;
                }
            } else if (iM121854g == 1918990112) {
            }
            ArrayList arrayList3 = new ArrayList();
            int i13 = c38059n2.f163018b;
            int i14 = c38059n2.f163019c;
            while (i13 < i14) {
                int iM121854g2 = c38059n2.m121854g() + i13;
                if (iM121854g2 > i13 && iM121854g2 <= i14) {
                    if (c38059n2.m121854g() == 1835365224) {
                        int iM121854g3 = c38059n2.m121854g();
                        if (iM121854g3 <= 10000) {
                            float[] fArr = new float[iM121854g3];
                            for (int i15 = 0; i15 < iM121854g3; i15++) {
                                fArr[i15] = Float.intBitsToFloat(c38059n2.m121854g());
                            }
                            int iM121854g4 = c38059n2.m121854g();
                            if (iM121854g4 <= 32000) {
                                double dLog = Math.log(2.0d);
                                c3 = c7;
                                ArrayList arrayList4 = arrayList2;
                                int iCeil = (int) Math.ceil(Math.log(((double) iM121854g3) * 2.0d) / dLog);
                                z4 = z13;
                                byte[] bArr = c38059n2.f163017a;
                                int i16 = 5;
                                C24561s c24561s = new C24561s(bArr, bArr.length, 5, (byte) 0);
                                c24561s.m71640q(c38059n2.f163018b * 8);
                                float[] fArr2 = new float[iM121854g4 * 5];
                                int[] iArr = new int[5];
                                ArrayList arrayList5 = arrayList4;
                                int i17 = 0;
                                int i18 = 0;
                                while (true) {
                                    if (i17 >= iM121854g4) {
                                        c24561s.m71640q((c24561s.m71630g() + 7) & (-8));
                                        int i19 = 32;
                                        int iM71632i = c24561s.m71632i(32);
                                        C26873f[] c26873fArr = new C26873f[iM71632i];
                                        int i24 = 0;
                                        while (true) {
                                            if (i24 >= iM71632i) {
                                                c32279d = new C32279d(c26873fArr);
                                                arrayList = arrayList5;
                                                break;
                                            }
                                            int iM71632i2 = c24561s.m71632i(8);
                                            int iM71632i3 = c24561s.m71632i(8);
                                            int iM71632i4 = c24561s.m71632i(i19);
                                            if (iM71632i4 <= 128000) {
                                                C24561s c24561s2 = c24561s;
                                                int iCeil2 = (int) Math.ceil(Math.log(((double) iM121854g4) * 2.0d) / dLog);
                                                float[] fArr3 = new float[iM71632i4 * 3];
                                                float[] fArr4 = new float[iM71632i4 * 2];
                                                int i25 = 0;
                                                int i26 = 0;
                                                while (true) {
                                                    if (i25 < iM71632i4) {
                                                        int iM71632i5 = c24561s2.m71632i(iCeil2);
                                                        int i27 = iCeil2;
                                                        int i28 = ((iM71632i5 >> 1) ^ (-(iM71632i5 & 1))) + i26;
                                                        if (i28 >= 0 && i28 < iM121854g4) {
                                                            int i29 = i25 * 3;
                                                            int i34 = i28 * 5;
                                                            fArr3[i29] = fArr2[i34];
                                                            fArr3[i29 + 1] = fArr2[i34 + 1];
                                                            fArr3[i29 + 2] = fArr2[i34 + 2];
                                                            int i35 = i25 * 2;
                                                            fArr4[i35] = fArr2[i34 + 3];
                                                            fArr4[i35 + 1] = fArr2[i34 + 4];
                                                            i25++;
                                                            i26 = i28;
                                                            iCeil2 = i27;
                                                        }
                                                    } else {
                                                        c26873fArr[i24] = new C26873f(iM71632i2, fArr3, fArr4, iM71632i3, 1);
                                                        i24++;
                                                        c24561s = c24561s2;
                                                        i19 = 32;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        int i36 = 0;
                                        while (true) {
                                            if (i36 < i16) {
                                                int i37 = iArr[i36];
                                                int iM71632i6 = c24561s.m71632i(iCeil);
                                                int i38 = ((iM71632i6 >> 1) ^ (-(iM71632i6 & 1))) + i37;
                                                if (i38 < iM121854g3 && i38 >= 0) {
                                                    fArr2[i18] = fArr[i38];
                                                    iArr[i36] = i38;
                                                    i36++;
                                                    i18++;
                                                    i16 = 5;
                                                }
                                            } else {
                                                i17++;
                                                i16 = 5;
                                            }
                                        }
                                    }
                                    c32279d = arrayList5;
                                    arrayList = arrayList5;
                                    break;
                                }
                            } else {
                                c3 = c7;
                                ArrayList arrayList6 = arrayList2;
                                arrayList = arrayList6;
                                z4 = z13;
                                c32279d = arrayList6;
                            }
                        } else {
                            c3 = c7;
                            ArrayList arrayList7 = arrayList2;
                            arrayList = arrayList7;
                            z4 = z13;
                            c32279d = arrayList7;
                        }
                        if (c32279d == null) {
                            return arrayList;
                        }
                        arrayList3.add(c32279d);
                    } else {
                        c3 = c7;
                        arrayList = arrayList2;
                        z4 = z13;
                    }
                    c38059n2.m121846F(iM121854g2);
                    i13 = iM121854g2;
                    c7 = c3;
                    z13 = z4;
                    arrayList2 = arrayList;
                }
            }
            return arrayList3;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: z */
    public static C34378f m100457z(InterfaceC35487q0 interfaceC35487q0, C35459c0 c35459c0, InterfaceC35457b0 interfaceC35457b0, List list) {
        Object next;
        if (interfaceC35487q0 instanceof AbstractC35485p0) {
            return ((AbstractC35485p0) interfaceC35487q0).mo112560l(c35459c0);
        }
        if (interfaceC35487q0 instanceof InterfaceC35481n0) {
            return ((InterfaceC35481n0) interfaceC35487q0).mo112549e();
        }
        if (!(interfaceC35487q0 instanceof InterfaceC35483o0)) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((SharedDataSpec) next).getType(), interfaceC35457b0.getType().f167132w));
        SharedDataSpec sharedDataSpec = (SharedDataSpec) next;
        if (sharedDataSpec != null) {
            return ((InterfaceC35483o0) interfaceC35487q0).mo112552f(c35459c0, sharedDataSpec);
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public void mo13800p(Object obj) {
    }

    /* JADX INFO: renamed from: q */
    public abstract boolean mo13801q(Object obj);

    /* JADX INFO: renamed from: y */
    public abstract Object mo13802y();
}
