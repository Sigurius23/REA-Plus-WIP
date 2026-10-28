package p163g1;

import e93.AbstractC12889b;
import p000.AbstractC30802r;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: g1.c3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14972c3 implements InterfaceC15022g9 {

    /* JADX INFO: renamed from: a */
    public final float f55912a;

    public C14972c3(float f13) {
        this.f55912a = f13;
    }

    @Override // p163g1.InterfaceC15022g9
    /* JADX INFO: renamed from: a */
    public final float mo43095a(float f13, float f14, InterfaceC39171c interfaceC39171c) {
        return AbstractC12889b.m36249O(f13, f14, this.f55912a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14972c3) && Float.compare(this.f55912a, ((C14972c3) obj).f55912a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f55912a);
    }

    public final String toString() {
        return AbstractC30802r.m94763l(new StringBuilder("FractionalThreshold(fraction="), this.f55912a, ')');
    }
}
