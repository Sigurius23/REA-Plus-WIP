package hc3;

import bc3.InterfaceC2994c0;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: hc3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C17171d implements InterfaceC2994c0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC30063j f65971w;

    public C17171d(InterfaceC30063j interfaceC30063j) {
        this.f65971w = interfaceC30063j;
    }

    @Override // bc3.InterfaceC2994c0
    public final InterfaceC30063j getCoroutineContext() {
        return this.f65971w;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f65971w + ')';
    }
}
