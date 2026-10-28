.class public final Lio/sentry/android/core/UserInteractionIntegration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/t1;
.implements Ljava/io/Closeable;
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final E:Ljava/util/WeakHashMap;

.field public final F:Ljava/lang/Object;

.field public final w:Landroid/app/Application;

.field public x:Lio/sentry/i4;

.field public y:Lio/sentry/android/core/SentryAndroidOptions;

.field public final z:Z


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/UserInteractionIntegration;->E:Ljava/util/WeakHashMap;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/UserInteractionIntegration;->F:Ljava/lang/Object;

    iput-object p1, p0, Lio/sentry/android/core/UserInteractionIntegration;->w:Landroid/app/Application;

    const-string p1, "androidx.lifecycle.Lifecycle"

    iget-object v0, p0, Lio/sentry/android/core/UserInteractionIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {v0, p1}, Lqt/e;->n(Lio/sentry/q6;Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lio/sentry/android/core/UserInteractionIntegration;->z:Z

    return-void
.end method


# virtual methods
.method public final b(Landroid/app/Activity;)V
    .locals 5

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lio/sentry/android/core/UserInteractionIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v1, "Window was null in startTracking"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v1, p0, Lio/sentry/android/core/UserInteractionIntegration;->x:Lio/sentry/i4;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lio/sentry/android/core/UserInteractionIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lio/sentry/android/core/UserInteractionIntegration;->F:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lio/sentry/android/core/UserInteractionIntegration;->E:Ljava/util/WeakHashMap;

    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    monitor-exit v1

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v1

    if-nez v1, :cond_2

    new-instance v1, Lio/sentry/android/core/internal/gestures/b;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    :cond_2
    new-instance v2, Lio/sentry/android/core/internal/gestures/g;

    iget-object v3, p0, Lio/sentry/android/core/UserInteractionIntegration;->x:Lio/sentry/i4;

    iget-object v4, p0, Lio/sentry/android/core/UserInteractionIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-direct {v2, p1, v3, v4}, Lio/sentry/android/core/internal/gestures/g;-><init>(Landroid/app/Activity;Lio/sentry/i4;Lio/sentry/android/core/SentryAndroidOptions;)V

    new-instance v3, Lio/sentry/android/core/internal/gestures/h;

    iget-object v4, p0, Lio/sentry/android/core/UserInteractionIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-direct {v3, v1, p1, v2, v4}, Lio/sentry/android/core/internal/gestures/h;-><init>(Landroid/view/Window$Callback;Landroid/app/Activity;Lio/sentry/android/core/internal/gestures/g;Lio/sentry/q6;)V

    invoke-virtual {v0, v3}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    iget-object p1, p0, Lio/sentry/android/core/UserInteractionIntegration;->F:Ljava/lang/Object;

    monitor-enter p1

    :try_start_1
    iget-object v1, p0, Lio/sentry/android/core/UserInteractionIntegration;->E:Ljava/util/WeakHashMap;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p1

    return-void

    :catchall_1
    move-exception v0

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v0

    :goto_0
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_3
    return-void
.end method

.method public final close()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/core/UserInteractionIntegration;->w:Landroid/app/Application;

    invoke-virtual {v0, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v0, p0, Lio/sentry/android/core/UserInteractionIntegration;->F:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lio/sentry/android/core/UserInteractionIntegration;->E:Ljava/util/WeakHashMap;

    invoke-virtual {v2}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/Window;

    if-eqz v1, :cond_0

    invoke-virtual {p0, v1}, Lio/sentry/android/core/UserInteractionIntegration;->h(Landroid/view/Window;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lio/sentry/android/core/UserInteractionIntegration;->F:Ljava/lang/Object;

    monitor-enter v1

    :try_start_1
    iget-object v0, p0, Lio/sentry/android/core/UserInteractionIntegration;->E:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lio/sentry/android/core/UserInteractionIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v2, "UserInteractionIntegration removed."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {v0, v1, v2, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1
.end method

.method public final h(Landroid/view/Window;)V
    .locals 4

    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    instance-of v1, v0, Lio/sentry/android/core/internal/gestures/h;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    check-cast v0, Lio/sentry/android/core/internal/gestures/h;

    iput-boolean v2, v0, Lio/sentry/android/core/internal/gestures/h;->G:Z

    iget-object v1, v0, Lio/sentry/android/core/internal/gestures/h;->y:Lio/sentry/android/core/internal/gestures/g;

    sget-object v2, Lio/sentry/i7;->CANCELLED:Lio/sentry/i7;

    invoke-virtual {v1, v2}, Lio/sentry/android/core/internal/gestures/g;->d(Lio/sentry/i7;)V

    iget-object v1, v0, Lio/sentry/android/core/internal/gestures/h;->z:Lio/sentry/android/core/internal/gestures/c;

    invoke-virtual {v1}, Lio/sentry/android/core/internal/gestures/c;->a()V

    iget-object v0, v0, Lio/sentry/android/core/internal/gestures/h;->x:Landroid/view/Window$Callback;

    instance-of v1, v0, Lio/sentry/android/core/internal/gestures/b;

    if-eqz v1, :cond_0

    invoke-virtual {p1, v3}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    :goto_0
    iget-object v0, p0, Lio/sentry/android/core/UserInteractionIntegration;->F:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/UserInteractionIntegration;->E:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    iget-object v0, p0, Lio/sentry/android/core/UserInteractionIntegration;->F:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget-object v1, p0, Lio/sentry/android/core/UserInteractionIntegration;->E:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lio/sentry/android/core/internal/gestures/h;

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v3, :cond_3

    iput-boolean v2, v3, Lio/sentry/android/core/internal/gestures/h;->G:Z

    iget-object p1, v3, Lio/sentry/android/core/internal/gestures/h;->y:Lio/sentry/android/core/internal/gestures/g;

    sget-object v0, Lio/sentry/i7;->CANCELLED:Lio/sentry/i7;

    invoke-virtual {p1, v0}, Lio/sentry/android/core/internal/gestures/g;->d(Lio/sentry/i7;)V

    iget-object p1, v3, Lio/sentry/android/core/internal/gestures/h;->z:Lio/sentry/android/core/internal/gestures/c;

    invoke-virtual {p1}, Lio/sentry/android/core/internal/gestures/c;->a()V

    :cond_3
    return-void

    :goto_2
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public final m(Lio/sentry/q6;)V
    .locals 6

    instance-of v0, p1, Lio/sentry/android/core/SentryAndroidOptions;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lio/sentry/android/core/SentryAndroidOptions;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    const-string v0, "SentryAndroidOptions is required"

    invoke-static {p1, v0}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/android/core/UserInteractionIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    sget-object v0, Lio/sentry/i4;->a:Lio/sentry/i4;

    iput-object v0, p0, Lio/sentry/android/core/UserInteractionIntegration;->x:Lio/sentry/i4;

    invoke-virtual {p1}, Lio/sentry/q6;->isEnableUserInteractionBreadcrumbs()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_2

    iget-object p1, p0, Lio/sentry/android/core/UserInteractionIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p1}, Lio/sentry/q6;->isEnableUserInteractionTracing()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move p1, v0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 p1, 0x1

    :goto_2
    iget-object v2, p0, Lio/sentry/android/core/UserInteractionIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "UserInteractionIntegration enabled: %s"

    invoke-interface {v2, v3, v5, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_4

    iget-object p1, p0, Lio/sentry/android/core/UserInteractionIntegration;->w:Landroid/app/Application;

    invoke-virtual {p1, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object p1, p0, Lio/sentry/android/core/UserInteractionIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    const-string v2, "UserInteractionIntegration installed."

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {p1, v3, v2, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "UserInteraction"

    invoke-static {p1}, Ljc/x;->i(Ljava/lang/String;)V

    iget-boolean p1, p0, Lio/sentry/android/core/UserInteractionIntegration;->z:Z

    if-eqz p1, :cond_4

    sget-object p1, Lio/sentry/android/core/k0;->b:Lio/sentry/android/core/k0;

    iget-object p1, p1, Lio/sentry/android/core/k0;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroid/app/Activity;

    :cond_3
    instance-of p1, v1, Landroidx/lifecycle/g0;

    if-eqz p1, :cond_4

    move-object p1, v1

    check-cast p1, Landroidx/lifecycle/g0;

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object p1

    sget-object v0, Landroidx/lifecycle/w;->E:Landroidx/lifecycle/w;

    if-ne p1, v0, :cond_4

    invoke-virtual {p0, v1}, Lio/sentry/android/core/UserInteractionIntegration;->b(Landroid/app/Activity;)V

    :cond_4
    return-void
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 3

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/sentry/android/core/UserInteractionIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Window was null in stopTracking"

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lio/sentry/android/core/UserInteractionIntegration;->h(Landroid/view/Window;)V

    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    invoke-virtual {p0, p1}, Lio/sentry/android/core/UserInteractionIntegration;->b(Landroid/app/Activity;)V

    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
