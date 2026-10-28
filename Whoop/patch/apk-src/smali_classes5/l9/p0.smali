.class public final Ll9/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp9/i;


# instance fields
.field public final E:Lb9/m1;

.field public final F:Lt9/s;

.field public volatile G:Z

.field public H:Z

.field public I:J

.field public J:Lz8/g;

.field public K:Lt9/k0;

.field public L:Z

.field public final synthetic M:Ll9/s0;

.field public final w:Landroid/net/Uri;

.field public final x:Lz8/m;

.field public final y:Lgm/r;

.field public final z:Ll9/s0;


# direct methods
.method public constructor <init>(Ll9/s0;Landroid/net/Uri;Lz8/f;Lgm/r;Ll9/s0;Lb9/m1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/p0;->M:Ll9/s0;

    iput-object p2, p0, Ll9/p0;->w:Landroid/net/Uri;

    new-instance p1, Lz8/m;

    invoke-direct {p1, p3}, Lz8/m;-><init>(Lz8/f;)V

    iput-object p1, p0, Ll9/p0;->x:Lz8/m;

    iput-object p4, p0, Ll9/p0;->y:Lgm/r;

    iput-object p5, p0, Ll9/p0;->z:Ll9/s0;

    iput-object p6, p0, Ll9/p0;->E:Lb9/m1;

    new-instance p1, Lt9/s;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll9/p0;->F:Lt9/s;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ll9/p0;->H:Z

    sget-object p1, Ll9/t;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    const-wide/16 p1, 0x0

    invoke-virtual {p0, p1, p2}, Ll9/p0;->a(J)Lz8/g;

    move-result-object p1

    iput-object p1, p0, Ll9/p0;->J:Lz8/g;

    return-void
.end method


# virtual methods
.method public final a(J)Lz8/g;
    .locals 12

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    sget-object v5, Ll9/s0;->p0:Ljava/util/Map;

    const-string v0, "The uri must be set."

    iget-object v2, p0, Ll9/p0;->w:Landroid/net/Uri;

    invoke-static {v2, v0}, Lva3/g;->k(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lz8/g;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const-wide/16 v8, -0x1

    const/4 v10, 0x0

    const/4 v11, 0x6

    move-wide v6, p1

    invoke-direct/range {v1 .. v11}, Lz8/g;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    return-object v1
.end method

.method public final b()V
    .locals 15

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-nez v1, :cond_d

    iget-boolean v2, p0, Ll9/p0;->G:Z

    if-nez v2, :cond_d

    const-wide/16 v2, -0x1

    const/4 v4, 0x1

    :try_start_0
    iget-object v5, p0, Ll9/p0;->F:Lt9/s;

    iget-wide v10, v5, Lt9/s;->a:J

    invoke-virtual {p0, v10, v11}, Ll9/p0;->a(J)Lz8/g;

    move-result-object v5

    iput-object v5, p0, Ll9/p0;->J:Lz8/g;

    iget-object v6, p0, Ll9/p0;->x:Lz8/m;

    invoke-virtual {v6, v5}, Lz8/m;->open(Lz8/g;)J

    move-result-wide v5

    iget-boolean v7, p0, Ll9/p0;->G:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v7, :cond_2

    if-ne v1, v4, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ll9/p0;->y:Lgm/r;

    invoke-virtual {v0}, Lgm/r;->E()J

    move-result-wide v0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll9/p0;->F:Lt9/s;

    iget-object v1, p0, Ll9/p0;->y:Lgm/r;

    invoke-virtual {v1}, Lgm/r;->E()J

    move-result-wide v1

    iput-wide v1, v0, Lt9/s;->a:J

    :cond_1
    :goto_1
    iget-object v0, p0, Ll9/p0;->x:Lz8/m;

    invoke-static {v0}, Lrv/n;->e(Lz8/f;)V

    return-void

    :cond_2
    cmp-long v7, v5, v2

    if-eqz v7, :cond_3

    add-long/2addr v5, v10

    :try_start_1
    iget-object v7, p0, Ll9/p0;->M:Ll9/s0;

    iget-object v8, v7, Ll9/s0;->Q:Landroid/os/Handler;

    new-instance v9, Ll9/n0;

    const/4 v12, 0x0

    invoke-direct {v9, v7, v12}, Ll9/n0;-><init>(Ll9/s0;I)V

    invoke-virtual {v8, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_3
    move-wide v12, v5

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :goto_2
    iget-object v5, p0, Ll9/p0;->M:Ll9/s0;

    iget-object v6, p0, Ll9/p0;->x:Lz8/m;

    iget-object v6, v6, Lz8/m;->w:Lz8/f;

    invoke-interface {v6}, Lz8/f;->getResponseHeaders()Ljava/util/Map;

    move-result-object v6

    invoke-static {v6}, Lga/b;->b(Ljava/util/Map;)Lga/b;

    move-result-object v6

    iput-object v6, v5, Ll9/s0;->S:Lga/b;

    iget-object v5, p0, Ll9/p0;->x:Lz8/m;

    iget-object v6, p0, Ll9/p0;->M:Ll9/s0;

    iget-object v6, v6, Ll9/s0;->S:Lga/b;

    if-eqz v6, :cond_4

    iget v6, v6, Lga/b;->f:I

    const/4 v7, -0x1

    if-eq v6, v7, :cond_4

    new-instance v7, Ll9/s;

    invoke-direct {v7, v5, v6, p0}, Ll9/s;-><init>(Lz8/f;ILl9/p0;)V

    iget-object v5, p0, Ll9/p0;->M:Ll9/s0;

    new-instance v6, Ll9/r0;

    invoke-direct {v6, v0, v4}, Ll9/r0;-><init>(IZ)V

    invoke-virtual {v5, v6}, Ll9/s0;->C(Ll9/r0;)Lt9/k0;

    move-result-object v5

    iput-object v5, p0, Ll9/p0;->K:Lt9/k0;

    sget-object v6, Ll9/s0;->q0:Lu8/p;

    invoke-interface {v5, v6}, Lt9/k0;->a(Lu8/p;)V

    goto :goto_3

    :cond_4
    move-object v7, v5

    :goto_3
    iget-object v6, p0, Ll9/p0;->y:Lgm/r;

    iget-object v8, p0, Ll9/p0;->w:Landroid/net/Uri;

    iget-object v5, p0, Ll9/p0;->x:Lz8/m;

    iget-object v5, v5, Lz8/m;->w:Lz8/f;

    invoke-interface {v5}, Lz8/f;->getResponseHeaders()Ljava/util/Map;

    move-result-object v9

    iget-object v14, p0, Ll9/p0;->z:Ll9/s0;

    invoke-virtual/range {v6 .. v14}, Lgm/r;->K(Lz8/f;Landroid/net/Uri;Ljava/util/Map;JJLl9/s0;)V

    iget-object v5, p0, Ll9/p0;->M:Ll9/s0;

    iget-object v5, v5, Ll9/s0;->S:Lga/b;

    if-eqz v5, :cond_6

    iget-object v5, p0, Ll9/p0;->y:Lgm/r;

    iget-object v5, v5, Lgm/r;->y:Ljava/lang/Object;

    check-cast v5, Lt9/n;

    if-nez v5, :cond_5

    goto :goto_4

    :cond_5
    instance-of v6, v5, Lma/d;

    if-eqz v6, :cond_6

    check-cast v5, Lma/d;

    iput-boolean v4, v5, Lma/d;->r:Z

    :cond_6
    :goto_4
    iget-boolean v5, p0, Ll9/p0;->H:Z

    if-eqz v5, :cond_7

    iget-object v5, p0, Ll9/p0;->y:Lgm/r;

    iget-wide v6, p0, Ll9/p0;->I:J

    iget-object v5, v5, Lgm/r;->y:Ljava/lang/Object;

    check-cast v5, Lt9/n;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v5, v10, v11, v6, v7}, Lt9/n;->b(JJ)V

    iput-boolean v0, p0, Ll9/p0;->H:Z

    :cond_7
    :goto_5
    if-nez v1, :cond_9

    iget-boolean v5, p0, Ll9/p0;->G:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v5, :cond_9

    :try_start_2
    iget-object v5, p0, Ll9/p0;->E:Lb9/m1;

    monitor-enter v5
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_6
    :try_start_3
    iget-boolean v6, v5, Lb9/m1;->x:Z

    if-nez v6, :cond_8

    invoke-virtual {v5}, Ljava/lang/Object;->wait()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_7

    :cond_8
    :try_start_4
    monitor-exit v5
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v5, p0, Ll9/p0;->y:Lgm/r;

    iget-object v6, p0, Ll9/p0;->F:Lt9/s;

    iget-object v7, v5, Lgm/r;->y:Ljava/lang/Object;

    check-cast v7, Lt9/n;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v5, Lgm/r;->z:Ljava/lang/Object;

    check-cast v5, Lt9/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v7, v5, v6}, Lt9/n;->i(Lt9/o;Lt9/s;)I

    move-result v1

    iget-object v5, p0, Ll9/p0;->y:Lgm/r;

    invoke-virtual {v5}, Lgm/r;->E()J

    move-result-wide v5

    iget-object v7, p0, Ll9/p0;->M:Ll9/s0;

    iget-wide v7, v7, Ll9/s0;->I:J

    add-long/2addr v7, v10

    cmp-long v7, v5, v7

    if-lez v7, :cond_7

    iget-object v7, p0, Ll9/p0;->E:Lb9/m1;

    monitor-enter v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    iput-boolean v0, v7, Lb9/m1;->x:Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    monitor-exit v7

    iget-object v7, p0, Ll9/p0;->M:Ll9/s0;

    iget-object v8, v7, Ll9/s0;->Q:Landroid/os/Handler;

    iget-object v7, v7, Ll9/s0;->P:Ll9/n0;

    invoke-virtual {v8, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-wide v10, v5

    goto :goto_5

    :catchall_2
    move-exception v0

    :try_start_8
    monitor-exit v7
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :try_start_9
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :goto_7
    :try_start_a
    monitor-exit v5
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :try_start_b
    throw v0
    :try_end_b
    .catch Ljava/lang/InterruptedException; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :catch_0
    :try_start_c
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :cond_9
    if-ne v1, v4, :cond_a

    move v1, v0

    goto :goto_8

    :cond_a
    iget-object v4, p0, Ll9/p0;->y:Lgm/r;

    invoke-virtual {v4}, Lgm/r;->E()J

    move-result-wide v4

    cmp-long v2, v4, v2

    if-eqz v2, :cond_b

    iget-object v2, p0, Ll9/p0;->F:Lt9/s;

    iget-object v3, p0, Ll9/p0;->y:Lgm/r;

    invoke-virtual {v3}, Lgm/r;->E()J

    move-result-wide v3

    iput-wide v3, v2, Lt9/s;->a:J

    :cond_b
    :goto_8
    iget-object v2, p0, Ll9/p0;->x:Lz8/m;

    invoke-static {v2}, Lrv/n;->e(Lz8/f;)V

    goto/16 :goto_0

    :goto_9
    if-eq v1, v4, :cond_c

    iget-object v1, p0, Ll9/p0;->y:Lgm/r;

    invoke-virtual {v1}, Lgm/r;->E()J

    move-result-wide v4

    cmp-long v1, v4, v2

    if-eqz v1, :cond_c

    iget-object v1, p0, Ll9/p0;->F:Lt9/s;

    iget-object v2, p0, Ll9/p0;->y:Lgm/r;

    invoke-virtual {v2}, Lgm/r;->E()J

    move-result-wide v2

    iput-wide v2, v1, Lt9/s;->a:J

    :cond_c
    iget-object v1, p0, Ll9/p0;->x:Lz8/m;

    invoke-static {v1}, Lrv/n;->e(Lz8/f;)V

    throw v0

    :cond_d
    return-void
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ll9/p0;->G:Z

    return-void
.end method
