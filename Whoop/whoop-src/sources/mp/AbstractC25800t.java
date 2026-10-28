package mp;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: renamed from: mp.t */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25800t extends AbstractC25792p implements NavigableSet, InterfaceC25760d0 {

    /* JADX INFO: renamed from: E */
    public transient AbstractC25800t f101537E;

    /* JADX INFO: renamed from: z */
    public final transient Comparator f101538z;

    public AbstractC25800t(Comparator comparator) {
        this.f101538z = comparator;
    }

    /* JADX INFO: renamed from: p */
    public static C25751a0 m76044p(Comparator comparator) {
        if (C25806w.f101547x.equals(comparator)) {
            return C25751a0.f101462G;
        }
        C25777j c25777j = AbstractC25788n.f101515x;
        return new C25751a0(C25810y.f101552E, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.f101538z;
    }

    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        C25751a0 c25751a0 = (C25751a0) this;
        return c25751a0.m75987t(0, c25751a0.m75985q(obj, false));
    }

    public abstract Object last();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final AbstractC25800t descendingSet() {
        AbstractC25800t abstractC25800tM76044p = this.f101537E;
        if (abstractC25800tM76044p == null) {
            C25751a0 c25751a0 = (C25751a0) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(c25751a0.f101538z);
            abstractC25800tM76044p = c25751a0.isEmpty() ? m76044p(comparatorReverseOrder) : new C25751a0(c25751a0.f101463F.mo76021g(), comparatorReverseOrder);
            this.f101537E = abstractC25800tM76044p;
            abstractC25800tM76044p.f101537E = this;
        }
        return abstractC25800tM76044p;
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final C25751a0 subSet(Object obj, boolean z4, Object obj2, boolean z13) {
        obj.getClass();
        obj2.getClass();
        if (this.f101538z.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        C25751a0 c25751a0 = (C25751a0) this;
        C25751a0 c25751a0M75987t = c25751a0.m75987t(c25751a0.m75986r(obj, z4), c25751a0.f101463F.size());
        return c25751a0M75987t.m75987t(0, c25751a0M75987t.m75985q(obj2, z13));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        C25751a0 c25751a0 = (C25751a0) this;
        return c25751a0.m75987t(c25751a0.m75986r(obj, true), c25751a0.f101463F.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z4) {
        obj.getClass();
        C25751a0 c25751a0 = (C25751a0) this;
        return c25751a0.m75987t(0, c25751a0.m75985q(obj, z4));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z4) {
        obj.getClass();
        C25751a0 c25751a0 = (C25751a0) this;
        return c25751a0.m75987t(c25751a0.m75986r(obj, z4), c25751a0.f101463F.size());
    }
}
