.class public abstract Ltj1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "",
        "isConnected",
        "Lkotlin/Function1;",
        "Lnj1/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Lmj1/a;",
        "onNavigationEvent",
        "c",
        "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "health-connect_release"
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
.method public static synthetic a(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ltj1/b;->e(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Ltj1/b;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "onViewEvent"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, -0x5d677e5

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v5, 0x4

    const/4 v13, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v5

    goto :goto_0

    :cond_0
    move v0, v13

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit16 v6, v4, 0x180

    const/16 v14, 0x100

    if-nez v6, :cond_3

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v14

    goto :goto_2

    :cond_2
    const/16 v6, 0x80

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit16 v6, v0, 0x83

    const/16 v7, 0x82

    const/4 v15, 0x1

    if-eq v6, v7, :cond_4

    move v6, v15

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    :goto_3
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v12, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_c

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    int-to-float v9, v13

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float v17, v9, v10

    int-to-float v5, v5

    mul-float v20, v5, v10

    const/16 v21, 0x2

    const/16 v18, 0x0

    move/from16 v19, v17

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static/range {v17 .. v17}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    sget-object v11, Lb2/e;->M:Lb2/k;

    const/4 v13, 0x6

    invoke-static {v9, v11, v12, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    move-object/from16 v16, v7

    iget-wide v6, v12, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_5

    invoke-virtual {v12, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_4
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v12, v8, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v12, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-nez v8, :cond_6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    :cond_6
    invoke-static {v6, v12, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v12, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v5, Lgj1/a;->c:I

    invoke-static {v5, v12, v13}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    move v6, v10

    const/16 v10, 0x30

    const/16 v11, 0x7c

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move-object/from16 v31, v16

    move/from16 v16, v9

    move-object v9, v12

    const/4 v12, 0x0

    invoke-static/range {v5 .. v11}, Lpf/c;->d(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;Li2/p;Landroidx/compose/runtime/Composer;II)V

    sget v5, Lgj1/b;->h:I

    invoke-static {v5, v9, v12}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v9, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v6, v9, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->N()Lb91/a;

    move-result-object v25

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v29, v8, 0x12

    const v30, 0x2fffa

    move-object v8, v6

    const/4 v6, 0x0

    move/from16 v17, v7

    move-object/from16 v27, v9

    move-wide/from16 v42, v10

    move-object v11, v8

    move-wide/from16 v7, v42

    const-wide/16 v9, 0x0

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    const/4 v12, 0x0

    move/from16 v20, v13

    const/4 v13, 0x0

    move/from16 v21, v14

    move/from16 v22, v15

    const-wide/16 v14, 0x0

    move/from16 v23, v16

    const/16 v16, 0x0

    move/from16 v24, v17

    const/16 v17, 0x0

    move-object/from16 v26, v18

    move/from16 v28, v19

    const-wide/16 v18, 0x0

    move/from16 v32, v20

    const/16 v20, 0x0

    move/from16 v33, v21

    const/16 v21, 0x0

    move/from16 v34, v22

    const/16 v22, 0x0

    move/from16 v35, v23

    const/16 v23, 0x0

    move/from16 v36, v24

    const/16 v24, 0x0

    move-object/from16 v37, v26

    const/16 v26, 0x0

    move/from16 v38, v28

    const/16 v28, 0x0

    move/from16 v39, v35

    move/from16 v41, v36

    move-object/from16 v40, v37

    move/from16 v1, v38

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v27

    if-eqz p0, :cond_8

    const v5, 0x24007e62

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-static {v9, v1}, Ltj1/c;->b(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    move-object/from16 v7, v31

    move/from16 v5, v39

    goto :goto_5

    :cond_8
    const v5, 0x240082d4

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x1

    int-to-float v6, v5

    move-object/from16 v7, v31

    move/from16 v5, v39

    invoke-static {v6, v5, v7, v9, v1}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    :goto_5
    sget v6, Lgj1/b;->d:I

    invoke-static {v6, v9, v1}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v8, v40

    move/from16 v10, v41

    invoke-virtual {v8, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->c1()J

    move-result-wide v11

    invoke-virtual {v8, v9, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    const/16 v28, 0x0

    const v30, 0x2fffa

    move/from16 v16, v5

    move-object v5, v6

    const/4 v6, 0x0

    move-object/from16 v27, v9

    move/from16 v17, v10

    const-wide/16 v9, 0x0

    move-object/from16 v31, v7

    move-object/from16 v18, v8

    move-wide v7, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    move/from16 v35, v16

    const/16 v16, 0x0

    move/from16 v36, v17

    const/16 v17, 0x0

    move-object/from16 v37, v18

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v4, v31

    move/from16 v1, v35

    move/from16 v2, v36

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v27

    sget-object v6, Lny0/n0;->TextSmall:Lny0/n0;

    sget v5, Lgj1/b;->e:I

    invoke-static {v5}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    new-instance v5, Ly71/g;

    invoke-static/range {v37 .. v37}, Lih0/d0;->E(Lx81/d;)I

    move-result v8

    const/4 v10, 0x0

    const/4 v11, 0x2

    invoke-direct {v5, v8, v10, v11, v10}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-wide/high16 v10, 0x3ff8000000000000L    # 1.5

    double-to-float v8, v10

    mul-float/2addr v8, v1

    invoke-static {v4, v8}, Lsj1/a;->j(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v8

    and-int/lit16 v0, v0, 0x380

    const/16 v10, 0x100

    if-ne v0, v10, :cond_9

    const/4 v15, 0x1

    goto :goto_6

    :cond_9
    const/4 v15, 0x0

    :goto_6
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v15, :cond_a

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v0, v10, :cond_b

    :cond_a
    new-instance v0, Lsg2/b;

    const/16 v10, 0xc

    invoke-direct {v0, v3, v10}, Lsg2/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v17, v0

    check-cast v17, Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v0, v0, 0x6

    or-int/lit8 v0, v0, 0x30

    sget v10, Ly71/g;->c:I

    shl-int/lit8 v10, v10, 0xc

    or-int v19, v0, v10

    const/16 v20, 0x0

    const/16 v21, 0xfe8

    move-object/from16 v27, v9

    move-object v9, v5

    move-object v5, v8

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v18, v27

    invoke-static/range {v5 .. v21}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v18

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    double-to-float v0, v5

    invoke-static {v0, v1, v4, v9}, Ld;->w(FFLb2/t;Lp1/q;)V

    sget v0, Lgj1/b;->g:I

    const/4 v12, 0x0

    invoke-static {v0, v9, v12}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "toUpperCase(...)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, v37

    invoke-virtual {v0, v9, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v7

    invoke-virtual {v0, v9, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->M()Lb91/a;

    move-result-object v25

    const/16 v28, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v9

    const-wide/16 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v27

    sget v5, Lgj1/b;->f:I

    const/4 v12, 0x0

    invoke-static {v5, v9, v12}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v9, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v7

    invoke-virtual {v0, v9, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v27

    const/4 v5, 0x1

    int-to-float v0, v5

    invoke-static {v0, v1, v4, v9}, Ld;->w(FFLb2/t;Lp1/q;)V

    sget v0, Lgj1/a;->b:I

    const/4 v12, 0x0

    invoke-static {v0, v9, v12}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v5

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v13, 0x61b0

    const/16 v14, 0x68

    const/4 v8, 0x0

    sget-object v9, Ly2/j;->d:Ly2/b1;

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v12, v27

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v12

    const/4 v5, 0x1

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_c
    move-object v9, v12

    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_d

    new-instance v0, Lsg2/o;

    const/4 v5, 0x3

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lsg2/o;-><init>(ZLjava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lmj1/a$e;->a:Lmj1/a$e;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Ltj1/b;->c(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
