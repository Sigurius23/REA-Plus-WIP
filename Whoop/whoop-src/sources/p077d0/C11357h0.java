package p077d0;

/* JADX INFO: renamed from: d0.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11357h0 implements InterfaceC11341d0 {

    /* JADX INFO: renamed from: a */
    public final int f36404a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC11419z f36405b;

    /* JADX INFO: renamed from: c */
    public final long f36406c;

    /* JADX INFO: renamed from: d */
    public final long f36407d;

    public C11357h0(int i13, int i14, InterfaceC11419z interfaceC11419z) {
        this.f36404a = i13;
        this.f36405b = interfaceC11419z;
        this.f36406c = ((long) i13) * 1000000;
        this.f36407d = ((long) i14) * 1000000;
    }

    @Override // p077d0.InterfaceC11341d0
    /* JADX INFO: renamed from: b */
    public final float mo30535b(float f13, float f14, float f15, long j7) {
        long j13 = j7 - this.f36407d;
        if (j13 < 0) {
            j13 = 0;
        }
        long j14 = this.f36406c;
        long j15 = j13 > j14 ? j14 : j13;
        if (j15 == 0) {
            return f15;
        }
        return (mo30538e(f13, f14, f15, j15) - mo30538e(f13, f14, f15, j15 - 1000000)) * 1000.0f;
    }

    @Override // p077d0.InterfaceC11341d0
    /* JADX INFO: renamed from: d */
    public final long mo30537d(float f13, float f14, float f15) {
        return this.f36407d + this.f36406c;
    }

    @Override // p077d0.InterfaceC11341d0
    /* JADX INFO: renamed from: e */
    public final float mo30538e(float f13, float f14, float f15, long j7) {
        long j13 = j7 - this.f36407d;
        if (j13 < 0) {
            j13 = 0;
        }
        long j14 = this.f36406c;
        if (j13 > j14) {
            j13 = j14;
        }
        float fMo7226i = this.f36405b.mo7226i(this.f36404a == 0 ? 1.0f : j13 / j14);
        return (f14 * fMo7226i) + ((1 - fMo7226i) * f13);
    }
}
