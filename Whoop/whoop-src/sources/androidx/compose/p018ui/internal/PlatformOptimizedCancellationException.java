package androidx.compose.p018ui.internal;

import java.util.concurrent.CancellationException;
import p603x2.AbstractC37832b;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/internal/PlatformOptimizedCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public PlatformOptimizedCancellationException() {
        super(null);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC37832b.f161989a);
        return this;
    }
}
