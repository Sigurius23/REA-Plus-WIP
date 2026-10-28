package io.sentry.cache.tape;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: io.sentry.cache.tape.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C20284a implements Iterator {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException("No elements in EmptyIterator!");
    }
}
