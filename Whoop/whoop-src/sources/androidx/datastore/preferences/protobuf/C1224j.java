package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1224j extends AbstractC1230l {

    /* JADX INFO: renamed from: E */
    public int f5403E;

    /* JADX INFO: renamed from: F */
    public int f5404F;

    /* JADX INFO: renamed from: G */
    public int f5405G;

    /* JADX INFO: renamed from: H */
    public final int f5406H;

    /* JADX INFO: renamed from: I */
    public int f5407I;

    /* JADX INFO: renamed from: J */
    public int f5408J;

    /* JADX INFO: renamed from: z */
    public final byte[] f5409z;

    public C1224j(byte[] bArr, int i13, int i14, boolean z4) {
        super(0, (byte) 0);
        this.f5408J = Integer.MAX_VALUE;
        this.f5409z = bArr;
        this.f5403E = i14 + i13;
        this.f5405G = i13;
        this.f5406H = i13;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: A */
    public final long mo3820A() {
        long jM3830N = m3830N();
        return (-(jM3830N & 1)) ^ (jM3830N >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: B */
    public final String mo3821B() throws InvalidProtocolBufferException {
        int iM3829M = m3829M();
        if (iM3829M > 0) {
            int i13 = this.f5403E;
            int i14 = this.f5405G;
            if (iM3829M <= i13 - i14) {
                String str = new String(this.f5409z, i14, iM3829M, AbstractC1204c0.f5362a);
                this.f5405G += iM3829M;
                return str;
            }
        }
        if (iM3829M == 0) {
            return "";
        }
        if (iM3829M < 0) {
            throw InvalidProtocolBufferException.m3746d();
        }
        throw InvalidProtocolBufferException.m3747e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: C */
    public final String mo3822C() throws InvalidProtocolBufferException {
        int iM3829M = m3829M();
        if (iM3829M > 0) {
            int i13 = this.f5403E;
            int i14 = this.f5405G;
            if (iM3829M <= i13 - i14) {
                String strMo3962E = AbstractC1244p1.f5450a.mo3962E(this.f5409z, i14, iM3829M);
                this.f5405G += iM3829M;
                return strMo3962E;
            }
        }
        if (iM3829M == 0) {
            return "";
        }
        if (iM3829M <= 0) {
            throw InvalidProtocolBufferException.m3746d();
        }
        throw InvalidProtocolBufferException.m3747e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: D */
    public final int mo3823D() throws InvalidProtocolBufferException {
        if (mo3836e()) {
            this.f5407I = 0;
            return 0;
        }
        int iM3829M = m3829M();
        this.f5407I = iM3829M;
        if ((iM3829M >>> 3) != 0) {
            return iM3829M;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: E */
    public final int mo3824E() {
        return m3829M();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: F */
    public final long mo3825F() {
        return m3830N();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: H */
    public final boolean mo3826H(int i13) throws InvalidProtocolBufferException {
        int i14 = i13 & 7;
        int i15 = 0;
        if (i14 != 0) {
            if (i14 == 1) {
                m3833Q(8);
                return true;
            }
            if (i14 == 2) {
                m3833Q(m3829M());
                return true;
            }
            if (i14 == 3) {
                m3870I();
                mo3834a(((i13 >>> 3) << 3) | 4);
                return true;
            }
            if (i14 == 4) {
                return false;
            }
            if (i14 != 5) {
                throw InvalidProtocolBufferException.m3744b();
            }
            m3833Q(4);
            return true;
        }
        int i16 = this.f5403E - this.f5405G;
        byte[] bArr = this.f5409z;
        if (i16 >= 10) {
            while (i15 < 10) {
                int i17 = this.f5405G;
                this.f5405G = i17 + 1;
                if (bArr[i17] < 0) {
                    i15++;
                }
            }
            throw InvalidProtocolBufferException.m3745c();
        }
        while (i15 < 10) {
            int i18 = this.f5405G;
            if (i18 == this.f5403E) {
                throw InvalidProtocolBufferException.m3747e();
            }
            this.f5405G = i18 + 1;
            if (bArr[i18] < 0) {
                i15++;
            }
        }
        throw InvalidProtocolBufferException.m3745c();
        return true;
    }

    /* JADX INFO: renamed from: K */
    public final int m3827K() throws InvalidProtocolBufferException {
        int i13 = this.f5405G;
        if (this.f5403E - i13 < 4) {
            throw InvalidProtocolBufferException.m3747e();
        }
        this.f5405G = i13 + 4;
        byte[] bArr = this.f5409z;
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: L */
    public final long m3828L() throws InvalidProtocolBufferException {
        int i13 = this.f5405G;
        if (this.f5403E - i13 < 8) {
            throw InvalidProtocolBufferException.m3747e();
        }
        this.f5405G = i13 + 8;
        byte[] bArr = this.f5409z;
        return ((((long) bArr[i13 + 7]) & 255) << 56) | (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: M */
    public final int m3829M() {
        int i13;
        int i14 = this.f5405G;
        int i15 = this.f5403E;
        if (i15 != i14) {
            int i16 = i14 + 1;
            byte[] bArr = this.f5409z;
            byte b = bArr[i14];
            if (b >= 0) {
                this.f5405G = i16;
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
                this.f5405G = i17;
                return i13;
            }
        }
        return (int) m3831O();
    }

    /* JADX INFO: renamed from: N */
    public final long m3830N() {
        long j7;
        long j13;
        long j14;
        long j15;
        int i13 = this.f5405G;
        int i14 = this.f5403E;
        if (i14 != i13) {
            int i15 = i13 + 1;
            byte[] bArr = this.f5409z;
            byte b = bArr[i13];
            if (b >= 0) {
                this.f5405G = i15;
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
                this.f5405G = i16;
                return j7;
            }
        }
        return m3831O();
    }

    /* JADX INFO: renamed from: O */
    public final long m3831O() throws InvalidProtocolBufferException {
        long j7 = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            int i14 = this.f5405G;
            if (i14 == this.f5403E) {
                throw InvalidProtocolBufferException.m3747e();
            }
            this.f5405G = i14 + 1;
            byte b = this.f5409z[i14];
            j7 |= ((long) (b & 127)) << i13;
            if ((b & 128) == 0) {
                return j7;
            }
        }
        throw InvalidProtocolBufferException.m3745c();
    }

    /* JADX INFO: renamed from: P */
    public final void m3832P() {
        int i13 = this.f5403E + this.f5404F;
        this.f5403E = i13;
        int i14 = i13 - this.f5406H;
        int i15 = this.f5408J;
        if (i14 <= i15) {
            this.f5404F = 0;
            return;
        }
        int i16 = i14 - i15;
        this.f5404F = i16;
        this.f5403E = i13 - i16;
    }

    /* JADX INFO: renamed from: Q */
    public final void m3833Q(int i13) throws InvalidProtocolBufferException {
        if (i13 >= 0) {
            int i14 = this.f5403E;
            int i15 = this.f5405G;
            if (i13 <= i14 - i15) {
                this.f5405G = i15 + i13;
                return;
            }
        }
        if (i13 >= 0) {
            throw InvalidProtocolBufferException.m3747e();
        }
        throw InvalidProtocolBufferException.m3746d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: a */
    public final void mo3834a(int i13) throws InvalidProtocolBufferException {
        if (this.f5407I != i13) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: d */
    public final int mo3835d() {
        return this.f5405G - this.f5406H;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: e */
    public final boolean mo3836e() {
        return this.f5405G == this.f5403E;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: k */
    public final void mo3837k(int i13) {
        this.f5408J = i13;
        m3832P();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: l */
    public final int mo3838l(int i13) throws InvalidProtocolBufferException {
        if (i13 < 0) {
            throw InvalidProtocolBufferException.m3746d();
        }
        int iMo3835d = mo3835d() + i13;
        if (iMo3835d < 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int i14 = this.f5408J;
        if (iMo3835d > i14) {
            throw InvalidProtocolBufferException.m3747e();
        }
        this.f5408J = iMo3835d;
        m3832P();
        return i14;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: m */
    public final boolean mo3839m() {
        return m3830N() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: n */
    public final C1218h mo3840n() throws InvalidProtocolBufferException {
        byte[] bArrCopyOfRange;
        int iM3829M = m3829M();
        byte[] bArr = this.f5409z;
        if (iM3829M > 0) {
            int i13 = this.f5403E;
            int i14 = this.f5405G;
            if (iM3829M <= i13 - i14) {
                C1218h c1218hM3808d = C1218h.m3808d(bArr, i14, iM3829M);
                this.f5405G += iM3829M;
                return c1218hM3808d;
            }
        }
        if (iM3829M == 0) {
            return C1218h.f5398y;
        }
        if (iM3829M > 0) {
            int i15 = this.f5403E;
            int i16 = this.f5405G;
            if (iM3829M <= i15 - i16) {
                int i17 = iM3829M + i16;
                this.f5405G = i17;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i16, i17);
            } else {
                if (iM3829M <= 0) {
                    throw InvalidProtocolBufferException.m3747e();
                }
                if (iM3829M == 0) {
                    throw InvalidProtocolBufferException.m3746d();
                }
                bArrCopyOfRange = AbstractC1204c0.f5363b;
            }
        } else {
            if (iM3829M <= 0) {
                throw InvalidProtocolBufferException.m3747e();
            }
            if (iM3829M == 0) {
                throw InvalidProtocolBufferException.m3746d();
            }
            bArrCopyOfRange = AbstractC1204c0.f5363b;
        }
        C1218h c1218h = C1218h.f5398y;
        return new C1218h(bArrCopyOfRange);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: q */
    public final double mo3841q() {
        return Double.longBitsToDouble(m3828L());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: r */
    public final int mo3842r() {
        return m3829M();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: s */
    public final int mo3843s() {
        return m3827K();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: t */
    public final long mo3844t() {
        return m3828L();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: u */
    public final float mo3845u() {
        return Float.intBitsToFloat(m3827K());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: v */
    public final int mo3846v() {
        return m3829M();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: w */
    public final long mo3847w() {
        return m3830N();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: x */
    public final int mo3848x() {
        return m3827K();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: y */
    public final long mo3849y() {
        return m3828L();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: z */
    public final int mo3850z() {
        int iM3829M = m3829M();
        return (-(iM3829M & 1)) ^ (iM3829M >>> 1);
    }
}
