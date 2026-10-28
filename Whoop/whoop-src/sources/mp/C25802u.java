package mp;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: mp.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C25802u extends AbstractC25763e0 {

    /* JADX INFO: renamed from: x */
    public static final Object f101542x = new Object();

    /* JADX INFO: renamed from: w */
    public Object f101543w;

    public C25802u(Object obj) {
        this.f101543w = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f101543w != f101542x;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.f101543w;
        Object obj2 = f101542x;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.f101543w = obj2;
        return obj;
    }
}
