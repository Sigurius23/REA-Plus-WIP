package io.sentry.android.core.performance;

import android.os.MessageQueue;
import android.os.SystemClock;

/* JADX INFO: renamed from: io.sentry.android.core.performance.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C20142e implements MessageQueue.IdleHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C20144g f75657a;

    public C20142e(C20144g c20144g) {
        this.f75657a = c20144g;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        this.f75657a.f75674y = SystemClock.uptimeMillis();
        C20144g.m56041a(this.f75657a);
        return false;
    }
}
