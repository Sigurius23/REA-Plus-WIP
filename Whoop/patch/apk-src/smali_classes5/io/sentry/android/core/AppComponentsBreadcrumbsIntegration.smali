.class public final Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/t1;
.implements Ljava/io/Closeable;
.implements Landroid/content/ComponentCallbacks2;


# static fields
.field public static final E:Lio/sentry/g0;


# instance fields
.field public final w:Landroid/content/Context;

.field public x:Lio/sentry/i4;

.field public y:Lio/sentry/android/core/SentryAndroidOptions;

.field public final z:Lio/sentry/android/core/internal/util/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/g0;

    invoke-direct {v0}, Lio/sentry/g0;-><init>()V

    sput-object v0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->E:Lio/sentry/g0;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/android/core/internal/util/g;

    const-wide/32 v1, 0xea60

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lio/sentry/android/core/internal/util/g;-><init>(JI)V

    iput-object v0, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->z:Lio/sentry/android/core/internal/util/g;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    iput-object p1, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->w:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Runnable;)V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/sentry/h1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Failed to submit app components breadcrumb task"

    invoke-interface {v0, v1, p1, v3, v2}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final close()V
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->w:Landroid/content/Context;

    invoke-virtual {v1, p0}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v4, "It was not possible to unregisterComponentCallbacks"

    new-array v5, v0, [Ljava/lang/Object;

    invoke-interface {v2, v3, v1, v4, v5}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    iget-object v1, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "AppComponentsBreadcrumbsIntegration removed."

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final m(Lio/sentry/q6;)V
    .locals 5

    sget-object v0, Lio/sentry/i4;->a:Lio/sentry/i4;

    iput-object v0, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->x:Lio/sentry/i4;

    instance-of v0, p1, Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "SentryAndroidOptions is required"

    invoke-static {v0, v1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-object v2, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppComponentBreadcrumbs()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "AppComponentsBreadcrumbsIntegration enabled: %s"

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableAppComponentBreadcrumbs()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    :try_start_0
    iget-object v2, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->w:Landroid/content/Context;

    invoke-virtual {v2, p0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    const-string v3, "AppComponentsBreadcrumbsIntegration installed."

    new-array v4, v0, [Ljava/lang/Object;

    invoke-interface {v2, v1, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "AppComponentsBreadcrumbs"

    invoke-static {v1}, Ljc/x;->i(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v2, v0}, Lio/sentry/android/core/SentryAndroidOptions;->setEnableAppComponentBreadcrumbs(Z)V

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v2, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v3, "ComponentCallbacks2 is not available."

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {p1, v2, v1, v3, v0}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    new-instance v0, Lcom/mapbox/common/module/c;

    const/4 v5, 0x3

    move-object v1, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/mapbox/common/module/c;-><init>(Ljava/lang/Object;JLjava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->b(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onLowMemory()V
    .locals 0

    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 3

    const/16 v0, 0x28

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->z:Lio/sentry/android/core/internal/util/g;

    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/g;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    new-instance v2, Lio/sentry/android/core/a0;

    invoke-direct {v2, p0, v0, v1, p1}, Lio/sentry/android/core/a0;-><init>(Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;JI)V

    invoke-virtual {p0, v2}, Lio/sentry/android/core/AppComponentsBreadcrumbsIntegration;->b(Ljava/lang/Runnable;)V

    return-void
.end method
