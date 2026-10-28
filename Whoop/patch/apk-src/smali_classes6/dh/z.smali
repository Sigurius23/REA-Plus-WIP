.class public final Ldh/z;
.super Ldh/x;
.source "SourceFile"


# instance fields
.field public E:Lne3/e0;

.field public final w:Ldt/b;

.field public x:Z

.field public y:Lne3/j;

.field public z:Lc93/a;


# direct methods
.method public constructor <init>(Lne3/j;Lc93/a;Ldt/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Ldh/z;->w:Ldt/b;

    iput-object p1, p0, Ldh/z;->y:Lne3/j;

    iput-object p2, p0, Ldh/z;->z:Lc93/a;

    return-void
.end method


# virtual methods
.method public final declared-synchronized D0()Lne3/e0;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ldh/z;->x:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Ldh/z;->E:Lne3/e0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Ldh/z;->z:Lc93/a;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Lne3/e0;->x:Ljava/lang/String;

    const-string v1, "tmp"

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Ljc/b;->p(Ljava/io/File;)Lne3/e0;

    move-result-object v0

    sget-object v1, Lne3/p;->w:Lne3/a0;

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3}, Lne3/a0;->p0(Lne3/e0;Z)Lne3/n0;

    move-result-object v1

    invoke-static {v1}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :try_start_2
    iget-object v3, p0, Ldh/z;->y:Lne3/j;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Lne3/h0;->N0(Lne3/p0;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v1}, Lne3/h0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v1, v2

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_1

    :catchall_1
    move-exception v3

    :try_start_4
    invoke-virtual {v1}, Lne3/h0;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v1

    :try_start_5
    invoke-static {v3, v1}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_0
    move-object v1, v3

    :goto_1
    if-nez v1, :cond_1

    iput-object v2, p0, Ldh/z;->y:Lne3/j;

    iput-object v0, p0, Ldh/z;->E:Lne3/e0;

    iput-object v2, p0, Ldh/z;->z:Lc93/a;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    monitor-exit p0

    return-object v0

    :catchall_3
    move-exception v0

    goto :goto_2

    :cond_1
    :try_start_6
    throw v1

    :cond_2
    const-string v0, "cacheDirectory must be a directory."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    const-string v0, "closed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_2
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    throw v0
.end method

.method public final declared-synchronized V0()Lne3/e0;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ldh/z;->x:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ldh/z;->E:Lne3/e0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    const-string v0, "closed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final b()Ldt/b;
    .locals 1

    iget-object v0, p0, Ldh/z;->w:Ldt/b;

    return-object v0
.end method

.method public final declared-synchronized close()V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Ldh/z;->x:Z

    iget-object v0, p0, Ldh/z;->y:Lne3/j;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lqh/d;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Ldh/z;->E:Lne3/e0;

    if-eqz v0, :cond_1

    sget-object v1, Lne3/p;->w:Lne3/a0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v0}, Lne3/a0;->m(Lne3/e0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized d1()Lne3/j;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ldh/z;->x:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ldh/z;->y:Lne3/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    sget-object v0, Lne3/p;->w:Lne3/a0;

    iget-object v1, p0, Ldh/z;->E:Lne3/e0;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lne3/a0;->x0(Lne3/e0;)Lne3/p0;

    move-result-object v0

    invoke-static {v0}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v0

    iput-object v0, p0, Ldh/z;->y:Lne3/j;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    :try_start_2
    const-string v0, "closed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method
