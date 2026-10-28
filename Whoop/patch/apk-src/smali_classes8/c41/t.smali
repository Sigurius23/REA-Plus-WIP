.class public abstract Lc41/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lc41/r;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Lc41/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lc93/a;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lc41/t;->h(Lc93/a;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc41/r;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lc41/t;->g(Lc41/r;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc41/t;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lc41/r;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lc41/t;->i(Landroidx/compose/ui/Modifier;Lc41/r;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lc41/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc41/r;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move/from16 v6, p4

    const-string v1, "state"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p3

    check-cast v3, Lp1/q;

    const v1, 0x893fde4

    invoke-virtual {v3, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x1

    const/4 v2, 0x4

    const/4 v4, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v5, v6, 0x6

    move v7, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v6, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v3, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v2

    goto :goto_0

    :cond_1
    move v7, v4

    :goto_0
    or-int/2addr v7, v6

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v7, v6

    :goto_1
    and-int/lit8 v8, v6, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit8 v8, p5, 0x4

    const/16 v9, 0x100

    if-eqz v8, :cond_6

    or-int/lit16 v7, v7, 0x180

    :cond_5
    move-object/from16 v10, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v10, v6, 0x180

    if-nez v10, :cond_5

    move-object/from16 v10, p2

    invoke-virtual {v3, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    move v11, v9

    goto :goto_3

    :cond_7
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v7, v11

    :goto_4
    and-int/lit16 v11, v7, 0x93

    const/16 v12, 0x92

    if-eq v11, v12, :cond_8

    const/4 v11, 0x1

    goto :goto_5

    :cond_8
    const/4 v11, 0x0

    :goto_5
    and-int/lit8 v12, v7, 0x1

    invoke-virtual {v3, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_16

    if-eqz v1, :cond_9

    sget-object v1, Lb2/t;->w:Lb2/t;

    move-object v11, v1

    goto :goto_6

    :cond_9
    move-object v11, v5

    :goto_6
    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_b

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_a

    new-instance v1, Lc31/m;

    const/4 v5, 0x6

    invoke-direct {v1, v5}, Lc31/m;-><init>(I)V

    invoke-virtual {v3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v1, Lkotlin/jvm/functions/Function1;

    move-object v8, v1

    goto :goto_7

    :cond_b
    move-object v8, v10

    :goto_7
    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit16 v5, v7, 0x380

    if-ne v5, v9, :cond_c

    const/4 v5, 0x1

    goto :goto_8

    :cond_c
    const/4 v5, 0x0

    :goto_8
    or-int/2addr v1, v5

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_d

    if-ne v5, v12, :cond_e

    :cond_d
    new-instance v5, Lbs1/v;

    const/4 v1, 0x6

    invoke-direct {v5, v0, v8, v1}, Lbs1/v;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v1, v5

    check-cast v1, Lc93/a;

    sget-object v5, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v3, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/c;

    invoke-interface {v5}, Ly3/c;->m0()F

    move-result v5

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v5, v9}, Ljava/lang/Math;->max(FF)F

    move-result v5

    const/4 v10, 0x7

    int-to-float v10, v10

    int-to-float v2, v2

    mul-float/2addr v10, v2

    mul-float/2addr v10, v5

    mul-float/2addr v2, v2

    mul-float v15, v2, v5

    invoke-static {v9, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v5, Lb2/e;->K:Lb2/l;

    const/16 v13, 0x36

    invoke-static {v4, v5, v3, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    move/from16 p0, v15

    iget-wide v14, v3, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v3, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v13, v3, Lp1/q;->S:Z

    if-eqz v13, :cond_f

    invoke-virtual {v3, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_9
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v3, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v3, v4, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v13, v3, Lp1/q;->S:Z

    if-nez v13, :cond_10

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_11

    :cond_10
    invoke-static {v5, v3, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v3, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v4, v9

    const-wide/16 v13, 0x0

    cmpl-double v2, v4, v13

    if-lez v2, :cond_12

    goto :goto_a

    :cond_12
    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v13, 0x1

    invoke-direct {v2, v9, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    shr-int/lit8 v4, v7, 0x3

    and-int/lit8 v4, v4, 0xe

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lc41/u;->c(Lc41/r;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static/range {p1 .. p1}, Lc41/s;->a(Lc41/r;)Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual/range {p1 .. p1}, Lc41/r;->o()Z

    move-result v0

    if-eqz v0, :cond_13

    move-object v0, v8

    move v8, v13

    :goto_b
    move v14, v10

    goto :goto_c

    :cond_13
    move-object v0, v8

    const/4 v8, 0x0

    goto :goto_b

    :goto_c
    invoke-static/range {p1 .. p1}, Lc41/s;->a(Lc41/r;)Z

    move-result v10

    const/4 v2, 0x0

    invoke-static {v3, v2}, Lc41/u;->f(Landroidx/compose/runtime/Composer;I)Lg1/a1;

    move-result-object v2

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_14

    if-ne v5, v12, :cond_15

    :cond_14
    new-instance v5, Laz1/b;

    const/4 v4, 0x5

    invoke-direct {v5, v1, v4}, Laz1/b;-><init>(Lc93/a;I)V

    invoke-virtual {v3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v9, v5

    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/16 v17, 0x0

    const/16 v18, 0x51

    const/4 v7, 0x0

    move-object v1, v11

    const/4 v11, 0x0

    move v4, v13

    const/4 v13, 0x0

    move/from16 v15, p0

    move-object v12, v2

    move-object/from16 v16, v3

    invoke-static/range {v7 .. v18}, Lsy0/h;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ZLj0/i;Lg1/a1;Ly71/g;FFLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v3, v4}, Lp1/q;->q(Z)V

    move-object v3, v0

    goto :goto_d

    :cond_16
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object/from16 v16, v3

    move-object v1, v5

    move-object v3, v10

    :goto_d
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_17

    new-instance v0, La01/e;

    const/16 v6, 0x1b

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, La01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lc41/r;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    invoke-static {p0}, Lc41/s;->a(Lc41/r;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lc41/v;

    invoke-virtual {p0}, Lc41/r;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lc41/r;->o()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    invoke-direct {v0, v1, p0}, Lc41/v;-><init>(Ljava/lang/String;Z)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lc93/a;Z)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lc41/r;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lc41/t;->e(Landroidx/compose/ui/Modifier;Lc41/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
