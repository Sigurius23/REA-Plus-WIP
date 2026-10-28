.class public abstract Lf22/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aS\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000cH\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0013\u00b2\u0006\u000c\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lg22/d;",
        "viewModel",
        "Leb/u0;",
        "navController",
        "Lcom/whoop/pairing/membershipAdjustment/navigation/MembershipAdjustmentNavHostDestination;",
        "startDestination",
        "Lkotlin/Function1;",
        "Lf22/d;",
        "Ll83/a0;",
        "onNavigationEvent",
        "Landroidx/fragment/app/o1;",
        "parentFragmentManager",
        "",
        "strapSerial",
        "strapSignature",
        "o",
        "(Lg22/d;Leb/u0;Lcom/whoop/pairing/membershipAdjustment/navigation/MembershipAdjustmentNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/fragment/app/o1;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V",
        "Lg22/b;",
        "viewState",
        "pairing-ui_release"
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
.method private static final A()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 7

    new-instance v0, Lf22/d$d;

    new-instance v1, Lcom/whoop/navigation/e;

    sget-object v2, Lcom/whoop/navigation/AppScreen$u2;->w:Lcom/whoop/navigation/AppScreen$u2;

    new-instance v3, Lcom/whoop/navigation/HomeScreenModel;

    const/4 v4, 0x0

    const/4 v5, 0x3

    invoke-direct {v3, v4, v4, v5, v4}, Lcom/whoop/navigation/HomeScreenModel;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1}, Lf22/d$d;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lg22/d;Ljava/lang/String;Ljava/lang/String;)Ll83/a0;
    .locals 1

    new-instance v0, Lg22/c$b;

    invoke-direct {v0, p1, p2}, Lg22/c$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lg22/d;->o(Lg22/c;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lg22/d;Leb/u0;Lcom/whoop/pairing/membershipAdjustment/navigation/MembershipAdjustmentNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/fragment/app/o1;Ljava/lang/String;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p8

    invoke-static/range {v1 .. v9}, Lf22/c;->o(Lg22/d;Leb/u0;Lcom/whoop/pairing/membershipAdjustment/navigation/MembershipAdjustmentNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/fragment/app/o1;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lf22/c;->v(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lf22/c;->A()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lg22/d;Ljava/lang/String;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lf22/c;->C(Lg22/d;Ljava/lang/String;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lg22/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lf22/c;->s(Lg22/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lf22/c;->u(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lg22/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lf22/c;->y(Lg22/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lg22/d;Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/o1;Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lf22/c;->r(Lg22/d;Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/o1;Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lg22/d;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lf22/c;->x(Lg22/d;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lg22/d;Ljava/lang/String;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lf22/c;->w(Lg22/d;Ljava/lang/String;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lg22/d;Leb/u0;Lcom/whoop/pairing/membershipAdjustment/navigation/MembershipAdjustmentNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/fragment/app/o1;Ljava/lang/String;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lf22/c;->D(Lg22/d;Leb/u0;Lcom/whoop/pairing/membershipAdjustment/navigation/MembershipAdjustmentNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/fragment/app/o1;Ljava/lang/String;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lg22/d;Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/o1;Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/s0;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lf22/c;->q(Lg22/d;Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/o1;Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/s0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lf22/c;->z(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Landroidx/fragment/app/o1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lf22/c;->t(Landroidx/fragment/app/o1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lf22/c;->B(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Lg22/d;Leb/u0;Lcom/whoop/pairing/membershipAdjustment/navigation/MembershipAdjustmentNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/fragment/app/o1;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg22/d;",
            "Leb/u0;",
            "Lcom/whoop/pairing/membershipAdjustment/navigation/MembershipAdjustmentNavHostDestination;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/fragment/app/o1;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v8, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v2, p5

    move-object/from16 v7, p6

    move/from16 v9, p8

    const-string v0, "viewModel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startDestination"

    move-object/from16 v10, p2

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parentFragmentManager"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapSerial"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "strapSignature"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p7

    check-cast v14, Lp1/q;

    const v0, -0x4b1d8a97

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v9

    goto :goto_1

    :cond_1
    move v0, v9

    :goto_1
    and-int/lit8 v3, v9, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v14, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v9, 0x180

    if-nez v3, :cond_5

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-virtual {v14, v3}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v0, v3

    :cond_5
    and-int/lit16 v3, v9, 0xc00

    if-nez v3, :cond_7

    invoke-virtual {v14, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_4

    :cond_6
    const/16 v3, 0x400

    :goto_4
    or-int/2addr v0, v3

    :cond_7
    and-int/lit16 v3, v9, 0x6000

    if-nez v3, :cond_9

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x4000

    goto :goto_5

    :cond_8
    const/16 v3, 0x2000

    :goto_5
    or-int/2addr v0, v3

    :cond_9
    const/high16 v3, 0x30000

    and-int/2addr v3, v9

    const/high16 v11, 0x20000

    if-nez v3, :cond_b

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    move v3, v11

    goto :goto_6

    :cond_a
    const/high16 v3, 0x10000

    :goto_6
    or-int/2addr v0, v3

    :cond_b
    const/high16 v3, 0x180000

    and-int/2addr v3, v9

    const/high16 v12, 0x100000

    if-nez v3, :cond_d

    invoke-virtual {v14, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    move v3, v12

    goto :goto_7

    :cond_c
    const/high16 v3, 0x80000

    :goto_7
    or-int/2addr v0, v3

    :cond_d
    const v3, 0x92493

    and-int/2addr v3, v0

    const v13, 0x92492

    const/16 v17, 0x0

    const/16 v18, 0x1

    if-eq v3, v13, :cond_e

    move/from16 v3, v18

    goto :goto_8

    :cond_e
    move/from16 v3, v17

    :goto_8
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v14, v13, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_14

    move v3, v11

    invoke-virtual {v1}, Lg22/d;->n()Lec3/t1;

    move-result-object v11

    move v13, v12

    sget-object v12, Lg22/b$b;->a:Lg22/b$b;

    const/16 v15, 0x30

    const/16 v16, 0x2

    move/from16 v19, v13

    const/4 v13, 0x0

    move v6, v3

    move/from16 v3, v19

    invoke-static/range {v11 .. v16}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v11

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    const/high16 v15, 0x70000

    and-int/2addr v15, v0

    if-ne v15, v6, :cond_f

    move/from16 v6, v18

    goto :goto_9

    :cond_f
    move/from16 v6, v17

    :goto_9
    or-int/2addr v6, v13

    const/high16 v13, 0x380000

    and-int/2addr v13, v0

    if-ne v13, v3, :cond_10

    move/from16 v3, v18

    goto :goto_a

    :cond_10
    move/from16 v3, v17

    :goto_a
    or-int/2addr v3, v6

    invoke-virtual {v14, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    and-int/lit16 v6, v0, 0x1c00

    const/16 v13, 0x800

    if-ne v6, v13, :cond_11

    move/from16 v17, v18

    :cond_11
    or-int v3, v3, v17

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_12

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v6, v3, :cond_13

    :cond_12
    move v3, v0

    goto :goto_b

    :cond_13
    move v11, v0

    goto :goto_c

    :goto_b
    new-instance v0, Lam2/b;

    const/4 v7, 0x6

    move-object v6, v5

    move-object v5, v4

    move-object v4, v6

    move-object v6, v11

    move v11, v3

    move-object/from16 v3, p6

    invoke-direct/range {v0 .. v7}, Lam2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v0

    :goto_c
    move-object v3, v6

    check-cast v3, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v0, v11, 0x3

    and-int/lit8 v5, v0, 0xe

    const/4 v2, 0x0

    move-object v0, v8

    move-object v1, v12

    move-object v4, v14

    invoke-static/range {v0 .. v5}, Lhg3/i;->e(Leb/u0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_d

    :cond_14
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_15

    new-instance v0, Lb30/u2;

    const/4 v9, 0x4

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p8

    move-object v3, v10

    invoke-direct/range {v0 .. v9}, Lb30/u2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final p(Lp1/t2;)Lg22/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lg22/b;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg22/b;

    return-object p0
.end method

.method private static final q(Lg22/d;Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/o1;Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/s0;)Ll83/a0;
    .locals 9

    const-string v0, "$this$NavHost"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lat2/y;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v7}, Lat2/y;-><init>(Lg22/d;Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/o1;Lkotlin/jvm/functions/Function1;Lp1/t2;)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const p2, -0x367c8fbc    # -1076744.5f

    invoke-direct {p0, v1, p1, p2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const-string p2, "PAIRING_FLOW_MEMBERSHIP_ADJUSTMENT"

    const/4 p3, 0x0

    const/4 p4, 0x6

    invoke-static {p6, p2, p3, p0, p4}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    move-object v5, v4

    move-object v4, v3

    move-object v3, v2

    new-instance v2, La81/n;

    const/4 v8, 0x4

    invoke-direct/range {v2 .. v8}, La81/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance p0, Lx1/b;

    const p2, -0x7bbea553

    invoke-direct {p0, v2, p1, p2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const-string p1, "PAIRING_FIRST_FLOW_MEMBERSHIP_ADJUSTMENT"

    invoke-static {p6, p1, p3, p0, p4}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lg22/d;Ljava/lang/String;Ljava/lang/String;Landroidx/fragment/app/o1;Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const-string v5, "it"

    move-object/from16 v6, p6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p7

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_0

    if-ne v6, v7, :cond_1

    :cond_0
    new-instance v6, Lf22/c$a;

    const/4 v5, 0x0

    invoke-direct {v6, v0, v1, v2, v5}, Lf22/c$a;-><init>(Lg22/d;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v6, Lc93/m;

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    invoke-static {v13, v6, v5}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {p5 .. p5}, Lf22/c;->p(Lp1/t2;)Lg22/b;

    move-result-object v6

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_2

    if-ne v9, v7, :cond_3

    :cond_2
    new-instance v9, Lf22/b;

    const/4 v8, 0x1

    invoke-direct {v9, v0, v1, v8}, Lf22/b;-><init>(Lg22/d;Ljava/lang/String;I)V

    invoke-virtual {v13, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v8, v9

    check-cast v8, Lc93/m;

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_4

    if-ne v10, v7, :cond_5

    :cond_4
    new-instance v10, Lf1/w1;

    const/4 v9, 0x2

    invoke-direct {v10, v9, v3, v4}, Lf1/w1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v9, v10

    check-cast v9, Lc93/a;

    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v3, :cond_6

    if-ne v10, v7, :cond_7

    :cond_6
    new-instance v10, Leo2/j;

    const/16 v3, 0x19

    invoke-direct {v10, v4, v3}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v10, Lc93/a;

    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v3, :cond_8

    if-ne v11, v7, :cond_9

    :cond_8
    new-instance v11, Leo2/j;

    const/16 v3, 0x1a

    invoke-direct {v11, v4, v3}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v11, Lc93/a;

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_a

    if-ne v4, v7, :cond_b

    :cond_a
    new-instance v4, Lf22/a;

    const/4 v3, 0x0

    invoke-direct {v4, v0, v1, v2, v3}, Lf22/a;-><init>(Lg22/d;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v12, v4

    check-cast v12, Lc93/a;

    const/4 v14, 0x0

    const/4 v15, 0x2

    const/4 v7, 0x0

    invoke-static/range {v6 .. v15}, Li22/c;->E(Lg22/b;ZLc93/m;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    return-object v5
.end method

.method private static final s(Lg22/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ll83/a0;
    .locals 1

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg22/c$a;

    invoke-direct {v0, p2, p3, p1}, Lg22/c$a;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lg22/d;->o(Lg22/c;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Landroidx/fragment/app/o1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "membership_adjustment_fragment_cancel_result"

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/o1;->f0(Landroid/os/Bundle;Ljava/lang/String;)V

    new-instance p0, Lf22/d$b;

    sget-object v0, Lc22/b;->PAIRING_FLOW:Lc22/b;

    invoke-direct {p0, v0}, Lf22/d$b;-><init>(Lc22/b;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lf22/d$a;->a:Lf22/d$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lf22/d$c;->a:Lf22/d$c;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lg22/d;Ljava/lang/String;Ljava/lang/String;)Ll83/a0;
    .locals 1

    new-instance v0, Lg22/c$b;

    invoke-direct {v0, p1, p2}, Lg22/c$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lg22/d;->o(Lg22/c;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lg22/d;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    move-object v0, p3

    const-string v1, "it"

    move-object/from16 v2, p5

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p6

    check-cast v9, Lp1/q;

    invoke-virtual {v9, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v9, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v9, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_0

    if-ne v2, v3, :cond_1

    :cond_0
    new-instance v2, Lf22/c$b;

    const/4 v1, 0x0

    invoke-direct {v2, p0, p1, p2, v1}, Lf22/c$b;-><init>(Lg22/d;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v2, Lc93/m;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-static {v9, v2, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {p4 .. p4}, Lf22/c;->p(Lp1/t2;)Lg22/b;

    move-result-object v2

    invoke-virtual {v9, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v9, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_2

    if-ne v5, v3, :cond_3

    :cond_2
    new-instance v5, Lf22/b;

    const/4 v4, 0x0

    invoke-direct {v5, p0, p1, v4}, Lf22/b;-><init>(Lg22/d;Ljava/lang/String;I)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v4, v5

    check-cast v4, Lc93/m;

    invoke-virtual {v9, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_4

    if-ne v6, v3, :cond_5

    :cond_4
    new-instance v6, Leo2/j;

    const/16 v5, 0x1b

    invoke-direct {v6, p3, v5}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v5, v6

    check-cast v5, Lc93/a;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_6

    new-instance v6, Lf1/z1;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Lf1/z1;-><init>(I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v6, Lc93/a;

    invoke-virtual {v9, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_7

    if-ne v8, v3, :cond_8

    :cond_7
    new-instance v8, Leo2/j;

    const/16 v7, 0x1c

    invoke-direct {v8, p3, v7}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v7, v8

    check-cast v7, Lc93/a;

    invoke-virtual {v9, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v0, v8

    invoke-virtual {v9, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v0, v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v0, :cond_9

    if-ne v8, v3, :cond_a

    :cond_9
    new-instance v8, Lf22/a;

    const/4 v0, 0x1

    invoke-direct {v8, p0, p1, p2, v0}, Lf22/a;-><init>(Lg22/d;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v8, Lc93/a;

    const/16 v10, 0x6030

    const/4 v11, 0x0

    const/4 v3, 0x0

    invoke-static/range {v2 .. v11}, Li22/c;->E(Lg22/b;ZLc93/m;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    return-object v1
.end method

.method private static final y(Lg22/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ll83/a0;
    .locals 1

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lg22/c$a;

    invoke-direct {v0, p2, p3, p1}, Lg22/c$a;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lg22/d;->o(Lg22/c;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    new-instance v0, Lf22/d$b;

    sget-object v1, Lc22/b;->PAIRING_FIRST_FLOW:Lc22/b;

    invoke-direct {v0, v1}, Lf22/d$b;-><init>(Lc22/b;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
