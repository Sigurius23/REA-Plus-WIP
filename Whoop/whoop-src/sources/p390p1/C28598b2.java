package p390p1;

import bc3.C2986a0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p000.C17820i;
import p004a2.C0154c;
import p098dt.AbstractC12350b;
import q83.AbstractC30054a;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: p1.b2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28598b2 extends AbstractC30054a implements CoroutineExceptionHandler {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C0154c f115711w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28602c2 f115712x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28598b2(C0154c c0154c, C28602c2 c28602c2) {
        super(C2986a0.f11990w);
        this.f115711w = c0154c;
        this.f115712x = c28602c2;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(InterfaceC30063j interfaceC30063j, Throwable th3) throws Throwable {
        C0154c c0154c = this.f115711w;
        C28602c2 c28602c2 = this.f115712x;
        AbstractC12350b.m34576Y(th3, new C17820i(2, c0154c, c28602c2));
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) c28602c2.f115715w.get(C2986a0.f11990w);
        if (coroutineExceptionHandler == null) {
            throw th3;
        }
        coroutineExceptionHandler.handleException(interfaceC30063j, th3);
    }
}
