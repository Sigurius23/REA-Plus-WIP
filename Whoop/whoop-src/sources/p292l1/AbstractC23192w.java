package p292l1;

import a00.C0073h;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2483b0;
import b30.C2577m6;
import bm2.C3424a0;
import bm2.C3466p;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import i93.C18284j;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import js2.C21927e;
import ku2.C22837a;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p164g2.C15247s;
import p209i3.AbstractC18032n;
import p279kd.C22379f;
import p291l0.C22976l1;
import p316m1.AbstractC24899e0;
import p316m1.AbstractC24917o;
import p316m1.C24922t;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p412q3.C29891y;
import p510u0.C34351r0;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p634y1.AbstractC39038k;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import va3.AbstractC35849g;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39406j;
import yb3.C39410n;

/* JADX INFO: renamed from: l1.w */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23192w {

    /* JADX INFO: renamed from: a */
    public static final C22976l1 f91750a;

    /* JADX INFO: renamed from: b */
    public static final float f91751b = 16;

    static {
        float f13 = 24;
        f91750a = AbstractC1099a.m3381c(f13, 10, f13, 0.0f, 8);
    }

    /* JADX INFO: renamed from: a */
    public static final void m67147a(Long l7, Function1 function1, AbstractC24917o abstractC24917o, C18284j c18284j, C23085e0 c23085e0, InterfaceC23142n3 interfaceC23142n3, C23204y c23204y, C15247s c15247s, Composer composer, int i13) {
        boolean z4;
        C24922t c24922t;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-432341251);
        int i14 = i13 | (c28655q.m87153g(l7) ? 4 : 2) | (c28655q.m87157i(function1) ? 32 : 16) | (c28655q.m87157i(abstractC24917o) ? 256 : 128) | (c28655q.m87157i(c18284j) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q.m87153g(c23085e0) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK) | (c28655q.m87153g(interfaceC23142n3) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) | (c28655q.m87153g(c23204y) ? 1048576 : 524288) | (c28655q.m87153g(c15247s) ? 8388608 : 4194304);
        if (c28655q.m87135U(i14 & 1, (4793491 & i14) != 4793490)) {
            boolean zM87153g = c28655q.m87153g(abstractC24917o.f97593a);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                Locale locale = abstractC24917o.f97593a;
                String input = DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale);
                Pattern patternCompile = Pattern.compile("[^dMy/\\-.]");
                AbstractC22676k.m65749i(patternCompile, "compile(...)");
                AbstractC22676k.m65750j(input, "input");
                String strReplaceAll = patternCompile.matcher(input).replaceAll("");
                AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
                Pattern patternCompile2 = Pattern.compile("d{1,2}");
                AbstractC22676k.m65749i(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("dd");
                AbstractC22676k.m65749i(strReplaceAll2, "replaceAll(...)");
                Pattern patternCompile3 = Pattern.compile("M{1,2}");
                AbstractC22676k.m65749i(patternCompile3, "compile(...)");
                String strReplaceAll3 = patternCompile3.matcher(strReplaceAll2).replaceAll("MM");
                AbstractC22676k.m65749i(strReplaceAll3, "replaceAll(...)");
                Pattern patternCompile4 = Pattern.compile("y{1,4}");
                AbstractC22676k.m65749i(patternCompile4, "compile(...)");
                String strReplaceAll4 = patternCompile4.matcher(strReplaceAll3).replaceAll("yyyy");
                AbstractC22676k.m65749i(strReplaceAll4, "replaceAll(...)");
                z4 = false;
                String strM125900s0 = AbstractC39414r.m125900s0(AbstractC39421y.m125926K(strReplaceAll4, "My", "M/y", false), ".");
                Pattern patternCompile5 = Pattern.compile("[/\\-.]");
                AbstractC22676k.m65749i(patternCompile5, "compile(...)");
                Matcher matcher = patternCompile5.matcher(strM125900s0);
                AbstractC22676k.m65749i(matcher, "matcher(...)");
                C39410n c39410nM113800b = AbstractC35849g.m113800b(matcher, 0, strM125900s0);
                AbstractC22676k.m65747g(c39410nM113800b);
                C39406j c39406jM125842c = c39410nM113800b.f169585c.m125842c(0);
                AbstractC22676k.m65747g(c39406jM125842c);
                objM87133R = new C24922t(strM125900s0, c39406jM125842c.f169579a.charAt(0));
                c28655q.m87172p0(objM87133R);
            } else {
                z4 = false;
            }
            C24922t c24922t2 = (C24922t) objM87133R;
            String strM73002i = AbstractC24899e0.m73002i(c28655q, R.string.m3c_date_input_invalid_for_pattern);
            String strM73002i2 = AbstractC24899e0.m73002i(c28655q, R.string.m3c_date_input_invalid_year_range);
            String strM73002i3 = AbstractC24899e0.m73002i(c28655q, R.string.m3c_date_input_invalid_not_allowed);
            boolean zM87153g2 = c28655q.m87153g(c24922t2) | ((57344 & i14) != 16384 ? z4 : true);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                c24922t = c24922t2;
                C23198x c23198x = new C23198x(c18284j, interfaceC23142n3, c24922t, c23085e0, strM73002i, strM73002i2, strM73002i3);
                c28655q.m87172p0(c23198x);
                objM87133R2 = c23198x;
            } else {
                c24922t = c24922t2;
            }
            C23198x c23198x2 = (C23198x) objM87133R2;
            String upperCase = c24922t.f97605a.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            String strM73002i4 = AbstractC24899e0.m73002i(c28655q, R.string.m3c_date_input_label);
            Modifier modifierM3393o = AbstractC1099a.m3393o(f91750a, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            c23198x2.getClass();
            int i15 = i14 << 3;
            m67148b(modifierM3393o, l7, function1, abstractC24917o, AbstractC37817c.m121344e(-752164549, c28655q, new C2577m6(strM73002i4, upperCase, 1)), AbstractC37817c.m121344e(-1179434278, c28655q, new C2483b0(upperCase, 4)), c23198x2, c24922t, abstractC24917o.f97593a, c23204y, c15247s, c28655q, (i15 & 112) | 1794054 | (i15 & 896) | (i15 & 7168), (i14 >> 18) & 126);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3466p(l7, function1, abstractC24917o, c18284j, c23085e0, interfaceC23142n3, c23204y, c15247s, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m67148b(final Modifier modifier, Long l7, final Function1 function1, final AbstractC24917o abstractC24917o, final C37816b c37816b, final C37816b c37816b2, final C23198x c23198x, final C24922t c24922t, final Locale locale, C23204y c23204y, final C15247s c15247s, Composer composer, final int i13, final int i14) {
        int i15;
        int i16;
        C28655q c28655q;
        int i17;
        int i18;
        InterfaceC28601c1 interfaceC28601c1;
        Object c3424a0;
        C24922t c24922t2;
        InterfaceC28601c1 interfaceC28601c2;
        final Long l12 = l7;
        AbstractC24917o abstractC24917o2 = abstractC24917o;
        Locale locale2 = locale;
        C23204y c23204y2 = c23204y;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1456309913);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(l12) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(function1) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87157i(abstractC24917o2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87157i(c37816b) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i15 |= c28655q2.m87157i(c37816b2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((i13 & 1572864) == 0) {
            i15 |= c28655q2.m87149e(0) ? 1048576 : 524288;
        }
        if ((i13 & 12582912) == 0) {
            i15 |= c28655q2.m87153g(c23198x) ? 8388608 : 4194304;
        }
        if ((i13 & 100663296) == 0) {
            i15 |= c28655q2.m87153g(c24922t) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((i13 & 805306368) == 0) {
            i15 |= c28655q2.m87157i(locale2) ? 536870912 : 268435456;
        }
        if ((i14 & 6) == 0) {
            i16 = i14 | (c28655q2.m87153g(c23204y2) ? 4 : 2);
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q2.m87153g(c15247s) ? 32 : 16;
        }
        int i19 = i16;
        if (c28655q2.m87135U(i15 & 1, ((i15 & 306783379) == 306783378 && (i19 & 19) == 18) ? false : true)) {
            Object[] objArr = new Object[0];
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C22837a(29);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1M124460f = AbstractC39038k.m124460f(objArr, (InterfaceC4339a) objM87133R, c28655q2);
            Object[] objArr2 = {(C29891y) interfaceC28601c1M124460f.getValue()};
            int i24 = i15 & 29360128;
            boolean zM87153g = c28655q2.m87153g(interfaceC28601c1M124460f) | (i24 == 8388608) | c28655q2.m87157i(abstractC24917o2);
            int i25 = i15 & 234881024;
            boolean zM87157i = zM87153g | (i25 == 67108864) | c28655q2.m87157i(locale2);
            int i26 = i15 & 3670016;
            boolean z4 = zM87157i | (i26 == 1048576);
            Object objM87133R2 = c28655q2.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                i17 = i26;
                i18 = 8388608;
                objM87133R2 = new C0073h(c23198x, abstractC24917o2, c24922t, locale2, interfaceC28601c1M124460f, 12);
                abstractC24917o2 = abstractC24917o2;
                interfaceC28601c1 = interfaceC28601c1M124460f;
                c28655q2.m87172p0(objM87133R2);
            } else {
                i17 = i26;
                interfaceC28601c1 = interfaceC28601c1M124460f;
                i18 = 8388608;
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R2, c28655q2, 0);
            boolean zM125890i0 = AbstractC39414r.m125890i0((CharSequence) interfaceC28601c3.getValue());
            float f13 = f91751b;
            if (!zM125890i0) {
                C22976l1 c22976l1M67087d = C23107h4.m67087d();
                f13 -= c22976l1M67087d.f90649d + c22976l1M67087d.f90647b;
            }
            float f14 = f13;
            C29891y c29891y = (C29891y) interfaceC28601c1.getValue();
            boolean zM87153g2 = ((i15 & 896) == 256) | (r23 == 67108864) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(interfaceC28601c3) | c28655q2.m87157i(abstractC24917o2) | c28655q2.m87157i(locale2) | (i24 == i18) | (i17 == 1048576);
            Object objM87133R3 = c28655q2.m87133R();
            if (zM87153g2 || objM87133R3 == c28676v0) {
                InterfaceC28601c1 interfaceC28601c4 = interfaceC28601c1;
                AbstractC24917o abstractC24917o3 = abstractC24917o2;
                c3424a0 = new C3424a0(c24922t, interfaceC28601c3, function1, abstractC24917o3, locale2, c23198x, interfaceC28601c4);
                c24922t2 = c24922t;
                abstractC24917o2 = abstractC24917o3;
                locale2 = locale2;
                interfaceC28601c2 = interfaceC28601c3;
                interfaceC28601c1 = interfaceC28601c4;
                c28655q2.m87172p0(c3424a0);
            } else {
                c3424a0 = objM87133R3;
                c24922t2 = c24922t;
                interfaceC28601c2 = interfaceC28601c3;
            }
            Function1 function2 = (Function1) c3424a0;
            Modifier modifierM3398t = AbstractC1099a.m3398t(modifier, 0.0f, 0.0f, 0.0f, f14, 7);
            boolean zM87153g3 = c28655q2.m87153g(interfaceC28601c2);
            Object objM87133R4 = c28655q2.m87133R();
            if (zM87153g3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C21927e(2, interfaceC28601c2);
                c28655q2.m87172p0(objM87133R4);
            }
            Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3398t, false, (Function1) objM87133R4);
            Modifier modifierM3483b = C2314t.f9131w;
            if (c15247s != null) {
                modifierM3483b = AbstractC1126a.m3483b(modifierM3483b, c15247s);
            }
            c23204y2 = c23204y;
            AbstractC23076c3.m67046b(c29891y, function2, modifierM51775c.mo3471e(modifierM3483b), false, null, c37816b, c37816b2, AbstractC37817c.m121344e(-357881838, c28655q2, new C23180u(0, interfaceC28601c2)), !AbstractC39414r.m125890i0((CharSequence) interfaceC28601c2.getValue()), new C23110i1(c24922t2), new C34351r0(0, 3, 7, 113), null, true, 0, 0, null, c23204y2.f91851y, c28655q2, (i15 << 6) & 33030144);
            c28655q = c28655q2;
            boolean z13 = (i19 & 112) == 32;
            Object objM87133R5 = c28655q.m87133R();
            if (z13 || objM87133R5 == c28676v0) {
                objM87133R5 = new C22379f(c15247s, (InterfaceC30057d) null, 1);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, C23454a0.f92919a);
            boolean zM87157i2 = c28655q.m87157i(abstractC24917o2) | ((i15 & 112) == 32) | (i25 == 67108864) | c28655q.m87157i(locale2) | c28655q.m87153g(interfaceC28601c1);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i2 || objM87133R6 == c28676v0) {
                C23186v c23186v = new C23186v(l7, abstractC24917o2, c24922t, locale2, interfaceC28601c1, (InterfaceC30057d) null);
                l12 = l7;
                c28655q.m87172p0(c23186v);
                objM87133R6 = c23186v;
            } else {
                l12 = l7;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, l12);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final C23204y c23204y3 = c23204y2;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: l1.t
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC23192w.m67148b(modifier, l12, function1, abstractC24917o, c37816b, c37816b2, c23198x, c24922t, locale, c23204y3, c15247s, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14));
                    return C23454a0.f92919a;
                }
            };
        }
    }
}
