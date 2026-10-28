package p002a0;

import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: a0.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0017e0 {

    /* JADX INFO: renamed from: a */
    public long[] f38a;

    /* JADX INFO: renamed from: b */
    public int[] f39b;

    /* JADX INFO: renamed from: c */
    public int[] f40c;

    /* JADX INFO: renamed from: d */
    public int f41d;

    /* JADX INFO: renamed from: e */
    public int f42e;

    /* JADX INFO: renamed from: f */
    public int f43f;

    public C0017e0(int i13) {
        this.f38a = AbstractC0015d1.f36a;
        int[] iArr = AbstractC0054u.f166a;
        this.f39b = iArr;
        this.f40c = iArr;
        if (i13 >= 0) {
            m24e(AbstractC0015d1.m19d(i13));
        } else {
            AbstractC34924m.m110133O("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20a() {
        this.f42e = 0;
        long[] jArr = this.f38a;
        if (jArr != AbstractC0015d1.f36a) {
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f38a;
            int i13 = this.f41d;
            int i14 = i13 >> 3;
            long j7 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j7)) | j7;
        }
        this.f43f = AbstractC0015d1.m16a(this.f41d) - this.f42e;
    }

    /* JADX INFO: renamed from: b */
    public final int m21b(int i13) {
        int i14 = this.f41d;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f38a;
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
    public final int m22c(int i13) {
        int iHashCode = Integer.hashCode(i13) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f41d;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f38a;
            int i19 = i17 >> 3;
            int i24 = (i17 & 7) << 3;
            long j7 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j13 = (((long) i15) * 72340172838076673L) ^ j7;
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i17) & i16;
                if (this.f39b[iNumberOfTrailingZeros] == i13) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m23d(int i13) {
        int iM22c = m22c(i13);
        if (iM22c >= 0) {
            return this.f40c[iM22c];
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final void m24e(int i13) {
        long[] jArr;
        int iMax = i13 > 0 ? Math.max(7, AbstractC0015d1.m18c(i13)) : 0;
        this.f41d = iMax;
        if (iMax == 0) {
            jArr = AbstractC0015d1.f36a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
        }
        this.f38a = jArr;
        int i14 = iMax >> 3;
        long j7 = 255 << ((iMax & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j7)) | j7;
        this.f43f = AbstractC0015d1.m16a(this.f41d) - this.f42e;
        this.f39b = new int[iMax];
        this.f40c = new int[iMax];
    }

    public final boolean equals(Object obj) {
        boolean z4;
        boolean z13 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0017e0)) {
            return false;
        }
        C0017e0 c0017e0 = (C0017e0) obj;
        if (c0017e0.f42e != this.f42e) {
            return false;
        }
        int[] iArr = this.f39b;
        int[] iArr2 = this.f40c;
        long[] jArr = this.f38a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i13 = 0;
        loop0: while (true) {
            long j7 = jArr[i13];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((255 & j7) < 128) {
                        int i16 = (i13 << 3) + i15;
                        int i17 = iArr[i16];
                        int i18 = iArr2[i16];
                        int iM22c = c0017e0.m22c(i17);
                        if (iM22c < 0 || i18 != c0017e0.f40c[iM22c]) {
                            break loop0;
                        }
                    }
                    j7 >>= 8;
                    i15++;
                    z13 = z13;
                }
                z4 = z13;
                if (i14 != 8) {
                    return z4;
                }
            } else {
                z4 = z13;
            }
            if (i13 == length) {
                return z4;
            }
            i13++;
            z13 = z4;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m25f(int i13, int i14) {
        long j7;
        long j13;
        int i15;
        int i16;
        long j14;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int[] iArr2;
        int i17 = i13;
        int i18 = -862048943;
        int iHashCode = Integer.hashCode(i17) * (-862048943);
        int i19 = iHashCode ^ (iHashCode << 16);
        int i24 = i19 >>> 7;
        int i25 = i19 & 127;
        int i26 = this.f41d;
        int i27 = i24 & i26;
        int i28 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f38a;
            int i29 = i27 >> 3;
            int i34 = (i27 & 7) << 3;
            int i35 = 1;
            int i36 = i28;
            int i37 = 0;
            long j15 = (((-i34) >> 63) & (jArr2[i29 + 1] << (64 - i34))) | (jArr2[i29] >>> i34);
            long j16 = i25;
            long j17 = j15 ^ (j16 * 72340172838076673L);
            long j18 = (j17 - 72340172838076673L) & (~j17) & (-9187201950435737472L);
            while (j18 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j18) >> 3) + i27) & i26;
                int i38 = i18;
                if (this.f39b[iNumberOfTrailingZeros] == i17) {
                    break loop0;
                }
                j18 &= j18 - 1;
                i18 = i38;
            }
            int i39 = i18;
            if ((j15 & ((~j15) << 6) & (-9187201950435737472L)) != 0) {
                int iM21b = m21b(i24);
                long j19 = 255;
                if (this.f43f != 0 || ((this.f38a[iM21b >> 3] >> ((iM21b & 7) << 3)) & 255) == 254) {
                    j7 = j16;
                    j13 = 255;
                    i15 = 1;
                    i16 = 0;
                    j14 = 128;
                } else {
                    int i44 = this.f41d;
                    if (i44 > 8) {
                        j14 = 128;
                        if (Long.compareUnsigned(((long) this.f42e) * 32, ((long) i44) * 25) <= 0) {
                            long[] jArr3 = this.f38a;
                            int i45 = this.f41d;
                            int[] iArr3 = this.f39b;
                            int[] iArr4 = this.f40c;
                            int i46 = (i45 + 7) >> 3;
                            int i47 = 0;
                            while (i47 < i46) {
                                long j24 = jArr3[i47] & (-9187201950435737472L);
                                jArr3[i47] = (-72340172838076674L) & ((~j24) + (j24 >>> 7));
                                i47++;
                                j19 = j19;
                                j16 = j16;
                            }
                            j7 = j16;
                            j13 = j19;
                            char c3 = 7;
                            int iM74081v0 = AbstractC25260n.m74081v0(jArr3);
                            int i48 = iM74081v0 - 1;
                            jArr3[i48] = (jArr3[i48] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iM74081v0] = jArr3[0];
                            int i49 = 0;
                            while (i49 != i45) {
                                int i54 = i49 >> 3;
                                int i55 = (i49 & 7) << 3;
                                long j25 = (jArr3[i54] >> i55) & j13;
                                if (j25 != 128 && j25 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr3[i49]) * i39;
                                    int i56 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i57 = i56 >>> 7;
                                    int iM21b2 = m21b(i57);
                                    int i58 = i57 & i45;
                                    char c7 = c3;
                                    if (((iM21b2 - i58) & i45) / 8 == ((i49 - i58) & i45) / 8) {
                                        int i59 = i37;
                                        jArr3[i54] = (((long) (i56 & 127)) << i55) | (jArr3[i54] & (~(j13 << i55)));
                                        jArr3[jArr3.length - 1] = (jArr3[i59] & 72057594037927935L) | Long.MIN_VALUE;
                                        i49++;
                                        i35 = i35;
                                        c3 = c7;
                                        i37 = i59;
                                    } else {
                                        int i64 = i35;
                                        int i65 = i37;
                                        int i66 = iM21b2 >> 3;
                                        long j26 = jArr3[i66];
                                        int i67 = (iM21b2 & 7) << 3;
                                        if (((j26 >> i67) & j13) == 128) {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            jArr3[i66] = ((~(j13 << i67)) & j26) | (((long) (i56 & 127)) << i67);
                                            jArr3[i54] = (jArr3[i54] & (~(j13 << i55))) | (128 << i55);
                                            iArr[iM21b2] = iArr[i49];
                                            iArr[i49] = i65;
                                            iArr2[iM21b2] = iArr2[i49];
                                            iArr2[i49] = i65;
                                        } else {
                                            iArr = iArr3;
                                            iArr2 = iArr4;
                                            jArr3[i66] = (((long) (i56 & 127)) << i67) | ((~(j13 << i67)) & j26);
                                            int i68 = iArr[iM21b2];
                                            iArr[iM21b2] = iArr[i49];
                                            iArr[i49] = i68;
                                            int i69 = iArr2[iM21b2];
                                            iArr2[iM21b2] = iArr2[i49];
                                            iArr2[i49] = i69;
                                            i49--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[i65] & 72057594037927935L) | Long.MIN_VALUE;
                                        i49++;
                                        i35 = i64;
                                        c3 = c7;
                                        i37 = i65;
                                        iArr3 = iArr;
                                        iArr4 = iArr2;
                                    }
                                } else {
                                    i49++;
                                }
                            }
                            i15 = i35;
                            i16 = i37;
                            this.f43f = AbstractC0015d1.m16a(this.f41d) - this.f42e;
                        }
                        iM21b = m21b(i24);
                    } else {
                        j14 = 128;
                    }
                    j7 = j16;
                    j13 = 255;
                    i15 = 1;
                    i16 = 0;
                    int iM17b = AbstractC0015d1.m17b(this.f41d);
                    long[] jArr4 = this.f38a;
                    int[] iArr5 = this.f39b;
                    int[] iArr6 = this.f40c;
                    int i74 = this.f41d;
                    m24e(iM17b);
                    long[] jArr5 = this.f38a;
                    int[] iArr7 = this.f39b;
                    int[] iArr8 = this.f40c;
                    int i75 = this.f41d;
                    int i76 = 0;
                    while (i76 < i74) {
                        if (((jArr4[i76 >> 3] >> ((i76 & 7) << 3)) & 255) < j14) {
                            int i77 = iArr5[i76];
                            int iHashCode3 = Integer.hashCode(i77) * i39;
                            int i78 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM21b3 = m21b(i78 >>> 7);
                            jArr = jArr5;
                            long j27 = i78 & 127;
                            int i79 = iM21b3 >> 3;
                            int i83 = (iM21b3 & 7) << 3;
                            long j28 = (jArr[i79] & (~(255 << i83))) | (j27 << i83);
                            jArr[i79] = j28;
                            jArr[(((iM21b3 - 7) & i75) + (i75 & 7)) >> 3] = j28;
                            iArr7[iM21b3] = i77;
                            iArr8[iM21b3] = iArr6[i76];
                        } else {
                            jArr = jArr5;
                        }
                        i76++;
                        jArr5 = jArr;
                    }
                    iM21b = m21b(i24);
                }
                this.f42e++;
                int i84 = this.f43f;
                long[] jArr6 = this.f38a;
                int i85 = iM21b >> 3;
                long j29 = jArr6[i85];
                int i86 = (iM21b & 7) << 3;
                if (((j29 >> i86) & j13) == j14) {
                    i16 = i15;
                }
                this.f43f = i84 - i16;
                int i87 = this.f41d;
                long j34 = (j29 & (~(j13 << i86))) | (j7 << i86);
                jArr6[i85] = j34;
                jArr6[(((iM21b - 7) & i87) + (i87 & 7)) >> 3] = j34;
                iNumberOfTrailingZeros = ~iM21b;
                break;
            }
            i28 = i36 + 8;
            i27 = (i27 + i28) & i26;
            i17 = i13;
            i18 = i39;
        }
        if (iNumberOfTrailingZeros < 0) {
            iNumberOfTrailingZeros = ~iNumberOfTrailingZeros;
        }
        this.f39b[iNumberOfTrailingZeros] = i13;
        this.f40c[iNumberOfTrailingZeros] = i14;
    }

    public final int hashCode() {
        int[] iArr = this.f39b;
        int[] iArr2 = this.f40c;
        long[] jArr = this.f38a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i13 = 0;
        int iHashCode = 0;
        while (true) {
            long j7 = jArr[i13];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j7) < 128) {
                        int i16 = (i13 << 3) + i15;
                        int i17 = iArr[i16];
                        iHashCode += Integer.hashCode(iArr2[i16]) ^ Integer.hashCode(i17);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[DONT_INVERT, PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:19:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0068 A[LOOP:0: B:9:0x001e->B:21:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[EDGE_INSN: B:25:0x006b->B:22:0x006b BREAK  A[LOOP:0: B:9:0x001e->B:21:0x0068], SYNTHETIC] */
    public final String toString() {
        if (this.f42e == 0) {
            return "{}";
        }
        StringBuilder sb4 = new StringBuilder("{");
        int[] iArr = this.f39b;
        int[] iArr2 = this.f40c;
        long[] jArr = this.f38a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            int i14 = 0;
            while (true) {
                long j7 = jArr[i13];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i15 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i16 = 0; i16 < i15; i16++) {
                        if ((255 & j7) < 128) {
                            int i17 = (i13 << 3) + i16;
                            int i18 = iArr[i17];
                            int i19 = iArr2[i17];
                            sb4.append(i18);
                            sb4.append("=");
                            sb4.append(i19);
                            i14++;
                            if (i14 < this.f42e) {
                                sb4.append(", ");
                            }
                        }
                        j7 >>= 8;
                    }
                    if (i15 != 8) {
                        break;
                    }
                    if (i13 != length) {
                        break;
                    }
                    i13++;
                }
            }
        }
        sb4.append('}');
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    public /* synthetic */ C0017e0() {
        this(6);
    }
}
