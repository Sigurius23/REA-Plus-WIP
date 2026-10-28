package kotlinx.coroutines;

import bc3.InterfaceC3027k1;
import bc3.InterfaceC3070x;
import java.util.concurrent.CancellationException;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, m65681d2 = {"Lkotlinx/coroutines/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lbc3/x;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class TimeoutCancellationException extends CancellationException implements InterfaceC3070x {

    /* JADX INFO: renamed from: w */
    public final transient InterfaceC3027k1 f89398w;

    public TimeoutCancellationException(String str, InterfaceC3027k1 interfaceC3027k1) {
        super(str);
        this.f89398w = interfaceC3027k1;
    }

    @Override // bc3.InterfaceC3070x
    /* JADX INFO: renamed from: a */
    public final Throwable mo8826a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.f89398w);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
