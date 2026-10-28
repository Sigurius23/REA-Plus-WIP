.class public abstract Ldo0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aS\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00062\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lzn0/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lzn0/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Lkotlin/Function0;",
        "onBackPressed",
        "Ltn0/a;",
        "onAnalyticsEvent",
        "k",
        "(Lzn0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "change-password_release"
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

    invoke-static {}, Ldo0/d;->t()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldo0/d;->s(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lzn0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldo0/d;->l(Lzn0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ltn0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldo0/d;->o(Ltn0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lzn0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ldo0/d;->n(Lzn0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldo0/d;->r(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g()Ll83/a0;
    .locals 1

    invoke-static {}, Ldo0/d;->p()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldo0/d;->u(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i()Ll83/a0;
    .locals 1

    invoke-static {}, Ldo0/d;->m()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic j()Ll83/a0;
    .locals 1

    invoke-static {}, Ldo0/d;->q()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final k(Lzn0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzn0/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v6, p5

    const-string v1, "viewState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p4

    check-cast v3, Lp1/q;

    const v1, 0x4ae42ff9    # 7477244.5f

    invoke-virtual {v3, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v6, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, v6

    goto :goto_1

    :cond_1
    move v1, v6

    :goto_1
    and-int/lit8 v4, p6, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v1, v1, 0x30

    :cond_2
    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_2

    move-object/from16 v7, p1

    invoke-virtual {v3, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v1, v8

    :goto_3
    and-int/lit8 v8, p6, 0x4

    const/16 v9, 0x100

    if-eqz v8, :cond_6

    or-int/lit16 v1, v1, 0x180

    :cond_5
    move-object/from16 v10, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v10, v6, 0x180

    if-nez v10, :cond_5

    move-object/from16 v10, p2

    invoke-virtual {v3, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    move v11, v9

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v1, v11

    :goto_5
    and-int/lit8 v11, p6, 0x8

    const/16 v12, 0x800

    if-eqz v11, :cond_9

    or-int/lit16 v1, v1, 0xc00

    :cond_8
    move-object/from16 v13, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v13, v6, 0xc00

    if-nez v13, :cond_8

    move-object/from16 v13, p3

    invoke-virtual {v3, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    move v14, v12

    goto :goto_6

    :cond_a
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v1, v14

    :goto_7
    and-int/lit16 v14, v1, 0x493

    const/16 v15, 0x492

    const/4 v5, 0x0

    if-eq v14, v15, :cond_b

    const/4 v14, 0x1

    goto :goto_8

    :cond_b
    move v14, v5

    :goto_8
    and-int/lit8 v15, v1, 0x1

    invoke-virtual {v3, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_29

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_d

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v14, :cond_c

    new-instance v4, Ldo0/c;

    const/4 v7, 0x0

    invoke-direct {v4, v7}, Ldo0/c;-><init>(I)V

    invoke-virtual {v3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_d
    move-object v4, v7

    :goto_9
    if-eqz v8, :cond_f

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v14, :cond_e

    new-instance v7, Ldf2/a;

    const/16 v8, 0x19

    invoke-direct {v7, v8}, Ldf2/a;-><init>(I)V

    invoke-virtual {v3, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v7, Lc93/a;

    move-object v10, v7

    :cond_f
    if-eqz v11, :cond_11

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v14, :cond_10

    new-instance v7, Ldo0/c;

    const/4 v8, 0x1

    invoke-direct {v7, v8}, Ldo0/c;-><init>(I)V

    invoke-virtual {v3, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_a

    :cond_11
    move-object v7, v13

    :goto_a
    and-int/lit16 v8, v1, 0x1c00

    if-ne v8, v12, :cond_12

    const/4 v8, 0x1

    goto :goto_b

    :cond_12
    move v8, v5

    :goto_b
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    const/4 v12, 0x0

    if-nez v8, :cond_13

    if-ne v11, v14, :cond_14

    :cond_13
    new-instance v11, Ldo0/d$a;

    invoke-direct {v11, v7, v12}, Ldo0/d$a;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v3, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v11, Lc93/m;

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    invoke-static {v3, v11, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lzn0/c;->l()Z

    move-result v8

    if-eqz v8, :cond_19

    const v1, 0x30709e18

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {}, Lgb1/b0;->U()Li2/t;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v11, 0x6

    invoke-static {v1, v8, v12, v9, v11}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, Lb2/e;->E:Lb2/m;

    invoke-static {v8, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v5, v3, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v3, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v11, v3, Lp1/q;->S:Z

    if-eqz v11, :cond_15

    invoke-virtual {v3, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_15
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_c
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v3, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v3, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v3, Lp1/q;->S:Z

    if-nez v8, :cond_16

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_17

    :cond_16
    invoke-static {v5, v3, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v3, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v13, v7

    sget-object v7, Lsz0/p0$c;->e:Lsz0/p0$c;

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v1, Lsn0/b;->u:I

    invoke-direct {v8, v1, v12, v2, v12}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v14, :cond_18

    new-instance v1, Ldf2/a;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Ldf2/a;-><init>(I)V

    invoke-virtual {v3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object v9, v1

    check-cast v9, Lc93/a;

    sget v1, Lsz0/p0$c;->f:I

    or-int/lit16 v1, v1, 0x180

    sget v2, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v2, v2, 0x3

    or-int v20, v1, v2

    const/16 v21, 0x0

    const/16 v22, 0xff8

    move-object v2, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v1, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v6, v1

    move-object/from16 v19, v3

    move-object v3, v2

    invoke-static/range {v7 .. v22}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v19

    const/4 v7, 0x1

    invoke-virtual {v5, v7}, Lp1/q;->q(Z)V

    const/4 v1, 0x0

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    :goto_d
    move-object v1, v4

    goto/16 :goto_12

    :cond_19
    move-object v5, v3

    move-object v6, v7

    move-object v3, v10

    const/4 v7, 0x1

    invoke-virtual {v0}, Lzn0/c;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    if-eqz v8, :cond_1e

    const v8, 0x30792a42

    invoke-virtual {v5, v8}, Lp1/q;->e0(I)V

    new-instance v15, Lsz0/p0$b;

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lsn0/b;->o:I

    invoke-direct {v8, v9, v12, v2, v12}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v19, 0x6

    const/16 v20, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v8

    invoke-direct/range {v15 .. v20}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lzn0/c;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lsn0/b;->A:I

    invoke-direct {v10, v9, v12, v2, v12}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v14, :cond_1a

    new-instance v2, Ldf2/a;

    const/16 v9, 0x1b

    invoke-direct {v2, v9}, Ldf2/a;-><init>(I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object v9, v2

    check-cast v9, Lc93/a;

    and-int/lit8 v1, v1, 0x70

    const/16 v2, 0x20

    if-ne v1, v2, :cond_1b

    goto :goto_e

    :cond_1b
    const/4 v7, 0x0

    :goto_e
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v7, :cond_1c

    if-ne v1, v14, :cond_1d

    :cond_1c
    new-instance v1, Lcom/whoop/profile/view/i;

    const/16 v2, 0xc

    invoke-direct {v1, v4, v2}, Lcom/whoop/profile/view/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    move-object v11, v1

    check-cast v11, Lc93/a;

    sget v1, Lsz0/p0$b;->h:I

    or-int/lit16 v1, v1, 0x180

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v2, 0x3

    or-int/2addr v1, v2

    sget v2, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v2, v2, 0x9

    or-int v20, v1, v2

    const/16 v21, 0x0

    const/16 v22, 0xfe0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v7, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v5

    invoke-static/range {v7 .. v22}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    const/4 v1, 0x0

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    :goto_f
    move-object v2, v3

    goto/16 :goto_d

    :cond_1e
    invoke-virtual {v0}, Lzn0/c;->o()Z

    move-result v8

    if-eqz v8, :cond_22

    const v8, 0x3080a53c

    invoke-virtual {v5, v8}, Lp1/q;->e0(I)V

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v10, Lsn0/b;->q:I

    invoke-direct {v8, v10, v12, v2, v12}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v1, v1, 0x380

    if-ne v1, v9, :cond_1f

    goto :goto_10

    :cond_1f
    const/4 v7, 0x0

    :goto_10
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v7, :cond_20

    if-ne v1, v14, :cond_21

    :cond_20
    new-instance v1, Ld42/o;

    const/16 v2, 0x9

    invoke-direct {v1, v3, v2}, Ld42/o;-><init>(Lc93/a;I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    move-object/from16 v19, v1

    check-cast v19, Lc93/a;

    new-instance v15, Lsz0/p0$h;

    const-wide/16 v17, 0x0

    const/16 v20, 0x2

    const/16 v21, 0x0

    move-object/from16 v16, v8

    invoke-direct/range {v15 .. v21}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget v1, Lsz0/p0$h;->h:I

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v2, 0x3

    or-int v20, v1, v2

    const/16 v21, 0x0

    const/16 v22, 0xffc

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v7, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v5

    invoke-static/range {v7 .. v22}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    const/4 v1, 0x0

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_22
    invoke-virtual {v0}, Lzn0/c;->n()Z

    move-result v8

    if-eqz v8, :cond_23

    const v1, 0x3086a01a

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    new-instance v7, Lsz0/p0$e;

    new-instance v1, Lcom/whoop/design/util/TextResource$b;

    sget v8, Lsn0/b;->E:I

    invoke-direct {v1, v8, v12, v2, v12}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, Lgy0/a;->O4:I

    invoke-direct {v7, v1, v2}, Lsz0/p0$e;-><init>(Lcom/whoop/design/util/TextResource;I)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget v1, Lsz0/p0$e;->g:I

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v2, 0x3

    or-int v20, v1, v2

    const/16 v21, 0x0

    const/16 v22, 0xffc

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v5

    invoke-static/range {v7 .. v22}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    const/4 v1, 0x0

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    goto/16 :goto_f

    :cond_23
    invoke-virtual {v0}, Lzn0/c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    if-eqz v8, :cond_28

    const v8, 0x308d1bef

    invoke-virtual {v5, v8}, Lp1/q;->e0(I)V

    new-instance v15, Lsz0/p0$b;

    new-instance v8, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lsn0/b;->o:I

    invoke-direct {v8, v9, v12, v2, v12}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v19, 0x6

    const/16 v20, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v8

    invoke-direct/range {v15 .. v20}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lzn0/c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lsn0/b;->p:I

    invoke-direct {v10, v9, v12, v2, v12}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v14, :cond_24

    new-instance v2, Ldf2/a;

    const/16 v9, 0x1c

    invoke-direct {v2, v9}, Ldf2/a;-><init>(I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    move-object v9, v2

    check-cast v9, Lc93/a;

    and-int/lit8 v1, v1, 0x70

    const/16 v2, 0x20

    if-ne v1, v2, :cond_25

    goto :goto_11

    :cond_25
    const/4 v7, 0x0

    :goto_11
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v7, :cond_26

    if-ne v1, v14, :cond_27

    :cond_26
    new-instance v1, Lcom/whoop/profile/view/i;

    const/16 v2, 0xd

    invoke-direct {v1, v4, v2}, Lcom/whoop/profile/view/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    move-object v11, v1

    check-cast v11, Lc93/a;

    sget v1, Lsz0/p0$b;->h:I

    or-int/lit16 v1, v1, 0x180

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v2, 0x3

    or-int/2addr v1, v2

    sget v2, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v2, v2, 0x9

    or-int v20, v1, v2

    const/16 v21, 0x0

    const/16 v22, 0xfe0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v7, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v5

    invoke-static/range {v7 .. v22}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_f

    :cond_28
    const/4 v2, 0x0

    const v7, 0x3094fa35

    invoke-virtual {v5, v7}, Lp1/q;->e0(I)V

    and-int/lit16 v1, v1, 0x3fe

    move-object/from16 v19, v5

    const/4 v5, 0x0

    move-object v7, v4

    move v4, v1

    move-object v1, v7

    move v7, v2

    move-object v2, v3

    move-object/from16 v3, v19

    invoke-static/range {v0 .. v5}, Ldo0/b;->l(Lzn0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v3

    invoke-virtual {v5, v7}, Lp1/q;->q(Z)V

    :goto_12
    move-object v3, v2

    move-object v4, v6

    move-object v2, v1

    goto :goto_13

    :cond_29
    move-object v5, v3

    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v2, v7

    move-object v3, v10

    move-object v4, v13

    :goto_13
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_2a

    new-instance v0, La81/f;

    const/16 v7, 0x11

    move-object/from16 v1, p0

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, La81/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_2a
    return-void
.end method

.method private static final l(Lzn0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n(Lzn0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Ldo0/d;->k(Lzn0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Ltn0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final q()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lzn0/a$e;->a:Lzn0/a$e;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final u(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lzn0/a$d;->a:Lzn0/a$d;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
