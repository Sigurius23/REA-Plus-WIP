package ub3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ub3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C34750d implements Iterator {

    /* JADX INFO: renamed from: w */
    public static final C34750d f146402w = new C34750d();

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
        throw new IllegalStateException();
    }
}
