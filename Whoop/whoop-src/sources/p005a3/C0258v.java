package p005a3;

import d93.InterfaceC11820a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import m83.AbstractC25260n;
import p002a0.C0032j0;
import p002a0.C0047q0;
import p026b2.AbstractC2316v;
import p097ds.AbstractC12313p;
import p097ds.AbstractC12314q;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: a3.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0258v implements List, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final C0047q0 f881w = new C0047q0(16);

    /* JADX INFO: renamed from: x */
    public final C0032j0 f882x = new C0032j0(16);

    /* JADX INFO: renamed from: y */
    public int f883y = -1;

    /* JADX INFO: renamed from: a */
    public final long m774a() {
        long jM34322b = AbstractC12314q.m34322b(Float.POSITIVE_INFINITY, false, false);
        int i13 = this.f883y + 1;
        int iM118951C = AbstractC37056f.m118951C(this);
        if (i13 > iM118951C) {
            return jM34322b;
        }
        while (true) {
            C0032j0 c0032j0 = this.f882x;
            if (i13 < 0) {
                c0032j0.getClass();
                break;
            }
            if (i13 >= c0032j0.f95b) {
                break;
            }
            long j7 = c0032j0.f94a[i13];
            if (AbstractC12313p.m34306x(j7, jM34322b) < 0) {
                jM34322b = j7;
            }
            if ((AbstractC12313p.m34256H(jM34322b) < 0.0f && AbstractC12313p.m34260L(jM34322b)) || i13 == iM118951C) {
                return jM34322b;
            }
            i13++;
        }
        AbstractC34924m.m110135Q("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i13, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: c */
    public final void m775c(int i13, int i14) {
        if (i13 >= i14) {
            return;
        }
        this.f881w.m108k(i13, i14);
        C0032j0 c0032j0 = this.f882x;
        if (i13 >= 0) {
            int i15 = c0032j0.f95b;
            if (i13 <= i15 && i14 >= 0 && i14 <= i15) {
                if (i14 < i13) {
                    AbstractC34924m.m110133O("The end index must be < start index");
                    throw null;
                }
                if (i14 != i13) {
                    if (i14 < i15) {
                        long[] jArr = c0032j0.f94a;
                        AbstractC25260n.m74066g0(jArr, jArr, i13, i14, i15);
                    }
                    c0032j0.f95b -= i14 - i13;
                    return;
                }
                return;
            }
        } else {
            c0032j0.getClass();
        }
        AbstractC34924m.m110135Q("Index must be between 0 and size");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f883y = -1;
        this.f881w.m100c();
        this.f882x.f95b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return (obj instanceof AbstractC2316v) && indexOf((AbstractC2316v) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((AbstractC2316v) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        Object objM102e = this.f881w.m102e(i13);
        AbstractC22676k.m65748h(objM102e, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (AbstractC2316v) objM102e;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC2316v)) {
            return -1;
        }
        AbstractC2316v abstractC2316v = (AbstractC2316v) obj;
        int iM118951C = AbstractC37056f.m118951C(this);
        if (iM118951C >= 0) {
            int i13 = 0;
            while (!AbstractC22676k.m65745e(this.f881w.m102e(i13), abstractC2316v)) {
                if (i13 != iM118951C) {
                    i13++;
                }
            }
            return i13;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f881w.m104g();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0252t(this, 0, 7);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC2316v)) {
            return -1;
        }
        AbstractC2316v abstractC2316v = (AbstractC2316v) obj;
        for (int iM118951C = AbstractC37056f.m118951C(this); -1 < iM118951C; iM118951C--) {
            if (AbstractC22676k.m65745e(this.f881w.m102e(iM118951C), abstractC2316v)) {
                return iM118951C;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C0252t(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i13) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i13, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f881w.f137b;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i13, int i14) {
        return new C0255u(this, i13, i14);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC22676k.m65758r(this);
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i13) {
        return new C0252t(this, i13, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC22676k.m65759s(this, objArr);
    }
}
