.class public final Lio/sentry/android/core/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public final w:Ljava/lang/ref/WeakReference;

.field public final synthetic x:Lio/sentry/android/core/o1;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/o1;Ljava/lang/ref/WeakReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/n1;->x:Lio/sentry/android/core/o1;

    iput-object p2, p0, Lio/sentry/android/core/n1;->w:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/n1;->w:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_5

    iget-object p1, p0, Lio/sentry/android/core/n1;->x:Lio/sentry/android/core/o1;

    iget-object v0, p1, Lio/sentry/android/core/o1;->E:Lio/sentry/android/core/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/sentry/android/core/k1;->c()V

    iget-object v2, v0, Lio/sentry/android/core/k1;->c:Landroid/os/HandlerThread;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/os/HandlerThread;->quitSafely()Z

    iput-object v1, v0, Lio/sentry/android/core/k1;->c:Landroid/os/HandlerThread;

    iput-object v1, v0, Lio/sentry/android/core/k1;->d:Landroid/os/Handler;

    :cond_0
    iput-object v1, p1, Lio/sentry/android/core/o1;->E:Lio/sentry/android/core/k1;

    :cond_1
    iget-object v0, p1, Lio/sentry/android/core/o1;->F:Lio/sentry/android/core/n1;

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v2, v0, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_3

    instance-of v2, v0, Landroid/app/Activity;

    if-eqz v2, :cond_2

    check-cast v0, Landroid/app/Activity;

    goto :goto_1

    :cond_2
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_3
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    iget-object v2, p1, Lio/sentry/android/core/o1;->F:Lio/sentry/android/core/n1;

    invoke-virtual {v0, v2}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    :cond_4
    iput-object v1, p1, Lio/sentry/android/core/o1;->F:Lio/sentry/android/core/n1;

    :cond_5
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/n1;->w:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lio/sentry/android/core/n1;->x:Lio/sentry/android/core/o1;

    iget-object p1, p1, Lio/sentry/android/core/o1;->E:Lio/sentry/android/core/k1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/sentry/android/core/k1;->c()V

    :cond_0
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 5

    iget-object v0, p0, Lio/sentry/android/core/n1;->w:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_0

    iget-object v1, p0, Lio/sentry/android/core/n1;->x:Lio/sentry/android/core/o1;

    iget-object v2, v1, Lio/sentry/android/core/o1;->E:Lio/sentry/android/core/k1;

    if-eqz v2, :cond_0

    new-instance v3, Lc9/c;

    const/16 v4, 0x11

    invoke-direct {v3, v4, v1, v0}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v3}, Lio/sentry/android/core/k1;->b(Landroid/app/Activity;Lio/sentry/android/core/h1;)V

    :cond_0
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
