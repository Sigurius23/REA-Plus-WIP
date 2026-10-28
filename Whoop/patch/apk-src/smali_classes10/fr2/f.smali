.class public abstract Lfr2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lfr2/b;",
        "viewState",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "d",
        "(Lfr2/b;ZLandroidx/compose/runtime/Composer;I)V",
        "user-journey_release"
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
.method public static synthetic a(Lfr2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lfr2/f;->e(Lfr2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lfr2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lfr2/f;->f(Lfr2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lfr2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lfr2/f;->g(Lfr2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lfr2/b;ZLandroidx/compose/runtime/Composer;I)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v3, 0x3c4d6859

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, p3, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int v3, p3, v3

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v7, v1}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    const/4 v15, 0x0

    const/4 v10, 0x1

    if-eq v5, v6, :cond_5

    move v5, v10

    goto :goto_4

    :cond_5
    move v5, v15

    :goto_4
    and-int/2addr v3, v10

    invoke-virtual {v7, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_10

    if-eqz v1, :cond_f

    const v3, 0x7404802e

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v3, v5, :cond_6

    new-instance v3, Ld0/q0;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v3, v5}, Ld0/q0;-><init>(Ljava/lang/Object;)V

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v5}, Ld0/q0;->I0(Ljava/lang/Boolean;)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Ld0/q0;

    const/high16 v11, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-eqz v10, :cond_7

    invoke-virtual {v7, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v7, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v7, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v15, v7, Lp1/q;->S:Z

    if-nez v15, :cond_8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_9

    :cond_8
    invoke-static {v8, v7, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v14, La3/k;->d:La3/i;

    invoke-static {v7, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v5, 0x8c

    int-to-float v5, v5

    int-to-float v4, v4

    mul-float/2addr v5, v4

    invoke-static {v5, v12}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v11, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v0}, Lfr2/b;->e()Lkd1/o;

    move-result-object v4

    sget v8, Lkd1/o;->a:I

    move-object v5, v9

    const/4 v9, 0x3

    move-object/from16 v16, v5

    const/4 v5, 0x0

    move-object/from16 v17, v6

    const/4 v6, 0x0

    move-object/from16 v19, v16

    move-object/from16 v18, v17

    invoke-static/range {v4 .. v9}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v4

    move-object v5, v12

    const/16 v12, 0x61b0

    move-object v6, v13

    const/16 v13, 0x68

    move-object v8, v5

    const/4 v5, 0x0

    move v9, v11

    move-object v11, v7

    const/4 v7, 0x0

    move-object/from16 v16, v8

    sget-object v8, Ly2/j;->a:Ly2/b1;

    move/from16 v17, v9

    const/4 v9, 0x0

    move-object/from16 v20, v10

    const/4 v10, 0x0

    move-object v1, v15

    move-object v15, v6

    move-object v6, v1

    move-object/from16 v2, v16

    move/from16 v1, v17

    move-object/from16 v16, v3

    move-object/from16 v3, v20

    invoke-static/range {v4 .. v13}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v11

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v4, 0x4004000000000000L    # 2.5

    double-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v2, v4, v5, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v6, 0x0

    invoke-static {v4, v5, v7, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_a

    invoke-virtual {v7, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v7, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v18

    invoke-static {v7, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_b

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    move-object/from16 v3, v19

    invoke-static {v5, v7, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v7, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v2, v1

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_d

    const/4 v10, 0x1

    goto :goto_7

    :cond_d
    const/4 v10, 0x0

    :goto_7
    if-nez v10, :cond_e

    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_e
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v7, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v1, Lfr2/e;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lfr2/e;-><init>(Lfr2/b;I)V

    const v2, 0x34422bd2

    invoke-static {v2, v7, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const/4 v9, 0x2

    const/4 v5, 0x0

    const/16 v8, 0x180

    move-object/from16 v4, v16

    invoke-static/range {v4 .. v9}, Lkr2/b;->k(Ld0/q0;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    new-instance v1, Lfr2/e;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lfr2/e;-><init>(Lfr2/b;I)V

    const v2, 0x30238f3b

    invoke-static {v2, v7, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    invoke-static/range {v4 .. v9}, Lkr2/b;->k(Ld0/q0;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x1

    const/4 v6, 0x0

    invoke-static {v7, v3, v3, v6}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_8

    :cond_f
    move v6, v15

    const v1, 0x741be3a9

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_10
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_11

    new-instance v2, Lfr2/c;

    const/4 v3, 0x1

    move/from16 v4, p1

    move/from16 v5, p3

    invoke-direct {v2, v0, v4, v5, v3}, Lfr2/c;-><init>(Lfr2/b;ZII)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final e(Lfr2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 29

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v3, p1

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    int-to-float v0, v2

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float v8, v0, v1

    const/4 v9, 0x7

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v1, "WirIntroStepViewV2Footer"

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lfr2/b;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v3, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lfr2/a;->b()Lb91/a;

    move-result-object v23

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v3, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v5

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v27, v1, 0x12

    const v28, 0x2fff8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x30

    move-object/from16 v25, v3

    move-object v3, v0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v25, v3

    invoke-virtual/range {v25 .. v25}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lfr2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 28

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x5

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float v7, v0, v1

    const/4 v8, 0x7

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lfr2/b;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v2, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v1, v2, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v1, v2, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->b1()J

    move-result-wide v4

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v26, v1, 0x12

    const v27, 0x2fff8

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x30

    move-object/from16 v24, v2

    move-object v2, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v24, v2

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lfr2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lfr2/f;->d(Lfr2/b;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
