.class public final Lyd3/b;
.super Lyd3/a;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc93/a;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lyd3/b;->e:I

    iput-object p1, p0, Lyd3/b;->f:Ljava/lang/Object;

    .line 2
    invoke-direct {p0, p2, p3}, Lyd3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Lzd3/q;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lyd3/b;->e:I

    iput-object p1, p0, Lyd3/b;->f:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 1
    invoke-direct {p0, p2, p1}, Lyd3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 18

    move-object/from16 v1, p0

    iget v0, v1, Lyd3/b;->e:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lyd3/b;->f:Ljava/lang/Object;

    check-cast v0, Lzd3/q;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    iget-wide v4, v0, Lzd3/q;->a:J

    sub-long v4, v2, v4

    const-wide/16 v6, 0x1

    add-long/2addr v4, v6

    iget-object v6, v0, Lzd3/q;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const-string v7, "iterator(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide v8, 0x7fffffffffffffffL

    const/4 v10, 0x0

    move v11, v10

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lzd3/p;

    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    monitor-enter v14

    :try_start_0
    invoke-virtual {v0, v14, v2, v3}, Lzd3/q;->a(Lzd3/p;J)I

    move-result v15

    if-lez v15, :cond_0

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_0
    move-wide/from16 v16, v8

    iget-wide v7, v14, Lzd3/p;->r:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v9, v7, v4

    if-gez v9, :cond_1

    move-wide v4, v7

    move-object v12, v14

    :cond_1
    add-int/lit8 v10, v10, 0x1

    cmp-long v9, v7, v16

    if-gez v9, :cond_2

    move-wide v8, v7

    move-object v13, v14

    goto :goto_1

    :cond_2
    move-wide/from16 v8, v16

    :goto_1
    monitor-exit v14

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v14

    throw v0

    :cond_3
    move-wide/from16 v16, v8

    const-wide/16 v6, -0x1

    if-eqz v12, :cond_4

    move-object v15, v12

    goto :goto_2

    :cond_4
    const/4 v4, 0x5

    if-le v10, v4, :cond_5

    move-object v15, v13

    move-wide/from16 v4, v16

    goto :goto_2

    :cond_5
    move-wide v4, v6

    const/4 v15, 0x0

    :goto_2
    if-eqz v15, :cond_8

    monitor-enter v15

    :try_start_1
    iget-object v2, v15, Lzd3/p;->q:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const-wide/16 v6, 0x0

    if-nez v2, :cond_6

    :goto_3
    monitor-exit v15

    goto :goto_4

    :cond_6
    :try_start_2
    iget-wide v2, v15, Lzd3/p;->r:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_7

    goto :goto_3

    :cond_7
    const/4 v2, 0x1

    iput-boolean v2, v15, Lzd3/p;->k:Z

    iget-object v2, v0, Lzd3/q;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v2, v15}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v15

    iget-object v2, v15, Lzd3/p;->e:Ljava/net/Socket;

    invoke-static {v2}, Lwd3/h;->c(Ljava/net/Socket;)V

    iget-object v2, v0, Lzd3/q;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v0, v0, Lzd3/q;->b:Lyd3/c;

    invoke-virtual {v0}, Lyd3/c;->a()V

    goto :goto_4

    :catchall_1
    move-exception v0

    monitor-exit v15

    throw v0

    :cond_8
    if-eqz v13, :cond_9

    iget-wide v4, v0, Lzd3/q;->a:J

    add-long v8, v16, v4

    sub-long v6, v8, v2

    goto :goto_4

    :cond_9
    if-lez v11, :cond_a

    iget-wide v6, v0, Lzd3/q;->a:J

    :cond_a
    :goto_4
    return-wide v6

    :pswitch_0
    iget-object v0, v1, Lyd3/b;->f:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    const-wide/16 v2, -0x1

    return-wide v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
