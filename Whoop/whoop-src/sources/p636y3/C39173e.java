package p636y3;

import p000.AbstractC11266d;
import p670z3.InterfaceC40035a;
import p715kotlin.jvm.internal.AbstractC22676k;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: y3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C39173e implements InterfaceC39171c {

    /* JADX INFO: renamed from: w */
    public final float f168410w;

    /* JADX INFO: renamed from: x */
    public final float f168411x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC40035a f168412y;

    public C39173e(float f13, float f14, InterfaceC40035a interfaceC40035a) {
        this.f168410w = f13;
        this.f168411x = f14;
        this.f168412y = interfaceC40035a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39173e)) {
            return false;
        }
        C39173e c39173e = (C39173e) obj;
        return Float.compare(this.f168410w, c39173e.f168410w) == 0 && Float.compare(this.f168411x, c39173e.f168411x) == 0 && AbstractC22676k.m65745e(this.f168412y, c39173e.f168412y);
    }

    @Override // p636y3.InterfaceC39171c
    public final float getDensity() {
        return this.f168410w;
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: h */
    public final long mo735h(float f13) {
        return AbstractC35745c.m113248j(this.f168412y.mo124801a(f13), 4294967296L);
    }

    public final int hashCode() {
        return this.f168412y.hashCode() + AbstractC11266d.m30447a(this.f168411x, Float.hashCode(this.f168410w) * 31, 31);
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: l */
    public final float mo738l(long j7) {
        if (C39184p.m124808a(C39183o.m124804b(j7), 4294967296L)) {
            return this.f168412y.mo124802b(C39183o.m124805c(j7));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // p636y3.InterfaceC39171c
    /* JADX INFO: renamed from: m0 */
    public final float getFontScale() {
        return this.f168411x;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f168410w + ", fontScale=" + this.f168411x + ", converter=" + this.f168412y + ')';
    }
}
