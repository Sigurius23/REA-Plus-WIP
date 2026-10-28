.class public final Lio/sentry/android/core/ActivityBreadcrumbsIntegration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/t1;
.implements Ljava/io/Closeable;
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final w:Landroid/app/Application;

.field public x:Lio/sentry/i4;

.field public y:Z

.field public final z:Lio/sentry/util/a;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->z:Lio/sentry/util/a;

    iput-object p1, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->w:Landroid/app/Application;

    return-void
.end method


# virtual methods
.method public final b(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->x:Lio/sentry/i4;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lio/sentry/e;

    invoke-direct {v0}, Lio/sentry/e;-><init>()V

    const-string v1, "navigation"

    iput-object v1, v0, Lio/sentry/e;->E:Ljava/lang/String;

    const-string v1, "state"

    invoke-virtual {v0, p2, v1}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    const-string v1, "screen"

    invoke-virtual {v0, p2, v1}, Lio/sentry/e;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "ui.lifecycle"

    iput-object p2, v0, Lio/sentry/e;->G:Ljava/lang/String;

    sget-object p2, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    iput-object p2, v0, Lio/sentry/e;->I:Lio/sentry/n5;

    new-instance p2, Lio/sentry/g0;

    invoke-direct {p2}, Lio/sentry/g0;-><init>()V

    const-string v1, "android:activity"

    invoke-virtual {p2, p1, v1}, Lio/sentry/g0;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->x:Lio/sentry/i4;

    invoke-virtual {p1, v0, p2}, Lio/sentry/i4;->i(Lio/sentry/e;Lio/sentry/g0;)V

    return-void
.end method

.method public final close()V
    .locals 4

    iget-boolean v0, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->y:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->w:Landroid/app/Application;

    invoke-virtual {v0, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v0, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->x:Lio/sentry/i4;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/sentry/i4;->l()Lio/sentry/q6;

    move-result-object v0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "ActivityBreadcrumbsIntegration removed."

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final m(Lio/sentry/q6;)V
    .locals 4

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

    sget-object v1, Lio/sentry/i4;->a:Lio/sentry/i4;

    iput-object v1, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->x:Lio/sentry/i4;

    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableActivityLifecycleBreadcrumbs()Z

    move-result v0

    iput-boolean v0, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->y:Z

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-boolean v2, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->y:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "ActivityBreadcrumbsIntegration enabled: %s"

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-boolean v0, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->y:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->w:Landroid/app/Application;

    invoke-virtual {v0, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "ActivityBreadcrumbIntegration installed."

    invoke-interface {p1, v1, v2, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "ActivityBreadcrumbs"

    invoke-static {p1}, Ljc/x;->i(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    iget-object p2, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->z:Lio/sentry/util/a;

    invoke-virtual {p2}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object p2

    :try_start_0
    const-string v0, "created"

    invoke-virtual {p0, p1, v0}, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->b(Landroid/app/Activity;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2}, Lio/sentry/s;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {p2}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->z:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    const-string v1, "destroyed"

    invoke-virtual {p0, p1, v1}, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->b(Landroid/app/Activity;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->z:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    const-string v1, "paused"

    invoke-virtual {p0, p1, v1}, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->b(Landroid/app/Activity;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->z:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    const-string v1, "resumed"

    invoke-virtual {p0, p1, v1}, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->b(Landroid/app/Activity;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    iget-object p2, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->z:Lio/sentry/util/a;

    invoke-virtual {p2}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object p2

    :try_start_0
    const-string v0, "saveInstanceState"

    invoke-virtual {p0, p1, v0}, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->b(Landroid/app/Activity;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2}, Lio/sentry/s;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {p2}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->z:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    const-string v1, "started"

    invoke-virtual {p0, p1, v1}, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->b(Landroid/app/Activity;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->z:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    const-string v1, "stopped"

    invoke-virtual {p0, p1, v1}, Lio/sentry/android/core/ActivityBreadcrumbsIntegration;->b(Landroid/app/Activity;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method
