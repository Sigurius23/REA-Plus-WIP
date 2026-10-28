.class public final Lio/sentry/android/core/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final E:Lio/sentry/android/core/e0;


# instance fields
.field public final w:Lio/sentry/util/a;

.field public volatile x:Lio/sentry/android/core/d0;

.field public final y:Lio/sentry/android/core/k0;

.field public volatile z:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/android/core/e0;

    invoke-direct {v0}, Lio/sentry/android/core/e0;-><init>()V

    sput-object v0, Lio/sentry/android/core/e0;->E:Lio/sentry/android/core/e0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/e0;->w:Lio/sentry/util/a;

    new-instance v0, Lio/sentry/android/core/k0;

    invoke-direct {v0}, Lio/sentry/android/core/k0;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/e0;->y:Lio/sentry/android/core/k0;

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/android/core/e0;->z:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final b(Lio/sentry/android/core/b0;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/e0;->w:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    sget-object v1, Lio/sentry/t2;->w:Lio/sentry/t2;

    invoke-virtual {p0, v1}, Lio/sentry/android/core/e0;->i(Lio/sentry/v0;)V

    iget-object v1, p0, Lio/sentry/android/core/e0;->x:Lio/sentry/android/core/d0;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/sentry/android/core/e0;->x:Lio/sentry/android/core/d0;

    iget-object v1, v1, Lio/sentry/android/core/d0;->w:Lio/sentry/android/core/c0;

    invoke-virtual {v1, p1}, Lio/sentry/android/core/c0;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final close()V
    .locals 0

    invoke-virtual {p0}, Lio/sentry/android/core/e0;->m()V

    return-void
.end method

.method public final h(Lio/sentry/v0;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/e0;->x:Lio/sentry/android/core/d0;

    if-eqz v0, :cond_0

    :try_start_0
    sget-object v1, Landroidx/lifecycle/ProcessLifecycleOwner;->I:Landroidx/lifecycle/ProcessLifecycleOwner;

    iget-object v1, v1, Landroidx/lifecycle/ProcessLifecycleOwner;->F:Landroidx/lifecycle/i0;

    invoke-virtual {v1, v0}, Landroidx/lifecycle/i0;->a(Landroidx/lifecycle/f0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    const/4 v1, 0x0

    iput-object v1, p0, Lio/sentry/android/core/e0;->x:Lio/sentry/android/core/d0;

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "AppState failed to get Lifecycle and could not install lifecycle observer."

    invoke-interface {p1, v1, v2, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final i(Lio/sentry/v0;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/e0;->x:Lio/sentry/android/core/d0;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    sget-object v0, Landroidx/lifecycle/ProcessLifecycleOwner;->I:Landroidx/lifecycle/ProcessLifecycleOwner;

    new-instance v0, Lio/sentry/android/core/d0;

    invoke-direct {v0, p0}, Lio/sentry/android/core/d0;-><init>(Lio/sentry/android/core/e0;)V

    iput-object v0, p0, Lio/sentry/android/core/e0;->x:Lio/sentry/android/core/d0;

    sget-object v0, Lio/sentry/android/core/internal/util/e;->a:Lio/sentry/android/core/internal/util/e;

    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/e;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lio/sentry/android/core/e0;->h(Lio/sentry/v0;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lio/sentry/android/core/e0;->y:Lio/sentry/android/core/k0;

    new-instance v1, Landroidx/lifecycle/m;

    const/16 v2, 0xb

    invoke-direct {v1, v2, p0, p1}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, v0, Lio/sentry/android/core/k0;->a:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_0
    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "AppState could not register lifecycle observer"

    invoke-interface {p1, v1, v2, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_0
    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc."

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public final k(Lio/sentry/android/core/b0;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/e0;->w:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/e0;->x:Lio/sentry/android/core/d0;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/sentry/android/core/e0;->x:Lio/sentry/android/core/d0;

    iget-object v1, v1, Lio/sentry/android/core/d0;->w:Lio/sentry/android/core/c0;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final m()V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/e0;->x:Lio/sentry/android/core/d0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/e0;->w:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/core/e0;->x:Lio/sentry/android/core/d0;

    iget-object v2, p0, Lio/sentry/android/core/e0;->x:Lio/sentry/android/core/d0;

    iget-object v2, v2, Lio/sentry/android/core/d0;->w:Lio/sentry/android/core/c0;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    const/4 v2, 0x0

    iput-object v2, p0, Lio/sentry/android/core/e0;->x:Lio/sentry/android/core/d0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    sget-object v0, Lio/sentry/android/core/internal/util/e;->a:Lio/sentry/android/core/internal/util/e;

    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/e;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz v1, :cond_1

    sget-object v0, Landroidx/lifecycle/ProcessLifecycleOwner;->I:Landroidx/lifecycle/ProcessLifecycleOwner;

    iget-object v0, v0, Landroidx/lifecycle/ProcessLifecycleOwner;->F:Landroidx/lifecycle/i0;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/i0;->d(Landroidx/lifecycle/f0;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object v0, p0, Lio/sentry/android/core/e0;->y:Lio/sentry/android/core/k0;

    new-instance v2, Lio/sentry/c7;

    invoke-direct {v2, p0, v1}, Lio/sentry/c7;-><init>(Lio/sentry/android/core/e0;Lio/sentry/android/core/d0;)V

    iget-object v0, v0, Lio/sentry/android/core/k0;->a:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1
.end method
