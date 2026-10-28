package p618xk;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: xk.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C38418i extends FilterInputStream {

    /* JADX INFO: renamed from: y */
    public static final byte[] f164481y = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: z */
    public static final int f164482z = 31;

    /* JADX INFO: renamed from: w */
    public final byte f164483w;

    /* JADX INFO: renamed from: x */
    public int f164484x;

    public C38418i(InputStream inputStream, int i13) {
        super(inputStream);
        if (i13 < -1 || i13 > 8) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Cannot add invalid orientation: "));
        }
        this.f164483w = (byte) i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i13) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i13;
        int i14;
        int i15 = this.f164484x;
        if (i15 < 2 || i15 > (i14 = f164482z)) {
            i13 = super.read();
        } else {
            i13 = i15 == i14 ? this.f164483w : f164481y[i15 - 2] & 255;
        }
        if (i13 != -1) {
            this.f164484x++;
        }
        return i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j7) throws IOException {
        long jSkip = super.skip(j7);
        if (jSkip > 0) {
            this.f164484x = (int) (((long) this.f164484x) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) throws IOException {
        int i15;
        int i16 = this.f164484x;
        int i17 = f164482z;
        if (i16 > i17) {
            i15 = super.read(bArr, i13, i14);
        } else if (i16 == i17) {
            bArr[i13] = this.f164483w;
            i15 = 1;
        } else if (i16 < 2) {
            i15 = super.read(bArr, i13, 2 - i16);
        } else {
            int iMin = Math.min(i17 - i16, i14);
            System.arraycopy(f164481y, this.f164484x - 2, bArr, i13, iMin);
            i15 = iMin;
        }
        if (i15 > 0) {
            this.f164484x += i15;
        }
        return i15;
    }
}
