.class public final Lsn/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lko/a0;


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Lko/i0;

.field public final c:Lq30/w0;

.field public final d:Lsn/k0;

.field public final e:Lb9/m1;

.field public final f:Lt9/s;

.field public volatile g:Z

.field public h:Z

.field public i:J

.field public j:Lko/n;

.field public k:J

.field public l:Lsn/q0;

.field public m:Z

.field public final synthetic n:Lsn/k0;


# direct methods
.method public constructor <init>(Lsn/k0;Landroid/net/Uri;Lko/l;Lq30/w0;Lsn/k0;Lb9/m1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/h0;->n:Lsn/k0;

    iput-object p2, p0, Lsn/h0;->a:Landroid/net/Uri;

    new-instance p1, Lko/i0;

    invoke-direct {p1, p3}, Lko/i0;-><init>(Lko/l;)V

    iput-object p1, p0, Lsn/h0;->b:Lko/i0;

    iput-object p4, p0, Lsn/h0;->c:Lq30/w0;

    iput-object p5, p0, Lsn/h0;->d:Lsn/k0;

    iput-object p6, p0, Lsn/h0;->e:Lb9/m1;

    new-instance p1, Lt9/s;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/h0;->f:Lt9/s;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lsn/h0;->h:Z

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lsn/h0;->k:J

    sget-object p1, Lsn/m;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    const-wide/16 p1, 0x0

    invoke-virtual {p0, p1, p2}, Lsn/h0;->a(J)Lko/n;

    move-result-object p1

    iput-object p1, p0, Lsn/h0;->j:Lko/n;

    return-void
.end method


# virtual methods
.method public final a(J)Lko/n;
    .locals 11

    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    sget-object v5, Lsn/k0;->l0:Ljava/util/Map;

    const-string v0, "The uri must be set."

    iget-object v2, p0, Lsn/h0;->a:Landroid/net/Uri;

    invoke-static {v2, v0}, Llo/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lko/n;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const-wide/16 v8, -0x1

    const/4 v10, 0x6

    move-wide v6, p1

    invoke-direct/range {v1 .. v10}, Lko/n;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJI)V

    return-object v1
.end method

