.class public abstract Lcom/whoop/membership/familyPlan/navigation/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aE\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0010\u00b2\u0006\u000c\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Luw1/f;",
        "viewModel",
        "Leb/u0;",
        "navController",
        "Landroidx/lifecycle/g0;",
        "viewLifecycleOwner",
        "Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;",
        "startDestination",
        "Lkotlin/Function1;",
        "Lww1/c;",
        "Ll83/a0;",
        "onEvent",
        "e",
        "(Luw1/f;Leb/u0;Landroidx/lifecycle/g0;Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Luw1/g;",
        "viewState",
        "membership_release"
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
.method public static synthetic a(Luw1/f;Leb/u0;Landroidx/lifecycle/g0;Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/whoop/membership/familyPlan/navigation/a;->j(Luw1/f;Leb/u0;Landroidx/lifecycle/g0;Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Luw1/f;Lkotlin/jvm/functions/Function1;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/whoop/membership/familyPlan/navigation/a;->i(Luw1/f;Lkotlin/jvm/functions/Function1;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Luw1/f;Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/s0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/membership/familyPlan/navigation/a;->g(Luw1/f;Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/s0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Luw1/f;Lkotlin/jvm/functions/Function1;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/whoop/membership/familyPlan/navigation/a;->h(Luw1/f;Lkotlin/jvm/functions/Function1;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Luw1/f;Leb/u0;Landroidx/lifecycle/g0;Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luw1/f;",
            "Leb/u0;",
            "Landroidx/lifecycle/g0;",
            "Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p4

    move/from16 v15, p6

    const-string v3, "viewModel"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "navController"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "viewLifecycleOwner"

    move-object/from16 v4, p2

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onEvent"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p5

    check-cast v8, Lp1/q;

    const v3, -0x68ecd1fb

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v15, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v15

    goto :goto_1

    :cond_1
    move v3, v15

    :goto_1
    and-int/lit8 v5, v15, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit16 v5, v15, 0xc00

    if-nez v5, :cond_6

    and-int/lit8 v5, p7, 0x8

    if-nez v5, :cond_4

    move-object/from16 v5, p3

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x800

    goto :goto_3

    :cond_4
    move-object/from16 v5, p3

    :cond_5
    const/16 v6, 0x400

    :goto_3
    or-int/2addr v3, v6

    goto :goto_4

    :cond_6
    move-object/from16 v5, p3

    :goto_4
    and-int/lit16 v6, v15, 0x6000

    const/16 v11, 0x4000

    if-nez v6, :cond_8

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    move v6, v11

    goto :goto_5

    :cond_7
    const/16 v6, 0x2000

    :goto_5
    or-int/2addr v3, v6

    :cond_8
    and-int/lit16 v6, v3, 0x2413

    const/16 v7, 0x2412

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v6, v7, :cond_9

    move v6, v13

    goto :goto_6

    :cond_9
    move v6, v12

    :goto_6
    and-int/lit8 v7, v3, 0x1

    invoke-virtual {v8, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-virtual {v8}, Lp1/q;->Z()V

    and-int/lit8 v6, v15, 0x1

    if-eqz v6, :cond_c

    invoke-virtual {v8}, Lp1/q;->C()Z

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_8

    :cond_a
    invoke-virtual {v8}, Lp1/q;->X()V

    and-int/lit8 v6, p7, 0x8

    if-eqz v6, :cond_b

    :goto_7
    and-int/lit16 v3, v3, -0x1c01

    :cond_b
    move-object/from16 v16, v5

    goto :goto_9

    :cond_c
    :goto_8
    and-int/lit8 v6, p7, 0x8

    if-eqz v6, :cond_b

    sget-object v5, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$a;->a:Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$a;

    goto :goto_7

    :goto_9
    invoke-virtual {v8}, Lp1/q;->r()V

    invoke-virtual {v1}, Luw1/f;->getViewState()Lec3/l;

    move-result-object v5

    new-instance v6, Luw1/g;

    const/4 v7, 0x0

    const/4 v14, 0x3

    invoke-direct {v6, v7, v7, v14, v7}, Luw1/g;-><init>(Luw1/c;Luw1/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/4 v10, 0x2

    invoke-static/range {v5 .. v10}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v5

    move v6, v3

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;->getBaseRoute$membership_release()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    const v9, 0xe000

    and-int/2addr v9, v6

    if-ne v9, v11, :cond_d

    move v12, v13

    :cond_d
    or-int/2addr v7, v12

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_e

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v9, v7, :cond_f

    :cond_e
    new-instance v9, Ls90/f;

    const/16 v7, 0xc

    invoke-direct {v9, v1, v0, v5, v7}, Ls90/f;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v11, v9

    check-cast v11, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v5, v6, 0x3

    and-int/lit8 v13, v5, 0xe

    const/16 v14, 0x3fc

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v12, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v2 .. v14}, Lhg3/i;->d(Leb/u0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v12

    move-object/from16 v4, v16

    goto :goto_a

    :cond_10
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v4, v5

    :goto_a
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_11

    new-instance v0, Lj81/e;

    const/16 v8, 0x18

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v7, p7

    move v6, v15

    invoke-direct/range {v0 .. v8}, Lj81/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final f(Lp1/t2;)Luw1/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Luw1/g;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Luw1/g;

    return-object p0
.end method

.method private static final g(Luw1/f;Lkotlin/jvm/functions/Function1;Lp1/t2;Leb/s0;)Ll83/a0;
    .locals 11

    const-string v0, "$this$NavHost"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$a;->a:Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$a;

    invoke-virtual {v0}, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;->getBaseRoute$membership_release()Ljava/lang/String;

    move-result-object v2

    new-instance v0, Ltw1/b;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, p2, v3}, Ltw1/b;-><init>(Luw1/f;Lkotlin/jvm/functions/Function1;Lp1/t2;I)V

    new-instance v8, Lx1/b;

    const/4 v10, 0x1

    const v3, 0x18ed1768

    invoke-direct {v8, v0, v10, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/16 v9, 0xfe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p3

    invoke-static/range {v1 .. v9}, Le93/b;->t(Leb/s0;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lx1/b;I)V

    sget-object v0, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$b;->a:Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination$b;

    invoke-virtual {v0}, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;->getRoute()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;->getArgs()Ljava/util/List;

    move-result-object v3

    new-instance v0, Ltw1/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p2, v1}, Ltw1/b;-><init>(Luw1/f;Lkotlin/jvm/functions/Function1;Lp1/t2;I)V

    new-instance v8, Lx1/b;

    const p0, -0x61e921e1

    invoke-direct {v8, v0, v10, p0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/16 v9, 0xfc

    move-object v1, p3

    invoke-static/range {v1 .. v9}, Le93/b;->t(Leb/s0;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lx1/b;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Luw1/f;Lkotlin/jvm/functions/Function1;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p6, "$this$composable"

    invoke-static {p3, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "it"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p5, Lp1/q;

    invoke-virtual {p5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {p5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    if-nez p3, :cond_0

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p4, p3, :cond_1

    :cond_0
    new-instance p4, Lcom/whoop/membership/familyPlan/navigation/a$a;

    const/4 p3, 0x0

    invoke-direct {p4, p1, p3}, Lcom/whoop/membership/familyPlan/navigation/a$a;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {p5, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p4, Lc93/m;

    invoke-static {p5, p4, p0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p2}, Lcom/whoop/membership/familyPlan/navigation/a;->f(Lp1/t2;)Luw1/g;

    move-result-object p0

    invoke-virtual {p0}, Luw1/g;->b()Luw1/c;

    move-result-object p0

    const/4 p2, 0x0

    invoke-static {p0, p1, p5, p2}, Lyw1/i;->G(Luw1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Luw1/f;Lkotlin/jvm/functions/Function1;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    const-string p6, "$this$composable"

    invoke-static {p3, p6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "backStackEntry"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4}, Leb/q;->a()Landroid/os/Bundle;

    move-result-object p3

    const/4 p4, 0x0

    if-eqz p3, :cond_0

    const-string p6, "isNewMember"

    invoke-virtual {p3, p6}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p3

    goto :goto_0

    :cond_0
    move p3, p4

    :goto_0
    check-cast p5, Lp1/q;

    invoke-virtual {p5, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p6

    invoke-virtual {p5, p3}, Lp1/q;->h(Z)Z

    move-result v0

    or-int/2addr p6, v0

    invoke-virtual {p5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p6, :cond_1

    sget-object p6, Lp1/l;->a:Lp1/v0;

    if-ne v0, p6, :cond_2

    :cond_1
    new-instance v0, Lcom/whoop/membership/familyPlan/navigation/a$b;

    const/4 p6, 0x0

    invoke-direct {v0, p1, p3, p6}, Lcom/whoop/membership/familyPlan/navigation/a$b;-><init>(Lkotlin/jvm/functions/Function1;ZLq83/d;)V

    invoke-virtual {p5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lc93/m;

    invoke-static {p5, v0, p0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p2}, Lcom/whoop/membership/familyPlan/navigation/a;->f(Lp1/t2;)Luw1/g;

    move-result-object p0

    invoke-virtual {p0}, Luw1/g;->a()Luw1/d;

    move-result-object p0

    invoke-static {p0, p1, p5, p4}, Lyw1/m;->m(Luw1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Luw1/f;Leb/u0;Landroidx/lifecycle/g0;Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v7}, Lcom/whoop/membership/familyPlan/navigation/a;->e(Luw1/f;Leb/u0;Landroidx/lifecycle/g0;Lcom/whoop/membership/familyPlan/navigation/FamilyPlanNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
