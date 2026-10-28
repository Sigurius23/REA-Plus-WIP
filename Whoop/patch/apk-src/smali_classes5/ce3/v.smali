.class public final Lce3/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/n0;


# instance fields
.field public final w:Z

.field public final x:Lne3/h;

.field public y:Z

.field public final synthetic z:Lce3/y;


# direct methods
.method public constructor <init>(Lce3/y;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce3/v;->z:Lce3/y;

    iput-boolean p2, p0, Lce3/v;->w:Z

    new-instance p1, Lne3/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce3/v;->x:Lne3/h;

    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 12

    iget-object v1, p0, Lce3/v;->z:Lce3/y;

    monitor-enter v1

    :try_start_0
    iget-object v0, v1, Lce3/y;->K:Lce3/x;

    invoke-virtual {v0}, Lne3/d;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    iget-wide v2, v1, Lce3/y;->z:J

    iget-wide v4, v1, Lce3/y;->E:J

    cmp-long v0, v2, v4

    if-ltz v0, :cond_0

    iget-boolean v0, p0, Lce3/v;->w:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lce3/v;->y:Z

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lce3/y;->g()Lce3/a;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_0

    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_0
    :try_start_4
    iget-object v0, v1, Lce3/y;->K:Lce3/x;

    invoke-virtual {v0}, Lce3/x;->l()V

    invoke-virtual {v1}, Lce3/y;->b()V

    iget-wide v2, v1, Lce3/y;->E:J

    iget-wide v4, v1, Lce3/y;->z:J

    sub-long/2addr v2, v4

    iget-object v0, p0, Lce3/v;->x:Lne3/h;

    iget-wide v4, v0, Lne3/h;->x:J

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    iget-wide v2, v1, Lce3/y;->z:J

    add-long/2addr v2, v10

    iput-wide v2, v1, Lce3/y;->z:J

    if-eqz p1, :cond_1

    iget-object p1, p0, Lce3/v;->x:Lne3/h;

    iget-wide v2, p1, Lne3/h;->x:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    cmp-long p1, v10, v2

    if-nez p1, :cond_1

    const/4 p1, 0x1

    :goto_1
    move v8, p1

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object p1, v0

    goto :goto_4

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    monitor-exit v1

    iget-object p1, p0, Lce3/v;->z:Lce3/y;

    iget-object p1, p1, Lce3/y;->K:Lce3/x;

    invoke-virtual {p1}, Lne3/d;->i()V

    :try_start_5
    iget-object p1, p0, Lce3/v;->z:Lce3/y;

    iget-object v6, p1, Lce3/y;->x:Lce3/q;

    iget v7, p1, Lce3/y;->w:I

    iget-object v9, p0, Lce3/v;->x:Lne3/h;

    invoke-virtual/range {v6 .. v11}, Lce3/q;->s(IZLne3/h;J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    iget-object p1, p0, Lce3/v;->z:Lce3/y;

    iget-object p1, p1, Lce3/y;->K:Lce3/x;

    invoke-virtual {p1}, Lce3/x;->l()V

    return-void

    :catchall_2
    move-exception v0

    move-object p1, v0

    iget-object v0, p0, Lce3/v;->z:Lce3/y;

    iget-object v0, v0, Lce3/y;->K:Lce3/x;

    invoke-virtual {v0}, Lce3/x;->l()V

    throw p1

    :goto_3
    :try_start_6
    iget-object v0, v1, Lce3/y;->K:Lce3/x;

    invoke-virtual {v0}, Lce3/x;->l()V

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_4
    monitor-exit v1

    throw p1
.end method

.method public final close()V
    .locals 13

    iget-object v1, p0, Lce3/v;->z:Lce3/y;

    sget-object v0, Lwd3/h;->a:Ljava/util/TimeZone;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lce3/v;->y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_0

    monitor-exit v1

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {v1}, Lce3/y;->g()Lce3/a;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v2, 0x1

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    monitor-exit v1

    iget-object v1, p0, Lce3/v;->z:Lce3/y;

    iget-object v3, v1, Lce3/y;->I:Lce3/v;

    iget-boolean v3, v3, Lce3/v;->w:Z

    if-nez v3, :cond_3

    iget-object v3, p0, Lce3/v;->x:Lne3/h;

    iget-wide v3, v3, Lne3/h;->x:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-lez v3, :cond_2

    :goto_1
    iget-object v0, p0, Lce3/v;->x:Lne3/h;

    iget-wide v0, v0, Lne3/h;->x:J

    cmp-long v0, v0, v5

    if-lez v0, :cond_3

    invoke-virtual {p0, v2}, Lce3/v;->b(Z)V

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    iget-object v7, v1, Lce3/y;->x:Lce3/q;

    iget v8, v1, Lce3/y;->w:I

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v9, 0x1

    invoke-virtual/range {v7 .. v12}, Lce3/q;->s(IZLne3/h;J)V

    :cond_3
    iget-object v1, p0, Lce3/v;->z:Lce3/y;

    monitor-enter v1

    :try_start_2
    iput-boolean v2, p0, Lce3/v;->y:Z

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    iget-object v0, p0, Lce3/v;->z:Lce3/y;

    iget-object v0, v0, Lce3/y;->x:Lce3/q;

    iget-object v0, v0, Lce3/q;->X:Lce3/z;

    invoke-virtual {v0}, Lce3/z;->flush()V

    iget-object v0, p0, Lce3/v;->z:Lce3/y;

    invoke-virtual {v0}, Lce3/y;->a()V

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method public final flush()V
    .locals 4

    iget-object v0, p0, Lce3/v;->z:Lce3/y;

    sget-object v1, Lwd3/h;->a:Ljava/util/TimeZone;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, Lce3/y;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    :goto_0
    iget-object v0, p0, Lce3/v;->x:Lne3/h;

    iget-wide v0, v0, Lne3/h;->x:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lce3/v;->b(Z)V

    iget-object v0, p0, Lce3/v;->z:Lce3/y;

    iget-object v0, v0, Lce3/y;->x:Lce3/q;

    iget-object v0, v0, Lce3/q;->X:Lce3/z;

    invoke-virtual {v0}, Lce3/z;->flush()V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    iget-object v0, p0, Lce3/v;->z:Lce3/y;

    iget-object v0, v0, Lce3/y;->K:Lce3/x;

    return-object v0
.end method

.method public final write(Lne3/h;J)V
    .locals 3

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lwd3/h;->a:Ljava/util/TimeZone;

    iget-object v0, p0, Lce3/v;->x:Lne3/h;

    invoke-virtual {v0, p1, p2, p3}, Lne3/h;->write(Lne3/h;J)V

    :goto_0
    iget-wide p1, v0, Lne3/h;->x:J

    const-wide/16 v1, 0x4000

    cmp-long p1, p1, v1

    if-ltz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lce3/v;->b(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method
