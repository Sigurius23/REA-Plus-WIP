.class public abstract Lc41/z3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc41/z3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lc41/a4;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Lc41/a4;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc41/z3;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc41/a4;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lc41/z3;->g(Lc41/a4;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc41/a4;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lc41/z3;->i(Lc41/a4;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc41/a4;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lc41/z3;->h(Lc41/a4;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lc41/a4;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc41/a4;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v0, -0x5946f6a

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v4, p4, 0x2

    const/16 v5, 0x20

    if-eqz v4, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    move v7, v5

    goto :goto_3

    :cond_5
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v0, v7

    :goto_4
    and-int/lit8 v7, v0, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_6

    move v7, v10

    goto :goto_5

    :cond_6
    move v7, v9

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v11, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_10

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v7, :cond_7

    new-instance v4, Lc31/m;

    const/16 v6, 0x13

    invoke-direct {v4, v6}, Lc31/m;-><init>(I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v14, v4

    goto :goto_6

    :cond_8
    move-object v14, v6

    :goto_6
    sget-object v4, Lb2/t;->w:Lb2/t;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    and-int/lit8 v4, v0, 0xe

    if-eq v4, v3, :cond_a

    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_9

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_7

    :cond_9
    move v4, v9

    goto :goto_8

    :cond_a
    :goto_7
    move v4, v10

    :goto_8
    and-int/lit8 v0, v0, 0x70

    if-ne v0, v5, :cond_b

    move v9, v10

    :cond_b
    or-int v0, v4, v9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_c

    if-ne v4, v7, :cond_d

    :cond_c
    new-instance v4, Lbs1/v;

    const/16 v0, 0xf

    invoke-direct {v4, v1, v14, v0}, Lbs1/v;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v19, v4

    check-cast v19, Lc93/a;

    const/16 v20, 0xf

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v4, v11, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->W0()J

    move-result-wide v4

    new-instance v7, Lf0/t;

    int-to-float v6, v10

    invoke-virtual {v1}, Lc41/a4;->a()Lc41/b4;

    move-result-object v8

    sget-object v9, Lc41/z3$a;->a:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v9, v8

    if-eq v8, v10, :cond_f

    if-ne v8, v2, :cond_e

    invoke-static {}, Lgb1/b0;->O()Li2/t;

    move-result-object v2

    goto :goto_9

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_f
    invoke-static {}, Lgb1/b0;->M()Li2/t;

    move-result-object v2

    :goto_9
    invoke-direct {v7, v6, v2}, Lf0/t;-><init>(FLi2/t;)V

    const/4 v2, 0x3

    int-to-float v2, v2

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    new-instance v2, La80/c;

    const/16 v3, 0x1a

    invoke-direct {v2, v1, v3}, La80/c;-><init>(Ljava/lang/Object;I)V

    const v3, 0x2f180c26

    invoke-static {v3, v11, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const/high16 v12, 0xc00000

    const/16 v13, 0x62

    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v13}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v14

    goto :goto_a

    :cond_10
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v3, v6

    :goto_a
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v0, La01/i;

    const/16 v5, 0x13

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, La01/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lc41/a4;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lc41/a4;->e()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc41/a4;->e()Lcom/whoop/navigation/e;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lc41/a4;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 33

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v4, p2, 0x1

    move-object/from16 v10, p1

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_10

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v3, v3

    const/16 v6, 0x8

    int-to-float v14, v6

    mul-float v6, v3, v14

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->K:Lb2/l;

    const/4 v7, 0x4

    int-to-float v15, v7

    const/16 v7, 0x36

    invoke-static {v3, v15, v6, v10, v7}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v3

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v10, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v10, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-nez v11, :cond_2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    :cond_2
    invoke-static {v6, v10, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v10, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc41/a4;->b()Ljava/lang/String;

    move-result-object v5

    const/16 v16, 0x0

    if-eqz v5, :cond_4

    invoke-static {v5}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_2

    :cond_4
    move-object/from16 v5, v16

    :goto_2
    const/4 v11, 0x6

    if-nez v5, :cond_5

    const v5, -0x37777cc8    # -279577.75f

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    move v5, v0

    move-object/from16 p2, v4

    move-object v4, v7

    move-object v0, v8

    move-object v1, v9

    move-object/from16 v17, v13

    move/from16 v18, v14

    move-object v13, v6

    move v14, v11

    goto :goto_3

    :cond_5
    const v12, -0x37777cc7

    invoke-virtual {v10, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    const/4 v12, 0x5

    int-to-float v12, v12

    mul-float/2addr v12, v15

    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v5, v10, v11}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    sget v1, Lgy0/f;->S:I

    invoke-static {v10, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v10, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v17

    move v0, v11

    const/16 v11, 0x180

    move-object/from16 v19, v7

    move-object v7, v12

    const/4 v12, 0x0

    move-object/from16 p2, v4

    move-object/from16 v4, v19

    move/from16 v31, v14

    move v14, v0

    move-object v0, v8

    move-object/from16 v32, v6

    move-object v6, v1

    move-object v1, v9

    move-wide/from16 v8, v17

    move-object/from16 v17, v13

    move/from16 v18, v31

    move-object/from16 v13, v32

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    const/high16 v5, 0x3f800000    # 1.0f

    :goto_3
    float-to-double v6, v5

    const-wide/16 v8, 0x0

    cmpl-double v6, v6, v8

    if-lez v6, :cond_6

    goto :goto_4

    :cond_6
    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_4
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v7, 0x1

    invoke-direct {v6, v5, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    double-to-float v5, v7

    mul-float v5, v5, v18

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v7, v10, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_7

    invoke-virtual {v10, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v10, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    :cond_8
    invoke-static {v7, v10, v7, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v10, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc41/a4;->c()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_a

    const v0, 0x152d6754

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    move v3, v14

    move v1, v15

    move-object/from16 v4, v17

    goto :goto_6

    :cond_a
    const v1, 0x152d6755

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    sget-object v5, Liz0/l;->a:Liz0/l;

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v10, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v7

    invoke-virtual {v1, v10, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->L()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v6

    const/high16 v29, 0x30000

    const/16 v30, 0x7ffc

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    move v3, v14

    move v1, v15

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v4, v17

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-virtual/range {v5 .. v30}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v8

    const/4 v15, 0x0

    const/16 v16, 0x1f6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v5, v0

    move-object/from16 v14, v27

    invoke-static/range {v5 .. v16}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object v10, v14

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    move-object/from16 v16, p2

    :goto_6
    if-nez v16, :cond_c

    const v0, 0x1532fa6c

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lc41/a4;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_b

    const v0, -0x501754c0

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_b
    const v5, -0x501754bf

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-static {v0, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v10, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->L()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v7

    const/16 v29, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_c
    const v0, 0xaee0a0

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual/range {p0 .. p0}, Lc41/a4;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_d

    const v0, 0x1538acfe

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_9
    const/4 v7, 0x1

    goto :goto_a

    :cond_d
    const v5, 0x1538acff

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-static {v0, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v10, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->b()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v7

    const/16 v29, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_9

    :goto_a
    invoke-virtual {v10, v7}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lc41/a4;->h()Ln41/b;

    move-result-object v6

    if-nez v6, :cond_e

    const v0, -0x375ee6d0    # -329929.5f

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_e
    const v0, -0x375ee6cf

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    const/4 v9, 0x6

    move-object/from16 v27, v10

    const/4 v10, 0x4

    const/4 v7, 0x0

    move-object v5, v4

    move-object/from16 v8, v27

    invoke-static/range {v5 .. v10}, Lm41/e;->z(Landroidx/compose/ui/Modifier;Ln41/b;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v8

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual/range {p0 .. p0}, Lc41/a4;->g()Z

    move-result v0

    if-eqz v0, :cond_f

    const v0, -0x375b6524

    invoke-static {v10, v0, v1, v1, v4}, Lih0/d0;->f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/w;->s()I

    move-result v1

    invoke-static {v1, v10, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    sget v1, Lgy0/f;->S:I

    invoke-static {v10, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v8

    const/16 v11, 0x180

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_c
    const/4 v7, 0x1

    goto :goto_d

    :cond_f
    const v0, -0x37561488    # -347995.75f

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_c

    :goto_d
    invoke-virtual {v10, v7}, Lp1/q;->q(Z)V

    return-object p2

    :cond_10
    move-object/from16 p2, v4

    invoke-virtual {v10}, Lp1/q;->X()V

    return-object p2
.end method

.method private static final i(Lc41/a4;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lc41/z3;->e(Lc41/a4;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
