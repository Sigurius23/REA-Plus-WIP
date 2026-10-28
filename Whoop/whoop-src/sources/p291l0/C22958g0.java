package p291l0;

import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l0.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C22958g0 implements InterfaceC22940b2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC22940b2 f90602a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC22940b2 f90603b;

    public C22958g0(InterfaceC22940b2 interfaceC22940b2, InterfaceC22940b2 interfaceC22940b3) {
        this.f90602a = interfaceC22940b2;
        this.f90603b = interfaceC22940b3;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: a */
    public final int mo43077a(InterfaceC39171c interfaceC39171c, EnumC39181m enumC39181m) {
        int iMo43077a = this.f90602a.mo43077a(interfaceC39171c, enumC39181m) - this.f90603b.mo43077a(interfaceC39171c, enumC39181m);
        if (iMo43077a < 0) {
            return 0;
        }
        return iMo43077a;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: b */
    public final int mo43078b(InterfaceC39171c interfaceC39171c, EnumC39181m enumC39181m) {
        int iMo43078b = this.f90602a.mo43078b(interfaceC39171c, enumC39181m) - this.f90603b.mo43078b(interfaceC39171c, enumC39181m);
        if (iMo43078b < 0) {
            return 0;
        }
        return iMo43078b;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: c */
    public final int mo43079c(InterfaceC39171c interfaceC39171c) {
        int iMo43079c = this.f90602a.mo43079c(interfaceC39171c) - this.f90603b.mo43079c(interfaceC39171c);
        if (iMo43079c < 0) {
            return 0;
        }
        return iMo43079c;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: d */
    public final int mo43080d(InterfaceC39171c interfaceC39171c) {
        int iMo43080d = this.f90602a.mo43080d(interfaceC39171c) - this.f90603b.mo43080d(interfaceC39171c);
        if (iMo43080d < 0) {
            return 0;
        }
        return iMo43080d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22958g0)) {
            return false;
        }
        C22958g0 c22958g0 = (C22958g0) obj;
        return AbstractC22676k.m65745e(c22958g0.f90602a, this.f90602a) && AbstractC22676k.m65745e(c22958g0.f90603b, this.f90603b);
    }

    public final int hashCode() {
        return this.f90603b.hashCode() + (this.f90602a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f90602a + " - " + this.f90603b + ')';
    }
}
