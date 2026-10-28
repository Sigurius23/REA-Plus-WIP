.class public abstract Ly82/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly82/e$a;
    }
.end annotation


# static fields
.field private static final a:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private static final b:Ltr2/n;

.field private static final c:Landroid/os/Handler;

.field private static final d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ly82/e$a;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Landroid/os/HandlerThread;

.field private static final f:Lorg/joda/time/format/DateTimeFormatter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sput-object v0, Ly82/e;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "bluetooth-syncing-extended-logging-droid"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "WhoopActionScheduler"

    invoke-static {v1, v0}, Ltr2/n;->r(Ljava/lang/String;Z)Ltr2/n;

    move-result-object v0

    sput-object v0, Ly82/e;->b:Ltr2/n;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ly82/e;->d:Ljava/util/HashMap;

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "Action Scheduler Preempt"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    sput-object v0, Ly82/e;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v1, Ly82/e;->c:Landroid/os/Handler;

    const-string v0, "H:mm:ss"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Ly82/e;->f:Lorg/joda/time/format/DateTimeFormatter;

    return-void
.end method

.method public static bridge synthetic a()Ltr2/n;
    .locals 1

    sget-object v0, Ly82/e;->b:Ltr2/n;

    return-object v0
.end method

.method public static bridge synthetic b()Ljava/util/HashMap;
    .locals 1

    sget-object v0, Ly82/e;->d:Ljava/util/HashMap;

    return-object v0
.end method

.method public static c(Landroid/content/Context;I)V
    .locals 3

    const-class p0, Lx82/c;

    const/4 v0, 0x0

    invoke-static {p0, v0, v0}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lx82/c;

    sget-object v0, Ly82/e;->b:Ltr2/n;

    invoke-interface {v0}, Ltr2/n;->w()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Canceling scheduled jobs: "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    invoke-static {p1}, Ly82/e;->d(I)V

    invoke-virtual {p0}, Lx82/c;->a()Landroid/app/job/JobScheduler;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/app/job/JobScheduler;->cancel(I)V

    return-void
.end method

.method private static d(I)V
    .locals 1

    sget-object v0, Ly82/e;->d:Ljava/util/HashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly82/e$a;

    if-eqz p0, :cond_0

    sget-object v0, Ly82/e;->c:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public static e(I)Z
    .locals 2

    const-class v0, Lx82/c;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx82/c;

    invoke-virtual {v0}, Lx82/c;->a()Landroid/app/job/JobScheduler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/app/job/JobScheduler;->getPendingJob(I)Landroid/app/job/JobInfo;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static f(Ly82/b;Landroid/content/Context;I)V
    .locals 4

    const-class v0, Lx82/c;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx82/c;

    sget-object v1, Ly82/e;->b:Ltr2/n;

    invoke-interface {v1}, Ltr2/n;->w()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Scheduling job for action: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    invoke-virtual {v0}, Lx82/c;->a()Landroid/app/job/JobScheduler;

    move-result-object v0

    invoke-static {p0, p1, p2}, Lcom/whoop/service/WhoopActionJobService;->a(Ly82/b;Landroid/content/Context;I)Landroid/app/job/JobInfo;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    return-void
.end method

