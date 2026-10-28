.class public abstract Lqh1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lnh1/d;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Lnh1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "gifting_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lnh1/d;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lqh1/c;->d(Lkotlin/jvm/functions/Function1;Lnh1/d;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lnh1/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lqh1/c;->e(Landroidx/compose/ui/Modifier;Lnh1/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lnh1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lnh1/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p3

    check-cast v15, Lp1/q;

    const v0, 0x2d9d0680

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x30

    const/16 v2, 0x20

    if-nez v0, :cond_2

    and-int/lit8 v0, v1, 0x40

    if-nez v0, :cond_0

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr v0, v1

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    and-int/lit16 v3, v1, 0x180

    const/16 v4, 0x100

    if-nez v3, :cond_4

    invoke-virtual {v15, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    move v3, v4

    goto :goto_3

    :cond_3
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v0, v3

    :cond_4
    and-int/lit16 v3, v0, 0x91

    const/16 v7, 0x90

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v3, v7, :cond_5

    move v3, v9

    goto :goto_4

    :cond_5
    move v3, v8

    :goto_4
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v15, v7, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_d

    and-int/lit8 v3, p5, 0x1

    if-eqz v3, :cond_6

    sget-object v3, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_6
    move-object/from16 v3, p0

    :goto_5
    invoke-virtual {v5}, Lnh1/d;->g()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const v10, 0x3a758c45

    invoke-virtual {v15, v10, v7}, Lp1/q;->b0(ILjava/lang/Object;)V

    invoke-virtual {v5}, Lnh1/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const-string v10, ""

    if-nez v7, :cond_7

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    :cond_7
    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    move v11, v9

    invoke-virtual {v5}, Lnh1/d;->f()I

    move-result v9

    move v12, v8

    move-object v8, v10

    invoke-virtual {v5}, Lnh1/d;->e()I

    move-result v10

    invoke-virtual {v5}, Lnh1/d;->g()I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    and-int/lit16 v14, v0, 0x380

    if-ne v14, v4, :cond_8

    move v4, v11

    goto :goto_6

    :cond_8
    move v4, v12

    :goto_6
    and-int/lit8 v14, v0, 0x70

    if-eq v14, v2, :cond_a

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_9

    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_7

    :cond_9
    move v11, v12

    :cond_a
    :goto_7
    or-int v0, v4, v11

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_b

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_c

    :cond_b
    new-instance v2, Lq11/c;

    const/16 v0, 0x9

    invoke-direct {v2, v0, v6, v5}, Lq11/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v14, v2

    check-cast v14, Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    const/high16 v2, 0x180000

    or-int/2addr v2, v0

    shl-int/lit8 v0, v0, 0x3

    or-int v16, v2, v0

    const/16 v17, 0x20

    move v0, v12

    const/4 v12, 0x0

    move-object v11, v13

    const/4 v13, 0x1

    invoke-static/range {v7 .. v17}, Lw71/s;->h(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    move-object v4, v3

    goto :goto_8

    :cond_d
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object/from16 v4, p0

    :goto_8
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_e

    new-instance v0, Lqb0/a;

    const/4 v3, 0x5

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lqb0/a;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Lnh1/d;I)Ll83/a0;
    .locals 1

    new-instance v0, Lqh1/b;

    invoke-virtual {p1}, Lnh1/d;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p2, p1}, Lqh1/b;-><init>(ILjava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Lnh1/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lqh1/c;->c(Landroidx/compose/ui/Modifier;Lnh1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
