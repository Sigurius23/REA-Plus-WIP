package tl;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: tl.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C33910i extends FilterInputStream {

    /* JADX INFO: renamed from: w */
    public int f142088w;

    public C33910i(C33905d c33905d) {
        super(c33905d);
        this.f142088w = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i13 = this.f142088w;
        return i13 == Integer.MIN_VALUE ? super.available() : Math.min(i13, super.available());
    }

    /* JADX INFO: renamed from: b */
    public final long m107263b(long j7) {
        int i13 = this.f142088w;
        if (i13 == 0) {
            return -1L;
        }
        return (i13 == Integer.MIN_VALUE || j7 <= ((long) i13)) ? j7 : i13;
    }

    /* JADX INFO: renamed from: h */
    public final void m107264h(long j7) {
        int i13 = this.f142088w;
        if (i13 == Integer.MIN_VALUE || j7 == -1) {
            return;
        }
        this.f142088w = (int) (((long) i13) - j7);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i13) {
        super.mark(i13);
        this.f142088w = i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (m107263b(1L) == -1) {
            return -1;
        }
        int i13 = super.read();
        m107264h(1L);
        return i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f142088w = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j7) throws IOException {
        long jM107263b = m107263b(j7);
        if (jM107263b == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM107263b);
        m107264h(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) throws IOException {
        int iM107263b = (int) m107263b(i14);
        if (iM107263b == -1) {
            return -1;
        }
        int i15 = super.read(bArr, i13, iM107263b);
        m107264h(i15);
        return i15;
    }
}
