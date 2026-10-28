.class public final Lcom/mapbox/common/SchedulerExecutorDispatcherKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/mapbox/common/Scheduler;",
        "Ljava/util/concurrent/Executor;",
        "asExecutor",
        "(Lcom/mapbox/common/Scheduler;)Ljava/util/concurrent/Executor;",
        "Lbc3/c1;",
        "asDispatcher",
        "(Lcom/mapbox/common/Scheduler;)Lbc3/c1;",
        "common_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final asDispatcher(Lcom/mapbox/common/Scheduler;)Lbc3/c1;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/common/SchedulerExecutorDispatcher;

    invoke-static {p0}, Lcom/mapbox/common/SchedulerExecutorDispatcherKt;->asExecutor(Lcom/mapbox/common/Scheduler;)Ljava/util/concurrent/Executor;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/mapbox/common/SchedulerExecutorDispatcher;-><init>(Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static final asExecutor(Lcom/mapbox/common/Scheduler;)Ljava/util/concurrent/Executor;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/mapbox/common/SchedulerExecutorDispatcherKt$asExecutor$1;

    invoke-direct {v0, p0}, Lcom/mapbox/common/SchedulerExecutorDispatcherKt$asExecutor$1;-><init>(Lcom/mapbox/common/Scheduler;)V

    return-object v0
.end method
