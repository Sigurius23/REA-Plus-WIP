.class public final Lqh/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# instance fields
.field public E:Z

.field public final w:Ljava/lang/ref/WeakReference;

.field public x:Landroid/content/Context;

.field public y:Llh/e;

.field public z:Z


# direct methods
.method public constructor <init>(Lbh/j;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lqh/g;->w:Ljava/lang/ref/WeakReference;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lqh/g;->E:Z

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lqh/g;->w:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbh/j;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lqh/g;->y:Llh/e;

    if-nez v1, :cond_3

    iget-object v1, v0, Lbh/j;->e:Lqh/e;

    iget-boolean v1, v1, Lqh/e;->b:Z

    if-eqz v1, :cond_1

    iget-object v0, v0, Lbh/j;->a:Landroid/content/Context;

    const-class v1, Landroid/net/ConnectivityManager;

    invoke-static {v0, v1}, Ls4/c;->getSystemService(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    if-eqz v1, :cond_0

    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {v0, v2}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    :try_start_1
    new-instance v0, La3/p;

    invoke-direct {v0, v1, p0}, La3/p;-><init>(Landroid/net/ConnectivityManager;Lqh/g;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    new-instance v0, Lg73/d;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lg73/d;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance v0, Lg73/d;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lg73/d;-><init>(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    new-instance v0, Lg73/d;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lg73/d;-><init>(I)V

    :goto_0
    iput-object v0, p0, Lqh/g;->y:Llh/e;

    invoke-interface {v0}, Llh/e;->isOnline()Z

    move-result v0

    iput-boolean v0, p0, Lqh/g;->E:Z

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lqh/g;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3
    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public final declared-synchronized b()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lqh/g;->z:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lqh/g;->z:Z

    iget-object v0, p0, Lqh/g;->x:Landroid/content/Context;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lqh/g;->y:Llh/e;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Llh/e;->shutdown()V

    :cond_2
    iget-object v0, p0, Lqh/g;->w:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final declared-synchronized onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lqh/g;->w:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbh/j;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lqh/g;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized onLowMemory()V
    .locals 1

    monitor-enter p0

    const/16 v0, 0x50

    :try_start_0
    invoke-virtual {p0, v0}, Lqh/g;->onTrimMemory(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized onTrimMemory(I)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lqh/g;->w:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbh/j;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lbh/j;->c:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkh/c;

    if-eqz v0, :cond_2

    iget-object v1, v0, Lkh/c;->a:Lkh/g;

    invoke-interface {v1, p1}, Lkh/g;->a(I)V

    iget-object v0, v0, Lkh/c;->b:Lbd3/v;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v1, 0xa

    if-lt p1, v1, :cond_0

    const/16 v1, 0x14

    if-eq p1, v1, :cond_0

    :try_start_1
    invoke-virtual {v0}, Lbd3/v;->e()V

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lqh/g;->b()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_2
    :goto_1
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method
