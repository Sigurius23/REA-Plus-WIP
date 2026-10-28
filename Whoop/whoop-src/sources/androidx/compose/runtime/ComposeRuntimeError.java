package androidx.compose.runtime;

import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/runtime/ComposeRuntimeError;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "runtime"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ComposeRuntimeError extends IllegalStateException {

    /* JADX INFO: renamed from: w */
    public final String f4770w;

    public ComposeRuntimeError(String str) {
        this.f4770w = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f4770w;
    }
}
