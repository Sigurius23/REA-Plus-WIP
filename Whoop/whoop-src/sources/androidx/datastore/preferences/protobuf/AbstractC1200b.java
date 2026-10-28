package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1200b extends AbstractList implements InterfaceC1201b0 {

    /* JADX INFO: renamed from: w */
    public boolean f5353w;

    /* JADX INFO: renamed from: a */
    public final void m3776a() {
        if (!this.f5353w) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m3776a();
        return super.addAll(collection);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3777c() {
        return this.f5353w;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m3776a();
        super.clear();
    }

    /* JADX INFO: renamed from: d */
    public final void m3778d() {
        if (this.f5353w) {
            this.f5353w = false;
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i13 = 0; i13 < size; i13++) {
            if (!get(i13).equals(list.get(i13))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i13 = 0; i13 < size; i13++) {
            iHashCode = (iHashCode * 31) + get(i13).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract Object remove(int i13);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m3776a();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m3776a();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m3776a();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i13, Collection collection) {
        m3776a();
        return super.addAll(i13, collection);
    }
}
