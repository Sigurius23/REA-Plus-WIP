package io.sentry.android.replay.util;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.sentry.android.replay.util.e */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC20237e implements Runnable {

    /* JADX INFO: renamed from: w */
    public final String f76024w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Runnable f76025x;

    public RunnableC20237e(Runnable delegate, String taskName) {
        AbstractC22676k.m65750j(taskName, "taskName");
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f76024w = taskName;
        this.f76025x = delegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76025x.run();
    }
}
