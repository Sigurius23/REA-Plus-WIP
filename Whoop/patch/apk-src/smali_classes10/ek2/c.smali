.class public abstract Lek2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001ae\u0010\u000b\u001a\u00020\u00032\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00062\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0006H\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lbk2/c;",
        "viewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onBackPressed",
        "onDisplayCalendar",
        "Lkotlin/Function1;",
        "",
        "dateSelectorClicked",
        "Lbk2/b;",
        "onViewEvent",
        "g",
        "(Lbk2/c;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lek2/c;->i()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lbk2/c;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lek2/c;->m(Lbk2/c;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lbk2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lek2/c;->k(Lbk2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Z)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lek2/c;->j(Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Lek2/c;->h()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lek2/c;->l(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lbk2/c;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbk2/c;",
            "Lc93/a;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v6, p6

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0xa34fc39

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, v6, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    or-int/2addr v0, v6

    goto :goto_2

    :cond_2
    move v0, v6

    :goto_2
    and-int/lit8 v4, p7, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v7, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x20

    goto :goto_3

    :cond_5
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v0, v8

    :goto_4
    and-int/lit8 v8, p7, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v9, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_5

    :cond_8
    const/16 v10, 0x80

    :goto_5
    or-int/2addr v0, v10

    :goto_6
    and-int/lit8 v10, p7, 0x8

    if-eqz v10, :cond_a

    or-int/lit16 v0, v0, 0xc00

    :cond_9
    move-object/from16 v11, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v11, v6, 0xc00

    if-nez v11, :cond_9

    move-object/from16 v11, p3

    invoke-virtual {v12, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    const/16 v13, 0x800

    goto :goto_7

    :cond_b
    const/16 v13, 0x400

    :goto_7
    or-int/2addr v0, v13

    :goto_8
    and-int/lit8 v13, p7, 0x10

    if-eqz v13, :cond_d

    or-int/lit16 v0, v0, 0x6000

    :cond_c
    move-object/from16 v14, p4

    goto :goto_a

    :cond_d
    and-int/lit16 v14, v6, 0x6000

    if-nez v14, :cond_c

    move-object/from16 v14, p4

    invoke-virtual {v12, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_e

    const/16 v15, 0x4000

    goto :goto_9

    :cond_e
    const/16 v15, 0x2000

    :goto_9
    or-int/2addr v0, v15

    :goto_a
    and-int/lit16 v15, v0, 0x2493

    const/16 v5, 0x2492

    move/from16 v16, v8

    const/4 v8, 0x0

    move/from16 v17, v13

    if-eq v15, v5, :cond_f

    const/4 v5, 0x1

    goto :goto_b

    :cond_f
    move v5, v8

    :goto_b
    and-int/lit8 v15, v0, 0x1

    invoke-virtual {v12, v15, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_27

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_10

    new-instance v4, Lej1/a;

    const/4 v7, 0x3

    invoke-direct {v4, v7}, Lej1/a;-><init>(I)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v4, Lc93/a;

    goto :goto_c

    :cond_11
    move-object v4, v7

    :goto_c
    if-eqz v16, :cond_13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_12

    new-instance v7, Lej1/a;

    const/4 v9, 0x4

    invoke-direct {v7, v9}, Lej1/a;-><init>(I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v7, Lc93/a;

    move-object/from16 v33, v7

    goto :goto_d

    :cond_13
    move-object/from16 v33, v9

    :goto_d
    if-eqz v10, :cond_15

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_14

    new-instance v7, Lej1/n;

    const/16 v9, 0xd

    invoke-direct {v7, v9}, Lej1/n;-><init>(I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object/from16 v34, v7

    goto :goto_e

    :cond_15
    move-object/from16 v34, v11

    :goto_e
    if-eqz v17, :cond_17

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_16

    new-instance v7, Lej1/n;

    const/16 v9, 0xe

    invoke-direct {v7, v9}, Lej1/n;-><init>(I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object/from16 v35, v7

    goto :goto_f

    :cond_17
    move-object/from16 v35, v14

    :goto_f
    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v3, v3

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float v10, v3, v9

    int-to-float v2, v2

    mul-float/2addr v2, v9

    invoke-static {v7, v10, v2}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Lb2/e;->w:Lb2/m;

    invoke-static {v9, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_18

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_18
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_10
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v12, v8, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v12, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-nez v13, :cond_19

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    move/from16 v36, v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto :goto_11

    :cond_19
    move/from16 v36, v0

    :goto_11
    invoke-static {v10, v12, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v12, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, Lb2/e;->z:Lb2/m;

    sget-object v10, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v10, v14, v7}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v13, Lb2/e;->K:Lb2/l;

    const/16 v1, 0x36

    invoke-static {v2, v13, v12, v1}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    move v13, v3

    iget-wide v2, v12, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-eqz v6, :cond_1b

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1b
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v12, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-nez v1, :cond_1c

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    :cond_1c
    invoke-static {v2, v12, v2, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    invoke-static {v12, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v1, v36, 0x70

    const/16 v2, 0x20

    if-ne v1, v2, :cond_1e

    const/4 v1, 0x1

    goto :goto_13

    :cond_1e
    const/4 v1, 0x0

    :goto_13
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1f

    if-ne v2, v5, :cond_20

    :cond_1f
    new-instance v2, Ld42/o;

    const/16 v1, 0xf

    invoke-direct {v2, v4, v1}, Ld42/o;-><init>(Lc93/a;I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    move-object/from16 v18, v2

    check-cast v18, Lc93/a;

    const/16 v19, 0xf

    move-object v1, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v3, v14

    const/4 v5, 0x6

    int-to-float v6, v5

    mul-float/2addr v6, v13

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/a;->e()I

    move-result v7

    invoke-static {v7, v12, v5}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v7

    sget v5, Lx81/d;->b:I

    invoke-virtual {v6, v12, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    move-object v15, v10

    move-wide/from16 v41, v13

    move-object v14, v11

    move-wide/from16 v10, v41

    const/16 v13, 0x30

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v17, v8

    const/4 v8, 0x0

    move-object/from16 v38, v15

    move-object/from16 v37, v16

    move-object v15, v9

    move-object v9, v2

    move-object/from16 v2, v17

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    if-eqz p0, :cond_21

    invoke-virtual/range {p0 .. p0}, Lbk2/c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    if-nez v7, :cond_22

    :cond_21
    sget v7, Lgy0/f;->F0:I

    invoke-static {v7}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    :cond_22
    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v7, v12, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v12, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->r()Lb91/a;

    move-result-object v27

    invoke-virtual {v6, v12, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v31, v11, 0x12

    const v32, 0x2fffa

    move v11, v8

    const/4 v8, 0x0

    move v13, v11

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v19, v16

    move-object/from16 v18, v17

    const-wide/16 v16, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move-object/from16 v22, v20

    move/from16 v23, v21

    const-wide/16 v20, 0x0

    move-object/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move-object/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v28, v25

    const/16 v25, 0x0

    move-object/from16 v30, v26

    const/16 v26, 0x0

    move/from16 v39, v28

    const/16 v28, 0x0

    move-object/from16 v40, v30

    const/16 v30, 0x0

    move-object/from16 p1, v4

    move/from16 p2, v5

    move/from16 v5, v39

    move-object/from16 v4, v40

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    const/4 v7, 0x1

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    if-nez p0, :cond_23

    const v0, 0x668e1d48

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/4 v8, 0x0

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    move v1, v7

    move-object/from16 v4, v33

    move-object/from16 v33, v34

    move-object/from16 v34, v35

    goto/16 :goto_15

    :cond_23
    const/4 v8, 0x0

    const v9, 0x668e1d49

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lb2/e;->E:Lb2/m;

    move-object/from16 v10, v38

    invoke-virtual {v10, v3, v9}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v9, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_24

    invoke-virtual {v12, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_24
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_14
    invoke-static {v12, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v4, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-nez v1, :cond_25

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    :cond_25
    move-object/from16 v14, v37

    invoke-static {v13, v12, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_26
    invoke-static {v12, v0, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lbk2/c;->c()Li11/f;

    move-result-object v0

    invoke-virtual {v0}, Li11/f;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lbk2/c;->c()Li11/f;

    move-result-object v0

    invoke-virtual {v0}, Li11/f;->e()Z

    move-result v9

    invoke-virtual/range {p0 .. p0}, Lbk2/c;->c()Li11/f;

    move-result-object v0

    invoke-virtual {v0}, Li11/f;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lbk2/c;->c()Li11/f;

    move-result-object v1

    invoke-virtual {v1}, Li11/f;->h()Z

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lbk2/c;->c()Li11/f;

    move-result-object v2

    invoke-virtual {v2}, Li11/f;->i()Ljava/lang/String;

    move-result-object v2

    shl-int/lit8 v4, v5, 0xc

    shl-int/lit8 v13, v36, 0x3

    const/high16 v14, 0x70000

    and-int/2addr v13, v14

    or-int/2addr v4, v13

    shl-int/lit8 v13, v36, 0xc

    const/high16 v14, 0x380000

    and-int/2addr v14, v13

    or-int/2addr v4, v14

    const/high16 v14, 0x1c00000

    and-int/2addr v13, v14

    or-int v16, v4, v13

    const/16 v17, 0x0

    move-object v13, v10

    move-object v10, v0

    move v0, v8

    move-object v8, v2

    move-object v2, v13

    move v13, v7

    move v7, v1

    move v1, v13

    move-object v15, v12

    move-object/from16 v13, v33

    move-object/from16 v14, v34

    move-object/from16 v12, v35

    invoke-static/range {v7 .. v17}, Lek2/b;->g(ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v34, v12

    move-object v4, v13

    move-object/from16 v33, v14

    move-object v12, v15

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    sget-object v7, Lb2/e;->F:Lb2/m;

    invoke-virtual {v2, v3, v7}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lbk2/c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v12, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    move/from16 v2, p2

    invoke-virtual {v6, v12, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->d()Lb91/a;

    move-result-object v27

    invoke-virtual {v6, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->b1()J

    move-result-wide v9

    const/16 v30, 0x0

    const v32, 0x2fff8

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

    :goto_15
    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    move-object/from16 v2, p1

    move-object v3, v4

    move-object/from16 v4, v33

    move-object/from16 v5, v34

    goto :goto_16

    :cond_27
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v2, v7

    move-object v3, v9

    move-object v4, v11

    move-object v5, v14

    :goto_16
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_28

    new-instance v0, La01/f;

    const/16 v8, 0x15

    move-object/from16 v1, p0

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, La01/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_28
    return-void
.end method

.method private static final h()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Z)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lbk2/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lbk2/c;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v7}, Lek2/c;->g(Lbk2/c;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
