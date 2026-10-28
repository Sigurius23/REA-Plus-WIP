.class public abstract Lqk2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lok2/i;",
        "itemState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "b",
        "(Lok2/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "track-activity_release"
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
.method public static synthetic a(Lok2/i;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lqk2/j;->c(Lok2/i;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lok2/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 39

    move-object/from16 v1, p0

    const-string v0, "itemState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v2, -0x7019ba0e

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_2

    and-int/lit8 v2, p3, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    or-int v2, p3, v2

    goto :goto_2

    :cond_2
    move/from16 v2, p3

    :goto_2
    and-int/lit8 v5, p4, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_3

    :cond_5
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v2, v7

    :goto_4
    and-int/lit8 v7, v2, 0x13

    const/4 v8, 0x1

    const/16 v9, 0x12

    const/4 v10, 0x0

    if-eq v7, v9, :cond_6

    move v7, v8

    goto :goto_5

    :cond_6
    move v7, v10

    :goto_5
    and-int/2addr v2, v8

    invoke-virtual {v0, v2, v7}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_f

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_7

    move-object v2, v11

    goto :goto_6

    :cond_7
    move-object v2, v6

    :goto_6
    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v6, v4

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    const/4 v12, 0x0

    invoke-static {v5, v6, v12, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v1}, Lok2/i;->a()Z

    move-result v6

    if-eqz v6, :cond_8

    move-object/from16 v28, v11

    goto :goto_7

    :cond_8
    int-to-float v3, v3

    mul-float v13, v3, v7

    const/4 v15, 0x0

    const/16 v16, 0xd

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v28, v11

    move-object v11, v3

    :goto_7
    invoke-interface {v5, v11}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->N:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v11, 0x30

    invoke-static {v6, v5, v0, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v11, v0, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-eqz v13, :cond_9

    invoke-virtual {v0, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_9
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_8
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v0, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v0, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-nez v11, :cond_a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_b

    :cond_a
    invoke-static {v6, v0, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v0, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lok2/i;->e()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual {v1}, Lok2/i;->b()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v1}, Lok2/i;->b()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    goto :goto_9

    :cond_c
    sget v3, Lkk2/d;->a:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    :goto_9
    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v0, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v6, v0, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->u()Lb91/a;

    move-result-object v22

    invoke-virtual {v1}, Lok2/i;->e()Z

    move-result v12

    if-eqz v12, :cond_d

    const v12, 0x236e4c32

    invoke-static {v0, v12, v6, v0, v11}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v12

    :goto_a
    invoke-virtual {v0, v10}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_d
    const v12, 0x236e506f

    invoke-virtual {v0, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->X0()J

    move-result-wide v12

    goto :goto_a

    :goto_b
    sget v14, Lb91/a;->d:I

    shl-int/lit8 v26, v14, 0x12

    const v27, 0x2fffa

    move-object v14, v2

    move-object v2, v3

    const/4 v3, 0x0

    move-object/from16 v16, v6

    move v15, v7

    const-wide/16 v6, 0x0

    move/from16 v17, v8

    const/4 v8, 0x0

    move/from16 v18, v9

    const/4 v9, 0x0

    move/from16 v19, v10

    const/4 v10, 0x0

    move/from16 v21, v4

    move/from16 v20, v5

    move-wide v4, v12

    move v13, v11

    const-wide/16 v11, 0x0

    move/from16 v23, v13

    const/4 v13, 0x0

    move-object/from16 v24, v14

    const/4 v14, 0x0

    move/from16 v25, v15

    move-object/from16 v29, v16

    const-wide/16 v15, 0x0

    move/from16 v30, v17

    const/16 v17, 0x0

    move/from16 v31, v18

    const/16 v18, 0x0

    move/from16 v32, v19

    const/16 v19, 0x0

    move/from16 v33, v20

    const/16 v20, 0x0

    move/from16 v34, v21

    const/16 v21, 0x0

    move/from16 v35, v23

    const/16 v23, 0x0

    move/from16 v36, v25

    const/16 v25, 0x0

    move-object/from16 p1, v24

    move-object/from16 v1, v29

    move-object/from16 v24, v0

    move/from16 v0, v32

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    sget v3, Lkk2/d;->b:I

    invoke-static {v3, v2, v0}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lb91/a;

    move/from16 v5, v35

    invoke-virtual {v1, v2, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->q()Lb91/a;

    move-result-object v6

    invoke-virtual {v6}, Lb91/a;->d()Ll3/v0;

    move-result-object v7

    invoke-static/range {v31 .. v31}, Lv63/c;->h(I)J

    move-result-wide v10

    const/16 v20, 0x0

    const v21, 0xfffffd

    const-wide/16 v8, 0x0

    const/4 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v7 .. v21}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x2

    invoke-direct {v4, v6, v7, v8, v7}, Lb91/a;-><init>(Ll3/v0;Lb91/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v2, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v9

    const-wide/high16 v11, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v11

    mul-float v13, v6, v36

    const/4 v14, 0x0

    const/16 v16, 0x5

    const/4 v12, 0x0

    move v15, v13

    move-object/from16 v11, v28

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const v27, 0x2fff8

    move-object v2, v3

    move-object v3, v6

    move-object v12, v7

    const-wide/16 v6, 0x0

    move/from16 v34, v8

    const/4 v8, 0x0

    move-object/from16 v22, v4

    move-wide v4, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v13, v12

    const-wide/16 v11, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    const-wide/16 v15, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v29, v23

    const/16 v23, 0x0

    move-object/from16 v38, v28

    move/from16 v37, v35

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual/range {p0 .. p0}, Lok2/i;->c()Lok2/e;

    move-result-object v3

    if-nez v3, :cond_e

    const v1, 0x4a61864d    # 3694995.2f

    invoke-virtual {v2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    :goto_c
    const/4 v0, 0x1

    goto/16 :goto_d

    :cond_e
    const v4, 0x4a61864e    # 3694995.5f

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    double-to-float v4, v4

    mul-float v4, v4, v36

    move-object/from16 v11, v38

    invoke-static {v4, v11}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v2, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v3}, Lok2/e;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move/from16 v5, v33

    invoke-static {v4, v2, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lb91/a;

    move/from16 v13, v37

    invoke-virtual {v1, v2, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->p()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v6

    const/16 v1, 0x15

    invoke-static {v1}, Lv63/c;->h(I)J

    move-result-wide v9

    const/16 v19, 0x0

    const v20, 0xfffffd

    const-wide/16 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    invoke-static/range {v6 .. v20}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v1

    const/4 v8, 0x2

    const/4 v12, 0x0

    invoke-direct {v5, v1, v12, v8, v12}, Lb91/a;-><init>(Ll3/v0;Lb91/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3}, Lok2/e;->a()Ly81/f;

    move-result-object v1

    invoke-virtual {v1, v2, v0}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    new-instance v14, Lw3/k;

    const/4 v1, 0x3

    invoke-direct {v14, v1}, Lw3/k;-><init>(I)V

    const/16 v25, 0x0

    const v27, 0x2fdfa

    const/4 v3, 0x0

    move-object/from16 v24, v2

    move-object v2, v4

    move-object/from16 v22, v5

    move-wide v4, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_c

    :goto_d
    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, p1

    goto :goto_e

    :cond_f
    move-object v2, v0

    invoke-virtual {v2}, Lp1/q;->X()V

    move-object v3, v6

    :goto_e
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Lqk2/i;

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final c(Lok2/i;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lqk2/j;->b(Lok2/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
