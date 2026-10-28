.class public abstract Lz22/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lx22/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lx22/a;",
        "Ll83/a0;",
        "onEvent",
        "f",
        "(Lx22/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "payments_release"
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
.method public static synthetic a(Lx22/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lz22/g;->k(Lx22/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lx22/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lz22/g;->i(Lx22/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lx22/c$c;Lx22/c;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lz22/g;->h(Lx22/c$c;Lx22/c;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lx22/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lz22/g;->j(Lx22/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lx22/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lz22/g;->g(Lx22/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lx22/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx22/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p2

    check-cast v6, Lp1/q;

    const p2, -0x34380e19    # -2.6207182E7f

    invoke-virtual {v6, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_2

    or-int/lit8 p2, p2, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_4

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_2

    :cond_3
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p2, v1

    :cond_4
    :goto_3
    and-int/lit8 v1, p2, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_5

    move v1, v4

    goto :goto_4

    :cond_5
    move v1, v3

    :goto_4
    and-int/2addr p2, v4

    invoke-virtual {v6, p2, v1}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_9

    if-eqz v0, :cond_7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_6

    new-instance p1, Lyz1/g;

    const/4 p2, 0x5

    invoke-direct {p1, p2}, Lyz1/g;-><init>(I)V

    invoke-virtual {v6, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast p1, Lkotlin/jvm/functions/Function1;

    :cond_7
    invoke-virtual {p0}, Lx22/c;->c()Lx22/c$c;

    move-result-object p2

    if-eqz p2, :cond_8

    move v3, v4

    :cond_8
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    new-instance v0, Lyw1/e;

    const/4 v2, 0x3

    invoke-direct {v0, p2, p0, p1, v2}, Lyw1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const p2, 0x27c1fba6

    invoke-static {p2, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v7, 0x6c00

    const/4 v8, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, ""

    invoke-static/range {v1 .. v8}, Lpf/c;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ld0/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    :goto_5
    move-object v2, p1

    goto :goto_6

    :cond_9
    invoke-virtual {v6}, Lp1/q;->X()V

    goto :goto_5

    :goto_6
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_a

    new-instance v0, Lz22/e;

    const/4 v5, 0x0

    move-object v1, p0

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lz22/e;-><init>(Lx22/c;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final g(Lx22/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lx22/c$c;Lx22/c;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 41

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p3

    and-int/lit8 v3, p5, 0x6

    if-nez v3, :cond_1

    move-object/from16 v3, p4

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v2}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p5, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p5

    :goto_1
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v4, v5, :cond_2

    move v4, v6

    goto :goto_2

    :cond_2
    move v4, v7

    :goto_2
    and-int/2addr v3, v6

    move-object/from16 v5, p4

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_9

    if-eqz v2, :cond_8

    if-eqz p0, :cond_8

    const v2, -0x58fb05bc

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lx22/c$c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lx22/c$c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lx22/c$c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lx22/c$c;->d()Ly81/e;

    move-result-object v2

    if-nez v2, :cond_3

    sget-object v2, Ly81/f;->BRAND_WHITE:Ly81/f;

    :cond_3
    move-object v13, v2

    invoke-virtual/range {p0 .. p0}, Lx22/c$c;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-virtual/range {p0 .. p0}, Lx22/c$c;->g()Z

    move-result v20

    invoke-virtual/range {p0 .. p0}, Lx22/c$c;->i()Lj11/p;

    move-result-object v21

    invoke-virtual/range {p0 .. p0}, Lx22/c$c;->j()Z

    move-result v12

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_4

    if-ne v3, v4, :cond_5

    :cond_4
    new-instance v3, Lz22/f;

    const/4 v2, 0x0

    invoke-direct {v3, v0, v1, v2}, Lz22/f;-><init>(Lx22/c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object/from16 v30, v3

    check-cast v30, Lc93/a;

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_6

    if-ne v3, v4, :cond_7

    :cond_6
    new-instance v3, Lz22/f;

    const/4 v2, 0x1

    invoke-direct {v3, v0, v1, v2}, Lz22/f;-><init>(Lx22/c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v32, v3

    check-cast v32, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v0, 0x3

    shl-int/lit8 v2, v0, 0x6

    or-int/2addr v1, v2

    shl-int/lit8 v2, v0, 0x9

    or-int/2addr v1, v2

    shl-int/lit8 v0, v0, 0x1b

    or-int v37, v1, v0

    const/16 v39, 0x0

    const v40, 0xebfcdc1

    const/4 v8, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v38, 0x0

    move-object/from16 v36, v5

    invoke-static/range {v8 .. v40}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v0, v36

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_8
    move-object v0, v5

    const v1, -0x58ef68a4

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_9
    move-object v0, v5

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lx22/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lx22/c;->c()Lx22/c$c;

    move-result-object p0

    invoke-virtual {p0}, Lx22/c$c;->c()Lx22/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lx22/c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lx22/c;->c()Lx22/c$c;

    move-result-object p0

    invoke-virtual {p0}, Lx22/c$c;->a()Lx22/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lx22/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lz22/g;->f(Lx22/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
