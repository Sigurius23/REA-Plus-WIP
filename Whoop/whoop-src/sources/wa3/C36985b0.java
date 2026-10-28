package wa3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: wa3.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C36985b0 implements Iterator {
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
        throw new UnsupportedOperationException();
    }
}
