.class public abstract Lat2/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lys2/e$m;",
        "viewState",
        "Lkotlin/Function1;",
        "Lws2/i;",
        "Ll83/a0;",
        "onViewEvent",
        "i",
        "(Lys2/e$m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lys2/e$m;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lat2/j0;->k(Lkotlin/jvm/functions/Function1;Lys2/e$m;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lat2/j0;->l(Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lys2/e$m;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lat2/j0;->m(Lkotlin/jvm/functions/Function1;Lys2/e$m;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lys2/e$m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lat2/j0;->q(Lys2/e$m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lys2/e$m;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lat2/j0;->o(Lkotlin/jvm/functions/Function1;Lys2/e$m;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lys2/e$m;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lat2/j0;->p(Lkotlin/jvm/functions/Function1;Lys2/e$m;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lws2/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lat2/j0;->j(Lws2/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Lys2/e$m;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lat2/j0;->n(Lkotlin/jvm/functions/Function1;Lys2/e$m;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lys2/e$m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 57
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lys2/e$m;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p2

    check-cast v15, Lp1/q;

    const v0, -0x4e9ceb44

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v15, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :goto_3
    and-int/lit8 v4, v0, 0x13

    const/16 v13, 0x12

    const/4 v14, 0x0

    if-eq v4, v13, :cond_5

    const/4 v4, 0x1

    goto :goto_4

    :cond_5
    move v4, v14

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v15, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_26

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_7

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_6

    new-instance v2, Laq0/p;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Laq0/p;-><init>(I)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v2, v3

    :goto_5
    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v3, v6}, Lvl/b;->c(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lb2/e;->w:Lb2/m;

    invoke-static {v8, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v9, v15, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v15, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 p2, v13

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v5, v15, Lp1/q;->S:Z

    if-eqz v5, :cond_8

    invoke-virtual {v15, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_6
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v15, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v15, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v12, v15, Lp1/q;->S:Z

    if-nez v12, :cond_9

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v12, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_a

    :cond_9
    invoke-static {v9, v15, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v15, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v12, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v12, v9, v15, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move-object/from16 v19, v2

    move-object/from16 v20, v3

    iget-wide v2, v15, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v15, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v14, v15, Lp1/q;->S:Z

    if-eqz v14, :cond_b

    invoke-virtual {v15, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v15, v5, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v15, Lp1/q;->S:Z

    if-nez v3, :cond_c

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    :cond_c
    invoke-static {v2, v15, v2, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v15, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v3, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v1}, Lys2/e$m;->b()Lys2/f;

    move-result-object v2

    invoke-virtual {v2}, Lys2/f;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v23

    invoke-virtual {v1}, Lys2/e$m;->b()Lys2/f;

    move-result-object v2

    invoke-virtual {v2}, Lys2/f;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v2

    const/4 v6, 0x0

    if-eqz v2, :cond_e

    new-instance v2, Lo81/a;

    invoke-virtual {v1}, Lys2/e$m;->b()Lys2/f;

    move-result-object v7

    invoke-virtual {v7}, Lys2/f;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move/from16 v40, v0

    const/4 v0, 0x0

    const/4 v14, 0x2

    invoke-direct {v2, v7, v0, v14, v6}, Lo81/a;-><init>(Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v24, v2

    goto :goto_8

    :cond_e
    move/from16 v40, v0

    move-object/from16 v24, v6

    :goto_8
    new-instance v0, Ly71/g;

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-static {v14}, Lih0/d0;->C(Lx81/d;)I

    move-result v2

    sget v6, Luv0/c;->E:I

    invoke-static {v15, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-direct {v0, v2, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    const/16 v38, 0x7ff8

    const/16 v39, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    move-object/from16 v25, v0

    move-object/from16 v22, v3

    invoke-direct/range {v22 .. v39}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v0, v40, 0x70

    const/16 v2, 0x20

    if-ne v0, v2, :cond_f

    const/4 v6, 0x1

    goto :goto_9

    :cond_f
    const/4 v6, 0x0

    :goto_9
    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_11

    if-ne v7, v4, :cond_10

    goto :goto_a

    :cond_10
    move-object/from16 v2, v19

    goto :goto_b

    :cond_11
    :goto_a
    new-instance v7, Lat2/h0;

    const/4 v6, 0x0

    move-object/from16 v2, v19

    invoke-direct {v7, v2, v1, v6}, Lat2/h0;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$m;I)V

    invoke-virtual {v15, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_b
    check-cast v7, Lc93/a;

    sget v6, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v6, v6, 0x3

    move-object/from16 v19, v10

    const/16 v10, 0x35

    move-object/from16 v22, v2

    const/4 v2, 0x0

    move-object/from16 v23, v4

    const/4 v4, 0x0

    move-object/from16 v24, v9

    move v9, v6

    const/4 v6, 0x0

    move-object/from16 v25, v5

    move-object v5, v7

    const/4 v7, 0x0

    move/from16 p1, v0

    move-object v1, v8

    move-object/from16 v16, v14

    move-object v8, v15

    move-object/from16 v28, v19

    move-object/from16 v0, v20

    move-object/from16 v19, v22

    move-object/from16 v42, v23

    move-object/from16 v14, v24

    move-object/from16 v15, v25

    const/16 v17, 0x20

    move-object/from16 v20, v11

    const/4 v11, 0x1

    invoke-static/range {v2 .. v10}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v8

    const/4 v2, 0x0

    invoke-static {v2, v5, v11}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v3

    const/16 v4, 0xe

    invoke-static {v0, v3, v4}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-wide/high16 v6, 0x4004000000000000L    # 2.5

    double-to-float v4, v6

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v4, v6

    const/4 v7, 0x0

    const/4 v8, 0x2

    invoke-static {v3, v4, v7, v8}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v12, v14, v5, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v5, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v5, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_12

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_12
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v5, v15, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-nez v7, :cond_13

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_14

    :cond_13
    move-object/from16 v7, v28

    goto :goto_e

    :cond_14
    move-object/from16 v7, v28

    :goto_d
    move-object/from16 v8, v20

    goto :goto_f

    :goto_e
    invoke-static {v8, v5, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_d

    :goto_f
    invoke-static {v5, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v14, 0x2

    int-to-float v3, v14

    mul-float/2addr v3, v6

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v5, v9}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lys2/e$m;->b()Lys2/f;

    move-result-object v9

    invoke-virtual {v9}, Lys2/f;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v9, v5, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    sget v12, Lx81/d;->b:I

    move-object/from16 v14, v16

    invoke-virtual {v14, v5, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->y()J

    move-result-wide v20

    invoke-virtual {v14, v5, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->P()Lb91/a;

    move-result-object v22

    sget v16, Lb91/a;->d:I

    shl-int/lit8 v26, v16, 0x12

    const v27, 0x2fffa

    move/from16 v16, v3

    const/4 v3, 0x0

    move/from16 v18, v6

    move-object/from16 v28, v7

    const-wide/16 v6, 0x0

    move-object/from16 v23, v8

    const/4 v8, 0x0

    move/from16 v24, v2

    move-object v2, v9

    const/4 v9, 0x0

    move/from16 v25, v10

    const/4 v10, 0x0

    move/from16 v30, v11

    move/from16 v29, v12

    const-wide/16 v11, 0x0

    move-object/from16 v31, v13

    const/4 v13, 0x0

    move-object/from16 v32, v14

    const/4 v14, 0x0

    move-object/from16 v33, v15

    move/from16 v34, v16

    const-wide/16 v15, 0x0

    move/from16 v35, v17

    const/16 v17, 0x0

    move/from16 v36, v18

    const/16 v18, 0x0

    move-object/from16 v37, v19

    const/16 v19, 0x0

    move/from16 v38, v24

    move-object/from16 v24, v5

    move-wide/from16 v55, v20

    move/from16 v21, v4

    move-wide/from16 v4, v55

    const/16 v20, 0x0

    move/from16 v39, v21

    const/16 v21, 0x0

    move-object/from16 v40, v23

    const/16 v23, 0x0

    move/from16 v43, v25

    const/16 v25, 0x0

    move-object/from16 v46, v28

    move/from16 v49, v29

    move-object/from16 v44, v31

    move-object/from16 v45, v33

    move/from16 v48, v39

    move-object/from16 v47, v40

    move-object/from16 v28, v1

    move/from16 v1, v30

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    int-to-float v2, v1

    mul-float v2, v2, v36

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v5, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lys2/e$m;->b()Lys2/f;

    move-result-object v2

    invoke-virtual {v2}, Lys2/f;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move/from16 v3, v43

    invoke-static {v2, v5, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v14, v32

    move/from16 v4, v49

    invoke-virtual {v14, v5, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v6

    invoke-virtual {v14, v5, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    const/4 v3, 0x0

    move-wide v4, v6

    const-wide/16 v6, 0x0

    const/4 v14, 0x0

    move/from16 v1, v43

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    move/from16 v3, v34

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v5, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lys2/e$m;->c()Lbu2/d;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lys2/e$m;->c()Lbu2/d;

    move-result-object v2

    invoke-virtual {v2}, Lbu2/d;->q()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v5, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lks2/a;->q:I

    invoke-static {v5, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    sget-object v20, Lbu2/c0;->SLEEP:Lbu2/c0;

    const v24, 0xefef

    const/16 v25, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    invoke-static/range {v6 .. v25}, Lbu2/d;->b(Lbu2/d;FFFDLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lbu2/k;Lbu2/h;Ljava/util/List;Lbu2/c0;Ly81/e;Ljava/lang/Double;Ly81/e;ILjava/lang/Object;)Lbu2/d;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v8, v42

    if-ne v3, v8, :cond_15

    new-instance v3, Laq0/p;

    const/16 v4, 0x12

    invoke-direct {v3, v4}, Laq0/p;-><init>(I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v3}, Li3/n;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move/from16 v9, p1

    const/16 v10, 0x20

    if-ne v9, v10, :cond_16

    const/4 v14, 0x1

    :goto_10
    move/from16 v43, v1

    move-object/from16 v1, p0

    goto :goto_11

    :cond_16
    const/4 v14, 0x0

    goto :goto_10

    :goto_11
    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v4, v14

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_18

    if-ne v6, v8, :cond_17

    goto :goto_12

    :cond_17
    move-object/from16 v11, v37

    goto :goto_13

    :cond_18
    :goto_12
    new-instance v6, Lat2/i0;

    const/4 v4, 0x0

    move-object/from16 v11, v37

    invoke-direct {v6, v11, v1, v4}, Lat2/i0;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$m;I)V

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_13
    move-object v4, v6

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lbu2/g;->f(Lbu2/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v1}, Lys2/e$m;->a()Lys2/b;

    move-result-object v4

    invoke-virtual {v4}, Lys2/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    if-ne v9, v10, :cond_19

    const/4 v14, 0x1

    goto :goto_14

    :cond_19
    const/4 v14, 0x0

    :goto_14
    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v6, v14

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_1a

    if-ne v7, v8, :cond_1b

    :cond_1a
    new-instance v7, Lat2/h0;

    const/4 v6, 0x1

    invoke-direct {v7, v11, v1, v6}, Lat2/h0;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$m;I)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object v15, v7

    check-cast v15, Lc93/a;

    shl-int/lit8 v6, v43, 0x12

    const/4 v7, 0x6

    or-int/lit8 v17, v6, 0x6

    const/16 v18, 0x0

    const/16 v19, 0x1fbe

    move/from16 v41, v2

    move-object v2, v3

    const/4 v3, 0x0

    move-object/from16 v23, v8

    move-object v8, v4

    const/4 v4, 0x0

    move-object/from16 v24, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v12, v7

    const/4 v7, 0x0

    move v13, v9

    const/4 v9, 0x0

    move/from16 v35, v10

    const/4 v10, 0x0

    move-object/from16 v37, v11

    const/4 v11, 0x0

    move v14, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v20, v14

    const/4 v14, 0x0

    move/from16 p1, v16

    move-object/from16 v51, v23

    move-object/from16 v16, v24

    move-object/from16 v50, v37

    move/from16 v1, v41

    invoke-static/range {v2 .. v19}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v16

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v2

    move/from16 v3, v36

    invoke-static {v2, v3, v0, v5}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->f:Ll0/h;

    sget-object v3, Lb2/e;->J:Lb2/l;

    const/4 v12, 0x6

    invoke-static {v2, v3, v5, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v3, v5, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-eqz v6, :cond_1c

    move-object/from16 v6, v44

    invoke-virtual {v5, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_15
    move-object/from16 v15, v45

    goto :goto_16

    :cond_1c
    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_15

    :goto_16
    invoke-static {v5, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v28

    invoke-static {v5, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_1d

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1e

    :cond_1d
    move-object/from16 v7, v46

    goto :goto_18

    :cond_1e
    :goto_17
    move-object/from16 v8, v47

    goto :goto_19

    :goto_18
    invoke-static {v3, v5, v3, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_17

    :goto_19
    invoke-static {v5, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lys2/e$m;->a()Lys2/b;

    move-result-object v1

    invoke-virtual {v1}, Lys2/b;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    if-nez v4, :cond_1f

    const v1, 0x1e1c160e

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x0

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    move/from16 v53, p1

    move-object/from16 v52, v50

    move-object/from16 v54, v51

    :goto_1a
    move/from16 v4, v48

    const/4 v11, 0x1

    goto/16 :goto_1f

    :cond_1f
    const/4 v1, 0x0

    const v2, 0x1e1c160f

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    move/from16 v2, p1

    const/16 v3, 0x20

    if-ne v2, v3, :cond_20

    const/4 v14, 0x1

    :goto_1b
    move-object/from16 v6, p0

    goto :goto_1c

    :cond_20
    move v14, v1

    goto :goto_1b

    :goto_1c
    invoke-virtual {v5, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v7, v14

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_22

    move-object/from16 v7, v51

    if-ne v8, v7, :cond_21

    goto :goto_1d

    :cond_21
    move-object/from16 v10, v50

    goto :goto_1e

    :cond_22
    move-object/from16 v7, v51

    :goto_1d
    new-instance v8, Lat2/i0;

    const/4 v9, 0x1

    move-object/from16 v10, v50

    invoke-direct {v8, v10, v6, v9}, Lat2/i0;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$m;I)V

    invoke-virtual {v5, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1e
    move-object v14, v8

    check-cast v14, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v16, v43, 0x6

    const/16 v17, 0x0

    const/16 v18, 0xffb

    move v13, v2

    const/4 v2, 0x0

    move/from16 v35, v3

    const/4 v3, 0x0

    move-object/from16 v24, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v23, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v37, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v53, v15

    move-object/from16 v54, v23

    move-object/from16 v15, v24

    move-object/from16 v52, v37

    invoke-static/range {v2 .. v18}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object v5, v15

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    goto :goto_1a

    :goto_1f
    invoke-static {v5, v11, v0, v4, v5}, Lhc3/i;->r(Lp1/q;ZLb2/t;FLp1/q;)V

    invoke-static {v5, v11, v11, v11}, Lm4/a;->y(Lp1/q;ZZZ)V

    move/from16 v13, v53

    const/16 v2, 0x20

    if-ne v13, v2, :cond_23

    const/4 v14, 0x1

    :goto_20
    move-object/from16 v6, p0

    goto :goto_21

    :cond_23
    move v14, v1

    goto :goto_20

    :goto_21
    invoke-virtual {v5, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v14

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_25

    move-object/from16 v7, v54

    if-ne v2, v7, :cond_24

    goto :goto_22

    :cond_24
    move-object/from16 v11, v52

    goto :goto_23

    :cond_25
    :goto_22
    new-instance v2, Lat2/h0;

    const/4 v0, 0x2

    move-object/from16 v11, v52

    invoke-direct {v2, v11, v6, v0}, Lat2/h0;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$m;I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_23
    check-cast v2, Lc93/a;

    const/4 v0, 0x1

    invoke-static {v2, v1, v5, v1, v0}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object v3, v11

    goto :goto_24

    :cond_26
    move-object v6, v1

    move-object v5, v15

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_24
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_27

    new-instance v0, La01/i;

    const/4 v5, 0x4

    move/from16 v2, p3

    move/from16 v4, p4

    move-object v1, v6

    invoke-direct/range {v0 .. v5}, La01/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_27
    return-void
.end method

.method private static final j(Lws2/i;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Lys2/e$m;)Ll83/a0;
    .locals 4

    new-instance v0, Lws2/i$a;

    invoke-virtual {p1}, Lys2/e$m;->e()Lws2/g;

    move-result-object p1

    invoke-virtual {p1}, Lws2/g;->a()I

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p1, v1, v2, v3}, Lws2/i$a;-><init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$clearAndSetSemantics"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SetUpSleepConsistency_Body_Slider_SleepConsistency"

    invoke-static {v0, p0}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;Lys2/e$m;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lbu2/o$a;

    if-eqz v0, :cond_0

    check-cast p2, Lbu2/o$a;

    invoke-virtual {p2}, Lbu2/o$a;->a()F

    move-result p2

    float-to-double v0, p2

    invoke-virtual {p1}, Lys2/e$m;->g()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object p1

    new-instance p2, Lws2/i$m;

    invoke-direct {p2, p1, v0, v1}, Lws2/i$m;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;D)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;Lys2/e$m;)Ll83/a0;
    .locals 9

    new-instance v0, Lws2/i$i;

    invoke-virtual {p1}, Lys2/e$m;->d()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->SLEEP_CONSISTENCY:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    invoke-virtual {p1}, Lys2/e$m;->f()D

    move-result-wide v3

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lws2/i$i;-><init>(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;DZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lkotlin/jvm/functions/Function1;Lys2/e$m;Ljava/lang/Object;)Ll83/a0;
    .locals 7

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lws2/i$c;

    invoke-virtual {p1}, Lys2/e$m;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lys2/e$m;->g()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lws2/i$c;-><init>(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lkotlin/jvm/functions/Function1;Lys2/e$m;)Ll83/a0;
    .locals 4

    new-instance v0, Lws2/i$a;

    invoke-virtual {p1}, Lys2/e$m;->e()Lws2/g;

    move-result-object p1

    invoke-virtual {p1}, Lws2/g;->a()I

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p1, v1, v2, v3}, Lws2/i$a;-><init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lys2/e$m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lat2/j0;->i(Lys2/e$m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
