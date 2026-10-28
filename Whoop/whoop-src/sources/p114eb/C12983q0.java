package p114eb;

import d93.InterfaceC11820a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p002a0.AbstractC0064z;
import p002a0.C0024g1;

/* JADX INFO: renamed from: eb.q0 */
/* JADX INFO: loaded from: classes.dex */
public final class C12983q0 implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public int f44847w = -1;

    /* JADX INFO: renamed from: x */
    public boolean f44848x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C12985r0 f44849y;

    public C12983q0(C12985r0 c12985r0) {
        this.f44849y = c12985r0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f44847w + 1 < this.f44849y.f44855L.m58g();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f44848x = true;
        C0024g1 c0024g1 = this.f44849y.f44855L;
        int i13 = this.f44847w + 1;
        this.f44847w = i13;
        return (C12977n0) c0024g1.m59h(i13);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f44848x) {
            throw new IllegalStateException("You must call next() before you can remove an element");
        }
        C0024g1 c0024g1 = this.f44849y.f44855L;
        ((C12977n0) c0024g1.m59h(this.f44847w)).f44823x = null;
        int i13 = this.f44847w;
        Object[] objArr = c0024g1.f57y;
        Object obj = objArr[i13];
        Object obj2 = AbstractC0064z.f203c;
        if (obj != obj2) {
            objArr[i13] = obj2;
            c0024g1.f55w = true;
        }
        this.f44847w = i13 - 1;
        this.f44848x = false;
    }
}
