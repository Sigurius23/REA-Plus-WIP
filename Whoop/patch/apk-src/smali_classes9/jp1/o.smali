.class public abstract Ljp1/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aS\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0008H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lhp1/h;",
        "viewState",
        "Lkotlin/Function1;",
        "Lyn1/a;",
        "Ll83/a0;",
        "onAnalyticEvent",
        "Lhp1/f;",
        "onViewEvent",
        "Lkotlin/Function0;",
        "onExit",
        "i",
        "(Lhp1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Ljp1/o;->m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lhp1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ljp1/o;->q(Lhp1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lyn1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/o;->j(Lyn1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lhp1/f;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/o;->k(Lhp1/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Ljp1/o;->n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Ljp1/o;->l()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Lhp1/h;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljp1/o;->o(Lkotlin/jvm/functions/Function1;Lhp1/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/o;->p(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lhp1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhp1/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, 0x7020733a

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v3, p6, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v5, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v9, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit8 v6, p6, 0x4

    const/16 v7, 0x100

    if-eqz v6, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    move v10, v7

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v0, v10

    :goto_5
    and-int/lit8 v10, p6, 0x8

    const/16 v11, 0x800

    if-eqz v10, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v12, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v12, v5, 0xc00

    if-nez v12, :cond_8

    move-object/from16 v12, p3

    invoke-virtual {v9, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    move v13, v11

    goto :goto_6

    :cond_a
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v0, v13

    :goto_7
    and-int/lit16 v13, v0, 0x493

    const/16 v14, 0x492

    const/16 v22, 0x1

    const/4 v15, 0x0

    if-eq v13, v14, :cond_b

    move/from16 v13, v22

    goto :goto_8

    :cond_b
    move v13, v15

    :goto_8
    and-int/lit8 v14, v0, 0x1

    invoke-virtual {v9, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_2f

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_d

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v13, :cond_c

    new-instance v3, Ljg/c;

    const/16 v4, 0x18

    invoke-direct {v3, v4}, Ljg/c;-><init>(I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_d
    move-object v3, v4

    :goto_9
    if-eqz v6, :cond_f

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v13, :cond_e

    new-instance v4, Ljg/c;

    const/16 v6, 0x19

    invoke-direct {v4, v6}, Ljg/c;-><init>(I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_a

    :cond_f
    move-object v4, v8

    :goto_a
    if-eqz v10, :cond_11

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v13, :cond_10

    new-instance v6, Ljl0/a;

    const/16 v8, 0x1d

    invoke-direct {v6, v8}, Ljl0/a;-><init>(I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v6, Lc93/a;

    move-object v14, v6

    goto :goto_b

    :cond_11
    move-object v14, v12

    :goto_b
    instance-of v6, v1, Lhp1/h$a;

    if-eqz v6, :cond_12

    const v2, 0x504581c7

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    move-object v2, v1

    check-cast v2, Lhp1/h$a;

    invoke-virtual {v2}, Lhp1/h$a;->a()Lhp1/a;

    move-result-object v2

    sget v6, Lkd1/o;->a:I

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v6, v7

    or-int/2addr v6, v7

    or-int/2addr v6, v7

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v6

    invoke-static {v2, v4, v9, v0, v15}, Ljp1/a;->d(Lhp1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    :goto_c
    move-object/from16 p1, v3

    move-object v2, v14

    goto/16 :goto_13

    :cond_12
    instance-of v6, v1, Lhp1/h$b;

    if-eqz v6, :cond_16

    const v2, 0x5047e6a2

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    move-object v2, v1

    check-cast v2, Lhp1/h$b;

    invoke-virtual {v2}, Lhp1/h$b;->a()Lhp1/b;

    move-result-object v6

    sget-object v2, Lcp1/d;->POSTPARTUM:Lcp1/d;

    and-int/lit16 v0, v0, 0x380

    if-ne v0, v7, :cond_13

    goto :goto_d

    :cond_13
    move/from16 v22, v15

    :goto_d
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v22, :cond_14

    if-ne v0, v13, :cond_15

    :cond_14
    new-instance v0, Ljp1/n;

    const/4 v7, 0x0

    invoke-direct {v0, v4, v7}, Ljp1/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/16 v10, 0x30

    const/4 v11, 0x0

    move-object v7, v2

    invoke-static/range {v6 .. v11}, Ljp1/f;->j(Lhp1/b;Lcp1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_16
    instance-of v6, v1, Lhp1/h$g;

    if-eqz v6, :cond_17

    const v2, 0x504d9726

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    move-object v2, v1

    check-cast v2, Lhp1/h$g;

    invoke-virtual {v2}, Lhp1/h$g;->a()Lhp1/e;

    move-result-object v2

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v6

    invoke-static {v2, v4, v9, v0, v15}, Ljp1/h;->h(Lhp1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_17
    instance-of v6, v1, Lhp1/h$k;

    if-eqz v6, :cond_18

    const v2, 0x504fdcc3

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    move-object v2, v1

    check-cast v2, Lhp1/h$k;

    invoke-virtual {v2}, Lhp1/h$k;->a()Lhp1/j;

    move-result-object v6

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v7, v0, 0x70

    or-int/2addr v2, v7

    and-int/lit16 v0, v0, 0x380

    or-int v10, v2, v0

    const/4 v11, 0x0

    move-object v7, v3

    move-object v8, v4

    invoke-static/range {v6 .. v11}, Ljp1/m;->j(Lhp1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto/16 :goto_c

    :cond_18
    instance-of v6, v1, Lhp1/h$m;

    if-eqz v6, :cond_19

    const v2, 0x50539d09

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    move-object v2, v1

    check-cast v2, Lhp1/h$m;

    invoke-virtual {v2}, Lhp1/h$m;->a()Lhp1/m;

    move-result-object v2

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    invoke-static {v2, v4, v9, v0, v15}, Ljp1/u;->n(Lhp1/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto/16 :goto_c

    :cond_19
    instance-of v6, v1, Lhp1/h$e;

    if-eqz v6, :cond_1d

    const v2, 0x50560260

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    move-object v2, v1

    check-cast v2, Lhp1/h$e;

    invoke-virtual {v2}, Lhp1/h$e;->a()Lhp1/d;

    move-result-object v2

    sget-object v8, Lcp1/d;->POSTPARTUM:Lcp1/d;

    and-int/lit16 v0, v0, 0x380

    if-ne v0, v7, :cond_1a

    goto :goto_e

    :cond_1a
    move/from16 v22, v15

    :goto_e
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v22, :cond_1b

    if-ne v0, v13, :cond_1c

    :cond_1b
    new-instance v0, Ljp1/n;

    const/4 v6, 0x1

    invoke-direct {v0, v4, v6}, Ljp1/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/16 v11, 0x180

    const/4 v12, 0x1

    const/4 v6, 0x0

    move-object v7, v2

    move-object v10, v9

    move-object v9, v0

    invoke-static/range {v6 .. v12}, Ljp1/g;->n(Landroidx/compose/ui/Modifier;Lhp1/d;Lcp1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v10

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto/16 :goto_c

    :cond_1d
    instance-of v6, v1, Lhp1/h$h;

    if-eqz v6, :cond_1e

    const v2, 0x505bbe65    # 1.4746752E10f

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    move-object v2, v1

    check-cast v2, Lhp1/h$h;

    invoke-virtual {v2}, Lhp1/h$h;->a()Lhp1/i;

    move-result-object v2

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v6

    invoke-static {v2, v4, v9, v0, v15}, Ljp1/r;->h(Lhp1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto/16 :goto_c

    :cond_1e
    instance-of v6, v1, Lhp1/h$d;

    if-eqz v6, :cond_1f

    const v0, 0x505dd8e6

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto/16 :goto_c

    :cond_1f
    instance-of v6, v1, Lhp1/h$c;

    if-eqz v6, :cond_20

    const v0, 0x505e7f86

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto/16 :goto_c

    :cond_20
    instance-of v6, v1, Lhp1/h$f;

    if-eqz v6, :cond_21

    const v0, 0x505f2246

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto/16 :goto_c

    :cond_21
    sget-object v6, Lhp1/h$l;->a:Lhp1/h$l;

    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_22

    const v0, 0x505fd331

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    sget-object v6, Lsz0/p0$f;->e:Lsz0/p0$f;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v0, Lsz0/p0$f;->f:I

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v2, 0x3

    or-int v19, v0, v2

    const/16 v20, 0x0

    const/16 v21, 0xffc

    const/4 v8, 0x0

    move-object/from16 v18, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v0, v14

    const/4 v14, 0x0

    move v2, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v27, v2

    move-object v2, v0

    move/from16 v0, v27

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v18

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    move-object/from16 p1, v3

    goto/16 :goto_13

    :cond_22
    move-object v12, v14

    move v6, v15

    sget-object v8, Lhp1/h$j;->a:Lhp1/h$j;

    invoke-virtual {v1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_26

    const v2, 0x5062d369

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    new-instance v14, Lsz0/p0$h;

    const/16 v19, 0x7

    const/16 v20, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v14 .. v20}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v2, Lsz0/p0$h;->h:I

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v8, 0x3

    or-int v19, v2, v8

    const/16 v20, 0x0

    const/16 v21, 0xffc

    const/4 v8, 0x0

    move-object/from16 v18, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v2, v11

    const/4 v11, 0x0

    move-object v15, v12

    const/4 v12, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v17, v6

    move-object v6, v14

    const/4 v14, 0x0

    move-object/from16 v23, v15

    const/4 v15, 0x0

    move-object/from16 v24, v16

    const/16 v16, 0x0

    move/from16 v25, v17

    const/16 v17, 0x0

    move-object/from16 p1, v3

    move-object/from16 v26, v24

    move v3, v2

    move-object/from16 v2, v23

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v18

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    and-int/lit16 v0, v0, 0x1c00

    if-ne v0, v3, :cond_23

    goto :goto_f

    :cond_23
    const/16 v22, 0x0

    :goto_f
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v22, :cond_24

    move-object/from16 v8, v26

    if-ne v0, v8, :cond_25

    :cond_24
    new-instance v0, Ljp1/o$a;

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3}, Ljp1/o$a;-><init>(Lc93/a;Lq83/d;)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v0, Lc93/m;

    invoke-static {v9, v0, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v6, 0x0

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    goto/16 :goto_13

    :cond_26
    move-object/from16 p1, v3

    move v3, v11

    move-object v10, v12

    move-object v8, v13

    instance-of v11, v1, Lhp1/h$i;

    if-eqz v11, :cond_2e

    const v11, 0x5067c382

    invoke-virtual {v9, v11}, Lp1/q;->e0(I)V

    new-instance v12, Lsz0/p0$b;

    sget v11, Lxn1/c;->k:I

    invoke-static {v9, v11}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v16, 0x6

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v12 .. v17}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v11, Lxn1/c;->e:I

    invoke-static {v9, v11}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    sget v13, Lxn1/c;->f:I

    invoke-static {v9, v13}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    sget v14, Lxn1/c;->g:I

    invoke-static {v9, v14}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    and-int/lit16 v15, v0, 0x380

    if-ne v15, v7, :cond_27

    move/from16 v15, v22

    goto :goto_10

    :cond_27
    move v15, v6

    :goto_10
    and-int/lit8 v7, v0, 0xe

    if-ne v7, v2, :cond_28

    move/from16 v2, v22

    goto :goto_11

    :cond_28
    move v2, v6

    :goto_11
    or-int/2addr v2, v15

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_29

    if-ne v7, v8, :cond_2a

    :cond_29
    new-instance v7, Lj11/q;

    const/4 v2, 0x7

    invoke-direct {v7, v2, v4, v1}, Lj11/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    check-cast v7, Lc93/a;

    and-int/lit16 v0, v0, 0x1c00

    if-ne v0, v3, :cond_2b

    goto :goto_12

    :cond_2b
    move/from16 v22, v6

    :goto_12
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v22, :cond_2c

    if-ne v0, v8, :cond_2d

    :cond_2c
    new-instance v0, Liy0/a;

    const/4 v2, 0x5

    invoke-direct {v0, v10, v2}, Liy0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2d
    check-cast v0, Lc93/a;

    sget v2, Lsz0/p0$b;->h:I

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v3, 0x3

    or-int/2addr v2, v8

    shl-int/lit8 v8, v3, 0x9

    or-int/2addr v2, v8

    shl-int/lit8 v3, v3, 0x15

    or-int v19, v2, v3

    const/16 v20, 0x0

    const/16 v21, 0xe64

    const/4 v8, 0x0

    move-object v2, v10

    move-object v10, v7

    move-object v7, v11

    const/4 v11, 0x0

    move/from16 v25, v6

    move-object v6, v12

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v9

    move-object v9, v13

    move-object v13, v14

    move-object v14, v0

    move/from16 v0, v25

    invoke-static/range {v6 .. v21}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v18

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    :goto_13
    move-object v3, v4

    move-object v4, v2

    move-object/from16 v2, p1

    goto :goto_14

    :cond_2e
    move v0, v6

    const v1, -0x162f4cdc

    invoke-static {v1, v9, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_2f
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v2, v4

    move-object v3, v8

    move-object v4, v12

    :goto_14
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_30

    new-instance v0, Lg1/m3;

    const/16 v7, 0x16

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lg1/m3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_30
    return-void
.end method

.method private static final j(Lyn1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lhp1/f;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lhp1/f;

    if-eqz v0, :cond_0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lhp1/f;

    if-eqz v0, :cond_0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lkotlin/jvm/functions/Function1;Lhp1/h;)Ll83/a0;
    .locals 1

    new-instance v0, Lhp1/f$e;

    check-cast p1, Lhp1/h$i;

    invoke-virtual {p1}, Lhp1/h$i;->a()Z

    move-result p1

    invoke-direct {v0, p1}, Lhp1/f$e;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lhp1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Ljp1/o;->i(Lhp1/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
