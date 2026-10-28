package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.databinding.InterfaceC1178h;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.C1271a;
import androidx.health.platform.client.proto.C1483k;
import androidx.recyclerview.widget.RecyclerView;
import b91.C2886a;
import bc3.C3049q;
import bc3.C3060t1;
import bc3.C3062u0;
import bc3.InterfaceC3011g1;
import c93.InterfaceC4339a;
import gb1.AbstractC15673b0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jg3.C21682i;
import p026b2.C2314t;
import p108e4.AbstractC12682p;
import p291l0.AbstractC22953f;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: r */
/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC30802r {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ boolean m94748A(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C3060t1 c3060t1, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c3060t1, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(c3060t1) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ String m94749B(int i13) {
        switch (i13) {
            case 1:
                return "INVALID";
            case 2:
                return "UNSIGNED_INTEGER";
            case 3:
                return "NEGATIVE_INTEGER";
            case 4:
                return "BYTE_STRING";
            case 5:
                return "UNICODE_STRING";
            case 6:
                return "ARRAY";
            case 7:
                return "MAP";
            case 8:
                return "TAG";
            case 9:
                return "SPECIAL";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ String m94750C(int i13) {
        if (i13 == 1) {
            return "NONE";
        }
        if (i13 != 2) {
            return i13 != 3 ? "null" : "REMOVING";
        }
        return "ADDING";
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ String m94751D(int i13) {
        if (i13 == 1) {
            return "REMOVED";
        }
        if (i13 == 2) {
            return "VISIBLE";
        }
        if (i13 != 3) {
            return i13 != 4 ? "null" : "INVISIBLE";
        }
        return "GONE";
    }

    public static int[] _values() {
        return AbstractC12682p.m35486f(3);
    }

    /* JADX INFO: renamed from: a */
    public static final void m94752a(int i13, View view, ViewGroup container) {
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(container, "container");
        int iM35485e = AbstractC12682p.m35485e(i13);
        if (iM35485e == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (AbstractC1329o1.m4132M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iM35485e == 1) {
            if (AbstractC1329o1.m4132M(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (AbstractC1329o1.m4132M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (iM35485e == 2) {
            if (AbstractC1329o1.m4132M(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iM35485e != 3) {
            return;
        }
        if (AbstractC1329o1.m4132M(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    /* JADX INFO: renamed from: b */
    public static int m94753b(int i13, int i14, int i15) {
        return C1483k.m4656C(i13) + i14 + i15;
    }

    /* JADX INFO: renamed from: c */
    public static int m94754c(int i13, int i14, int i15, int i16) {
        return C1483k.m4657D(i13) + i14 + i15 + i16;
    }

    /* JADX INFO: renamed from: d */
    public static int m94755d(int i13, int i14, InterfaceC4339a interfaceC4339a) {
        return (interfaceC4339a.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: e */
    public static int m94756e(Function1 function1, int i13, int i14) {
        return (function1.hashCode() + i13) * i14;
    }

    /* JADX INFO: renamed from: f */
    public static Modifier m94757f(C2314t c2314t, float f13) {
        return AbstractC22953f.m66723l(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(f13, c2314t)));
    }

    /* JADX INFO: renamed from: g */
    public static C1271a m94758g(AbstractC1329o1 abstractC1329o1, AbstractC1329o1 abstractC1329o2) {
        abstractC1329o1.getClass();
        return new C1271a(abstractC1329o2);
    }

    /* JADX INFO: renamed from: h */
    public static Object m94759h(int i13, C28655q c28655q, boolean z4) {
        c28655q.m87173q(z4);
        c28655q.m87150e0(i13);
        return c28655q.m87133R();
    }

    /* JADX INFO: renamed from: i */
    public static String m94760i(RecyclerView recyclerView, StringBuilder sb4) {
        sb4.append(recyclerView.exceptionLabel());
        return sb4.toString();
    }

    /* JADX INFO: renamed from: j */
    public static String m94761j(String str, String str2, String str3, String str4, List list) {
        return str + list + str2 + str3 + str4;
    }

    /* JADX INFO: renamed from: k */
    public static String m94762k(String str, String str2, String str3, boolean z4, boolean z13) {
        return str + z4 + str2 + z13 + str3;
    }

    /* JADX INFO: renamed from: l */
    public static String m94763l(StringBuilder sb4, float f13, char c3) {
        sb4.append(f13);
        sb4.append(c3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: m */
    public static String m94764m(StringBuilder sb4, Map map, char c3) {
        sb4.append(map);
        sb4.append(c3);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: n */
    public static String m94765n(StringBuilder sb4, Map map, String str, Map map2, String str2) {
        sb4.append(map);
        sb4.append(str);
        sb4.append(map2);
        sb4.append(str2);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: o */
    public static StringBuilder m94766o(String str, String str2, String str3, String str4, List list) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(list);
        sb4.append(str4);
        return sb4;
    }

    /* JADX INFO: renamed from: p */
    public static StringBuilder m94767p(String str, C21682i c21682i, String str2, String str3, String str4) {
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append(str2);
        sb4.append(str3);
        sb4.append(c21682i);
        sb4.append(str4);
        return sb4;
    }

    /* JADX INFO: renamed from: q */
    public static StringBuilder m94768q(StringBuilder sb4, String str, char c3, StringBuilder sb5, String str2) {
        sb4.append(str);
        sb4.append(c3);
        sb5.append(sb4.toString());
        return new StringBuilder(str2);
    }

    /* JADX INFO: renamed from: r */
    public static void m94769r(int i13, String str, String str2, StringBuilder sb4, boolean z4) {
        sb4.append(z4);
        sb4.append(str);
        sb4.append(i13);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m94770s(InterfaceC1178h interfaceC1178h) {
        if (interfaceC1178h != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m94771t(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m94772u(StringBuilder sb4, float f13, String str, float f14, String str2) {
        sb4.append(f13);
        sb4.append(str);
        sb4.append(f14);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: v */
    public static void m94773v(StringBuilder sb4, int i13, String str, int i14, String str2) {
        sb4.append(i13);
        sb4.append(str);
        sb4.append(i14);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m94774w(StringBuilder sb4, C2886a c2886a, String str, C2886a c2886a2, String str2) {
        sb4.append(c2886a);
        sb4.append(str);
        sb4.append(c2886a2);
        sb4.append(str2);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m94775x(List list) {
        if (list != null) {
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m94776y(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C3060t1 c3060t1, C3062u0 c3062u0, InterfaceC3011g1 interfaceC3011g1) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c3060t1, c3062u0, interfaceC3011g1) && atomicReferenceFieldUpdater.get(c3060t1) == c3062u0) {
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ boolean m94777z(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C3060t1 c3060t1, C3062u0 c3062u0, C3049q c3049q) {
        while (!atomicReferenceFieldUpdater.compareAndSet(c3060t1, c3062u0, c3049q)) {
            if (atomicReferenceFieldUpdater.get(c3060t1) != c3062u0) {
                return false;
            }
        }
        return true;
    }
}
