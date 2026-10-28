package io.sentry;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: io.sentry.h1 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20347h1 {
    /* JADX INFO: renamed from: a */
    void mo56216a(long j7);

    /* JADX INFO: renamed from: b */
    void mo56217b();

    /* JADX INFO: renamed from: c */
    Future mo56218c(Runnable runnable, long j7);

    boolean isClosed();

    Future submit(Runnable runnable);
}
