package p605x6;

import android.content.Context;
import bc3.AbstractC3006f0;
import bc3.C2986a0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p33.C28820m;
import p395p6.C28894l;
import q83.AbstractC30054a;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: x6.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C38012q extends AbstractC30054a implements CoroutineExceptionHandler {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC38016u f162824w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28894l f162825x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Context f162826y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38012q(InterfaceC38016u interfaceC38016u, C28894l c28894l, Context context) {
        super(C2986a0.f11990w);
        this.f162824w = interfaceC38016u;
        this.f162825x = c28894l;
        this.f162826y = context;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(InterfaceC30063j interfaceC30063j, Throwable th3) {
        C28894l c28894l = this.f162825x;
        Context context = this.f162826y;
        InterfaceC38016u interfaceC38016u = this.f162824w;
        AbstractC3006f0.m8732z(interfaceC38016u, null, null, new C28820m(c28894l, context, th3, interfaceC38016u, null, 13), 3);
    }
}
