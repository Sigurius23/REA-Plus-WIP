package m83;

import d93.InterfaceC11820a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: m83.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C25271y implements List, Serializable, RandomAccess, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public static final C25271y f99162w = new C25271y();

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i13, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return elements.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    @Override // java.util.List
    public final Object get(int i13) {
        throw new IndexOutOfBoundsException(AbstractC31061c.m95639o("Empty list doesn't contain element at index ", i13, '.'));
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return C25270x.f99161w;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return C25270x.f99161w;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i13) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
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
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.List
    public final List subList(int i13, int i14) {
        if (i13 == 0 && i14 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, i14, "fromIndex: ", ", toIndex: "));
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC22676k.m65758r(this);
    }

    public final String toString() {
        return "[]";
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
        if (i13 == 0) {
            return C25270x.f99161w;
        }
        throw new IndexOutOfBoundsException(AbstractC2875y.m8295h(i13, "Index: "));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC22676k.m65750j(array, "array");
        return AbstractC22676k.m65759s(this, array);
    }
}
