package p002a0;

import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: a0.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0029i0 {

    /* JADX INFO: renamed from: a */
    public long[] f74a = AbstractC0015d1.f36a;

    /* JADX INFO: renamed from: b */
    public long[] f75b = AbstractC0060x.f182a;

    /* JADX INFO: renamed from: c */
    public int[] f76c = AbstractC0054u.f166a;

    /* JADX INFO: renamed from: d */
    public int f77d;

    /* JADX INFO: renamed from: e */
    public int f78e;

    /* JADX INFO: renamed from: f */
    public int f79f;

    public C0029i0(int i13) {
        if (i13 >= 0) {
            m74d(AbstractC0015d1.m19d(i13));
        } else {
            AbstractC34924m.m110133O("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m71a(int i13) {
        int i14 = this.f77d;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f74a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j7 = ((jArr[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr[i17] >>> i18);
            long j13 = j7 & ((~j7) << 7) & (-9187201950435737472L);
            if (j13 != 0) {
                return (i15 + (Long.numberOfTrailingZeros(j13) >> 3)) & i14;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m72b(long j7) {
        int iHashCode = Long.hashCode(j7) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f77d;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        while (true) {
            long[] jArr = this.f74a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j13 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j14 = (((long) i14) * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i16) & i15;
                if (this.f75b[iNumberOfTrailingZeros] == j7) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m73c(long j7) {
        int iM72b = m72b(j7);
        if (iM72b >= 0) {
            return this.f76c[iM72b];
        }
        AbstractC34924m.m110136R("Cannot find value for key " + j7);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final void m74d(int i13) {
        long[] jArr;
        int iMax = i13 > 0 ? Math.max(7, AbstractC0015d1.m18c(i13)) : 0;
        this.f77d = iMax;
        if (iMax == 0) {
            jArr = AbstractC0015d1.f36a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
        }
        this.f74a = jArr;
        int i14 = iMax >> 3;
        long j7 = 255 << ((iMax & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j7)) | j7;
        this.f79f = AbstractC0015d1.m16a(this.f77d) - this.f78e;
        this.f75b = new long[iMax];
        this.f76c = new int[iMax];
    }

    /* JADX INFO: renamed from: e */
    public final void m75e(int i13, long j7) {
        long j13;
        long j14;
        int i14;
        int i15;
        long j15;
        int i16;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int i17 = -862048943;
        int iHashCode = Long.hashCode(j7) * (-862048943);
        int i18 = iHashCode ^ (iHashCode << 16);
        int i19 = i18 >>> 7;
        int i24 = i18 & 127;
        int i25 = this.f77d;
        int i26 = i19 & i25;
        int i27 = 0;
        loop0: while (true) {
            long[] jArr3 = this.f74a;
            int i28 = i26 >> 3;
            int i29 = (i26 & 7) << 3;
            int i34 = 1;
            long j16 = ((jArr3[i28 + 1] << (64 - i29)) & ((-i29) >> 63)) | (jArr3[i28] >>> i29);
            long j17 = i24;
            int i35 = i27;
            int i36 = 0;
            long j18 = j16 ^ (j17 * 72340172838076673L);
            long j19 = (~j18) & (j18 - 72340172838076673L) & (-9187201950435737472L);
            while (j19 != 0) {
                int iNumberOfTrailingZeros = (i26 + (Long.numberOfTrailingZeros(j19) >> 3)) & i25;
                int i37 = i17;
                if (this.f75b[iNumberOfTrailingZeros] == j7) {
                    i16 = iNumberOfTrailingZeros;
                    break loop0;
                } else {
                    j19 &= j19 - 1;
                    i17 = i37;
                }
            }
            int i38 = i17;
            if ((((~j16) << 6) & j16 & (-9187201950435737472L)) != 0) {
                int iM71a = m71a(i19);
                if (this.f79f != 0 || ((this.f74a[iM71a >> 3] >> ((iM71a & 7) << 3)) & 255) == 254) {
                    j13 = 255;
                    j14 = j17;
                    i14 = 0;
                    i15 = 1;
                    j15 = 128;
                } else {
                    int i39 = this.f77d;
                    if (i39 > 8) {
                        j15 = 128;
                        if (Long.compareUnsigned(((long) this.f78e) * 32, ((long) i39) * 25) <= 0) {
                            long[] jArr4 = this.f74a;
                            int i44 = this.f77d;
                            long[] jArr5 = this.f75b;
                            int[] iArr2 = this.f76c;
                            int i45 = (i44 + 7) >> 3;
                            j13 = 255;
                            int i46 = 0;
                            while (i46 < i45) {
                                long j24 = jArr4[i46] & (-9187201950435737472L);
                                jArr4[i46] = (-72340172838076674L) & ((~j24) + (j24 >>> 7));
                                i46++;
                                i34 = i34;
                                i36 = i36;
                                j17 = j17;
                            }
                            j14 = j17;
                            i14 = i36;
                            int i47 = i34;
                            char c3 = 7;
                            int iM74081v0 = AbstractC25260n.m74081v0(jArr4);
                            int i48 = iM74081v0 - 1;
                            long j25 = 72057594037927935L;
                            jArr4[i48] = (jArr4[i48] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM74081v0] = jArr4[i14];
                            int i49 = i14;
                            while (i49 != i44) {
                                int i54 = i49 >> 3;
                                int i55 = (i49 & 7) << 3;
                                long j26 = (jArr4[i54] >> i55) & 255;
                                if (j26 != 128 && j26 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr5[i49]) * i38;
                                    int i56 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i57 = i56 >>> 7;
                                    int iM71a2 = m71a(i57);
                                    int i58 = i57 & i44;
                                    char c7 = c3;
                                    if (((iM71a2 - i58) & i44) / 8 == ((i49 - i58) & i44) / 8) {
                                        int i59 = i47;
                                        long j27 = j25;
                                        jArr4[i54] = (((long) (i56 & 127)) << i55) | (jArr4[i54] & (~(255 << i55)));
                                        jArr4[jArr4.length - i59] = (jArr4[i14] & j27) | Long.MIN_VALUE;
                                        i49++;
                                        i47 = i59;
                                        c3 = c7;
                                        j25 = j27;
                                    } else {
                                        int i64 = i47;
                                        long j28 = j25;
                                        int i65 = iM71a2 >> 3;
                                        long j29 = jArr4[i65];
                                        int i66 = (iM71a2 & 7) << 3;
                                        if (((j29 >> i66) & 255) == 128) {
                                            jArr2 = jArr5;
                                            iArr = iArr2;
                                            jArr4[i65] = (j29 & (~(255 << i66))) | (((long) (i56 & 127)) << i66);
                                            jArr4[i54] = (jArr4[i54] & (~(255 << i55))) | (128 << i55);
                                            jArr2[iM71a2] = jArr2[i49];
                                            jArr2[i49] = 0;
                                            iArr[iM71a2] = iArr[i49];
                                            iArr[i49] = i14;
                                        } else {
                                            iArr = iArr2;
                                            jArr2 = jArr5;
                                            jArr4[i65] = (((long) (i56 & 127)) << i66) | (j29 & (~(255 << i66)));
                                            long j34 = jArr2[iM71a2];
                                            jArr2[iM71a2] = jArr2[i49];
                                            jArr2[i49] = j34;
                                            int i67 = iArr[iM71a2];
                                            iArr[iM71a2] = iArr[i49];
                                            iArr[i49] = i67;
                                            i49--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i14] & j28) | Long.MIN_VALUE;
                                        i49++;
                                        jArr5 = jArr2;
                                        i47 = i64;
                                        c3 = c7;
                                        j25 = j28;
                                        iArr2 = iArr;
                                    }
                                } else {
                                    i49++;
                                }
                            }
                            i15 = i47;
                            this.f79f = AbstractC0015d1.m16a(this.f77d) - this.f78e;
                        }
                        iM71a = m71a(i19);
                    } else {
                        j15 = 128;
                    }
                    j13 = 255;
                    j14 = j17;
                    i14 = 0;
                    i15 = 1;
                    int iM17b = AbstractC0015d1.m17b(this.f77d);
                    long[] jArr6 = this.f74a;
                    long[] jArr7 = this.f75b;
                    int[] iArr3 = this.f76c;
                    int i68 = this.f77d;
                    m74d(iM17b);
                    long[] jArr8 = this.f74a;
                    long[] jArr9 = this.f75b;
                    int[] iArr4 = this.f76c;
                    int i69 = this.f77d;
                    int i74 = 0;
                    while (i74 < i68) {
                        if (((jArr6[i74 >> 3] >> ((i74 & 7) << 3)) & 255) < j15) {
                            long j35 = jArr7[i74];
                            int iHashCode3 = Long.hashCode(j35) * i38;
                            int i75 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM71a3 = m71a(i75 >>> 7);
                            jArr = jArr8;
                            long j36 = i75 & 127;
                            int i76 = iM71a3 >> 3;
                            int i77 = (iM71a3 & 7) << 3;
                            long j37 = (jArr[i76] & (~(255 << i77))) | (j36 << i77);
                            jArr[i76] = j37;
                            jArr[(((iM71a3 - 7) & i69) + (i69 & 7)) >> 3] = j37;
                            jArr9[iM71a3] = j35;
                            iArr4[iM71a3] = iArr3[i74];
                        } else {
                            jArr = jArr8;
                        }
                        i74++;
                        jArr6 = jArr6;
                        jArr8 = jArr;
                    }
                    iM71a = m71a(i19);
                }
                this.f78e++;
                int i78 = this.f79f;
                long[] jArr10 = this.f74a;
                int i79 = iM71a >> 3;
                long j38 = jArr10[i79];
                int i83 = (iM71a & 7) << 3;
                if (((j38 >> i83) & j13) != j15) {
                    i15 = i14;
                }
                this.f79f = i78 - i15;
                int i84 = this.f77d;
                long j39 = (j38 & (~(j13 << i83))) | (j14 << i83);
                jArr10[i79] = j39;
                jArr10[(((iM71a - 7) & i84) + (i84 & 7)) >> 3] = j39;
                i16 = ~iM71a;
                break;
            }
            i27 = i35 + 8;
            i26 = (i26 + i27) & i25;
            i17 = i38;
        }
        if (i16 < 0) {
            i16 = ~i16;
        }
        this.f75b[i16] = j7;
        this.f76c[i16] = i13;
    }

    public final boolean equals(Object obj) {
        boolean z4;
        long[] jArr;
        long[] jArr2;
        boolean z13 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0029i0)) {
            return false;
        }
        C0029i0 c0029i0 = (C0029i0) obj;
        if (c0029i0.f78e != this.f78e) {
            return false;
        }
        long[] jArr3 = this.f75b;
        int[] iArr = this.f76c;
        long[] jArr4 = this.f74a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i13 = 0;
        loop0: while (true) {
            long j7 = jArr4[i13];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((255 & j7) < 128) {
                        int i16 = (i13 << 3) + i15;
                        jArr2 = jArr3;
                        long j13 = jArr2[i16];
                        int i17 = iArr[i16];
                        int iM72b = c0029i0.m72b(j13);
                        if (iM72b < 0 || i17 != c0029i0.f76c[iM72b]) {
                            break loop0;
                        }
                    } else {
                        jArr2 = jArr3;
                    }
                    j7 >>= 8;
                    i15++;
                    z13 = z13;
                    jArr3 = jArr2;
                }
                z4 = z13;
                jArr = jArr3;
                if (i14 != 8) {
                    return z4;
                }
            } else {
                z4 = z13;
                jArr = jArr3;
            }
            if (i13 == length) {
                return z4;
            }
            i13++;
            z13 = z4;
            jArr3 = jArr;
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f75b;
        int[] iArr = this.f76c;
        long[] jArr2 = this.f74a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i13 = 0;
        int iHashCode = 0;
        while (true) {
            long j7 = jArr2[i13];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j7) < 128) {
                        int i16 = (i13 << 3) + i15;
                        long j13 = jArr[i16];
                        iHashCode += Integer.hashCode(iArr[i16]) ^ Long.hashCode(j13);
                    }
                    j7 >>= 8;
                }
                if (i14 != 8) {
                    return iHashCode;
                }
            }
            if (i13 == length) {
                return iHashCode;
            }
            i13++;
        }
    }

    public final String toString() {
        int i13;
        int i14;
        if (this.f78e == 0) {
            return "{}";
        }
        StringBuilder sb4 = new StringBuilder("{");
        long[] jArr = this.f75b;
        int[] iArr = this.f76c;
        long[] jArr2 = this.f74a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i15 = 0;
            int i16 = 0;
            while (true) {
                long j7 = jArr2[i15];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i15 - length)) >>> 31);
                    int i18 = 0;
                    while (i18 < i17) {
                        if ((255 & j7) < 128) {
                            int i19 = (i15 << 3) + i18;
                            i14 = i15;
                            long j13 = jArr[i19];
                            int i24 = iArr[i19];
                            sb4.append(j13);
                            sb4.append("=");
                            sb4.append(i24);
                            i16++;
                            if (i16 < this.f78e) {
                                sb4.append(", ");
                            }
                        } else {
                            i14 = i15;
                        }
                        j7 >>= 8;
                        i18++;
                        i15 = i14;
                    }
                    int i25 = i15;
                    if (i17 != 8) {
                        break;
                    }
                    i13 = i25;
                } else {
                    i13 = i15;
                }
                if (i13 == length) {
                    break;
                }
                i15 = i13 + 1;
            }
        }
        sb4.append('}');
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }
}
