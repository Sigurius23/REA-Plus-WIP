package p310lp;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: lp.b */
/* JADX INFO: loaded from: classes.dex */
public final class C24623b implements ListIterator, Iterator {

    /* JADX INFO: renamed from: w */
    public final int f96350w;

    /* JADX INFO: renamed from: x */
    public int f96351x;

    /* JADX INFO: renamed from: y */
    public final AbstractC24626e f96352y;

    public C24623b(AbstractC24626e abstractC24626e, int i13) {
        int size = abstractC24626e.size();
        if (i13 < 0 || i13 > size) {
            throw new IndexOutOfBoundsException(AbstractC21598x.m60650E0(i13, size, "index"));
        }
        this.f96350w = size;
        this.f96351x = i13;
        this.f96352y = abstractC24626e;
    }

    /* JADX INFO: renamed from: a */
    public final Object m71958a(int i13) {
        return this.f96352y.get(i13);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f96351x < this.f96350w;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f96351x > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f96351x;
        this.f96351x = i13 + 1;
        return m71958a(i13);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f96351x;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f96351x - 1;
        this.f96351x = i13;
        return m71958a(i13);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f96351x - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
