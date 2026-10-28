.class public final Lc0/q1;
.super Lc0/k1;
.source "SourceFile"


# instance fields
.field public P:Ld0/l;

.field public Q:J

.field public R:J

.field public S:Z

.field public final T:Lp1/k1;


# direct methods
.method public constructor <init>(Ld0/l;)V
    .locals 2

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lc0/k1;-><init>(I)V

    iput-object p1, p0, Lc0/q1;->P:Ld0/l;

    sget-wide v0, Landroidx/compose/animation/c;->a:J

    iput-wide v0, p0, Lc0/q1;->Q:J

    const/4 p1, 0x0

    const/16 v0, 0xf

    invoke-static {p1, p1, v0}, Ly3/b;->b(III)J

    move-result-wide v0

    iput-wide v0, p0, Lc0/q1;->R:J

    const/4 p1, 0x0

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lc0/q1;->T:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final P0()V
    .locals 2

    sget-wide v0, Landroidx/compose/animation/c;->a:J

    iput-wide v0, p0, Lc0/q1;->Q:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc0/q1;->S:Z

    return-void
.end method

.method public final R0()V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lc0/q1;->T:Lp1/k1;

    invoke-virtual {v1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 20

    move-object/from16 v1, p0

    move-wide/from16 v6, p3

    invoke-interface/range {p1 .. p1}, Ly2/r;->A()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iput-wide v6, v1, Lc0/q1;->R:J

    iput-boolean v2, v1, Lc0/q1;->S:Z

    invoke-interface/range {p2 .. p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v0

    :goto_0
    move-object v8, v0

    goto :goto_3

    :cond_0
    iget-boolean v0, v1, Lc0/q1;->S:Z

    if-eqz v0, :cond_1

    iget-wide v3, v1, Lc0/q1;->R:J

    :goto_1
    move-object/from16 v0, p2

    goto :goto_2

    :cond_1
    move-wide v3, v6

    goto :goto_1

    :goto_2
    invoke-interface {v0, v3, v4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v0

    goto :goto_0

    :goto_3
    iget v0, v8, Ly2/j1;->w:I

    iget v3, v8, Ly2/j1;->x:I

    int-to-long v4, v0

    const/16 v9, 0x20

    shl-long/2addr v4, v9

    int-to-long v10, v3

    const-wide v12, 0xffffffffL

    and-long/2addr v10, v12

    or-long/2addr v10, v4

    invoke-interface/range {p1 .. p1}, Ly2/r;->A()Z

    move-result v0

    if-eqz v0, :cond_2

    iput-wide v10, v1, Lc0/q1;->Q:J

    move/from16 p2, v9

    move-wide v0, v10

    move-wide/from16 v16, v0

    goto/16 :goto_9

    :cond_2
    iget-wide v3, v1, Lc0/q1;->Q:J

    sget-wide v14, Landroidx/compose/animation/c;->a:J

    invoke-static {v3, v4, v14, v15}, Ly3/l;->a(JJ)Z

    move-result v0

    if-nez v0, :cond_3

    iget-wide v3, v1, Lc0/q1;->Q:J

    goto :goto_4

    :cond_3
    move-wide v3, v10

    :goto_4
    iget-object v14, v1, Lc0/q1;->T:Lp1/k1;

    invoke-virtual {v14}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc0/n1;

    if-eqz v0, :cond_7

    iget-object v5, v0, Lc0/n1;->a:Ld0/e;

    invoke-virtual {v5}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ly3/l;

    move/from16 p2, v9

    move-wide/from16 v16, v10

    iget-wide v9, v15, Ly3/l;->a:J

    invoke-static {v3, v4, v9, v10}, Ly3/l;->a(JJ)Z

    move-result v9

    if-nez v9, :cond_4

    invoke-virtual {v5}, Ld0/e;->f()Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_5

    :cond_4
    const/4 v2, 0x0

    :goto_5
    iget-object v9, v5, Ld0/e;->e:Lp1/k1;

    invoke-virtual {v9}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly3/l;

    iget-wide v9, v9, Ly3/l;->a:J

    invoke-static {v3, v4, v9, v10}, Ly3/l;->a(JJ)Z

    move-result v9

    if-eqz v9, :cond_6

    if-eqz v2, :cond_5

    goto :goto_6

    :cond_5
    move-object v1, v0

    goto :goto_7

    :cond_6
    :goto_6
    invoke-virtual {v5}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/l;

    iget-wide v9, v2, Ly3/l;->a:J

    iput-wide v9, v0, Lc0/n1;->b:J

    invoke-virtual {v1}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v9

    move-object v1, v0

    new-instance v0, Lc0/o1;

    const/4 v5, 0x0

    move-wide v2, v3

    move-object/from16 v4, p0

    invoke-direct/range {v0 .. v5}, Lc0/o1;-><init>(Lc0/n1;JLc0/q1;Lq83/d;)V

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {v9, v3, v3, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_7
    move-object v0, v1

    goto :goto_8

    :cond_7
    move/from16 p2, v9

    move-wide/from16 v16, v10

    new-instance v0, Lc0/n1;

    new-instance v1, Ld0/e;

    new-instance v5, Ly3/l;

    invoke-direct {v5, v3, v4}, Ly3/l;-><init>(J)V

    sget-object v9, Ld0/f;->p:Ld0/f2;

    int-to-long v10, v2

    shl-long v18, v10, p2

    and-long/2addr v10, v12

    or-long v10, v18, v10

    new-instance v2, Ly3/l;

    invoke-direct {v2, v10, v11}, Ly3/l;-><init>(J)V

    const/16 v10, 0x8

    invoke-direct {v1, v5, v9, v2, v10}, Ld0/e;-><init>(Ljava/lang/Object;Ld0/f2;Ljava/lang/Object;I)V

    invoke-direct {v0, v1, v3, v4}, Lc0/n1;-><init>(Ld0/e;J)V

    :goto_8
    invoke-virtual {v14, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, v0, Lc0/n1;->a:Ld0/e;

    invoke-virtual {v0}, Ld0/e;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/l;

    iget-wide v0, v0, Ly3/l;->a:J

    invoke-static {v6, v7, v0, v1}, Ly3/b;->d(JJ)J

    move-result-wide v0

    :goto_9
    shr-long v2, v0, p2

    long-to-int v4, v2

    and-long/2addr v0, v12

    long-to-int v5, v0

    new-instance v0, Lc0/p1;

    move-object/from16 v1, p0

    move-object/from16 v6, p1

    move-object v7, v8

    move-wide/from16 v2, v16

    invoke-direct/range {v0 .. v7}, Lc0/p1;-><init>(Lc0/q1;JIILy2/t0;Ly2/j1;)V

    sget-object v1, Lm83/z;->w:Lm83/z;

    invoke-interface {v6, v4, v5, v1, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v0

    return-object v0
.end method
