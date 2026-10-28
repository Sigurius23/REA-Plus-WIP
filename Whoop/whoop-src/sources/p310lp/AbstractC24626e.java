package p310lp;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: lp.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24626e extends AbstractC24622a implements List, RandomAccess {

    /* JADX INFO: renamed from: x */
    public static final C24623b f96357x = new C24623b(C24627f.f96358E, 0);

    @Override // java.util.List
    public final void add(int i13, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p310lp.AbstractC24622a
    /* JADX INFO: renamed from: e */
    public int mo71957e(Object[] objArr) {
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            objArr[i13] = get(i13);
        }
        return size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i13 = 0; i13 < size; i13++) {
                        if (Objects.equals(get(i13), list.get(i13))) {
                        }
                    }
                    return true;
                }
                C24623b c24623bListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (c24623bListIterator.hasNext()) {
                    if (it.hasNext() && Objects.equals(c24623bListIterator.next(), it.next())) {
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC24626e mo71959f() {
        return size() <= 1 ? this : new C24624c(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC24626e subList(int i13, int i14) {
        AbstractC21598x.m60648D0(i13, i14, size());
        int i15 = i14 - i13;
        if (i15 == size()) {
            return this;
        }
        return i15 == 0 ? C24627f.f96358E : new C24625d(this, i13, i15);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i13 = 0; i13 < size; i13++) {
            iHashCode = (iHashCode * 31) + get(i13).hashCode();
        }
        return iHashCode;
    }

    public int indexOf(Object obj) {
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
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final C24623b listIterator(int i13) {
        int size = size();
        if (i13 < 0 || i13 > size) {
            throw new IndexOutOfBoundsException(AbstractC21598x.m60650E0(i13, size, "index"));
        }
        return isEmpty() ? f96357x : new C24623b(this, i13);
    }

    public int lastIndexOf(Object obj) {
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
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i13) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i13, Object obj) {
        throw new UnsupportedOperationException();
    }
}
