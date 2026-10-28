package androidx.fragment.app;

import p236j.InterfaceC21072k;
import p538v.InterfaceC35450a;

/* JADX INFO: renamed from: androidx.fragment.app.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1292f0 implements InterfaceC35450a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractComponentCallbacksC1320m0 f5597w;

    public C1292f0(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
        this.f5597w = abstractComponentCallbacksC1320m0;
    }

    @Override // p538v.InterfaceC35450a
    public final Object apply(Object obj) {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = this.f5597w;
        Object obj2 = abstractComponentCallbacksC1320m0.mHost;
        return obj2 instanceof InterfaceC21072k ? ((InterfaceC21072k) obj2).getActivityResultRegistry() : abstractComponentCallbacksC1320m0.requireActivity().getActivityResultRegistry();
    }
}
