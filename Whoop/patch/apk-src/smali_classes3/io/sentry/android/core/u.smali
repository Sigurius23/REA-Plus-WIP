.class public final Lio/sentry/android/core/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/o1;


# instance fields
.field public final E:I

.field public final F:Lio/sentry/util/e;

.field public final G:Lio/sentry/android/core/k0;

.field public H:Z

.field public final I:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final J:Lio/sentry/android/core/internal/util/q;

.field public volatile K:Lio/sentry/t3;

.field public volatile L:Lio/sentry/android/core/s;

.field public M:J

.field public N:J

.field public O:Ljava/util/Date;

.field public final P:Lio/sentry/util/a;

.field public final w:Landroid/content/Context;

.field public final x:Lio/sentry/v0;

.field public final y:Ljava/lang/String;

.field public final z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/k0;Lio/sentry/android/core/internal/util/q;)V
    .locals 9

    .line 1
    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    .line 2
    invoke-virtual {p2}, Lio/sentry/q6;->getProfilingTracesDirPath()Ljava/lang/String;

    move-result-object v5

    .line 3
    invoke-virtual {p2}, Lio/sentry/q6;->isProfilingEnabled()Z

    move-result v6

    .line 4
    invoke-virtual {p2}, Lio/sentry/q6;->getProfilingTracesHz()I

    move-result v7

    new-instance v8, Lhn/p;

    const/16 v0, 0xf

    invoke-direct {v8, p2, v0}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    .line 5
    invoke-direct/range {v0 .. v8}, Lio/sentry/android/core/u;-><init>(Landroid/content/Context;Lio/sentry/android/core/k0;Lio/sentry/android/core/internal/util/q;Lio/sentry/v0;Ljava/lang/String;ZILio/sentry/util/e;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/k0;Lio/sentry/android/core/internal/util/q;Lio/sentry/v0;Ljava/lang/String;ZILio/sentry/util/e;)V
    .locals 2

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lio/sentry/android/core/u;->H:Z

    .line 8
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v1, p0, Lio/sentry/android/core/u;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lio/sentry/android/core/u;->L:Lio/sentry/android/core/s;

    .line 10
    new-instance v0, Lio/sentry/util/a;

    .line 11
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 12
    iput-object v0, p0, Lio/sentry/android/core/u;->P:Lio/sentry/util/a;

    .line 13
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    .line 14
    :cond_0
    iput-object p1, p0, Lio/sentry/android/core/u;->w:Landroid/content/Context;

    .line 15
    const-string p1, "ILogger is required"

    invoke-static {p4, p1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lio/sentry/android/core/u;->x:Lio/sentry/v0;

    .line 16
    iput-object p3, p0, Lio/sentry/android/core/u;->J:Lio/sentry/android/core/internal/util/q;

    .line 17
    const-string p1, "The BuildInfoProvider is required."

    .line 18
    invoke-static {p2, p1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lio/sentry/android/core/u;->G:Lio/sentry/android/core/k0;

    .line 19
    iput-object p5, p0, Lio/sentry/android/core/u;->y:Ljava/lang/String;

    .line 20
    iput-boolean p6, p0, Lio/sentry/android/core/u;->z:Z

    .line 21
    iput p7, p0, Lio/sentry/android/core/u;->E:I

    .line 22
    iput-object p8, p0, Lio/sentry/android/core/u;->F:Lio/sentry/util/e;

    .line 23
    invoke-static {}, Ljc/x;->O()Ljava/util/Date;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/android/core/u;->O:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/n1;)V
    .locals 5

    iget-object v0, p0, Lio/sentry/android/core/u;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/android/core/u;->K:Lio/sentry/t3;

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/sentry/android/core/u;->P:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/u;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/sentry/android/core/u;->K:Lio/sentry/t3;

    if-nez v1, :cond_0

    new-instance v1, Lio/sentry/t3;

    iget-wide v2, p0, Lio/sentry/android/core/u;->M:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v3, p0, Lio/sentry/android/core/u;->N:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-direct {v1, p1, v2, v3}, Lio/sentry/t3;-><init>(Lio/sentry/n1;Ljava/lang/Long;Ljava/lang/Long;)V

    iput-object v1, p0, Lio/sentry/android/core/u;->K:Lio/sentry/t3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1

    :cond_1
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lio/sentry/q6;)Lio/sentry/s3;
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v6, p1

    move-object/from16 v8, p3

    move-object/from16 v0, p6

    iget-object v2, v1, Lio/sentry/android/core/u;->G:Lio/sentry/android/core/k0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v2, v1, Lio/sentry/android/core/u;->L:Lio/sentry/android/core/s;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, v1, Lio/sentry/android/core/u;->P:Lio/sentry/util/a;

    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v2

    :try_start_0
    iget-object v4, v1, Lio/sentry/android/core/u;->K:Lio/sentry/t3;

    if-eqz v4, :cond_1

    iget-object v5, v4, Lio/sentry/t3;->w:Ljava/lang/String;

    move-object/from16 v7, p2

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    :cond_1
    move-object/from16 v19, v3

    goto/16 :goto_9

    :cond_2
    iput-object v3, v1, Lio/sentry/android/core/u;->K:Lio/sentry/t3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Lio/sentry/s;->close()V

    iget-object v2, v1, Lio/sentry/android/core/u;->x:Lio/sentry/v0;

    sget-object v5, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v9, "Transaction %s (%s) finished."

    filled-new-array {v6, v8}, [Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v2, v5, v9, v11}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v2, v1, Lio/sentry/android/core/u;->L:Lio/sentry/android/core/s;

    const/4 v5, 0x0

    move-object/from16 v9, p5

    invoke-virtual {v2, v9, v5}, Lio/sentry/android/core/s;->a(Ljava/util/List;Z)Lb9/l1;

    move-result-object v2

    iget-object v9, v1, Lio/sentry/android/core/u;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v9, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    if-nez v2, :cond_3

    :goto_0
    return-object v3

    :cond_3
    iget-wide v11, v2, Lb9/l1;->x:J

    iget-wide v13, v1, Lio/sentry/android/core/u;->M:J

    sub-long/2addr v11, v13

    move v9, v5

    new-instance v5, Ljava/util/ArrayList;

    const/4 v13, 0x1

    invoke-direct {v5, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-wide v13, v2, Lb9/l1;->x:J

    move/from16 p5, v9

    move v15, v10

    iget-wide v9, v1, Lio/sentry/android/core/u;->M:J

    move-object/from16 v16, v5

    iget-wide v5, v2, Lb9/l1;->y:J

    move-wide/from16 v17, v5

    iget-wide v5, v1, Lio/sentry/android/core/u;->N:J

    move-object/from16 v19, v3

    iget-object v3, v4, Lio/sentry/t3;->E:Ljava/lang/Long;

    if-nez v3, :cond_4

    sub-long/2addr v13, v9

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v4, Lio/sentry/t3;->E:Ljava/lang/Long;

    iget-object v3, v4, Lio/sentry/t3;->z:Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    sub-long/2addr v13, v9

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v4, Lio/sentry/t3;->z:Ljava/lang/Long;

    sub-long v9, v17, v5

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v4, Lio/sentry/t3;->G:Ljava/lang/Long;

    iget-object v3, v4, Lio/sentry/t3;->F:Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    sub-long/2addr v9, v5

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v4, Lio/sentry/t3;->F:Ljava/lang/Long;

    :cond_4
    instance-of v3, v0, Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v3, :cond_5

    iget-object v3, v1, Lio/sentry/android/core/u;->w:Landroid/content/Context;

    move-object v4, v0

    check-cast v4, Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {v3, v4}, Lio/sentry/android/core/n0;->c(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/n0;

    move-result-object v3

    iget-object v3, v3, Lio/sentry/android/core/n0;->h:Ljava/lang/Long;

    goto :goto_1

    :cond_5
    move-object/from16 v3, v19

    :goto_1
    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    :goto_2
    move-object/from16 v17, v3

    goto :goto_3

    :cond_6
    const-string v3, "0"

    goto :goto_2

    :goto_3
    sget-object v3, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    new-instance v4, Lio/sentry/s3;

    iget-object v5, v2, Lb9/l1;->E:Ljava/lang/Object;

    check-cast v5, Ljava/io/File;

    move-object v6, v4

    iget-object v4, v1, Lio/sentry/android/core/u;->O:Ljava/util/Date;

    invoke-static {v11, v12}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v9

    iget-object v10, v1, Lio/sentry/android/core/u;->G:Lio/sentry/android/core/k0;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v3, :cond_7

    array-length v10, v3

    if-lez v10, :cond_7

    aget-object v3, v3, p5

    :goto_4
    move-object v11, v3

    goto :goto_5

    :cond_7
    const-string v3, ""

    goto :goto_4

    :goto_5
    new-instance v12, Lio/sentry/h0;

    const/4 v3, 0x3

    invoke-direct {v12, v3}, Lio/sentry/h0;-><init>(I)V

    iget-object v3, v1, Lio/sentry/android/core/u;->G:Lio/sentry/android/core/k0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    iget-object v3, v1, Lio/sentry/android/core/u;->G:Lio/sentry/android/core/k0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, Landroid/os/Build;->MODEL:Ljava/lang/String;

    iget-object v3, v1, Lio/sentry/android/core/u;->G:Lio/sentry/android/core/k0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move v10, v15

    sget-object v15, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    iget-object v3, v1, Lio/sentry/android/core/u;->G:Lio/sentry/android/core/k0;

    invoke-virtual {v3}, Lio/sentry/android/core/k0;->a()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v0}, Lio/sentry/q6;->getProguardUuid()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v0}, Lio/sentry/q6;->getRelease()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v0}, Lio/sentry/q6;->getEnvironment()Ljava/lang/String;

    move-result-object v20

    iget-boolean v0, v2, Lb9/l1;->z:Z

    if-nez v0, :cond_9

    if-eqz p4, :cond_8

    goto :goto_7

    :cond_8
    const-string v0, "normal"

    :goto_6
    move-object/from16 v21, v0

    goto :goto_8

    :cond_9
    :goto_7
    const-string v0, "timeout"

    goto :goto_6

    :goto_8
    iget-object v0, v2, Lb9/l1;->F:Ljava/lang/Object;

    move-object/from16 v22, v0

    check-cast v22, Ljava/util/Map;

    move-object/from16 v2, v16

    move-object/from16 v16, v3

    move-object v3, v5

    move-object v5, v2

    move-object v2, v6

    move-object/from16 v6, p1

    invoke-direct/range {v2 .. v22}, Lio/sentry/s3;-><init>(Ljava/io/File;Ljava/util/Date;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-object v2

    :catchall_0
    move-exception v0

    move-object v3, v0

    goto :goto_a

    :goto_9
    :try_start_1
    iget-object v0, v1, Lio/sentry/android/core/u;->x:Lio/sentry/v0;

    sget-object v3, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v4, "Transaction %s (%s) finished, but was not currently being profiled. Skipping"

    filled-new-array {v6, v8}, [Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v0, v3, v4, v5}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v2}, Lio/sentry/s;->close()V

    return-object v19

    :goto_a
    :try_start_2
    invoke-virtual {v2}, Lio/sentry/s;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_b

    :catchall_1
    move-exception v0

    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_b
    throw v3
