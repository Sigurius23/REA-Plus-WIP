package com.mapbox.common;

import bc3.AbstractC2995c1;
import java.util.concurrent.Executor;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/mapbox/common/Scheduler;", "Ljava/util/concurrent/Executor;", "asExecutor", "(Lcom/mapbox/common/Scheduler;)Ljava/util/concurrent/Executor;", "Lbc3/c1;", "asDispatcher", "(Lcom/mapbox/common/Scheduler;)Lbc3/c1;", "common_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class SchedulerExecutorDispatcherKt {
    public static final AbstractC2995c1 asDispatcher(Scheduler scheduler) {
        AbstractC22676k.m65750j(scheduler, "<this>");
        return new SchedulerExecutorDispatcher(asExecutor(scheduler));
    }

    public static final Executor asExecutor(final Scheduler scheduler) {
        AbstractC22676k.m65750j(scheduler, "<this>");
        return new Executor() { // from class: com.mapbox.common.SchedulerExecutorDispatcherKt.asExecutor.1
            @Override // java.util.concurrent.Executor
            public void execute(final Runnable command) {
                scheduler.schedule(new Task() { // from class: com.mapbox.common.SchedulerExecutorDispatcherKt$asExecutor$1$execute$1
                    @Override // com.mapbox.common.Task
                    public void run() {
                        Runnable runnable = command;
                        AbstractC22676k.m65747g(runnable);
                        runnable.run();
                    }
                }, new TaskOptions(0L, TaskPriority.DEFAULT));
            }
        };
    }
}
