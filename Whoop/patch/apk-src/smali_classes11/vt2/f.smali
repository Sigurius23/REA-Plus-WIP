.class public abstract Lvt2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001au\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0014\u0008\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u0011H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u00020\u00122\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0016H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b\u00b2\u0006\u000e\u0010\u001a\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lwt2/p;",
        "viewModel",
        "Lvt2/h;",
        "navigationRouter",
        "Leb/u0;",
        "navController",
        "Lwt2/q;",
        "viewState",
        "Lls2/b;",
        "analytics",
        "",
        "navigateToPresets",
        "",
        "scrollId",
        "isWrapped",
        "Lcom/whoop/weeklyplan/weeklyplan/navigation/WeeklyPlanNavHostDestination;",
        "startDestination",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "navigatedToPresetViaDeepLinkCallBack",
        "v",
        "(Lwt2/p;Lvt2/h;Leb/u0;Lwt2/q;Lls2/b;ZLjava/lang/String;ZLcom/whoop/weeklyplan/weeklyplan/navigation/WeeklyPlanNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lkotlin/Function0;",
        "content",
        "r",
        "(Lc93/m;Landroidx/compose/runtime/Composer;I)V",
        "showPresetsLandingCallback",
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
.method private static final A(Lwt2/q;Ljava/lang/String;ZLwt2/p;Lls2/b;Lvt2/h;Lp1/c1;Lkotlin/jvm/functions/Function1;Leb/s0;)Ll83/a0;
    .locals 11

    move-object/from16 v0, p8

    const-string v1, "$this$NavHost"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lvt2/e;

    move-object v3, p0

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    move-object v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    invoke-direct/range {v2 .. v10}, Lvt2/e;-><init>(Lwt2/q;Ljava/lang/String;ZLwt2/p;Lls2/b;Lvt2/h;Lp1/c1;Lkotlin/jvm/functions/Function1;)V

    new-instance p1, Lx1/b;

    const/4 p2, 0x1

    const p4, -0x42daacdf

    invoke-direct {p1, v2, p2, p4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const-string p4, "OVERVIEW"

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {v0, p4, v1, p1, v2}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    new-instance p1, Lno0/h;

    const/16 p4, 0x17

    invoke-direct {p1, p0, v8, p3, p4}, Lno0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance p0, Lx1/b;

    const p3, 0x3aded54a    # 0.0017000821f

    invoke-direct {p0, p1, p2, p3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const-string p1, "PRESETS"

    invoke-static {v0, p1, v1, p0, v2}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lwt2/q;Ljava/lang/String;ZLwt2/p;Lls2/b;Lvt2/h;Lp1/c1;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 17

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    const-string v5, "it"

    move-object/from16 v6, p8

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p9

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_0

    if-ne v6, v7, :cond_1

    :cond_0
    new-instance v6, Ls90/f;

    const/16 v5, 0x19

    invoke-direct {v6, v0, v1, v2, v5}, Ls90/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v9, v6

    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_2

    if-ne v5, v7, :cond_3

    :cond_2
    new-instance v5, Lvt2/d;

    const/4 v0, 0x1

    invoke-direct {v5, v2, v0}, Lvt2/d;-><init>(Lvt2/h;I)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v10, v5

    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_4

    if-ne v2, v7, :cond_5

    :cond_4
    new-instance v2, Luo1/b;

    const/16 v0, 0xe

    invoke-direct {v2, v1, v0}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v11, v2

    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Lvt2/f;->y(Lp1/c1;)Z

    move-result v12

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_6

    if-ne v1, v7, :cond_7

    :cond_6
    new-instance v1, Lp40/b;

    const/16 v0, 0xe

    invoke-direct {v1, v4, v3, v0}, Lp40/b;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v13, v1

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move/from16 v8, p2

    invoke-static/range {v6 .. v16}, Lyt2/m;->y(Lwt2/q;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final C(Lwt2/p;Lls2/b;Lvt2/h;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p3, Lwt2/o$c;

    if-eqz v0, :cond_0

    check-cast p3, Lwt2/o;

    invoke-virtual {p0, p3}, Lwt2/p;->r(Lwt2/o;)Lbc3/k1;

    goto :goto_2

    :cond_0
    instance-of v0, p3, Lwt2/o$b;

    if-eqz v0, :cond_1

    check-cast p3, Lwt2/o;

    invoke-virtual {p0, p3}, Lwt2/p;->r(Lwt2/o;)Lbc3/k1;

    goto :goto_2

    :cond_1
    instance-of v0, p3, Lwt2/o$a;

    if-eqz v0, :cond_2

    check-cast p3, Lwt2/o;

    invoke-virtual {p0, p3}, Lwt2/p;->r(Lwt2/o;)Lbc3/k1;

    goto :goto_2

    :cond_2
    instance-of p0, p3, Lcom/whoop/navigation/e;

    if-eqz p0, :cond_7

    move-object p0, p3

    check-cast p0, Lcom/whoop/navigation/e;

    invoke-virtual {p0}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v0

    instance-of v0, v0, Lcom/whoop/navigation/WeeklyPlanEditScreenModel;

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p0

    instance-of v0, p0, Lcom/whoop/navigation/WeeklyPlanEditScreenModel;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast p0, Lcom/whoop/navigation/WeeklyPlanEditScreenModel;

    goto :goto_0

    :cond_3
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lcom/whoop/navigation/WeeklyPlanEditScreenModel;->getPlanEditScreens()Ljava/util/List;

    move-result-object v1

    :cond_4
    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_5

    new-instance p0, Lls2/a$g;

    const/4 v0, 0x0

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Lls2/a$g;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lls2/b;->q(Lls2/a;)V

    goto :goto_1

    :cond_5
    sget-object p0, Lls2/a$b;->a:Lls2/a$b;

    invoke-virtual {p1, p0}, Lls2/b;->q(Lls2/a;)V

    :cond_6
    :goto_1
    invoke-virtual {p2, p3}, Lvt2/h;->b(Ljava/lang/Object;)V

    :cond_7
    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lvt2/h;Lvt2/g;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lvt2/h;->b(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lls2/b;Lls2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lls2/b;->q(Lls2/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1, p2}, Lvt2/f;->z(Lp1/c1;Z)V

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lwt2/q;Lvt2/h;Lwt2/p;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p5, "it"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lvl0/c;

    const/4 p5, 0x2

    invoke-direct {p3, p0, p1, p2, p5}, Lvl0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const p0, 0x5ff221

    invoke-static {p0, p4, p3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p0

    const/4 p1, 0x6

    invoke-static {p0, p4, p1}, Lvt2/f;->r(Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lwt2/q;Lvt2/h;Lwt2/p;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p4, v2

    move-object v6, p3

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_d

    instance-of p3, p0, Lwt2/q$c;

    const/4 p4, 0x0

    if-eqz p3, :cond_1

    move-object v0, p0

    check-cast v0, Lwt2/q$c;

    goto :goto_1

    :cond_1
    move-object v0, p4

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lwt2/q$c;->c()Lwt2/f;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    move-object v1, v0

    goto :goto_4

    :cond_3
    :goto_3
    sget-object v0, Lwt2/f$e;->a:Lwt2/f$e;

    goto :goto_2

    :goto_4
    if-eqz p3, :cond_4

    move-object p4, p0

    check-cast p4, Lwt2/q$c;

    :cond_4
    if-eqz p4, :cond_6

    invoke-virtual {p4}, Lwt2/q$c;->b()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_5

    goto :goto_6

    :cond_5
    :goto_5
    move-object v2, p0

    goto :goto_7

    :cond_6
    :goto_6
    const-string p0, ""

    goto :goto_5

    :goto_7
    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v6, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    or-int/2addr p0, p3

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-nez p0, :cond_7

    if-ne p3, p4, :cond_8

    :cond_7
    new-instance p3, Lum0/b;

    const/16 p0, 0xd

    invoke-direct {p3, p0, p1, p2}, Lum0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v3, p3

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p0, :cond_9

    if-ne p2, p4, :cond_a

    :cond_9
    new-instance p2, Lsc0/c;

    const/16 p0, 0x1d

    invoke-direct {p2, p1, p0}, Lsc0/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v6, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v4, p2

    check-cast v4, Lc93/a;

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p0, :cond_b

    if-ne p2, p4, :cond_c

    :cond_b
    new-instance p2, Lvt2/d;

    const/4 p0, 0x0

    invoke-direct {p2, p1, p0}, Lvt2/d;-><init>(Lvt2/h;I)V

    invoke-virtual {v6, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v5, p2

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lyt2/c;->t(Lwt2/f;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_8

    :cond_d
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_8
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lvt2/h;Lwt2/p;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, Lvt2/h;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of p0, p2, Lwt2/o$a;

    if-eqz p0, :cond_1

    check-cast p2, Lwt2/o;

    invoke-virtual {p1, p2}, Lwt2/p;->r(Lwt2/o;)Lbc3/k1;

    goto :goto_0

    :cond_1
    instance-of p0, p2, Lwt2/o$c;

    if-eqz p0, :cond_2

    check-cast p2, Lwt2/o;

    invoke-virtual {p1, p2}, Lwt2/p;->r(Lwt2/o;)Lbc3/k1;

    :cond_2
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lvt2/h;)Ll83/a0;
    .locals 1

    sget-object v0, Lvt2/g$e;->a:Lvt2/g$e;

    invoke-virtual {p0, v0}, Lvt2/h;->b(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lvt2/h;Lvt2/g;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lvt2/h;->b(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lwt2/p;Lvt2/h;Leb/u0;Lwt2/q;Lls2/b;ZLjava/lang/String;ZLcom/whoop/weeklyplan/weeklyplan/navigation/WeeklyPlanNavHostDestination;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 14

    or-int/lit8 v0, p10, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v12

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v13, p11

    move-object/from16 v11, p12

    invoke-static/range {v1 .. v13}, Lvt2/f;->v(Lwt2/p;Lvt2/h;Leb/u0;Lwt2/q;Lls2/b;ZLjava/lang/String;ZLcom/whoop/weeklyplan/weeklyplan/navigation/WeeklyPlanNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lwt2/p;Lls2/b;Lvt2/h;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvt2/f;->C(Lwt2/p;Lls2/b;Lvt2/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lwt2/p;Lvt2/h;Leb/u0;Lwt2/q;Lls2/b;ZLjava/lang/String;ZLcom/whoop/weeklyplan/weeklyplan/navigation/WeeklyPlanNavHostDestination;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p13}, Lvt2/f;->L(Lwt2/p;Lvt2/h;Leb/u0;Lwt2/q;Lls2/b;ZLjava/lang/String;ZLcom/whoop/weeklyplan/weeklyplan/navigation/WeeklyPlanNavHostDestination;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lwt2/q;Ljava/lang/String;ZLwt2/p;Lls2/b;Lvt2/h;Lp1/c1;Lkotlin/jvm/functions/Function1;Leb/s0;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lvt2/f;->A(Lwt2/q;Ljava/lang/String;ZLwt2/p;Lls2/b;Lvt2/h;Lp1/c1;Lkotlin/jvm/functions/Function1;Leb/s0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lwt2/q;Ljava/lang/String;ZLwt2/p;Lls2/b;Lvt2/h;Lp1/c1;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lvt2/f;->B(Lwt2/q;Ljava/lang/String;ZLwt2/p;Lls2/b;Lvt2/h;Lp1/c1;Lkotlin/jvm/functions/Function1;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Z)Lp1/c1;
    .locals 0

    invoke-static {p0}, Lvt2/f;->x(Z)Lp1/c1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Z)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvt2/f;->w(Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(I)I
    .locals 0

    invoke-static {p0}, Lvt2/f;->s(I)I

    move-result p0

    return p0
.end method

.method public static synthetic h(Lwt2/q;Lvt2/h;Lwt2/p;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lvt2/f;->G(Lwt2/q;Lvt2/h;Lwt2/p;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lvt2/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lvt2/f;->J(Lvt2/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvt2/f;->u(Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lvt2/h;Lvt2/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lvt2/f;->K(Lvt2/h;Lvt2/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lls2/b;Lls2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lvt2/f;->E(Lls2/b;Lls2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvt2/f;->F(Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lvt2/h;Lwt2/p;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lvt2/f;->I(Lvt2/h;Lwt2/p;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lwt2/q;Lvt2/h;Lwt2/p;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lvt2/f;->H(Lwt2/q;Lvt2/h;Lwt2/p;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lvt2/h;Lvt2/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lvt2/f;->D(Lvt2/h;Lvt2/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lc93/m;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvt2/f;->t(Lc93/m;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "content"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, p1

    check-cast v7, Lp1/q;

    const p1, 0x1cc69082

    invoke-virtual {v7, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    if-nez p1, :cond_1

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    and-int/lit8 v1, p1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    and-int/2addr p1, v3

    invoke-virtual {v7, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance v1, Ld0/q0;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, p1}, Ld0/q0;-><init>(Ljava/lang/Object;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, p1}, Ld0/q0;->I0(Ljava/lang/Boolean;)V

    const/16 p1, 0x12c

    const/4 v0, 0x0

    const/4 v3, 0x6

    invoke-static {p1, v2, v0, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v0, v2, :cond_3

    new-instance v0, Lvs2/d;

    const/4 v2, 0x2

    invoke-direct {v0, v2}, Lvs2/d;-><init>(I)V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lc0/w0;->m(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/d1;

    move-result-object v3

    new-instance p1, Lkd1/c0;

    const/4 v0, 0x5

    invoke-direct {p1, v0, p0}, Lkd1/c0;-><init>(ILc93/m;)V

    const v0, 0x3e87e15a

    invoke-static {v0, v7, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    const v8, 0x30030

    const/16 v9, 0x18

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v9}, Landroidx/compose/animation/b;->b(Ld0/q0;Landroidx/compose/ui/Modifier;Lc0/d1;Lc0/e1;Ljava/lang/String;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_4
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance v0, Ln22/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p2, v1}, Ln22/a;-><init>(Lc93/m;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final s(I)I
    .locals 0

    return p0
.end method

.method private static final t(Lc93/m;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p3, "$this$AnimatedVisibility"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p2, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lvt2/f;->r(Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final v(Lwt2/p;Lvt2/h;Leb/u0;Lwt2/q;Lls2/b;ZLjava/lang/String;ZLcom/whoop/weeklyplan/weeklyplan/navigation/WeeklyPlanNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt2/p;",
            "Lvt2/h;",
            "Leb/u0;",
            "Lwt2/q;",
            "Lls2/b;",
            "Z",
            "Ljava/lang/String;",
            "Z",
            "Lcom/whoop/weeklyplan/weeklyplan/navigation/WeeklyPlanNavHostDestination;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move-object/from16 v6, p1

    move-object/from16 v9, p2

    move-object/from16 v1, p3

    move-object/from16 v5, p4

    move/from16 v11, p11

    move/from16 v12, p12

    const-string v0, "viewModel"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationRouter"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p10

    check-cast v10, Lp1/q;

    const v0, 0x3c4d3906

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v11, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v11

    goto :goto_1

    :cond_1
    move v0, v11

    :goto_1
    and-int/lit8 v2, v11, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit16 v2, v11, 0x180

    if-nez v2, :cond_5

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    and-int/lit16 v2, v11, 0xc00

    if-nez v2, :cond_7

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v0, v2

    :cond_7
    and-int/lit16 v2, v11, 0x6000

    if-nez v2, :cond_9

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    const/16 v2, 0x4000

    goto :goto_5

    :cond_8
    const/16 v2, 0x2000

    :goto_5
    or-int/2addr v0, v2

    :cond_9
    and-int/lit8 v2, v12, 0x20

    const/high16 v8, 0x30000

    if-eqz v2, :cond_b

    or-int/2addr v0, v8

    :cond_a
    move/from16 v8, p5

    goto :goto_7

    :cond_b
    and-int/2addr v8, v11

    if-nez v8, :cond_a

    move/from16 v8, p5

    invoke-virtual {v10, v8}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_c

    const/high16 v13, 0x20000

    goto :goto_6

    :cond_c
    const/high16 v13, 0x10000

    :goto_6
    or-int/2addr v0, v13

    :goto_7
    and-int/lit8 v13, v12, 0x40

    const/high16 v15, 0x180000

    if-eqz v13, :cond_e

    or-int/2addr v0, v15

    :cond_d
    move-object/from16 v15, p6

    goto :goto_9

    :cond_e
    and-int/2addr v15, v11

    if-nez v15, :cond_d

    move-object/from16 v15, p6

    invoke-virtual {v10, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_f

    const/high16 v16, 0x100000

    goto :goto_8

    :cond_f
    const/high16 v16, 0x80000

    :goto_8
    or-int v0, v0, v16

    :goto_9
    and-int/lit16 v14, v12, 0x80

    const/high16 v17, 0xc00000

    if-eqz v14, :cond_10

    or-int v0, v0, v17

    move/from16 v3, p7

    goto :goto_b

    :cond_10
    and-int v17, v11, v17

    move/from16 v3, p7

    if-nez v17, :cond_12

    invoke-virtual {v10, v3}, Lp1/q;->h(Z)Z

    move-result v18

    if-eqz v18, :cond_11

    const/high16 v18, 0x800000

    goto :goto_a

    :cond_11
    const/high16 v18, 0x400000

    :goto_a
    or-int v0, v0, v18

    :cond_12
    :goto_b
    and-int/lit16 v7, v12, 0x100

    const/high16 v19, 0x6000000

    if-eqz v7, :cond_13

    or-int v0, v0, v19

    goto :goto_f

    :cond_13
    and-int v19, v11, v19

    if-nez v19, :cond_16

    if-nez p8, :cond_14

    const/16 v19, -0x1

    :goto_c
    move/from16 v20, v0

    move/from16 v0, v19

    goto :goto_d

    :cond_14
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Enum;->ordinal()I

    move-result v19

    goto :goto_c

    :goto_d
    invoke-virtual {v10, v0}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_15

    const/high16 v0, 0x4000000

    goto :goto_e

    :cond_15
    const/high16 v0, 0x2000000

    :goto_e
    or-int v0, v20, v0

    goto :goto_f

    :cond_16
    move/from16 v20, v0

    :goto_f
    move/from16 v19, v0

    and-int/lit16 v0, v12, 0x200

    move/from16 v20, v0

    const/high16 v21, 0x30000000

    if-eqz v20, :cond_18

    or-int v19, v19, v21

    move-object/from16 v0, p9

    :cond_17
    :goto_10
    move/from16 v9, v19

    goto :goto_12

    :cond_18
    and-int v21, v11, v21

    move-object/from16 v0, p9

    if-nez v21, :cond_17

    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_19

    const/high16 v22, 0x20000000

    goto :goto_11

    :cond_19
    const/high16 v22, 0x10000000

    :goto_11
    or-int v19, v19, v22

    goto :goto_10

    :goto_12
    const v19, 0x12492493

    and-int v0, v9, v19

    const v1, 0x12492492

    const/16 v19, 0x1

    move/from16 v22, v2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1a

    move/from16 v0, v19

    goto :goto_13

    :cond_1a
    move v0, v2

    :goto_13
    and-int/lit8 v1, v9, 0x1

    invoke-virtual {v10, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2a

    if-eqz v22, :cond_1b

    move v0, v2

    goto :goto_14

    :cond_1b
    move v0, v8

    :goto_14
    if-eqz v13, :cond_1c

    const-string v1, ""

    move-object v15, v1

    :cond_1c
    if-eqz v14, :cond_1d

    move/from16 v3, v19

    :cond_1d
    if-eqz v7, :cond_1e

    sget-object v1, Lcom/whoop/weeklyplan/weeklyplan/navigation/WeeklyPlanNavHostDestination;->OVERVIEW:Lcom/whoop/weeklyplan/weeklyplan/navigation/WeeklyPlanNavHostDestination;

    move-object v13, v1

    goto :goto_15

    :cond_1e
    move-object/from16 v13, p8

    :goto_15
    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-eqz v20, :cond_20

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_1f

    new-instance v7, Lvs2/d;

    const/4 v8, 0x1

    invoke-direct {v7, v8}, Lvs2/d;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v8, v7

    goto :goto_16

    :cond_20
    move-object/from16 v8, p9

    :goto_16
    new-array v7, v2, [Ljava/lang/Object;

    const/high16 v14, 0x70000

    and-int/2addr v14, v9

    const/high16 v2, 0x20000

    if-ne v14, v2, :cond_21

    move/from16 v2, v19

    goto :goto_17

    :cond_21
    const/4 v2, 0x0

    :goto_17
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v2, :cond_22

    if-ne v14, v1, :cond_23

    :cond_22
    new-instance v14, Lc41/r1;

    const/4 v2, 0x3

    invoke-direct {v14, v0, v2}, Lc41/r1;-><init>(ZI)V

    invoke-virtual {v10, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    check-cast v14, Lc93/a;

    const/4 v2, 0x0

    invoke-static {v7, v14, v10, v2}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lp1/c1;

    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    and-int/lit16 v2, v9, 0x1c00

    move/from16 v18, v0

    const/16 v0, 0x800

    if-ne v2, v0, :cond_24

    move/from16 v0, v19

    goto :goto_18

    :cond_24
    const/4 v0, 0x0

    :goto_18
    const/high16 v2, 0x380000

    and-int/2addr v2, v9

    move/from16 p5, v0

    const/high16 v0, 0x100000

    if-ne v2, v0, :cond_25

    move/from16 v0, v19

    goto :goto_19

    :cond_25
    const/4 v0, 0x0

    :goto_19
    or-int v0, p5, v0

    const/high16 v2, 0x1c00000

    and-int/2addr v2, v9

    move/from16 p5, v0

    const/high16 v0, 0x800000

    if-ne v2, v0, :cond_26

    move/from16 v0, v19

    goto :goto_1a

    :cond_26
    const/4 v0, 0x0

    :goto_1a
    or-int v0, p5, v0

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    const/high16 v2, 0x70000000

    and-int/2addr v2, v9

    move/from16 p5, v0

    const/high16 v0, 0x20000000

    if-ne v2, v0, :cond_27

    goto :goto_1b

    :cond_27
    const/16 v19, 0x0

    :goto_1b
    or-int v0, p5, v19

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_29

    if-ne v2, v1, :cond_28

    goto :goto_1c

    :cond_28
    move-object v0, v2

    move-object v2, v15

    goto :goto_1d

    :cond_29
    :goto_1c
    new-instance v0, Lcom/whoop/bot/settings/e;

    move-object/from16 v1, p3

    move-object v2, v15

    invoke-direct/range {v0 .. v8}, Lcom/whoop/bot/settings/e;-><init>(Lwt2/q;Ljava/lang/String;ZLwt2/p;Lls2/b;Lvt2/h;Lp1/c1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1d
    check-cast v0, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v1, v9, 0x6

    and-int/lit8 v1, v1, 0xe

    const/4 v4, 0x0

    move-object/from16 p5, p2

    move-object/from16 p8, v0

    move/from16 p10, v1

    move-object/from16 p7, v4

    move-object/from16 p9, v10

    move-object/from16 p6, v14

    invoke-static/range {p5 .. p10}, Lhg3/i;->e(Leb/u0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v0, p9

    move-object v7, v2

    move-object v10, v8

    move-object v9, v13

    move/from16 v6, v18

    :goto_1e
    move v8, v3

    goto :goto_1f

    :cond_2a
    move-object v0, v10

    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move v6, v8

    move-object v7, v15

    goto :goto_1e

    :goto_1f
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_2b

    new-instance v0, Lam2/j0;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    invoke-direct/range {v0 .. v12}, Lam2/j0;-><init>(Lwt2/p;Lvt2/h;Leb/u0;Lwt2/q;Lls2/b;ZLjava/lang/String;ZLcom/whoop/weeklyplan/weeklyplan/navigation/WeeklyPlanNavHostDestination;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_2b
    return-void
.end method

.method private static final w(Z)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Z)Lp1/c1;
    .locals 0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-static {p0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p0

    return-object p0
.end method

.method private static final y(Lp1/c1;)Z
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

.method private static final z(Lp1/c1;Z)V
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