.end method

.method public final c(Lio/sentry/z6;Ljava/util/List;Lio/sentry/q6;)Lio/sentry/s3;
    .locals 7

    iget-object v1, p1, Lio/sentry/z6;->e:Ljava/lang/String;

    iget-object v0, p1, Lio/sentry/z6;->a:Lio/sentry/protocol/v;

    invoke-virtual {v0}, Lio/sentry/protocol/v;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object p1, p1, Lio/sentry/z6;->b:Lio/sentry/d7;

    iget-object p1, p1, Lio/sentry/d7;->c:Lio/sentry/e7;

    iget-object p1, p1, Lio/sentry/e7;->w:Lio/sentry/protocol/v;

    invoke-virtual {p1}, Lio/sentry/protocol/v;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    move-object v0, p0

    move-object v5, p2

    move-object v6, p3

    invoke-virtual/range {v0 .. v6}, Lio/sentry/android/core/u;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lio/sentry/q6;)Lio/sentry/s3;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 8

    iget-object v0, p0, Lio/sentry/android/core/u;->K:Lio/sentry/t3;

    if-eqz v0, :cond_0

    iget-object v2, v0, Lio/sentry/t3;->y:Ljava/lang/String;

    iget-object v3, v0, Lio/sentry/t3;->w:Ljava/lang/String;

    iget-object v4, v0, Lio/sentry/t3;->x:Ljava/lang/String;

    invoke-static {}, Lio/sentry/o4;->b()Lio/sentry/d1;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/d1;->l()Lio/sentry/q6;

    move-result-object v7

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lio/sentry/android/core/u;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lio/sentry/q6;)Lio/sentry/s3;

    goto :goto_0

    :cond_0
    move-object v1, p0

    :goto_0
    iget-object v0, v1, Lio/sentry/android/core/u;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, v1, Lio/sentry/android/core/u;->L:Lio/sentry/android/core/s;

    if-eqz v0, :cond_3

    iget-object v0, v1, Lio/sentry/android/core/u;->L:Lio/sentry/android/core/s;

    iget-object v2, v0, Lio/sentry/android/core/s;->o:Lio/sentry/util/a;

    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v2

    :try_start_0
    iget-object v3, v0, Lio/sentry/android/core/s;->d:Ljava/util/concurrent/Future;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    invoke-interface {v3, v5}, Ljava/util/concurrent/Future;->cancel(Z)Z

    iput-object v4, v0, Lio/sentry/android/core/s;->d:Ljava/util/concurrent/Future;

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v3, v0

    goto :goto_2

    :cond_1
    :goto_1
    iget-boolean v3, v0, Lio/sentry/android/core/s;->n:Z

    if-eqz v3, :cond_2

    invoke-virtual {v0, v4, v5}, Lio/sentry/android/core/s;->a(Ljava/util/List;Z)Lb9/l1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-virtual {v2}, Lio/sentry/s;->close()V

    return-void

    :goto_2
    :try_start_1
    invoke-virtual {v2}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v3

    :cond_3
    return-void
