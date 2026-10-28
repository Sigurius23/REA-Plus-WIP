.class public final Lio/sentry/android/core/SentryAndroidOptions;
.super Lio/sentry/q6;
.source "SourceFile"


# instance fields
.field private anrEnabled:Z

.field private anrProfilingSampleRate:Ljava/lang/Double;

.field private anrReportInDebug:Z

.field private anrTimeoutIntervalMillis:J

.field private attachAnrThreadDump:Z

.field private attachScreenshot:Z

.field private attachViewHierarchy:Z

.field private beforeScreenshotCaptureCallback:Lio/sentry/android/core/f1;

.field private beforeViewHierarchyCaptureCallback:Lio/sentry/android/core/f1;

.field private collectAdditionalContext:Z

.field private collectExternalStorageContext:Z

.field private debugImagesLoader:Lio/sentry/android/core/s0;

.field private enableActivityLifecycleBreadcrumbs:Z

.field private enableActivityLifecycleTracingAutoFinish:Z

.field private enableAnrFingerprinting:Z

.field private enableAppComponentBreadcrumbs:Z

.field private enableAppLifecycleBreadcrumbs:Z

.field private enableAutoActivityLifecycleTracing:Z

.field private enableAutoTraceIdGeneration:Z

.field private enableFramesTracking:Z

.field private enableNdk:Z

.field private enableNetworkEventBreadcrumbs:Z

.field private enablePerformanceV2:Z

.field private enableRootCheck:Z

.field private enableScopeSync:Z

.field private enableSystemEventBreadcrumbs:Z

.field private enableSystemEventBreadcrumbsExtras:Z

.field private enableTombstone:Z

.field private frameMetricsCollector:Lio/sentry/android/core/internal/util/q;

.field private nativeSdkName:Ljava/lang/String;

.field private ndkHandlerStrategy:Lio/sentry/android/core/y0;

.field private reportHistoricalAnrs:Z

.field private reportHistoricalTombstones:Z

.field private final screenshot:Lio/sentry/android/core/g1;

.field private final startupCrashDurationThresholdMillis:J

.field private startupCrashFlushTimeoutMillis:J


