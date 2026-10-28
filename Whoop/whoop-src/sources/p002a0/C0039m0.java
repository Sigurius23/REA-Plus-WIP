package p002a0;

import m83.AbstractC25260n;
import p024b0.AbstractC2177a;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: a0.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0039m0 {

    /* JADX INFO: renamed from: a */
    public long[] f114a;

    /* JADX INFO: renamed from: b */
    public Object[] f115b;

    /* JADX INFO: renamed from: c */
    public int[] f116c;

    /* JADX INFO: renamed from: d */
    public int f117d;

    /* JADX INFO: renamed from: e */
    public int f118e;

    /* JADX INFO: renamed from: f */
    public int f119f;

    public C0039m0(int i13) {
        this.f114a = AbstractC0015d1.f36a;
        this.f115b = AbstractC2177a.f8659c;
        this.f116c = AbstractC0054u.f166a;
        if (i13 >= 0) {
            m93f(AbstractC0015d1.m19d(i13));
        } else {
            AbstractC34924m.m110133O("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m88a() {
        this.f118e = 0;
        long[] jArr = this.f114a;
        if (jArr != AbstractC0015d1.f36a) {
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f114a;
            int i13 = this.f117d;
            int i14 = i13 >> 3;
            long j7 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j7)) | j7;
        }
        AbstractC25260n.m74073n0(0, this.f117d, null, this.f115b);
        this.f119f = AbstractC0015d1.m16a(this.f117d) - this.f118e;
    }

    /* JADX INFO: renamed from: b */
    public final int m89b(int i13) {
        int i14 = this.f117d;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f114a;
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
    public final int m90c(Object obj) {
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
        int i17 = this.f117d;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr2 = this.f114a;
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
                if (AbstractC22676k.m65745e(this.f115b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j18 &= j18 - 1;
                i13 = i27;
            }
            int i28 = i13;
            if ((((~j15) << 6) & j15 & (-9187201950435737472L)) != 0) {
                int iM89b = m89b(i15);
                long j19 = 255;
                if (this.f119f != 0 || ((this.f114a[iM89b >> 3] >> ((iM89b & 7) << 3)) & 255) == 254) {
                    j7 = 255;
                    j13 = j16;
                    j14 = 128;
                } else {
                    int i29 = this.f117d;
                    if (i29 > 8) {
                        int i34 = 8;
                        if (Long.compareUnsigned(((long) this.f118e) * 32, ((long) i29) * 25) <= 0) {
                            long[] jArr3 = this.f114a;
                            int i35 = this.f117d;
                            Object[] objArr2 = this.f115b;
                            int[] iArr = this.f116c;
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
                            long j26 = 72057594037927935L;
                            jArr3[i39] = (jArr3[i39] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[iM74081v0] = jArr3[0];
                            int i44 = 0;
                            while (i44 != i35) {
                                int i45 = i44 >> 3;
                                int i46 = (i44 & 7) << 3;
                                long j27 = (jArr3[i45] >> i46) & j7;
                                if (j27 != 128 && j27 == 254) {
                                    Object obj2 = objArr2[i44];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i28;
                                    int i47 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i48 = i47 >>> 7;
                                    int iM89b2 = m89b(i48);
                                    int i49 = i48 & i35;
                                    long j28 = j26;
                                    if (((iM89b2 - i49) & i35) / 8 == ((i44 - i49) & i35) / i38) {
                                        jArr3[i45] = (((long) (i47 & 127)) << i46) | (jArr3[i45] & (~(j7 << i46)));
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j28) | Long.MIN_VALUE;
                                        i44++;
                                        i38 = i38;
                                        j26 = j28;
                                    } else {
                                        int i54 = i38;
                                        int i55 = iM89b2 >> 3;
                                        long j29 = jArr3[i55];
                                        int i56 = (iM89b2 & 7) << 3;
                                        if (((j29 >> i56) & j7) == 128) {
                                            objArr = objArr2;
                                            jArr3[i55] = ((~(j7 << i56)) & j29) | (((long) (i47 & 127)) << i56);
                                            jArr3[i45] = (jArr3[i45] & (~(j7 << i46))) | (128 << i46);
                                            objArr[iM89b2] = objArr[i44];
                                            objArr[i44] = null;
                                            iArr[iM89b2] = iArr[i44];
                                            iArr[i44] = 0;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i55] = (((long) (i47 & 127)) << i56) | ((~(j7 << i56)) & j29);
                                            Object obj3 = objArr[iM89b2];
                                            objArr[iM89b2] = objArr[i44];
                                            objArr[i44] = obj3;
                                            int i57 = iArr[iM89b2];
                                            iArr[iM89b2] = iArr[i44];
                                            iArr[i44] = i57;
                                            i44--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j28) | Long.MIN_VALUE;
                                        i44++;
                                        i35 = i35;
                                        i38 = i54;
                                        j26 = j28;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i44++;
                                }
                            }
                            this.f119f = AbstractC0015d1.m16a(this.f117d) - this.f118e;
                        }
                        iM89b = m89b(i15);
                    }
                    j7 = 255;
                    j13 = j16;
                    j14 = 128;
                    int iM17b = AbstractC0015d1.m17b(this.f117d);
                    long[] jArr4 = this.f114a;
                    Object[] objArr3 = this.f115b;
                    int[] iArr2 = this.f116c;
                    int i58 = this.f117d;
                    m93f(iM17b);
                    long[] jArr5 = this.f114a;
                    Object[] objArr4 = this.f115b;
                    int[] iArr3 = this.f116c;
                    int i59 = this.f117d;
                    int i64 = 0;
                    while (i64 < i58) {
                        if (((jArr4[i64 >> 3] >> ((i64 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i64];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i28;
                            int i65 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM89b3 = m89b(i65 >>> 7);
                            jArr = jArr5;
                            long j34 = i65 & 127;
                            int i66 = iM89b3 >> 3;
                            int i67 = (iM89b3 & 7) << 3;
                            long j35 = (jArr[i66] & (~(255 << i67))) | (j34 << i67);
                            jArr[i66] = j35;
                            jArr[(((iM89b3 - 7) & i59) + (i59 & 7)) >> 3] = j35;
                            objArr4[iM89b3] = obj4;
                            iArr3[iM89b3] = iArr2[i64];
                        } else {
                            jArr = jArr5;
                        }
                        i64++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iM89b = m89b(i15);
                }
                this.f118e++;
                int i68 = this.f119f;
                long[] jArr6 = this.f114a;
                int i69 = iM89b >> 3;
                long j36 = jArr6[i69];
                int i74 = (iM89b & 7) << 3;
                this.f119f = i68 - (((j36 >> i74) & j7) == j14 ? 1 : 0);
                int i75 = this.f117d;
                long j37 = (j36 & (~(j7 << i74))) | (j13 << i74);
                jArr6[i69] = j37;
                jArr6[(((iM89b - 7) & i75) + (i75 & 7)) >> 3] = j37;
                return ~iM89b;
            }
            i19 += 8;
            i18 = (i18 + i19) & i17;
            i16 = i26;
            i13 = i28;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m91d(Object obj) {
        int i13 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f117d;
        int i17 = i14 >>> 7;
        while (true) {
            int i18 = i17 & i16;
            long[] jArr = this.f114a;
            int i19 = i18 >> 3;
            int i24 = (i18 & 7) << 3;
            long j7 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j13 = (((long) i15) * 72340172838076673L) ^ j7;
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i18) & i16;
                if (AbstractC22676k.m65745e(this.f115b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i13 += 8;
            i17 = i18 + i13;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m92e(Object obj) {
        int iM91d = m91d(obj);
        if (iM91d >= 0) {
            return this.f116c[iM91d];
        }
        AbstractC34924m.m110136R("There is no key " + obj + " in the map");
        throw null;
    }

    public final boolean equals(Object obj) {
        boolean z4;
        boolean z13 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0039m0)) {
            return false;
        }
        C0039m0 c0039m0 = (C0039m0) obj;
        if (c0039m0.f118e != this.f118e) {
            return false;
        }
        Object[] objArr = this.f115b;
        int[] iArr = this.f116c;
        long[] jArr = this.f114a;
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
                        Object obj2 = objArr[i16];
                        int i17 = iArr[i16];
                        int iM91d = c0039m0.m91d(obj2);
                        if (iM91d < 0 || i17 != c0039m0.f116c[iM91d]) {
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
    public final void m93f(int i13) {
        long[] jArr;
        int iMax = i13 > 0 ? Math.max(7, AbstractC0015d1.m18c(i13)) : 0;
        this.f117d = iMax;
        if (iMax == 0) {
            jArr = AbstractC0015d1.f36a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
        }
        this.f114a = jArr;
        int i14 = iMax >> 3;
        long j7 = 255 << ((iMax & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j7)) | j7;
        this.f119f = AbstractC0015d1.m16a(this.f117d) - this.f118e;
        this.f115b = new Object[iMax];
        this.f116c = new int[iMax];
    }

    /* JADX INFO: renamed from: g */
    public final void m94g(int i13) {
        this.f118e--;
        long[] jArr = this.f114a;
        int i14 = this.f117d;
        int i15 = i13 >> 3;
        int i16 = (i13 & 7) << 3;
        long j7 = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        jArr[i15] = j7;
        jArr[(((i13 - 7) & i14) + (i14 & 7)) >> 3] = j7;
        this.f115b[i13] = null;
    }

    /* JADX INFO: renamed from: h */
    public final void m95h(Object obj, int i13) {
        int iM90c = m90c(obj);
        if (iM90c < 0) {
            iM90c = ~iM90c;
        }
        this.f115b[iM90c] = obj;
        this.f116c[iM90c] = i13;
    }

    public final int hashCode() {
        Object[] objArr = this.f115b;
        int[] iArr = this.f116c;
        long[] jArr = this.f114a;
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
                        iHashCode += Integer.hashCode(iArr[i16]) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[DONT_INVERT, PHI: r8
      0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[LOOP:0: B:9:0x001e->B:24:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[EDGE_INSN: B:28:0x006f->B:25:0x006f BREAK  A[LOOP:0: B:9:0x001e->B:24:0x006c], SYNTHETIC] */
    public final String toString() {
        if (this.f118e == 0) {
            return "{}";
        }
        StringBuilder sb4 = new StringBuilder("{");
        Object[] objArr = this.f115b;
        int[] iArr = this.f116c;
        long[] jArr = this.f114a;
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
                            int i18 = iArr[i17];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb4.append(obj);
                            sb4.append("=");
                            sb4.append(i18);
                            i14++;
                            if (i14 < this.f118e) {
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

    public /* synthetic */ C0039m0() {
        this(6);
    }
}
