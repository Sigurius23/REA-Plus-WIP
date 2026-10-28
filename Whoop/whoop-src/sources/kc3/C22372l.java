package kc3;

import bc3.AbstractC3076z;
import hc3.AbstractC17167b;
import hc3.C17185r;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: kc3.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C22372l extends AbstractC3076z {

    /* JADX INFO: renamed from: w */
    public static final C22372l f87330w = new C22372l();

    @Override // bc3.AbstractC3076z
    public final void dispatch(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        C22365e.f87318x.f87320w.m64287h(runnable, true, false);
    }

    @Override // bc3.AbstractC3076z
    public final void dispatchYield(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        C22365e.f87318x.f87320w.m64287h(runnable, true, true);
    }

    @Override // bc3.AbstractC3076z
    public final AbstractC3076z limitedParallelism(int i13, String str) {
        AbstractC17167b.m48475a(i13);
        if (i13 >= AbstractC22371k.f87327d) {
            return str != null ? new C17185r(this, str) : this;
        }
        return super.limitedParallelism(i13, str);
    }

    @Override // bc3.AbstractC3076z
    public final String toString() {
        return "Dispatchers.IO";
    }
}
