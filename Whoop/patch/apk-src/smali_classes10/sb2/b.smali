.class public abstract Lsb2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lqb2/b;",
        "viewState",
        "",
        "promotion",
        "Lkotlin/Function1;",
        "Lpb2/a;",
        "Ll83/a0;",
        "onNavigationEvent",
        "c",
        "(Lqb2/b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "settings_release"
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
.method public static synthetic a(Lqb2/b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsb2/b;->e(Lqb2/b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lqb2/a;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsb2/b;->d(Lkotlin/jvm/functions/Function1;Lqb2/a;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lqb2/b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 72
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqb2/b;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, 0x70929e73

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v8, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :cond_5
    and-int/lit16 v6, v0, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    if-eq v6, v10, :cond_6

    const/4 v6, 0x1

    goto :goto_4

    :cond_6
    move v6, v11

    :goto_4
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v8, v10, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_13

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v10, v8, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v13, v8, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_7

    invoke-virtual {v8, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_5
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v8, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v8, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-nez v11, :cond_8

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    :cond_8
    invoke-static {v13, v8, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v8, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lqb2/b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_a

    const v5, -0x3eb1c8bd

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lqb2/b;->a()Ljava/lang/String;

    move-result-object v5

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v13, v8, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->r()Lb91/a;

    move-result-object v26

    invoke-virtual {v13, v8, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->c1()J

    move-result-wide v12

    move-object/from16 v27, v5

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v1, v5

    mul-float v19, v4, v1

    const/16 v20, 0x7

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object v4, v15

    new-instance v15, Lw3/k;

    const/4 v5, 0x1

    invoke-direct {v15, v5}, Lw3/k;-><init>(I)V

    sget v16, Lb91/a;->d:I

    shl-int/lit8 v29, v16, 0x12

    const v30, 0x2fdf8

    move-object/from16 v17, v9

    move-object/from16 v16, v10

    const-wide/16 v9, 0x0

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v24, v5

    move-object/from16 v5, v27

    move-object/from16 v27, v8

    move-wide/from16 v70, v12

    move-object v13, v7

    move-wide/from16 v7, v70

    const/4 v12, 0x0

    move-object/from16 v19, v13

    const/4 v13, 0x0

    move-object/from16 v20, v14

    move-object/from16 v28, v17

    move-object/from16 v17, v15

    const-wide/16 v14, 0x0

    move-object/from16 v31, v16

    const/16 v16, 0x0

    move-object/from16 v33, v18

    move-object/from16 v32, v19

    const-wide/16 v18, 0x0

    move-object/from16 v34, v20

    const/16 v20, 0x0

    const/16 v35, 0x100

    const/16 v21, 0x0

    const/16 v36, 0x20

    const/16 v22, 0x0

    const/16 v37, 0x0

    const/16 v23, 0x0

    move/from16 v38, v24

    const/16 v24, 0x0

    move-object/from16 v25, v26

    const/16 v39, 0x8

    const/16 v26, 0x0

    move-object/from16 v40, v28

    const/16 v28, 0x30

    move-object/from16 v41, v6

    move-object/from16 v2, v31

    move-object/from16 v43, v33

    move-object/from16 v42, v34

    move-object/from16 v3, v40

    move/from16 v31, v0

    move-object v6, v1

    move/from16 v1, v37

    const/4 v0, 0x2

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    move/from16 v31, v0

    move-object/from16 v41, v6

    move-object/from16 v32, v7

    move-object v3, v9

    move-object v2, v10

    move-object/from16 v43, v11

    move-object/from16 v42, v14

    move-object v4, v15

    const/4 v0, 0x2

    const/4 v1, 0x0

    const v5, -0x3ead8e67

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    :goto_6
    int-to-float v0, v0

    const/16 v5, 0x8

    int-to-float v5, v5

    const/4 v6, 0x6

    invoke-static {v0, v5, v2, v8, v6}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v0

    iget-wide v5, v8, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-eqz v6, :cond_b

    invoke-virtual {v8, v3}, Lp1/q;->l(Lc93/a;)V

    :goto_7
    move-object/from16 v13, v32

    goto :goto_8

    :cond_b
    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_7

    :goto_8
    invoke-static {v8, v13, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v41

    invoke-static {v8, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_c

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    :cond_c
    move-object/from16 v0, v42

    goto :goto_a

    :cond_d
    :goto_9
    move-object/from16 v0, v43

    goto :goto_b

    :goto_a
    invoke-static {v2, v8, v2, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_9

    :goto_b
    invoke-static {v8, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x3bb35097

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lqb2/b;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqb2/a;

    sget-object v44, Ly71/o;->p:Ly71/o$c;

    invoke-virtual {v2}, Lqb2/a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v45

    invoke-virtual {v2}, Lqb2/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v48

    invoke-virtual {v2}, Lqb2/a;->b()Ly71/g;

    move-result-object v50

    const v68, 0x7fffd6

    const/16 v69, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v49, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    invoke-static/range {v44 .. v69}, Ly71/o$c;->d(Ly71/o$c;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Lcom/whoop/design/util/TextResource;Ly81/e;Ly71/g;Ly81/e;Ly71/g;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;ZZLcom/whoop/navigation/e;ZLjava/lang/String;Ly71/q;Ljava/lang/Object;ZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Ly71/o;

    move-result-object v6

    move/from16 v3, v31

    and-int/lit16 v4, v3, 0x380

    const/16 v11, 0x100

    if-ne v4, v11, :cond_e

    const/4 v4, 0x1

    goto :goto_d

    :cond_e
    move v4, v1

    :goto_d
    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    and-int/lit8 v5, v3, 0x70

    const/16 v12, 0x20

    if-ne v5, v12, :cond_f

    const/4 v5, 0x1

    goto :goto_e

    :cond_f
    move v5, v1

    :goto_e
    or-int/2addr v4, v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_11

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_10

    goto :goto_f

    :cond_10
    move-object/from16 v13, p1

    move/from16 v31, v3

    move-object/from16 v3, p2

    goto :goto_10

    :cond_11
    :goto_f
    new-instance v5, Lre1/k;

    const/4 v4, 0x3

    move-object/from16 v13, p1

    move/from16 v31, v3

    move-object/from16 v3, p2

    invoke-direct {v5, v4, v3, v2, v13}, Lre1/k;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    move-object v7, v5

    check-cast v7, Lc93/a;

    sget v2, Ly71/o;->q:I

    shl-int/lit8 v9, v2, 0x3

    const/4 v10, 0x1

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Ly71/n;->c(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto/16 :goto_c

    :cond_12
    move-object/from16 v13, p1

    move-object/from16 v3, p2

    const/4 v5, 0x1

    invoke-static {v8, v1, v5, v5}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_11

    :cond_13
    move-object v13, v2

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_11
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_14

    new-instance v0, Ls01/e;

    const/4 v5, 0x3

    move-object/from16 v1, p0

    move/from16 v4, p4

    move-object v2, v13

    invoke-direct/range {v0 .. v5}, Ls01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Lqb2/a;Ljava/lang/String;)Ll83/a0;
    .locals 2

    new-instance v0, Lpb2/a$b;

    invoke-virtual {p1}, Lqb2/a;->a()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-virtual {p1}, Lqb2/a;->e()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1, p2}, Lpb2/a$b;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lqb2/b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lsb2/b;->c(Lqb2/b;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
