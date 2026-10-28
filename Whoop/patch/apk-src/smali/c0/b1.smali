.class public final Lc0/b1;
.super Lc0/k1;
.source "SourceFile"


# instance fields
.field public P:Ld0/z1;

.field public Q:Ld0/s1;

.field public R:Ld0/s1;

.field public S:Ld0/s1;

.field public T:Lc0/c1;

.field public U:Lc0/e1;

.field public V:Lc93/a;

.field public W:Lc0/r0;

.field public X:J

.field public Y:Lb2/h;

.field public final Z:Lc0/a1;

.field public final a0:Lc0/a1;


# direct methods
.method public constructor <init>(Ld0/z1;Ld0/s1;Ld0/s1;Ld0/s1;Lc0/c1;Lc0/e1;Lc93/a;Lc0/r0;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lc0/k1;-><init>(I)V

    iput-object p1, p0, Lc0/b1;->P:Ld0/z1;

    iput-object p2, p0, Lc0/b1;->Q:Ld0/s1;

    iput-object p3, p0, Lc0/b1;->R:Ld0/s1;

    iput-object p4, p0, Lc0/b1;->S:Ld0/s1;

    iput-object p5, p0, Lc0/b1;->T:Lc0/c1;

    iput-object p6, p0, Lc0/b1;->U:Lc0/e1;

    iput-object p7, p0, Lc0/b1;->V:Lc93/a;

    iput-object p8, p0, Lc0/b1;->W:Lc0/r0;

    sget-wide p1, Landroidx/compose/animation/c;->a:J

    iput-wide p1, p0, Lc0/b1;->X:J

    const/4 p1, 0x0

    const/16 p2, 0xf

    invoke-static {p1, p1, p2}, Ly3/b;->b(III)J

    new-instance p1, Lc0/a1;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lc0/a1;-><init>(Lc0/b1;I)V

    iput-object p1, p0, Lc0/b1;->Z:Lc0/a1;

    new-instance p1, Lc0/a1;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lc0/a1;-><init>(Lc0/b1;I)V

    iput-object p1, p0, Lc0/b1;->a0:Lc0/a1;

    return-void
.end method


# virtual methods
.method public final P0()V
    .locals 2

    sget-wide v0, Landroidx/compose/animation/c;->a:J

    iput-wide v0, p0, Lc0/b1;->X:J

    return-void
.end method

.method public final Z0()Lb2/h;
    .locals 3

    iget-object v0, p0, Lc0/b1;->P:Ld0/z1;

    invoke-virtual {v0}, Ld0/z1;->f()Ld0/t1;

    move-result-object v0

    sget-object v1, Lc0/q0;->w:Lc0/q0;

    sget-object v2, Lc0/q0;->x:Lc0/q0;

    invoke-interface {v0, v1, v2}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lc0/b1;->T:Lc0/c1;

    check-cast v0, Lc0/d1;

    iget-object v0, v0, Lc0/d1;->b:Lc0/u1;

    iget-object v0, v0, Lc0/u1;->c:Lc0/k0;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lc0/k0;->a:Lb2/h;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lc0/b1;->U:Lc0/e1;

    check-cast v0, Lc0/f1;

    iget-object v0, v0, Lc0/f1;->c:Lc0/u1;

    iget-object v0, v0, Lc0/u1;->c:Lc0/k0;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lc0/k0;->a:Lb2/h;

    return-object v0

    :cond_2
    return-object v1

    :cond_3
    iget-object v0, p0, Lc0/b1;->U:Lc0/e1;

    check-cast v0, Lc0/f1;

    iget-object v0, v0, Lc0/f1;->c:Lc0/u1;

    iget-object v0, v0, Lc0/u1;->c:Lc0/k0;

    if-eqz v0, :cond_5

    iget-object v0, v0, Lc0/k0;->a:Lb2/h;

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    return-object v0

    :cond_5
    :goto_1
    iget-object v0, p0, Lc0/b1;->T:Lc0/c1;

    check-cast v0, Lc0/d1;

    iget-object v0, v0, Lc0/d1;->b:Lc0/u1;

    iget-object v0, v0, Lc0/u1;->c:Lc0/k0;

    if-eqz v0, :cond_6

    iget-object v0, v0, Lc0/k0;->a:Lb2/h;

    return-object v0

    :cond_6
    return-object v1
.end method

.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lc0/b1;->P:Ld0/z1;

    iget-object v2, v2, Ld0/z1;->a:Lal/a;

    invoke-virtual {v2}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, v0, Lc0/b1;->P:Ld0/z1;

    iget-object v3, v3, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    iput-object v4, v0, Lc0/b1;->Y:Lb2/h;

    goto :goto_0

    :cond_0
    iget-object v2, v0, Lc0/b1;->Y:Lb2/h;

    if-nez v2, :cond_2

    invoke-virtual {v0}, Lc0/b1;->Z0()Lb2/h;

    move-result-object v2

    if-nez v2, :cond_1

    sget-object v2, Lb2/e;->w:Lb2/m;

    :cond_1
    iput-object v2, v0, Lc0/b1;->Y:Lb2/h;

    :cond_2
    :goto_0
    invoke-interface {v1}, Ly2/r;->A()Z

    move-result v2

    sget-object v3, Lm83/z;->w:Lm83/z;

    const-wide v5, 0xffffffffL

    const/16 v7, 0x20

    if-eqz v2, :cond_3

    invoke-interface/range {p2 .. p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v2

    iget v4, v2, Ly2/j1;->w:I

    iget v8, v2, Ly2/j1;->x:I

    int-to-long v9, v4

    shl-long/2addr v9, v7

    int-to-long v11, v8

    and-long/2addr v11, v5

    or-long v8, v9, v11

    iput-wide v8, v0, Lc0/b1;->X:J

    shr-long v10, v8, v7

    long-to-int v4, v10

    and-long/2addr v5, v8

    long-to-int v5, v5

    new-instance v6, Lc0/x0;

    const/4 v7, 0x0

    invoke-direct {v6, v2, v7}, Lc0/x0;-><init>(Ly2/j1;I)V

    invoke-interface {v1, v4, v5, v3, v6}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v1

    return-object v1

    :cond_3
    iget-object v2, v0, Lc0/b1;->V:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_11

    iget-object v2, v0, Lc0/b1;->W:Lc0/r0;

    iget-object v8, v2, Lc0/r0;->a:Ld0/s1;

    iget-object v9, v2, Lc0/r0;->b:Ld0/s1;

    iget-object v10, v2, Lc0/r0;->c:Ld0/z1;

    iget-object v11, v2, Lc0/r0;->d:Lc0/c1;

    iget-object v12, v2, Lc0/r0;->e:Lc0/e1;

    iget-object v2, v2, Lc0/r0;->f:Ld0/s1;

    if-eqz v8, :cond_4

    new-instance v13, Lc0/s0;

    const/4 v14, 0x0

    invoke-direct {v13, v11, v12, v14}, Lc0/s0;-><init>(Lc0/c1;Lc0/e1;I)V

    new-instance v14, Lc0/s0;

    const/4 v15, 0x1

    invoke-direct {v14, v11, v12, v15}, Lc0/s0;-><init>(Lc0/c1;Lc0/e1;I)V

    invoke-virtual {v8, v13, v14}, Ld0/s1;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ld0/r1;

    move-result-object v8

    goto :goto_1

    :cond_4
    move-object v8, v4

    :goto_1
    if-eqz v9, :cond_5

    new-instance v13, Lc0/s0;

    const/4 v14, 0x2

    invoke-direct {v13, v11, v12, v14}, Lc0/s0;-><init>(Lc0/c1;Lc0/e1;I)V

    new-instance v14, Lc0/s0;

    const/4 v15, 0x3

    invoke-direct {v14, v11, v12, v15}, Lc0/s0;-><init>(Lc0/c1;Lc0/e1;I)V

    invoke-virtual {v9, v13, v14}, Ld0/s1;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ld0/r1;

    move-result-object v9

    goto :goto_2

    :cond_5
    move-object v9, v4

    :goto_2
    iget-object v10, v10, Ld0/z1;->a:Lal/a;

    invoke-virtual {v10}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v10

    sget-object v13, Lc0/q0;->w:Lc0/q0;

    if-ne v10, v13, :cond_8

    move-object v10, v11

    check-cast v10, Lc0/d1;

    iget-object v10, v10, Lc0/d1;->b:Lc0/u1;

    iget-object v10, v10, Lc0/u1;->d:Lc0/l1;

    if-eqz v10, :cond_6

    iget-wide v13, v10, Lc0/l1;->b:J

    new-instance v10, Li2/e1;

    invoke-direct {v10, v13, v14}, Li2/e1;-><init>(J)V

    goto :goto_3

    :cond_6
    move-object v10, v12

    check-cast v10, Lc0/f1;

    iget-object v10, v10, Lc0/f1;->c:Lc0/u1;

    iget-object v10, v10, Lc0/u1;->d:Lc0/l1;

    if-eqz v10, :cond_7

    iget-wide v13, v10, Lc0/l1;->b:J

    new-instance v10, Li2/e1;

    invoke-direct {v10, v13, v14}, Li2/e1;-><init>(J)V

    goto :goto_3

    :cond_7
    move-object v10, v4

    goto :goto_3

    :cond_8
    move-object v10, v12

    check-cast v10, Lc0/f1;

    iget-object v10, v10, Lc0/f1;->c:Lc0/u1;

    iget-object v10, v10, Lc0/u1;->d:Lc0/l1;

    if-eqz v10, :cond_9

    iget-wide v13, v10, Lc0/l1;->b:J

    new-instance v10, Li2/e1;

    invoke-direct {v10, v13, v14}, Li2/e1;-><init>(J)V

    goto :goto_3

    :cond_9
    move-object v10, v11

    check-cast v10, Lc0/d1;

    iget-object v10, v10, Lc0/d1;->b:Lc0/u1;

    iget-object v10, v10, Lc0/u1;->d:Lc0/l1;

    if-eqz v10, :cond_7

    iget-wide v13, v10, Lc0/l1;->b:J

    new-instance v10, Li2/e1;

    invoke-direct {v10, v13, v14}, Li2/e1;-><init>(J)V

    :goto_3
    if-eqz v2, :cond_a

    sget-object v13, Lc0/c;->H:Lc0/c;

    new-instance v14, Lb4/g;

    const/4 v15, 0x1

    invoke-direct {v14, v10, v11, v12, v15}, Lb4/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v2, v13, v14}, Ld0/s1;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ld0/r1;

    move-result-object v2

    goto :goto_4

    :cond_a
    move-object v2, v4

    :goto_4
    new-instance v10, Lc0/h;

    const/4 v11, 0x1

    invoke-direct {v10, v8, v9, v2, v11}, Lc0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface/range {p2 .. p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v11

    iget v2, v11, Ly2/j1;->w:I

    iget v8, v11, Ly2/j1;->x:I

    int-to-long v12, v2

    shl-long/2addr v12, v7

    int-to-long v8, v8

    and-long/2addr v8, v5

    or-long/2addr v8, v12

    iget-wide v12, v0, Lc0/b1;->X:J

    sget-wide v14, Landroidx/compose/animation/c;->a:J

    invoke-static {v12, v13, v14, v15}, Ly3/l;->a(JJ)Z

    move-result v2

    if-nez v2, :cond_b

    iget-wide v12, v0, Lc0/b1;->X:J

    goto :goto_5

    :cond_b
    move-wide v12, v8

    :goto_5
    iget-object v2, v0, Lc0/b1;->Q:Ld0/s1;

    if-eqz v2, :cond_c

    new-instance v4, Lc0/z0;

    const/4 v14, 0x0

    invoke-direct {v4, v0, v12, v13, v14}, Lc0/z0;-><init>(Lc0/b1;JI)V

    iget-object v14, v0, Lc0/b1;->Z:Lc0/a1;

    invoke-virtual {v2, v14, v4}, Ld0/s1;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ld0/r1;

    move-result-object v4

    :cond_c
    if-eqz v4, :cond_d

    invoke-virtual {v4}, Ld0/r1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/l;

    iget-wide v8, v2, Ly3/l;->a:J

    :cond_d
    move-wide/from16 v14, p3

    invoke-static {v14, v15, v8, v9}, Ly3/b;->d(JJ)J

    move-result-wide v17

    iget-object v2, v0, Lc0/b1;->R:Ld0/s1;

    const-wide/16 v8, 0x0

    if-eqz v2, :cond_e

    sget-object v4, Lc0/c;->L:Lc0/c;

    new-instance v14, Lc0/z0;

    const/4 v15, 0x1

    invoke-direct {v14, v0, v12, v13, v15}, Lc0/z0;-><init>(Lc0/b1;JI)V

    invoke-virtual {v2, v4, v14}, Ld0/s1;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ld0/r1;

    move-result-object v2

    invoke-virtual {v2}, Ld0/r1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/j;

    iget-wide v14, v2, Ly3/j;->a:J

    move-wide/from16 v20, v14

    goto :goto_6

    :cond_e
    move-wide/from16 v20, v8

    :goto_6
    iget-object v2, v0, Lc0/b1;->S:Ld0/s1;

    if-eqz v2, :cond_f

    new-instance v4, Lc0/z0;

    const/4 v14, 0x2

    invoke-direct {v4, v0, v12, v13, v14}, Lc0/z0;-><init>(Lc0/b1;JI)V

    iget-object v14, v0, Lc0/b1;->a0:Lc0/a1;

    invoke-virtual {v2, v14, v4}, Ld0/s1;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ld0/r1;

    move-result-object v2

    invoke-virtual {v2}, Ld0/r1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/j;

    iget-wide v14, v2, Ly3/j;->a:J

    goto :goto_7

    :cond_f
    move-wide v14, v8

    :goto_7
    iget-object v2, v0, Lc0/b1;->Y:Lb2/h;

    if-eqz v2, :cond_10

    sget-object v19, Ly3/m;->w:Ly3/m;

    move-wide/from16 v22, v14

    move-wide v15, v12

    move-wide/from16 v12, v22

    move-object v14, v2

    invoke-interface/range {v14 .. v19}, Lb2/h;->a(JJLy3/m;)J

    move-result-wide v8

    goto :goto_8

    :cond_10
    move-wide v12, v14

    :goto_8
    invoke-static {v8, v9, v12, v13}, Ly3/j;->d(JJ)J

    move-result-wide v12

    shr-long v7, v17, v7

    long-to-int v2, v7

    and-long v4, v17, v5

    long-to-int v4, v4

    move-object/from16 v16, v10

    new-instance v10, Lc0/y0;

    move-wide/from16 v14, v20

    invoke-direct/range {v10 .. v16}, Lc0/y0;-><init>(Ly2/j1;JJLc0/h;)V

    invoke-interface {v1, v2, v4, v3, v10}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v1

    return-object v1

    :cond_11
    move-wide/from16 v14, p3

    invoke-interface/range {p2 .. p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v2

    iget v4, v2, Ly2/j1;->w:I

    iget v5, v2, Ly2/j1;->x:I

    new-instance v6, Lc0/x0;

    const/4 v7, 0x1

    invoke-direct {v6, v2, v7}, Lc0/x0;-><init>(Ly2/j1;I)V

    invoke-interface {v1, v4, v5, v3, v6}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v1

    return-object v1
.end method
