package androidx.glance.appwidget.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C1409o extends AbstractC1411p {

    /* JADX INFO: renamed from: g */
    public final byte[] f5949g;

    /* JADX INFO: renamed from: h */
    public final int f5950h;

    /* JADX INFO: renamed from: i */
    public int f5951i;

    /* JADX INFO: renamed from: j */
    public final OutputStream f5952j;

    public C1409o(OutputStream outputStream, int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i13, 20);
        this.f5949g = new byte[iMax];
        this.f5950h = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f5952j = outputStream;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: A0 */
    public final void mo4465A0(int i13, long j7) throws IOException {
        m4496I0(20);
        m4492E0(i13, 0);
        m4494G0(j7);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: B0 */
    public final void mo4466B0(long j7) throws IOException {
        m4496I0(10);
        m4494G0(j7);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m4490C0(int i13) {
        int i14 = this.f5951i;
        int i15 = i14 + 1;
        this.f5951i = i15;
        byte[] bArr = this.f5949g;
        bArr[i14] = (byte) (i13 & 255);
        int i16 = i14 + 2;
        this.f5951i = i16;
        bArr[i15] = (byte) ((i13 >> 8) & 255);
        int i17 = i14 + 3;
        this.f5951i = i17;
        bArr[i16] = (byte) ((i13 >> 16) & 255);
        this.f5951i = i14 + 4;
        bArr[i17] = (byte) ((i13 >> 24) & 255);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m4491D0(long j7) {
        int i13 = this.f5951i;
        int i14 = i13 + 1;
        this.f5951i = i14;
        byte[] bArr = this.f5949g;
        bArr[i13] = (byte) (j7 & 255);
        int i15 = i13 + 2;
        this.f5951i = i15;
        bArr[i14] = (byte) ((j7 >> 8) & 255);
        int i16 = i13 + 3;
        this.f5951i = i16;
        bArr[i15] = (byte) ((j7 >> 16) & 255);
        int i17 = i13 + 4;
        this.f5951i = i17;
        bArr[i16] = (byte) (255 & (j7 >> 24));
        int i18 = i13 + 5;
        this.f5951i = i18;
        bArr[i17] = (byte) (((int) (j7 >> 32)) & 255);
        int i19 = i13 + 6;
        this.f5951i = i19;
        bArr[i18] = (byte) (((int) (j7 >> 40)) & 255);
        int i24 = i13 + 7;
        this.f5951i = i24;
        bArr[i19] = (byte) (((int) (j7 >> 48)) & 255);
        this.f5951i = i13 + 8;
        bArr[i24] = (byte) (((int) (j7 >> 56)) & 255);
    }

    /* JADX INFO: renamed from: E0 */
    public final void m4492E0(int i13, int i14) {
        m4493F0((i13 << 3) | i14);
    }

    /* JADX INFO: renamed from: F0 */
    public final void m4493F0(int i13) {
        boolean z4 = AbstractC1411p.f5954f;
        byte[] bArr = this.f5949g;
        if (z4) {
            while ((i13 & (-128)) != 0) {
                int i14 = this.f5951i;
                this.f5951i = i14 + 1;
                AbstractC1399k1.m4418k(bArr, i14, (byte) ((i13 | 128) & 255));
                i13 >>>= 7;
            }
            int i15 = this.f5951i;
            this.f5951i = i15 + 1;
            AbstractC1399k1.m4418k(bArr, i15, (byte) i13);
            return;
        }
        while ((i13 & (-128)) != 0) {
            int i16 = this.f5951i;
            this.f5951i = i16 + 1;
            bArr[i16] = (byte) ((i13 | 128) & 255);
            i13 >>>= 7;
        }
        int i17 = this.f5951i;
        this.f5951i = i17 + 1;
        bArr[i17] = (byte) i13;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m4494G0(long j7) {
        boolean z4 = AbstractC1411p.f5954f;
        byte[] bArr = this.f5949g;
        if (z4) {
            while ((j7 & (-128)) != 0) {
                int i13 = this.f5951i;
                this.f5951i = i13 + 1;
                AbstractC1399k1.m4418k(bArr, i13, (byte) ((((int) j7) | 128) & 255));
                j7 >>>= 7;
            }
            int i14 = this.f5951i;
            this.f5951i = i14 + 1;
            AbstractC1399k1.m4418k(bArr, i14, (byte) j7);
            return;
        }
        while ((j7 & (-128)) != 0) {
            int i15 = this.f5951i;
            this.f5951i = i15 + 1;
            bArr[i15] = (byte) ((((int) j7) | 128) & 255);
            j7 >>>= 7;
        }
        int i16 = this.f5951i;
        this.f5951i = i16 + 1;
        bArr[i16] = (byte) j7;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m4495H0() throws IOException {
        this.f5952j.write(this.f5949g, 0, this.f5951i);
        this.f5951i = 0;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m4496I0(int i13) throws IOException {
        if (this.f5950h - this.f5951i < i13) {
            m4495H0();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m4497J0(byte[] bArr, int i13, int i14) throws IOException {
        int i15 = this.f5951i;
        int i16 = this.f5950h;
        int i17 = i16 - i15;
        byte[] bArr2 = this.f5949g;
        if (i17 >= i14) {
            System.arraycopy(bArr, i13, bArr2, i15, i14);
            this.f5951i += i14;
            return;
        }
        System.arraycopy(bArr, i13, bArr2, i15, i17);
        int i18 = i13 + i17;
        int i19 = i14 - i17;
        this.f5951i = i16;
        m4495H0();
        if (i19 > i16) {
            this.f5952j.write(bArr, i18, i19);
        } else {
            System.arraycopy(bArr, i18, bArr2, 0, i19);
            this.f5951i = i19;
        }
    }

    @Override // p095dp.AbstractC12240d
    /* JADX INFO: renamed from: c0 */
    public final void mo4468c0(byte[] bArr, int i13, int i14) throws IOException {
        m4497J0(bArr, i13, i14);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: m0 */
    public final void mo4469m0(byte b) throws IOException {
        if (this.f5951i == this.f5950h) {
            m4495H0();
        }
        int i13 = this.f5951i;
        this.f5951i = i13 + 1;
        this.f5949g[i13] = b;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: n0 */
    public final void mo4470n0(int i13, boolean z4) throws IOException {
        m4496I0(11);
        m4492E0(i13, 0);
        byte b = z4 ? (byte) 1 : (byte) 0;
        int i14 = this.f5951i;
        this.f5951i = i14 + 1;
        this.f5949g[i14] = b;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: o0 */
    public final void mo4471o0(int i13, AbstractC1391i abstractC1391i) throws IOException {
        mo4480x0(i13, 2);
        mo4482z0(abstractC1391i.size());
        C1388h c1388h = (C1388h) abstractC1391i;
        mo4468c0(c1388h.f5903z, c1388h.mo4337f(), c1388h.size());
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: p0 */
    public final void mo4472p0(int i13, int i14) throws IOException {
        m4496I0(14);
        m4492E0(i13, 5);
        m4490C0(i14);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: q0 */
    public final void mo4473q0(int i13) throws IOException {
        m4496I0(4);
        m4490C0(i13);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: r0 */
    public final void mo4474r0(int i13, long j7) throws IOException {
        m4496I0(18);
        m4492E0(i13, 1);
        m4491D0(j7);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: s0 */
    public final void mo4475s0(long j7) throws IOException {
        m4496I0(8);
        m4491D0(j7);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: t0 */
    public final void mo4476t0(int i13, int i14) throws IOException {
        m4496I0(20);
        m4492E0(i13, 0);
        if (i14 >= 0) {
            m4493F0(i14);
        } else {
            m4494G0(i14);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: u0 */
    public final void mo4477u0(int i13) throws IOException {
        if (i13 >= 0) {
            mo4482z0(i13);
        } else {
            mo4466B0(i13);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: v0 */
    public final void mo4478v0(int i13, AbstractC1367a abstractC1367a, InterfaceC1372b1 interfaceC1372b1) throws IOException {
        mo4480x0(i13, 2);
        mo4482z0(abstractC1367a.mo4269b(interfaceC1372b1));
        interfaceC1372b1.mo4295i(abstractC1367a, this.f5955d);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: w0 */
    public final void mo4479w0(int i13, String str) throws IOException {
        mo4480x0(i13, 2);
        try {
            int length = str.length() * 3;
            int iM4504j0 = AbstractC1411p.m4504j0(length);
            int i14 = iM4504j0 + length;
            int i15 = this.f5950h;
            if (i14 > i15) {
                byte[] bArr = new byte[length];
                int iMo4439v = AbstractC1408n1.f5948a.mo4439v(str, bArr, 0, length);
                mo4482z0(iMo4439v);
                m4497J0(bArr, 0, iMo4439v);
                return;
            }
            if (i14 > i15 - this.f5951i) {
                m4495H0();
            }
            int iM4504j1 = AbstractC1411p.m4504j0(str.length());
            int i16 = this.f5951i;
            byte[] bArr2 = this.f5949g;
            try {
                if (iM4504j1 != iM4504j0) {
                    int iM4487b = AbstractC1408n1.m4487b(str);
                    m4493F0(iM4487b);
                    this.f5951i = AbstractC1408n1.f5948a.mo4439v(str, bArr2, this.f5951i, iM4487b);
                    return;
                }
                int i17 = i16 + iM4504j1;
                this.f5951i = i17;
                int iMo4439v2 = AbstractC1408n1.f5948a.mo4439v(str, bArr2, i17, i15 - i17);
                this.f5951i = i16;
                m4493F0((iMo4439v2 - i16) - iM4504j1);
                this.f5951i = iMo4439v2;
            } catch (C1405m1 e5) {
                this.f5951i = i16;
                throw e5;
            } catch (ArrayIndexOutOfBoundsException e13) {
                throw new CodedOutputStream$OutOfSpaceException(e13);
            }
        } catch (C1405m1 e14) {
            m4506l0(str, e14);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: x0 */
    public final void mo4480x0(int i13, int i14) throws IOException {
        mo4482z0((i13 << 3) | i14);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: y0 */
    public final void mo4481y0(int i13, int i14) throws IOException {
        m4496I0(20);
        m4492E0(i13, 0);
        m4493F0(i14);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: z0 */
    public final void mo4482z0(int i13) throws IOException {
        m4496I0(5);
        m4493F0(i13);
    }
}
