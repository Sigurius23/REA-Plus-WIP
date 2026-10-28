package p635y2;

import d93.InterfaceC11820a;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import p002a0.AbstractC0012c1;
import p002a0.C0049r0;
import p002a0.C0055u0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y2.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class C39143w1 implements Collection, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final C0049r0 f168293w;

    public C39143w1() {
        int i13 = AbstractC0012c1.f30a;
        this.f168293w = new C0049r0(6);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        return this.f168293w.m111a(obj);
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f168293w.m112b();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f168293w.m113c(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f168293w.m113c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f168293w.f146g == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C0049r0 c0049r0 = this.f168293w;
        c0049r0.getClass();
        return new C0055u0(c0049r0).iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return this.f168293w.m117g(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f168293w.m117g(collection);
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f168293w.m119i(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f168293w.f146g;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC22676k.m65758r(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC22676k.m65759s(this, objArr);
    }
}
