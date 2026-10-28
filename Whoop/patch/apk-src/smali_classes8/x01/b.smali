.class public abstract Lx01/b;
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
        "Lx01/c;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Lx01/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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

    invoke-static {p0}, Lx01/b;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lx01/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lx01/b;->f(Lkotlin/jvm/functions/Function1;Lx01/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lx01/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lx01/b;->g(Landroidx/compose/ui/Modifier;Lx01/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lx01/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lx01/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v0, 0x24d8e420

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v2, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v6, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v2

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v6, v1

    :goto_1
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_5

    and-int/lit8 v7, v1, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v13, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v6, v6, 0x180

    :cond_6
    move-object/from16 v10, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v10, v1, 0x180

    if-nez v10, :cond_6

    move-object/from16 v10, p2

    invoke-virtual {v13, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x100

    goto :goto_4

    :cond_8
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v6, v11

    :goto_5
    and-int/lit16 v11, v6, 0x93

    const/16 v12, 0x92

    const/4 v14, 0x0

    if-eq v11, v12, :cond_9

    const/4 v11, 0x1

    goto :goto_6

    :cond_9
    move v11, v14

    :goto_6
    and-int/lit8 v12, v6, 0x1

    invoke-virtual {v13, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_1e

    sget-object v16, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_a

    move-object/from16 v4, v16

    :cond_a
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_c

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_b

    new-instance v7, Lwz/h1;

    const/4 v10, 0x2

    invoke-direct {v7, v10}, Lwz/h1;-><init>(I)V

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v12, v7

    goto :goto_7

    :cond_c
    move-object v12, v10

    :goto_7
    invoke-virtual {v5}, Lx01/c;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v13, v14}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v5}, Lx01/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v13, v14}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v32

    invoke-virtual {v5}, Lx01/c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v13, v14}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v33

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v11, 0x3

    int-to-float v11, v11

    int-to-float v2, v2

    invoke-static {v10, v11, v2}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Lx81/d;->a:Lx81/d;

    const/4 v15, 0x6

    invoke-virtual {v11, v13, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    move-object/from16 p0, v4

    invoke-virtual/range {v17 .. v17}, Ly81/i;->W0()J

    move-result-wide v3

    sget-object v7, Li2/w0;->a:Li2/v0;

    invoke-static {v10, v3, v4, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v5}, Lx01/c;->e()Lcom/whoop/navigation/e;

    move-result-object v4

    if-eqz v4, :cond_13

    const v4, -0xc1bf2f3

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_d

    invoke-static {v13}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v4

    :cond_d
    move-object/from16 v17, v4

    check-cast v17, Lj0/i;

    const-wide/16 v8, 0x0

    const/4 v4, 0x7

    const/4 v10, 0x0

    invoke-static {v8, v9, v4, v14, v10}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v4

    new-instance v8, Li3/i;

    invoke-direct {v8, v14}, Li3/i;-><init>(I)V

    and-int/lit16 v9, v6, 0x380

    const/16 v10, 0x100

    if-ne v9, v10, :cond_e

    const/4 v9, 0x1

    goto :goto_8

    :cond_e
    move v9, v14

    :goto_8
    and-int/lit8 v10, v6, 0x70

    const/16 v7, 0x20

    if-eq v10, v7, :cond_10

    and-int/lit8 v6, v6, 0x40

    if-eqz v6, :cond_f

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_f

    goto :goto_9

    :cond_f
    move v6, v14

    goto :goto_a

    :cond_10
    :goto_9
    const/4 v6, 0x1

    :goto_a
    or-int/2addr v6, v9

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_11

    if-ne v7, v0, :cond_12

    :cond_11
    new-instance v7, Lwr0/r;

    const/4 v0, 0x2

    invoke-direct {v7, v12, v5, v0}, Lwr0/r;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object/from16 v21, v7

    check-cast v21, Lc93/a;

    const/16 v22, 0xc

    const/16 v19, 0x0

    move-object/from16 v18, v4

    move-object/from16 v20, v8

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v4, v16

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_13
    move-object/from16 v4, v16

    const v0, -0xc17f86e

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    move-object v0, v4

    :goto_b
    invoke-interface {v3, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v6, 0x3ff4000000000000L    # 1.25

    double-to-float v3, v6

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v3, v6

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Lb2/e;->K:Lb2/l;

    const/4 v7, 0x2

    int-to-float v7, v7

    const/16 v8, 0x36

    invoke-static {v7, v6, v3, v13, v8}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v3

    iget-wide v6, v13, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v13, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-eqz v9, :cond_14

    invoke-virtual {v13, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_14
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_c
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v13, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v13, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-nez v10, :cond_15

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v10, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_16

    :cond_15
    invoke-static {v6, v13, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v14, La3/k;->d:La3/i;

    invoke-static {v13, v14, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lx01/c;->c()Lkd1/o;

    move-result-object v0

    if-nez v0, :cond_17

    sget-object v0, Lkd1/o$b;->b:Lkd1/o$b;

    :cond_17
    move-object v6, v0

    const/4 v10, 0x0

    move-object v0, v11

    const/4 v11, 0x3

    move-object/from16 v17, v7

    const/4 v7, 0x0

    move-object/from16 v18, v8

    const/4 v8, 0x0

    move-object/from16 v34, v13

    move-object v13, v9

    move-object/from16 v9, v34

    move-object/from16 v34, v17

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    move-object/from16 v28, v9

    invoke-static/range {v23 .. v23}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_18

    const/4 v7, 0x0

    goto :goto_d

    :cond_18
    move-object/from16 v7, v23

    :goto_d
    const/16 v8, 0x9

    int-to-float v8, v8

    mul-float/2addr v8, v2

    invoke-static {v8, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, Lt0/j;->a:Lt0/i;

    invoke-static {v2, v8}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object v2, v14

    const/16 v14, 0x6000

    move v9, v15

    const/16 v15, 0x68

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    sget-object v10, Ly2/j;->a:Ly2/b1;

    move/from16 v17, v11

    const/4 v11, 0x0

    move-object/from16 v19, v12

    const/4 v12, 0x0

    move-object/from16 p3, v2

    move-object/from16 v35, v3

    move-object v2, v13

    move/from16 v5, v17

    move-object/from16 v1, v18

    move-object/from16 p2, v19

    move-object/from16 v13, v28

    const/4 v3, 0x1

    const/16 v16, 0x0

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0, v13, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v0, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v8

    const/high16 v6, 0x3f800000    # 1.0f

    float-to-double v10, v6

    const-wide/16 v14, 0x0

    cmpl-double v7, v10, v14

    if-lez v7, :cond_19

    move v14, v3

    goto :goto_e

    :cond_19
    move/from16 v14, v16

    :goto_e
    if-nez v14, :cond_1a

    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_1a
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v7, v6, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v30, 0xc30

    const v31, 0x2d7f8

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v28, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x2

    const/16 v22, 0x0

    move-object/from16 v6, v23

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    sget-object v6, Lb2/e;->O:Lb2/k;

    sget-object v7, Ll0/m;->c:Ll0/g;

    const/16 v8, 0x30

    invoke-static {v7, v6, v13, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v13, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v13, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-eqz v9, :cond_1b

    invoke-virtual {v13, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_1b
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v13, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v35

    invoke-static {v13, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_1c

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    :cond_1c
    move-object/from16 v1, v34

    goto :goto_11

    :cond_1d
    :goto_10
    move-object/from16 v2, p3

    goto :goto_12

    :goto_11
    invoke-static {v7, v13, v7, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_10

    :goto_12
    invoke-static {v13, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0, v13, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->E()Lb91/a;

    move-result-object v26

    invoke-virtual {v0, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v8

    const/16 v30, 0xc00

    const v31, 0x2dffa

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v28, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v6, v32

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    invoke-virtual {v0, v13, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->d()Lb91/a;

    move-result-object v26

    invoke-virtual {v0, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v8

    const/4 v13, 0x0

    move-object/from16 v6, v33

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    move-object/from16 v4, p0

    move-object/from16 v6, p2

    goto :goto_13

    :cond_1e
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v6, v10

    :goto_13
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1f

    new-instance v0, Lwr0/f;

    const/4 v3, 0x7

    move-object/from16 v5, p1

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lwr0/f;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Lx01/c;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lx01/c;->e()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lx01/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lx01/b;->d(Landroidx/compose/ui/Modifier;Lx01/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
