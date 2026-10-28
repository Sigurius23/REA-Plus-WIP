.class public abstract Lcom/whoop/core/details/view/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aU\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001aS\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000c2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a?\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lhw0/d;",
        "viewState",
        "Lkotlin/Function1;",
        "Lcom/whoop/core/details/view/b;",
        "Ll83/a0;",
        "coreDetailsViewEventListener",
        "Lew0/a;",
        "onNavigationEvent",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "onAnalyticEvent",
        "N",
        "(Lhw0/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lhw0/d$b;",
        "x",
        "(Lhw0/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lhw0/d$c;",
        "onViewEvent",
        "S",
        "(Lhw0/d$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "core-details_release"
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
.method private static final A(Lkotlin/jvm/functions/Function1;I)Ll83/a0;
    .locals 1

    new-instance v0, Lcom/whoop/core/details/view/b$g;

    invoke-direct {v0, p1}, Lcom/whoop/core/details/view/b$g;-><init>(I)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    new-instance v0, Lcom/whoop/core/details/view/b$h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/whoop/core/details/view/b$h;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 4

    const-string v0, "exerciseId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lew0/a$e;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p1, v3, v1, v2}, Lew0/a$e;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lew0/a$b;

    invoke-direct {v0, p1}, Lew0/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lhw0/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lcom/whoop/core/details/view/a;->x(Lhw0/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 4

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Ld61/a$c;

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v0, p2, Ld61/a$b;

    if-eqz v0, :cond_1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_1
    :goto_0
    instance-of p0, p2, Ld61/a;

    if-eqz p0, :cond_6

    check-cast p2, Ld61/a;

    invoke-interface {p2}, Ld61/a;->b()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->Q0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcz0/s;

    const/4 p2, 0x0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcz0/s;->a()Ljava/util/List;

    move-result-object p0

    goto :goto_1

    :cond_2
    move-object p0, p2

    :goto_1
    new-instance v0, Lcom/whoop/core/details/view/b$k;

    const/4 v1, 0x0

    if-eqz p0, :cond_3

    invoke-static {v1, p0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La71/a;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, La71/a;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    goto :goto_2

    :cond_3
    move-object v2, p2

    :goto_2
    if-eqz p0, :cond_4

    invoke-static {v1, p0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La71/a;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, La71/a;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    goto :goto_3

    :cond_4
    move-object v3, p2

    :goto_3
    if-eqz p0, :cond_5

    invoke-static {v1, p0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La71/a;

    if-eqz p0, :cond_5

    invoke-virtual {p0}, La71/a;->g()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    :cond_5
    invoke-direct {v0, v2, v3, p2}, Lcom/whoop/core/details/view/b$k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/core/details/view/b$j;

    check-cast p1, Lmc1/b;

    invoke-direct {v0, p1}, Lcom/whoop/core/details/view/b$j;-><init>(Lmc1/b;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lew0/a$a;->a:Lew0/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 1

    new-instance v0, Lcom/whoop/core/details/view/b$a;

    invoke-direct {v0, p1}, Lcom/whoop/core/details/view/b$a;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lew0/a$h;

    invoke-direct {v0, p1}, Lew0/a$h;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lew0/a$f;->a:Lew0/a$f;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lew0/a;

    if-eqz v0, :cond_0

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    instance-of v0, p2, Lcom/whoop/core/details/view/b;

    if-eqz v0, :cond_1

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    instance-of p1, p2, Lcom/whoop/navigation/e;

    if-eqz p1, :cond_2

    new-instance p1, Lew0/a$b;

    check-cast p2, Lcom/whoop/navigation/e;

    invoke-direct {p1, p2}, Lew0/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_0

    new-instance p1, Lew0/a$b;

    check-cast p2, Lcom/whoop/navigation/e;

    invoke-direct {p1, p2}, Lew0/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    instance-of p0, p2, Lc41/p1;

    if-eqz p0, :cond_1

    sget-object p0, Lcom/whoop/core/details/view/b$f;->a:Lcom/whoop/core/details/view/b$f;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final N(Lhw0/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhw0/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v0, p5

    const-string v4, "viewState"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "coreDetailsViewEventListener"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onNavigationEvent"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v4, 0x28f148d4

    invoke-virtual {v10, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_2

    and-int/lit8 v4, v0, 0x8

    if-nez v4, :cond_0

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    move v5, v7

    goto :goto_4

    :cond_5
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v4, v5

    :cond_6
    and-int/lit8 v5, p6, 0x8

    if-eqz v5, :cond_8

    or-int/lit16 v4, v4, 0xc00

    :cond_7
    move-object/from16 v8, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v8, v0, 0xc00

    if-nez v8, :cond_7

    move-object/from16 v8, p3

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    const/16 v9, 0x800

    goto :goto_5

    :cond_9
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v4, v9

    :goto_6
    and-int/lit16 v9, v4, 0x493

    const/16 v11, 0x492

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eq v9, v11, :cond_a

    move v9, v12

    goto :goto_7

    :cond_a
    move v9, v13

    :goto_7
    and-int/lit8 v11, v4, 0x1

    invoke-virtual {v10, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_17

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_b

    new-instance v5, Lov2/f;

    const/4 v8, 0x1

    invoke-direct {v5, v8}, Lov2/f;-><init>(I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v14, v5

    goto :goto_8

    :cond_c
    move-object v14, v8

    :goto_8
    invoke-interface {v1}, Lhw0/d;->a()Ljava/lang/String;

    move-result-object v5

    and-int/lit8 v8, v4, 0xe

    invoke-static {v1, v5, v10, v8}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    instance-of v5, v1, Lhw0/d$c;

    if-eqz v5, :cond_d

    const v5, -0x4e3d66bf

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    move-object v5, v1

    check-cast v5, Lhw0/d$c;

    and-int/lit16 v4, v4, 0x3fe

    invoke-static {v5, v2, v3, v10, v4}, Lcom/whoop/core/details/view/a;->S(Lhw0/d$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    move-object v5, v14

    goto/16 :goto_c

    :cond_d
    instance-of v5, v1, Lhw0/d$b;

    if-eqz v5, :cond_16

    const v5, -0x796b6641

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    move-object v5, v1

    check-cast v5, Lhw0/d$b;

    invoke-virtual {v5}, Lhw0/d$b;->j()Lhw0/d$d;

    move-result-object v8

    if-eqz v8, :cond_e

    sget-object v11, Lcom/whoop/core/details/view/b$p;->a:Lcom/whoop/core/details/view/b$p;

    invoke-interface {v2, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8}, Lhw0/d$d;->e()Lorg/joda/time/LocalDateTime;

    move-result-object v16

    invoke-virtual {v8}, Lhw0/d$d;->d()Lorg/joda/time/LocalDateTime;

    move-result-object v17

    invoke-virtual {v8}, Lhw0/d$d;->b()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v8}, Lhw0/d$d;->c()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v8}, Lhw0/d$d;->a()Ljava/lang/String;

    move-result-object v19

    new-instance v15, Lew0/a$d;

    invoke-direct/range {v15 .. v20}, Lew0/a$d;-><init>(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v15}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    invoke-virtual {v5}, Lhw0/d$b;->f()Liw0/l0;

    move-result-object v8

    if-eqz v8, :cond_15

    const v8, -0x79620daf

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    move-object v8, v5

    invoke-virtual {v8}, Lhw0/d$b;->f()Liw0/l0;

    move-result-object v5

    and-int/lit8 v11, v4, 0x70

    if-ne v11, v6, :cond_f

    move v6, v12

    goto :goto_9

    :cond_f
    move v6, v13

    :goto_9
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_10

    if-ne v11, v9, :cond_11

    :cond_10
    new-instance v11, Lnw0/n;

    const/16 v6, 0x13

    invoke-direct {v11, v2, v6}, Lnw0/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v6, v11

    check-cast v6, Lc93/a;

    and-int/lit16 v4, v4, 0x380

    if-ne v4, v7, :cond_12

    goto :goto_a

    :cond_12
    move v12, v13

    :goto_a
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v12, :cond_13

    if-ne v4, v9, :cond_14

    :cond_13
    new-instance v4, Lno0/l;

    const/16 v7, 0x17

    invoke-direct {v4, v3, v7}, Lno0/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v7, v4

    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v2, v8

    invoke-virtual {v2}, Lhw0/d$b;->o()Z

    move-result v8

    invoke-virtual {v2}, Lhw0/d$b;->m()Z

    move-result v9

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Liw0/k0;->s(Liw0/l0;Lc93/a;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    move-object v5, v14

    goto :goto_b

    :cond_15
    move-object v2, v5

    const v5, -0x79579f72

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    and-int/lit16 v7, v4, 0x1ffe

    move-object v4, v3

    move-object v6, v10

    move-object v5, v14

    move-object/from16 v3, p1

    invoke-static/range {v2 .. v7}, Lcom/whoop/core/details/view/a;->x(Lhw0/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    :goto_c
    move-object v4, v5

    goto :goto_d

    :cond_16
    const v0, -0x4e3d692f

    invoke-static {v0, v10, v13}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_17
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v4, v8

    :goto_d
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_18

    new-instance v0, Lo72/a;

    const/4 v7, 0x4

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lo72/a;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final O(Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    new-instance v0, Lcom/whoop/core/details/view/b$h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/core/details/view/b$h;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 4

    const-string v0, "exerciseId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lew0/a$e;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p1, v3, v1, v2}, Lew0/a$e;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R(Lhw0/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lcom/whoop/core/details/view/a;->N(Lhw0/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final S(Lhw0/d$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhw0/d$c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v5, 0x71346db7

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    and-int/lit8 v5, v4, 0x8

    if-nez v5, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_0
    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_1

    :cond_1
    const/4 v5, 0x2

    :goto_1
    or-int/2addr v5, v4

    goto :goto_2

    :cond_2
    move v5, v4

    :goto_2
    and-int/lit8 v6, v4, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    move v6, v7

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v4, 0x180

    const/16 v8, 0x100

    if-nez v6, :cond_6

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move v6, v8

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v5, v6

    :cond_6
    and-int/lit16 v6, v5, 0x93

    const/16 v9, 0x92

    const/16 v21, 0x1

    const/4 v10, 0x0

    if-eq v6, v9, :cond_7

    move/from16 v6, v21

    goto :goto_5

    :cond_7
    move v6, v10

    :goto_5
    and-int/lit8 v9, v5, 0x1

    invoke-virtual {v0, v9, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-virtual {v1}, Lhw0/d$c;->p()Lsz0/p0;

    move-result-object v6

    instance-of v6, v6, Lsz0/p0$h;

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_b

    const v6, -0x65ba92c0

    invoke-virtual {v0, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lhw0/d$c;->p()Lsz0/p0;

    move-result-object v6

    invoke-virtual {v6}, Lsz0/p0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    and-int/lit16 v5, v5, 0x380

    if-ne v5, v8, :cond_8

    goto :goto_6

    :cond_8
    move/from16 v21, v10

    :goto_6
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v21, :cond_9

    if-ne v5, v9, :cond_a

    :cond_9
    new-instance v5, Lnw0/n;

    const/16 v6, 0x12

    invoke-direct {v5, v3, v6}, Lnw0/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v15, v5

    check-cast v15, Lc93/a;

    new-instance v11, Lsz0/p0$h;

    const-wide/16 v13, 0x0

    const/16 v16, 0x2

    const/16 v17, 0x0

    invoke-direct/range {v11 .. v17}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lhw0/d$c;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v5, Lsz0/p0$h;->h:I

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v7, 0x3

    or-int v18, v5, v7

    const/16 v19, 0x0

    const/16 v20, 0xffc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v5, v10

    const/4 v10, 0x0

    move v12, v5

    move-object v5, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v25, v17

    move-object/from16 v17, v0

    move/from16 v0, v25

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v17

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_a

    :cond_b
    move-object v6, v0

    move v0, v10

    const v8, -0x65b4fc83

    invoke-virtual {v6, v8}, Lp1/q;->e0(I)V

    move v8, v5

    invoke-virtual {v1}, Lhw0/d$c;->p()Lsz0/p0;

    move-result-object v5

    invoke-virtual {v1}, Lhw0/d$c;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    move v11, v8

    invoke-virtual {v1}, Lhw0/d$c;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    and-int/lit8 v11, v11, 0x70

    if-ne v11, v7, :cond_c

    move/from16 v13, v21

    goto :goto_7

    :cond_c
    move v13, v0

    :goto_7
    or-int/2addr v12, v13

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_d

    if-ne v13, v9, :cond_e

    :cond_d
    new-instance v13, Low0/e;

    const/4 v12, 0x0

    invoke-direct {v13, v1, v2, v12}, Low0/e;-><init>(Lhw0/d$c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v13, Lc93/a;

    invoke-virtual {v1}, Lhw0/d$c;->n()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-ne v11, v7, :cond_f

    move/from16 v15, v21

    goto :goto_8

    :cond_f
    move v15, v0

    :goto_8
    or-int/2addr v14, v15

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v14, :cond_10

    if-ne v15, v9, :cond_11

    :cond_10
    new-instance v15, Low0/e;

    const/4 v14, 0x1

    invoke-direct {v15, v1, v2, v14}, Low0/e;-><init>(Lhw0/d$c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v15, Lc93/a;

    const/high16 v14, 0x30000

    sget v16, Lsz0/p0;->d:I

    or-int v14, v16, v14

    sget v16, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v17, v16, 0x3

    or-int v14, v14, v17

    shl-int/lit8 v17, v16, 0x9

    or-int v14, v14, v17

    shl-int/lit8 v16, v16, 0x15

    or-int v18, v14, v16

    const/16 v19, 0x0

    const/16 v20, 0xe44

    move v14, v7

    const/4 v7, 0x0

    move-object/from16 v17, v6

    move-object v6, v10

    const/4 v10, 0x1

    move/from16 v16, v11

    const/4 v11, 0x0

    move/from16 v22, v14

    const/4 v14, 0x0

    move-object/from16 v23, v9

    move-object v9, v13

    move-object v13, v15

    const/4 v15, 0x0

    move/from16 v24, v16

    const/16 v16, 0x0

    move/from16 v4, v22

    move-object/from16 v3, v23

    move/from16 v0, v24

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v17

    invoke-virtual {v1}, Lhw0/d$c;->j()Lcom/whoop/core/details/view/b;

    move-result-object v5

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-ne v0, v4, :cond_12

    goto :goto_9

    :cond_12
    const/16 v21, 0x0

    :goto_9
    or-int v0, v7, v21

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_13

    if-ne v4, v3, :cond_14

    :cond_13
    new-instance v4, Lcom/whoop/core/details/view/a$a;

    const/4 v0, 0x0

    invoke-direct {v4, v1, v2, v0}, Lcom/whoop/core/details/view/a$a;-><init>(Lhw0/d$c;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v4, Lc93/m;

    invoke-static {v6, v4, v5}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v12, 0x0

    invoke-virtual {v6, v12}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_15
    move-object v6, v0

    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v0, Lnx1/g;

    const/4 v5, 0x6

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lnx1/g;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final T(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lew0/a$a;->a:Lew0/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final U(Lhw0/d$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lhw0/d$c;->k()Lcom/whoop/core/details/view/b;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final V(Lhw0/d$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lhw0/d$c;->m()Lcom/whoop/core/details/view/b;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final W(Lhw0/d$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lcom/whoop/core/details/view/a;->S(Lhw0/d$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lhw0/d$b;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/core/details/view/a;->z(Lkotlin/jvm/functions/Function1;Lhw0/d$b;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2}, Lcom/whoop/core/details/view/a;->F(Lp1/c1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/core/details/view/a;->P(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/core/details/view/a;->M(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lcom/whoop/core/details/view/a;->J(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lcom/whoop/core/details/view/a;->Q(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lhw0/d$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/core/details/view/a;->W(Lhw0/d$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lcom/whoop/core/details/view/a;->K(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lhw0/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/core/details/view/a;->y(Lhw0/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/core/details/view/a;->O(Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/core/details/view/a;->I(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/core/details/view/a;->L(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/core/details/view/a;->H(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lhw0/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/whoop/core/details/view/a;->R(Lhw0/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lhw0/d$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/core/details/view/a;->U(Lhw0/d$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/core/details/view/a;->T(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lhw0/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/whoop/core/details/view/a;->E(Lhw0/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lhw0/d$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/core/details/view/a;->V(Lhw0/d$c;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lcom/whoop/core/details/view/a;->C(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lcom/whoop/core/details/view/a;->D(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/core/details/view/a;->B(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(ILkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lcom/whoop/core/details/view/a;->A(Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lcom/whoop/core/details/view/a;->G(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final x(Lhw0/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhw0/d$b;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    move-object/from16 v13, p4

    check-cast v13, Lp1/q;

    const v0, 0x6f998795

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v4, v5, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit16 v4, v5, 0x180

    if-nez v4, :cond_5

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v0, v4

    :cond_5
    and-int/lit16 v4, v5, 0xc00

    if-nez v4, :cond_7

    move-object/from16 v4, p3

    invoke-virtual {v13, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_4

    :cond_6
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v0, v8

    goto :goto_5

    :cond_7
    move-object/from16 v4, p3

    :goto_5
    and-int/lit16 v8, v0, 0x493

    const/16 v9, 0x492

    if-eq v8, v9, :cond_8

    const/4 v8, 0x1

    goto :goto_6

    :cond_8
    const/4 v8, 0x0

    :goto_6
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v13, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_39

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v8, v9, :cond_9

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v8, Lp1/c1;

    invoke-virtual {v1}, Lhw0/d$b;->e()Low0/a;

    move-result-object v12

    and-int/lit8 v14, v0, 0x70

    invoke-static {v12, v2, v13, v14}, Low0/d;->e(Low0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1}, Lhw0/d$b;->i()Liw0/h0;

    move-result-object v12

    const v15, -0x10a9bff0

    invoke-virtual {v13, v15}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lhw0/d$b;->h()Ljava/util/Map;

    move-result-object v15

    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-interface {v15}, Ljava/util/Map;->size()I

    move-result v16

    invoke-static/range {v16 .. v16}, Lm83/g0;->W(I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v15}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_7
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_e

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/util/Map$Entry;

    invoke-interface {v15}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v15}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lhw0/e;

    invoke-virtual {v15}, Lhw0/e;->b()Lgz0/m0;

    move-result-object v7

    invoke-virtual {v13, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    and-int/lit16 v4, v0, 0x380

    const/16 v5, 0x100

    if-ne v4, v5, :cond_a

    const/4 v4, 0x1

    goto :goto_8

    :cond_a
    const/4 v4, 0x0

    :goto_8
    or-int v4, v19, v4

    const/16 v5, 0x20

    if-ne v14, v5, :cond_b

    const/4 v5, 0x1

    goto :goto_9

    :cond_b
    const/4 v5, 0x0

    :goto_9
    or-int/2addr v4, v5

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_c

    if-ne v5, v9, :cond_d

    :cond_c
    new-instance v5, Ln0/j;

    const/16 v4, 0xb

    invoke-direct {v5, v15, v3, v2, v4}, Ln0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v5, Lc93/a;

    new-instance v4, Liw0/g0;

    invoke-direct {v4, v7, v5}, Liw0/g0;-><init>(Lgz0/m0;Lc93/a;)V

    invoke-interface {v10, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v4, p3

    move/from16 v5, p5

    goto :goto_7

    :cond_e
    const/4 v4, 0x0

    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v1}, Lhw0/d$b;->d()Ljava/util/List;

    move-result-object v5

    move-object v6, v10

    invoke-virtual {v1}, Lhw0/d$b;->c()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v1}, Lhw0/d$b;->l()Ljava/util/List;

    move-result-object v11

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v22

    invoke-virtual {v1}, Lhw0/d$b;->o()Z

    move-result v26

    invoke-virtual {v1}, Lhw0/d$b;->n()Z

    move-result v27

    invoke-virtual {v1}, Lhw0/d$b;->k()Lep0/j;

    move-result-object v29

    const/16 v7, 0x20

    if-ne v14, v7, :cond_f

    const/4 v7, 0x1

    goto :goto_a

    :cond_f
    move v7, v4

    :goto_a
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v7, :cond_10

    if-ne v15, v9, :cond_11

    :cond_10
    new-instance v15, Lb30/r;

    const/16 v7, 0x1b

    invoke-direct {v15, v8, v2, v7}, Lb30/r;-><init>(Lp1/c1;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v15, Lkotlin/jvm/functions/Function1;

    const/16 v7, 0x20

    if-ne v14, v7, :cond_12

    const/4 v7, 0x1

    goto :goto_b

    :cond_12
    move v7, v4

    :goto_b
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_13

    if-ne v8, v9, :cond_14

    :cond_13
    new-instance v8, Lno0/l;

    const/16 v7, 0x13

    invoke-direct {v8, v2, v7}, Lno0/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v8, Lkotlin/jvm/functions/Function1;

    and-int/lit16 v7, v0, 0x380

    const/16 v4, 0x100

    if-ne v7, v4, :cond_15

    const/4 v4, 0x1

    :goto_c
    move/from16 v19, v0

    goto :goto_d

    :cond_15
    const/4 v4, 0x0

    goto :goto_c

    :goto_d
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v4, :cond_16

    if-ne v0, v9, :cond_17

    :cond_16
    new-instance v0, Lnw0/n;

    const/16 v4, 0x11

    invoke-direct {v0, v3, v4}, Lnw0/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v0, Lc93/a;

    const/16 v4, 0x20

    if-ne v14, v4, :cond_18

    const/4 v4, 0x1

    :goto_e
    move-object/from16 v20, v0

    goto :goto_f

    :cond_18
    const/4 v4, 0x0

    goto :goto_e

    :goto_f
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v4, :cond_19

    if-ne v0, v9, :cond_1a

    :cond_19
    new-instance v0, Lno0/l;

    const/16 v4, 0x14

    invoke-direct {v0, v2, v4}, Lno0/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/16 v4, 0x100

    if-ne v7, v4, :cond_1b

    const/4 v4, 0x1

    :goto_10
    move-object/from16 v21, v0

    goto :goto_11

    :cond_1b
    const/4 v4, 0x0

    goto :goto_10

    :goto_11
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v4, :cond_1c

    if-ne v0, v9, :cond_1d

    :cond_1c
    new-instance v0, Lno0/l;

    const/16 v4, 0x15

    invoke-direct {v0, v3, v4}, Lno0/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/16 v4, 0x100

    if-ne v7, v4, :cond_1e

    const/4 v4, 0x1

    :goto_12
    move-object/from16 v23, v0

    goto :goto_13

    :cond_1e
    const/4 v4, 0x0

    goto :goto_12

    :goto_13
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v4, :cond_1f

    if-ne v0, v9, :cond_20

    :cond_1f
    new-instance v0, Lno0/l;

    const/16 v4, 0x16

    invoke-direct {v0, v3, v4}, Lno0/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/16 v4, 0x100

    if-ne v7, v4, :cond_21

    const/4 v4, 0x1

    :goto_14
    move-object/from16 v24, v0

    const/16 v0, 0x20

    goto :goto_15

    :cond_21
    const/4 v4, 0x0

    goto :goto_14

    :goto_15
    if-ne v14, v0, :cond_22

    const/4 v0, 0x1

    goto :goto_16

    :cond_22
    const/4 v0, 0x0

    :goto_16
    or-int/2addr v0, v4

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_23

    if-ne v4, v9, :cond_24

    :cond_23
    new-instance v4, Lb70/c;

    const/16 v0, 0xd

    invoke-direct {v4, v3, v0, v2}, Lb70/c;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/16 v0, 0x100

    if-ne v7, v0, :cond_25

    const/16 v25, 0x1

    :goto_17
    const/16 v0, 0x20

    goto :goto_18

    :cond_25
    const/16 v25, 0x0

    goto :goto_17

    :goto_18
    if-ne v14, v0, :cond_26

    const/4 v0, 0x1

    goto :goto_19

    :cond_26
    const/4 v0, 0x0

    :goto_19
    or-int v0, v25, v0

    move/from16 v25, v0

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v25, :cond_28

    if-ne v0, v9, :cond_27

    goto :goto_1a

    :cond_27
    move-object/from16 v25, v4

    goto :goto_1b

    :cond_28
    :goto_1a
    new-instance v0, Lb70/c;

    move-object/from16 v25, v4

    const/16 v4, 0xe

    invoke-direct {v0, v3, v4, v2}, Lb70/c;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1b
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/16 v4, 0x100

    if-ne v7, v4, :cond_29

    const/4 v4, 0x1

    goto :goto_1c

    :cond_29
    const/4 v4, 0x0

    :goto_1c
    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v28

    or-int v4, v4, v28

    move-object/from16 v28, v0

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v4, :cond_2a

    if-ne v0, v9, :cond_2b

    :cond_2a
    new-instance v0, Lnq0/m;

    const/16 v4, 0xe

    invoke-direct {v0, v4, v3, v1}, Lnq0/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/16 v4, 0x20

    if-ne v14, v4, :cond_2c

    const/4 v4, 0x1

    :goto_1d
    move-object/from16 v30, v0

    goto :goto_1e

    :cond_2c
    const/4 v4, 0x0

    goto :goto_1d

    :goto_1e
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v4, :cond_2d

    if-ne v0, v9, :cond_2e

    :cond_2d
    new-instance v0, Lno0/l;

    const/16 v4, 0x18

    invoke-direct {v0, v2, v4}, Lno0/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2e
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/16 v4, 0x20

    if-ne v14, v4, :cond_2f

    const/4 v4, 0x1

    goto :goto_1f

    :cond_2f
    const/4 v4, 0x0

    :goto_1f
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v4, :cond_30

    if-ne v14, v9, :cond_31

    :cond_30
    new-instance v14, Lnw0/n;

    const/16 v4, 0x14

    invoke-direct {v14, v2, v4}, Lnw0/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_31
    check-cast v14, Lc93/a;

    const/16 v4, 0x100

    if-ne v7, v4, :cond_32

    const/4 v4, 0x1

    :goto_20
    move-object/from16 v16, v0

    goto :goto_21

    :cond_32
    const/4 v4, 0x0

    goto :goto_20

    :goto_21
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v4, :cond_33

    if-ne v0, v9, :cond_34

    :cond_33
    new-instance v0, Lno0/l;

    const/16 v4, 0x19

    invoke-direct {v0, v3, v4}, Lno0/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_34
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/16 v4, 0x100

    if-ne v7, v4, :cond_35

    const/4 v4, 0x1

    goto :goto_22

    :cond_35
    const/4 v4, 0x0

    :goto_22
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_36

    if-ne v7, v9, :cond_37

    :cond_36
    new-instance v7, Lno0/l;

    const/16 v4, 0x1a

    invoke-direct {v7, v3, v4}, Lno0/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_37
    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v9, Lkd1/o;->a:I

    or-int/2addr v4, v9

    shl-int/lit8 v31, v4, 0x3

    const v4, 0xe000

    shl-int/lit8 v9, v19, 0x3

    and-int v32, v9, v4

    sget v4, Lep0/j;->x:I

    shl-int/lit8 v33, v4, 0x9

    const/16 v34, 0x1

    move-object/from16 v19, v28

    move-object/from16 v28, v7

    move-object v7, v12

    move-object v12, v15

    move-object/from16 v15, v21

    move-object/from16 v21, v30

    move-object/from16 v30, v13

    move-object v13, v8

    move-object v8, v6

    const/4 v6, 0x0

    move-object/from16 v4, v23

    move-object/from16 v23, v16

    move-object/from16 v16, v4

    move-object v9, v5

    move-object/from16 v17, v24

    move-object/from16 v18, v25

    const/4 v4, 0x0

    move-object/from16 v25, v0

    move-object/from16 v24, v14

    move-object/from16 v14, v20

    move-object/from16 v20, p3

    invoke-static/range {v6 .. v34}, Liw0/x;->y0(Landroidx/compose/ui/Modifier;Liw0/h0;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function1;Lep0/j;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v13, v30

    invoke-virtual {v1}, Lhw0/d$b;->g()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_38

    const v0, -0x4556351

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    :goto_23
    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    goto :goto_24

    :cond_38
    const v0, -0x4556350

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    const/4 v14, 0x0

    const/16 v15, 0x7e

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v6 .. v15}, Lm12/d;->z(Ljava/lang/String;Lm12/e;ZLkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_23

    :cond_39
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_24
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_3a

    new-instance v0, Lot1/a;

    const/4 v6, 0x2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lot1/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_3a
    return-void
.end method

.method private static final y(Lhw0/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lhw0/e;->a()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lew0/a;

    if-eqz v0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    instance-of p1, p0, Lcom/whoop/core/details/view/b;

    if-eqz p1, :cond_1

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;Lhw0/d$b;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lew0/a$c;

    invoke-virtual {p1}, Lhw0/d$b;->b()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-direct {v0, p2, p1}, Lew0/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
