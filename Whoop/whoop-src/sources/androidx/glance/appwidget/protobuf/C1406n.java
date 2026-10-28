package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C1406n extends AbstractC1411p {

    /* JADX INFO: renamed from: g */
    public final byte[] f5943g;

    /* JADX INFO: renamed from: h */
    public final int f5944h;

    /* JADX INFO: renamed from: i */
    public int f5945i;

    public C1406n(byte[] bArr, int i13) {
        if (((bArr.length - i13) | i13) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i13)));
        }
        this.f5943g = bArr;
        this.f5945i = 0;
        this.f5944h = i13;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: A0 */
    public final void mo4465A0(int i13, long j7) throws CodedOutputStream$OutOfSpaceException {
        mo4480x0(i13, 0);
        mo4466B0(j7);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: B0 */
    public final void mo4466B0(long j7) throws CodedOutputStream$OutOfSpaceException {
        boolean z4 = AbstractC1411p.f5954f;
        byte[] bArr = this.f5943g;
        if (z4 && m4467C0() >= 10) {
            while ((j7 & (-128)) != 0) {
                int i13 = this.f5945i;
                this.f5945i = i13 + 1;
                AbstractC1399k1.m4418k(bArr, i13, (byte) ((((int) j7) | 128) & 255));
                j7 >>>= 7;
            }
            int i14 = this.f5945i;
            this.f5945i = i14 + 1;
            AbstractC1399k1.m4418k(bArr, i14, (byte) j7);
            return;
        }
        while ((j7 & (-128)) != 0) {
            try {
                int i15 = this.f5945i;
                this.f5945i = i15 + 1;
                bArr[i15] = (byte) ((((int) j7) | 128) & 255);
                j7 >>>= 7;
            } catch (IndexOutOfBoundsException e5) {
                throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5945i), Integer.valueOf(this.f5944h), 1), e5);
            }
        }
        int i16 = this.f5945i;
        this.f5945i = i16 + 1;
        bArr[i16] = (byte) j7;
    }

    /* JADX INFO: renamed from: C0 */
    public final int m4467C0() {
        return this.f5944h - this.f5945i;
    }

    @Override // p095dp.AbstractC12240d
    /* JADX INFO: renamed from: c0 */
    public final void mo4468c0(byte[] bArr, int i13, int i14) throws CodedOutputStream$OutOfSpaceException {
        try {
            System.arraycopy(bArr, i13, this.f5943g, this.f5945i, i14);
            this.f5945i += i14;
        } catch (IndexOutOfBoundsException e5) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5945i), Integer.valueOf(this.f5944h), Integer.valueOf(i14)), e5);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: m0 */
    public final void mo4469m0(byte b) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f5943g;
            int i13 = this.f5945i;
            this.f5945i = i13 + 1;
            bArr[i13] = b;
        } catch (IndexOutOfBoundsException e5) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5945i), Integer.valueOf(this.f5944h), 1), e5);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: n0 */
    public final void mo4470n0(int i13, boolean z4) throws CodedOutputStream$OutOfSpaceException {
        mo4480x0(i13, 0);
        mo4469m0(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: o0 */
    public final void mo4471o0(int i13, AbstractC1391i abstractC1391i) throws CodedOutputStream$OutOfSpaceException {
        mo4480x0(i13, 2);
        mo4482z0(abstractC1391i.size());
        C1388h c1388h = (C1388h) abstractC1391i;
        mo4468c0(c1388h.f5903z, c1388h.mo4337f(), c1388h.size());
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: p0 */
    public final void mo4472p0(int i13, int i14) throws CodedOutputStream$OutOfSpaceException {
        mo4480x0(i13, 5);
        mo4473q0(i14);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: q0 */
    public final void mo4473q0(int i13) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f5943g;
            int i14 = this.f5945i;
            int i15 = i14 + 1;
            this.f5945i = i15;
            bArr[i14] = (byte) (i13 & 255);
            int i16 = i14 + 2;
            this.f5945i = i16;
            bArr[i15] = (byte) ((i13 >> 8) & 255);
            int i17 = i14 + 3;
            this.f5945i = i17;
            bArr[i16] = (byte) ((i13 >> 16) & 255);
            this.f5945i = i14 + 4;
            bArr[i17] = (byte) ((i13 >> 24) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5945i), Integer.valueOf(this.f5944h), 1), e5);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: r0 */
    public final void mo4474r0(int i13, long j7) throws CodedOutputStream$OutOfSpaceException {
        mo4480x0(i13, 1);
        mo4475s0(j7);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: s0 */
    public final void mo4475s0(long j7) throws CodedOutputStream$OutOfSpaceException {
        try {
            byte[] bArr = this.f5943g;
            int i13 = this.f5945i;
            int i14 = i13 + 1;
            this.f5945i = i14;
            bArr[i13] = (byte) (((int) j7) & 255);
            int i15 = i13 + 2;
            this.f5945i = i15;
            bArr[i14] = (byte) (((int) (j7 >> 8)) & 255);
            int i16 = i13 + 3;
            this.f5945i = i16;
            bArr[i15] = (byte) (((int) (j7 >> 16)) & 255);
            int i17 = i13 + 4;
            this.f5945i = i17;
            bArr[i16] = (byte) (((int) (j7 >> 24)) & 255);
            int i18 = i13 + 5;
            this.f5945i = i18;
            bArr[i17] = (byte) (((int) (j7 >> 32)) & 255);
            int i19 = i13 + 6;
            this.f5945i = i19;
            bArr[i18] = (byte) (((int) (j7 >> 40)) & 255);
            int i24 = i13 + 7;
            this.f5945i = i24;
            bArr[i19] = (byte) (((int) (j7 >> 48)) & 255);
            this.f5945i = i13 + 8;
            bArr[i24] = (byte) (((int) (j7 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5945i), Integer.valueOf(this.f5944h), 1), e5);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: t0 */
    public final void mo4476t0(int i13, int i14) throws CodedOutputStream$OutOfSpaceException {
        mo4480x0(i13, 0);
        mo4477u0(i14);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: u0 */
    public final void mo4477u0(int i13) throws CodedOutputStream$OutOfSpaceException {
        if (i13 >= 0) {
            mo4482z0(i13);
        } else {
            mo4466B0(i13);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: v0 */
    public final void mo4478v0(int i13, AbstractC1367a abstractC1367a, InterfaceC1372b1 interfaceC1372b1) throws CodedOutputStream$OutOfSpaceException {
        mo4480x0(i13, 2);
        mo4482z0(abstractC1367a.mo4269b(interfaceC1372b1));
        interfaceC1372b1.mo4295i(abstractC1367a, this.f5955d);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: w0 */
    public final void mo4479w0(int i13, String str) throws CodedOutputStream$OutOfSpaceException {
        mo4480x0(i13, 2);
        int i14 = this.f5945i;
        try {
            int iM4504j0 = AbstractC1411p.m4504j0(str.length() * 3);
            int iM4504j1 = AbstractC1411p.m4504j0(str.length());
            byte[] bArr = this.f5943g;
            if (iM4504j1 != iM4504j0) {
                mo4482z0(AbstractC1408n1.m4487b(str));
                this.f5945i = AbstractC1408n1.f5948a.mo4439v(str, bArr, this.f5945i, m4467C0());
                return;
            }
            int i15 = i14 + iM4504j1;
            this.f5945i = i15;
            int iMo4439v = AbstractC1408n1.f5948a.mo4439v(str, bArr, i15, m4467C0());
            this.f5945i = i14;
            mo4482z0((iMo4439v - i14) - iM4504j1);
            this.f5945i = iMo4439v;
        } catch (C1405m1 e5) {
            this.f5945i = i14;
            m4506l0(str, e5);
        } catch (IndexOutOfBoundsException e13) {
            throw new CodedOutputStream$OutOfSpaceException(e13);
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: x0 */
    public final void mo4480x0(int i13, int i14) throws CodedOutputStream$OutOfSpaceException {
        mo4482z0((i13 << 3) | i14);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: y0 */
    public final void mo4481y0(int i13, int i14) throws CodedOutputStream$OutOfSpaceException {
        mo4480x0(i13, 0);
        mo4482z0(i14);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1411p
    /* JADX INFO: renamed from: z0 */
    public final void mo4482z0(int i13) throws CodedOutputStream$OutOfSpaceException {
        while (true) {
            int i14 = i13 & (-128);
            byte[] bArr = this.f5943g;
            if (i14 == 0) {
                int i15 = this.f5945i;
                this.f5945i = i15 + 1;
                bArr[i15] = (byte) i13;
                return;
            } else {
                try {
                    int i16 = this.f5945i;
                    this.f5945i = i16 + 1;
                    bArr[i16] = (byte) ((i13 | 128) & 255);
                    i13 >>>= 7;
                } catch (IndexOutOfBoundsException e5) {
                    throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5945i), Integer.valueOf(this.f5944h), 1), e5);
                }
            }
            throw new CodedOutputStream$OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5945i), Integer.valueOf(this.f5944h), 1), e5);
        }
    }
}
