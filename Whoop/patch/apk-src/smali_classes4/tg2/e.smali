.class public final Ltg2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Ltg2/m;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0012\u00b2\u0006\u000c\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Ltg2/e;",
        "Lm91/f;",
        "Ltg2/m;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Ltg2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Ltg2/l;",
        "pickerViewModel",
        "Ln82/c;",
        "pickerViewState",
        "start-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ltg2/e;Landroidx/compose/ui/Modifier;Ltg2/m;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ltg2/e;->g(Ltg2/e;Landroidx/compose/ui/Modifier;Ltg2/m;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ltg2/m;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ltg2/e;->f(Lkotlin/jvm/functions/Function1;Ltg2/m;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ll83/h;)Ltg2/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Ltg2/l;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ltg2/l;

    return-object p0
.end method

.method private static final e(Lp1/t2;)Ln82/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Ln82/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln82/c;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Ltg2/m;Ljava/lang/String;)Ll83/a0;
    .locals 7

    const-string v0, "internalName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ltg2/k;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/whoop/navigation/e;

    sget-object v2, Lcom/whoop/navigation/AppScreen$w5;->w:Lcom/whoop/navigation/AppScreen$w5;

    new-instance v3, Lcom/whoop/navigation/StressInterventionModel;

    invoke-direct {v3, p2}, Lcom/whoop/navigation/StressInterventionModel;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lcom/whoop/design/item/DesignItemInteraction;

    sget-object p2, Lcom/whoop/whoopaction/domain/models/DismissModalAction;->INSTANCE:Lcom/whoop/whoopaction/domain/models/DismissModalAction;

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Lcom/whoop/design/item/DesignItemInteraction;-><init>(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ltg2/m;->b()Z

    move-result p1

    const/4 v0, 0x1

    invoke-static {p2, p1, v0}, Lng2/d;->b(Ljava/lang/String;ZZ)Lcom/whoop/design/item/DesignItemInteraction;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Ltg2/e;Landroidx/compose/ui/Modifier;Ltg2/m;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Ltg2/e;->c(Landroidx/compose/ui/Modifier;Ltg2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic h(Ll83/h;)Ltg2/l;
    .locals 0

    invoke-static {p0}, Ltg2/e;->d(Ll83/h;)Ltg2/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Ltg2/m;

    invoke-virtual/range {p0 .. p5}, Ltg2/e;->c(Landroidx/compose/ui/Modifier;Ltg2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Ltg2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ltg2/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move/from16 v1, p5

    const-string v0, "modifier"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, 0x52baffa3

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
    and-int/lit8 v2, v1, 0x30

    const/16 v3, 0x20

    if-nez v2, :cond_3

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit16 v2, v1, 0x180

    const/16 v13, 0x100

    if-nez v2, :cond_5

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move v2, v13

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    and-int/lit16 v2, v0, 0x93

    const/16 v7, 0x92

    const/4 v15, 0x0

    if-eq v2, v7, :cond_6

    const/4 v2, 0x1

    goto :goto_4

    :cond_6
    move v2, v15

    :goto_4
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v10, v7, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_15

    const v2, -0x649fae96

    invoke-virtual {v10, v2}, Lp1/q;->f0(I)V

    sget-object v2, Lpf3/a;->b:Lnf3/a;

    if-eqz v2, :cond_14

    iget-object v2, v2, Lnf3/a;->a:Lwf3/a;

    iget-object v2, v2, Lwf3/a;->d:Lxf3/c;

    const v7, -0x649fad62

    const v8, -0x384098

    invoke-static {v10, v7, v10, v15, v8}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v10, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v10, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v9, v11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_7

    if-ne v11, v12, :cond_8

    :cond_7
    sget-object v9, Ll83/i;->y:Ll83/i;

    new-instance v11, Ltg2/e$a;

    invoke-direct {v11, v2, v8, v8, v7}, Ltg2/e$a;-><init>(Lxf3/c;Lvf3/a;Lc93/a;Ljf3/a;)V

    invoke-static {v9, v11}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v11

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    move-object v2, v11

    check-cast v2, Ll83/h;

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    invoke-static {v2}, Ltg2/e;->d(Ll83/h;)Ltg2/l;

    move-result-object v7

    invoke-virtual {v7}, Ltg2/l;->getViewState()Lec3/l;

    move-result-object v7

    new-instance v16, Ln82/c;

    const/16 v27, 0x3ff

    const/16 v28, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v16 .. v28}, Ln82/c;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ln82/a;Lcom/whoop/design/util/TextResource;Ljava/lang/Boolean;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v17, Ln82/c;->k:I

    shl-int/lit8 v11, v17, 0x3

    move-object v9, v12

    const/4 v12, 0x2

    move-object/from16 v18, v9

    const/4 v9, 0x0

    move-object v15, v8

    move-object/from16 v8, v16

    move-object/from16 v14, v18

    invoke-static/range {v7 .. v12}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v14, :cond_9

    new-instance v8, Ltg2/h;

    invoke-direct {v8}, Ltg2/h;-><init>()V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v8, Ltg2/h;

    invoke-static {v7}, Ltg2/e;->e(Lp1/t2;)Ln82/c;

    move-result-object v9

    invoke-virtual {v5}, Ltg2/m;->a()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v10, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v9, v11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_a

    if-ne v11, v14, :cond_b

    :cond_a
    invoke-static {v7}, Ltg2/e;->e(Lp1/t2;)Ln82/c;

    move-result-object v7

    invoke-virtual {v5}, Ltg2/m;->a()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v7, v9}, Ltg2/h;->a(Ln82/c;Ljava/lang/String;)Ln82/c;

    move-result-object v11

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v7, v11

    check-cast v7, Ln82/c;

    invoke-virtual {v5}, Ltg2/m;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_c

    if-ne v11, v14, :cond_d

    :cond_c
    new-instance v11, Ltg2/e$b;

    invoke-direct {v11, v2, v15}, Ltg2/e$b;-><init>(Ll83/h;Lq83/d;)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v11, Lc93/m;

    invoke-static {v10, v11, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {}, Ltg2/d;->t()Lp1/t1;

    move-result-object v9

    invoke-virtual {v10, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    invoke-static {v2}, Ltg2/e;->d(Ll83/h;)Ltg2/l;

    move-result-object v2

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v9, :cond_e

    if-ne v12, v14, :cond_f

    :cond_e
    new-instance v12, Ltg2/e$c;

    invoke-direct {v12, v2}, Ltg2/e$c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v12, Lkotlin/jvm/functions/Function1;

    and-int/lit16 v2, v0, 0x380

    if-ne v2, v13, :cond_10

    const/4 v2, 0x1

    goto :goto_5

    :cond_10
    const/4 v2, 0x0

    :goto_5
    and-int/lit8 v0, v0, 0x70

    if-ne v0, v3, :cond_11

    const/16 v16, 0x1

    goto :goto_6

    :cond_11
    const/16 v16, 0x0

    :goto_6
    or-int v0, v2, v16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_12

    if-ne v2, v14, :cond_13

    :cond_12
    new-instance v2, Lsg2/t;

    const/16 v0, 0x11

    invoke-direct {v2, v0, v6, v5}, Lsg2/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object v9, v2

    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v14, 0x0

    move-object v13, v10

    move-object v10, v8

    move-object v8, v12

    move-object v12, v13

    move/from16 v13, v17

    invoke-static/range {v7 .. v14}, Ltg2/j;->l(Ln82/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    goto :goto_7

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_16

    new-instance v0, Lsu1/d;

    const/16 v2, 0x1c

    move-object/from16 v3, p0

    invoke-direct/range {v0 .. v6}, Lsu1/d;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method
