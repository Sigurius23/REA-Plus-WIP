package ub3;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ub3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C34751e implements Iterator {

    /* JADX INFO: renamed from: w */
    public boolean f146403w;

    /* JADX INFO: renamed from: x */
    public final int f146404x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C34752f f146405y;

    public C34751e(C34752f c34752f) {
        this.f146405y = c34752f;
        this.f146404x = ((AbstractList) c34752f).modCount;
    }

    /* JADX INFO: renamed from: a */
    public final void m109746a() {
        C34752f c34752f = this.f146405y;
        int i13 = ((AbstractList) c34752f).modCount;
        int i14 = this.f146404x;
        if (i13 == i14) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) c34752f).modCount + "; expected: " + i14);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f146403w;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f146403w) {
            throw new NoSuchElementException();
        }
        this.f146403w = true;
        m109746a();
        return this.f146405y.f146407x;
    }

    @Override // java.util.Iterator
    public final void remove() {
        m109746a();
        this.f146405y.clear();
    }
}
