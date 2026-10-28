.class public abstract Lfy1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a-\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0011\u00b2\u0006\u000e\u0010\r\u001a\u00020\u000c8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lfy1/k;",
        "viewState",
        "",
        "screenTag",
        "Ll83/a0;",
        "c",
        "(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "Lkotlin/Function0;",
        "",
        "nanoTime",
        "d",
        "(Lfy1/k;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "",
        "hasEmittedFirstVisible",
        "Ll83/k;",
        "Lcom/whoop/metrics/common/ScreenState;",
        "previousObservation",
        "metrics-common_release"
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
.method public static synthetic a(Lfy1/k;Ljava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lfy1/j;->f(Lfy1/k;Ljava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lfy1/k;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lfy1/j;->e(Lfy1/k;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 3

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screenTag"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, -0x2b34bef5

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, p3

    goto :goto_2

    :cond_2
    move v0, p3

    :goto_2
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_4

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    if-eq v1, v2, :cond_5

    const/4 v1, 0x1

    goto :goto_4

    :cond_5
    const/4 v1, 0x0

    :goto_4
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_6

    sget-object v1, Lfy1/j$a;->w:Lfy1/j$a;

    invoke-virtual {p2, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v1, Lj93/g;

    check-cast v1, Lc93/a;

    and-int/lit8 v2, v0, 0xe

    or-int/lit16 v2, v2, 0x180

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v2

    invoke-static {p0, p1, v1, p2, v0}, Lfy1/j;->d(Lfy1/k;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_7
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_8

    new-instance v0, Lf01/b;

    const/4 v1, 0x4

    invoke-direct {v0, p0, p1, p3, v1}, Lf01/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static final d(Lfy1/k;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfy1/k;",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v0, p4

    const-string v4, "viewState"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "screenTag"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "nanoTime"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v4, -0x40586969

    invoke-virtual {v13, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_2

    and-int/lit8 v4, v0, 0x8

    if-nez v4, :cond_0

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_1

    :cond_1
    const/4 v4, 0x2

    :goto_1
    or-int/2addr v4, v0

    goto :goto_2

    :cond_2
    move v4, v0

    :goto_2
    and-int/lit8 v5, v0, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_4

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v4, v5

    :cond_4
    and-int/lit16 v5, v0, 0x180

    const/16 v7, 0x100

    if-nez v5, :cond_6

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    move v5, v7

    goto :goto_4

    :cond_5
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v4, v5

    :cond_6
    and-int/lit16 v5, v4, 0x93

    const/16 v8, 0x92

    if-eq v5, v8, :cond_7

    const/4 v5, 0x1

    goto :goto_5

    :cond_7
    const/4 v5, 0x0

    :goto_5
    and-int/lit8 v8, v4, 0x1

    invoke-virtual {v13, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-static {}, Lfy1/m;->c()Lp1/t1;

    move-result-object v5

    invoke-virtual {v13, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lfy1/l;

    invoke-static {}, Lqf1/a;->c()Lp1/t1;

    move-result-object v8

    invoke-virtual {v13, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v11, "mobile-time-to-first-view-metric"

    invoke-interface {v8, v11}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v8

    invoke-interface {v1}, Lfy1/k;->getState()Lcom/whoop/metrics/common/ScreenState;

    move-result-object v11

    sget-object v12, Lcom/whoop/metrics/common/ScreenState;->CACHE_HIT:Lcom/whoop/metrics/common/ScreenState;

    if-ne v11, v12, :cond_8

    if-nez v8, :cond_8

    sget-object v11, Lcom/whoop/metrics/common/ScreenState;->SUCCESS:Lcom/whoop/metrics/common/ScreenState;

    :cond_8
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-ne v12, v14, :cond_9

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    move-result-wide v15

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-virtual {v13, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->longValue()J

    move-result-wide v15

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v14, :cond_a

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v12}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v12

    invoke-virtual {v13, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v12, Lp1/c1;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v14, :cond_b

    const/4 v9, 0x0

    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v9

    invoke-virtual {v13, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v9, Lp1/c1;

    and-int/lit8 v10, v4, 0x70

    if-ne v10, v6, :cond_c

    const/4 v6, 0x1

    goto :goto_6

    :cond_c
    const/4 v6, 0x0

    :goto_6
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    invoke-virtual {v13, v10}, Lp1/q;->e(I)Z

    move-result v10

    or-int/2addr v6, v10

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v6, v10

    invoke-virtual {v13, v8}, Lp1/q;->h(Z)Z

    move-result v10

    or-int/2addr v6, v10

    and-int/lit16 v4, v4, 0x380

    if-ne v4, v7, :cond_d

    const/16 v17, 0x1

    goto :goto_7

    :cond_d
    const/16 v17, 0x0

    :goto_7
    or-int v4, v6, v17

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_f

    if-ne v6, v14, :cond_e

    goto :goto_8

    :cond_e
    move-object v3, v2

    move-object v4, v11

    goto :goto_9

    :cond_f
    :goto_8
    new-instance v2, Lfy1/j$b;

    move-object v4, v11

    move-object v11, v12

    const/4 v12, 0x0

    move v6, v8

    move-object v10, v9

    move-wide v7, v15

    move-object v9, v3

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v12}, Lfy1/j$b;-><init>(Ljava/lang/String;Lcom/whoop/metrics/common/ScreenState;Lfy1/l;ZJLc93/a;Lp1/c1;Lp1/c1;Lq83/d;)V

    invoke-virtual {v13, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v2

    :goto_9
    check-cast v6, Lc93/m;

    invoke-static {v3, v4, v6, v13}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    goto :goto_a

    :cond_10
    move-object v3, v2

    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v0, Lcy1/b;

    const/16 v5, 0x10

    move/from16 v4, p4

    move-object v2, v3

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v5}, Lcy1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final e(Lfy1/k;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lfy1/k;Ljava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lfy1/j;->d(Lfy1/k;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lp1/c1;)Z
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

.method private static final h(Lp1/c1;Z)V
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

.method private static final i(Lp1/c1;)Ll83/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll83/k;

    return-object p0
.end method

.method private static final j(Lp1/c1;Ll83/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ll83/k;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic k(Lp1/c1;)Z
    .locals 0

    invoke-static {p0}, Lfy1/j;->g(Lp1/c1;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic l(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lfy1/j;->h(Lp1/c1;Z)V

    return-void
.end method

.method public static final synthetic m(Lp1/c1;)Ll83/k;
    .locals 0

    invoke-static {p0}, Lfy1/j;->i(Lp1/c1;)Ll83/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lp1/c1;Ll83/k;)V
    .locals 0

    invoke-static {p0, p1}, Lfy1/j;->j(Lp1/c1;Ll83/k;)V

    return-void
.end method
