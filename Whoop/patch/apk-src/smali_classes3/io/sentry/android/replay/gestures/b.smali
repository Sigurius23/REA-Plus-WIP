.class public final Lio/sentry/android/replay/gestures/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/android/replay/g;


# instance fields
.field public final E:Ljava/util/WeakHashMap;

.field public final F:Lio/sentry/util/a;

.field public final w:Lio/sentry/q6;

.field public final x:Lio/sentry/android/replay/ReplayIntegration;

.field public final y:Ljava/util/ArrayList;

.field public final z:Lio/sentry/util/a;


# direct methods
.method public constructor <init>(Lio/sentry/q6;Lio/sentry/android/replay/ReplayIntegration;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/gestures/b;->w:Lio/sentry/q6;

    iput-object p2, p0, Lio/sentry/android/replay/gestures/b;->x:Lio/sentry/android/replay/ReplayIntegration;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/gestures/b;->y:Ljava/util/ArrayList;

    new-instance p1, Lio/sentry/util/a;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/gestures/b;->z:Lio/sentry/util/a;

    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/gestures/b;->E:Ljava/util/WeakHashMap;

    new-instance p1, Lio/sentry/util/a;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/gestures/b;->F:Lio/sentry/util/a;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 7

    iget-object v0, p0, Lio/sentry/android/replay/gestures/b;->E:Ljava/util/WeakHashMap;

    invoke-static {p1}, Lvd/e;->D(Landroid/view/View;)Landroid/view/Window;

    move-result-object p1

    iget-object v1, p0, Lio/sentry/android/replay/gestures/b;->w:Lio/sentry/q6;

    if-nez p1, :cond_0

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Window is invalid, not tracking gestures"

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v2, p0, Lio/sentry/android/replay/gestures/b;->F:Lio/sentry/util/a;

    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v3

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/ref/WeakReference;

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/android/replay/gestures/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    move-object v4, v5

    :goto_0
    if-eqz v4, :cond_2

    invoke-static {v3, v5}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :cond_2
    invoke-static {v3, v5}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v3

    new-instance v4, Lio/sentry/android/replay/gestures/a;

    iget-object v6, p0, Lio/sentry/android/replay/gestures/b;->x:Lio/sentry/android/replay/ReplayIntegration;

    invoke-direct {v4, v1, v6, v3}, Lio/sentry/android/replay/gestures/a;-><init>(Lio/sentry/q6;Lio/sentry/android/replay/ReplayIntegration;Landroid/view/Window$Callback;)V

    invoke-virtual {p1, v4}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    invoke-virtual {v2}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v1

    :try_start_1
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-static {v1, v5}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :catchall_1
    move-exception p1

    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    move-exception v0

    invoke-static {v1, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0

    :goto_1
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :catchall_3
    move-exception v0

    invoke-static {v3, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final b(Landroid/view/View;Z)V
    .locals 3

    const-string v0, "root"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/sentry/android/replay/gestures/b;->z:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/android/replay/gestures/b;->y:Ljava/util/ArrayList;

    if-eqz p2, :cond_0

    :try_start_0
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1}, Lio/sentry/android/replay/gestures/b;->a(Landroid/view/View;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p1}, Lio/sentry/android/replay/gestures/b;->d(Landroid/view/View;)V

    new-instance p2, Lio/sentry/android/replay/d0;

    const/4 v2, 0x1

    invoke-direct {p2, p1, v2}, Lio/sentry/android/replay/d0;-><init>(Landroid/view/View;I)V

    invoke-static {v1, p2}, Lm83/s;->j1(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    const/4 p1, 0x0

    invoke-static {v0, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :goto_1
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v0, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final c()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/replay/gestures/b;->y:Ljava/util/ArrayList;

    iget-object v1, p0, Lio/sentry/android/replay/gestures/b;->z:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v1

    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_0

    invoke-virtual {p0, v3}, Lio/sentry/android/replay/gestures/b;->d(Landroid/view/View;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    invoke-static {v1, v0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :goto_1
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v1, v0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final d(Landroid/view/View;)V
    .locals 4

    invoke-static {p1}, Lvd/e;->D(Landroid/view/View;)Landroid/view/Window;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/sentry/android/replay/gestures/b;->w:Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Window was null in stopGestureTracking"

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    instance-of v1, v0, Lio/sentry/android/replay/gestures/a;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v0, Lio/sentry/android/replay/gestures/a;

    iget-object v0, v0, Lio/sentry/android/replay/gestures/a;->w:Landroid/view/Window$Callback;

    invoke-virtual {p1, v0}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    iget-object v0, p0, Lio/sentry/android/replay/gestures/b;->F:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/replay/gestures/b;->E:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0, v2}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    iget-object v0, p0, Lio/sentry/android/replay/gestures/b;->F:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_2
    iget-object v1, p0, Lio/sentry/android/replay/gestures/b;->E:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/android/replay/gestures/a;

    goto :goto_0

    :catchall_2
    move-exception p1

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_0
    iget-object v3, p0, Lio/sentry/android/replay/gestures/b;->E:Ljava/util/WeakHashMap;

    invoke-virtual {v3, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/ref/WeakReference;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-static {v0, v2}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    if-eqz v1, :cond_3

    iput-object v2, v1, Lio/sentry/android/replay/gestures/a;->y:Lio/sentry/android/replay/ReplayIntegration;

    :cond_3
    return-void

    :goto_1
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :catchall_3
    move-exception v1

    invoke-static {v0, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v1
.end method
