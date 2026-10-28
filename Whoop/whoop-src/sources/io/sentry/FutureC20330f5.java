package io.sentry;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.f5 */
/* JADX INFO: loaded from: classes3.dex */
public final class FutureC20330f5 implements Future {
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        throw new CancellationException();
    }
}
