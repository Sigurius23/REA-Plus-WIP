package p002a0;

import m83.AbstractC25260n;
import p024b0.AbstractC2177a;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: a0.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0059w0 {

    /* JADX INFO: renamed from: a */
    public long[] f177a;

    /* JADX INFO: renamed from: b */
    public Object[] f178b;

    /* JADX INFO: renamed from: c */
    public int f179c;

    /* JADX INFO: renamed from: d */
    public int f180d;

    /* JADX INFO: renamed from: e */
    public int f181e;

    public C0059w0(int i13) {
        this.f177a = AbstractC0015d1.f36a;
        this.f178b = AbstractC2177a.f8659c;
        if (i13 >= 0) {
            m141f(AbstractC0015d1.m19d(i13));
        } else {
            AbstractC34924m.m110133O("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m136a(Object obj) {
        int i13 = this.f180d;
        this.f178b[m139d(obj)] = obj;
        return this.f180d != i13;
    }

    /* JADX INFO: renamed from: b */
    public final void m137b() {
        this.f180d = 0;
        long[] jArr = this.f177a;
        if (jArr != AbstractC0015d1.f36a) {
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f177a;
            int i13 = this.f179c;
            int i14 = i13 >> 3;
            long j7 = 255 << ((i13 & 7) << 3);
            jArr2[i14] = (jArr2[i14] & (~j7)) | j7;
        }
        AbstractC25260n.m74073n0(0, this.f179c, null, this.f178b);
        this.f181e = AbstractC0015d1.m16a(this.f179c) - this.f180d;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m138c(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f179c;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f177a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j7 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j13 = (((long) i14) * 72340172838076673L) ^ j7;
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i16) & i15;
                if (AbstractC22676k.m65745e(this.f178b[iNumberOfTrailingZeros], obj)) {
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
    public final int m139d(Object obj) {
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
        int i17 = this.f179c;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr2 = this.f177a;
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
                if (AbstractC22676k.m65745e(this.f178b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j18 &= j18 - 1;
                i13 = i27;
            }
            int i28 = i13;
            if ((((~j15) << 6) & j15 & (-9187201950435737472L)) != 0) {
                int iM140e = m140e(i15);
                long j19 = 255;
                if (this.f181e != 0 || ((this.f177a[iM140e >> 3] >> ((iM140e & 7) << 3)) & 255) == 254) {
                    j7 = 255;
                    j13 = j16;
                    j14 = 128;
                } else {
                    int i29 = this.f179c;
                    if (i29 > 8) {
                        int i34 = 8;
                        if (Long.compareUnsigned(((long) this.f180d) * 32, ((long) i29) * 25) <= 0) {
                            long[] jArr3 = this.f177a;
                            int i35 = this.f179c;
                            Object[] objArr2 = this.f178b;
                            int i36 = (i35 + 7) >> 3;
                            int i37 = 0;
                            j14 = 128;
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
                                    int iM140e2 = m140e(i48);
                                    int i49 = i48 & i35;
                                    if (((iM140e2 - i49) & i35) / i38 == ((i44 - i49) & i35) / i38) {
                                        long j28 = j26;
                                        jArr3[i45] = (((long) (i47 & 127)) << i46) | ((~(j7 << i46)) & jArr3[i45]);
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j28) | Long.MIN_VALUE;
                                        i44++;
                                        j26 = j28;
                                    } else {
                                        long j29 = j26;
                                        int i54 = iM140e2 >> 3;
                                        long j34 = jArr3[i54];
                                        int i55 = (iM140e2 & 7) << 3;
                                        if (((j34 >> i55) & j7) == 128) {
                                            objArr = objArr2;
                                            jArr3[i54] = ((~(j7 << i55)) & j34) | (((long) (i47 & 127)) << i55);
                                            jArr3[i45] = (jArr3[i45] & (~(j7 << i46))) | (128 << i46);
                                            objArr[iM140e2] = objArr[i44];
                                            objArr[i44] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i54] = (((long) (i47 & 127)) << i55) | ((~(j7 << i55)) & j34);
                                            Object obj3 = objArr[iM140e2];
                                            objArr[iM140e2] = objArr[i44];
                                            objArr[i44] = obj3;
                                            i44--;
                                        }
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j29) | Long.MIN_VALUE;
                                        i44++;
                                        j26 = j29;
                                        i38 = i38;
                                        i35 = i35;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i44++;
                                }
                            }
                            this.f181e = AbstractC0015d1.m16a(this.f179c) - this.f180d;
                        }
                        iM140e = m140e(i15);
                    }
                    j7 = 255;
                    j13 = j16;
                    j14 = 128;
                    int iM17b = AbstractC0015d1.m17b(this.f179c);
                    long[] jArr4 = this.f177a;
                    Object[] objArr3 = this.f178b;
                    int i56 = this.f179c;
                    m141f(iM17b);
                    long[] jArr5 = this.f177a;
                    Object[] objArr4 = this.f178b;
                    int i57 = this.f179c;
                    int i58 = 0;
                    while (i58 < i56) {
                        if (((jArr4[i58 >> 3] >> ((i58 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i58];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i28;
                            int i59 = iHashCode3 ^ (iHashCode3 << 16);
                            int iM140e3 = m140e(i59 >>> 7);
                            long j35 = i59 & 127;
                            int i64 = iM140e3 >> 3;
                            int i65 = (iM140e3 & 7) << 3;
                            jArr = jArr5;
                            long j36 = (jArr5[i64] & (~(255 << i65))) | (j35 << i65);
                            jArr[i64] = j36;
                            jArr[(((iM140e3 - 7) & i57) + (i57 & 7)) >> 3] = j36;
                            objArr4[iM140e3] = obj4;
                        } else {
                            jArr = jArr5;
                        }
                        i58++;
                        jArr4 = jArr4;
                        jArr5 = jArr;
                    }
                    iM140e = m140e(i15);
                }
                this.f180d++;
                int i66 = this.f181e;
                long[] jArr6 = this.f177a;
                int i67 = iM140e >> 3;
                long j37 = jArr6[i67];
                int i68 = (iM140e & 7) << 3;
                this.f181e = i66 - (((j37 >> i68) & j7) == j14 ? 1 : 0);
                int i69 = this.f179c;
                long j38 = (j37 & (~(j7 << i68))) | (j13 << i68);
                jArr6[i67] = j38;
                jArr6[(((iM140e - 7) & i69) + (i69 & 7)) >> 3] = j38;
                return iM140e;
            }
            i19 += 8;
            i18 = (i18 + i19) & i17;
            i16 = i26;
            i13 = i28;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m140e(int i13) {
        int i14 = this.f179c;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f177a;
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
        if (!(obj instanceof C0059w0)) {
            return false;
        }
        C0059w0 c0059w0 = (C0059w0) obj;
        if (c0059w0.f180d != this.f180d) {
            return false;
        }
        Object[] objArr = this.f178b;
        long[] jArr = this.f177a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j7 = jArr[i13];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j7) < 128 && !c0059w0.m138c(objArr[(i13 << 3) + i15])) {
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
    public final void m141f(int i13) {
        long[] jArr;
        int iMax = i13 > 0 ? Math.max(7, AbstractC0015d1.m18c(i13)) : 0;
        this.f179c = iMax;
        if (iMax == 0) {
            jArr = AbstractC0015d1.f36a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
        }
        this.f177a = jArr;
        int i14 = iMax >> 3;
        long j7 = 255 << ((iMax & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j7)) | j7;
        this.f181e = AbstractC0015d1.m16a(this.f179c) - this.f180d;
        this.f178b = iMax == 0 ? AbstractC2177a.f8659c : new Object[iMax];
    }

    /* JADX INFO: renamed from: g */
    public final boolean m142g() {
        return this.f180d == 0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m143h() {
        return this.f180d != 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f179c * 31) + this.f180d;
        Object[] objArr = this.f178b;
        long[] jArr = this.f177a;
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

    /* JADX INFO: renamed from: i */
    public final void m144i(Object obj) {
        int iNumberOfTrailingZeros;
        int i13 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f179c;
        int i17 = i14 >>> 7;
        loop0: while (true) {
            int i18 = i17 & i16;
            long[] jArr = this.f177a;
            int i19 = i18 >> 3;
            int i24 = (i18 & 7) << 3;
            long j7 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j13 = (((long) i15) * 72340172838076673L) ^ j7;
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i18) & i16;
                if (AbstractC22676k.m65745e(this.f178b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            } else {
                i13 += 8;
                i17 = i18 + i13;
            }
        }
        if (iNumberOfTrailingZeros >= 0) {
            m148m(iNumberOfTrailingZeros);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m145j(C0059w0 elements) {
        AbstractC22676k.m65750j(elements, "elements");
        Object[] objArr = elements.f178b;
        long[] jArr = elements.f177a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j7 = jArr[i13];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j7) < 128) {
                        m146k(objArr[(i13 << 3) + i15]);
                    }
                    j7 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m146k(Object obj) {
        this.f178b[m139d(obj)] = obj;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m147l(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f179c;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f177a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j7 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j13 = (((long) i14) * 72340172838076673L) ^ j7;
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i16) & i15;
                if (AbstractC22676k.m65745e(this.f178b[iNumberOfTrailingZeros], obj)) {
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
            m148m(iNumberOfTrailingZeros);
        }
        return z4;
    }

    /* JADX INFO: renamed from: m */
    public final void m148m(int i13) {
        this.f180d--;
        long[] jArr = this.f177a;
        int i14 = this.f179c;
        int i15 = i13 >> 3;
        int i16 = (i13 & 7) << 3;
        long j7 = (jArr[i15] & (~(255 << i16))) | (254 << i16);
        jArr[i15] = j7;
        jArr[(((i13 - 7) & i14) + (i14 & 7)) >> 3] = j7;
        this.f178b[i13] = null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066 A[DONT_INVERT, PHI: r8
      0x0066: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x0029, B:18:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0068 A[LOOP:0: B:5:0x001b->B:20:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[SYNTHETIC] */
    public final String toString() {
        C0006a1 c0006a1 = new C0006a1(this, 2);
        StringBuilder sb4 = new StringBuilder("[");
        Object[] objArr = this.f178b;
        long[] jArr = this.f177a;
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
                        Object obj = objArr[(i13 << 3) + i16];
                        if (i14 == -1) {
                            sb4.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i14 != 0) {
                            sb4.append((CharSequence) ", ");
                        }
                        sb4.append((CharSequence) c0006a1.invoke(obj));
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

    public /* synthetic */ C0059w0() {
        this(6);
    }
}
