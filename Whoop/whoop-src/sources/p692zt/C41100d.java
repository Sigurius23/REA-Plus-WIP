package p692zt;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: zt.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C41100d extends FilterInputStream {

    /* JADX INFO: renamed from: w */
    public long f177188w;

    /* JADX INFO: renamed from: x */
    public long f177189x;

    public C41100d(InputStream inputStream) {
        super(inputStream);
        this.f177189x = -1L;
        this.f177188w = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f177188w);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i13) {
        ((FilterInputStream) this).in.mark(i13);
        this.f177189x = this.f177188w;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f177188w == 0) {
            return -1;
        }
        int i13 = ((FilterInputStream) this).in.read();
        if (i13 != -1) {
            this.f177188w--;
        }
        return i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f177189x == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f177188w = this.f177189x;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j7) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j7, this.f177188w));
        this.f177188w -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) throws IOException {
        long j7 = this.f177188w;
        if (j7 == 0) {
            return -1;
        }
        int i15 = ((FilterInputStream) this).in.read(bArr, i13, (int) Math.min(i14, j7));
        if (i15 != -1) {
            this.f177188w -= (long) i15;
        }
        return i15;
    }
}
