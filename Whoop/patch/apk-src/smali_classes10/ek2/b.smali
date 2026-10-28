.class public abstract Lek2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aq\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00082\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000c2\u0014\u0008\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\u0008H\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "",
        "forwardButtonEnabled",
        "",
        "forwardDate",
        "backButtonEnabled",
        "backDate",
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "Lkotlin/Function1;",
        "Lbk2/b;",
        "Ll83/a0;",
        "onViewEvent",
        "Lkotlin/Function0;",
        "displayCalendar",
        "dateSelectorClicked",
        "g",
        "(ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "tilt-graph_release"
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
.method public static synthetic a(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lek2/b;->j(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lek2/b;->m(ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lek2/b;->l(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lek2/b;->h()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Z)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lek2/b;->i(Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lek2/b;->k(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Lcom/whoop/design/util/TextResource;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v9, p9

    move/from16 v10, p10

    const-string v0, "forwardDate"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backDate"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p8

    check-cast v0, Lp1/q;

    const v1, -0x3ab97e35

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v9, 0x6

    if-nez v1, :cond_1

    move/from16 v1, p0

    invoke-virtual {v0, v1}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v9

    goto :goto_1

    :cond_1
    move/from16 v1, p0

    move v7, v9

    :goto_1
    and-int/lit8 v8, v9, 0x30

    if-nez v8, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_3
    and-int/lit16 v8, v9, 0x180

    if-nez v8, :cond_5

    move/from16 v8, p2

    invoke-virtual {v0, v8}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v12, 0x100

    goto :goto_3

    :cond_4
    const/16 v12, 0x80

    :goto_3
    or-int/2addr v7, v12

    goto :goto_4

    :cond_5
    move/from16 v8, p2

    :goto_4
    and-int/lit16 v12, v9, 0xc00

    if-nez v12, :cond_7

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    const/16 v12, 0x800

    goto :goto_5

    :cond_6
    const/16 v12, 0x400

    :goto_5
    or-int/2addr v7, v12

    :cond_7
    and-int/lit16 v12, v9, 0x6000

    if-nez v12, :cond_a

    const v12, 0x8000

    and-int/2addr v12, v9

    if-nez v12, :cond_8

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    goto :goto_6

    :cond_8
    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    :goto_6
    if-eqz v12, :cond_9

    const/16 v12, 0x4000

    goto :goto_7

    :cond_9
    const/16 v12, 0x2000

    :goto_7
    or-int/2addr v7, v12

    :cond_a
    const/high16 v12, 0x30000

    and-int/2addr v12, v9

    if-nez v12, :cond_c

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/high16 v12, 0x20000

    goto :goto_8

    :cond_b
    const/high16 v12, 0x10000

    :goto_8
    or-int/2addr v7, v12

    :cond_c
    and-int/lit8 v12, v10, 0x40

    const/high16 v16, 0x180000

    if-eqz v12, :cond_d

    or-int v7, v7, v16

    move-object/from16 v11, p6

    goto :goto_a

    :cond_d
    and-int v16, v9, v16

    move-object/from16 v11, p6

    if-nez v16, :cond_f

    invoke-virtual {v0, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/high16 v16, 0x100000

    goto :goto_9

    :cond_e
    const/high16 v16, 0x80000

    :goto_9
    or-int v7, v7, v16

    :cond_f
    :goto_a
    and-int/lit16 v13, v10, 0x80

    const/high16 v17, 0xc00000

    if-eqz v13, :cond_10

    or-int v7, v7, v17

    move-object/from16 v14, p7

    goto :goto_c

    :cond_10
    and-int v17, v9, v17

    move-object/from16 v14, p7

    if-nez v17, :cond_12

    invoke-virtual {v0, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_11

    const/high16 v19, 0x800000

    goto :goto_b

    :cond_11
    const/high16 v19, 0x400000

    :goto_b
    or-int v7, v7, v19

    :cond_12
    :goto_c
    const v19, 0x492493

    and-int v15, v7, v19

    const v3, 0x492492

    if-eq v15, v3, :cond_13

    const/4 v3, 0x1

    goto :goto_d

    :cond_13
    const/4 v3, 0x0

    :goto_d
    and-int/lit8 v15, v7, 0x1

    invoke-virtual {v0, v15, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_28

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-eqz v12, :cond_15

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v3, :cond_14

    new-instance v11, Lej1/a;

    const/4 v12, 0x2

    invoke-direct {v11, v12}, Lej1/a;-><init>(I)V

    invoke-virtual {v0, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v11, Lc93/a;

    :cond_15
    if-eqz v13, :cond_17

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v3, :cond_16

    new-instance v12, Lej1/n;

    const/16 v13, 0xc

    invoke-direct {v12, v13}, Lej1/n;-><init>(I)V

    invoke-virtual {v0, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v12, Lkotlin/jvm/functions/Function1;

    goto :goto_e

    :cond_17
    move-object v12, v14

    :goto_e
    const/high16 v13, 0x380000

    and-int/2addr v13, v7

    const/high16 v14, 0x100000

    if-ne v13, v14, :cond_18

    const/4 v13, 0x1

    goto :goto_f

    :cond_18
    const/4 v13, 0x0

    :goto_f
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    const/16 v15, 0xe

    if-nez v13, :cond_19

    if-ne v14, v3, :cond_1a

    :cond_19
    new-instance v14, Ld42/o;

    invoke-direct {v14, v11, v15}, Ld42/o;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object/from16 v25, v14

    check-cast v25, Lc93/a;

    const/16 v26, 0xf

    sget-object v21, Lb2/t;->w:Lb2/t;

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, Ll0/m;->a:Ll0/e;

    const/4 v14, 0x2

    int-to-float v15, v14

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float/2addr v15, v14

    sget-object v14, Lb2/e;->N:Lb2/k;

    invoke-static {v15, v14}, Ll0/m;->j(FLb2/f;)Ll0/k;

    move-result-object v14

    sget-object v15, Lb2/e;->K:Lb2/l;

    const/16 v1, 0x36

    invoke-static {v14, v15, v0, v1}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v14, v0, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v0, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-eqz v9, :cond_1b

    invoke-virtual {v0, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_1b
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_10
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v0, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v0, v1, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v8, v0, Lp1/q;->S:Z

    if-nez v8, :cond_1c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1d

    :cond_1c
    invoke-static {v14, v0, v14, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v0, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v14, v12

    new-instance v12, Lny0/o;

    sget-object v13, Lny0/q$c;->f:Lny0/q$c;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/i0;->e()I

    move-result v1

    const/16 v23, 0x3dc

    const/16 v24, 0x0

    const/4 v15, 0x0

    const/16 v8, 0x800

    const/16 v16, 0x0

    const/high16 v9, 0x20000

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/high16 v18, 0x800000

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 p6, v14

    move v14, v1

    move-object/from16 v1, p6

    move/from16 v8, v18

    const/16 p6, 0xe

    move/from16 v18, p2

    invoke-direct/range {v12 .. v24}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v37, v13

    sget v13, Lgy0/f;->R0:I

    const/4 v14, 0x0

    invoke-static {v13, v0, v14}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v13

    const/high16 v14, 0x1c00000

    and-int/2addr v14, v7

    if-ne v14, v8, :cond_1e

    const/4 v15, 0x1

    goto :goto_11

    :cond_1e
    const/4 v15, 0x0

    :goto_11
    const/high16 v16, 0x70000

    and-int v8, v7, v16

    if-ne v8, v9, :cond_1f

    const/16 v16, 0x1

    goto :goto_12

    :cond_1f
    const/16 v16, 0x0

    :goto_12
    or-int v15, v15, v16

    and-int/lit16 v9, v7, 0x1c00

    move/from16 v38, v7

    const/16 v7, 0x800

    if-ne v9, v7, :cond_20

    const/4 v7, 0x1

    goto :goto_13

    :cond_20
    const/4 v7, 0x0

    :goto_13
    or-int/2addr v7, v15

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_21

    if-ne v9, v3, :cond_22

    :cond_21
    new-instance v9, Lby1/b;

    const/4 v7, 0x1

    invoke-direct {v9, v1, v6, v4, v7}, Lby1/b;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;I)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    move-object v15, v9

    check-cast v15, Lc93/a;

    sget v17, Lny0/o;->k:I

    const/16 v18, 0xc

    move-object v7, v11

    move-object v11, v12

    move-object v12, v13

    const/4 v13, 0x0

    move v9, v14

    const/4 v14, 0x0

    move-object/from16 v16, v0

    const/16 v0, 0x20

    invoke-static/range {v11 .. v18}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v16

    move/from16 v39, v17

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v12, v11, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->L()Lb91/a;

    move-result-object v31

    invoke-virtual {v12, v11, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v13

    sget v12, Lcom/whoop/design/util/TextResource;->$stable:I

    shr-int/lit8 v15, v38, 0xc

    and-int/lit8 v15, v15, 0xe

    or-int/2addr v12, v15

    invoke-static {v5, v11, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    new-instance v15, Lw3/k;

    const/4 v0, 0x3

    invoke-direct {v15, v0}, Lw3/k;-><init>(I)V

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v35, v0, 0x12

    const v36, 0x2fdfa

    move-object v11, v12

    const/4 v12, 0x0

    move-object/from16 v23, v15

    move-object/from16 v33, v16

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    invoke-static/range {v11 .. v36}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v33

    new-instance v11, Lny0/o;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v12

    invoke-virtual {v12}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v12

    invoke-virtual {v12}, Lgz0/i0;->n()I

    move-result v13

    const/16 v22, 0x3dc

    const/16 v23, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move/from16 v17, p0

    move-object/from16 v12, v37

    invoke-direct/range {v11 .. v23}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v12, Lgy0/f;->h2:I

    const/4 v14, 0x0

    invoke-static {v12, v0, v14}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    const/high16 v13, 0x800000

    if-ne v9, v13, :cond_23

    const/4 v9, 0x1

    :goto_14
    const/high16 v13, 0x20000

    goto :goto_15

    :cond_23
    move v9, v14

    goto :goto_14

    :goto_15
    if-ne v8, v13, :cond_24

    const/4 v8, 0x1

    goto :goto_16

    :cond_24
    move v8, v14

    :goto_16
    or-int/2addr v8, v9

    and-int/lit8 v9, v38, 0x70

    const/16 v13, 0x20

    if-ne v9, v13, :cond_25

    const/4 v14, 0x1

    :cond_25
    or-int/2addr v8, v14

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_26

    if-ne v9, v3, :cond_27

    :cond_26
    new-instance v9, Lby1/b;

    const/4 v14, 0x2

    invoke-direct {v9, v1, v6, v2, v14}, Lby1/b;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;I)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    move-object v15, v9

    check-cast v15, Lc93/a;

    const/16 v18, 0xc

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v0

    move/from16 v17, v39

    invoke-static/range {v11 .. v18}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    move-object v8, v1

    goto :goto_17

    :cond_28
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v7, v11

    move-object v8, v14

    :goto_17
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_29

    new-instance v0, Lcom/whoop/profile/view/edit/i;

    move/from16 v1, p0

    move/from16 v3, p2

    move/from16 v9, p9

    invoke-direct/range {v0 .. v10}, Lcom/whoop/profile/view/edit/i;-><init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_29
    return-void
.end method

.method private static final h()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Z)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 7

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lbk2/d$a;

    invoke-static {p2}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;)Ljava/time/LocalDate;

    move-result-object v2

    const-string p0, "parse(...)"

    invoke-static {v2, p0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lbk2/d$a;-><init>(Ljava/time/LocalDate;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 7

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lbk2/d$a;

    invoke-static {p2}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;)Ljava/time/LocalDate;

    move-result-object v2

    const-string p0, "parse(...)"

    invoke-static {v2, p0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lbk2/d$a;-><init>(Ljava/time/LocalDate;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lek2/b;->g(ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
