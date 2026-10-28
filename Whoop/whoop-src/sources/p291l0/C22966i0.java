package p291l0;

import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p636y3.C39174f;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: l0.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22966i0 implements InterfaceC22940b2 {

    /* JADX INFO: renamed from: a */
    public final float f90621a;

    /* JADX INFO: renamed from: b */
    public final float f90622b;

    /* JADX INFO: renamed from: c */
    public final float f90623c;

    /* JADX INFO: renamed from: d */
    public final float f90624d;

    public C22966i0(float f13, float f14, float f15, float f16) {
        this.f90621a = f13;
        this.f90622b = f14;
        this.f90623c = f15;
        this.f90624d = f16;
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: a */
    public final int mo43077a(InterfaceC39171c interfaceC39171c, EnumC39181m enumC39181m) {
        return interfaceC39171c.mo724F(this.f90621a);
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: b */
    public final int mo43078b(InterfaceC39171c interfaceC39171c, EnumC39181m enumC39181m) {
        return interfaceC39171c.mo724F(this.f90623c);
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: c */
    public final int mo43079c(InterfaceC39171c interfaceC39171c) {
        return interfaceC39171c.mo724F(this.f90624d);
    }

    @Override // p291l0.InterfaceC22940b2
    /* JADX INFO: renamed from: d */
    public final int mo43080d(InterfaceC39171c interfaceC39171c) {
        return interfaceC39171c.mo724F(this.f90622b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22966i0)) {
            return false;
        }
        C22966i0 c22966i0 = (C22966i0) obj;
        return C39174f.m124782b(this.f90621a, c22966i0.f90621a) && C39174f.m124782b(this.f90622b, c22966i0.f90622b) && C39174f.m124782b(this.f90623c, c22966i0.f90623c) && C39174f.m124782b(this.f90624d, c22966i0.f90624d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f90624d) + AbstractC11266d.m30447a(this.f90623c, AbstractC11266d.m30447a(this.f90622b, Float.hashCode(this.f90621a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Insets(left=");
        AbstractC13673n.m38572s(this.f90621a, ", top=", sb4);
        AbstractC13673n.m38572s(this.f90622b, ", right=", sb4);
        AbstractC13673n.m38572s(this.f90623c, ", bottom=", sb4);
        sb4.append((Object) C39174f.m124783c(this.f90624d));
        sb4.append(')');
        return sb4.toString();
    }
}
