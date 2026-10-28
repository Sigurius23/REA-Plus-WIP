package androidx.health.platform.client.proto;

import java.util.ListIterator;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.g3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1467g3 implements ListIterator {

    /* JADX INFO: renamed from: w */
    public ListIterator f6043w;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f6043w.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f6043w.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f6043w.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f6043w.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f6043w.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f6043w.previousIndex();
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
