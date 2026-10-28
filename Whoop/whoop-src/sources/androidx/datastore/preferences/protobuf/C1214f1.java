package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1214f1 {

    /* JADX INFO: renamed from: f */
    public static final C1214f1 f5390f = new C1214f1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f5391a;

    /* JADX INFO: renamed from: b */
    public int[] f5392b;

    /* JADX INFO: renamed from: c */
    public Object[] f5393c;

    /* JADX INFO: renamed from: d */
    public int f5394d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f5395e;

    public C1214f1(int i13, int[] iArr, Object[] objArr, boolean z4) {
        this.f5391a = i13;
        this.f5392b = iArr;
        this.f5393c = objArr;
        this.f5395e = z4;
    }

    /* JADX INFO: renamed from: a */
    public final void m3802a(int i13) {
        int[] iArr = this.f5392b;
        if (i13 > iArr.length) {
            int i14 = this.f5391a;
            int i15 = (i14 / 2) + i14;
            if (i15 >= i13) {
                i13 = i15;
            }
            if (i13 < 8) {
                i13 = 8;
            }
            this.f5392b = Arrays.copyOf(iArr, i13);
            this.f5393c = Arrays.copyOf(this.f5393c, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m3803b() {
        int iM3932s0;
        int iM3934u0;
        int iM3932s1;
        int i13 = this.f5394d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f5391a; i15++) {
            int i16 = this.f5392b[i15];
            int i17 = i16 >>> 3;
            int i18 = i16 & 7;
            if (i18 != 0) {
                if (i18 == 1) {
                    ((Long) this.f5393c[i15]).getClass();
                    iM3932s1 = C1236n.m3932s0(i17) + 8;
                } else if (i18 == 2) {
                    iM3932s1 = C1236n.m3930q0(i17, (C1218h) this.f5393c[i15]);
                } else if (i18 == 3) {
                    iM3932s0 = C1236n.m3932s0(i17) * 2;
                    iM3934u0 = ((C1214f1) this.f5393c[i15]).m3803b();
                } else {
                    if (i18 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.m3744b());
                    }
                    ((Integer) this.f5393c[i15]).getClass();
                    iM3932s1 = C1236n.m3932s0(i17) + 4;
                }
                i14 = iM3932s1 + i14;
            } else {
                long jLongValue = ((Long) this.f5393c[i15]).longValue();
                iM3932s0 = C1236n.m3932s0(i17);
                iM3934u0 = C1236n.m3934u0(jLongValue);
            }
            i14 = iM3934u0 + iM3932s0 + i14;
        }
        this.f5394d = i14;
        return i14;
    }

    /* JADX INFO: renamed from: c */
    public final void m3804c(int i13, Object obj) {
        if (!this.f5395e) {
            throw new UnsupportedOperationException();
        }
        m3802a(this.f5391a + 1);
        int[] iArr = this.f5392b;
        int i14 = this.f5391a;
        iArr[i14] = i13;
        this.f5393c[i14] = obj;
        this.f5391a = i14 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m3805d(C1225j0 c1225j0) {
        if (this.f5391a == 0) {
            return;
        }
        c1225j0.getClass();
        C1236n c1236n = (C1236n) c1225j0.f5411a;
        for (int i13 = 0; i13 < this.f5391a; i13++) {
            int i14 = this.f5392b[i13];
            Object obj = this.f5393c[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                c1236n.m3949O0(i15, ((Long) obj).longValue());
            } else if (i16 == 1) {
                c1236n.m3939E0(i15, ((Long) obj).longValue());
            } else if (i16 == 2) {
                c1236n.m3935A0(i15, (C1218h) obj);
            } else if (i16 == 3) {
                c1236n.m3946L0(i15, 3);
                ((C1214f1) obj).m3805d(c1225j0);
                c1236n.m3946L0(i15, 4);
            } else {
                if (i16 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.m3744b());
                }
                c1236n.m3937C0(i15, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1214f1)) {
            return false;
        }
        C1214f1 c1214f1 = (C1214f1) obj;
        int i13 = this.f5391a;
        if (i13 == c1214f1.f5391a) {
            int[] iArr = this.f5392b;
            int[] iArr2 = c1214f1.f5392b;
            for (int i14 = 0; i14 < i13; i14++) {
                if (iArr[i14] == iArr2[i14]) {
                }
            }
            Object[] objArr = this.f5393c;
            Object[] objArr2 = c1214f1.f5393c;
            int i15 = this.f5391a;
            for (int i16 = 0; i16 < i15; i16++) {
                if (objArr[i16].equals(objArr2[i16])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i13 = this.f5391a;
        int i14 = (527 + i13) * 31;
        int[] iArr = this.f5392b;
        int iHashCode = 17;
        int i15 = 17;
        for (int i16 = 0; i16 < i13; i16++) {
            i15 = (i15 * 31) + iArr[i16];
        }
        int i17 = (i14 + i15) * 31;
        Object[] objArr = this.f5393c;
        int i18 = this.f5391a;
        for (int i19 = 0; i19 < i18; i19++) {
            iHashCode = (iHashCode * 31) + objArr[i19].hashCode();
        }
        return i17 + iHashCode;
    }
}
