package p005a3;

import d93.InterfaceC11820a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import p026b2.AbstractC2316v;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a3.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C0255u implements List, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final int f871w;

    /* JADX INFO: renamed from: x */
    public final int f872x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0258v f873y;

    public C0255u(C0258v c0258v, int i13, int i14) {
        this.f873y = c0258v;
        this.f871w = i13;
        this.f872x = i14;
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

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
        Object objM102e = this.f873y.f881w.m102e(i13 + this.f871w);
        AbstractC22676k.m65748h(objM102e, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (AbstractC2316v) objM102e;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof AbstractC2316v)) {
            return -1;
        }
        AbstractC2316v abstractC2316v = (AbstractC2316v) obj;
        int i13 = this.f871w;
        int i14 = this.f872x;
        if (i13 <= i14) {
            int i15 = i13;
            while (!AbstractC22676k.m65745e(this.f873y.f881w.m102e(i15), abstractC2316v)) {
                if (i15 != i14) {
                    i15++;
                }
            }
            return i15 - i13;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i13 = this.f871w;
        return new C0252t(this.f873y, i13, i13, this.f872x);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof AbstractC2316v)) {
            return -1;
        }
        AbstractC2316v abstractC2316v = (AbstractC2316v) obj;
        int i13 = this.f872x;
        int i14 = this.f871w;
        if (i14 <= i13) {
            while (!AbstractC22676k.m65745e(this.f873y.f881w.m102e(i13), abstractC2316v)) {
                if (i13 != i14) {
                    i13--;
                }
            }
            return i13 - i14;
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        int i13 = this.f871w;
        return new C0252t(this.f873y, i13, i13, this.f872x);
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
        return this.f872x - this.f871w;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final List subList(int i13, int i14) {
        int i15 = this.f871w;
        return new C0255u(this.f873y, i13 + i15, i15 + i14);
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
        int i14 = this.f871w;
        int i15 = this.f872x;
        return new C0252t(this.f873y, i13 + i14, i14, i15);
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
