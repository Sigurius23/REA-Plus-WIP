.class public final Lki/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# instance fields
.field public final w:Ljava/lang/ref/WeakReference;

.field public x:Landroid/content/Context;

.field public y:Z


# direct methods
.method public constructor <init>(Lrh/t;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lki/a;->w:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lki/a;->y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lki/a;->y:Z

    iget-object v0, p0, Lki/a;->x:Landroid/content/Context;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, Landroid/content/Context;->unregisterComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lki/a;->w:Ljava/lang/ref/WeakReference;

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
    iget-object p1, p0, Lki/a;->w:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lrh/t;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lki/a;->a()V
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
    invoke-virtual {p0, v0}, Lki/a;->onTrimMemory(I)V
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
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lki/a;->w:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrh/t;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lrh/t;->a:Lrh/q;

    const/16 v1, 0x28

    if-lt p1, v1, :cond_0

    iget-object p1, v0, Lrh/q;->c:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lai/d;

    if-eqz p1, :cond_2

    check-cast p1, Lai/f;

    iget-object v0, p1, Lai/f;->c:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget-object v1, p1, Lai/f;->a:Lai/k;

    invoke-interface {v1}, Lai/k;->clear()V

    iget-object p1, p1, Lai/f;->b:Lai/j;

    const/4 v1, 0x0

    iput v1, p1, Lai/j;->w:I

    iget-object p1, p1, Lai/j;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_0
    const/16 v1, 0xa

    if-lt p1, v1, :cond_2

    iget-object p1, v0, Lrh/q;->c:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lai/d;

    if-eqz p1, :cond_2

    move-object v0, p1

    check-cast v0, Lai/f;

    iget-object v1, v0, Lai/f;->c:Ljava/lang/Object;

    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iget-object v0, v0, Lai/f;->a:Lai/k;

    invoke-interface {v0}, Lai/k;->getSize()J

    move-result-wide v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    monitor-exit v1

    const/4 v0, 0x2

    int-to-long v0, v0

    div-long/2addr v2, v0

    check-cast p1, Lai/f;

    iget-object v0, p1, Lai/f;->c:Ljava/lang/Object;

    monitor-enter v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    iget-object p1, p1, Lai/f;->a:Lai/k;

    invoke-interface {p1, v2, v3}, Lai/k;->m(J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    monitor-exit v0

    goto :goto_0

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1

    :catchall_2
    move-exception p1

    goto :goto_1

    :catchall_3
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_1
    invoke-virtual {p0}, Lki/a;->a()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :cond_2
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw p1
.end method
