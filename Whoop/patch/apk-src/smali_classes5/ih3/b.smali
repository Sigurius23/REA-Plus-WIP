.class public final Lih3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/h;


# instance fields
.field public final w:Lxg3/h;

.field public x:Z

.field public volatile y:Z

.field public z:Lai/j;


# direct methods
.method public constructor <init>(Lxg3/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lih3/b;->w:Lxg3/h;

    return-void
.end method


# virtual methods
.method public final onCompleted()V
    .locals 3

    iget-boolean v0, p0, Lih3/b;->y:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lih3/b;->y:Z

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lih3/b;->y:Z

    iget-boolean v1, p0, Lih3/b;->x:Z

    if-eqz v1, :cond_3

    iget-object v0, p0, Lih3/b;->z:Lai/j;

    if-nez v0, :cond_2

    new-instance v0, Lai/j;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lai/j;-><init>(IZ)V

    iput-object v0, p0, Lih3/b;->z:Lai/j;

    :cond_2
    sget-object v1, Lch3/d;->a:Lch3/b;

    invoke-virtual {v0, v1}, Lai/j;->f(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_3
    iput-boolean v0, p0, Lih3/b;->x:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lih3/b;->w:Lxg3/h;

    invoke-interface {v0}, Lxg3/h;->onCompleted()V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 3

    invoke-static {p1}, Ldt/b;->V(Ljava/lang/Throwable;)V

    iget-boolean v0, p0, Lih3/b;->y:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lih3/b;->y:Z

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lih3/b;->y:Z

    iget-boolean v1, p0, Lih3/b;->x:Z

    if-eqz v1, :cond_3

    iget-object v0, p0, Lih3/b;->z:Lai/j;

    if-nez v0, :cond_2

    new-instance v0, Lai/j;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lai/j;-><init>(IZ)V

    iput-object v0, p0, Lih3/b;->z:Lai/j;

    :cond_2
    new-instance v1, Lch3/c;

    invoke-direct {v1, p1}, Lch3/c;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lai/j;->f(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_3
    iput-boolean v0, p0, Lih3/b;->x:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lih3/b;->w:Lxg3/h;

    invoke-interface {v0, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 6

    iget-boolean v0, p0, Lih3/b;->y:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lih3/b;->y:Z

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    iget-boolean v0, p0, Lih3/b;->x:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lih3/b;->z:Lai/j;

    if-nez v0, :cond_2

    new-instance v0, Lai/j;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lai/j;-><init>(IZ)V

    iput-object v0, p0, Lih3/b;->z:Lai/j;

    :cond_2
    if-nez p1, :cond_3

    sget-object p1, Lch3/d;->b:Lch3/b;

    :cond_3
    invoke-virtual {v0, p1}, Lai/j;->f(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lih3/b;->x:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lih3/b;->w:Lxg3/h;

    invoke-interface {v1, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :cond_5
    :goto_0
    monitor-enter p0

    :try_start_2
    iget-object v1, p0, Lih3/b;->z:Lai/j;

    const/4 v2, 0x0

    if-nez v1, :cond_6

    iput-boolean v2, p0, Lih3/b;->x:Z

    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_6
    const/4 v3, 0x0

    iput-object v3, p0, Lih3/b;->z:Lai/j;

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v1, v1, Lai/j;->x:Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;

    array-length v3, v1

    :goto_1
    if-ge v2, v3, :cond_5

    aget-object v4, v1, v2

    if-nez v4, :cond_7

    goto :goto_0

    :cond_7
    :try_start_3
    iget-object v5, p0, Lih3/b;->w:Lxg3/h;

    invoke-static {v5, v4}, Lch3/d;->a(Lxg3/h;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    iput-boolean v0, p0, Lih3/b;->y:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    return-void

    :catchall_2
    move-exception v1

    goto :goto_2

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :goto_2
    iput-boolean v0, p0, Lih3/b;->y:Z

    invoke-static {v1}, Ldt/b;->V(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lih3/b;->w:Lxg3/h;

    invoke-static {p1, v1}, Lrx/exceptions/OnErrorThrowable;->a(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    invoke-interface {v0, v1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void

    :goto_3
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1

    :catchall_3
    move-exception v1

    iput-boolean v0, p0, Lih3/b;->y:Z

    iget-object v0, p0, Lih3/b;->w:Lxg3/h;

    invoke-static {v1, v0, p1}, Ldt/b;->X(Ljava/lang/Throwable;Lxg3/h;Ljava/lang/Object;)V

    return-void

    :goto_4
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw p1
.end method
