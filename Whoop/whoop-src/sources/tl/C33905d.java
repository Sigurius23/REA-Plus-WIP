package tl;

import gl.C15956u;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: tl.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C33905d extends InputStream {

    /* JADX INFO: renamed from: y */
    public static final ArrayDeque f142078y;

    /* JADX INFO: renamed from: w */
    public C15956u f142079w;

    /* JADX INFO: renamed from: x */
    public IOException f142080x;

    static {
        char[] cArr = AbstractC33913l.f142093a;
        f142078y = new ArrayDeque(0);
    }

    /* JADX INFO: renamed from: b */
    public static C33905d m107256b(C15956u c15956u) {
        C33905d c33905d;
        ArrayDeque arrayDeque = f142078y;
        synchronized (arrayDeque) {
            c33905d = (C33905d) arrayDeque.poll();
        }
        if (c33905d == null) {
            c33905d = new C33905d();
        }
        c33905d.f142079w = c15956u;
        return c33905d;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f142079w.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f142079w.close();
    }

    /* JADX INFO: renamed from: h */
    public final void m107257h() {
        this.f142080x = null;
        this.f142079w = null;
        ArrayDeque arrayDeque = f142078y;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i13) {
        this.f142079w.mark(i13);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f142079w.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f142079w.read(bArr);
        } catch (IOException e5) {
            this.f142080x = e5;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f142079w.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j7) {
        try {
            return this.f142079w.skip(j7);
        } catch (IOException e5) {
            this.f142080x = e5;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) {
        try {
            return this.f142079w.read(bArr, i13, i14);
        } catch (IOException e5) {
            this.f142080x = e5;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f142079w.read();
        } catch (IOException e5) {
            this.f142080x = e5;
            return -1;
        }
    }
}
