package p319m4;

import ad3.AbstractC0757c;
import ag3.AbstractC0865a;
import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import androidx.compose.foundation.layout.AbstractC1102d;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import ob3.InterfaceC27802l;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.C28655q;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import pg3.C29222x0;
import qf3.C30330b;
import rf3.C31362a;
import rf3.C31365d;
import tf3.C33768a;
import u82.AbstractC34645f;
import uf3.C34911a;
import vf3.C35953c;
import x81.C38072d;
import xf3.C38266c;

/* JADX INFO: renamed from: m4.a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC25012a {
    /* JADX INFO: renamed from: A */
    public static int m73365A(C38072d c38072d) {
        return c38072d.m121951d().getAction().getPencil();
    }

    /* JADX INFO: renamed from: B */
    public static long m73366B(C28655q c28655q, int i13, C38072d c38072d, C28655q c28655q2, int i14) {
        c28655q.m87150e0(i13);
        return c38072d.m121949b(c28655q2, i14).getBrandWhite();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m73367C(int i13) {
        switch (i13) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m73368a(Set set, int i13, int i14) {
        return (set.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: b */
    public static int m73369b(C38072d c38072d) {
        return c38072d.m121951d().getSleep().getSleep();
    }

    /* JADX INFO: renamed from: c */
    public static long m73370c(C28655q c28655q, int i13, C38072d c38072d, C28655q c28655q2, int i14) {
        c28655q.m87150e0(i13);
        return c38072d.m121949b(c28655q2, i14).getWhite70();
    }

    /* JADX INFO: renamed from: d */
    public static Object m73371d(ArrayList arrayList, int i13) {
        return arrayList.get(arrayList.size() - i13);
    }

    /* JADX INFO: renamed from: e */
    public static String m73372e(int i13, int i14, String str, String str2, String str3) {
        return str + i13 + str2 + i14 + str3;
    }

    /* JADX INFO: renamed from: f */
    public static String m73373f(int i13, String str, String str2) {
        return str + str2 + i13;
    }

    /* JADX INFO: renamed from: g */
    public static String m73374g(int i13, String str, String str2, String str3) {
        return str + str2 + str3 + i13;
    }

    /* JADX INFO: renamed from: h */
    public static String m73375h(Object obj, String str) {
        return str + obj;
    }

    /* JADX INFO: renamed from: i */
    public static String m73376i(String str, String str2, StringBuilder sb4) {
        sb4.append(str);
        sb4.append(str2);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m73377j(StringBuilder sb4, String str, char c3) {
        sb4.append(str);
        sb4.append(c3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m73378k(C22673i0 c22673i0, Class cls, StringBuilder sb4, char c3) {
        sb4.append(AbstractC0865a.m2111a(c22673i0.getOrCreateKotlinClass(cls)));
        sb4.append(c3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: l */
    public static StringBuilder m73379l(String str, String str2, String str3, String str4, boolean z4) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(z4);
        sb4.append(str4);
        return sb4;
    }

    /* JADX INFO: renamed from: m */
    public static StringBuilder m73380m(String str, InterfaceC27802l interfaceC27802l, String str2) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(interfaceC27802l);
        sb4.append(str2);
        return sb4;
    }

    /* JADX INFO: renamed from: n */
    public static C23010x m73381n(float f13, float f14, C2305k c2305k, C28655q c28655q, int i13) {
        return AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13 * f14), c2305k, c28655q, i13);
    }

    /* JADX INFO: renamed from: o */
    public static C29222x0 m73382o(C38266c c38266c, String str, C34911a c34911a, String str2) {
        AbstractC22676k.m65750j(c38266c, str);
        AbstractC22676k.m65750j(c34911a, str2);
        return new C29222x0();
    }

    /* JADX INFO: renamed from: p */
    public static C31365d m73383p(C30330b c30330b, C33768a c33768a, String str, boolean z4) {
        C31365d c31365d = new C31365d(c30330b);
        c33768a.m106774b(str, c31365d, z4);
        return c31365d;
    }

    /* JADX INFO: renamed from: q */
    public static C35953c m73384q(AbstractC0757c abstractC0757c, C29222x0 c29222x0, String str) {
        c29222x0.m88728b(AbstractC34645f.m109482a(abstractC0757c));
        return new C35953c(str);
    }

    /* JADX INFO: renamed from: r */
    public static C35953c m73385r(C30330b c30330b, C33768a c33768a, String str, boolean z4, String str2) {
        c33768a.m106774b(str, new C31362a(c30330b), z4);
        return new C35953c(str2);
    }

    /* JADX INFO: renamed from: s */
    public static C35953c m73386s(C33768a c33768a, String str, String str2) {
        AbstractC22676k.m65750j(c33768a, str);
        return new C35953c(str2);
    }

    /* JADX INFO: renamed from: t */
    public static C35953c m73387t(C38266c c38266c, String str, C34911a c34911a, String str2, String str3) {
        AbstractC22676k.m65750j(c38266c, str);
        AbstractC22676k.m65750j(c34911a, str2);
        return new C35953c(str3);
    }

    /* JADX INFO: renamed from: u */
    public static void m73388u(float f13, float f14, C2314t c2314t, C28655q c28655q, boolean z4) {
        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13 * f14, c2314t));
        c28655q.m87173q(z4);
    }

    /* JADX INFO: renamed from: v */
    public static void m73389v(C2314t c2314t, float f13, C28655q c28655q, boolean z4) {
        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
        c28655q.m87173q(z4);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m73390w(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else {
                if (!(autoCloseable instanceof MediaMetadataRetriever)) {
                    throw new IllegalArgumentException();
                }
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z4 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z4) {
                    executorService.shutdownNow();
                    z4 = true;
                }
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m73391x(String str, String str2, StringBuilder sb4, List list, boolean z4) {
        sb4.append(z4);
        sb4.append(str);
        sb4.append(list);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: y */
    public static void m73392y(C28655q c28655q, boolean z4, boolean z13, boolean z14) {
        c28655q.m87173q(z4);
        c28655q.m87173q(z13);
        c28655q.m87173q(z14);
    }

    /* JADX INFO: renamed from: z */
    public static void m73393z(C30330b c30330b, C33768a c33768a, String str, boolean z4) {
        c33768a.m106774b(str, new C31362a(c30330b), z4);
    }
}
