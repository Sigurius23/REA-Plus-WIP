package com.mapbox.common;

/* JADX INFO: loaded from: classes.dex */
public interface Scheduler {
    SchedulerType getType();

    void schedule(Task task, TaskOptions taskOptions);
}
