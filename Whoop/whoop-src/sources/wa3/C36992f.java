package wa3;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import p031b9.AbstractC2875y;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: renamed from: wa3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C36992f {

    /* JADX INFO: renamed from: c */
    public int f158327c;

    /* JADX INFO: renamed from: e */
    public final InputStream f158329e;

    /* JADX INFO: renamed from: f */
    public int f158330f;

    /* JADX INFO: renamed from: i */
    public int f158333i;

    /* JADX INFO: renamed from: h */
    public int f158332h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a */
    public final byte[] f158325a = new byte[4096];

    /* JADX INFO: renamed from: b */
    public int f158326b = 0;

    /* JADX INFO: renamed from: d */
    public int f158328d = 0;

    /* JADX INFO: renamed from: g */
    public int f158331g = 0;

    public C36992f(InputStream inputStream) {
        this.f158329e = inputStream;
    }

    /* JADX INFO: renamed from: a */
    public final void m118755a(int i13) {
        if (this.f158330f != i13) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m118756b() {
        if (this.f158333i >= 64) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m118757c() {
        int i13 = this.f158332h;
        if (i13 == Integer.MAX_VALUE) {
            return -1;
        }
        return i13 - (this.f158331g + this.f158328d);
    }

    /* JADX INFO: renamed from: d */
    public final void m118758d(int i13) {
        this.f158332h = i13;
        m118770p();
    }

    /* JADX INFO: renamed from: e */
    public final int m118759e(int i13) {
        if (i13 < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.f158331g + this.f158328d + i13;
        int i15 = this.f158332h;
        if (i14 > i15) {
            throw InvalidProtocolBufferException.m65783b();
        }
        this.f158332h = i14;
        m118770p();
        return i15;
    }

    /* JADX INFO: renamed from: f */
    public final C37018u m118760f() {
        int iM118766l = m118766l();
        int i13 = this.f158326b;
        int i14 = this.f158328d;
        if (iM118766l > i13 - i14 || iM118766l <= 0) {
            return iM118766l == 0 ? AbstractC36990e.f158321w : new C37018u(m118763i(iM118766l));
        }
        byte[] bArr = new byte[iM118766l];
        System.arraycopy(this.f158325a, i14, bArr, 0, iM118766l);
        C37018u c37018u = new C37018u(bArr);
        this.f158328d += iM118766l;
        return c37018u;
    }

    /* JADX INFO: renamed from: g */
    public final int m118761g() {
        return m118766l();
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC37019v m118762h(InterfaceC37021x interfaceC37021x, C36998i c36998i) {
        int iM118766l = m118766l();
        m118756b();
        int iM118759e = m118759e(iM118766l);
        this.f158333i++;
        InterfaceC37019v interfaceC37019v = (InterfaceC37019v) interfaceC37021x.mo92259a(this, c36998i);
        m118755a(0);
        this.f158333i--;
        m118758d(iM118759e);
        return interfaceC37019v;
    }

    /* JADX INFO: renamed from: i */
    public final byte[] m118763i(int i13) throws IOException {
        if (i13 <= 0) {
            if (i13 == 0) {
                return AbstractC37015r.f158384a;
            }
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.f158331g;
        int i15 = this.f158328d;
        int i16 = i14 + i15 + i13;
        int i17 = this.f158332h;
        if (i16 > i17) {
            m118773s((i17 - i14) - i15);
            throw InvalidProtocolBufferException.m65783b();
        }
        byte[] bArr = this.f158325a;
        if (i13 < 4096) {
            byte[] bArr2 = new byte[i13];
            int i18 = this.f158326b - i15;
            System.arraycopy(bArr, i15, bArr2, 0, i18);
            this.f158328d = this.f158326b;
            int i19 = i13 - i18;
            if (i19 > 0) {
                m118771q(i19);
            }
            System.arraycopy(bArr, 0, bArr2, i18, i19);
            this.f158328d = i19;
            return bArr2;
        }
        int i24 = this.f158326b;
        this.f158331g = i14 + i24;
        this.f158328d = 0;
        this.f158326b = 0;
        int length = i24 - i15;
        int i25 = i13 - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i25 > 0) {
            int iMin = Math.min(i25, 4096);
            byte[] bArr3 = new byte[iMin];
            int i26 = 0;
            while (i26 < iMin) {
                int i27 = this.f158329e.read(bArr3, i26, iMin - i26);
                if (i27 == -1) {
                    throw InvalidProtocolBufferException.m65783b();
                }
                this.f158331g += i27;
                i26 += i27;
            }
            i25 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i13];
        System.arraycopy(bArr, i15, bArr4, 0, length);
        for (byte[] bArr5 : arrayList) {
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    /* JADX INFO: renamed from: j */
    public final int m118764j() throws InvalidProtocolBufferException {
        int i13 = this.f158328d;
        if (this.f158326b - i13 < 4) {
            m118771q(4);
            i13 = this.f158328d;
        }
        this.f158328d = i13 + 4;
        byte[] bArr = this.f158325a;
        return ((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: k */
    public final long m118765k() throws InvalidProtocolBufferException {
        int i13 = this.f158328d;
        if (this.f158326b - i13 < 8) {
            m118771q(8);
            i13 = this.f158328d;
        }
        this.f158328d = i13 + 8;
        byte[] bArr = this.f158325a;
        return ((((long) bArr[i13 + 7]) & 255) << 56) | (((long) bArr[i13]) & 255) | ((((long) bArr[i13 + 1]) & 255) << 8) | ((((long) bArr[i13 + 2]) & 255) << 16) | ((((long) bArr[i13 + 3]) & 255) << 24) | ((((long) bArr[i13 + 4]) & 255) << 32) | ((((long) bArr[i13 + 5]) & 255) << 40) | ((((long) bArr[i13 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: l */
    public final int m118766l() {
        int i13;
        int i14 = this.f158328d;
        int i15 = this.f158326b;
        if (i15 != i14) {
            int i16 = i14 + 1;
            byte[] bArr = this.f158325a;
            byte b = bArr[i14];
            if (b >= 0) {
                this.f158328d = i16;
                return b;
            }
            if (i15 - i16 >= 9) {
                int i17 = i14 + 2;
                int i18 = (bArr[i16] << 7) ^ b;
                long j7 = i18;
                if (j7 < 0) {
                    i13 = (int) ((-128) ^ j7);
                } else {
                    int i19 = i14 + 3;
                    int i24 = (bArr[i17] << 14) ^ i18;
                    long j13 = i24;
                    if (j13 >= 0) {
                        i13 = (int) (16256 ^ j13);
                    } else {
                        int i25 = i14 + 4;
                        int i26 = i24 ^ (bArr[i19] << 21);
                        long j14 = i26;
                        if (j14 < 0) {
                            i13 = (int) ((-2080896) ^ j14);
                        } else {
                            i19 = i14 + 5;
                            byte b6 = bArr[i25];
                            int i27 = (int) (((long) (i26 ^ (b6 << 28))) ^ 266354560);
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
                this.f158328d = i17;
                return i13;
            }
        }
        return (int) m118768n();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
    
        if (r3[r2] < 0) goto L39;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m118767m() {
        /*
            r12 = this;
            int r0 = r12.f158328d
            int r1 = r12.f158326b
            if (r1 != r0) goto L8
            goto Lb8
        L8:
            int r2 = r0 + 1
            byte[] r3 = r12.f158325a
            r4 = r3[r0]
            if (r4 < 0) goto L14
            r12.f158328d = r2
            long r0 = (long) r4
            return r0
        L14:
            int r1 = r1 - r2
            r5 = 9
            if (r1 >= r5) goto L1b
            goto Lb8
        L1b:
            int r1 = r0 + 2
            r2 = r3[r2]
            int r2 = r2 << 7
            r2 = r2 ^ r4
            long r4 = (long) r2
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L2e
            r2 = -128(0xffffffffffffff80, double:NaN)
        L2b:
            long r2 = r2 ^ r4
            goto Lc1
        L2e:
            int r2 = r0 + 3
            r1 = r3[r1]
            int r1 = r1 << 14
            long r8 = (long) r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L42
            r0 = 16256(0x3f80, double:8.0315E-320)
        L3c:
            long r0 = r0 ^ r4
            r10 = r0
            r1 = r2
            r2 = r10
            goto Lc1
        L42:
            int r1 = r0 + 4
            r2 = r3[r2]
            int r2 = r2 << 21
            long r8 = (long) r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L52
            r2 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L2b
        L52:
            int r2 = r0 + 5
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 28
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L63
            r0 = 266354560(0xfe03f80, double:1.315966377E-315)
            goto L3c
        L63:
            int r1 = r0 + 6
            r2 = r3[r2]
            long r8 = (long) r2
            r2 = 35
            long r8 = r8 << r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L76
            r2 = -34093383808(0xfffffff80fe03f80, double:NaN)
            goto L2b
        L76:
            int r2 = r0 + 7
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 42
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L89
            r0 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L3c
        L89:
            int r1 = r0 + 8
            r2 = r3[r2]
            long r8 = (long) r2
            r2 = 49
            long r8 = r8 << r2
            long r4 = r4 ^ r8
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L9c
            r2 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L2b
        L9c:
            int r2 = r0 + 9
            r1 = r3[r1]
            long r8 = (long) r1
            r1 = 56
            long r8 = r8 << r1
            long r4 = r4 ^ r8
            r8 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r4 = r4 ^ r8
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 >= 0) goto Lbf
            int r1 = r0 + 10
            r0 = r3[r2]
            long r2 = (long) r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto Lbd
        Lb8:
            long r0 = r12.m118768n()
            return r0
        Lbd:
            r2 = r4
            goto Lc1
        Lbf:
            r1 = r2
            goto Lbd
        Lc1:
            r12.f158328d = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wa3.C36992f.m118767m():long");
    }

    /* JADX INFO: renamed from: n */
    public final long m118768n() throws InvalidProtocolBufferException {
        long j7 = 0;
        for (int i13 = 0; i13 < 64; i13 += 7) {
            if (this.f158328d == this.f158326b) {
                m118771q(1);
            }
            int i14 = this.f158328d;
            this.f158328d = i14 + 1;
            byte b = this.f158325a[i14];
            j7 |= ((long) (b & 127)) << i13;
            if ((b & 128) == 0) {
                return j7;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: o */
    public final int m118769o() throws InvalidProtocolBufferException {
        if (this.f158328d == this.f158326b && !m118774t(1)) {
            this.f158330f = 0;
            return 0;
        }
        int iM118766l = m118766l();
        this.f158330f = iM118766l;
        if ((iM118766l >>> 3) != 0) {
            return iM118766l;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: p */
    public final void m118770p() {
        int i13 = this.f158326b + this.f158327c;
        this.f158326b = i13;
        int i14 = this.f158331g + i13;
        int i15 = this.f158332h;
        if (i14 <= i15) {
            this.f158327c = 0;
            return;
        }
        int i16 = i14 - i15;
        this.f158327c = i16;
        this.f158326b = i13 - i16;
    }

    /* JADX INFO: renamed from: q */
    public final void m118771q(int i13) throws InvalidProtocolBufferException {
        if (!m118774t(i13)) {
            throw InvalidProtocolBufferException.m65783b();
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m118772r(int i13, C36994g c36994g) throws IOException {
        boolean zM118772r;
        int i14 = i13 & 7;
        if (i14 == 0) {
            long jM118767m = m118767m();
            c36994g.m118797v(i13);
            c36994g.m118798w(jM118767m);
            return true;
        }
        if (i14 == 1) {
            long jM118765k = m118765k();
            c36994g.m118797v(i13);
            c36994g.m118796u(jM118765k);
            return true;
        }
        if (i14 == 2) {
            C37018u c37018uM118760f = m118760f();
            c36994g.m118797v(i13);
            c36994g.m118797v(c37018uM118760f.size());
            c36994g.m118793r(c37018uM118760f);
            return true;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                return false;
            }
            if (i14 != 5) {
                throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
            }
            int iM118764j = m118764j();
            c36994g.m118797v(i13);
            c36994g.m118795t(iM118764j);
            return true;
        }
        c36994g.m118797v(i13);
        do {
            int iM118769o = m118769o();
            if (iM118769o == 0) {
                break;
            }
            m118756b();
            this.f158333i++;
            zM118772r = m118772r(iM118769o, c36994g);
            this.f158333i--;
        } while (zM118772r);
        int i15 = ((i13 >>> 3) << 3) | 4;
        m118755a(i15);
        c36994g.m118797v(i15);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final void m118773s(int i13) throws InvalidProtocolBufferException {
        int i14 = this.f158326b;
        int i15 = this.f158328d;
        int i16 = i14 - i15;
        if (i13 <= i16 && i13 >= 0) {
            this.f158328d = i15 + i13;
            return;
        }
        if (i13 < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i17 = this.f158331g;
        int i18 = i17 + i15 + i13;
        int i19 = this.f158332h;
        if (i18 > i19) {
            m118773s((i19 - i17) - i15);
            throw InvalidProtocolBufferException.m65783b();
        }
        this.f158328d = i14;
        m118771q(1);
        while (true) {
            int i24 = i13 - i16;
            int i25 = this.f158326b;
            if (i24 <= i25) {
                this.f158328d = i24;
                return;
            } else {
                i16 += i25;
                this.f158328d = i25;
                m118771q(1);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m118774t(int i13) throws IOException {
        InputStream inputStream;
        int i14 = this.f158328d;
        int i15 = i14 + i13;
        int i16 = this.f158326b;
        if (i15 <= i16) {
            throw new IllegalStateException(AbstractC2875y.m8296i(i13, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        if (this.f158331g + i14 + i13 <= this.f158332h && (inputStream = this.f158329e) != null) {
            byte[] bArr = this.f158325a;
            if (i14 > 0) {
                if (i16 > i14) {
                    System.arraycopy(bArr, i14, bArr, 0, i16 - i14);
                }
                this.f158331g += i14;
                this.f158326b -= i14;
                this.f158328d = 0;
            }
            int i17 = this.f158326b;
            int i18 = inputStream.read(bArr, i17, bArr.length - i17);
            if (i18 == 0 || i18 < -1 || i18 > bArr.length) {
                throw new IllegalStateException(AbstractC2875y.m8296i(i18, "InputStream#read(byte[]) returned invalid result: ", "\nThe InputStream implementation is buggy."));
            }
            if (i18 > 0) {
                this.f158326b += i18;
                if ((this.f158331g + i13) - 67108864 > 0) {
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                m118770p();
                if (this.f158326b >= i13) {
                    return true;
                }
                return m118774t(i13);
            }
        }
        return false;
    }
}
