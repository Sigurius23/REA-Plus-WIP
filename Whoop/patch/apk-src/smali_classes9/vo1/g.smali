.class public abstract Lvo1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001aY\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001aY\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000c2\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0013\u00b2\u0006\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lso1/x;",
        "viewState",
        "Lkotlin/Function1;",
        "Lso1/v;",
        "Ll83/a0;",
        "onViewEvent",
        "Lro1/a;",
        "onNavigationEvent",
        "Lyn1/a;",
        "onAnalyticEvent",
        "t",
        "(Lso1/x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lso1/x$f;",
        "A",
        "(Lso1/x$f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lso1/i;",
        "currentBottomState",
        "",
        "showHideDialog",
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
.method public static final A(Lso1/x$f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 51
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lso1/x$f;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, 0x43e928b2

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v4, p6, 0x2

    const/16 v13, 0x20

    if-eqz v4, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    move v7, v13

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p6, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit8 v9, p6, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v11, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v5, 0xc00

    if-nez v11, :cond_8

    move-object/from16 v11, p3

    invoke-virtual {v10, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v0, v12

    :goto_7
    and-int/lit16 v12, v0, 0x493

    const/16 v14, 0x492

    if-eq v12, v14, :cond_b

    const/4 v12, 0x1

    goto :goto_8

    :cond_b
    const/4 v12, 0x0

    :goto_8
    and-int/lit8 v14, v0, 0x1

    invoke-virtual {v10, v14, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_2d

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v14, :cond_c

    new-instance v4, Lve0/d;

    const/16 v6, 0x13

    invoke-direct {v4, v6}, Lve0/d;-><init>(I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_d
    move-object v4, v6

    :goto_9
    if-eqz v7, :cond_f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v14, :cond_e

    new-instance v6, Lve0/d;

    const/16 v7, 0x14

    invoke-direct {v6, v7}, Lve0/d;-><init>(I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_a

    :cond_f
    move-object v6, v8

    :goto_a
    if-eqz v9, :cond_11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v14, :cond_10

    new-instance v7, Lve0/d;

    const/16 v8, 0x15

    invoke-direct {v7, v8}, Lve0/d;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v11, v7

    :cond_11
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v14, :cond_12

    invoke-static {v10}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v7

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object/from16 v40, v7

    check-cast v40, Lbc3/c0;

    move-object v8, v6

    sget-object v6, Lg1/z3;->w:Lg1/z3;

    move-object v7, v11

    const/4 v11, 0x6

    const/16 v12, 0xe

    move-object v9, v7

    const/4 v7, 0x0

    move-object/from16 v16, v8

    const/4 v8, 0x0

    move-object/from16 v17, v9

    const/4 v9, 0x0

    move-object/from16 v3, v16

    move-object/from16 v41, v17

    invoke-static/range {v6 .. v12}, Landroidx/compose/material/c;->c(Lg1/z3;Ld0/e2;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Lg1/y3;

    move-result-object v42

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v14, :cond_13

    const/4 v6, 0x0

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v6, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v14, :cond_14

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v7, Lp1/c1;

    invoke-static {v7}, Lvo1/g;->O(Lp1/c1;)Z

    move-result v8

    if-eqz v8, :cond_19

    const v8, -0x26001f7e

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lso1/x$f;->b()Ltp1/d;

    move-result-object v8

    invoke-virtual {v8}, Ltp1/d;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    move-object v11, v8

    invoke-virtual {v11}, Ltp1/d;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    move-object v12, v9

    invoke-virtual {v11}, Ltp1/d;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v11}, Ltp1/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v14, :cond_15

    new-instance v15, Luz1/g;

    const/4 v2, 0x7

    invoke-direct {v15, v2, v7}, Luz1/g;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object/from16 v28, v15

    check-cast v28, Lc93/a;

    and-int/lit8 v2, v0, 0x70

    if-ne v2, v13, :cond_16

    const/4 v2, 0x1

    goto :goto_b

    :cond_16
    const/4 v2, 0x0

    :goto_b
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v2, :cond_17

    if-ne v15, v14, :cond_18

    :cond_17
    new-instance v15, Lmf0/c;

    const/4 v2, 0x1

    invoke-direct {v15, v2, v4, v6, v7}, Lmf0/c;-><init>(ILkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v10, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object/from16 v30, v15

    check-cast v30, Lc93/a;

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v15, v2, 0x3

    shl-int/lit8 v17, v2, 0x6

    or-int v15, v15, v17

    shl-int/lit8 v17, v2, 0x9

    or-int v15, v15, v17

    shl-int/lit8 v2, v2, 0x1b

    or-int v35, v15, v2

    const/16 v37, 0x180

    const v38, 0xebffdf1

    move-object/from16 v20, v6

    const/4 v6, 0x0

    move-object/from16 v34, v10

    const/4 v10, 0x0

    move-object v15, v11

    const/4 v11, 0x0

    move-object v2, v7

    move-object v7, v12

    const/4 v12, 0x0

    move/from16 v17, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    const/4 v14, 0x0

    const/16 v19, 0x800

    const/16 v16, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move-object/from16 v22, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move-object/from16 v24, v20

    const/16 v20, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move-object/from16 v26, v22

    const/16 v22, 0x0

    move/from16 v27, v23

    const/16 v23, 0x0

    move-object/from16 v29, v24

    const/16 v24, 0x0

    move/from16 v31, v25

    const/16 v25, 0x0

    move-object/from16 v32, v26

    const/16 v26, 0x0

    move/from16 v33, v27

    const/16 v27, 0x0

    move-object/from16 v36, v29

    const/16 v29, 0x0

    move/from16 v43, v31

    const/16 v31, 0x0

    move-object/from16 v44, v32

    const/16 v32, 0x0

    move/from16 v45, v33

    const/16 v33, 0x0

    move-object/from16 v46, v36

    const/16 v36, 0x0

    move-object/from16 v47, v44

    const/16 v1, 0x100

    invoke-static/range {v6 .. v38}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v10, v34

    const/4 v6, 0x0

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_19
    move-object/from16 v46, v6

    move-object v2, v7

    move-object/from16 v47, v14

    const/16 v1, 0x100

    const/4 v6, 0x0

    const v7, -0x25f68870

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    :goto_c
    sget-object v15, Lb2/t;->w:Lb2/t;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v15, v7}, Lvl/b;->c(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v11, v10, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v12

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_1a

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_1a
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_d
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v10, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v10, v12, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_1b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    :cond_1b
    invoke-static {v6, v10, v6, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v16, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual/range {p0 .. p0}, Lso1/x$f;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v17

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-static {v5}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v19

    sget v5, Luv0/c;->E:I

    invoke-static {v10, v5}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v20

    const v33, 0xfff2

    const/16 v34, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v16 .. v34}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v5, v0, 0x380

    const/16 v6, 0x100

    if-ne v5, v6, :cond_1d

    const/4 v6, 0x1

    goto :goto_e

    :cond_1d
    const/4 v6, 0x0

    :goto_e
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_1f

    move-object/from16 v6, v47

    if-ne v8, v6, :cond_1e

    goto :goto_f

    :cond_1e
    move-object/from16 v18, v6

    goto :goto_10

    :cond_1f
    move-object/from16 v6, v47

    :goto_f
    new-instance v8, Luf0/e;

    move-object/from16 v18, v6

    const/16 v6, 0x11

    invoke-direct {v8, v3, v6}, Luf0/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    check-cast v8, Lc93/a;

    sget v6, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    move/from16 p2, v6

    const/4 v6, 0x3

    shl-int/lit8 v17, p2, 0x3

    move-object/from16 v19, v14

    const/16 v14, 0x35

    move/from16 v20, v6

    const/4 v6, 0x0

    move-object/from16 v21, v9

    move-object v9, v8

    const/4 v8, 0x0

    move-object/from16 v34, v10

    const/4 v10, 0x0

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move/from16 v36, v0

    move-object/from16 p1, v1

    move-object/from16 v33, v2

    move-object/from16 v32, v4

    move/from16 v35, v5

    move-object v5, v7

    move-object v0, v12

    move-object v1, v13

    move-object/from16 v7, v16

    move/from16 v13, v17

    move-object/from16 v50, v18

    move-object/from16 v4, v21

    move-object/from16 v2, v22

    move-object/from16 v12, v34

    move-object/from16 v34, v3

    move-object/from16 v3, v19

    invoke-static/range {v6 .. v14}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    const/4 v6, 0x2

    int-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    invoke-static {v6, v15}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {v9, v10, v8}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v11

    const/16 v8, 0xe

    invoke-static {v6, v11, v8}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v4, v2, v10, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v8, v10, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_20

    invoke-virtual {v10, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_20
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v10, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_22

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto :goto_13

    :cond_21
    :goto_12
    move-object/from16 v0, p1

    goto :goto_14

    :cond_22
    :goto_13
    invoke-static {v4, v10, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_12

    :goto_14
    invoke-static {v10, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x266d2859

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lso1/x$f;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_23

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lso1/f;

    invoke-virtual {v1}, Lso1/f;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v10, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v10, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->P()Lb91/a;

    move-result-object v26

    invoke-virtual {v2, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v8

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v30, v4, 0x12

    const v31, 0x2fffa

    move v4, v7

    const/4 v7, 0x0

    move-object v12, v10

    const-wide/16 v10, 0x0

    move-object/from16 v28, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v5, v15

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v28

    const/4 v6, 0x3

    int-to-float v7, v6

    const/4 v8, 0x4

    int-to-float v9, v8

    mul-float/2addr v7, v9

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v10, v11}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move/from16 v49, v6

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v2, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->W0()J

    move-result-wide v2

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    const/4 v12, 0x0

    int-to-float v13, v12

    mul-float/2addr v13, v9

    new-instance v16, Lo71/b;

    const/16 v21, 0xa

    move-object/from16 v17, v1

    move-object/from16 v18, v40

    move-object/from16 v19, v42

    move-object/from16 v20, v46

    invoke-direct/range {v16 .. v21}, Lo71/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp1/c1;I)V

    move-object/from16 v1, v16

    const v12, -0x25d524e4

    invoke-static {v12, v10, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    const v14, 0x1b0006

    const/16 v15, 0x18

    const/4 v10, 0x0

    move/from16 v39, v8

    move v1, v9

    move/from16 v48, v11

    move v11, v13

    move-object/from16 v13, v28

    move-wide v8, v2

    invoke-static/range {v6 .. v15}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v13

    invoke-static {v4, v1, v5, v10}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    move v7, v4

    move-object v15, v5

    goto/16 :goto_15

    :cond_23
    move-object/from16 v19, v42

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {v10, v9, v8, v8}, Lm4/a;->y(Lp1/q;ZZZ)V

    invoke-static/range {v46 .. v46}, Lvo1/g;->M(Lp1/c1;)Lso1/i;

    move-result-object v6

    if-nez v6, :cond_24

    const v0, -0x25be3879

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    move-object/from16 v3, v32

    move-object/from16 v4, v34

    move-object/from16 v5, v41

    goto/16 :goto_1e

    :cond_24
    const v0, -0x25be3878

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    move/from16 v0, v36

    and-int/lit16 v1, v0, 0x1c00

    const/16 v2, 0x800

    if-ne v1, v2, :cond_25

    move v1, v8

    :goto_16
    move/from16 v2, v35

    const/16 v3, 0x100

    goto :goto_17

    :cond_25
    const/4 v1, 0x0

    goto :goto_16

    :goto_17
    if-ne v2, v3, :cond_26

    move v2, v8

    goto :goto_18

    :cond_26
    const/4 v2, 0x0

    :goto_18
    or-int/2addr v1, v2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_28

    move-object/from16 v1, v50

    if-ne v2, v1, :cond_27

    goto :goto_19

    :cond_27
    move-object/from16 v4, v34

    move-object/from16 v5, v41

    goto :goto_1a

    :cond_28
    move-object/from16 v1, v50

    :goto_19
    new-instance v2, Lb70/c;

    const/16 v3, 0x11

    move-object/from16 v4, v34

    move-object/from16 v5, v41

    invoke-direct {v2, v5, v3, v4}, Lb70/c;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1a
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_29

    new-instance v3, Luz1/g;

    const/16 v7, 0x8

    move-object/from16 v9, v33

    invoke-direct {v3, v7, v9}, Luz1/g;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    move-object v9, v3

    check-cast v9, Lc93/a;

    and-int/lit8 v0, v0, 0x70

    const/16 v3, 0x20

    if-ne v0, v3, :cond_2a

    goto :goto_1b

    :cond_2a
    const/4 v8, 0x0

    :goto_1b
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v8, :cond_2c

    if-ne v0, v1, :cond_2b

    goto :goto_1c

    :cond_2b
    move-object/from16 v3, v32

    goto :goto_1d

    :cond_2c
    :goto_1c
    new-instance v0, Lv41/b0;

    const/4 v1, 0x6

    move-object/from16 v3, v32

    invoke-direct {v0, v3, v1}, Lv41/b0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1d
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/16 v12, 0xc40

    move-object v8, v2

    move-object v11, v10

    move-object/from16 v7, v19

    move-object v10, v0

    invoke-static/range {v6 .. v12}, Lwo1/l;->g(Lso1/i;Lg1/y3;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v10, v11

    const/4 v9, 0x0

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    :goto_1e
    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    goto :goto_1f

    :cond_2d
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v2, v6

    move-object v3, v8

    move-object v4, v11

    :goto_1f
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_2e

    new-instance v0, Lsl0/k2;

    const/16 v7, 0x14

    move-object/from16 v1, p0

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lsl0/k2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_2e
    return-void
.end method

.method private static final B(Lso1/v;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lro1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lro1/a$a;->a:Lro1/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lso1/f;Lbc3/c0;Lg1/y3;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 38

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    sget-object v6, Lb2/e;->M:Lb2/k;

    and-int/lit8 v0, p5, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    move v0, v8

    goto :goto_0

    :cond_0
    move v0, v7

    :goto_0
    and-int/lit8 v4, p5, 0x1

    move-object/from16 v14, p4

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_12

    const/high16 v9, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v2, v2

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v2, v4

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Ll0/m;->c:Ll0/g;

    invoke-static {v2, v6, v14, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v4, v14, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v14, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v12, v14, Lp1/q;->S:Z

    if-eqz v12, :cond_1

    invoke-virtual {v14, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v14, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v14, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v14, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v14, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v14, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x496583eb

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lso1/f;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v22

    move v11, v7

    :goto_2
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v23, v11, 0x1

    if-ltz v11, :cond_10

    move-object v2, v0

    check-cast v2, Lso1/g;

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v14, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_4

    if-ne v4, v12, :cond_5

    :cond_4
    new-instance v0, Lvo1/f;

    const/4 v5, 0x0

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v5}, Lvo1/f;-><init>(Lbc3/c0;Lso1/g;Lg1/y3;Lp1/c1;I)V

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v0

    :cond_5
    move-object/from16 v19, v4

    check-cast v19, Lc93/a;

    const/16 v20, 0xf

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v8, v14, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v14, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v13, v14, Lp1/q;->S:Z

    if-eqz v13, :cond_6

    invoke-virtual {v14, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_6
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_3
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v14, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v14, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-nez v15, :cond_7

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v15, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    :cond_7
    invoke-static {v5, v14, v5, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v14, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Ll0/m;->c:Ll0/g;

    const/4 v7, 0x0

    invoke-static {v0, v6, v14, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    move-object/from16 v24, v6

    iget-wide v6, v14, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v14, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v14}, Lp1/q;->i0()V

    move/from16 p5, v11

    iget-boolean v11, v14, Lp1/q;->S:Z

    if-eqz v11, :cond_9

    invoke-virtual {v14, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_9
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v14, v13, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v14, Lp1/q;->S:Z

    if-nez v0, :cond_a

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    :cond_a
    invoke-static {v6, v14, v6, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v14, v5, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lso1/g;->b()Lf11/e;

    move-result-object v0

    invoke-virtual {v2}, Lso1/g;->d()Z

    move-result v4

    sget v5, Lf11/e;->m:I

    const/4 v7, 0x0

    invoke-static {v0, v4, v14, v5, v7}, Lf11/d;->h(Lf11/e;ZLandroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    const-string v0, "MciEditCycleTag"

    invoke-static {v10, v0}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lb2/e;->F:Lb2/m;

    sget-object v5, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v5, v0, v4}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v26, Lny0/q$b;->f:Lny0/q$b;

    invoke-virtual {v2}, Lso1/g;->c()Lgz0/m0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v27

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_c

    sget-object v0, Lvo1/g$c;->w:Lvo1/g$c;

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v28

    new-instance v25, Lny0/o;

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x3f8

    const/16 v37, 0x0

    invoke-direct/range {v25 .. v37}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v14, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_d

    if-ne v4, v12, :cond_e

    :cond_d
    new-instance v0, Lvo1/f;

    const/4 v5, 0x1

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v5}, Lvo1/f;-><init>(Lbc3/c0;Lso1/g;Lg1/y3;Lp1/c1;I)V

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v0

    :cond_e
    move-object v13, v4

    check-cast v13, Lc93/a;

    sget v0, Lny0/o;->k:I

    or-int/lit8 v15, v0, 0x30

    const/16 v16, 0x8

    move-object v0, v10

    const-string v10, ""

    const/4 v12, 0x0

    move/from16 v7, p5

    move-object v1, v0

    move-object/from16 v9, v25

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static/range {v9 .. v16}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x1

    invoke-virtual {v14, v2}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lso1/f;->a()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v2

    if-le v3, v7, :cond_f

    const v2, 0x75e00ce0

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v2, v2

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v14, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/16 v20, 0x0

    const/16 v21, 0xff

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v19, v14

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    invoke-static/range {v9 .. v21}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v14, v19

    const/4 v7, 0x0

    invoke-static {v1, v2, v14, v7}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    goto :goto_5

    :cond_f
    const/4 v7, 0x0

    const v2, 0x75e364c4

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v7}, Lp1/q;->q(Z)V

    :goto_5
    move-object/from16 v3, p2

    move v9, v0

    move-object v10, v1

    move/from16 v11, v23

    move-object/from16 v6, v24

    const/4 v8, 0x1

    move-object/from16 v1, p1

    goto/16 :goto_2

    :cond_10
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_11
    invoke-virtual {v14, v7}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_12
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_6
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final F(Lbc3/c0;Lso1/g;Lg1/y3;Lp1/c1;)Ll83/a0;
    .locals 2

    new-instance v0, Lvo1/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lvo1/g$b;-><init>(Lso1/g;Lg1/y3;Lp1/c1;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lbc3/c0;Lso1/g;Lg1/y3;Lp1/c1;)Ll83/a0;
    .locals 2

    new-instance v0, Lvo1/g$d;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p3, v1}, Lvo1/g$d;-><init>(Lso1/g;Lg1/y3;Lp1/c1;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v1, v1, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "date"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lyn1/a$b;->a:Lyn1/a$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lro1/a$b;

    const-string v0, "EDIT_CYCLE"

    invoke-direct {p0, p2, v0}, Lro1/a$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lvo1/g;->P(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ll83/a0;
    .locals 1

    const-string v0, "ids"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lso1/v$c;

    invoke-direct {v0, p1}, Lso1/v$c;-><init>(Ljava/util/List;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lso1/x$f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lvo1/g;->A(Lso1/x$f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lyn1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lp1/c1;)Lso1/i;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lso1/i;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lso1/i;

    return-object p0
.end method

.method private static final N(Lp1/c1;Lso1/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lso1/i;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final O(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final P(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final Q(Lp1/c1;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lvo1/g;->P(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R(Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lvo1/g;->M(Lp1/c1;)Lso1/i;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lso1/i;->b()Lso1/k;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Lso1/v$a;

    invoke-virtual {p0}, Lso1/k;->a()Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lso1/v$a;-><init>(Ljava/util/List;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const/4 p0, 0x0

    invoke-static {p2, p0}, Lvo1/g;->P(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic S(Lp1/c1;Lso1/i;)V
    .locals 0

    invoke-static {p0, p1}, Lvo1/g;->N(Lp1/c1;Lso1/i;)V

    return-void
.end method

.method public static synthetic a(Lyn1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvo1/g;->w(Lyn1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lro1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvo1/g;->C(Lro1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lso1/x$f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lvo1/g;->K(Lso1/x$f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lso1/v;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvo1/g;->B(Lso1/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lro1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvo1/g;->v(Lro1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lbc3/c0;Lso1/g;Lg1/y3;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvo1/g;->F(Lbc3/c0;Lso1/g;Lg1/y3;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvo1/g;->I(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2}, Lvo1/g;->R(Lp1/c1;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lso1/f;Lbc3/c0;Lg1/y3;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lvo1/g;->E(Lso1/f;Lbc3/c0;Lg1/y3;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lyn1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvo1/g;->L(Lyn1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lso1/v;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvo1/g;->u(Lso1/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvo1/g;->D(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lbc3/c0;Lso1/g;Lg1/y3;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvo1/g;->G(Lbc3/c0;Lso1/g;Lg1/y3;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvo1/g;->H(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lso1/x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lvo1/g;->z(Lso1/x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvo1/g;->x(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvo1/g;->Q(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lvo1/g;->J(Lkotlin/jvm/functions/Function1;Ljava/util/List;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvo1/g;->y(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final t(Lso1/x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lso1/x;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, 0x2efecf19

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v2, p6, 0x2

    const/16 v3, 0x20

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v5, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v6, v3

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit8 v6, p6, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v0, v8

    :goto_5
    and-int/lit8 v8, p6, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v9, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v5, 0xc00

    if-nez v9, :cond_8

    move-object/from16 v9, p3

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v0, v11

    :goto_7
    and-int/lit16 v11, v0, 0x493

    const/16 v12, 0x492

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-eq v11, v12, :cond_b

    move v11, v13

    goto :goto_8

    :cond_b
    move v11, v14

    :goto_8
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v10, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_24

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v11, :cond_c

    new-instance v2, Lve0/d;

    const/16 v4, 0x10

    invoke-direct {v2, v4}, Lve0/d;-><init>(I)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_d
    move-object v2, v4

    :goto_9
    if-eqz v6, :cond_f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v11, :cond_e

    new-instance v4, Lve0/d;

    const/16 v6, 0x11

    invoke-direct {v4, v6}, Lve0/d;-><init>(I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_a

    :cond_f
    move-object v4, v7

    :goto_a
    if-eqz v8, :cond_11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v11, :cond_10

    new-instance v6, Lve0/d;

    const/16 v7, 0x12

    invoke-direct {v6, v7}, Lve0/d;-><init>(I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object/from16 v22, v6

    goto :goto_b

    :cond_11
    move-object/from16 v22, v9

    :goto_b
    and-int/lit8 v6, v0, 0xe

    or-int/lit8 v6, v6, 0x30

    const-string v7, "healthcare_womens_health_cycle_pattern_history"

    invoke-static {v1, v7, v10, v6}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v6, Lso1/x$b;->b:Lso1/x$b;

    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_15

    const v0, -0x1993356e

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    sget-object v0, Ll0/m;->e:Ll0/h;

    sget-object v3, Lb2/e;->N:Lb2/k;

    const/16 v6, 0x36

    invoke-static {v0, v3, v10, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_12

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_12
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_c
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v10, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-nez v6, :cond_13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    :cond_13
    invoke-static {v3, v10, v3, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v10, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v0, Lsz0/p0$c;->f:I

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v3, v3, 0x3

    or-int v19, v0, v3

    const/16 v20, 0x0

    const/16 v21, 0xffc

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v18, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v0, v13

    const/4 v13, 0x0

    move v3, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v18

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_10

    :cond_15
    move/from16 v23, v13

    move v6, v14

    sget-object v7, Lso1/x$a;->b:Lso1/x$a;

    invoke-virtual {v1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_19

    const v7, -0x198d583b

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    new-instance v12, Lsz0/p0$b;

    sget v7, Lxn1/c;->k:I

    invoke-static {v10, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v16, 0x6

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v12 .. v17}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v7, Lxn1/c;->e:I

    invoke-static {v10, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v8, Lxn1/c;->f:I

    invoke-static {v10, v8}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v3, :cond_16

    move/from16 v13, v23

    goto :goto_d

    :cond_16
    move v13, v6

    :goto_d
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v13, :cond_17

    if-ne v0, v11, :cond_18

    :cond_17
    new-instance v0, Luf0/e;

    const/16 v3, 0x12

    invoke-direct {v0, v2, v3}, Luf0/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v0, Lc93/a;

    sget v3, Lsz0/p0$b;->h:I

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v11, v8, 0x3

    or-int/2addr v3, v11

    shl-int/lit8 v8, v8, 0x9

    or-int v19, v3, v8

    const/16 v20, 0x0

    const/16 v21, 0xfe4

    const/4 v8, 0x0

    const/4 v11, 0x0

    move v3, v6

    move-object v6, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v10

    move-object v10, v0

    move v0, v3

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v18

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_10

    :cond_19
    move v13, v6

    instance-of v6, v1, Lso1/x$f;

    if-eqz v6, :cond_1a

    const v3, -0x19848a8e

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    move-object v6, v1

    check-cast v6, Lso1/x$f;

    and-int/lit16 v11, v0, 0x1ffe

    const/4 v12, 0x0

    move-object v7, v2

    move-object v8, v4

    move-object/from16 v9, v22

    invoke-static/range {v6 .. v12}, Lvo1/g;->A(Lso1/x$f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    goto/16 :goto_10

    :cond_1a
    sget-object v6, Lso1/x$c;->b:Lso1/x$c;

    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1b

    const v0, -0x198041ee

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    sget-object v6, Lsz0/p0$f;->e:Lsz0/p0$f;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v0, Lsz0/p0$f;->f:I

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v3, v3, 0x3

    or-int v19, v0, v3

    const/16 v20, 0x0

    const/16 v21, 0xffc

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v18, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v3, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move v0, v3

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v18

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_10

    :cond_1b
    sget-object v6, Lso1/x$d;->b:Lso1/x$d;

    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1f

    const v6, -0x197d1dfd

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    new-instance v14, Lsz0/p0$b;

    sget v6, Lxn1/c;->k:I

    invoke-static {v10, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const/16 v18, 0x6

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v6, Lxn1/c;->e:I

    invoke-static {v10, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v6, Lxn1/c;->g:I

    invoke-static {v10, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v3, :cond_1c

    goto :goto_e

    :cond_1c
    move/from16 v23, v13

    :goto_e
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v23, :cond_1d

    if-ne v0, v11, :cond_1e

    :cond_1d
    new-instance v0, Luf0/e;

    const/16 v3, 0x13

    invoke-direct {v0, v2, v3}, Luf0/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v0, Lc93/a;

    sget v3, Lsz0/p0$b;->h:I

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v6, 0x3

    or-int/2addr v3, v8

    shl-int/lit8 v6, v6, 0x9

    or-int v19, v3, v6

    const/16 v20, 0x0

    const/16 v21, 0xfe4

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v3, v13

    const/4 v13, 0x0

    move-object v6, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v10

    move-object v10, v0

    move v0, v3

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v18

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_10

    :cond_1f
    sget-object v6, Lso1/x$e;->b:Lso1/x$e;

    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_23

    const v6, -0x19742cd5

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    new-instance v14, Lsz0/p0$h;

    sget v6, Lxn1/c;->s:I

    invoke-static {v10, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const/16 v19, 0x6

    const/16 v20, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v14 .. v20}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v6, Lsz0/p0$h;->h:I

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v8, 0x3

    or-int v19, v6, v8

    const/16 v20, 0x0

    const/16 v21, 0xffc

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v18, v10

    const/4 v10, 0x0

    move-object v6, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v16, v6

    move-object v6, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v24, v16

    const/16 v16, 0x0

    move/from16 v25, v17

    const/16 v17, 0x0

    move-object/from16 v26, v24

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v18

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v3, :cond_20

    move/from16 v13, v23

    goto :goto_f

    :cond_20
    const/4 v13, 0x0

    :goto_f
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v13, :cond_21

    move-object/from16 v3, v26

    if-ne v0, v3, :cond_22

    :cond_21
    new-instance v0, Lvo1/g$a;

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3}, Lvo1/g$a;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    check-cast v0, Lc93/m;

    invoke-static {v10, v0, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    :goto_10
    move-object v3, v4

    move-object/from16 v4, v22

    goto :goto_11

    :cond_23
    move v3, v13

    const v0, 0x6a87a4b7

    invoke-static {v0, v10, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_24
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v2, v4

    move-object v3, v7

    move-object v4, v9

    :goto_11
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_25

    new-instance v0, Lsl0/k2;

    const/16 v7, 0x13

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lsl0/k2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_25
    return-void
.end method

.method private static final u(Lso1/v;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lro1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lyn1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lso1/v$b;->a:Lso1/v$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lso1/v$b;->a:Lso1/v$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lso1/x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lvo1/g;->t(Lso1/x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
