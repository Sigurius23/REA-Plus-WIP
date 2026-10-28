package p316m1;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import androidx.compose.material3.internal.ChildSemanticsNodeElement;
import androidx.compose.material3.internal.ParentSemanticsNodeElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.p018ui.input.key.AbstractC1128a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.C1774d;
import b30.C2647w2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import d30.C11547l0;
import ih0.AbstractC18489d0;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import js2.C21930h;
import kx1.C22881b;
import l72.C23407n;
import lc0.C23821c;
import lf0.C23956p1;
import live.hms.video.utils.AndroidSDKConstants;
import lq0.C24656d;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p043c4.AbstractC3975r;
import p043c4.C3966j0;
import p043c4.InterfaceC3964i0;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p292l1.AbstractC23149o4;
import p292l1.AbstractC23168s;
import p292l1.C23203x4;
import p294l3.C23285v0;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p512u2.AbstractC34452c0;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39072a0;
import p635y2.InterfaceC39124q0;
import p635y2.InterfaceC39127r0;
import p710im1.C18656a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: m1.e0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC24899e0 {

    /* JADX INFO: renamed from: a */
    public static final StackTraceElement[] f97529a = new StackTraceElement[0];

    /* JADX INFO: renamed from: b */
    public static C27430e f97530b;

    /* JADX INFO: renamed from: c */
    public static C27430e f97531c;

    /* JADX INFO: renamed from: d */
    public static C27430e f97532d;

    /* JADX INFO: renamed from: e */
    public static C27430e f97533e;

    /* JADX INFO: renamed from: f */
    public static C27430e f97534f;

    /* JADX INFO: renamed from: a */
    public static final void m72994a(InterfaceC3964i0 interfaceC3964i0, C37816b c37816b, C23203x4 c23203x4, C37816b c37816b2, Composer composer, int i13) {
        InterfaceC3964i0 interfaceC3964i1;
        int i14;
        InterfaceC28601c1 interfaceC28601c1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1221877520);
        if ((i13 & 6) == 0) {
            interfaceC3964i1 = interfaceC3964i0;
            i14 = (c28655q.m87153g(interfaceC3964i1) ? 4 : 2) | i13;
        } else {
            interfaceC3964i1 = interfaceC3964i0;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(c23203x4) : c28655q.m87157i(c23203x4) ? 256 : 128;
        }
        int i15 = i13 & 3072;
        C2314t c2314t = C2314t.f9131w;
        if (i15 == 0) {
            i14 |= c28655q.m87153g(c2314t) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(null) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        boolean z4 = false;
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i14 |= c28655q.m87155h(false) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87155h(true) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i14 |= c28655q.m87155h(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i14 |= c28655q.m87157i(c37816b2) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        int i16 = i14;
        if (c28655q.m87135U(i16 & 1, (38347923 & i16) != 38347922)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            if (c23203x4.m67160b()) {
                c28655q.m87150e0(-1891243071);
                interfaceC28601c1 = interfaceC28601c2;
                m72996c(interfaceC3964i1, c23203x4, interfaceC2994c0, false, interfaceC28601c1, c37816b, c28655q, (i16 & 14) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i16 >> 3) & 112) | ((i16 >> 6) & 896) | ((i16 << 15) & 3670016));
                c28655q.m87173q(false);
            } else {
                interfaceC28601c1 = interfaceC28601c2;
                c28655q.m87150e0(-1890863476);
                c28655q.m87173q(false);
            }
            m72997d(c23203x4, interfaceC28601c1, c37816b2, c28655q, ((i16 >> 18) & 14) | 384 | ((i16 >> 3) & 112) | ((i16 >> 12) & 7168) | (57344 & (i16 << 3)) | ((i16 >> 9) & 458752));
            c28655q.m87173q(true);
            if ((i16 & 896) == 256 || ((i16 & 512) != 0 && c28655q.m87157i(c23203x4))) {
                z4 = true;
            }
            Object objM87133R3 = c28655q.m87133R();
            if (z4 || objM87133R3 == c28676v0) {
                objM87133R3 = new C23821c(c23203x4, 8);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87251e(c23203x4, (Function1) objM87133R3, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23956p1(interfaceC3964i0, c37816b, c23203x4, c37816b2, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m72995b(long j7, C23285v0 c23285v0, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-684938728);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87151f(j7) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(c23285v0) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C28596b0 c28596b0 = AbstractC23149o4.f91555a;
            AbstractC28683x.m87248b(new C28673u1[]{AbstractC23168s.f91626a.mo86977a(new C17919x(j7)), c28596b0.mo86977a(((C23285v0) c28655q.m87161k(c28596b0)).m67368e(c23285v0))}, interfaceC4351m, c28655q, ((i14 >> 3) & 112) | 8);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24901f0(j7, c23285v0, interfaceC4351m, i13, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m72996c(InterfaceC3964i0 interfaceC3964i0, C23203x4 c23203x4, InterfaceC2994c0 interfaceC2994c0, boolean z4, InterfaceC28601c1 interfaceC28601c1, C37816b c37816b, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1413720282);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC3964i0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c23203x4) : c28655q.m87157i(c23203x4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(null) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(interfaceC2994c0) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87153g(interfaceC28601c1) ? 131072 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 1048576 : 524288;
        }
        if (c28655q.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, R.string.tooltip_description);
            boolean zM87157i = ((i14 & 112) == 32 || ((i14 & 64) != 0 && c28655q.m87157i(c23203x4))) | ((i14 & 896) == 256) | c28655q.m87157i(interfaceC2994c0) | ((458752 & i14) == 131072);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C18656a0(c23203x4, interfaceC2994c0, interfaceC28601c1, 25);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC3975r.m12004a(interfaceC3964i0, (InterfaceC4339a) objM87133R, new C3966j0(z4, 14), AbstractC37817c.m121344e(-1287705660, c28655q, new C2647w2(22, strM92103Y, c37816b)), c28655q, (i14 & 14) | 3072, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11547l0(interfaceC3964i0, c23203x4, interfaceC2994c0, z4, interfaceC28601c1, c37816b, i13, 3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m72997d(C23203x4 c23203x4, InterfaceC28601c1 interfaceC28601c1, C37816b c37816b, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1873232064);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(true) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c23203x4) : c28655q.m87157i(c23203x4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(interfaceC28601c1) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87155h(false) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i15 = i13 & 24576;
        C2314t c2314t = C2314t.f9131w;
        if (i15 == 0) {
            i14 |= c28655q.m87153g(c2314t) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            Modifier modifierM3494b = AbstractC1128a.m3494b(AbstractC1126a.m3484c(AbstractC34452c0.m108903b(AbstractC34452c0.m108903b(c2314t, c23203x4, new C24914m(c23203x4, 0)), c23203x4, new C24914m(c23203x4, 1)).mo3471e(new ParentSemanticsNodeElement(new C21930h(AbstractC30060g.m92103Y(c28655q, R.string.tooltip_label), interfaceC2994c0, c23203x4, 14))), new C24656d(5, interfaceC2994c0, c23203x4)), new C1774d(4, c23203x4, interfaceC28601c1));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3494b);
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
            AbstractC18489d0.m53384y((i14 >> 15) & 14, c37816b, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n(c23203x4, interfaceC28601c1, c37816b, i13);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Modifier m72998e(Modifier modifier) {
        return modifier.mo3471e(new ChildSemanticsNodeElement(new C22881b(9)));
    }

    /* JADX INFO: renamed from: f */
    public static final String m72999f(long j7, String str, Locale locale, LinkedHashMap linkedHashMap) {
        String str2 = "S:" + str + locale.toLanguageTag();
        Object obj = linkedHashMap.get(str2);
        Object obj2 = obj;
        if (obj == null) {
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
            linkedHashMap.put(str2, instanceForSkeleton);
            obj2 = instanceForSkeleton;
        }
        return ((DateFormat) obj2).format(new Date(j7));
    }

    /* JADX INFO: renamed from: g */
    public static DateTimeFormatter m73000g(String str, Locale locale, Map map) {
        String str2 = "P:" + str + locale.toLanguageTag();
        Object objWithDecimalStyle = map.get(str2);
        if (objWithDecimalStyle == null) {
            objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
            map.put(str2, objWithDecimalStyle);
        }
        AbstractC22676k.m65748h(objWithDecimalStyle, "null cannot be cast to non-null type java.time.format.DateTimeFormatter");
        return (DateTimeFormatter) objWithDecimalStyle;
    }

    /* JADX INFO: renamed from: h */
    public static final Object m73001h(InterfaceC39124q0 interfaceC39124q0) {
        Object objMo454p = interfaceC39124q0.mo454p();
        InterfaceC39072a0 interfaceC39072a0 = objMo454p instanceof InterfaceC39072a0 ? (InterfaceC39072a0) objMo454p : null;
        if (interfaceC39072a0 != null) {
            return interfaceC39072a0.mo35475T();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final String m73002i(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a);
        return ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getResources().getString(i13);
    }

    /* JADX INFO: renamed from: j */
    public static final int m73003j(int i13, int i14) {
        if (i13 == Integer.MAX_VALUE) {
            return i13;
        }
        int i15 = i13 - i14;
        if (i15 < 0) {
            return 0;
        }
        return i15;
    }
}
