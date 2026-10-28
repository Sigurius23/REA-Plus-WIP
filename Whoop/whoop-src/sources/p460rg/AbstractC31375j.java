package p460rg;

import android.graphics.PorterDuff;
import android.net.ConnectivityManager;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import aws.sdk.kotlin.runtime.auth.credentials.InvalidJsonCredentialsException;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import b23.C2343i;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import com.whoop.android.R;
import d40.AbstractC11673r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import live.hms.video.error.ErrorCodes;
import m83.AbstractC25260n;
import m83.C25271y;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p108e4.AbstractC12682p;
import p163g1.C15069l3;
import p194hg.C17248i;
import p194hg.C17249j;
import p194hg.C17251l;
import p194hg.InterfaceC17242c;
import p194hg.InterfaceC17243d;
import p251jg.C21649b;
import p251jg.C21652e;
import p390p1.C28655q;
import p390p1.C28677v1;
import p463rj.AbstractC31479j;
import p499t9.C33647p;
import p530up.AbstractC35148d;
import p579wc.C37118t;
import p579wc.C37120u;
import p619xl.C38445a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pf.AbstractC29125c;
import pp2.C29451o;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import ud3.C34807d0;
import ud3.C34810e0;
import ud3.C34839s;
import ug.C34913b;
import wd3.AbstractC37171e;
import wd3.AbstractC37172f;
import wd3.AbstractC37174h;
import x30.C37883e;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39412p;

