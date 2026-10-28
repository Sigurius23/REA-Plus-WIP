package wa3;

import java.io.IOException;
import java.io.OutputStream;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: wa3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C36994g {

    /* JADX INFO: renamed from: a */
    public final byte[] f158338a;

    /* JADX INFO: renamed from: b */
    public final int f158339b;

    /* JADX INFO: renamed from: c */
    public int f158340c = 0;

    /* JADX INFO: renamed from: d */
    public final OutputStream f158341d;

    public C36994g(OutputStream outputStream, byte[] bArr) {
        this.f158341d = outputStream;
        this.f158338a = bArr;
        this.f158339b = bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public static int m118776a(int i13, int i14) {
        return m118778c(i14) + m118783h(i13);
    }

    /* JADX INFO: renamed from: b */
    public static int m118777b(int i13, int i14) {
        return m118778c(i14) + m118783h(i13);
    }

    /* JADX INFO: renamed from: c */
    public static int m118778c(int i13) {
        if (i13 >= 0) {
            return m118781f(i13);
        }
        return 10;
    }

    /* JADX INFO: renamed from: d */
    public static int m118779d(int i13, InterfaceC37019v interfaceC37019v) {
        return m118780e(interfaceC37019v) + m118783h(i13);
    }

    /* JADX INFO: renamed from: e */
    public static int m118780e(InterfaceC37019v interfaceC37019v) {
        int iMo92262d = interfaceC37019v.mo92262d();
        return m118781f(iMo92262d) + iMo92262d;
    }

    /* JADX INFO: renamed from: f */
    public static int m118781f(int i13) {
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

    /* JADX INFO: renamed from: g */
    public static int m118782g(long j7) {
        if (((-128) & j7) == 0) {
            return 1;
        }
        if (((-16384) & j7) == 0) {
            return 2;
        }
        if (((-2097152) & j7) == 0) {
            return 3;
        }
        if (((-268435456) & j7) == 0) {
            return 4;
        }
        if (((-34359738368L) & j7) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j7) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j7) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j7) == 0) {
            return 8;
        }
        return (j7 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* JADX INFO: renamed from: h */
    public static int m118783h(int i13) {
        return m118781f(i13 << 3);
    }

    /* JADX INFO: renamed from: j */
    public static C36994g m118784j(OutputStream outputStream, int i13) {
        return new C36994g(outputStream, new byte[i13]);
    }

    /* JADX INFO: renamed from: i */
    public final void m118785i() throws IOException {
        if (this.f158341d != null) {
            m118786k();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m118786k() throws IOException {
        OutputStream outputStream = this.f158341d;
        if (outputStream == null) {
            throw new IOException() { // from class: kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream$OutOfSpaceException
            };
        }
        outputStream.write(this.f158338a, 0, this.f158340c);
        this.f158340c = 0;
    }

    /* JADX INFO: renamed from: l */
    public final void m118787l(int i13, int i14) throws IOException {
        m118799x(i13, 0);
        m118789n(i14);
    }

    /* JADX INFO: renamed from: m */
    public final void m118788m(int i13, int i14) throws IOException {
        m118799x(i13, 0);
        m118789n(i14);
    }

    /* JADX INFO: renamed from: n */
    public final void m118789n(int i13) throws IOException {
        if (i13 >= 0) {
            m118797v(i13);
        } else {
            m118798w(i13);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m118790o(int i13, InterfaceC37019v interfaceC37019v) throws IOException {
        m118799x(i13, 2);
        m118791p(interfaceC37019v);
    }

    /* JADX INFO: renamed from: p */
    public final void m118791p(InterfaceC37019v interfaceC37019v) throws IOException {
        m118797v(interfaceC37019v.mo92262d());
        interfaceC37019v.mo92264f(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m118792q(int i13) throws IOException {
        byte b = (byte) i13;
        if (this.f158340c == this.f158339b) {
            m118786k();
        }
        int i14 = this.f158340c;
        this.f158340c = i14 + 1;
        this.f158338a[i14] = b;
    }

    /* JADX INFO: renamed from: r */
    public final void m118793r(AbstractC36990e abstractC36990e) throws IOException {
        int size = abstractC36990e.size();
        int i13 = this.f158340c;
        int i14 = this.f158339b;
        int i15 = i14 - i13;
        byte[] bArr = this.f158338a;
        if (i15 >= size) {
            abstractC36990e.m118744d(0, i13, size, bArr);
            this.f158340c += size;
            return;
        }
        abstractC36990e.m118744d(0, i13, i15, bArr);
        int i16 = size - i15;
        this.f158340c = i14;
        m118786k();
        if (i16 <= i14) {
            abstractC36990e.m118744d(i15, 0, i16, bArr);
            this.f158340c = i16;
        } else {
            if (i15 < 0) {
                throw new IndexOutOfBoundsException(AbstractC31061c.m95634j(30, i15, "Source offset < 0: "));
            }
            if (i16 < 0) {
                throw new IndexOutOfBoundsException(AbstractC31061c.m95634j(23, i16, "Length < 0: "));
            }
            int i17 = i15 + i16;
            if (i17 > abstractC36990e.size()) {
                throw new IndexOutOfBoundsException(AbstractC31061c.m95634j(39, i17, "Source end offset exceeded: "));
            }
            if (i16 > 0) {
                abstractC36990e.mo118754r(this.f158341d, i15, i16);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m118794s(byte[] bArr) throws IOException {
        int length = bArr.length;
        int i13 = this.f158340c;
        int i14 = this.f158339b;
        int i15 = i14 - i13;
        byte[] bArr2 = this.f158338a;
        if (i15 >= length) {
            System.arraycopy(bArr, 0, bArr2, i13, length);
            this.f158340c += length;
            return;
        }
        System.arraycopy(bArr, 0, bArr2, i13, i15);
        int i16 = length - i15;
        this.f158340c = i14;
        m118786k();
        if (i16 > i14) {
            this.f158341d.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f158340c = i16;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m118795t(int i13) throws IOException {
        m118792q(i13 & 255);
        m118792q((i13 >> 8) & 255);
        m118792q((i13 >> 16) & 255);
        m118792q((i13 >> 24) & 255);
    }

    /* JADX INFO: renamed from: u */
    public final void m118796u(long j7) throws IOException {
        m118792q(((int) j7) & 255);
        m118792q(((int) (j7 >> 8)) & 255);
        m118792q(((int) (j7 >> 16)) & 255);
        m118792q(((int) (j7 >> 24)) & 255);
        m118792q(((int) (j7 >> 32)) & 255);
        m118792q(((int) (j7 >> 40)) & 255);
        m118792q(((int) (j7 >> 48)) & 255);
        m118792q(((int) (j7 >> 56)) & 255);
    }

    /* JADX INFO: renamed from: v */
    public final void m118797v(int i13) throws IOException {
        while ((i13 & (-128)) != 0) {
            m118792q((i13 & 127) | 128);
            i13 >>>= 7;
        }
        m118792q(i13);
    }

    /* JADX INFO: renamed from: w */
    public final void m118798w(long j7) throws IOException {
        while (((-128) & j7) != 0) {
            m118792q((((int) j7) & 127) | 128);
            j7 >>>= 7;
        }
        m118792q((int) j7);
    }

    /* JADX INFO: renamed from: x */
    public final void m118799x(int i13, int i14) throws IOException {
        m118797v((i13 << 3) | i14);
    }
}
