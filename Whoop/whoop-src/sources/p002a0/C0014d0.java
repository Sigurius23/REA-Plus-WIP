package p002a0;

import m83.AbstractC25260n;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: a0.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0014d0 extends AbstractC0040n {

    /* JADX INFO: renamed from: f */
    public int f35f;

    public C0014d0(int i13) {
        this.f120a = AbstractC0015d1.f36a;
        this.f121b = AbstractC0054u.f166a;
        this.f122c = AbstractC0036l.f105a;
        if (i13 >= 0) {
            m14c(AbstractC0015d1.m19d(i13));
        } else {
            AbstractC34924m.m110133O("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m13b(int i13) {
        int i14 = this.f123d;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f120a;
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

    /* JADX INFO: renamed from: c */
    public final void m14c(int i13) {
        long[] jArr;
        int iMax = i13 > 0 ? Math.max(7, AbstractC0015d1.m18c(i13)) : 0;
        this.f123d = iMax;
        if (iMax == 0) {
            jArr = AbstractC0015d1.f36a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
        }
        this.f120a = jArr;
        int i14 = iMax >> 3;
        long j7 = 255 << ((iMax & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j7)) | j7;
        this.f35f = AbstractC0015d1.m16a(this.f123d) - this.f124e;
        this.f121b = new int[iMax];
        this.f122c = new float[iMax];
    }

    /* JADX INFO: renamed from: d */
    public final void m15d(float f13, int i13) {
        long j7;
        long j13;
        int i14;
        int i15;
        long j14;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        float[] fArr;
        int i16 = i13;
        int i17 = -862048943;
        int iHashCode = Integer.hashCode(i16) * (-862048943);
        int i18 = iHashCode ^ (iHashCode << 16);
        int i19 = i18 >>> 7;
        int i24 = i18 & 127;
        int i25 = this.f123d;
        int i26 = i19 & i25;
        int i27 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f120a;
            int i28 = i26 >> 3;
            int i29 = (i26 & 7) << 3;
            int i34 = 1;
            int i35 = i27;
            int i36 = 0;
            long j15 = (((-i29) >> 63) & (jArr2[i28 + 1] << (64 - i29))) | (jArr2[i28] >>> i29);
            long j16 = i24;
            long j17 = j15 ^ (j16 * 72340172838076673L);
            long j18 = (j17 - 72340172838076673L) & (~j17) & (-9187201950435737472L);
            while (j18 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j18) >> 3) + i26) & i25;
                int i37 = i17;
                if (this.f121b[iNumberOfTrailingZeros] == i16) {
                    break loop0;
                }
                j18 &= j18 - 1;
                i17 = i37;
            }
            int i38 = i17;
            if ((j15 & ((~j15) << 6) & (-9187201950435737472L)) != 0) {
                int iM13b = m13b(i19);
                long j19 = 255;
                if (this.f35f != 0 || ((this.f120a[iM13b >> 3] >> ((iM13b & 7) << 3)) & 255) == 254) {
                    j7 = j16;
                    j13 = 255;
                    i14 = 1;
                    i15 = 0;
                    j14 = 128;
                } else {
                    int i39 = this.f123d;
                    if (i39 > 8) {
                        j14 = 128;
                        if (Long.compareUnsigned(((long) this.f124e) * 32, ((long) i39) * 25) <= 0) {
                            long[] jArr3 = this.f120a;
                            int i44 = this.f123d;
                            int[] iArr2 = this.f121b;
                            float[] fArr2 = this.f122c;
                            int i45 = (i44 + 7) >> 3;
                            int i46 = 0;
                            while (i46 < i45) {
                                long j24 = jArr3[i46] & (-9187201950435737472L);
                                jArr3[i46] = (-72340172838076674L) & ((~j24) + (j24 >>> 7));
                                i46++;
                                j19 = j19;
                                j16 = j16;
                            }
                            j7 = j16;
                            j13 = j19;
                            char c3 = 7;
                            int iM74081v0 = AbstractC25260n.m74081v0(jArr3);
                            int i47 = iM74081v0 - 1;
                            jArr3[i47] = (jArr3[i47] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iM74081v0] = jArr3[0];
                            int i48 = 0;
                            while (i48 != i44) {
                                int i49 = i48 >> 3;
                                int i54 = (i48 & 7) << 3;
                                long j25 = (jArr3[i49] >> i54) & j13;
                                if (j25 != 128 && j25 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i48]) * i38;
                                    int i55 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i56 = i55 >>> 7;
                                    int iM13b2 = m13b(i56);
                                    int i57 = i56 & i44;
                                    char c7 = c3;
                                    if (((iM13b2 - i57) & i44) / 8 == ((i48 - i57) & i44) / 8) {
                                        int i58 = i36;
                                        jArr3[i49] = (((long) (i55 & 127)) << i54) | (jArr3[i49] & (~(j13 << i54)));
                                        jArr3[jArr3.length - 1] = (jArr3[i58] & 72057594037927935L) | Long.MIN_VALUE;
                                        i48++;
                                        i34 = i34;
                                        c3 = c7;
                                        i36 = i58;
                                    } else {
                                        int i59 = i34;
                                        int i64 = i36;
                                        int i65 = iM13b2 >> 3;
                                        long j26 = jArr3[i65];
                                        int i66 = (iM13b2 & 7) << 3;
                                        if (((j26 >> i66) & j13) == 128) {
                                            iArr = iArr2;
                                            fArr = fArr2;
                                            jArr3[i65] = ((~(j13 << i66)) & j26) | (((long) (i55 & 127)) << i66);
                                            jArr3[i49] = (jArr3[i49] & (~(j13 << i54))) | (128 << i54);
                                            iArr[iM13b2] = iArr[i48];
                                            iArr[i48] = i64;
                                            fArr[iM13b2] = fArr[i48];
                                            fArr[i48] = 0.0f;
                                        } else {
                                            iArr = iArr2;
                                            fArr = fArr2;
                                            jArr3[i65] = (((long) (i55 & 127)) << i66) | ((~(j13 << i66)) & j26);
                                            int i67 = iArr[iM13b2];
                                            iArr[iM13b2] = iArr[i48];
                                            iArr[i48] = i67;
                                            float f14 = fArr[iM13b2];
                                            fArr[iM13b2] = fArr[i48];
                                            fArr[i48] = f14;
                                            i48--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i64] & 72057594037927935L) | Long.MIN_VALUE;
                                        i48++;
                                        i34 = i59;
                                        c3 = c7;
                                        i36 = i64;
                                        iArr2 = iArr;
                                        fArr2 = fArr;
                                    }
                                } else {
                                    i48++;
                                }
                            }
                            i14 = i34;
                            i15 = i36;
                            this.f35f = AbstractC0015d1.m16a(this.f123d) - this.f124e;
                        }
                        iM13b = m13b(i19);
                    } else {
                        j14 = 128;
                    }
                    j7 = j16;
                    j13 = 255;
                    i14 = 1;
                    i15 = 0;
                    int iM17b = AbstractC0015d1.m17b(this.f123d);
                    long[] jArr4 = this.f120a;
                    int[] iArr3 = this.f121b;
                    float[] fArr3 = this.f122c;
                    int i68 = this.f123d;
                    m14c(iM17b);
                    long[] jArr5 = this.f120a;
                    int[] iArr4 = this.f121b;
                    float[] fArr4 = this.f122c;
                    int i69 = this.f123d;
                    int i74 = 0;
                    while (i74 < i68) {
                        if (((jArr4[i74 >> 3] >> ((i74 & 7) << 3)) & 255) < j14) {
                            int i75 = iArr3[i74];
                            int iHashCode3 = Integer.hashCode(i75) * i38;
                            int i76 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM13b3 = m13b(i76 >>> 7);
                            jArr = jArr5;
                            long j27 = i76 & 127;
                            int i77 = iM13b3 >> 3;
                            int i78 = (iM13b3 & 7) << 3;
                            long j28 = (jArr[i77] & (~(255 << i78))) | (j27 << i78);
                            jArr[i77] = j28;
                            jArr[(((iM13b3 - 7) & i69) + (i69 & 7)) >> 3] = j28;
                            iArr4[iM13b3] = i75;
                            fArr4[iM13b3] = fArr3[i74];
                        } else {
                            jArr = jArr5;
                        }
                        i74++;
                        jArr5 = jArr;
                    }
                    iM13b = m13b(i19);
                }
                this.f124e++;
                int i79 = this.f35f;
                long[] jArr6 = this.f120a;
                int i83 = iM13b >> 3;
                long j29 = jArr6[i83];
                int i84 = (iM13b & 7) << 3;
                if (((j29 >> i84) & j13) == j14) {
                    i15 = i14;
                }
                this.f35f = i79 - i15;
                int i85 = this.f123d;
                long j34 = (j29 & (~(j13 << i84))) | (j7 << i84);
                jArr6[i83] = j34;
                jArr6[(((iM13b - 7) & i85) + (i85 & 7)) >> 3] = j34;
                iNumberOfTrailingZeros = ~iM13b;
                break;
            }
            i27 = i35 + 8;
            i26 = (i26 + i27) & i25;
            i16 = i13;
            i17 = i38;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.f121b[iNumberOfTrailingZeros] = i13;
        this.f122c[iNumberOfTrailingZeros] = f13;
    }
}
