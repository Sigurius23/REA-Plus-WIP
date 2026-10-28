package p002a0;

import m83.AbstractC25243e0;

/* JADX INFO: renamed from: a0.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0027h1 extends AbstractC25243e0 {

    /* JADX INFO: renamed from: w */
    public int f67w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0024g1 f68x;

    public C0027h1(C0024g1 c0024g1) {
        this.f68x = c0024g1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f67w < this.f68x.m58g();
    }

    @Override // m83.AbstractC25243e0
    public final int nextInt() {
        int i13 = this.f67w;
        this.f67w = i13 + 1;
        return this.f68x.m56e(i13);
    }
}
