package oc3;

import c93.InterfaceC4351m;
import kotlinx.coroutines.CoroutineExceptionHandler;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: oc3.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C27819b implements CoroutineExceptionHandler {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C27818a f112071w = C27818a.f112069w;

    public final boolean equals(Object obj) {
        return (obj instanceof C27819b) || (obj instanceof C27818a);
    }

    @Override // q83.InterfaceC30063j
    public final Object fold(Object obj, InterfaceC4351m interfaceC4351m) {
        return this.f112071w.fold(obj, interfaceC4351m);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30061h get(InterfaceC30062i interfaceC30062i) {
        return this.f112071w.get(interfaceC30062i);
    }

    @Override // q83.InterfaceC30061h
    public final InterfaceC30062i getKey() {
        return this.f112071w.getKey();
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(InterfaceC30063j interfaceC30063j, Throwable th3) {
        this.f112071w.getClass();
        synchronized (C27818a.f112070x) {
        }
    }

    public final int hashCode() {
        return C27818a.f112069w.hashCode();
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j minusKey(InterfaceC30062i interfaceC30062i) {
        return this.f112071w.minusKey(interfaceC30062i);
    }

    @Override // q83.InterfaceC30063j
    public final InterfaceC30063j plus(InterfaceC30063j interfaceC30063j) {
        return this.f112071w.plus(interfaceC30063j);
    }
}
