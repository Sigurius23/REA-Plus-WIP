package p294l3;

import androidx.compose.runtime.Composer;
import java.util.ArrayList;
import java.util.List;
import kf0.C22437l;
import kx1.C22881b;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p006a4.AbstractC0355b;
import p027b3.AbstractC2453v1;
import p389p0.C28539n0;
import p390p1.C28635l;
import p390p1.C28655q;
import p392p3.InterfaceC28770h;
import p448r3.AbstractC30895a;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l3.s */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC23278s {

    /* JADX INFO: renamed from: a */
    public static final C23274q f92233a = new C23274q();

    /* JADX INFO: renamed from: b */
    public static final C28539n0 f92234b;

    /* JADX INFO: renamed from: c */
    public static final C28539n0 f92235c;

    /* JADX INFO: renamed from: d */
    public static final C28539n0 f92236d;

    static {
        int i13 = 10;
        f92234b = new C28539n0(i13, new C22437l(15), new C22881b(22));
        f92235c = new C28539n0(i13, new C22437l(16), new C22881b(23));
        f92236d = new C28539n0(i13, new C22437l(17), new C22881b(24));
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m67344a(int i13, int i14) {
        return i13 == i14;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m67345b(int i13, int i14) {
        return i13 == i14;
    }

    /* JADX INFO: renamed from: c */
    public static final int m67346c(int i13, List list) {
        int i14;
        byte b;
        int i15 = ((C23290y) AbstractC25265s.m74112P0(list)).f92272c;
        if (i13 > ((C23290y) AbstractC25265s.m74112P0(list)).f92272c) {
            AbstractC30895a.m95015a("Index " + i13 + " should be less or equal than last line's end " + i15);
        }
        int size = list.size() - 1;
        int i16 = 0;
        while (true) {
            if (i16 > size) {
                i14 = -(i16 + 1);
                break;
            }
            i14 = (i16 + size) >>> 1;
            C23290y c23290y = (C23290y) list.get(i14);
            if (c23290y.f92271b > i13) {
                b = 1;
            } else {
                b = c23290y.f92272c <= i13 ? (byte) -1 : (byte) 0;
            }
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i14 - 1;
            } else {
                i16 = i14 + 1;
            }
        }
        if (i14 >= 0 && i14 < list.size()) {
            return i14;
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i14, "Found paragraph index ", " should be in range [0, ");
        sbM30466t.append(list.size());
        sbM30466t.append(").\nDebug info: index=");
        sbM30466t.append(i13);
        sbM30466t.append(", paragraphs=[");
        sbM30466t.append(AbstractC0355b.m988b(31, null, list, new C22881b(21)));
        sbM30466t.append(']');
        AbstractC30895a.m95015a(sbM30466t.toString());
        return i14;
    }

    /* JADX INFO: renamed from: d */
    public static final int m67347d(int i13, List list) {
        byte b;
        int size = list.size() - 1;
        int i14 = 0;
        while (i14 <= size) {
            int i15 = (i14 + size) >>> 1;
            C23290y c23290y = (C23290y) list.get(i15);
            if (c23290y.f92273d > i13) {
                b = 1;
            } else {
                b = c23290y.f92274e <= i13 ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i14 = i15 + 1;
            } else {
                if (b <= 0) {
                    return i15;
                }
                size = i15 - 1;
            }
        }
        return -(i14 + 1);
    }

    /* JADX INFO: renamed from: e */
    public static final int m67348e(ArrayList arrayList, float f13) {
        byte b;
        if (f13 <= 0.0f) {
            return 0;
        }
        if (f13 >= ((C23290y) AbstractC25265s.m74112P0(arrayList)).f92276g) {
            return AbstractC37056f.m118951C(arrayList);
        }
        int size = arrayList.size() - 1;
        int i13 = 0;
        while (i13 <= size) {
            int i14 = (i13 + size) >>> 1;
            C23290y c23290y = (C23290y) arrayList.get(i14);
            if (c23290y.f92275f > f13) {
                b = 1;
            } else {
                b = c23290y.f92276g <= f13 ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i13 = i14 + 1;
            } else {
                if (b <= 0) {
                    return i14;
                }
                size = i14 - 1;
            }
        }
        return -(i13 + 1);
    }

    /* JADX INFO: renamed from: f */
    public static final void m67349f(ArrayList arrayList, long j7, Function1 function1) {
        int size = arrayList.size();
        for (int iM67346c = m67346c(C23283u0.m67360f(j7), arrayList); iM67346c < size; iM67346c++) {
            C23290y c23290y = (C23290y) arrayList.get(iM67346c);
            if (c23290y.f92271b >= C23283u0.m67359e(j7)) {
                return;
            }
            if (c23290y.f92271b != c23290y.f92272c) {
                function1.invoke(c23290y);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static final C23281t0 m67350g(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        InterfaceC28770h interfaceC28770h = (InterfaceC28770h) c28655q.m87161k(AbstractC2453v1.f9572k);
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        EnumC39181m enumC39181m = (EnumC39181m) c28655q.m87161k(AbstractC2453v1.f9575n);
        boolean zM87153g = c28655q.m87153g(interfaceC28770h) | c28655q.m87153g(interfaceC39171c) | c28655q.m87149e(enumC39181m.ordinal()) | c28655q.m87149e(8);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = new C23281t0(interfaceC28770h, interfaceC39171c, enumC39181m);
            c28655q.m87172p0(objM87133R);
        }
        return (C23281t0) objM87133R;
    }

    /* JADX INFO: renamed from: h */
    public static final C23250e m67351h(C23250e c23250e) {
        Object obj = c23250e.f92125a;
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
        return new C23250e(c23250e.f92126b, c23250e.f92127c, ((C23271o0) obj).f92213a, c23250e.f92128d);
    }
}
