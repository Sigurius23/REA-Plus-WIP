package s83;

import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: s83.g */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32273g extends AbstractC32267a {
    public AbstractC32273g(InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        if (interfaceC30057d != null && interfaceC30057d.getContext() != C30064k.f122676w) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // q83.InterfaceC30057d
    public InterfaceC30063j getContext() {
        return C30064k.f122676w;
    }
}