# direct methods
.method public constructor <init>()V
    .locals 5

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lio/sentry/q6;-><init>(Z)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lio/sentry/android/core/SentryAndroidOptions;->anrEnabled:Z

    const-wide/16 v2, 0x1388

    iput-wide v2, p0, Lio/sentry/android/core/SentryAndroidOptions;->anrTimeoutIntervalMillis:J

    iput-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->anrReportInDebug:Z

    iput-boolean v1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableActivityLifecycleBreadcrumbs:Z

    iput-boolean v1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableAppLifecycleBreadcrumbs:Z

    iput-boolean v1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableSystemEventBreadcrumbs:Z

    iput-boolean v1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableAppComponentBreadcrumbs:Z

    iput-boolean v1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableNetworkEventBreadcrumbs:Z

    iput-boolean v1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableAutoActivityLifecycleTracing:Z

    iput-boolean v1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableActivityLifecycleTracingAutoFinish:Z

    sget-object v4, Lio/sentry/android/core/t;->y:Lio/sentry/android/core/t;

    iput-object v4, p0, Lio/sentry/android/core/SentryAndroidOptions;->debugImagesLoader:Lio/sentry/android/core/s0;

    iput-boolean v1, p0, Lio/sentry/android/core/SentryAndroidOptions;->collectAdditionalContext:Z

    iput-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->collectExternalStorageContext:Z

    iput-wide v2, p0, Lio/sentry/android/core/SentryAndroidOptions;->startupCrashFlushTimeoutMillis:J

    const-wide/16 v2, 0x7d0

    iput-wide v2, p0, Lio/sentry/android/core/SentryAndroidOptions;->startupCrashDurationThresholdMillis:J

    iput-boolean v1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableFramesTracking:Z

    const/4 v2, 0x0

    iput-object v2, p0, Lio/sentry/android/core/SentryAndroidOptions;->nativeSdkName:Ljava/lang/String;

    iput-boolean v1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableRootCheck:Z

    iput-boolean v1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableNdk:Z

    sget-object v2, Lio/sentry/android/core/y0;->SENTRY_HANDLER_STRATEGY_DEFAULT:Lio/sentry/android/core/y0;

    iput-object v2, p0, Lio/sentry/android/core/SentryAndroidOptions;->ndkHandlerStrategy:Lio/sentry/android/core/y0;

    iput-boolean v1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableScopeSync:Z

    iput-boolean v1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableAutoTraceIdGeneration:Z

    iput-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableSystemEventBreadcrumbsExtras:Z

    iput-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->reportHistoricalAnrs:Z

    iput-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->reportHistoricalTombstones:Z

    iput-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->attachAnrThreadDump:Z

    iput-boolean v1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enablePerformanceV2:Z

    iput-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableTombstone:Z

    new-instance v2, Lio/sentry/android/core/g1;

    invoke-direct {v2}, Li63/j;-><init>()V

    iput-object v2, p0, Lio/sentry/android/core/SentryAndroidOptions;->screenshot:Lio/sentry/android/core/g1;

    iput-boolean v1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableAnrFingerprinting:Z

    const-string v1, "sentry.java.android/8.41.0"

    invoke-virtual {p0, v1}, Lio/sentry/q6;->setSentryClientName(Ljava/lang/String;)V

    invoke-direct {p0}, Lio/sentry/android/core/SentryAndroidOptions;->createSdkVersion()Lio/sentry/protocol/t;

    move-result-object v1

    invoke-virtual {p0, v1}, Lio/sentry/q6;->setSdkVersion(Lio/sentry/protocol/t;)V

    invoke-virtual {p0, v0}, Lio/sentry/q6;->setAttachServerName(Z)V

    return-void
.end method

