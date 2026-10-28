package mp;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: mp.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C25751a0 extends AbstractC25800t {

    /* JADX INFO: renamed from: G */
    public static final C25751a0 f101462G;

    /* JADX INFO: renamed from: F */
    public final transient AbstractC25788n f101463F;

    static {
        C25777j c25777j = AbstractC25788n.f101515x;
        f101462G = new C25751a0(C25810y.f101552E, C25806w.f101547x);
    }

    public C25751a0(AbstractC25788n abstractC25788n, Comparator comparator) {
        super(comparator);
        this.f101463F = abstractC25788n;
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: a */
    public final int mo75979a(Object[] objArr) {
        return this.f101463F.mo75979a(objArr);
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: c */
    public final int mo75980c() {
        return this.f101463F.mo75980c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iM75986r = m75986r(obj, true);
        AbstractC25788n abstractC25788n = this.f101463F;
        if (iM75986r == abstractC25788n.size()) {
            return null;
        }
        return abstractC25788n.get(iM75986r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f101463F, obj, this.f101538z) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof InterfaceC25804v) {
            collection = ((InterfaceC25804v) collection).m76051s();
        }
        Comparator comparator = this.f101538z;
        if (!AbstractC25753b.m75997i(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C25777j c25777jListIterator = this.f101463F.listIterator(0);
        Iterator it = collection.iterator();
        if (c25777jListIterator.hasNext()) {
            Object next = it.next();
            Object next2 = c25777jListIterator.next();
            while (true) {
                try {
                    int iCompare = comparator.compare(next2, next);
                    if (iCompare >= 0) {
                        if (iCompare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!c25777jListIterator.hasNext()) {
                            break;
                        }
                        next2 = c25777jListIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: d */
    public final int mo75981d() {
        return this.f101463F.mo75981d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f101463F.mo76021g().listIterator(0);
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: e */
    public final AbstractC25763e0 mo75982e() {
        return this.f101463F.listIterator(0);
    }

    @Override // mp.AbstractC25792p, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            AbstractC25788n abstractC25788n = this.f101463F;
            if (abstractC25788n.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.f101538z;
                if (!AbstractC25753b.m75997i(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    C25777j c25777jListIterator = abstractC25788n.listIterator(0);
                    while (c25777jListIterator.hasNext()) {
                        Object next = c25777jListIterator.next();
                        Object next2 = it.next();
                        if (next2 == null || comparator.compare(next, next2) != 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: f */
    public final Object[] mo75983f() {
        return this.f101463F.mo75983f();
    }

    @Override // mp.AbstractC25800t, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f101463F.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iM75985q = m75985q(obj, true) - 1;
        if (iM75985q == -1) {
            return null;
        }
        return this.f101463F.get(iM75985q);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iM75986r = m75986r(obj, false);
        AbstractC25788n abstractC25788n = this.f101463F;
        if (iM75986r == abstractC25788n.size()) {
            return null;
        }
        return abstractC25788n.get(iM75986r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f101463F.listIterator(0);
    }

    @Override // mp.AbstractC25792p
    /* JADX INFO: renamed from: l */
    public final AbstractC25788n mo75984l() {
        return this.f101463F;
    }

    @Override // mp.AbstractC25800t, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        AbstractC25788n abstractC25788n = this.f101463F;
        return abstractC25788n.get(abstractC25788n.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iM75985q = m75985q(obj, false) - 1;
        if (iM75985q == -1) {
            return null;
        }
        return this.f101463F.get(iM75985q);
    }

    /* JADX INFO: renamed from: q */
    public final int m75985q(Object obj, boolean z4) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f101463F, obj, this.f101538z);
        if (iBinarySearch >= 0) {
            return z4 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    /* JADX INFO: renamed from: r */
    public final int m75986r(Object obj, boolean z4) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f101463F, obj, this.f101538z);
        if (iBinarySearch >= 0) {
            return z4 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f101463F.size();
    }

    /* JADX INFO: renamed from: t */
    public final C25751a0 m75987t(int i13, int i14) {
        AbstractC25788n abstractC25788n = this.f101463F;
        if (i13 == 0) {
            if (i14 == abstractC25788n.size()) {
                return this;
            }
            i13 = 0;
        }
        Comparator comparator = this.f101538z;
        return i13 < i14 ? new C25751a0(abstractC25788n.subList(i13, i14), comparator) : AbstractC25800t.m76044p(comparator);
    }
}
