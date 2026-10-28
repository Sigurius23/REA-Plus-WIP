package p031b9;

import android.content.Context;
import android.util.Log;
import java.util.List;
import p005a3.C0209i;
import p005a3.C0217k;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p603x2.AbstractC37831a;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import pg3.C29222x0;
import qf3.C30330b;
import rf3.C31365d;
import sr2.AbstractC32943y;
import tf3.C33768a;
import u82.C34643d;
import ud3.C34826l0;
import uf3.C34911a;
import v82.C35799a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;

/* JADX INFO: renamed from: b9.y */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2875y {
    /* JADX INFO: renamed from: A */
    public static void m8285A(StringBuilder sb4, String str, long j7, String str2) {
        sb4.append(str);
        sb4.append(j7);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: B */
    public static void m8286B(C28655q c28655q, boolean z4, boolean z13, boolean z14, boolean z15) {
        c28655q.m87173q(z4);
        c28655q.m87173q(z13);
        c28655q.m87173q(z14);
        c28655q.m87173q(z15);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m8287C(int i13) {
        switch (i13) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: a */
    public static float m8288a(float f13, float f14, float f15, float f16) {
        return ((f13 - f14) * f15) + f16;
    }

    /* JADX INFO: renamed from: b */
    public static int m8289b(int i13, int i14, boolean z4) {
        return (Boolean.hashCode(z4) + i13) * i14;
    }

    /* JADX INFO: renamed from: c */
    public static int m8290c(C38072d c38072d) {
        return c38072d.m121951d().getTinyIcons().getCheckmark();
    }

    /* JADX INFO: renamed from: d */
    public static C0209i m8291d(C28655q c28655q, C23010x c23010x, C28655q c28655q2, InterfaceC28653p1 interfaceC28653p1) {
        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010x);
        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1);
        return C0217k.f732j;
    }

    /* JADX INFO: renamed from: e */
    public static Context m8292e(C38266c c38266c, String str, C34911a c34911a, String str2, C38266c c38266c2) {
        AbstractC22676k.m65750j(c38266c, str);
        AbstractC22676k.m65750j(c34911a, str2);
        return AbstractC29125c.m88532i(c38266c2);
    }

    /* JADX INFO: renamed from: f */
    public static Object m8293f(C29222x0 c29222x0, C34826l0 c34826l0, Class cls, String str) {
        c29222x0.m88731e(c34826l0);
        Object objM88733b = c29222x0.m88730d().m88733b(cls);
        AbstractC22676k.m65749i(objM88733b, str);
        return objM88733b;
    }

    /* JADX INFO: renamed from: g */
    public static String m8294g(int i13, int i14, String str, String str2) {
        return str + i13 + str2 + i14;
    }

    /* JADX INFO: renamed from: h */
    public static String m8295h(int i13, String str) {
        return str + i13;
    }

    /* JADX INFO: renamed from: i */
    public static String m8296i(int i13, String str, String str2) {
        return str + i13 + str2;
    }

    /* JADX INFO: renamed from: j */
    public static String m8297j(Exception exc, String str) {
        return str + exc;
    }

    /* JADX INFO: renamed from: k */
    public static String m8298k(Exception exc, StringBuilder sb4) {
        sb4.append(exc.getMessage());
        return sb4.toString();
    }

    /* JADX INFO: renamed from: l */
    public static String m8299l(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: m */
    public static String m8300m(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    /* JADX INFO: renamed from: n */
    public static String m8301n(String str, Throwable th3) {
        return str + th3;
    }

    /* JADX INFO: renamed from: o */
    public static String m8302o(StringBuilder sb4, long j7, char c3) {
        sb4.append(j7);
        sb4.append(c3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: p */
    public static String m8303p(StringBuilder sb4, String str, Object obj) {
        sb4.append(obj);
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: q */
    public static String m8304q(StringBuilder sb4, String str, String str2, String str3) {
        sb4.append(str);
        sb4.append(str2);
        sb4.append(str3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: r */
    public static String m8305r(StringBuilder sb4, boolean z4, char c3) {
        sb4.append(z4);
        sb4.append(c3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: s */
    public static StringBuilder m8306s(String str, double d3, String str2) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(d3);
        sb4.append(str2);
        return sb4;
    }

    /* JADX INFO: renamed from: t */
    public static StringBuilder m8307t(String str, float f13, String str2, float f14, String str3) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(f13);
        sb4.append(str2);
        sb4.append(f14);
        sb4.append(str3);
        return sb4;
    }

    /* JADX INFO: renamed from: u */
    public static List m8308u() {
        return AbstractC37056f.m118958J(new C35799a());
    }

    /* JADX INFO: renamed from: v */
    public static KotlinNothingValueException m8309v(Object obj) {
        AbstractC34132o.m107864I(obj);
        return new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: w */
    public static KotlinNothingValueException m8310w(String str) {
        AbstractC37831a.m121375c(str);
        return new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: x */
    public static C31365d m8311x(C30330b c30330b, C33768a c33768a, String str) {
        C31365d c31365d = new C31365d(c30330b);
        c33768a.m106774b(str, c31365d, false);
        return c31365d;
    }

    /* JADX INFO: renamed from: y */
    public static C35953c m8312y(AbstractC32943y abstractC32943y, C29222x0 c29222x0, C34643d c34643d, String str) {
        c29222x0.m88729c(abstractC32943y.getApiBaseUrl());
        c29222x0.m88728b(c34643d);
        return new C35953c(str);
    }

    /* JADX INFO: renamed from: z */
    public static void m8313z(int i13, String str, String str2) {
        Log.w(str2, str + i13);
    }
}
