package com.google.crypto.tink.shaded.protobuf;

import java.util.ListIterator;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.f1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5139f1 implements ListIterator {

    /* JADX INFO: renamed from: w */
    public ListIterator f21508w;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f21508w.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f21508w.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f21508w.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21508w.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f21508w.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21508w.previousIndex();
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
