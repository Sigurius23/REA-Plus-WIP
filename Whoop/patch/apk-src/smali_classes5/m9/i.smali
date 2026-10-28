.class public final Lm9/i;
.super Lm9/d;
.source "SourceFile"


# instance fields
.field public final J:Lm9/c;

.field public K:Lxl/a;

.field public L:J

.field public volatile M:Z


# direct methods
.method public constructor <init>(Lz8/f;Lz8/g;Lu8/p;ILjava/lang/Object;Lm9/c;)V
    .locals 11

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v3, 0x2

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move v5, p4

    move-object/from16 v6, p5

    invoke-direct/range {v0 .. v10}, Lm9/d;-><init>(Lz8/f;Lz8/g;ILu8/p;ILjava/lang/Object;JJ)V

    move-object/from16 p1, p6

    iput-object p1, p0, Lm9/i;->J:Lm9/c;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 7

    iget-wide v0, p0, Lm9/i;->L:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v1, p0, Lm9/i;->J:Lm9/c;

    iget-object v2, p0, Lm9/i;->K:Lxl/a;

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    invoke-virtual/range {v1 .. v6}, Lm9/c;->a(Lxl/a;JJ)V

    :cond_0
    :try_start_0
    iget-object v0, p0, Lm9/d;->x:Lz8/g;

    iget-wide v1, p0, Lm9/i;->L:J

    invoke-virtual {v0, v1, v2}, Lz8/g;->a(J)Lz8/g;

    move-result-object v0

    new-instance v1, Lt9/k;

    iget-object v2, p0, Lm9/d;->I:Lz8/m;

    iget-wide v3, v0, Lz8/g;->e:J

    invoke-virtual {v2, v0}, Lz8/m;->open(Lz8/g;)J

    move-result-wide v5

    invoke-direct/range {v1 .. v6}, Lt9/k;-><init>(Lu8/h;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    iget-boolean v0, p0, Lm9/i;->M:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lm9/i;->J:Lm9/c;

    iget-object v0, v0, Lm9/c;->w:Lt9/n;

    sget-object v2, Lm9/c;->J:Lt9/s;

    invoke-interface {v0, v1, v2}, Lt9/n;->i(Lt9/o;Lt9/s;)I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_1

    move v4, v3

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    invoke-static {v4}, Lva3/g;->i(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_2

    move v2, v3

    :cond_2
    if-eqz v2, :cond_3

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_3
    :try_start_2
    iget-wide v0, v1, Lt9/k;->z:J

    iget-object v2, p0, Lm9/d;->x:Lz8/g;

    iget-wide v2, v2, Lz8/g;->e:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lm9/i;->L:J

    iget-object v0, p0, Lm9/i;->J:Lm9/c;

    iget-object v0, v0, Lm9/c;->H:Lt9/e0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v0, p0, Lm9/d;->I:Lz8/m;

    invoke-static {v0}, Lrv/n;->e(Lz8/f;)V

    return-void

    :catchall_1
    move-exception v0

    goto :goto_3

    :goto_2
    :try_start_3
    iget-wide v1, v1, Lt9/k;->z:J

    iget-object v3, p0, Lm9/d;->x:Lz8/g;

    iget-wide v3, v3, Lz8/g;->e:J

    sub-long/2addr v1, v3

    iput-wide v1, p0, Lm9/i;->L:J

    iget-object v1, p0, Lm9/i;->J:Lm9/c;

    iget-object v1, v1, Lm9/c;->H:Lt9/e0;

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_3
    iget-object v1, p0, Lm9/d;->I:Lz8/m;

    invoke-static {v1}, Lrv/n;->e(Lz8/f;)V

    throw v0
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm9/i;->M:Z

    return-void
.end method
