package kotlinx.coroutines.internal;

import p715kotlin.Metadata;
import q83.InterfaceC30063j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Lkotlinx/coroutines/internal/DiagnosticCoroutineContextException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* JADX INFO: renamed from: w */
    public final transient InterfaceC30063j f89400w;

    public DiagnosticCoroutineContextException(InterfaceC30063j interfaceC30063j) {
        this.f89400w = interfaceC30063j;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.f89400w);
    }
}
