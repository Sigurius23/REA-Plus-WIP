package gl;

import al.C0960g;
import androidx.profileinstaller.ProfileVerifier;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: gl.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C15956u extends FilterInputStream {

    /* JADX INFO: renamed from: E */
    public int f60383E;

    /* JADX INFO: renamed from: F */
    public final C0960g f60384F;

    /* JADX INFO: renamed from: w */
    public volatile byte[] f60385w;

    /* JADX INFO: renamed from: x */
    public int f60386x;

    /* JADX INFO: renamed from: y */
    public int f60387y;

    /* JADX INFO: renamed from: z */
    public int f60388z;

    public C15956u(InputStream inputStream, C0960g c0960g) {
        super(inputStream);
        this.f60388z = -1;
        this.f60384F = c0960g;
        this.f60385w = (byte[]) c0960g.m2444c(ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST, byte[].class);
    }

    /* JADX INFO: renamed from: i */
    public static void m45020i() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f60385w == null || inputStream == null) {
            m45020i();
            throw null;
        }
        return (this.f60386x - this.f60383E) + inputStream.available();
    }

    /* JADX INFO: renamed from: b */
    public final int m45021b(InputStream inputStream, byte[] bArr) throws IOException {
        int i13 = this.f60388z;
        if (i13 != -1) {
            int i14 = this.f60383E - i13;
            int i15 = this.f60387y;
            if (i14 < i15) {
                if (i13 == 0 && i15 > bArr.length && this.f60386x == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i15) {
                        i15 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f60384F.m2444c(i15, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f60385w = bArr2;
                    this.f60384F.m2448g(bArr);
                    bArr = bArr2;
                } else if (i13 > 0) {
                    System.arraycopy(bArr, i13, bArr, 0, bArr.length - i13);
                }
                int i16 = this.f60383E - this.f60388z;
                this.f60383E = i16;
                this.f60388z = 0;
                this.f60386x = 0;
                int i17 = inputStream.read(bArr, i16, bArr.length - i16);
                int i18 = this.f60383E;
                if (i17 > 0) {
                    i18 += i17;
                }
                this.f60386x = i18;
                return i17;
            }
        }
        int i19 = inputStream.read(bArr);
        if (i19 > 0) {
            this.f60388z = -1;
            this.f60383E = 0;
            this.f60386x = i19;
        }
        return i19;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f60385w != null) {
            this.f60384F.m2448g(this.f60385w);
            this.f60385w = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m45022h() {
        if (this.f60385w != null) {
            this.f60384F.m2448g(this.f60385w);
            this.f60385w = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i13) {
        this.f60387y = Math.max(this.f60387y, i13);
        this.f60388z = this.f60383E;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f60385w;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            m45020i();
            throw null;
        }
        if (this.f60383E >= this.f60386x && m45021b(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f60385w && (bArr = this.f60385w) == null) {
            m45020i();
            throw null;
        }
        int i13 = this.f60386x;
        int i14 = this.f60383E;
        if (i13 - i14 <= 0) {
            return -1;
        }
        this.f60383E = i14 + 1;
        return bArr[i14] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f60385w == null) {
            throw new IOException("Stream is closed");
        }
        int i13 = this.f60388z;
        if (-1 == i13) {
            throw new C15955t("Mark has been invalidated, pos: " + this.f60383E + " markLimit: " + this.f60387y);
        }
        this.f60383E = i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j7) {
        if (j7 < 1) {
            return 0L;
        }
        byte[] bArr = this.f60385w;
        if (bArr == null) {
            m45020i();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m45020i();
            throw null;
        }
        int i13 = this.f60386x;
        int i14 = this.f60383E;
        if (i13 - i14 >= j7) {
            this.f60383E = (int) (((long) i14) + j7);
            return j7;
        }
        long j13 = ((long) i13) - ((long) i14);
        this.f60383E = i13;
        if (this.f60388z == -1 || j7 > this.f60387y) {
            return j13 + inputStream.skip(j7 - j13);
        }
        if (m45021b(inputStream, bArr) == -1) {
            return j13;
        }
        int i15 = this.f60386x;
        int i16 = this.f60383E;
        if (i15 - i16 >= j7 - j13) {
            this.f60383E = (int) ((((long) i16) + j7) - j13);
            return j7;
        }
        long j14 = (j13 + ((long) i15)) - ((long) i16);
        this.f60383E = i15;
        return j14;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i13, int i14) {
        int i15;
        int i16;
        byte[] bArr2 = this.f60385w;
        if (bArr2 == null) {
            m45020i();
            throw null;
        }
        if (i14 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i17 = this.f60383E;
            int i18 = this.f60386x;
            if (i17 < i18) {
                int i19 = i18 - i17;
                if (i19 >= i14) {
                    i19 = i14;
                }
                System.arraycopy(bArr2, i17, bArr, i13, i19);
                this.f60383E += i19;
                if (i19 == i14 || inputStream.available() == 0) {
                    return i19;
                }
                i13 += i19;
                i15 = i14 - i19;
            } else {
                i15 = i14;
            }
            while (true) {
                if (this.f60388z == -1 && i15 >= bArr2.length) {
                    i16 = inputStream.read(bArr, i13, i15);
                    if (i16 == -1) {
                        return i15 != i14 ? i14 - i15 : -1;
                    }
                } else {
                    if (m45021b(inputStream, bArr2) == -1) {
                        return i15 != i14 ? i14 - i15 : -1;
                    }
                    if (bArr2 != this.f60385w && (bArr2 = this.f60385w) == null) {
                        m45020i();
                        throw null;
                    }
                    int i24 = this.f60386x;
                    int i25 = this.f60383E;
                    i16 = i24 - i25;
                    if (i16 >= i15) {
                        i16 = i15;
                    }
                    System.arraycopy(bArr2, i25, bArr, i13, i16);
                    this.f60383E += i16;
                }
                i15 -= i16;
                if (i15 == 0) {
                    return i14;
                }
                if (inputStream.available() == 0) {
                    return i14 - i15;
                }
                i13 += i16;
            }
        } else {
            m45020i();
            throw null;
        }
    }
}
