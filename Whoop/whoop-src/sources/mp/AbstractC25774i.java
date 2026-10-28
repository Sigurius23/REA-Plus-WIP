package mp;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: renamed from: mp.i */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25774i extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: w */
    public static final Object[] f101489w = new Object[0];

    /* JADX INFO: renamed from: a */
    public int mo75979a(Object[] objArr) {
        AbstractC25763e0 abstractC25763e0Mo75982e = mo75982e();
        int i13 = 0;
        while (abstractC25763e0Mo75982e.hasNext()) {
            objArr[i13] = abstractC25763e0Mo75982e.next();
            i13++;
        }
        return i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public int mo75980c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: d */
    public int mo75981d() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: e */
    public abstract AbstractC25763e0 mo75982e();

    /* JADX INFO: renamed from: f */
    public Object[] mo75983f() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f101489w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] objArrMo75983f = mo75983f();
            if (objArrMo75983f != null) {
                return Arrays.copyOfRange(objArrMo75983f, mo75981d(), mo75980c(), objArr.getClass());
            }
            if (length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo75979a(objArr);
        return objArr;
    }
}
