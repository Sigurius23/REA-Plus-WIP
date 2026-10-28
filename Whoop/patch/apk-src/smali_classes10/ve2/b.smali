.class public abstract Lve2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aA\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lue2/a;",
        "viewState",
        "Lkotlin/Function1;",
        "Lte2/b;",
        "Ll83/a0;",
        "onViewEvent",
        "Lre2/a$a;",
        "onAnalyticsEvent",
        "g",
        "(Lue2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "sleep-coach_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lue2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lve2/b;->k(Lkotlin/jvm/functions/Function1;Lue2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lve2/b;->i(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lre2/a$a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lve2/b;->h(Lre2/a$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lve2/b;->j(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lue2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lve2/b;->m(Lue2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lue2/a;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lve2/b;->l(Lue2/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lue2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lue2/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v3, 0x19e450d8    # 2.36073E-23f

    invoke-virtual {v0, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v4, 0x6

    const/4 v5, 0x4

    const/4 v6, 0x2

    if-nez v3, :cond_2

    and-int/lit8 v3, v4, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v5

    goto :goto_1

    :cond_1
    move v3, v6

    :goto_1
    or-int/2addr v3, v4

    goto :goto_2

    :cond_2
    move v3, v4

    :goto_2
    and-int/lit8 v7, v4, 0x30

    const/16 v8, 0x20

    if-nez v7, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    move v7, v8

    goto :goto_3

    :cond_3
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v3, v7

    :cond_4
    and-int/lit8 v7, p5, 0x4

    const/16 v9, 0x100

    if-eqz v7, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v10, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v10, v4, 0x180

    if-nez v10, :cond_5

    move-object/from16 v10, p2

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    move v11, v9

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v3, v11

    :goto_5
    and-int/lit16 v11, v3, 0x93

    const/16 v12, 0x92

    if-eq v11, v12, :cond_8

    const/4 v11, 0x1

    goto :goto_6

    :cond_8
    const/4 v11, 0x0

    :goto_6
    and-int/lit8 v12, v3, 0x1

    invoke-virtual {v0, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_22

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v11, :cond_9

    new-instance v7, Lve0/d;

    const/4 v10, 0x2

    invoke-direct {v7, v10}, Lve0/d;-><init>(I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_a
    move-object v7, v10

    :goto_7
    instance-of v10, v1, Lue2/a$b;

    if-eqz v10, :cond_13

    const v5, 0x10607c1a

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    move-object v5, v1

    check-cast v5, Lue2/a$b;

    invoke-virtual {v5}, Lue2/a$b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v5}, Lue2/a$b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v5}, Lue2/a$b;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v5}, Lue2/a$b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    and-int/lit8 v15, v3, 0x70

    if-ne v15, v8, :cond_b

    const/16 v16, 0x1

    goto :goto_8

    :cond_b
    const/16 v16, 0x0

    :goto_8
    and-int/lit16 v3, v3, 0x380

    if-ne v3, v9, :cond_c

    const/16 v17, 0x1

    goto :goto_9

    :cond_c
    const/16 v17, 0x0

    :goto_9
    or-int v16, v16, v17

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v16, :cond_d

    if-ne v13, v11, :cond_e

    :cond_d
    new-instance v13, Ldc0/c;

    const/16 v14, 0x14

    invoke-direct {v13, v2, v14, v7}, Ldc0/c;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v27, v13

    check-cast v27, Lc93/a;

    if-ne v15, v8, :cond_f

    const/4 v8, 0x1

    goto :goto_a

    :cond_f
    const/4 v8, 0x0

    :goto_a
    if-ne v3, v9, :cond_10

    const/4 v13, 0x1

    goto :goto_b

    :cond_10
    const/4 v13, 0x0

    :goto_b
    or-int v3, v8, v13

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_11

    if-ne v8, v11, :cond_12

    :cond_11
    new-instance v8, Ldc0/c;

    const/16 v3, 0x15

    invoke-direct {v8, v2, v3, v7}, Ldc0/c;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object/from16 v29, v8

    check-cast v29, Lc93/a;

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v3, 0x3

    shl-int/lit8 v9, v3, 0x6

    or-int/2addr v8, v9

    shl-int/lit8 v9, v3, 0x9

    or-int/2addr v8, v9

    shl-int/lit8 v3, v3, 0x1b

    or-int v34, v8, v3

    const/16 v36, 0x0

    const v37, 0xebfedf1

    move-object v14, v5

    const/4 v5, 0x0

    const/4 v9, 0x0

    move-object v3, v7

    move-object v7, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v8, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v30, v28

    const/16 v28, 0x0

    move/from16 v31, v30

    const/16 v30, 0x0

    move/from16 v32, v31

    const/16 v31, 0x0

    move/from16 v33, v32

    const/16 v32, 0x0

    const/16 v35, 0x180

    move/from16 v38, v33

    move-object/from16 v33, v0

    move/from16 v0, v38

    move-object/from16 v38, v3

    invoke-static/range {v5 .. v37}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v7, v33

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_13

    :cond_13
    move-object/from16 v38, v7

    move-object v7, v0

    const/4 v0, 0x0

    instance-of v9, v1, Lue2/a$c;

    const/4 v10, 0x0

    if-eqz v9, :cond_1e

    const v9, 0x106d4f13

    invoke-virtual {v7, v9}, Lp1/q;->e0(I)V

    new-instance v12, Lsz0/p0$b;

    move-object v9, v1

    check-cast v9, Lue2/a$c;

    invoke-virtual {v9}, Lue2/a$c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v16, 0x6

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v12 .. v17}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v9}, Lue2/a$c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v9}, Lue2/a$c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    move-object v15, v12

    new-instance v12, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lqe2/g;->q1:I

    invoke-direct {v12, v0, v10, v6, v10}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v9}, Lue2/a$c;->e()Z

    move-result v10

    and-int/lit8 v0, v3, 0x70

    if-ne v0, v8, :cond_14

    const/4 v6, 0x1

    goto :goto_c

    :cond_14
    const/4 v6, 0x0

    :goto_c
    and-int/lit8 v9, v3, 0xe

    if-eq v9, v5, :cond_16

    and-int/lit8 v16, v3, 0x8

    if-eqz v16, :cond_15

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_15

    goto :goto_d

    :cond_15
    const/16 v16, 0x0

    goto :goto_e

    :cond_16
    :goto_d
    const/16 v16, 0x1

    :goto_e
    or-int v6, v6, v16

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_17

    if-ne v8, v11, :cond_18

    :cond_17
    new-instance v8, Lve2/a;

    invoke-direct {v8, v2, v1}, Lve2/a;-><init>(Lkotlin/jvm/functions/Function1;Lue2/a;)V

    invoke-virtual {v7, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v8, Lc93/a;

    if-eq v9, v5, :cond_1a

    and-int/lit8 v3, v3, 0x8

    if-eqz v3, :cond_19

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_19

    goto :goto_10

    :cond_19
    const/4 v3, 0x0

    :goto_f
    const/16 v5, 0x20

    goto :goto_11

    :cond_1a
    :goto_10
    const/4 v3, 0x1

    goto :goto_f

    :goto_11
    if-ne v0, v5, :cond_1b

    const/4 v0, 0x1

    goto :goto_12

    :cond_1b
    const/4 v0, 0x0

    :goto_12
    or-int/2addr v0, v3

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_1c

    if-ne v3, v11, :cond_1d

    :cond_1c
    new-instance v3, Lve2/a;

    invoke-direct {v3, v1, v2}, Lve2/a;-><init>(Lue2/a;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v3, Lc93/a;

    sget v0, Lsz0/p0$b;->h:I

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v5, 0x3

    or-int/2addr v0, v6

    shl-int/lit8 v5, v5, 0x9

    or-int/2addr v0, v5

    sget v5, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v5, v5, 0x15

    or-int v18, v0, v5

    const/16 v19, 0x0

    const/16 v20, 0xe44

    move-object/from16 v17, v7

    const/4 v7, 0x0

    const/4 v11, 0x0

    move-object v9, v8

    move-object v8, v14

    const/4 v14, 0x0

    move-object v5, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v6, v13

    move-object v13, v3

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v17

    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_13

    :cond_1e
    sget-object v0, Lue2/a$d;->a:Lue2/a$d;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    const v0, 0x10778637

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    new-instance v5, Lsz0/p0$e;

    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lqe2/g;->M:I

    invoke-direct {v0, v3, v10, v6, v10}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->n()Lgz0/g0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/g0;->d()I

    move-result v3

    invoke-direct {v5, v0, v3}, Lsz0/p0$e;-><init>(Lcom/whoop/design/util/TextResource;I)V

    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lqe2/g;->K:I

    invoke-direct {v0, v3, v10, v6, v10}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v3, Lsz0/p0$e;->g:I

    sget v6, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v6, v6, 0x3

    or-int v18, v3, v6

    const/16 v19, 0x0

    const/16 v20, 0xffc

    move-object/from16 v17, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v6, v0

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v17

    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_1f
    sget-object v0, Lue2/a$e;->a:Lue2/a$e;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    const v0, 0x107dbc6b

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    new-instance v11, Lsz0/p0$h;

    new-instance v12, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lqe2/g;->L:I

    invoke-direct {v12, v0, v10, v6, v10}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v16, 0x6

    const/16 v17, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v17}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v0, Lsz0/p0$h;->h:I

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v3, v3, 0x3

    or-int v18, v0, v3

    const/16 v19, 0x0

    const/16 v20, 0xffc

    move-object/from16 v17, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v17

    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_20
    const/4 v0, 0x0

    sget-object v3, Lue2/a$a;->a:Lue2/a$a;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_21

    const v3, 0x3214b6af

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    sget-object v0, Lte2/b$a$a;->a:Lte2/b$a$a;

    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_13
    move-object/from16 v3, v38

    goto :goto_14

    :cond_21
    const v1, 0x32139d0b

    invoke-static {v1, v7, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_22
    move-object v7, v0

    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v3, v10

    :goto_14
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_23

    new-instance v0, Lv31/d;

    const/16 v6, 0x8

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lv31/d;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_23
    return-void
.end method

.method private static final h(Lre2/a$a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lte2/b$a$a;->a:Lte2/b$a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lre2/a$a;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lre2/a$a;-><init>(Z)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lte2/b$b$c;->a:Lte2/b$b$c;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lre2/a$a;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lre2/a$a;-><init>(Z)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Lue2/a;)Ll83/a0;
    .locals 0

    check-cast p1, Lue2/a$c;

    invoke-virtual {p1}, Lue2/a$c;->c()Lte2/b;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lue2/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    check-cast p0, Lue2/a$c;

    invoke-virtual {p0}, Lue2/a$c;->e()Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lte2/b$a$a;->a:Lte2/b$a$a;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lue2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lve2/b;->g(Lue2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
