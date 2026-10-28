package p088dc;

import android.os.Bundle;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import b91.C2886a;
import c93.InterfaceC4351m;
import j93.InterfaceC21477l;
import java.util.List;
import java.util.UUID;
import p026b2.C2314t;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28655q;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import qf3.C30330b;
import rf3.C31365d;
import tf3.C33768a;
import x81.C38072d;

/* JADX INFO: renamed from: dc.b */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC11895b {
    /* JADX INFO: renamed from: A */
    public static void m31978A(int i13, InterfaceC4351m interfaceC4351m, C28655q c28655q, boolean z4, boolean z13) {
        interfaceC4351m.invoke(c28655q, Integer.valueOf(i13));
        c28655q.m87173q(z4);
        c28655q.m87173q(z13);
    }

    /* JADX INFO: renamed from: B */
    public static void m31979B(int i13, String str, String str2, String str3, StringBuilder sb4) {
        sb4.append(i13);
        sb4.append(str);
        sb4.append(str2);
        sb4.append(str3);
    }

    /* JADX INFO: renamed from: C */
    public static void m31980C(C30330b c30330b, C33768a c33768a, String str, boolean z4) {
        c33768a.m106774b(str, new C31365d(c30330b), z4);
    }

    /* JADX INFO: renamed from: D */
    public static int m31981D(C38072d c38072d) {
        return c38072d.m121951d().getNavigation().getNavigationForward();
    }

    /* JADX INFO: renamed from: a */
    public static int m31982a(float f13, float f14, float f15) {
        return Math.round((f13 + f14) * f15);
    }

    /* JADX INFO: renamed from: b */
    public static int m31983b(int i13, int i14, List list) {
        return (list.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: c */
    public static int m31984c(C2886a c2886a, int i13, int i14) {
        return (c2886a.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: d */
    public static int m31985d(C38072d c38072d) {
        return c38072d.m121951d().getLogo().getWhoopRounded();
    }

    /* JADX INFO: renamed from: e */
    public static long m31986e(C38072d c38072d, C28655q c28655q, int i13, boolean z4) {
        long jM125426w = c38072d.m121949b(c28655q, i13).getBrandBlack();
        c28655q.m87173q(z4);
        return jM125426w;
    }

    /* JADX INFO: renamed from: f */
    public static Modifier m31987f(float f13, float f14, C2314t c2314t, long j7) {
        return AbstractC1092a.m3358c(c2314t, j7, AbstractC33253j.m105489e(f13 * f14));
    }

    /* JADX INFO: renamed from: g */
    public static Modifier m31988g(Modifier modifier, boolean z4, float f13) {
        return modifier.mo3471e(new LayoutWeightElement(f13, z4));
    }

    /* JADX INFO: renamed from: h */
    public static C17919x m31989h(C28655q c28655q, boolean z4, long j7) {
        c28655q.m87173q(z4);
        return new C17919x(j7);
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC21477l m31990i(Class cls, String str, String str2, int i13, C22673i0 c22673i0) {
        return c22673i0.mutableProperty1(new C22686q(cls, str, str2, i13));
    }

    /* JADX INFO: renamed from: j */
    public static Object m31991j(Bundle bundle, String str, String str2, String str3, String str4) {
        AbstractC22676k.m65750j(bundle, str);
        AbstractC22676k.m65750j(str2, str3);
        return bundle.get(str4);
    }

    /* JADX INFO: renamed from: k */
    public static String m31992k(char c3, String str, String str2) {
        return str + c3 + str2;
    }

    /* JADX INFO: renamed from: l */
    public static String m31993l(int i13, String str, String str2, String str3, String str4) {
        return str + str2 + str3 + i13 + str4;
    }

    /* JADX INFO: renamed from: m */
    public static String m31994m(long j7, String str) {
        return str + j7;
    }

    /* JADX INFO: renamed from: n */
    public static String m31995n(String str) {
        String string = UUID.randomUUID().toString();
        AbstractC22676k.m65749i(string, str);
        return string;
    }

    /* JADX INFO: renamed from: o */
    public static String m31996o(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: p */
    public static String m31997p(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    /* JADX INFO: renamed from: q */
    public static String m31998q(String str, List list) {
        return str + list;
    }

    /* JADX INFO: renamed from: r */
    public static String m31999r(StringBuilder sb4, int i13, char c3) {
        sb4.append(i13);
        sb4.append(c3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: s */
    public static StringBuilder m32000s(String str, String str2, long j7, String str3) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(j7);
        return sb4;
    }

    /* JADX INFO: renamed from: t */
    public static StringBuilder m32001t(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(str4);
        sb4.append(str5);
        return sb4;
    }

    /* JADX INFO: renamed from: u */
    public static StringBuilder m32002u(String str, String str2, String str3, boolean z4, boolean z13) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(z4);
        sb4.append(str2);
        sb4.append(z13);
        sb4.append(str3);
        return sb4;
    }

    /* JADX INFO: renamed from: v */
    public static NoWhenBranchMatchedException m32003v(int i13, C28655q c28655q, boolean z4) {
        c28655q.m87150e0(i13);
        c28655q.m87173q(z4);
        return new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: w */
    public static C22669g0 m32004w(Object obj) {
        AbstractC34132o.m107864I(obj);
        return new C22669g0();
    }

    /* JADX INFO: renamed from: x */
    public static C28633k1 m32005x(int i13, C28655q c28655q) {
        C28633k1 c28633k1M87272z = AbstractC28683x.m87272z(Integer.valueOf(i13));
        c28655q.m87172p0(c28633k1M87272z);
        return c28633k1M87272z;
    }

    /* JADX INFO: renamed from: y */
    public static void m32006y(float f13, boolean z4, C28655q c28655q) {
        AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(f13, z4));
    }

    /* JADX INFO: renamed from: z */
    public static void m32007z(int i13, InterfaceC4351m interfaceC4351m, C28655q c28655q, boolean z4) {
        interfaceC4351m.invoke(c28655q, Integer.valueOf(i13));
        c28655q.m87173q(z4);
    }
}
