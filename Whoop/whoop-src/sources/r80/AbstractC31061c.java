package r80;

import android.net.Uri;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import com.whoop.design.util.TextResource;
import j02.C21147i0;
import j93.InterfaceC21490w;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import or2.AbstractC28152c1;
import p026b2.C2314t;
import p114eb.C12969k0;
import p114eb.C12995w0;
import p291l0.AbstractC22953f;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28633k1;
import p390p1.C28655q;
import p490t0.AbstractC33253j;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import pg3.C29222x0;
import qf3.C30330b;
import rf3.C31365d;
import sr2.AbstractC32943y;
import tf3.C33768a;
import v63.AbstractC35745c;
import vf3.C35953c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: r80.c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC31061c {
    /* JADX INFO: renamed from: A */
    public static void m95621A(StringBuilder sb4, Integer num, String str, Integer num2, String str2) {
        sb4.append(num);
        sb4.append(str);
        sb4.append(num2);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: B */
    public static void m95622B(StringBuilder sb4, String str, double d3, String str2) {
        sb4.append(str);
        sb4.append(d3);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: C */
    public static void m95623C(C28655q c28655q, int i13, C2314t c2314t, float f13, C28655q c28655q2) {
        c28655q.m87150e0(i13);
        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f13, c2314t));
    }

    /* JADX INFO: renamed from: D */
    public static long m95624D(C38072d c38072d, C28655q c28655q, int i13, boolean z4) {
        long jM125430y = c38072d.m121949b(c28655q, i13).getBrandWhite();
        c28655q.m87173q(z4);
        return jM125430y;
    }

    /* JADX INFO: renamed from: a */
    public static int m95625a(int i13, TextResource textResource, int i14) {
        return (textResource.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: b */
    public static long m95626b(float f13, long j7, InterfaceC39171c interfaceC39171c) {
        return AbstractC35745c.m113248j(f13 / interfaceC39171c.getFontScale(), j7);
    }

    /* JADX INFO: renamed from: c */
    public static long m95627c(C28655q c28655q, int i13, C38072d c38072d, C28655q c28655q2, int i14) {
        c28655q.m87150e0(i13);
        return c38072d.m121949b(c28655q2, i14).getWhite50();
    }

    /* JADX INFO: renamed from: d */
    public static long m95628d(C38072d c38072d, C28655q c28655q, int i13, boolean z4) {
        long jM125370W0 = c38072d.m121949b(c28655q, i13).getWhite10();
        c28655q.m87173q(z4);
        return jM125370W0;
    }

    /* JADX INFO: renamed from: e */
    public static Modifier m95629e(Modifier modifier, float f13, float f14, long j7) {
        return AbstractC1092a.m3358c(modifier, j7, AbstractC33253j.m105489e(f13 * f14));
    }

    /* JADX INFO: renamed from: f */
    public static C12969k0 m95630f(Uri uri, String str, C21147i0 c21147i0) {
        String string = uri.toString();
        AbstractC22676k.m65749i(string, str);
        return c21147i0.m58994a(string);
    }

    /* JADX INFO: renamed from: g */
    public static C12995w0 m95631g() {
        return AbstractC28152c1.m85188f(new C12995w0());
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC21490w m95632h(Class cls, String str, String str2, int i13, C22673i0 c22673i0) {
        return c22673i0.property1(new C22693x(cls, str, str2, i13));
    }

    /* JADX INFO: renamed from: i */
    public static String m95633i(char c3, String str, String str2) {
        return str + str2 + c3;
    }

    /* JADX INFO: renamed from: j */
    public static String m95634j(int i13, int i14, String str) {
        StringBuilder sb4 = new StringBuilder(i13);
        sb4.append(str);
        sb4.append(i14);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m95635k(int i13, String str) {
        return i13 + str;
    }

    /* JADX INFO: renamed from: l */
    public static String m95636l(long j7, String str, String str2) {
        return str + j7 + str2;
    }

    /* JADX INFO: renamed from: m */
    public static String m95637m(Uri uri, String str) {
        return str + uri;
    }

    /* JADX INFO: renamed from: n */
    public static String m95638n(String str, float f13, String str2, float f14, String str3) {
        return str + f13 + str2 + f14 + str3;
    }

    /* JADX INFO: renamed from: o */
    public static String m95639o(String str, int i13, char c3) {
        return str + i13 + c3;
    }

    /* JADX INFO: renamed from: p */
    public static String m95640p(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    /* JADX INFO: renamed from: q */
    public static String m95641q(Locale locale, String str, String str2, Locale locale2, String str3) {
        AbstractC22676k.m65749i(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        AbstractC22676k.m65749i(lowerCase, str3);
        return lowerCase;
    }

    /* JADX INFO: renamed from: r */
    public static String m95642r(C22673i0 c22673i0, Class cls, StringBuilder sb4) {
        sb4.append(c22673i0.getOrCreateKotlinClass(cls));
        return sb4.toString();
    }

    /* JADX INFO: renamed from: s */
    public static StringBuilder m95643s(String str, String str2, Integer num, String str3, String str4) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(num);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(str4);
        return sb4;
    }

    /* JADX INFO: renamed from: t */
    public static List m95644t(String str, String str2) {
        return AbstractC37056f.m118958J(str + str2);
    }

    /* JADX INFO: renamed from: u */
    public static Map m95645u(String str, String str2) {
        return AbstractC25247g0.m73989X(new C23465k(str, str2));
    }

    /* JADX INFO: renamed from: v */
    public static C28621h1 m95646v(int i13, C28655q c28655q) {
        C28621h1 c28621h1 = new C28621h1(i13);
        c28655q.m87172p0(c28621h1);
        return c28621h1;
    }

    /* JADX INFO: renamed from: w */
    public static C28633k1 m95647w(boolean z4, C28655q c28655q) {
        C28633k1 c28633k1M87272z = AbstractC28683x.m87272z(Boolean.valueOf(z4));
        c28655q.m87172p0(c28633k1M87272z);
        return c28633k1M87272z;
    }

    /* JADX INFO: renamed from: x */
    public static C35953c m95648x(C30330b c30330b, C33768a c33768a, String str, String str2) {
        c33768a.m106774b(str, new C31365d(c30330b), false);
        return new C35953c(str2);
    }

    /* JADX INFO: renamed from: y */
    public static C35953c m95649y(AbstractC32943y abstractC32943y, C29222x0 c29222x0, String str) {
        c29222x0.m88729c(abstractC32943y.getApiBaseUrl());
        return new C35953c(str);
    }

    /* JADX INFO: renamed from: z */
    public static void m95650z(float f13, float f14, C2314t c2314t, C28655q c28655q, boolean z4) {
        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13 * f14, c2314t));
        c28655q.m87173q(z4);
    }
}
