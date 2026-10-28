package p690zr;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p463rj.AbstractC31484o;

/* JADX INFO: renamed from: zr.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41017e0 extends AbstractC41036k1 implements ListIterator {

    /* JADX INFO: renamed from: w */
    public final int f176986w;

    /* JADX INFO: renamed from: x */
    public int f176987x;

    /* JADX INFO: renamed from: y */
    public final AbstractC41023g0 f176988y;

    public C41017e0(AbstractC41023g0 abstractC41023g0, int i13) {
        int size = abstractC41023g0.size();
        AbstractC31484o.m96959k(i13, size);
        this.f176986w = size;
        this.f176987x = i13;
        this.f176988y = abstractC41023g0;
    }

    /* JADX INFO: renamed from: a */
    public final Object m133241a(int i13) {
        return this.f176988y.get(i13);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f176987x < this.f176986w;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f176987x > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f176987x;
        this.f176987x = i13 + 1;
        return m133241a(i13);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f176987x;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f176987x - 1;
        this.f176987x = i13;
        return m133241a(i13);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f176987x - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
