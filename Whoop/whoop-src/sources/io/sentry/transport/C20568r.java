package io.sentry.transport;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* JADX INFO: renamed from: io.sentry.transport.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C20568r extends AbstractQueuedSynchronizer {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f77048w = 0;

    public C20568r() {
        setState(0);
    }

    /* JADX INFO: renamed from: a */
    public static int m56689a(C20568r c20568r) {
        return c20568r.getState();
    }

    /* JADX INFO: renamed from: b */
    public static void m56690b(C20568r c20568r) {
        int state;
        do {
            state = c20568r.getState();
        } while (!c20568r.compareAndSetState(state, state + 1));
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final int tryAcquireShared(int i13) {
        return getState() == 0 ? 1 : -1;
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final boolean tryReleaseShared(int i13) {
        int state;
        int i14;
        do {
            state = getState();
            if (state == 0) {
                return false;
            }
            i14 = state - 1;
        } while (!compareAndSetState(state, i14));
        return i14 == 0;
    }
}
