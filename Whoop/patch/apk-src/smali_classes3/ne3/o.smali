.class public final Lne3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/p0;


# instance fields
.field public final w:Lne3/z;

.field public x:J

.field public y:Z


# direct methods
.method public constructor <init>(Lne3/z;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lne3/o;->w:Lne3/z;

    iput-wide p2, p0, Lne3/o;->x:J

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    iget-object v0, p0, Lne3/o;->w:Lne3/z;

    iget-boolean v1, p0, Lne3/o;->y:Z

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lne3/o;->y:Z

    iget-object v1, v0, Lne3/z;->z:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget v2, v0, Lne3/z;->y:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v0, Lne3/z;->y:I

    if-nez v2, :cond_2

    iget-boolean v2, v0, Lne3/z;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    monitor-enter v0

    :try_start_1
    iget-object v1, v0, Lne3/z;->E:Ljava/io/RandomAccessFile;

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    :catchall_1
    move-exception v0

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :goto_1
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0
.end method

.method public final h1(Lne3/h;J)J
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v2, p2

    const-string v4, "sink"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v4, v0, Lne3/o;->y:Z

    if-nez v4, :cond_6

    iget-wide v4, v0, Lne3/o;->x:J

    const-wide/16 v6, 0x0

    cmp-long v6, v2, v6

    if-ltz v6, :cond_5

    add-long/2addr v2, v4

    move-wide v7, v4

    :goto_0
    cmp-long v6, v7, v2

    if-gez v6, :cond_2

    const/4 v6, 0x1

    invoke-virtual {v1, v6}, Lne3/h;->k1(I)Lne3/k0;

    move-result-object v14

    iget-object v9, v14, Lne3/k0;->a:[B

    iget v10, v14, Lne3/k0;->c:I

    const-wide/16 p2, -0x1

    sub-long v12, v2, v7

    rsub-int v6, v10, 0x2000

    move-wide v15, v2

    int-to-long v2, v6

    invoke-static {v12, v13, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v11, v2

    iget-object v6, v0, Lne3/o;->w:Lne3/z;

    invoke-virtual/range {v6 .. v11}, Lne3/z;->b(J[BII)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    iget v2, v14, Lne3/k0;->b:I

    iget v3, v14, Lne3/k0;->c:I

    if-ne v2, v3, :cond_0

    invoke-virtual {v14}, Lne3/k0;->a()Lne3/k0;

    move-result-object v2

    iput-object v2, v1, Lne3/h;->w:Lne3/k0;

    invoke-static {v14}, Lne3/l0;->a(Lne3/k0;)V

    :cond_0
    cmp-long v1, v4, v7

    if-nez v1, :cond_3

    move-wide/from16 v7, p2

    goto :goto_1

    :cond_1
    iget v3, v14, Lne3/k0;->c:I

    add-int/2addr v3, v2

    iput v3, v14, Lne3/k0;->c:I

    int-to-long v2, v2

    add-long/2addr v7, v2

    iget-wide v9, v1, Lne3/h;->x:J

    add-long/2addr v9, v2

    iput-wide v9, v1, Lne3/h;->x:J

    move-wide v2, v15

    goto :goto_0

    :cond_2
    const-wide/16 p2, -0x1

    :cond_3
    sub-long/2addr v7, v4

    :goto_1
    cmp-long v1, v7, p2

    if-eqz v1, :cond_4

    iget-wide v1, v0, Lne3/o;->x:J

    add-long/2addr v1, v7

    iput-wide v1, v0, Lne3/o;->x:J

    :cond_4
    return-wide v7

    :cond_5
    const-string v1, "byteCount < 0: "

    invoke-static {v2, v3, v1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_6
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    sget-object v0, Lne3/r0;->d:Lne3/q0;

    return-object v0
.end method
