package mp;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: mp.n */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25788n extends AbstractC25774i implements List, RandomAccess {

    /* JADX INFO: renamed from: x */
    public static final C25777j f101515x = new C25777j(C25810y.f101552E, 0);

    /* JADX INFO: renamed from: l */
    public static C25810y m76024l(int i13, Object[] objArr) {
        return i13 == 0 ? C25810y.f101552E : new C25810y(i13, objArr);
    }

    /* JADX INFO: renamed from: m */
    public static C25810y m76025m(Object[] objArr) {
        if (objArr.length == 0) {
            return C25810y.f101552E;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (objArr2[i13] == null) {
                throw new NullPointerException(AbstractC2875y.m8295h(i13, "at index "));
            }
        }
        return m76024l(length, objArr2);
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: a */
    public int mo75979a(Object[] objArr) {
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
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: e */
    public final AbstractC25763e0 mo75982e() {
        return listIterator(0);
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
                        if (AbstractC25753b.m75996h(get(i13), list.get(i13))) {
                        }
                    }
                    return true;
                }
                C25777j c25777jListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (c25777jListIterator.hasNext()) {
                    if (it.hasNext() && AbstractC25753b.m75996h(c25777jListIterator.next(), it.next())) {
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public AbstractC25788n mo76021g() {
        return size() <= 1 ? this : new C25783l(this);
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
    public AbstractC25788n subList(int i13, int i14) {
        AbstractC25753b.m76001m(i13, i14, size());
        int i15 = i14 - i13;
        if (i15 == size()) {
            return this;
        }
        return i15 == 0 ? C25810y.f101552E : new C25786m(this, i13, i15);
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
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final C25777j listIterator(int i13) {
        int size = size();
        if (i13 < 0 || i13 > size) {
            throw new IndexOutOfBoundsException(AbstractC25753b.m76002n(i13, size, "index"));
        }
        return isEmpty() ? f101515x : new C25777j(this, i13);
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