.method private createSdkVersion()Lio/sentry/protocol/t;
    .locals 4

    invoke-virtual {p0}, Lio/sentry/q6;->getSdkVersion()Lio/sentry/protocol/t;

    move-result-object v0

    const-string v1, "sentry.java.android"

    const-string v2, "8.41.0"

    if-nez v0, :cond_0

    new-instance v0, Lio/sentry/protocol/t;

    invoke-direct {v0, v1, v2}, Lio/sentry/protocol/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iput-object v1, v0, Lio/sentry/protocol/t;->w:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/t;->x:Ljava/lang/String;

    :goto_0
    const-string v1, "maven:io.sentry:sentry-android-core"

    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Lio/sentry/l5;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public enableAllAutoBreadcrumbs(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableActivityLifecycleBreadcrumbs:Z

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableAppComponentBreadcrumbs:Z

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableSystemEventBreadcrumbs:Z

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableAppLifecycleBreadcrumbs:Z

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableNetworkEventBreadcrumbs:Z

    invoke-virtual {p0, p1}, Lio/sentry/q6;->setEnableUserInteractionBreadcrumbs(Z)V

    return-void
.end method

.method public getAnrProfilingSampleRate()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->anrProfilingSampleRate:Ljava/lang/Double;

    return-object v0
.end method

.method public getAnrTimeoutIntervalMillis()J
    .locals 2

    iget-wide v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->anrTimeoutIntervalMillis:J

    return-wide v0
.end method

.method public getBeforeScreenshotCaptureCallback()Lio/sentry/android/core/f1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getBeforeViewHierarchyCaptureCallback()Lio/sentry/android/core/f1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getDebugImagesLoader()Lio/sentry/android/core/s0;
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->debugImagesLoader:Lio/sentry/android/core/s0;

    return-object v0
.end method

.method public getFrameMetricsCollector()Lio/sentry/android/core/internal/util/q;
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->frameMetricsCollector:Lio/sentry/android/core/internal/util/q;

    return-object v0
.end method

.method public getNativeSdkName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->nativeSdkName:Ljava/lang/String;

    return-object v0
.end method

.method public getNdkHandlerStrategy()I
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->ndkHandlerStrategy:Lio/sentry/android/core/y0;

    invoke-virtual {v0}, Lio/sentry/android/core/y0;->getValue()I

    move-result v0

    return v0
.end method

.method public getScreenshot()Lio/sentry/android/core/g1;
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->screenshot:Lio/sentry/android/core/g1;

    return-object v0
.end method

.method public getStartupCrashDurationThresholdMillis()J
    .locals 2

    const-wide/16 v0, 0x7d0

    return-wide v0
.end method

.method public getStartupCrashFlushTimeoutMillis()J
    .locals 2

    iget-wide v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->startupCrashFlushTimeoutMillis:J

    return-wide v0
.end method

.method public isAnrEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->anrEnabled:Z

    return v0
.end method

.method public isAnrProfilingEnabled()Z
    .locals 4

    iget-object v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->anrProfilingSampleRate:Ljava/lang/Double;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isAnrReportInDebug()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->anrReportInDebug:Z

    return v0
.end method

.method public isAttachAnrThreadDump()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->attachAnrThreadDump:Z

    return v0
.end method

.method public isAttachScreenshot()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->attachScreenshot:Z

    return v0
.end method

.method public isAttachViewHierarchy()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->attachViewHierarchy:Z

    return v0
.end method

.method public isCollectAdditionalContext()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->collectAdditionalContext:Z

    return v0
.end method

.method public isCollectExternalStorageContext()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->collectExternalStorageContext:Z

    return v0
.end method

.method public isEnableActivityLifecycleBreadcrumbs()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableActivityLifecycleBreadcrumbs:Z

    return v0
.end method

.method public isEnableActivityLifecycleTracingAutoFinish()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableActivityLifecycleTracingAutoFinish:Z

    return v0
.end method

.method public isEnableAnrFingerprinting()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableAnrFingerprinting:Z

    return v0
.end method

.method public isEnableAppComponentBreadcrumbs()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableAppComponentBreadcrumbs:Z

    return v0
.end method

.method public isEnableAppLifecycleBreadcrumbs()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableAppLifecycleBreadcrumbs:Z

    return v0
.end method

.method public isEnableAutoActivityLifecycleTracing()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableAutoActivityLifecycleTracing:Z

    return v0
.end method

.method public isEnableAutoTraceIdGeneration()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableAutoTraceIdGeneration:Z

    return v0
.end method

.method public isEnableFramesTracking()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableFramesTracking:Z

    return v0
.end method

.method public isEnableNdk()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableNdk:Z

    return v0
.end method

.method public isEnableNetworkEventBreadcrumbs()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableNetworkEventBreadcrumbs:Z

    return v0
.end method

.method public isEnablePerformanceV2()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->enablePerformanceV2:Z

    return v0
.end method

.method public isEnableRootCheck()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableRootCheck:Z

    return v0
.end method

.method public isEnableScopeSync()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableScopeSync:Z

    return v0
.end method

.method public isEnableSystemEventBreadcrumbs()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableSystemEventBreadcrumbs:Z

    return v0
.end method

.method public isEnableSystemEventBreadcrumbsExtras()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableSystemEventBreadcrumbsExtras:Z

    return v0
.end method

.method public isReportHistoricalAnrs()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->reportHistoricalAnrs:Z

    return v0
.end method

.method public isReportHistoricalTombstones()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->reportHistoricalTombstones:Z

    return v0
.end method

.method public isTombstoneEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableTombstone:Z

    return v0
.end method

.method public setAnrEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->anrEnabled:Z

    return-void
.end method

.method public setAnrProfilingSampleRate(Ljava/lang/Double;)V
    .locals 3

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lts/o;->C(Ljava/lang/Double;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->anrProfilingSampleRate:Ljava/lang/Double;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The value "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not valid. Use null to disable or values >= 0.0 and <= 1.0."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setAnrReportInDebug(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->anrReportInDebug:Z

    return-void
.end method

.method public setAnrTimeoutIntervalMillis(J)V
    .locals 0

    iput-wide p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->anrTimeoutIntervalMillis:J

    return-void
.end method

.method public setAttachAnrThreadDump(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->attachAnrThreadDump:Z

    return-void
.end method

.method public setAttachScreenshot(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->attachScreenshot:Z

    return-void
.end method

.method public setAttachViewHierarchy(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->attachViewHierarchy:Z

    return-void
.end method

.method public setBeforeScreenshotCaptureCallback(Lio/sentry/android/core/f1;)V
    .locals 0

    return-void
.end method

.method public setBeforeViewHierarchyCaptureCallback(Lio/sentry/android/core/f1;)V
    .locals 0

    return-void
.end method

.method public setCollectAdditionalContext(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->collectAdditionalContext:Z

    return-void
.end method

.method public setCollectExternalStorageContext(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->collectExternalStorageContext:Z

    return-void
.end method

.method public setDebugImagesLoader(Lio/sentry/android/core/s0;)V
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lio/sentry/android/core/t;->y:Lio/sentry/android/core/t;

    :goto_0
    iput-object p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->debugImagesLoader:Lio/sentry/android/core/s0;

    return-void
.end method

.method public setEnableActivityLifecycleBreadcrumbs(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableActivityLifecycleBreadcrumbs:Z

    return-void
.end method

.method public setEnableActivityLifecycleTracingAutoFinish(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableActivityLifecycleTracingAutoFinish:Z

    return-void
.end method

.method public setEnableAnrFingerprinting(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableAnrFingerprinting:Z

    return-void
.end method

.method public setEnableAppComponentBreadcrumbs(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableAppComponentBreadcrumbs:Z

    return-void
.end method

.method public setEnableAppLifecycleBreadcrumbs(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableAppLifecycleBreadcrumbs:Z

    return-void
.end method

.method public setEnableAutoActivityLifecycleTracing(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableAutoActivityLifecycleTracing:Z

    return-void
.end method

.method public setEnableAutoTraceIdGeneration(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableAutoTraceIdGeneration:Z

    return-void
.end method

.method public setEnableFramesTracking(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableFramesTracking:Z

    return-void
.end method

.method public setEnableNdk(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableNdk:Z

    return-void
.end method

.method public setEnableNetworkEventBreadcrumbs(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableNetworkEventBreadcrumbs:Z

    return-void
.end method

.method public setEnablePerformanceV2(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enablePerformanceV2:Z

    return-void
.end method

.method public setEnableRootCheck(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableRootCheck:Z

    return-void
.end method

.method public setEnableScopeSync(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableScopeSync:Z

    return-void
.end method

.method public setEnableSystemEventBreadcrumbs(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableSystemEventBreadcrumbs:Z

    return-void
.end method

.method public setEnableSystemEventBreadcrumbsExtras(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableSystemEventBreadcrumbsExtras:Z

    return-void
.end method

.method public setFrameMetricsCollector(Lio/sentry/android/core/internal/util/q;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->frameMetricsCollector:Lio/sentry/android/core/internal/util/q;

    return-void
.end method

.method public setNativeHandlerStrategy(Lio/sentry/android/core/y0;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->ndkHandlerStrategy:Lio/sentry/android/core/y0;

    return-void
.end method

.method public setNativeSdkName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->nativeSdkName:Ljava/lang/String;

    return-void
.end method

.method public setReportHistoricalAnrs(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->reportHistoricalAnrs:Z

    return-void
.end method

.method public setReportHistoricalTombstones(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->reportHistoricalTombstones:Z

    return-void
.end method

.method public setStartupCrashFlushTimeoutMillis(J)V
    .locals 0

    iput-wide p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->startupCrashFlushTimeoutMillis:J

    return-void
.end method

.method public setTombstoneEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/sentry/android/core/SentryAndroidOptions;->enableTombstone:Z

    return-void
.end method
