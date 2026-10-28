.class public abstract Lwo1/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lso1/y;",
        "viewState",
        "Ll83/a0;",
        "b",
        "(Lso1/y;Landroidx/compose/runtime/Composer;I)V",
        "hormonal-insights_release"
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
.method public static synthetic a(Lso1/y;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lwo1/w;->c(Lso1/y;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lso1/y;Landroidx/compose/runtime/Composer;I)V
    .locals 39

    move-object/from16 v0, p0

    const-string v2, "viewState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    const v2, -0x641b26b9

    invoke-virtual {v8, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v5, v2, 0x3

    const/4 v7, 0x1

    if-eq v5, v4, :cond_2

    move v5, v7

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    and-int/2addr v2, v7

    invoke-virtual {v8, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_b

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, Lb2/e;->M:Lb2/k;

    sget-object v11, Ll0/m;->c:Ll0/g;

    const/16 v12, 0x30

    invoke-static {v11, v10, v8, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v11, v8, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v8, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v14, v8, Lp1/q;->S:Z

    if-eqz v14, :cond_3

    invoke-virtual {v8, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_3
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v8, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v8, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v15, v8, Lp1/q;->S:Z

    if-nez v15, :cond_4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    :cond_4
    invoke-static {v11, v8, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v8, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Ll0/a1;->w:Ll0/a1;

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v11, Ll0/m;->a:Ll0/e;

    const/16 v15, 0x36

    invoke-static {v11, v5, v8, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-eqz v11, :cond_6

    invoke-virtual {v8, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v8, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    :cond_7
    invoke-static {v6, v8, v6, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v8, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v10, v3

    const/4 v13, 0x0

    const/16 v14, 0xb

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move v2, v12

    invoke-virtual {v0}, Lso1/y;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v8, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v8, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->P()Lb91/a;

    move-result-object v23

    invoke-virtual {v6, v8, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    sget v12, Lb91/a;->d:I

    shl-int/lit8 v27, v12, 0x12

    const v28, 0x2fff8

    move v12, v7

    move-object/from16 v25, v8

    const-wide/16 v7, 0x0

    move-object v13, v9

    const/4 v9, 0x0

    move-object v14, v6

    move-wide/from16 v37, v10

    move v11, v5

    move-wide/from16 v5, v37

    const/4 v10, 0x0

    move/from16 v17, v11

    const/4 v11, 0x0

    move/from16 v18, v12

    move-object/from16 v19, v13

    const-wide/16 v12, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    const/16 v21, 0x0

    const/4 v15, 0x0

    move/from16 v22, v17

    const/16 v24, 0x1

    const-wide/16 v16, 0x0

    move/from16 v26, v18

    const/16 v18, 0x0

    move-object/from16 v29, v19

    const/16 v19, 0x0

    move-object/from16 v30, v20

    const/16 v20, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move/from16 v32, v22

    const/16 v22, 0x0

    move/from16 v33, v24

    const/16 v24, 0x0

    move/from16 v34, v26

    const/16 v26, 0x30

    move/from16 v35, v2

    move-object/from16 v36, v29

    move-object/from16 v0, v30

    move/from16 v1, v34

    const/4 v2, 0x2

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    invoke-virtual/range {p0 .. p0}, Lso1/y;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual/range {p0 .. p0}, Lso1/y;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v3

    if-eqz v3, :cond_9

    const v3, 0x170ce853

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    int-to-float v2, v2

    mul-float v2, v2, v35

    move-object/from16 v13, v36

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v8, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v0, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v4

    const/4 v3, 0x5

    int-to-float v3, v3

    mul-float v3, v3, v35

    invoke-static {v3, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v15, 0x1

    int-to-float v6, v15

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v9, 0x6

    const/16 v10, 0xc

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v10}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v8, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object v9, v13

    const/4 v13, 0x0

    const/16 v14, 0xe

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v10, v35

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v29, v9

    move v2, v10

    invoke-virtual/range {p0 .. p0}, Lso1/y;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move/from16 v5, v32

    invoke-static {v3, v8, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v8, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->P()Lb91/a;

    move-result-object v23

    invoke-virtual/range {p0 .. p0}, Lso1/y;->b()Ly81/e;

    move-result-object v6

    const/4 v7, 0x0

    invoke-interface {v6, v8, v7}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    const/16 v26, 0x30

    const v28, 0x2fff8

    move/from16 v31, v7

    move-object/from16 v25, v8

    const-wide/16 v7, 0x0

    move-wide v5, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v33, v16

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    move-object/from16 v30, v0

    move/from16 v34, v1

    move/from16 v35, v2

    move/from16 v0, v31

    move/from16 v2, v32

    move/from16 v1, v33

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_9
    move-object/from16 v30, v0

    move/from16 v34, v1

    move/from16 v2, v32

    move-object/from16 v29, v36

    const/4 v0, 0x0

    const/4 v1, 0x1

    const v3, 0x17160741

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lso1/y;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    if-eqz v3, :cond_a

    const v3, 0x70c3fdcd

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    const/16 v14, 0xd

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v9, v29

    move/from16 v11, v35

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lso1/y;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v8, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v14, v30

    move/from16 v12, v34

    invoke-virtual {v14, v8, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    invoke-virtual {v14, v8, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v5

    const/16 v26, 0x30

    const v28, 0x2fff8

    move-object/from16 v25, v8

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

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    const v2, 0x70c7c785

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_b
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_c

    new-instance v1, Lsl0/j2;

    const/16 v2, 0x1a

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lsl0/j2;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final c(Lso1/y;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lwo1/w;->b(Lso1/y;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
