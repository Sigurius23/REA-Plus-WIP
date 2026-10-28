package kotlinx.coroutines;

import bc3.AbstractC3076z;
import p715kotlin.Metadata;
import q83.InterfaceC30063j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Lkotlinx/coroutines/DispatchException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class DispatchException extends Exception {

    /* JADX INFO: renamed from: w */
    public final Throwable f89396w;

    public DispatchException(Throwable th3, AbstractC3076z abstractC3076z, InterfaceC30063j interfaceC30063j) {
        super("Coroutine dispatcher " + abstractC3076z + " threw an exception, context = " + interfaceC30063j, th3);
        this.f89396w = th3;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f89396w;
    }
}
