.class public abstract Le31/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a!\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Le31/c;",
        "state",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "primaryButtonClicked",
        "secondaryButtonClicked",
        "f",
        "(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lsz0/p0$b;",
        "type",
        "k",
        "(Landroidx/compose/ui/Modifier;Lsz0/p0$b;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Le31/b;->h()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Le31/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Le31/b;->i(Le31/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lsz0/p0$b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Le31/b;->l(Landroidx/compose/ui/Modifier;Lsz0/p0$b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Le31/b;->g()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Le31/c;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Le31/b;->j(Le31/c;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le31/c;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move/from16 v1, p4

    const-string v0, "state"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, 0x43e3b629

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v5, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v5

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v6, p5, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_2

    move-object/from16 v7, p1

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v2, v8

    :goto_3
    and-int/lit8 v8, p5, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v1, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v2, v10

    :goto_5
    and-int/lit16 v10, v2, 0x93

    const/16 v11, 0x92

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eq v10, v11, :cond_8

    move v10, v12

    goto :goto_6

    :cond_8
    move v10, v13

    :goto_6
    and-int/lit8 v11, v2, 0x1

    invoke-virtual {v0, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_19

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v10, :cond_9

    new-instance v6, Ldx2/a;

    const/16 v7, 0xe

    invoke-direct {v6, v7}, Ldx2/a;-><init>(I)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Lc93/a;

    move-object/from16 v31, v6

    goto :goto_7

    :cond_a
    move-object/from16 v31, v7

    :goto_7
    if-eqz v8, :cond_c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v10, :cond_b

    new-instance v6, Ldx2/a;

    const/16 v7, 0xf

    invoke-direct {v6, v7}, Ldx2/a;-><init>(I)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lc93/a;

    move-object/from16 v32, v6

    goto :goto_8

    :cond_c
    move-object/from16 v32, v9

    :goto_8
    invoke-virtual {v4}, Le31/c;->e()Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    and-int/lit8 v6, v2, 0xe

    if-ne v6, v5, :cond_d

    move v6, v12

    goto :goto_9

    :cond_d
    move v6, v13

    :goto_9
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_e

    if-ne v8, v10, :cond_f

    :cond_e
    new-instance v8, Ld1/i;

    const/16 v6, 0xc

    invoke-direct {v8, v4, v6}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object/from16 v18, v8

    check-cast v18, Lc93/a;

    const/16 v19, 0xf

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v20

    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    double-to-float v6, v8

    int-to-float v5, v5

    mul-float v21, v6, v5

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v8, 0x6

    invoke-virtual {v6, v0, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->W0()J

    move-result-wide v22

    sget-object v9, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v9}, Lkd1/w;->a()Lk91/a;

    move-result-object v9

    invoke-virtual {v9}, Lk91/a;->c()Lt0/i;

    move-result-object v24

    const/4 v9, 0x5

    int-to-float v9, v9

    const/4 v10, 0x3

    int-to-float v11, v10

    move/from16 v25, v9

    move/from16 v26, v11

    invoke-static/range {v20 .. v26}, Lgb1/g;->d(Landroidx/compose/ui/Modifier;FJLi2/a1;FF)Landroidx/compose/ui/Modifier;

    move-result-object v9

    int-to-float v11, v8

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float/2addr v14, v11

    invoke-static {v14, v9}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v4}, Le31/c;->e()Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-interface {v9, v14}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const-string v14, "mini_arch_progress_modal"

    invoke-static {v9, v14}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v14, Ll0/m;->e:Ll0/h;

    sget-object v15, Lb2/e;->N:Lb2/k;

    const/16 v7, 0x36

    invoke-static {v14, v15, v0, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v14, v0, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v0, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-eqz v10, :cond_10

    invoke-virtual {v0, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_10
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_a
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v0, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v0, v3, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_12

    :cond_11
    invoke-static {v14, v0, v14, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v0, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4}, Le31/c;->j()Lsz0/p0;

    move-result-object v3

    instance-of v3, v3, Lsz0/p0$b;

    if-eqz v3, :cond_13

    const v3, -0x5feafb29

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Le31/c;->j()Lsz0/p0;

    move-result-object v3

    check-cast v3, Lsz0/p0$b;

    const/4 v7, 0x0

    invoke-static {v7, v3, v0, v13, v12}, Le31/b;->k(Landroidx/compose/ui/Modifier;Lsz0/p0$b;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_13
    const v3, -0x5fea0c3e

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Le31/c;->j()Lsz0/p0;

    move-result-object v3

    invoke-static {v3, v0, v13}, Lsz0/m0;->B(Lsz0/p0;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v13}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v4}, Le31/c;->j()Lsz0/p0;

    move-result-object v3

    invoke-virtual {v3}, Lsz0/p0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v3

    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_14

    const v3, -0x5fe886ce

    invoke-static {v0, v3, v11, v5, v7}, Lih0/d0;->f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v0, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v3, "progress_modal_title_text"

    invoke-static {v7, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v4}, Le31/c;->j()Lsz0/p0;

    move-result-object v9

    invoke-virtual {v9}, Lsz0/p0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v9, v0, v13}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v0, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->q()Lb91/a;

    move-result-object v25

    invoke-virtual {v6, v0, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    new-instance v14, Lw3/k;

    const/4 v15, 0x3

    invoke-direct {v14, v15}, Lw3/k;-><init>(I)V

    const/16 v29, 0x0

    const v30, 0x2fdf8

    move-object/from16 v16, v7

    move/from16 v17, v8

    move-wide v7, v10

    move v11, v5

    move-object v5, v9

    const-wide/16 v9, 0x0

    move/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    const/4 v12, 0x0

    move/from16 v20, v13

    const/4 v13, 0x0

    move/from16 v21, v15

    move/from16 v22, v17

    move-object/from16 v17, v14

    const-wide/16 v14, 0x0

    move-object/from16 v23, v16

    const/16 v16, 0x0

    move/from16 v24, v18

    move/from16 v27, v19

    const-wide/16 v18, 0x0

    move/from16 v28, v20

    const/16 v20, 0x0

    move/from16 v33, v21

    const/16 v21, 0x0

    move/from16 v34, v22

    const/16 v22, 0x0

    move-object/from16 v35, v23

    const/16 v23, 0x0

    move/from16 v36, v24

    const/16 v24, 0x0

    move/from16 v37, v26

    const/16 v26, 0x0

    move/from16 v38, v28

    const/16 v28, 0x30

    move-object v1, v6

    move-object v6, v3

    move-object v3, v1

    move-object/from16 v27, v0

    move/from16 v33, v2

    move-object/from16 v2, v35

    move/from16 v0, v36

    move/from16 v1, v37

    move/from16 v4, v38

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_14
    move v1, v5

    move-object v5, v0

    move v0, v1

    move/from16 v33, v2

    move-object v3, v6

    move-object v2, v7

    move v4, v13

    move/from16 v1, v26

    const v6, -0x5fe2f091

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual/range {p0 .. p0}, Le31/c;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    if-nez v6, :cond_15

    const v1, -0x5fe24fa3

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    const/16 v34, 0x6

    goto/16 :goto_e

    :cond_15
    const v6, -0x5fe24fa2

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Le31/c;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v6

    if-eqz v6, :cond_16

    const v6, -0xd338db6

    invoke-static {v5, v6, v1, v0, v2}, Lih0/d0;->f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Le31/c;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1, v5, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x6

    invoke-virtual {v3, v5, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v3, v5, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->b1()J

    move-result-wide v7

    new-instance v3, Lw3/k;

    const/4 v15, 0x3

    invoke-direct {v3, v15}, Lw3/k;-><init>(I)V

    const/16 v29, 0x0

    const v30, 0x2fdfa

    move/from16 v17, v6

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v27, v5

    move/from16 v34, v17

    move-object v5, v1

    move-object/from16 v17, v3

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_16
    const/16 v34, 0x6

    const v1, -0xd2e9ca5

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual/range {p0 .. p0}, Le31/c;->g()Le31/a;

    move-result-object v1

    if-nez v1, :cond_17

    const v1, -0x5fdbbbb5

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    move-object/from16 v1, v31

    goto :goto_f

    :cond_17
    const v3, -0x5fdbbbb4

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x2

    int-to-float v3, v3

    invoke-static {v3, v0, v2, v5}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-string v3, "progress_modal_primary_button"

    invoke-static {v6, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v1}, Le31/a;->b()Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v1}, Le31/a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    shl-int/lit8 v1, v33, 0x6

    and-int/lit16 v1, v1, 0x1c00

    const/16 v22, 0x1fb6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x6

    move/from16 v21, v1

    move-object/from16 v19, v5

    move-object/from16 v18, v31

    move-object v5, v3

    invoke-static/range {v5 .. v22}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v18

    move-object/from16 v5, v19

    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual/range {p0 .. p0}, Le31/c;->h()Le31/a;

    move-result-object v3

    if-nez v3, :cond_18

    const v0, -0x5fd3e6c2

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    move-object/from16 v15, v32

    const/4 v0, 0x1

    goto :goto_10

    :cond_18
    const v6, -0x5fd3e6c1

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    const/4 v6, 0x1

    int-to-float v7, v6

    invoke-static {v7, v0, v2, v5}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v2, "progress_modal_secondary_button"

    invoke-static {v0, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v3}, Le31/a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v3}, Le31/a;->a()Ljava/lang/Integer;

    move-result-object v11

    shr-int/lit8 v2, v33, 0x6

    and-int/lit8 v18, v2, 0xe

    const/16 v19, 0x39a

    move/from16 v27, v6

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v17, 0x30006

    move-object/from16 v16, v5

    move-object/from16 v15, v32

    move-object v5, v0

    move/from16 v0, v27

    invoke-static/range {v5 .. v19}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v16

    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    move-object v6, v15

    goto :goto_11

    :cond_19
    move-object v5, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v1, v7

    move-object v6, v9

    :goto_11
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1a

    new-instance v0, Le11/b;

    const/4 v3, 0x1

    move-object/from16 v4, p0

    move/from16 v2, p5

    move-object v5, v1

    move/from16 v1, p4

    invoke-direct/range {v0 .. v6}, Le11/b;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final g()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Le31/c;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Le31/c;->f()Lc93/a;

    move-result-object p0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Le31/c;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Le31/b;->f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Landroidx/compose/ui/Modifier;Lsz0/p0$b;Landroidx/compose/runtime/Composer;II)V
    .locals 19

    move-object/from16 v3, p1

    const-string v0, "type"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    const v0, 0x1ed89f8a

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v2, p3, 0x6

    move v4, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v1

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_4
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v12, 0x1

    if-eq v5, v6, :cond_5

    move v5, v12

    goto :goto_3

    :cond_5
    move v5, v7

    :goto_3
    and-int/lit8 v6, v4, 0x1

    invoke-virtual {v9, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_a

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object v2, v5

    :cond_6
    const/4 v0, 0x6

    int-to-float v6, v0

    int-to-float v1, v1

    mul-float/2addr v6, v1

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    shr-int/lit8 v4, v4, 0x3

    and-int/lit8 v4, v4, 0xe

    invoke-static {v3, v9, v4}, Lsz0/m0;->N(Lsz0/p0;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    const v6, 0x3dcccccd    # 0.1f

    invoke-static {v6, v10, v11}, Li2/x;->c(FJ)J

    move-result-wide v10

    invoke-static {v10, v11}, Li91/c;->o(J)Li91/a;

    move-result-object v14

    sget-object v6, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v6}, Lkd1/w;->c()Lk91/a;

    move-result-object v6

    invoke-virtual {v6}, Lk91/a;->c()Lt0/i;

    move-result-object v15

    const/16 v17, 0x4

    const/16 v18, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Li91/c;->e(Landroidx/compose/ui/Modifier;Li91/a;Li2/a1;Ljava/lang/Float;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-wide/high16 v10, 0x3ff8000000000000L    # 1.5

    double-to-float v8, v10

    mul-float/2addr v8, v1

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lb2/e;->E:Lb2/m;

    invoke-static {v8, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v9, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_4
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v9, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v9, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    :cond_8
    invoke-static {v8, v9, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v9, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lsz0/p0;->a()I

    move-result v6

    invoke-static {v6, v9, v0}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    invoke-static {v3, v9, v4}, Lsz0/m0;->N(Lsz0/p0;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    const/4 v4, 0x5

    int-to-float v4, v4

    mul-float/2addr v4, v1

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v4, "progress_modal_loading_default"

    invoke-static {v1, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v10, 0x1b0

    const/4 v11, 0x0

    const/4 v5, 0x0

    move-object v4, v0

    invoke-static/range {v4 .. v11}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    :goto_5
    move-object v1, v2

    goto :goto_6

    :cond_a
    invoke-virtual {v9}, Lp1/q;->X()V

    goto :goto_5

    :goto_6
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_b

    new-instance v0, Ld62/b;

    const/16 v5, 0xa

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ld62/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final l(Landroidx/compose/ui/Modifier;Lsz0/p0$b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Le31/b;->k(Landroidx/compose/ui/Modifier;Lsz0/p0$b;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
