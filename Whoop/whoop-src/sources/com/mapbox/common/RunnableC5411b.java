package com.mapbox.common;

import com.mapbox.bindgen.Expected;
import java.util.Map;

/* JADX INFO: renamed from: com.mapbox.common.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC5411b implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f21899w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Map.Entry f21900x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Expected f21901y;

    public /* synthetic */ RunnableC5411b(Map.Entry entry, Expected expected, int i13) {
        this.f21899w = i13;
        this.f21900x = entry;
        this.f21901y = expected;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21899w) {
            case 0:
                LifecycleMonitorAndroid.notifyPendingCallbacks$lambda$20$lambda$18$lambda$17(this.f21900x, this.f21901y);
                break;
            default:
                LifecycleMonitorAndroid.notifyPendingCallbacks$lambda$14$lambda$12$lambda$11(this.f21900x, this.f21901y);
                break;
        }
    }
}
