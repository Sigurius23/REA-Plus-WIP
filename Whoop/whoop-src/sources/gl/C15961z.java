package gl;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantLock;
import ne3.C26646z;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gl.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C15961z extends MediaDataSource {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f60394w = 0;

    /* JADX INFO: renamed from: x */
    public final Object f60395x;

    public C15961z(C26646z c26646z) {
        this.f60395x = c26646z;
    }

    /* JADX INFO: renamed from: b */
    private final void m45032b() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f60394w) {
            case 0:
                break;
            default:
                ((C26646z) this.f60395x).close();
                break;
        }
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        switch (this.f60394w) {
            case 0:
                return ((ByteBuffer) this.f60395x).limit();
            default:
                return ((C26646z) this.f60395x).size();
        }
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j7, byte[] array, int i13, int i14) {
        switch (this.f60394w) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) this.f60395x;
                if (j7 >= byteBuffer.limit()) {
                    return -1;
                }
                byteBuffer.position((int) j7);
                int iMin = Math.min(i14, byteBuffer.remaining());
                byteBuffer.get(array, i13, iMin);
                return iMin;
            default:
                C26646z c26646z = (C26646z) this.f60395x;
                c26646z.getClass();
                AbstractC22676k.m65750j(array, "array");
                ReentrantLock reentrantLock = c26646z.f105934z;
                reentrantLock.lock();
                try {
                    if (c26646z.f105932x) {
                        throw new IllegalStateException("closed");
                    }
                    return c26646z.m79288b(j7, array, i13, i14);
                } finally {
                    reentrantLock.unlock();
                }
        }
    }

    public C15961z(ByteBuffer byteBuffer) {
        this.f60395x = byteBuffer;
    }
}
