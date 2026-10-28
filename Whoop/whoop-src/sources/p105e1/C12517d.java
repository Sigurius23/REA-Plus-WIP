package p105e1;

import p294l3.C23277r0;
import p294l3.C23285v0;
import p294l3.C23286w;
import p636y3.C39183o;
import p636y3.C39184p;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e1.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C12517d implements InterfaceC39171c {

    /* JADX INFO: renamed from: w */
    public C23277r0 f42732w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12518e f42733x;

    public C12517d(C12518e c12518e) {
        this.f42733x = c12518e;
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: K */
    public final float mo726K(long j7) {
        if (!C39183o.m124806d(j7)) {
            return getDensity() * mo738l(j7);
        }
        C12518e c12518e = this.f42733x;
        if (C39183o.m124806d(c12518e.f42745l.f92255a.f92192b)) {
            throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
        }
        long j13 = c12518e.f42745l.f92255a.f92192b;
        C39184p[] c39184pArr = C39183o.f168427b;
        if (C39183o.m124803a(j13, C39183o.f168428c)) {
            throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
        }
        return C39183o.m124805c(j7) * mo726K(c12518e.f42745l.f92255a.f92192b);
    }

    /* JADX INFO: renamed from: a */
    public final C23277r0 m35165a() {
        return this.f42732w;
    }

    /* JADX INFO: renamed from: b */
    public final C23277r0 m35166b(long j7, long j13) {
        long jM35174h;
        C12518e c12518e = this.f42733x;
        C23285v0 c23285v0 = c12518e.f42745l;
        long jM35175a = C39183o.m124806d(j13) ? AbstractC12519f.m35175a(c12518e.f42745l.f92255a.f92192b, j13) : j13;
        if (!C39183o.m124803a(jM35175a, c12518e.f42745l.f92255a.f92192b)) {
            c12518e.m35172f(C23285v0.m67364b(c12518e.f42745l, 0L, jM35175a, null, null, 0L, 0, 0L, null, null, 16777213));
        }
        if (c12518e.f42739f > 1) {
            EnumC39181m enumC39181m = c12518e.f42747n;
            AbstractC22676k.m65747g(enumC39181m);
            jM35174h = c12518e.m35174h(j7, enumC39181m);
        } else {
            jM35174h = j7;
        }
        EnumC39181m enumC39181m2 = c12518e.f42747n;
        AbstractC22676k.m65747g(enumC39181m2);
        C23286w c23286wM35168b = c12518e.m35168b(jM35174h, enumC39181m2);
        EnumC39181m enumC39181m3 = c12518e.f42747n;
        AbstractC22676k.m65747g(enumC39181m3);
        C23277r0 c23277r0M35173g = c12518e.m35173g(enumC39181m3, jM35174h, c23286wM35168b);
        this.f42732w = c23277r0M35173g;
        c12518e.m35172f(c23285v0);
        return c23277r0M35173g;
    }

    @Override // p636y3.InterfaceC39171c
    public final float getDensity() {
        InterfaceC39171c interfaceC39171c = this.f42733x.f42744k;
        AbstractC22676k.m65747g(interfaceC39171c);
        return interfaceC39171c.getDensity();
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: m0 */
    public final float getFontScale() {
        InterfaceC39171c interfaceC39171c = this.f42733x.f42744k;
        AbstractC22676k.m65747g(interfaceC39171c);
        return interfaceC39171c.getFontScale();
    }
}
