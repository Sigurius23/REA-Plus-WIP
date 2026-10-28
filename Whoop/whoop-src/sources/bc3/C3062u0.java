package bc3;

import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: bc3.u0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3062u0 implements InterfaceC3011g1 {

    /* JADX INFO: renamed from: w */
    public final boolean f12093w;

    public C3062u0(boolean z4) {
        this.f12093w = z4;
    }

    @Override // bc3.InterfaceC3011g1
    /* JADX INFO: renamed from: b */
    public final C3072x1 mo8733b() {
        return null;
    }

    @Override // bc3.InterfaceC3011g1
    public final boolean isActive() {
        return this.f12093w;
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("Empty{"), this.f12093w ? "Active" : "New", '}');
    }
}
