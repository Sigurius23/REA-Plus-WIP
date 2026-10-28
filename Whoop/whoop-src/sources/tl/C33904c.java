package tl;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: tl.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C33904c extends FilterInputStream {

    /* JADX INFO: renamed from: w */
    public final long f142076w;

    /* JADX INFO: renamed from: x */
    public int f142077x;

    public C33904c(InputStream inputStream, long j7) {
        super(inputStream);
        this.f142076w = j7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f142076w - ((long) this.f142077x), ((FilterInputStream) this).in.available());
    }

    /* JADX INFO: renamed from: b */
    public final void m107255b(int i13) throws IOException {
        if (i13 >= 0) {
            this.f142077x += i13;
            return;
        }
        long j7 = this.f142077x;
        long j13 = this.f142076w;
        if (j13 - j7 <= 0) {
            return;
        }
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j13, "Failed to read all expected data, expected: ", ", but read: ");
        sbM125596b.append(this.f142077x);
        throw new IOException(sbM125596b.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i13;
        i13 = super.read();
        m107255b(i13 >= 0 ? 1 : -1);
        return i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i13, int i14) {
        int i15;
        i15 = super.read(bArr, i13, i14);
        m107255b(i15);
        return i15;
    }
}
