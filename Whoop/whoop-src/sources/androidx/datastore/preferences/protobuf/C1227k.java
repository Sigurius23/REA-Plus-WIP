package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1227k extends AbstractC1230l {

    /* JADX INFO: renamed from: E */
    public final byte[] f5412E;

    /* JADX INFO: renamed from: F */
    public int f5413F;

    /* JADX INFO: renamed from: G */
    public int f5414G;

    /* JADX INFO: renamed from: H */
    public int f5415H;

    /* JADX INFO: renamed from: I */
    public int f5416I;

    /* JADX INFO: renamed from: J */
    public int f5417J;

    /* JADX INFO: renamed from: K */
    public int f5418K;

    /* JADX INFO: renamed from: z */
    public final InputStream f5419z;

    public C1227k(InputStream inputStream) {
        super(0, (byte) 0);
        this.f5418K = Integer.MAX_VALUE;
        AbstractC1204c0.m3788a(inputStream, "input");
        this.f5419z = inputStream;
        this.f5412E = new byte[4096];
        this.f5413F = 0;
        this.f5415H = 0;
        this.f5417J = 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: A */
    public final long mo3820A() {
        long jM3858Q = m3858Q();
        return (-(jM3858Q & 1)) ^ (jM3858Q >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: B */
    public final String mo3821B() throws InvalidProtocolBufferException {
        int iM3857P = m3857P();
        byte[] bArr = this.f5412E;
        if (iM3857P > 0) {
            int i13 = this.f5413F;
            int i14 = this.f5415H;
            if (iM3857P <= i13 - i14) {
                String str = new String(bArr, i14, iM3857P, AbstractC1204c0.f5362a);
                this.f5415H += iM3857P;
                return str;
            }
        }
        if (iM3857P == 0) {
            return "";
        }
        if (iM3857P < 0) {
            throw InvalidProtocolBufferException.m3746d();
        }
        if (iM3857P > this.f5413F) {
            return new String(m3852K(iM3857P), AbstractC1204c0.f5362a);
        }
        m3861T(iM3857P);
        String str2 = new String(bArr, this.f5415H, iM3857P, AbstractC1204c0.f5362a);
        this.f5415H += iM3857P;
        return str2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: C */
    public final String mo3822C() throws IOException {
        int iM3857P = m3857P();
        int i13 = this.f5415H;
        int i14 = this.f5413F;
        int i15 = i14 - i13;
        byte[] bArrM3852K = this.f5412E;
        if (iM3857P <= i15 && iM3857P > 0) {
            this.f5415H = i13 + iM3857P;
        } else {
            if (iM3857P == 0) {
                return "";
            }
            if (iM3857P < 0) {
                throw InvalidProtocolBufferException.m3746d();
            }
            i13 = 0;
            if (iM3857P <= i14) {
                m3861T(iM3857P);
                this.f5415H = iM3857P;
            } else {
                bArrM3852K = m3852K(iM3857P);
            }
        }
        return AbstractC1244p1.f5450a.mo3962E(bArrM3852K, i13, iM3857P);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: D */
    public final int mo3823D() throws InvalidProtocolBufferException {
        if (mo3836e()) {
            this.f5416I = 0;
            return 0;
        }
        int iM3857P = m3857P();
        this.f5416I = iM3857P;
        if ((iM3857P >>> 3) != 0) {
            return iM3857P;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: E */
    public final int mo3824E() {
        return m3857P();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: F */
    public final long mo3825F() {
        return m3858Q();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: H */
    public final boolean mo3826H(int i13) throws InvalidProtocolBufferException {
        int i14 = i13 & 7;
        int i15 = 0;
        if (i14 != 0) {
            if (i14 == 1) {
                m3862U(8);
                return true;
            }
            if (i14 == 2) {
                m3862U(m3857P());
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
            m3862U(4);
            return true;
        }
        int i16 = this.f5413F - this.f5415H;
        byte[] bArr = this.f5412E;
        if (i16 >= 10) {
            while (i15 < 10) {
                int i17 = this.f5415H;
                this.f5415H = i17 + 1;
                if (bArr[i17] < 0) {
                    i15++;
                }
            }
            throw InvalidProtocolBufferException.m3745c();
        }
        while (i15 < 10) {
            if (this.f5415H == this.f5413F) {
                m3861T(1);
            }
            int i18 = this.f5415H;
            this.f5415H = i18 + 1;
            if (bArr[i18] < 0) {
                i15++;
            }
        }
        throw InvalidProtocolBufferException.m3745c();
        return true;
    }

    /* JADX INFO: renamed from: K */
    public final byte[] m3852K(int i13) throws IOException {
        byte[] bArrM3853L = m3853L(i13);
        if (bArrM3853L != null) {
            return bArrM3853L;
        }
        int i14 = this.f5415H;
        int i15 = this.f5413F;
        int length = i15 - i14;
        this.f5417J += i15;
        this.f5415H = 0;
        this.f5413F = 0;
        ArrayList<byte[]> arrayListM3854M = m3854M(i13 - length);
        byte[] bArr = new byte[i13];
        System.arraycopy(this.f5412E, i14, bArr, 0, length);
        for (byte[] bArr2 : arrayListM3854M) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: L */
    public final byte[] m3853L(int i13) throws IOException {
        if (i13 == 0) {
            return AbstractC1204c0.f5363b;
        }
        if (i13 < 0) {
            throw InvalidProtocolBufferException.m3746d();
        }
        int i14 = this.f5417J;
        int i15 = this.f5415H;
        int i16 = i14 + i15 + i13;
        if (i16 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i17 = this.f5418K;
        if (i16 > i17) {
            m3862U((i17 - i14) - i15);
            throw InvalidProtocolBufferException.m3747e();
        }
        int i18 = this.f5413F - i15;
        int i19 = i13 - i18;
        InputStream inputStream = this.f5419z;
        if (i19 >= 4096) {
            try {
                if (i19 > inputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e5) {
                e5.f5349w = true;
                throw e5;
            }
        }
        byte[] bArr = new byte[i13];
        System.arraycopy(this.f5412E, this.f5415H, bArr, 0, i18);
        this.f5417J += this.f5413F;
        this.f5415H = 0;
        this.f5413F = 0;
        while (i18 < i13) {
            try {
                int i24 = inputStream.read(bArr, i18, i13 - i18);
                if (i24 == -1) {
                    throw InvalidProtocolBufferException.m3747e();
                }
                this.f5417J += i24;
                i18 += i24;
            } catch (InvalidProtocolBufferException e13) {
                e13.f5349w = true;
                throw e13;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: M */
    public final ArrayList m3854M(int i13) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i13 > 0) {
            int iMin = Math.min(i13, 4096);
            byte[] bArr = new byte[iMin];
            int i14 = 0;
            while (i14 < iMin) {
                int i15 = this.f5419z.read(bArr, i14, iMin - i14);
                if (i15 == -1) {
                    throw InvalidProtocolBufferException.m3747e();
                }
                this.f5417J += i15;
                i14 += i15;
            }
            i13 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N */
    public final int m3855N() throws InvalidProtocolBufferException {
        int i13 = this.f5415H;
        if (this.f5413F - i13 < 4) {
            m3861T(4);
            i13 = this.f5415H;
        }
        this.f5415H = i13 + 4;
        byte[] bArr = this.f5412E;
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: O */
    public final long m3856O() throws InvalidProtocolBufferException {
        int i13 = this.f5415H;
        if (this.f5413F - i13 < 8) {
            m3861T(8);
            i13 = this.f5415H;
        }
        this.f5415H = i13 + 8;
        byte[] bArr = this.f5412E;
        return ((((long) bArr[i13 + 7]) & 255) << 56) | (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: P */
    public final int m3857P() {
        int i13;
        int i14 = this.f5415H;
        int i15 = this.f5413F;
        if (i15 != i14) {
            int i16 = i14 + 1;
            byte[] bArr = this.f5412E;
            byte b = bArr[i14];
            if (b >= 0) {
                this.f5415H = i16;
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
                this.f5415H = i17;
                return i13;
            }
        }
        return (int) m3859R();
    }

    /* JADX INFO: renamed from: Q */
    public final long m3858Q() {
        long j7;
        long j13;
        long j14;
        long j15;
        int i13 = this.f5415H;
        int i14 = this.f5413F;
        if (i14 != i13) {
            int i15 = i13 + 1;
            byte[] bArr = this.f5412E;
            byte b = bArr[i13];
            if (b >= 0) {
                this.f5415H = i15;
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
                this.f5415H = i16;
                return j7;
            }
        }
        return m3859R();
    }

    /* JADX INFO: renamed from: R */
    public final long m3859R() throws InvalidProtocolBufferException {
        long j7 = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            if (this.f5415H == this.f5413F) {
                m3861T(1);
            }
            int i14 = this.f5415H;
            this.f5415H = i14 + 1;
            byte b = this.f5412E[i14];
            j7 |= ((long) (b & 127)) << i13;
            if ((b & 128) == 0) {
                return j7;
            }
        }
        throw InvalidProtocolBufferException.m3745c();
    }

    /* JADX INFO: renamed from: S */
    public final void m3860S() {
        int i13 = this.f5413F + this.f5414G;
        this.f5413F = i13;
        int i14 = this.f5417J + i13;
        int i15 = this.f5418K;
        if (i14 <= i15) {
            this.f5414G = 0;
            return;
        }
        int i16 = i14 - i15;
        this.f5414G = i16;
        this.f5413F = i13 - i16;
    }

    /* JADX INFO: renamed from: T */
    public final void m3861T(int i13) throws InvalidProtocolBufferException {
        if (m3863V(i13)) {
            return;
        }
        if (i13 <= (Integer.MAX_VALUE - this.f5417J) - this.f5415H) {
            throw InvalidProtocolBufferException.m3747e();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: U */
    public final void m3862U(int i13) throws InvalidProtocolBufferException {
        int i14 = this.f5413F;
        int i15 = this.f5415H;
        if (i13 <= i14 - i15 && i13 >= 0) {
            this.f5415H = i15 + i13;
            return;
        }
        InputStream inputStream = this.f5419z;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.m3746d();
        }
        int i16 = this.f5417J;
        int i17 = i16 + i15;
        int i18 = i17 + i13;
        int i19 = this.f5418K;
        if (i18 > i19) {
            m3862U((i19 - i16) - i15);
            throw InvalidProtocolBufferException.m3747e();
        }
        this.f5417J = i17;
        int i24 = i14 - i15;
        this.f5413F = 0;
        this.f5415H = 0;
        while (i24 < i13) {
            long j7 = i13 - i24;
            try {
                try {
                    long jSkip = inputStream.skip(j7);
                    if (jSkip < 0 || jSkip > j7) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i24 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e5) {
                    e5.f5349w = true;
                    throw e5;
                }
            } catch (Throwable th3) {
                this.f5417J += i24;
                m3860S();
                throw th3;
            }
        }
        this.f5417J += i24;
        m3860S();
        if (i24 >= i13) {
            return;
        }
        int i25 = this.f5413F;
        int i26 = i25 - this.f5415H;
        this.f5415H = i25;
        m3861T(1);
        while (true) {
            int i27 = i13 - i26;
            int i28 = this.f5413F;
            if (i27 <= i28) {
                this.f5415H = i27;
                return;
            } else {
                i26 += i28;
                this.f5415H = i28;
                m3861T(1);
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final boolean m3863V(int i13) throws IOException {
        InputStream inputStream = this.f5419z;
        int i14 = this.f5415H;
        int i15 = i14 + i13;
        int i16 = this.f5413F;
        if (i15 <= i16) {
            throw new IllegalStateException(AbstractC2875y.m8296i(i13, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i17 = this.f5417J;
        if (i13 <= (Integer.MAX_VALUE - i17) - i14 && i17 + i14 + i13 <= this.f5418K) {
            byte[] bArr = this.f5412E;
            if (i14 > 0) {
                if (i16 > i14) {
                    System.arraycopy(bArr, i14, bArr, 0, i16 - i14);
                }
                this.f5417J += i14;
                this.f5413F -= i14;
                this.f5415H = 0;
            }
            int i18 = this.f5413F;
            try {
                int i19 = inputStream.read(bArr, i18, Math.min(bArr.length - i18, (Integer.MAX_VALUE - this.f5417J) - i18));
                if (i19 == 0 || i19 < -1 || i19 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i19 + "\nThe InputStream implementation is buggy.");
                }
                if (i19 > 0) {
                    this.f5413F += i19;
                    m3860S();
                    if (this.f5413F >= i13) {
                        return true;
                    }
                    return m3863V(i13);
                }
            } catch (InvalidProtocolBufferException e5) {
                e5.f5349w = true;
                throw e5;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: a */
    public final void mo3834a(int i13) throws InvalidProtocolBufferException {
        if (this.f5416I != i13) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: d */
    public final int mo3835d() {
        return this.f5417J + this.f5415H;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: e */
    public final boolean mo3836e() {
        return this.f5415H == this.f5413F && !m3863V(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: k */
    public final void mo3837k(int i13) {
        this.f5418K = i13;
        m3860S();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: l */
    public final int mo3838l(int i13) throws InvalidProtocolBufferException {
        if (i13 < 0) {
            throw InvalidProtocolBufferException.m3746d();
        }
        int i14 = this.f5417J + this.f5415H + i13;
        if (i14 < 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int i15 = this.f5418K;
        if (i14 > i15) {
            throw InvalidProtocolBufferException.m3747e();
        }
        this.f5418K = i14;
        m3860S();
        return i15;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: m */
    public final boolean mo3839m() {
        return m3858Q() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: n */
    public final C1218h mo3840n() throws IOException {
        int iM3857P = m3857P();
        int i13 = this.f5413F;
        int i14 = this.f5415H;
        int i15 = i13 - i14;
        byte[] bArr = this.f5412E;
        if (iM3857P <= i15 && iM3857P > 0) {
            C1218h c1218hM3808d = C1218h.m3808d(bArr, i14, iM3857P);
            this.f5415H += iM3857P;
            return c1218hM3808d;
        }
        if (iM3857P == 0) {
            return C1218h.f5398y;
        }
        if (iM3857P < 0) {
            throw InvalidProtocolBufferException.m3746d();
        }
        byte[] bArrM3853L = m3853L(iM3857P);
        if (bArrM3853L != null) {
            return C1218h.m3808d(bArrM3853L, 0, bArrM3853L.length);
        }
        int i16 = this.f5415H;
        int i17 = this.f5413F;
        int length = i17 - i16;
        this.f5417J += i17;
        this.f5415H = 0;
        this.f5413F = 0;
        ArrayList<byte[]> arrayListM3854M = m3854M(iM3857P - length);
        byte[] bArr2 = new byte[iM3857P];
        System.arraycopy(bArr, i16, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM3854M) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C1218h c1218h = C1218h.f5398y;
        return new C1218h(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: q */
    public final double mo3841q() {
        return Double.longBitsToDouble(m3856O());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: r */
    public final int mo3842r() {
        return m3857P();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: s */
    public final int mo3843s() {
        return m3855N();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: t */
    public final long mo3844t() {
        return m3856O();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: u */
    public final float mo3845u() {
        return Float.intBitsToFloat(m3855N());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: v */
    public final int mo3846v() {
        return m3857P();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: w */
    public final long mo3847w() {
        return m3858Q();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: x */
    public final int mo3848x() {
        return m3855N();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: y */
    public final long mo3849y() {
        return m3856O();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1230l
    /* JADX INFO: renamed from: z */
    public final int mo3850z() {
        int iM3857P = m3857P();
        return (-(iM3857P & 1)) ^ (iM3857P >>> 1);
    }
}
