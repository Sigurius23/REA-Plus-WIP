package io.sentry;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: io.sentry.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C20324f implements Iterator {

    /* JADX INFO: renamed from: w */
    public int f76329w;

    /* JADX INFO: renamed from: x */
    public int f76330x = -1;

    /* JADX INFO: renamed from: y */
    public boolean f76331y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C20336g f76332z;

    public C20324f(C20336g c20336g) {
        this.f76332z = c20336g;
        this.f76329w = c20336g.f76344x;
        this.f76331y = c20336g.f76346z;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f76331y || this.f76329w != this.f76332z.f76345y;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f76331y = false;
        int i13 = this.f76329w;
        this.f76330x = i13;
        int i14 = i13 + 1;
        C20336g c20336g = this.f76332z;
        this.f76329w = i14 < c20336g.f76342E ? i14 : 0;
        return c20336g.f76343w[i13];
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i13;
        C20336g c20336g = this.f76332z;
        int i14 = c20336g.f76342E;
        Object[] objArr = c20336g.f76343w;
        int i15 = this.f76330x;
        if (i15 == -1) {
            throw new IllegalStateException();
        }
        int i16 = c20336g.f76344x;
        if (i15 == i16) {
            c20336g.remove();
            this.f76330x = -1;
            return;
        }
        int i17 = i15 + 1;
        if (i16 >= i15 || i17 >= (i13 = c20336g.f76345y)) {
            while (i17 != c20336g.f76345y) {
                if (i17 >= i14) {
                    objArr[i17 - 1] = objArr[0];
                } else {
                    int i18 = i17 - 1;
                    if (i18 < 0) {
                        i18 = i14 - 1;
                    }
                    objArr[i18] = objArr[i17];
                    i17++;
                    if (i17 >= i14) {
                    }
                }
                i17 = 0;
            }
        } else {
            System.arraycopy(objArr, i17, objArr, i15, i13 - i17);
        }
        this.f76330x = -1;
        int i19 = c20336g.f76345y - 1;
        if (i19 < 0) {
            i19 = i14 - 1;
        }
        c20336g.f76345y = i19;
        objArr[i19] = null;
        c20336g.f76346z = false;
        int i24 = this.f76329w - 1;
        if (i24 < 0) {
            i24 = i14 - 1;
        }
        this.f76329w = i24;
    }
}
