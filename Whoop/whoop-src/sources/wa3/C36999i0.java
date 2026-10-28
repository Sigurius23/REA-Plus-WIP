package wa3;

import java.util.Iterator;

/* JADX INFO: renamed from: wa3.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C36999i0 implements Iterator {

    /* JADX INFO: renamed from: w */
    public final Iterator f158348w;

    public C36999i0(C37001j0 c37001j0) {
        this.f158348w = c37001j0.f158352w.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f158348w.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f158348w.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
