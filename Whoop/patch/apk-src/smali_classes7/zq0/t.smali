.class public abstract Lzq0/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lzq0/u;",
        "viewState",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Lzq0/u;Landroidx/compose/runtime/Composer;II)V",
        "community-everyday-stats_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lzq0/u;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzq0/t;->c(Landroidx/compose/ui/Modifier;Lzq0/u;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lzq0/u;Landroidx/compose/runtime/Composer;II)V
    .locals 43

    move-object/from16 v3, p1

    const-string v0, "viewState"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v0, -0xcf3f632

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x4

    const/4 v2, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v4, p3, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v1

    goto :goto_0

    :cond_1
    move v5, v2

    :goto_0
    or-int v5, p3, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move/from16 v5, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit8 v6, v5, 0x13

    const/16 v14, 0x12

    const/4 v15, 0x0

    const/4 v10, 0x1

    if-eq v6, v14, :cond_5

    move v6, v10

    goto :goto_3

    :cond_5
    move v6, v15

    :goto_3
    and-int/2addr v5, v10

    invoke-virtual {v11, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1a

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object v0, v12

    goto :goto_4

    :cond_6
    move-object v0, v4

    :goto_4
    const/4 v4, 0x3

    int-to-float v4, v4

    int-to-float v1, v1

    mul-float/2addr v4, v1

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    int-to-float v2, v2

    mul-float/2addr v2, v1

    invoke-static {v2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    int-to-float v6, v14

    mul-float/2addr v6, v1

    const/16 v7, 0xe

    int-to-float v7, v7

    mul-float/2addr v7, v1

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lx81/d;->a:Lx81/d;

    move/from16 p2, v14

    sget v14, Lx81/d;->b:I

    invoke-virtual {v9, v11, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move/from16 v17, v14

    invoke-virtual/range {v16 .. v16}, Ly81/i;->a1()J

    move-result-wide v13

    invoke-static {v8, v13, v14, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8, v5}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    invoke-static {v13, v14, v11, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    move/from16 v16, v4

    iget-wide v3, v11, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_7

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_5
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v11, v10, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v11, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    move-object/from16 v30, v0

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    move/from16 v31, v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_6

    :cond_8
    move/from16 v31, v1

    :goto_6
    invoke-static {v3, v11, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v11, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move/from16 v8, v17

    invoke-virtual {v9, v11, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    move-object/from16 p0, v2

    invoke-virtual/range {v17 .. v17}, Ly81/i;->a1()J

    move-result-wide v1

    invoke-static {v3, v1, v2, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x1

    int-to-float v3, v2

    mul-float v3, v3, v31

    mul-float v5, v31, v31

    invoke-static {v1, v3, v3, v5, v3}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->K:Lb2/l;

    invoke-static/range {v16 .. v16}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    move/from16 v23, v5

    const/16 v5, 0x36

    invoke-static {v2, v3, v11, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    move/from16 v16, v6

    iget-wide v5, v11, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v11}, Lp1/q;->i0()V

    move/from16 v21, v8

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_a

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v11, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    :cond_b
    invoke-static {v5, v11, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v11, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move/from16 v6, v16

    invoke-static {v6, v12}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lzq0/u;->b()Ly81/f;

    move-result-object v2

    const/4 v5, 0x0

    invoke-virtual {v2, v11, v5}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    move-object/from16 v2, p0

    invoke-static {v1, v6, v7, v2}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, Lb2/e;->E:Lb2/m;

    invoke-static {v6, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-eqz v5, :cond_d

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v11, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-nez v5, :cond_e

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_f

    :cond_e
    invoke-static {v7, v11, v7, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v11, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lzq0/u;->a()Lkd1/o;

    move-result-object v1

    instance-of v1, v1, Lkd1/o$a;

    move-object v5, v4

    invoke-virtual/range {p1 .. p1}, Lzq0/u;->a()Lkd1/o;

    move-result-object v4

    sget v8, Lkd1/o;->a:I

    move-object v6, v9

    const/4 v9, 0x3

    move-object v7, v5

    const/4 v5, 0x0

    move-object/from16 v16, v6

    const/4 v6, 0x0

    move-object/from16 v17, v11

    move-object v11, v7

    move-object/from16 v7, v17

    move/from16 v17, v21

    move/from16 v32, v23

    const/16 v18, 0x0

    invoke-static/range {v4 .. v9}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v4

    move-object/from16 v26, v7

    if-eqz v1, :cond_10

    sget-object v5, Ly2/j;->b:Ly2/b1;

    :goto_9
    move-object v8, v5

    goto :goto_a

    :cond_10
    sget-object v5, Ly2/j;->a:Ly2/b1;

    goto :goto_9

    :goto_a
    if-eqz v1, :cond_11

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float v1, v1, v31

    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    :goto_b
    move-object v6, v1

    move-object v1, v12

    goto :goto_c

    :cond_11
    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v1, v12}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    goto :goto_b

    :goto_c
    const/16 v12, 0x30

    move-object v2, v13

    const/16 v13, 0x68

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v21, v10

    const/4 v10, 0x0

    move-object/from16 v35, v0

    move-object/from16 v34, v1

    move-object v1, v2

    move-object/from16 p0, v3

    move-object v2, v11

    move-object/from16 v33, v16

    move-object/from16 v3, v21

    move-object/from16 v11, v26

    const/4 v0, 0x1

    invoke-static/range {v4 .. v13}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v5, v4

    const-wide/16 v7, 0x0

    cmpl-double v5, v5, v7

    if-lez v5, :cond_12

    goto :goto_d

    :cond_12
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_d
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v5, v4, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v4, Ll0/m;->e:Ll0/h;

    const/4 v6, 0x6

    invoke-static {v4, v14, v11, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_13

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_13
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v11, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-nez v4, :cond_15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    goto :goto_10

    :cond_14
    :goto_f
    move-object/from16 v4, v35

    goto :goto_11

    :cond_15
    :goto_10
    invoke-static {v6, v11, v6, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_f

    :goto_11
    invoke-static {v11, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lzq0/u;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v11, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    move/from16 v8, v17

    move-object/from16 v7, v33

    invoke-virtual {v7, v11, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->b()Lb91/a;

    move-result-object v24

    invoke-virtual {v7, v11, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    sget v12, Lb91/a;->d:I

    shl-int/lit8 v28, v12, 0x12

    const v29, 0x2fffa

    move-object/from16 v35, v4

    move-object v4, v5

    const/4 v5, 0x0

    move-object/from16 v16, v7

    move-wide/from16 v41, v9

    move v10, v6

    move-wide/from16 v6, v41

    const-wide/16 v8, 0x0

    move v12, v10

    const/4 v10, 0x0

    move-object/from16 v26, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move/from16 v19, v13

    const-wide/16 v13, 0x0

    move-object/from16 v20, v15

    const/4 v15, 0x0

    move-object/from16 v33, v16

    const/16 v16, 0x0

    move/from16 v21, v17

    move/from16 v22, v18

    const-wide/16 v17, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move-object/from16 v25, v20

    const/16 v20, 0x0

    move/from16 v27, v21

    const/16 v21, 0x0

    move/from16 v36, v22

    const/16 v22, 0x0

    move/from16 v37, v23

    const/16 v23, 0x0

    move-object/from16 v38, v25

    const/16 v25, 0x0

    move/from16 v39, v27

    const/16 v27, 0x0

    move-object/from16 v0, v33

    move-object/from16 v40, v35

    move-object/from16 v35, v1

    move-object/from16 v33, v2

    move/from16 v1, v36

    move/from16 v2, v39

    move-object/from16 v36, v3

    move/from16 v3, v37

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v26

    invoke-virtual/range {p1 .. p1}, Lzq0/u;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v11, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v11, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->c()Lb91/a;

    move-result-object v24

    invoke-virtual/range {p1 .. p1}, Lzq0/u;->e()Ly81/f;

    move-result-object v0

    invoke-virtual {v0, v11, v1}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    const/4 v11, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v26

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object/from16 v0, v34

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v21

    const/4 v0, 0x5

    int-to-float v0, v0

    mul-float v22, v0, v31

    const/16 v24, 0x0

    const/16 v26, 0x4

    move/from16 v25, v32

    move/from16 v23, v32

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v2, 0x9

    int-to-float v3, v2

    move-object/from16 v5, p0

    move/from16 v4, v31

    const/16 v6, 0x36

    invoke-static {v3, v4, v5, v11, v6}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v3

    iget-wide v4, v11, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-eqz v6, :cond_16

    move-object/from16 v6, v38

    invoke-virtual {v11, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_12
    move-object/from16 v6, v36

    goto :goto_13

    :cond_16
    invoke-virtual {v11}, Lp1/q;->s0()V

    goto :goto_12

    :goto_13
    invoke-static {v11, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v35

    invoke-static {v11, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-nez v3, :cond_17

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_18

    :cond_17
    move-object/from16 v5, v33

    goto :goto_15

    :cond_18
    :goto_14
    move-object/from16 v4, v40

    goto :goto_16

    :goto_15
    invoke-static {v4, v11, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_14

    :goto_16
    invoke-static {v11, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x1d239fbf

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lzq0/u;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsz0/q;

    invoke-virtual {v3}, Lsz0/q;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v3}, Lsz0/q;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v3}, Lsz0/q;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v11, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v13

    invoke-virtual {v4, v11, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->b1()J

    move-result-wide v15

    invoke-virtual {v4, v11, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->C()Lb91/a;

    move-result-object v17

    invoke-virtual {v4, v11, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->b()Lb91/a;

    move-result-object v18

    invoke-virtual {v4, v11, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->M()Lb91/a;

    move-result-object v19

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v4, 0x6

    shl-int/lit8 v7, v4, 0xc

    or-int/2addr v5, v7

    shl-int/lit8 v4, v4, 0x15

    or-int v23, v5, v4

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v5, v4, 0x3

    shl-int/lit8 v7, v4, 0x6

    or-int/2addr v5, v7

    shl-int/2addr v4, v2

    or-int v24, v5, v4

    const v25, 0xc16b

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v22, v11

    move-object v11, v3

    invoke-static/range {v4 .. v25}, Lsz0/p;->e(Landroidx/compose/ui/Modifier;Lsz0/f1;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZJJLb91/a;Lb91/a;Lb91/a;ZLc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v22

    goto :goto_17

    :cond_19
    const/4 v3, 0x1

    invoke-static {v11, v1, v3, v3}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v1, v30

    goto :goto_18

    :cond_1a
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v1, v4

    :goto_18
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1b

    new-instance v0, Lzi1/c0;

    const/16 v5, 0x8

    move-object/from16 v3, p1

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lzi1/c0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lzq0/u;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzq0/t;->b(Landroidx/compose/ui/Modifier;Lzq0/u;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
