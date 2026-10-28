package l83;

import d93.InterfaceC11820a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import m83.AbstractC25260n;
import p184h5.C16907r0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l83.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C23475u implements Collection, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final int[] f92953w;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C23474t)) {
            return false;
        }
        return AbstractC25260n.m74054Z(this.f92953w, ((C23474t) obj).f92952w);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof C23474t)) {
                return false;
            }
            if (!AbstractC25260n.m74054Z(this.f92953w, ((C23474t) obj).f92952w)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C23475u) {
            return AbstractC22676k.m65745e(this.f92953w, ((C23475u) obj).f92953w);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f92953w);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f92953w.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C16907r0(this.f92953w);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f92953w.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC22676k.m65758r(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f92953w) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC22676k.m65750j(array, "array");
        return AbstractC22676k.m65759s(this, array);
    }
}
