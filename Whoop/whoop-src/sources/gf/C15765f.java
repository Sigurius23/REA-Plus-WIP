package gf;

import d93.InterfaceC11820a;
import java.util.Iterator;
import p355o2.AbstractC27435g0;
import p355o2.C27431e0;

/* JADX INFO: renamed from: gf.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C15765f implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f59428w = 0;

    /* JADX INFO: renamed from: x */
    public final Iterator f59429x;

    public C15765f(C15766g c15766g) {
        this.f59429x = c15766g.f59430w.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f59428w) {
            case 0:
                break;
        }
        return this.f59429x.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f59428w) {
            case 0:
                return ((C15767h) this.f59429x.next()).f59432b;
            default:
                return (AbstractC27435g0) this.f59429x.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f59428w) {
            case 0:
                this.f59429x.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C15765f(C27431e0 c27431e0) {
        this.f59429x = c27431e0.f110553J.iterator();
    }
}
