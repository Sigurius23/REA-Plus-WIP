.class public final Lsh/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsh/q;


# instance fields
.field public E:Lne3/j;

.field public F:Lne3/e0;

.field public final w:Lne3/p;

.field public final x:Ls2/a;

.field public final y:Ljava/lang/Object;

.field public z:Z


# direct methods
.method public constructor <init>(Lne3/j;Lne3/p;Ls2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lsh/s;->w:Lne3/p;

    iput-object p3, p0, Lsh/s;->x:Ls2/a;

    new-instance p2, Ljava/lang/Object;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lsh/s;->y:Ljava/lang/Object;

    iput-object p1, p0, Lsh/s;->E:Lne3/j;

    return-void
.end method


# virtual methods
.method public final D0()Lne3/e0;
    .locals 6

    iget-object v0, p0, Lsh/s;->y:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lsh/s;->z:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Lsh/s;->F:Lne3/e0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    :try_start_1
    iget-object v1, p0, Lsh/s;->w:Lne3/p;

    :cond_1
    sget-object v2, Lne3/p;->x:Lne3/e0;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "tmp_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v4, Lg93/d;->w:Lg93/c;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lg93/d;->x:Lg93/a;

    invoke-virtual {v4}, Lg93/a;->i()Ljava/util/Random;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/Random;->nextLong()J

    move-result-wide v4

    invoke-static {v4, v5}, Ll83/v;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lne3/e0;->e(Ljava/lang/String;)Lne3/e0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lne3/p;->x(Lne3/e0;)Z

    move-result v3

    if-nez v3, :cond_1

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lne3/p;->p0(Lne3/e0;Z)Lne3/n0;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :try_start_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :catch_0
    :try_start_3
    iget-object v1, p0, Lsh/s;->w:Lne3/p;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lne3/p;->p0(Lne3/e0;Z)Lne3/n0;

    move-result-object v1

    invoke-static {v1}, Lne3/b;->b(Lne3/n0;)Lne3/h0;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    const/4 v3, 0x0

    :try_start_4
    iget-object v4, p0, Lsh/s;->E:Lne3/j;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v4}, Lne3/h0;->N0(Lne3/p0;)J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-virtual {v1}, Lne3/h0;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object v1, v3

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_1

    :catchall_1
    move-exception v4

    :try_start_6
    invoke-virtual {v1}, Lne3/h0;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v1

    :try_start_7
    invoke-static {v4, v1}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_0
    move-object v1, v4

    :goto_1
    if-nez v1, :cond_2

    iput-object v3, p0, Lsh/s;->E:Lne3/j;

    iput-object v2, p0, Lsh/s;->F:Lne3/e0;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    monitor-exit v0

    return-object v2

    :catchall_3
    move-exception v1

    goto :goto_2

    :cond_2
    :try_start_8
    throw v1

    :catch_1
    move-exception v1

    throw v1

    :cond_3
    const-string v1, "closed"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :goto_2
    monitor-exit v0

    throw v1
.end method

.method public final V0()Lne3/e0;
    .locals 3

    iget-object v0, p0, Lsh/s;->y:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lsh/s;->z:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lsh/s;->F:Lne3/e0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    :try_start_1
    const-string v1, "closed"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit v0

    throw v1
.end method

.method public final c()Ls2/a;
    .locals 1

    iget-object v0, p0, Lsh/s;->x:Ls2/a;

    return-object v0
.end method

.method public final close()V
    .locals 3

    iget-object v0, p0, Lsh/s;->y:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lsh/s;->z:Z

    iget-object v1, p0, Lsh/s;->E:Lne3/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    :try_start_1
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_2
    throw v1

    :catch_1
    :cond_0
    :goto_0
    iget-object v1, p0, Lsh/s;->F:Lne3/e0;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lsh/s;->w:Lne3/p;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v1}, Lne3/p;->m(Lne3/e0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw v1
.end method

.method public final d1()Lne3/j;
    .locals 3

    iget-object v0, p0, Lsh/s;->y:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lsh/s;->z:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lsh/s;->E:Lne3/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    :try_start_1
    iget-object v1, p0, Lsh/s;->w:Lne3/p;

    iget-object v2, p0, Lsh/s;->F:Lne3/e0;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lne3/p;->x0(Lne3/e0;)Lne3/p0;

    move-result-object v1

    invoke-static {v1}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v1

    iput-object v1, p0, Lsh/s;->E:Lne3/j;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_1
    :try_start_2
    const-string v1, "closed"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    monitor-exit v0

    throw v1
.end method

.method public final getFileSystem()Lne3/p;
    .locals 1

    iget-object v0, p0, Lsh/s;->w:Lne3/p;

    return-object v0
.end method
