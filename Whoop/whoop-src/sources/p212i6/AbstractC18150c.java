package p212i6;

import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import n83.C26463f;
import p437qt.C30582e;

/* JADX INFO: renamed from: i6.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18150c {

    /* JADX INFO: renamed from: w */
    public int f70443w;

    /* JADX INFO: renamed from: x */
    public int f70444x;

    /* JADX INFO: renamed from: y */
    public int f70445y;

    /* JADX INFO: renamed from: z */
    public Object f70446z;

    public AbstractC18150c() {
        if (C30582e.f125831x == null) {
            C30582e.f125831x = new C30582e(26);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m52082a(int i13) {
        if (i13 < this.f70445y) {
            return ((ByteBuffer) this.f70446z).getShort(this.f70444x + i13);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public void m52083b() {
        if (((C26463f) this.f70446z).f105107H != this.f70445y) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m52084c() {
        while (true) {
            int i13 = this.f70443w;
            C26463f c26463f = (C26463f) this.f70446z;
            if (i13 >= c26463f.f105105F || c26463f.f105115y[i13] >= 0) {
                return;
            } else {
                this.f70443w = i13 + 1;
            }
        }
    }

    public boolean hasNext() {
        return this.f70443w < ((C26463f) this.f70446z).f105105F;
    }

    public void remove() {
        C26463f c26463f = (C26463f) this.f70446z;
        m52083b();
        if (this.f70444x == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        c26463f.m78381c();
        c26463f.m78390m(this.f70444x);
        this.f70444x = -1;
        this.f70445y = c26463f.f105107H;
    }
}
