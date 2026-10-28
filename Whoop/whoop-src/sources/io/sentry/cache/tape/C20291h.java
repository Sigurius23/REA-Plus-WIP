package io.sentry.cache.tape;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: io.sentry.cache.tape.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C20291h implements Iterator {

    /* JADX INFO: renamed from: w */
    public int f76173w = 0;

    /* JADX INFO: renamed from: x */
    public long f76174x;

    /* JADX INFO: renamed from: y */
    public int f76175y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C20292i f76176z;

    public C20291h(C20292i c20292i) {
        this.f76176z = c20292i;
        this.f76174x = c20292i.f76178E.f76171a;
        this.f76175y = c20292i.f76181H;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C20292i c20292i = this.f76176z;
        if (c20292i.f76183J) {
            throw new IllegalStateException("closed");
        }
        if (c20292i.f76181H == this.f76175y) {
            return this.f76173w != c20292i.f76187z;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final Object next() throws IOException {
        byte[] bArr = C20292i.f76177K;
        C20292i c20292i = this.f76176z;
        if (c20292i.f76183J) {
            throw new IllegalStateException("closed");
        }
        if (c20292i.f76181H != this.f76175y) {
            throw new ConcurrentModificationException();
        }
        int i13 = c20292i.f76187z;
        if (i13 == 0) {
            throw new NoSuchElementException();
        }
        if (this.f76173w >= i13) {
            throw new NoSuchElementException();
        }
        try {
            C20290g c20290gM56278F0 = c20292i.m56278F0(this.f76174x);
            int i14 = c20290gM56278F0.f76172b;
            long j7 = c20290gM56278F0.f76171a;
            byte[] bArr2 = new byte[i14];
            long j13 = j7 + 4;
            long jM56284p1 = c20292i.m56284p1(j13);
            this.f76174x = jM56284p1;
            if (!c20292i.m56282n1(i14, jM56284p1, bArr2)) {
                this.f76173w = c20292i.f76187z;
                return bArr;
            }
            this.f76174x = c20292i.m56284p1(j13 + ((long) i14));
            this.f76173w++;
            return bArr2;
        } catch (IOException e5) {
            throw e5;
        } catch (OutOfMemoryError unused) {
            c20292i.m56281m1();
            this.f76173w = c20292i.f76187z;
            return bArr;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C20292i c20292i = this.f76176z;
        if (c20292i.f76181H != this.f76175y) {
            throw new ConcurrentModificationException();
        }
        if (c20292i.f76187z == 0) {
            throw new NoSuchElementException();
        }
        if (this.f76173w != 1) {
            throw new UnsupportedOperationException("Removal is only permitted from the head.");
        }
        c20292i.m56280l1(1);
        this.f76175y = c20292i.f76181H;
        this.f76173w--;
    }
}
