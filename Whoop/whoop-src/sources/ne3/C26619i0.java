package ne3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import live.hms.video.utils.HMSConstantsKt;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C26619i0 extends InputStream {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C26621j0 f105870w;

    public C26619i0(C26621j0 c26621j0) {
        this.f105870w = c26621j0;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        C26621j0 c26621j0 = this.f105870w;
        if (c26621j0.f105873y) {
            throw new IOException("closed");
        }
        return (int) Math.min(c26621j0.f105872x.f105866x, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f105870w.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        C26621j0 c26621j0 = this.f105870w;
        C26616h c26616h = c26621j0.f105872x;
        if (c26621j0.f105873y) {
            throw new IOException("closed");
        }
        if (c26616h.f105866x == 0 && c26621j0.f105871w.mo9164h1(c26616h, HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE) == -1) {
            return -1;
        }
        return c26616h.readByte() & 255;
    }

    public final String toString() {
        return this.f105870w + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final long transferTo(OutputStream out) throws IOException {
        AbstractC22676k.m65750j(out, "out");
        C26621j0 c26621j0 = this.f105870w;
        C26616h c26616h = c26621j0.f105872x;
        if (c26621j0.f105873y) {
            throw new IOException("closed");
        }
        long j7 = 0;
        while (true) {
            if (c26616h.f105866x == 0 && c26621j0.f105871w.mo9164h1(c26616h, HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE) == -1) {
                return j7;
            }
            long j13 = c26616h.f105866x;
            j7 += j13;
            c26616h.m79230s1(out, j13);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] data, int i13, int i14) throws IOException {
        AbstractC22676k.m65750j(data, "data");
        C26621j0 c26621j0 = this.f105870w;
        C26616h c26616h = c26621j0.f105872x;
        if (!c26621j0.f105873y) {
            AbstractC26604b.m79160e(data.length, i13, i14);
            if (c26616h.f105866x == 0 && c26621j0.f105871w.mo9164h1(c26616h, HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE) == -1) {
                return -1;
            }
            return c26616h.read(data, i13, i14);
        }
        throw new IOException("closed");
    }
}
