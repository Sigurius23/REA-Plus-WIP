.class public final Lio/sentry/android/ndk/b;
.super Lio/sentry/f4;
.source "SourceFile"


# instance fields
.field public final a:Lio/sentry/q6;

.field public final b:Lio/sentry/ndk/NativeScope;


# direct methods
.method public constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 2

    new-instance v0, Lio/sentry/ndk/NativeScope;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "The SentryOptions object is required."

    invoke-static {p1, v1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/android/ndk/b;->a:Lio/sentry/q6;

    iput-object v0, p0, Lio/sentry/android/ndk/b;->b:Lio/sentry/ndk/NativeScope;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/ndk/b;->a:Lio/sentry/q6;

    :try_start_0
    invoke-virtual {v0}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object v1

    new-instance v2, Landroidx/lifecycle/m;

    const/16 v3, 0xe

    invoke-direct {v2, v3, p0, p1}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Lio/sentry/h1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Scope sync removeTag(%s) has an error."

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v2, v1, v3, p1}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/ndk/b;->a:Lio/sentry/q6;

    :try_start_0
    invoke-virtual {v0}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object v1

    new-instance v2, Lh6/l;

    const/4 v3, 0x2

    invoke-direct {v2, p0, p1, p2, v3}, Lh6/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v1, v2}, Lio/sentry/h1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Scope sync setTag(%s) has an error."

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v1, p2, v2, p1}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final e(Lio/sentry/protocol/h0;)V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/ndk/b;->a:Lio/sentry/q6;

    :try_start_0
    invoke-virtual {v0}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object v1

    new-instance v2, Landroidx/lifecycle/m;

    const/16 v3, 0xf

    invoke-direct {v2, v3, p0, p1}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Lio/sentry/h1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Scope sync setUser has an error."

    invoke-interface {v0, v1, p1, v3, v2}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final h(Lio/sentry/e;)V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/ndk/b;->a:Lio/sentry/q6;

    :try_start_0
    invoke-virtual {v0}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object v1

    new-instance v2, Landroidx/lifecycle/m;

    const/16 v3, 0xd

    invoke-direct {v2, v3, p0, p1}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Lio/sentry/h1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Scope sync addBreadcrumb has an error."

    invoke-interface {v0, v1, p1, v3, v2}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final j(Lio/sentry/e7;Lio/sentry/c4;)V
    .locals 3

    iget-object p2, p0, Lio/sentry/android/ndk/b;->a:Lio/sentry/q6;

    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p2}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object v0

    new-instance v1, Landroidx/lifecycle/m;

    const/16 v2, 0x10

    invoke-direct {v1, v2, p0, p1}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lio/sentry/h1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Scope sync setTrace failed."

    invoke-interface {p2, v0, p1, v2, v1}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final l()V
    .locals 5

    iget-object v0, p0, Lio/sentry/android/ndk/b;->a:Lio/sentry/q6;

    :try_start_0
    invoke-virtual {v0}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object v1

    new-instance v2, Lio/sentry/c7;

    const/16 v3, 0x9

    invoke-direct {v2, p0, v3}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v1, v2}, Lio/sentry/h1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "Scope sync clearAttachments has an error."

    invoke-interface {v0, v2, v1, v4, v3}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