.end method

.method public final isRunning()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/u;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public final start()V
    .locals 11

    iget-object v0, p0, Lio/sentry/android/core/u;->G:Lio/sentry/android/core/k0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lio/sentry/android/core/u;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-nez v0, :cond_7

    iget-boolean v0, p0, Lio/sentry/android/core/u;->H:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, Lio/sentry/android/core/u;->H:Z

    iget-boolean v0, p0, Lio/sentry/android/core/u;->z:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/sentry/android/core/u;->x:Lio/sentry/v0;

    sget-object v1, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v3, "Profiling is disabled in options."

    new-array v4, v2, [Ljava/lang/Object;

    invoke-interface {v0, v1, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v6, p0, Lio/sentry/android/core/u;->y:Ljava/lang/String;

    if-nez v6, :cond_2

    iget-object v0, p0, Lio/sentry/android/core/u;->x:Lio/sentry/v0;

    sget-object v1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v3, "Disabling profiling because no profiling traces dir path is defined in options."

    new-array v4, v2, [Ljava/lang/Object;

    invoke-interface {v0, v1, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget v0, p0, Lio/sentry/android/core/u;->E:I

    if-gtz v0, :cond_3

    iget-object v1, p0, Lio/sentry/android/core/u;->x:Lio/sentry/v0;

    sget-object v3, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v4, "Disabling profiling because trace rate is set to %d"

    invoke-interface {v1, v3, v4, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    new-instance v5, Lio/sentry/android/core/s;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1

    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    move-result-wide v0

    long-to-int v0, v0

    iget v1, p0, Lio/sentry/android/core/u;->E:I

    div-int v7, v0, v1

    iget-object v8, p0, Lio/sentry/android/core/u;->J:Lio/sentry/android/core/internal/util/q;

    iget-object v9, p0, Lio/sentry/android/core/u;->F:Lio/sentry/util/e;

    iget-object v10, p0, Lio/sentry/android/core/u;->x:Lio/sentry/v0;

    invoke-direct/range {v5 .. v10}, Lio/sentry/android/core/s;-><init>(Ljava/lang/String;ILio/sentry/android/core/internal/util/q;Lio/sentry/util/e;Lio/sentry/v0;)V

    iput-object v5, p0, Lio/sentry/android/core/u;->L:Lio/sentry/android/core/s;

    :goto_0
    iget-object v0, p0, Lio/sentry/android/core/u;->L:Lio/sentry/android/core/s;

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lio/sentry/android/core/u;->L:Lio/sentry/android/core/s;

    invoke-virtual {v0}, Lio/sentry/android/core/s;->c()Ld9/t;

    move-result-object v0

    if-nez v0, :cond_6

    :goto_1
    iget-object v0, p0, Lio/sentry/android/core/u;->L:Lio/sentry/android/core/s;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lio/sentry/android/core/u;->L:Lio/sentry/android/core/s;

    iget-boolean v0, v0, Lio/sentry/android/core/s;->n:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lio/sentry/android/core/u;->x:Lio/sentry/v0;

    sget-object v1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v3, "A profile is already running. This profile will be ignored."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_5
    iget-object v0, p0, Lio/sentry/android/core/u;->P:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v1

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lio/sentry/android/core/u;->K:Lio/sentry/t3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Lio/sentry/s;->close()V

    iget-object v0, p0, Lio/sentry/android/core/u;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    :try_start_1
    invoke-virtual {v1}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v2

    :cond_6
    iget-wide v3, v0, Ld9/t;->a:J

    iput-wide v3, p0, Lio/sentry/android/core/u;->M:J

    iget-wide v3, v0, Ld9/t;->b:J

    iput-wide v3, p0, Lio/sentry/android/core/u;->N:J

    iget-object v0, v0, Ld9/t;->c:Ljava/io/Serializable;

    check-cast v0, Ljava/util/Date;

    iput-object v0, p0, Lio/sentry/android/core/u;->O:Ljava/util/Date;

    iget-object v0, p0, Lio/sentry/android/core/u;->x:Lio/sentry/v0;

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "Profiler started."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_7
    return-void
.end method
