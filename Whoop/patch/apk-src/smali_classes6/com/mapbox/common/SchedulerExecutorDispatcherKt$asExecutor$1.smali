.class public final Lcom/mapbox/common/SchedulerExecutorDispatcherKt$asExecutor$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/common/SchedulerExecutorDispatcherKt;->asExecutor(Lcom/mapbox/common/Scheduler;)Ljava/util/concurrent/Executor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/mapbox/common/SchedulerExecutorDispatcherKt$asExecutor$1",
        "Ljava/util/concurrent/Executor;",
        "Ljava/lang/Runnable;",
        "command",
        "Ll83/a0;",
        "execute",
        "(Ljava/lang/Runnable;)V",
        "common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $self:Lcom/mapbox/common/Scheduler;


# direct methods
.method public constructor <init>(Lcom/mapbox/common/Scheduler;)V
    .locals 0

    iput-object p1, p0, Lcom/mapbox/common/SchedulerExecutorDispatcherKt$asExecutor$1;->$self:Lcom/mapbox/common/Scheduler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 5

    iget-object v0, p0, Lcom/mapbox/common/SchedulerExecutorDispatcherKt$asExecutor$1;->$self:Lcom/mapbox/common/Scheduler;

    new-instance v1, Lcom/mapbox/common/SchedulerExecutorDispatcherKt$asExecutor$1$execute$1;

    invoke-direct {v1, p1}, Lcom/mapbox/common/SchedulerExecutorDispatcherKt$asExecutor$1$execute$1;-><init>(Ljava/lang/Runnable;)V

    new-instance p1, Lcom/mapbox/common/TaskOptions;

    const-wide/16 v2, 0x0

    sget-object v4, Lcom/mapbox/common/TaskPriority;->DEFAULT:Lcom/mapbox/common/TaskPriority;

    invoke-direct {p1, v2, v3, v4}, Lcom/mapbox/common/TaskOptions;-><init>(JLcom/mapbox/common/TaskPriority;)V

    invoke-interface {v0, v1, p1}, Lcom/mapbox/common/Scheduler;->schedule(Lcom/mapbox/common/Task;Lcom/mapbox/common/TaskOptions;)V

    return-void
.end method
