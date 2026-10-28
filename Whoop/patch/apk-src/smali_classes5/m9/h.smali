.class public final Lm9/h;
.super Lm9/a;
.source "SourceFile"


# instance fields
.field public final O:I

.field public final P:J

.field public final Q:Lm9/c;

.field public R:J

.field public volatile S:Z

.field public T:Z


# direct methods
.method public constructor <init>(Lz8/f;Lz8/g;Lu8/p;ILjava/lang/Object;JJJJJIJLm9/c;)V
    .locals 0

    invoke-direct/range {p0 .. p15}, Lm9/a;-><init>(Lz8/f;Lz8/g;Lu8/p;ILjava/lang/Object;JJJJJ)V

    move/from16 p1, p16

    iput p1, p0, Lm9/h;->O:I

    move-wide/from16 p1, p17

    iput-wide p1, p0, Lm9/h;->P:J

    move-object/from16 p1, p19

    iput-object p1, p0, Lm9/h;->Q:Lm9/c;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 18

    move-object/from16 v1, p0

    iget-object v3, v1, Lm9/a;->M:Lxl/a;

    invoke-static {v3}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-wide v4, v1, Lm9/h;->R:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-nez v0, :cond_4

    iget-wide v4, v1, Lm9/h;->P:J

    iget-object v0, v3, Lxl/a;->y:Ljava/lang/Object;

    check-cast v0, [Ll9/y0;

    array-length v2, v0

    move v6, v8

    :goto_0
    if-ge v6, v2, :cond_1

    aget-object v7, v0, v6

    iget-wide v10, v7, Ll9/y0;->E:J

    cmp-long v10, v10, v4

    if-eqz v10, :cond_0

    iput-wide v4, v7, Ll9/y0;->E:J

    iput-boolean v9, v7, Ll9/y0;->z:Z

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, v1, Lm9/h;->Q:Lm9/c;

    iget-wide v4, v1, Lm9/a;->K:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    move-wide v4, v6

    goto :goto_1

    :cond_2
    iget-wide v10, v1, Lm9/h;->P:J

    sub-long/2addr v4, v10

    :goto_1
    iget-wide v10, v1, Lm9/a;->L:J

    cmp-long v0, v10, v6

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    iget-wide v6, v1, Lm9/h;->P:J

    sub-long v6, v10, v6

    :goto_2
    invoke-virtual/range {v2 .. v7}, Lm9/c;->a(Lxl/a;JJ)V

    :cond_4
    :try_start_0
    iget-object v0, v1, Lm9/d;->x:Lz8/g;

    iget-wide v4, v1, Lm9/h;->R:J

    invoke-virtual {v0, v4, v5}, Lz8/g;->a(J)Lz8/g;

    move-result-object v0

    new-instance v10, Lt9/k;

    iget-object v11, v1, Lm9/d;->I:Lz8/m;

    iget-wide v12, v0, Lz8/g;->e:J

    invoke-virtual {v11, v0}, Lz8/m;->open(Lz8/g;)J

    move-result-wide v14

    invoke-direct/range {v10 .. v15}, Lt9/k;-><init>(Lu8/h;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_3
    :try_start_1
    iget-boolean v0, v1, Lm9/h;->S:Z

    if-nez v0, :cond_7

    iget-object v0, v1, Lm9/h;->Q:Lm9/c;

    iget-object v0, v0, Lm9/c;->w:Lt9/n;

    sget-object v2, Lm9/c;->J:Lt9/s;

    invoke-interface {v0, v10, v2}, Lt9/n;->i(Lt9/o;Lt9/s;)I

    move-result v0

    if-eq v0, v9, :cond_5

    move v2, v9

    goto :goto_4

    :cond_5
    move v2, v8

    :goto_4
    invoke-static {v2}, Lva3/g;->i(Z)V

    if-nez v0, :cond_6

    move v0, v9

    goto :goto_5

    :cond_6
    move v0, v8

    :goto_5
    if-eqz v0, :cond_7

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_8

    :cond_7
    iget-object v0, v1, Lm9/d;->z:Lu8/p;

    iget-object v2, v0, Lu8/p;->m:Ljava/lang/String;

    iget v4, v0, Lu8/p;->K:I

    iget v0, v0, Lu8/p;->L:I

    invoke-static {v2}, Lu8/d0;->l(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_7

    :cond_8
    if-gt v4, v9, :cond_9

    if-le v0, v9, :cond_b

    :cond_9
    const/4 v2, -0x1

    if-eq v4, v2, :cond_b

    if-ne v0, v2, :cond_a

    goto :goto_7

    :cond_a
    const/4 v2, 0x4

    invoke-virtual {v3, v2}, Lxl/a;->F(I)Lt9/k0;

    move-result-object v11

    mul-int/2addr v4, v0

    iget-wide v2, v1, Lm9/d;->H:J

    iget-wide v5, v1, Lm9/d;->G:J

    sub-long/2addr v2, v5

    int-to-long v5, v4

    div-long/2addr v2, v5

    move v0, v9

    :goto_6
    if-ge v0, v4, :cond_b

    int-to-long v5, v0

    mul-long v12, v5, v2

    new-instance v5, Lx8/n;

    invoke-direct {v5}, Lx8/n;-><init>()V

    invoke-interface {v11, v5, v8, v8}, Lt9/k0;->d(Lx8/n;II)V

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-interface/range {v11 .. v17}, Lt9/k0;->b(JIIILt9/j0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_b
    :goto_7
    :try_start_2
    iget-wide v2, v10, Lt9/k;->z:J

    iget-object v0, v1, Lm9/d;->x:Lz8/g;

    iget-wide v4, v0, Lz8/g;->e:J

    sub-long/2addr v2, v4

    iput-wide v2, v1, Lm9/h;->R:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v0, v1, Lm9/d;->I:Lz8/m;

    invoke-static {v0}, Lrv/n;->e(Lz8/f;)V

    iget-boolean v0, v1, Lm9/h;->S:Z

    xor-int/2addr v0, v9

    iput-boolean v0, v1, Lm9/h;->T:Z

    return-void

    :catchall_1
    move-exception v0

    goto :goto_9

    :goto_8
    :try_start_3
    iget-wide v2, v10, Lt9/k;->z:J

    iget-object v4, v1, Lm9/d;->x:Lz8/g;

    iget-wide v4, v4, Lz8/g;->e:J

    sub-long/2addr v2, v4

    iput-wide v2, v1, Lm9/h;->R:J

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_9
    iget-object v2, v1, Lm9/d;->I:Lz8/m;

    invoke-static {v2}, Lrv/n;->e(Lz8/f;)V

    throw v0
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm9/h;->S:Z

    return-void
.end method

.method public final d()J
    .locals 4

    iget v0, p0, Lm9/h;->O:I

    int-to-long v0, v0

    iget-wide v2, p0, Lm9/a;->J:J

    add-long/2addr v2, v0

    return-wide v2
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lm9/h;->T:Z

    return v0
.end method
