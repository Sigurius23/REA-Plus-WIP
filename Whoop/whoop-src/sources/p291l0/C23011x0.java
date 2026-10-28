package p291l0;

import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l0.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23011x0 implements InterfaceC22973k1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC22940b2 f90747a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC39171c f90748b;

    public C23011x0(InterfaceC22940b2 interfaceC22940b2, InterfaceC39171c interfaceC39171c) {
        this.f90747a = interfaceC22940b2;
        this.f90748b = interfaceC39171c;
    }

    @Override // p291l0.InterfaceC22973k1
    /* JADX INFO: renamed from: a */
    public final float mo43109a() {
        InterfaceC22940b2 interfaceC22940b2 = this.f90747a;
        InterfaceC39171c interfaceC39171c = this.f90748b;
        return interfaceC39171c.mo733e0(interfaceC22940b2.mo43079c(interfaceC39171c));
    }

    @Override // p291l0.InterfaceC22973k1
    /* JADX INFO: renamed from: b */
    public final float mo43110b(EnumC39181m enumC39181m) {
        InterfaceC22940b2 interfaceC22940b2 = this.f90747a;
        InterfaceC39171c interfaceC39171c = this.f90748b;
        return interfaceC39171c.mo733e0(interfaceC22940b2.mo43077a(interfaceC39171c, enumC39181m));
    }

    @Override // p291l0.InterfaceC22973k1
    /* JADX INFO: renamed from: c */
    public final float mo43111c(EnumC39181m enumC39181m) {
        InterfaceC22940b2 interfaceC22940b2 = this.f90747a;
        InterfaceC39171c interfaceC39171c = this.f90748b;
        return interfaceC39171c.mo733e0(interfaceC22940b2.mo43078b(interfaceC39171c, enumC39181m));
    }

    @Override // p291l0.InterfaceC22973k1
    /* JADX INFO: renamed from: d */
    public final float mo43112d() {
        InterfaceC22940b2 interfaceC22940b2 = this.f90747a;
        InterfaceC39171c interfaceC39171c = this.f90748b;
        return interfaceC39171c.mo733e0(interfaceC22940b2.mo43080d(interfaceC39171c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23011x0)) {
            return false;
        }
        C23011x0 c23011x0 = (C23011x0) obj;
        return AbstractC22676k.m65745e(this.f90747a, c23011x0.f90747a) && AbstractC22676k.m65745e(this.f90748b, c23011x0.f90748b);
    }

    public final int hashCode() {
        return this.f90748b.hashCode() + (this.f90747a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.f90747a + ", density=" + this.f90748b + ')';
    }
}
