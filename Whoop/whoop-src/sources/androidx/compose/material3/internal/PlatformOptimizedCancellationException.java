package androidx.compose.material3.internal;

import java.util.concurrent.CancellationException;
import p316m1.AbstractC24899e0;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/material3/internal/PlatformOptimizedCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "material3"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public PlatformOptimizedCancellationException() {
        super(null);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC24899e0.f97529a);
        return this;
    }
}
