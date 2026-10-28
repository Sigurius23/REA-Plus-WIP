package p623xr;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p460rg.AbstractC31375j;

/* JADX INFO: renamed from: xr.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C38609e implements ListIterator, Iterator {

    /* JADX INFO: renamed from: w */
    public final int f166110w;

    /* JADX INFO: renamed from: x */
    public int f166111x;

    /* JADX INFO: renamed from: y */
    public final AbstractC38611g f166112y;

    public C38609e(AbstractC38611g abstractC38611g, int i13) {
        int size = abstractC38611g.size();
        if (i13 < 0 || i13 > size) {
            throw new IndexOutOfBoundsException(AbstractC31375j.m96489e(i13, size, "index"));
        }
        this.f166110w = size;
        this.f166111x = i13;
        this.f166112y = abstractC38611g;
    }

    /* JADX INFO: renamed from: a */
    public final Object m123810a(int i13) {
        return this.f166112y.get(i13);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f166111x < this.f166110w;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f166111x > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f166111x;
        this.f166111x = i13 + 1;
        return m123810a(i13);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f166111x;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f166111x - 1;
        this.f166111x = i13;
        return m123810a(i13);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f166111x - 1;
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
