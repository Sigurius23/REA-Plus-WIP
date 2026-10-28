package p690zr;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: zr.l */
/* JADX INFO: loaded from: classes6.dex */
public class C41037l extends AbstractCollection implements List {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C41052s0 f177015E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C41052s0 f177016F;

    /* JADX INFO: renamed from: w */
    public final Object f177017w;

    /* JADX INFO: renamed from: x */
    public Collection f177018x;

    /* JADX INFO: renamed from: y */
    public final C41037l f177019y;

    /* JADX INFO: renamed from: z */
    public final Collection f177020z;

    public C41037l(C41052s0 c41052s0, Object obj, List list, C41037l c41037l) {
        this.f177016F = c41052s0;
        this.f177015E = c41052s0;
        this.f177017w = obj;
        this.f177018x = list;
        this.f177019y = c41037l;
        this.f177020z = c41037l == null ? null : c41037l.f177018x;
    }

    /* JADX INFO: renamed from: a */
    public final void m133267a() {
        C41037l c41037l = this.f177019y;
        if (c41037l != null) {
            c41037l.m133267a();
        } else {
            this.f177015E.f177049z.put(this.f177017w, this.f177018x);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m133268c();
        boolean zIsEmpty = this.f177018x.isEmpty();
        boolean zAdd = this.f177018x.add(obj);
        if (zAdd) {
            this.f177015E.f177047E++;
            if (zIsEmpty) {
                m133267a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f177018x.addAll(collection);
        if (zAddAll) {
            this.f177015E.f177047E += this.f177018x.size() - size;
            if (size == 0) {
                m133267a();
            }
        }
        return zAddAll;
    }

    /* JADX INFO: renamed from: c */
    public final void m133268c() {
        Collection collection;
        C41037l c41037l = this.f177019y;
        if (c41037l != null) {
            c41037l.m133268c();
            if (c41037l.f177018x != this.f177020z) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f177018x.isEmpty() || (collection = (Collection) this.f177015E.f177049z.get(this.f177017w)) == null) {
                return;
            }
            this.f177018x = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f177018x.clear();
        this.f177015E.f177047E -= size;
        m133269d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        m133268c();
        return this.f177018x.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        m133268c();
        return this.f177018x.containsAll(collection);
    }

    /* JADX INFO: renamed from: d */
    public final void m133269d() {
        C41037l c41037l = this.f177019y;
        if (c41037l != null) {
            c41037l.m133269d();
        } else if (this.f177018x.isEmpty()) {
            this.f177015E.f177049z.remove(this.f177017w);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        m133268c();
        return this.f177018x.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i13) {
        m133268c();
        return ((List) this.f177018x).get(i13);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        m133268c();
        return this.f177018x.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        m133268c();
        return ((List) this.f177018x).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        m133268c();
        return new C41010c(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m133268c();
        return ((List) this.f177018x).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        m133268c();
        return new C41034k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m133268c();
        boolean zRemove = this.f177018x.remove(obj);
        if (zRemove) {
            this.f177015E.f177047E--;
            m133269d();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f177018x.removeAll(collection);
        if (zRemoveAll) {
            this.f177015E.f177047E += this.f177018x.size() - size;
            m133269d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f177018x.retainAll(collection);
        if (zRetainAll) {
            this.f177015E.f177047E += this.f177018x.size() - size;
            m133269d();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i13, Object obj) {
        m133268c();
        return ((List) this.f177018x).set(i13, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        m133268c();
        return this.f177018x.size();
    }

    @Override // java.util.List
    public final List subList(int i13, int i14) {
        m133268c();
        List listSubList = ((List) this.f177018x).subList(i13, i14);
        C41037l c41037l = this.f177019y;
        if (c41037l == null) {
            c41037l = this;
        }
        boolean z4 = listSubList instanceof RandomAccess;
        C41052s0 c41052s0 = this.f177016F;
        Object obj = this.f177017w;
        return z4 ? new C41025h(c41052s0, obj, listSubList, c41037l) : new C41037l(c41052s0, obj, listSubList, c41037l);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m133268c();
        return this.f177018x.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i13) {
        m133268c();
        return new C41034k(this, i13);
    }

    @Override // java.util.List
    public final Object remove(int i13) {
        m133268c();
        Object objRemove = ((List) this.f177018x).remove(i13);
        this.f177016F.f177047E--;
        m133269d();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i13, Object obj) {
        m133268c();
        boolean zIsEmpty = this.f177018x.isEmpty();
        ((List) this.f177018x).add(i13, obj);
        this.f177016F.f177047E++;
        if (zIsEmpty) {
            m133267a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f177018x).addAll(i13, collection);
        if (zAddAll) {
            this.f177016F.f177047E += this.f177018x.size() - size;
            if (size == 0) {
                m133267a();
            }
        }
        return zAddAll;
    }
}
