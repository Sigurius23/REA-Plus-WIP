.class public final Lf0/n;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/r;
.implements La3/w1;
.implements La3/j2;


# instance fields
.field public O:J

.field public P:Li2/t;

.field public Q:F

.field public R:Li2/a1;

.field public S:J

.field public T:Ly3/m;

.field public U:Li2/p0;

.field public V:Li2/a1;

.field public W:Li2/p0;


# virtual methods
.method public final C()V
    .locals 2

    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    iput-wide v0, p0, Lf0/n;->S:J

    const/4 v0, 0x0

    iput-object v0, p0, Lf0/n;->T:Ly3/m;

    iput-object v0, p0, Lf0/n;->U:Li2/p0;

    iput-object v0, p0, Lf0/n;->V:Li2/a1;

    invoke-static {p0}, La3/g;->h(La3/r;)V

    return-void
.end method

.method public final O(La3/p0;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v1, La3/p0;->w:Lk2/b;

    iget-object v3, v0, Lf0/n;->R:Li2/a1;

    sget-object v4, Li2/w0;->a:Li2/v0;

    if-ne v3, v4, :cond_2

    iget-wide v2, v0, Lf0/n;->O:J

    sget-wide v4, Li2/x;->n:J

    invoke-static {v2, v3, v4, v5}, Li2/x;->d(JJ)Z

    move-result v2

    if-nez v2, :cond_0

    iget-wide v2, v0, Lf0/n;->O:J

    const/4 v10, 0x0

    const/16 v11, 0x7e

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v11}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    :cond_0
    iget-object v2, v0, Lf0/n;->P:Li2/t;

    if-eqz v2, :cond_1

    iget v7, v0, Lf0/n;->Q:F

    const/4 v9, 0x0

    const/16 v10, 0x76

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v8, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v10}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    goto/16 :goto_2

    :cond_1
    move-object/from16 v1, p1

    goto/16 :goto_2

    :cond_2
    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v3

    iget-wide v5, v0, Lf0/n;->S:J

    invoke-static {v3, v4, v5, v6}, Lh2/e;->b(JJ)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v1}, La3/p0;->getLayoutDirection()Ly3/m;

    move-result-object v3

    iget-object v4, v0, Lf0/n;->T:Ly3/m;

    if-ne v3, v4, :cond_3

    iget-object v3, v0, Lf0/n;->V:Li2/a1;

    iget-object v4, v0, Lf0/n;->R:Li2/a1;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, v0, Lf0/n;->U:Li2/p0;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    new-instance v3, La11/l;

    const/16 v4, 0x11

    invoke-direct {v3, v4, v0, v1}, La11/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v3}, La3/g;->l(Lb2/v;Lc93/a;)V

    iget-object v3, v0, Lf0/n;->W:Li2/p0;

    const/4 v4, 0x0

    iput-object v4, v0, Lf0/n;->W:Li2/p0;

    :goto_0
    iput-object v3, v0, Lf0/n;->U:Li2/p0;

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v4

    iput-wide v4, v0, Lf0/n;->S:J

    invoke-virtual {v1}, La3/p0;->getLayoutDirection()Ly3/m;

    move-result-object v2

    iput-object v2, v0, Lf0/n;->T:Ly3/m;

    iget-object v2, v0, Lf0/n;->R:Li2/a1;

    iput-object v2, v0, Lf0/n;->V:Li2/a1;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-wide v4, v0, Lf0/n;->O:J

    sget-wide v6, Li2/x;->n:J

    invoke-static {v4, v5, v6, v7}, Li2/x;->d(JJ)Z

    move-result v2

    if-nez v2, :cond_4

    iget-wide v4, v0, Lf0/n;->O:J

    invoke-static {v1, v3, v4, v5}, Li2/w0;->q(Lk2/e;Li2/p0;J)V

    :cond_4
    iget-object v2, v0, Lf0/n;->P:Li2/t;

    if-eqz v2, :cond_9

    iget v4, v0, Lf0/n;->Q:F

    instance-of v5, v3, Li2/n0;

    const-wide v7, 0xffffffffL

    const/16 v9, 0x20

    sget-object v10, Lk2/h;->a:Lk2/h;

    const/4 v6, 0x3

    if-eqz v5, :cond_5

    check-cast v3, Li2/n0;

    iget-object v3, v3, Li2/n0;->a:Lh2/c;

    iget v5, v3, Lh2/c;->a:F

    iget v11, v3, Lh2/c;->b:F

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v12, v5

    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v14, v5

    shl-long v11, v12, v9

    and-long/2addr v7, v14

    or-long/2addr v7, v11

    invoke-static {v3}, Li2/w0;->C(Lh2/c;)J

    move-result-wide v11

    move-wide/from16 v18, v7

    move v7, v4

    move-wide/from16 v3, v18

    move v9, v6

    move-object v8, v10

    move-wide v5, v11

    invoke-virtual/range {v1 .. v9}, La3/p0;->a0(Li2/t;JJFLk2/f;I)V

    goto/16 :goto_2

    :cond_5
    move-object v5, v10

    instance-of v1, v3, Li2/o0;

    if-eqz v1, :cond_7

    move-object v10, v3

    check-cast v10, Li2/o0;

    move-object v3, v2

    iget-object v2, v10, Li2/o0;->b:Li2/j;

    if-eqz v2, :cond_6

    :goto_1
    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, La3/p0;->B(Li2/s0;Li2/t;FLk2/f;I)V

    goto :goto_2

    :cond_6
    move-object v2, v3

    iget-object v1, v10, Li2/o0;->a:Lh2/d;

    iget-wide v10, v1, Lh2/d;->h:J

    shr-long/2addr v10, v9

    long-to-int v3, v10

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    iget v6, v1, Lh2/d;->a:F

    iget v10, v1, Lh2/d;->b:F

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v11, v6

    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v13, v6

    shl-long v10, v11, v9

    and-long v12, v13, v7

    or-long/2addr v10, v12

    invoke-virtual {v1}, Lh2/d;->b()F

    move-result v6

    invoke-virtual {v1}, Lh2/d;->a()F

    move-result v1

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v12, v6

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v14, v1

    shl-long/2addr v12, v9

    and-long/2addr v14, v7

    or-long/2addr v12, v14

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v14, v1

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    move-wide/from16 v16, v7

    int-to-long v7, v1

    shl-long/2addr v14, v9

    and-long v6, v7, v16

    or-long v7, v14, v6

    move-object/from16 v1, p1

    move v9, v4

    move-wide v3, v10

    move-object v10, v5

    move-wide v5, v12

    invoke-virtual/range {v1 .. v10}, La3/p0;->m(Li2/t;JJJFLk2/f;)V

    goto :goto_2

    :cond_7
    instance-of v1, v3, Li2/m0;

    if-eqz v1, :cond_8

    check-cast v3, Li2/m0;

    iget-object v1, v3, Li2/m0;->a:Li2/s0;

    move-object v3, v2

    move-object v2, v1

    goto :goto_1

    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_9
    :goto_2
    invoke-virtual/range {p1 .. p1}, La3/p0;->a()V

    return-void
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final n(Li3/z;)V
    .locals 0

    return-void
.end method
