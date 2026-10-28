package com.google.crypto.tink.shaded.protobuf;

import java.util.logging.Logger;
import se.AbstractC32411b;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C5158m extends AbstractC32411b {

    /* JADX INFO: renamed from: f */
    public static final Logger f21543f = Logger.getLogger(C5158m.class.getName());

    /* JADX INFO: renamed from: g */
    public static final boolean f21544g = AbstractC5160m1.f21553e;

    /* JADX INFO: renamed from: b */
    public C5153k0 f21545b;

    /* JADX INFO: renamed from: c */
    public final byte[] f21546c;

    /* JADX INFO: renamed from: d */
    public final int f21547d;

    /* JADX INFO: renamed from: e */
    public int f21548e;

    public C5158m(byte[] bArr, int i13) {
        if (((bArr.length - i13) | i13) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i13)));
        }
        this.f21546c = bArr;
        this.f21548e = 0;
        this.f21547d = i13;
    }

    /* JADX INFO: renamed from: h0 */
    public static int m16254h0(int i13, AbstractC5146i abstractC5146i) {
        int iM16259m0 = m16259m0(i13);
        int size = abstractC5146i.size();
        return m16260n0(size) + size + iM16259m0;
    }

    /* JADX INFO: renamed from: i0 */
    public static int m16255i0(int i13) {
        return m16259m0(i13) + 4;
    }

    /* JADX INFO: renamed from: j0 */
    public static int m16256j0(int i13) {
        return m16259m0(i13) + 8;
    }

    /* JADX INFO: renamed from: k0 */
    public static int m16257k0(int i13) {
        if (i13 >= 0) {
            return m16260n0(i13);
        }
        return 10;
    }

    /* JADX INFO: renamed from: l0 */
    public static int m16258l0(String str) {
        int length;
        try {
            length = AbstractC5169p1.m16302c(str);
        } catch (C5166o1 unused) {
            length = str.getBytes(AbstractC5126b0.f21479a).length;
        }
        return m16260n0(length) + length;
    }

    /* JADX INFO: renamed from: m0 */
    public static int m16259m0(int i13) {
        return m16260n0(i13 << 3);
    }

    /* JADX INFO: renamed from: n0 */
    public static int m16260n0(int i13) {
        if ((i13 & (-128)) == 0) {
            return 1;
        }
        if ((i13 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i13) == 0) {
            return 3;
        }
        return (i13 & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: o0 */
    public static int m16261o0(int i13, long j7) {
        return m16262p0(j7) + m16259m0(i13);
    }

    /* JADX INFO: renamed from: p0 */
    public static int m16262p0(long j7) {
        int i13;
        if (((-128) & j7) == 0) {
            return 1;
        }
        if (j7 < 0) {
            return 10;
        }
        if (((-34359738368L) & j7) != 0) {
            j7 >>>= 28;
            i13 = 6;
        } else {
            i13 = 2;
        }
        if (((-2097152) & j7) != 0) {
            i13 += 2;
            j7 >>>= 14;
        }
        return (j7 & (-16384)) != 0 ? i13 + 1 : i13;
    }

    /* JADX INFO: renamed from: q0 */
    public static C5158m m16263q0(byte[] bArr) {
        return new C5158m(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: A0 */
    public final void m16264A0(int i13, long j7) throws CodedOutputStream$OutOfSpaceException {
        m16274y0(i13, 0);
        m16265B0(j7);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m16265B0(long j7) throws CodedOutputStream$OutOfSpaceException {
        boolean z4 = f21544g;
        int i13 = this.f21547d;
        byte[] bArr = this.f21546c;
        if (z4 && i13 - this.f21548e >= 10) {
            while ((j7 & (-128)) != 0) {
                int i14 = this.f21548e;
                this.f21548e = i14 + 1;
                AbstractC5160m1.m16287k(bArr, i14, (byte) ((((int) j7) & 127) | 128));
                j7 >>>= 7;
            }
            int i15 = this.f21548e;
            this.f21548e = i15 + 1;
            AbstractC5160m1.m16287k(bArr, i15, (byte) j7);
            return;
        }
        while ((j7 & (-128)) != 0) {
            try {
                int i16 = this.f21548e;
                this.f21548e = i16 + 1;
                bArr[i16] = (byte) ((((int) j7) & 127) | 128);
                j7 >>>= 7;
            } catch (IndexOutOfBoundsException e5) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21548e), Integer.valueOf(i13), 1), e5);
            }
        }
        int i17 = this.f21548e;
        this.f21548e = i17 + 1;
        bArr[i17] = (byte) j7;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m16266g0() {
        if (this.f21547d - this.f21548e != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m16267r0(byte b) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f21546c;
            int i13 = this.f21548e;
            this.f21548e = i13 + 1;
            bArr[i13] = b;
        } catch (IndexOutOfBoundsException e5) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21548e), Integer.valueOf(this.f21547d), 1), e5);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m16268s0(byte[] bArr, int i13, int i14) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i13, this.f21546c, this.f21548e, i14);
            this.f21548e += i14;
        } catch (IndexOutOfBoundsException e5) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21548e), Integer.valueOf(this.f21547d), Integer.valueOf(i14)), e5);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m16269t0(int i13, int i14) throws CodedOutputStream$OutOfSpaceException {
        m16274y0(i13, 5);
        m16270u0(i14);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m16270u0(int i13) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f21546c;
            int i14 = this.f21548e;
            int i15 = i14 + 1;
            this.f21548e = i15;
            bArr[i14] = (byte) (i13 & 255);
            int i16 = i14 + 2;
            this.f21548e = i16;
            bArr[i15] = (byte) ((i13 >> 8) & 255);
            int i17 = i14 + 3;
            this.f21548e = i17;
            bArr[i16] = (byte) ((i13 >> 16) & 255);
            this.f21548e = i14 + 4;
            bArr[i17] = (byte) ((i13 >> 24) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21548e), Integer.valueOf(this.f21547d), 1), e5);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m16271v0(int i13, long j7) throws CodedOutputStream$OutOfSpaceException {
        m16274y0(i13, 1);
        m16272w0(j7);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m16272w0(long j7) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f21546c;
            int i13 = this.f21548e;
            int i14 = i13 + 1;
            this.f21548e = i14;
            bArr[i13] = (byte) (((int) j7) & 255);
            int i15 = i13 + 2;
            this.f21548e = i15;
            bArr[i14] = (byte) (((int) (j7 >> 8)) & 255);
            int i16 = i13 + 3;
            this.f21548e = i16;
            bArr[i15] = (byte) (((int) (j7 >> 16)) & 255);
            int i17 = i13 + 4;
            this.f21548e = i17;
            bArr[i16] = (byte) (((int) (j7 >> 24)) & 255);
            int i18 = i13 + 5;
            this.f21548e = i18;
            bArr[i17] = (byte) (((int) (j7 >> 32)) & 255);
            int i19 = i13 + 6;
            this.f21548e = i19;
            bArr[i18] = (byte) (((int) (j7 >> 40)) & 255);
            int i24 = i13 + 7;
            this.f21548e = i24;
            bArr[i19] = (byte) (((int) (j7 >> 48)) & 255);
            this.f21548e = i13 + 8;
            bArr[i24] = (byte) (((int) (j7 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21548e), Integer.valueOf(this.f21547d), 1), e5);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m16273x0(int i13) throws CodedOutputStream$OutOfSpaceException {
        if (i13 >= 0) {
            m16275z0(i13);
        } else {
            m16265B0(i13);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m16274y0(int i13, int i14) {
        m16275z0((i13 << 3) | i14);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m16275z0(int i13) {
        while (true) {
            int i14 = i13 & (-128);
            byte[] bArr = this.f21546c;
            if (i14 == 0) {
                int i15 = this.f21548e;
                this.f21548e = i15 + 1;
                bArr[i15] = (byte) i13;
                return;
            } else {
                try {
                    int i16 = this.f21548e;
                    this.f21548e = i16 + 1;
                    bArr[i16] = (byte) ((i13 & 127) | 128);
                    i13 >>>= 7;
                } catch (IndexOutOfBoundsException e5) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21548e), Integer.valueOf(this.f21547d), 1), e5);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f21548e), Integer.valueOf(this.f21547d), 1), e5);
        }
    }
}
