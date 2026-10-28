.class public final Le83/f;
.super Le83/c;
.source "SourceFile"


# instance fields
.field public volatile E:Z

.field public final x:Le83/b;

.field public y:Z

.field public z:Lab/h0;


# direct methods
.method public constructor <init>(Le83/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le83/f;->x:Le83/b;

    return-void
.end method


# virtual methods
.method public final b(Leg3/b;)V
    .locals 3

    iget-boolean v0, p0, Le83/f;->E:Z

    const/4 v1, 0x1

    if-nez v0, :cond_3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Le83/f;->E:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, Le83/f;->y:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Le83/f;->z:Lab/h0;

    if-nez v0, :cond_1

    new-instance v0, Lab/h0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lab/h0;-><init>(IB)V

    iput-object v0, p0, Le83/f;->z:Lab/h0;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    new-instance v1, Lb83/g;

    invoke-direct {v1, p1}, Lb83/g;-><init>(Leg3/b;)V

    invoke-virtual {v0, v1}, Lab/h0;->f(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_2
    iput-boolean v1, p0, Le83/f;->y:Z

    const/4 v1, 0x0

    :goto_1
    monitor-exit p0

    goto :goto_3

    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_3
    :goto_3
    if-eqz v1, :cond_4

    invoke-interface {p1}, Leg3/b;->cancel()V

    return-void

    :cond_4
    iget-object v0, p0, Le83/f;->x:Le83/b;

    invoke-virtual {v0, p1}, Le83/b;->b(Leg3/b;)V

    invoke-virtual {p0}, Le83/f;->d()V

    return-void
.end method

.method public final c(Ll73/b;)V
    .locals 1

    iget-object v0, p0, Le83/f;->x:Le83/b;

    invoke-virtual {v0, p1}, Ll73/a;->a(Ll73/b;)V

    return-void
.end method

.method public final d()V
    .locals 2

    :goto_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Le83/f;->z:Lab/h0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Le83/f;->y:Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Le83/f;->z:Lab/h0;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Le83/f;->x:Le83/b;

    invoke-virtual {v0, v1}, Lab/h0;->e(Le83/b;)V

    goto :goto_0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final onComplete()V
    .locals 3

    iget-boolean v0, p0, Le83/f;->E:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Le83/f;->E:Z

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Le83/f;->E:Z

    iget-boolean v1, p0, Le83/f;->y:Z

    if-eqz v1, :cond_3

    iget-object v0, p0, Le83/f;->z:Lab/h0;

    if-nez v0, :cond_2

    new-instance v0, Lab/h0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lab/h0;-><init>(IB)V

    iput-object v0, p0, Le83/f;->z:Lab/h0;

    :cond_2
    sget-object v1, Lb83/h;->w:Lb83/h;

    invoke-virtual {v0, v1}, Lab/h0;->f(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_3
    iput-boolean v0, p0, Le83/f;->y:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Le83/f;->x:Le83/b;

    invoke-virtual {v0}, Le83/b;->onComplete()V

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

    iget-boolean v0, p0, Le83/f;->E:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Le83/f;->E:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iput-boolean v1, p0, Le83/f;->E:Z

    iget-boolean v0, p0, Le83/f;->y:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Le83/f;->z:Lab/h0;

    if-nez v0, :cond_2

    new-instance v0, Lab/h0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lab/h0;-><init>(IB)V

    iput-object v0, p0, Le83/f;->z:Lab/h0;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_0
    new-instance v1, Lb83/f;

    invoke-direct {v1, p1}, Lb83/f;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lab/h0;->u(Lb83/f;)V

    monitor-exit p0

    return-void

    :cond_3
    iput-boolean v1, p0, Le83/f;->y:Z

    const/4 v1, 0x0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_4

    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    return-void

    :cond_4
    iget-object v0, p0, Le83/f;->x:Le83/b;

    invoke-virtual {v0, p1}, Le83/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 3

    iget-boolean v0, p0, Le83/f;->E:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Le83/f;->E:Z

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Le83/f;->y:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Le83/f;->z:Lab/h0;

    if-nez v0, :cond_2

    new-instance v0, Lab/h0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lab/h0;-><init>(IB)V

    iput-object v0, p0, Le83/f;->z:Lab/h0;

    :cond_2
    invoke-virtual {v0, p1}, Lab/h0;->f(Ljava/lang/Object;)V

    monitor-exit p0

    return-void

    :cond_3
    const/4 v0, 0x1

    iput-boolean v0, p0, Le83/f;->y:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Le83/f;->x:Le83/b;

    invoke-virtual {v0, p1}, Le83/b;->onNext(Ljava/lang/Object;)V

    invoke-virtual {p0}, Le83/f;->d()V

    return-void

    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
