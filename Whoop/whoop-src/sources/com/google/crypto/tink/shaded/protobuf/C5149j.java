package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1230l;
import java.util.Arrays;
import p522uf.AbstractC34870c0;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5149j extends AbstractC1230l {

    /* JADX INFO: renamed from: E */
    public int f21517E;

    /* JADX INFO: renamed from: F */
    public int f21518F;

    /* JADX INFO: renamed from: G */
    public int f21519G;

    /* JADX INFO: renamed from: H */
    public final int f21520H;

    /* JADX INFO: renamed from: I */
    public int f21521I;

    /* JADX INFO: renamed from: J */
    public int f21522J;

    /* JADX INFO: renamed from: z */
    public final byte[] f21523z;

    public C5149j(byte[] bArr, int i13, int i14, boolean z4) {
        super(2, (byte) 0);
        this.f21522J = Integer.MAX_VALUE;
        this.f21523z = bArr;
        this.f21517E = i14 + i13;
        this.f21519G = i13;
        this.f21520H = i13;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: A */
    public final long mo3820A() {
        return AbstractC1230l.m3867c(m16181N());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: B */
    public final String mo3821B() throws InvalidProtocolBufferException {
        int iM16180M = m16180M();
        if (iM16180M > 0) {
            int i13 = this.f21517E;
            int i14 = this.f21519G;
            if (iM16180M <= i13 - i14) {
                String str = new String(this.f21523z, i14, iM16180M, AbstractC5126b0.f21479a);
                this.f21519G += iM16180M;
                return str;
            }
        }
        if (iM16180M == 0) {
            return "";
        }
        if (iM16180M < 0) {
            throw InvalidProtocolBufferException.m16102d();
        }
        throw InvalidProtocolBufferException.m16104f();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: C */
    public final String mo3822C() throws InvalidProtocolBufferException {
        int iM16180M = m16180M();
        if (iM16180M > 0) {
            int i13 = this.f21517E;
            int i14 = this.f21519G;
            if (iM16180M <= i13 - i14) {
                String strM16301b = AbstractC5169p1.m16301b(this.f21523z, i14, iM16180M);
                this.f21519G += iM16180M;
                return strM16301b;
            }
        }
        if (iM16180M == 0) {
            return "";
        }
        if (iM16180M <= 0) {
            throw InvalidProtocolBufferException.m16102d();
        }
        throw InvalidProtocolBufferException.m16104f();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: D */
    public final int mo3823D() throws InvalidProtocolBufferException {
        if (mo3836e()) {
            this.f21521I = 0;
            return 0;
        }
        int iM16180M = m16180M();
        this.f21521I = iM16180M;
        if (AbstractC34870c0.m109986V(iM16180M) != 0) {
            return this.f21521I;
        }
        throw InvalidProtocolBufferException.m16099a();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: E */
    public final int mo3824E() {
        return m16180M();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: F */
    public final long mo3825F() {
        return m16181N();
    }

    /* JADX INFO: renamed from: K */
    public final int m16178K() throws InvalidProtocolBufferException {
        int i13 = this.f21519G;
        if (this.f21517E - i13 < 4) {
            throw InvalidProtocolBufferException.m16104f();
        }
        this.f21519G = i13 + 4;
        byte[] bArr = this.f21523z;
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: L */
    public final long m16179L() throws InvalidProtocolBufferException {
        int i13 = this.f21519G;
        if (this.f21517E - i13 < 8) {
            throw InvalidProtocolBufferException.m16104f();
        }
        this.f21519G = i13 + 8;
        byte[] bArr = this.f21523z;
        return ((((long) bArr[i13 + 7]) & 255) << 56) | (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: M */
    public final int m16180M() {
        int i13;
        int i14 = this.f21519G;
        int i15 = this.f21517E;
        if (i15 != i14) {
            int i16 = i14 + 1;
            byte[] bArr = this.f21523z;
            byte b = bArr[i14];
            if (b >= 0) {
                this.f21519G = i16;
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
                this.f21519G = i17;
                return i13;
            }
        }
        return (int) m16182O();
    }

    /* JADX INFO: renamed from: N */
    public final long m16181N() {
        long j7;
        long j13;
        long j14;
        long j15;
        int i13 = this.f21519G;
        int i14 = this.f21517E;
        if (i14 != i13) {
            int i15 = i13 + 1;
            byte[] bArr = this.f21523z;
            byte b = bArr[i13];
            if (b >= 0) {
                this.f21519G = i15;
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
                this.f21519G = i16;
                return j7;
            }
        }
        return m16182O();
    }

    /* JADX INFO: renamed from: O */
    public final long m16182O() throws InvalidProtocolBufferException {
        long j7 = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            int i14 = this.f21519G;
            if (i14 == this.f21517E) {
                throw InvalidProtocolBufferException.m16104f();
            }
            this.f21519G = i14 + 1;
            byte b = this.f21523z[i14];
            j7 |= ((long) (b & 127)) << i13;
            if ((b & 128) == 0) {
                return j7;
            }
        }
        throw InvalidProtocolBufferException.m16101c();
    }

    /* JADX INFO: renamed from: P */
    public final void m16183P() {
        int i13 = this.f21517E + this.f21518F;
        this.f21517E = i13;
        int i14 = i13 - this.f21520H;
        int i15 = this.f21522J;
        if (i14 <= i15) {
            this.f21518F = 0;
            return;
        }
        int i16 = i14 - i15;
        this.f21518F = i16;
        this.f21517E = i13 - i16;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: a */
    public final void mo3834a(int i13) throws InvalidProtocolBufferException {
        if (this.f21521I != i13) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: d */
    public final int mo3835d() {
        return this.f21519G - this.f21520H;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: e */
    public final boolean mo3836e() {
        return this.f21519G == this.f21517E;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: k */
    public final void mo3837k(int i13) {
        this.f21522J = i13;
        m16183P();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: l */
    public final int mo3838l(int i13) {
        if (i13 < 0) {
            throw InvalidProtocolBufferException.m16102d();
        }
        int iMo3835d = mo3835d() + i13;
        if (iMo3835d < 0) {
            throw InvalidProtocolBufferException.m16103e();
        }
        int i14 = this.f21522J;
        if (iMo3835d > i14) {
            throw InvalidProtocolBufferException.m16104f();
        }
        this.f21522J = iMo3835d;
        m16183P();
        return i14;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: m */
    public final boolean mo3839m() {
        return m16181N() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: p */
    public final C5143h mo3876p() throws InvalidProtocolBufferException {
        byte[] bArrCopyOfRange;
        int iM16180M = m16180M();
        byte[] bArr = this.f21523z;
        if (iM16180M > 0) {
            int i13 = this.f21517E;
            int i14 = this.f21519G;
            if (iM16180M <= i13 - i14) {
                C5143h c5143hM16173d = AbstractC5146i.m16173d(bArr, i14, iM16180M);
                this.f21519G += iM16180M;
                return c5143hM16173d;
            }
        }
        if (iM16180M == 0) {
            return AbstractC5146i.f21514x;
        }
        if (iM16180M > 0) {
            int i15 = this.f21517E;
            int i16 = this.f21519G;
            if (iM16180M <= i15 - i16) {
                int i17 = iM16180M + i16;
                this.f21519G = i17;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i16, i17);
            } else {
                if (iM16180M <= 0) {
                    throw InvalidProtocolBufferException.m16104f();
                }
                if (iM16180M == 0) {
                    throw InvalidProtocolBufferException.m16102d();
                }
                bArrCopyOfRange = AbstractC5126b0.f21480b;
            }
        } else {
            if (iM16180M <= 0) {
                throw InvalidProtocolBufferException.m16104f();
            }
            if (iM16180M == 0) {
                throw InvalidProtocolBufferException.m16102d();
            }
            bArrCopyOfRange = AbstractC5126b0.f21480b;
        }
        C5143h c5143h = AbstractC5146i.f21514x;
        return new C5143h(bArrCopyOfRange);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: q */
    public final double mo3841q() {
        return Double.longBitsToDouble(m16179L());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: r */
    public final int mo3842r() {
        return m16180M();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: s */
    public final int mo3843s() {
        return m16178K();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: t */
    public final long mo3844t() {
        return m16179L();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: u */
    public final float mo3845u() {
        return Float.intBitsToFloat(m16178K());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: v */
    public final int mo3846v() {
        return m16180M();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: w */
    public final long mo3847w() {
        return m16181N();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: x */
    public final int mo3848x() {
        return m16178K();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: y */
    public final long mo3849y() {
        return m16179L();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: z */
    public final int mo3850z() {
        return AbstractC1230l.m3866b(m16180M());
    }
}
