package p000;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.InterfaceC1583f2;
import ba3.C2910h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005a3.C0209i;
import p005a3.C0237p;
import p026b2.C2314t;
import p238j0.C21084j;
import p291l0.AbstractC22953f;
import p323m8.AbstractC25218a;
import p390p1.C28617g1;
import p390p1.C28655q;

/* JADX INFO: renamed from: d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC11266d {
    /* JADX INFO: renamed from: A */
    public static void m30443A(Class cls, StringBuilder sb4, String str) {
        sb4.append(cls.getName());
        sb4.append(str);
    }

    /* JADX INFO: renamed from: B */
    public static void m30444B(StringBuilder sb4, String str, String str2, String str3, String str4) {
        sb4.append(str);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(str4);
    }

    /* JADX INFO: renamed from: C */
    public static void m30445C(ArrayList arrayList, String str, String str2, String str3, String str4) {
        arrayList.add(str);
        arrayList.add(str2);
        arrayList.add(str3);
        arrayList.add(str4);
    }

    /* JADX INFO: renamed from: D */
    public static int m30446D(int i13, int i14, int i15, int i16) {
        return ((i13 * i14) / i15) + i16;
    }

    /* JADX INFO: renamed from: a */
    public static int m30447a(float f13, int i13, int i14) {
        return (Float.hashCode(f13) + i13) * i14;
    }

    /* JADX INFO: renamed from: b */
    public static int m30448b(int i13, int i14, int i15) {
        return (Integer.hashCode(i13) + i14) * i15;
    }

    /* JADX INFO: renamed from: c */
    public static int m30449c(int i13, int i14, int i15, int i16) {
        return ((i13 / i14) * i15) + i16;
    }

    /* JADX INFO: renamed from: d */
    public static int m30450d(int i13, int i14, String str) {
        return (str.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: e */
    public static int m30451e(int i13, long j7, int i14) {
        return (Long.hashCode(j7) + i13) * i14;
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC1583f2 m30452f(C28655q c28655q, int i13, boolean z4, C28655q c28655q2) {
        c28655q.m87150e0(i13);
        c28655q.m87173q(z4);
        return AbstractC25218a.m73844a(c28655q2);
    }

    /* JADX INFO: renamed from: g */
    public static C21084j m30453g(C28655q c28655q) {
        C21084j c21084j = new C21084j();
        c28655q.m87172p0(c21084j);
        return c21084j;
    }

    /* JADX INFO: renamed from: h */
    public static ClassCastException m30454h(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    /* JADX INFO: renamed from: i */
    public static Object m30455i(int i13, List list) {
        return list.get(list.size() - i13);
    }

    /* JADX INFO: renamed from: j */
    public static String m30456j(int i13, String str, String str2, String str3) {
        return str + i13 + str2 + str3;
    }

    /* JADX INFO: renamed from: k */
    public static String m30457k(long j7, String str, StringBuilder sb4) {
        sb4.append(j7);
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: l */
    public static String m30458l(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, String str, String str2) {
        return str + abstractComponentCallbacksC1320m0 + str2;
    }

    /* JADX INFO: renamed from: m */
    public static String m30459m(Class cls, String str) {
        return str + cls;
    }

    /* JADX INFO: renamed from: n */
    public static String m30460n(String str, C2910h c2910h, String str2) {
        return str + c2910h + str2;
    }

    /* JADX INFO: renamed from: o */
    public static String m30461o(String str, String str2) {
        return str + str2;
    }

    /* JADX INFO: renamed from: p */
    public static String m30462p(String str, boolean z4) {
        return str + z4;
    }

    /* JADX INFO: renamed from: q */
    public static String m30463q(StringBuilder sb4, AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, String str) {
        sb4.append(abstractComponentCallbacksC1320m0);
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: r */
    public static String m30464r(StringBuilder sb4, String str, String str2, String str3, String str4) {
        sb4.append(str);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(str4);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: s */
    public static StringBuilder m30465s(int i13, int i14, String str, String str2, String str3) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(i13);
        sb4.append(str2);
        sb4.append(i14);
        sb4.append(str3);
        return sb4;
    }

    /* JADX INFO: renamed from: t */
    public static StringBuilder m30466t(int i13, String str, String str2) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(i13);
        sb4.append(str2);
        return sb4;
    }

    /* JADX INFO: renamed from: u */
    public static StringBuilder m30467u(int i13, String str, String str2, String str3, String str4) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(i13);
        sb4.append(str4);
        return sb4;
    }

    /* JADX INFO: renamed from: v */
    public static C28617g1 m30468v(float f13, C28655q c28655q) {
        C28617g1 c28617g1 = new C28617g1(f13);
        c28655q.m87172p0(c28617g1);
        return c28617g1;
    }

    /* JADX INFO: renamed from: w */
    public static void m30469w(float f13, float f14, C2314t c2314t, C28655q c28655q) {
        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13 * f14, c2314t));
    }

    /* JADX INFO: renamed from: x */
    public static void m30470x(int i13, String str, String str2, String str3, StringBuilder sb4) {
        sb4.append(str);
        sb4.append(str2);
        sb4.append(i13);
        sb4.append(str3);
    }

    /* JADX INFO: renamed from: y */
    public static void m30471y(int i13, C28655q c28655q, int i14, C0209i c0209i) {
        c28655q.m87172p0(Integer.valueOf(i13));
        c28655q.m87143b(Integer.valueOf(i14), c0209i);
    }

    /* JADX INFO: renamed from: z */
    public static void m30472z(C0237p c0237p, long j7) {
        c0237p.m716w().mo51417g();
        c0237p.m690U(j7);
    }
}
