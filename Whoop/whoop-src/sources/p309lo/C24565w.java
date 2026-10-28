package p309lo;

import java.util.Arrays;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: lo.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C24565w {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f95866a;

    /* JADX INFO: renamed from: b */
    public long[] f95867b;

    /* JADX INFO: renamed from: c */
    public Object[] f95868c;

    /* JADX INFO: renamed from: d */
    public int f95869d;

    /* JADX INFO: renamed from: e */
    public int f95870e;

    public C24565w(int i13) {
        this.f95866a = i13;
        switch (i13) {
            case 1:
                this.f95867b = new long[10];
                this.f95868c = new Object[10];
                break;
            default:
                this.f95867b = new long[10];
                this.f95868c = new Object[10];
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m71651a(long j7, Object obj) {
        int i13 = this.f95866a;
        synchronized (this) {
            switch (i13) {
                case 0:
                    int i14 = this.f95870e;
                    if (i14 > 0) {
                        if (j7 <= this.f95867b[((this.f95869d + i14) - 1) % this.f95868c.length]) {
                            m71652b();
                        }
                    }
                    m71653c();
                    int i15 = this.f95869d;
                    int i16 = this.f95870e;
                    Object[] objArr = this.f95868c;
                    int length = (i15 + i16) % objArr.length;
                    this.f95867b[length] = j7;
                    objArr[length] = obj;
                    this.f95870e = i16 + 1;
                    return;
                default:
                    int i17 = this.f95870e;
                    if (i17 > 0) {
                        if (j7 <= this.f95867b[((this.f95869d + i17) - 1) % this.f95868c.length]) {
                            m71652b();
                        }
                    }
                    m71653c();
                    int i18 = this.f95869d;
                    int i19 = this.f95870e;
                    Object[] objArr2 = this.f95868c;
                    int length2 = (i18 + i19) % objArr2.length;
                    this.f95867b[length2] = j7;
                    objArr2[length2] = obj;
                    this.f95870e = i19 + 1;
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m71652b() {
        int i13 = this.f95866a;
        synchronized (this) {
            switch (i13) {
                case 0:
                    this.f95869d = 0;
                    this.f95870e = 0;
                    Arrays.fill(this.f95868c, (Object) null);
                    return;
                default:
                    this.f95869d = 0;
                    this.f95870e = 0;
                    Arrays.fill(this.f95868c, (Object) null);
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m71653c() {
        switch (this.f95866a) {
            case 0:
                int length = this.f95868c.length;
                if (this.f95870e >= length) {
                    int i13 = length * 2;
                    long[] jArr = new long[i13];
                    Object[] objArr = new Object[i13];
                    int i14 = this.f95869d;
                    int i15 = length - i14;
                    System.arraycopy(this.f95867b, i14, jArr, 0, i15);
                    System.arraycopy(this.f95868c, this.f95869d, objArr, 0, i15);
                    int i16 = this.f95869d;
                    if (i16 > 0) {
                        System.arraycopy(this.f95867b, 0, jArr, i15, i16);
                        System.arraycopy(this.f95868c, 0, objArr, i15, this.f95869d);
                    }
                    this.f95867b = jArr;
                    this.f95868c = objArr;
                    this.f95869d = 0;
                    break;
                }
                break;
            default:
                int length2 = this.f95868c.length;
                if (this.f95870e >= length2) {
                    int i17 = length2 * 2;
                    long[] jArr2 = new long[i17];
                    Object[] objArr2 = new Object[i17];
                    int i18 = this.f95869d;
                    int i19 = length2 - i18;
                    System.arraycopy(this.f95867b, i18, jArr2, 0, i19);
                    System.arraycopy(this.f95868c, this.f95869d, objArr2, 0, i19);
                    int i24 = this.f95869d;
                    if (i24 > 0) {
                        System.arraycopy(this.f95867b, 0, jArr2, i19, i24);
                        System.arraycopy(this.f95868c, 0, objArr2, i19, this.f95869d);
                    }
                    this.f95867b = jArr2;
                    this.f95868c = objArr2;
                    this.f95869d = 0;
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m71654d(long j7, boolean z4) {
        switch (this.f95866a) {
            case 0:
                Object objM71657g = null;
                long j13 = Long.MAX_VALUE;
                while (this.f95870e > 0) {
                    long j14 = j7 - this.f95867b[this.f95869d];
                    if (j14 < 0 && (z4 || (-j14) >= j13)) {
                        return objM71657g;
                    }
                    objM71657g = m71657g();
                    j13 = j14;
                }
                return objM71657g;
            default:
                Object objM71657g2 = null;
                long j15 = Long.MAX_VALUE;
                while (this.f95870e > 0) {
                    long j16 = j7 - this.f95867b[this.f95869d];
                    if (j16 < 0 && (z4 || (-j16) >= j15)) {
                        return objM71657g2;
                    }
                    objM71657g2 = m71657g();
                    j15 = j16;
                }
                return objM71657g2;
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized Object m71655e() {
        return this.f95870e == 0 ? null : m71657g();
    }

    /* JADX INFO: renamed from: f */
    public synchronized Object m71656f(long j7) {
        return m71654d(j7, true);
    }

    /* JADX INFO: renamed from: g */
    public final Object m71657g() {
        switch (this.f95866a) {
            case 0:
                AbstractC24543a.m71573i(this.f95870e > 0);
                Object[] objArr = this.f95868c;
                int i13 = this.f95869d;
                Object obj = objArr[i13];
                objArr[i13] = null;
                this.f95869d = (i13 + 1) % objArr.length;
                this.f95870e--;
                return obj;
            default:
                AbstractC35849g.m113807i(this.f95870e > 0);
                Object[] objArr2 = this.f95868c;
                int i14 = this.f95869d;
                Object obj2 = objArr2[i14];
                objArr2[i14] = null;
                this.f95869d = (i14 + 1) % objArr2.length;
                this.f95870e--;
                return obj2;
        }
    }

    /* JADX INFO: renamed from: h */
    public synchronized int m71658h() {
        return this.f95870e;
    }
}
