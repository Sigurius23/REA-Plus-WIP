.class public final synthetic Lg1/k4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:I

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILy2/j1;Ly2/j1;Ly2/j1;Ly2/j1;Ly2/j1;Ly2/j1;Lg1/l4;Ly2/t0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lg1/k4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg1/k4;->x:I

    iput p2, p0, Lg1/k4;->y:I

    iput-object p3, p0, Lg1/k4;->z:Ljava/lang/Object;

    iput-object p4, p0, Lg1/k4;->E:Ljava/lang/Object;

    iput-object p5, p0, Lg1/k4;->F:Ljava/lang/Object;

    iput-object p6, p0, Lg1/k4;->G:Ljava/lang/Object;

    iput-object p7, p0, Lg1/k4;->H:Ljava/lang/Object;

    iput-object p8, p0, Lg1/k4;->I:Ljava/lang/Object;

    iput-object p9, p0, Lg1/k4;->J:Ljava/lang/Object;

    iput-object p10, p0, Lg1/k4;->K:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/ArrayList;Ly2/v1;Lc93/m;Lg1/k5;ILy3/a;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;Lx1/b;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lg1/k4;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lg1/k4;->x:I

    iput-object p2, p0, Lg1/k4;->z:Ljava/lang/Object;

    iput-object p3, p0, Lg1/k4;->E:Ljava/lang/Object;

    iput-object p4, p0, Lg1/k4;->F:Ljava/lang/Object;

    iput-object p5, p0, Lg1/k4;->G:Ljava/lang/Object;

    iput p6, p0, Lg1/k4;->y:I

    iput-object p7, p0, Lg1/k4;->H:Ljava/lang/Object;

    iput-object p8, p0, Lg1/k4;->I:Ljava/lang/Object;

    iput-object p9, p0, Lg1/k4;->J:Ljava/lang/Object;

    iput-object p10, p0, Lg1/k4;->K:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v0, p0

    iget v1, v0, Lg1/k4;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    iget-object v4, v0, Lg1/k4;->K:Ljava/lang/Object;

    iget-object v5, v0, Lg1/k4;->J:Ljava/lang/Object;

    iget-object v6, v0, Lg1/k4;->I:Ljava/lang/Object;

    iget-object v7, v0, Lg1/k4;->H:Ljava/lang/Object;

    iget v8, v0, Lg1/k4;->y:I

    iget-object v9, v0, Lg1/k4;->G:Ljava/lang/Object;

    iget-object v10, v0, Lg1/k4;->F:Ljava/lang/Object;

    iget-object v11, v0, Lg1/k4;->E:Ljava/lang/Object;

    iget-object v12, v0, Lg1/k4;->z:Ljava/lang/Object;

    iget v13, v0, Lg1/k4;->x:I

    packed-switch v1, :pswitch_data_0

    check-cast v12, Ljava/util/ArrayList;

    check-cast v11, Ly2/v1;

    check-cast v10, Lc93/m;

    check-cast v9, Lg1/k5;

    check-cast v7, Ly3/a;

    check-cast v6, Lkotlin/jvm/internal/e0;

    check-cast v5, Lkotlin/jvm/internal/e0;

    check-cast v4, Lx1/b;

    move-object/from16 v1, p1

    check-cast v1, Ly2/i1;

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v12}, Ljava/util/Collection;->size()I

    move-result v3

    move v0, v13

    const/4 v14, 0x0

    :goto_0
    if-ge v14, v3, :cond_0

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v17, v2

    move-object/from16 v2, v16

    check-cast v2, Ly2/j1;

    move/from16 p1, v3

    const/4 v3, 0x0

    invoke-static {v2, v0, v3, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    new-instance v3, Lg1/w7;

    move-object/from16 v16, v12

    invoke-interface {v11, v0}, Ly3/c;->e0(I)F

    move-result v12

    move/from16 v18, v0

    iget v0, v2, Ly2/j1;->w:I

    invoke-interface {v11, v0}, Ly3/c;->e0(I)F

    move-result v0

    invoke-direct {v3, v12, v0}, Lg1/w7;-><init>(FF)V

    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v0, v2, Ly2/j1;->w:I

    add-int v0, v18, v0

    add-int/lit8 v14, v14, 0x1

    move/from16 v3, p1

    move-object/from16 v12, v16

    move-object/from16 v2, v17

    goto :goto_0

    :cond_0
    move-object/from16 v17, v2

    sget-object v0, Lg1/d8;->x:Lg1/d8;

    invoke-interface {v11, v0, v10}, Ly2/v1;->s0(Ljava/lang/Object;Lc93/m;)Ljava/util/List;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ly2/q0;

    move/from16 p1, v2

    move v12, v3

    iget-wide v2, v7, Ly3/a;->a:J

    iget v14, v6, Lkotlin/jvm/internal/e0;->w:I

    const/16 v23, 0x0

    const/16 v24, 0x8

    const/16 v22, 0x0

    move/from16 v21, v14

    move-wide/from16 v18, v2

    move/from16 v20, v14

    invoke-static/range {v18 .. v24}, Ly3/a;->b(JIIIII)J

    move-result-wide v2

    invoke-interface {v10, v2, v3}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v2

    iget v3, v5, Lkotlin/jvm/internal/e0;->w:I

    iget v10, v2, Ly2/j1;->x:I

    sub-int/2addr v3, v10

    const/4 v10, 0x0

    invoke-static {v2, v10, v3, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    add-int/lit8 v3, v12, 0x1

    move/from16 v2, p1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    sget-object v0, Lg1/d8;->y:Lg1/d8;

    new-instance v2, Lg1/y7;

    invoke-direct {v2, v4, v15, v10}, Lg1/y7;-><init>(Lx1/b;Ljava/util/ArrayList;I)V

    new-instance v3, Lx1/b;

    const v4, -0x2933d4e

    const/4 v7, 0x1

    invoke-direct {v3, v2, v7, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-interface {v11, v0, v3}, Ly2/v1;->s0(Ljava/lang/Object;Lc93/m;)Ljava/util/List;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v2, :cond_5

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly2/q0;

    iget v7, v6, Lkotlin/jvm/internal/e0;->w:I

    iget v10, v5, Lkotlin/jvm/internal/e0;->w:I

    if-ltz v7, :cond_2

    const/4 v12, 0x1

    goto :goto_3

    :cond_2
    const/4 v12, 0x0

    :goto_3
    if-ltz v10, :cond_3

    const/4 v14, 0x1

    goto :goto_4

    :cond_3
    const/4 v14, 0x0

    :goto_4
    and-int/2addr v12, v14

    if-nez v12, :cond_4

    const-string v12, "width and height must be >= 0"

    invoke-static {v12}, Ly3/i;->a(Ljava/lang/String;)V

    :cond_4
    move/from16 p1, v2

    move v12, v3

    invoke-static {v7, v7, v10, v10}, Ly3/b;->h(IIII)J

    move-result-wide v2

    invoke-interface {v4, v2, v3}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3, v3, v1}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    add-int/lit8 v3, v12, 0x1

    move/from16 v2, p1

    goto :goto_2

    :cond_5
    iget-object v0, v9, Lg1/k5;->a:Lf0/r1;

    iget-object v1, v9, Lg1/k5;->c:Ljava/lang/Integer;

    if-nez v1, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq v1, v8, :cond_8

    :goto_5
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v9, Lg1/k5;->c:Ljava/lang/Integer;

    invoke-static {v8, v15}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/w7;

    if-eqz v1, :cond_8

    invoke-static {v15}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/w7;

    iget v3, v2, Lg1/w7;->a:F

    iget v2, v2, Lg1/w7;->b:F

    add-float/2addr v3, v2

    invoke-interface {v11, v3}, Ly3/c;->F(F)I

    move-result v2

    add-int/2addr v2, v13

    iget-object v3, v0, Lf0/r1;->d:Lp1/h1;

    invoke-virtual {v3}, Lp1/h1;->x()I

    move-result v3

    sub-int v3, v2, v3

    iget v4, v1, Lg1/w7;->a:F

    invoke-interface {v11, v4}, Ly3/c;->F(F)I

    move-result v4

    div-int/lit8 v5, v3, 0x2

    iget v1, v1, Lg1/w7;->b:F

    invoke-interface {v11, v1}, Ly3/c;->F(F)I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v5, v1

    sub-int/2addr v4, v5

    sub-int v1, v2, v3

    if-gez v1, :cond_7

    const/4 v1, 0x0

    :cond_7
    const/4 v3, 0x0

    invoke-static {v4, v3, v1}, Le93/b;->n(III)I

    move-result v1

    iget-object v0, v0, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    if-eq v0, v1, :cond_8

    iget-object v0, v9, Lg1/k5;->b:Lbc3/c0;

    new-instance v2, Lg1/j5;

    const/4 v4, 0x0

    invoke-direct {v2, v9, v1, v4, v3}, Lg1/j5;-><init>(Ljava/lang/Object;ILq83/d;I)V

    const/4 v1, 0x3

    invoke-static {v0, v4, v4, v2, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_8
    return-object v17

    :pswitch_0
    move-object/from16 v17, v2

    check-cast v12, Ly2/j1;

    check-cast v11, Ly2/j1;

    check-cast v10, Ly2/j1;

    check-cast v9, Ly2/j1;

    check-cast v7, Ly2/j1;

    check-cast v6, Ly2/j1;

    check-cast v5, Lg1/l4;

    check-cast v4, Ly2/t0;

    move-object/from16 v0, p1

    check-cast v0, Ly2/i1;

    iget v1, v5, Lg1/l4;->c:F

    iget-boolean v2, v5, Lg1/l4;->b:Z

    invoke-interface {v4}, Ly3/c;->getDensity()F

    move-result v3

    invoke-interface {v4}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v4

    iget-object v5, v5, Lg1/l4;->d:Ll0/k1;

    sget v14, Lg1/j4;->a:F

    invoke-interface {v5}, Ll0/k1;->d()F

    move-result v14

    mul-float/2addr v14, v3

    invoke-static {v14}, Le93/b;->X(F)I

    move-result v14

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/a;->i(Ll0/k1;Ly3/m;)F

    move-result v4

    mul-float/2addr v4, v3

    invoke-static {v4}, Le93/b;->X(F)I

    move-result v4

    sget v5, Lg1/p8;->b:F

    mul-float/2addr v5, v3

    const/4 v15, 0x0

    if-eqz v12, :cond_9

    const/high16 p1, 0x40000000    # 2.0f

    iget v3, v12, Ly2/j1;->x:I

    sub-int v3, v13, v3

    int-to-float v3, v3

    div-float v3, v3, p1

    move/from16 v16, v2

    move/from16 v18, v4

    const/4 v2, 0x1

    int-to-float v4, v2

    invoke-static {v4, v15, v3}, Ldc/b;->a(FFF)I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v12, v3, v2, v0}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto :goto_6

    :cond_9
    move/from16 v16, v2

    move/from16 v18, v4

    const/high16 p1, 0x40000000    # 2.0f

    const/4 v3, 0x0

    :goto_6
    if-eqz v11, :cond_a

    iget v2, v11, Ly2/j1;->w:I

    sub-int/2addr v8, v2

    iget v2, v11, Ly2/j1;->x:I

    sub-int v2, v13, v2

    int-to-float v2, v2

    div-float v2, v2, p1

    const/4 v4, 0x1

    int-to-float v3, v4

    invoke-static {v3, v15, v2}, Ldc/b;->a(FFF)I

    move-result v2

    invoke-static {v11, v8, v2, v0}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    goto :goto_7

    :cond_a
    const/4 v4, 0x1

    :goto_7
    if-eqz v9, :cond_d

    if-eqz v16, :cond_b

    iget v2, v9, Ly2/j1;->x:I

    sub-int v2, v13, v2

    int-to-float v2, v2

    div-float v2, v2, p1

    int-to-float v3, v4

    invoke-static {v3, v15, v2}, Ldc/b;->a(FFF)I

    move-result v2

    goto :goto_8

    :cond_b
    move v2, v14

    :goto_8
    iget v3, v9, Ly2/j1;->x:I

    div-int/lit8 v3, v3, 0x2

    neg-int v3, v3

    invoke-static {v1, v2, v3}, Le93/b;->P(FII)I

    move-result v2

    if-nez v12, :cond_c

    move v5, v15

    goto :goto_9

    :cond_c
    iget v3, v12, Ly2/j1;->w:I

    int-to-float v3, v3

    sub-float/2addr v3, v5

    const/4 v4, 0x1

    int-to-float v5, v4

    sub-float/2addr v5, v1

    mul-float/2addr v5, v3

    :goto_9
    invoke-static {v5}, Le93/b;->X(F)I

    move-result v1

    add-int v1, v1, v18

    invoke-static {v9, v1, v2, v0}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_d
    if-eqz v16, :cond_e

    iget v1, v10, Ly2/j1;->x:I

    sub-int v1, v13, v1

    int-to-float v1, v1

    div-float v1, v1, p1

    const/4 v4, 0x1

    int-to-float v2, v4

    invoke-static {v2, v15, v1}, Ldc/b;->a(FFF)I

    move-result v1

    goto :goto_a

    :cond_e
    move v1, v14

    :goto_a
    if-eqz v9, :cond_f

    iget v3, v9, Ly2/j1;->x:I

    goto :goto_b

    :cond_f
    const/4 v3, 0x0

    :goto_b
    div-int/lit8 v3, v3, 0x2

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-eqz v12, :cond_10

    iget v3, v12, Ly2/j1;->w:I

    goto :goto_c

    :cond_10
    const/4 v3, 0x0

    :goto_c
    invoke-static {v10, v3, v1, v0}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    if-eqz v7, :cond_14

    if-eqz v16, :cond_11

    iget v1, v7, Ly2/j1;->x:I

    sub-int/2addr v13, v1

    int-to-float v1, v13

    div-float v1, v1, p1

    const/4 v4, 0x1

    int-to-float v2, v4

    invoke-static {v2, v15, v1}, Ldc/b;->a(FFF)I

    move-result v14

    :cond_11
    if-eqz v9, :cond_12

    iget v3, v9, Ly2/j1;->x:I

    goto :goto_d

    :cond_12
    const/4 v3, 0x0

    :goto_d
    div-int/lit8 v3, v3, 0x2

    invoke-static {v14, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-eqz v12, :cond_13

    iget v14, v12, Ly2/j1;->w:I

    goto :goto_e

    :cond_13
    const/4 v14, 0x0

    :goto_e
    invoke-static {v7, v14, v1, v0}, Ly2/i1;->n(Ly2/j1;IILy2/i1;)V

    :cond_14
    const-wide/16 v1, 0x0

    invoke-static {v0, v6, v1, v2}, Ly2/i1;->k(Ly2/i1;Ly2/j1;J)V

    return-object v17

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
