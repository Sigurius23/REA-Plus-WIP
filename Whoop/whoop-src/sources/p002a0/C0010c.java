package p002a0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: a0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0010c implements Set {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C0022g f25w;

    public C0010c(C0022g c0022g) {
        this.f25w = c0022g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f25w.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f25w.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f25w.m43l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C0022g c0022g = this.f25w;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return c0022g.f50y == set.size() && c0022g.m43l(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0022g c0022g = this.f25w;
        int iHashCode = 0;
        for (int i13 = c0022g.f50y - 1; i13 >= 0; i13--) {
            Object objM38g = c0022g.m38g(i13);
            iHashCode += objM38g == null ? 0 : objM38g.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f25w.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0007b(this.f25w);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0022g c0022g = this.f25w;
        int iM36d = c0022g.m36d(obj);
        if (iM36d < 0) {
            return false;
        }
        c0022g.mo40i(iM36d);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f25w.m44m(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f25w.m45n(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f25w.f50y;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0022g c0022g = this.f25w;
        int i13 = c0022g.f50y;
        Object[] objArr = new Object[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            objArr[i14] = c0022g.m38g(i14);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0022g c0022g = this.f25w;
        int i13 = c0022g.f50y;
        if (objArr.length < i13) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            objArr[i14] = c0022g.m38g(i14);
        }
        if (objArr.length > i13) {
            objArr[i13] = null;
        }
        return objArr;
    }
}
