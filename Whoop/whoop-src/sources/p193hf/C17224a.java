package p193hf;

import d93.InterfaceC11820a;
import hg3.AbstractC17269i;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import p184h5.C16927z;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: hf.a */
/* JADX INFO: loaded from: classes.dex */
public class C17224a implements Collection, Iterable, InterfaceC11820a {

    /* JADX INFO: renamed from: E */
    public final Function1 f66187E;

    /* JADX INFO: renamed from: w */
    public final Collection f66188w;

    /* JADX INFO: renamed from: x */
    public final Function1 f66189x;

    /* JADX INFO: renamed from: y */
    public final Collection f66190y;

    /* JADX INFO: renamed from: z */
    public final Function1 f66191z;

    public C17224a(Collection src, Function1 src2Dest, Function1 dest2Src) {
        AbstractC22676k.m65750j(src, "src");
        AbstractC22676k.m65750j(src2Dest, "src2Dest");
        AbstractC22676k.m65750j(dest2Src, "dest2Src");
        this.f66188w = src;
        this.f66189x = src2Dest;
        this.f66190y = src;
        this.f66191z = src2Dest;
        this.f66187E = dest2Src;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f66190y.contains(this.f66187E.invoke(obj));
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        return this.f66190y.containsAll(AbstractC17269i.m48912r(elements, this.f66187E, this.f66191z));
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f66190y.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        Iterator it = this.f66188w.iterator();
        AbstractC22676k.m65750j(it, "<this>");
        Function1 src2Dest = this.f66189x;
        AbstractC22676k.m65750j(src2Dest, "src2Dest");
        return new C16927z(it, src2Dest);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f66190y.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC22676k.m65758r(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        AbstractC22676k.m65750j(array, "array");
        return AbstractC22676k.m65759s(this, array);
    }
}
