package p555vl;

import android.os.Parcel;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import gb1.AbstractC15673b0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import jf3.C21647a;
import kd1.AbstractC22403o;
import l83.C23465k;
import m83.AbstractC25247g0;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p323m8.AbstractC25218a;
import p363ob.C27785h;
import p390p1.C28655q;
import p399pb.InterfaceC29049f;
import p607x8.AbstractC38046a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33211q0;

/* JADX INFO: renamed from: vl.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC36095b {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ String m114671A(int i13) {
        if (i13 == 1) {
            return "OK";
        }
        if (i13 != 2) {
            return i13 != 3 ? "null" : "AUTH_ERROR";
        }
        return "BAD_CONFIG";
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ String m114672B(int i13) {
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
    public static int m114673a(C9598e c9598e, int i13, int i14) {
        return (c9598e.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: b */
    public static int m114674b(TargetGoalType targetGoalType, int i13, int i14) {
        return (targetGoalType.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: c */
    public static Modifier m114675c(C2314t c2314t, float f13) {
        return AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(f13, c2314t)));
    }

    /* JADX INFO: renamed from: d */
    public static TextResource m114676d(C28655q c28655q, int i13, C33211q0 c33211q0) {
        c28655q.m87150e0(i13);
        return c33211q0.getType().getTitle();
    }

    /* JADX INFO: renamed from: e */
    public static String m114677e(int i13, String str) {
        StringBuilder sb4 = new StringBuilder(i13);
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: f */
    public static String m114678f(String str, TextResource textResource, String str2) {
        return str + textResource + str2;
    }

    /* JADX INFO: renamed from: g */
    public static String m114679g(String str, String str2, String str3, String str4, List list) {
        return str + str2 + str3 + list + str4;
    }

    /* JADX INFO: renamed from: h */
    public static String m114680h(String str, String str2, String str3, String str4, Map map) {
        return str + str2 + str3 + map + str4;
    }

    /* JADX INFO: renamed from: i */
    public static String m114681i(String str, String str2, Throwable th3) {
        return str + th3 + str2;
    }

    /* JADX INFO: renamed from: j */
    public static String m114682j(StringBuilder sb4, boolean z4, String str, boolean z13, String str2) {
        sb4.append(z4);
        sb4.append(str);
        sb4.append(z13);
        sb4.append(str2);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: k */
    public static StringBuilder m114683k(String str, TextResource textResource, AbstractC22403o abstractC22403o, String str2, String str3) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(abstractC22403o);
        sb4.append(str2);
        sb4.append(textResource);
        sb4.append(str3);
        return sb4;
    }

    /* JADX INFO: renamed from: l */
    public static StringBuilder m114684l(String str, Integer num, String str2, Integer num2, String str3) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(num);
        sb4.append(str2);
        sb4.append(num2);
        sb4.append(str3);
        return sb4;
    }

    /* JADX INFO: renamed from: m */
    public static StringBuilder m114685m(String str, String str2, long j7, String str3) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(j7);
        sb4.append(str2);
        sb4.append(str3);
        return sb4;
    }

    /* JADX INFO: renamed from: n */
    public static StringBuilder m114686n(String str, String str2, String str3, String str4, Map map) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(map);
        sb4.append(str4);
        return sb4;
    }

    /* JADX INFO: renamed from: o */
    public static HashSet m114687o(HashMap map, String str, C27785h c27785h, int i13) {
        map.put(str, c27785h);
        return new HashSet(i13);
    }

    /* JADX INFO: renamed from: p */
    public static Map m114688p(Boolean bool, String str) {
        return AbstractC25247g0.m73989X(new C23465k(str, bool));
    }

    /* JADX INFO: renamed from: q */
    public static Map m114689q(Object obj, String str) {
        return AbstractC25247g0.m73989X(new C23465k(str, obj));
    }

    /* JADX INFO: renamed from: r */
    public static C21647a m114690r(C28655q c28655q, int i13, C28655q c28655q2, boolean z4, int i14) {
        c28655q.m87152f0(i13);
        c28655q2.m87152f0(-2087252910);
        InterfaceC1583f2 interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q2);
        AbstractC22676k.m65747g(interfaceC1583f2M73844a);
        InterfaceC29049f interfaceC29049f = (InterfaceC29049f) c28655q2.m87161k(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner());
        C1579e2 viewModelStore = interfaceC1583f2M73844a.getViewModelStore();
        AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
        C21647a c21647a = new C21647a(viewModelStore, interfaceC29049f);
        c28655q2.m87173q(false);
        c28655q.m87173q(z4);
        c28655q.m87152f0(i14);
        return c21647a;
    }

    /* JADX INFO: renamed from: s */
    public static void m114691s(Parcel parcel, int i13, Boolean bool) {
        parcel.writeInt(i13);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    /* JADX INFO: renamed from: t */
    public static void m114692t(Boolean bool, String str, String str2, String str3, StringBuilder sb4) {
        sb4.append(str);
        sb4.append(str2);
        sb4.append(bool);
        sb4.append(str3);
    }

    /* JADX INFO: renamed from: u */
    public static void m114693u(String str, String str2, String str3) {
        AbstractC38046a.m121826u(str3, str + str2);
    }

    /* JADX INFO: renamed from: v */
    public static void m114694v(String str, String str2, String str3, StringBuilder sb4, List list) {
        sb4.append(str);
        sb4.append(str2);
        sb4.append(list);
        sb4.append(str3);
    }

    /* JADX INFO: renamed from: w */
    public static void m114695w(StringBuilder sb4, String str, String str2, Map map, String str3) {
        sb4.append(str);
        sb4.append(str2);
        sb4.append(map);
        sb4.append(str3);
    }

    /* JADX INFO: renamed from: x */
    public static void m114696x(HashMap map, String str, Integer num, int i13, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ String m114697y(int i13) {
        switch (i13) {
            case 1:
                return "YEAR";
            case 2:
                return "MONTH";
            case 3:
                return "DAY";
            case 4:
                return "HOUR";
            case 5:
                return "MINUTE";
            case 6:
                return "SECOND";
            case 7:
                return "NANO";
            case 8:
                return "ZONE_OFFSET";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ String m114698z(int i13) {
        if (i13 != 1) {
            return i13 != 2 ? "null" : "BAD_CONFIG";
        }
        return "OK";
    }
}
