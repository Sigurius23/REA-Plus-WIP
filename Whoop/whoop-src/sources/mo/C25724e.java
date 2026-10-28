package mo;

import java.util.Arrays;

/* JADX INFO: renamed from: mo.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C25724e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101341a;

    /* JADX INFO: renamed from: b */
    public long f101342b;

    /* JADX INFO: renamed from: c */
    public long f101343c;

    /* JADX INFO: renamed from: d */
    public long f101344d;

    /* JADX INFO: renamed from: e */
    public long f101345e;

    /* JADX INFO: renamed from: f */
    public long f101346f;

    /* JADX INFO: renamed from: g */
    public long f101347g;

    /* JADX INFO: renamed from: h */
    public final boolean[] f101348h;

    /* JADX INFO: renamed from: i */
    public int f101349i;

    public C25724e(int i13) {
        this.f101341a = i13;
        switch (i13) {
            case 1:
                this.f101348h = new boolean[15];
                break;
            default:
                this.f101348h = new boolean[15];
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m75844a() {
        switch (this.f101341a) {
            case 0:
                return this.f101345e > 15 && this.f101349i == 0;
            default:
                return this.f101345e > 15 && this.f101349i == 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m75845b(long j7) {
        switch (this.f101341a) {
            case 0:
                long j13 = this.f101345e;
                if (j13 == 0) {
                    this.f101342b = j7;
                } else if (j13 == 1) {
                    long j14 = j7 - this.f101342b;
                    this.f101343c = j14;
                    this.f101347g = j14;
                    this.f101346f = 1L;
                } else {
                    long j15 = j7 - this.f101344d;
                    int i13 = (int) (j13 % 15);
                    long jAbs = Math.abs(j15 - this.f101343c);
                    boolean[] zArr = this.f101348h;
                    if (jAbs <= 1000000) {
                        this.f101346f++;
                        this.f101347g += j15;
                        if (zArr[i13]) {
                            zArr[i13] = false;
                            this.f101349i--;
                        }
                    } else if (!zArr[i13]) {
                        zArr[i13] = true;
                        this.f101349i++;
                    }
                }
                this.f101345e++;
                this.f101344d = j7;
                break;
            default:
                long j16 = this.f101345e;
                if (j16 == 0) {
                    this.f101342b = j7;
                } else if (j16 == 1) {
                    long j17 = j7 - this.f101342b;
                    this.f101343c = j17;
                    this.f101347g = j17;
                    this.f101346f = 1L;
                } else {
                    long j18 = j7 - this.f101344d;
                    int i14 = (int) (j16 % 15);
                    long jAbs2 = Math.abs(j18 - this.f101343c);
                    boolean[] zArr2 = this.f101348h;
                    if (jAbs2 <= 1000000) {
                        this.f101346f++;
                        this.f101347g += j18;
                        if (zArr2[i14]) {
                            zArr2[i14] = false;
                            this.f101349i--;
                        }
                    } else if (!zArr2[i14]) {
                        zArr2[i14] = true;
                        this.f101349i++;
                    }
                }
                this.f101345e++;
                this.f101344d = j7;
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m75846c() {
        switch (this.f101341a) {
            case 0:
                this.f101345e = 0L;
                this.f101346f = 0L;
                this.f101347g = 0L;
                this.f101349i = 0;
                Arrays.fill(this.f101348h, false);
                break;
            default:
                this.f101345e = 0L;
                this.f101346f = 0L;
                this.f101347g = 0L;
                this.f101349i = 0;
                Arrays.fill(this.f101348h, false);
                break;
        }
    }
}
