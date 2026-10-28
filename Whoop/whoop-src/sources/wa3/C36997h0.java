package wa3;

import java.util.ListIterator;

/* JADX INFO: renamed from: wa3.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C36997h0 implements ListIterator {

    /* JADX INFO: renamed from: w */
    public final ListIterator f158345w;

    public C36997h0(C37001j0 c37001j0, int i13) {
        this.f158345w = c37001j0.f158352w.listIterator(i13);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f158345w.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f158345w.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f158345w.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f158345w.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f158345w.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f158345w.previousIndex();
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
