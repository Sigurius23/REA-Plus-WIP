package p002a0;

import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: a0.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0026h0 {

    /* JADX INFO: renamed from: a */
    public long[] f62a;

    /* JADX INFO: renamed from: b */
    public int[] f63b;

    /* JADX INFO: renamed from: c */
    public int f64c;

    /* JADX INFO: renamed from: d */
    public int f65d;

    /* JADX INFO: renamed from: e */
    public int f66e;

    public C0026h0(int i13) {
        this.f62a = AbstractC0015d1.f36a;
        this.f63b = AbstractC0054u.f166a;
        if (i13 >= 0) {
            m64d(AbstractC0015d1.m19d(i13));
        } else {
            AbstractC34924m.m110133O("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: a */
    public final boolean m61a(int i13) {
        long j7;
        boolean z4;
        long j13;
        int iNumberOfTrailingZeros;
        long[] jArr;
        int[] iArr;
        int i14;
        int i15 = this.f65d;
        int i16 = -862048943;
        int iHashCode = Integer.hashCode(i13) * (-862048943);
        int i17 = iHashCode ^ (iHashCode << 16);
        int i18 = i17 >>> 7;
        int i19 = i17 & 127;
        int i24 = this.f64c;
        int i25 = i18 & i24;
        int i26 = 0;
        loop0: while (true) {
            long[] jArr2 = this.f62a;
            int i27 = i25 >> 3;
            int i28 = (i25 & 7) << 3;
            boolean z13 = true;
            int i29 = i26;
            long j14 = (((-i28) >> 63) & (jArr2[i27 + 1] << (64 - i28))) | (jArr2[i27] >>> i28);
            long j15 = i19;
            long j16 = j14 ^ (j15 * 72340172838076673L);
            long j17 = (j16 - 72340172838076673L) & (~j16) & (-9187201950435737472L);
            while (j17 != 0) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j17) >> 3) + i25) & i24;
                int i34 = i16;
                if (this.f63b[iNumberOfTrailingZeros] == i13) {
                    z4 = true;
                    break loop0;
                }
                j17 &= j17 - 1;
                i16 = i34;
            }
            int i35 = i16;
            long j18 = j14 & ((~j14) << 6) & (-9187201950435737472L);
            char c3 = '\b';
            if (j18 != 0) {
                int iM63c = m63c(i18);
                long j19 = 255;
                if (this.f66e != 0 || ((this.f62a[iM63c >> 3] >> ((iM63c & 7) << 3)) & 255) == 254) {
                    j7 = 255;
                    z4 = true;
                    j13 = 128;
                } else {
                    int i36 = this.f64c;
                    if (i36 > 8) {
                        j13 = 128;
                        if (Long.compareUnsigned(((long) this.f65d) * 32, ((long) i36) * 25) <= 0) {
                            long[] jArr3 = this.f62a;
                            int i37 = this.f64c;
                            int[] iArr2 = this.f63b;
                            int i38 = (i37 + 7) >> 3;
                            int i39 = 0;
                            while (i39 < i38) {
                                char c7 = c3;
                                long j24 = jArr3[i39] & (-9187201950435737472L);
                                jArr3[i39] = (-72340172838076674L) & ((~j24) + (j24 >>> 7));
                                i39++;
                                j19 = j19;
                                c3 = c7;
                            }
                            j7 = j19;
                            int iM74081v0 = AbstractC25260n.m74081v0(jArr3);
                            int i44 = iM74081v0 - 1;
                            jArr3[i44] = (jArr3[i44] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iM74081v0] = jArr3[0];
                            int i45 = 0;
                            while (i45 != i37) {
                                int i46 = i45 >> 3;
                                int i47 = (i45 & 7) << 3;
                                long j25 = (jArr3[i46] >> i47) & j7;
                                if (j25 != 128 && j25 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i45]) * i35;
                                    int i48 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i49 = i48 >>> 7;
                                    int iM63c2 = m63c(i49);
                                    int i54 = i49 & i37;
                                    boolean z14 = z13;
                                    if (((iM63c2 - i54) & i37) / 8 == ((i45 - i54) & i37) / 8) {
                                        iArr = iArr2;
                                        jArr3[i46] = ((~(j7 << i47)) & jArr3[i46]) | (((long) (i48 & 127)) << i47);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i45++;
                                    } else {
                                        iArr = iArr2;
                                        int i55 = i45;
                                        int i56 = iM63c2 >> 3;
                                        long j26 = jArr3[i56];
                                        int i57 = (iM63c2 & 7) << 3;
                                        if (((j26 >> i57) & j7) == 128) {
                                            jArr3[i56] = (j26 & (~(j7 << i57))) | (((long) (i48 & 127)) << i57);
                                            jArr3[i46] = (jArr3[i46] & (~(j7 << i47))) | (128 << i47);
                                            iArr[iM63c2] = iArr[i55];
                                            iArr[i55] = 0;
                                            i14 = i55;
                                        } else {
                                            jArr3[i56] = (((long) (i48 & 127)) << i57) | (j26 & (~(j7 << i57)));
                                            int i58 = iArr[iM63c2];
                                            iArr[iM63c2] = iArr[i55];
                                            iArr[i55] = i58;
                                            i14 = i55 - 1;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i45 = i14 + 1;
                                    }
                                    iArr2 = iArr;
                                    z13 = z14;
                                } else {
                                    i45++;
                                }
                            }
                            z4 = z13;
                            this.f66e = AbstractC0015d1.m16a(this.f64c) - this.f65d;
                        }
                        iM63c = m63c(i18);
                    } else {
                        j13 = 128;
                    }
                    j7 = 255;
                    z4 = true;
                    int iM17b = AbstractC0015d1.m17b(this.f64c);
                    long[] jArr4 = this.f62a;
                    int[] iArr3 = this.f63b;
                    int i59 = this.f64c;
                    m64d(iM17b);
                    long[] jArr5 = this.f62a;
                    int[] iArr4 = this.f63b;
                    int i64 = this.f64c;
                    int i65 = 0;
                    while (i65 < i59) {
                        if (((jArr4[i65 >> 3] >> ((i65 & 7) << 3)) & 255) < j13) {
                            int i66 = iArr3[i65];
                            int iHashCode3 = Integer.hashCode(i66) * i35;
                            int i67 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM63c3 = m63c(i67 >>> 7);
                            jArr = jArr5;
                            long j27 = i67 & 127;
                            int i68 = iM63c3 >> 3;
                            int i69 = (iM63c3 & 7) << 3;
                            long j28 = (jArr[i68] & (~(255 << i69))) | (j27 << i69);
                            jArr[i68] = j28;
                            jArr[(((iM63c3 - 7) & i64) + (i64 & 7)) >> 3] = j28;
                            iArr4[iM63c3] = i66;
                        } else {
                            jArr = jArr5;
                        }
                        i65++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iM63c = m63c(i18);
                }
                iNumberOfTrailingZeros = iM63c;
                this.f65d++;
                int i74 = this.f66e;
                long[] jArr6 = this.f62a;
                int i75 = iNumberOfTrailingZeros >> 3;
                long j29 = jArr6[i75];
                int i76 = (iNumberOfTrailingZeros & 7) << 3;
                this.f66e = i74 - (((j29 >> i76) & j7) == j13 ? z4 : 0);
                int i77 = this.f64c;
                long j34 = (j29 & (~(j7 << i76))) | (j15 << i76);
                jArr6[i75] = j34;
                jArr6[(((iNumberOfTrailingZeros - 7) & i77) + (i77 & 7)) >> 3] = j34;
                break;
            }
            i26 = i29 + 8;
            i25 = (i25 + i26) & i24;
            i16 = i35;
        }
        this.f63b[iNumberOfTrailingZeros] = i13;
        if (this.f65d != i15) {
            return z4;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m62b(int i13) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i13) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f64c;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f62a;
            int i19 = i17 >> 3;
            int i24 = (i17 & 7) << 3;
            long j7 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j13 = (((long) i15) * 72340172838076673L) ^ j7;
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i17) & i16;
                if (this.f63b[iNumberOfTrailingZeros] == i13) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m63c(int i13) {
        int i14 = this.f64c;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f62a;
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

    /* JADX INFO: renamed from: d */
    public final void m64d(int i13) {
        long[] jArr;
        int iMax = i13 > 0 ? Math.max(7, AbstractC0015d1.m18c(i13)) : 0;
        this.f64c = iMax;
        if (iMax == 0) {
            jArr = AbstractC0015d1.f36a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
        }
        this.f62a = jArr;
        int i14 = iMax >> 3;
        long j7 = 255 << ((iMax & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j7)) | j7;
        this.f66e = AbstractC0015d1.m16a(this.f64c) - this.f65d;
        this.f63b = new int[iMax];
    }

    /* JADX INFO: renamed from: e */
    public final boolean m65e(int i13) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i13) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f64c;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f62a;
            int i19 = i17 >> 3;
            int i24 = (i17 & 7) << 3;
            long j7 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j13 = (((long) i15) * 72340172838076673L) ^ j7;
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i17) & i16;
                if (this.f63b[iNumberOfTrailingZeros] == i13) {
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
        boolean z4 = iNumberOfTrailingZeros >= 0;
        if (z4) {
            m66f(iNumberOfTrailingZeros);
        }
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0026h0)) {
            return false;
        }
        C0026h0 c0026h0 = (C0026h0) obj;
        if (c0026h0.f65d != this.f65d) {
            return false;
        }
        int[] iArr = this.f63b;
        long[] jArr = this.f62a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j7 = jArr[i13];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j7) < 128 && !c0026h0.m62b(iArr[(i13 << 3) + i15])) {
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
    public final void m66f(int i13) {
        this.f65d--;
        long[] jArr = this.f62a;
        int i14 = this.f64c;
        int i15 = i13 >> 3;
        int i16 = (i13 & 7) << 3;
        long j7 = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        jArr[i15] = j7;
        jArr[(((i13 - 7) & i14) + (i14 & 7)) >> 3] = j7;
    }

    public final int hashCode() {
        int[] iArr = this.f63b;
        long[] jArr = this.f62a;
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
                        iHashCode = Integer.hashCode(iArr[(i13 << 3) + i15]) + iHashCode;
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

    /* JADX WARN: Code duplicated, block: B:19:0x005d A[DONT_INVERT, PHI: r7
      0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[LOOP:0: B:5:0x0018->B:20:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[SYNTHETIC] */
    public final String toString() {
        StringBuilder sb4 = new StringBuilder();
        sb4.append((CharSequence) "[");
        int[] iArr = this.f63b;
        long[] jArr = this.f62a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb4.append((CharSequence) "]");
            break;
        }
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            long j7 = jArr[i13];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((255 & j7) < 128) {
                        int i17 = iArr[(i13 << 3) + i16];
                        if (i14 == -1) {
                            sb4.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i14 != 0) {
                            sb4.append((CharSequence) ", ");
                        }
                        sb4.append(i17);
                        i14++;
                    }
                    j7 >>= 8;
                }
                if (i15 == 8) {
                    if (i13 == length) {
                        i13++;
                    }
                }
                sb4.append((CharSequence) "]");
                break;
            }
            if (i13 == length) {
                sb4.append((CharSequence) "]");
                break;
            }
            i13++;
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    public /* synthetic */ C0026h0() {
        this(6);
    }
}
