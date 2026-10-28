package pc3;

import d93.InterfaceC11820a;
import i93.C18285k;
import i93.C18286l;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlinx.datetime.C22726g;
import kotlinx.datetime.LocalDate;
import p715kotlin.jvm.internal.AbstractC22676k;
import rc3.AbstractC31237b;

/* JADX INFO: renamed from: pc3.h */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC29086h implements Collection, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final C18285k f117678w;

    /* JADX INFO: renamed from: x */
    public final LocalDate f117679x;

    /* JADX INFO: renamed from: y */
    public final LocalDate f117680y;

    public AbstractC29086h(LocalDate localDate, LocalDate localDate2) {
        long jM134406toEpochDays = localDate.m134406toEpochDays();
        C18285k c18285k = new C18285k(jM134406toEpochDays, localDate2.m134406toEpochDays(), 1L);
        this.f117678w = c18285k;
        LocalDate.Companion.getClass();
        this.f117679x = C29084f.m88408a(jM134406toEpochDays);
        this.f117680y = C29084f.m88408a(c18285k.f71142x);
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
        if (!(obj instanceof LocalDate)) {
            return false;
        }
        LocalDate localDate = (LocalDate) obj;
        C22726g c22726g = (C22726g) this;
        return c22726g.f117679x.compareTo(localDate) <= 0 && localDate.compareTo(c22726g.f117680y) <= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof LocalDate) || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC29086h) {
            return AbstractC22676k.m65745e(this.f117678w, ((AbstractC29086h) obj).f117678w);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f117678w.hashCode();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C18285k c18285k = this.f117678w;
        return new C29087i(new C18286l(c18285k.f71141w, c18285k.f71142x, c18285k.f71143y), 0);
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
        return AbstractC31237b.m96189a(this.f117678w);
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
