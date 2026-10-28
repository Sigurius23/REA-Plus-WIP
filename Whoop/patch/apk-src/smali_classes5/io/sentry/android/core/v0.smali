.class public abstract Lio/sentry/android/core/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Lio/sentry/android/core/k0;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 11

    const-string v0, ""

    const-string v1, "io.sentry.traces.trace-propagation-targets"

    const-string v2, "The options object is required."

    invoke-static {p2, v2}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    invoke-static {p0, v2, p1}, Lio/sentry/android/core/v0;->b(Landroid/content/Context;Lio/sentry/v0;Lio/sentry/android/core/k0;)Landroid/os/Bundle;

    move-result-object p0

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    const/4 v2, 0x0

    if-eqz p0, :cond_25

    const-string v3, "io.sentry.debug"

    invoke-virtual {p2}, Lio/sentry/q6;->isDebug()Z

    move-result v4

    invoke-static {p0, p1, v3, v4}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setDebug(Z)V

    invoke-virtual {p2}, Lio/sentry/q6;->isDebug()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "io.sentry.debug.level"

    invoke-virtual {p2}, Lio/sentry/q6;->getDiagnosticLevel()Lio/sentry/n5;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, p1, v3, v4}, Lio/sentry/android/core/v0;->g(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lio/sentry/n5;->valueOf(Ljava/lang/String;)Lio/sentry/n5;

    move-result-object v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setDiagnosticLevel(Lio/sentry/n5;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto/16 :goto_c

    :cond_0
    :goto_0
    const-string v3, "io.sentry.anr.enable"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrEnabled()Z

    move-result v4

    invoke-static {p0, p1, v3, v4}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrEnabled(Z)V

    const-string v3, "io.sentry.tombstone.enable"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isTombstoneEnabled()Z

    move-result v4

    invoke-static {p0, p1, v3, v4}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setTombstoneEnabled(Z)V

    const-string v3, "io.sentry.auto-session-tracking.enable"

    invoke-virtual {p2}, Lio/sentry/q6;->isEnableAutoSessionTracking()Z

    move-result v4

    invoke-static {p0, p1, v3, v4}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setEnableAutoSessionTracking(Z)V

    invoke-virtual {p2}, Lio/sentry/q6;->getSampleRate()Ljava/lang/Double;

    move-result-object v3

    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    if-nez v3, :cond_1

    const-string v3, "io.sentry.sample-rate"

    invoke-static {p0, p1, v3}, Lio/sentry/android/core/v0;->d(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;)D

    move-result-wide v6

    cmpl-double v3, v6, v4

    if-eqz v3, :cond_1

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setSampleRate(Ljava/lang/Double;)V

    :cond_1
    const-string v3, "io.sentry.anr.report-debug"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrReportInDebug()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrReportInDebug(Z)V

    const-string v3, "io.sentry.anr.timeout-interval-millis"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->getAnrTimeoutIntervalMillis()J

    move-result-wide v6

    invoke-static {p0, p1, v3, v6, v7}, Lio/sentry/android/core/v0;->f(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;J)J

    move-result-wide v6

    invoke-virtual {p2, v6, v7}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrTimeoutIntervalMillis(J)V

    const-string v3, "io.sentry.anr.attach-thread-dumps"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachAnrThreadDump()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachAnrThreadDump(Z)V

    const-string v3, "io.sentry.dsn"

    invoke-virtual {p2}, Lio/sentry/q6;->getDsn()Ljava/lang/String;

    move-result-object v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->g(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "io.sentry.enabled"

    invoke-virtual {p2}, Lio/sentry/q6;->isEnabled()Z

    move-result v7

    invoke-static {p0, p1, v6, v7}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_2

    goto :goto_1

    :cond_2
    if-nez v3, :cond_4

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v7

    sget-object v8, Lio/sentry/n5;->FATAL:Lio/sentry/n5;

    const-string v9, "DSN is required. Use empty string to disable SDK."

    new-array v10, v2, [Ljava/lang/Object;

    invoke-interface {v7, v8, v9, v10}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v7

    sget-object v8, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v9, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android"

    new-array v10, v2, [Ljava/lang/Object;

    invoke-interface {v7, v8, v9, v10}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    :goto_2
    invoke-virtual {p2, v6}, Lio/sentry/q6;->setEnabled(Z)V

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setDsn(Ljava/lang/String;)V

    const-string v3, "io.sentry.ndk.enable"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableNdk()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableNdk(Z)V

    const-string v3, "io.sentry.ndk.scope-sync.enable"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableScopeSync()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableScopeSync(Z)V

    const-string v3, "io.sentry.ndk.sdk-name"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->getNativeSdkName()Ljava/lang/String;

    move-result-object v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->g(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {p2, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setNativeSdkName(Ljava/lang/String;)V

    :cond_5
    const-string v3, "io.sentry.release"

    invoke-virtual {p2}, Lio/sentry/q6;->getRelease()Ljava/lang/String;

    move-result-object v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->g(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setRelease(Ljava/lang/String;)V

    const-string v3, "io.sentry.dist"

    invoke-virtual {p2}, Lio/sentry/q6;->getDist()Ljava/lang/String;

    move-result-object v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->g(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setDist(Ljava/lang/String;)V

    const-string v3, "io.sentry.environment"

    invoke-virtual {p2}, Lio/sentry/q6;->getEnvironment()Ljava/lang/String;

    move-result-object v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->g(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setEnvironment(Ljava/lang/String;)V

    const-string v3, "io.sentry.session-tracking.timeout-interval-millis"

    invoke-virtual {p2}, Lio/sentry/q6;->getSessionTrackingIntervalMillis()J

    move-result-wide v6

    invoke-static {p0, p1, v3, v6, v7}, Lio/sentry/android/core/v0;->f(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;J)J

    move-result-wide v6

    invoke-virtual {p2, v6, v7}, Lio/sentry/q6;->setSessionTrackingIntervalMillis(J)V

    const-string v3, "io.sentry.max-breadcrumbs"

    invoke-virtual {p2}, Lio/sentry/q6;->getMaxBreadcrumbs()I

    move-result v6

    int-to-long v6, v6

    invoke-static {p0, p1, v3, v6, v7}, Lio/sentry/android/core/v0;->f(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;J)J

    move-result-wide v6

    long-to-int v3, v6

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setMaxBreadcrumbs(I)V

    const-string v3, "io.sentry.breadcrumbs.activity-lifecycle"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableActivityLifecycleBreadcrumbs()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableActivityLifecycleBreadcrumbs(Z)V

    const-string v3, "io.sentry.breadcrumbs.app-lifecycle"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppLifecycleBreadcrumbs()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAppLifecycleBreadcrumbs(Z)V

    const-string v3, "io.sentry.breadcrumbs.system-events"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableSystemEventBreadcrumbs()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableSystemEventBreadcrumbs(Z)V

    const-string v3, "io.sentry.breadcrumbs.app-components"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppComponentBreadcrumbs()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAppComponentBreadcrumbs(Z)V

    const-string v3, "io.sentry.breadcrumbs.user-interaction"

    invoke-virtual {p2}, Lio/sentry/q6;->isEnableUserInteractionBreadcrumbs()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setEnableUserInteractionBreadcrumbs(Z)V

    const-string v3, "io.sentry.breadcrumbs.network-events"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableNetworkEventBreadcrumbs()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableNetworkEventBreadcrumbs(Z)V

    const-string v3, "io.sentry.uncaught-exception-handler.enable"

    invoke-virtual {p2}, Lio/sentry/q6;->isEnableUncaughtExceptionHandler()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setEnableUncaughtExceptionHandler(Z)V

    const-string v3, "io.sentry.attach-threads"

    invoke-virtual {p2}, Lio/sentry/q6;->isAttachThreads()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setAttachThreads(Z)V

    const-string v3, "io.sentry.attach-screenshot"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachScreenshot()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachScreenshot(Z)V

    const-string v3, "io.sentry.attach-view-hierarchy"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isAttachViewHierarchy()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setAttachViewHierarchy(Z)V

    const-string v3, "io.sentry.send-client-reports"

    invoke-virtual {p2}, Lio/sentry/q6;->isSendClientReports()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setSendClientReports(Z)V

    const-string v3, "io.sentry.auto-init"

    const/4 v6, 0x1

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_6

    sget-object v3, Lio/sentry/r1;->LOW:Lio/sentry/r1;

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setInitPriority(Lio/sentry/r1;)V

    :cond_6
    const-string v3, "io.sentry.force-init"

    invoke-virtual {p2}, Lio/sentry/q6;->isForceInit()Z

    move-result v7

    invoke-static {p0, p1, v3, v7}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setForceInit(Z)V

    const-string v3, "io.sentry.additional-context"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isCollectAdditionalContext()Z

    move-result v7

    invoke-static {p0, p1, v3, v7}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setCollectAdditionalContext(Z)V

    const-string v3, "io.sentry.external-storage-context"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isCollectExternalStorageContext()Z

    move-result v7

    invoke-static {p0, p1, v3, v7}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setCollectExternalStorageContext(Z)V

    invoke-virtual {p2}, Lio/sentry/q6;->getTracesSampleRate()Ljava/lang/Double;

    move-result-object v3

    if-nez v3, :cond_7

    const-string v3, "io.sentry.traces.sample-rate"

    invoke-static {p0, p1, v3}, Lio/sentry/android/core/v0;->d(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;)D

    move-result-wide v7

    cmpl-double v3, v7, v4

    if-eqz v3, :cond_7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setTracesSampleRate(Ljava/lang/Double;)V

    :cond_7
    const-string v3, "io.sentry.traces.trace-sampling"

    invoke-virtual {p2}, Lio/sentry/q6;->isTraceSampling()Z

    move-result v7

    invoke-static {p0, p1, v3, v7}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setTraceSampling(Z)V

    const-string v3, "io.sentry.traces.activity.enable"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoActivityLifecycleTracing()Z

    move-result v7

    invoke-static {p0, p1, v3, v7}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAutoActivityLifecycleTracing(Z)V

    const-string v3, "io.sentry.traces.activity.auto-finish.enable"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableActivityLifecycleTracingAutoFinish()Z

    move-result v7

    invoke-static {p0, p1, v3, v7}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableActivityLifecycleTracingAutoFinish(Z)V

    invoke-virtual {p2}, Lio/sentry/q6;->getProfilesSampleRate()Ljava/lang/Double;

    move-result-object v3

    if-nez v3, :cond_8

    const-string v3, "io.sentry.traces.profiling.sample-rate"

    invoke-static {p0, p1, v3}, Lio/sentry/android/core/v0;->d(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;)D

    move-result-wide v7

    cmpl-double v3, v7, v4

    if-eqz v3, :cond_8

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setProfilesSampleRate(Ljava/lang/Double;)V

    :cond_8
    invoke-virtual {p2}, Lio/sentry/q6;->getProfileSessionSampleRate()Ljava/lang/Double;

    move-result-object v3

    if-nez v3, :cond_9

    const-string v3, "io.sentry.traces.profiling.session-sample-rate"

    invoke-static {p0, p1, v3}, Lio/sentry/android/core/v0;->d(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;)D

    move-result-wide v7

    cmpl-double v3, v7, v4

    if-eqz v3, :cond_9

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setProfileSessionSampleRate(Ljava/lang/Double;)V

    :cond_9
    const-string v3, "io.sentry.traces.profiling.lifecycle"

    invoke-virtual {p2}, Lio/sentry/q6;->getProfileLifecycle()Lio/sentry/r3;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    invoke-static {p0, p1, v3, v7}, Lio/sentry/android/core/v0;->g(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-virtual {v3, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lio/sentry/r3;->valueOf(Ljava/lang/String;)Lio/sentry/r3;

    move-result-object v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setProfileLifecycle(Lio/sentry/r3;)V

    :cond_a
    const-string v3, "io.sentry.traces.profiling.start-on-app-start"

    invoke-virtual {p2}, Lio/sentry/q6;->isStartProfilerOnAppStart()Z

    move-result v7

    invoke-static {p0, p1, v3, v7}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setStartProfilerOnAppStart(Z)V

    const-string v3, "io.sentry.traces.user-interaction.enable"

    invoke-virtual {p2}, Lio/sentry/q6;->isEnableUserInteractionTracing()Z

    move-result v7

    invoke-static {p0, p1, v3, v7}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setEnableUserInteractionTracing(Z)V

    const-string v3, "io.sentry.traces.time-to-full-display.enable"

    invoke-virtual {p2}, Lio/sentry/q6;->isEnableTimeToFullDisplayTracing()Z

    move-result v7

    invoke-static {p0, p1, v3, v7}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setEnableTimeToFullDisplayTracing(Z)V

    const-string v3, "io.sentry.traces.idle-timeout"

    const-wide/16 v7, -0x1

    invoke-static {p0, p1, v3, v7, v8}, Lio/sentry/android/core/v0;->f(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;J)J

    move-result-wide v9

    cmp-long v3, v9, v7

    if-eqz v3, :cond_b

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setIdleTimeout(Ljava/lang/Long;)V

    :cond_b
    invoke-static {p0, p1, v1}, Lio/sentry/android/core/v0;->e(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    if-nez v3, :cond_c

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-virtual {p2, v1}, Lio/sentry/q6;->setTracePropagationTargets(Ljava/util/List;)V

    goto :goto_3

    :cond_c
    if-eqz v3, :cond_d

    invoke-virtual {p2, v3}, Lio/sentry/q6;->setTracePropagationTargets(Ljava/util/List;)V

    :cond_d
    :goto_3
    const-string v1, "io.sentry.traces.frames-tracking"

    invoke-static {p0, p1, v1, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {p2, v1}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableFramesTracking(Z)V

    const-string v1, "io.sentry.proguard-uuid"

    invoke-virtual {p2}, Lio/sentry/q6;->getProguardUuid()Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, p1, v1, v3}, Lio/sentry/android/core/v0;->g(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Lio/sentry/q6;->setProguardUuid(Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/sentry/q6;->getSdkVersion()Lio/sentry/protocol/t;

    move-result-object v1

    if-nez v1, :cond_e

    new-instance v1, Lio/sentry/protocol/t;

    invoke-direct {v1, v0, v0}, Lio/sentry/protocol/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :cond_e
    const-string v0, "io.sentry.sdk.name"

    invoke-virtual {v1}, Lio/sentry/protocol/t;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, p1, v0, v3}, Lio/sentry/android/core/v0;->h(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "name is required."

    invoke-static {v0, v3}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v1, Lio/sentry/protocol/t;->w:Ljava/lang/String;

    const-string v0, "io.sentry.sdk.version"

    invoke-virtual {v1}, Lio/sentry/protocol/t;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, p1, v0, v3}, Lio/sentry/android/core/v0;->h(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "version is required."

    invoke-static {v0, v3}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v1, Lio/sentry/protocol/t;->x:Ljava/lang/String;

    invoke-virtual {p2, v1}, Lio/sentry/q6;->setSdkVersion(Lio/sentry/protocol/t;)V

    const-string v0, "io.sentry.send-default-pii"

    invoke-virtual {p2}, Lio/sentry/q6;->isSendDefaultPii()Z

    move-result v1

    invoke-static {p0, p1, v0, v1}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p2, v0}, Lio/sentry/q6;->setSendDefaultPii(Z)V

    const-string v0, "io.sentry.gradle-plugin-integrations"

    invoke-static {p0, p1, v0}, Lio/sentry/android/core/v0;->e(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object v3

    invoke-virtual {v3, v1}, Lio/sentry/l5;->a(Ljava/lang/String;)V

    goto :goto_4

    :cond_f
    const-string v0, "io.sentry.enable-root-check"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableRootCheck()Z

    move-result v1

    invoke-static {p0, p1, v0, v1}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p2, v0}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableRootCheck(Z)V

    const-string v0, "io.sentry.send-modules"

    invoke-virtual {p2}, Lio/sentry/q6;->isSendModules()Z

    move-result v1

    invoke-static {p0, p1, v0, v1}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p2, v0}, Lio/sentry/q6;->setSendModules(Z)V

    const-string v0, "io.sentry.performance-v2.enable"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnablePerformanceV2()Z

    move-result v1

    invoke-static {p0, p1, v0, v1}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p2, v0}, Lio/sentry/android/core/SentryAndroidOptions;->setEnablePerformanceV2(Z)V

    const-string v0, "io.sentry.profiling.enable-app-start"

    invoke-virtual {p2}, Lio/sentry/q6;->isEnableAppStartProfiling()Z

    move-result v1

    invoke-static {p0, p1, v0, v1}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p2, v0}, Lio/sentry/q6;->setEnableAppStartProfiling(Z)V

    const-string v0, "io.sentry.enable-scope-persistence"

    invoke-virtual {p2}, Lio/sentry/q6;->isEnableScopePersistence()Z

    move-result v1

    invoke-static {p0, p1, v0, v1}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p2, v0}, Lio/sentry/q6;->setEnableScopePersistence(Z)V

    const-string v0, "io.sentry.traces.enable-auto-id-generation"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAutoTraceIdGeneration()Z

    move-result v1

    invoke-static {p0, p1, v0, v1}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p2, v0}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAutoTraceIdGeneration(Z)V

    const-string v0, "io.sentry.traces.deadline-timeout"

    invoke-virtual {p2}, Lio/sentry/q6;->getDeadlineTimeout()J

    move-result-wide v7

    invoke-static {p0, p1, v0, v7, v8}, Lio/sentry/android/core/v0;->f(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;J)J

    move-result-wide v0

    invoke-virtual {p2, v0, v1}, Lio/sentry/q6;->setDeadlineTimeout(J)V

    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/u6;->k()Ljava/lang/Double;

    move-result-object v0

    if-nez v0, :cond_10

    const-string v0, "io.sentry.session-replay.session-sample-rate"

    invoke-static {p0, p1, v0}, Lio/sentry/android/core/v0;->d(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;)D

    move-result-wide v0

    cmpl-double v3, v0, v4

    if-eqz v3, :cond_10

    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v3

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v3, v0}, Lio/sentry/u6;->v(Ljava/lang/Double;)V

    :cond_10
    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/u6;->j()Ljava/lang/Double;

    move-result-object v0

    if-nez v0, :cond_11

    const-string v0, "io.sentry.session-replay.on-error-sample-rate"

    invoke-static {p0, p1, v0}, Lio/sentry/android/core/v0;->d(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;)D

    move-result-wide v0

    cmpl-double v3, v0, v4

    if-eqz v3, :cond_11

    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v3

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v3, v0}, Lio/sentry/u6;->u(Ljava/lang/Double;)V

    :cond_11
    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    const-string v1, "io.sentry.session-replay.mask-all-text"

    invoke-static {p0, p1, v1, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lio/sentry/u6;->d(Z)V

    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    const-string v1, "io.sentry.session-replay.mask-all-images"

    invoke-static {p0, p1, v1, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lio/sentry/u6;->c(Z)V

    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    const-string v1, "io.sentry.session-replay.debug"

    invoke-static {p0, p1, v1, v2}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lio/sentry/u6;->o(Z)V

    const-string v0, "io.sentry.session-replay.screenshot-strategy"

    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1}, Lio/sentry/android/core/v0;->g(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_13

    const-string v3, "canvas"

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    sget-object v3, Lio/sentry/j4;->CANVAS:Lio/sentry/j4;

    iput-object v3, v0, Lio/sentry/u6;->o:Lio/sentry/j4;

    goto :goto_5

    :cond_12
    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    sget-object v3, Lio/sentry/j4;->PIXEL_COPY:Lio/sentry/j4;

    iput-object v3, v0, Lio/sentry/u6;->o:Lio/sentry/j4;

    :cond_13
    :goto_5
    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    const-string v3, "io.sentry.session-replay.capture-surface-views"

    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v6

    invoke-virtual {v6}, Lio/sentry/u6;->l()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lio/sentry/u6;->n(Z)V

    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/u6;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_16

    const-string v0, "io.sentry.session-replay.network-detail-allow-urls"

    invoke-static {p0, p1, v0}, Lio/sentry/android/core/v0;->e(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_16

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_14
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_14

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_15
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_16

    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    invoke-virtual {v0, v3}, Lio/sentry/u6;->q(Ljava/util/ArrayList;)V

    :cond_16
    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/u6;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_19

    const-string v0, "io.sentry.session-replay.network-detail-deny-urls"

    invoke-static {p0, p1, v0}, Lio/sentry/android/core/v0;->e(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_19

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_19

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_17
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_17

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_18
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_19

    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    invoke-virtual {v0, v3}, Lio/sentry/u6;->r(Ljava/util/ArrayList;)V

    :cond_19
    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    const-string v3, "io.sentry.session-replay.network-capture-bodies"

    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v6

    invoke-virtual {v6}, Lio/sentry/u6;->m()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lio/sentry/u6;->p(Z)V

    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/u6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sget-object v3, Lio/sentry/u6;->v:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ne v0, v3, :cond_1c

    const-string v0, "io.sentry.session-replay.network-request-headers"

    invoke-static {p0, p1, v0}, Lio/sentry/android/core/v0;->e(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1c

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1a
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_1a

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_1b
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1c

    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    invoke-virtual {v0, v3}, Lio/sentry/u6;->s(Ljava/util/ArrayList;)V

    :cond_1c
    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/u6;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sget-object v3, Lio/sentry/u6;->v:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ne v0, v3, :cond_1f

    const-string v0, "io.sentry.session-replay.network-response-headers"

    invoke-static {p0, p1, v0}, Lio/sentry/android/core/v0;->e(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1f

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1f

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1d
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_1d

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_1e
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1f

    invoke-virtual {p2}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    invoke-virtual {v0, v3}, Lio/sentry/u6;->t(Ljava/util/ArrayList;)V

    :cond_1f
    const-string v0, "io.sentry.ignored-errors"

    invoke-static {p0, p1, v0}, Lio/sentry/android/core/v0;->e(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lio/sentry/q6;->setIgnoredErrors(Ljava/util/List;)V

    const-string v0, "io.sentry.in-app-includes"

    invoke-static {p0, p1, v0}, Lio/sentry/android/core/v0;->e(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_20

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_20

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_20

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p2, v3}, Lio/sentry/q6;->addInAppInclude(Ljava/lang/String;)V

    goto :goto_a

    :cond_20
    const-string v0, "io.sentry.in-app-excludes"

    invoke-static {p0, p1, v0}, Lio/sentry/android/core/v0;->e(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_21

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_21

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_21

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p2, v3}, Lio/sentry/q6;->addInAppExclude(Ljava/lang/String;)V

    goto :goto_b

    :cond_21
    invoke-virtual {p2}, Lio/sentry/q6;->getLogs()Lio/sentry/i6;

    move-result-object v0

    const-string v3, "io.sentry.logs.enabled"

    invoke-virtual {p2}, Lio/sentry/q6;->getLogs()Lio/sentry/i6;

    move-result-object v6

    invoke-virtual {v6}, Lio/sentry/i6;->a()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lio/sentry/i6;->b(Z)V

    invoke-virtual {p2}, Lio/sentry/q6;->getMetrics()Lio/sentry/j6;

    move-result-object v0

    const-string v3, "io.sentry.metrics.enabled"

    invoke-virtual {p2}, Lio/sentry/q6;->getMetrics()Lio/sentry/j6;

    move-result-object v6

    invoke-virtual {v6}, Lio/sentry/j6;->a()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lio/sentry/j6;->b(Z)V

    invoke-virtual {p2}, Lio/sentry/q6;->getFeedbackOptions()Lio/sentry/i5;

    move-result-object v0

    const-string v3, "io.sentry.feedback.is-name-required"

    invoke-virtual {v0}, Lio/sentry/i5;->b()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lio/sentry/i5;->i(Z)V

    const-string v3, "io.sentry.feedback.show-name"

    invoke-virtual {v0}, Lio/sentry/i5;->e()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lio/sentry/i5;->l(Z)V

    const-string v3, "io.sentry.feedback.is-email-required"

    invoke-virtual {v0}, Lio/sentry/i5;->a()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lio/sentry/i5;->h(Z)V

    const-string v3, "io.sentry.feedback.show-email"

    invoke-virtual {v0}, Lio/sentry/i5;->d()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lio/sentry/i5;->k(Z)V

    const-string v3, "io.sentry.feedback.use-sentry-user"

    invoke-virtual {v0}, Lio/sentry/i5;->f()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lio/sentry/i5;->m(Z)V

    const-string v3, "io.sentry.feedback.show-branding"

    invoke-virtual {v0}, Lio/sentry/i5;->c()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lio/sentry/i5;->j(Z)V

    const-string v3, "io.sentry.feedback.use-shake-gesture"

    invoke-virtual {v0}, Lio/sentry/i5;->g()Z

    move-result v6

    invoke-static {p0, p1, v3, v6}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v0, v3}, Lio/sentry/i5;->n(Z)V

    const-string v0, "io.sentry.strict-trace-continuation.enabled"

    invoke-virtual {p2}, Lio/sentry/q6;->isStrictTraceContinuation()Z

    move-result v3

    invoke-static {p0, p1, v0, v3}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p2, v0}, Lio/sentry/q6;->setStrictTraceContinuation(Z)V

    const-string v0, "io.sentry.org-id"

    invoke-static {p0, p1, v0, v1}, Lio/sentry/android/core/v0;->g(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_22

    invoke-virtual {p2, v0}, Lio/sentry/q6;->setOrgId(Ljava/lang/String;)V

    :cond_22
    const-string v0, "io.sentry.spotlight.enable"

    invoke-virtual {p2}, Lio/sentry/q6;->isEnableSpotlight()Z

    move-result v3

    invoke-static {p0, p1, v0, v3}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {p2, v0}, Lio/sentry/q6;->setEnableSpotlight(Z)V

    const-string v0, "io.sentry.spotlight.url"

    invoke-static {p0, p1, v0, v1}, Lio/sentry/android/core/v0;->g(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_23

    invoke-virtual {p2, v0}, Lio/sentry/q6;->setSpotlightConnectionUrl(Ljava/lang/String;)V

    :cond_23
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->getScreenshot()Lio/sentry/android/core/g1;

    move-result-object v0

    const-string v1, "io.sentry.screenshot.mask-all-text"

    invoke-static {p0, p1, v1, v2}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Li63/j;->d(Z)V

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->getScreenshot()Lio/sentry/android/core/g1;

    move-result-object v0

    const-string v1, "io.sentry.screenshot.mask-all-images"

    invoke-static {p0, p1, v1, v2}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lio/sentry/android/core/g1;->c(Z)V

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->getAnrProfilingSampleRate()Ljava/lang/Double;

    move-result-object v0

    if-nez v0, :cond_24

    const-string v0, "io.sentry.anr.profiling.sample-rate"

    invoke-static {p0, p1, v0}, Lio/sentry/android/core/v0;->d(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;)D

    move-result-wide v0

    cmpl-double v3, v0, v4

    if-eqz v3, :cond_24

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p2, v0}, Lio/sentry/android/core/SentryAndroidOptions;->setAnrProfilingSampleRate(Ljava/lang/Double;)V

    :cond_24
    const-string v0, "io.sentry.anr.enable-fingerprinting"

    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAnrFingerprinting()Z

    move-result v1

    invoke-static {p0, p1, v0, v1}, Lio/sentry/android/core/v0;->c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z

    move-result p0

    invoke-virtual {p2, p0}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAnrFingerprinting(Z)V

    :cond_25
    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p0

    sget-object p1, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v0, "Retrieving configuration from AndroidManifest.xml"

    new-array v1, v2, [Ljava/lang/Object;

    invoke-interface {p0, p1, v0, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_c
    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v0, "Failed to read configuration from android manifest metadata."

    invoke-interface {p1, p2, v0, p0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static b(Landroid/content/Context;Lio/sentry/v0;Lio/sentry/android/core/k0;)Landroid/os/Bundle;
    .locals 0

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x21

    if-lt p1, p2, :cond_0

    sget-object p1, Lio/sentry/android/core/j0;->d:Lio/sentry/android/core/util/a;

    invoke-virtual {p1, p0}, Lio/sentry/android/core/util/a;->b(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/ApplicationInfo;

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/android/core/j0;->e:Lio/sentry/android/core/util/a;

    invoke-virtual {p1, p0}, Lio/sentry/android/core/util/a;->b(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/ApplicationInfo;

    :goto_0
    if-eqz p0, :cond_1

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Z)Z
    .locals 1

    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    sget-object p3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " read: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {p1, p3, p2, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return p0
.end method

.method public static d(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;)D
    .locals 4

    const/high16 v0, -0x40800000    # -1.0f

    invoke-virtual {p0, p2, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->doubleValue()D

    move-result-wide v0

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    cmpl-double v2, v0, v2

    if-nez v2, :cond_0

    const/4 v0, -0x1

    invoke-virtual {p0, p2, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Integer;->doubleValue()D

    move-result-wide v0

    :cond_0
    sget-object p0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " read: "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1, p0, p2, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-wide v0
.end method

.method public static e(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;)Ljava/util/List;
    .locals 2

    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v1, " read: "

    invoke-static {p2, v1, p0}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, p2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p0, :cond_0

    const-string p1, ","

    const/4 p2, -0x1

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static f(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;J)J
    .locals 1

    long-to-int p3, p3

    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p0

    int-to-long p3, p0

    sget-object p0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " read: "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {p1, p0, p2, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-wide p3
.end method

.method public static g(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget-object p3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v0, " read: "

    invoke-static {p2, v0, p0}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {p1, p3, p2, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p0
.end method

.method public static h(Landroid/os/Bundle;Lio/sentry/v0;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0, p2, p3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget-object p3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v0, " read: "

    invoke-static {p2, v0, p0}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {p1, p3, p2, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p0
.end method
