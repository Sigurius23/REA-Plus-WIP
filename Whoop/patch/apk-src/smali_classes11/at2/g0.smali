.class public abstract Lat2/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a-\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\u0007\u001a-\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\t\u0010\u0007\u001a=\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lys2/e$k;",
        "viewState",
        "Lkotlin/Function1;",
        "Lws2/i;",
        "Ll83/a0;",
        "onViewEvent",
        "r",
        "(Lys2/e$k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "o",
        "u",
        "Lbu2/c0;",
        "toolTipType",
        "Ly81/f;",
        "sliderColor",
        "x",
        "(Lys2/e$k;Lbu2/c0;Ly81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method private static final A(Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$clearAndSetSemantics"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "SetUpTimeGoal_Body_Slider"

    invoke-static {v0, p0}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;Lys2/e$k;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lbu2/o$a;

    if-eqz v0, :cond_0

    check-cast p2, Lbu2/o$a;

    invoke-virtual {p2}, Lbu2/o$a;->a()F

    move-result p2

    float-to-double v0, p2

    invoke-virtual {p1}, Lys2/e$k;->g()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object p1

    new-instance p2, Lws2/i$m;

    invoke-direct {p2, p1, v0, v1}, Lws2/i$m;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;D)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lkotlin/jvm/functions/Function1;Lys2/e$k;)Ll83/a0;
    .locals 9

    new-instance v0, Lws2/i$i;

    invoke-virtual {p1}, Lys2/e$k;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lys2/e$k;->g()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v2

    invoke-virtual {p1}, Lys2/e$k;->f()D

    move-result-wide v3

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lws2/i$i;-><init>(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;DZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lkotlin/jvm/functions/Function1;Lys2/e$k;Ljava/lang/Object;)Ll83/a0;
    .locals 7

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lws2/i$c;

    invoke-virtual {p1}, Lys2/e$k;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lys2/e$k;->g()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lws2/i$c;-><init>(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lkotlin/jvm/functions/Function1;Lys2/e$k;)Ll83/a0;
    .locals 4

    new-instance v0, Lws2/i$a;

    invoke-virtual {p1}, Lys2/e$k;->e()Lws2/g;

    move-result-object p1

    invoke-virtual {p1}, Lws2/g;->a()I

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p1, v1, v2, v3}, Lws2/i$a;-><init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lys2/e$k;Lbu2/c0;Ly81/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lat2/g0;->x(Lys2/e$k;Lbu2/c0;Ly81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lws2/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lat2/g0;->y(Lws2/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lys2/e$k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lat2/g0;->w(Lys2/e$k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lws2/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lat2/g0;->s(Lws2/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lws2/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lat2/g0;->p(Lws2/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lys2/e$k;Lbu2/c0;Ly81/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lat2/g0;->F(Lys2/e$k;Lbu2/c0;Ly81/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lys2/e$k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lat2/g0;->q(Lys2/e$k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Lys2/e$k;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lat2/g0;->B(Lkotlin/jvm/functions/Function1;Lys2/e$k;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lws2/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lat2/g0;->v(Lws2/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lat2/g0;->A(Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lys2/e$k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lat2/g0;->t(Lys2/e$k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Lys2/e$k;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lat2/g0;->C(Lkotlin/jvm/functions/Function1;Lys2/e$k;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Lys2/e$k;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lat2/g0;->E(Lkotlin/jvm/functions/Function1;Lys2/e$k;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Lys2/e$k;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lat2/g0;->z(Lkotlin/jvm/functions/Function1;Lys2/e$k;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Lys2/e$k;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lat2/g0;->D(Lkotlin/jvm/functions/Function1;Lys2/e$k;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Lys2/e$k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lys2/e$k;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v1, "viewState"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lp1/q;

    const v1, 0x45ec8f43

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    :cond_4
    :goto_3
    and-int/lit8 v5, v1, 0x13

    const/16 v6, 0x12

    if-eq v5, v6, :cond_5

    const/4 v5, 0x1

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    :goto_4
    and-int/lit8 v6, v1, 0x1

    invoke-virtual {v4, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_8

    if-eqz v2, :cond_7

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_6

    new-instance v2, Laq0/p;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, Laq0/p;-><init>(I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v3, v2

    :goto_5
    move v2, v1

    goto :goto_6

    :cond_7
    move-object v3, p1

    goto :goto_5

    :goto_6
    sget-object v1, Lbu2/c0;->WEIGHT:Lbu2/c0;

    move v5, v2

    sget-object v2, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    and-int/lit8 v6, v5, 0xe

    or-int/lit16 v6, v6, 0x1b0

    shl-int/lit8 v5, v5, 0x6

    and-int/lit16 v5, v5, 0x1c00

    or-int/2addr v5, v6

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lat2/g0;->x(Lys2/e$k;Lbu2/c0;Ly81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v3

    goto :goto_7

    :cond_8
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v2, p1

    :goto_7
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_9

    new-instance v0, Lat2/f0;

    const/4 v5, 0x2

    move-object v1, p0

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lat2/f0;-><init>(Lys2/e$k;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final p(Lws2/i;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lys2/e$k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lat2/g0;->o(Lys2/e$k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final r(Lys2/e$k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lys2/e$k;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v1, "viewState"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lp1/q;

    const v1, 0x1cc4c9f9

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    :cond_4
    :goto_3
    and-int/lit8 v5, v1, 0x13

    const/16 v6, 0x12

    if-eq v5, v6, :cond_5

    const/4 v5, 0x1

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    :goto_4
    and-int/lit8 v6, v1, 0x1

    invoke-virtual {v4, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_8

    if-eqz v2, :cond_7

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_6

    new-instance v2, Laq0/p;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Laq0/p;-><init>(I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v3, v2

    :goto_5
    move v2, v1

    goto :goto_6

    :cond_7
    move-object v3, p1

    goto :goto_5

    :goto_6
    sget-object v1, Lbu2/c0;->STRAIN:Lbu2/c0;

    move v5, v2

    sget-object v2, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    and-int/lit8 v6, v5, 0xe

    or-int/lit16 v6, v6, 0x1b0

    shl-int/lit8 v5, v5, 0x6

    and-int/lit16 v5, v5, 0x1c00

    or-int/2addr v5, v6

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lat2/g0;->x(Lys2/e$k;Lbu2/c0;Ly81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v3

    goto :goto_7

    :cond_8
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v2, p1

    :goto_7
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_9

    new-instance v0, Lat2/f0;

    const/4 v5, 0x0

    move-object v1, p0

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lat2/f0;-><init>(Lys2/e$k;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final s(Lws2/i;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lys2/e$k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lat2/g0;->r(Lys2/e$k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final u(Lys2/e$k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lys2/e$k;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v1, "viewState"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lp1/q;

    const v1, 0x4426a3ef

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    :cond_4
    :goto_3
    and-int/lit8 v5, v1, 0x13

    const/16 v6, 0x12

    if-eq v5, v6, :cond_5

    const/4 v5, 0x1

    goto :goto_4

    :cond_5
    const/4 v5, 0x0

    :goto_4
    and-int/lit8 v6, v1, 0x1

    invoke-virtual {v4, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_8

    if-eqz v2, :cond_7

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_6

    new-instance v2, Laq0/p;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Laq0/p;-><init>(I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v3, v2

    :goto_5
    move v2, v1

    goto :goto_6

    :cond_7
    move-object v3, p1

    goto :goto_5

    :goto_6
    sget-object v1, Lbu2/c0;->STRAIN:Lbu2/c0;

    move v5, v2

    sget-object v2, Ly81/f;->STRAIN:Ly81/f;

    and-int/lit8 v6, v5, 0xe

    or-int/lit16 v6, v6, 0x1b0

    shl-int/lit8 v5, v5, 0x6

    and-int/lit16 v5, v5, 0x1c00

    or-int/2addr v5, v6

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v6}, Lat2/g0;->x(Lys2/e$k;Lbu2/c0;Ly81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v3

    goto :goto_7

    :cond_8
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v2, p1

    :goto_7
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_9

    new-instance v0, Lat2/f0;

    const/4 v5, 0x1

    move-object v1, p0

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lat2/f0;-><init>(Lys2/e$k;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final v(Lws2/i;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lys2/e$k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lat2/g0;->u(Lys2/e$k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final x(Lys2/e$k;Lbu2/c0;Ly81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 48
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lys2/e$k;",
            "Lbu2/c0;",
            "Ly81/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "toolTipType"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sliderColor"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, 0x6e63774c

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    invoke-virtual {v9, v6}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    invoke-virtual {v9, v6}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :cond_5
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_7

    or-int/lit16 v0, v0, 0xc00

    :cond_6
    move-object/from16 v7, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_6

    move-object/from16 v7, p3

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x800

    goto :goto_4

    :cond_8
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v0, v8

    :goto_5
    and-int/lit16 v8, v0, 0x493

    const/16 v10, 0x492

    const/4 v11, 0x0

    if-eq v8, v10, :cond_9

    const/4 v8, 0x1

    goto :goto_6

    :cond_9
    move v8, v11

    :goto_6
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v9, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_2a

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v8, :cond_a

    new-instance v6, Laq0/p;

    const/16 v7, 0xf

    invoke-direct {v6, v7}, Laq0/p;-><init>(I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object v6, v7

    :goto_7
    sget-object v7, Lb2/t;->w:Lb2/t;

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v7, v10}, Lvl/b;->c(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, Lb2/e;->w:Lb2/m;

    invoke-static {v14, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v14

    iget-wide v4, v9, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v9, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-eqz v12, :cond_c

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_8
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v9, v12, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v9, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-nez v11, :cond_d

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v11, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_e

    :cond_d
    invoke-static {v4, v9, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v9, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v11}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v13, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    const/4 v2, 0x0

    invoke-static {v13, v10, v9, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    move-object v2, v6

    move-object/from16 v19, v7

    iget-wide v6, v9, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v9}, Lp1/q;->i0()V

    move-object/from16 v20, v2

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-eqz v2, :cond_f

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v9, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    :cond_10
    invoke-static {v6, v9, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    invoke-static {v9, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v21, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v1}, Lys2/e$k;->b()Lys2/f;

    move-result-object v2

    invoke-virtual {v2}, Lys2/f;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v22

    invoke-virtual {v1}, Lys2/e$k;->b()Lys2/f;

    move-result-object v2

    invoke-virtual {v2}, Lys2/f;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_12

    new-instance v2, Lo81/a;

    invoke-virtual {v1}, Lys2/e$k;->b()Lys2/f;

    move-result-object v6

    invoke-virtual {v6}, Lys2/f;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v11, 0x2

    invoke-direct {v2, v6, v7, v11, v3}, Lo81/a;-><init>(Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v23, v2

    goto :goto_a

    :cond_12
    const/4 v7, 0x0

    move-object/from16 v23, v3

    :goto_a
    new-instance v2, Ly71/g;

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-static {v3}, Lih0/d0;->C(Lx81/d;)I

    move-result v6

    sget v11, Luv0/c;->E:I

    invoke-static {v9, v11}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-direct {v2, v6, v11}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    const/16 v37, 0x7ff8

    const/16 v38, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

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

    move-object/from16 v24, v2

    invoke-direct/range {v21 .. v38}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v0, v0, 0x1c00

    const/16 v2, 0x800

    if-ne v0, v2, :cond_13

    const/4 v6, 0x1

    goto :goto_b

    :cond_13
    move v6, v7

    :goto_b
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v6, v11

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_15

    if-ne v11, v8, :cond_14

    goto :goto_c

    :cond_14
    move-object/from16 v2, v20

    goto :goto_d

    :cond_15
    :goto_c
    new-instance v11, Lat2/d0;

    const/4 v6, 0x2

    move-object/from16 v2, v20

    invoke-direct {v11, v2, v1, v6}, Lat2/d0;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$k;I)V

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_d
    check-cast v11, Lc93/a;

    sget v6, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v6, v6, 0x3

    move-object/from16 v18, v14

    const/16 v14, 0x35

    move-object/from16 v20, v13

    move v13, v6

    const/4 v6, 0x0

    move-object/from16 v22, v8

    const/4 v8, 0x0

    move-object/from16 v23, v10

    const/4 v10, 0x0

    move-object/from16 v28, v9

    move-object v9, v11

    const/4 v11, 0x0

    move/from16 v32, v0

    move-object/from16 v39, v2

    move-object/from16 p3, v3

    move-object/from16 v33, v4

    move-object/from16 v34, v5

    move v2, v7

    move-object v1, v12

    move-object/from16 v35, v18

    move-object/from16 v0, v19

    move-object/from16 v3, v20

    move-object/from16 v7, v21

    move-object/from16 v40, v22

    move-object/from16 v4, v23

    move-object/from16 v12, v28

    const/4 v5, 0x1

    invoke-static/range {v6 .. v14}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v12

    invoke-static {v2, v9, v5}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v6

    const/16 v7, 0xe

    invoke-static {v0, v6, v7}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-wide/high16 v7, 0x4004000000000000L    # 2.5

    double-to-float v7, v7

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v7, v8

    const/4 v10, 0x0

    const/4 v11, 0x2

    invoke-static {v6, v7, v10, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v3, v4, v9, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_16

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_16
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v9, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v35

    invoke-static {v9, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_17

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_18

    :cond_17
    move-object/from16 v10, v34

    goto :goto_10

    :cond_18
    move-object/from16 v10, v34

    :goto_f
    move-object/from16 v4, v33

    goto :goto_11

    :goto_10
    invoke-static {v4, v9, v4, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_f

    :goto_11
    invoke-static {v9, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v11, 0x2

    int-to-float v6, v11

    mul-float/2addr v6, v8

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v9, v11}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lys2/e$k;->b()Lys2/f;

    move-result-object v11

    invoke-virtual {v11}, Lys2/f;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    sget v12, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v11, v9, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    sget v13, Lx81/d;->b:I

    move-object/from16 v14, p3

    invoke-virtual {v14, v9, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ly81/i;->y()J

    move-result-wide v17

    invoke-virtual {v14, v9, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lb91/d;->P()Lb91/a;

    move-result-object v26

    sget v19, Lb91/a;->d:I

    shl-int/lit8 v30, v19, 0x12

    const v31, 0x2fffa

    move/from16 v19, v7

    const/4 v7, 0x0

    move/from16 v20, v6

    move-object/from16 v34, v10

    move-object v6, v11

    const-wide/16 v10, 0x0

    move/from16 v21, v12

    const/4 v12, 0x0

    move/from16 v22, v13

    const/4 v13, 0x0

    move-object/from16 v23, v14

    const/4 v14, 0x0

    move-object/from16 v24, v15

    const/16 v25, 0x800

    const-wide/16 v15, 0x0

    move-object/from16 v28, v9

    move-wide/from16 v46, v17

    move/from16 v18, v8

    move-wide/from16 v8, v46

    const/16 v17, 0x0

    move/from16 v27, v18

    const/16 v18, 0x0

    move/from16 v29, v19

    move/from16 v33, v20

    const-wide/16 v19, 0x0

    move/from16 v35, v21

    const/16 v21, 0x0

    move/from16 v36, v22

    const/16 v22, 0x0

    move-object/from16 v37, v23

    const/16 v23, 0x0

    move-object/from16 v38, v24

    const/16 v24, 0x0

    move/from16 v41, v25

    const/16 v25, 0x0

    move/from16 v42, v27

    const/16 v27, 0x0

    move/from16 v43, v29

    const/16 v29, 0x0

    move/from16 v2, v35

    move/from16 v44, v43

    move-object/from16 v35, v3

    move/from16 v3, v36

    move-object/from16 v36, v1

    move/from16 v1, v33

    move-object/from16 v33, v4

    move-object/from16 v4, v37

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    int-to-float v6, v5

    mul-float v6, v6, v42

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v9, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lys2/e$k;->b()Lys2/f;

    move-result-object v6

    invoke-virtual {v6}, Lys2/f;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6, v9, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v7

    invoke-virtual {v4, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    move-wide v8, v7

    const/4 v7, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v28

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v3, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lys2/e$k;->c()Lbu2/d;

    move-result-object v6

    const/16 v24, 0x4fff

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    move-object/from16 v23, p2

    move-object/from16 v20, p1

    move-object/from16 v21, p2

    invoke-static/range {v6 .. v25}, Lbu2/d;->b(Lbu2/d;FFFDLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lbu2/k;Lbu2/h;Ljava/util/List;Lbu2/c0;Ly81/e;Ljava/lang/Double;Ly81/e;ILjava/lang/Object;)Lbu2/d;

    move-result-object v6

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v4, v40

    if-ne v1, v4, :cond_19

    new-instance v1, Laq0/p;

    const/16 v7, 0x10

    invoke-direct {v1, v7}, Laq0/p;-><init>(I)V

    invoke-virtual {v3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Li3/n;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move/from16 v1, v32

    const/16 v12, 0x800

    if-ne v1, v12, :cond_1a

    move v11, v5

    :goto_12
    move-object/from16 v13, p0

    goto :goto_13

    :cond_1a
    const/4 v11, 0x0

    goto :goto_12

    :goto_13
    invoke-virtual {v3, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v8, v11

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_1c

    if-ne v9, v4, :cond_1b

    goto :goto_14

    :cond_1b
    move-object/from16 v14, v39

    goto :goto_15

    :cond_1c
    :goto_14
    new-instance v9, Lat2/e0;

    const/4 v8, 0x1

    move-object/from16 v14, v39

    invoke-direct {v9, v14, v13, v8}, Lat2/e0;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$k;I)V

    invoke-virtual {v3, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_15
    move-object v8, v9

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v9, v3

    invoke-static/range {v6 .. v11}, Lbu2/g;->f(Lbu2/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v13}, Lys2/e$k;->a()Lys2/b;

    move-result-object v7

    invoke-virtual {v7}, Lys2/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    if-ne v1, v12, :cond_1d

    move v11, v5

    goto :goto_16

    :cond_1d
    const/4 v11, 0x0

    :goto_16
    invoke-virtual {v9, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v8, v11

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_1e

    if-ne v10, v4, :cond_1f

    :cond_1e
    new-instance v10, Lat2/d0;

    const/4 v8, 0x0

    invoke-direct {v10, v14, v13, v8}, Lat2/d0;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$k;I)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    move-object/from16 v19, v10

    check-cast v19, Lc93/a;

    shl-int/lit8 v8, v2, 0x12

    const/4 v10, 0x6

    or-int/lit8 v21, v8, 0x6

    const/16 v22, 0x0

    const/16 v23, 0x1fbe

    move/from16 v16, v12

    move-object v12, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v28, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v15, v11

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v25, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v24, v18

    const/16 v18, 0x0

    move-object/from16 v5, p0

    move-object/from16 v45, v20

    move-object/from16 v20, v28

    invoke-static/range {v6 .. v23}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v20

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v6

    move/from16 v7, v42

    invoke-static {v6, v7, v0, v9}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Ll0/m;->f:Ll0/h;

    sget-object v7, Lb2/e;->J:Lb2/l;

    const/4 v11, 0x6

    invoke-static {v6, v7, v9, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-eqz v10, :cond_20

    move-object/from16 v10, v38

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    :goto_17
    move-object/from16 v10, v36

    goto :goto_18

    :cond_20
    invoke-virtual {v9}, Lp1/q;->s0()V

    goto :goto_17

    :goto_18
    invoke-static {v9, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v6, v35

    invoke-static {v9, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-nez v6, :cond_21

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_22

    :cond_21
    move-object/from16 v10, v34

    goto :goto_1a

    :cond_22
    :goto_19
    move-object/from16 v6, v33

    goto :goto_1b

    :goto_1a
    invoke-static {v7, v9, v7, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_19

    :goto_1b
    invoke-static {v9, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lys2/e$k;->a()Lys2/b;

    move-result-object v3

    invoke-virtual {v3}, Lys2/b;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    if-nez v8, :cond_23

    const v2, 0x1155ae80

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    move-object/from16 v2, v45

    const/16 v3, 0x800

    :goto_1c
    move/from16 v7, v44

    const/4 v6, 0x1

    goto :goto_20

    :cond_23
    const v3, 0x1155ae81

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    const/16 v3, 0x800

    if-ne v1, v3, :cond_24

    const/4 v6, 0x1

    goto :goto_1d

    :cond_24
    const/4 v6, 0x0

    :goto_1d
    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_26

    if-ne v7, v4, :cond_25

    goto :goto_1e

    :cond_25
    move-object/from16 v10, v45

    goto :goto_1f

    :cond_26
    :goto_1e
    new-instance v7, Lat2/e0;

    const/4 v6, 0x0

    move-object/from16 v10, v45

    invoke-direct {v7, v10, v5, v6}, Lat2/e0;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$k;I)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1f
    move-object/from16 v18, v7

    check-cast v18, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v20, v2, 0x6

    const/16 v21, 0x0

    const/16 v22, 0xffb

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v28, v9

    const/4 v9, 0x0

    move-object v2, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v28

    invoke-static/range {v6 .. v22}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v19

    const/4 v7, 0x0

    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    goto :goto_1c

    :goto_20
    invoke-static {v9, v6, v0, v7, v9}, Lhc3/i;->r(Lp1/q;ZLb2/t;FLp1/q;)V

    invoke-static {v9, v6, v6, v6}, Lm4/a;->y(Lp1/q;ZZZ)V

    if-ne v1, v3, :cond_27

    const/4 v11, 0x1

    goto :goto_21

    :cond_27
    const/4 v11, 0x0

    :goto_21
    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v11

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_28

    if-ne v1, v4, :cond_29

    :cond_28
    new-instance v1, Lat2/d0;

    const/4 v0, 0x1

    invoke-direct {v1, v2, v5, v0}, Lat2/d0;-><init>(Lkotlin/jvm/functions/Function1;Lys2/e$k;I)V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    check-cast v1, Lc93/a;

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v1, v7, v9, v7, v6}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object v4, v2

    goto :goto_22

    :cond_2a
    move-object v5, v1

    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v4, v7

    :goto_22
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_2b

    new-instance v0, La81/f;

    const/4 v7, 0x4

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v6, p6

    move-object v1, v5

    move/from16 v5, p5

    invoke-direct/range {v0 .. v7}, La81/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_2b
    return-void
.end method

.method private static final y(Lws2/i;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;Lys2/e$k;)Ll83/a0;
    .locals 4

    new-instance v0, Lws2/i$a;

    invoke-virtual {p1}, Lys2/e$k;->e()Lws2/g;

    move-result-object p1

    invoke-virtual {p1}, Lws2/g;->a()I

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, p1, v1, v2, v3}, Lws2/i$a;-><init>(ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
