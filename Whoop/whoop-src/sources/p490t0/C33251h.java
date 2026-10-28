package p490t0;

import p027b3.InterfaceC2394j2;
import p636y3.InterfaceC39171c;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: t0.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C33251h implements InterfaceC33245b, InterfaceC2394j2 {

    /* JADX INFO: renamed from: w */
    public final float f138650w;

    public C33251h(float f13) {
        this.f138650w = f13;
    }

    @Override // p490t0.InterfaceC33245b
    /* JADX INFO: renamed from: a */
    public final float mo105483a(long j7, InterfaceC39171c interfaceC39171c) {
        return this.f138650w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33251h) && Float.compare(this.f138650w, ((C33251h) obj).f138650w) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f138650w);
    }

    public final String toString() {
        return AbstractC30007c.m91837g(this.f138650w, ".px)", new StringBuilder("CornerSize(size = "));
    }
}
