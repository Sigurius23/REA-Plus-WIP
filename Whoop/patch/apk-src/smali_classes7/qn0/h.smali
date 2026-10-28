.class public abstract Lqn0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a1\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lkd1/o;",
        "headerImage",
        "Lcom/whoop/design/util/TextResource;",
        "challengeTitle",
        "ineligibleText",
        "Lf0/r1;",
        "scrollState",
        "Ll83/a0;",
        "d",
        "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lf0/r1;Landroidx/compose/runtime/Composer;I)V",
        "challenge-details_release"
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
.method public static synthetic a(Li2/k0;Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lqn0/h;->f(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lf0/r1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lqn0/h;->g(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lf0/r1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lf2/d;)Lf2/g;
    .locals 0

    invoke-static {p0}, Lqn0/h;->e(Lf2/d;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lf0/r1;Landroidx/compose/runtime/Composer;I)V
    .locals 42

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    move-object/from16 v4, p3

    move/from16 v14, p5

    const-string v1, "headerImage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "challengeTitle"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "scrollState"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p4

    check-cast v3, Lp1/q;

    const v1, -0x303ac771

    invoke-virtual {v3, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v14, 0x6

    if-nez v1, :cond_2

    and-int/lit8 v1, v14, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_1

    :cond_1
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, v14

    goto :goto_2

    :cond_2
    move v1, v14

    :goto_2
    and-int/lit8 v5, v14, 0x30

    if-nez v5, :cond_5

    and-int/lit8 v5, v14, 0x40

    if-nez v5, :cond_3

    invoke-virtual {v3, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_3

    :cond_3
    invoke-virtual {v3, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_3
    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_4

    :cond_4
    const/16 v5, 0x10

    :goto_4
    or-int/2addr v1, v5

    :cond_5
    and-int/lit16 v5, v14, 0x180

    if-nez v5, :cond_8

    and-int/lit16 v5, v14, 0x200

    if-nez v5, :cond_6

    invoke-virtual {v3, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_5

    :cond_6
    invoke-virtual {v3, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_5
    if-eqz v5, :cond_7

    const/16 v5, 0x100

    goto :goto_6

    :cond_7
    const/16 v5, 0x80

    :goto_6
    or-int/2addr v1, v5

    :cond_8
    and-int/lit16 v5, v14, 0xc00

    if-nez v5, :cond_a

    invoke-virtual {v3, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    const/16 v5, 0x800

    goto :goto_7

    :cond_9
    const/16 v5, 0x400

    :goto_7
    or-int/2addr v1, v5

    :cond_a
    and-int/lit16 v5, v1, 0x493

    const/16 v8, 0x492

    const/4 v9, 0x0

    if-eq v5, v8, :cond_b

    const/4 v5, 0x1

    goto :goto_8

    :cond_b
    move v5, v9

    :goto_8
    and-int/lit8 v8, v1, 0x1

    invoke-virtual {v3, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_14

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v11, v3, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v16, v1

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v10, v3, Lp1/q;->S:Z

    if-eqz v10, :cond_c

    invoke-virtual {v3, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_c
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_9
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v3, v10, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v3, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v15, v3, Lp1/q;->S:Z

    if-nez v15, :cond_d

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    :cond_d
    invoke-static {v11, v3, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v15, La3/k;->d:La3/i;

    invoke-static {v3, v15, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v9, 0x4c

    int-to-float v9, v9

    const/4 v11, 0x4

    int-to-float v11, v11

    mul-float/2addr v9, v11

    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v9, v11, :cond_f

    new-instance v9, Lqe0/b;

    const/16 v11, 0xd

    invoke-direct {v9, v11}, Lqe0/b;-><init>(I)V

    invoke-virtual {v3, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v9}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v9, v12

    const/4 v12, 0x6

    move-object v11, v13

    const/4 v13, 0x0

    move-object/from16 v19, v10

    const/4 v10, 0x0

    move-object/from16 v20, v11

    const/4 v11, 0x0

    move-object/from16 v41, v8

    move-object v8, v2

    move-object/from16 v2, v41

    move-object/from16 v41, v9

    move-object v9, v4

    move-object/from16 v4, v41

    move-object/from16 v41, v20

    invoke-static/range {v8 .. v13}, Lrn0/b;->c(Landroidx/compose/ui/Modifier;Lf0/r1;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    sget v8, Lkd1/o;->a:I

    and-int/lit8 v9, v16, 0xe

    or-int/2addr v8, v9

    move-object v9, v5

    const/4 v5, 0x3

    move-object v10, v1

    const/4 v1, 0x0

    move-object v11, v2

    const/4 v2, 0x0

    move-object v13, v4

    move v4, v8

    move-object v12, v11

    move/from16 v8, v16

    move-object/from16 v11, v19

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    const/16 v23, 0x6030

    const/16 v24, 0x68

    const/16 v16, 0x0

    const/4 v0, 0x2

    const/16 v18, 0x0

    sget-object v19, Ly2/j;->a:Ly2/b1;

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v22, v1

    move v1, v0

    move-object v0, v15

    move-object/from16 v15, v22

    move-object/from16 v22, v3

    invoke-static/range {v15 .. v24}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    sget-object v2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    move-object/from16 v4, v41

    invoke-virtual {v2, v4, v9}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const/16 v2, 0xd

    int-to-float v2, v2

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v17, v2, v5

    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v16, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    const/4 v1, 0x0

    invoke-static {v9, v15, v3, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    move-object/from16 p4, v2

    iget-wide v1, v3, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    move-object/from16 v15, p4

    invoke-static {v3, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v3}, Lp1/q;->i0()V

    move/from16 v16, v5

    iget-boolean v5, v3, Lp1/q;->S:Z

    if-eqz v5, :cond_10

    invoke-virtual {v3, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_10
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v3, v11, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v12, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v3, Lp1/q;->S:Z

    if-nez v2, :cond_11

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    :cond_11
    invoke-static {v1, v3, v1, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v3, v0, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v0, 0x13

    int-to-float v0, v0

    mul-float v0, v0, v16

    const/4 v1, 0x2

    int-to-float v1, v1

    mul-float v1, v1, v16

    const-wide/high16 v9, 0x4004000000000000L    # 2.5

    double-to-float v2, v9

    mul-float v2, v2, v16

    invoke-static {v4, v2, v0, v2, v1}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v16

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shr-int/lit8 v1, v8, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int/2addr v1, v0

    invoke-static {v6, v3, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v15

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v3, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->O()Lb91/a;

    move-result-object v35

    invoke-virtual {v1, v3, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v17

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v39, v1, 0x12

    const v40, 0x2fff8

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v38, 0x0

    move-object/from16 v37, v3

    invoke-static/range {v15 .. v40}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    if-nez v7, :cond_13

    const v0, 0x6a0209f8

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    const/4 v1, 0x0

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    :goto_b
    const/4 v0, 0x1

    goto :goto_c

    :cond_13
    const/4 v1, 0x0

    const v2, 0x6a0209f9

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    invoke-static {v7, v3, v0}, Lqn0/i;->b(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    goto :goto_b

    :goto_c
    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_14
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_15

    new-instance v0, Lq51/a;

    const/16 v6, 0xb

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object v3, v7

    move v5, v14

    invoke-direct/range {v0 .. v6}, Lq51/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final e(Lf2/d;)Lf2/g;
    .locals 8

    const-string v0, "$this$drawWithCache"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    const/4 v0, 0x0

    invoke-static {v0}, Li2/w0;->c(I)J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    const-wide v2, 0xff101518L

    invoke-static {v2, v3}, Li2/w0;->e(J)J

    move-result-wide v2

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-static {v4, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    new-instance v4, Li2/x;

    invoke-direct {v4, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v0, v4}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v0

    new-instance v1, Lnq2/c;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lnq2/c;-><init>(Li2/k0;I)V

    invoke-virtual {p0, v1}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Li2/t;Lk2/c;)Ll83/a0;
    .locals 11

    const-string v0, "$this$onDrawWithContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    const/4 v9, 0x0

    const/16 v10, 0x7e

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

.method private static final g(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lf0/r1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lqn0/h;->d(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lf0/r1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
