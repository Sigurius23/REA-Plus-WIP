package m83;

import com.whoop.data.local.room.dao.persistent.C6494e;
import d93.InterfaceC11820a;
import d93.InterfaceC11821b;
import e93.AbstractC12889b;
import g93.AbstractC15612d;
import g93.C15611c;
import i93.C18284j;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import l83.C23465k;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import v63.AbstractC35745c;
import va3.AbstractC35854l;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: m83.s */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25265s extends AbstractC25269w {
    /* JADX INFO: renamed from: A0 */
    public static List m74086A0(int i13, List list) {
        AbstractC22676k.m65750j(list, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Requested element count ", " is less than zero.").toString());
        }
        List list2 = list;
        int size = list.size() - i13;
        if (size < 0) {
            size = 0;
        }
        return m74156w1(list2, size);
    }

    /* JADX INFO: renamed from: A1 */
    public static void m74087A1(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC22676k.m65750j(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: B0 */
    public static Object m74088B0(Iterable iterable, int i13) {
        AbstractC22676k.m65750j(iterable, "<this>");
        boolean z4 = iterable instanceof List;
        if (z4) {
            return ((List) iterable).get(i13);
        }
        C6494e c6494e = new C6494e(i13, 22);
        if (z4) {
            List list = (List) iterable;
            if (i13 >= 0 && i13 < list.size()) {
                return list.get(i13);
            }
            c6494e.invoke(Integer.valueOf(i13));
            throw null;
        }
        if (i13 < 0) {
            c6494e.invoke(Integer.valueOf(i13));
            throw null;
        }
        int i14 = 0;
        for (Object obj : iterable) {
            int i15 = i14 + 1;
            if (i13 == i14) {
                return obj;
            }
            i14 = i15;
        }
        c6494e.invoke(Integer.valueOf(i13));
        throw null;
    }

    /* JADX INFO: renamed from: B1 */
    public static float[] m74089B1(Collection collection) {
        AbstractC22676k.m65750j(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            fArr[i13] = ((Number) it.next()).floatValue();
            i13++;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: C0 */
    public static final boolean m74090C0(Iterable iterable, Function1 function1, boolean z4) {
        Iterator it = iterable.iterator();
        boolean z13 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z4) {
                it.remove();
                z13 = true;
            }
        }
        return z13;
    }

    /* JADX INFO: renamed from: C1 */
    public static int[] m74091C1(Collection collection) {
        AbstractC22676k.m65750j(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            iArr[i13] = ((Number) it.next()).intValue();
            i13++;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: D0 */
    public static ArrayList m74092D0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D1 */
    public static List m74093D1(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC37056f.m118966U(m74099G1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C25271y.f99162w;
        }
        if (size != 1) {
            return m74097F1(collection);
        }
        return AbstractC37056f.m118958J(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    /* JADX INFO: renamed from: E0 */
    public static Object m74094E0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        if (iterable instanceof List) {
            return m74096F0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* JADX INFO: renamed from: E1 */
    public static long[] m74095E1(Collection collection) {
        AbstractC22676k.m65750j(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            jArr[i13] = ((Number) it.next()).longValue();
            i13++;
        }
        return jArr;
    }

    /* JADX INFO: renamed from: F0 */
    public static Object m74096F0(List list) {
        AbstractC22676k.m65750j(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: F1 */
    public static ArrayList m74097F1(Collection collection) {
        AbstractC22676k.m65750j(collection, "<this>");
        return new ArrayList(collection);
    }

    /* JADX INFO: renamed from: G0 */
    public static Object m74098G0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: G1 */
    public static final List m74099G1(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m74097F1((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m74087A1(iterable, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: H0 */
    public static Object m74100H0(List list) {
        AbstractC22676k.m65750j(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: H1 */
    public static Set m74101H1(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m74087A1(iterable, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: I0 */
    public static Object m74102I0(int i13, List list) {
        AbstractC22676k.m65750j(list, "<this>");
        if (i13 < 0 || i13 >= list.size()) {
            return null;
        }
        return list.get(i13);
    }

    /* JADX INFO: renamed from: I1 */
    public static Set m74103I1(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return AbstractC12350b.m34570S(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC25247g0.m73988W(collection.size()));
                m74087A1(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            m74087A1(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : AbstractC12350b.m34570S(linkedHashSet2.iterator().next());
            }
        }
        return C25235a0.f99113w;
    }

    /* JADX INFO: renamed from: J0 */
    public static int m74104J0(Iterable iterable, Object obj) {
        AbstractC22676k.m65750j(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i13 = 0;
        for (Object obj2 : iterable) {
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            if (AbstractC22676k.m65745e(obj, obj2)) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: J1 */
    public static C25263q m74105J1(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        return new C25263q(new C25262p(iterable, 1), 1);
    }

    /* JADX INFO: renamed from: K0 */
    public static LinkedHashSet m74106K0(Iterable iterable, Iterable other) {
        AbstractC22676k.m65750j(iterable, "<this>");
        AbstractC22676k.m65750j(other, "other");
        Collection collectionM74157x0 = m74157x0(other);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionM74157x0.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: K1 */
    public static ArrayList m74107K1(Iterable iterable, Iterable other) {
        AbstractC22676k.m65750j(iterable, "<this>");
        AbstractC22676k.m65750j(other, "other");
        Iterator it = iterable.iterator();
        Iterator it3 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC25267u.m74163i0(iterable, 10), AbstractC25267u.m74163i0(other, 10)));
        while (it.hasNext() && it3.hasNext()) {
            arrayList.add(new C23465k(it.next(), it3.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: L0 */
    public static final void m74108L0(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, CharSequence charSequence, Function1 function1) throws IOException {
        AbstractC22676k.m65750j(iterable, "<this>");
        AbstractC22676k.m65750j(buffer, "buffer");
        AbstractC22676k.m65750j(separator, "separator");
        AbstractC22676k.m65750j(prefix, "prefix");
        AbstractC22676k.m65750j(postfix, "postfix");
        buffer.append(prefix);
        int i13 = 0;
        for (Object obj : iterable) {
            i13++;
            if (i13 > 1) {
                buffer.append(separator);
            }
            AbstractC35854l.m113828h(buffer, obj, function1);
        }
        buffer.append(postfix);
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m74109M0(Iterable iterable, Appendable appendable, String str, String str2, String str3, Function1 function1, int i13) throws IOException {
        if ((i13 & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i13 & 4) != 0 ? "" : str2;
        String str6 = (i13 & 8) != 0 ? "" : str3;
        if ((i13 & 64) != 0) {
            function1 = null;
        }
        m74108L0(iterable, appendable, str4, str5, str6, "...", function1);
    }

    /* JADX INFO: renamed from: N0 */
    public static String m74110N0(Iterable iterable, CharSequence charSequence, String str, String str2, Function1 function1, int i13) {
        if ((i13 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence separator = charSequence;
        String prefix = (i13 & 2) != 0 ? "" : str;
        String str3 = (i13 & 4) != 0 ? "" : str2;
        if ((i13 & 32) != 0) {
            function1 = null;
        }
        AbstractC22676k.m65750j(iterable, "<this>");
        AbstractC22676k.m65750j(separator, "separator");
        AbstractC22676k.m65750j(prefix, "prefix");
        StringBuilder sb4 = new StringBuilder();
        m74108L0(iterable, sb4, separator, prefix, str3, "...", function1);
        return sb4.toString();
    }

    /* JADX INFO: renamed from: O0 */
    public static Object m74111O0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        if (iterable instanceof List) {
            return m74112P0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: P0 */
    public static Object m74112P0(List list) {
        AbstractC22676k.m65750j(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC37056f.m118951C(list));
    }

    /* JADX INFO: renamed from: Q0 */
    public static Object m74113Q0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return AbstractC11266d.m30455i(1, list);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: R0 */
    public static Object m74114R0(List list) {
        AbstractC22676k.m65750j(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return AbstractC11266d.m30455i(1, list);
    }

    /* JADX INFO: renamed from: S0 */
    public static Comparable m74115S0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: T0 */
    public static Double m74116T0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, ((Number) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    /* JADX INFO: renamed from: U0 */
    public static Float m74117U0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX INFO: renamed from: V0 */
    public static double m74118V0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, ((Number) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX INFO: renamed from: W0 */
    public static Comparable m74119W0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: X0 */
    public static Comparable m74120X0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: Y0 */
    public static Float m74121Y0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* JADX INFO: renamed from: Z0 */
    public static double m74122Z0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, ((Number) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX INFO: renamed from: a1 */
    public static Comparable m74123a1(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* JADX INFO: renamed from: b1 */
    public static ArrayList m74124b1(Iterable iterable, Object obj) {
        AbstractC22676k.m65750j(iterable, "<this>");
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        boolean z4 = false;
        for (Object obj2 : iterable) {
            boolean z13 = true;
            if (!z4 && AbstractC22676k.m65745e(obj2, obj)) {
                z4 = true;
                z13 = false;
            }
            if (z13) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c1 */
    public static List m74125c1(Iterable iterable, Iterable elements) {
        AbstractC22676k.m65750j(iterable, "<this>");
        AbstractC22676k.m65750j(elements, "elements");
        Collection collectionM74157x0 = m74157x0(elements);
        if (collectionM74157x0.isEmpty()) {
            return m74093D1(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionM74157x0.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d1 */
    public static ArrayList m74126d1(Iterable iterable, Iterable iterable2) {
        AbstractC22676k.m65750j(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m74129g1((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        m74141p0(arrayList, iterable);
        m74141p0(arrayList, iterable2);
        return arrayList;
    }

    /* JADX INFO: renamed from: e1 */
    public static ArrayList m74127e1(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return m74128f1(obj, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m74141p0(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: f1 */
    public static ArrayList m74128f1(Object obj, Collection collection) {
        AbstractC22676k.m65750j(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX INFO: renamed from: g1 */
    public static ArrayList m74129g1(Collection collection, Iterable elements) {
        AbstractC22676k.m65750j(collection, "<this>");
        AbstractC22676k.m65750j(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            m74141p0(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: h1 */
    public static ArrayList m74130h1(Collection collection, Object[] elements) {
        AbstractC22676k.m65750j(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + elements.length);
        arrayList.addAll(collection);
        m74139o0(arrayList, elements);
        return arrayList;
    }

    /* JADX INFO: renamed from: i1 */
    public static Object m74131i1(Collection collection) {
        C15611c c15611c = AbstractC15612d.f58612w;
        AbstractC22676k.m65750j(collection, "<this>");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return m74088B0(collection, AbstractC15612d.f58613x.mo43929g(collection.size()));
    }

    /* JADX INFO: renamed from: j1 */
    public static void m74132j1(List list, Function1 predicate) {
        int iM118951C;
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof InterfaceC11820a) && !(list instanceof InterfaceC11821b)) {
                AbstractC22681m0.m65778i(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                m74090C0(list, predicate, true);
                return;
            } catch (ClassCastException e5) {
                AbstractC22676k.m65754n(e5, AbstractC22681m0.class.getName());
                throw e5;
            }
        }
        int iM118951C2 = AbstractC37056f.m118951C(list);
        int i13 = 0;
        if (iM118951C2 >= 0) {
            int i14 = 0;
            while (true) {
                Object obj = list.get(i13);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i14 != i13) {
                        list.set(i14, obj);
                    }
                    i14++;
                }
                if (i13 == iM118951C2) {
                    break;
                } else {
                    i13++;
                }
            }
            i13 = i14;
        }
        if (i13 >= list.size() || i13 > (iM118951C = AbstractC37056f.m118951C(list))) {
            return;
        }
        while (true) {
            list.remove(iM118951C);
            if (iM118951C == i13) {
                return;
            } else {
                iM118951C--;
            }
        }
    }

    /* JADX INFO: renamed from: k1 */
    public static Object m74133k1(ArrayList arrayList) {
        AbstractC22676k.m65750j(arrayList, "<this>");
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.remove(0);
    }

    /* JADX INFO: renamed from: l1 */
    public static Object m74134l1(List list) {
        AbstractC22676k.m65750j(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(AbstractC37056f.m118951C(list));
    }

    /* JADX INFO: renamed from: m0 */
    public static final int m74135m0(int i13, List list) {
        if (i13 >= 0 && i13 <= AbstractC37056f.m118951C(list)) {
            return AbstractC37056f.m118951C(list) - i13;
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Element index ", " must be in range [");
        sbM30466t.append(new C18284j(0, AbstractC37056f.m118951C(list), 1));
        sbM30466t.append("].");
        throw new IndexOutOfBoundsException(sbM30466t.toString());
    }

    /* JADX INFO: renamed from: m1 */
    public static Object m74136m1(List list) {
        AbstractC22676k.m65750j(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(AbstractC37056f.m118951C(list));
    }

    /* JADX INFO: renamed from: n0 */
    public static final int m74137n0(int i13, List list) {
        if (i13 >= 0 && i13 <= list.size()) {
            return list.size() - i13;
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Position index ", " must be in range [");
        sbM30466t.append(new C18284j(0, list.size(), 1));
        sbM30466t.append("].");
        throw new IndexOutOfBoundsException(sbM30466t.toString());
    }

    /* JADX INFO: renamed from: n1 */
    public static List m74138n1(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m74093D1(iterable);
        }
        List listM74099G1 = m74099G1(iterable);
        Collections.reverse(listM74099G1);
        return listM74099G1;
    }

    /* JADX INFO: renamed from: o0 */
    public static void m74139o0(AbstractCollection abstractCollection, Object[] elements) {
        AbstractC22676k.m65750j(abstractCollection, "<this>");
        AbstractC22676k.m65750j(elements, "elements");
        abstractCollection.addAll(AbstractC25260n.m74048W(elements));
    }

    /* JADX INFO: renamed from: o1 */
    public static Object m74140o1(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        if (iterable instanceof List) {
            return m74142p1((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    /* JADX INFO: renamed from: p0 */
    public static void m74141p0(Collection collection, Iterable elements) {
        AbstractC22676k.m65750j(collection, "<this>");
        AbstractC22676k.m65750j(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: p1 */
    public static Object m74142p1(List list) {
        AbstractC22676k.m65750j(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    /* JADX INFO: renamed from: q0 */
    public static C25253j0 m74143q0(List list) {
        AbstractC22676k.m65750j(list, "<this>");
        return new C25253j0(list);
    }

    /* JADX INFO: renamed from: q1 */
    public static Object m74144q1(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    /* JADX INFO: renamed from: r0 */
    public static C25264r m74145r0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        return new C25264r(iterable, 1);
    }

    /* JADX INFO: renamed from: r1 */
    public static Object m74146r1(List list) {
        AbstractC22676k.m65750j(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: s0 */
    public static double m74147s0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        Iterator it = iterable.iterator();
        double dDoubleValue = 0.0d;
        int i13 = 0;
        while (it.hasNext()) {
            dDoubleValue += ((Number) it.next()).doubleValue();
            i13++;
            if (i13 < 0) {
                AbstractC37056f.m118976c0();
                throw null;
            }
        }
        if (i13 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i13);
    }

    /* JADX INFO: renamed from: s1 */
    public static List m74148s1(List list, C18284j indices) {
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(indices, "indices");
        return indices.isEmpty() ? C25271y.f99162w : m74093D1(list.subList(indices.f71133w, indices.f71134x + 1));
    }

    /* JADX INFO: renamed from: t0 */
    public static double m74149t0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        Iterator it = iterable.iterator();
        double dIntValue = 0.0d;
        int i13 = 0;
        while (it.hasNext()) {
            dIntValue += (double) ((Number) it.next()).intValue();
            i13++;
            if (i13 < 0) {
                AbstractC37056f.m118976c0();
                throw null;
            }
        }
        if (i13 == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i13);
    }

    /* JADX INFO: renamed from: t1 */
    public static List m74150t1(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listM74099G1 = m74099G1(iterable);
            AbstractC25269w.m74165k0(listM74099G1);
            return listM74099G1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m74093D1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        AbstractC22676k.m65750j(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return AbstractC25260n.m74048W(array);
    }

    /* JADX INFO: renamed from: u0 */
    public static double m74151u0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        Iterator it = iterable.iterator();
        double dLongValue = 0.0d;
        int i13 = 0;
        while (it.hasNext()) {
            dLongValue += ((Number) it.next()).longValue();
            i13++;
            if (i13 < 0) {
                AbstractC37056f.m118976c0();
                throw null;
            }
        }
        if (i13 == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i13);
    }

    /* JADX INFO: renamed from: u1 */
    public static List m74152u1(Iterable iterable, Comparator comparator) {
        AbstractC22676k.m65750j(iterable, "<this>");
        AbstractC22676k.m65750j(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listM74099G1 = m74099G1(iterable);
            AbstractC25269w.m74166l0(listM74099G1, comparator);
            return listM74099G1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m74093D1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC25260n.m74039O0(array, comparator);
        return AbstractC25260n.m74048W(array);
    }

    /* JADX INFO: renamed from: v0 */
    public static ArrayList m74153v0(Iterable iterable, int i13) {
        AbstractC22676k.m65750j(iterable, "<this>");
        AbstractC12889b.m36277i(i13, i13);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = iterable.iterator();
            AbstractC22676k.m65750j(iterator, "iterator");
            Iterator itM113247i = !iterator.hasNext() ? C25270x.f99161w : AbstractC35745c.m113247i(new C25259m0(i13, i13, iterator, null));
            while (itM113247i.hasNext()) {
                arrayList.add((List) itM113247i.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i13) + (size % i13 == 0 ? 0 : 1));
        int i14 = 0;
        while (i14 >= 0 && i14 < size) {
            int i15 = size - i14;
            if (i13 <= i15) {
                i15 = i13;
            }
            ArrayList arrayList3 = new ArrayList(i15);
            for (int i16 = 0; i16 < i15; i16++) {
                arrayList3.add(list.get(i16 + i14));
            }
            arrayList2.add(arrayList3);
            i14 += i13;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: v1 */
    public static int m74154v1(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        Iterator it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: w0 */
    public static boolean m74155w0(Iterable iterable, Object obj) {
        AbstractC22676k.m65750j(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return m74104J0(iterable, obj) >= 0;
    }

    /* JADX INFO: renamed from: w1 */
    public static List m74156w1(Iterable iterable, int i13) {
        AbstractC22676k.m65750j(iterable, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Requested element count ", " is less than zero.").toString());
        }
        if (i13 == 0) {
            return C25271y.f99162w;
        }
        if (iterable instanceof Collection) {
            if (i13 >= ((Collection) iterable).size()) {
                return m74093D1(iterable);
            }
            if (i13 == 1) {
                return AbstractC37056f.m118958J(m74094E0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i13);
        Iterator it = iterable.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i14++;
            if (i14 == i13) {
                break;
            }
        }
        return AbstractC37056f.m118966U(arrayList);
    }

    /* JADX INFO: renamed from: x0 */
    public static final Collection m74157x0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : m74093D1(iterable);
    }

    /* JADX INFO: renamed from: x1 */
    public static List m74158x1(int i13, List list) {
        AbstractC22676k.m65750j(list, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Requested element count ", " is less than zero.").toString());
        }
        if (i13 == 0) {
            return C25271y.f99162w;
        }
        int size = list.size();
        if (i13 >= size) {
            return m74093D1(list);
        }
        if (i13 == 1) {
            return AbstractC37056f.m118958J(m74112P0(list));
        }
        ArrayList arrayList = new ArrayList(i13);
        if (list instanceof RandomAccess) {
            for (int i14 = size - i13; i14 < size; i14++) {
                arrayList.add(list.get(i14));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i13);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y0 */
    public static List m74159y0(Iterable iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        return m74093D1(m74101H1(iterable));
    }

    /* JADX INFO: renamed from: y1 */
    public static boolean[] m74160y1(Collection collection) {
        AbstractC22676k.m65750j(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            zArr[i13] = ((Boolean) it.next()).booleanValue();
            i13++;
        }
        return zArr;
    }

    /* JADX INFO: renamed from: z0 */
    public static List m74161z0(Iterable iterable, int i13) {
        ArrayList arrayList;
        AbstractC22676k.m65750j(iterable, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Requested element count ", " is less than zero.").toString());
        }
        if (i13 == 0) {
            return m74093D1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i13;
            if (size <= 0) {
                return C25271y.f99162w;
            }
            if (size == 1) {
                return AbstractC37056f.m118958J(m74111O0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i13 < size2) {
                        arrayList.add(list.get(i13));
                        i13++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i13);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i14 = 0;
        for (Object obj : iterable) {
            if (i14 >= i13) {
                arrayList.add(obj);
            } else {
                i14++;
            }
        }
        return AbstractC37056f.m118966U(arrayList);
    }

    /* JADX INFO: renamed from: z1 */
    public static byte[] m74162z1(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            bArr[i13] = ((Number) it.next()).byteValue();
            i13++;
        }
        return bArr;
    }
}
