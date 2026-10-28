.class public final Lce3/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/p0;


# instance fields
.field public E:Z

.field public final synthetic F:Lce3/y;

.field public final w:J

.field public x:Z

.field public final y:Lne3/h;

.field public final z:Lne3/h;


# direct methods
.method public constructor <init>(Lce3/y;JZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce3/w;->F:Lce3/y;

    iput-wide p2, p0, Lce3/w;->w:J

    iput-boolean p4, p0, Lce3/w;->x:Z

    new-instance p1, Lne3/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce3/w;->y:Lne3/h;

    new-instance p1, Lne3/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce3/w;->z:Lne3/h;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    iget-object v0, p0, Lce3/w;->F:Lce3/y;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lce3/w;->E:Z

    iget-object v1, p0, Lce3/w;->z:Lne3/h;

    iget-wide v2, v1, Lne3/h;->x:J

    invoke-virtual {v1}, Lne3/h;->b()V

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    const-wide/16 v0, 0x0

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lce3/w;->F:Lce3/y;

    sget-object v1, Lwd3/h;->a:Ljava/util/TimeZone;

    iget-object v0, v0, Lce3/y;->x:Lce3/q;

    invoke-virtual {v0, v2, v3}, Lce3/q;->m(J)V

    :cond_0
    iget-object v0, p0, Lce3/w;->F:Lce3/y;

    invoke-virtual {v0}, Lce3/y;->a()V

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final h1(Lne3/h;J)J
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-wide/from16 v2, p2

    const-string v4, "sink"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_e

    :goto_0
    iget-object v6, v1, Lce3/w;->F:Lce3/y;

    monitor-enter v6

    :try_start_0
    iget-object v7, v6, Lce3/y;->x:Lce3/q;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, v6, Lce3/y;->I:Lce3/v;

    iget-boolean v8, v7, Lce3/v;->y:Z

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-nez v8, :cond_1

    iget-boolean v7, v7, Lce3/v;->w:Z

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    move v7, v10

    goto :goto_2

    :cond_1
    :goto_1
    move v7, v9

    :goto_2
    if-eqz v7, :cond_2

    iget-object v8, v6, Lce3/y;->J:Lce3/x;

    invoke-virtual {v8}, Lne3/d;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_2
    :goto_3
    :try_start_1
    invoke-virtual {v6}, Lce3/y;->g()Lce3/a;

    move-result-object v8

    if-eqz v8, :cond_3

    iget-boolean v8, v1, Lce3/w;->x:Z

    if-nez v8, :cond_3

    iget-object v8, v6, Lce3/y;->M:Ljava/io/IOException;

    if-nez v8, :cond_4

    new-instance v8, Lokhttp3/internal/http2/StreamResetException;

    invoke-virtual {v6}, Lce3/y;->g()Lce3/a;

    move-result-object v11

    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v8, v11}, Lokhttp3/internal/http2/StreamResetException;-><init>(Lce3/a;)V

    goto :goto_4

    :catchall_1
    move-exception v0

    goto/16 :goto_7

    :cond_3
    const/4 v8, 0x0

    :cond_4
    :goto_4
    iget-boolean v11, v1, Lce3/w;->E:Z

    if-nez v11, :cond_c

    iget-object v11, v1, Lce3/w;->z:Lne3/h;

    iget-wide v12, v11, Lne3/h;->x:J

    cmp-long v14, v12, v4

    const-wide/16 v15, -0x1

    if-lez v14, :cond_6

    invoke-static {v2, v3, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    invoke-virtual {v11, v0, v12, v13}, Lne3/h;->h1(Lne3/h;J)J

    move-result-wide v18

    iget-object v9, v6, Lce3/y;->y:Lde3/a;

    const-wide/16 v20, 0x0

    const/16 v22, 0x2

    move-object/from16 v17, v9

    invoke-static/range {v17 .. v22}, Lde3/a;->b(Lde3/a;JJI)V

    iget-object v9, v6, Lce3/y;->y:Lde3/a;

    invoke-virtual {v9}, Lde3/a;->a()J

    move-result-wide v11

    if-nez v8, :cond_5

    iget-object v9, v6, Lce3/y;->x:Lce3/q;

    iget-object v9, v9, Lce3/q;->R:Lce3/d0;

    invoke-virtual {v9}, Lce3/d0;->a()I

    move-result v9

    div-int/lit8 v9, v9, 0x2

    int-to-long v13, v9

    cmp-long v9, v11, v13

    if-ltz v9, :cond_5

    iget-object v9, v6, Lce3/y;->x:Lce3/q;

    iget v13, v6, Lce3/y;->w:I

    invoke-virtual {v9, v13, v11, v12}, Lce3/q;->J(IJ)V

    iget-object v9, v6, Lce3/y;->y:Lde3/a;

    const-wide/16 v21, 0x0

    const/16 v25, 0x1

    move-object/from16 v20, v9

    move-wide/from16 v23, v11

    invoke-static/range {v20 .. v25}, Lde3/a;->b(Lde3/a;JJI)V

    :cond_5
    move v9, v10

    goto :goto_6

    :cond_6
    iget-boolean v11, v1, Lce3/w;->x:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v11, :cond_7

    if-nez v8, :cond_7

    :try_start_2
    invoke-virtual {v6}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_5
    move-wide/from16 v18, v15

    goto :goto_6

    :catch_0
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_7
    move v9, v10

    goto :goto_5

    :goto_6
    if-eqz v7, :cond_8

    :try_start_4
    iget-object v7, v6, Lce3/y;->J:Lce3/x;

    invoke-virtual {v7}, Lce3/x;->l()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_8
    monitor-exit v6

    iget-object v6, v1, Lce3/w;->F:Lce3/y;

    iget-object v6, v6, Lce3/y;->x:Lce3/q;

    iget-object v6, v6, Lce3/q;->Q:Lce3/b;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v9, :cond_9

    goto/16 :goto_0

    :cond_9
    cmp-long v0, v18, v15

    if-eqz v0, :cond_a

    return-wide v18

    :cond_a
    if-nez v8, :cond_b

    return-wide v15

    :cond_b
    throw v8

    :cond_c
    :try_start_5
    new-instance v0, Ljava/io/IOException;

    const-string v2, "stream closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_7
    if-eqz v7, :cond_d

    :try_start_6
    iget-object v2, v6, Lce3/y;->J:Lce3/x;

    invoke-virtual {v2}, Lce3/x;->l()V

    :cond_d
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :goto_8
    monitor-exit v6

    throw v0

    :cond_e
    const-string v0, "byteCount < 0: "

    invoke-static {v2, v3, v0}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    iget-object v0, p0, Lce3/w;->F:Lce3/y;

    iget-object v0, v0, Lce3/y;->J:Lce3/x;

    return-object v0
.end method
