package nh3;

import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import io.getstream.chat.android.p226ui.font.TextStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import l83.C23465k;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.p378tz.NameProvider;
import p108e4.AbstractC12682p;
import p390p1.EnumC28645n1;
import p395p6.C28863a1;
import p395p6.C28902n1;
import p395p6.C28906p;
import p395p6.C28912r;
import p395p6.C28915s;

/* JADX INFO: renamed from: nh3.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC26725a {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ String m79496A(int i13) {
        switch (i13) {
            case 1:
                return "JANUARY";
            case 2:
                return "FEBRUARY";
            case 3:
                return "MARCH";
            case 4:
                return "APRIL";
            case 5:
                return "MAY";
            case 6:
                return "JUNE";
            case 7:
                return "JULY";
            case 8:
                return "AUGUST";
            case 9:
                return "SEPTEMBER";
            case 10:
                return "OCTOBER";
            case 11:
                return "NOVEMBER";
            case 12:
                return "DECEMBER";
            default:
                return "null";
        }
    }

    public static int[] _values() {
        return AbstractC12682p.m35486f(12);
    }

    /* JADX INFO: renamed from: a */
    public static int m79497a(Drawable drawable, int i13, int i14) {
        return (drawable.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: b */
    public static int m79498b(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i13, int i14) {
        arrayList.add(creator.createFromParcel(parcel));
        return i13 + i14;
    }

    /* JADX INFO: renamed from: c */
    public static int m79499c(TextStyle textStyle, int i13, int i14) {
        return (textStyle.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: d */
    public static ClassCastException m79500d(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    /* JADX INFO: renamed from: e */
    public static String m79501e(String str, TextResource textResource, String str2, TextResource textResource2, String str3) {
        return str + textResource + str2 + textResource2 + str3;
    }

    /* JADX INFO: renamed from: f */
    public static String m79502f(String str, String str2, String str3, C9598e c9598e, String str4) {
        return str + str2 + str3 + c9598e + str4;
    }

    /* JADX INFO: renamed from: g */
    public static String m79503g(String str, String str2, String str3, String str4, boolean z4) {
        return str + str2 + str3 + z4 + str4;
    }

    /* JADX INFO: renamed from: h */
    public static String m79504h(String str, String str2, Map map) {
        return str + map + str2;
    }

    /* JADX INFO: renamed from: i */
    public static String m79505i(StringBuilder sb4, int i13, String str, int i14, String str2) {
        sb4.append(i13);
        sb4.append(str);
        sb4.append(i14);
        sb4.append(str2);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m79506j(StringBuilder sb4, GenericInteraction genericInteraction, String str) {
        sb4.append(genericInteraction);
        sb4.append(str);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: k */
    public static StringBuilder m79507k(String str, String str2, String str3, String str4, List list) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(list);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(str4);
        return sb4;
    }

    /* JADX INFO: renamed from: l */
    public static C23465k m79508l(int i13, C28906p c28906p) {
        return new C23465k(c28906p, new C28863a1(i13));
    }

    /* JADX INFO: renamed from: m */
    public static C23465k m79509m(int i13, C28915s c28915s) {
        return new C23465k(c28915s, new C28912r(i13));
    }

    /* JADX INFO: renamed from: n */
    public static C23465k m79510n(int i13, C28902n1 c28902n1) {
        return new C23465k(c28902n1, new C28863a1(i13));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m79511o(Object obj) {
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: p */
    public static void m79512p(String str, String str2, StringBuilder sb4, List list, boolean z4) {
        sb4.append(list);
        sb4.append(str);
        sb4.append(z4);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: q */
    public static void m79513q(String str, List list, ArrayList arrayList) {
        arrayList.add(str + list);
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ boolean m79514r(AtomicReference atomicReference) {
        EnumC28645n1 enumC28645n1 = EnumC28645n1.f115852F;
        EnumC28645n1 enumC28645n2 = EnumC28645n1.f115858z;
        while (!atomicReference.compareAndSet(enumC28645n1, enumC28645n2)) {
            if (atomicReference.get() != enumC28645n1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ boolean m79515s(AtomicReference atomicReference, Map map) {
        while (!atomicReference.compareAndSet(null, map)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ boolean m79516t(AtomicReference atomicReference, NameProvider nameProvider) {
        while (!atomicReference.compareAndSet(null, nameProvider)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ boolean m79517u(AtomicReferenceArray atomicReferenceArray, int i13, DateTimeFormatter dateTimeFormatter) {
        while (!atomicReferenceArray.compareAndSet(i13, null, dateTimeFormatter)) {
            if (atomicReferenceArray.get(i13) != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ boolean m79518v(AtomicReference atomicReference) {
        EnumC28645n1 enumC28645n1 = EnumC28645n1.f115857y;
        EnumC28645n1 enumC28645n2 = EnumC28645n1.f115858z;
        while (!atomicReference.compareAndSet(enumC28645n1, enumC28645n2)) {
            if (atomicReference.get() != enumC28645n1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ boolean m79519w(AtomicReference atomicReference) {
        EnumC28645n1 enumC28645n1 = EnumC28645n1.f115858z;
        EnumC28645n1 enumC28645n2 = EnumC28645n1.f115851E;
        while (!atomicReference.compareAndSet(enumC28645n1, enumC28645n2)) {
            if (atomicReference.get() != enumC28645n1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ boolean m79520x(AtomicReference atomicReference) {
        EnumC28645n1 enumC28645n1 = EnumC28645n1.f115851E;
        EnumC28645n1 enumC28645n2 = EnumC28645n1.f115858z;
        while (!atomicReference.compareAndSet(enumC28645n1, enumC28645n2)) {
            if (atomicReference.get() != enumC28645n1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ boolean m79521y(AtomicReference atomicReference) {
        EnumC28645n1 enumC28645n1 = EnumC28645n1.f115852F;
        EnumC28645n1 enumC28645n2 = EnumC28645n1.f115853G;
        while (!atomicReference.compareAndSet(enumC28645n1, enumC28645n2)) {
            if (atomicReference.get() != enumC28645n1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ boolean m79522z(AtomicReference atomicReference) {
        EnumC28645n1 enumC28645n1 = EnumC28645n1.f115858z;
        EnumC28645n1 enumC28645n2 = EnumC28645n1.f115852F;
        while (!atomicReference.compareAndSet(enumC28645n1, enumC28645n2)) {
            if (atomicReference.get() != enumC28645n1) {
                return false;
            }
        }
        return true;
    }
}
