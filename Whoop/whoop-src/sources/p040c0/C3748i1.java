package p040c0;

import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: c0.i1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3748i1 {

    /* JADX INFO: renamed from: a */
    public final float f15324a;

    /* JADX INFO: renamed from: b */
    public final float f15325b;

    public C3748i1(float f13, InterfaceC39171c interfaceC39171c) {
        this.f15324a = f13;
        float density = interfaceC39171c.getDensity();
        float f14 = AbstractC3751j1.f15333a;
        this.f15325b = density * 386.0878f * 160.0f * 0.84f;
    }

    /* JADX INFO: renamed from: a */
    public C3745h1 m11566a(float f13) {
        float[] fArr = AbstractC3725b.f15209a;
        float f14 = this.f15324a;
        float f15 = this.f15325b;
        double dM11559a = AbstractC3725b.m11559a(f13, f14 * f15);
        double d3 = AbstractC3751j1.f15333a;
        double d14 = d3 - 1.0d;
        return new C3745h1(f13, (long) (Math.exp(dM11559a / d14) * 1000.0d), (float) (Math.exp((d3 / d14) * dM11559a) * ((double) (f14 * f15))));
    }

    public C3748i1(float f13, float f14, float f15, float f16) {
        this.f15324a = f15;
        this.f15325b = f16;
    }
}
