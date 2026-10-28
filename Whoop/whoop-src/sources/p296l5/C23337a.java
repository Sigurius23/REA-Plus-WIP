package p296l5;

/* JADX INFO: renamed from: l5.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C23337a {

    /* JADX INFO: renamed from: a */
    public int f92527a;

    /* JADX INFO: renamed from: b */
    public int f92528b;

    /* JADX INFO: renamed from: c */
    public float f92529c;

    /* JADX INFO: renamed from: d */
    public float f92530d;

    /* JADX INFO: renamed from: e */
    public long f92531e;

    /* JADX INFO: renamed from: f */
    public long f92532f;

    /* JADX INFO: renamed from: g */
    public long f92533g;

    /* JADX INFO: renamed from: h */
    public float f92534h;

    /* JADX INFO: renamed from: i */
    public int f92535i;

    /* JADX INFO: renamed from: a */
    public final float m67568a(long j7) {
        long j13 = this.f92531e;
        if (j7 < j13) {
            return 0.0f;
        }
        long j14 = this.f92533g;
        if (j14 < 0 || j7 < j14) {
            return ViewOnTouchListenerC23340d.m67573b((j7 - j13) / this.f92527a, 0.0f, 1.0f) * 0.5f;
        }
        float f13 = this.f92534h;
        return (ViewOnTouchListenerC23340d.m67573b((j7 - j14) / this.f92535i, 0.0f, 1.0f) * f13) + (1.0f - f13);
    }
}
