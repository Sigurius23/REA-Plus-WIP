package bc3;

import java.util.concurrent.CancellationException;
import p715kotlin.jvm.functions.Function1;
import q83.AbstractC30054a;
import q83.InterfaceC30057d;
import xb3.C38169d;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: bc3.y1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3075y1 extends AbstractC30054a implements InterfaceC3027k1 {

    /* JADX INFO: renamed from: w */
    public static final C3075y1 f12109w = new C3075y1(C3023j1.f12041w);

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3045p attachChild(InterfaceC3052r interfaceC3052r) {
        return C3078z1.f12113w;
    }

    @Override // bc3.InterfaceC3027k1
    public final void cancel(CancellationException cancellationException) {
    }

    @Override // bc3.InterfaceC3027k1
    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC38174i getChildren() {
        return C38169d.f163464a;
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3056s0 invokeOnCompletion(Function1 function1) {
        return C3078z1.f12113w;
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean isActive() {
        return true;
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean isCancelled() {
        return false;
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean isCompleted() {
        return false;
    }

    @Override // bc3.InterfaceC3027k1
    public final Object join(InterfaceC30057d interfaceC30057d) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // bc3.InterfaceC3027k1
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // bc3.InterfaceC3027k1
    public final InterfaceC3056s0 invokeOnCompletion(boolean z4, boolean z13, Function1 function1) {
        return C3078z1.f12113w;
    }
}
