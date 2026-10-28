package bc3;

import java.util.concurrent.CancellationException;
import lc3.InterfaceC23833c;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import xb3.InterfaceC38174i;

/* JADX INFO: renamed from: bc3.k1 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC3027k1 extends InterfaceC30061h {
    InterfaceC3045p attachChild(InterfaceC3052r interfaceC3052r);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th3);

    CancellationException getCancellationException();

    InterfaceC38174i getChildren();

    InterfaceC23833c getOnJoin();

    InterfaceC3027k1 getParent();

    InterfaceC3056s0 invokeOnCompletion(Function1 function1);

    InterfaceC3056s0 invokeOnCompletion(boolean z4, boolean z13, Function1 function1);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(InterfaceC30057d interfaceC30057d);

    InterfaceC3027k1 plus(InterfaceC3027k1 interfaceC3027k1);

    boolean start();
}
