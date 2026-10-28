package p031b9;

/* JADX INFO: renamed from: b9.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C2838i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11199a;

    /* JADX INFO: renamed from: b */
    public final long f11200b;

    /* JADX INFO: renamed from: c */
    public final long f11201c;

    /* JADX INFO: renamed from: d */
    public long f11202d = -9223372036854775807L;

    /* JADX INFO: renamed from: e */
    public long f11203e = -9223372036854775807L;

    /* JADX INFO: renamed from: g */
    public long f11205g = -9223372036854775807L;

    /* JADX INFO: renamed from: h */
    public long f11206h = -9223372036854775807L;

    /* JADX INFO: renamed from: k */
    public float f11209k = 0.97f;

    /* JADX INFO: renamed from: j */
    public float f11208j = 1.03f;

    /* JADX INFO: renamed from: l */
    public float f11210l = 1.0f;

    /* JADX INFO: renamed from: m */
    public long f11211m = -9223372036854775807L;

    /* JADX INFO: renamed from: f */
    public long f11204f = -9223372036854775807L;

    /* JADX INFO: renamed from: i */
    public long f11207i = -9223372036854775807L;

    /* JADX INFO: renamed from: n */
    public long f11212n = -9223372036854775807L;

    /* JADX INFO: renamed from: o */
    public long f11213o = -9223372036854775807L;

    public /* synthetic */ C2838i(long j7, long j13, int i13) {
        this.f11199a = i13;
        this.f11200b = j7;
        this.f11201c = j13;
    }

    /* JADX INFO: renamed from: a */
    public final void m8142a() {
        long j7;
        switch (this.f11199a) {
            case 0:
                long j13 = this.f11202d;
                if (j13 != -9223372036854775807L) {
                    j7 = this.f11203e;
                    if (j7 == -9223372036854775807L) {
                        long j14 = this.f11205g;
                        if (j14 != -9223372036854775807L && j13 < j14) {
                            j13 = j14;
                        }
                        j7 = this.f11206h;
                        if (j7 == -9223372036854775807L || j13 <= j7) {
                            j7 = j13;
                        }
                    }
                } else {
                    j7 = -9223372036854775807L;
                }
                if (this.f11204f != j7) {
                    this.f11204f = j7;
                    this.f11207i = j7;
                    this.f11212n = -9223372036854775807L;
                    this.f11213o = -9223372036854775807L;
                    this.f11211m = -9223372036854775807L;
                    break;
                }
                break;
            default:
                long j15 = this.f11202d;
                if (j15 != -9223372036854775807L) {
                    long j16 = this.f11203e;
                    if (j16 != -9223372036854775807L) {
                        j15 = j16;
                    }
                    long j17 = this.f11205g;
                    if (j17 != -9223372036854775807L && j15 < j17) {
                        j15 = j17;
                    }
                    long j18 = this.f11206h;
                    if (j18 != -9223372036854775807L && j15 > j18) {
                        j15 = j18;
                    }
                } else {
                    j15 = -9223372036854775807L;
                }
                if (this.f11204f != j15) {
                    this.f11204f = j15;
                    this.f11207i = j15;
                    this.f11212n = -9223372036854775807L;
                    this.f11213o = -9223372036854775807L;
                    this.f11211m = -9223372036854775807L;
                    break;
                }
                break;
        }
    }
}
