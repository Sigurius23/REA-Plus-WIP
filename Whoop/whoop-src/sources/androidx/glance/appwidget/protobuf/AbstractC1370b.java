package androidx.glance.appwidget.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1370b extends AbstractList implements InterfaceC1380e0 {

    /* JADX INFO: renamed from: w */
    public boolean f5867w;

    public AbstractC1370b(boolean z4) {
        this.f5867w = z4;
    }

    /* JADX INFO: renamed from: a */
    public final void m4282a() {
        if (!this.f5867w) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        m4282a();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m4282a();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
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
    public int hashCode() {
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
        m4282a();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m4282a();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m4282a();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i13, Collection collection) {
        m4282a();
        return super.addAll(i13, collection);
    }
}
