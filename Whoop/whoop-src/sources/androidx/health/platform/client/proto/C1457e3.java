package androidx.health.platform.client.proto;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.e3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1457e3 {

    /* JADX INFO: renamed from: f */
    public static final C1457e3 f6031f = new C1457e3(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f6032a;

    /* JADX INFO: renamed from: b */
    public int[] f6033b;

    /* JADX INFO: renamed from: c */
    public Object[] f6034c;

    /* JADX INFO: renamed from: d */
    public int f6035d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f6036e;

    public C1457e3(int i13, int[] iArr, Object[] objArr, boolean z4) {
        this.f6032a = i13;
        this.f6033b = iArr;
        this.f6034c = objArr;
        this.f6036e = z4;
    }

    /* JADX INFO: renamed from: c */
    public static C1457e3 m4602c() {
        return new C1457e3(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final void m4603a(int i13) {
        int[] iArr = this.f6033b;
        if (i13 > iArr.length) {
            int i14 = this.f6032a;
            int i15 = (i14 / 2) + i14;
            if (i15 >= i13) {
                i13 = i15;
            }
            if (i13 < 8) {
                i13 = 8;
            }
            this.f6033b = Arrays.copyOf(iArr, i13);
            this.f6034c = Arrays.copyOf(this.f6034c, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m4604b() {
        int iM4656C;
        int iM4658E;
        int iM4662y;
        int i13 = this.f6035d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f6032a; i15++) {
            int i16 = this.f6033b[i15];
            int i17 = i16 >>> 3;
            int i18 = i16 & 7;
            if (i18 != 0) {
                if (i18 == 1) {
                    ((Long) this.f6034c[i15]).getClass();
                    iM4662y = C1483k.m4662y(i17);
                } else if (i18 == 2) {
                    iM4662y = C1483k.m4659v(i17, (C1468h) this.f6034c[i15]);
                } else if (i18 == 3) {
                    iM4656C = C1483k.m4656C(i17) * 2;
                    iM4658E = ((C1457e3) this.f6034c[i15]).m4604b();
                } else {
                    if (i18 != 5) {
                        int i19 = InvalidProtocolBufferException.f6012w;
                        throw new IllegalStateException(new InvalidProtocolBufferException.InvalidWireTypeException("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f6034c[i15]).getClass();
                    iM4662y = C1483k.m4661x(i17);
                }
                i14 = iM4662y + i14;
            } else {
                long jLongValue = ((Long) this.f6034c[i15]).longValue();
                iM4656C = C1483k.m4656C(i17);
                iM4658E = C1483k.m4658E(jLongValue);
            }
            i14 = iM4658E + iM4656C + i14;
        }
        this.f6035d = i14;
        return i14;
    }

    /* JADX INFO: renamed from: d */
    public final void m4605d(int i13, Object obj) {
        if (!this.f6036e) {
            throw new UnsupportedOperationException();
        }
        m4603a(this.f6032a + 1);
        int[] iArr = this.f6033b;
        int i14 = this.f6032a;
        iArr[i14] = i13;
        this.f6034c[i14] = obj;
        this.f6032a = i14 + 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m4606e(C1465g1 c1465g1) throws CodedOutputStream$OutOfSpaceException {
        if (this.f6032a == 0) {
            return;
        }
        c1465g1.getClass();
        C1483k c1483k = (C1483k) c1465g1.f6042a;
        for (int i13 = 0; i13 < this.f6032a; i13++) {
            int i14 = this.f6033b[i13];
            Object obj = this.f6034c[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                c1483k.m4675Q(i15, ((Long) obj).longValue());
            } else if (i16 == 1) {
                c1483k.m4669K(i15, ((Long) obj).longValue());
            } else if (i16 == 2) {
                c1465g1.m4624a(i15, (C1468h) obj);
            } else if (i16 == 3) {
                c1483k.m4673O(i15, 3);
                ((C1457e3) obj).m4606e(c1465g1);
                c1483k.m4673O(i15, 4);
            } else {
                if (i16 != 5) {
                    int i17 = InvalidProtocolBufferException.f6012w;
                    throw new RuntimeException(new InvalidProtocolBufferException.InvalidWireTypeException("Protocol message tag had invalid wire type."));
                }
                c1483k.m4667I(i15, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1457e3)) {
            return false;
        }
        C1457e3 c1457e3 = (C1457e3) obj;
        int i13 = this.f6032a;
        if (i13 == c1457e3.f6032a) {
            int[] iArr = this.f6033b;
            int[] iArr2 = c1457e3.f6033b;
            for (int i14 = 0; i14 < i13; i14++) {
                if (iArr[i14] == iArr2[i14]) {
                }
            }
            Object[] objArr = this.f6034c;
            Object[] objArr2 = c1457e3.f6034c;
            int i15 = this.f6032a;
            for (int i16 = 0; i16 < i15; i16++) {
                if (objArr[i16].equals(objArr2[i16])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i13 = this.f6032a;
        int i14 = (527 + i13) * 31;
        int[] iArr = this.f6033b;
        int iHashCode = 17;
        int i15 = 17;
        for (int i16 = 0; i16 < i13; i16++) {
            i15 = (i15 * 31) + iArr[i16];
        }
        int i17 = (i14 + i15) * 31;
        Object[] objArr = this.f6034c;
        int i18 = this.f6032a;
        for (int i19 = 0; i19 < i18; i19++) {
            iHashCode = (iHashCode * 31) + objArr[i19].hashCode();
        }
        return i17 + iHashCode;
    }
}
