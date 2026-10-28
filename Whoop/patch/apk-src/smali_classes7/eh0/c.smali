.class public abstract Leh0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aC\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "subtitle",
        "Lsz0/c0;",
        "subtitleMarkdown",
        "",
        "Lhy0/h1;",
        "tags",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lsz0/c0;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V",
        "bot_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lsz0/c0;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Leh0/c;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lsz0/c0;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/List;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Leh0/c;->d(Ljava/util/List;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lsz0/c0;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lsz0/c0;",
            "Ljava/util/List<",
            "Lhy0/h1;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v0, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    const-string v1, "title"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "subtitle"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "tags"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v1, -0x1c40cc28

    invoke-virtual {v12, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p7, 0x1

    const/4 v4, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v7, v6, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v6, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    move v8, v4

    :goto_0
    or-int/2addr v8, v6

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v6

    :goto_1
    and-int/lit8 v9, v6, 0x30

    if-nez v9, :cond_5

    and-int/lit8 v9, v6, 0x40

    if-nez v9, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_2

    :cond_3
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_2
    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_3

    :cond_4
    const/16 v9, 0x10

    :goto_3
    or-int/2addr v8, v9

    :cond_5
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_8

    and-int/lit16 v9, v6, 0x200

    if-nez v9, :cond_6

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_4

    :cond_6
    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_4
    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_5

    :cond_7
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v8, v9

    :cond_8
    and-int/lit8 v9, p7, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v8, v8, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v10, v6, 0xc00

    if-nez v10, :cond_c

    and-int/lit16 v10, v6, 0x1000

    if-nez v10, :cond_a

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    goto :goto_6

    :cond_a
    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    :goto_6
    if-eqz v10, :cond_b

    const/16 v10, 0x800

    goto :goto_7

    :cond_b
    const/16 v10, 0x400

    :goto_7
    or-int/2addr v8, v10

    :cond_c
    :goto_8
    and-int/lit16 v10, v6, 0x6000

    if-nez v10, :cond_e

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d

    const/16 v10, 0x4000

    goto :goto_9

    :cond_d
    const/16 v10, 0x2000

    :goto_9
    or-int/2addr v8, v10

    :cond_e
    and-int/lit16 v10, v8, 0x2493

    const/16 v11, 0x2492

    const/4 v14, 0x1

    if-eq v10, v11, :cond_f

    move v10, v14

    goto :goto_a

    :cond_f
    const/4 v10, 0x0

    :goto_a
    and-int/lit8 v11, v8, 0x1

    invoke-virtual {v12, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_1a

    sget-object v10, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_10

    move-object v1, v10

    goto :goto_b

    :cond_10
    move-object v1, v7

    :goto_b
    if-eqz v9, :cond_11

    const/4 v0, 0x0

    :cond_11
    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v9, v14

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float/2addr v9, v11

    int-to-float v4, v4

    mul-float/2addr v4, v11

    invoke-static {v7, v9, v4}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const-wide/high16 v13, 0x3ff8000000000000L    # 1.5

    double-to-float v7, v13

    mul-float/2addr v7, v11

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    sget-object v13, Lb2/e;->M:Lb2/k;

    const/4 v14, 0x6

    invoke-static {v7, v13, v12, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v14, v12, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v12, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v33, v0

    sget-object v0, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    move-object/from16 v34, v1

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-eqz v1, :cond_12

    invoke-virtual {v12, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_12
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_c
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v12, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v12, v7, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-nez v6, :cond_13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move/from16 v16, v8

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    goto :goto_d

    :cond_13
    move/from16 v16, v8

    :goto_d
    invoke-static {v14, v12, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v12, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move v4, v9

    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    double-to-float v8, v8

    const/4 v9, 0x6

    invoke-static {v8, v11, v13, v12, v9}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v8

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v12, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_15

    invoke-virtual {v12, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_15
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v12, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    :cond_16
    invoke-static {v11, v12, v11, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v12, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shr-int/lit8 v1, v16, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int/2addr v1, v0

    invoke-static {v2, v12, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v1, v12, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->O()Lb91/a;

    move-result-object v27

    invoke-virtual {v1, v12, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v10

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v31, v8, 0x12

    const v32, 0x2fffa

    const/4 v8, 0x0

    move v13, v9

    move-wide v9, v10

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    move/from16 v19, v17

    const-wide/16 v16, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    move/from16 v23, v21

    const-wide/16 v20, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v28, v25

    const/16 v25, 0x0

    move/from16 v30, v26

    const/16 v26, 0x0

    move/from16 v35, v28

    const/16 v28, 0x0

    move/from16 v36, v30

    const/16 v30, 0x0

    move/from16 p0, v0

    const/4 v0, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    if-eqz v33, :cond_18

    const v1, -0x273d9e50

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    sget v1, Lsz0/c0;->k:I

    shl-int/lit8 v1, v1, 0x3

    shr-int/lit8 v6, v36, 0x6

    and-int/lit8 v6, v6, 0x70

    or-int v13, v1, v6

    const/16 v14, 0x1d

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v8, v33

    invoke-static/range {v7 .. v14}, Lsz0/b0;->d(Landroidx/compose/ui/Modifier;Lsz0/c0;IIILandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_f
    const/4 v1, 0x1

    goto :goto_10

    :cond_18
    const v7, -0x273c23e5

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    shr-int/lit8 v7, v36, 0x6

    and-int/lit8 v7, v7, 0xe

    or-int v7, p0, v7

    invoke-static {v3, v12, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v12, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v27

    invoke-virtual {v1, v12, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v9

    const/16 v30, 0x0

    const v32, 0x2fffa

    const/4 v8, 0x0

    move-object/from16 v29, v12

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

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_19

    const v6, -0x33fa71

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v8

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    new-instance v4, Leh0/b;

    const/4 v6, 0x0

    invoke-direct {v4, v5, v6}, Leh0/b;-><init>(Ljava/util/List;I)V

    const v6, -0x6b401ede

    invoke-static {v6, v12, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const v15, 0x1801b0

    const/16 v16, 0x39

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v29, v12

    const/4 v12, 0x0

    move-object/from16 v14, v29

    invoke-static/range {v7 .. v16}, Ll0/g2;->a(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v14

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_19
    const v4, -0x2f8180

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    move-object/from16 v4, v33

    move-object/from16 v1, v34

    goto :goto_12

    :cond_1a
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v4, v0

    move-object v1, v7

    :goto_12
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1b

    new-instance v0, La01/f;

    const/16 v8, 0x14

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, La01/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final d(Ljava/util/List;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    const-string v0, "$this$FlowRow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p1, v0, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    and-int/2addr p3, v1

    move-object v3, p2

    check-cast v3, Lp1/q;

    invoke-virtual {v3, p3, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lhy0/h1;

    sget v4, Lhy0/h1;->w:I

    const/4 v5, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lhy0/g1;->h(Lhy0/h1;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lp1/q;->X()V

    :cond_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lsz0/c0;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Leh0/c;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lsz0/c0;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
