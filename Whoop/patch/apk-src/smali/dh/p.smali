.class public final Ldh/p;
.super Ldh/x;
.source "SourceFile"


# instance fields
.field public E:Z

.field public F:Lne3/j0;

.field public final w:Lne3/e0;

.field public final x:Lne3/p;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/io/Closeable;


# direct methods
.method public constructor <init>(Lne3/e0;Lne3/p;Ljava/lang/String;Ljava/io/Closeable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldh/p;->w:Lne3/e0;

    iput-object p2, p0, Ldh/p;->x:Lne3/p;

    iput-object p3, p0, Ldh/p;->y:Ljava/lang/String;

    iput-object p4, p0, Ldh/p;->z:Ljava/io/Closeable;

    return-void
.end method


# virtual methods
.method public final declared-synchronized D0()Lne3/e0;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ldh/p;->E:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ldh/p;->w:Lne3/e0;
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

.method public final V0()Lne3/e0;
    .locals 1

    invoke-virtual {p0}, Ldh/p;->D0()Lne3/e0;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ldt/b;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final declared-synchronized close()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Ldh/p;->E:Z

    iget-object v0, p0, Ldh/p;->F:Lne3/j0;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lqh/d;->a(Ljava/io/Closeable;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Ldh/p;->z:Ljava/io/Closeable;

    if-eqz v0, :cond_1

    invoke-static {v0}, Lqh/d;->a(Ljava/io/Closeable;)V
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
    iget-boolean v0, p0, Ldh/p;->E:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ldh/p;->F:Lne3/j0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    iget-object v0, p0, Ldh/p;->x:Lne3/p;

    iget-object v1, p0, Ldh/p;->w:Lne3/e0;

    invoke-virtual {v0, v1}, Lne3/p;->x0(Lne3/e0;)Lne3/p0;

    move-result-object v0

    invoke-static {v0}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v0

    iput-object v0, p0, Ldh/p;->F:Lne3/j0;
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
