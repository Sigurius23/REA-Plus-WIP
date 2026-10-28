package p635y2;

import java.util.Map;
import p603x2.AbstractC37831a;
import p636y3.EnumC39181m;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: y2.v */
/* JADX INFO: loaded from: classes.dex */
public final class C39138v implements InterfaceC39133t0, InterfaceC39126r {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC39126r f168287w;

    /* JADX INFO: renamed from: x */
    public final EnumC39181m f168288x;

    public C39138v(InterfaceC39126r interfaceC39126r, EnumC39181m enumC39181m) {
        this.f168287w = interfaceC39126r;
        this.f168288x = enumC39181m;
    }

    @Override // p635y2.InterfaceC39126r
    /* JADX INFO: renamed from: A */
    public final boolean mo781A() {
        return this.f168287w.mo781A();
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: D0 */
    public final long mo722D0(long j7) {
        return this.f168287w.mo722D0(j7);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: F */
    public final int mo724F(float f13) {
        return this.f168287w.mo724F(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: K */
    public final float mo726K(long j7) {
        return this.f168287w.mo726K(j7);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: e0 */
    public final float mo733e0(int i13) {
        return this.f168287w.mo733e0(i13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: f0 */
    public final float mo734f0(float f13) {
        return this.f168287w.mo734f0(f13);
    }

    @Override // p636y3.InterfaceC39171c
    public final float getDensity() {
        return this.f168287w.getDensity();
    }

    @Override // p635y2.InterfaceC39126r
    public final EnumC39181m getLayoutDirection() {
        return this.f168288x;
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: h */
    public final long mo735h(float f13) {
        return this.f168287w.mo735h(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: i */
    public final long mo736i(long j7) {
        return this.f168287w.mo736i(j7);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: l */
    public final float mo738l(long j7) {
        return this.f168287w.mo738l(j7);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: m0 */
    public final float getFontScale() {
        return this.f168287w.getFontScale();
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: q */
    public final long mo742q(float f13) {
        return this.f168287w.mo742q(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: q0 */
    public final float mo743q0(float f13) {
        return this.f168287w.mo743q0(f13);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: w0 */
    public final int mo86824w0(long j7) {
        return this.f168287w.mo86824w0(j7);
    }

    @Override // p635y2.InterfaceC39133t0
    /* JADX INFO: renamed from: x0 */
    public final InterfaceC39130s0 mo795x0(int i13, int i14, Map map, Function1 function1, Function1 function2) {
        if (i13 < 0) {
            i13 = 0;
        }
        if (i14 < 0) {
            i14 = 0;
        }
        if ((i13 & (-16777216)) != 0 || ((-16777216) & i14) != 0) {
            AbstractC37831a.m121374b("Size(" + i13 + " x " + i14 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C39135u(i13, i14, map, function1);
    }
}
