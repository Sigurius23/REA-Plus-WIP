.class public abstract Lk51/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aU\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0014\u0008\u0002\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "icon",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "body",
        "Lc41/t0;",
        "coachingCtaTileState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onCoachingCtaTileClicked",
        "d",
        "(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/t0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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

    invoke-static {p0}, Lk51/b;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lk51/b;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/t0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lk51/b;->g(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/t0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/t0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/lang/Integer;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lc41/t0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v7, p7

    const-string v0, "title"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p6

    check-cast v13, Lp1/q;

    const v0, 0x2f92313

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p8, 0x1

    const/4 v1, 0x4

    const/4 v5, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v6, v7, 0x6

    move v8, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v7, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v13, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    move v8, v1

    goto :goto_0

    :cond_1
    move v8, v5

    :goto_0
    or-int/2addr v8, v7

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v8, v7

    :goto_1
    and-int/lit8 v9, v7, 0x30

    if-nez v9, :cond_4

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    const/16 v9, 0x20

    goto :goto_2

    :cond_3
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v8, v9

    :cond_4
    and-int/lit16 v9, v7, 0x180

    if-nez v9, :cond_6

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x100

    goto :goto_3

    :cond_5
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v8, v9

    :cond_6
    and-int/lit16 v9, v7, 0xc00

    if-nez v9, :cond_8

    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x800

    goto :goto_4

    :cond_7
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v8, v9

    :cond_8
    and-int/lit8 v9, p8, 0x10

    if-eqz v9, :cond_a

    or-int/lit16 v8, v8, 0x6000

    :cond_9
    move-object/from16 v10, p4

    goto :goto_6

    :cond_a
    and-int/lit16 v10, v7, 0x6000

    if-nez v10, :cond_9

    move-object/from16 v10, p4

    invoke-virtual {v13, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x4000

    goto :goto_5

    :cond_b
    const/16 v11, 0x2000

    :goto_5
    or-int/2addr v8, v11

    :goto_6
    and-int/lit8 v11, p8, 0x20

    const/high16 v14, 0x30000

    if-eqz v11, :cond_d

    or-int/2addr v8, v14

    :cond_c
    move-object/from16 v14, p5

    :goto_7
    move/from16 v34, v8

    goto :goto_9

    :cond_d
    and-int/2addr v14, v7

    if-nez v14, :cond_c

    move-object/from16 v14, p5

    invoke-virtual {v13, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_e

    const/high16 v15, 0x20000

    goto :goto_8

    :cond_e
    const/high16 v15, 0x10000

    :goto_8
    or-int/2addr v8, v15

    goto :goto_7

    :goto_9
    const v8, 0x12493

    and-int v8, v34, v8

    const v15, 0x12492

    move/from16 p6, v9

    const/4 v14, 0x1

    if-eq v8, v15, :cond_f

    move v8, v14

    goto :goto_a

    :cond_f
    const/4 v8, 0x0

    :goto_a
    and-int/lit8 v15, v34, 0x1

    invoke-virtual {v13, v15, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_21

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_10

    move-object v6, v15

    :cond_10
    if-eqz p6, :cond_11

    const/4 v0, 0x0

    goto :goto_b

    :cond_11
    move-object v0, v10

    :goto_b
    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v11, :cond_13

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v8, :cond_12

    new-instance v10, Ljp2/f;

    const/16 v11, 0x14

    invoke-direct {v10, v11}, Ljp2/f;-><init>(I)V

    invoke-virtual {v13, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v10, Lkotlin/jvm/functions/Function1;

    goto :goto_c

    :cond_13
    move-object/from16 v10, p5

    :goto_c
    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    int-to-float v11, v14

    int-to-float v1, v1

    mul-float v14, v11, v1

    const/4 v9, 0x0

    invoke-static {v12, v14, v9, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-interface {v5, v6}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    const/4 v14, 0x0

    invoke-static {v9, v12, v13, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    move-object v12, v15

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v13, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    move-object/from16 v35, v6

    iget-boolean v6, v13, Lp1/q;->S:Z

    if-eqz v6, :cond_14

    invoke-virtual {v13, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_14
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_d
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v13, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v13, v9, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-nez v7, :cond_15

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move-object/from16 p4, v8

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_16

    goto :goto_e

    :cond_15
    move-object/from16 p4, v8

    :goto_e
    invoke-static {v14, v13, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v13, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v19, v11, v5

    const/16 v20, 0x7

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v8, v15

    move-object v15, v12

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v14, Lb2/e;->K:Lb2/l;

    sget-object v15, Ll0/m;->a:Ll0/e;

    move/from16 v16, v5

    const/16 v5, 0x30

    invoke-static {v15, v14, v13, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v13, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v13}, Lp1/q;->i0()V

    move-object/from16 p5, v10

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_17

    invoke-virtual {v13, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_17
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v13, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v9, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v13, Lp1/q;->S:Z

    if-nez v2, :cond_18

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    :cond_18
    invoke-static {v14, v13, v14, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    invoke-static {v13, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v2, 0x6

    if-eqz p1, :cond_1a

    const v5, 0x1017a0ef

    invoke-virtual {v13, v5}, Lp1/q;->e0(I)V

    int-to-float v5, v2

    mul-float/2addr v5, v1

    invoke-static {v5, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    and-int/lit8 v6, v34, 0x70

    or-int/2addr v6, v2

    invoke-static {v5, v13, v6}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v8

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v13, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    const/16 v14, 0x1b0

    const/4 v15, 0x0

    const/4 v9, 0x0

    move-object/from16 v36, p4

    move-object v7, v12

    const/high16 v2, 0x3f800000    # 1.0f

    move-wide v11, v5

    const/4 v5, 0x0

    move-object/from16 v6, p5

    invoke-static/range {v8 .. v15}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v5}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_1a
    move-object/from16 v36, p4

    move-object/from16 v6, p5

    move-object v7, v12

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    const v8, 0x101b81a9

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v5}, Lp1/q;->q(Z)V

    :goto_10
    shr-int/lit8 v8, v34, 0x6

    and-int/lit8 v8, v8, 0xe

    invoke-static {v3, v13, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    float-to-double v9, v2

    const-wide/16 v11, 0x0

    cmpl-double v9, v9, v11

    if-lez v9, :cond_1b

    goto :goto_11

    :cond_1b
    const-string v9, "invalid weight; must be greater than zero"

    invoke-static {v9}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_11
    new-instance v9, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v10, 0x1

    invoke-direct {v9, v2, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    if-nez p1, :cond_1c

    move v2, v5

    goto :goto_12

    :cond_1c
    move v2, v10

    :goto_12
    int-to-float v2, v2

    mul-float v18, v2, v16

    const/16 v21, 0x0

    const/16 v22, 0xe

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v9

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v2, Lx81/d;->a:Lx81/d;

    const/4 v11, 0x6

    invoke-virtual {v2, v13, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v14

    invoke-virtual {v2, v13, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->a()Lb91/a;

    move-result-object v28

    const/16 v32, 0x0

    const v33, 0x2fff8

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    move/from16 v21, v10

    move-wide v10, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v37, v21

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    move/from16 v5, v37

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    invoke-virtual {v13, v5}, Lp1/q;->q(Z)V

    shr-int/lit8 v8, v34, 0x9

    and-int/lit8 v8, v8, 0xe

    invoke-static {v4, v13, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x6

    invoke-virtual {v2, v13, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->b1()J

    move-result-wide v9

    invoke-virtual {v2, v13, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->a()Lb91/a;

    move-result-object v28

    const v33, 0x2fffa

    move-wide v10, v9

    const/4 v9, 0x0

    const-wide/16 v12, 0x0

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    if-eqz v0, :cond_20

    const v2, 0x42b6151a

    invoke-static {v13, v2, v1, v1, v7}, Lih0/d0;->f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v13, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v1, Lc41/r0;

    invoke-direct {v1}, Lc41/r0;-><init>()V

    const/high16 v2, 0x70000

    and-int v2, v34, v2

    const/high16 v7, 0x20000

    if-ne v2, v7, :cond_1d

    move v9, v5

    goto :goto_13

    :cond_1d
    const/4 v9, 0x0

    :goto_13
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v9, :cond_1e

    move-object/from16 v7, v36

    if-ne v2, v7, :cond_1f

    :cond_1e
    new-instance v2, Ljp1/n;

    const/16 v7, 0xb

    invoke-direct {v2, v6, v7}, Ljp1/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v2, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v7, v34, 0xc

    and-int/lit8 v7, v7, 0xe

    invoke-virtual {v1, v0, v2, v13, v7}, Lc41/r0;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v14, 0x0

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_20
    const/4 v14, 0x0

    const v1, 0x42b90f25

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual {v13, v5}, Lp1/q;->q(Z)V

    move-object v5, v0

    move-object/from16 v1, v35

    goto :goto_15

    :cond_21
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v1, v6

    move-object v5, v10

    move-object/from16 v6, p5

    :goto_15
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_22

    new-instance v0, Laz1/f;

    const/16 v9, 0x10

    move-object/from16 v2, p1

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Laz1/f;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_22
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/t0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lk51/b;->d(Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc41/t0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
