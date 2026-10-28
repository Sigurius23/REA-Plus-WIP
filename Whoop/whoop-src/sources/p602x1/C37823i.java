package p602x1;

/* JADX INFO: renamed from: x1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C37823i {

    /* JADX INFO: renamed from: a */
    public final int f161979a;

    /* JADX INFO: renamed from: b */
    public final long[] f161980b;

    /* JADX INFO: renamed from: c */
    public final Object[] f161981c;

    public C37823i(int i13, long[] jArr, Object[] objArr) {
        this.f161979a = i13;
        this.f161980b = jArr;
        this.f161981c = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final int m121356a(long j7) {
        int i13 = this.f161979a - 1;
        if (i13 != -1) {
            long[] jArr = this.f161980b;
            int i14 = 0;
            if (i13 != 0) {
                while (i14 <= i13) {
                    int i15 = (i14 + i13) >>> 1;
                    long j13 = jArr[i15] - j7;
                    if (j13 < 0) {
                        i14 = i15 + 1;
                    } else {
                        if (j13 <= 0) {
                            return i15;
                        }
                        i13 = i15 - 1;
                    }
                }
                return -(i14 + 1);
            }
            long j14 = jArr[0];
            if (j14 == j7) {
                return 0;
            }
            if (j14 > j7) {
                return -2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final C37823i m121357b(long j7, Object obj) {
        long[] jArr;
        int i13;
        Object[] objArr = this.f161981c;
        int i14 = 0;
        int i15 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i15++;
            }
        }
        int i16 = i15 + 1;
        long[] jArr2 = new long[i16];
        Object[] objArr2 = new Object[i16];
        if (i16 > 1) {
            int i17 = 0;
            while (true) {
                jArr = this.f161980b;
                i13 = this.f161979a;
                if (i14 >= i16 || i17 >= i13) {
                    break;
                }
                long j13 = jArr[i17];
                Object obj3 = objArr[i17];
                if (j13 > j7) {
                    jArr2[i14] = j7;
                    objArr2[i14] = obj;
                    i14++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i14] = j13;
                    objArr2[i14] = obj3;
                    i14++;
                }
                i17++;
            }
            if (i17 == i13) {
                jArr2[i15] = j7;
                objArr2[i15] = obj;
            } else {
                while (i14 < i16) {
                    long j14 = jArr[i17];
                    Object obj4 = objArr[i17];
                    if (obj4 != null) {
                        jArr2[i14] = j14;
                        objArr2[i14] = obj4;
                        i14++;
                    }
                    i17++;
                }
            }
        } else {
            jArr2[0] = j7;
            objArr2[0] = obj;
        }
        return new C37823i(i16, jArr2, objArr2);
    }
}
