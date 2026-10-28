package io.sentry.android.core;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import p133f1.C13968p1;

/* JADX INFO: renamed from: io.sentry.android.core.w0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C20166w0 extends InputStream {

    /* JADX INFO: renamed from: w */
    public final BufferedInputStream f75761w;

    /* JADX INFO: renamed from: x */
    public long f75762x;

    public C20166w0(BufferedInputStream bufferedInputStream, int i13) {
        this.f75761w = bufferedInputStream;
        this.f75762x = i13;
    }

    @Override // java.io.InputStream
    public final int available() {
        return Math.min(this.f75761w.available(), (int) this.f75762x);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C13968p1.m39747w(this.f75761w, this.f75762x);
        this.f75762x = 0L;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f75762x <= 0) {
            return -1;
        }
        int i13 = this.f75761w.read();
        if (i13 != -1) {
            this.f75762x--;
        }
        return i13;
    }

    @Override // java.io.InputStream
    public final long skip(long j7) throws IOException {
        long jSkip = this.f75761w.skip(Math.min(j7, this.f75762x));
        this.f75762x -= jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) throws IOException {
        long j7 = this.f75762x;
        if (j7 <= 0) {
            return -1;
        }
        int i15 = this.f75761w.read(bArr, i13, Math.min(i14, (int) j7));
        if (i15 > 0) {
            this.f75762x -= (long) i15;
        }
        return i15;
    }
}
