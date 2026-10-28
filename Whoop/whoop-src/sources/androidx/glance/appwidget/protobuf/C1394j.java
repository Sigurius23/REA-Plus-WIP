package androidx.glance.appwidget.protobuf;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C1394j extends AbstractC1400l {

    /* JADX INFO: renamed from: c */
    public final byte[] f5908c;

    /* JADX INFO: renamed from: d */
    public int f5909d;

    /* JADX INFO: renamed from: e */
    public int f5910e;

    /* JADX INFO: renamed from: f */
    public int f5911f;

    /* JADX INFO: renamed from: g */
    public final int f5912g;

    /* JADX INFO: renamed from: h */
    public int f5913h;

    /* JADX INFO: renamed from: i */
    public int f5914i = Integer.MAX_VALUE;

    public C1394j(byte[] bArr, int i13, int i14, boolean z4) {
        this.f5908c = bArr;
        this.f5909d = i14 + i13;
        this.f5911f = i13;
        this.f5912g = i13;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: A */
    public final long mo4356A() {
        return m4369N();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: B */
    public final int mo4357B() {
        return m4366K();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: C */
    public final long mo4358C() {
        return m4367L();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: D */
    public final int mo4359D() {
        return AbstractC1400l.m4424g(m4368M());
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: E */
    public final long mo4360E() {
        return AbstractC1400l.m4425h(m4369N());
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: F */
    public final String mo4361F() throws InvalidProtocolBufferException {
        int iM4368M = m4368M();
        if (iM4368M > 0) {
            int i13 = this.f5909d;
            int i14 = this.f5911f;
            if (iM4368M <= i13 - i14) {
                String str = new String(this.f5908c, i14, iM4368M, AbstractC1383f0.f5887a);
                this.f5911f += iM4368M;
                return str;
            }
        }
        if (iM4368M == 0) {
            return "";
        }
        if (iM4368M < 0) {
            throw InvalidProtocolBufferException.m4265e();
        }
        throw InvalidProtocolBufferException.m4267g();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: G */
    public final String mo4362G() throws InvalidProtocolBufferException {
        int iM4368M = m4368M();
        if (iM4368M > 0) {
            int i13 = this.f5909d;
            int i14 = this.f5911f;
            if (iM4368M <= i13 - i14) {
                String strMo4438u = AbstractC1408n1.f5948a.mo4438u(this.f5908c, i14, iM4368M);
                this.f5911f += iM4368M;
                return strMo4438u;
            }
        }
        if (iM4368M == 0) {
            return "";
        }
        if (iM4368M <= 0) {
            throw InvalidProtocolBufferException.m4265e();
        }
        throw InvalidProtocolBufferException.m4267g();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: H */
    public final int mo4363H() throws InvalidProtocolBufferException {
        if (mo4374k()) {
            this.f5913h = 0;
            return 0;
        }
        int iM4368M = m4368M();
        this.f5913h = iM4368M;
        if ((iM4368M >>> 3) != 0) {
            return iM4368M;
        }
        throw InvalidProtocolBufferException.m4261a();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: I */
    public final int mo4364I() {
        return m4368M();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: J */
    public final long mo4365J() {
        return m4369N();
    }

    /* JADX INFO: renamed from: K */
    public final int m4366K() throws InvalidProtocolBufferException {
        int i13 = this.f5911f;
        if (this.f5909d - i13 < 4) {
            throw InvalidProtocolBufferException.m4267g();
        }
        this.f5911f = i13 + 4;
        byte[] bArr = this.f5908c;
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: L */
    public final long m4367L() throws InvalidProtocolBufferException {
        int i13 = this.f5911f;
        if (this.f5909d - i13 < 8) {
            throw InvalidProtocolBufferException.m4267g();
        }
        this.f5911f = i13 + 8;
        byte[] bArr = this.f5908c;
        return ((((long) bArr[i13 + 7]) & 255) << 56) | (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: M */
    public final int m4368M() {
        int i13;
        int i14 = this.f5911f;
        int i15 = this.f5909d;
        if (i15 != i14) {
            int i16 = i14 + 1;
            byte[] bArr = this.f5908c;
            byte b = bArr[i14];
            if (b >= 0) {
                this.f5911f = i16;
                return b;
            }
            if (i15 - i16 >= 9) {
                int i17 = i14 + 2;
                int i18 = (bArr[i16] << 7) ^ b;
                if (i18 < 0) {
                    i13 = i18 ^ (-128);
                } else {
                    int i19 = i14 + 3;
                    int i24 = (bArr[i17] << 14) ^ i18;
                    if (i24 >= 0) {
                        i13 = i24 ^ 16256;
                    } else {
                        int i25 = i14 + 4;
                        int i26 = i24 ^ (bArr[i19] << 21);
                        if (i26 < 0) {
                            i13 = (-2080896) ^ i26;
                        } else {
                            i19 = i14 + 5;
                            byte b6 = bArr[i25];
                            int i27 = (i26 ^ (b6 << 28)) ^ 266354560;
                            if (b6 < 0) {
                                i25 = i14 + 6;
                                if (bArr[i19] < 0) {
                                    i19 = i14 + 7;
                                    if (bArr[i25] < 0) {
                                        i25 = i14 + 8;
                                        if (bArr[i19] < 0) {
                                            i19 = i14 + 9;
                                            if (bArr[i25] < 0) {
                                                int i28 = i14 + 10;
                                                if (bArr[i19] >= 0) {
                                                    i17 = i28;
                                                    i13 = i27;
                                                }
                                            }
                                        }
                                    }
                                }
                                i13 = i27;
                            }
                            i13 = i27;
                        }
                        i17 = i25;
                    }
                    i17 = i19;
                }
                this.f5911f = i17;
                return i13;
            }
        }
        return (int) m4370O();
    }

    /* JADX INFO: renamed from: N */
    public final long m4369N() {
        long j7;
        long j13;
        long j14;
        long j15;
        int i13 = this.f5911f;
        int i14 = this.f5909d;
        if (i14 != i13) {
            int i15 = i13 + 1;
            byte[] bArr = this.f5908c;
            byte b = bArr[i13];
            if (b >= 0) {
                this.f5911f = i15;
                return b;
            }
            if (i14 - i15 >= 9) {
                int i16 = i13 + 2;
                int i17 = (bArr[i15] << 7) ^ b;
                if (i17 < 0) {
                    j7 = i17 ^ (-128);
                } else {
                    int i18 = i13 + 3;
                    int i19 = (bArr[i16] << 14) ^ i17;
                    if (i19 >= 0) {
                        j7 = i19 ^ 16256;
                        i16 = i18;
                    } else {
                        int i24 = i13 + 4;
                        int i25 = i19 ^ (bArr[i18] << 21);
                        if (i25 < 0) {
                            j15 = (-2080896) ^ i25;
                        } else {
                            long j16 = i25;
                            i16 = i13 + 5;
                            long j17 = j16 ^ (((long) bArr[i24]) << 28);
                            if (j17 >= 0) {
                                j14 = 266354560;
                            } else {
                                i24 = i13 + 6;
                                long j18 = j17 ^ (((long) bArr[i16]) << 35);
                                if (j18 < 0) {
                                    j13 = -34093383808L;
                                } else {
                                    i16 = i13 + 7;
                                    j17 = j18 ^ (((long) bArr[i24]) << 42);
                                    if (j17 >= 0) {
                                        j14 = 4363953127296L;
                                    } else {
                                        i24 = i13 + 8;
                                        j18 = j17 ^ (((long) bArr[i16]) << 49);
                                        if (j18 < 0) {
                                            j13 = -558586000294016L;
                                        } else {
                                            i16 = i13 + 9;
                                            long j19 = (j18 ^ (((long) bArr[i24]) << 56)) ^ 71499008037633920L;
                                            if (j19 < 0) {
                                                int i26 = i13 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i16 = i26;
                                                }
                                            }
                                            j7 = j19;
                                        }
                                    }
                                }
                                j15 = j13 ^ j18;
                            }
                            j7 = j14 ^ j17;
                        }
                        i16 = i24;
                        j7 = j15;
                    }
                }
                this.f5911f = i16;
                return j7;
            }
        }
        return m4370O();
    }

    /* JADX INFO: renamed from: O */
    public final long m4370O() throws InvalidProtocolBufferException {
        long j7 = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            int i14 = this.f5911f;
            if (i14 == this.f5909d) {
                throw InvalidProtocolBufferException.m4267g();
            }
            this.f5911f = i14 + 1;
            byte b = this.f5908c[i14];
            j7 |= ((long) (b & 127)) << i13;
            if ((b & 128) == 0) {
                return j7;
            }
        }
        throw InvalidProtocolBufferException.m4264d();
    }

    /* JADX INFO: renamed from: P */
    public final void m4371P() {
        int i13 = this.f5909d + this.f5910e;
        this.f5909d = i13;
        int i14 = i13 - this.f5912g;
        int i15 = this.f5914i;
        if (i14 <= i15) {
            this.f5910e = 0;
            return;
        }
        int i16 = i14 - i15;
        this.f5910e = i16;
        this.f5909d = i13 - i16;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: e */
    public final void mo4372e(int i13) throws InvalidProtocolBufferException {
        if (this.f5913h != i13) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: j */
    public final int mo4373j() {
        return this.f5911f - this.f5912g;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: k */
    public final boolean mo4374k() {
        return this.f5911f == this.f5909d;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: m */
    public final void mo4375m(int i13) {
        this.f5914i = i13;
        m4371P();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: q */
    public final int mo4376q(int i13) {
        if (i13 < 0) {
            throw InvalidProtocolBufferException.m4265e();
        }
        int iMo4373j = mo4373j() + i13;
        if (iMo4373j < 0) {
            throw InvalidProtocolBufferException.m4266f();
        }
        int i14 = this.f5914i;
        if (iMo4373j > i14) {
            throw InvalidProtocolBufferException.m4267g();
        }
        this.f5914i = iMo4373j;
        m4371P();
        return i14;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: s */
    public final boolean mo4377s() {
        return m4369N() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: t */
    public final C1388h mo4378t() throws InvalidProtocolBufferException {
        byte[] bArrCopyOfRange;
        int iM4368M = m4368M();
        byte[] bArr = this.f5908c;
        if (iM4368M > 0) {
            int i13 = this.f5909d;
            int i14 = this.f5911f;
            if (iM4368M <= i13 - i14) {
                C1388h c1388hM4353d = AbstractC1391i.m4353d(bArr, i14, iM4368M);
                this.f5911f += iM4368M;
                return c1388hM4353d;
            }
        }
        if (iM4368M == 0) {
            return AbstractC1391i.f5905x;
        }
        if (iM4368M > 0) {
            int i15 = this.f5909d;
            int i16 = this.f5911f;
            if (iM4368M <= i15 - i16) {
                int i17 = iM4368M + i16;
                this.f5911f = i17;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i16, i17);
            } else {
                if (iM4368M <= 0) {
                    throw InvalidProtocolBufferException.m4267g();
                }
                if (iM4368M == 0) {
                    throw InvalidProtocolBufferException.m4265e();
                }
                bArrCopyOfRange = AbstractC1383f0.f5888b;
            }
        } else {
            if (iM4368M <= 0) {
                throw InvalidProtocolBufferException.m4267g();
            }
            if (iM4368M == 0) {
                throw InvalidProtocolBufferException.m4265e();
            }
            bArrCopyOfRange = AbstractC1383f0.f5888b;
        }
        C1388h c1388h = AbstractC1391i.f5905x;
        return new C1388h(bArrCopyOfRange);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: u */
    public final double mo4379u() {
        return Double.longBitsToDouble(m4367L());
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: v */
    public final int mo4380v() {
        return m4368M();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: w */
    public final int mo4381w() {
        return m4366K();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: x */
    public final long mo4382x() {
        return m4367L();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: y */
    public final float mo4383y() {
        return Float.intBitsToFloat(m4366K());
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: z */
    public final int mo4384z() {
        return m4368M();
    }
}
