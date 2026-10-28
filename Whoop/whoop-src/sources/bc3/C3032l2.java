package bc3;

import q83.InterfaceC30063j;

/* JADX INFO: renamed from: bc3.l2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3032l2 extends AbstractC3076z {

    /* JADX INFO: renamed from: w */
    public static final C3032l2 f12050w = new C3032l2();

    @Override // bc3.AbstractC3076z
    public final void dispatch(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        C3048p2 c3048p2 = (C3048p2) interfaceC30063j.get(C3048p2.f12074x);
        if (c3048p2 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c3048p2.f12075w = true;
    }

    @Override // bc3.AbstractC3076z
    public final boolean isDispatchNeeded(InterfaceC30063j interfaceC30063j) {
        return false;
    }

    @Override // bc3.AbstractC3076z
    public final AbstractC3076z limitedParallelism(int i13, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // bc3.AbstractC3076z
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
