package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1230l;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C5152k extends AbstractC1230l {

    /* JADX INFO: renamed from: E */
    public final byte[] f21526E;

    /* JADX INFO: renamed from: F */
    public int f21527F;

    /* JADX INFO: renamed from: G */
    public int f21528G;

    /* JADX INFO: renamed from: H */
    public int f21529H;

    /* JADX INFO: renamed from: I */
    public int f21530I;

    /* JADX INFO: renamed from: J */
    public int f21531J;

    /* JADX INFO: renamed from: K */
    public int f21532K;

    /* JADX INFO: renamed from: z */
    public final ByteArrayInputStream f21533z;

    public C5152k(ByteArrayInputStream byteArrayInputStream) {
        super(2, (byte) 0);
        this.f21532K = Integer.MAX_VALUE;
        Charset charset = AbstractC5126b0.f21479a;
        this.f21533z = byteArrayInputStream;
        this.f21526E = new byte[4096];
        this.f21527F = 0;
        this.f21529H = 0;
        this.f21531J = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: A */
    public final long mo3820A() {
        return AbstractC1230l.m3867c(m16201Q());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: B */
    public final String mo3821B() throws InvalidProtocolBufferException {
        int iM16200P = m16200P();
        byte[] bArr = this.f21526E;
        if (iM16200P > 0) {
            int i13 = this.f21527F;
            int i14 = this.f21529H;
            if (iM16200P <= i13 - i14) {
                String str = new String(bArr, i14, iM16200P, AbstractC5126b0.f21479a);
                this.f21529H += iM16200P;
                return str;
            }
        }
        if (iM16200P == 0) {
            return "";
        }
        if (iM16200P > this.f21527F) {
            return new String(m16195K(iM16200P), AbstractC5126b0.f21479a);
        }
        m16204T(iM16200P);
        String str2 = new String(bArr, this.f21529H, iM16200P, AbstractC5126b0.f21479a);
        this.f21529H += iM16200P;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: C */
    public final String mo3822C() throws IOException {
        int iM16200P = m16200P();
        int i13 = this.f21529H;
        int i14 = this.f21527F;
        int i15 = i14 - i13;
        byte[] bArrM16195K = this.f21526E;
        if (iM16200P <= i15 && iM16200P > 0) {
            this.f21529H = i13 + iM16200P;
        } else {
            if (iM16200P == 0) {
                return "";
            }
            i13 = 0;
            if (iM16200P <= i14) {
                m16204T(iM16200P);
                this.f21529H = iM16200P;
            } else {
                bArrM16195K = m16195K(iM16200P);
            }
        }
        return AbstractC5169p1.f21562a.mo16295E(bArrM16195K, i13, iM16200P);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: D */
    public final int mo3823D() throws InvalidProtocolBufferException {
        if (mo3836e()) {
            this.f21530I = 0;
            return 0;
        }
        int iM16200P = m16200P();
        this.f21530I = iM16200P;
        if ((iM16200P >>> 3) != 0) {
            return iM16200P;
        }
        throw InvalidProtocolBufferException.m16099a();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: E */
    public final int mo3824E() {
        return m16200P();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: F */
    public final long mo3825F() {
        return m16201Q();
    }

    /* JADX INFO: renamed from: K */
    public final byte[] m16195K(int i13) throws IOException {
        byte[] bArrM16196L = m16196L(i13);
        if (bArrM16196L != null) {
            return bArrM16196L;
        }
        int i14 = this.f21529H;
        int i15 = this.f21527F;
        int length = i15 - i14;
        this.f21531J += i15;
        this.f21529H = 0;
        this.f21527F = 0;
        ArrayList<byte[]> arrayListM16197M = m16197M(i13 - length);
        byte[] bArr = new byte[i13];
        System.arraycopy(this.f21526E, i14, bArr, 0, length);
        for (byte[] bArr2 : arrayListM16197M) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: L */
    public final byte[] m16196L(int i13) throws IOException {
        if (i13 == 0) {
            return AbstractC5126b0.f21480b;
        }
        if (i13 < 0) {
            throw InvalidProtocolBufferException.m16102d();
        }
        int i14 = this.f21531J;
        int i15 = this.f21529H;
        int i16 = i14 + i15 + i13;
        if (i16 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i17 = this.f21532K;
        if (i16 > i17) {
            m16205U((i17 - i14) - i15);
            throw InvalidProtocolBufferException.m16104f();
        }
        int i18 = this.f21527F - i15;
        int i19 = i13 - i18;
        ByteArrayInputStream byteArrayInputStream = this.f21533z;
        if (i19 >= 4096) {
            try {
                if (i19 > byteArrayInputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e5) {
                e5.f21477w = true;
                throw e5;
            }
        }
        byte[] bArr = new byte[i13];
        System.arraycopy(this.f21526E, this.f21529H, bArr, 0, i18);
        this.f21531J += this.f21527F;
        this.f21529H = 0;
        this.f21527F = 0;
        while (i18 < i13) {
            try {
                int i24 = byteArrayInputStream.read(bArr, i18, i13 - i18);
                if (i24 == -1) {
                    throw InvalidProtocolBufferException.m16104f();
                }
                this.f21531J += i24;
                i18 += i24;
            } catch (InvalidProtocolBufferException e13) {
                e13.f21477w = true;
                throw e13;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: M */
    public final ArrayList m16197M(int i13) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i13 > 0) {
            int iMin = Math.min(i13, 4096);
            byte[] bArr = new byte[iMin];
            int i14 = 0;
            while (i14 < iMin) {
                int i15 = this.f21533z.read(bArr, i14, iMin - i14);
                if (i15 == -1) {
                    throw InvalidProtocolBufferException.m16104f();
                }
                this.f21531J += i15;
                i14 += i15;
            }
            i13 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N */
    public final int m16198N() throws InvalidProtocolBufferException {
        int i13 = this.f21529H;
        if (this.f21527F - i13 < 4) {
            m16204T(4);
            i13 = this.f21529H;
        }
        this.f21529H = i13 + 4;
        byte[] bArr = this.f21526E;
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: O */
    public final long m16199O() throws InvalidProtocolBufferException {
        int i13 = this.f21529H;
        if (this.f21527F - i13 < 8) {
            m16204T(8);
            i13 = this.f21529H;
        }
        this.f21529H = i13 + 8;
        byte[] bArr = this.f21526E;
        return ((((long) bArr[i13 + 7]) & 255) << 56) | (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: P */
    public final int m16200P() {
        int i13;
        int i14 = this.f21529H;
        int i15 = this.f21527F;
        if (i15 != i14) {
            int i16 = i14 + 1;
            byte[] bArr = this.f21526E;
            byte b = bArr[i14];
            if (b >= 0) {
                this.f21529H = i16;
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
                this.f21529H = i17;
                return i13;
            }
        }
        return (int) m16202R();
    }

    /* JADX INFO: renamed from: Q */
    public final long m16201Q() {
        long j7;
        long j13;
        long j14;
        long j15;
        int i13 = this.f21529H;
        int i14 = this.f21527F;
        if (i14 != i13) {
            int i15 = i13 + 1;
            byte[] bArr = this.f21526E;
            byte b = bArr[i13];
            if (b >= 0) {
                this.f21529H = i15;
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
                this.f21529H = i16;
                return j7;
            }
        }
        return m16202R();
    }

    /* JADX INFO: renamed from: R */
    public final long m16202R() throws InvalidProtocolBufferException {
        long j7 = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            if (this.f21529H == this.f21527F) {
                m16204T(1);
            }
            int i14 = this.f21529H;
            this.f21529H = i14 + 1;
            byte b = this.f21526E[i14];
            j7 |= ((long) (b & 127)) << i13;
            if ((b & 128) == 0) {
                return j7;
            }
        }
        throw InvalidProtocolBufferException.m16101c();
    }

    /* JADX INFO: renamed from: S */
    public final void m16203S() {
        int i13 = this.f21527F + this.f21528G;
        this.f21527F = i13;
        int i14 = this.f21531J + i13;
        int i15 = this.f21532K;
        if (i14 <= i15) {
            this.f21528G = 0;
            return;
        }
        int i16 = i14 - i15;
        this.f21528G = i16;
        this.f21527F = i13 - i16;
    }

    /* JADX INFO: renamed from: T */
    public final void m16204T(int i13) throws InvalidProtocolBufferException {
        if (m16206V(i13)) {
            return;
        }
        if (i13 <= (Integer.MAX_VALUE - this.f21531J) - this.f21529H) {
            throw InvalidProtocolBufferException.m16104f();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: U */
    public final void m16205U(int i13) throws InvalidProtocolBufferException {
        int i14 = this.f21527F;
        int i15 = this.f21529H;
        int i16 = i14 - i15;
        if (i13 <= i16 && i13 >= 0) {
            this.f21529H = i15 + i13;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = this.f21533z;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.m16102d();
        }
        int i17 = this.f21531J;
        int i18 = i17 + i15;
        int i19 = i18 + i13;
        int i24 = this.f21532K;
        if (i19 > i24) {
            m16205U((i24 - i17) - i15);
            throw InvalidProtocolBufferException.m16104f();
        }
        this.f21531J = i18;
        this.f21527F = 0;
        this.f21529H = 0;
        while (i16 < i13) {
            long j7 = i13 - i16;
            try {
                try {
                    long jSkip = byteArrayInputStream.skip(j7);
                    if (jSkip < 0 || jSkip > j7) {
                        throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i16 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e5) {
                    e5.f21477w = true;
                    throw e5;
                }
            } catch (Throwable th3) {
                this.f21531J += i16;
                m16203S();
                throw th3;
            }
        }
        this.f21531J += i16;
        m16203S();
        if (i16 >= i13) {
            return;
        }
        int i25 = this.f21527F;
        int i26 = i25 - this.f21529H;
        this.f21529H = i25;
        m16204T(1);
        while (true) {
            int i27 = i13 - i26;
            int i28 = this.f21527F;
            if (i27 <= i28) {
                this.f21529H = i27;
                return;
            } else {
                i26 += i28;
                this.f21529H = i28;
                m16204T(1);
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final boolean m16206V(int i13) throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.f21533z;
        int i14 = this.f21529H;
        int i15 = i14 + i13;
        int i16 = this.f21527F;
        if (i15 <= i16) {
            throw new IllegalStateException(AbstractC2875y.m8296i(i13, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i17 = this.f21531J;
        if (i13 <= (Integer.MAX_VALUE - i17) - i14 && i17 + i14 + i13 <= this.f21532K) {
            byte[] bArr = this.f21526E;
            if (i14 > 0) {
                if (i16 > i14) {
                    System.arraycopy(bArr, i14, bArr, 0, i16 - i14);
                }
                this.f21531J += i14;
                this.f21527F -= i14;
                this.f21529H = 0;
            }
            int i18 = this.f21527F;
            try {
                int i19 = byteArrayInputStream.read(bArr, i18, Math.min(bArr.length - i18, (Integer.MAX_VALUE - this.f21531J) - i18));
                if (i19 == 0 || i19 < -1 || i19 > bArr.length) {
                    throw new IllegalStateException(byteArrayInputStream.getClass() + "#read(byte[]) returned invalid result: " + i19 + "\nThe InputStream implementation is buggy.");
                }
                if (i19 > 0) {
                    this.f21527F += i19;
                    m16203S();
                    if (this.f21527F >= i13) {
                        return true;
                    }
                    return m16206V(i13);
                }
            } catch (InvalidProtocolBufferException e5) {
                e5.f21477w = true;
                throw e5;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: a */
    public final void mo3834a(int i13) throws InvalidProtocolBufferException {
        if (this.f21530I != i13) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: d */
    public final int mo3835d() {
        return this.f21531J + this.f21529H;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: e */
    public final boolean mo3836e() {
        return this.f21529H == this.f21527F && !m16206V(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: k */
    public final void mo3837k(int i13) {
        this.f21532K = i13;
        m16203S();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: l */
    public final int mo3838l(int i13) throws InvalidProtocolBufferException {
        if (i13 < 0) {
            throw InvalidProtocolBufferException.m16102d();
        }
        int i14 = this.f21531J + this.f21529H + i13;
        int i15 = this.f21532K;
        if (i14 > i15) {
            throw InvalidProtocolBufferException.m16104f();
        }
        this.f21532K = i14;
        m16203S();
        return i15;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: m */
    public final boolean mo3839m() {
        return m16201Q() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: p */
    public final C5143h mo3876p() throws IOException {
        int iM16200P = m16200P();
        int i13 = this.f21527F;
        int i14 = this.f21529H;
        int i15 = i13 - i14;
        byte[] bArr = this.f21526E;
        if (iM16200P <= i15 && iM16200P > 0) {
            C5143h c5143hM16173d = AbstractC5146i.m16173d(bArr, i14, iM16200P);
            this.f21529H += iM16200P;
            return c5143hM16173d;
        }
        if (iM16200P == 0) {
            return AbstractC5146i.f21514x;
        }
        byte[] bArrM16196L = m16196L(iM16200P);
        if (bArrM16196L != null) {
            return AbstractC5146i.m16173d(bArrM16196L, 0, bArrM16196L.length);
        }
        int i16 = this.f21529H;
        int i17 = this.f21527F;
        int length = i17 - i16;
        this.f21531J += i17;
        this.f21529H = 0;
        this.f21527F = 0;
        ArrayList<byte[]> arrayListM16197M = m16197M(iM16200P - length);
        byte[] bArr2 = new byte[iM16200P];
        System.arraycopy(bArr, i16, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM16197M) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C5143h c5143h = AbstractC5146i.f21514x;
        return new C5143h(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: q */
    public final double mo3841q() {
        return Double.longBitsToDouble(m16199O());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: r */
    public final int mo3842r() {
        return m16200P();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: s */
    public final int mo3843s() {
        return m16198N();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: t */
    public final long mo3844t() {
        return m16199O();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: u */
    public final float mo3845u() {
        return Float.intBitsToFloat(m16198N());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: v */
    public final int mo3846v() {
        return m16200P();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: w */
    public final long mo3847w() {
        return m16201Q();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: x */
    public final int mo3848x() {
        return m16198N();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: y */
    public final long mo3849y() {
        return m16199O();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: z */
    public final int mo3850z() {
        return AbstractC1230l.m3866b(m16200P());
    }
}
