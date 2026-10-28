package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import io.sentry.transport.InterfaceC20556f;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C20103d implements InterfaceC20556f {

    /* JADX INFO: renamed from: w */
    public static final C20103d f75527w = new C20103d();

    @Override // io.sentry.transport.InterfaceC20556f
    /* JADX INFO: renamed from: c */
    public long mo52216c() {
        return SystemClock.uptimeMillis();
    }
}
