package p623xr;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p460rg.AbstractC31375j;

/* JADX INFO: renamed from: xr.g */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC38611g extends AbstractC38608d implements List, RandomAccess {

    /* JADX INFO: renamed from: x */
    public static final C38609e f166116x = new C38609e(C38613i.f166119z, 0);

    @Override // p623xr.AbstractC38608d
    /* JADX INFO: renamed from: a */
    public int mo123806a(Object[] objArr) {
        int size = size();
        for (int i13 = 0; i13 < size; i13++) {
            objArr[i13] = get(i13);
        }
        return size;
    }

    @Override // java.util.List
    public final void add(int i13, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i13 = 0; i13 < size; i13++) {
                        Object obj2 = get(i13);
                        Object obj3 = list.get(i13);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                        }
                    }
                    return true;
                }
                C38609e c38609eListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (c38609eListIterator.hasNext()) {
                    if (it.hasNext() && ((next = c38609eListIterator.next()) == (next2 = it.next()) || (next != null && next.equals(next2)))) {
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC38611g subList(int i13, int i14) {
        AbstractC31375j.m96488d(i13, i14, size());
        int i15 = i14 - i13;
        if (i15 == size()) {
            return this;
        }
        return i15 == 0 ? C38613i.f166119z : new C38610f(this, i13, i15);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final C38609e listIterator(int i13) {
        int size = size();
        if (i13 < 0 || i13 > size) {
            throw new IndexOutOfBoundsException(AbstractC31375j.m96489e(i13, size, "index"));
        }
        return isEmpty() ? f166116x : new C38609e(this, i13);
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
    public final /* synthetic */ Iterator iterator() {
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
