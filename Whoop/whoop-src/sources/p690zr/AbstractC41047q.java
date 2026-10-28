package p690zr;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p463rj.AbstractC31479j;
import p463rj.AbstractC31484o;
import p550vd.AbstractC35903f;
import p658yr.C39720g;
import p658yr.InterfaceC39718e;
import p658yr.InterfaceC39719f;

/* JADX INFO: renamed from: zr.q */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC41047q {
    /* JADX INFO: renamed from: a */
    public static int m133271a(int i13) {
        if (i13 < 3) {
            m133273c(i13, "expectedSize");
            return i13 + 1;
        }
        if (i13 < 1073741824) {
            return (int) Math.ceil(((double) i13) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: b */
    public static void m133272b(int i13, Object[] objArr) {
        for (int i14 = 0; i14 < i13; i14++) {
            if (objArr[i14] == null) {
                throw new NullPointerException(AbstractC2875y.m8295h(i14, "at index "));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m133273c(int i13, String str) {
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC25012a.m73373f(i13, str, " cannot be negative but was: "));
        }
    }

    /* JADX INFO: renamed from: d */
    public static Object m133274d(int i13) {
        if (i13 < 2 || i13 > 1073741824 || Integer.highestOneBit(i13) != i13) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i13 <= 256) {
            return new byte[i13];
        }
        return i13 <= 65536 ? new short[i13] : new int[i13];
    }

    /* JADX INFO: renamed from: e */
    public static boolean m133275e(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m133276f(Object obj, Set set) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static C41021f1 m133277g(Set set, InterfaceC39719f interfaceC39719f) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof C41021f1)) {
                return new C41024g1(set2, interfaceC39719f);
            }
            C41021f1 c41021f1 = (C41021f1) set2;
            InterfaceC39719f interfaceC39719f2 = c41021f1.f176996x;
            interfaceC39719f2.getClass();
            return new C41024g1((SortedSet) c41021f1.f176995w, new C39720g(Arrays.asList(interfaceC39719f2, interfaceC39719f)));
        }
        if (!(set instanceof C41021f1)) {
            set.getClass();
            return new C41021f1(set, interfaceC39719f);
        }
        C41021f1 c41021f2 = (C41021f1) set;
        InterfaceC39719f interfaceC39719f3 = c41021f2.f176996x;
        interfaceC39719f3.getClass();
        return new C41021f1(c41021f2.f176995w, new C39720g(Arrays.asList(interfaceC39719f3, interfaceC39719f)));
    }

    /* JADX INFO: renamed from: h */
    public static Object m133278h(String str, AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    /* JADX INFO: renamed from: i */
    public static Object m133279i(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return AbstractC11266d.m30455i(1, list);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* JADX INFO: renamed from: j */
    public static int m133280j(Set set) {
        Iterator it = set.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i13 = ~(~(i13 + (next != null ? next.hashCode() : 0)));
        }
        return i13;
    }

    /* JADX INFO: renamed from: k */
    public static C41018e1 m133281k(Set set, AbstractC41032j0 abstractC41032j0) {
        AbstractC31484o.m96958j(set, "set1");
        AbstractC31484o.m96958j(abstractC41032j0, "set2");
        return new C41018e1(set, abstractC41032j0);
    }

    /* JADX INFO: renamed from: l */
    public static int m133282l(int i13, int i14, int i15) {
        return (i13 & (~i15)) | (i14 & i15);
    }

    /* JADX INFO: renamed from: m */
    public static ArrayList m133283m(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        m133273c(length, "arraySize");
        ArrayList arrayList = new ArrayList(AbstractC35903f.m113994L(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public static int m133284n(Object obj, Object obj2, int i13, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM133287q = m133287q(obj);
        int i14 = iM133287q & i13;
        int iM133288r = m133288r(i14, obj3);
        if (iM133288r != 0) {
            int i15 = ~i13;
            int i16 = iM133287q & i15;
            int i17 = -1;
            while (true) {
                int i18 = iM133288r - 1;
                int i19 = iArr[i18];
                if ((i19 & i15) == i16 && AbstractC31479j.m96940s(obj, objArr[i18]) && (objArr2 == null || AbstractC31479j.m96940s(obj2, objArr2[i18]))) {
                    int i24 = i19 & i13;
                    if (i17 == -1) {
                        m133289s(i14, i24, obj3);
                        return i18;
                    }
                    iArr[i17] = m133282l(iArr[i17], i24, i13);
                    return i18;
                }
                int i25 = i19 & i13;
                if (i25 == 0) {
                    break;
                }
                i17 = i18;
                iM133288r = i25;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: o */
    public static void m133285o(List list, InterfaceC39719f interfaceC39719f, int i13, int i14) {
        for (int size = list.size() - 1; size > i14; size--) {
            if (interfaceC39719f.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i15 = i14 - 1; i15 >= i13; i15--) {
            list.remove(i15);
        }
    }

    /* JADX INFO: renamed from: p */
    public static int m133286p(int i13) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i13) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: q */
    public static int m133287q(Object obj) {
        return m133286p(obj == null ? 0 : obj.hashCode());
    }

    /* JADX INFO: renamed from: r */
    public static int m133288r(int i13, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i13] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i13] & 65535 : ((int[]) obj)[i13];
    }

    /* JADX INFO: renamed from: s */
    public static void m133289s(int i13, int i14, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i13] = (byte) i14;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i13] = (short) i14;
        } else {
            ((int[]) obj)[i13] = i14;
        }
    }

    /* JADX INFO: renamed from: t */
    public static AbstractList m133290t(List list, InterfaceC39718e interfaceC39718e) {
        return list != null ? new C41044o0(list, interfaceC39718e) : new C41046p0(list, interfaceC39718e);
    }
}
