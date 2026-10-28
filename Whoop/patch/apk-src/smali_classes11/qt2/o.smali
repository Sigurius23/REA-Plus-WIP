.class public abstract Lqt2/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lot2/p;",
        "viewState",
        "Lkotlin/Function1;",
        "Lmt2/g;",
        "Ll83/a0;",
        "onNavigationEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Lot2/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lmt2/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqt2/o;->g(Lmt2/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqt2/o;->j(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(JJLf2/d;)Lf2/g;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lqt2/o;->h(JJLf2/d;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Li2/k0;Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lqt2/o;->i(Li2/t;Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Lot2/p;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lqt2/o;->k(Landroidx/compose/ui/Modifier;Lot2/p;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lot2/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 54
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lot2/p;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, -0xf924764

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v3, v1, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v1, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v1

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v1

    :goto_1
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_4
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v4, v4, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v7, v1, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_3

    :cond_7
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v4, v8

    :goto_4
    and-int/lit16 v8, v4, 0x93

    const/16 v9, 0x92

    const/4 v14, 0x0

    if-eq v8, v9, :cond_8

    const/4 v8, 0x1

    goto :goto_5

    :cond_8
    move v8, v14

    :goto_5
    and-int/lit8 v9, v4, 0x1

    invoke-virtual {v12, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_18

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v3, v8

    :cond_9
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_b

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_a

    new-instance v6, Lqe0/b;

    const/16 v7, 0x1b

    invoke-direct {v6, v7}, Lqe0/b;-><init>(I)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_b
    move-object v6, v7

    :goto_6
    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v10, 0x131

    int-to-float v10, v10

    invoke-static {v10, v9}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v11, Lb2/e;->w:Lb2/m;

    invoke-static {v11, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    move-object/from16 p3, v8

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_c

    invoke-virtual {v12, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_7
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v12, v13, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v12, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-nez v15, :cond_d

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_e

    :cond_d
    invoke-static {v7, v12, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v14, La3/k;->d:La3/i;

    invoke-static {v12, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v15, v12, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    move-object/from16 p2, v8

    invoke-virtual {v9}, Ly81/i;->V0()J

    move-result-wide v8

    invoke-virtual {v15, v12, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v19

    move/from16 v20, v7

    move-wide/from16 v21, v8

    invoke-virtual/range {v19 .. v19}, Ly81/i;->o()J

    move-result-wide v7

    move-object v9, v6

    invoke-virtual {v5}, Lot2/p;->l()Lkd1/o;

    move-result-object v6

    if-nez v6, :cond_f

    const v6, 0x17b6ed33

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    move-object/from16 v33, p2

    move-object/from16 p0, p3

    move-object/from16 v25, v2

    move-object/from16 p3, v3

    move v2, v6

    move-object v1, v9

    move-object/from16 v32, v11

    move-object v9, v12

    move-object v3, v13

    move-object/from16 v16, v14

    move-object/from16 p2, v15

    move/from16 v34, v20

    const/16 v5, 0x100

    goto/16 :goto_8

    :cond_f
    const/16 v18, 0x0

    const v1, 0x17b6ed34

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    move v1, v10

    sget v10, Lkd1/o;->a:I

    move-object/from16 v19, v11

    const/4 v11, 0x3

    move-wide/from16 v23, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 p0, v12

    move v12, v1

    move-object v1, v9

    move-object/from16 v9, p0

    move-object/from16 v33, p2

    move-object/from16 v5, p3

    move-object/from16 v25, v2

    move-object/from16 p3, v3

    move-object/from16 p0, v13

    move-object/from16 p2, v14

    move-object/from16 v26, v15

    move-object/from16 v32, v19

    move/from16 v34, v20

    move-wide/from16 v13, v21

    move-wide/from16 v2, v23

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    invoke-static {v15, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v12, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const v8, 0x3f333333    # 0.7f

    invoke-static {v8, v7}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v9, v13, v14}, Lp1/q;->f(J)Z

    move-result v8

    invoke-virtual {v9, v2, v3}, Lp1/q;->f(J)Z

    move-result v10

    or-int/2addr v8, v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_10

    if-ne v10, v0, :cond_11

    :cond_10
    new-instance v19, Lbb2/a;

    const/16 v24, 0x5

    move-wide/from16 v22, v2

    move-wide/from16 v20, v13

    invoke-direct/range {v19 .. v24}, Lbb2/a;-><init>(JJI)V

    move-object/from16 v10, v19

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v7, v10}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v14, 0x6030

    const/16 v15, 0x68

    const/4 v7, 0x0

    move-object/from16 v28, v9

    const/4 v9, 0x0

    sget-object v10, Ly2/j;->a:Ly2/b1;

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v3, p0

    move-object/from16 v16, p2

    move-object/from16 p0, v5

    move/from16 v2, v18

    move-object/from16 p2, v26

    move-object/from16 v13, v28

    const/16 v5, 0x100

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v13

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_8
    new-instance v35, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual/range {p1 .. p1}, Lot2/p;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v36

    new-instance v6, Ly71/g;

    invoke-static/range {p2 .. p2}, Lih0/d0;->C(Lx81/d;)I

    move-result v7

    sget v8, Luv0/c;->E:I

    invoke-static {v9, v8}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-direct {v6, v7, v8}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    const/16 v51, 0x7ff8

    const/16 v52, 0x0

    const/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    move-object/from16 v38, v6

    invoke-direct/range {v35 .. v52}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v6, v4, 0x380

    if-ne v6, v5, :cond_12

    const/4 v14, 0x1

    goto :goto_9

    :cond_12
    move v14, v2

    :goto_9
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v14, :cond_13

    if-ne v5, v0, :cond_14

    :cond_13
    new-instance v5, Lqn0/j;

    const/4 v0, 0x3

    invoke-direct {v5, v1, v0}, Lqn0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v5, Lc93/a;

    sget v0, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    const/4 v15, 0x3

    shl-int/lit8 v13, v0, 0x3

    const/16 v14, 0x35

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v12, v9

    move-object/from16 v7, v35

    move-object v9, v5

    invoke-static/range {v6 .. v14}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v12

    sget-object v0, Lb2/e;->H:Lb2/m;

    sget-object v5, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    move-object/from16 v6, p3

    invoke-virtual {v5, v6, v0}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    const-wide/high16 v7, 0x401e000000000000L    # 7.5

    double-to-float v0, v7

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v19, v0, v5

    int-to-float v0, v15

    mul-float v18, v0, v5

    const/16 v21, 0x0

    const/16 v22, 0x8

    move/from16 v20, v18

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v8, v9, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-eqz v10, :cond_15

    move-object/from16 v10, v25

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_15
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v9, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v32

    invoke-static {v9, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_16

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    :cond_16
    move-object/from16 v2, v33

    goto :goto_c

    :cond_17
    :goto_b
    move-object/from16 v2, v16

    goto :goto_d

    :goto_c
    invoke-static {v7, v9, v7, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_b

    :goto_d
    invoke-static {v9, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lot2/p;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v9, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v3, p2

    move/from16 v7, v34

    invoke-virtual {v3, v9, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v3, v9, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->P()Lb91/a;

    move-result-object v26

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v30, v8, 0x12

    const v31, 0x2fffa

    const/4 v7, 0x0

    move-object/from16 v28, v9

    move-wide v8, v10

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

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

    move-object/from16 p3, v6

    move-object v6, v0

    move/from16 v0, v34

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    const/4 v6, 0x1

    int-to-float v7, v6

    mul-float/2addr v7, v5

    move-object/from16 v8, p0

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v9, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p1 .. p1}, Lot2/p;->t()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v9, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v9, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v10

    invoke-virtual {v3, v9, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    const/4 v7, 0x0

    move-object v0, v8

    move-wide v8, v10

    const-wide/16 v10, 0x0

    move/from16 v53, v6

    move-object v6, v2

    move/from16 v2, v53

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    and-int/lit8 v3, v4, 0x70

    const/4 v4, 0x0

    move-object/from16 v6, p1

    invoke-static {v4, v6, v9, v3, v2}, Lpt2/v;->S(Landroidx/compose/ui/Modifier;Lot2/p;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x2

    int-to-float v3, v3

    invoke-static {v3, v5, v0, v9, v2}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    move-object/from16 v4, p3

    move-object v6, v1

    goto :goto_e

    :cond_18
    move-object v6, v5

    move-object v9, v12

    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v4, v3

    move-object v6, v7

    :goto_e
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_19

    new-instance v0, Lqb0/a;

    const/16 v3, 0xe

    move-object/from16 v5, p1

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lqb0/a;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final g(Lmt2/g;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(JJLf2/d;)Lf2/g;
    .locals 2

    const-string v0, "$this$drawWithCache"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    new-instance v1, Li2/x;

    invoke-direct {v1, p0, p1}, Li2/x;-><init>(J)V

    new-instance p0, Li2/x;

    invoke-direct {p0, p2, p3}, Li2/x;-><init>(J)V

    filled-new-array {v1, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 p1, 0x0

    const/16 p2, 0xe

    invoke-static {v0, p0, p1, p1, p2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    new-instance p1, Lnq2/c;

    const/4 p2, 0x3

    invoke-direct {p1, p0, p2}, Lnq2/c;-><init>(Li2/k0;I)V

    invoke-virtual {p4, p1}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Li2/t;Lk2/c;)Ll83/a0;
    .locals 11

    const-string v0, "$this$onDrawWithContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    const/4 v9, 0x0

    const/16 v10, 0x7e

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 3

    new-instance v0, Lmt2/g$b;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lmt2/g$b;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Lot2/p;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lqt2/o;->f(Landroidx/compose/ui/Modifier;Lot2/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
