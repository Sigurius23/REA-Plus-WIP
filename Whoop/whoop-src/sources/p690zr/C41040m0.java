package p690zr;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: zr.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41040m0 extends AbstractC41036k1 {

    /* JADX INFO: renamed from: w */
    public final Object f177023w;

    /* JADX INFO: renamed from: x */
    public boolean f177024x;

    public C41040m0(Object obj) {
        this.f177023w = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f177024x;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f177024x) {
            throw new NoSuchElementException();
        }
        this.f177024x = true;
        return this.f177023w;
    }
}
