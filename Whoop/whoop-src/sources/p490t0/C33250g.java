package p490t0;

import p027b3.InterfaceC2394j2;
import p181h2.C16620e;
import p268k0.AbstractC22086a;
import p636y3.InterfaceC39171c;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: t0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C33250g implements InterfaceC33245b, InterfaceC2394j2 {

    /* JADX INFO: renamed from: w */
    public final float f138649w;

    public C33250g(float f13) {
        this.f138649w = f13;
        if (f13 < 0.0f || f13 > 100.0f) {
            AbstractC22086a.m63158a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // p490t0.InterfaceC33245b
    /* JADX INFO: renamed from: a */
    public final float mo105483a(long j7, InterfaceC39171c interfaceC39171c) {
        return (this.f138649w / 100.0f) * C16620e.m47212d(j7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33250g) && Float.compare(this.f138649w, ((C33250g) obj).f138649w) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f138649w);
    }

    public final String toString() {
        return AbstractC30007c.m91837g(this.f138649w, "%)", new StringBuilder("CornerSize(size = "));
    }
}
