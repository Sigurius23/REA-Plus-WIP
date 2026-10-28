package fc3;

import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import s83.InterfaceC32270d;

/* JADX INFO: renamed from: fc3.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C14393x implements InterfaceC30057d, InterfaceC32270d {

    /* JADX INFO: renamed from: w */
    public final InterfaceC30057d f52535w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC30063j f52536x;

    public C14393x(InterfaceC30063j interfaceC30063j, InterfaceC30057d interfaceC30057d) {
        this.f52535w = interfaceC30057d;
        this.f52536x = interfaceC30063j;
    }

    @Override // s83.InterfaceC32270d
    public final InterfaceC32270d getCallerFrame() {
        InterfaceC30057d interfaceC30057d = this.f52535w;
        if (interfaceC30057d instanceof InterfaceC32270d) {
            return (InterfaceC32270d) interfaceC30057d;
        }
        return null;
    }

    @Override // q83.InterfaceC30057d
    public final InterfaceC30063j getContext() {
        return this.f52536x;
    }

    @Override // q83.InterfaceC30057d
    public final void resumeWith(Object obj) {
        this.f52535w.resumeWith(obj);
    }
}
