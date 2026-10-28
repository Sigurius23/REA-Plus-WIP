package io.sentry.android.core;

import android.os.Debug;
import io.sentry.C20422m3;
import io.sentry.InterfaceC20639z0;

/* JADX INFO: renamed from: io.sentry.android.core.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C20126m implements InterfaceC20639z0 {
    @Override // io.sentry.InterfaceC20639z0
    /* JADX INFO: renamed from: a */
    public final void mo55960a() {
    }

    @Override // io.sentry.InterfaceC20639z0
    /* JADX INFO: renamed from: b */
    public final void mo55961b(C20422m3 c20422m3) {
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        c20422m3.f76499b = Long.valueOf(jFreeMemory);
        c20422m3.f76500c = Long.valueOf(nativeHeapSize);
    }
}
