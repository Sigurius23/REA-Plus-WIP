package pc3;

import d93.InterfaceC11820a;
import i93.C18285k;
import i93.C18286l;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlinx.datetime.AbstractC22727h;
import kotlinx.datetime.C22728i;
import kotlinx.datetime.YearMonth;
import p715kotlin.jvm.internal.AbstractC22676k;
import rc3.AbstractC31237b;

/* JADX INFO: renamed from: pc3.v */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC29100v implements Collection, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final C18285k f117694w;

    /* JADX INFO: renamed from: x */
    public final YearMonth f117695x;

    /* JADX INFO: renamed from: y */
    public final YearMonth f117696y;

    public AbstractC29100v(YearMonth yearMonth, YearMonth yearMonth2) {
        long jM65802b = AbstractC22727h.m65802b(yearMonth);
        C18285k c18285k = new C18285k(jM65802b, AbstractC22727h.m65802b(yearMonth2), 1L);
        this.f117694w = c18285k;
        C29098t c29098t = YearMonth.Companion;
        this.f117695x = AbstractC22727h.m65801a(c29098t, jM65802b);
        this.f117696y = AbstractC22727h.m65801a(c29098t, c18285k.f71142x);
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
        if (!(obj instanceof YearMonth)) {
            return false;
        }
        YearMonth yearMonth = (YearMonth) obj;
        C22728i c22728i = (C22728i) this;
        return c22728i.f117695x.compareTo(yearMonth) <= 0 && yearMonth.compareTo(c22728i.f117696y) <= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof YearMonth) || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC29100v) {
            return AbstractC22676k.m65745e(this.f117694w, ((AbstractC29100v) obj).f117694w);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f117694w.hashCode();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C18285k c18285k = this.f117694w;
        return new C29087i(new C18286l(c18285k.f71141w, c18285k.f71142x, c18285k.f71143y), 1);
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
        return AbstractC31237b.m96189a(this.f117694w);
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
