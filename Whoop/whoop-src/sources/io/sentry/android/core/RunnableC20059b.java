package io.sentry.android.core;

import android.app.Activity;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.util.C20584f;

/* JADX INFO: renamed from: io.sentry.android.core.b */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC20059b implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75356w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20067d f75357x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Activity f75358y;

    public /* synthetic */ RunnableC20059b(C20067d c20067d, Activity activity, int i13) {
        this.f75356w = i13;
        this.f75357x = c20067d;
        this.f75358y = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f75356w) {
            case 0:
                ((FrameMetricsAggregator) ((C20584f) this.f75357x.f75376a).m56714a()).add(this.f75358y);
                break;
            default:
                ((FrameMetricsAggregator) ((C20584f) this.f75357x.f75376a).m56714a()).remove(this.f75358y);
                break;
        }
    }
}
