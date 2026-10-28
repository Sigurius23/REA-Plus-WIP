package p002a0;

import m83.AbstractC25260n;
import p024b0.AbstractC2177a;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: a0.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0057v0 {

    /* JADX INFO: renamed from: a */
    public long[] f170a;

    /* JADX INFO: renamed from: b */
    public Object[] f171b;

    /* JADX INFO: renamed from: c */
    public Object[] f172c;

    /* JADX INFO: renamed from: d */
    public int f173d;

    /* JADX INFO: renamed from: e */
    public int f174e;

    /* JADX INFO: renamed from: f */
    public int f175f;

    public C0057v0(int i13) {
        this.f170a = AbstractC0015d1.f36a;
        Object[] objArr = AbstractC2177a.f8659c;
        this.f171b = objArr;
        this.f172c = objArr;
        if (i13 >= 0) {
            m130h(AbstractC0015d1.m19d(i13));
        } else {
            AbstractC34924m.m110133O("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m123a() {
        this.f174e = 0;
        long[] jArr = this.f170a;
        if (jArr != AbstractC0015d1.f36a) {
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f170a;
            int i13 = this.f173d;
            int i14 = i13 >> 3;
            long j7 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j7)) | j7;
        }
        AbstractC25260n.m74073n0(0, this.f173d, null, this.f172c);
        AbstractC25260n.m74073n0(0, this.f173d, null, this.f171b);
        this.f175f = AbstractC0015d1.m16a(this.f173d) - this.f174e;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m124b(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f173d;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f170a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j7 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j13 = (((long) i14) * 72340172838076673L) ^ j7;
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i16) & i15;
                if (AbstractC22676k.m65745e(this.f171b[iNumberOfTrailingZeros], obj)) {
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

    /* JADX INFO: renamed from: c */
    public final boolean m125c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f173d;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f170a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j7 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j13 = (((long) i14) * 72340172838076673L) ^ j7;
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i16) & i15;
                if (AbstractC22676k.m65745e(this.f171b[iNumberOfTrailingZeros], obj)) {
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

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[LOOP:0: B:5:0x000b->B:18:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final boolean m126d(Object obj) {
        Object[] objArr = this.f172c;
        long[] jArr = this.f170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j7 = jArr[i13];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j7) < 128 && AbstractC22676k.m65745e(obj, objArr[(i13 << 3) + i15])) {
                            return true;
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
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final int m127e(int i13) {
        int i14 = this.f173d;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f170a;
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

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0057v0)) {
            return false;
        }
        C0057v0 c0057v0 = (C0057v0) obj;
        if (c0057v0.f174e != this.f174e) {
            return false;
        }
        Object[] objArr = this.f171b;
        Object[] objArr2 = this.f172c;
        long[] jArr = this.f170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j7 = jArr[i13];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j7) < 128) {
                            int i16 = (i13 << 3) + i15;
                            Object obj2 = objArr[i16];
                            Object obj3 = objArr2[i16];
                            if (obj3 == null) {
                                if (c0057v0.m129g(obj2) != null || !c0057v0.m125c(obj2)) {
                                    return false;
                                }
                            } else if (!obj3.equals(c0057v0.m129g(obj2))) {
                                return false;
                            }
                        }
                        j7 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                    if (i13 != length) {
                        break;
                    }
                    i13++;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final int m128f(Object obj) {
        long j7;
        long j13;
        long j14;
        long[] jArr;
        Object[] objArr;
        int i13 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f173d;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr2 = this.f170a;
            int i24 = i18 >> 3;
            int i25 = (i18 & 7) << 3;
            long j15 = ((jArr2[i24 + 1] << (64 - i25)) & ((-i25) >> 63)) | (jArr2[i24] >>> i25);
            long j16 = i16;
            int i26 = i16;
            long j17 = j15 ^ (j16 * 72340172838076673L);
            long j18 = (~j17) & (j17 - 72340172838076673L) & (-9187201950435737472L);
            while (j18 != 0) {
                int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j18) >> 3)) & i17;
                int i27 = i13;
                if (AbstractC22676k.m65745e(this.f171b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j18 &= j18 - 1;
                i13 = i27;
            }
            int i28 = i13;
            if ((((~j15) << 6) & j15 & (-9187201950435737472L)) != 0) {
                int iM127e = m127e(i15);
                long j19 = 255;
                if (this.f175f != 0 || ((this.f170a[iM127e >> 3] >> ((iM127e & 7) << 3)) & 255) == 254) {
                    j7 = 255;
                    j13 = j16;
                    j14 = 128;
                } else {
                    int i29 = this.f173d;
                    if (i29 > 8) {
                        int i34 = 8;
                        if (Long.compareUnsigned(((long) this.f174e) * 32, ((long) i29) * 25) <= 0) {
                            long[] jArr3 = this.f170a;
                            int i35 = this.f173d;
                            Object[] objArr2 = this.f171b;
                            Object[] objArr3 = this.f172c;
                            j14 = 128;
                            int i36 = (i35 + 7) >> 3;
                            int i37 = 0;
                            while (i37 < i36) {
                                long j24 = j19;
                                long j25 = jArr3[i37] & (-9187201950435737472L);
                                jArr3[i37] = (-72340172838076674L) & ((~j25) + (j25 >>> 7));
                                i37++;
                                i34 = i34;
                                j16 = j16;
                                j19 = j24;
                            }
                            j7 = j19;
                            j13 = j16;
                            int i38 = i34;
                            int iM74081v0 = AbstractC25260n.m74081v0(jArr3);
                            int i39 = iM74081v0 - 1;
                            jArr3[i39] = (jArr3[i39] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iM74081v0] = jArr3[0];
                            int i44 = 0;
                            while (i44 != i35) {
                                int i45 = i44 >> 3;
                                int i46 = (i44 & 7) << 3;
                                long j26 = (jArr3[i45] >> i46) & j7;
                                if (j26 != 128 && j26 == 254) {
                                    Object obj2 = objArr2[i44];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i28;
                                    int i47 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i48 = i47 >>> 7;
                                    int iM127e2 = m127e(i48);
                                    int i49 = i48 & i35;
                                    if (((iM127e2 - i49) & i35) / i38 == ((i44 - i49) & i35) / i38) {
                                        jArr3[i45] = (((long) (i47 & 127)) << i46) | (jArr3[i45] & (~(j7 << i46)));
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i44++;
                                        i38 = i38;
                                    } else {
                                        int i54 = i38;
                                        int i55 = iM127e2 >> 3;
                                        long j27 = jArr3[i55];
                                        int i56 = (iM127e2 & 7) << 3;
                                        if (((j27 >> i56) & j7) == 128) {
                                            objArr = objArr2;
                                            jArr3[i55] = ((~(j7 << i56)) & j27) | (((long) (i47 & 127)) << i56);
                                            jArr3[i45] = (jArr3[i45] & (~(j7 << i46))) | (128 << i46);
                                            objArr[iM127e2] = objArr[i44];
                                            objArr[i44] = null;
                                            objArr3[iM127e2] = objArr3[i44];
                                            objArr3[i44] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i55] = (((long) (i47 & 127)) << i56) | ((~(j7 << i56)) & j27);
                                            Object obj3 = objArr[iM127e2];
                                            objArr[iM127e2] = objArr[i44];
                                            objArr[i44] = obj3;
                                            Object obj4 = objArr3[iM127e2];
                                            objArr3[iM127e2] = objArr3[i44];
                                            objArr3[i44] = obj4;
                                            i44--;
                                        }
                                        jArr3[jArr3.length - 1] = jArr3[0];
                                        i44++;
                                        i38 = i54;
                                        i35 = i35;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i44++;
                                }
                            }
                            this.f175f = AbstractC0015d1.m16a(this.f173d) - this.f174e;
                        }
                        iM127e = m127e(i15);
                    }
                    j7 = 255;
                    j13 = j16;
                    j14 = 128;
                    int iM17b = AbstractC0015d1.m17b(this.f173d);
                    long[] jArr4 = this.f170a;
                    Object[] objArr4 = this.f171b;
                    Object[] objArr5 = this.f172c;
                    int i57 = this.f173d;
                    m130h(iM17b);
                    long[] jArr5 = this.f170a;
                    Object[] objArr6 = this.f171b;
                    Object[] objArr7 = this.f172c;
                    int i58 = this.f173d;
                    int i59 = 0;
                    while (i59 < i57) {
                        if (((jArr4[i59 >> 3] >> ((i59 & 7) << 3)) & 255) < 128) {
                            Object obj5 = objArr4[i59];
                            int iHashCode3 = (obj5 != null ? obj5.hashCode() : 0) * i28;
                            int i64 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM127e3 = m127e(i64 >>> 7);
                            jArr = jArr5;
                            long j28 = i64 & 127;
                            int i65 = iM127e3 >> 3;
                            int i66 = (iM127e3 & 7) << 3;
                            long j29 = (jArr[i65] & (~(255 << i66))) | (j28 << i66);
                            jArr[i65] = j29;
                            jArr[(((iM127e3 - 7) & i58) + (i58 & 7)) >> 3] = j29;
                            objArr6[iM127e3] = obj5;
                            objArr7[iM127e3] = objArr5[i59];
                        } else {
                            jArr = jArr5;
                        }
                        i59++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iM127e = m127e(i15);
                }
                this.f174e++;
                int i67 = this.f175f;
                long[] jArr6 = this.f170a;
                int i68 = iM127e >> 3;
                long j34 = jArr6[i68];
                int i69 = (iM127e & 7) << 3;
                this.f175f = i67 - (((j34 >> i69) & j7) == j14 ? 1 : 0);
                int i74 = this.f173d;
                long j35 = (j34 & (~(j7 << i69))) | (j13 << i69);
                jArr6[i68] = j35;
                jArr6[(((iM127e - 7) & i74) + (i74 & 7)) >> 3] = j35;
                return ~iM127e;
            }
            i19 += 8;
            i18 = (i18 + i19) & i17;
            i16 = i26;
            i13 = i28;
        }
    }

    /* JADX INFO: renamed from: g */
    public final Object m129g(Object obj) {
        int iNumberOfTrailingZeros;
        int i13 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f173d;
        int i17 = i14 >>> 7;
        loop0: while (true) {
            int i18 = i17 & i16;
            long[] jArr = this.f170a;
            int i19 = i18 >> 3;
            int i24 = (i18 & 7) << 3;
            long j7 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j13 = (((long) i15) * 72340172838076673L) ^ j7;
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i18) & i16;
                if (AbstractC22676k.m65745e(this.f171b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i13 += 8;
            i17 = i18 + i13;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f172c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m130h(int i13) {
        long[] jArr;
        int iMax = i13 > 0 ? Math.max(7, AbstractC0015d1.m18c(i13)) : 0;
        this.f173d = iMax;
        if (iMax == 0) {
            jArr = AbstractC0015d1.f36a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
            int i14 = iMax >> 3;
            long j7 = 255 << ((iMax & 7) << 3);
            jArr[i14] = (jArr[i14] & (~j7)) | j7;
        }
        this.f170a = jArr;
        this.f175f = AbstractC0015d1.m16a(this.f173d) - this.f174e;
        Object[] objArr = AbstractC2177a.f8659c;
        this.f171b = iMax == 0 ? objArr : new Object[iMax];
        if (iMax != 0) {
            objArr = new Object[iMax];
        }
        this.f172c = objArr;
    }

    public final int hashCode() {
        Object[] objArr = this.f171b;
        Object[] objArr2 = this.f172c;
        long[] jArr = this.f170a;
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
                        Object obj = objArr[i16];
                        Object obj2 = objArr2[i16];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX INFO: renamed from: i */
    public final boolean m131i() {
        return this.f174e == 0;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m132j() {
        return this.f174e != 0;
    }

    /* JADX INFO: renamed from: k */
    public final Object m133k(Object obj) {
        int iNumberOfTrailingZeros;
        int i13 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f173d;
        int i17 = i14 >>> 7;
        loop0: while (true) {
            int i18 = i17 & i16;
            long[] jArr = this.f170a;
            int i19 = i18 >> 3;
            int i24 = (i18 & 7) << 3;
            long j7 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j13 = (((long) i15) * 72340172838076673L) ^ j7;
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i18) & i16;
                if (AbstractC22676k.m65745e(this.f171b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i13 += 8;
            i17 = i18 + i13;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return m134l(iNumberOfTrailingZeros);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final Object m134l(int i13) {
        this.f174e--;
        long[] jArr = this.f170a;
        int i14 = this.f173d;
        int i15 = i13 >> 3;
        int i16 = (i13 & 7) << 3;
        long j7 = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        jArr[i15] = j7;
        jArr[(((i13 - 7) & i14) + (i14 & 7)) >> 3] = j7;
        this.f171b[i13] = null;
        Object[] objArr = this.f172c;
        Object obj = objArr[i13];
        objArr[i13] = null;
        return obj;
    }

    /* JADX INFO: renamed from: m */
    public final void m135m(Object obj, Object obj2) {
        int iM128f = m128f(obj);
        if (iM128f < 0) {
            iM128f = ~iM128f;
        }
        this.f171b[iM128f] = obj;
        this.f172c[iM128f] = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[DONT_INVERT, PHI: r8
      0x0072: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:25:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0074 A[LOOP:0: B:9:0x0020->B:27:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0077 A[EDGE_INSN: B:31:0x0077->B:28:0x0077 BREAK  A[LOOP:0: B:9:0x0020->B:27:0x0074], SYNTHETIC] */
    public final String toString() {
        if (m131i()) {
            return "{}";
        }
        StringBuilder sb4 = new StringBuilder("{");
        Object[] objArr = this.f171b;
        Object[] objArr2 = this.f172c;
        long[] jArr = this.f170a;
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
                            Object obj = objArr[i17];
                            Object obj2 = objArr2[i17];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb4.append(obj);
                            sb4.append("=");
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb4.append(obj2);
                            i14++;
                            if (i14 < this.f174e) {
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

    public /* synthetic */ C0057v0() {
        this(6);
    }
}
