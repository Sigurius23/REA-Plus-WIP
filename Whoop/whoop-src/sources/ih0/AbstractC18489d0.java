package ih0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import ci2.InterfaceC4733b;
import com.google.gson.GsonBuilder;
import gz0.EnumC16313m0;
import io.sentry.InterfaceC20602v0;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import m83.AbstractC25265s;
import p026b2.C2306l;
import p026b2.C2314t;
import p288ks.AbstractC22819a;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p294l3.C23285v0;
import p355o2.C27430e;
import p390p1.C28655q;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p581we.C37199o;
import p602x1.C37816b;
import p715kotlin.jvm.internal.AbstractC22676k;
import qf3.C30330b;
import rf3.C31365d;
import tf3.C33768a;
import uf3.C34911a;
import vf3.C35953c;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;

/* JADX INFO: renamed from: ih0.d0 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC18489d0 {
    /* JADX INFO: renamed from: A */
    public static void m53355A(ConcurrentHashMap concurrentHashMap, String str, C37199o c37199o, String str2, InterfaceC20602v0 interfaceC20602v0) {
        Object obj = concurrentHashMap.get(str);
        c37199o.m119207K(str2);
        c37199o.m119219Y(interfaceC20602v0, obj);
    }

    /* JADX INFO: renamed from: B */
    public static void m53356B(C28655q c28655q, boolean z4, C2314t c2314t, float f13, C28655q c28655q2) {
        c28655q.m87173q(z4);
        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f13, c2314t));
    }

    /* JADX INFO: renamed from: C */
    public static int m53357C(C38072d c38072d) {
        return c38072d.m121951d().getNavigation().getNavigationBackward();
    }

    /* JADX INFO: renamed from: D */
    public static long m53358D(C38072d c38072d, C28655q c28655q, int i13, boolean z4) {
        long jM125382b1 = c38072d.m121949b(c28655q, i13).getWhite50();
        c28655q.m87173q(z4);
        return jM125382b1;
    }

    /* JADX INFO: renamed from: E */
    public static int m53359E(C38072d c38072d) {
        return c38072d.m121951d().getNavigation().getArrowForward();
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m53360a(int i13) {
        return !AbstractC22819a.m66183a();
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m53361b(int i13) {
        Boolean bool;
        if (AbstractC22819a.m66183a()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
            } catch (Exception unused) {
                AbstractC22819a.f89918a.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static int m53362c(C38072d c38072d) {
        return c38072d.m121951d().getTinyIcons().getAttention();
    }

    /* JADX INFO: renamed from: d */
    public static long m53363d(C38072d c38072d, C28655q c28655q, int i13, boolean z4) {
        long jM125372X0 = c38072d.m121949b(c28655q, i13).getWhite20();
        c28655q.m87173q(z4);
        return jM125372X0;
    }

    /* JADX INFO: renamed from: e */
    public static Modifier m53364e(Modifier modifier, float f13, float f14) {
        return AbstractC37056f.m118994r(modifier, AbstractC33253j.m105489e(f13 * f14));
    }

    /* JADX INFO: renamed from: f */
    public static Modifier m53365f(C28655q c28655q, int i13, float f13, float f14, C2314t c2314t) {
        c28655q.m87150e0(i13);
        return AbstractC1102d.m3419p(f13 * f14, c2314t);
    }

    /* JADX INFO: renamed from: g */
    public static GsonBuilder m53366g(C38266c c38266c, String str, C34911a c34911a, String str2) {
        AbstractC22676k.m65750j(c38266c, str);
        AbstractC22676k.m65750j(c34911a, str2);
        return new GsonBuilder();
    }

    /* JADX INFO: renamed from: h */
    public static Object m53367h(InterfaceC4733b interfaceC4733b) {
        return AbstractC25265s.m74100H0(interfaceC4733b.mo14818b().getReplayCache());
    }

    /* JADX INFO: renamed from: i */
    public static String m53368i(int i13, String str, int i14, int i15, String str2) {
        String strSubstring = str.substring(i15, i13 + i14);
        AbstractC22676k.m65749i(strSubstring, str2);
        return strSubstring;
    }

    /* JADX INFO: renamed from: j */
    public static String m53369j(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    /* JADX INFO: renamed from: k */
    public static String m53370k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: l */
    public static String m53371l(StringBuilder sb4, int i13, String str) {
        sb4.append(i13);
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: m */
    public static String m53372m(StringBuilder sb4, boolean z4, String str) {
        sb4.append(z4);
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: n */
    public static StringBuilder m53373n(int i13, String str, String str2, String str3, String str4) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(i13);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(str4);
        return sb4;
    }

    /* JADX INFO: renamed from: o */
    public static StringBuilder m53374o(String str) {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        return sb4;
    }

    /* JADX INFO: renamed from: p */
    public static StringBuilder m53375p(String str, String str2, String str3) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(str2);
        sb4.append(str3);
        return sb4;
    }

    /* JADX INFO: renamed from: q */
    public static C22994r1 m53376q(float f13, float f14, C2306l c2306l, C28655q c28655q, int i13) {
        return AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13 * f14), c2306l, c28655q, i13);
    }

    /* JADX INFO: renamed from: r */
    public static C23285v0 m53377r(C38072d c38072d, C28655q c28655q, int i13) {
        return c38072d.m121952e(c28655q, i13).getB2().getStyle();
    }

    /* JADX INFO: renamed from: s */
    public static C27430e m53378s(C28655q c28655q, int i13, EnumC16313m0 enumC16313m0, C28655q c28655q2, int i14) {
        c28655q.m87150e0(i13);
        return AbstractC34132o.m107874S(enumC16313m0.toWhoopIcon(), c28655q2, i14);
    }

    /* JADX INFO: renamed from: t */
    public static C35953c m53379t(C30330b c30330b, C33768a c33768a, String str, boolean z4, String str2) {
        c33768a.m106774b(str, new C31365d(c30330b), z4);
        return new C35953c(str2);
    }

    /* JADX INFO: renamed from: u */
    public static void m53380u(float f13, float f14, C2314t c2314t, C28655q c28655q) {
        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13 * f14, c2314t));
    }

    /* JADX INFO: renamed from: v */
    public static void m53381v(float f13, float f14, C2314t c2314t, C28655q c28655q, boolean z4) {
        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f13 * f14, c2314t));
        c28655q.m87173q(z4);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m53382w(int i13, String str) {
        if (i13 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(AbstractC22676k.m65753m(str));
        AbstractC22676k.m65754n(nullPointerException, AbstractC22676k.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: x */
    public static void m53383x(int i13, HashMap map, String str, int i14, String str2) {
        map.put(str, Integer.valueOf(i13));
        map.put(str2, Integer.valueOf(i14));
    }

    /* JADX INFO: renamed from: y */
    public static void m53384y(int i13, C37816b c37816b, C28655q c28655q, boolean z4) {
        c37816b.invoke(c28655q, Integer.valueOf(i13));
        c28655q.m87173q(z4);
    }

    /* JADX INFO: renamed from: z */
    public static void m53385z(HashMap map, String str, C37199o c37199o, String str2, InterfaceC20602v0 interfaceC20602v0) {
        Object obj = map.get(str);
        c37199o.m119207K(str2);
        c37199o.m119219Y(interfaceC20602v0, obj);
    }
}
