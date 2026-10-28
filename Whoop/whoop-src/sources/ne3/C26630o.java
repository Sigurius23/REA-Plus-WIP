package ne3;

import java.util.concurrent.locks.ReentrantLock;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C26630o implements InterfaceC26633p0 {

    /* JADX INFO: renamed from: w */
    public final C26646z f105897w;

    /* JADX INFO: renamed from: x */
    public long f105898x;

    /* JADX INFO: renamed from: y */
    public boolean f105899y;

    public C26630o(C26646z c26646z, long j7) {
        this.f105897w = c26646z;
        this.f105898x = j7;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C26646z c26646z = this.f105897w;
        if (this.f105899y) {
            return;
        }
        this.f105899y = true;
        ReentrantLock reentrantLock = c26646z.f105934z;
        reentrantLock.lock();
        try {
            int i13 = c26646z.f105933y - 1;
            c26646z.f105933y = i13;
            if (i13 == 0 && c26646z.f105932x) {
                reentrantLock.unlock();
                synchronized (c26646z) {
                    c26646z.f105930E.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h sink, long j7) {
        long j13;
        long j14;
        AbstractC22676k.m65750j(sink, "sink");
        if (this.f105899y) {
            throw new IllegalStateException("closed");
        }
        long j15 = this.f105898x;
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "byteCount < 0: ").toString());
        }
        long j16 = j7 + j15;
        long j17 = j15;
        while (true) {
            if (j17 < j16) {
                C26623k0 c26623k0M79216k1 = sink.m79216k1(1);
                byte[] bArr = c26623k0M79216k1.f105874a;
                int i13 = c26623k0M79216k1.f105876c;
                j13 = -1;
                long j18 = j16;
                int iM79288b = this.f105897w.m79288b(j17, bArr, i13, (int) Math.min(j16 - j17, 8192 - i13));
                if (iM79288b == -1) {
                    if (c26623k0M79216k1.f105875b == c26623k0M79216k1.f105876c) {
                        sink.f105865w = c26623k0M79216k1.m79243a();
                        AbstractC26625l0.m79267a(c26623k0M79216k1);
                    }
                    if (j15 == j17) {
                        j14 = -1;
                        break;
                    }
                } else {
                    c26623k0M79216k1.f105876c += iM79288b;
                    long j19 = iM79288b;
                    j17 += j19;
                    sink.f105866x += j19;
                    j16 = j18;
                }
            } else {
                j13 = -1;
            }
            j14 = j17 - j15;
            break;
        }
        if (j14 != j13) {
            this.f105898x += j14;
        }
        return j14;
    }

    @Override // ne3.InterfaceC26633p0
    public final C26637r0 timeout() {
        return C26637r0.f105903d;
    }
}
