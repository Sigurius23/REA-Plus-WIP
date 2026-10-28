package ne3;

import java.util.concurrent.locks.ReentrantLock;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C26628n implements InterfaceC26629n0 {

    /* JADX INFO: renamed from: w */
    public final C26646z f105894w;

    /* JADX INFO: renamed from: x */
    public long f105895x;

    /* JADX INFO: renamed from: y */
    public boolean f105896y;

    public C26628n(C26646z fileHandle) {
        AbstractC22676k.m65750j(fileHandle, "fileHandle");
        this.f105894w = fileHandle;
        this.f105895x = 0L;
    }

    @Override // ne3.InterfaceC26629n0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C26646z c26646z = this.f105894w;
        if (this.f105896y) {
            return;
        }
        this.f105896y = true;
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

    @Override // ne3.InterfaceC26629n0, java.io.Flushable
    public final void flush() {
        if (this.f105896y) {
            throw new IllegalStateException("closed");
        }
        C26646z c26646z = this.f105894w;
        synchronized (c26646z) {
            c26646z.f105930E.getFD().sync();
        }
    }

    @Override // ne3.InterfaceC26629n0
    public final C26637r0 timeout() {
        return C26637r0.f105903d;
    }

    @Override // ne3.InterfaceC26629n0
    public final void write(C26616h source, long j7) {
        AbstractC22676k.m65750j(source, "source");
        if (this.f105896y) {
            throw new IllegalStateException("closed");
        }
        C26646z c26646z = this.f105894w;
        long j13 = this.f105895x;
        c26646z.getClass();
        AbstractC26604b.m79160e(source.f105866x, 0L, j7);
        long j14 = j13 + j7;
        while (j13 < j14) {
            C26623k0 c26623k0 = source.f105865w;
            AbstractC22676k.m65747g(c26623k0);
            int iMin = (int) Math.min(j14 - j13, c26623k0.f105876c - c26623k0.f105875b);
            byte[] array = c26623k0.f105874a;
            int i13 = c26623k0.f105875b;
            synchronized (c26646z) {
                AbstractC22676k.m65750j(array, "array");
                c26646z.f105930E.seek(j13);
                c26646z.f105930E.write(array, i13, iMin);
            }
            int i14 = c26623k0.f105875b + iMin;
            c26623k0.f105875b = i14;
            long j15 = iMin;
            j13 += j15;
            source.f105866x -= j15;
            if (i14 == c26623k0.f105876c) {
                source.f105865w = c26623k0.m79243a();
                AbstractC26625l0.m79267a(c26623k0);
            }
        }
        this.f105895x += j7;
    }
}
