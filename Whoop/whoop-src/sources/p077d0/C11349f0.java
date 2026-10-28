package p077d0;

/* JADX INFO: renamed from: d0.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11349f0 implements InterfaceC11345e0 {

    /* JADX INFO: renamed from: w */
    public float f36376w;

    /* JADX INFO: renamed from: x */
    public float f36377x;

    public C11349f0(int i13) {
        switch (i13) {
            case 3:
                break;
            default:
                this.f36376w = Math.max(1.0E-7f, Math.abs(0.1f));
                this.f36377x = Math.max(1.0E-4f, 1.0f) * (-4.2f);
                break;
        }
    }

    @Override // p077d0.InterfaceC11345e0
    /* JADX INFO: renamed from: d */
    public float mo11166d(float f13, long j7) {
        return f13 * ((float) Math.exp(((j7 / 1000000) / 1000.0f) * this.f36377x));
    }

    @Override // p077d0.InterfaceC11345e0
    /* JADX INFO: renamed from: k */
    public float mo11172k() {
        return this.f36376w;
    }

    @Override // p077d0.InterfaceC11345e0
    /* JADX INFO: renamed from: u */
    public float mo11173u(float f13, long j7, float f14) {
        float f15 = this.f36377x;
        return ((f14 / f15) * ((float) Math.exp((f15 * (j7 / 1000000)) / 1000.0f))) + (f13 - (f14 / f15));
    }

    @Override // p077d0.InterfaceC11345e0
    /* JADX INFO: renamed from: w */
    public long mo11175w(float f13) {
        return ((long) ((((float) Math.log(this.f36376w / Math.abs(f13))) * 1000.0f) / this.f36377x)) * 1000000;
    }

    @Override // p077d0.InterfaceC11345e0
    /* JADX INFO: renamed from: x */
    public float mo11176x(float f13, float f14) {
        float fAbs = Math.abs(f14);
        float f15 = this.f36376w;
        if (fAbs <= f15) {
            return f13;
        }
        double dLog = Math.log(Math.abs(f15 / f14));
        float f16 = this.f36377x;
        return ((f14 / f16) * ((float) Math.exp((((double) f16) * ((dLog / ((double) f16)) * ((double) 1000))) / ((double) 1000.0f)))) + (f13 - (f14 / f16));
    }
}