/* JADX INFO: renamed from: rg.j */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC31375j {
    /* JADX INFO: renamed from: a */
    public static final void m96485a(C37883e element, Modifier modifier, Composer composer, int i13) {
        AbstractC22676k.m65750j(element, "element");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1258453288);
        int i14 = (c28655q.m87157i(element) ? 4 : 2) | i13 | (c28655q.m87153g(modifier) ? 32 : 16);
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            AbstractC35148d.m111173d(AbstractC30060g.m92102X(R.string.stripe_au_becs_mandate, new Object[]{element.f162206b}, c28655q), modifier, null, AbstractC11673r.m31082k(c28655q).f37672e, C15069l3.m43149c(c28655q).f56283j, false, null, 0, null, c28655q, i14 & 112, 484);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29451o(element, modifier, i13, 29);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m96486b(int i13, int i14) {
        String strM96936o;
        if (i13 < 0 || i13 >= i14) {
            if (i13 < 0) {
                strM96936o = AbstractC31479j.m96936o("%s (%s) must not be negative", "index", Integer.valueOf(i13));
            } else {
                if (i14 < 0) {
                    throw new IllegalArgumentException(AbstractC2875y.m8295h(i14, "negative size: "));
                }
                strM96936o = AbstractC31479j.m96936o("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i13), Integer.valueOf(i14));
            }
            throw new IndexOutOfBoundsException(strM96936o);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m96487c(ConnectivityManager connectivityManager, Function1 function1) {
        try {
            function1.invoke(connectivityManager);
        } catch (SecurityException e5) {
            C2343i c2343i = C2343i.f9269a;
            InterfaceC2339e interfaceC2339e = C2343i.f9272d;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            if (interfaceC2339e.isLoggable(enumC2341g, "ConnectivityManager")) {
                C2343i.f9271c.log(enumC2341g, "ConnectivityManager", AbstractC11266d.m30461o("SecurityException occurred. This is a known bug on Android 11. We log and prevent the app from crashing. Cause: ", e5.getMessage()), e5);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m96488d(int i13, int i14, int i15) {
        String strM96489e;
        if (i13 < 0 || i14 < i13 || i14 > i15) {
            if (i13 < 0 || i13 > i15) {
                strM96489e = m96489e(i13, i15, "start index");
            } else {
                strM96489e = (i14 < 0 || i14 > i15) ? m96489e(i14, i15, "end index") : AbstractC31479j.m96936o("end index (%s) must not be less than start index (%s)", Integer.valueOf(i14), Integer.valueOf(i13));
            }
            throw new IndexOutOfBoundsException(strM96489e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m96489e(int i13, int i14, String str) {
        if (i13 < 0) {
            return AbstractC31479j.m96936o("%s (%s) must not be negative", str, Integer.valueOf(i13));
        }
        if (i14 >= 0) {
            return AbstractC31479j.m96936o("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i13), Integer.valueOf(i14));
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(i14, "negative size: "));
    }

    /* JADX INFO: renamed from: f */
    public static int m96490f(int i13, String str, int i14, boolean z4) {
        while (i13 < i14) {
            char cCharAt = str.charAt(i13);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z4)) {
                return i13;
            }
            i13++;
        }
        return i14;
    }

    /* JADX INFO: renamed from: g */
    public static final AbstractC31479j m96491g(C21649b c21649b) {
        String lowerCase;
        C17251l c17251l = C17251l.f66278i;
        C17248i c17248i = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("Code")}), 0);
        C17248i c17248i2 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AccessKeyId")}), 0);
        C17248i c17248i3 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("SecretAccessKey")}), 0);
        C17248i c17248i4 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("Token")}), 0);
        C17248i c17248i5 = new C17248i(C17251l.f66280k, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("Expiration")}), 0);
        C17248i c17248i6 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("AccountId")}), 0);
        C17248i c17248i7 = new C17248i(c17251l, AbstractC25260n.m74059b1(new InterfaceC17243d[]{new C21652e("Message")}), 0);
        C38445a c38445a = new C38445a(13);
        c38445a.m123180p(c17248i);
        c38445a.m123180p(c17248i2);
        c38445a.m123180p(c17248i3);
        c38445a.m123180p(c17248i4);
        c38445a.m123180p(c17248i5);
        c38445a.m123180p(c17248i6);
        c38445a.m123180p(c17248i7);
        try {
            InterfaceC17242c interfaceC17242cM60916d = c21649b.m60916d(new C17249j(c38445a));
            String strMo45166o = null;
            String strMo45166o2 = null;
            String strMo45166o3 = null;
            String strMo45166o4 = null;
            String strMo45166o5 = null;
            C34913b c34913bM106272p = null;
            String strMo45166o6 = null;
            while (true) {
                Integer numMo45167q = interfaceC17242cM60916d.mo45167q();
                int i13 = c17248i.f66267b;
                if (numMo45167q == null || numMo45167q.intValue() != i13) {
                    int i14 = c17248i2.f66267b;
                    if (numMo45167q == null || numMo45167q.intValue() != i14) {
                        int i15 = c17248i3.f66267b;
                        if (numMo45167q == null || numMo45167q.intValue() != i15) {
                            int i16 = c17248i4.f66267b;
                            if (numMo45167q == null || numMo45167q.intValue() != i16) {
                                int i17 = c17248i5.f66267b;
                                if (numMo45167q == null || numMo45167q.intValue() != i17) {
                                    int i18 = c17248i6.f66267b;
                                    if (numMo45167q == null || numMo45167q.intValue() != i18) {
                                        int i19 = c17248i7.f66267b;
                                        if (numMo45167q == null || numMo45167q.intValue() != i19) {
                                            if (numMo45167q == null) {
                                                break;
                                            }
                                            interfaceC17242cM60916d.skipValue();
                                        } else {
                                            strMo45166o2 = interfaceC17242cM60916d.mo45166o();
                                        }
                                    } else {
                                        strMo45166o6 = interfaceC17242cM60916d.mo45166o();
                                    }
                                } else {
                                    C33647p c33647p = C34913b.f147015x;
                                    c34913bM106272p = C33647p.m106272p(interfaceC17242cM60916d.mo45166o());
                                }
                            } else {
                                strMo45166o5 = interfaceC17242cM60916d.mo45166o();
                            }
                        } else {
                            strMo45166o4 = interfaceC17242cM60916d.mo45166o();
                        }
                    } else {
                        strMo45166o3 = interfaceC17242cM60916d.mo45166o();
                    }
                } else {
                    strMo45166o = interfaceC17242cM60916d.mo45166o();
                }
            }
            if (strMo45166o != null) {
                lowerCase = strMo45166o.toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (!AbstractC22676k.m65745e(lowerCase, "success") && lowerCase != null) {
                return new C37118t(strMo45166o, strMo45166o2);
            }
            if (strMo45166o3 == null) {
                throw new InvalidJsonCredentialsException("missing field `AccessKeyId`", 0);
            }
            if (strMo45166o4 == null) {
                throw new InvalidJsonCredentialsException("missing field `SecretAccessKey`", 0);
            }
            if (strMo45166o5 == null) {
                throw new InvalidJsonCredentialsException("missing field `Token`", 0);
            }
            if (c34913bM106272p != null) {
                return new C37120u(strMo45166o3, strMo45166o4, strMo45166o5, c34913bM106272p, strMo45166o6);
            }
            throw new InvalidJsonCredentialsException("missing field `Expiration`", 0);
        } catch (DeserializationException e5) {
            throw new InvalidJsonCredentialsException("invalid JSON credentials response", e5);
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m96492h(String str, String str2) {
        char c3;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i13 = 0; i13 < length; i13++) {
                char cCharAt = str.charAt(i13);
                char cCharAt2 = str2.charAt(i13);
                if (cCharAt == cCharAt2 || ((c3 = (char) ((cCharAt | ' ') - 97)) < 26 && c3 == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static PorterDuff.Mode m96493i(int i13) {
        if (i13 == 0) {
            return null;
        }
        switch (AbstractC12682p.m35485e(i13)) {
            case 0:
                return PorterDuff.Mode.CLEAR;
            case 1:
                return PorterDuff.Mode.SRC;
            case 2:
                return PorterDuff.Mode.DST;
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 4:
                return PorterDuff.Mode.DST_OVER;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 6:
                return PorterDuff.Mode.DST_IN;
            case 7:
                return PorterDuff.Mode.SRC_OUT;
            case 8:
                return PorterDuff.Mode.DST_OUT;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 10:
                return PorterDuff.Mode.DST_ATOP;
            case 11:
                return PorterDuff.Mode.XOR;
            case 12:
                return PorterDuff.Mode.ADD;
            case 13:
                return PorterDuff.Mode.MULTIPLY;
            case 14:
                return PorterDuff.Mode.SCREEN;
            case 15:
                return PorterDuff.Mode.OVERLAY;
            case 16:
                return PorterDuff.Mode.DARKEN;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return PorterDuff.Mode.LIGHTEN;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m96494j(int i13) {
        switch (i13) {
            case 258:
                return "INVALID STATE";
            case 259:
                return "NOT SUPPORTED";
            case 260:
                return "DATA SIZE EXCEEDS LIMIT";
            case 261:
                return "INVALID CRC ERROR";
            case 262:
                return "OPERATION FAILED";
            default:
                return AbstractC2875y.m8296i(i13, "UNKNOWN (", ")");
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005d A[PHI: r5
      0x005d: PHI (r5v2 int) = (r5v1 int), (r5v1 int), (r5v1 int), (r5v1 int), (r5v7 int) binds: [B:5:0x003b, B:8:0x0046, B:11:0x004e, B:14:0x005b, B:97:0x01bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static List m96495k(C34810e0 url, C34807d0 headers) {
        List listUnmodifiableList;
        C34839s c34839s;
        long j7;
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(headers, "headers");
        List listM109868j = headers.m109868j("Set-Cookie");
        int size = listM109868j.size();
        int i13 = 0;
        ArrayList arrayList = null;
        for (int i14 = 0; i14 < size; i14++) {
            String setCookie = (String) listM109868j.get(i14);
            AbstractC22676k.m65750j(setCookie, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            char c3 = ';';
            int iM119122g = AbstractC37172f.m119122g(setCookie, ';', i13, i13, 6);
            char c7 = '=';
            int iM119122g2 = AbstractC37172f.m119122g(setCookie, '=', i13, iM119122g, 2);
            if (iM119122g2 == iM119122g) {
                c34839s = null;
                break;
            }
            String strM119133r = AbstractC37172f.m119133r(i13, iM119122g2, setCookie);
            if (strM119133r.length() == 0 || AbstractC37172f.m119124i(strM119133r) != -1) {
                c34839s = null;
                break;
            }
            String strM119133r2 = AbstractC37172f.m119133r(iM119122g2 + 1, iM119122g, setCookie);
            if (AbstractC37172f.m119124i(strM119133r2) != -1) {
                c34839s = null;
                break;
            }
            int i15 = iM119122g + 1;
            int length = setCookie.length();
            int i16 = i13;
            int i17 = i16;
            int i18 = i17;
            long j13 = -1;
            long jM96496l = 253402300799999L;
            String str = null;
            String str2 = null;
            boolean z4 = true;
            String str3 = null;
            while (true) {
                if (i15 >= length) {
                    if (j13 == Long.MIN_VALUE) {
                        j7 = Long.MIN_VALUE;
                    } else if (j13 != -1) {
                        long j14 = jCurrentTimeMillis + (j13 <= 9223372036854775L ? j13 * ((long) 1000) : Long.MAX_VALUE);
                        j7 = (j14 < jCurrentTimeMillis || j14 > 253402300799999L) ? 253402300799999L : j14;
                    } else {
                        j7 = jM96496l;
                    }
                    String str4 = url.f146565d;
                    if (str2 == null) {
                        str2 = str4;
                    } else if (!AbstractC22676k.m65745e(str4, str2)) {
                        if (AbstractC39421y.m125920E(str4, str2, false) && str4.charAt((str4.length() - str2.length()) - 1) == '.') {
                            C39412p c39412p = AbstractC37171e.f158957a;
                            if (!AbstractC37171e.f158957a.m125851e(str4)) {
                            }
                        }
                        i13 = 0;
                        c34839s = null;
                        break;
                    }
                    if (str4.length() != str2.length() && PublicSuffixDatabase.f112935d.m84472a(str2) == null) {
                        i13 = 0;
                        c34839s = null;
                        break;
                    }
                    String strSubstring = "/";
                    i13 = 0;
                    if (str == null || !AbstractC39421y.m125930O(str, "/", false)) {
                        String strM109873b = url.m109873b();
                        int iM125892k0 = AbstractC39414r.m125892k0(strM109873b, '/', 0, 6);
                        if (iM125892k0 != 0) {
                            strSubstring = strM109873b.substring(0, iM125892k0);
                            AbstractC22676k.m65749i(strSubstring, "substring(...)");
                        }
                        str = strSubstring;
                    }
                    c34839s = new C34839s(strM119133r, strM119133r2, j7, str2, str, i18, i16, i17, z4, str3);
                    break;
                }
                int iM119120e = AbstractC37172f.m119120e(c3, i15, length, setCookie);
                int iM119120e2 = AbstractC37172f.m119120e(c7, i15, iM119120e, setCookie);
                String strM119133r3 = AbstractC37172f.m119133r(i15, iM119120e2, setCookie);
                String strM119133r4 = iM119120e2 < iM119120e ? AbstractC37172f.m119133r(iM119120e2 + 1, iM119120e, setCookie) : "";
                if (strM119133r3.equalsIgnoreCase("expires")) {
                    try {
                        jM96496l = m96496l(strM119133r4.length(), strM119133r4);
                        i17 = 1;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (strM119133r3.equalsIgnoreCase("max-age")) {
                    try {
                        j13 = Long.parseLong(strM119133r4);
                        if (j13 <= 0) {
                            j13 = Long.MIN_VALUE;
                        }
                    } catch (NumberFormatException e5) {
                        Pattern patternCompile = Pattern.compile("-?\\d+");
                        AbstractC22676k.m65749i(patternCompile, "compile(...)");
                        if (!patternCompile.matcher(strM119133r4).matches()) {
                            throw e5;
                        }
                        j13 = AbstractC39421y.m125930O(strM119133r4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                    }
                    i17 = 1;
                } else if (strM119133r3.equalsIgnoreCase("domain")) {
                    if (AbstractC39421y.m125920E(strM119133r4, ".", false)) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    String strM119115b = AbstractC37171e.m119115b(AbstractC39414r.m125898q0(strM119133r4, "."));
                    if (strM119115b == null) {
                        throw new IllegalArgumentException();
                    }
                    str2 = strM119115b;
                    z4 = false;
                } else if (strM119133r3.equalsIgnoreCase("path")) {
                    str = strM119133r4;
                } else if (strM119133r3.equalsIgnoreCase("secure")) {
                    i18 = 1;
                } else if (strM119133r3.equalsIgnoreCase("httponly")) {
                    i16 = 1;
                } else if (strM119133r3.equalsIgnoreCase("samesite")) {
                    str3 = strM119133r4;
                }
                i15 = iM119120e + 1;
                c3 = ';';
                c7 = '=';
            }
            if (c34839s != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c34839s);
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC22676k.m65749i(listUnmodifiableList, "unmodifiableList(...)");
        } else {
            listUnmodifiableList = null;
        }
        return listUnmodifiableList == null ? C25271y.f99162w : listUnmodifiableList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009c  */
    /* JADX INFO: renamed from: l */
    public static long m96496l(int i13, String str) {
        int iM96490f = m96490f(0, str, i13, false);
        Matcher matcher = C34839s.f146735n.matcher(str);
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int iM125888g0 = -1;
        int i17 = -1;
        int i18 = -1;
        while (iM96490f < i13) {
            int iM96490f2 = m96490f(iM96490f + 1, str, i13, true);
            matcher.region(iM96490f, iM96490f2);
            if (i15 == -1 && matcher.usePattern(C34839s.f146735n).matches()) {
                String strGroup = matcher.group(1);
                AbstractC22676k.m65749i(strGroup, "group(...)");
                i15 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                AbstractC22676k.m65749i(strGroup2, "group(...)");
                i17 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                AbstractC22676k.m65749i(strGroup3, "group(...)");
                i18 = Integer.parseInt(strGroup3);
            } else if (i16 == -1 && matcher.usePattern(C34839s.f146734m).matches()) {
                String strGroup4 = matcher.group(1);
                AbstractC22676k.m65749i(strGroup4, "group(...)");
                i16 = Integer.parseInt(strGroup4);
            } else if (iM125888g0 == -1) {
                Pattern pattern = C34839s.f146733l;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    AbstractC22676k.m65749i(strGroup5, "group(...)");
                    Locale locale = Locale.US;
                    String strM95641q = AbstractC31061c.m95641q(locale, "US", strGroup5, locale, "toLowerCase(...)");
                    String strPattern = pattern.pattern();
                    AbstractC22676k.m65749i(strPattern, "pattern(...)");
                    iM125888g0 = AbstractC39414r.m125888g0(strPattern, strM95641q, 0, false, 6) / 4;
                } else if (i14 != -1 && matcher.usePattern(C34839s.f146732k).matches()) {
                    String strGroup6 = matcher.group(1);
                    AbstractC22676k.m65749i(strGroup6, "group(...)");
                    i14 = Integer.parseInt(strGroup6);
                }
            } else if (i14 != -1) {
            }
            iM96490f = m96490f(iM96490f2 + 1, str, i13, false);
        }
        if (70 <= i14 && i14 < 100) {
            i14 += 1900;
        }
        if (i14 >= 0 && i14 < 70) {
            i14 += ErrorCodes.InitAPIErrors.cServerErrors;
        }
        if (i14 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iM125888g0 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i16 || i16 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i15 < 0 || i15 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i17 < 0 || i17 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i18 < 0 || i18 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(AbstractC37174h.f158962a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i14);
        gregorianCalendar.set(2, iM125888g0 - 1);
        gregorianCalendar.set(5, i16);
        gregorianCalendar.set(11, i15);
        gregorianCalendar.set(12, i17);
        gregorianCalendar.set(13, i18);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: m */
    public static final void m96497m(InterfaceC31373h interfaceC31373h, Exception ex3) {
        AbstractC22676k.m65750j(interfaceC31373h, "<this>");
        AbstractC22676k.m65750j(ex3, "ex");
        Class<?> cls = ex3.getClass();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        String qualifiedName = c22673i0.getOrCreateKotlinClass(cls).getQualifiedName();
        if (qualifiedName == null) {
            qualifiedName = c22673i0.getOrCreateKotlinClass(ex3.getClass()).getSimpleName();
        }
        Boolean bool = Boolean.TRUE;
        m96498n(interfaceC31373h, "error", bool);
        String message = ex3.getMessage();
        if (message != null) {
            m96498n(interfaceC31373h, "exception.message", message);
        }
        if (qualifiedName != null) {
            m96498n(interfaceC31373h, "exception.type", qualifiedName);
        }
        m96498n(interfaceC31373h, "exception.stacktrace", AbstractC29125c.m88514W(ex3));
        Throwable cause = ex3.getCause();
        if (cause != null) {
            m96498n(interfaceC31373h, "exception.cause", cause.toString());
        }
        m96498n(interfaceC31373h, "exception.escaped", bool);
    }

    /* JADX INFO: renamed from: n */
    public static final void m96498n(InterfaceC31373h interfaceC31373h, String str, Object value) {
        AbstractC22676k.m65750j(interfaceC31373h, "<this>");
        AbstractC22676k.m65750j(value, "value");
        if (AbstractC39414r.m125890i0(str)) {
            throw new IllegalArgumentException("AttributeKey name must not be blank");
        }
    }

    /* JADX INFO: renamed from: o */
    public static String m96499o(String str) {
        int length = str.length();
        int i13 = 0;
        while (i13 < length) {
            char cCharAt = str.charAt(i13);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i13 < length) {
                    char c3 = charArray[i13];
                    if (c3 >= 'A' && c3 <= 'Z') {
                        charArray[i13] = (char) (c3 ^ ' ');
                    }
                    i13++;
                }
                return String.valueOf(charArray);
            }
            i13++;
        }
        return str;
    }

    /* JADX INFO: renamed from: p */
    public static String m96500p(String str) {
        int length = str.length();
        int i13 = 0;
        while (i13 < length) {
            char cCharAt = str.charAt(i13);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i13 < length) {
                    char c3 = charArray[i13];
                    if (c3 >= 'a' && c3 <= 'z') {
                        charArray[i13] = (char) (c3 ^ ' ');
                    }
                    i13++;
                }
                return String.valueOf(charArray);
            }
            i13++;
        }
        return str;
    }

    /* JADX INFO: renamed from: q */
    public static byte m96501q(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: r */
    public static Boolean m96502r(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
