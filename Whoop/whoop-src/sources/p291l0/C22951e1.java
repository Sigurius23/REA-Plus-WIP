package p291l0;

import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l0.e1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22951e1 implements InterfaceC22940b2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC22940b2 f90586a;

    /* JADX INFO: renamed from: b */
    public final int f90587b;

    public C22951e1(InterfaceC22940b2 interfaceC22940b2, int i13) {
        this.f90586a = interfaceC22940b2;
        this.f90587b = i13;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: a */
    public final int mo43077a(InterfaceC39171c interfaceC39171c, EnumC39181m enumC39181m) {
        if (((enumC39181m == EnumC39181m.f168423w ? 8 : 2) & this.f90587b) != 0) {
            return this.f90586a.mo43077a(interfaceC39171c, enumC39181m);
        }
        return 0;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: b */
    public final int mo43078b(InterfaceC39171c interfaceC39171c, EnumC39181m enumC39181m) {
        if (((enumC39181m == EnumC39181m.f168423w ? 4 : 1) & this.f90587b) != 0) {
            return this.f90586a.mo43078b(interfaceC39171c, enumC39181m);
        }
        return 0;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: c */
    public final int mo43079c(InterfaceC39171c interfaceC39171c) {
        if ((this.f90587b & 32) != 0) {
            return this.f90586a.mo43079c(interfaceC39171c);
        }
        return 0;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: d */
    public final int mo43080d(InterfaceC39171c interfaceC39171c) {
        if ((this.f90587b & 16) != 0) {
            return this.f90586a.mo43080d(interfaceC39171c);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22951e1)) {
            return false;
        }
        C22951e1 c22951e1 = (C22951e1) obj;
        return AbstractC22676k.m65745e(this.f90586a, c22951e1.f90586a) && this.f90587b == c22951e1.f90587b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90587b) + (this.f90586a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("(");
        sb4.append(this.f90586a);
        sb4.append(" only ");
        StringBuilder sb5 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb6 = new StringBuilder();
        int i13 = this.f90587b;
        int i14 = AbstractC22960g2.f90608b;
        if ((i13 & i14) == i14) {
            AbstractC22960g2.m66734f(sb6, "Start");
        }
        int i15 = AbstractC22960g2.f90610d;
        if ((i13 & i15) == i15) {
            AbstractC22960g2.m66734f(sb6, "Left");
        }
        if ((i13 & 16) == 16) {
            AbstractC22960g2.m66734f(sb6, "Top");
        }
        int i16 = AbstractC22960g2.f90609c;
        if ((i13 & i16) == i16) {
            AbstractC22960g2.m66734f(sb6, "End");
        }
        int i17 = AbstractC22960g2.f90611e;
        if ((i13 & i17) == i17) {
            AbstractC22960g2.m66734f(sb6, "Right");
        }
        if ((i13 & 32) == 32) {
            AbstractC22960g2.m66734f(sb6, "Bottom");
        }
        String string = sb6.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        sb5.append(string);
        sb5.append(')');
        sb4.append((Object) sb5.toString());
        sb4.append(')');
        return sb4.toString();
    }
}
