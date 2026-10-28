package m83;

import d93.InterfaceC11820a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;

/* JADX INFO: renamed from: m83.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C25256l implements Collection, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final Object[] f99133w;

    /* JADX INFO: renamed from: x */
    public final boolean f99134x;

    public C25256l(Object[] values, boolean z4) {
        AbstractC22676k.m65750j(values, "values");
        this.f99133w = values;
        this.f99134x = z4;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
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
        return AbstractC25260n.m74056a0(this.f99133w, obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!AbstractC25260n.m74056a0(this.f99133w, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f99133w.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC22681m0.m65777h(this.f99133w);
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
        return this.f99133w.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC22676k.m65750j(array, "array");
        return AbstractC22676k.m65759s(this, array);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f99133w;
        AbstractC22676k.m65750j(objArr, "<this>");
        if (this.f99134x && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }
}
