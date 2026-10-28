package p002a0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: a0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0016e implements Collection {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C0022g f37w;

    public C0016e(C0022g c0022g) {
        this.f37w = c0022g;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f37w.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f37w.m33a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f37w.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0019f(this.f37w);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0022g c0022g = this.f37w;
        int iM33a = c0022g.m33a(obj);
        if (iM33a < 0) {
            return false;
        }
        c0022g.mo40i(iM33a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0022g c0022g = this.f37w;
        int i13 = c0022g.f50y;
        int i14 = 0;
        boolean z4 = false;
        while (i14 < i13) {
            if (collection.contains(c0022g.m42k(i14))) {
                c0022g.mo40i(i14);
                i14--;
                i13--;
                z4 = true;
            }
            i14++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0022g c0022g = this.f37w;
        int i13 = c0022g.f50y;
        int i14 = 0;
        boolean z4 = false;
        while (i14 < i13) {
            if (!collection.contains(c0022g.m42k(i14))) {
                c0022g.mo40i(i14);
                i14--;
                i13--;
                z4 = true;
            }
            i14++;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f37w.f50y;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0022g c0022g = this.f37w;
        int i13 = c0022g.f50y;
        Object[] objArr = new Object[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            objArr[i14] = c0022g.m42k(i14);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0022g c0022g = this.f37w;
        int i13 = c0022g.f50y;
        if (objArr.length < i13) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            objArr[i14] = c0022g.m42k(i14);
        }
        if (objArr.length > i13) {
            objArr[i13] = null;
        }
        return objArr;
    }
}
