package fc3;

import c93.InterfaceC4351m;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: fc3.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C14385p implements InterfaceC30063j {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC30063j f52523w;

    /* JADX INFO: renamed from: x */
    public final Throwable f52524x;

    public C14385p(InterfaceC30063j interfaceC30063j, Throwable th3) {
        this.f52523w = interfaceC30063j;
        this.f52524x = th3;
    }

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m interfaceC4351m) {
        return this.f52523w.fold(obj, interfaceC4351m);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30061h get(InterfaceC30062i interfaceC30062i) {
        return this.f52523w.get(interfaceC30062i);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j minusKey(InterfaceC30062i interfaceC30062i) {
        return this.f52523w.minusKey(interfaceC30062i);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j plus(InterfaceC30063j interfaceC30063j) {
        return this.f52523w.plus(interfaceC30063j);
    }
}
