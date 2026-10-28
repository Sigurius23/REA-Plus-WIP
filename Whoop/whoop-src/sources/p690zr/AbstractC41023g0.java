package p690zr;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p463rj.AbstractC31479j;
import p463rj.AbstractC31484o;

/* JADX INFO: renamed from: zr.g0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC41023g0 extends AbstractC41008b0 implements List, RandomAccess {

    /* JADX INFO: renamed from: x */
    public static final C41017e0 f176998x = new C41017e0(C41060w0.f177067E, 0);

    /* JADX INFO: renamed from: j */
    public static C41060w0 m133250j(int i13, Object[] objArr) {
        return i13 == 0 ? C41060w0.f177067E : new C41060w0(i13, objArr);
    }

    /* JADX INFO: renamed from: l */
    public static C41014d0 m133251l() {
        return new C41014d0(4);
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC41023g0 m133252m(Collection collection) {
        if (!(collection instanceof AbstractC41008b0)) {
            Object[] array = collection.toArray();
            AbstractC41047q.m133272b(array.length, array);
            return m133250j(array.length, array);
        }
        AbstractC41023g0 abstractC41023g0Mo133227a = ((AbstractC41008b0) collection).mo133227a();
        if (!abstractC41023g0Mo133227a.mo133226g()) {
            return abstractC41023g0Mo133227a;
        }
        Object[] array2 = abstractC41023g0Mo133227a.toArray(AbstractC41008b0.f176958w);
        return m133250j(array2.length, array2);
    }

    /* JADX INFO: renamed from: n */
    public static C41060w0 m133253n(Object[] objArr) {
        if (objArr.length == 0) {
            return C41060w0.f177067E;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC41047q.m133272b(objArr2.length, objArr2);
        return m133250j(objArr2.length, objArr2);
    }

    /* JADX INFO: renamed from: p */
    public static C41060w0 m133254p() {
        return C41060w0.f177067E;
    }

    /* JADX INFO: renamed from: q */
    public static C41060w0 m133255q(Long l7, Long l12, Long l13, Long l14, Long l15) {
        Object[] objArr = {l7, l12, l13, l14, l15};
        AbstractC41047q.m133272b(5, objArr);
        return m133250j(5, objArr);
    }

    /* JADX INFO: renamed from: r */
    public static C41060w0 m133256r(Object obj) {
        Object[] objArr = {obj};
        AbstractC41047q.m133272b(1, objArr);
        return m133250j(1, objArr);
    }

    /* JADX INFO: renamed from: t */
    public static C41060w0 m133257t(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC41047q.m133272b(2, objArr);
        return m133250j(2, objArr);
    }

    /* JADX INFO: renamed from: u */
    public static C41060w0 m133258u(AbstractC41058v0 abstractC41058v0, AbstractCollection abstractCollection) {
        abstractC41058v0.getClass();
        if (abstractCollection == null) {
            Iterator it = abstractCollection.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            abstractCollection = arrayList;
        }
        Object[] array = abstractCollection.toArray();
        AbstractC41047q.m133272b(array.length, array);
        Arrays.sort(array, abstractC41058v0);
        return m133250j(array.length, array);
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: a */
    public final AbstractC41023g0 mo133227a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i13, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p690zr.AbstractC41008b0
    /* JADX INFO: renamed from: c */
    public int mo133228c(int i13, Object[] objArr) {
        int size = size();
        for (int i14 = 0; i14 < size; i14++) {
            objArr[i13 + i14] = get(i14);
        }
        return i13 + size;
    }

    @Override // p690zr.AbstractC41008b0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it3 = list.iterator();
                        while (it.hasNext()) {
                            if (it3.hasNext() && AbstractC31479j.m96940s(it.next(), it3.next())) {
                            }
                        }
                        return !it3.hasNext();
                    }
                    for (int i13 = 0; i13 < size; i13++) {
                        if (AbstractC31479j.m96940s(get(i13), list.get(i13))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i13 = 1;
        for (int i14 = 0; i14 < size; i14++) {
            i13 = ~(~(get(i14).hashCode() + (i13 * 31)));
        }
        return i13;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            if (obj.equals(get(i13))) {
                return i13;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final C41017e0 listIterator(int i13) {
        AbstractC31484o.m96959k(i13, size());
        return isEmpty() ? f176998x : new C41017e0(this, i13);
    }

    @Override // java.util.List
    public final Object remove(int i13) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i13, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public AbstractC41023g0 subList(int i13, int i14) {
        AbstractC31484o.m96960l(i13, i14, size());
        int i15 = i14 - i13;
        if (i15 == size()) {
            return this;
        }
        return i15 == 0 ? C41060w0.f177067E : new C41020f0(this, i13, i15);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
