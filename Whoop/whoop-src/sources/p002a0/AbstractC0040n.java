package p002a0;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a0.n */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC0040n {

    /* JADX INFO: renamed from: a */
    public long[] f120a;

    /* JADX INFO: renamed from: b */
    public int[] f121b;

    /* JADX INFO: renamed from: c */
    public float[] f122c;

    /* JADX INFO: renamed from: d */
    public int f123d;

    /* JADX INFO: renamed from: e */
    public int f124e;

    /* JADX INFO: renamed from: a */
    public final int m96a(int i13) {
        int iHashCode = Integer.hashCode(i13) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 & 127;
        int i16 = this.f123d;
        int i17 = (i14 >>> 7) & i16;
        int i18 = 0;
        while (true) {
            long[] jArr = this.f120a;
            int i19 = i17 >> 3;
            int i24 = (i17 & 7) << 3;
            long j7 = ((jArr[i19 + 1] << (64 - i24)) & ((-i24) >> 63)) | (jArr[i19] >>> i24);
            long j13 = (((long) i15) * 72340172838076673L) ^ j7;
            for (long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L); j14 != 0; j14 &= j14 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i17) & i16;
                if (this.f121b[iNumberOfTrailingZeros] == i13) {
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

    public final boolean equals(Object obj) {
        boolean z4;
        boolean z13 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0040n)) {
            return false;
        }
        AbstractC0040n abstractC0040n = (AbstractC0040n) obj;
        if (abstractC0040n.f124e != this.f124e) {
            return false;
        }
        int[] iArr = this.f121b;
        float[] fArr = this.f122c;
        long[] jArr = this.f120a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i13 = 0;
        while (true) {
            long j7 = jArr[i13];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((255 & j7) < 128) {
                        int i16 = (i13 << 3) + i15;
                        int i17 = iArr[i16];
                        float f13 = fArr[i16];
                        int iM96a = abstractC0040n.m96a(i17);
                        if (iM96a < 0 || f13 != abstractC0040n.f122c[iM96a]) {
                            return false;
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
    }

    public final int hashCode() {
        int[] iArr = this.f121b;
        float[] fArr = this.f122c;
        long[] jArr = this.f120a;
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
                        iHashCode += Float.hashCode(fArr[i16]) ^ Integer.hashCode(i17);
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
        if (this.f124e == 0) {
            return "{}";
        }
        StringBuilder sb4 = new StringBuilder("{");
        int[] iArr = this.f121b;
        float[] fArr = this.f122c;
        long[] jArr = this.f120a;
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
                            float f13 = fArr[i17];
                            sb4.append(i18);
                            sb4.append("=");
                            sb4.append(f13);
                            i14++;
                            if (i14 < this.f124e) {
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
}
