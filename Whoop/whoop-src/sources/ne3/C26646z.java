package ne3;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C26646z implements Closeable {

    /* JADX INFO: renamed from: E */
    public final RandomAccessFile f105930E;

    /* JADX INFO: renamed from: w */
    public final boolean f105931w;

    /* JADX INFO: renamed from: x */
    public boolean f105932x;

    /* JADX INFO: renamed from: y */
    public int f105933y;

    /* JADX INFO: renamed from: z */
    public final ReentrantLock f105934z = new ReentrantLock();

    public C26646z(boolean z4, RandomAccessFile randomAccessFile) {
        this.f105931w = z4;
        this.f105930E = randomAccessFile;
    }

    /* JADX INFO: renamed from: h */
    public static C26628n m79287h(C26646z c26646z) {
        if (!c26646z.f105931w) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = c26646z.f105934z;
        reentrantLock.lock();
        try {
            if (c26646z.f105932x) {
                throw new IllegalStateException("closed");
            }
            c26646z.f105933y++;
            reentrantLock.unlock();
            return new C26628n(c26646z);
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized int m79288b(long j7, byte[] array, int i13, int i14) {
        AbstractC22676k.m65750j(array, "array");
        this.f105930E.seek(j7);
        int i15 = 0;
        while (i15 < i14) {
            int i16 = this.f105930E.read(array, i13, i14 - i15);
            if (i16 == -1) {
                if (i15 != 0) {
                    break;
                }
                return -1;
            }
            i15 += i16;
        }
        return i15;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f105934z;
        reentrantLock.lock();
        try {
            if (this.f105932x) {
                reentrantLock.unlock();
                return;
            }
            this.f105932x = true;
            if (this.f105933y != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f105930E.close();
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final void flush() {
        if (!this.f105931w) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f105934z;
        reentrantLock.lock();
        try {
            if (this.f105932x) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f105930E.getFD().sync();
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: i */
    public final C26630o m79289i(long j7) {
        ReentrantLock reentrantLock = this.f105934z;
        reentrantLock.lock();
        try {
            if (this.f105932x) {
                throw new IllegalStateException("closed");
            }
            this.f105933y++;
            reentrantLock.unlock();
            return new C26630o(this, j7);
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f105934z;
        reentrantLock.lock();
        try {
            if (this.f105932x) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.f105930E.length();
            }
            return length;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }
}
