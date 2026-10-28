package jh3;

import androidx.compose.foundation.layout.AbstractC1102d;
import b23.EnumC2341g;
import b23.InterfaceC2344j;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kc3.AbstractRunnableC22369i;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p291l0.AbstractC22953f;
import p390p1.C28655q;
import p499t9.InterfaceC33639k0;
import p516u8.C34608o;
import p516u8.C34610p;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.EnumC24674f;
import p745y81.EnumC39333f;
import s30.AbstractC32103e;

/* JADX INFO: renamed from: jh3.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC21702c {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ String m61128A(int i13) {
        if (i13 != 1) {
            return i13 != 2 ? "null" : "FLUSH";
        }
        return "EVENT";
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ String m61129B(int i13) {
        if (i13 == 1) {
            return "FIXED";
        }
        if (i13 == 2) {
            return "WRAP_CONTENT";
        }
        if (i13 != 3) {
            return i13 != 4 ? "null" : "MATCH_PARENT";
        }
        return "MATCH_CONSTRAINT";
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ String m61130a(int i13) {
        switch (i13) {
            case 1:
                return "$set";
            case 2:
                return "$setOnce";
            case 3:
                return "$add";
            case 4:
                return "$append";
            case 5:
                return "$clearAll";
            case 6:
                return "$prepend";
            case 7:
                return "$unset";
            case 8:
                return "$preInsert";
            case 9:
                return "$postInsert";
            case 10:
                return "$remove";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m61131b(Instant instant, int i13, int i14) {
        return (instant.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: c */
    public static int m61132c(EnumC39333f enumC39333f, int i13, int i14) {
        return (enumC39333f.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: d */
    public static TextResource m61133d(C2314t c2314t, float f13, C28655q c28655q, String str) {
        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f13, c2314t));
        return AbstractC8693b.m21278l(str);
    }

    /* JADX INFO: renamed from: e */
    public static String m61134e(Object obj, String str) {
        return str.concat(obj.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: f */
    public static String m61135f(String str, String str2, AnyModal anyModal) {
        return str + anyModal + str2;
    }

    /* JADX INFO: renamed from: g */
    public static String m61136g(String str, EnumC24674f enumC24674f, String str2) {
        return str + enumC24674f + str2;
    }

    /* JADX INFO: renamed from: h */
    public static String m61137h(StringBuilder sb4, String str, String str2, boolean z4, String str3) {
        sb4.append(str);
        sb4.append(str2);
        sb4.append(z4);
        sb4.append(str3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: i */
    public static String m61138i(StringBuilder sb4, EnumC39333f enumC39333f, String str) {
        sb4.append(enumC39333f);
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m61139j(StringBuilder sb4, boolean z4, String str, String str2, String str3) {
        sb4.append(z4);
        sb4.append(str);
        sb4.append(str2);
        sb4.append(str3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: k */
    public static StringBuilder m61140k(String str, TextResource textResource, String str2, EnumC16313m0 enumC16313m0, String str3) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(textResource);
        sb4.append(str2);
        sb4.append(enumC16313m0);
        sb4.append(str3);
        return sb4;
    }

    /* JADX INFO: renamed from: l */
    public static StringBuilder m61141l(String str, String str2, String str3, EnumC16313m0 enumC16313m0, String str4) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(enumC16313m0);
        sb4.append(str4);
        return sb4;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m61142m(int i13, String str) {
        if (i13 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(AbstractC2875y.m8299l(str, " must not be null"));
        AbstractC22676k.m65754n(nullPointerException, AbstractC22676k.class.getName());
        throw nullPointerException;
    }

    /* JADX INFO: renamed from: n */
    public static void m61143n(TextResource textResource, String str, String str2, StringBuilder sb4, List list) {
        sb4.append(textResource);
        sb4.append(str);
        sb4.append(list);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: o */
    public static void m61144o(TextResource textResource, String str, String str2, StringBuilder sb4, boolean z4) {
        sb4.append(z4);
        sb4.append(str);
        sb4.append(textResource);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: p */
    public static void m61145p(Object obj, String str, InterfaceC2344j interfaceC2344j, EnumC2341g enumC2341g, String str2) {
        interfaceC2344j.log(enumC2341g, str2, str.concat(obj.getClass().getSimpleName()), null);
    }

    /* JADX INFO: renamed from: q */
    public static void m61146q(StringBuilder sb4, Double d3, String str, Double d14, String str2) {
        sb4.append(d3);
        sb4.append(str);
        sb4.append(d14);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: r */
    public static void m61147r(StringBuilder sb4, Long l7, String str, Long l12, String str2) {
        sb4.append(l7);
        sb4.append(str);
        sb4.append(l12);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: s */
    public static void m61148s(StringBuilder sb4, List list, String str, List list2, String str2) {
        sb4.append(list);
        sb4.append(str);
        sb4.append(list2);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: t */
    public static void m61149t(ArrayList arrayList, String str, String str2) {
        arrayList.add(str2.concat(AbstractC32103e.m99893p(str)));
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m61150u(AtomicReference atomicReference, C21703d c21703d) {
        while (!atomicReference.compareAndSet(null, c21703d) && atomicReference.get() == null) {
        }
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m61151v(AtomicReference atomicReference, C21704e c21704e) {
        while (!atomicReference.compareAndSet(null, c21704e) && atomicReference.get() == null) {
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m61152w(C34608o c34608o, InterfaceC33639k0 interfaceC33639k0) {
        interfaceC33639k0.mo36173a(new C34610p(c34608o));
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ boolean m61153x(AtomicReferenceArray atomicReferenceArray, int i13, AbstractRunnableC22369i abstractRunnableC22369i) {
        while (!atomicReferenceArray.compareAndSet(i13, abstractRunnableC22369i, null)) {
            if (atomicReferenceArray.get(i13) != abstractRunnableC22369i) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public static TextResource m61154y(C2314t c2314t, float f13, C28655q c28655q, String str) {
        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
        return AbstractC8693b.m21278l(str);
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ String m61155z(int i13) {
        if (i13 == 1) {
            return "FIXED";
        }
        if (i13 == 2) {
            return "WRAP_CONTENT";
        }
        if (i13 == 3) {
            return "MATCH_CONSTRAINT";
        }
        if (i13 == 4) {
            return "MATCH_PARENT";
        }
        throw null;
    }
}
