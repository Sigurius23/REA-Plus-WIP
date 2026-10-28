package p499t9;

import p309lo.AbstractC24567y;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: t9.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C33624d {

    /* JADX INFO: renamed from: a */
    public final long f140356a;

    /* JADX INFO: renamed from: b */
    public final long f140357b;

    /* JADX INFO: renamed from: c */
    public final long f140358c;

    /* JADX INFO: renamed from: d */
    public long f140359d;

    /* JADX INFO: renamed from: e */
    public long f140360e;

    /* JADX INFO: renamed from: f */
    public long f140361f;

    /* JADX INFO: renamed from: g */
    public long f140362g;

    /* JADX INFO: renamed from: h */
    public long f140363h;

    public C33624d(long j7, long j13, long j14, long j15, long j16, long j17, int i13) {
        switch (i13) {
            case 1:
                this.f140356a = j7;
                this.f140357b = j13;
                this.f140359d = 0L;
                this.f140360e = j14;
                this.f140361f = j15;
                this.f140362g = j16;
                this.f140358c = j17;
                this.f140363h = m106248b(j13, 0L, j14, j15, j16, j17);
                break;
            default:
                this.f140356a = j7;
                this.f140357b = j13;
                this.f140359d = 0L;
                this.f140360e = j14;
                this.f140361f = j15;
                this.f140362g = j16;
                this.f140358c = j17;
                this.f140363h = m106247a(j13, 0L, j14, j15, j16, j17);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m106247a(long j7, long j13, long j14, long j15, long j16, long j17) {
        if (j15 + 1 >= j16 || j13 + 1 >= j14) {
            return j15;
        }
        long j18 = (long) ((j7 - j13) * ((j16 - j15) / (j14 - j13)));
        return AbstractC38065t.m121915h(((j18 + j15) - j17) - (j18 / 20), j15, j16 - 1);
    }

    /* JADX INFO: renamed from: b */
    public static long m106248b(long j7, long j13, long j14, long j15, long j16, long j17) {
        if (j15 + 1 >= j16 || j13 + 1 >= j14) {
            return j15;
        }
        long j18 = (long) ((j7 - j13) * ((j16 - j15) / (j14 - j13)));
        return AbstractC24567y.m71678i(((j18 + j15) - j17) - (j18 / 20), j15, j16 - 1);
    }
}
