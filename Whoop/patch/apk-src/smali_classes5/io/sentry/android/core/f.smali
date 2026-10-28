.class public final synthetic Lio/sentry/android/core/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b4;
.implements Lio/sentry/n4;


# instance fields
.field public final synthetic w:Ljava/lang/Object;

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/android/core/f;->w:Ljava/lang/Object;

    iput-object p2, p0, Lio/sentry/android/core/f;->x:Ljava/lang/Object;

    iput-object p3, p0, Lio/sentry/android/core/f;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lio/sentry/q6;)V
    .locals 20

    move-object/from16 v1, p0

    iget-object v0, v1, Lio/sentry/android/core/f;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/t;

    iget-object v2, v1, Lio/sentry/android/core/f;->x:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Landroid/content/Context;

    iget-object v2, v1, Lio/sentry/android/core/f;->y:Ljava/lang/Object;

    check-cast v2, Lio/sentry/n4;

    move-object/from16 v4, p1

    check-cast v4, Lio/sentry/android/core/SentryAndroidOptions;

    const-string v5, "timber.log.Timber"

    invoke-static {v4, v5}, Lqt/e;->n(Lio/sentry/q6;Ljava/lang/String;)Z

    move-result v5

    const-string v6, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks"

    invoke-static {v4, v6}, Lqt/e;->n(Lio/sentry/q6;Ljava/lang/String;)Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    const-string v6, "io.sentry.android.fragment.FragmentLifecycleIntegration"

    invoke-static {v4, v6}, Lqt/e;->n(Lio/sentry/q6;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    move v8, v7

    :goto_0
    if-eqz v5, :cond_1

    const-string v5, "io.sentry.android.timber.SentryTimberIntegration"

    invoke-static {v4, v5}, Lqt/e;->n(Lio/sentry/q6;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v9, 0x1

    goto :goto_1

    :cond_1
    move v9, v7

    :goto_1
    const-string v5, "io.sentry.android.replay.ReplayIntegration"

    invoke-static {v4, v5}, Lqt/e;->n(Lio/sentry/q6;Ljava/lang/String;)Z

    move-result v10

    const-string v5, "io.sentry.android.distribution.DistributionIntegration"

    invoke-static {v4, v5}, Lqt/e;->n(Lio/sentry/q6;Ljava/lang/String;)Z

    move-result v11

    new-instance v14, Lio/sentry/android/core/k0;

    invoke-direct {v14, v0}, Lio/sentry/android/core/k0;-><init>(Lio/sentry/v0;)V

    new-instance v6, Lqt/e;

    const/16 v5, 0x1d

    invoke-direct {v6, v5}, Lqt/e;-><init>(I)V

    new-instance v7, Lio/sentry/android/core/d;

    invoke-direct {v7, v6, v4}, Lio/sentry/android/core/d;-><init>(Lqt/e;Lio/sentry/android/core/SentryAndroidOptions;)V

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    move-object v5, v3

    :goto_2
    invoke-virtual {v4, v0}, Lio/sentry/q6;->setLogger(Lio/sentry/v0;)V

    new-instance v13, Lio/sentry/android/core/t;

    const/4 v15, 0x2

    invoke-direct {v13, v15}, Lio/sentry/android/core/t;-><init>(I)V

    invoke-virtual {v4, v13}, Lio/sentry/q6;->setFatalLogger(Lio/sentry/v0;)V

    sget-object v13, Lio/sentry/g4;->CURRENT:Lio/sentry/g4;

    invoke-virtual {v4, v13}, Lio/sentry/q6;->setDefaultScopeType(Lio/sentry/g4;)V

    sget-object v13, Lio/sentry/z5;->OFF:Lio/sentry/z5;

    invoke-virtual {v4, v13}, Lio/sentry/q6;->setOpenTelemetryMode(Lio/sentry/z5;)V

    new-instance v13, Lio/sentry/android/core/e1;

    invoke-direct {v13}, Lio/sentry/android/core/e1;-><init>()V

    invoke-virtual {v4, v13}, Lio/sentry/q6;->setDateProvider(Lio/sentry/v4;)V

    invoke-virtual {v4}, Lio/sentry/q6;->getLogs()Lio/sentry/i6;

    move-result-object v13

    new-instance v15, Lio/sentry/android/core/t;

    const/4 v12, 0x4

    invoke-direct {v15, v12}, Lio/sentry/android/core/t;-><init>(I)V

    iput-object v15, v13, Lio/sentry/i6;->b:Lio/sentry/logger/b;

    invoke-virtual {v4}, Lio/sentry/q6;->getMetrics()Lio/sentry/j6;

    move-result-object v12

    new-instance v13, Lio/sentry/android/core/t;

    const/4 v15, 0x5

    invoke-direct {v13, v15}, Lio/sentry/android/core/t;-><init>(I)V

    iput-object v13, v12, Lio/sentry/j6;->b:Lio/sentry/metrics/b;

    const-wide/16 v12, 0xfa0

    invoke-virtual {v4, v12, v13}, Lio/sentry/q6;->setFlushTimeoutMillis(J)V

    new-instance v12, Lio/sentry/android/core/internal/util/q;

    invoke-direct {v12, v5, v0, v14}, Lio/sentry/android/core/internal/util/q;-><init>(Landroid/content/Context;Lio/sentry/android/core/t;Lio/sentry/android/core/k0;)V

    invoke-virtual {v4, v12}, Lio/sentry/android/core/SentryAndroidOptions;->setFrameMetricsCollector(Lio/sentry/android/core/internal/util/q;)V

    invoke-static {v5, v14, v4}, Lio/sentry/android/core/v0;->a(Landroid/content/Context;Lio/sentry/android/core/k0;Lio/sentry/android/core/SentryAndroidOptions;)V

    new-instance v0, Ljava/io/File;

    invoke-virtual {v5}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v12

    const-string v13, "sentry"

    invoke-direct {v0, v12, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lio/sentry/q6;->setCacheDirPath(Ljava/lang/String;)V

    sget-object v0, Lio/sentry/android/core/anr/e;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v12, 0x1

    invoke-virtual {v0, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-static {v5, v14}, Lio/sentry/android/core/j0;->f(Landroid/content/Context;Lio/sentry/android/core/k0;)Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v4}, Lio/sentry/q6;->getRelease()Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_3

    invoke-virtual {v0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v12

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v15, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, "@"

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v15, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, "+"

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v12}, Lio/sentry/q6;->setRelease(Ljava/lang/String;)V

    :cond_3
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    if-eqz v0, :cond_4

    const-string v12, "android."

    invoke-virtual {v0, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_4

    invoke-virtual {v4, v0}, Lio/sentry/q6;->addInAppInclude(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {v4}, Lio/sentry/q6;->getDistinctId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    :try_start_0
    invoke-static {v5}, Lio/sentry/android/core/t0;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lio/sentry/q6;->setDistinctId(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    invoke-virtual {v4}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v5

    sget-object v12, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v13, "Could not generate distinct Id."

    invoke-interface {v5, v12, v13, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_3
    sget-object v0, Lio/sentry/android/core/e0;->E:Lio/sentry/android/core/e0;

    iget-object v5, v0, Lio/sentry/android/core/e0;->x:Lio/sentry/android/core/d0;

    if-eqz v5, :cond_6

    goto :goto_4

    :cond_6
    iget-object v5, v0, Lio/sentry/android/core/e0;->w:Lio/sentry/util/a;

    invoke-virtual {v5}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v5

    :try_start_1
    invoke-virtual {v4}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v12

    invoke-virtual {v0, v12}, Lio/sentry/android/core/e0;->i(Lio/sentry/v0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    invoke-virtual {v5}, Lio/sentry/s;->close()V

    :goto_4
    invoke-virtual {v4}, Lio/sentry/q6;->activate()V

    move-object v5, v14

    invoke-static/range {v3 .. v11}, Lio/sentry/android/core/q;->a(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/k0;Lqt/e;Lio/sentry/android/core/d;ZZZZ)V

    :try_start_2
    invoke-interface {v2, v4}, Lio/sentry/n4;->b(Lio/sentry/q6;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v0

    invoke-virtual {v4}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v5, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v11, "Error in the \'OptionsConfiguration.configure\' callback."

    invoke-interface {v2, v5, v11, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_5
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    move-result-object v0

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isEnablePerformanceV2()Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, v0, Lio/sentry/android/core/performance/g;->z:Lio/sentry/android/core/performance/h;

    const-wide/16 v15, 0x0

    iget-wide v11, v2, Lio/sentry/android/core/performance/h;->y:J

    cmp-long v5, v11, v15

    if-nez v5, :cond_8

    invoke-static {}, Landroid/os/Process;->getStartUptimeMillis()J

    move-result-wide v11

    invoke-virtual {v2, v11, v12}, Lio/sentry/android/core/performance/h;->c(J)V

    goto :goto_6

    :cond_7
    const-wide/16 v15, 0x0

    :cond_8
    :goto_6
    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    instance-of v2, v2, Landroid/app/Application;

    if-eqz v2, :cond_9

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    check-cast v2, Landroid/app/Application;

    invoke-virtual {v0, v2}, Lio/sentry/android/core/performance/g;->e(Landroid/app/Application;)V

    :cond_9
    iget-object v0, v0, Lio/sentry/android/core/performance/g;->E:Lio/sentry/android/core/performance/h;

    iget-wide v11, v0, Lio/sentry/android/core/performance/h;->y:J

    cmp-long v2, v11, v15

    if-nez v2, :cond_a

    sget-wide v11, Lio/sentry/android/core/d1;->a:J

    invoke-virtual {v0, v11, v12}, Lio/sentry/android/core/performance/h;->c(J)V

    :cond_a
    invoke-virtual {v4}, Lio/sentry/q6;->getCacheDirPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {v4}, Lio/sentry/q6;->getEnvelopeDiskCache()Lio/sentry/cache/d;

    move-result-object v0

    instance-of v0, v0, Lio/sentry/transport/i;

    if-eqz v0, :cond_b

    new-instance v0, Lio/sentry/android/core/cache/b;

    invoke-direct {v0, v4}, Lio/sentry/android/core/cache/b;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    invoke-virtual {v4, v0}, Lio/sentry/q6;->setEnvelopeDiskCache(Lio/sentry/cache/d;)V

    :cond_b
    invoke-virtual {v4}, Lio/sentry/q6;->getConnectionStatusProvider()Lio/sentry/p0;

    move-result-object v0

    instance-of v0, v0, Lio/sentry/n2;

    if-eqz v0, :cond_c

    new-instance v0, Lio/sentry/android/core/internal/util/c;

    invoke-direct {v0, v3, v4, v14}, Lio/sentry/android/core/internal/util/c;-><init>(Landroid/content/Context;Lio/sentry/q6;Lio/sentry/android/core/k0;)V

    invoke-virtual {v4, v0}, Lio/sentry/q6;->setConnectionStatusProvider(Lio/sentry/p0;)V

    :cond_c
    invoke-virtual {v4}, Lio/sentry/q6;->getCacheDirPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v0, Lio/sentry/cache/f;

    invoke-direct {v0, v4}, Lio/sentry/cache/f;-><init>(Lio/sentry/q6;)V

    invoke-virtual {v4, v0}, Lio/sentry/q6;->addScopeObserver(Lio/sentry/c1;)V

    new-instance v0, Lio/sentry/cache/e;

    invoke-direct {v0, v4}, Lio/sentry/cache/e;-><init>(Lio/sentry/q6;)V

    invoke-virtual {v4, v0}, Lio/sentry/q6;->addOptionsObserver(Lio/sentry/w0;)V

    :cond_d
    new-instance v0, Lio/sentry/n;

    const/4 v2, 0x0

    invoke-direct {v0, v4, v2}, Lio/sentry/n;-><init>(Lio/sentry/q6;I)V

    invoke-virtual {v4, v0}, Lio/sentry/q6;->addEventProcessor(Lio/sentry/b0;)V

    new-instance v0, Lio/sentry/android/core/l0;

    invoke-direct {v0, v3, v14, v4}, Lio/sentry/android/core/l0;-><init>(Landroid/content/Context;Lio/sentry/android/core/k0;Lio/sentry/android/core/SentryAndroidOptions;)V

    invoke-virtual {v4, v0}, Lio/sentry/q6;->addEventProcessor(Lio/sentry/b0;)V

    new-instance v0, Lio/sentry/android/core/b1;

    invoke-direct {v0, v4, v7}, Lio/sentry/android/core/b1;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/d;)V

    invoke-virtual {v4, v0}, Lio/sentry/q6;->addEventProcessor(Lio/sentry/b0;)V

    new-instance v0, Lio/sentry/android/core/ScreenshotEventProcessor;

    invoke-direct {v0, v4, v14, v10}, Lio/sentry/android/core/ScreenshotEventProcessor;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/k0;Z)V

    invoke-virtual {v4, v0}, Lio/sentry/q6;->addEventProcessor(Lio/sentry/b0;)V

    new-instance v0, Lio/sentry/android/core/ViewHierarchyEventProcessor;

    invoke-direct {v0, v4}, Lio/sentry/android/core/ViewHierarchyEventProcessor;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    invoke-virtual {v4, v0}, Lio/sentry/q6;->addEventProcessor(Lio/sentry/b0;)V

    new-instance v0, Lio/sentry/android/core/g0;

    invoke-direct {v0, v3, v14, v4}, Lio/sentry/android/core/g0;-><init>(Landroid/content/Context;Lio/sentry/android/core/k0;Lio/sentry/android/core/SentryAndroidOptions;)V

    invoke-virtual {v4, v0}, Lio/sentry/q6;->addEventProcessor(Lio/sentry/b0;)V

    invoke-virtual {v4}, Lio/sentry/q6;->getTransportGate()Lio/sentry/transport/h;

    move-result-object v0

    instance-of v0, v0, Lio/sentry/transport/k;

    if-eqz v0, :cond_e

    new-instance v0, Lio/sentry/android/core/k0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v4, v0, Lio/sentry/android/core/k0;->a:Ljava/lang/Object;

    invoke-virtual {v4, v0}, Lio/sentry/q6;->setTransportGate(Lio/sentry/transport/h;)V

    :cond_e
    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    move-result-object v0

    invoke-virtual {v4}, Lio/sentry/q6;->getModulesLoader()Lio/sentry/internal/modules/a;

    move-result-object v2

    instance-of v2, v2, Lio/sentry/internal/modules/e;

    if-eqz v2, :cond_f

    new-instance v2, Lio/sentry/android/core/internal/modules/a;

    invoke-direct {v2, v3, v4}, Lio/sentry/android/core/internal/modules/a;-><init>(Landroid/content/Context;Lio/sentry/q6;)V

    invoke-virtual {v4, v2}, Lio/sentry/q6;->setModulesLoader(Lio/sentry/internal/modules/a;)V

    :cond_f
    invoke-virtual {v4}, Lio/sentry/q6;->getDebugMetaLoader()Lio/sentry/internal/debugmeta/a;

    move-result-object v2

    instance-of v2, v2, Lio/sentry/internal/debugmeta/b;

    if-eqz v2, :cond_10

    new-instance v2, Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v4}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v5

    invoke-direct {v2, v3, v5}, Lcom/google/crypto/tink/internal/l0;-><init>(Landroid/content/Context;Lio/sentry/v0;)V

    invoke-virtual {v4, v2}, Lio/sentry/q6;->setDebugMetaLoader(Lio/sentry/internal/debugmeta/a;)V

    :cond_10
    invoke-virtual {v4}, Lio/sentry/q6;->getVersionDetector()Lio/sentry/q1;

    move-result-object v2

    instance-of v2, v2, Lio/sentry/i3;

    if-eqz v2, :cond_11

    new-instance v2, Lbu/c;

    invoke-direct {v2, v4}, Lbu/c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Lio/sentry/q6;->setVersionDetector(Lio/sentry/q1;)V

    :cond_11
    new-instance v2, Lio/sentry/util/f;

    new-instance v5, Lio/sentry/a6;

    invoke-direct {v5, v6, v4}, Lio/sentry/a6;-><init>(Lqt/e;Lio/sentry/q6;)V

    invoke-direct {v2, v5}, Lio/sentry/util/f;-><init>(Lio/sentry/util/e;)V

    const-string v5, "androidx.compose.ui.node.Owner"

    invoke-static {v4, v5}, Lqt/e;->n(Lio/sentry/q6;Ljava/lang/String;)Z

    move-result v5

    invoke-virtual {v4}, Lio/sentry/q6;->getGestureTargetLocators()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_13

    new-instance v6, Ljava/util/ArrayList;

    const/4 v7, 0x2

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v7, Lio/sentry/android/core/internal/gestures/a;

    invoke-direct {v7, v2}, Lio/sentry/android/core/internal/gestures/a;-><init>(Lio/sentry/util/f;)V

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v5, :cond_12

    const-string v2, "io.sentry.compose.gestures.ComposeGestureTargetLocator"

    invoke-static {v4, v2}, Lqt/e;->n(Lio/sentry/q6;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_12

    new-instance v2, Lio/sentry/compose/gestures/ComposeGestureTargetLocator;

    invoke-virtual {v4}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v7

    invoke-direct {v2, v7}, Lio/sentry/compose/gestures/ComposeGestureTargetLocator;-><init>(Lio/sentry/v0;)V

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_12
    invoke-virtual {v4, v6}, Lio/sentry/q6;->setGestureTargetLocators(Ljava/util/List;)V

    :cond_13
    invoke-virtual {v4}, Lio/sentry/q6;->getViewHierarchyExporters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_14

    if-eqz v5, :cond_14

    const-string v2, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter"

    invoke-static {v4, v2}, Lqt/e;->n(Lio/sentry/q6;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_14

    new-instance v2, Ljava/util/ArrayList;

    const/4 v12, 0x1

    invoke-direct {v2, v12}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v5, Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;

    invoke-virtual {v4}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v6

    invoke-direct {v5, v6}, Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;-><init>(Lio/sentry/v0;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v4, v2}, Lio/sentry/q6;->setViewHierarchyExporters(Ljava/util/List;)V

    :cond_14
    invoke-virtual {v4}, Lio/sentry/q6;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object v2

    instance-of v2, v2, Lio/sentry/util/thread/b;

    if-eqz v2, :cond_15

    sget-object v2, Lio/sentry/android/core/internal/util/e;->a:Lio/sentry/android/core/internal/util/e;

    invoke-virtual {v4, v2}, Lio/sentry/q6;->setThreadChecker(Lio/sentry/util/thread/a;)V

    :cond_15
    invoke-virtual {v4}, Lio/sentry/q6;->getSocketTagger()Lio/sentry/k1;

    move-result-object v2

    instance-of v2, v2, Lio/sentry/d3;

    if-eqz v2, :cond_16

    sget-object v2, Lio/sentry/android/core/t;->x:Lio/sentry/android/core/t;

    invoke-virtual {v4, v2}, Lio/sentry/q6;->setSocketTagger(Lio/sentry/k1;)V

    :cond_16
    invoke-virtual {v4}, Lio/sentry/q6;->getPerformanceCollectors()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const-string v5, "options.getFrameMetricsCollector is required"

    if-eqz v2, :cond_17

    new-instance v2, Lio/sentry/android/core/m;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v4, v2}, Lio/sentry/q6;->addPerformanceCollector(Lio/sentry/x0;)V

    new-instance v2, Lio/sentry/android/core/i;

    invoke-virtual {v4}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v6

    invoke-direct {v2, v6}, Lio/sentry/android/core/i;-><init>(Lio/sentry/v0;)V

    invoke-virtual {v4, v2}, Lio/sentry/q6;->addPerformanceCollector(Lio/sentry/x0;)V

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->isEnablePerformanceV2()Z

    move-result v2

    if-eqz v2, :cond_17

    new-instance v2, Lio/sentry/android/core/q1;

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->getFrameMetricsCollector()Lio/sentry/android/core/internal/util/q;

    move-result-object v6

    invoke-static {v6, v5}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v4, v6}, Lio/sentry/android/core/q1;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/internal/util/q;)V

    invoke-virtual {v4, v2}, Lio/sentry/q6;->addPerformanceCollector(Lio/sentry/x0;)V

    :cond_17
    invoke-virtual {v4}, Lio/sentry/q6;->getCompositePerformanceCollector()Lio/sentry/l;

    move-result-object v2

    instance-of v2, v2, Lio/sentry/m2;

    if-eqz v2, :cond_18

    new-instance v2, Lio/sentry/r;

    invoke-direct {v2, v4}, Lio/sentry/r;-><init>(Lio/sentry/q6;)V

    invoke-virtual {v4, v2}, Lio/sentry/q6;->setCompositePerformanceCollector(Lio/sentry/l;)V

    :cond_18
    if-eqz v10, :cond_19

    invoke-virtual {v4}, Lio/sentry/q6;->getReplayController()Lio/sentry/v3;

    move-result-object v2

    invoke-interface {v2}, Lio/sentry/v3;->J()Lio/sentry/u3;

    move-result-object v2

    instance-of v2, v2, Lio/sentry/v2;

    if-eqz v2, :cond_19

    invoke-virtual {v4}, Lio/sentry/q6;->getReplayController()Lio/sentry/v3;

    move-result-object v2

    new-instance v6, Lio/sentry/android/replay/d;

    invoke-direct {v6, v4}, Lio/sentry/android/replay/d;-><init>(Lio/sentry/q6;)V

    invoke-interface {v2, v6}, Lio/sentry/v3;->h(Lio/sentry/android/replay/d;)V

    :cond_19
    sget-object v2, Lio/sentry/android/core/performance/g;->R:Lio/sentry/util/a;

    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v2

    :try_start_3
    iget-object v6, v0, Lio/sentry/android/core/performance/g;->I:Lio/sentry/android/core/u;

    iget-object v7, v0, Lio/sentry/android/core/performance/g;->J:Lio/sentry/android/core/h;

    const/4 v10, 0x0

    iput-object v10, v0, Lio/sentry/android/core/performance/g;->I:Lio/sentry/android/core/u;

    iput-object v10, v0, Lio/sentry/android/core/performance/g;->J:Lio/sentry/android/core/h;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-virtual {v2}, Lio/sentry/s;->close()V

    invoke-virtual {v4}, Lio/sentry/q6;->getCompositePerformanceCollector()Lio/sentry/l;

    move-result-object v0

    invoke-virtual {v4}, Lio/sentry/q6;->isProfilingEnabled()Z

    move-result v2

    if-nez v2, :cond_1d

    invoke-virtual {v4}, Lio/sentry/q6;->getProfilesSampleRate()Ljava/lang/Double;

    move-result-object v2

    if-eqz v2, :cond_1a

    goto :goto_7

    :cond_1a
    sget-object v2, Lio/sentry/p2;->y:Lio/sentry/p2;

    invoke-virtual {v4, v2}, Lio/sentry/q6;->setTransactionProfiler(Lio/sentry/o1;)V

    if-eqz v6, :cond_1b

    invoke-virtual {v6}, Lio/sentry/android/core/u;->close()V

    :cond_1b
    if-eqz v7, :cond_1c

    invoke-virtual {v4, v7}, Lio/sentry/q6;->setContinuousProfiler(Lio/sentry/q0;)V

    iget-object v2, v7, Lio/sentry/android/core/h;->O:Lio/sentry/protocol/v;

    iget-boolean v3, v7, Lio/sentry/android/core/h;->I:Z

    if-eqz v3, :cond_20

    sget-object v3, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-virtual {v2, v3}, Lio/sentry/protocol/v;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_20

    invoke-virtual {v2}, Lio/sentry/protocol/v;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lio/sentry/l;->f(Ljava/lang/String;)V

    goto :goto_8

    :cond_1c
    new-instance v13, Lio/sentry/android/core/h;

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->getFrameMetricsCollector()Lio/sentry/android/core/internal/util/q;

    move-result-object v15

    invoke-static {v15, v5}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v16

    invoke-virtual {v4}, Lio/sentry/q6;->getProfilingTracesDirPath()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v4}, Lio/sentry/q6;->getProfilingTracesHz()I

    move-result v18

    new-instance v0, Lio/sentry/android/core/p;

    const/4 v2, 0x0

    invoke-direct {v0, v4, v2}, Lio/sentry/android/core/p;-><init>(Lio/sentry/android/core/SentryAndroidOptions;I)V

    move-object/from16 v19, v0

    invoke-direct/range {v13 .. v19}, Lio/sentry/android/core/h;-><init>(Lio/sentry/android/core/k0;Lio/sentry/android/core/internal/util/q;Lio/sentry/v0;Ljava/lang/String;ILio/sentry/util/e;)V

    invoke-virtual {v4, v13}, Lio/sentry/q6;->setContinuousProfiler(Lio/sentry/q0;)V

    goto :goto_8

    :cond_1d
    :goto_7
    sget-object v0, Lio/sentry/o2;->w:Lio/sentry/o2;

    invoke-virtual {v4, v0}, Lio/sentry/q6;->setContinuousProfiler(Lio/sentry/q0;)V

    if-eqz v7, :cond_1e

    const/4 v12, 0x1

    invoke-virtual {v7, v12}, Lio/sentry/android/core/h;->a(Z)V

    :cond_1e
    if-eqz v6, :cond_1f

    invoke-virtual {v4, v6}, Lio/sentry/q6;->setTransactionProfiler(Lio/sentry/o1;)V

    goto :goto_8

    :cond_1f
    new-instance v0, Lio/sentry/android/core/u;

    invoke-virtual {v4}, Lio/sentry/android/core/SentryAndroidOptions;->getFrameMetricsCollector()Lio/sentry/android/core/internal/util/q;

    move-result-object v2

    invoke-static {v2, v5}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v3, v4, v14, v2}, Lio/sentry/android/core/u;-><init>(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/k0;Lio/sentry/android/core/internal/util/q;)V

    invoke-virtual {v4, v0}, Lio/sentry/q6;->setTransactionProfiler(Lio/sentry/o1;)V

    :cond_20
    :goto_8
    invoke-static {v4, v8, v9}, Lio/sentry/android/core/d1;->a(Lio/sentry/q6;ZZ)V

    return-void

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_4
    invoke-virtual {v2}, Lio/sentry/s;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_9

    :catchall_2
    move-exception v0

    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw v3

    :catchall_3
    move-exception v0

    move-object v2, v0

    :try_start_5
    invoke-virtual {v5}, Lio/sentry/s;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_a

    :catchall_4
    move-exception v0

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw v2
.end method

.method public g(Lio/sentry/n1;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/f;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/ActivityLifecycleIntegration;

    iget-object v1, p0, Lio/sentry/android/core/f;->x:Ljava/lang/Object;

    check-cast v1, Lio/sentry/b1;

    iget-object v2, p0, Lio/sentry/android/core/f;->y:Ljava/lang/Object;

    check-cast v2, Lio/sentry/n1;

    if-nez p1, :cond_0

    invoke-interface {v1, v2}, Lio/sentry/b1;->B(Lio/sentry/n1;)V

    return-void

    :cond_0
    iget-object p1, v0, Lio/sentry/android/core/ActivityLifecycleIntegration;->z:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-interface {v2}, Lio/sentry/n1;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Transaction \'%s\' won\'t be bound to the Scope since there\'s one already in there."

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
