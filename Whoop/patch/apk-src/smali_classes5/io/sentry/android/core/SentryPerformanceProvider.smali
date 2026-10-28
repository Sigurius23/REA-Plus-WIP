.class public final Lio/sentry/android/core/SentryPerformanceProvider;
.super Lio/sentry/android/core/o0;
.source "SourceFile"


# static fields
.field public static final E:J

.field public static final synthetic F:I


# instance fields
.field public x:Landroid/app/Application;

.field public final y:Lio/sentry/android/core/t;

.field public final z:Lio/sentry/android/core/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sput-wide v0, Lio/sentry/android/core/SentryPerformanceProvider;->E:J

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lio/sentry/android/core/o0;-><init>()V

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    new-instance v0, Lio/sentry/android/core/t;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lio/sentry/android/core/t;-><init>(I)V

    iput-object v0, p0, Lio/sentry/android/core/SentryPerformanceProvider;->y:Lio/sentry/android/core/t;

    new-instance v1, Lio/sentry/android/core/k0;

    invoke-direct {v1, v0}, Lio/sentry/android/core/k0;-><init>(Lio/sentry/v0;)V

    iput-object v1, p0, Lio/sentry/android/core/SentryPerformanceProvider;->z:Lio/sentry/android/core/k0;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lio/sentry/p4;Lio/sentry/android/core/performance/g;)V
    .locals 9

    iget-boolean v0, p2, Lio/sentry/p4;->I:Z

    const/4 v1, 0x0

    iget-object v5, p0, Lio/sentry/android/core/SentryPerformanceProvider;->y:Lio/sentry/android/core/t;

    if-nez v0, :cond_0

    sget-object p1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string p2, "App start profiling was not sampled. It will not start."

    new-array p3, v1, [Ljava/lang/Object;

    invoke-virtual {v5, p1, p2, p3}, Lio/sentry/android/core/t;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance v0, Lio/sentry/h5;

    invoke-direct {v0}, Lio/sentry/h5;-><init>()V

    new-instance v2, Lio/sentry/android/core/h;

    new-instance v4, Lio/sentry/android/core/internal/util/q;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iget-object v3, p0, Lio/sentry/android/core/SentryPerformanceProvider;->z:Lio/sentry/android/core/k0;

    invoke-direct {v4, p1, v5, v3}, Lio/sentry/android/core/internal/util/q;-><init>(Landroid/content/Context;Lio/sentry/android/core/t;Lio/sentry/android/core/k0;)V

    iget-object v6, p2, Lio/sentry/p4;->E:Ljava/lang/String;

    iget v7, p2, Lio/sentry/p4;->H:I

    new-instance v8, Lhn/p;

    const/16 p1, 0x11

    invoke-direct {v8, v0, p1}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    iget-object v3, p0, Lio/sentry/android/core/SentryPerformanceProvider;->z:Lio/sentry/android/core/k0;

    invoke-direct/range {v2 .. v8}, Lio/sentry/android/core/h;-><init>(Lio/sentry/android/core/k0;Lio/sentry/android/core/internal/util/q;Lio/sentry/v0;Ljava/lang/String;ILio/sentry/util/e;)V

    const/4 p1, 0x0

    iput-object p1, p3, Lio/sentry/android/core/performance/g;->I:Lio/sentry/android/core/u;

    iput-object v2, p3, Lio/sentry/android/core/performance/g;->J:Lio/sentry/android/core/h;

    sget-object p1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string p3, "App start continuous profiling started."

    new-array v0, v1, [Ljava/lang/Object;

    invoke-virtual {v5, p1, p3, v0}, Lio/sentry/android/core/t;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lio/sentry/q6;->empty()Lio/sentry/q6;

    move-result-object p1

    iget-boolean p3, p2, Lio/sentry/p4;->I:Z

    if-eqz p3, :cond_1

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    invoke-virtual {p1, p3}, Lio/sentry/q6;->setProfileSessionSampleRate(Ljava/lang/Double;)V

    iget-object p2, p2, Lio/sentry/p4;->L:Lio/sentry/r3;

    new-instance p3, Lio/sentry/l7;

    invoke-direct {p3, p1}, Lio/sentry/l7;-><init>(Lio/sentry/q6;)V

    invoke-virtual {v2, p2, p3}, Lio/sentry/android/core/h;->b(Lio/sentry/r3;Lio/sentry/l7;)V

    return-void
.end method

.method public final attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
    .locals 2

    const-class v0, Lio/sentry/android/core/SentryPerformanceProvider;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p2, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "An applicationId is required to fulfill the manifest placeholder."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Landroid/content/Context;Lio/sentry/p4;Lio/sentry/android/core/performance/g;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    new-instance v3, Laa3/i1;

    iget-boolean v9, v1, Lio/sentry/p4;->y:Z

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iget-object v5, v1, Lio/sentry/p4;->z:Ljava/lang/Double;

    iget-boolean v6, v1, Lio/sentry/p4;->w:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    iget-object v8, v1, Lio/sentry/p4;->x:Ljava/lang/Double;

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Laa3/i1;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V

    iput-object v3, v2, Lio/sentry/android/core/performance/g;->K:Laa3/i1;

    iget-object v3, v3, Laa3/i1;->e:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const/4 v4, 0x0

    iget-object v14, v0, Lio/sentry/android/core/SentryPerformanceProvider;->y:Lio/sentry/android/core/t;

    if-eqz v3, :cond_1

    if-nez v9, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Lio/sentry/h5;

    invoke-direct {v3}, Lio/sentry/h5;-><init>()V

    new-instance v10, Lio/sentry/android/core/u;

    new-instance v13, Lio/sentry/android/core/internal/util/q;

    iget-object v5, v0, Lio/sentry/android/core/SentryPerformanceProvider;->z:Lio/sentry/android/core/k0;

    move-object/from16 v11, p1

    invoke-direct {v13, v11, v14, v5}, Lio/sentry/android/core/internal/util/q;-><init>(Landroid/content/Context;Lio/sentry/android/core/t;Lio/sentry/android/core/k0;)V

    iget-object v15, v1, Lio/sentry/p4;->E:Ljava/lang/String;

    iget-boolean v5, v1, Lio/sentry/p4;->F:Z

    iget v1, v1, Lio/sentry/p4;->H:I

    new-instance v6, Lhn/p;

    const/16 v7, 0x11

    invoke-direct {v6, v3, v7}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    iget-object v12, v0, Lio/sentry/android/core/SentryPerformanceProvider;->z:Lio/sentry/android/core/k0;

    move/from16 v17, v1

    move/from16 v16, v5

    move-object/from16 v18, v6

    invoke-direct/range {v10 .. v18}, Lio/sentry/android/core/u;-><init>(Landroid/content/Context;Lio/sentry/android/core/k0;Lio/sentry/android/core/internal/util/q;Lio/sentry/v0;Ljava/lang/String;ZILio/sentry/util/e;)V

    const/4 v1, 0x0

    iput-object v1, v2, Lio/sentry/android/core/performance/g;->J:Lio/sentry/android/core/h;

    iput-object v10, v2, Lio/sentry/android/core/performance/g;->I:Lio/sentry/android/core/u;

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v2, "App start profiling started."

    new-array v3, v4, [Ljava/lang/Object;

    invoke-virtual {v14, v1, v2, v3}, Lio/sentry/android/core/t;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v10}, Lio/sentry/android/core/u;->start()V

    return-void

    :cond_1
    :goto_0
    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v2, "App start profiling was not sampled. It will not start."

    new-array v3, v4, [Ljava/lang/Object;

    invoke-virtual {v14, v1, v2, v3}, Lio/sentry/android/core/t;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final onCreate()Z
    .locals 8

    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, v0, Lio/sentry/android/core/performance/g;->E:Lio/sentry/android/core/performance/h;

    sget-wide v3, Lio/sentry/android/core/SentryPerformanceProvider;->E:J

    invoke-virtual {v2, v3, v4}, Lio/sentry/android/core/performance/h;->c(J)V

    iget-object v2, p0, Lio/sentry/android/core/SentryPerformanceProvider;->z:Lio/sentry/android/core/k0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v0, Lio/sentry/android/core/performance/g;->z:Lio/sentry/android/core/performance/h;

    invoke-static {}, Landroid/os/Process;->getStartUptimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lio/sentry/android/core/performance/h;->c(J)V

    instance-of v2, v1, Landroid/app/Application;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/app/Application;

    iput-object v1, p0, Lio/sentry/android/core/SentryPerformanceProvider;->x:Landroid/app/Application;

    :cond_0
    iget-object v1, p0, Lio/sentry/android/core/SentryPerformanceProvider;->x:Landroid/app/Application;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Lio/sentry/android/core/performance/g;->e(Landroid/app/Application;)V

    :goto_0
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    iget-object v3, p0, Lio/sentry/android/core/SentryPerformanceProvider;->y:Lio/sentry/android/core/t;

    if-nez v1, :cond_2

    sget-object v0, Lio/sentry/n5;->FATAL:Lio/sentry/n5;

    const-string v1, "App. Context from ContentProvider is null"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v3, v0, v1, v2}, Lio/sentry/android/core/t;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_2
    new-instance v4, Ljava/io/File;

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v5

    const-string v6, "sentry"

    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v5, Ljava/io/File;

    const-string v6, "app_start_profiling_config"

    invoke-direct {v5, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {v5}, Ljava/io/File;->canRead()Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_6

    :cond_3
    :try_start_0
    new-instance v4, Ljava/io/BufferedReader;

    new-instance v6, Ljava/io/InputStreamReader;

    new-instance v7, Ljava/io/FileInputStream;

    invoke-direct {v7, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v6, v7}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v4, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v5, Lio/sentry/i2;

    invoke-static {}, Lio/sentry/q6;->empty()Lio/sentry/q6;

    move-result-object v6

    invoke-direct {v5, v6}, Lio/sentry/i2;-><init>(Lio/sentry/q6;)V

    const-class v6, Lio/sentry/p4;

    invoke-virtual {v5, v4, v6}, Lio/sentry/i2;->e(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/p4;

    if-nez v5, :cond_5

    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v1, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v3, v0, v1, v2}, Lio/sentry/android/core/t;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_4
    :goto_1
    :try_start_2
    invoke-virtual {v4}, Ljava/io/Reader;->close()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_4

    :catch_0
    move-exception v0

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_5
    :try_start_3
    iget-boolean v6, v5, Lio/sentry/p4;->G:Z

    if-eqz v6, :cond_6

    iget-boolean v6, v5, Lio/sentry/p4;->K:Z

    if-eqz v6, :cond_6

    invoke-virtual {p0, v1, v5, v0}, Lio/sentry/android/core/SentryPerformanceProvider;->a(Landroid/content/Context;Lio/sentry/p4;Lio/sentry/android/core/performance/g;)V

    goto :goto_1

    :cond_6
    iget-boolean v6, v5, Lio/sentry/p4;->F:Z

    if-nez v6, :cond_7

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v1, "Profiling is not enabled. App start profiling will not start."

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v3, v0, v1, v2}, Lio/sentry/android/core/t;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_7
    iget-boolean v2, v5, Lio/sentry/p4;->J:Z

    if-eqz v2, :cond_4

    invoke-virtual {p0, v1, v5, v0}, Lio/sentry/android/core/SentryPerformanceProvider;->b(Landroid/content/Context;Lio/sentry/p4;Lio/sentry/android/core/performance/g;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :goto_2
    :try_start_4
    invoke-virtual {v4}, Ljava/io/Reader;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v1

    :try_start_5
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v0
    :try_end_5
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_4
    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Error reading app start profiling config file. "

    invoke-virtual {v3, v1, v2, v0}, Lio/sentry/android/core/t;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :goto_5
    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "App start profiling config file not found. "

    invoke-virtual {v3, v1, v2, v0}, Lio/sentry/android/core/t;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    :goto_6
    const/4 v0, 0x1

    return v0
.end method

.method public final shutdown()V
    .locals 3

    sget-object v0, Lio/sentry/android/core/performance/g;->R:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    move-result-object v1

    iget-object v1, v1, Lio/sentry/android/core/performance/g;->I:Lio/sentry/android/core/u;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/sentry/android/core/u;->close()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    move-result-object v1

    iget-object v1, v1, Lio/sentry/android/core/performance/g;->J:Lio/sentry/android/core/h;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lio/sentry/android/core/h;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
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

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
.end method
