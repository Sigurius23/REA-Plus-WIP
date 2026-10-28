.class public abstract Lio/sentry/android/core/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/android/core/k0;Lqt/e;Lio/sentry/android/core/d;ZZZZ)V
    .locals 6

    new-instance p3, Lio/sentry/util/f;

    new-instance v0, Lio/sentry/android/core/p;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lio/sentry/android/core/p;-><init>(Lio/sentry/android/core/SentryAndroidOptions;I)V

    invoke-direct {p3, v0}, Lio/sentry/util/f;-><init>(Lio/sentry/util/e;)V

    new-instance v0, Lio/sentry/android/core/SendCachedEnvelopeIntegration;

    new-instance v1, Lbu/c;

    new-instance v2, Lio/sentry/android/core/p;

    const/4 v3, 0x2

    invoke-direct {v2, p1, v3}, Lio/sentry/android/core/p;-><init>(Lio/sentry/android/core/SentryAndroidOptions;I)V

    invoke-direct {v1, v2}, Lbu/c;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1, p3}, Lio/sentry/android/core/SendCachedEnvelopeIntegration;-><init>(Lio/sentry/l4;Lio/sentry/util/f;)V

    invoke-virtual {p1, v0}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    const-string v0, "io.sentry.android.ndk.SentryNdk"

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    invoke-static {v1, v0}, Lqt/e;->o(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Lio/sentry/android/core/NdkIntegration;

    invoke-direct {v1, v0}, Lio/sentry/android/core/NdkIntegration;-><init>(Ljava/lang/Class;)V

    invoke-virtual {p1, v1}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    new-instance v1, Lio/sentry/android/core/TombstoneIntegration;

    invoke-direct {v1, p0}, Lio/sentry/android/core/TombstoneIntegration;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v1}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    :cond_0
    new-instance v1, Lio/sentry/android/core/EnvelopeFileObserverIntegration$OutboxEnvelopeFileObserverIntegration;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lio/sentry/android/core/EnvelopeFileObserverIntegration$OutboxEnvelopeFileObserverIntegration;-><init>(I)V

    invoke-virtual {p1, v1}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    new-instance v1, Lio/sentry/android/core/SendCachedEnvelopeIntegration;

    new-instance v3, Lad3/z;

    new-instance v4, Lio/sentry/android/core/p;

    const/4 v5, 0x2

    invoke-direct {v4, p1, v5}, Lio/sentry/android/core/p;-><init>(Lio/sentry/android/core/SentryAndroidOptions;I)V

    const/16 v5, 0x10

    invoke-direct {v3, v4, v5}, Lad3/z;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v1, v3, p3}, Lio/sentry/android/core/SendCachedEnvelopeIntegration;-><init>(Lio/sentry/l4;Lio/sentry/util/f;)V

    invoke-virtual {p1, v1}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    new-instance p3, Lio/sentry/android/core/AppLifecycleIntegration;

    invoke-direct {p3}, Lio/sentry/android/core/AppLifecycleIntegration;-><init>()V

    invoke-virtual {p1, p3}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    const/16 p3, 0x1e

    if-lt v0, p3, :cond_1

    new-instance p3, Lio/sentry/android/core/AnrV2Integration;

    invoke-direct {p3, p0}, Lio/sentry/android/core/AnrV2Integration;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :cond_1
    new-instance p3, Lio/sentry/android/core/AnrIntegration;

    invoke-direct {p3, p0}, Lio/sentry/android/core/AnrIntegration;-><init>(Landroid/content/Context;)V

    :goto_0
    invoke-virtual {p1, p3}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    new-instance p3, Lio/sentry/android/core/anr/AnrProfilingIntegration;

    invoke-direct {p3}, Lio/sentry/android/core/anr/AnrProfilingIntegration;-><init>()V

    invoke-virtual {p1, p3}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    instance-of p3, p0, Landroid/app/Application;

    if-eqz p3, :cond_2

    new-instance p3, Lio/sentry/android/core/ActivityLifecycleIntegration;

    move-object v0, p0

    check-cast v0, Landroid/app/Application;

    invoke-direct {p3, v0, p2, p4}, Lio/sentry/android/core/ActivityLifecycleIntegration;-><init>(Landroid/app/Application;Lio/sentry/android/core/k0;Lio/sentry/android/core/d;)V

    invoke-virtual {p1, p3}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    new-instance p3, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;

    invoke-direct {p3, v0}, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;-><init>(Landroid/app/Application;)V

    invoke-virtual {p1, p3}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    new-instance p3, Lio/sentry/android/core/UserInteractionIntegration;

    invoke-direct {p3, v0}, Lio/sentry/android/core/UserInteractionIntegration;-><init>(Landroid/app/Application;)V

    invoke-virtual {p1, p3}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    new-instance p3, Lio/sentry/android/core/FeedbackShakeIntegration;

    invoke-direct {p3, v0}, Lio/sentry/android/core/FeedbackShakeIntegration;-><init>(Landroid/app/Application;)V

    invoke-virtual {p1, p3}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    if-eqz p5, :cond_3

    new-instance p3, Lio/sentry/android/fragment/FragmentLifecycleIntegration;

    const/4 p4, 0x1

    invoke-direct {p3, v0, p4, p4}, Lio/sentry/android/fragment/FragmentLifecycleIntegration;-><init>(Landroid/app/Application;ZZ)V

    invoke-virtual {p1, p3}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p3

    sget-object p4, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string p5, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed."

    new-array v0, v2, [Ljava/lang/Object;

    invoke-interface {p3, p4, p5, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    :goto_1
    if-eqz p6, :cond_4

    new-instance p3, Lio/sentry/android/timber/SentryTimberIntegration;

    invoke-direct {p3}, Lio/sentry/android/timber/SentryTimberIntegration;-><init>()V

    invoke-virtual {p1, p3}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    :cond_4
    new-instance p3, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;

    invoke-direct {p3, p0}, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    new-instance p3, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;

    invoke-direct {p3, p0}, Lio/sentry/android/core/SystemEventsBreadcrumbsIntegration;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p3}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    new-instance p3, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;

    invoke-direct {p3, p0, p2}, Lio/sentry/android/core/NetworkBreadcrumbsIntegration;-><init>(Landroid/content/Context;Lio/sentry/android/core/k0;)V

    invoke-virtual {p1, p3}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    if-eqz p7, :cond_5

    new-instance p2, Lio/sentry/android/replay/ReplayIntegration;

    invoke-direct {p2, p0}, Lio/sentry/android/replay/ReplayIntegration;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    invoke-virtual {p1, p2}, Lio/sentry/q6;->setReplayController(Lio/sentry/v3;)V

    :cond_5
    if-eqz p8, :cond_6

    new-instance p2, Lio/sentry/android/distribution/DistributionIntegration;

    invoke-direct {p2, p0}, Lio/sentry/android/distribution/DistributionIntegration;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, p2}, Lio/sentry/q6;->setDistributionController(Lio/sentry/r0;)V

    invoke-virtual {p1, p2}, Lio/sentry/q6;->addIntegration(Lio/sentry/t1;)V

    :cond_6
    invoke-virtual {p1}, Lio/sentry/q6;->getFeedbackOptions()Lio/sentry/i5;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
