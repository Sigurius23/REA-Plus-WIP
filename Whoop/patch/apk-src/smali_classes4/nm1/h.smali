.class public abstract Lnm1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnm1/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\u0008*\u00020\u00082\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001b\u0010\u000f\u001a\u00020\u0008*\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\u0008*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lnm1/i;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "g",
        "(Lnm1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/ui/Modifier;",
        "Li2/t;",
        "brush",
        "l",
        "(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;",
        "Lnm1/f;",
        "style",
        "n",
        "(Landroidx/compose/ui/Modifier;Lnm1/f;)Landroidx/compose/ui/Modifier;",
        "o",
        "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;",
        "home_release"
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
.method public static synthetic a(Lnm1/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lnm1/h;->k(Lnm1/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Lnm1/h;->j(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lnm1/h;->p(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lnm1/i;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lnm1/h;->i(Lkotlin/jvm/functions/Function1;Lnm1/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lnm1/h;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Li2/t;Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lnm1/h;->m(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lnm1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnm1/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v0, 0x406b6e3d

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v11, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v11

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v2, p4, 0x2

    const/16 v3, 0x20

    if-eqz v2, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    move v5, v3

    goto :goto_3

    :cond_5
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :goto_4
    and-int/lit8 v5, v0, 0x13

    const/16 v12, 0x12

    const/4 v13, 0x1

    if-eq v5, v12, :cond_6

    move v5, v13

    goto :goto_5

    :cond_6
    const/4 v5, 0x0

    :goto_5
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v7, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1a

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v15, :cond_7

    new-instance v2, Lmd0/b;

    const/16 v4, 0x1d

    invoke-direct {v2, v4}, Lmd0/b;-><init>(I)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_8
    move-object v2, v4

    :goto_6
    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    and-int/lit8 v6, v0, 0x70

    if-ne v6, v3, :cond_9

    move v3, v13

    goto :goto_7

    :cond_9
    const/4 v3, 0x0

    :goto_7
    and-int/lit8 v6, v0, 0xe

    const/16 v8, 0x8

    if-eq v6, v11, :cond_b

    and-int/2addr v0, v8

    if-eqz v0, :cond_a

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_8

    :cond_a
    const/4 v0, 0x0

    goto :goto_9

    :cond_b
    :goto_8
    move v0, v13

    :goto_9
    or-int/2addr v0, v3

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_c

    if-ne v3, v15, :cond_d

    :cond_c
    new-instance v3, Lk80/d;

    const/4 v0, 0x4

    invoke-direct {v3, v0, v2, v1}, Lk80/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v20, v3

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v1}, Lnm1/i;->g()Lnm1/f;

    move-result-object v3

    invoke-static {v0, v3}, Lnm1/h;->n(Landroidx/compose/ui/Modifier;Lnm1/f;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v16, v15

    const-wide/high16 v14, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v14

    int-to-float v6, v8

    mul-float/2addr v3, v6

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Lb2/e;->K:Lb2/l;

    int-to-float v8, v13

    const/16 v9, 0x36

    invoke-static {v8, v6, v3, v7, v9}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v3

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v14, v7, Lp1/q;->S:Z

    if-eqz v14, :cond_e

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_a
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v7, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-nez v8, :cond_f

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    :cond_f
    invoke-static {v6, v7, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lnm1/i;->e()Lgz0/m0;

    move-result-object v0

    const/4 v14, 0x5

    const/4 v15, 0x6

    if-eqz v0, :cond_12

    invoke-virtual {v1}, Lnm1/i;->g()Lnm1/f;

    move-result-object v0

    sget-object v3, Lnm1/f;->GENERAL_CHAT:Lnm1/f;

    if-eq v0, v3, :cond_12

    const v0, -0x213f5048

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    int-to-float v0, v14

    int-to-float v3, v11

    mul-float/2addr v0, v3

    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v1}, Lnm1/i;->e()Lgz0/m0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    invoke-static {v3, v7, v15}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    invoke-virtual {v1}, Lnm1/i;->d()Z

    move-result v6

    if-eqz v6, :cond_11

    const v6, 0x72fa01b

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    const/4 v9, 0x0

    invoke-static {v6, v7, v8, v9}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v17

    goto :goto_b

    :cond_11
    const/4 v9, 0x0

    const v6, 0x72fa458

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-static {v6, v7, v8, v9}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v17

    :goto_b
    const/16 v8, 0x1b0

    move v6, v9

    const/4 v9, 0x0

    move-object/from16 v19, v2

    move-object v2, v3

    const/4 v3, 0x0

    move v10, v4

    move-object/from16 v29, v5

    move-object/from16 v28, v19

    move-object v4, v0

    move v0, v6

    move-wide/from16 v5, v17

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_12
    move-object/from16 v28, v2

    move v10, v4

    move-object/from16 v29, v5

    const/4 v0, 0x0

    const v2, -0x213a65e0

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-static {v2, v7, v0, v13}, Lo01/d;->c(Lgz0/m0;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    :goto_c
    float-to-double v2, v10

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_13

    move v9, v13

    goto :goto_d

    :cond_13
    move v9, v0

    :goto_d
    if-nez v9, :cond_14

    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_14
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v3, v10, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual {v1}, Lnm1/i;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v7, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v7, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v4, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v8

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v26, v6, 0x12

    const v27, 0x2fff8

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move v10, v5

    move-wide/from16 v39, v8

    move-object v9, v4

    move-wide/from16 v4, v39

    const/4 v8, 0x0

    move-object v12, v9

    const/4 v9, 0x0

    move/from16 v17, v10

    const/4 v10, 0x0

    move/from16 v19, v11

    move-object/from16 v18, v12

    const-wide/16 v11, 0x0

    move/from16 v20, v13

    const/4 v13, 0x0

    move/from16 v21, v14

    const/4 v14, 0x0

    move/from16 v25, v15

    move-object/from16 v23, v16

    const-wide/16 v15, 0x0

    move/from16 v30, v17

    const/16 v17, 0x0

    move-object/from16 v31, v18

    const/16 v18, 0x0

    move/from16 v32, v19

    const/16 v19, 0x0

    move/from16 v33, v20

    const/16 v20, 0x0

    move/from16 v34, v21

    const/16 v21, 0x0

    move-object/from16 v35, v23

    const/16 v23, 0x0

    move/from16 v36, v25

    const/16 v25, 0x0

    move/from16 v38, v30

    move-object/from16 v37, v31

    move/from16 v1, v32

    move-object/from16 v0, v35

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    int-to-float v2, v1

    mul-float/2addr v2, v2

    move-object/from16 v3, v29

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lnm1/i;->g()Lnm1/f;

    move-result-object v3

    sget-object v4, Lnm1/f;->WIND_DOWN_REPORT:Lnm1/f;

    if-ne v3, v4, :cond_15

    const/4 v13, 0x1

    goto :goto_e

    :cond_15
    const/4 v13, 0x0

    :goto_e
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_16

    new-instance v3, Lnm1/g;

    const/4 v0, 0x0

    invoke-direct {v3, v0}, Lnm1/g;-><init>(I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v13, v3}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lnm1/i;->f()Lgz0/m0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v2, 0x6

    invoke-static {v0, v7, v2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lnm1/i;->g()Lnm1/f;

    move-result-object v0

    sget-object v3, Lnm1/h$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_19

    const/4 v3, 0x2

    if-eq v0, v3, :cond_19

    const/4 v3, 0x3

    if-eq v0, v3, :cond_19

    if-eq v0, v1, :cond_18

    const/4 v1, 0x5

    if-ne v0, v1, :cond_17

    const v0, 0x730337a

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    move-object/from16 v12, v37

    move/from16 v10, v38

    invoke-virtual {v12, v7, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->C()J

    move-result-wide v0

    const/4 v6, 0x0

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    :goto_f
    move-wide v5, v0

    goto :goto_10

    :cond_17
    const/4 v6, 0x0

    const v0, 0x730031c

    invoke-static {v0, v7, v6}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_18
    const/4 v6, 0x0

    const v0, 0x7302742

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    const-wide v0, 0xffefd19bL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    goto :goto_f

    :cond_19
    move-object/from16 v12, v37

    move/from16 v10, v38

    const/4 v6, 0x0

    const v0, 0x7301e98

    invoke-static {v7, v0, v12, v7, v10}, Lr80/c;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v0

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v3, 0x0

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x1

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    move-object/from16 v3, v28

    goto :goto_11

    :cond_1a
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v3, v4

    :goto_11
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1b

    new-instance v0, Lbz0/a;

    const/4 v5, 0x4

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lbz0/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Lnm1/i;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lnm1/i;->c()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v0

    invoke-static {p0, v0}, Lnm1/h;->l(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lnm1/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lnm1/h;->g(Lnm1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;
    .locals 11

    const/4 v9, 0x0

    const v10, 0x7fffb

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x3f7d70a4    # 0.99f

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v10}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v1, Lc51/h;

    const/4 v2, 0x7

    invoke-direct {v1, p1, v2}, Lc51/h;-><init>(Li2/t;I)V

    invoke-static {v0, v1}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-interface {p0, p1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Li2/t;Lk2/c;)Ll83/a0;
    .locals 11

    const-string v0, "$this$drawWithContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    const/16 v9, 0x9

    const/16 v10, 0x3e

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Landroidx/compose/ui/Modifier;Lnm1/f;)Landroidx/compose/ui/Modifier;
    .locals 10

    sget-object v0, Lnm1/h$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/4 v1, 0x3

    const/4 v2, 0x4

    if-eq p1, v2, :cond_1

    const/4 v3, 0x5

    if-eq p1, v3, :cond_0

    invoke-static {p0}, Lnm1/h;->o(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object p1

    int-to-float v1, v1

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    const v2, 0x3e4ccccd    # 0.2f

    invoke-static {v2, v0, p1, v1}, Landroidx/compose/foundation/a;->a(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object v3, Li2/t;->b:Li2/s;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const-wide v5, 0x80ffe3c2L

    invoke-static {v5, v6}, Li2/w0;->e(J)J

    move-result-wide v5

    new-instance v7, Li2/x;

    invoke-direct {v7, v5, v6}, Li2/x;-><init>(J)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const v6, 0x408dcdff

    invoke-static {v6}, Li2/w0;->c(I)J

    move-result-wide v6

    new-instance v8, Li2/x;

    invoke-direct {v8, v6, v7}, Li2/x;-><init>(J)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v4, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v6}, [Ll83/k;

    move-result-object v4

    const-wide/16 v7, 0x0

    const/16 v9, 0xe

    const-wide/16 v5, 0x0

    invoke-static/range {v3 .. v9}, Li2/s;->e(Li2/s;[Ll83/k;JJI)Li2/k0;

    move-result-object v3

    int-to-float v1, v1

    int-to-float v4, v2

    mul-float/2addr v1, v4

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    invoke-static {v0, v3, v1, p1, v2}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object p1

    :goto_0
    invoke-interface {p0, p1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Lc41/c5;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lc41/c5;-><init>(I)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 4

    const-string p2, "$this$composed"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p2, -0x5c1859fc

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    sget-object p2, Lx81/d;->a:Lx81/d;

    sget v0, Lx81/d;->b:I

    invoke-virtual {p2, p1, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p2

    invoke-virtual {p2}, Ly81/i;->W0()J

    move-result-wide v0

    const/4 p2, 0x3

    int-to-float p2, p2

    const/4 v2, 0x4

    int-to-float v2, v2

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {p2, v2, v3, v0, v1}, Ldc/b;->f(FFLb2/t;J)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-interface {p0, p2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method
