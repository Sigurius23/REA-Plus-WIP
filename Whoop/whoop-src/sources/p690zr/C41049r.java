package p690zr;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: zr.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C41049r implements Iterator {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f177038E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C41055u f177039F;

    /* JADX INFO: renamed from: w */
    public int f177040w;

    /* JADX INFO: renamed from: x */
    public int f177041x;

    /* JADX INFO: renamed from: y */
    public int f177042y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C41055u f177043z;

    public C41049r(C41055u c41055u, int i13) {
        this.f177038E = i13;
        this.f177039F = c41055u;
        this.f177043z = c41055u;
        this.f177040w = c41055u.f177054E;
        this.f177041x = c41055u.isEmpty() ? -1 : 0;
        this.f177042y = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f177041x >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object c41053t;
        C41055u c41055u = this.f177043z;
        if (c41055u.f177054E != this.f177040w) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i13 = this.f177041x;
        this.f177042y = i13;
        switch (this.f177038E) {
            case 0:
                c41053t = this.f177039F.m133304j()[i13];
                break;
            case 1:
                c41053t = new C41053t(this.f177039F, i13);
                break;
            default:
                c41053t = this.f177039F.m133305k()[i13];
                break;
        }
        int i14 = this.f177041x + 1;
        if (i14 >= c41055u.f177055F) {
            i14 = -1;
        }
        this.f177041x = i14;
        return c41053t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C41055u c41055u = this.f177043z;
        int i13 = c41055u.f177054E;
        int i14 = this.f177040w;
        if (i13 != i14) {
            throw new ConcurrentModificationException();
        }
        int i15 = this.f177042y;
        if (!(i15 >= 0)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f177040w = i14 + 32;
        c41055u.remove(c41055u.m133304j()[i15]);
        this.f177041x--;
        this.f177042y = -1;
    }
}
