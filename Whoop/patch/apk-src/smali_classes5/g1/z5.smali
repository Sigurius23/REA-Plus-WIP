.class public final Lg1/z5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lj0/i;

.field public final synthetic F:Z

.field public final synthetic G:Lg1/w1;

.field public final synthetic H:Lp1/c1;

.field public final synthetic w:Li93/f;

.field public final synthetic x:F

.field public final synthetic y:Ljava/util/List;

.field public final synthetic z:Lc93/a;


# direct methods
.method public constructor <init>(Li93/f;FLjava/util/List;Lc93/a;Lj0/i;ZLg1/w1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/z5;->w:Li93/f;

    iput p2, p0, Lg1/z5;->x:F

    iput-object p3, p0, Lg1/z5;->y:Ljava/util/List;

    iput-object p4, p0, Lg1/z5;->z:Lc93/a;

    iput-object p5, p0, Lg1/z5;->E:Lj0/i;

    iput-boolean p6, p0, Lg1/z5;->F:Z

    iput-object p7, p0, Lg1/z5;->G:Lg1/w1;

    iput-object p8, p0, Lg1/z5;->H:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Ll0/v;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    and-int/lit8 v4, v3, 0x6

    if-nez v4, :cond_1

    move-object v4, v2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v3, v4

    :cond_1
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v4, v5, :cond_2

    move v4, v7

    goto :goto_1

    :cond_2
    move v4, v6

    :goto_1
    and-int/2addr v3, v7

    move-object v13, v2

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_15

    sget-object v2, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v13, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Ly3/m;->x:Ly3/m;

    if-ne v2, v3, :cond_3

    move/from16 v19, v7

    goto :goto_2

    :cond_3
    move/from16 v19, v6

    :goto_2
    check-cast v1, Landroidx/compose/foundation/layout/c;

    iget-wide v1, v1, Landroidx/compose/foundation/layout/c;->b:J

    invoke-static {v1, v2}, Ly3/a;->i(J)I

    move-result v1

    int-to-float v1, v1

    new-instance v6, Lkotlin/jvm/internal/d0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lkotlin/jvm/internal/d0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    sget-object v2, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v13, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/c;

    sget v3, Lg1/g6;->a:F

    invoke-interface {v2, v3}, Ly3/c;->q0(F)F

    move-result v4

    sub-float v4, v1, v4

    const/4 v15, 0x0

    invoke-static {v4, v15}, Ljava/lang/Math;->max(FF)F

    move-result v4

    iput v4, v6, Lkotlin/jvm/internal/d0;->w:F

    invoke-interface {v2, v3}, Ly3/c;->q0(F)F

    move-result v2

    iget v3, v6, Lkotlin/jvm/internal/d0;->w:F

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    iput v2, v5, Lkotlin/jvm/internal/d0;->w:F

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v2, v9, :cond_4

    invoke-static {v13}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v2

    invoke-virtual {v13, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v10, v2

    check-cast v10, Lbc3/c0;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    const/high16 v24, 0x3f800000    # 1.0f

    iget v11, v0, Lg1/z5;->x:F

    iget-object v8, v0, Lg1/z5;->w:Li93/f;

    if-ne v2, v9, :cond_8

    invoke-interface {v8}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-interface {v8}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    iget v4, v5, Lkotlin/jvm/internal/d0;->w:F

    iget v7, v6, Lkotlin/jvm/internal/d0;->w:F

    sub-float/2addr v3, v2

    cmpg-float v12, v3, v15

    if-nez v12, :cond_5

    move v2, v15

    goto :goto_3

    :cond_5
    sub-float v2, v11, v2

    div-float/2addr v2, v3

    :goto_3
    cmpg-float v3, v2, v15

    if-gez v3, :cond_6

    move v2, v15

    :cond_6
    cmpl-float v3, v2, v24

    if-lez v3, :cond_7

    move/from16 v2, v24

    :cond_7
    invoke-static {v4, v7, v2}, Le93/b;->O(FFF)F

    move-result v2

    invoke-static {v2, v13}, Ld;->v(FLp1/q;)Lp1/g1;

    move-result-object v2

    :cond_8
    move-object v3, v2

    check-cast v3, Lp1/z0;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v9, :cond_9

    invoke-static {v15, v13}, Ld;->v(FLp1/q;)Lp1/g1;

    move-result-object v2

    :cond_9
    move-object v4, v2

    check-cast v4, Lp1/z0;

    iget v2, v5, Lkotlin/jvm/internal/d0;->w:F

    invoke-virtual {v13, v2}, Lp1/q;->d(F)Z

    move-result v2

    iget v7, v6, Lkotlin/jvm/internal/d0;->w:F

    invoke-virtual {v13, v7}, Lp1/q;->d(F)Z

    move-result v7

    or-int/2addr v2, v7

    invoke-virtual {v13, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_b

    if-ne v7, v9, :cond_a

    goto :goto_4

    :cond_a
    move-object/from16 v20, v4

    goto :goto_5

    :cond_b
    :goto_4
    new-instance v12, Lg1/n5;

    new-instance v2, Lam2/b;

    iget-object v7, v0, Lg1/z5;->H:Lp1/c1;

    invoke-direct/range {v2 .. v8}, Lam2/b;-><init>(Lp1/z0;Lp1/z0;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/d0;Lp1/c1;Li93/f;)V

    move-object/from16 v20, v4

    invoke-direct {v12, v2}, Lg1/n5;-><init>(Lam2/b;)V

    invoke-virtual {v13, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v7, v12

    :goto_5
    check-cast v7, Lg1/n5;

    invoke-virtual {v13, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    iget v4, v5, Lkotlin/jvm/internal/d0;->w:F

    invoke-virtual {v13, v4}, Lp1/q;->d(F)Z

    move-result v4

    or-int/2addr v2, v4

    iget v4, v6, Lkotlin/jvm/internal/d0;->w:F

    invoke-virtual {v13, v4}, Lp1/q;->d(F)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_c

    if-ne v4, v9, :cond_d

    :cond_c
    new-instance v4, Lg1/w5;

    invoke-direct {v4, v8, v5, v6}, Lg1/w5;-><init>(Li93/f;Lkotlin/jvm/internal/d0;Lkotlin/jvm/internal/d0;)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v4, Lj93/g;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    iget v2, v5, Lkotlin/jvm/internal/d0;->w:F

    iget v12, v6, Lkotlin/jvm/internal/d0;->w:F

    move-object v14, v10

    new-instance v10, Li93/e;

    invoke-direct {v10, v2, v12}, Li93/e;-><init>(FF)V

    iget v12, v0, Lg1/z5;->x:F

    move-object v2, v14

    const/16 v14, 0xc00

    move/from16 v25, v11

    move-object v11, v3

    move/from16 v3, v25

    move-object/from16 v25, v8

    move-object v8, v4

    move-object v4, v9

    move-object/from16 v9, v25

    invoke-static/range {v8 .. v14}, Lg1/g6;->a(Lkotlin/jvm/functions/Function1;Li93/f;Li93/e;Lp1/c1;FLandroidx/compose/runtime/Composer;I)V

    move-object/from16 v21, v11

    move-object v11, v9

    iget-object v8, v0, Lg1/z5;->y:Ljava/util/List;

    invoke-virtual {v13, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    iget v9, v5, Lkotlin/jvm/internal/d0;->w:F

    invoke-virtual {v13, v9}, Lp1/q;->d(F)Z

    move-result v9

    or-int/2addr v8, v9

    iget v9, v6, Lkotlin/jvm/internal/d0;->w:F

    invoke-virtual {v13, v9}, Lp1/q;->d(F)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v13, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    iget-object v9, v0, Lg1/z5;->z:Lc93/a;

    invoke-virtual {v13, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_e

    if-ne v9, v4, :cond_f

    :cond_e
    move-object v14, v2

    goto :goto_6

    :cond_f
    move v12, v3

    move-object v14, v4

    move-object/from16 v16, v7

    move-object/from16 v3, v21

    goto :goto_7

    :goto_6
    new-instance v2, Lbm2/a0;

    const/4 v10, 0x4

    move-object v8, v4

    iget-object v4, v0, Lg1/z5;->y:Ljava/util/List;

    iget-object v9, v0, Lg1/z5;->z:Lc93/a;

    move-object v12, v8

    move-object v8, v7

    move-object v7, v14

    move-object v14, v12

    move v12, v3

    move-object/from16 v3, v21

    invoke-direct/range {v2 .. v10}, Lbm2/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v16, v8

    invoke-virtual {v13, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v9, v2

    :goto_7
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v13}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v22

    move-object v4, v14

    new-instance v14, Lg1/f6;

    move v2, v15

    iget-boolean v15, v0, Lg1/z5;->F:Z

    iget-object v7, v0, Lg1/z5;->E:Lj0/i;

    move/from16 v18, v1

    move-object/from16 v21, v3

    move-object/from16 v17, v7

    invoke-direct/range {v14 .. v22}, Lg1/f6;-><init>(ZLg1/n5;Lj0/i;FZLp1/z0;Lp1/z0;Lp1/c1;)V

    move-object/from16 v15, v16

    move-object/from16 v1, v22

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v14}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v16, Lh0/d2;->x:Lh0/d2;

    iget-object v8, v15, Lg1/n5;->b:Lp1/k1;

    invoke-virtual {v8}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_10

    if-ne v10, v4, :cond_11

    :cond_10
    new-instance v10, Lg1/x5;

    const/4 v4, 0x0

    const/4 v9, 0x0

    invoke-direct {v10, v1, v4, v9}, Lg1/x5;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v13, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v21, v10

    check-cast v21, Lkotlin/jvm/functions/Function3;

    const/16 v23, 0x20

    iget-boolean v1, v0, Lg1/z5;->F:Z

    iget-object v4, v0, Lg1/z5;->E:Lj0/i;

    const/16 v20, 0x0

    move/from16 v17, v1

    move-object v14, v3

    move-object/from16 v18, v4

    move/from16 v22, v19

    move/from16 v19, v8

    invoke-static/range {v14 .. v23}, Lh0/k1;->a(Landroidx/compose/ui/Modifier;Lh0/n1;Lh0/d2;ZLj0/i;ZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v11}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-interface {v11}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-static {v12, v3, v4}, Le93/b;->m(FFF)F

    move-result v3

    invoke-interface {v11}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    move-result v4

    invoke-interface {v11}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    move-result v8

    sub-float/2addr v8, v4

    cmpg-float v9, v8, v2

    if-nez v9, :cond_12

    move v15, v2

    goto :goto_8

    :cond_12
    sub-float/2addr v3, v4

    div-float v15, v3, v8

    :goto_8
    cmpg-float v3, v15, v2

    if-gez v3, :cond_13

    move v15, v2

    :cond_13
    cmpl-float v2, v15, v24

    if-lez v2, :cond_14

    move/from16 v9, v24

    goto :goto_9

    :cond_14
    move v9, v15

    :goto_9
    iget v2, v6, Lkotlin/jvm/internal/d0;->w:F

    iget v3, v5, Lkotlin/jvm/internal/d0;->w:F

    sub-float v12, v2, v3

    invoke-interface {v7, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/16 v16, 0x0

    iget-boolean v8, v0, Lg1/z5;->F:Z

    iget-object v10, v0, Lg1/z5;->y:Ljava/util/List;

    iget-object v11, v0, Lg1/z5;->G:Lg1/w1;

    move-object v15, v13

    iget-object v13, v0, Lg1/z5;->E:Lj0/i;

    invoke-static/range {v8 .. v16}, Lg1/g6;->c(ZFLjava/util/List;Lg1/w1;FLj0/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_a

    :cond_15
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_a
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
