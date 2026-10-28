package te0;

import android.os.Parcel;
import androidx.compose.foundation.layout.AbstractC1102d;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.service.network.model.UserState;
import j11.EnumC21213p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l83.C23467m;
import p008a7.C0516g;
import p026b2.C2314t;
import p044c5.C4212d;
import p108e4.AbstractC12682p;
import p164g2.C15247s;
import p291l0.AbstractC22953f;
import p294l3.C23285v0;
import p390p1.C28655q;
import p505ts.AbstractC34132o;
import p607x8.AbstractC38065t;
import p720m91.InterfaceC25312u;
import p745y81.InterfaceC39332e;
import vg.C35956c;
import vg.C35961h;
import x81.C38072d;

/* JADX INFO: renamed from: te0.d */
/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC33745d {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ boolean m106639A(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C35956c c35956c, Object obj) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c35956c, obj, null)) {
            if (atomicReferenceFieldUpdater.get(c35956c) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ boolean m106640B(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C35956c c35956c, C35961h c35961h, C35961h c35961h2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c35956c, c35961h, c35961h2)) {
            if (atomicReferenceFieldUpdater.get(c35956c) != c35961h) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m106641C(int i13) {
        if (i13 == 1) {
            return "ATTEMPT_MIGRATION";
        }
        if (i13 == 2) {
            return "NOT_GENERATED";
        }
        if (i13 == 3) {
            return "UNREGISTERED";
        }
        if (i13 != 4) {
            return i13 != 5 ? "null" : "REGISTER_ERROR";
        }
        return "REGISTERED";
    }

    public static int[] _values() {
        return AbstractC12682p.m35486f(2);
    }

    /* JADX INFO: renamed from: a */
    public static final String m106642a(int i13) {
        return m106643b(i13);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m106643b(int i13) {
        if (i13 == 1) {
            return "lightMode";
        }
        if (i13 == 2) {
            return "darkMode";
        }
        if (i13 == 3) {
            return UserState.Sources.AUTO;
        }
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static int m106644c(int i13, int i14, Object obj) {
        return (obj.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: d */
    public static int m106645d(C0516g c0516g, int i13, int i14) {
        return (Integer.hashCode(c0516g.f1724a) + i13) * i14;
    }

    /* JADX INFO: renamed from: e */
    public static int m106646e(Parcel parcel, LinkedHashSet linkedHashSet, int i13, int i14) {
        linkedHashSet.add(parcel.readString());
        return i13 + i14;
    }

    /* JADX INFO: renamed from: f */
    public static int m106647f(EnumC21213p enumC21213p, int i13, int i14) {
        return (enumC21213p.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: g */
    public static int m106648g(InterfaceC39332e interfaceC39332e, int i13, int i14) {
        return (interfaceC39332e.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: h */
    public static C15247s m106649h(C28655q c28655q) {
        C15247s c15247s = new C15247s();
        c28655q.m87172p0(c15247s);
        return c15247s;
    }

    /* JADX INFO: renamed from: i */
    public static String m106650i(String str, C9598e c9598e, String str2) {
        return str + c9598e + str2;
    }

    /* JADX INFO: renamed from: j */
    public static String m106651j(String str, Boolean bool, String str2) {
        return str + bool + str2;
    }

    /* JADX INFO: renamed from: k */
    public static String m106652k(String str, Object obj, String str2, InterfaceC25312u interfaceC25312u, String str3) {
        return str + obj + str2 + interfaceC25312u + str3;
    }

    /* JADX INFO: renamed from: l */
    public static String m106653l(String str, String str2, InterfaceC4339a interfaceC4339a) {
        return str + interfaceC4339a + str2;
    }

    /* JADX INFO: renamed from: m */
    public static String m106654m(String str, String str2, List list) {
        return str + list + str2;
    }

    /* JADX INFO: renamed from: n */
    public static String m106655n(StringBuilder sb4, TextResource textResource, String str, TextResource textResource2, String str2) {
        sb4.append(textResource);
        sb4.append(str);
        sb4.append(textResource2);
        sb4.append(str2);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: o */
    public static String m106656o(StringBuilder sb4, C9598e c9598e, String str) {
        sb4.append(c9598e);
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: p */
    public static StringBuilder m106657p(TextResource textResource, String str, String str2, String str3, List list) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(textResource);
        sb4.append(str2);
        sb4.append(list);
        sb4.append(str3);
        return sb4;
    }

    /* JADX INFO: renamed from: q */
    public static StringBuilder m106658q(String str, TextResource textResource, String str2, TextResource textResource2, String str3) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(textResource);
        sb4.append(str2);
        sb4.append(textResource2);
        sb4.append(str3);
        return sb4;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ List m106659r(C4212d c4212d) {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{c4212d}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ List m106660s(C4212d c4212d, C4212d c4212d2) {
        Object[] objArr = {c4212d, c4212d2};
        ArrayList arrayList = new ArrayList(2);
        for (int i13 = 0; i13 < 2; i13++) {
            Object obj = objArr[i13];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: t */
    public static C23285v0 m106661t(C38072d c38072d, C28655q c28655q, int i13) {
        return c38072d.m121952e(c28655q, i13).getB1().getStyle();
    }

    /* JADX INFO: renamed from: u */
    public static C23467m m106662u(String str, Throwable th3) {
        return AbstractC34132o.m107888l(new DeserializationException(str, th3));
    }

    /* JADX INFO: renamed from: v */
    public static void m106663v(int i13, int i14, int i15, int i16, int i17) {
        AbstractC38065t.m121892F(i13);
        AbstractC38065t.m121892F(i14);
        AbstractC38065t.m121892F(i15);
        AbstractC38065t.m121892F(i16);
        AbstractC38065t.m121892F(i17);
    }

    /* JADX INFO: renamed from: w */
    public static void m106664w(TextResource textResource, String str, String str2, StringBuilder sb4, boolean z4) {
        sb4.append(textResource);
        sb4.append(str);
        sb4.append(z4);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: x */
    public static void m106665x(StringBuilder sb4, InterfaceC39332e interfaceC39332e, String str, TextResource textResource, String str2) {
        sb4.append(interfaceC39332e);
        sb4.append(str);
        sb4.append(textResource);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: y */
    public static void m106666y(StringBuilder sb4, boolean z4, String str, EnumC21213p enumC21213p, String str2) {
        sb4.append(z4);
        sb4.append(str);
        sb4.append(enumC21213p);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: z */
    public static void m106667z(C28655q c28655q, int i13, C2314t c2314t, float f13, C28655q c28655q2) {
        c28655q.m87150e0(i13);
        AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f13, c2314t));
    }
}