.method public final b()V
    .locals 15

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-nez v1, :cond_e

    iget-boolean v2, p0, Lsn/h0;->g:Z

    if-nez v2, :cond_e

    const-wide/16 v2, -0x1

    const/4 v4, 0x1

    :try_start_0
    iget-object v5, p0, Lsn/h0;->f:Lt9/s;

    iget-wide v10, v5, Lt9/s;->a:J

    invoke-virtual {p0, v10, v11}, Lsn/h0;->a(J)Lko/n;

    move-result-object v5

    iput-object v5, p0, Lsn/h0;->j:Lko/n;

    iget-object v6, p0, Lsn/h0;->b:Lko/i0;

    invoke-virtual {v6, v5}, Lko/i0;->z(Lko/n;)J

    move-result-wide v5

    iput-wide v5, p0, Lsn/h0;->k:J

    cmp-long v7, v5, v2

    if-eqz v7, :cond_0

    add-long/2addr v5, v10

    iput-wide v5, p0, Lsn/h0;->k:J

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :cond_0
    :goto_1
    iget-object v5, p0, Lsn/h0;->n:Lsn/k0;

    iget-object v6, p0, Lsn/h0;->b:Lko/i0;

    iget-object v6, v6, Lko/i0;->w:Lko/l;

    invoke-interface {v6}, Lko/l;->getResponseHeaders()Ljava/util/Map;

    move-result-object v6

    invoke-static {v6}, Lmn/c;->b(Ljava/util/Map;)Lmn/c;

    move-result-object v6

    iput-object v6, v5, Lsn/k0;->Q:Lmn/c;

    iget-object v5, p0, Lsn/h0;->b:Lko/i0;

    iget-object v6, p0, Lsn/h0;->n:Lsn/k0;

    iget-object v6, v6, Lsn/k0;->Q:Lmn/c;

    if-eqz v6, :cond_1

    iget v6, v6, Lmn/c;->F:I

    const/4 v7, -0x1

    if-eq v6, v7, :cond_1

    new-instance v7, Lsn/l;

    invoke-direct {v7, v5, v6, p0}, Lsn/l;-><init>(Lko/l;ILsn/h0;)V

    iget-object v5, p0, Lsn/h0;->n:Lsn/k0;

    new-instance v6, Lsn/j0;

    invoke-direct {v6, v0, v4}, Lsn/j0;-><init>(IZ)V

    invoke-virtual {v5, v6}, Lsn/k0;->C(Lsn/j0;)Lsn/q0;

    move-result-object v5

    iput-object v5, p0, Lsn/h0;->l:Lsn/q0;

    sget-object v6, Lsn/k0;->m0:Lrm/c0;

    invoke-virtual {v5, v6}, Lsn/q0;->a(Lrm/c0;)V

    goto :goto_2

    :cond_1
    move-object v7, v5

    :goto_2
    iget-object v6, p0, Lsn/h0;->c:Lq30/w0;

    iget-object v8, p0, Lsn/h0;->a:Landroid/net/Uri;

    iget-object v5, p0, Lsn/h0;->b:Lko/i0;

    iget-object v5, v5, Lko/i0;->w:Lko/l;

    invoke-interface {v5}, Lko/l;->getResponseHeaders()Ljava/util/Map;

    move-result-object v9

    iget-wide v12, p0, Lsn/h0;->k:J

    iget-object v14, p0, Lsn/h0;->d:Lsn/k0;

    invoke-virtual/range {v6 .. v14}, Lq30/w0;->x(Lko/l;Landroid/net/Uri;Ljava/util/Map;JJLsn/k0;)V

    iget-object v5, p0, Lsn/h0;->n:Lsn/k0;

    iget-object v5, v5, Lsn/k0;->Q:Lmn/c;

    if-eqz v5, :cond_2

    iget-object v5, p0, Lsn/h0;->c:Lq30/w0;

    iget-object v5, v5, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v5, Lwm/i;

    instance-of v6, v5, Lcn/d;

    if-eqz v6, :cond_2

    check-cast v5, Lcn/d;

    iput-boolean v4, v5, Lcn/d;->q:Z

    :cond_2
    iget-boolean v5, p0, Lsn/h0;->h:Z

    if-eqz v5, :cond_3

    iget-object v5, p0, Lsn/h0;->c:Lq30/w0;

    iget-wide v6, p0, Lsn/h0;->i:J

    iget-object v5, v5, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v5, Lwm/i;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v5, v10, v11, v6, v7}, Lwm/i;->b(JJ)V

    iput-boolean v0, p0, Lsn/h0;->h:Z

    :cond_3
    :goto_3
    if-nez v1, :cond_6

    iget-boolean v5, p0, Lsn/h0;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v5, :cond_6

    :try_start_1
    iget-object v5, p0, Lsn/h0;->e:Lb9/m1;

    monitor-enter v5
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_4
    :try_start_2
    iget-boolean v6, v5, Lb9/m1;->x:Z

    if-nez v6, :cond_4

    invoke-virtual {v5}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_6

    :cond_4
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget-object v5, p0, Lsn/h0;->c:Lq30/w0;

    iget-object v6, p0, Lsn/h0;->f:Lt9/s;

    iget-object v7, v5, Lq30/w0;->y:Ljava/lang/Object;

    check-cast v7, Lwm/i;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v5, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v5, Lwm/f;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v7, v5, v6}, Lwm/i;->i(Lwm/j;Lt9/s;)I

    move-result v1

    iget-object v5, p0, Lsn/h0;->c:Lq30/w0;

    iget-object v5, v5, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v5, Lwm/f;

    if-eqz v5, :cond_5

    iget-wide v5, v5, Lwm/f;->z:J

    goto :goto_5

    :cond_5
    move-wide v5, v2

    :goto_5
    iget-object v7, p0, Lsn/h0;->n:Lsn/k0;

    iget-wide v7, v7, Lsn/k0;->I:J

    add-long/2addr v7, v10

    cmp-long v7, v5, v7

    if-lez v7, :cond_3

    iget-object v7, p0, Lsn/h0;->e:Lb9/m1;

    monitor-enter v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iput-boolean v0, v7, Lb9/m1;->x:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    monitor-exit v7

    iget-object v7, p0, Lsn/h0;->n:Lsn/k0;

    iget-object v8, v7, Lsn/k0;->O:Landroid/os/Handler;

    iget-object v7, v7, Lsn/k0;->N:Lsn/g0;

    invoke-virtual {v8, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-wide v10, v5

    goto :goto_3

    :catchall_2
    move-exception v0

    :try_start_7
    monitor-exit v7
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_6
    :try_start_9
    monitor-exit v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :try_start_a
    throw v0
    :try_end_a
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :catch_0
    :try_start_b
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :cond_6
    if-ne v1, v4, :cond_7

    move v1, v0

    goto :goto_8

    :cond_7
    iget-object v4, p0, Lsn/h0;->c:Lq30/w0;

    iget-object v4, v4, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v4, Lwm/f;

    if-eqz v4, :cond_8

    iget-wide v5, v4, Lwm/f;->z:J

    goto :goto_7

    :cond_8
    move-wide v5, v2

    :goto_7
    cmp-long v5, v5, v2

    if-eqz v5, :cond_a

    iget-object v5, p0, Lsn/h0;->f:Lt9/s;

    if-eqz v4, :cond_9

    iget-wide v2, v4, Lwm/f;->z:J

    :cond_9
    iput-wide v2, v5, Lt9/s;->a:J

    :cond_a
    :goto_8
    iget-object v2, p0, Lsn/h0;->b:Lko/i0;

    invoke-static {v2}, Lds/p;->w(Lko/l;)V

    goto/16 :goto_0

    :goto_9
    if-eq v1, v4, :cond_d

    iget-object v1, p0, Lsn/h0;->c:Lq30/w0;

    iget-object v1, v1, Lq30/w0;->z:Ljava/lang/Object;

    check-cast v1, Lwm/f;

    if-eqz v1, :cond_b

    iget-wide v4, v1, Lwm/f;->z:J

    goto :goto_a

    :cond_b
    move-wide v4, v2

    :goto_a
    cmp-long v4, v4, v2

    if-eqz v4, :cond_d

    iget-object v4, p0, Lsn/h0;->f:Lt9/s;

    if-eqz v1, :cond_c

    iget-wide v2, v1, Lwm/f;->z:J

    :cond_c
    iput-wide v2, v4, Lt9/s;->a:J

    :cond_d
    iget-object v1, p0, Lsn/h0;->b:Lko/i0;

    invoke-static {v1}, Lds/p;->w(Lko/l;)V

    throw v0

    :cond_e
    return-void
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lsn/h0;->g:Z

    return-void
.end method
