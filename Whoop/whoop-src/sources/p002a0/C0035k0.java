package p002a0;

import m83.AbstractC25260n;
import p024b0.AbstractC2177a;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: a0.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0035k0 {

    /* JADX INFO: renamed from: a */
    public long[] f99a;

    /* JADX INFO: renamed from: b */
    public long[] f100b;

    /* JADX INFO: renamed from: c */
    public Object[] f101c;

    /* JADX INFO: renamed from: d */
    public int f102d;

    /* JADX INFO: renamed from: e */
    public int f103e;

    /* JADX INFO: renamed from: f */
    public int f104f;

    public C0035k0(int i13) {
        this.f99a = AbstractC0015d1.f36a;
        this.f100b = AbstractC0060x.f182a;
        this.f101c = AbstractC2177a.f8659c;
        if (i13 >= 0) {
            m82f(AbstractC0015d1.m19d(i13));
        } else {
            AbstractC34924m.m110133O("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m77a() {
        this.f103e = 0;
        long[] jArr = this.f99a;
        if (jArr != AbstractC0015d1.f36a) {
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f99a;
            int i13 = this.f102d;
            int i14 = i13 >> 3;
            long j7 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j7)) | j7;
        }
        AbstractC25260n.m74073n0(0, this.f102d, null, this.f101c);
        this.f104f = AbstractC0015d1.m16a(this.f102d) - this.f103e;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m78b(long j7) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j7) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f102d;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f99a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j13 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j14 = (((long) i14) * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i16) & i15;
                if (this.f100b[iNumberOfTrailingZeros] == j7) {
                    break loop0;
                }
            }
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m79c(long j7) {
        long j13;
        long j14;
        int i13;
        int i14;
        long j15;
        long[] jArr;
        long j16;
        Object[] objArr;
        long[] jArr2;
        int i15 = -862048943;
        int iHashCode = Long.hashCode(j7) * (-862048943);
        int i16 = iHashCode ^ (iHashCode << 16);
        int i17 = i16 >>> 7;
        int i18 = i16 & 127;
        int i19 = this.f102d;
        int i24 = i17 & i19;
        int i25 = 0;
        while (true) {
            long[] jArr3 = this.f99a;
            int i26 = i24 >> 3;
            int i27 = (i24 & 7) << 3;
            int i28 = 1;
            long j17 = ((jArr3[i26 + 1] << (64 - i27)) & ((-i27) >> 63)) | (jArr3[i26] >>> i27);
            long j18 = i18;
            int i29 = i25;
            int i34 = 0;
            long j19 = j17 ^ (j18 * 72340172838076673L);
            long j24 = (~j19) & (j19 - 72340172838076673L) & (-9187201950435737472L);
            while (j24 != 0) {
                int iNumberOfTrailingZeros = (i24 + (Long.numberOfTrailingZeros(j24) >> 3)) & i19;
                int i35 = i15;
                if (this.f100b[iNumberOfTrailingZeros] == j7) {
                    return iNumberOfTrailingZeros;
                }
                j24 &= j24 - 1;
                i15 = i35;
            }
            int i36 = i15;
            if ((((~j17) << 6) & j17 & (-9187201950435737472L)) != 0) {
                int iM80d = m80d(i17);
                if (this.f104f != 0 || ((this.f99a[iM80d >> 3] >> ((iM80d & 7) << 3)) & 255) == 254) {
                    j13 = 255;
                    j14 = j18;
                    i13 = 0;
                    i14 = 1;
                    j15 = 128;
                } else {
                    int i37 = this.f102d;
                    if (i37 > 8) {
                        j15 = 128;
                        if (Long.compareUnsigned(((long) this.f103e) * 32, ((long) i37) * 25) <= 0) {
                            long[] jArr4 = this.f99a;
                            int i38 = this.f102d;
                            long[] jArr5 = this.f100b;
                            Object[] objArr2 = this.f101c;
                            int i39 = (i38 + 7) >> 3;
                            j13 = 255;
                            int i44 = 0;
                            while (i44 < i39) {
                                long j25 = jArr4[i44] & (-9187201950435737472L);
                                jArr4[i44] = (-72340172838076674L) & ((~j25) + (j25 >>> 7));
                                i44++;
                                i28 = i28;
                                i34 = i34;
                                j18 = j18;
                            }
                            j14 = j18;
                            i13 = i34;
                            int i45 = i28;
                            char c3 = 7;
                            int iM74081v0 = AbstractC25260n.m74081v0(jArr4);
                            int i46 = iM74081v0 - 1;
                            long j26 = 72057594037927935L;
                            jArr4[i46] = (jArr4[i46] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iM74081v0] = jArr4[i13];
                            int i47 = i13;
                            while (i47 != i38) {
                                int i48 = i47 >> 3;
                                int i49 = (i47 & 7) << 3;
                                long j27 = (jArr4[i48] >> i49) & 255;
                                if (j27 != 128 && j27 == 254) {
                                    int iHashCode2 = Long.hashCode(jArr5[i47]) * i36;
                                    int i54 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i55 = i54 >>> 7;
                                    int iM80d2 = m80d(i55);
                                    int i56 = i55 & i38;
                                    c3 = c3;
                                    if (((iM80d2 - i56) & i38) / 8 == ((i47 - i56) & i38) / 8) {
                                        int i57 = i45;
                                        j16 = j26;
                                        jArr4[i48] = (((long) (i54 & 127)) << i49) | (jArr4[i48] & (~(255 << i49)));
                                        jArr4[jArr4.length - i57] = (jArr4[i13] & j16) | Long.MIN_VALUE;
                                        i47++;
                                        i45 = i57;
                                    } else {
                                        int i58 = i45;
                                        j16 = j26;
                                        int i59 = iM80d2 >> 3;
                                        long j28 = jArr4[i59];
                                        int i64 = (iM80d2 & 7) << 3;
                                        if (((j28 >> i64) & 255) == 128) {
                                            jArr2 = jArr5;
                                            objArr = objArr2;
                                            jArr4[i59] = (j28 & (~(255 << i64))) | (((long) (i54 & 127)) << i64);
                                            jArr4[i48] = (jArr4[i48] & (~(255 << i49))) | (128 << i49);
                                            jArr2[iM80d2] = jArr2[i47];
                                            jArr2[i47] = 0;
                                            objArr[iM80d2] = objArr[i47];
                                            objArr[i47] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr2 = jArr5;
                                            jArr4[i59] = (((long) (i54 & 127)) << i64) | (j28 & (~(255 << i64)));
                                            long j29 = jArr2[iM80d2];
                                            jArr2[iM80d2] = jArr2[i47];
                                            jArr2[i47] = j29;
                                            Object obj = objArr[iM80d2];
                                            objArr[iM80d2] = objArr[i47];
                                            objArr[i47] = obj;
                                            i47--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i13] & j16) | Long.MIN_VALUE;
                                        i47++;
                                        jArr5 = jArr2;
                                        i45 = i58;
                                        objArr2 = objArr;
                                    }
                                    j26 = j16;
                                } else {
                                    i47++;
                                }
                            }
                            i14 = i45;
                            this.f104f = AbstractC0015d1.m16a(this.f102d) - this.f103e;
                        }
                        iM80d = m80d(i17);
                    } else {
                        j15 = 128;
                    }
                    j13 = 255;
                    j14 = j18;
                    i13 = 0;
                    i14 = 1;
                    int iM17b = AbstractC0015d1.m17b(this.f102d);
                    long[] jArr6 = this.f99a;
                    long[] jArr7 = this.f100b;
                    Object[] objArr3 = this.f101c;
                    int i65 = this.f102d;
                    m82f(iM17b);
                    long[] jArr8 = this.f99a;
                    long[] jArr9 = this.f100b;
                    Object[] objArr4 = this.f101c;
                    int i66 = this.f102d;
                    int i67 = 0;
                    while (i67 < i65) {
                        if (((jArr6[i67 >> 3] >> ((i67 & 7) << 3)) & 255) < j15) {
                            long j34 = jArr7[i67];
                            int iHashCode3 = Long.hashCode(j34) * i36;
                            int i68 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM80d3 = m80d(i68 >>> 7);
                            jArr = jArr8;
                            long j35 = i68 & 127;
                            int i69 = iM80d3 >> 3;
                            int i74 = (iM80d3 & 7) << 3;
                            long j36 = (jArr[i69] & (~(255 << i74))) | (j35 << i74);
                            jArr[i69] = j36;
                            jArr[(((iM80d3 - 7) & i66) + (i66 & 7)) >> 3] = j36;
                            jArr9[iM80d3] = j34;
                            objArr4[iM80d3] = objArr3[i67];
                        } else {
                            jArr = jArr8;
                        }
                        i67++;
                        jArr6 = jArr6;
                        jArr8 = jArr;
                    }
                    iM80d = m80d(i17);
                }
                this.f103e++;
                int i75 = this.f104f;
                long[] jArr10 = this.f99a;
                int i76 = iM80d >> 3;
                long j37 = jArr10[i76];
                int i77 = (iM80d & 7) << 3;
                if (((j37 >> i77) & j13) != j15) {
                    i14 = i13;
                }
                this.f104f = i75 - i14;
                int i78 = this.f102d;
                long j38 = (j37 & (~(j13 << i77))) | (j14 << i77);
                jArr10[i76] = j38;
                jArr10[(((iM80d - 7) & i78) + (i78 & 7)) >> 3] = j38;
                return iM80d;
            }
            i25 = i29 + 8;
            i24 = (i24 + i25) & i19;
            i15 = i36;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m80d(int i13) {
        int i14 = this.f102d;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f99a;
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

    /* JADX INFO: renamed from: e */
    public final Object m81e(long j7) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j7) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f102d;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f99a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j13 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j14 = (((long) i14) * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i16) & i15;
                if (this.f100b[iNumberOfTrailingZeros] == j7) {
                    break loop0;
                }
            }
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f101c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final boolean equals(Object obj) {
        boolean z4;
        long[] jArr;
        boolean z13;
        long[] jArr2;
        boolean z14 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0035k0)) {
            return false;
        }
        C0035k0 c0035k0 = (C0035k0) obj;
        if (c0035k0.f103e != this.f103e) {
            return false;
        }
        long[] jArr3 = this.f100b;
        Object[] objArr = this.f101c;
        long[] jArr4 = this.f99a;
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
                        z13 = z14;
                        jArr2 = jArr3;
                        long j13 = jArr2[i16];
                        Object obj2 = objArr[i16];
                        if (obj2 == null) {
                            if (c0035k0.m81e(j13) != null || !c0035k0.m78b(j13)) {
                                break loop0;
                            }
                        } else if (!obj2.equals(c0035k0.m81e(j13))) {
                            return false;
                        }
                    } else {
                        z13 = z14;
                        jArr2 = jArr3;
                    }
                    j7 >>= 8;
                    i15++;
                    z14 = z13;
                    jArr3 = jArr2;
                }
                z4 = z14;
                jArr = jArr3;
                if (i14 != 8) {
                    return z4;
                }
            } else {
                z4 = z14;
                jArr = jArr3;
            }
            if (i13 == length) {
                return z4;
            }
            i13++;
            z14 = z4;
            jArr3 = jArr;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m82f(int i13) {
        long[] jArr;
        int iMax = i13 > 0 ? Math.max(7, AbstractC0015d1.m18c(i13)) : 0;
        this.f102d = iMax;
        if (iMax == 0) {
            jArr = AbstractC0015d1.f36a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
        }
        this.f99a = jArr;
        int i14 = iMax >> 3;
        long j7 = 255 << ((iMax & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j7)) | j7;
        this.f104f = AbstractC0015d1.m16a(this.f102d) - this.f103e;
        this.f100b = new long[iMax];
        this.f101c = new Object[iMax];
    }

    /* JADX INFO: renamed from: g */
    public final Object m83g(long j7) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j7) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f102d;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f99a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j13 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j14 = (((long) i14) * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i16) & i15;
                if (this.f100b[iNumberOfTrailingZeros] == j7) {
                    break loop0;
                }
            }
            if ((j13 & ((~j13) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f103e--;
        long[] jArr2 = this.f99a;
        int i24 = this.f102d;
        int i25 = iNumberOfTrailingZeros >> 3;
        int i26 = (iNumberOfTrailingZeros & 7) << 3;
        long j16 = (jArr2[i25] & (~(255 << i26))) | (254 << i26);
        jArr2[i25] = j16;
        jArr2[(((iNumberOfTrailingZeros - 7) & i24) + (i24 & 7)) >> 3] = j16;
        Object[] objArr = this.f101c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    /* JADX INFO: renamed from: h */
    public final void m84h(long j7, Object obj) {
        int iM79c = m79c(j7);
        this.f100b[iM79c] = j7;
        this.f101c[iM79c] = obj;
    }

    public final int hashCode() {
        long[] jArr = this.f100b;
        Object[] objArr = this.f101c;
        long[] jArr2 = this.f99a;
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
                        Object obj = objArr[i16];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(j13);
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
        if (this.f103e == 0) {
            return "{}";
        }
        StringBuilder sb4 = new StringBuilder("{");
        long[] jArr = this.f100b;
        Object[] objArr = this.f101c;
        long[] jArr2 = this.f99a;
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
                            Object obj = objArr[i19];
                            sb4.append(j13);
                            sb4.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb4.append(obj);
                            i16++;
                            if (i16 < this.f103e) {
                                sb4.append(", ");
                            }
                        } else {
                            i14 = i15;
                        }
                        j7 >>= 8;
                        i18++;
                        i15 = i14;
                    }
                    int i24 = i15;
                    if (i17 != 8) {
                        break;
                    }
                    i13 = i24;
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

    public /* synthetic */ C0035k0() {
        this(6);
    }
}
