.class public final La3/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk2/e;
.implements Lk2/c;


# instance fields
.field public final w:Lk2/b;

.field public x:La3/r;


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lk2/b;

    invoke-direct {v0}, Lk2/b;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La3/p0;->w:Lk2/b;

    return-void
.end method


# virtual methods
.method public final B(Li2/s0;Li2/t;FLk2/f;I)V
    .locals 6

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lk2/b;->B(Li2/s0;Li2/t;FLk2/f;I)V

    return-void
.end method

.method public final B0()J
    .locals 2

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    invoke-interface {v0}, Lk2/e;->B0()J

    move-result-wide v0

    return-wide v0
.end method

.method public final D0(J)J
    .locals 1

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    invoke-interface {v0, p1, p2}, Ly3/c;->D0(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final E0(Li2/s0;JFLk2/f;)V
    .locals 6

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lk2/b;->E0(Li2/s0;JFLk2/f;)V

    return-void
.end method

.method public final F(F)I
    .locals 1

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    invoke-interface {v0, p1}, Ly3/c;->F(F)I

    move-result p1

    return p1
.end method

.method public final I(Li2/g;JJJFLi2/y;I)V
    .locals 11

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-wide/from16 v6, p6

    move/from16 v8, p8

    move-object/from16 v9, p9

    move/from16 v10, p10

    invoke-virtual/range {v0 .. v10}, Lk2/b;->I(Li2/g;JJJFLi2/y;I)V

    return-void
.end method

.method public final K(J)F
    .locals 1

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    invoke-interface {v0, p1, p2}, Ly3/c;->K(J)F

    move-result p1

    return p1
.end method

.method public final R(Li2/t;JJFLi2/t0;F)V
    .locals 9

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    invoke-virtual/range {v0 .. v8}, Lk2/b;->R(Li2/t;JJFLi2/t0;F)V

    return-void
.end method

.method public final a()V
    .locals 11

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    iget-object v1, v0, Lk2/b;->x:La3/p;

    invoke-virtual {v1}, La3/p;->w()Li2/v;

    move-result-object v3

    iget-object v1, p0, La3/p0;->x:La3/r;

    if-eqz v1, :cond_f

    move-object v2, v1

    check-cast v2, Lb2/v;

    iget-object v4, v2, Lb2/v;->w:Lb2/v;

    iget-object v4, v4, Lb2/v;->F:Lb2/v;

    const/4 v9, 0x0

    const/4 v10, 0x4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    iget v5, v4, Lb2/v;->z:I

    and-int/2addr v5, v10

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    if-eqz v4, :cond_4

    iget v5, v4, Lb2/v;->y:I

    and-int/lit8 v6, v5, 0x2

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    and-int/lit8 v5, v5, 0x4

    if-eqz v5, :cond_3

    goto :goto_2

    :cond_3
    iget-object v4, v4, Lb2/v;->F:Lb2/v;

    goto :goto_0

    :cond_4
    :goto_1
    move-object v4, v9

    :goto_2
    if-eqz v4, :cond_d

    move-object v1, v9

    :goto_3
    if-eqz v4, :cond_c

    instance-of v2, v4, La3/r;

    if-eqz v2, :cond_5

    move-object v7, v4

    check-cast v7, La3/r;

    iget-object v2, v0, Lk2/b;->x:La3/p;

    iget-object v2, v2, La3/p;->y:Ljava/lang/Object;

    move-object v8, v2

    check-cast v8, Ll2/c;

    invoke-static {v7, v10}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v6

    iget-wide v4, v6, Ly2/j1;->y:J

    invoke-static {v4, v5}, Lv63/b;->l(J)J

    move-result-wide v4

    iget-object v2, v6, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, La3/q0;->a(La3/n0;)Landroidx/compose/ui/node/Owner;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/ui/node/Owner;->getSharedDrawScope()La3/p0;

    move-result-object v2

    invoke-virtual/range {v2 .. v8}, La3/p0;->b(Li2/v;JLandroidx/compose/ui/node/NodeCoordinator;La3/r;Ll2/c;)V

    goto :goto_6

    :cond_5
    iget v2, v4, Lb2/v;->y:I

    and-int/2addr v2, v10

    if-eqz v2, :cond_b

    instance-of v2, v4, La3/o;

    if-eqz v2, :cond_b

    move-object v2, v4

    check-cast v2, La3/o;

    iget-object v2, v2, La3/o;->P:Lb2/v;

    const/4 v5, 0x0

    :goto_4
    const/4 v6, 0x1

    if-eqz v2, :cond_a

    iget v7, v2, Lb2/v;->y:I

    and-int/2addr v7, v10

    if-eqz v7, :cond_9

    add-int/lit8 v5, v5, 0x1

    if-ne v5, v6, :cond_6

    move-object v4, v2

    goto :goto_5

    :cond_6
    if-nez v1, :cond_7

    new-instance v1, Lr1/c;

    const/16 v6, 0x10

    new-array v6, v6, [Lb2/v;

    invoke-direct {v1, v6}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_7
    if-eqz v4, :cond_8

    invoke-virtual {v1, v4}, Lr1/c;->b(Ljava/lang/Object;)V

    move-object v4, v9

    :cond_8
    invoke-virtual {v1, v2}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_9
    :goto_5
    iget-object v2, v2, Lb2/v;->F:Lb2/v;

    goto :goto_4

    :cond_a
    if-ne v5, v6, :cond_b

    goto :goto_3

    :cond_b
    :goto_6
    invoke-static {v1}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v4

    goto :goto_3

    :cond_c
    return-void

    :cond_d
    invoke-static {v1, v10}, La3/g;->n(La3/n;I)Landroidx/compose/ui/node/NodeCoordinator;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/node/NodeCoordinator;->g1()Lb2/v;

    move-result-object v4

    iget-object v2, v2, Lb2/v;->w:Lb2/v;

    if-ne v4, v2, :cond_e

    iget-object v1, v1, Landroidx/compose/ui/node/NodeCoordinator;->P:Landroidx/compose/ui/node/NodeCoordinator;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :cond_e
    iget-object v0, v0, Lk2/b;->x:La3/p;

    iget-object v0, v0, La3/p;->y:Ljava/lang/Object;

    check-cast v0, Ll2/c;

    invoke-virtual {v1, v3, v0}, Landroidx/compose/ui/node/NodeCoordinator;->v1(Li2/v;Ll2/c;)V

    return-void

    :cond_f
    const-string v0, "Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer."

    invoke-static {v0}, Lb9/y;->w(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    move-result-object v0

    throw v0
.end method

.method public final a0(Li2/t;JJFLk2/f;I)V
    .locals 9

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    invoke-virtual/range {v0 .. v8}, Lk2/b;->a0(Li2/t;JJFLk2/f;I)V

    return-void
.end method

.method public final b(Li2/v;JLandroidx/compose/ui/node/NodeCoordinator;La3/r;Ll2/c;)V
    .locals 9

    iget-object v0, p0, La3/p0;->x:La3/r;

    iput-object p5, p0, La3/p0;->x:La3/r;

    iget-object v1, p4, Landroidx/compose/ui/node/NodeCoordinator;->O:La3/n0;

    iget-object v1, v1, La3/n0;->Y:Ly3/m;

    iget-object v2, p0, La3/p0;->w:Lk2/b;

    iget-object v3, v2, Lk2/b;->x:La3/p;

    iget-object v4, v3, La3/p;->z:Ljava/lang/Object;

    check-cast v4, Lk2/b;

    iget-object v4, v4, Lk2/b;->w:Lk2/a;

    iget-object v5, v4, Lk2/a;->a:Ly3/c;

    iget-object v4, v4, Lk2/a;->b:Ly3/m;

    invoke-virtual {v3}, La3/p;->w()Li2/v;

    move-result-object v3

    iget-object v2, v2, Lk2/b;->x:La3/p;

    invoke-virtual {v2}, La3/p;->A()J

    move-result-wide v6

    iget-object v8, v2, La3/p;->y:Ljava/lang/Object;

    check-cast v8, Ll2/c;

    invoke-virtual {v2, p4}, La3/p;->Q(Ly3/c;)V

    invoke-virtual {v2, v1}, La3/p;->T(Ly3/m;)V

    invoke-virtual {v2, p1}, La3/p;->P(Li2/v;)V

    invoke-virtual {v2, p2, p3}, La3/p;->U(J)V

    iput-object p6, v2, La3/p;->y:Ljava/lang/Object;

    invoke-interface {p1}, Li2/v;->q()V

    :try_start_0
    invoke-interface {p5, p0}, La3/r;->O(La3/p0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Li2/v;->g()V

    invoke-virtual {v2, v5}, La3/p;->Q(Ly3/c;)V

    invoke-virtual {v2, v4}, La3/p;->T(Ly3/m;)V

    invoke-virtual {v2, v3}, La3/p;->P(Li2/v;)V

    invoke-virtual {v2, v6, v7}, La3/p;->U(J)V

    iput-object v8, v2, La3/p;->y:Ljava/lang/Object;

    iput-object v0, p0, La3/p0;->x:La3/r;

    return-void

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Li2/v;->g()V

    invoke-virtual {v2, v5}, La3/p;->Q(Ly3/c;)V

    invoke-virtual {v2, v4}, La3/p;->T(Ly3/m;)V

    invoke-virtual {v2, v3}, La3/p;->P(Li2/v;)V

    invoke-virtual {v2, v6, v7}, La3/p;->U(J)V

    iput-object v8, v2, La3/p;->y:Ljava/lang/Object;

    throw p2
.end method

.method public final d()J
    .locals 2

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d0(JJJFILi2/t0;)V
    .locals 10

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    move/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v9, p9

    invoke-virtual/range {v0 .. v9}, Lk2/b;->d0(JJJFILi2/t0;)V

    return-void
.end method

.method public final e0(I)F
    .locals 1

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    invoke-interface {v0, p1}, Ly3/c;->e0(I)F

    move-result p1

    return p1
.end method

.method public final f0(F)F
    .locals 1

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    invoke-virtual {v0}, Lk2/b;->getDensity()F

    move-result v0

    div-float/2addr p1, v0

    return p1
.end method

.method public final getDensity()F
    .locals 1

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    invoke-virtual {v0}, Lk2/b;->getDensity()F

    move-result v0

    return v0
.end method

.method public final getLayoutDirection()Ly3/m;
    .locals 1

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    iget-object v0, v0, Lk2/b;->w:Lk2/a;

    iget-object v0, v0, Lk2/a;->b:Ly3/m;

    return-object v0
.end method

.method public final h(F)J
    .locals 2

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    invoke-interface {v0, p1}, Ly3/c;->h(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final i(J)J
    .locals 1

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    invoke-interface {v0, p1, p2}, Ly3/c;->i(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public final k0(JFFJJFLk2/f;)V
    .locals 11

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move/from16 v9, p9

    move-object/from16 v10, p10

    invoke-virtual/range {v0 .. v10}, Lk2/b;->k0(JFFJJFLk2/f;)V

    return-void
.end method

.method public final l(J)F
    .locals 1

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    invoke-interface {v0, p1, p2}, Ly3/c;->l(J)F

    move-result p1

    return p1
.end method

.method public final m(Li2/t;JJJFLk2/f;)V
    .locals 10

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-wide/from16 v6, p6

    move/from16 v8, p8

    move-object/from16 v9, p9

    invoke-virtual/range {v0 .. v9}, Lk2/b;->m(Li2/t;JJJFLk2/f;)V

    return-void
.end method

.method public final m0()F
    .locals 1

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    invoke-virtual {v0}, Lk2/b;->m0()F

    move-result v0

    return v0
.end method

.method public final n0(JJJFLi2/y;I)V
    .locals 10

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    move-wide v1, p1

    move-wide v3, p3

    move-wide v5, p5

    move/from16 v7, p7

    move-object/from16 v8, p8

    move/from16 v9, p9

    invoke-virtual/range {v0 .. v9}, Lk2/b;->n0(JJJFLi2/y;I)V

    return-void
.end method

.method public final q(F)J
    .locals 2

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    invoke-interface {v0, p1}, Ly3/c;->q(F)J

    move-result-wide v0

    return-wide v0
.end method

.method public final q0(F)F
    .locals 1

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    invoke-virtual {v0}, Lk2/b;->getDensity()F

    move-result v0

    mul-float/2addr v0, p1

    return v0
.end method

.method public final t0()La3/p;
    .locals 1

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    iget-object v0, v0, Lk2/b;->x:La3/p;

    return-object v0
.end method

.method public final u0(JFJFLk2/f;)V
    .locals 8

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    move-wide v1, p1

    move v3, p3

    move-wide v4, p4

    move v6, p6

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Lk2/b;->u0(JFJFLk2/f;)V

    return-void
.end method

.method public final w(Li2/t;FFZJJLk2/f;I)V
    .locals 11

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move-object/from16 v9, p9

    move/from16 v10, p10

    invoke-virtual/range {v0 .. v10}, Lk2/b;->w(Li2/t;FFZJJLk2/f;I)V

    return-void
.end method

.method public final x(Li2/t;FJFLk2/f;)V
    .locals 7

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    move v5, p5

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lk2/b;->x(Li2/t;FJFLk2/f;)V

    return-void
.end method

.method public final y0(Ljava/util/ArrayList;JF)V
    .locals 1

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    invoke-virtual {v0, p1, p2, p3, p4}, Lk2/b;->y0(Ljava/util/ArrayList;JF)V

    return-void
.end method

.method public final z0(JJJJLk2/f;FI)V
    .locals 12

    iget-object v0, p0, La3/p0;->w:Lk2/b;

    move-wide v1, p1

    move-wide v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move-object/from16 v9, p9

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-virtual/range {v0 .. v11}, Lk2/b;->z0(JJJJLk2/f;FI)V

    return-void
.end method
