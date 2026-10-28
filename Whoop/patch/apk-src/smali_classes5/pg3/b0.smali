.class public final Lpg3/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpg3/e;


# instance fields
.field public final E:Lpg3/n;

.field public volatile F:Z

.field public G:Lzd3/o;

.field public H:Ljava/lang/Throwable;

.field public I:Z

.field public final w:Lpg3/u0;

.field public final x:Ljava/lang/Object;

.field public final y:[Ljava/lang/Object;

.field public final z:Lud3/i;


# direct methods
.method public constructor <init>(Lpg3/u0;Ljava/lang/Object;[Ljava/lang/Object;Lud3/i;Lpg3/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg3/b0;->w:Lpg3/u0;

    iput-object p2, p0, Lpg3/b0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lpg3/b0;->y:[Ljava/lang/Object;

    iput-object p4, p0, Lpg3/b0;->z:Lud3/i;

    iput-object p5, p0, Lpg3/b0;->E:Lpg3/n;

    return-void
.end method


# virtual methods
.method public final F0()Z
    .locals 2

    iget-boolean v0, p0, Lpg3/b0;->F:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lpg3/b0;->G:Lzd3/o;

    if-eqz v0, :cond_1

    iget-boolean v0, v0, Lzd3/o;->R:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_0
    monitor-exit p0

    return v1

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final R0(Lpg3/h;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lpg3/b0;->I:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpg3/b0;->I:Z

    iget-object v0, p0, Lpg3/b0;->G:Lzd3/o;

    iget-object v1, p0, Lpg3/b0;->H:Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    :try_start_1
    invoke-virtual {p0}, Lpg3/b0;->a()Lzd3/o;

    move-result-object v2

    iput-object v2, p0, Lpg3/b0;->G:Lzd3/o;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v0, v2

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_2
    invoke-static {v1}, Lpg3/e1;->r(Ljava/lang/Throwable;)V

    iput-object v1, p0, Lpg3/b0;->H:Ljava/lang/Throwable;

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v1, :cond_1

    invoke-interface {p1, p0, v1}, Lpg3/h;->r(Lpg3/e;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    iget-boolean v1, p0, Lpg3/b0;->F:Z

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lzd3/o;->cancel()V

    :cond_2
    new-instance v1, Lp0/n0;

    invoke-direct {v1, p0, p1}, Lp0/n0;-><init>(Lpg3/b0;Lpg3/h;)V

    invoke-virtual {v0, v1}, Lzd3/o;->d(Lud3/k;)V

    return-void

    :cond_3
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already executed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public final a()Lzd3/o;
    .locals 14

    iget-object v0, p0, Lpg3/b0;->w:Lpg3/u0;

    iget-object v1, v0, Lpg3/u0;->k:[Lpg3/e1;

    iget-object v2, p0, Lpg3/b0;->y:[Ljava/lang/Object;

    array-length v3, v2

    array-length v4, v1

    if-ne v3, v4, :cond_a

    new-instance v5, Lpg3/s0;

    iget-object v6, v0, Lpg3/u0;->d:Ljava/lang/String;

    iget-object v7, v0, Lpg3/u0;->c:Lud3/e0;

    iget-object v8, v0, Lpg3/u0;->e:Ljava/lang/String;

    iget-object v9, v0, Lpg3/u0;->f:Lud3/d0;

    iget-object v10, v0, Lpg3/u0;->g:Lud3/h0;

    iget-boolean v11, v0, Lpg3/u0;->h:Z

    iget-boolean v12, v0, Lpg3/u0;->i:Z

    iget-boolean v13, v0, Lpg3/u0;->j:Z

    invoke-direct/range {v5 .. v13}, Lpg3/s0;-><init>(Ljava/lang/String;Lud3/e0;Ljava/lang/String;Lud3/d0;Lud3/h0;ZZZ)V

    iget-boolean v4, v0, Lpg3/u0;->l:Z

    if-eqz v4, :cond_0

    add-int/lit8 v3, v3, -0x1

    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v3, :cond_1

    aget-object v8, v2, v7

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    aget-object v8, v1, v7

    aget-object v9, v2, v7

    invoke-virtual {v8, v5, v9}, Lpg3/e1;->a(Lpg3/s0;Ljava/lang/Object;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, v5, Lpg3/s0;->d:Lcom/iterable/iterableapi/v;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/iterable/iterableapi/v;->b()Lud3/e0;

    move-result-object v1

    goto :goto_2

    :cond_2
    iget-object v1, v5, Lpg3/s0;->c:Ljava/lang/String;

    iget-object v3, v5, Lpg3/s0;->b:Lud3/e0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, "link"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Lud3/e0;->h(Ljava/lang/String;)Lcom/iterable/iterableapi/v;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/iterable/iterableapi/v;->b()Lud3/e0;

    move-result-object v1

    goto :goto_1

    :cond_3
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_9

    :goto_2
    iget-object v3, v5, Lpg3/s0;->k:Lud3/v0;

    if-nez v3, :cond_6

    iget-object v7, v5, Lpg3/s0;->j:Lg40/c1;

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lg40/c1;->c()Lud3/b0;

    move-result-object v3

    goto :goto_3

    :cond_4
    iget-object v7, v5, Lpg3/s0;->i:Lq30/w0;

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Lq30/w0;->i()Lud3/j0;

    move-result-object v3

    goto :goto_3

    :cond_5
    iget-boolean v7, v5, Lpg3/s0;->h:Z

    if-eqz v7, :cond_6

    new-array v3, v6, [B

    invoke-static {v2, v3}, Lud3/v0;->create(Lud3/h0;[B)Lud3/v0;

    move-result-object v3

    :cond_6
    :goto_3
    iget-object v2, v5, Lpg3/s0;->g:Lud3/h0;

    iget-object v6, v5, Lpg3/s0;->f:Lkotlin/jvm/internal/k0;

    if-eqz v2, :cond_8

    if-eqz v3, :cond_7

    new-instance v7, Lpg3/r0;

    invoke-direct {v7, v3, v2}, Lpg3/r0;-><init>(Lud3/v0;Lud3/h0;)V

    move-object v3, v7

    goto :goto_4

    :cond_7
    const-string v7, "Content-Type"

    iget-object v2, v2, Lud3/h0;->a:Ljava/lang/String;

    invoke-virtual {v6, v7, v2}, Lkotlin/jvm/internal/k0;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_8
    :goto_4
    iget-object v2, v5, Lpg3/s0;->e:Lud3/n0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v1, v2, Lud3/n0;->a:Lud3/e0;

    invoke-virtual {v6}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object v1

    invoke-virtual {v2, v1}, Lud3/n0;->d(Lud3/d0;)V

    iget-object v1, v5, Lpg3/s0;->a:Ljava/lang/String;

    invoke-virtual {v2, v1, v3}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    new-instance v1, Lpg3/w;

    iget-object v3, v0, Lpg3/u0;->a:Ljava/lang/Class;

    iget-object v0, v0, Lpg3/u0;->b:Ljava/lang/reflect/Method;

    iget-object v5, p0, Lpg3/b0;->x:Ljava/lang/Object;

    invoke-direct {v1, v3, v5, v0, v4}, Lpg3/w;-><init>(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/ArrayList;)V

    const-class v0, Lpg3/w;

    invoke-static {v0}, Ljc/x;->V(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const-string v3, "type"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v2, Lud3/n0;->e:Lv63/c;

    invoke-virtual {v3, v0, v1}, Lv63/c;->k(Lj93/d;Ljava/lang/Object;)Lv63/c;

    move-result-object v0

    iput-object v0, v2, Lud3/n0;->e:Lv63/c;

    new-instance v0, Lud3/o0;

    invoke-direct {v0, v2}, Lud3/o0;-><init>(Lud3/n0;)V

    iget-object v1, p0, Lpg3/b0;->z:Lud3/i;

    check-cast v1, Lud3/l0;

    invoke-virtual {v1, v0}, Lud3/l0;->b(Lud3/o0;)Lzd3/o;

    move-result-object v0

    return-object v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Malformed URL. Base: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", Relative: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v5, Lpg3/s0;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Argument count ("

    const-string v4, ") doesn\'t match expected count ("

    invoke-static {v3, v2, v4}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v1, v1

    const-string v3, ")"

    invoke-static {v2, v1, v3}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()Lpg3/v0;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lpg3/b0;->I:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpg3/b0;->I:Z

    invoke-virtual {p0}, Lpg3/b0;->c()Lud3/j;

    move-result-object v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v1, p0, Lpg3/b0;->F:Z

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lzd3/o;

    invoke-virtual {v1}, Lzd3/o;->cancel()V

    :cond_0
    check-cast v0, Lzd3/o;

    invoke-virtual {v0}, Lzd3/o;->e()Lud3/x0;

    move-result-object v0

    invoke-virtual {p0, v0}, Lpg3/b0;->d(Lud3/x0;)Lpg3/v0;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already executed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final c()Lud3/j;
    .locals 2

    iget-object v0, p0, Lpg3/b0;->G:Lzd3/o;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lpg3/b0;->H:Ljava/lang/Throwable;

    if-eqz v0, :cond_3

    instance-of v1, v0, Ljava/io/IOException;

    if-nez v1, :cond_2

    instance-of v1, v0, Ljava/lang/RuntimeException;

    if-eqz v1, :cond_1

    check-cast v0, Ljava/lang/RuntimeException;

    throw v0

    :cond_1
    check-cast v0, Ljava/lang/Error;

    throw v0

    :cond_2
    check-cast v0, Ljava/io/IOException;

    throw v0

    :cond_3
    :try_start_0
    invoke-virtual {p0}, Lpg3/b0;->a()Lzd3/o;

    move-result-object v0

    iput-object v0, p0, Lpg3/b0;->G:Lzd3/o;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    :goto_0
    invoke-static {v0}, Lpg3/e1;->r(Ljava/lang/Throwable;)V

    iput-object v0, p0, Lpg3/b0;->H:Ljava/lang/Throwable;

    throw v0
.end method

.method public final cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpg3/b0;->F:Z

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lpg3/b0;->G:Lzd3/o;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lzd3/o;->cancel()V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Lpg3/b0;

    iget-object v4, p0, Lpg3/b0;->z:Lud3/i;

    iget-object v5, p0, Lpg3/b0;->E:Lpg3/n;

    iget-object v1, p0, Lpg3/b0;->w:Lpg3/u0;

    iget-object v2, p0, Lpg3/b0;->x:Ljava/lang/Object;

    iget-object v3, p0, Lpg3/b0;->y:[Ljava/lang/Object;

    invoke-direct/range {v0 .. v5}, Lpg3/b0;-><init>(Lpg3/u0;Ljava/lang/Object;[Ljava/lang/Object;Lud3/i;Lpg3/n;)V

    return-object v0
.end method

.method public final clone()Lpg3/e;
    .locals 6

    .line 2
    new-instance v0, Lpg3/b0;

    iget-object v4, p0, Lpg3/b0;->z:Lud3/i;

    iget-object v5, p0, Lpg3/b0;->E:Lpg3/n;

    iget-object v1, p0, Lpg3/b0;->w:Lpg3/u0;

    iget-object v2, p0, Lpg3/b0;->x:Ljava/lang/Object;

    iget-object v3, p0, Lpg3/b0;->y:[Ljava/lang/Object;

    invoke-direct/range {v0 .. v5}, Lpg3/b0;-><init>(Lpg3/u0;Ljava/lang/Object;[Ljava/lang/Object;Lud3/i;Lpg3/n;)V

    return-object v0
.end method

.method public final d(Lud3/x0;)Lpg3/v0;
    .locals 6

    iget-object v0, p1, Lud3/x0;->G:Lud3/a1;

    invoke-virtual {p1}, Lud3/x0;->h()Lud3/w0;

    move-result-object p1

    new-instance v1, Lpg3/a0;

    invoke-virtual {v0}, Lud3/a1;->k()Lud3/h0;

    move-result-object v2

    invoke-virtual {v0}, Lud3/a1;->i()J

    move-result-wide v3

    invoke-direct {v1, v2, v3, v4}, Lpg3/a0;-><init>(Lud3/h0;J)V

    iput-object v1, p1, Lud3/w0;->g:Lud3/a1;

    invoke-virtual {p1}, Lud3/w0;->a()Lud3/x0;

    move-result-object p1

    iget v1, p1, Lud3/x0;->z:I

    const/16 v2, 0xc8

    if-lt v1, v2, :cond_4

    const/16 v2, 0x12c

    if-lt v1, v2, :cond_0

    goto :goto_1

    :cond_0
    const/16 v2, 0xcc

    if-eq v1, v2, :cond_3

    const/16 v2, 0xcd

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lpg3/z;

    invoke-direct {v1, v0}, Lpg3/z;-><init>(Lud3/a1;)V

    :try_start_0
    iget-object v0, p0, Lpg3/b0;->E:Lpg3/n;

    invoke-interface {v0, v1}, Lpg3/n;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lpg3/v0;->d(Ljava/lang/Object;Lud3/x0;)Lpg3/v0;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, v1, Lpg3/z;->E:Ljava/io/IOException;

    if-nez v0, :cond_2

    throw p1

    :cond_2
    throw v0

    :cond_3
    :goto_0
    invoke-virtual {v0}, Lud3/a1;->close()V

    const/4 v0, 0x0

    invoke-static {v0, p1}, Lpg3/v0;->d(Ljava/lang/Object;Lud3/x0;)Lpg3/v0;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_1
    :try_start_1
    new-instance v1, Lne3/h;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0}, Lud3/a1;->d1()Lne3/j;

    move-result-object v2

    invoke-interface {v2, v1}, Lne3/j;->P0(Lne3/i;)J

    invoke-virtual {v0}, Lud3/a1;->k()Lud3/h0;

    move-result-object v2

    invoke-virtual {v0}, Lud3/a1;->i()J

    move-result-wide v3

    sget-object v5, Lud3/a1;->x:Lud3/z0;

    new-instance v5, Lud3/z0;

    invoke-direct {v5, v2, v3, v4, v1}, Lud3/z0;-><init>(Lud3/h0;JLne3/h;)V

    invoke-static {v5, p1}, Lpg3/v0;->b(Lud3/a1;Lud3/x0;)Lpg3/v0;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v0}, Lud3/a1;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lud3/a1;->close()V

    throw p1
.end method

.method public final declared-synchronized m()Lud3/o0;
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lpg3/b0;->c()Lud3/j;

    move-result-object v0

    check-cast v0, Lzd3/o;

    iget-object v0, v0, Lzd3/o;->x:Lud3/o0;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to create request."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
