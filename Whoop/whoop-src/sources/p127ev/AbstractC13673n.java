package p127ev;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.p018ui.Modifier;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import ec3.C13045h2;
import g40.C15356g2;
import gh3.EnumC15860e;
import hc3.AbstractC17169c;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kd1.AbstractC22403o;
import l83.C23465k;
import p026b2.C2305k;
import p208i2.C17919x;
import p355o2.C27430e;
import p381ot.C28315a;
import p390p1.C28655q;
import p505ts.AbstractC34132o;
import p560vs.C36409p3;
import p636y3.C39174f;
import p715kotlin.jvm.functions.Function1;
import x81.C38072d;

/* JADX INFO: renamed from: ev.n */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC13673n {
    /* JADX INFO: renamed from: A */
    public static void m38549A(StringBuilder sb4, AbstractC22403o abstractC22403o, String str, TextResource textResource, String str2) {
        sb4.append(abstractC22403o);
        sb4.append(str);
        sb4.append(textResource);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: B */
    public static void m38550B(boolean z4, C13045h2 c13045h2, Object obj) {
        Boolean boolValueOf = Boolean.valueOf(z4);
        c13045h2.getClass();
        c13045h2.m36571k(obj, boolValueOf);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ boolean m38551C(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AbstractC17169c abstractC17169c, Object obj, AbstractC17169c abstractC17169c2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC17169c, obj, abstractC17169c2)) {
            if (atomicReferenceFieldUpdater.get(abstractC17169c) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ String m38552D(int i13) {
        if (i13 == 1) {
            return "ERROR";
        }
        if (i13 == 2) {
            return "WARN";
        }
        if (i13 == 3) {
            return "INFO";
        }
        if (i13 != 4) {
            return i13 != 5 ? "null" : "TRACE";
        }
        return "DEBUG";
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ String m38553E(int i13) {
        if (i13 == 1) {
            return "FUNCTION";
        }
        if (i13 == 2) {
            return "PROPERTY";
        }
        if (i13 != 3) {
            return i13 != 4 ? "null" : "PROPERTY_SETTER";
        }
        return "PROPERTY_GETTER";
    }

    /* JADX INFO: renamed from: a */
    public static int m38554a(boolean z4, boolean z13) {
        if (z4) {
            return z13 ? 4 : 2;
        }
        return z13 ? 3 : 1;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ boolean m38555b(int i13) {
        if (i13 == 1) {
            return false;
        }
        if (i13 == 2) {
            return true;
        }
        if (i13 == 3) {
            return false;
        }
        if (i13 == 4) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m38556c(int i13) {
        if (i13 == 1 || i13 == 2) {
            return false;
        }
        if (i13 == 3 || i13 == 4) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m38557d(int i13) {
        if (i13 == 1) {
            return 40;
        }
        if (i13 == 2) {
            return 30;
        }
        if (i13 == 3) {
            return 20;
        }
        if (i13 == 4) {
            return 10;
        }
        if (i13 == 5) {
            return 0;
        }
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static int m38558e(LocalDate localDate, int i13, int i14) {
        return (localDate.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: f */
    public static long m38559f(C38072d c38072d, C28655q c28655q, int i13, float f13) {
        return C17919x.m51541c(f13, c38072d.m121949b(c28655q, i13).getBrandWhite());
    }

    /* JADX INFO: renamed from: g */
    public static Modifier m38560g(C2305k c2305k, Modifier modifier) {
        return modifier.mo3471e(new HorizontalAlignElement(c2305k));
    }

    /* JADX INFO: renamed from: h */
    public static Integer m38561h(C38072d c38072d) {
        return Integer.valueOf(c38072d.m121951d().getNavigation().getNavigationBackward());
    }

    /* JADX INFO: renamed from: i */
    public static String m38562i(String str, String str2, List list, String str3, List list2) {
        return str + list + str2 + list2 + str3;
    }

    /* JADX INFO: renamed from: j */
    public static String m38563j(StringBuilder sb4, String str, String str2, C9598e c9598e, String str3) {
        sb4.append(str);
        sb4.append(str2);
        sb4.append(c9598e);
        sb4.append(str3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m38564k(StringBuilder sb4, Date date, String str) {
        sb4.append(date);
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: l */
    public static String m38565l(StringBuilder sb4, Map map, String str) {
        sb4.append(map);
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: m */
    public static String m38566m(C36409p3 c36409p3, StringBuilder sb4) {
        sb4.append(c36409p3.m116534E());
        return sb4.toString();
    }

    /* JADX INFO: renamed from: n */
    public static StringBuilder m38567n(String str, String str2, String str3, String str4, boolean z4) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(z4);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(str4);
        return sb4;
    }

    /* JADX INFO: renamed from: o */
    public static HashMap m38568o(Class cls, C28315a c28315a) {
        HashMap map = new HashMap();
        map.put(cls, c28315a);
        return map;
    }

    /* JADX INFO: renamed from: p */
    public static Map m38569p(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    /* JADX INFO: renamed from: q */
    public static C23465k m38570q(String str, String str2, String str3, String str4) {
        return new C23465k(str4, new C15356g2(str, str2, str3));
    }

    /* JADX INFO: renamed from: r */
    public static C27430e m38571r(C38072d c38072d, C28655q c28655q, int i13) {
        return AbstractC34132o.m107874S(c38072d.m121951d().getNavigation().getNavigationBackward(), c28655q, i13);
    }

    /* JADX INFO: renamed from: s */
    public static void m38572s(float f13, String str, StringBuilder sb4) {
        sb4.append((Object) C39174f.m124783c(f13));
        sb4.append(str);
    }

    /* JADX INFO: renamed from: t */
    public static void m38573t(int i13, String str, String str2, StringBuilder sb4, boolean z4) {
        sb4.append(i13);
        sb4.append(str);
        sb4.append(z4);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: u */
    public static void m38574u(long j7, String str, StringBuilder sb4) {
        sb4.append((Object) C17919x.m51548j(j7));
        sb4.append(str);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m38575v(EnumC15860e enumC15860e) {
        throw null;
    }

    /* JADX INFO: renamed from: w */
    public static void m38576w(Boolean bool, String str, String str2, String str3, StringBuilder sb4) {
        sb4.append(bool);
        sb4.append(str);
        sb4.append(str2);
        sb4.append(str3);
    }

    /* JADX INFO: renamed from: x */
    public static void m38577x(Integer num, String str, String str2, String str3, StringBuilder sb4) {
        sb4.append(num);
        sb4.append(str);
        sb4.append(str2);
        sb4.append(str3);
    }

    /* JADX INFO: renamed from: y */
    public static void m38578y(Object obj, AnalyticEventModel analyticEventModel, Function1 function1) {
        function1.invoke(new DesignItemInteraction(obj, analyticEventModel));
    }

    /* JADX INFO: renamed from: z */
    public static void m38579z(StringBuilder sb4, String str, String str2, Date date, String str3) {
        sb4.append(str);
        sb4.append(str2);
        sb4.append(date);
        sb4.append(str3);
    }
}
