package p690zr;

import java.util.Iterator;

/* JADX INFO: renamed from: zr.j1 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC41033j1 implements Iterator {

    /* JADX INFO: renamed from: w */
    public final Iterator f177008w;

    public AbstractC41033j1(Iterator it) {
        it.getClass();
        this.f177008w = it;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo133265a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f177008w.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo133265a(this.f177008w.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f177008w.remove();
    }
}
