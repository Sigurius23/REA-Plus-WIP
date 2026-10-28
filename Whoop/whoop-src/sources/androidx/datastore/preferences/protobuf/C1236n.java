package androidx.datastore.preferences.protobuf;

import e93.AbstractC12889b;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1236n extends AbstractC12889b {

    /* JADX INFO: renamed from: i */
    public static final Logger f5438i = Logger.getLogger(C1236n.class.getName());

    /* JADX INFO: renamed from: j */
    public static final boolean f5439j = AbstractC1235m1.f5435e;

    /* JADX INFO: renamed from: d */
    public C1225j0 f5440d;

    /* JADX INFO: renamed from: e */
    public final byte[] f5441e;

    /* JADX INFO: renamed from: f */
    public final int f5442f;

    /* JADX INFO: renamed from: g */
    public int f5443g;

    /* JADX INFO: renamed from: h */
    public final OutputStream f5444h;

    public C1236n(OutputStream outputStream, int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i13, 20);
        this.f5441e = new byte[iMax];
        this.f5442f = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f5444h = outputStream;
    }

    /* JADX INFO: renamed from: q0 */
    public static int m3930q0(int i13, C1218h c1218h) {
        int iM3932s0 = m3932s0(i13);
        int size = c1218h.size();
        return m3933t0(size) + size + iM3932s0;
    }

    /* JADX INFO: renamed from: r0 */
    public static int m3931r0(String str) {
        int length;
        try {
            length = AbstractC1244p1.m3968a(str);
        } catch (C1241o1 unused) {
            length = str.getBytes(AbstractC1204c0.f5362a).length;
        }
        return m3933t0(length) + length;
    }

    /* JADX INFO: renamed from: s0 */
    public static int m3932s0(int i13) {
        return m3933t0(i13 << 3);
    }

    /* JADX INFO: renamed from: t0 */
    public static int m3933t0(int i13) {
        return (352 - (Integer.numberOfLeadingZeros(i13) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: u0 */
    public static int m3934u0(long j7) {
        return (640 - (Long.numberOfLeadingZeros(j7) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m3935A0(int i13, C1218h c1218h) {
        m3946L0(i13, 2);
        m3936B0(c1218h);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m3936B0(C1218h c1218h) throws IOException {
        m3948N0(c1218h.size());
        mo3951k0(c1218h.f5401x, c1218h.mo3799f(), c1218h.size());
    }

    /* JADX INFO: renamed from: C0 */
    public final void m3937C0(int i13, int i14) {
        m3958w0(14);
        m3954n0(i13, 5);
        m3952l0(i14);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m3938D0(int i13) throws IOException {
        m3958w0(4);
        m3952l0(i13);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m3939E0(int i13, long j7) {
        m3958w0(18);
        m3954n0(i13, 1);
        m3953m0(j7);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m3940F0(long j7) throws IOException {
        m3958w0(8);
        m3953m0(j7);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m3941G0(int i13, int i14) throws IOException {
        m3958w0(20);
        m3954n0(i13, 0);
        if (i14 >= 0) {
            m3955o0(i14);
        } else {
            m3956p0(i14);
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m3942H0(int i13) throws IOException {
        if (i13 >= 0) {
            m3948N0(i13);
        } else {
            m3950P0(i13);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m3943I0(int i13, AbstractC1197a abstractC1197a, InterfaceC1270z0 interfaceC1270z0) throws IOException {
        m3946L0(i13, 2);
        m3948N0(abstractC1197a.mo3748a(interfaceC1270z0));
        interfaceC1270z0.mo3992e(abstractC1197a, this.f5440d);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m3944J0(int i13, String str) throws IOException {
        m3946L0(i13, 2);
        m3945K0(str);
    }

    /* JADX INFO: renamed from: K0 */
    public final void m3945K0(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iM3933t0 = m3933t0(length);
            int i13 = iM3933t0 + length;
            int i14 = this.f5442f;
            if (i13 > i14) {
                byte[] bArr = new byte[length];
                int iMo3963J = AbstractC1244p1.f5450a.mo3963J(str, bArr, 0, length);
                m3948N0(iMo3963J);
                m3960y0(bArr, 0, iMo3963J);
                return;
            }
            if (i13 > i14 - this.f5443g) {
                m3957v0();
            }
            int iM3933t1 = m3933t0(str.length());
            int i15 = this.f5443g;
            byte[] bArr2 = this.f5441e;
            try {
                if (iM3933t1 == iM3933t0) {
                    int i16 = i15 + iM3933t1;
                    this.f5443g = i16;
                    int iMo3963J2 = AbstractC1244p1.f5450a.mo3963J(str, bArr2, i16, i14 - i16);
                    this.f5443g = i15;
                    m3955o0((iMo3963J2 - i15) - iM3933t1);
                    this.f5443g = iMo3963J2;
                } else {
                    int iM3968a = AbstractC1244p1.m3968a(str);
                    m3955o0(iM3968a);
                    this.f5443g = AbstractC1244p1.f5450a.mo3963J(str, bArr2, this.f5443g, iM3968a);
                }
            } catch (C1241o1 e5) {
                this.f5443g = i15;
                throw e5;
            } catch (ArrayIndexOutOfBoundsException e13) {
                throw new CodedOutputStream$OutOfSpaceException(e13);
            }
        } catch (C1241o1 e14) {
            f5438i.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e14);
            byte[] bytes = str.getBytes(AbstractC1204c0.f5362a);
            try {
                m3948N0(bytes.length);
                mo3951k0(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e15) {
                throw new CodedOutputStream$OutOfSpaceException(e15);
            }
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m3946L0(int i13, int i14) {
        m3948N0((i13 << 3) | i14);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m3947M0(int i13, int i14) throws IOException {
        m3958w0(20);
        m3954n0(i13, 0);
        m3955o0(i14);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m3948N0(int i13) throws IOException {
        m3958w0(5);
        m3955o0(i13);
    }

    /* JADX INFO: renamed from: O0 */
    public final void m3949O0(int i13, long j7) {
        m3958w0(20);
        m3954n0(i13, 0);
        m3956p0(j7);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m3950P0(long j7) throws IOException {
        m3958w0(10);
        m3956p0(j7);
    }

    @Override // e93.AbstractC12889b
    /* JADX INFO: renamed from: k0 */
    public final void mo3951k0(byte[] bArr, int i13, int i14) throws IOException {
        m3960y0(bArr, i13, i14);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m3952l0(int i13) {
        int i14 = this.f5443g;
        int i15 = i14 + 1;
        this.f5443g = i15;
        byte[] bArr = this.f5441e;
        bArr[i14] = (byte) (i13 & 255);
        int i16 = i14 + 2;
        this.f5443g = i16;
        bArr[i15] = (byte) ((i13 >> 8) & 255);
        int i17 = i14 + 3;
        this.f5443g = i17;
        bArr[i16] = (byte) ((i13 >> 16) & 255);
        this.f5443g = i14 + 4;
        bArr[i17] = (byte) ((i13 >> 24) & 255);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m3953m0(long j7) {
        int i13 = this.f5443g;
        int i14 = i13 + 1;
        this.f5443g = i14;
        byte[] bArr = this.f5441e;
        bArr[i13] = (byte) (j7 & 255);
        int i15 = i13 + 2;
        this.f5443g = i15;
        bArr[i14] = (byte) ((j7 >> 8) & 255);
        int i16 = i13 + 3;
        this.f5443g = i16;
        bArr[i15] = (byte) ((j7 >> 16) & 255);
        int i17 = i13 + 4;
        this.f5443g = i17;
        bArr[i16] = (byte) (255 & (j7 >> 24));
        int i18 = i13 + 5;
        this.f5443g = i18;
        bArr[i17] = (byte) (((int) (j7 >> 32)) & 255);
        int i19 = i13 + 6;
        this.f5443g = i19;
        bArr[i18] = (byte) (((int) (j7 >> 40)) & 255);
        int i24 = i13 + 7;
        this.f5443g = i24;
        bArr[i19] = (byte) (((int) (j7 >> 48)) & 255);
        this.f5443g = i13 + 8;
        bArr[i24] = (byte) (((int) (j7 >> 56)) & 255);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m3954n0(int i13, int i14) {
        m3955o0((i13 << 3) | i14);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m3955o0(int i13) {
        boolean z4 = f5439j;
        byte[] bArr = this.f5441e;
        if (z4) {
            while ((i13 & (-128)) != 0) {
                int i14 = this.f5443g;
                this.f5443g = i14 + 1;
                AbstractC1235m1.m3924j(bArr, i14, (byte) ((i13 | 128) & 255));
                i13 >>>= 7;
            }
            int i15 = this.f5443g;
            this.f5443g = i15 + 1;
            AbstractC1235m1.m3924j(bArr, i15, (byte) i13);
            return;
        }
        while ((i13 & (-128)) != 0) {
            int i16 = this.f5443g;
            this.f5443g = i16 + 1;
            bArr[i16] = (byte) ((i13 | 128) & 255);
            i13 >>>= 7;
        }
        int i17 = this.f5443g;
        this.f5443g = i17 + 1;
        bArr[i17] = (byte) i13;
    }

    /* JADX INFO: renamed from: p0 */
    public final void m3956p0(long j7) {
        boolean z4 = f5439j;
        byte[] bArr = this.f5441e;
        if (z4) {
            while ((j7 & (-128)) != 0) {
                int i13 = this.f5443g;
                this.f5443g = i13 + 1;
                AbstractC1235m1.m3924j(bArr, i13, (byte) ((((int) j7) | 128) & 255));
                j7 >>>= 7;
            }
            int i14 = this.f5443g;
            this.f5443g = i14 + 1;
            AbstractC1235m1.m3924j(bArr, i14, (byte) j7);
            return;
        }
        while ((j7 & (-128)) != 0) {
            int i15 = this.f5443g;
            this.f5443g = i15 + 1;
            bArr[i15] = (byte) ((((int) j7) | 128) & 255);
            j7 >>>= 7;
        }
        int i16 = this.f5443g;
        this.f5443g = i16 + 1;
        bArr[i16] = (byte) j7;
    }

    /* JADX INFO: renamed from: v0 */
    public final void m3957v0() throws IOException {
        this.f5444h.write(this.f5441e, 0, this.f5443g);
        this.f5443g = 0;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m3958w0(int i13) throws IOException {
        if (this.f5442f - this.f5443g < i13) {
            m3957v0();
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m3959x0(byte b) throws IOException {
        if (this.f5443g == this.f5442f) {
            m3957v0();
        }
        int i13 = this.f5443g;
        this.f5443g = i13 + 1;
        this.f5441e[i13] = b;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m3960y0(byte[] bArr, int i13, int i14) throws IOException {
        int i15 = this.f5443g;
        int i16 = this.f5442f;
        int i17 = i16 - i15;
        byte[] bArr2 = this.f5441e;
        if (i17 >= i14) {
            System.arraycopy(bArr, i13, bArr2, i15, i14);
            this.f5443g += i14;
            return;
        }
        System.arraycopy(bArr, i13, bArr2, i15, i17);
        int i18 = i13 + i17;
        int i19 = i14 - i17;
        this.f5443g = i16;
        m3957v0();
        if (i19 > i16) {
            this.f5444h.write(bArr, i18, i19);
        } else {
            System.arraycopy(bArr, i18, bArr2, 0, i19);
            this.f5443g = i19;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m3961z0(int i13, boolean z4) throws IOException {
        m3958w0(11);
        m3954n0(i13, 0);
        byte b = z4 ? (byte) 1 : (byte) 0;
        int i14 = this.f5443g;
        this.f5443g = i14 + 1;
        this.f5441e[i14] = b;
    }
}
