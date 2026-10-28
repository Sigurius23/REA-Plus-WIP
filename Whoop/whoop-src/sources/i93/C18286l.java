package i93;

import d93.InterfaceC11820a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: i93.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C18286l implements Iterator, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final long f71144w;

    /* JADX INFO: renamed from: x */
    public final long f71145x;

    /* JADX INFO: renamed from: y */
    public boolean f71146y;

    /* JADX INFO: renamed from: z */
    public long f71147z;

    public C18286l(long j7, long j13, long j14) {
        this.f71144w = j14;
        this.f71145x = j13;
        boolean z4 = false;
        if (j14 <= 0 ? j7 >= j13 : j7 <= j13) {
            z4 = true;
        }
        this.f71146y = z4;
        this.f71147z = z4 ? j7 : j13;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f71146y;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(nextLong());
    }

    public final long nextLong() {
        long j7 = this.f71147z;
        if (j7 != this.f71145x) {
            this.f71147z = this.f71144w + j7;
            return j7;
        }
        if (!this.f71146y) {
            throw new NoSuchElementException();
        }
        this.f71146y = false;
        return j7;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
