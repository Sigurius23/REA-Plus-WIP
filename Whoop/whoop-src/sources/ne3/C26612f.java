package ne3;

import java.io.Closeable;
import java.util.Arrays;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: ne3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C26612f implements Closeable {

    /* JADX INFO: renamed from: E */
    public byte[] f105850E;

    /* JADX INFO: renamed from: w */
    public C26616h f105853w;

    /* JADX INFO: renamed from: x */
    public boolean f105854x;

    /* JADX INFO: renamed from: y */
    public C26623k0 f105855y;

    /* JADX INFO: renamed from: z */
    public long f105856z = -1;

    /* JADX INFO: renamed from: F */
    public int f105851F = -1;

    /* JADX INFO: renamed from: G */
    public int f105852G = -1;

    /* JADX INFO: renamed from: b */
    public final int m79179b() {
        long j7 = this.f105856z;
        C26616h c26616h = this.f105853w;
        AbstractC22676k.m65747g(c26616h);
        if (j7 == c26616h.f105866x) {
            throw new IllegalStateException("no more bytes");
        }
        long j13 = this.f105856z;
        return m79181i(j13 == -1 ? 0L : j13 + ((long) (this.f105852G - this.f105851F)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f105853w == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        this.f105853w = null;
        this.f105855y = null;
        this.f105856z = -1L;
        this.f105850E = null;
        this.f105851F = -1;
        this.f105852G = -1;
    }

    /* JADX INFO: renamed from: h */
    public final void m79180h(long j7) {
        C26616h c26616h = this.f105853w;
        if (c26616h == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!this.f105854x) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long j13 = c26616h.f105866x;
        if (j7 <= j13) {
            if (j7 < 0) {
                throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "newSize < 0: ").toString());
            }
            long j14 = j13 - j7;
            while (j14 > 0) {
                C26623k0 c26623k0 = c26616h.f105865w;
                AbstractC22676k.m65747g(c26623k0);
                C26623k0 c26623k1 = c26623k0.f105880g;
                AbstractC22676k.m65747g(c26623k1);
                int i13 = c26623k1.f105876c;
                long j15 = i13 - c26623k1.f105875b;
                if (j15 > j14) {
                    c26623k1.f105876c = i13 - ((int) j14);
                    break;
                } else {
                    c26616h.f105865w = c26623k1.m79243a();
                    AbstractC26625l0.m79267a(c26623k1);
                    j14 -= j15;
                }
            }
            this.f105855y = null;
            this.f105856z = j7;
            this.f105850E = null;
            this.f105851F = -1;
            this.f105852G = -1;
        } else if (j7 > j13) {
            long j16 = j7 - j13;
            int i14 = 1;
            boolean z4 = true;
            for (long j17 = 0; j16 > j17; j17 = 0) {
                C26623k0 c26623k0M79216k1 = c26616h.m79216k1(i14);
                int iMin = (int) Math.min(j16, 8192 - c26623k0M79216k1.f105876c);
                int i15 = c26623k0M79216k1.f105876c + iMin;
                c26623k0M79216k1.f105876c = i15;
                j16 -= (long) iMin;
                if (z4) {
                    this.f105855y = c26623k0M79216k1;
                    this.f105856z = j13;
                    this.f105850E = c26623k0M79216k1.f105874a;
                    this.f105851F = i15 - iMin;
                    this.f105852G = i15;
                    z4 = false;
                }
                i14 = 1;
            }
        }
        c26616h.f105866x = j7;
    }

    /* JADX INFO: renamed from: i */
    public final int m79181i(long j7) {
        C26616h c26616h = this.f105853w;
        if (c26616h == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j7 >= -1) {
            long j13 = c26616h.f105866x;
            if (j7 <= j13) {
                if (j7 == -1 || j7 == j13) {
                    this.f105855y = null;
                    this.f105856z = j7;
                    this.f105850E = null;
                    this.f105851F = -1;
                    this.f105852G = -1;
                    return -1;
                }
                C26623k0 c26623k0 = c26616h.f105865w;
                C26623k0 c26623k1 = this.f105855y;
                long j14 = 0;
                if (c26623k1 != null) {
                    long j15 = this.f105856z - ((long) (this.f105851F - c26623k1.f105875b));
                    if (j15 > j7) {
                        c26623k1 = c26623k0;
                        c26623k0 = c26623k1;
                        j13 = j15;
                    } else {
                        j14 = j15;
                    }
                } else {
                    c26623k1 = c26623k0;
                }
                if (j13 - j7 > j7 - j14) {
                    while (true) {
                        AbstractC22676k.m65747g(c26623k1);
                        long j16 = ((long) (c26623k1.f105876c - c26623k1.f105875b)) + j14;
                        if (j7 < j16) {
                            break;
                        }
                        c26623k1 = c26623k1.f105879f;
                        j14 = j16;
                    }
                } else {
                    while (j13 > j7) {
                        AbstractC22676k.m65747g(c26623k0);
                        c26623k0 = c26623k0.f105880g;
                        AbstractC22676k.m65747g(c26623k0);
                        j13 -= (long) (c26623k0.f105876c - c26623k0.f105875b);
                    }
                    c26623k1 = c26623k0;
                    j14 = j13;
                }
                if (this.f105854x) {
                    AbstractC22676k.m65747g(c26623k1);
                    if (c26623k1.f105877d) {
                        byte[] bArr = c26623k1.f105874a;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        AbstractC22676k.m65749i(bArrCopyOf, "copyOf(...)");
                        C26623k0 c26623k2 = new C26623k0(bArrCopyOf, c26623k1.f105875b, c26623k1.f105876c, false, true);
                        if (c26616h.f105865w == c26623k1) {
                            c26616h.f105865w = c26623k2;
                        }
                        c26623k1.m79244b(c26623k2);
                        C26623k0 c26623k3 = c26623k2.f105880g;
                        AbstractC22676k.m65747g(c26623k3);
                        c26623k3.m79243a();
                        c26623k1 = c26623k2;
                    }
                }
                this.f105855y = c26623k1;
                this.f105856z = j7;
                AbstractC22676k.m65747g(c26623k1);
                this.f105850E = c26623k1.f105874a;
                int i13 = c26623k1.f105875b + ((int) (j7 - j14));
                this.f105851F = i13;
                int i14 = c26623k1.f105876c;
                this.f105852G = i14;
                return i14 - i13;
            }
        }
        StringBuilder sbM125596b = AbstractC39383f.m125596b(j7, "offset=", " > size=");
        sbM125596b.append(c26616h.f105866x);
        throw new ArrayIndexOutOfBoundsException(sbM125596b.toString());
    }
}
