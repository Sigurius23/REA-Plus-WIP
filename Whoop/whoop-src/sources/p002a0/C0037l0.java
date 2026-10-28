package p002a0;

import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;

/* JADX INFO: renamed from: a0.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0037l0 {

    /* JADX INFO: renamed from: a */
    public long[] f106a = AbstractC0015d1.f36a;

    /* JADX INFO: renamed from: b */
    public long[] f107b = AbstractC0060x.f182a;

    /* JADX INFO: renamed from: c */
    public int f108c;

    /* JADX INFO: renamed from: d */
    public int f109d;

    /* JADX INFO: renamed from: e */
    public int f110e;

    public C0037l0(int i13) {
        if (i13 >= 0) {
            m87c(AbstractC0015d1.m19d(i13));
        } else {
            AbstractC34924m.m110133O("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m85a(long j7) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j7) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 & 127;
        int i15 = this.f108c;
        int i16 = (i13 >>> 7) & i15;
        int i17 = 0;
        loop0: while (true) {
            long[] jArr = this.f106a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j13 = ((jArr[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr[i18] >>> i19);
            long j14 = (((long) i14) * 72340172838076673L) ^ j13;
            for (long j15 = (~j14) & (j14 - 72340172838076673L) & (-9187201950435737472L); j15 != 0; j15 &= j15 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j15) >> 3) + i16) & i15;
                if (this.f107b[iNumberOfTrailingZeros] == j7) {
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

    /* JADX INFO: renamed from: b */
    public final int m86b(int i13) {
        int i14 = this.f108c;
        int i15 = i13 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr = this.f106a;
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
    public final void m87c(int i13) {
        long[] jArr;
        int iMax = i13 > 0 ? Math.max(7, AbstractC0015d1.m18c(i13)) : 0;
        this.f108c = iMax;
        if (iMax == 0) {
            jArr = AbstractC0015d1.f36a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            AbstractC25260n.m74075p0(jArr, -9187201950435737472L);
        }
        this.f106a = jArr;
        int i14 = iMax >> 3;
        long j7 = 255 << ((iMax & 7) << 3);
        jArr[i14] = (jArr[i14] & (~j7)) | j7;
        this.f110e = AbstractC0015d1.m16a(this.f108c) - this.f109d;
        this.f107b = new long[iMax];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0037l0)) {
            return false;
        }
        C0037l0 c0037l0 = (C0037l0) obj;
        if (c0037l0.f109d != this.f109d) {
            return false;
        }
        long[] jArr = this.f107b;
        long[] jArr2 = this.f106a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j7 = jArr2[i13];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j7) < 128 && !c0037l0.m85a(jArr[(i13 << 3) + i15])) {
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

    public final int hashCode() {
        long[] jArr = this.f107b;
        long[] jArr2 = this.f106a;
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
                        iHashCode = Long.hashCode(jArr[(i13 << 3) + i15]) + iHashCode;
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
        long[] jArr = this.f107b;
        long[] jArr2 = this.f106a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb4.append((CharSequence) "]");
            break;
        }
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            long j7 = jArr2[i13];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((255 & j7) < 128) {
                        long j13 = jArr[(i13 << 3) + i16];
                        if (i14 == -1) {
                            sb4.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i14 != 0) {
                            sb4.append((CharSequence) ", ");
                        }
                        sb4.append(j13);
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
}
