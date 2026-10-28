.class public abstract Lmt2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aa\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a)\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00082\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lnt2/c;",
        "viewModel",
        "Lot2/m;",
        "viewState",
        "Leb/u0;",
        "navController",
        "Lmt2/f;",
        "navigationRouter",
        "",
        "showMetricSelection",
        "Lcom/whoop/weeklyplan/hubandspoke/navigation/HubAndSpokeNavDestination;",
        "startDestination",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onExit",
        "onSave",
        "t",
        "(Lnt2/c;Lot2/m;Leb/u0;Lmt2/f;ZLcom/whoop/weeklyplan/hubandspoke/navigation/HubAndSpokeNavDestination;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Lmt2/g;",
        "navigationEvent",
        "isCustomized",
        "N",
        "(Lmt2/g;Ljava/lang/Boolean;Z)Z",
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
.method private static final A(Lot2/m;Lnt2/c;ZLc93/a;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    const-string p7, "it"

    invoke-static {p5, p7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p6, Lp1/q;

    invoke-virtual {p6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p5

    invoke-virtual {p6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p7

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez p5, :cond_0

    if-ne p7, v0, :cond_1

    :cond_0
    new-instance p7, Lmt2/a;

    const/4 p5, 0x2

    invoke-direct {p7, p1, p5}, Lmt2/a;-><init>(Lnt2/c;I)V

    invoke-virtual {p6, p7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p7, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p6, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {p6, p2}, Lp1/q;->h(Z)Z

    move-result p5

    or-int/2addr p1, p5

    invoke-virtual {p6, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p5

    or-int/2addr p1, p5

    invoke-virtual {p6, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p5

    or-int/2addr p1, p5

    invoke-virtual {p6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    if-nez p1, :cond_3

    if-ne p5, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object v2, p0

    goto :goto_1

    :cond_3
    :goto_0
    new-instance v1, Lch0/e;

    const/16 v6, 0xa

    move-object v2, p0

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Lch0/e;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p6, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p5, v1

    :goto_1
    check-cast p5, Lkotlin/jvm/functions/Function1;

    const/4 p0, 0x0

    invoke-static {v2, p7, p5, p6, p0}, Lpt2/y;->t(Lot2/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lnt2/c;Lnt2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lnt2/c;->n(Lnt2/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lot2/m;ZLc93/a;Lmt2/f;Lmt2/g;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lot2/m$i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lot2/m$i;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lot2/m$i;->c()Lot2/p;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lot2/p;->w()Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :cond_1
    invoke-static {p4, v1, p1}, Lmt2/e;->N(Lmt2/g;Ljava/lang/Boolean;Z)Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {p3, p4}, Lmt2/f;->a(Ljava/lang/Object;)V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lot2/m;Lnt2/c;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    const-string p5, "it"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p4

    check-cast v3, Lp1/q;

    invoke-virtual {v3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    sget-object p5, Lp1/l;->a:Lp1/v0;

    if-nez p3, :cond_0

    if-ne p4, p5, :cond_1

    :cond_0
    new-instance p4, Lmt2/a;

    const/4 p3, 0x3

    invoke-direct {p4, p1, p3}, Lmt2/a;-><init>(Lnt2/c;I)V

    invoke-virtual {v3, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v1, p4

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p1, :cond_2

    if-ne p3, p5, :cond_3

    :cond_2
    new-instance p3, Lmt2/b;

    const/4 p1, 0x2

    invoke-direct {p3, p2, p1}, Lmt2/b;-><init>(Lmt2/f;I)V

    invoke-virtual {v3, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v2, p3

    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lpt2/a0;->i(Lot2/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lnt2/c;Lnt2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lnt2/c;->n(Lnt2/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lmt2/f;Lmt2/g;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lmt2/f;->a(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lot2/m;Lnt2/c;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    const-string p5, "it"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p4

    check-cast v3, Lp1/q;

    invoke-virtual {v3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    sget-object p5, Lp1/l;->a:Lp1/v0;

    if-nez p3, :cond_0

    if-ne p4, p5, :cond_1

    :cond_0
    new-instance p4, Lmt2/a;

    const/4 p3, 0x0

    invoke-direct {p4, p1, p3}, Lmt2/a;-><init>(Lnt2/c;I)V

    invoke-virtual {v3, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v1, p4

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p1, :cond_2

    if-ne p3, p5, :cond_3

    :cond_2
    new-instance p3, Lmt2/b;

    const/4 p1, 0x0

    invoke-direct {p3, p2, p1}, Lmt2/b;-><init>(Lmt2/f;I)V

    invoke-virtual {v3, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v2, p3

    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lpt2/i;->B(Lot2/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lnt2/c;Lnt2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lnt2/c;->n(Lnt2/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lmt2/f;Lmt2/g;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lmt2/f;->a(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lot2/m;Lnt2/c;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    const-string p5, "it"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p4

    check-cast v3, Lp1/q;

    invoke-virtual {v3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    sget-object p5, Lp1/l;->a:Lp1/v0;

    if-nez p3, :cond_0

    if-ne p4, p5, :cond_1

    :cond_0
    new-instance p4, Lmt2/a;

    const/4 p3, 0x1

    invoke-direct {p4, p1, p3}, Lmt2/a;-><init>(Lnt2/c;I)V

    invoke-virtual {v3, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v1, p4

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p1, :cond_2

    if-ne p3, p5, :cond_3

    :cond_2
    new-instance p3, Lmt2/b;

    const/4 p1, 0x1

    invoke-direct {p3, p2, p1}, Lmt2/b;-><init>(Lmt2/f;I)V

    invoke-virtual {v3, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v2, p3

    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lpt2/l;->x(Lot2/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lnt2/c;Lnt2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lnt2/c;->n(Lnt2/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lmt2/f;Lmt2/g;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lmt2/f;->a(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lnt2/c;Lot2/m;Leb/u0;Lmt2/f;ZLcom/whoop/weeklyplan/hubandspoke/navigation/HubAndSpokeNavDestination;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lmt2/e;->t(Lnt2/c;Lot2/m;Leb/u0;Lmt2/f;ZLcom/whoop/weeklyplan/hubandspoke/navigation/HubAndSpokeNavDestination;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lmt2/g;Ljava/lang/Boolean;Z)Z
    .locals 2

    new-instance v0, Lmt2/g$b;

    sget-object v1, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->METRIC:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    invoke-direct {v0, v1}, Lmt2/g$b;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    if-eqz p2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic a(Lot2/m;Lnt2/c;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lmt2/e;->G(Lot2/m;Lnt2/c;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lmt2/e;->v()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lmt2/f;Lmt2/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmt2/e;->I(Lmt2/f;Lmt2/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lot2/m;Lnt2/c;Lc93/a;Lc93/a;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lmt2/e;->x(Lot2/m;Lnt2/c;Lc93/a;Lc93/a;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lmt2/f;Lmt2/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmt2/e;->F(Lmt2/f;Lmt2/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc93/a;Lc93/a;Lmt2/f;Lmt2/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lmt2/e;->z(Lc93/a;Lc93/a;Lmt2/f;Lmt2/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lmt2/f;Lmt2/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmt2/e;->L(Lmt2/f;Lmt2/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lot2/m;Lnt2/c;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lmt2/e;->J(Lot2/m;Lnt2/c;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lnt2/c;Lot2/m;Leb/u0;Lmt2/f;ZLcom/whoop/weeklyplan/hubandspoke/navigation/HubAndSpokeNavDestination;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lmt2/e;->M(Lnt2/c;Lot2/m;Leb/u0;Lmt2/f;ZLcom/whoop/weeklyplan/hubandspoke/navigation/HubAndSpokeNavDestination;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lnt2/c;Lnt2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmt2/e;->y(Lnt2/c;Lnt2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lot2/m;Lnt2/c;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lmt2/e;->D(Lot2/m;Lnt2/c;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lot2/m;Lnt2/c;ZLc93/a;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lmt2/e;->A(Lot2/m;Lnt2/c;ZLc93/a;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lnt2/c;Lnt2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmt2/e;->K(Lnt2/c;Lnt2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lot2/m;Lnt2/c;Lc93/a;Lc93/a;Lmt2/f;ZLeb/s0;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lmt2/e;->w(Lot2/m;Lnt2/c;Lc93/a;Lc93/a;Lmt2/f;ZLeb/s0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o()Ll83/a0;
    .locals 1

    invoke-static {}, Lmt2/e;->u()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic p(Lot2/m;ZLc93/a;Lmt2/f;Lmt2/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lmt2/e;->C(Lot2/m;ZLc93/a;Lmt2/f;Lmt2/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lnt2/c;Lnt2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmt2/e;->B(Lnt2/c;Lnt2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lnt2/c;Lnt2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmt2/e;->E(Lnt2/c;Lnt2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lnt2/c;Lnt2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmt2/e;->H(Lnt2/c;Lnt2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final t(Lnt2/c;Lot2/m;Leb/u0;Lmt2/f;ZLcom/whoop/weeklyplan/hubandspoke/navigation/HubAndSpokeNavDestination;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt2/c;",
            "Lot2/m;",
            "Leb/u0;",
            "Lmt2/f;",
            "Z",
            "Lcom/whoop/weeklyplan/hubandspoke/navigation/HubAndSpokeNavDestination;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v9, p9

    move/from16 v10, p10

    const-string v0, "viewModel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationRouter"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p8

    check-cast v8, Lp1/q;

    const v0, -0x45a433b4

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    const/16 v4, 0x20

    if-nez v3, :cond_3

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v4

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v9, 0x180

    if-nez v3, :cond_5

    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    invoke-virtual {v8, v6}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x4000

    goto :goto_5

    :cond_8
    const/16 v3, 0x2000

    :goto_5
    or-int/2addr v0, v3

    :cond_9
    and-int/lit8 v3, v10, 0x20

    const/high16 v12, 0x30000

    if-eqz v3, :cond_a

    :goto_6
    or-int/2addr v0, v12

    goto :goto_8

    :cond_a
    and-int/2addr v12, v9

    if-nez v12, :cond_d

    if-nez p5, :cond_b

    const/4 v12, -0x1

    goto :goto_7

    :cond_b
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    :goto_7
    invoke-virtual {v8, v12}, Lp1/q;->e(I)Z

    move-result v12

    if-eqz v12, :cond_c

    const/high16 v12, 0x20000

    goto :goto_6

    :cond_c
    const/high16 v12, 0x10000

    goto :goto_6

    :cond_d
    :goto_8
    and-int/lit8 v12, v10, 0x40

    const/high16 v14, 0x180000

    if-eqz v12, :cond_f

    or-int/2addr v0, v14

    :cond_e
    move-object/from16 v14, p6

    goto :goto_a

    :cond_f
    and-int/2addr v14, v9

    if-nez v14, :cond_e

    move-object/from16 v14, p6

    invoke-virtual {v8, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x100000

    goto :goto_9

    :cond_10
    const/high16 v15, 0x80000

    :goto_9
    or-int/2addr v0, v15

    :goto_a
    and-int/lit16 v15, v10, 0x80

    const/high16 v16, 0xc00000

    if-eqz v15, :cond_12

    or-int v0, v0, v16

    move-object/from16 v11, p7

    :cond_11
    :goto_b
    move/from16 v17, v0

    goto :goto_d

    :cond_12
    and-int v16, v9, v16

    move-object/from16 v11, p7

    if-nez v16, :cond_11

    invoke-virtual {v8, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_13

    const/high16 v17, 0x800000

    goto :goto_c

    :cond_13
    const/high16 v17, 0x400000

    :goto_c
    or-int v0, v0, v17

    goto :goto_b

    :goto_d
    const v0, 0x492493

    and-int v0, v17, v0

    const v13, 0x492492

    const/16 v19, 0x0

    const/16 v20, 0x1

    if-eq v0, v13, :cond_14

    move/from16 v0, v20

    goto :goto_e

    :cond_14
    move/from16 v0, v19

    :goto_e
    and-int/lit8 v13, v17, 0x1

    invoke-virtual {v8, v13, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_24

    if-eqz v3, :cond_15

    sget-object v0, Lcom/whoop/weeklyplan/hubandspoke/navigation/HubAndSpokeNavDestination;->MAIN_SCREEN:Lcom/whoop/weeklyplan/hubandspoke/navigation/HubAndSpokeNavDestination;

    move-object v13, v0

    goto :goto_f

    :cond_15
    move-object/from16 v13, p5

    :goto_f
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v12, :cond_17

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_16

    new-instance v3, Lmq2/a;

    const/16 v12, 0x9

    invoke-direct {v3, v12}, Lmq2/a;-><init>(I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v3, Lc93/a;

    goto :goto_10

    :cond_17
    move-object v3, v14

    :goto_10
    if-eqz v15, :cond_19

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v0, :cond_18

    new-instance v11, Lmq2/a;

    const/16 v12, 0xa

    invoke-direct {v11, v12}, Lmq2/a;-><init>(I)V

    invoke-virtual {v8, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v11, Lc93/a;

    :cond_19
    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    and-int/lit8 v14, v17, 0x70

    if-ne v14, v4, :cond_1a

    move/from16 v4, v20

    goto :goto_11

    :cond_1a
    move/from16 v4, v19

    :goto_11
    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v4, v14

    const/high16 v14, 0x380000

    and-int v14, v17, v14

    const/high16 v15, 0x100000

    if-ne v14, v15, :cond_1b

    move/from16 v14, v20

    goto :goto_12

    :cond_1b
    move/from16 v14, v19

    :goto_12
    or-int/2addr v4, v14

    const/high16 v14, 0x1c00000

    and-int v14, v17, v14

    const/high16 v15, 0x800000

    if-ne v14, v15, :cond_1c

    move/from16 v14, v20

    goto :goto_13

    :cond_1c
    move/from16 v14, v19

    :goto_13
    or-int/2addr v4, v14

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v4, v14

    const v14, 0xe000

    and-int v14, v17, v14

    const/16 v15, 0x4000

    if-ne v14, v15, :cond_1d

    move/from16 v15, v20

    goto :goto_14

    :cond_1d
    move/from16 v15, v19

    :goto_14
    or-int/2addr v4, v15

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v4, :cond_1e

    if-ne v15, v0, :cond_1f

    :cond_1e
    move-object v4, v0

    goto :goto_15

    :cond_1f
    move-object/from16 v16, v3

    move-object/from16 v18, v11

    move-object v11, v0

    move-object v0, v15

    move v15, v6

    move-object v6, v5

    goto :goto_16

    :goto_15
    new-instance v0, Lmt2/c;

    move-object/from16 v21, v2

    move-object v2, v1

    move-object/from16 v1, v21

    move-object/from16 v21, v11

    move-object v11, v4

    move-object/from16 v4, v21

    invoke-direct/range {v0 .. v6}, Lmt2/c;-><init>(Lot2/m;Lnt2/c;Lc93/a;Lc93/a;Lmt2/f;Z)V

    move-object/from16 v16, v3

    move-object/from16 v18, v4

    move v15, v6

    move-object v6, v5

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_16
    move-object v3, v0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v0, v17, 0x6

    and-int/lit8 v5, v0, 0xe

    const/4 v2, 0x0

    move-object v0, v7

    move-object v4, v8

    move-object v1, v12

    invoke-static/range {v0 .. v5}, Lhg3/i;->e(Leb/u0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_20

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v0, Lp1/c1;

    const/16 v1, 0x4000

    if-ne v14, v1, :cond_21

    move/from16 v19, v20

    :cond_21
    invoke-virtual {v4, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int v1, v19, v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_22

    if-ne v2, v11, :cond_23

    :cond_22
    new-instance v2, Lmt2/e$a;

    const/4 v1, 0x0

    invoke-direct {v2, v15, v0, v6, v1}, Lmt2/e$a;-><init>(ZLp1/c1;Lmt2/f;Lq83/d;)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    check-cast v2, Lc93/m;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-static {v4, v2, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v7, v16

    move-object/from16 v8, v18

    goto :goto_17

    :cond_24
    move v15, v6

    move-object v4, v8

    move-object v6, v5

    invoke-virtual {v4}, Lp1/q;->X()V

    move-object/from16 v13, p5

    move-object v8, v11

    move-object v7, v14

    :goto_17
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_25

    new-instance v0, Lb30/w1;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object v4, v6

    move-object v6, v13

    move v5, v15

    invoke-direct/range {v0 .. v10}, Lb30/w1;-><init>(Lnt2/c;Lot2/m;Leb/u0;Lmt2/f;ZLcom/whoop/weeklyplan/hubandspoke/navigation/HubAndSpokeNavDestination;Lc93/a;Lc93/a;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_25
    return-void
.end method

.method private static final u()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final v()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final w(Lot2/m;Lnt2/c;Lc93/a;Lc93/a;Lmt2/f;ZLeb/s0;)Ll83/a0;
    .locals 11

    move-object/from16 v7, p6

    const-string v0, "$this$NavHost"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La81/n;

    const/16 v6, 0xb

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, La81/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v1, Lx1/b;

    const/4 v8, 0x1

    const v2, 0xfcbdd27

    invoke-direct {v1, v0, v8, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const-string v0, "MAIN_SCREEN"

    const/4 v9, 0x0

    const/4 v10, 0x6

    invoke-static {v7, v0, v9, v1, v10}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    new-instance v0, Lhh0/d;

    const/4 v1, 0x2

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move/from16 v6, p5

    invoke-direct/range {v0 .. v6}, Lhh0/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    new-instance v3, Lx1/b;

    const v4, 0x6c15b990

    invoke-direct {v3, v0, v8, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const-string v0, "CONTRIBUTOR_SELECTION"

    invoke-static {v7, v0, v9, v3, v10}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    new-instance v0, Lmt2/d;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, p4, v3}, Lmt2/d;-><init>(Lot2/m;Lnt2/c;Lmt2/f;I)V

    new-instance v3, Lx1/b;

    const v4, -0x55263591

    invoke-direct {v3, v0, v8, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const-string v0, "SLIDER_CUSTOMIZATION"

    invoke-static {v7, v0, v9, v3, v10}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    new-instance v0, Lmt2/d;

    const/4 v3, 0x1

    invoke-direct {v0, p0, p1, p4, v3}, Lmt2/d;-><init>(Lot2/m;Lnt2/c;Lmt2/f;I)V

    new-instance v3, Lx1/b;

    const v4, -0x166224b2

    invoke-direct {v3, v0, v8, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const-string v0, "ACTIVITY_SELECTION"

    invoke-static {v7, v0, v9, v3, v10}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    new-instance v0, Lmt2/d;

    const/4 v3, 0x2

    invoke-direct {v0, p0, p1, p4, v3}, Lmt2/d;-><init>(Lot2/m;Lnt2/c;Lmt2/f;I)V

    new-instance v1, Lx1/b;

    const v2, 0x2861ec2d

    invoke-direct {v1, v0, v8, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const-string v0, "BEHAVIOR_SELECTION"

    invoke-static {v7, v0, v9, v1, v10}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final x(Lot2/m;Lnt2/c;Lc93/a;Lc93/a;Lmt2/f;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    const-string p7, "it"

    invoke-static {p5, p7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p6

    check-cast v5, Lp1/q;

    invoke-virtual {v5, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p5

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p6

    sget-object p7, Lp1/l;->a:Lp1/v0;

    if-nez p5, :cond_0

    if-ne p6, p7, :cond_1

    :cond_0
    new-instance p6, Lmt2/a;

    const/4 p5, 0x4

    invoke-direct {p6, p1, p5}, Lmt2/a;-><init>(Lnt2/c;I)V

    invoke-virtual {v5, p6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v3, p6

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v5, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v5, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p5

    or-int/2addr p1, p5

    invoke-virtual {v5, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p5

    or-int/2addr p1, p5

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    if-nez p1, :cond_2

    if-ne p5, p7, :cond_3

    :cond_2
    new-instance p5, Ljs2/h;

    const/16 p1, 0x17

    invoke-direct {p5, p2, p3, p4, p1}, Ljs2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v5, p5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v4, p5

    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Lpt2/v;->Y(Lot2/m;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lnt2/c;Lnt2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lnt2/c;->n(Lnt2/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lc93/a;Lc93/a;Lmt2/f;Lmt2/g;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p3, Lmt2/g$b;

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_1

    :cond_0
    instance-of p0, p3, Lmt2/g$f;

    if-nez p0, :cond_2

    instance-of p0, p3, Lmt2/g$d;

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p2, p3}, Lmt2/f;->a(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
