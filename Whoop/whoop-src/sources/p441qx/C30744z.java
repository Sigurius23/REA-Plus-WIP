package p441qx;

import java.util.Iterator;

/* JADX INFO: renamed from: qx.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C30744z implements Iterator, Cloneable {

    /* JADX INFO: renamed from: w */
    public final EnumC30741w f126568w;

    /* JADX INFO: renamed from: x */
    public final Object[] f126569x;

    /* JADX INFO: renamed from: y */
    public int f126570y;

    public C30744z(EnumC30741w enumC30741w, Object[] objArr, int i13) {
        this.f126568w = enumC30741w;
        this.f126569x = objArr;
        this.f126570y = i13;
    }

    public final Object clone() {
        return new C30744z(this.f126568w, this.f126569x, this.f126570y);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f126570y < this.f126569x.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i13 = this.f126570y;
        this.f126570y = i13 + 1;
        return this.f126569x[i13];
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
