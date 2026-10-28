package q63;

import android.util.Log;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kd1.AbstractC22403o;
import p026b2.C2314t;
import p108e4.AbstractC12682p;
import p291l0.AbstractC22953f;
import p390p1.C28655q;
import p477s2.AbstractC32076h;
import p717lq2.InterfaceC24673e;

/* JADX INFO: renamed from: q63.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC30007c {
    /* JADX INFO: renamed from: A */
    public static void m91826A(StringBuilder sb4, String str, String str2, TextResource textResource, String str3) {
        sb4.append(str);
        sb4.append(str2);
        sb4.append(textResource);
        sb4.append(str3);
    }

    /* JADX INFO: renamed from: B */
    public static void m91827B(StringBuilder sb4, String str, String str2, C9598e c9598e, String str3) {
        sb4.append(str);
        sb4.append(str2);
        sb4.append(c9598e);
        sb4.append(str3);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m91828C(int i13) {
        if (i13 == 1) {
            return "DECLARATION";
        }
        if (i13 == 2) {
            return "FAKE_OVERRIDE";
        }
        if (i13 == 3) {
            return "DELEGATION";
        }
        if (i13 == 4) {
            return "SYNTHESIZED";
        }
        throw null;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ String m91829D(int i13) {
        switch (i13) {
            case 1:
                return "MONDAY";
            case 2:
                return "TUESDAY";
            case 3:
                return "WEDNESDAY";
            case 4:
                return "THURSDAY";
            case 5:
                return "FRIDAY";
            case 6:
                return "SATURDAY";
            case 7:
                return "SUNDAY";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ String m91830E(int i13) {
        if (i13 == 1) {
            return "DECLARATION";
        }
        if (i13 == 2) {
            return "FAKE_OVERRIDE";
        }
        if (i13 != 3) {
            return i13 != 4 ? "null" : "SYNTHESIZED";
        }
        return "DELEGATION";
    }

    public static int[] _values() {
        return AbstractC12682p.m35486f(7);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m91831a(int i13) {
        return i13 != 2;
    }

    /* JADX INFO: renamed from: b */
    public static int m91832b(int i13, String str) {
        return String.valueOf(str).length() + i13;
    }

    /* JADX INFO: renamed from: c */
    public static int m91833c(AbstractC22403o abstractC22403o, int i13, int i14) {
        return (abstractC22403o.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: d */
    public static int m91834d(InterfaceC24673e interfaceC24673e, int i13, int i14) {
        return (interfaceC24673e.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: e */
    public static Modifier m91835e(C2314t c2314t, float f13, C28655q c28655q, C2314t c2314t2, float f14) {
        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
        return AbstractC1102d.m3409f(f14, c2314t2);
    }

    /* JADX INFO: renamed from: f */
    public static String m91836f(double d3, String str, StringBuilder sb4) {
        sb4.append(d3);
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: g */
    public static String m91837g(float f13, String str, StringBuilder sb4) {
        sb4.append(f13);
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m91838h(int i13, String str, String str2, String str3, String str4) {
        return str + i13 + str2 + str3 + str4;
    }

    /* JADX INFO: renamed from: i */
    public static String m91839i(TextResource textResource, String str, String str2, String str3, List list) {
        return str + textResource + str2 + list + str3;
    }

    /* JADX INFO: renamed from: j */
    public static String m91840j(String str, String str2, String str3, StringBuilder sb4, List list) {
        sb4.append(str);
        sb4.append(str2);
        sb4.append(list);
        sb4.append(str3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m91841k(StringBuilder sb4, TextResource textResource, String str) {
        sb4.append(textResource);
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: l */
    public static String m91842l(StringBuilder sb4, String str, String str2, Map map, String str3) {
        sb4.append(str);
        sb4.append(str2);
        sb4.append(map);
        sb4.append(str3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: m */
    public static String m91843m(StringBuilder sb4, List list, String str, List list2, String str2) {
        sb4.append(list);
        sb4.append(str);
        sb4.append(list2);
        sb4.append(str2);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: n */
    public static StringBuilder m91844n(String str, int i13, String str2, TextResource textResource, String str3) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(i13);
        sb4.append(str2);
        sb4.append(textResource);
        sb4.append(str3);
        return sb4;
    }

    /* JADX INFO: renamed from: o */
    public static StringBuilder m91845o(String str, TextResource textResource, String str2, String str3, String str4) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(textResource);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(str4);
        return sb4;
    }

    /* JADX INFO: renamed from: p */
    public static StringBuilder m91846p(String str, TextResource textResource, String str2, boolean z4, String str3) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(textResource);
        sb4.append(str2);
        sb4.append(z4);
        sb4.append(str3);
        return sb4;
    }

    /* JADX INFO: renamed from: q */
    public static StringBuilder m91847q(String str, String str2, String str3, TextResource textResource, String str4) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(textResource);
        sb4.append(str4);
        return sb4;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ List m91848r(String str) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{str}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: s */
    public static void m91849s(int i13, int i14, int i15, int i16, int i17) {
        AbstractC32076h.m99769b(i13);
        AbstractC32076h.m99769b(i14);
        AbstractC32076h.m99769b(i15);
        AbstractC32076h.m99769b(i16);
        AbstractC32076h.m99769b(i17);
    }

    /* JADX INFO: renamed from: t */
    public static void m91850t(int i13, int i14, String str, String str2) {
        StringBuilder sb4 = new StringBuilder(i13);
        sb4.append(str);
        sb4.append(i14);
        Log.w(str2, sb4.toString());
    }

    /* JADX INFO: renamed from: u */
    public static void m91851u(C2314t c2314t, float f13, C28655q c28655q, boolean z4) {
        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
        c28655q.m87173q(z4);
    }

    /* JADX INFO: renamed from: v */
    public static void m91852v(TextResource textResource, String str, String str2, StringBuilder sb4, List list) {
        sb4.append(list);
        sb4.append(str);
        sb4.append(textResource);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m91853w(Integer num, String str, String str2, String str3, StringBuilder sb4) {
        sb4.append(str);
        sb4.append(str2);
        sb4.append(num);
        sb4.append(str3);
    }

    /* JADX INFO: renamed from: x */
    public static void m91854x(String str, boolean z4, ArrayList arrayList) {
        arrayList.add(str + z4);
    }

    /* JADX INFO: renamed from: y */
    public static void m91855y(StringBuilder sb4, TextResource textResource, String str, TextResource textResource2, String str2) {
        sb4.append(textResource);
        sb4.append(str);
        sb4.append(textResource2);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: z */
    public static void m91856z(StringBuilder sb4, TextResource textResource, String str, String str2, String str3) {
        sb4.append(textResource);
        sb4.append(str);
        sb4.append(str2);
        sb4.append(str3);
    }
}
