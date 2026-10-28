package p002a0;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a0.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0050s {

    /* JADX INFO: renamed from: a */
    public long[] f148a;

    /* JADX INFO: renamed from: b */
    public int[] f149b;

    /* JADX INFO: renamed from: c */
    public Object[] f150c;

    /* JADX INFO: renamed from: d */
    public int f151d;

    /* JADX INFO: renamed from: e */
    public int f152e;

    /* JADX INFO: renamed from: a */
    public final boolean m120a(int i13) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    /* JADX INFO: renamed from: b */
    public final Object m121b(int i13) {
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
        if (iNumberOfTrailingZeros >= 0) {
            return this.f150c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[LOOP:0: B:14:0x0023->B:33:0x0071, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0074 A[EDGE_INSN: B:35:0x0074->B:34:0x0074 BREAK  A[LOOP:0: B:14:0x0023->B:33:0x0071], SYNTHETIC] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0050s)) {
            return false;
        }
        AbstractC0050s abstractC0050s = (AbstractC0050s) obj;
        if (abstractC0050s.f152e != this.f152e) {
            return false;
        }
        int[] iArr = this.f149b;
        Object[] objArr = this.f150c;
        long[] jArr = this.f148a;
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
                            int i17 = iArr[i16];
                            Object obj2 = objArr[i16];
                            if (obj2 == null) {
                                if (abstractC0050s.m121b(i17) != null || !abstractC0050s.m120a(i17)) {
                                    return false;
                                }
                            } else if (!obj2.equals(abstractC0050s.m121b(i17))) {
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

    public final int hashCode() {
        int[] iArr = this.f149b;
        Object[] objArr = this.f150c;
        long[] jArr = this.f148a;
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
                        Object obj = objArr[i16];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i17);
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
        if (this.f152e == 0) {
            return "{}";
        }
        StringBuilder sb4 = new StringBuilder("{");
        int[] iArr = this.f149b;
        Object[] objArr = this.f150c;
        long[] jArr = this.f148a;
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
                            Object obj = objArr[i17];
                            sb4.append(i18);
                            sb4.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb4.append(obj);
                            i14++;
                            if (i14 < this.f152e) {
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
