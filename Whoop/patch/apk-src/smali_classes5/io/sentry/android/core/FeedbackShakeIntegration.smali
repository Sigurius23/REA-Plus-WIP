.class public final Lio/sentry/android/core/FeedbackShakeIntegration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/t1;
.implements Ljava/io/Closeable;
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public volatile E:Z

.field public volatile F:Ljava/lang/Runnable;

.field public final w:Landroid/app/Application;

.field public final x:Lio/sentry/android/core/k1;

.field public y:Lio/sentry/android/core/SentryAndroidOptions;

.field public volatile z:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->E:Z

    iput-object p1, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->w:Landroid/app/Application;

    new-instance p1, Lio/sentry/android/core/k1;

    sget-object v0, Lio/sentry/t2;->w:Lio/sentry/t2;

    invoke-direct {p1, v0}, Lio/sentry/android/core/k1;-><init>(Lio/sentry/v0;)V

    iput-object p1, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->x:Lio/sentry/android/core/k1;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->w:Landroid/app/Application;

    invoke-virtual {v0, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->x:Lio/sentry/android/core/k1;

    invoke-virtual {v0}, Lio/sentry/android/core/k1;->c()V

    iget-object v1, v0, Lio/sentry/android/core/k1;->c:Landroid/os/HandlerThread;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/os/HandlerThread;->quitSafely()Z

    iput-object v2, v0, Lio/sentry/android/core/k1;->c:Landroid/os/HandlerThread;

    iput-object v2, v0, Lio/sentry/android/core/k1;->d:Landroid/os/Handler;

    :cond_0
    iget-boolean v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->E:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->E:Z

    iget-object v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/sentry/q6;->getFeedbackOptions()Lio/sentry/i5;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->F:Ljava/lang/Runnable;

    iput-object v1, v0, Lio/sentry/i5;->h:Ljava/lang/Runnable;

    :cond_1
    iput-object v2, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->F:Ljava/lang/Runnable;

    :cond_2
    iput-object v2, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->z:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final m(Lio/sentry/q6;)V
    .locals 4

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

    iput-object p1, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p1}, Lio/sentry/q6;->getFeedbackOptions()Lio/sentry/i5;

    move-result-object p1

    iget-boolean p1, p1, Lio/sentry/i5;->g:Z

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->x:Lio/sentry/android/core/k1;

    iget-object v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->w:Landroid/app/Application;

    iget-object v2, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    iput-object v2, p1, Lio/sentry/android/core/k1;->f:Lio/sentry/v0;

    invoke-virtual {p1, v0}, Lio/sentry/android/core/k1;->a(Landroid/content/Context;)V

    const-string p1, "FeedbackShake"

    invoke-static {p1}, Ljc/x;->i(Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->w:Landroid/app/Application;

    invoke-virtual {p1, p0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    iget-object p1, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "FeedbackShakeIntegration installed."

    invoke-interface {p1, v0, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lio/sentry/android/core/k0;->b:Lio/sentry/android/core/k0;

    iget-object p1, p1, Lio/sentry/android/core/k0;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroid/app/Activity;

    :cond_2
    if-eqz v1, :cond_4

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->z:Ljava/lang/ref/WeakReference;

    iget-object p1, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->x:Lio/sentry/android/core/k1;

    iget-object v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lio/sentry/android/core/k1;->c()V

    new-instance v0, Lhn/p;

    const/16 v2, 0x10

    invoke-direct {v0, p0, v2}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v1, v0}, Lio/sentry/android/core/k1;->b(Landroid/app/Activity;Lio/sentry/android/core/h1;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->z:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->z:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-boolean v2, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->E:Z

    if-eqz v2, :cond_2

    if-ne p1, v0, :cond_2

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->E:Z

    iput-object v1, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->z:Ljava/lang/ref/WeakReference;

    iget-object p1, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lio/sentry/q6;->getFeedbackOptions()Lio/sentry/i5;

    move-result-object p1

    iget-object v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->F:Ljava/lang/Runnable;

    iput-object v0, p1, Lio/sentry/i5;->h:Ljava/lang/Runnable;

    :cond_1
    iput-object v1, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->F:Ljava/lang/Runnable;

    :cond_2
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->z:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->z:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->x:Lio/sentry/android/core/k1;

    invoke-virtual {p1}, Lio/sentry/android/core/k1;->c()V

    iget-boolean p1, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->E:Z

    if-nez p1, :cond_1

    iput-object v1, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->z:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->z:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->z:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-boolean v2, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->E:Z

    if-eqz v2, :cond_2

    if-eqz v0, :cond_2

    if-eq v0, p1, :cond_2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->E:Z

    iget-object v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/sentry/q6;->getFeedbackOptions()Lio/sentry/i5;

    move-result-object v0

    iget-object v2, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->F:Ljava/lang/Runnable;

    iput-object v2, v0, Lio/sentry/i5;->h:Ljava/lang/Runnable;

    :cond_1
    iput-object v1, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->F:Ljava/lang/Runnable;

    :cond_2
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->z:Ljava/lang/ref/WeakReference;

    iget-object v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->x:Lio/sentry/android/core/k1;

    iget-object v1, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    if-nez v1, :cond_3

    return-void

    :cond_3
    invoke-virtual {v0}, Lio/sentry/android/core/k1;->c()V

    new-instance v1, Lhn/p;

    const/16 v2, 0x10

    invoke-direct {v1, p0, v2}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1, v1}, Lio/sentry/android/core/k1;->b(Landroid/app/Activity;Lio/sentry/android/core/h1;)V

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
