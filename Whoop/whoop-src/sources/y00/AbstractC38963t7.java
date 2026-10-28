package y00;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import com.whoop.analytics.AnalyticEventModel;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l83.C23465k;
import m83.AbstractC25247g0;
import p026b2.C2314t;
import p108e4.AbstractC12682p;
import p291l0.AbstractC22953f;
import p319m4.AbstractC25012a;
import p390p1.C28655q;
import p607x8.AbstractC38046a;
import p720m91.InterfaceC25312u;
import x81.C38072d;

/* JADX INFO: renamed from: y00.t7 */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC38963t7 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ String m124370A(int i13) {
        if (i13 == 1) {
            return "MERGE";
        }
        if (i13 == 2) {
            return "ADD";
        }
        if (i13 == 3) {
            return "SUBTRACT";
        }
        if (i13 != 4) {
            return i13 != 5 ? "null" : "EXCLUDE_INTERSECTIONS";
        }
        return "INTERSECT";
    }

    public static int[] _values() {
        return AbstractC12682p.m35486f(18);
    }

    /* JADX INFO: renamed from: a */
    public static final Paint.Cap m124371a(int i13) {
        int iM35485e = AbstractC12682p.m35485e(i13);
        if (iM35485e != 0) {
            return iM35485e != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
        }
        return Paint.Cap.BUTT;
    }

    /* JADX INFO: renamed from: b */
    public static final Paint.Join m124372b(int i13) {
        int iM35485e = AbstractC12682p.m35485e(i13);
        if (iM35485e == 0) {
            return Paint.Join.MITER;
        }
        if (iM35485e == 1) {
            return Paint.Join.ROUND;
        }
        if (iM35485e != 2) {
            return null;
        }
        return Paint.Join.BEVEL;
    }

    /* JADX INFO: renamed from: c */
    public static int m124373c(Date date, int i13, int i14) {
        return (date.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: d */
    public static Modifier m124374d(float f13, float f14, boolean z4) {
        return AbstractC1102d.m3409f(f14, new LayoutWeightElement(f13, z4));
    }

    /* JADX INFO: renamed from: e */
    public static Integer m124375e(C38072d c38072d) {
        return Integer.valueOf(c38072d.m121951d().getAction().getCross());
    }

    /* JADX INFO: renamed from: f */
    public static String m124376f(int i13, String str, String str2, String str3, StringBuilder sb4) {
        sb4.append(i13);
        sb4.append(str);
        sb4.append(str2);
        sb4.append(str3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: g */
    public static String m124377g(String str, String str2, String str3, StringBuilder sb4, List list) {
        sb4.append(list);
        sb4.append(str);
        sb4.append(str2);
        sb4.append(str3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: h */
    public static String m124378h(StringBuilder sb4, AnalyticEventModel analyticEventModel, String str) {
        sb4.append(analyticEventModel);
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m124379i(InterfaceC25312u interfaceC25312u, String str, String str2) {
        return str + interfaceC25312u + str2;
    }

    /* JADX INFO: renamed from: j */
    public static StringBuilder m124380j(String str, String str2, List list, String str3, List list2) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(list);
        sb4.append(str2);
        sb4.append(list2);
        sb4.append(str3);
        return sb4;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Map m124381k() {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("other_properties", "new-connectivity-flow")};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        Objects.requireNonNull(key);
        Object value = entry.getValue();
        Objects.requireNonNull(value);
        if (map.put(key, value) == null) {
            return Collections.unmodifiableMap(map);
        }
        throw new IllegalArgumentException(AbstractC25012a.m73375h(key, "duplicate key: "));
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Map m124382l(String str) {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("other_properties", "new-connectivity-flow"), new AbstractMap.SimpleEntry("strap_serial", str)};
        HashMap map = new HashMap(2);
        for (int i13 = 0; i13 < 2; i13++) {
            Map.Entry entry = entryArr[i13];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException(AbstractC25012a.m73375h(key, "duplicate key: "));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Map m124383m(String str, String str2) {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("other_properties", "new-connectivity-flow"), new AbstractMap.SimpleEntry("is_oobe", str), new AbstractMap.SimpleEntry("strap_serial", str2)};
        HashMap map = new HashMap(3);
        for (int i13 = 0; i13 < 3; i13++) {
            Map.Entry entry = entryArr[i13];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException(AbstractC25012a.m73375h(key, "duplicate key: "));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Map m124384n(String str, String str2, String str3) {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("other_properties", str), new AbstractMap.SimpleEntry("is_oobe", str2), new AbstractMap.SimpleEntry("strap_serial", str3)};
        HashMap map = new HashMap(3);
        for (int i13 = 0; i13 < 3; i13++) {
            Map.Entry entry = entryArr[i13];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException(AbstractC25012a.m73375h(key, "duplicate key: "));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: o */
    public static Map m124385o(String str, Map map) {
        return AbstractC25247g0.m73989X(new C23465k(str, map));
    }

    /* JADX INFO: renamed from: p */
    public static void m124386p(float f13, float f14, C2314t c2314t, C28655q c28655q) {
        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3424u(f13 * f14, c2314t));
    }

    /* JADX INFO: renamed from: q */
    public static void m124387q(int i13, int i14, int i15, HashMap map, String str) {
        map.put(str, Integer.valueOf(Color.rgb(i13, i14, i15)));
    }

    /* JADX INFO: renamed from: r */
    public static void m124388r(int i13, String str, String str2) {
        AbstractC38046a.m121826u(str2, str + i13);
    }

    /* JADX INFO: renamed from: s */
    public static void m124389s(int i13, String str, ArrayList arrayList) {
        arrayList.add(str + i13);
    }

    /* JADX INFO: renamed from: t */
    public static void m124390t(StringBuilder sb4, String str, String str2, boolean z4, String str3) {
        sb4.append(str);
        sb4.append(str2);
        sb4.append(z4);
        sb4.append(str3);
    }

    /* JADX INFO: renamed from: u */
    public static void m124391u(StringBuilder sb4, boolean z4, String str, String str2, String str3) {
        sb4.append(z4);
        sb4.append(str);
        sb4.append(str2);
        sb4.append(str3);
    }

    /* JADX INFO: renamed from: v */
    public static void m124392v(StringBuilder sb4, boolean z4, String str, boolean z13, String str2) {
        sb4.append(z4);
        sb4.append(str);
        sb4.append(z13);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ Map m124393w() {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("campaign_name", "Battery Full")};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        Objects.requireNonNull(key);
        Object value = entry.getValue();
        Objects.requireNonNull(value);
        if (map.put(key, value) == null) {
            return Collections.unmodifiableMap(map);
        }
        throw new IllegalArgumentException(AbstractC25012a.m73375h(key, "duplicate key: "));
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Map m124394x(String str) {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("other_properties", "new-connectivity-flow"), new AbstractMap.SimpleEntry("is_oobe", str)};
        HashMap map = new HashMap(2);
        for (int i13 = 0; i13 < 2; i13++) {
            Map.Entry entry = entryArr[i13];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException(AbstractC25012a.m73375h(key, "duplicate key: "));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ Map m124395y(String str, String str2) {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("other_properties", str), new AbstractMap.SimpleEntry("is_oobe", str2)};
        HashMap map = new HashMap(2);
        for (int i13 = 0; i13 < 2; i13++) {
            Map.Entry entry = entryArr[i13];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException(AbstractC25012a.m73375h(key, "duplicate key: "));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ String m124396z(int i13) {
        if (i13 == 1) {
            return "OVERRIDABLE";
        }
        if (i13 != 2) {
            return i13 != 3 ? "null" : "CONFLICT";
        }
        return "INCOMPATIBLE";
    }
}
