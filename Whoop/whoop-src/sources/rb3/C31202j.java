package rb3;

import d93.InterfaceC11820a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: rb3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C31202j implements Iterator, InterfaceC11820a {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
