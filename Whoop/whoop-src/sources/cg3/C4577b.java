package cg3;

import dg3.C12012a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p047c9.C4320k;

/* JADX INFO: renamed from: cg3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C4577b implements Iterator {

    /* JADX INFO: renamed from: w */
    public final CharSequence f18434w;

    /* JADX INFO: renamed from: x */
    public final C4576a f18435x;

    /* JADX INFO: renamed from: y */
    public int f18436y = 0;

    /* JADX INFO: renamed from: z */
    public C12012a f18437z = null;

    public C4577b(CharSequence charSequence, C4576a c4576a) {
        this.f18434w = charSequence;
        this.f18435x = c4576a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18436y < this.f18434w.length();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        if (this.f18437z == null) {
            C4576a c4576a = this.f18435x;
            if (!c4576a.hasNext()) {
                int length = this.f18434w.length();
                C4320k c4320k = new C4320k(this.f18436y, length, 1);
                this.f18436y = length;
                return c4320k;
            }
            if (!c4576a.hasNext()) {
                throw new NoSuchElementException();
            }
            C12012a c12012a = c4576a.f18431x;
            c4576a.f18431x = null;
            this.f18437z = c12012a;
        }
        int i13 = this.f18436y;
        C12012a c12012a2 = this.f18437z;
        int i14 = c12012a2.f39743x;
        if (i13 < i14) {
            C4320k c4320k2 = new C4320k(i13, i14, 1);
            this.f18436y = i14;
            return c4320k2;
        }
        this.f18436y = c12012a2.f39744y;
        this.f18437z = null;
        return c12012a2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
