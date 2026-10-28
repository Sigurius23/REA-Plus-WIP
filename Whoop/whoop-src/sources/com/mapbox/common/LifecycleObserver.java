package com.mapbox.common;

/* JADX INFO: loaded from: classes.dex */
public interface LifecycleObserver {
    void onLifecycleStateChanged(LifecycleState lifecycleState);

    void onMonitoringStateChanged(LifecycleMonitoringState lifecycleMonitoringState, String str);
}
