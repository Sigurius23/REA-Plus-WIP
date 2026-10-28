package p291l0;

import ih0.AbstractC18489d0;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: l0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C22969j0 implements InterfaceC22940b2 {

    /* JADX INFO: renamed from: a */
    public final int f90629a;

    public C22969j0(int i13) {
        this.f90629a = i13;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: a */
    public final int mo43077a(InterfaceC39171c interfaceC39171c, EnumC39181m enumC39181m) {
        return 0;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: b */
    public final int mo43078b(InterfaceC39171c interfaceC39171c, EnumC39181m enumC39181m) {
        return 0;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: c */
    public final int mo43079c(InterfaceC39171c interfaceC39171c) {
        return 0;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: d */
    public final int mo43080d(InterfaceC39171c interfaceC39171c) {
        return this.f90629a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22969j0) && this.f90629a == ((C22969j0) obj).f90629a;
    }

    public final int hashCode() {
        return this.f90629a * 961;
    }

    public final String toString() {
        return AbstractC18489d0.m53371l(new StringBuilder("Insets(left=0, top="), this.f90629a, ", right=0, bottom=0)");
    }
}
