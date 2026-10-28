package p002a0;

import java.util.Arrays;
import java.util.Collection;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p024b0.AbstractC2177a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.DurationKt;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: a0.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0049r0 {

    /* JADX INFO: renamed from: a */
    public long[] f140a = AbstractC0015d1.f36a;

    /* JADX INFO: renamed from: b */
    public Object[] f141b = AbstractC2177a.f8659c;

    /* JADX INFO: renamed from: c */
    public long[] f142c = AbstractC0064z.f202b;

    /* JADX INFO: renamed from: d */
    public int f143d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e */
    public int f144e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f */
    public int f145f;

    /* JADX INFO: renamed from: g */
    public int f146g;

    /* JADX INFO: renamed from: h */
    public int f147h;

    public C0049r0(int i13) {
        if (i13 >= 0) {
            m116f(AbstractC0015d1.m19d(i13));
        } else {
            AbstractC34924m.m110133O("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m111a(Object obj) {
        int i13 = this.f146g;
        int iM114d = m114d(obj);
        this.f141b[iM114d] = obj;
        long[] jArr = this.f142c;
        int i14 = this.f143d;
        jArr[iM114d] = (((long) i14) & 2147483647L) | 4611686016279904256L;
        if (i14 != Integer.MAX_VALUE) {
            jArr[i14] = ((((long) iM114d) & 2147483647L) << 31) | (jArr[i14] & (-4611686016279904257L));
        }
        this.f143d = iM114d;
        if (this.f144e == Integer.MAX_VALUE) {
            this.f144e = iM114d;
        }
        return this.f146g != i13;
    }

    /* JADX INFO: renamed from: b */
    public final void m112b() {
        this.f146g = 0;
        long[] jArr = this.f140a;
        if (jArr != AbstractC0015d1.f36a) {
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f140a;
            int i13 = this.f145f;
            int i14 = i13 >> 3;
            long j7 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j7)) | j7;
        }
        AbstractC25260n.m74073n0(0, this.f145f, null, this.f141b);
        AbstractC25260n.m74075p0(this.f142c, DurationKt.MAX_MILLIS);
        this.f143d = Integer.MAX_VALUE;
        this.f144e = Integer.MAX_VALUE;
        this.f147h = AbstractC0015d1.m16a(this.f145f) - this.f146g;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m113c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f145f;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f140a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j7 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j13 = (((long) i14) * 72340172838076673L) ^ j7;
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i16) & i15;
                if (AbstractC22676k.m65745e(this.f141b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m114d(Object obj) {
        int i13;
        long j7;
        long j13;
        long j14;
        char c3;
        long[] jArr;
        int i14 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i15 = iHashCode ^ (iHashCode << 16);
        int i16 = i15 >>> 7;
        int i17 = i15 & 127;
        int i18 = this.f145f;
        int i19 = i16 & i18;
        int i24 = 0;
        while (true) {
            long[] jArr2 = this.f140a;
            int i25 = i19 >> 3;
            int i26 = (i19 & 7) << 3;
            long j15 = ((jArr2[i25 + 1] << (64 - i26)) & ((-i26) >> 63)) | (jArr2[i25] >>> i26);
            long j16 = i17;
            long j17 = j15 ^ (j16 * 72340172838076673L);
            long j18 = (j17 - 72340172838076673L) & (~j17) & (-9187201950435737472L);
            while (j18 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j18) >> 3) + i19) & i18;
                int i27 = i14;
                if (AbstractC22676k.m65745e(this.f141b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j18 &= j18 - 1;
                i14 = i27;
            }
            int i28 = i14;
            if ((j15 & ((~j15) << 6) & (-9187201950435737472L)) != 0) {
                int iM115e = m115e(i16);
                long j19 = 255;
                if (this.f147h != 0 || ((this.f140a[iM115e >> 3] >> ((iM115e & 7) << 3)) & 255) == 254) {
                    i13 = 0;
                    j7 = j16;
                    j13 = 255;
                    j14 = 128;
                } else {
                    int i29 = this.f145f;
                    if (i29 > 8) {
                        c3 = 31;
                        j14 = 128;
                        if (Long.compareUnsigned(((long) this.f146g) * 32, ((long) i29) * 25) <= 0) {
                            long[] jArr3 = this.f140a;
                            if (jArr3 == null) {
                                i13 = 0;
                                j7 = j16;
                                j13 = 255;
                            } else {
                                int i34 = this.f145f;
                                Object[] objArr = this.f141b;
                                long[] jArr4 = this.f142c;
                                long[] jArr5 = new long[i34];
                                Arrays.fill(jArr5, 0, i34, 9223372034707292159L);
                                i13 = 0;
                                int i35 = (i34 + 7) >> 3;
                                int i36 = 0;
                                while (i36 < i35) {
                                    long j24 = j19;
                                    long j25 = jArr3[i36] & (-9187201950435737472L);
                                    int i37 = i36;
                                    jArr3[i37] = ((~j25) + (j25 >>> 7)) & (-72340172838076674L);
                                    i36 = i37 + 1;
                                    j19 = j24;
                                }
                                j13 = j19;
                                int length = jArr3.length;
                                int i38 = length - 1;
                                int i39 = length - 2;
                                jArr3[i39] = (jArr3[i39] & 72057594037927935L) | (-72057594037927936L);
                                jArr3[i38] = jArr3[0];
                                int i44 = 0;
                                while (i44 != i34) {
                                    int i45 = i44 >> 3;
                                    int i46 = (i44 & 7) << 3;
                                    long j26 = (jArr3[i45] >> i46) & j13;
                                    if (j26 != 128 && j26 == 254) {
                                        Object obj2 = objArr[i44];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i28;
                                        int i47 = iHashCode2 ^ (iHashCode2 << 16);
                                        int i48 = i47 >>> 7;
                                        int iM115e2 = m115e(i48);
                                        int i49 = i48 & i34;
                                        if (((iM115e2 - i49) & i34) / 8 == ((i44 - i49) & i34) / 8) {
                                            int i54 = i34;
                                            Object[] objArr2 = objArr;
                                            jArr3[i45] = (jArr3[i45] & (~(j13 << i46))) | (((long) (i47 & 127)) << i46);
                                            if (jArr5[i44] == 9223372034707292159L) {
                                                long j27 = i44;
                                                jArr5[i44] = j27 | (j27 << 32);
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i44++;
                                            i34 = i54;
                                            objArr = objArr2;
                                        } else {
                                            int i55 = i34;
                                            Object[] objArr3 = objArr;
                                            int i56 = iM115e2 >> 3;
                                            long j28 = jArr3[i56];
                                            int i57 = (iM115e2 & 7) << 3;
                                            if (((j28 >> i57) & j13) == 128) {
                                                jArr3[i56] = (j28 & (~(j13 << i57))) | (((long) (i47 & 127)) << i57);
                                                jArr3[i45] = (jArr3[i45] & (~(j13 << i46))) | (128 << i46);
                                                objArr3[iM115e2] = objArr3[i44];
                                                objArr3[i44] = null;
                                                jArr4[iM115e2] = jArr4[i44];
                                                jArr4[i44] = 4611686018427387903L;
                                                int i58 = (int) ((jArr5[i44] >> 32) & 4294967295L);
                                                int i59 = Integer.MAX_VALUE;
                                                if (i58 != Integer.MAX_VALUE) {
                                                    jArr5[i58] = ((long) iM115e2) | (jArr5[i58] & (-4294967296L));
                                                    jArr5[i44] = (jArr5[i44] & 4294967295L) | (-4294967296L);
                                                    i59 = Integer.MAX_VALUE;
                                                } else {
                                                    jArr5[i44] = (((long) Integer.MAX_VALUE) << 32) | ((long) iM115e2);
                                                }
                                                jArr5[iM115e2] = (((long) i44) << 32) | ((long) i59);
                                            } else {
                                                j16 = j16;
                                                jArr3[i56] = (((long) (i47 & 127)) << i57) | (j28 & (~(j13 << i57)));
                                                Object obj3 = objArr3[iM115e2];
                                                objArr3[iM115e2] = objArr3[i44];
                                                objArr3[i44] = obj3;
                                                long j29 = jArr4[iM115e2];
                                                jArr4[iM115e2] = jArr4[i44];
                                                jArr4[i44] = j29;
                                                int i64 = (int) ((jArr5[i44] >> 32) & 4294967295L);
                                                if (i64 != Integer.MAX_VALUE) {
                                                    long j34 = iM115e2;
                                                    jArr5[i64] = (jArr5[i64] & (-4294967296L)) | j34;
                                                    jArr5[i44] = (jArr5[i44] & 4294967295L) | (j34 << 32);
                                                } else {
                                                    long j35 = iM115e2;
                                                    jArr5[i44] = j35 | (j35 << 32);
                                                    i64 = i44;
                                                }
                                                jArr5[iM115e2] = (((long) i64) << 32) | ((long) i44);
                                                i44--;
                                            }
                                            jArr3[jArr3.length - 1] = jArr3[0];
                                            i44++;
                                            i34 = i55;
                                            objArr = objArr3;
                                            j16 = j16;
                                        }
                                    } else {
                                        i44++;
                                    }
                                }
                                j7 = j16;
                                this.f147h = AbstractC0015d1.m16a(this.f145f) - this.f146g;
                                long[] jArr6 = this.f142c;
                                int length2 = jArr6.length;
                                for (int i65 = 0; i65 < length2; i65++) {
                                    long j36 = jArr6[i65];
                                    int i66 = (int) ((j36 >> 31) & 2147483647L);
                                    int i67 = (int) (j36 & 2147483647L);
                                    jArr6[i65] = (((j36 & (-4611686018427387904L)) | ((long) (i66 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr5[i66] & 4294967295L)))) << 31) | ((long) (i67 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr5[i67] & 4294967295L)));
                                }
                                int i68 = this.f143d;
                                if (i68 != Integer.MAX_VALUE) {
                                    this.f143d = (int) (jArr5[i68] & 4294967295L);
                                }
                                int i69 = this.f144e;
                                if (i69 != Integer.MAX_VALUE) {
                                    this.f144e = (int) (jArr5[i69] & 4294967295L);
                                }
                            }
                        }
                        iM115e = m115e(i16);
                    } else {
                        c3 = 31;
                        j14 = 128;
                    }
                    i13 = 0;
                    j7 = j16;
                    j13 = 255;
                    int iM17b = AbstractC0015d1.m17b(this.f145f);
                    long[] jArr7 = this.f140a;
                    Object[] objArr4 = this.f141b;
                    long[] jArr8 = this.f142c;
                    int i74 = this.f145f;
                    int[] iArr = new int[i74];
                    m116f(iM17b);
                    long[] jArr9 = this.f140a;
                    Object[] objArr5 = this.f141b;
                    long[] jArr10 = this.f142c;
                    int i75 = this.f145f;
                    int i76 = 0;
                    while (i76 < i74) {
                        if (((jArr7[i76 >> 3] >> ((i76 & 7) << 3)) & 255) < j14) {
                            Object obj4 = objArr4[i76];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i28;
                            int i77 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM115e3 = m115e(i77 >>> 7);
                            jArr = jArr9;
                            long j37 = i77 & 127;
                            int i78 = iM115e3 >> 3;
                            int i79 = (iM115e3 & 7) << 3;
                            long j38 = (jArr[i78] & (~(255 << i79))) | (j37 << i79);
                            jArr[i78] = j38;
                            jArr[(((iM115e3 - 7) & i75) + (i75 & 7)) >> 3] = j38;
                            objArr5[iM115e3] = obj4;
                            jArr10[iM115e3] = jArr8[i76];
                            iArr[i76] = iM115e3;
                        } else {
                            jArr = jArr9;
                        }
                        i76++;
                        jArr7 = jArr7;
                        jArr9 = jArr;
                    }
                    long[] jArr11 = this.f142c;
                    int length3 = jArr11.length;
                    for (int i83 = 0; i83 < length3; i83++) {
                        long j39 = jArr11[i83];
                        int i84 = (int) ((j39 >> c3) & 2147483647L);
                        int i85 = (int) (j39 & 2147483647L);
                        jArr11[i83] = (((j39 & (-4611686018427387904L)) | ((long) (i84 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i84]))) << c3) | ((long) (i85 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i85]));
                    }
                    int i86 = this.f143d;
                    if (i86 != Integer.MAX_VALUE) {
                        this.f143d = iArr[i86];
                    }
                    int i87 = this.f144e;
                    if (i87 != Integer.MAX_VALUE) {
                        this.f144e = iArr[i87];
                    }
                    iM115e = m115e(i16);
                }
                this.f146g++;
                int i88 = this.f147h;
                long[] jArr12 = this.f140a;
                int i89 = iM115e >> 3;
                long j44 = jArr12[i89];
                int i94 = (iM115e & 7) << 3;
                if (((j44 >> i94) & j13) == j14) {
                    i13 = 1;
                }
                this.f147h = i88 - i13;
                int i95 = this.f145f;
                long j45 = (j44 & (~(j13 << i94))) | (j7 << i94);
                jArr12[i89] = j45;
                jArr12[(((iM115e - 7) & i95) + (i95 & 7)) >> 3] = j45;
                return iM115e;
            }
            i24 += 8;
            i19 = (i19 + i24) & i18;
            i14 = i28;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m115e(int i13) {
        int i14 = this.f145f;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f140a;
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

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0049r0)) {
            return false;
        }
        C0049r0 c0049r0 = (C0049r0) obj;
        if (c0049r0.f146g != this.f146g) {
            return false;
        }
        Object[] objArr = this.f141b;
        long[] jArr = this.f140a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j7 = jArr[i13];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j7) < 128 && !c0049r0.m113c(objArr[(i13 << 3) + i15])) {
                            return false;
                        }
                        j7 >>= 8;
                    }
                    if (i14 == 8) {
                        if (i13 != length) {
                            i13++;
                        }
                    }
                } else if (i13 != length) {
                    i13++;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m116f(int i13) {
        long[] jArr;
        long[] jArr2;
        int iMax = i13 > 0 ? Math.max(7, AbstractC0015d1.m18c(i13)) : 0;
        this.f145f = iMax;
        if (iMax == 0) {
            jArr = AbstractC0015d1.f36a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
        }
        this.f140a = jArr;
        int i14 = iMax >> 3;
        long j7 = 255 << ((iMax & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j7)) | j7;
        this.f147h = AbstractC0015d1.m16a(this.f145f) - this.f146g;
        this.f141b = iMax == 0 ? AbstractC2177a.f8659c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = AbstractC0064z.f202b;
        } else {
            jArr2 = new long[iMax];
            AbstractC25260n.m74075p0(jArr2, DurationKt.MAX_MILLIS);
        }
        this.f142c = jArr2;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m117g(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f145f;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f140a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j7 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j13 = (((long) i14) * 72340172838076673L) ^ j7;
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i16) & i15;
                if (AbstractC22676k.m65745e(this.f141b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
        }
        boolean z4 = iNumberOfTrailingZeros >= 0;
        if (z4) {
            m118h(iNumberOfTrailingZeros);
        }
        return z4;
    }

    /* JADX INFO: renamed from: h */
    public final void m118h(int i13) {
        this.f146g--;
        long[] jArr = this.f140a;
        int i14 = this.f145f;
        int i15 = i13 >> 3;
        int i16 = (i13 & 7) << 3;
        long j7 = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        jArr[i15] = j7;
        jArr[(((i13 - 7) & i14) + (i14 & 7)) >> 3] = j7;
        this.f141b[i13] = null;
        long[] jArr2 = this.f142c;
        long j13 = jArr2[i13];
        int i17 = (int) ((j13 >> 31) & 2147483647L);
        int i18 = (int) (j13 & 2147483647L);
        if (i17 != Integer.MAX_VALUE) {
            jArr2[i17] = (jArr2[i17] & (-2147483648L)) | (((long) i18) & 2147483647L);
        } else {
            this.f143d = i18;
        }
        if (i18 != Integer.MAX_VALUE) {
            jArr2[i18] = ((((long) i17) & 2147483647L) << 31) | (jArr2[i18] & (-4611686016279904257L));
        } else {
            this.f144e = i17;
        }
        jArr2[i13] = 4611686018427387903L;
    }

    public final int hashCode() {
        int iHashCode = (this.f145f * 31) + this.f146g;
        Object[] objArr = this.f141b;
        long[] jArr = this.f140a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j7 = jArr[i13];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j7) < 128) {
                            Object obj = objArr[(i13 << 3) + i15];
                            if (!AbstractC22676k.m65745e(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j7 >>= 8;
                    }
                    if (i14 != 8) {
                        return iHashCode;
                    }
                }
                if (i13 != length) {
                    i13++;
                }
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0054 A[LOOP:0: B:5:0x0016->B:17:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[EDGE_INSN: B:24:0x0057->B:18:0x0057 BREAK  A[LOOP:0: B:5:0x0016->B:17:0x0054], SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public final boolean m119i(Collection elements) {
        AbstractC22676k.m65750j(elements, "elements");
        Object[] objArr = this.f141b;
        int i13 = this.f146g;
        long[] jArr = this.f140a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j7 = jArr[i14];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i14 != length) {
                        break;
                        break;
                    }
                    i14++;
                } else {
                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j7) < 128) {
                            int i17 = (i14 << 3) + i16;
                            if (!AbstractC25265s.m74155w0(elements, objArr[i17])) {
                                m118h(i17);
                            }
                        }
                        j7 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                    if (i14 != length) {
                        break;
                    }
                    i14++;
                }
            }
        }
        return i13 != this.f146g;
    }

    public final String toString() {
        C0006a1 c0006a1 = new C0006a1(this, 1);
        StringBuilder sb4 = new StringBuilder("[");
        Object[] objArr = this.f141b;
        long[] jArr = this.f142c;
        int i13 = this.f144e;
        int i14 = 0;
        while (i13 != Integer.MAX_VALUE) {
            int i15 = (int) ((jArr[i13] >> 31) & 2147483647L);
            Object obj = objArr[i13];
            if (i14 == -1) {
                sb4.append((CharSequence) "...");
                String string = sb4.toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                return string;
            }
            if (i14 != 0) {
                sb4.append((CharSequence) ", ");
            }
            sb4.append((CharSequence) c0006a1.invoke(obj));
            i14++;
            i13 = i15;
        }
        sb4.append((CharSequence) "]");
        String string2 = sb4.toString();
        AbstractC22676k.m65749i(string2, "toString(...)");
        return string2;
    }
}
