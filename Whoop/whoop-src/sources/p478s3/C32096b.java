package p478s3;

import d93.InterfaceC11820a;
import hc3.AbstractC17176i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: s3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C32096b implements Collection, InterfaceC11820a {

    /* JADX INFO: renamed from: y */
    public static final C32096b f133098y = new C32096b(C25271y.f99162w);

    /* JADX INFO: renamed from: w */
    public final List f133099w;

    /* JADX INFO: renamed from: x */
    public final int f133100x;

    public C32096b(List list) {
        this.f133099w = list;
        this.f133100x = list.size();
    }

    /* JADX INFO: renamed from: a */
    public final C32095a m99834a() {
        return (C32095a) this.f133099w.get(0);
    }

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
        if (!(obj instanceof C32095a)) {
            return false;
        }
        return this.f133099w.contains((C32095a) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f133099w.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32096b) {
            return AbstractC22676k.m65745e(this.f133099w, ((C32096b) obj).f133099w);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f133099w.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f133099w.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f133099w.iterator();
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
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f133100x;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC22676k.m65758r(this);
    }

    public final String toString() {
        return AbstractC17176i.m48506h(new StringBuilder("LocaleList(localeList="), this.f133099w, ')');
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC22676k.m65759s(this, objArr);
    }
}
