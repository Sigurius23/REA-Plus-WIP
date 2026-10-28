package p291l0;

import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l0.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23009w1 implements InterfaceC22940b2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC22940b2 f90743a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC22940b2 f90744b;

    public C23009w1(InterfaceC22940b2 interfaceC22940b2, InterfaceC22940b2 interfaceC22940b3) {
        this.f90743a = interfaceC22940b2;
        this.f90744b = interfaceC22940b3;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: a */
    public final int mo43077a(InterfaceC39171c interfaceC39171c, EnumC39181m enumC39181m) {
        return Math.max(this.f90743a.mo43077a(interfaceC39171c, enumC39181m), this.f90744b.mo43077a(interfaceC39171c, enumC39181m));
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: b */
    public final int mo43078b(InterfaceC39171c interfaceC39171c, EnumC39181m enumC39181m) {
        return Math.max(this.f90743a.mo43078b(interfaceC39171c, enumC39181m), this.f90744b.mo43078b(interfaceC39171c, enumC39181m));
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: c */
    public final int mo43079c(InterfaceC39171c interfaceC39171c) {
        return Math.max(this.f90743a.mo43079c(interfaceC39171c), this.f90744b.mo43079c(interfaceC39171c));
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: d */
    public final int mo43080d(InterfaceC39171c interfaceC39171c) {
        return Math.max(this.f90743a.mo43080d(interfaceC39171c), this.f90744b.mo43080d(interfaceC39171c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23009w1)) {
            return false;
        }
        C23009w1 c23009w1 = (C23009w1) obj;
        return AbstractC22676k.m65745e(c23009w1.f90743a, this.f90743a) && AbstractC22676k.m65745e(c23009w1.f90744b, this.f90744b);
    }

    public final int hashCode() {
        return (this.f90744b.hashCode() * 31) + this.f90743a.hashCode();
    }

    public final String toString() {
        return "(" + this.f90743a + " ∪ " + this.f90744b + ')';
    }
}
