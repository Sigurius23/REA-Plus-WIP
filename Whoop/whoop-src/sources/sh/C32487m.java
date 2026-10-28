package sh;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: sh.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C32487m extends InputStream {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f134516w = 0;

    /* JADX INFO: renamed from: x */
    public int f134517x = 1073741824;

    /* JADX INFO: renamed from: y */
    public final Object f134518y;

    public C32487m(InputStream inputStream) {
        this.f134518y = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f134516w) {
            case 0:
                return this.f134517x;
            default:
                return ((ByteBuffer) this.f134518y).remaining();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f134516w) {
            case 0:
                ((InputStream) this.f134518y).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i13) {
        switch (this.f134516w) {
            case 1:
                synchronized (this) {
                    this.f134517x = ((ByteBuffer) this.f134518y).position();
                }
                return;
            default:
                super.mark(i13);
                return;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        switch (this.f134516w) {
            case 1:
                return true;
            default:
                return super.markSupported();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        switch (this.f134516w) {
            case 0:
                int i13 = ((InputStream) this.f134518y).read(bArr);
                if (i13 == -1) {
                    this.f134517x = 0;
                }
                return i13;
            default:
                return super.read(bArr);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f134516w) {
            case 1:
                synchronized (this) {
                    int i13 = this.f134517x;
                    if (i13 == -1) {
                        throw new IOException("Cannot reset to unset mark position");
                    }
                    ((ByteBuffer) this.f134518y).position(i13);
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j7) {
        switch (this.f134516w) {
            case 0:
                return ((InputStream) this.f134518y).skip(j7);
            default:
                ByteBuffer byteBuffer = (ByteBuffer) this.f134518y;
                if (!byteBuffer.hasRemaining()) {
                    return -1L;
                }
                long jMin = Math.min(j7, byteBuffer.remaining());
                byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
                return jMin;
        }
    }

    public C32487m(ByteBuffer byteBuffer) {
        this.f134518y = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f134516w) {
            case 0:
                int i13 = ((InputStream) this.f134518y).read();
                if (i13 == -1) {
                    this.f134517x = 0;
                }
                return i13;
            default:
                ByteBuffer byteBuffer = (ByteBuffer) this.f134518y;
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & 255;
                }
                return -1;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) throws IOException {
        switch (this.f134516w) {
            case 0:
                int i15 = ((InputStream) this.f134518y).read(bArr, i13, i14);
                if (i15 == -1) {
                    this.f134517x = 0;
                }
                return i15;
            default:
                ByteBuffer byteBuffer = (ByteBuffer) this.f134518y;
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int iMin = Math.min(i14, byteBuffer.remaining());
                byteBuffer.get(bArr, i13, iMin);
                return iMin;
        }
    }
}
