package p291l0;

import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p315m0.AbstractC24868a;
import p636y3.C39174f;
import p636y3.EnumC39181m;

/* JADX INFO: renamed from: l0.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C22976l1 implements InterfaceC22973k1 {

    /* JADX INFO: renamed from: a */
    public final float f90646a;

    /* JADX INFO: renamed from: b */
    public final float f90647b;

    /* JADX INFO: renamed from: c */
    public final float f90648c;

    /* JADX INFO: renamed from: d */
    public final float f90649d;

    public C22976l1(float f13, float f14, float f15, float f16) {
        this.f90646a = f13;
        this.f90647b = f14;
        this.f90648c = f15;
        this.f90649d = f16;
        if (!((f13 >= 0.0f) & (f14 >= 0.0f) & (f15 >= 0.0f)) || !(f16 >= 0.0f)) {
            AbstractC24868a.m72899a("Padding must be non-negative");
        }
    }

    @Override // p291l0.InterfaceC22973k1
    /* JADX INFO: renamed from: a */
    public final float mo43109a() {
        return this.f90649d;
    }

    @Override // p291l0.InterfaceC22973k1
    /* JADX INFO: renamed from: b */
    public final float mo43110b(EnumC39181m enumC39181m) {
        return enumC39181m == EnumC39181m.f168423w ? this.f90646a : this.f90648c;
    }

    @Override // p291l0.InterfaceC22973k1
    /* JADX INFO: renamed from: c */
    public final float mo43111c(EnumC39181m enumC39181m) {
        return enumC39181m == EnumC39181m.f168423w ? this.f90648c : this.f90646a;
    }

    @Override // p291l0.InterfaceC22973k1
    /* JADX INFO: renamed from: d */
    public final float mo43112d() {
        return this.f90647b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22976l1)) {
            return false;
        }
        C22976l1 c22976l1 = (C22976l1) obj;
        return C39174f.m124782b(this.f90646a, c22976l1.f90646a) && C39174f.m124782b(this.f90647b, c22976l1.f90647b) && C39174f.m124782b(this.f90648c, c22976l1.f90648c) && C39174f.m124782b(this.f90649d, c22976l1.f90649d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f90649d) + AbstractC11266d.m30447a(this.f90648c, AbstractC11266d.m30447a(this.f90647b, Float.hashCode(this.f90646a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("PaddingValues(start=");
        AbstractC13673n.m38572s(this.f90646a, ", top=", sb4);
        AbstractC13673n.m38572s(this.f90647b, ", end=", sb4);
        AbstractC13673n.m38572s(this.f90648c, ", bottom=", sb4);
        sb4.append((Object) C39174f.m124783c(this.f90649d));
        sb4.append(')');
        return sb4.toString();
    }
}
