package p490t0;

import p027b3.InterfaceC2394j2;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: t0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C33248e implements InterfaceC33245b, InterfaceC2394j2 {

    /* JADX INFO: renamed from: w */
    public final float f138648w;

    public C33248e(float f13) {
        this.f138648w = f13;
    }

    @Override // p490t0.InterfaceC33245b
    /* JADX INFO: renamed from: a */
    public final float mo105483a(long j7, InterfaceC39171c interfaceC39171c) {
        return interfaceC39171c.mo743q0(this.f138648w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33248e) && C39174f.m124782b(this.f138648w, ((C33248e) obj).f138648w);
    }

    public final int hashCode() {
        return Float.hashCode(this.f138648w);
    }

    public final String toString() {
        return AbstractC30007c.m91837g(this.f138648w, ".dp)", new StringBuilder("CornerSize(size = "));
    }
}