.method public static declared-synchronized g(Ly82/b;Landroid/content/Context;IJJLrr2/c;)V
    .locals 12

    move-wide/from16 v0, p5

    const-class v2, Ly82/e;

    monitor-enter v2

    :try_start_0
    const-class v3, Lx82/c;

    const/4 v4, 0x0

    invoke-static {v3, v4, v4}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx82/c;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    add-long v7, v5, p3

    sget-object v9, Ly82/e;->f:Lorg/joda/time/format/DateTimeFormatter;

    invoke-virtual {v9, v7, v8}, Lorg/joda/time/format/DateTimeFormatter;->print(J)Ljava/lang/String;

    move-result-object v7

    add-long/2addr v5, v0

    invoke-virtual {v9, v5, v6}, Lorg/joda/time/format/DateTimeFormatter;->print(J)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " - "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    sub-long v8, v0, p3

    const-wide/16 v10, 0x7d0

    cmp-long v6, v8, v10

    const/4 v8, 0x0

    if-lez v6, :cond_1

    sget-object v6, Ly82/e;->b:Ltr2/n;

    invoke-interface {v6}, Ltr2/n;->w()Z

    move-result v9

    if-eqz v9, :cond_0

    const-string v9, "Posting preempt runnable to go off at %s to run action: %s"

    filled-new-array {v7, p0}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v9, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    new-array v9, v8, [Lqr2/a$a;

    invoke-interface {v6, v7, v9}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_3

    :cond_0
    :goto_0
    invoke-static {p2}, Ly82/e;->d(I)V

    invoke-static/range {p0 .. p4}, Ly82/e;->h(Ly82/b;Landroid/content/Context;IJ)V

    add-long v6, p3, v10

    goto :goto_1

    :cond_1
    move-wide v6, p3

    :goto_1
    sget-object v9, Ly82/e;->b:Ltr2/n;

    invoke-interface {v9}, Ltr2/n;->w()Z

    move-result v10

    if-eqz v10, :cond_2

    const-string v10, "Scheduling job (%d) with window (%s), action: %s"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v11, v5, p0}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v10, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-array v8, v8, [Lqr2/a$a;

    invoke-interface {v9, v5, v8}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :try_start_1
    invoke-virtual {v3}, Lx82/c;->a()Landroid/app/job/JobScheduler;

    move-result-object v3

    invoke-static/range {p0 .. p2}, Lcom/whoop/service/WhoopActionJobService;->c(Ly82/b;Landroid/content/Context;I)Landroid/app/job/JobInfo$Builder;

    move-result-object p0

    invoke-virtual {p0, v6, v7}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    move-result-object p0

    invoke-virtual {p0, v0, v1}, Landroid/app/job/JobInfo$Builder;->setOverrideDeadline(J)Landroid/app/job/JobInfo$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    move-result-object p0

    invoke-virtual {v3, p0}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p0, v0

    :try_start_2
    new-instance p1, Lcom/whoop/domain/exception/ConnectivityException;

    const-string p2, "Caught an exception when trying to schedule a job in WhoopActionScheduler"

    invoke-direct {p1, p2, p0}, Lcom/whoop/domain/exception/ConnectivityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object/from16 p0, p7

    invoke-interface {p0, p1, v4}, Lrr2/c;->g(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    monitor-exit v2

    return-void

    :goto_3
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method

.method private static h(Ly82/b;Landroid/content/Context;IJ)V
    .locals 1

    new-instance v0, Ly82/e$a;

    invoke-direct {v0, p0, p1, p2}, Ly82/e$a;-><init>(Ly82/b;Landroid/content/Context;I)V

    sget-object p0, Ly82/e;->d:Ljava/util/HashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ly82/e;->c:Landroid/os/Handler;

    invoke-virtual {p0, v0, p3, p4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static declared-synchronized i(Ly82/b;Landroid/content/Context;IJJLrr2/c;)V
    .locals 8

    const-class v0, Ly82/e;

    monitor-enter v0

    :try_start_0
    const-class v1, Lx82/c;

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx82/c;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    add-long v5, v3, p3

    sget-object v7, Ly82/e;->f:Lorg/joda/time/format/DateTimeFormatter;

    invoke-virtual {v7, v5, v6}, Lorg/joda/time/format/DateTimeFormatter;->print(J)Ljava/lang/String;

    move-result-object v5

    add-long/2addr v3, p5

    invoke-virtual {v7, v3, v4}, Lorg/joda/time/format/DateTimeFormatter;->print(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " - "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ly82/e;->b:Ltr2/n;

    invoke-interface {v4}, Ltr2/n;->w()Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "Scheduling job (%d) without pre-empt runnable with window (%s), action: %s"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v6, v3, p0}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    new-array v5, v5, [Lqr2/a$a;

    invoke-interface {v4, v3, v5}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_0
    :goto_0
    :try_start_1
    invoke-virtual {v1}, Lx82/c;->a()Landroid/app/job/JobScheduler;

    move-result-object v1

    invoke-static {p0, p1, p2}, Lcom/whoop/service/WhoopActionJobService;->c(Ly82/b;Landroid/content/Context;I)Landroid/app/job/JobInfo$Builder;

    move-result-object p0

    invoke-virtual {p0, p3, p4}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    move-result-object p0

    invoke-virtual {p0, p5, p6}, Landroid/app/job/JobInfo$Builder;->setOverrideDeadline(J)Landroid/app/job/JobInfo$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    move-result-object p0

    invoke-virtual {v1, p0}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception p0

    :try_start_2
    new-instance p1, Lcom/whoop/domain/exception/ConnectivityException;

    const-string p2, "Caught an exception when trying to schedule a job in WhoopActionScheduler"

    invoke-direct {p1, p2, p0}, Lcom/whoop/domain/exception/ConnectivityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p7, p1, v2}, Lrr2/c;->g(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method
