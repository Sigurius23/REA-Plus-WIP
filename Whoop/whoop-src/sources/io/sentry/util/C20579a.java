package io.sentry.util;

import io.sentry.C20535s;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: io.sentry.util.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C20579a extends ReentrantLock {
    /* JADX INFO: renamed from: a */
    public final C20535s m56711a() {
        lock();
        return new C20535s(this, 1);
    }
}
