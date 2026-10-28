.class public final Lio/sentry/android/core/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final F:J


# instance fields
.field public final E:J

.field public final w:Landroid/content/Context;

.field public final x:Lio/sentry/i4;

.field public final y:Lio/sentry/android/core/SentryAndroidOptions;

.field public final z:Lio/sentry/android/core/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x5b

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lio/sentry/android/core/i0;->F:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/transport/d;Lio/sentry/android/core/h0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    iput-object p1, p0, Lio/sentry/android/core/i0;->w:Landroid/content/Context;

    sget-object p1, Lio/sentry/i4;->a:Lio/sentry/i4;

    iput-object p1, p0, Lio/sentry/android/core/i0;->x:Lio/sentry/i4;

    iput-object p2, p0, Lio/sentry/android/core/i0;->y:Lio/sentry/android/core/SentryAndroidOptions;

    iput-object p4, p0, Lio/sentry/android/core/i0;->z:Lio/sentry/android/core/h0;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    sget-wide p3, Lio/sentry/android/core/i0;->F:J

    sub-long/2addr p1, p3

    iput-wide p1, p0, Lio/sentry/android/core/i0;->E:J

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/ApplicationExitInfo;Z)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/i0;->z:Lio/sentry/android/core/h0;

    invoke-interface {v0, p1, p2}, Lio/sentry/android/core/h0;->c(Landroid/app/ApplicationExitInfo;Z)Lgm/r;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lgm/r;->F()Lio/sentry/e5;

    move-result-object p2

    invoke-virtual {p1}, Lgm/r;->H()Lio/sentry/g0;

    move-result-object v1

    iget-object v2, p0, Lio/sentry/android/core/i0;->x:Lio/sentry/i4;

    invoke-virtual {v2, p2, v1}, Lio/sentry/i4;->v(Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/protocol/v;

    move-result-object p2

    sget-object v1, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-virtual {p2, v1}, Lio/sentry/protocol/v;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p1}, Lgm/r;->G()Lio/sentry/hints/c;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lio/sentry/hints/c;->e()Z

    move-result p2

    if-nez p2, :cond_1

    iget-object p2, p0, Lio/sentry/android/core/i0;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    invoke-interface {v0}, Lio/sentry/android/core/h0;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lgm/r;->F()Lio/sentry/e5;

    move-result-object p1

    iget-object p1, p1, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    filled-new-array {v0, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "Timed out waiting to flush %s event to disk. Event: %s"

    invoke-interface {p2, v1, v0, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final run()V
    .locals 14

    iget-object v0, p0, Lio/sentry/android/core/i0;->w:Landroid/content/Context;

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    const/4 v1, 0x0

    iget-object v2, p0, Lio/sentry/android/core/i0;->y:Lio/sentry/android/core/SentryAndroidOptions;

    if-nez v0, :cond_0

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Failed to retrieve ActivityManager."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, v1}, Landroid/app/ActivityManager;->getHistoricalProcessExitReasons(Ljava/lang/String;II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "No records in historical exit reasons."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    invoke-virtual {v2}, Lio/sentry/q6;->getEnvelopeDiskCache()Lio/sentry/cache/d;

    move-result-object v4

    instance-of v5, v4, Lio/sentry/cache/c;

    if-eqz v5, :cond_2

    invoke-virtual {v2}, Lio/sentry/q6;->isEnableAutoSessionTracking()Z

    move-result v5

    if-eqz v5, :cond_2

    check-cast v4, Lio/sentry/cache/c;

    invoke-virtual {v4}, Lio/sentry/cache/c;->g()Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v5

    sget-object v6, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v7, "Timed out waiting to flush previous session to its own file."

    new-array v8, v1, [Ljava/lang/Object;

    invoke-interface {v5, v6, v7, v8}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v4, v4, Lio/sentry/cache/c;->E:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v4}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, Lio/sentry/android/core/i0;->z:Lio/sentry/android/core/h0;

    invoke-interface {v0}, Lio/sentry/android/core/h0;->a()Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Los/a;->i(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    move-result-object v7

    invoke-virtual {v7}, Landroid/app/ApplicationExitInfo;->getReason()I

    move-result v8

    invoke-interface {v0}, Lio/sentry/android/core/h0;->d()I

    move-result v9

    if-ne v8, v9, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->remove()V

    move-object v3, v7

    :cond_4
    if-nez v3, :cond_5

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-interface {v0}, Lio/sentry/android/core/h0;->getLabel()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "No %ss have been found in the historical exit reasons list."

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_5
    invoke-virtual {v3}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    move-result-wide v6

    iget-wide v8, p0, Lio/sentry/android/core/i0;->E:J

    cmp-long v6, v6, v8

    if-gez v6, :cond_6

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-interface {v0}, Lio/sentry/android/core/h0;->getLabel()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "Latest %s happened too long ago, returning early."

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_6
    if-eqz v5, :cond_7

    invoke-virtual {v3}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    move-result-wide v6

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    cmp-long v6, v6, v10

    if-gtz v6, :cond_7

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-interface {v0}, Lio/sentry/android/core/h0;->getLabel()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "Latest %s has already been reported, returning early."

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_7
    invoke-interface {v0}, Lio/sentry/android/core/h0;->b()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-static {v4}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_8
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Los/a;->i(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    move-result-object v6

    invoke-virtual {v6}, Landroid/app/ApplicationExitInfo;->getReason()I

    move-result v7

    invoke-interface {v0}, Lio/sentry/android/core/h0;->d()I

    move-result v10

    if-ne v7, v10, :cond_8

    invoke-virtual {v6}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    move-result-wide v10

    cmp-long v7, v10, v8

    if-gez v7, :cond_9

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v7

    sget-object v10, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-interface {v0}, Lio/sentry/android/core/h0;->getLabel()Ljava/lang/String;

    move-result-object v11

    filled-new-array {v11, v6}, [Ljava/lang/Object;

    move-result-object v6

    const-string v11, "%s happened too long ago %s."

    invoke-interface {v7, v10, v11, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_9
    if-eqz v5, :cond_a

    invoke-virtual {v6}, Landroid/app/ApplicationExitInfo;->getTimestamp()J

    move-result-wide v10

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    cmp-long v7, v10, v12

    if-gtz v7, :cond_a

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v7

    sget-object v10, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-interface {v0}, Lio/sentry/android/core/h0;->getLabel()Ljava/lang/String;

    move-result-object v11

    filled-new-array {v11, v6}, [Ljava/lang/Object;

    move-result-object v6

    const-string v11, "%s has already been reported %s."

    invoke-interface {v7, v10, v11, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_a
    invoke-virtual {p0, v6, v1}, Lio/sentry/android/core/i0;->a(Landroid/app/ApplicationExitInfo;Z)V

    goto :goto_0

    :cond_b
    const/4 v0, 0x1

    invoke-virtual {p0, v3, v0}, Lio/sentry/android/core/i0;->a(Landroid/app/ApplicationExitInfo;Z)V

    return-void
.end method
