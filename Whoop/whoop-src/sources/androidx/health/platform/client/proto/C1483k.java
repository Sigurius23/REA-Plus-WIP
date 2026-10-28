package androidx.health.platform.client.proto;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C1483k extends AbstractC1559z2 {

    /* JADX INFO: renamed from: g */
    public static final Logger f6056g = Logger.getLogger(C1483k.class.getName());

    /* JADX INFO: renamed from: h */
    public static final boolean f6057h = AbstractC1502n3.f6077e;

    /* JADX INFO: renamed from: c */
    public C1465g1 f6058c;

    /* JADX INFO: renamed from: d */
    public final byte[] f6059d;

    /* JADX INFO: renamed from: e */
    public final int f6060e;

    /* JADX INFO: renamed from: f */
    public int f6061f;

    public C1483k(byte[] bArr, int i13) {
        if (((bArr.length - i13) | i13) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i13)));
        }
        this.f6059d = bArr;
        this.f6061f = 0;
        this.f6060e = i13;
    }

    /* JADX INFO: renamed from: A */
    public static int m4654A(int i13) {
        if (i13 >= 0) {
            return m4657D(i13);
        }
        return 10;
    }

    /* JADX INFO: renamed from: B */
    public static int m4655B(String str) {
        int length;
        try {
            length = AbstractC1517q3.m4805b(str);
        } catch (C1512p3 unused) {
            length = str.getBytes(AbstractC1549x0.f6150a).length;
        }
        return m4657D(length) + length;
    }

    /* JADX INFO: renamed from: C */
    public static int m4656C(int i13) {
        return m4657D(i13 << 3);
    }

    /* JADX INFO: renamed from: D */
    public static int m4657D(int i13) {
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

    /* JADX INFO: renamed from: E */
    public static int m4658E(long j7) {
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

    /* JADX INFO: renamed from: v */
    public static int m4659v(int i13, C1468h c1468h) {
        return m4660w(c1468h) + m4656C(i13);
    }

    /* JADX INFO: renamed from: w */
    public static int m4660w(C1468h c1468h) {
        int size = c1468h.size();
        return m4657D(size) + size;
    }

    /* JADX INFO: renamed from: x */
    public static int m4661x(int i13) {
        return m4656C(i13) + 4;
    }

    /* JADX INFO: renamed from: y */
    public static int m4662y(int i13) {
        return m4656C(i13) + 8;
    }

    /* JADX INFO: renamed from: z */
    public static int m4663z(int i13, AbstractC1433a abstractC1433a, InterfaceC1536u2 interfaceC1536u2) {
        return abstractC1433a.mo4563b(interfaceC1536u2) + (m4656C(i13) * 2);
    }

    /* JADX INFO: renamed from: F */
    public final void m4664F(byte b) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f6059d;
            int i13 = this.f6061f;
            this.f6061f = i13 + 1;
            bArr[i13] = b;
        } catch (IndexOutOfBoundsException e5) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6061f), Integer.valueOf(this.f6060e), 1), e5);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m4665G(byte[] bArr, int i13, int i14) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i13, this.f6059d, this.f6061f, i14);
            this.f6061f += i14;
        } catch (IndexOutOfBoundsException e5) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6061f), Integer.valueOf(this.f6060e), Integer.valueOf(i14)), e5);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m4666H(C1468h c1468h) throws CodedOutputStream$OutOfSpaceException {
        m4674P(c1468h.size());
        m4665G(c1468h.f6047x, c1468h.mo4610e(), c1468h.size());
    }

    /* JADX INFO: renamed from: I */
    public final void m4667I(int i13, int i14) throws CodedOutputStream$OutOfSpaceException {
        m4673O(i13, 5);
        m4668J(i14);
    }

    /* JADX INFO: renamed from: J */
    public final void m4668J(int i13) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f6059d;
            int i14 = this.f6061f;
            int i15 = i14 + 1;
            this.f6061f = i15;
            bArr[i14] = (byte) (i13 & 255);
            int i16 = i14 + 2;
            this.f6061f = i16;
            bArr[i15] = (byte) ((i13 >> 8) & 255);
            int i17 = i14 + 3;
            this.f6061f = i17;
            bArr[i16] = (byte) ((i13 >> 16) & 255);
            this.f6061f = i14 + 4;
            bArr[i17] = (byte) ((i13 >> 24) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6061f), Integer.valueOf(this.f6060e), 1), e5);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m4669K(int i13, long j7) throws CodedOutputStream$OutOfSpaceException {
        m4673O(i13, 1);
        m4670L(j7);
    }

    /* JADX INFO: renamed from: L */
    public final void m4670L(long j7) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f6059d;
            int i13 = this.f6061f;
            int i14 = i13 + 1;
            this.f6061f = i14;
            bArr[i13] = (byte) (((int) j7) & 255);
            int i15 = i13 + 2;
            this.f6061f = i15;
            bArr[i14] = (byte) (((int) (j7 >> 8)) & 255);
            int i16 = i13 + 3;
            this.f6061f = i16;
            bArr[i15] = (byte) (((int) (j7 >> 16)) & 255);
            int i17 = i13 + 4;
            this.f6061f = i17;
            bArr[i16] = (byte) (((int) (j7 >> 24)) & 255);
            int i18 = i13 + 5;
            this.f6061f = i18;
            bArr[i17] = (byte) (((int) (j7 >> 32)) & 255);
            int i19 = i13 + 6;
            this.f6061f = i19;
            bArr[i18] = (byte) (((int) (j7 >> 40)) & 255);
            int i24 = i13 + 7;
            this.f6061f = i24;
            bArr[i19] = (byte) (((int) (j7 >> 48)) & 255);
            this.f6061f = i13 + 8;
            bArr[i24] = (byte) (((int) (j7 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6061f), Integer.valueOf(this.f6060e), 1), e5);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m4671M(int i13) throws CodedOutputStream$OutOfSpaceException {
        if (i13 >= 0) {
            m4674P(i13);
        } else {
            m4676R(i13);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m4672N(String str) throws CodedOutputStream$OutOfSpaceException {
        int i13 = this.f6061f;
        try {
            int iM4657D = m4657D(str.length() * 3);
            int iM4657D2 = m4657D(str.length());
            int i14 = this.f6060e;
            byte[] bArr = this.f6059d;
            if (iM4657D2 != iM4657D) {
                m4674P(AbstractC1517q3.m4805b(str));
                int i15 = this.f6061f;
                this.f6061f = AbstractC1517q3.f6107a.mo4791o(str, bArr, i15, i14 - i15);
                return;
            }
            int i16 = i13 + iM4657D2;
            this.f6061f = i16;
            int iMo4791o = AbstractC1517q3.f6107a.mo4791o(str, bArr, i16, i14 - i16);
            this.f6061f = i13;
            m4674P((iMo4791o - i13) - iM4657D2);
            this.f6061f = iMo4791o;
        } catch (C1512p3 e5) {
            this.f6061f = i13;
            f6056g.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
            byte[] bytes = str.getBytes(AbstractC1549x0.f6150a);
            try {
                m4674P(bytes.length);
                m4665G(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e13) {
                throw new CodedOutputStream$OutOfSpaceException(e13);
            }
        } catch (IndexOutOfBoundsException e14) {
            throw new CodedOutputStream$OutOfSpaceException(e14);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m4673O(int i13, int i14) throws CodedOutputStream$OutOfSpaceException {
        m4674P((i13 << 3) | i14);
    }

    /* JADX INFO: renamed from: P */
    public final void m4674P(int i13) throws CodedOutputStream$OutOfSpaceException {
        while (true) {
            int i14 = i13 & (-128);
            byte[] bArr = this.f6059d;
            if (i14 == 0) {
                int i15 = this.f6061f;
                this.f6061f = i15 + 1;
                bArr[i15] = (byte) i13;
                return;
            } else {
                try {
                    int i16 = this.f6061f;
                    this.f6061f = i16 + 1;
                    bArr[i16] = (byte) ((i13 & 127) | 128);
                    i13 >>>= 7;
                } catch (IndexOutOfBoundsException e5) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6061f), Integer.valueOf(this.f6060e), 1), e5);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6061f), Integer.valueOf(this.f6060e), 1), e5);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m4675Q(int i13, long j7) throws CodedOutputStream$OutOfSpaceException {
        m4673O(i13, 0);
        m4676R(j7);
    }

    /* JADX INFO: renamed from: R */
    public final void m4676R(long j7) throws CodedOutputStream$OutOfSpaceException {
        boolean z4 = f6057h;
        int i13 = this.f6060e;
        byte[] bArr = this.f6059d;
        if (z4 && i13 - this.f6061f >= 10) {
            while ((j7 & (-128)) != 0) {
                int i14 = this.f6061f;
                this.f6061f = i14 + 1;
                AbstractC1502n3.m4729k(bArr, i14, (byte) ((((int) j7) & 127) | 128));
                j7 >>>= 7;
            }
            int i15 = this.f6061f;
            this.f6061f = i15 + 1;
            AbstractC1502n3.m4729k(bArr, i15, (byte) j7);
            return;
        }
        while ((j7 & (-128)) != 0) {
            try {
                int i16 = this.f6061f;
                this.f6061f = i16 + 1;
                bArr[i16] = (byte) ((((int) j7) & 127) | 128);
                j7 >>>= 7;
            } catch (IndexOutOfBoundsException e5) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6061f), Integer.valueOf(i13), 1), e5);
            }
        }
        int i17 = this.f6061f;
        this.f6061f = i17 + 1;
        bArr[i17] = (byte) j7;
    }
}
