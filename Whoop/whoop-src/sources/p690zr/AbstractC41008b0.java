package p690zr;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* JADX INFO: renamed from: zr.b0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC41008b0 extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: w */
    public static final Object[] f176958w = new Object[0];

    /* JADX INFO: renamed from: a */
    public abstract AbstractC41023g0 mo133227a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo133228c(int i13, Object[] objArr);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    /* JADX INFO: renamed from: d */
    public Object[] mo133229d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public int mo133230e() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: f */
    public int mo133231f() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo133226g();

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
        return toArray(f176958w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrMo133229d = mo133229d();
            if (objArrMo133229d != null) {
                return Arrays.copyOfRange(objArrMo133229d, mo133231f(), mo133230e(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo133228c(0, objArr);
        return objArr;
    }
}
