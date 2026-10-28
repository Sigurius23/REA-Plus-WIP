.class public final Lm9/k;
.super Lm9/a;
.source "SourceFile"


# instance fields
.field public final O:I

.field public final P:Lu8/p;

.field public Q:J

.field public R:Z


# direct methods
.method public constructor <init>(Lz8/f;Lz8/g;Lu8/p;ILjava/lang/Object;JJJILu8/p;)V
    .locals 16

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-wide/from16 v6, p6

    move-wide/from16 v8, p8

    move-wide/from16 v14, p10

    invoke-direct/range {v0 .. v15}, Lm9/a;-><init>(Lz8/f;Lz8/g;Lu8/p;ILjava/lang/Object;JJJJJ)V

    move/from16 v1, p12

    iput v1, v0, Lm9/k;->O:I

    move-object/from16 v1, p13

    iput-object v1, v0, Lm9/k;->P:Lu8/p;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 14

    iget-object v1, p0, Lm9/d;->I:Lz8/m;

    iget-object v0, p0, Lm9/a;->M:Lxl/a;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v2, v0, Lxl/a;->y:Ljava/lang/Object;

    check-cast v2, [Ll9/y0;

    array-length v3, v2

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    const/4 v6, 0x1

    if-ge v5, v3, :cond_1

    aget-object v7, v2, v5

    iget-wide v8, v7, Ll9/y0;->E:J

    const-wide/16 v10, 0x0

    cmp-long v8, v8, v10

    if-eqz v8, :cond_0

    iput-wide v10, v7, Ll9/y0;->E:J

    iput-boolean v6, v7, Ll9/y0;->z:Z

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    iget v2, p0, Lm9/k;->O:I

    invoke-virtual {v0, v2}, Lxl/a;->F(I)Lt9/k0;

    move-result-object v7

    iget-object v0, p0, Lm9/k;->P:Lu8/p;

    invoke-interface {v7, v0}, Lt9/k0;->a(Lu8/p;)V

    :try_start_0
    iget-object v0, p0, Lm9/d;->x:Lz8/g;

    iget-wide v2, p0, Lm9/k;->Q:J

    invoke-virtual {v0, v2, v3}, Lz8/g;->a(J)Lz8/g;

    move-result-object v0

    invoke-virtual {v1, v0}, Lz8/m;->open(Lz8/g;)J

    move-result-wide v2

    const-wide/16 v8, -0x1

    cmp-long v0, v2, v8

    if-eqz v0, :cond_2

    iget-wide v8, p0, Lm9/k;->Q:J

    add-long/2addr v2, v8

    :cond_2
    move-wide v12, v2

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :goto_1
    new-instance v8, Lt9/k;

    iget-object v9, p0, Lm9/d;->I:Lz8/m;

    iget-wide v10, p0, Lm9/k;->Q:J

    invoke-direct/range {v8 .. v13}, Lt9/k;-><init>(Lu8/h;JJ)V

    :goto_2
    const/4 v0, -0x1

    if-eq v4, v0, :cond_3

    iget-wide v2, p0, Lm9/k;->Q:J

    int-to-long v4, v4

    add-long/2addr v2, v4

    iput-wide v2, p0, Lm9/k;->Q:J

    const v0, 0x7fffffff

    invoke-interface {v7, v8, v0, v6}, Lt9/k0;->c(Lu8/h;IZ)I

    move-result v4

    goto :goto_2

    :cond_3
    iget-wide v2, p0, Lm9/k;->Q:J

    long-to-int v11, v2

    iget-wide v8, p0, Lm9/d;->G:J

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v10, 0x1

    invoke-interface/range {v7 .. v13}, Lt9/k0;->b(JIIILt9/j0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1}, Lrv/n;->e(Lz8/f;)V

    iput-boolean v6, p0, Lm9/k;->R:Z

    return-void

    :goto_3
    invoke-static {v1}, Lrv/n;->e(Lz8/f;)V

    throw v0
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lm9/k;->R:Z

    return v0
.end method
