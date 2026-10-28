.class public abstract Lzi1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lyi1/d$a;",
        "viewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onRetry",
        "c",
        "(Lyi1/d$a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "kennel_release"
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
.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lzi1/a;->d()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lyi1/d$a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzi1/a;->e(Lyi1/d$a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lyi1/d$a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyi1/d$a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v0, 0x551422a6

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v10, 0x4

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

    move v0, v10

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

    if-eqz v2, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v3, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p1

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x20

    goto :goto_3

    :cond_5
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v0, v4

    :goto_4
    and-int/lit8 v4, v0, 0x13

    const/4 v13, 0x1

    const/16 v14, 0x12

    if-eq v4, v14, :cond_6

    move v4, v13

    goto :goto_5

    :cond_6
    const/4 v4, 0x0

    :goto_5
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v11, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_10

    if-eqz v2, :cond_8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_7

    new-instance v2, Lzc1/h6;

    const/16 v3, 0x1d

    invoke-direct {v2, v3}, Lzc1/h6;-><init>(I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lc93/a;

    move-object/from16 v28, v2

    goto :goto_6

    :cond_8
    move-object/from16 v28, v3

    :goto_6
    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v15}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x3

    int-to-float v5, v4

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v7, v5, v6

    const/4 v8, 0x6

    int-to-float v9, v8

    mul-float/2addr v9, v6

    invoke-static {v3, v7, v9}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Lb2/e;->N:Lb2/k;

    sget-object v7, Ll0/m;->e:Ll0/h;

    const/16 v9, 0x36

    invoke-static {v7, v6, v11, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move v7, v5

    iget-wide v4, v11, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-eqz v12, :cond_9

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v11, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v11, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-nez v6, :cond_a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    :cond_a
    invoke-static {v4, v11, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v11, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v3, v2

    const-wide/16 v29, 0x0

    cmpl-double v3, v3, v29

    const-string v31, "invalid weight; must be greater than zero"

    if-lez v3, :cond_c

    goto :goto_8

    :cond_c
    invoke-static/range {v31 .. v31}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v32, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v4, v2, v32

    if-lez v4, :cond_d

    move/from16 v2, v32

    :cond_d
    invoke-direct {v3, v2, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v11, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v1}, Lyi1/d$a;->a()Lgz0/m0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-static {v2, v11, v8}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v12, v11, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->X0()J

    move-result-wide v5

    const/16 v8, 0x30

    const/4 v9, 0x4

    move v4, v3

    const/4 v3, 0x0

    move/from16 v16, v4

    const/4 v4, 0x0

    move/from16 p1, v7

    move-object v7, v11

    move/from16 v11, v16

    const/4 v13, 0x3

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    int-to-float v2, v10

    mul-float v3, v2, v2

    invoke-static {v3, v15}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v7, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v1}, Lyi1/d$a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v7, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v12, v7, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->q()Lb91/a;

    move-result-object v22

    invoke-virtual {v12, v7, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    move v8, v14

    new-instance v14, Lw3/k;

    invoke-direct {v14, v13}, Lw3/k;-><init>(I)V

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v26, v9, 0x12

    const v27, 0x2fdfa

    move v9, v2

    move-object v2, v3

    const/4 v3, 0x0

    move v10, v4

    move-wide v4, v5

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move/from16 v17, v8

    const/4 v8, 0x0

    move/from16 v18, v9

    const/4 v9, 0x0

    move/from16 v19, v10

    const/4 v10, 0x0

    move/from16 v21, v11

    move-object/from16 v20, v12

    const-wide/16 v11, 0x0

    move/from16 v23, v13

    const/4 v13, 0x0

    move-object/from16 v33, v15

    const/16 v25, 0x1

    const-wide/16 v15, 0x0

    move/from16 v34, v17

    const/16 v17, 0x0

    move/from16 v35, v18

    const/16 v18, 0x0

    move/from16 v36, v19

    const/16 v19, 0x0

    move-object/from16 v37, v20

    const/16 v20, 0x0

    move/from16 v38, v21

    const/16 v21, 0x0

    move/from16 v39, v23

    const/16 v23, 0x0

    move/from16 v40, v25

    const/16 v25, 0x0

    move/from16 v41, v0

    move-object/from16 v0, v33

    const/4 v1, 0x2

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    int-to-float v1, v1

    mul-float v1, v1, v35

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lyi1/d$a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move/from16 v10, v36

    invoke-static {v1, v7, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v1, v37

    move/from16 v11, v38

    invoke-virtual {v1, v7, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->c()Lb91/a;

    move-result-object v22

    invoke-virtual {v1, v7, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->b1()J

    move-result-wide v4

    new-instance v14, Lw3/k;

    const/4 v13, 0x3

    invoke-direct {v14, v13}, Lw3/k;-><init>(I)V

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move/from16 v1, p1

    move-object/from16 v7, v24

    move/from16 v9, v35

    invoke-static {v1, v9, v0, v7}, Ld;->w(FFLb2/t;Lp1/q;)V

    sget-object v3, Lny0/v;->TextSmall:Lny0/v;

    sget v0, Lti1/d;->l:I

    invoke-static {v7, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    const/high16 v0, 0x1c00000

    shl-int/lit8 v1, v41, 0x12

    and-int/2addr v0, v1

    or-int/lit8 v12, v0, 0x30

    const/16 v13, 0x79

    const/4 v2, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v9, 0x0

    move-object/from16 v11, v24

    move-object/from16 v10, v28

    invoke-static/range {v2 .. v13}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v11

    const/high16 v0, 0x40a00000    # 5.0f

    float-to-double v1, v0

    cmpl-double v1, v1, v29

    if-lez v1, :cond_e

    goto :goto_9

    :cond_e
    invoke-static/range {v31 .. v31}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_9
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v2, v0, v32

    if-lez v2, :cond_f

    move/from16 v0, v32

    :cond_f
    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v7, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move-object v3, v10

    goto :goto_a

    :cond_10
    move-object v7, v11

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v0, Lwq1/b;

    const/16 v5, 0x1a

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lwq1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final d()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Lyi1/d$a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzi1/a;->c(Lyi1/d$a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
