.class public abstract Lkm2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lim2/c$a;",
        "viewState",
        "Lkotlin/Function1;",
        "Lim2/a;",
        "Ll83/a0;",
        "onEvent",
        "e",
        "(Lim2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "trends-mini-arch_release"
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
.method public static synthetic a(Lim2/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lkm2/b;->i(Lim2/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lim2/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lkm2/b;->g(Lim2/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lim2/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lkm2/b;->h(Lim2/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lim2/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lkm2/b;->f(Lim2/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lim2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim2/c$a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v3, -0x615b70cb

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, v2, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v2

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    and-int/lit8 v5, v2, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_4

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, v3, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v5, v8, :cond_5

    move v5, v9

    goto :goto_4

    :cond_5
    move v5, v10

    :goto_4
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v7, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-virtual {v0}, Lim2/c$a;->e()Le31/c;

    move-result-object v5

    invoke-virtual {v5}, Le31/c;->j()Lsz0/p0;

    move-result-object v8

    instance-of v8, v8, Lsz0/p0$h;

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_b

    const v8, -0x4fe67bc0

    invoke-virtual {v7, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Le31/c;->j()Lsz0/p0;

    move-result-object v8

    invoke-virtual {v8}, Lsz0/p0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    and-int/lit8 v8, v3, 0xe

    if-eq v8, v4, :cond_7

    and-int/lit8 v4, v3, 0x8

    if-eqz v4, :cond_6

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_5

    :cond_6
    move v4, v10

    goto :goto_6

    :cond_7
    :goto_5
    move v4, v9

    :goto_6
    and-int/lit8 v3, v3, 0x70

    if-ne v3, v6, :cond_8

    goto :goto_7

    :cond_8
    move v9, v10

    :goto_7
    or-int v3, v4, v9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_9

    if-ne v4, v11, :cond_a

    :cond_9
    new-instance v4, Lkm2/a;

    const/4 v3, 0x0

    invoke-direct {v4, v0, v1, v3}, Lkm2/a;-><init>(Lim2/c$a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v16, v4

    check-cast v16, Lc93/a;

    new-instance v12, Lsz0/p0$h;

    const-wide/16 v14, 0x0

    const/16 v17, 0x2

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v18}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Le31/c;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v20

    new-instance v17, Le31/c;

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x39

    const/16 v25, 0x0

    move-object/from16 v19, v12

    invoke-direct/range {v17 .. v25}, Le31/c;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v8, Le31/c;->g:I

    const/4 v9, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v4, v17

    invoke-static/range {v4 .. v9}, Le31/b;->f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto/16 :goto_e

    :cond_b
    const v5, -0x4fe06f15

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lim2/c$a;->e()Le31/c;

    move-result-object v5

    and-int/lit8 v8, v3, 0xe

    if-eq v8, v4, :cond_d

    and-int/lit8 v12, v3, 0x8

    if-eqz v12, :cond_c

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_c

    goto :goto_8

    :cond_c
    move v12, v10

    goto :goto_9

    :cond_d
    :goto_8
    move v12, v9

    :goto_9
    and-int/lit8 v13, v3, 0x70

    if-ne v13, v6, :cond_e

    move v14, v9

    goto :goto_a

    :cond_e
    move v14, v10

    :goto_a
    or-int/2addr v12, v14

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v12, :cond_f

    if-ne v14, v11, :cond_10

    :cond_f
    new-instance v14, Lkm2/a;

    const/4 v12, 0x1

    invoke-direct {v14, v0, v1, v12}, Lkm2/a;-><init>(Lim2/c$a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v14, Lc93/a;

    if-eq v8, v4, :cond_12

    and-int/lit8 v3, v3, 0x8

    if-eqz v3, :cond_11

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    goto :goto_b

    :cond_11
    move v3, v10

    goto :goto_c

    :cond_12
    :goto_b
    move v3, v9

    :goto_c
    if-ne v13, v6, :cond_13

    goto :goto_d

    :cond_13
    move v9, v10

    :goto_d
    or-int/2addr v3, v9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_14

    if-ne v4, v11, :cond_15

    :cond_14
    new-instance v4, Lkm2/a;

    const/4 v3, 0x2

    invoke-direct {v4, v0, v1, v3}, Lkm2/a;-><init>(Lim2/c$a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v6, v4

    check-cast v6, Lc93/a;

    sget v8, Le31/c;->g:I

    const/4 v9, 0x0

    move-object v4, v5

    move-object v5, v14

    invoke-static/range {v4 .. v9}, Le31/b;->f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_16
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_17

    new-instance v4, Lkl2/f;

    const/4 v5, 0x3

    invoke-direct {v4, v0, v1, v2, v5}, Lkl2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final f(Lim2/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lim2/c$a;->c()Lim2/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lim2/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lim2/c$a;->c()Lim2/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lim2/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lim2/c$a;->d()Lim2/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lim2/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lkm2/b;->e(Lim2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
