package androidx.glance.appwidget.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C1397k extends AbstractC1400l {

    /* JADX INFO: renamed from: c */
    public final InputStream f5918c;

    /* JADX INFO: renamed from: d */
    public final byte[] f5919d;

    /* JADX INFO: renamed from: e */
    public int f5920e;

    /* JADX INFO: renamed from: f */
    public int f5921f;

    /* JADX INFO: renamed from: g */
    public int f5922g;

    /* JADX INFO: renamed from: h */
    public int f5923h;

    /* JADX INFO: renamed from: i */
    public int f5924i;

    /* JADX INFO: renamed from: j */
    public int f5925j = Integer.MAX_VALUE;

    public C1397k(InputStream inputStream) {
        AbstractC1383f0.m4333a(inputStream, "input");
        this.f5918c = inputStream;
        this.f5919d = new byte[4096];
        this.f5920e = 0;
        this.f5922g = 0;
        this.f5924i = 0;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: A */
    public final long mo4356A() {
        return m4400Q();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: B */
    public final int mo4357B() {
        return m4397N();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: C */
    public final long mo4358C() {
        return m4398O();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: D */
    public final int mo4359D() {
        return AbstractC1400l.m4424g(m4399P());
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: E */
    public final long mo4360E() {
        return AbstractC1400l.m4425h(m4400Q());
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: F */
    public final String mo4361F() throws InvalidProtocolBufferException {
        int iM4399P = m4399P();
        byte[] bArr = this.f5919d;
        if (iM4399P > 0) {
            int i13 = this.f5920e;
            int i14 = this.f5922g;
            if (iM4399P <= i13 - i14) {
                String str = new String(bArr, i14, iM4399P, AbstractC1383f0.f5887a);
                this.f5922g += iM4399P;
                return str;
            }
        }
        if (iM4399P == 0) {
            return "";
        }
        if (iM4399P < 0) {
            throw InvalidProtocolBufferException.m4265e();
        }
        if (iM4399P > this.f5920e) {
            return new String(m4394K(iM4399P), AbstractC1383f0.f5887a);
        }
        m4403T(iM4399P);
        String str2 = new String(bArr, this.f5922g, iM4399P, AbstractC1383f0.f5887a);
        this.f5922g += iM4399P;
        return str2;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: G */
    public final String mo4362G() throws IOException {
        int iM4399P = m4399P();
        int i13 = this.f5922g;
        int i14 = this.f5920e;
        int i15 = i14 - i13;
        byte[] bArrM4394K = this.f5919d;
        if (iM4399P <= i15 && iM4399P > 0) {
            this.f5922g = i13 + iM4399P;
        } else {
            if (iM4399P == 0) {
                return "";
            }
            if (iM4399P < 0) {
                throw InvalidProtocolBufferException.m4265e();
            }
            i13 = 0;
            if (iM4399P <= i14) {
                m4403T(iM4399P);
                this.f5922g = iM4399P;
            } else {
                bArrM4394K = m4394K(iM4399P);
            }
        }
        return AbstractC1408n1.f5948a.mo4438u(bArrM4394K, i13, iM4399P);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: H */
    public final int mo4363H() throws InvalidProtocolBufferException {
        if (mo4374k()) {
            this.f5923h = 0;
            return 0;
        }
        int iM4399P = m4399P();
        this.f5923h = iM4399P;
        if ((iM4399P >>> 3) != 0) {
            return iM4399P;
        }
        throw InvalidProtocolBufferException.m4261a();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: I */
    public final int mo4364I() {
        return m4399P();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: J */
    public final long mo4365J() {
        return m4400Q();
    }

    /* JADX INFO: renamed from: K */
    public final byte[] m4394K(int i13) throws IOException {
        byte[] bArrM4395L = m4395L(i13);
        if (bArrM4395L != null) {
            return bArrM4395L;
        }
        int i14 = this.f5922g;
        int i15 = this.f5920e;
        int length = i15 - i14;
        this.f5924i += i15;
        this.f5922g = 0;
        this.f5920e = 0;
        ArrayList<byte[]> arrayListM4396M = m4396M(i13 - length);
        byte[] bArr = new byte[i13];
        System.arraycopy(this.f5919d, i14, bArr, 0, length);
        for (byte[] bArr2 : arrayListM4396M) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: L */
    public final byte[] m4395L(int i13) throws IOException {
        if (i13 == 0) {
            return AbstractC1383f0.f5888b;
        }
        if (i13 < 0) {
            throw InvalidProtocolBufferException.m4265e();
        }
        int i14 = this.f5924i;
        int i15 = this.f5922g;
        int i16 = i14 + i15 + i13;
        if (i16 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i17 = this.f5925j;
        if (i16 > i17) {
            m4404U((i17 - i14) - i15);
            throw InvalidProtocolBufferException.m4267g();
        }
        int i18 = this.f5920e - i15;
        int i19 = i13 - i18;
        InputStream inputStream = this.f5918c;
        if (i19 >= 4096) {
            try {
                if (i19 > inputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e5) {
                e5.f5862w = true;
                throw e5;
            }
        }
        byte[] bArr = new byte[i13];
        System.arraycopy(this.f5919d, this.f5922g, bArr, 0, i18);
        this.f5924i += this.f5920e;
        this.f5922g = 0;
        this.f5920e = 0;
        while (i18 < i13) {
            try {
                int i24 = inputStream.read(bArr, i18, i13 - i18);
                if (i24 == -1) {
                    throw InvalidProtocolBufferException.m4267g();
                }
                this.f5924i += i24;
                i18 += i24;
            } catch (InvalidProtocolBufferException e13) {
                e13.f5862w = true;
                throw e13;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: M */
    public final ArrayList m4396M(int i13) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i13 > 0) {
            int iMin = Math.min(i13, 4096);
            byte[] bArr = new byte[iMin];
            int i14 = 0;
            while (i14 < iMin) {
                int i15 = this.f5918c.read(bArr, i14, iMin - i14);
                if (i15 == -1) {
                    throw InvalidProtocolBufferException.m4267g();
                }
                this.f5924i += i15;
                i14 += i15;
            }
            i13 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: N */
    public final int m4397N() throws InvalidProtocolBufferException {
        int i13 = this.f5922g;
        if (this.f5920e - i13 < 4) {
            m4403T(4);
            i13 = this.f5922g;
        }
        this.f5922g = i13 + 4;
        byte[] bArr = this.f5919d;
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: O */
    public final long m4398O() throws InvalidProtocolBufferException {
        int i13 = this.f5922g;
        if (this.f5920e - i13 < 8) {
            m4403T(8);
            i13 = this.f5922g;
        }
        this.f5922g = i13 + 8;
        byte[] bArr = this.f5919d;
        return ((((long) bArr[i13 + 7]) & 255) << 56) | (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: P */
    public final int m4399P() {
        int i13;
        int i14 = this.f5922g;
        int i15 = this.f5920e;
        if (i15 != i14) {
            int i16 = i14 + 1;
            byte[] bArr = this.f5919d;
            byte b = bArr[i14];
            if (b >= 0) {
                this.f5922g = i16;
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
                this.f5922g = i17;
                return i13;
            }
        }
        return (int) m4401R();
    }

    /* JADX INFO: renamed from: Q */
    public final long m4400Q() {
        long j7;
        long j13;
        long j14;
        long j15;
        int i13 = this.f5922g;
        int i14 = this.f5920e;
        if (i14 != i13) {
            int i15 = i13 + 1;
            byte[] bArr = this.f5919d;
            byte b = bArr[i13];
            if (b >= 0) {
                this.f5922g = i15;
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
                this.f5922g = i16;
                return j7;
            }
        }
        return m4401R();
    }

    /* JADX INFO: renamed from: R */
    public final long m4401R() throws InvalidProtocolBufferException {
        long j7 = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            if (this.f5922g == this.f5920e) {
                m4403T(1);
            }
            int i14 = this.f5922g;
            this.f5922g = i14 + 1;
            byte b = this.f5919d[i14];
            j7 |= ((long) (b & 127)) << i13;
            if ((b & 128) == 0) {
                return j7;
            }
        }
        throw InvalidProtocolBufferException.m4264d();
    }

    /* JADX INFO: renamed from: S */
    public final void m4402S() {
        int i13 = this.f5920e + this.f5921f;
        this.f5920e = i13;
        int i14 = this.f5924i + i13;
        int i15 = this.f5925j;
        if (i14 <= i15) {
            this.f5921f = 0;
            return;
        }
        int i16 = i14 - i15;
        this.f5921f = i16;
        this.f5920e = i13 - i16;
    }

    /* JADX INFO: renamed from: T */
    public final void m4403T(int i13) throws InvalidProtocolBufferException {
        if (m4405V(i13)) {
            return;
        }
        if (i13 <= (Integer.MAX_VALUE - this.f5924i) - this.f5922g) {
            throw InvalidProtocolBufferException.m4267g();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: U */
    public final void m4404U(int i13) throws InvalidProtocolBufferException {
        int i14 = this.f5920e;
        int i15 = this.f5922g;
        if (i13 <= i14 - i15 && i13 >= 0) {
            this.f5922g = i15 + i13;
            return;
        }
        InputStream inputStream = this.f5918c;
        if (i13 < 0) {
            throw InvalidProtocolBufferException.m4265e();
        }
        int i16 = this.f5924i;
        int i17 = i16 + i15;
        int i18 = i17 + i13;
        int i19 = this.f5925j;
        if (i18 > i19) {
            m4404U((i19 - i16) - i15);
            throw InvalidProtocolBufferException.m4267g();
        }
        this.f5924i = i17;
        int i24 = i14 - i15;
        this.f5920e = 0;
        this.f5922g = 0;
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
                    e5.f5862w = true;
                    throw e5;
                }
            } catch (Throwable th3) {
                this.f5924i += i24;
                m4402S();
                throw th3;
            }
        }
        this.f5924i += i24;
        m4402S();
        if (i24 >= i13) {
            return;
        }
        int i25 = this.f5920e;
        int i26 = i25 - this.f5922g;
        this.f5922g = i25;
        m4403T(1);
        while (true) {
            int i27 = i13 - i26;
            int i28 = this.f5920e;
            if (i27 <= i28) {
                this.f5922g = i27;
                return;
            } else {
                i26 += i28;
                this.f5922g = i28;
                m4403T(1);
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final boolean m4405V(int i13) throws IOException {
        InputStream inputStream = this.f5918c;
        int i14 = this.f5922g;
        int i15 = i14 + i13;
        int i16 = this.f5920e;
        if (i15 <= i16) {
            throw new IllegalStateException(AbstractC2875y.m8296i(i13, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i17 = this.f5924i;
        if (i13 <= (Integer.MAX_VALUE - i17) - i14 && i17 + i14 + i13 <= this.f5925j) {
            byte[] bArr = this.f5919d;
            if (i14 > 0) {
                if (i16 > i14) {
                    System.arraycopy(bArr, i14, bArr, 0, i16 - i14);
                }
                this.f5924i += i14;
                this.f5920e -= i14;
                this.f5922g = 0;
            }
            int i18 = this.f5920e;
            try {
                int i19 = inputStream.read(bArr, i18, Math.min(bArr.length - i18, (Integer.MAX_VALUE - this.f5924i) - i18));
                if (i19 == 0 || i19 < -1 || i19 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i19 + "\nThe InputStream implementation is buggy.");
                }
                if (i19 > 0) {
                    this.f5920e += i19;
                    m4402S();
                    if (this.f5920e >= i13) {
                        return true;
                    }
                    return m4405V(i13);
                }
            } catch (InvalidProtocolBufferException e5) {
                e5.f5862w = true;
                throw e5;
            }
        }
        return false;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: e */
    public final void mo4372e(int i13) throws InvalidProtocolBufferException {
        if (this.f5923h != i13) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: j */
    public final int mo4373j() {
        return this.f5924i + this.f5922g;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: k */
    public final boolean mo4374k() {
        return this.f5922g == this.f5920e && !m4405V(1);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: m */
    public final void mo4375m(int i13) {
        this.f5925j = i13;
        m4402S();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: q */
    public final int mo4376q(int i13) throws InvalidProtocolBufferException {
        if (i13 < 0) {
            throw InvalidProtocolBufferException.m4265e();
        }
        int i14 = this.f5924i + this.f5922g + i13;
        if (i14 < 0) {
            throw InvalidProtocolBufferException.m4266f();
        }
        int i15 = this.f5925j;
        if (i14 > i15) {
            throw InvalidProtocolBufferException.m4267g();
        }
        this.f5925j = i14;
        m4402S();
        return i15;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: s */
    public final boolean mo4377s() {
        return m4400Q() != 0;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: t */
    public final C1388h mo4378t() throws IOException {
        int iM4399P = m4399P();
        int i13 = this.f5920e;
        int i14 = this.f5922g;
        int i15 = i13 - i14;
        byte[] bArr = this.f5919d;
        if (iM4399P <= i15 && iM4399P > 0) {
            C1388h c1388hM4353d = AbstractC1391i.m4353d(bArr, i14, iM4399P);
            this.f5922g += iM4399P;
            return c1388hM4353d;
        }
        if (iM4399P == 0) {
            return AbstractC1391i.f5905x;
        }
        if (iM4399P < 0) {
            throw InvalidProtocolBufferException.m4265e();
        }
        byte[] bArrM4395L = m4395L(iM4399P);
        if (bArrM4395L != null) {
            return AbstractC1391i.m4353d(bArrM4395L, 0, bArrM4395L.length);
        }
        int i16 = this.f5922g;
        int i17 = this.f5920e;
        int length = i17 - i16;
        this.f5924i += i17;
        this.f5922g = 0;
        this.f5920e = 0;
        ArrayList<byte[]> arrayListM4396M = m4396M(iM4399P - length);
        byte[] bArr2 = new byte[iM4399P];
        System.arraycopy(bArr, i16, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM4396M) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C1388h c1388h = AbstractC1391i.f5905x;
        return new C1388h(bArr2);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: u */
    public final double mo4379u() {
        return Double.longBitsToDouble(m4398O());
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: v */
    public final int mo4380v() {
        return m4399P();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: w */
    public final int mo4381w() {
        return m4397N();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: x */
    public final long mo4382x() {
        return m4398O();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: y */
    public final float mo4383y() {
        return Float.intBitsToFloat(m4397N());
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC1400l
    /* JADX INFO: renamed from: z */
    public final int mo4384z() {
        return m4399P();
    }
}
