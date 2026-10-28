.class public abstract Lvo1/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001aq\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001aW\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00042\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016\u00b2\u0006\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00028\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lso1/c0;",
        "viewState",
        "",
        "analyticsSource",
        "Lkotlin/Function1;",
        "Lso1/a0;",
        "Ll83/a0;",
        "onViewEvent",
        "Lro1/g;",
        "onNavigationEvent",
        "Lyn1/a;",
        "onAnalyticEvent",
        "Lvo1/z;",
        "manualSelectedCyclesId",
        "m",
        "(Lso1/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lvo1/z;Landroidx/compose/runtime/Composer;II)V",
        "Lso1/c0$f;",
        "selectedCyclesId",
        "onSelectedCyclesIdChange",
        "v",
        "(Lso1/c0$f;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lvo1/z;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "selectedSegmentId",
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
.method private static final A(Ljava/lang/String;Lso1/c0$f;Ln0/q;)Ll83/a0;
    .locals 4

    const-string v0, "$this$LazyColumn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "CURRENT_CYCLE"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lso1/c0$f;->i()Lso1/k0;

    move-result-object p0

    invoke-virtual {p0}, Lso1/k0;->a()Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    const-string v0, "LAST_THREE_CYCLES"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {p1}, Lso1/c0$f;->i()Lso1/k0;

    move-result-object p0

    invoke-virtual {p0}, Lso1/k0;->b()Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lso1/c0$f;->i()Lso1/k0;

    move-result-object p0

    invoke-virtual {p0}, Lso1/k0;->a()Ljava/util/List;

    move-result-object p0

    :goto_0
    sget-object p1, Lvo1/t$d;->w:Lvo1/t$d;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Lvo1/t$e;

    invoke-direct {v1, p1, p0}, Lvo1/t$e;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance p1, Lvo1/t$f;

    invoke-direct {p1, p0}, Lvo1/t$f;-><init>(Ljava/util/List;)V

    new-instance p0, Lx1/b;

    const/4 v2, 0x1

    const v3, 0x2fd4df92

    invoke-direct {p0, p1, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p2, Ln0/f;

    const/4 p1, 0x0

    invoke-virtual {p2, v0, p1, v1, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lso1/c0$f;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lvo1/z;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v7}, Lvo1/t;->v(Lso1/c0$f;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lvo1/z;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lso1/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lvo1/z;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lvo1/t;->p(Lso1/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lvo1/z;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lyn1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvo1/t;->q(Lyn1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lso1/c0$f;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvo1/t;->z(Lkotlin/jvm/functions/Function1;Lso1/c0$f;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/view/Window;J)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvo1/t;->x(Landroid/view/Window;J)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lro1/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvo1/t;->w(Lro1/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lso1/c0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lvo1/t;->u(Lkotlin/jvm/functions/Function1;Lso1/c0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lso1/a0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvo1/t;->n(Lso1/a0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvo1/t;->y(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lso1/c0$f;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lvo1/z;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lvo1/t;->B(Lso1/c0$f;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lvo1/z;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/String;Lso1/c0$f;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvo1/t;->A(Ljava/lang/String;Lso1/c0$f;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lro1/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvo1/t;->o(Lro1/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lvo1/t;->t(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lso1/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lvo1/z;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lso1/c0;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lvo1/z;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move/from16 v1, p7

    const-string v0, "viewState"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p6

    check-cast v10, Lp1/q;

    const v0, 0x3c93900e

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v3, p8, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p8, 0x4

    const/16 v8, 0x100

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v1, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    move v11, v8

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v0, v11

    :goto_5
    and-int/lit8 v11, p8, 0x8

    if-eqz v11, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v12, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v12, v1, 0xc00

    if-nez v12, :cond_8

    move-object/from16 v12, p3

    invoke-virtual {v10, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/16 v13, 0x800

    goto :goto_6

    :cond_a
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v0, v13

    :goto_7
    and-int/lit8 v13, p8, 0x10

    if-eqz v13, :cond_c

    or-int/lit16 v0, v0, 0x6000

    :cond_b
    move-object/from16 v15, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v15, v1, 0x6000

    if-nez v15, :cond_b

    move-object/from16 v15, p4

    invoke-virtual {v10, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v0, v0, v16

    :goto_9
    and-int/lit8 v16, p8, 0x20

    const/high16 v2, 0x20000

    const/high16 v17, 0x30000

    if-eqz v16, :cond_e

    or-int v0, v0, v17

    goto :goto_d

    :cond_e
    and-int v17, v1, v17

    if-nez v17, :cond_11

    if-nez p5, :cond_f

    const/16 v17, -0x1

    :goto_a
    move/from16 v14, v17

    goto :goto_b

    :cond_f
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Enum;->ordinal()I

    move-result v17

    goto :goto_a

    :goto_b
    invoke-virtual {v10, v14}, Lp1/q;->e(I)Z

    move-result v14

    if-eqz v14, :cond_10

    move v14, v2

    goto :goto_c

    :cond_10
    const/high16 v14, 0x10000

    :goto_c
    or-int/2addr v0, v14

    :cond_11
    :goto_d
    const v14, 0x12493

    and-int/2addr v14, v0

    const v5, 0x12492

    move/from16 v19, v7

    move/from16 v20, v13

    if-eq v14, v5, :cond_12

    const/4 v5, 0x1

    goto :goto_e

    :cond_12
    const/4 v5, 0x0

    :goto_e
    and-int/lit8 v14, v0, 0x1

    invoke-virtual {v10, v14, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_35

    const/4 v5, 0x0

    if-eqz v3, :cond_13

    move-object v3, v5

    goto :goto_f

    :cond_13
    move-object v3, v6

    :goto_f
    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v19, :cond_15

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v6, :cond_14

    new-instance v9, Lve0/d;

    const/16 v14, 0x1d

    invoke-direct {v9, v14}, Lve0/d;-><init>(I)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v9, Lkotlin/jvm/functions/Function1;

    :cond_15
    move-object v14, v9

    if-eqz v11, :cond_17

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v6, :cond_16

    new-instance v9, Lvo1/s;

    const/4 v11, 0x0

    invoke-direct {v9, v11}, Lvo1/s;-><init>(I)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v9, Lkotlin/jvm/functions/Function1;

    goto :goto_10

    :cond_17
    move-object v9, v12

    :goto_10
    if-eqz v20, :cond_19

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v6, :cond_18

    new-instance v11, Lvo1/s;

    const/4 v12, 0x1

    invoke-direct {v11, v12}, Lvo1/s;-><init>(I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v11, Lkotlin/jvm/functions/Function1;

    move-object v15, v11

    :cond_19
    if-eqz v16, :cond_1a

    move-object v11, v5

    goto :goto_11

    :cond_1a
    move-object/from16 v11, p5

    :goto_11
    and-int/lit8 v12, v0, 0xe

    or-int/lit8 v7, v12, 0x30

    const-string v13, "healthcare_womens_health_symptom_patterns"

    invoke-static {v4, v13, v10, v7}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    instance-of v7, v4, Lso1/c0$f;

    if-eqz v7, :cond_2c

    const v7, 0x5811dd1e

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    and-int/lit16 v13, v0, 0x380

    if-ne v13, v8, :cond_1b

    const/4 v8, 0x1

    goto :goto_12

    :cond_1b
    const/4 v8, 0x0

    :goto_12
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v8, :cond_1c

    if-ne v13, v6, :cond_1d

    :cond_1c
    new-instance v13, Lvo1/t$a;

    invoke-direct {v13, v14, v5}, Lvo1/t$a;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v10, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v13, Lc93/m;

    invoke-static {v10, v13, v7}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v7, v4

    check-cast v7, Lso1/c0$f;

    invoke-virtual {v7}, Lso1/c0$f;->i()Lso1/k0;

    move-result-object v8

    invoke-virtual {v10, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    const/high16 v13, 0x70000

    and-int/2addr v13, v0

    if-ne v13, v2, :cond_1e

    const/4 v2, 0x1

    goto :goto_13

    :cond_1e
    const/4 v2, 0x0

    :goto_13
    or-int/2addr v2, v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v2, :cond_1f

    if-ne v8, v6, :cond_23

    :cond_1f
    if-eqz v11, :cond_20

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_22

    :cond_20
    invoke-virtual {v7}, Lso1/c0$f;->i()Lso1/k0;

    move-result-object v2

    if-eqz v2, :cond_21

    invoke-virtual {v2}, Lso1/k0;->d()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_21

    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnp1/k;

    if-eqz v2, :cond_21

    invoke-virtual {v2}, Lnp1/k;->a()Ljava/lang/String;

    move-result-object v2

    goto :goto_14

    :cond_21
    move-object v2, v5

    :cond_22
    :goto_14
    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    check-cast v8, Lp1/c1;

    if-eqz v11, :cond_24

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_25

    :cond_24
    invoke-static {v8}, Lvo1/t;->r(Lp1/c1;)Ljava/lang/String;

    move-result-object v2

    :cond_25
    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    and-int/lit8 v5, v0, 0x70

    const/16 v1, 0x20

    if-ne v5, v1, :cond_26

    const/4 v1, 0x1

    goto :goto_15

    :cond_26
    const/4 v1, 0x0

    :goto_15
    or-int/2addr v1, v13

    const v5, 0xe000

    and-int v13, v0, v5

    move/from16 p1, v5

    const/16 v5, 0x4000

    if-ne v13, v5, :cond_27

    const/16 v16, 0x1

    goto :goto_16

    :cond_27
    const/16 v16, 0x0

    :goto_16
    or-int v1, v1, v16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_28

    if-ne v5, v6, :cond_29

    :cond_28
    new-instance v5, Lvo1/t$b;

    const/4 v1, 0x0

    invoke-direct {v5, v2, v3, v15, v1}, Lvo1/t$b;-><init>(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    check-cast v5, Lc93/m;

    invoke-static {v3, v2, v5, v10}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-static {v8}, Lvo1/t;->r(Lp1/c1;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_2a

    if-ne v5, v6, :cond_2b

    :cond_2a
    new-instance v5, Lq12/c;

    const/16 v2, 0x17

    invoke-direct {v5, v2, v8}, Lq12/c;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v5, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v2, v0, 0x6

    and-int/lit16 v2, v2, 0x1c00

    or-int/2addr v2, v12

    shl-int/lit8 v0, v0, 0x3

    and-int v0, v0, p1

    or-int/2addr v0, v2

    const/4 v12, 0x0

    move-object v6, v7

    move-object v7, v5

    move-object v5, v6

    move-object v6, v1

    move-object v8, v11

    move v11, v0

    invoke-static/range {v5 .. v12}, Lvo1/t;->v(Lso1/c0$f;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lvo1/z;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v8

    move-object v1, v9

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    move-object/from16 v22, v14

    move-object/from16 v21, v15

    goto/16 :goto_1b

    :cond_2c
    move-object v1, v9

    move-object v2, v11

    const/4 v5, 0x0

    instance-of v7, v4, Lso1/c0$a;

    if-eqz v7, :cond_31

    const v7, 0x58273b0b

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    new-instance v17, Lsz0/p0$b;

    sget v7, Lxn1/c;->k:I

    invoke-static {v10, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    const/16 v21, 0x6

    const/16 v22, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v17 .. v22}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v7, Lxn1/c;->e:I

    invoke-static {v10, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v9, Lxn1/c;->f:I

    invoke-static {v10, v9}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    and-int/lit16 v0, v0, 0x380

    if-ne v0, v8, :cond_2d

    const/4 v0, 0x1

    :goto_17
    const/4 v8, 0x4

    goto :goto_18

    :cond_2d
    move v0, v5

    goto :goto_17

    :goto_18
    if-ne v12, v8, :cond_2e

    const/16 v16, 0x1

    goto :goto_19

    :cond_2e
    move/from16 v16, v5

    :goto_19
    or-int v0, v0, v16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v0, :cond_2f

    if-ne v8, v6, :cond_30

    :cond_2f
    new-instance v8, Lvo1/q;

    const/4 v0, 0x1

    invoke-direct {v8, v14, v4, v0}, Lvo1/q;-><init>(Lkotlin/jvm/functions/Function1;Lso1/c0;I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_30
    check-cast v8, Lc93/a;

    sget v0, Lsz0/p0$b;->h:I

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v11, v6, 0x3

    or-int/2addr v0, v11

    shl-int/lit8 v6, v6, 0x9

    or-int v18, v0, v6

    const/16 v19, 0x0

    const/16 v20, 0xfe4

    move-object v6, v7

    const/4 v7, 0x0

    move v0, v5

    move-object/from16 v5, v17

    move-object/from16 v17, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v21, v15

    const/4 v15, 0x0

    move-object/from16 v22, v16

    const/16 v16, 0x0

    move-object/from16 v24, v9

    move-object v9, v8

    move-object/from16 v8, v24

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v17

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_1b

    :cond_31
    move v0, v5

    move-object/from16 v22, v14

    move-object/from16 v21, v15

    const v5, 0x582ed21d

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    sget-object v5, Ll0/m;->e:Ll0/h;

    sget-object v6, Lb2/e;->N:Lb2/k;

    const/16 v7, 0x36

    invoke-static {v5, v6, v10, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_32

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1a

    :cond_32
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1a
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v10, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v10, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_33

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_34

    :cond_33
    invoke-static {v6, v10, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_34
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v10, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lsz0/p0$c;->f:I

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v8, 0x3

    or-int v18, v7, v8

    const/16 v19, 0x0

    const/16 v20, 0xffc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v23, 0x1

    const/16 v16, 0x0

    move/from16 v0, v23

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v17

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_1b
    move-object v8, v1

    move-object v7, v2

    move-object v5, v3

    move-object/from16 v9, v21

    move-object/from16 v6, v22

    goto :goto_1c

    :cond_35
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object/from16 v7, p5

    move-object v5, v6

    move-object v6, v9

    move-object v8, v12

    move-object v9, v15

    :goto_1c
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_36

    new-instance v0, Lp72/a;

    const/16 v3, 0xa

    move/from16 v1, p7

    move/from16 v2, p8

    invoke-direct/range {v0 .. v9}, Lp72/a;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ll83/e;Ll83/e;)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_36
    return-void
.end method

.method private static final n(Lso1/a0;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lro1/g;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lso1/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lvo1/z;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lvo1/t;->m(Lso1/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lvo1/z;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lyn1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final s(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final t(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lvo1/t;->s(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lkotlin/jvm/functions/Function1;Lso1/c0;)Ll83/a0;
    .locals 1

    new-instance v0, Lso1/a0$k;

    check-cast p1, Lso1/c0$a;

    invoke-virtual {p1}, Lso1/c0$a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lso1/a0$k;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final v(Lso1/c0$f;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lvo1/z;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lso1/c0$f;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lvo1/z;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v6, p6

    sget-object v0, Lb2/e;->M:Lb2/k;

    const-string v2, "viewState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onSelectedCyclesIdChange"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v2, 0x44e57483

    invoke-virtual {v12, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v6, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v6

    goto :goto_1

    :cond_1
    move v2, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v2, v8

    goto :goto_3

    :cond_3
    move-object/from16 v7, p1

    :goto_3
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_4

    :cond_4
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    :cond_5
    and-int/lit8 v8, p7, 0x8

    if-eqz v8, :cond_6

    or-int/lit16 v2, v2, 0xc00

    goto :goto_7

    :cond_6
    and-int/lit16 v11, v6, 0xc00

    if-nez v11, :cond_9

    if-nez p3, :cond_7

    const/4 v11, -0x1

    goto :goto_5

    :cond_7
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    :goto_5
    invoke-virtual {v12, v11}, Lp1/q;->e(I)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x800

    goto :goto_6

    :cond_8
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v2, v11

    :cond_9
    :goto_7
    and-int/lit8 v11, p7, 0x10

    if-eqz v11, :cond_b

    or-int/lit16 v2, v2, 0x6000

    :cond_a
    move-object/from16 v14, p4

    goto :goto_9

    :cond_b
    and-int/lit16 v14, v6, 0x6000

    if-nez v14, :cond_a

    move-object/from16 v14, p4

    invoke-virtual {v12, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_c

    const/16 v15, 0x4000

    goto :goto_8

    :cond_c
    const/16 v15, 0x2000

    :goto_8
    or-int/2addr v2, v15

    :goto_9
    and-int/lit16 v15, v2, 0x2493

    const/16 v9, 0x2492

    const/4 v4, 0x0

    if-eq v15, v9, :cond_d

    const/4 v9, 0x1

    goto :goto_a

    :cond_d
    move v9, v4

    :goto_a
    and-int/lit8 v15, v2, 0x1

    invoke-virtual {v12, v15, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_2c

    if-eqz v8, :cond_e

    const/16 v19, 0x0

    goto :goto_b

    :cond_e
    move-object/from16 v19, p3

    :goto_b
    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v11, :cond_10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v8, :cond_f

    new-instance v11, Lvo1/s;

    const/4 v14, 0x2

    invoke-direct {v11, v14}, Lvo1/s;-><init>(I)V

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v11, Lkotlin/jvm/functions/Function1;

    goto :goto_c

    :cond_10
    move-object v11, v14

    :goto_c
    if-eqz v19, :cond_11

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    if-nez v14, :cond_12

    :cond_11
    move-object v14, v7

    :cond_12
    sget-object v15, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    invoke-virtual {v12, v15}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/view/View;

    invoke-virtual {v15}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    instance-of v10, v15, Landroid/app/Activity;

    if-eqz v10, :cond_13

    check-cast v15, Landroid/app/Activity;

    goto :goto_d

    :cond_13
    const/4 v15, 0x0

    :goto_d
    if-eqz v15, :cond_14

    invoke-virtual {v15}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v10

    goto :goto_e

    :cond_14
    const/4 v10, 0x0

    :goto_e
    const-wide v20, 0xff283339L

    move-object/from16 p3, v14

    invoke-static/range {v20 .. v21}, Li2/w0;->e(J)J

    move-result-wide v13

    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v18, :cond_15

    if-ne v15, v8, :cond_16

    :cond_15
    new-instance v15, Laq1/e;

    const/4 v5, 0x1

    invoke-direct {v15, v10, v13, v14, v5}, Laq1/e;-><init>(Landroid/view/Window;JI)V

    invoke-virtual {v12, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v15, Lc93/a;

    invoke-static {v15, v12}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v13, Ll0/m;->c:Ll0/g;

    invoke-static {v13, v0, v12, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    iget-wide v14, v12, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v20, La3/l;->a:La3/k;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-eqz v9, :cond_17

    invoke-virtual {v12, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_17
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_f
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v12, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v12, v4, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_18

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_19

    :cond_18
    invoke-static {v14, v12, v14, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v12, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v22, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v1}, Lso1/c0$f;->i()Lso1/k0;

    move-result-object v4

    if-eqz v4, :cond_1b

    invoke-virtual {v4}, Lso1/k0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    if-nez v4, :cond_1a

    goto :goto_11

    :cond_1a
    const/4 v13, 0x0

    :goto_10
    move-object/from16 v23, v4

    goto :goto_12

    :cond_1b
    :goto_11
    new-instance v4, Lcom/whoop/design/util/TextResource$b;

    sget v5, Lxn1/c;->u:I

    const/4 v9, 0x2

    const/4 v13, 0x0

    invoke-direct {v4, v5, v13, v9, v13}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_10

    :goto_12
    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v25

    sget v4, Luv0/c;->E:I

    invoke-static {v12, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v26

    const v39, 0xfff2

    const/16 v40, 0x0

    const/16 v24, 0x0

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

    const/16 v38, 0x0

    invoke-direct/range {v22 .. v40}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v4, 0xe000

    and-int/2addr v4, v2

    const/16 v15, 0x4000

    if-ne v4, v15, :cond_1c

    const/4 v4, 0x1

    goto :goto_13

    :cond_1c
    const/4 v4, 0x0

    :goto_13
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_1d

    if-ne v5, v8, :cond_1e

    :cond_1d
    new-instance v5, Luf0/e;

    const/16 v4, 0x17

    invoke-direct {v5, v11, v4}, Luf0/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v5, Lc93/a;

    sget v4, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    const/4 v9, 0x3

    shl-int/lit8 v14, v4, 0x3

    const/16 v15, 0x35

    const/4 v7, 0x0

    move v4, v9

    const/4 v9, 0x0

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move-object/from16 v23, v13

    move-object v13, v12

    const/4 v12, 0x0

    move v6, v4

    move-object/from16 v41, v8

    move-object v4, v10

    move-object/from16 v8, v22

    move-object v10, v5

    move-object/from16 v5, p3

    invoke-static/range {v7 .. v15}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1}, Lso1/c0$f;->i()Lso1/k0;

    move-result-object v7

    if-eqz v7, :cond_2b

    const v7, 0x6246d9f0

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lso1/c0$f;->i()Lso1/k0;

    move-result-object v7

    invoke-virtual {v7}, Lso1/k0;->d()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const/4 v10, 0x0

    :goto_14
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_20

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lnp1/k;

    invoke-virtual {v8}, Lnp1/k;->a()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1f

    goto :goto_15

    :cond_1f
    add-int/lit8 v10, v10, 0x1

    goto :goto_14

    :cond_20
    const/4 v10, -0x1

    :goto_15
    int-to-float v6, v6

    const/4 v7, 0x4

    int-to-float v15, v7

    invoke-static {v6, v15, v4, v13}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/4 v9, 0x2

    int-to-float v6, v9

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    const/4 v8, 0x0

    invoke-static {v4, v6, v8, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v9, Ll0/m;->c:Ll0/g;

    const/4 v12, 0x0

    invoke-static {v9, v0, v13, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v8, v13, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v13, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v14, v13, Lp1/q;->S:Z

    if-eqz v14, :cond_21

    invoke-virtual {v13, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_21
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_16
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v13, v12, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v13, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_22

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_23

    :cond_22
    invoke-static {v8, v13, v8, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_23
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v13, v0, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lso1/c0$f;->i()Lso1/k0;

    move-result-object v0

    invoke-virtual {v0}, Lso1/k0;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    move v8, v7

    new-instance v7, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v0, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_24

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lnp1/k;

    new-instance v11, Lsz0/u0;

    invoke-virtual {v9}, Lnp1/k;->b()Ljava/lang/String;

    move-result-object v9

    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-direct {v11, v9, v14, v12, v14}, Lsz0/u0;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_17

    :cond_24
    const/4 v9, -0x1

    if-eq v10, v9, :cond_25

    goto :goto_18

    :cond_25
    const/4 v10, 0x0

    :goto_18
    and-int/lit16 v0, v2, 0x380

    const/16 v2, 0x100

    if-ne v0, v2, :cond_26

    const/4 v0, 0x1

    goto :goto_19

    :cond_26
    const/4 v0, 0x0

    :goto_19
    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_27

    move-object/from16 v0, v41

    if-ne v2, v0, :cond_28

    goto :goto_1a

    :cond_27
    move-object/from16 v0, v41

    :goto_1a
    new-instance v2, Lum0/b;

    const/16 v9, 0x8

    invoke-direct {v2, v9, v3, v1}, Lum0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    move-object v11, v2

    check-cast v11, Lkotlin/jvm/functions/Function1;

    move-object v12, v13

    const/4 v13, 0x0

    const/16 v14, 0xc

    const/4 v9, 0x0

    move v2, v8

    move v8, v10

    const/4 v10, 0x0

    move/from16 p3, v2

    const/4 v2, 0x0

    invoke-static/range {v7 .. v14}, Lsz0/x0;->e(Ljava/util/List;ILandroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v12

    const/4 v7, 0x1

    invoke-virtual {v13, v7}, Lp1/q;->q(Z)V

    mul-float v15, v15, p3

    invoke-static {v15, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v13, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v9, 0x2

    invoke-static {v4, v6, v2, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v13, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_29

    if-ne v4, v0, :cond_2a

    :cond_29
    new-instance v4, Lum0/b;

    const/4 v0, 0x7

    invoke-direct {v4, v0, v5, v1}, Lum0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    move-object v15, v4

    check-cast v15, Lkotlin/jvm/functions/Function1;

    const/16 v17, 0x6

    const/16 v18, 0x1fe

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v7 .. v18}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v16

    const/4 v12, 0x0

    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    :goto_1b
    const/4 v7, 0x1

    goto :goto_1c

    :cond_2b
    const/4 v12, 0x0

    const v0, 0x62692dd5

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    goto :goto_1b

    :goto_1c
    invoke-virtual {v13, v7}, Lp1/q;->q(Z)V

    move-object/from16 v4, v19

    move-object/from16 v5, v21

    goto :goto_1d

    :cond_2c
    move-object v13, v12

    invoke-virtual {v13}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move-object v5, v14

    :goto_1d
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_2d

    new-instance v0, Lv71/g;

    const/4 v8, 0x1

    move-object/from16 v2, p1

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lv71/g;-><init>(Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_2d
    return-void
.end method

.method private static final w(Lro1/g;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Landroid/view/Window;J)Ll83/a0;
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {p1, p2}, Li2/w0;->H(J)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lro1/g$a;->a:Lro1/g$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;Lso1/c0$f;I)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lso1/c0$f;->i()Lso1/k0;

    move-result-object p1

    invoke-virtual {p1}, Lso1/k0;->d()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnp1/k;

    invoke-virtual {p1}, Lnp1/k;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
