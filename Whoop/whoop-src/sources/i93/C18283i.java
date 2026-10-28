package i93;

import java.util.NoSuchElementException;
import m83.AbstractC25243e0;

/* JADX INFO: renamed from: i93.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C18283i extends AbstractC25243e0 {

    /* JADX INFO: renamed from: w */
    public final int f71136w;

    /* JADX INFO: renamed from: x */
    public final int f71137x;

    /* JADX INFO: renamed from: y */
    public boolean f71138y;

    /* JADX INFO: renamed from: z */
    public int f71139z;

    public C18283i(int i13, int i14, int i15) {
        this.f71136w = i15;
        this.f71137x = i14;
        boolean z4 = false;
        if (i15 <= 0 ? i13 >= i14 : i13 <= i14) {
            z4 = true;
        }
        this.f71138y = z4;
        this.f71139z = z4 ? i13 : i14;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71138y;
    }

    @Override // m83.AbstractC25243e0
    public final int nextInt() {
        int i13 = this.f71139z;
        if (i13 != this.f71137x) {
            this.f71139z = this.f71136w + i13;
            return i13;
        }
        if (!this.f71138y) {
            throw new NoSuchElementException();
        }
        this.f71138y = false;
        return i13;
    }
}
