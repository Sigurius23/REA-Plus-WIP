package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Lkotlinx/coroutines/flow/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class AbortFlowException extends CancellationException {

    /* JADX INFO: renamed from: w */
    public final transient Object f89399w;

    public AbortFlowException(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f89399w = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
