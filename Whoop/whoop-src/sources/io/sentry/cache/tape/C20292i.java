package io.sentry.cache.tape;

import ih0.AbstractC18489d0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: io.sentry.cache.tape.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C20292i implements Closeable, Iterable {

    /* JADX INFO: renamed from: K */
    public static final byte[] f76177K = new byte[4096];

    /* JADX INFO: renamed from: E */
    public C20290g f76178E;

    /* JADX INFO: renamed from: F */
    public C20290g f76179F;

    /* JADX INFO: renamed from: G */
    public final byte[] f76180G = new byte[32];

    /* JADX INFO: renamed from: H */
    public int f76181H = 0;

    /* JADX INFO: renamed from: I */
    public final int f76182I;

    /* JADX INFO: renamed from: J */
    public boolean f76183J;

    /* JADX INFO: renamed from: w */
    public RandomAccessFile f76184w;

    /* JADX INFO: renamed from: x */
    public final File f76185x;

    /* JADX INFO: renamed from: y */
    public long f76186y;

    /* JADX INFO: renamed from: z */
    public int f76187z;

    public C20292i(File file, RandomAccessFile randomAccessFile, int i13) throws IOException {
        this.f76185x = file;
        this.f76184w = randomAccessFile;
        this.f76182I = i13;
        m56279R0();
    }

    /* JADX INFO: renamed from: j1 */
    public static int m56273j1(int i13, byte[] bArr) {
        return ((bArr[i13] & 255) << 24) + ((bArr[i13 + 1] & 255) << 16) + ((bArr[i13 + 2] & 255) << 8) + (bArr[i13 + 3] & 255);
    }

    /* JADX INFO: renamed from: k1 */
    public static long m56274k1(int i13, byte[] bArr) {
        return ((((long) bArr[i13]) & 255) << 56) + ((((long) bArr[i13 + 1]) & 255) << 48) + ((((long) bArr[i13 + 2]) & 255) << 40) + ((((long) bArr[i13 + 3]) & 255) << 32) + ((((long) bArr[i13 + 4]) & 255) << 24) + ((((long) bArr[i13 + 5]) & 255) << 16) + ((((long) bArr[i13 + 6]) & 255) << 8) + (((long) bArr[i13 + 7]) & 255);
    }

    /* JADX INFO: renamed from: m */
    public static RandomAccessFile m56275m(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                randomAccessFile.writeInt(-2147483647);
                randomAccessFile.writeLong(4096L);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th3) {
                randomAccessFile.close();
                throw th3;
            }
        }
        return new RandomAccessFile(file, "rwd");
    }

    /* JADX INFO: renamed from: r1 */
    public static void m56276r1(byte[] bArr, int i13, int i14) {
        bArr[i13] = (byte) (i14 >> 24);
        bArr[i13 + 1] = (byte) (i14 >> 16);
        bArr[i13 + 2] = (byte) (i14 >> 8);
        bArr[i13 + 3] = (byte) i14;
    }

    /* JADX INFO: renamed from: s1 */
    public static void m56277s1(int i13, long j7, byte[] bArr) {
        bArr[i13] = (byte) (j7 >> 56);
        bArr[i13 + 1] = (byte) (j7 >> 48);
        bArr[i13 + 2] = (byte) (j7 >> 40);
        bArr[i13 + 3] = (byte) (j7 >> 32);
        bArr[i13 + 4] = (byte) (j7 >> 24);
        bArr[i13 + 5] = (byte) (j7 >> 16);
        bArr[i13 + 6] = (byte) (j7 >> 8);
        bArr[i13 + 7] = (byte) j7;
    }

    /* JADX INFO: renamed from: F0 */
    public final C20290g m56278F0(long j7) {
        if (j7 != 0) {
            byte[] bArr = this.f76180G;
            if (m56282n1(4, j7, bArr)) {
                return new C20290g(j7, m56273j1(0, bArr));
            }
        }
        return C20290g.f76170c;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m56279R0() throws IOException {
        this.f76184w.seek(0L);
        RandomAccessFile randomAccessFile = this.f76184w;
        byte[] bArr = this.f76180G;
        randomAccessFile.readFully(bArr);
        this.f76186y = m56274k1(4, bArr);
        this.f76187z = m56273j1(12, bArr);
        long jM56274k1 = m56274k1(16, bArr);
        long jM56274k2 = m56274k1(24, bArr);
        if (this.f76186y > this.f76184w.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f76186y + ", Actual length: " + this.f76184w.length());
        }
        if (this.f76186y <= 32) {
            throw new IOException(AbstractC11266d.m30457k(this.f76186y, ") is invalid.", new StringBuilder("File is corrupt; length stored in header (")));
        }
        this.f76178E = m56278F0(jM56274k1);
        this.f76179F = m56278F0(jM56274k2);
    }

    public final void clear() throws IOException {
        if (this.f76183J) {
            throw new IllegalStateException("closed");
        }
        m56285q1(4096L, 0, 0L, 0L);
        this.f76184w.seek(32L);
        this.f76184w.write(f76177K, 0, 4064);
        this.f76187z = 0;
        C20290g c20290g = C20290g.f76170c;
        this.f76178E = c20290g;
        this.f76179F = c20290g;
        if (this.f76186y > 4096) {
            this.f76184w.setLength(4096L);
            this.f76184w.getChannel().force(true);
        }
        this.f76186y = 4096L;
        this.f76181H++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f76183J = true;
        this.f76184w.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C20291h(this);
    }

    /* JADX INFO: renamed from: l1 */
    public final void m56280l1(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8296i(i13, "Cannot remove negative (", ") number of elements."));
        }
        if (i13 == 0) {
            return;
        }
        int i14 = this.f76187z;
        if (i13 == i14) {
            clear();
            return;
        }
        if (i14 == 0) {
            throw new NoSuchElementException();
        }
        if (i13 > i14) {
            throw new IllegalArgumentException(AbstractC18489d0.m53371l(AbstractC11266d.m30466t(i13, "Cannot remove more elements (", ") than present in queue ("), this.f76187z, ")."));
        }
        C20290g c20290g = this.f76178E;
        long j7 = c20290g.f76171a;
        int iM56273j1 = c20290g.f76172b;
        long jM56284p1 = j7;
        long j13 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            j13 += (long) (iM56273j1 + 4);
            jM56284p1 = m56284p1(jM56284p1 + 4 + ((long) iM56273j1));
            byte[] bArr = this.f76180G;
            if (!m56282n1(4, jM56284p1, bArr)) {
                return;
            }
            iM56273j1 = m56273j1(0, bArr);
        }
        m56285q1(this.f76186y, this.f76187z - i13, jM56284p1, this.f76179F.f76171a);
        this.f76187z -= i13;
        this.f76181H++;
        this.f76178E = new C20290g(jM56284p1, iM56273j1);
        while (j13 > 0) {
            int iMin = (int) Math.min(j13, 4096);
            m56283o1(iMin, j7, f76177K);
            long j14 = iMin;
            j13 -= j14;
            j7 += j14;
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final void m56281m1() {
        this.f76184w.close();
        File file = this.f76185x;
        file.delete();
        this.f76184w = m56275m(file);
        m56279R0();
    }

    /* JADX INFO: renamed from: n1 */
    public final boolean m56282n1(int i13, long j7, byte[] bArr) throws IOException {
        try {
            long jM56284p1 = m56284p1(j7);
            long j13 = ((long) i13) + jM56284p1;
            long j14 = this.f76186y;
            if (j13 <= j14) {
                this.f76184w.seek(jM56284p1);
                this.f76184w.readFully(bArr, 0, i13);
                return true;
            }
            int i14 = (int) (j14 - jM56284p1);
            this.f76184w.seek(jM56284p1);
            this.f76184w.readFully(bArr, 0, i14);
            this.f76184w.seek(32L);
            this.f76184w.readFully(bArr, i14, i13 - i14);
            return true;
        } catch (EOFException unused) {
            m56281m1();
            return false;
        } catch (IOException e5) {
            throw e5;
        } catch (Throwable unused2) {
            m56281m1();
            return false;
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m56283o1(int i13, long j7, byte[] bArr) throws IOException {
        long jM56284p1 = m56284p1(j7);
        long j13 = ((long) i13) + jM56284p1;
        long j14 = this.f76186y;
        if (j13 <= j14) {
            this.f76184w.seek(jM56284p1);
            this.f76184w.write(bArr, 0, i13);
            return;
        }
        int i14 = (int) (j14 - jM56284p1);
        this.f76184w.seek(jM56284p1);
        this.f76184w.write(bArr, 0, i14);
        this.f76184w.seek(32L);
        this.f76184w.write(bArr, i14, i13 - i14);
    }

    /* JADX INFO: renamed from: p1 */
    public final long m56284p1(long j7) {
        long j13 = this.f76186y;
        return j7 < j13 ? j7 : (j7 + 32) - j13;
    }

    /* JADX INFO: renamed from: q1 */
    public final void m56285q1(long j7, int i13, long j13, long j14) throws IOException {
        this.f76184w.seek(0L);
        byte[] bArr = this.f76180G;
        m56276r1(bArr, 0, -2147483647);
        m56277s1(4, j7, bArr);
        m56276r1(bArr, 12, i13);
        m56277s1(16, j13, bArr);
        m56277s1(24, j14, bArr);
        this.f76184w.write(bArr, 0, 32);
    }

    public final String toString() {
        return "QueueFile{file=" + this.f76185x + ", zero=true, length=" + this.f76186y + ", size=" + this.f76187z + ", first=" + this.f76178E + ", last=" + this.f76179F + '}';
    }
}
