package p092dh;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: dh.l */
/* JADX INFO: loaded from: classes.dex */
public final class C12025l extends InputStream {

    /* JADX INFO: renamed from: w */
    public final InputStream f39770w;

    /* JADX INFO: renamed from: x */
    public int f39771x = 1073741824;

    public C12025l(InputStream inputStream) {
        this.f39770w = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f39771x;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f39770w.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i13 = this.f39770w.read();
        if (i13 == -1) {
            this.f39771x = 0;
        }
        return i13;
    }

    @Override // java.io.InputStream
    public final long skip(long j7) {
        return this.f39770w.skip(j7);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i13 = this.f39770w.read(bArr);
        if (i13 == -1) {
            this.f39771x = 0;
        }
        return i13;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) throws IOException {
        int i15 = this.f39770w.read(bArr, i13, i14);
        if (i15 == -1) {
            this.f39771x = 0;
        }
        return i15;
    }
}
