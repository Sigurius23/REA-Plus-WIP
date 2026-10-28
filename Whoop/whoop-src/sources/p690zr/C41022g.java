package p690zr;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: zr.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C41022g extends C41031j implements NavigableSet {

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C41052s0 f176997z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41022g(C41052s0 c41052s0, NavigableMap navigableMap) {
        super(c41052s0, navigableMap);
        this.f176997z = c41052s0;
    }

    @Override // p690zr.C41031j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final NavigableMap mo133248a() {
        return (NavigableMap) ((SortedMap) this.f176984w);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return mo133248a().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C41016e) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C41022g(this.f176997z, mo133248a().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return mo133248a().floorKey(obj);
    }

    @Override // p690zr.C41031j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return mo133248a().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return mo133248a().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C41010c c41010c = (C41010c) iterator();
        if (!c41010c.hasNext()) {
            return null;
        }
        Object next = c41010c.next();
        c41010c.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // p690zr.C41031j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // p690zr.C41031j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z4) {
        return new C41022g(this.f176997z, mo133248a().headMap(obj, z4));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z4, Object obj2, boolean z13) {
        return new C41022g(this.f176997z, mo133248a().subMap(obj, z4, obj2, z13));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z4) {
        return new C41022g(this.f176997z, mo133248a().tailMap(obj, z4));
    }
}
