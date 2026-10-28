package p129ex;

import java.util.Collection;
import java.util.HashSet;

/* JADX INFO: renamed from: ex.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C13724a extends HashSet {

    /* JADX INFO: renamed from: w */
    public HashSet f48734w;

    /* JADX INFO: renamed from: x */
    public HashSet f48735x;

    /* JADX INFO: renamed from: y */
    public volatile boolean f48736y;

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        synchronized (this) {
            try {
                if (!this.f48736y) {
                    return super.add(obj);
                }
                this.f48734w.add(obj);
                boolean z4 = contains(obj) || this.f48734w.contains(obj);
                if (this.f48735x.remove(obj)) {
                    return true;
                }
                return !z4;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this) {
            zAddAll = super.addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        removeAll(this);
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        synchronized (this) {
            try {
                if (!this.f48736y) {
                    return super.remove(obj);
                }
                if (this.f48735x.contains(obj)) {
                    return false;
                }
                if (!this.f48734w.remove(obj) && !contains(obj)) {
                    return false;
                }
                this.f48735x.add(obj);
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this) {
            zRemoveAll = super.removeAll(collection);
        }
        return zRemoveAll;
    }
}
