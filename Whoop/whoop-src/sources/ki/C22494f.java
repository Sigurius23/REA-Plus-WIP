package ki;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.C3033m;
import l83.C23454a0;

/* JADX INFO: renamed from: ki.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C22494f implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f88191w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3033m f88192x;

    public /* synthetic */ C22494f(C3033m c3033m, int i13) {
        this.f88191w = i13;
        this.f88192x = c3033m;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(InterfaceC1585g0 interfaceC1585g0) {
        switch (this.f88191w) {
            case 0:
                this.f88192x.resumeWith(C23454a0.f92919a);
                break;
            default:
                this.f88192x.resumeWith(C23454a0.f92919a);
                break;
        }
    }
}
