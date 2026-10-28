.class public abstract Lbu2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lbu2/a;",
        "goalInfoItemState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Lbu2/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "weekly-plan_release"
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
.method public static synthetic a(Lbu2/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lbu2/b;->e(Lbu2/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbu2/b;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lbu2/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbu2/a;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v6, p0

    const-string v0, "goalInfoItemState"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v1, -0x6dbffbfb

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p4, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p4

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p4, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    :goto_3
    and-int/lit8 v5, v1, 0x13

    const/4 v7, 0x1

    const/16 v8, 0x12

    const/4 v9, 0x0

    if-eq v5, v8, :cond_5

    move v5, v7

    goto :goto_4

    :cond_5
    move v5, v9

    :goto_4
    and-int/2addr v1, v7

    invoke-virtual {v0, v1, v5}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_16

    sget-object v1, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_6

    move-object v4, v1

    :cond_6
    and-int/lit8 v3, p5, 0x4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_7

    new-instance v3, Lbs1/n;

    const/16 v10, 0x9

    invoke-direct {v3, v10}, Lbs1/n;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_8
    move-object/from16 v3, p2

    :goto_5
    invoke-virtual {v6}, Lbu2/a;->a()Lb2/f;

    move-result-object v10

    sget-object v11, Ll0/m;->c:Ll0/g;

    invoke-static {v11, v10, v0, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v11, v0, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v0, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_9

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v0, v15, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v0, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    move/from16 v16, v8

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    goto :goto_7

    :cond_a
    move/from16 v16, v8

    :goto_7
    invoke-static {v11, v0, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v0, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v6}, Lbu2/a;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-virtual {v6}, Lbu2/a;->c()Lbu2/c;

    move-result-object v8

    sget-object v11, Lbu2/c;->TOP:Lbu2/c;

    if-ne v8, v11, :cond_f

    const v8, 0x6dbd0cde

    invoke-virtual {v0, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lbu2/a;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v8, v0, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6}, Lbu2/a;->b()Ly81/e;

    move-result-object v11

    if-nez v11, :cond_c

    const v11, 0x6dbea4f3

    invoke-virtual {v0, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    const/4 v11, 0x0

    move-object/from16 p1, v3

    goto :goto_8

    :cond_c
    const v13, -0x25c00b32

    invoke-virtual {v0, v13}, Lp1/q;->e0(I)V

    move-object/from16 p1, v3

    invoke-interface {v11, v0, v9}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v2

    invoke-static {v0, v9, v2, v3}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v11

    :goto_8
    if-nez v11, :cond_e

    const v2, -0x25c00512

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_d

    sget-object v2, Lbu2/b$a;->w:Lbu2/b$a;

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v2

    invoke-interface {v2, v0, v9}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v2

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_e
    const v2, -0x25c00ea3

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    iget-wide v2, v11, Li2/x;->a:J

    :goto_9
    invoke-virtual {v6}, Lbu2/a;->f()Lb91/a;

    move-result-object v27

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v31, v5, 0x12

    const v32, 0x2fffa

    move-object v5, v7

    move-object v7, v8

    const/4 v8, 0x0

    move-object v13, v12

    const-wide/16 v11, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    const/4 v14, 0x0

    move-object/from16 v19, v15

    const/4 v15, 0x0

    move/from16 v21, v16

    move-object/from16 v20, v17

    const-wide/16 v16, 0x0

    move-object/from16 v22, v18

    const/16 v18, 0x0

    move-object/from16 v23, v19

    const/16 v19, 0x0

    move-object/from16 v24, v20

    move/from16 v25, v21

    const-wide/16 v20, 0x0

    move-object/from16 v26, v22

    const/16 v22, 0x0

    move-object/from16 v28, v23

    const/16 v23, 0x0

    move-object/from16 v29, v24

    const/16 v24, 0x0

    move/from16 v30, v25

    const/16 v25, 0x0

    move-object/from16 v33, v26

    const/16 v26, 0x0

    move-object/from16 v34, v28

    const/16 v28, 0x0

    move/from16 v35, v30

    const/16 v30, 0x0

    move-object/from16 v6, v29

    move-object/from16 v29, v0

    move-object/from16 v0, v33

    move-object/from16 v33, v4

    move-object v4, v5

    move-object v5, v6

    move v6, v9

    move-wide/from16 v36, v2

    move-object v3, v10

    move-wide/from16 v9, v36

    move-object/from16 v2, v34

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_f
    move-object/from16 p1, v3

    move-object/from16 v33, v4

    move-object v4, v7

    move v6, v9

    move-object v3, v10

    move-object v5, v12

    move-object v2, v15

    move/from16 v35, v16

    move-object v7, v0

    move-object v0, v14

    const v8, 0x6dc07787

    invoke-virtual {v7, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    :goto_a
    sget-object v8, Lb2/e;->L:Lb2/l;

    sget-object v9, Ll0/m;->a:Ll0/e;

    const/16 v10, 0x30

    invoke-static {v9, v8, v7, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v9, v7, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v7, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-eqz v12, :cond_10

    invoke-virtual {v7, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_10
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v7, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v7, Lp1/q;->S:Z

    if-nez v0, :cond_11

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    :cond_11
    invoke-static {v9, v7, v9, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v7, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lbu2/a;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v7, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lbu2/a;->g()Ly81/e;

    move-result-object v3

    invoke-interface {v3, v7, v6}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    invoke-virtual/range {p0 .. p0}, Lbu2/a;->i()Lb91/a;

    move-result-object v27

    sget-object v3, Ly2/d;->a:Ly2/m;

    new-instance v8, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    invoke-direct {v8, v3}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v31, v4, 0x12

    const v32, 0x2fff8

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    move-object/from16 v29, v7

    move-object v7, v0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    invoke-virtual/range {p0 .. p0}, Lbu2/a;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_13

    const v0, -0x2a4e8459

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    :goto_c
    const/4 v4, 0x1

    goto :goto_d

    :cond_13
    const v4, -0x2a4e8458

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    const/4 v4, 0x1

    int-to-float v5, v4

    const/4 v4, 0x4

    int-to-float v4, v4

    invoke-static {v5, v4, v1, v7}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    invoke-static {v0, v7, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lbu2/a;->g()Ly81/e;

    move-result-object v1

    invoke-interface {v1, v7, v6}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    invoke-virtual/range {p0 .. p0}, Lbu2/a;->k()Lb91/a;

    move-result-object v1

    if-nez v1, :cond_14

    invoke-virtual/range {p0 .. p0}, Lbu2/a;->i()Lb91/a;

    move-result-object v1

    :cond_14
    move-object/from16 v27, v1

    new-instance v8, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    invoke-direct {v8, v3}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    const/16 v30, 0x0

    const v32, 0x2fff8

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v29, v7

    move-object v7, v0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    goto :goto_c

    :goto_d
    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lbu2/a;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-virtual/range {p0 .. p0}, Lbu2/a;->c()Lbu2/c;

    move-result-object v0

    sget-object v1, Lbu2/c;->BOTTOM:Lbu2/c;

    if-ne v0, v1, :cond_15

    const v0, 0x6dcf1ae5

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lbu2/a;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v7, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lbu2/a;->b()Ly81/e;

    move-result-object v1

    invoke-interface {v1, v7, v6}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    invoke-virtual/range {p0 .. p0}, Lbu2/a;->f()Lb91/a;

    move-result-object v27

    const/16 v30, 0x0

    const v32, 0x2fffa

    const/4 v8, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v29, v7

    move-object v7, v0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    :goto_e
    const/4 v4, 0x1

    goto :goto_f

    :cond_15
    const v0, 0x6dd1f327

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    goto :goto_e

    :goto_f
    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    move-object/from16 v5, p1

    move-object/from16 v4, v33

    goto :goto_10

    :cond_16
    move-object v7, v0

    invoke-virtual {v7}, Lp1/q;->X()V

    move-object/from16 v5, p2

    :goto_10
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_17

    new-instance v0, La01/e;

    const/16 v3, 0x15

    move-object/from16 v6, p0

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, La01/e;-><init>(IIILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lm91/u;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final d(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lbu2/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lbu2/b;->c(Lbu2/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
