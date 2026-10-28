package p002a0;

import m83.AbstractC25260n;
import p024b0.AbstractC2177a;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: a0.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0023g0 extends AbstractC0050s {

    /* JADX INFO: renamed from: f */
    public int f54f;

    public C0023g0(int i13) {
        this.f148a = AbstractC0015d1.f36a;
        this.f149b = AbstractC0054u.f166a;
        this.f150c = AbstractC2177a.f8659c;
        if (i13 >= 0) {
            m49f(AbstractC0015d1.m19d(i13));
        } else {
            AbstractC34924m.m110133O("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m46c() {
        this.f152e = 0;
        long[] jArr = this.f148a;
        if (jArr != AbstractC0015d1.f36a) {
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f148a;
            int i13 = this.f151d;
            int i14 = i13 >> 3;
            long j7 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j7)) | j7;
        }
        AbstractC25260n.m74073n0(0, this.f151d, null, this.f150c);
        this.f54f = AbstractC0015d1.m16a(this.f151d) - this.f152e;
    }

    /* JADX INFO: renamed from: d */
    public final int m47d(int i13) {
        long j7;
        long j13;
        int i14;
        long j14;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        int i15 = -862048943;
        int iHashCode = Integer.hashCode(i13) * (-862048943);
        int i16 = iHashCode ^ (iHashCode << 16);
        int i17 = i16 >>> 7;
        int i18 = i16 & 127;
        int i19 = this.f151d;
        int i24 = i17 & i19;
        int i25 = 0;
        while (true) {
            long[] jArr2 = this.f148a;
            int i26 = i24 >> 3;
            int i27 = (i24 & 7) << 3;
            int i28 = 1;
            long j15 = ((jArr2[i26 + 1] << (64 - i27)) & ((-i27) >> 63)) | (jArr2[i26] >>> i27);
            long j16 = i18;
            int i29 = i25;
            int i34 = 0;
            long j17 = j15 ^ (j16 * 72340172838076673L);
            long j18 = (~j17) & (j17 - 72340172838076673L) & (-9187201950435737472L);
            while (j18 != 0) {
                int iNumberOfTrailingZeros = (i24 + (Long.numberOfTrailingZeros(j18) >> 3)) & i19;
                int i35 = i15;
                int i36 = i34;
                if (this.f149b[iNumberOfTrailingZeros] == i13) {
                    return iNumberOfTrailingZeros;
                }
                j18 &= j18 - 1;
                i15 = i35;
                i34 = i36;
            }
            int i37 = i15;
            int i38 = i34;
            if ((((~j15) << 6) & j15 & (-9187201950435737472L)) != 0) {
                int iM48e = m48e(i17);
                long j19 = 255;
                if (this.f54f != 0 || ((this.f148a[iM48e >> 3] >> ((iM48e & 7) << 3)) & 255) == 254) {
                    j7 = 255;
                    j13 = j16;
                    i14 = 1;
                    j14 = 128;
                } else {
                    int i39 = this.f151d;
                    if (i39 > 8) {
                        j14 = 128;
                        if (Long.compareUnsigned(((long) this.f152e) * 32, ((long) i39) * 25) <= 0) {
                            long[] jArr3 = this.f148a;
                            int i44 = this.f151d;
                            int[] iArr2 = this.f149b;
                            Object[] objArr2 = this.f150c;
                            int i45 = (i44 + 7) >> 3;
                            int i46 = i38;
                            while (i46 < i45) {
                                long j24 = j19;
                                long j25 = jArr3[i46] & (-9187201950435737472L);
                                jArr3[i46] = (-72340172838076674L) & ((~j25) + (j25 >>> 7));
                                i46++;
                                j16 = j16;
                                j19 = j24;
                            }
                            j7 = j19;
                            j13 = j16;
                            int iM74081v0 = AbstractC25260n.m74081v0(jArr3);
                            int i47 = iM74081v0 - 1;
                            long j26 = 72057594037927935L;
                            jArr3[i47] = (jArr3[i47] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iM74081v0] = jArr3[i38];
                            int i48 = i38;
                            while (i48 != i44) {
                                int i49 = i48 >> 3;
                                int i54 = (i48 & 7) << 3;
                                long j27 = (jArr3[i49] >> i54) & j7;
                                if (j27 != 128 && j27 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i48]) * i37;
                                    int i55 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i56 = i55 >>> 7;
                                    int iM48e2 = m48e(i56);
                                    int i57 = i56 & i44;
                                    if (((iM48e2 - i57) & i44) / 8 == ((i48 - i57) & i44) / 8) {
                                        long j28 = j26;
                                        jArr3[i49] = (((long) (i55 & 127)) << i54) | ((~(j7 << i54)) & jArr3[i49]);
                                        jArr3[jArr3.length - i28] = (jArr3[i38] & j28) | Long.MIN_VALUE;
                                        i48++;
                                        j26 = j28;
                                    } else {
                                        long j29 = j26;
                                        int i58 = iM48e2 >> 3;
                                        long j34 = jArr3[i58];
                                        int i59 = (iM48e2 & 7) << 3;
                                        if (((j34 >> i59) & j7) == 128) {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr3[i58] = ((~(j7 << i59)) & j34) | (((long) (i55 & 127)) << i59);
                                            jArr3[i49] = (jArr3[i49] & (~(j7 << i54))) | (128 << i54);
                                            iArr[iM48e2] = iArr[i48];
                                            iArr[i48] = i38;
                                            objArr[iM48e2] = objArr[i48];
                                            objArr[i48] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr3[i58] = (((long) (i55 & 127)) << i59) | ((~(j7 << i59)) & j34);
                                            int i64 = iArr[iM48e2];
                                            iArr[iM48e2] = iArr[i48];
                                            iArr[i48] = i64;
                                            Object obj = objArr[iM48e2];
                                            objArr[iM48e2] = objArr[i48];
                                            objArr[i48] = obj;
                                            i48--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i38] & j29) | Long.MIN_VALUE;
                                        i48++;
                                        j26 = j29;
                                        i28 = i28;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i48++;
                                }
                            }
                            i14 = i28;
                            this.f54f = AbstractC0015d1.m16a(this.f151d) - this.f152e;
                        }
                        iM48e = m48e(i17);
                    } else {
                        j14 = 128;
                    }
                    j7 = 255;
                    j13 = j16;
                    i14 = 1;
                    int iM17b = AbstractC0015d1.m17b(this.f151d);
                    long[] jArr4 = this.f148a;
                    int[] iArr3 = this.f149b;
                    Object[] objArr3 = this.f150c;
                    int i65 = this.f151d;
                    m49f(iM17b);
                    long[] jArr5 = this.f148a;
                    int[] iArr4 = this.f149b;
                    Object[] objArr4 = this.f150c;
                    int i66 = this.f151d;
                    int i67 = i38;
                    while (i67 < i65) {
                        if (((jArr4[i67 >> 3] >> ((i67 & 7) << 3)) & 255) < j14) {
                            int i68 = iArr3[i67];
                            int iHashCode3 = Integer.hashCode(i68) * i37;
                            int i69 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM48e3 = m48e(i69 >>> 7);
                            long j35 = i69 & 127;
                            int i74 = iM48e3 >> 3;
                            int i75 = (iM48e3 & 7) << 3;
                            jArr = jArr5;
                            long j36 = (jArr5[i74] & (~(255 << i75))) | (j35 << i75);
                            jArr[i74] = j36;
                            jArr[(((iM48e3 - 7) & i66) + (i66 & 7)) >> 3] = j36;
                            iArr4[iM48e3] = i68;
                            objArr4[iM48e3] = objArr3[i67];
                        } else {
                            jArr = jArr5;
                        }
                        i67++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iM48e = m48e(i17);
                }
                this.f152e++;
                int i76 = this.f54f;
                long[] jArr6 = this.f148a;
                int i77 = iM48e >> 3;
                long j37 = jArr6[i77];
                int i78 = (iM48e & 7) << 3;
                if (((j37 >> i78) & j7) != j14) {
                    i14 = i38;
                }
                this.f54f = i76 - i14;
                int i79 = this.f151d;
                long j38 = (j37 & (~(j7 << i78))) | (j13 << i78);
                jArr6[i77] = j38;
                jArr6[(((iM48e - 7) & i79) + (i79 & 7)) >> 3] = j38;
                return iM48e;
            }
            i25 = i29 + 8;
            i24 = (i24 + i25) & i19;
            i15 = i37;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m48e(int i13) {
        int i14 = this.f151d;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f148a;
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

    /* JADX INFO: renamed from: f */
    public final void m49f(int i13) {
        long[] jArr;
        int iMax = i13 > 0 ? Math.max(7, AbstractC0015d1.m18c(i13)) : 0;
        this.f151d = iMax;
        if (iMax == 0) {
            jArr = AbstractC0015d1.f36a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
        }
        this.f148a = jArr;
        int i14 = iMax >> 3;
        long j7 = 255 << ((iMax & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j7)) | j7;
        this.f54f = AbstractC0015d1.m16a(this.f151d) - this.f152e;
        this.f149b = new int[iMax];
        this.f150c = new Object[iMax];
    }

    /* JADX INFO: renamed from: g */
    public final Object m50g(int i13) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i13) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f151d;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f148a;
            int i19 = i17 >> 3;
            int i24 = (i17 & 7) << 3;
            long j7 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j13 = (((long) i15) * 72340172838076673L) ^ j7;
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i17) & i16;
                if (this.f149b[iNumberOfTrailingZeros] == i13) {
                    break loop0;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f152e--;
        long[] jArr2 = this.f148a;
        int i25 = this.f151d;
        int i26 = iNumberOfTrailingZeros >> 3;
        int i27 = (iNumberOfTrailingZeros & 7) << 3;
        long j15 = (jArr2[i26] & (~(255 << i27))) | (254 << i27);
        jArr2[i26] = j15;
        jArr2[(((iNumberOfTrailingZeros - 7) & i25) + (i25 & 7)) >> 3] = j15;
        Object[] objArr = this.f150c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public final void m51h(int i13, Object obj) {
        int iM47d = m47d(i13);
        this.f149b[iM47d] = i13;
        this.f150c[iM47d] = obj;
    }

    public /* synthetic */ C0023g0() {
        this(6);
    }
}
