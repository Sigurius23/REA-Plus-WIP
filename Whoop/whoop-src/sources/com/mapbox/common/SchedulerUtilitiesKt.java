package com.mapbox.common;

import c93.InterfaceC4339a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/mapbox/common/Scheduler;", "Lcom/mapbox/common/TaskOptions;", "options", "Lkotlin/Function0;", "Ll83/a0;", "task", "schedule", "(Lcom/mapbox/common/Scheduler;Lcom/mapbox/common/TaskOptions;Lc93/a;)V", "common_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class SchedulerUtilitiesKt {
    public static final void schedule(Scheduler scheduler, TaskOptions options, final InterfaceC4339a task) {
        AbstractC22676k.m65750j(scheduler, "<this>");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(task, "task");
        scheduler.schedule(new Task() { // from class: com.mapbox.common.SchedulerUtilitiesKt.schedule.1
            @Override // com.mapbox.common.Task
            public void run() {
                task.invoke();
            }
        }, options);
    }

    public static /* synthetic */ void schedule$default(Scheduler scheduler, TaskOptions taskOptions, InterfaceC4339a interfaceC4339a, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            taskOptions = new TaskOptions(0L, TaskPriority.DEFAULT);
        }
        schedule(scheduler, taskOptions, interfaceC4339a);
    }
}
