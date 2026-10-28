package r63;

import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import s83.InterfaceC32270d;

/* JADX INFO: renamed from: r63.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C30997i implements InterfaceC32270d, InterfaceC30057d {

    /* JADX INFO: renamed from: w */
    public static final C30997i f127972w = new C30997i();

    @Override // s83.InterfaceC32270d
    public final InterfaceC32270d getCallerFrame() {
        return null;
    }

    @Override // q83.InterfaceC30057d
    public final InterfaceC30063j getContext() {
        return C30064k.f122676w;
    }

    @Override // q83.InterfaceC30057d
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
    }
}
