.class public abstract Llb1/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/n0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ComparisonTableCell;",
        "Lz01/d$a;",
        "q",
        "(Lcom/whoop/design/models/items/ComparisonTableCell;)Lz01/d$a;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "p",
        "()Llb1/y0;",
        "comparisonMapper",
        "design-models_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/i0;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/n0;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/ComparisonTableModel;)Lz01/d;
    .locals 0

    invoke-static {p0}, Llb1/n0;->o(Lcom/whoop/design/models/items/ComparisonTableModel;)Lz01/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/n0;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/StrainBreakDownModel;)Ly01/c;
    .locals 0

    invoke-static {p0}, Llb1/n0;->g(Lcom/whoop/design/models/items/StrainBreakDownModel;)Ly01/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/n0;->i(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/design/models/items/MembershipComparisonTableModel;)Lq21/i;
    .locals 0

    invoke-static {p0}, Llb1/n0;->h(Lcom/whoop/design/models/items/MembershipComparisonTableModel;)Lq21/i;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/i0;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/items/StrainBreakDownModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/n0$f;

    invoke-direct {v3, v0}, Llb1/n0$f;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/i0;

    const/16 v2, 0xd

    invoke-direct {v0, v2}, Llb1/i0;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/MembershipComparisonTableModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/n0$g;

    invoke-direct {v3, v0}, Llb1/n0$g;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/i0;

    const/16 v2, 0xe

    invoke-direct {v0, v2}, Llb1/i0;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/ComparisonTableModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/n0$h;

    invoke-direct {v2, v0}, Llb1/n0$h;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/StrainBreakDownModel;)Ly01/c;
    .locals 14

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/StrainBreakDownModel;->getCardioTotalPercent()D

    move-result-wide v0

    const/16 v2, 0x64

    int-to-double v2, v2

    mul-double/2addr v0, v2

    sub-double/2addr v2, v0

    new-instance v4, Ly01/c;

    new-instance v5, Ll83/k;

    double-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    double-to-float v1, v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-direct {v5, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/StrainBreakDownModel;->getCardioTitleDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/StrainBreakDownModel;->getMskTitleDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/StrainBreakDownModel;->getCardioPercentDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/StrainBreakDownModel;->getMskPercentDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const/16 v12, 0x60

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v4 .. v13}, Ly01/c;-><init>(Ll83/k;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method

.method private static final h(Lcom/whoop/design/models/items/MembershipComparisonTableModel;)Lq21/i;
    .locals 43

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/m;

    const/16 v2, 0x9

    invoke-direct {v0, v2}, Llb1/m;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->getPlans()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/MembershipPlan;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/MembershipPlan;->isHighlighted()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, -0x1

    :goto_1
    sget-object v2, Lq21/e;->h:Lq21/e$c;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->getPlans()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/MembershipPlan;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/MembershipPlan;->getStyle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v2

    sget-object v5, Lq21/d$a;->a:Lq21/d$a;

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->getPlans()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v6, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/design/models/items/MembershipPlan;

    invoke-virtual {v9}, Lcom/whoop/design/models/items/MembershipPlan;->getHeader()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_2

    new-instance v10, Lq21/d$g;

    invoke-direct {v10, v9}, Lq21/d$g;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_2
    sget-object v10, Lq21/d$a;->a:Lq21/d$a;

    :goto_3
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-static {v5, v7}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v5

    sget-object v6, Lq21/d$a;->a:Lq21/d$a;

    invoke-static {v6}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->getPlans()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v7, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/design/models/items/MembershipPlan;

    invoke-static {v10}, Llb1/n0;->l(Lcom/whoop/design/models/items/MembershipPlan;)Lq21/d;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    invoke-static {v6, v9}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v6

    new-instance v7, Lq21/d$f;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->getPriceLabel()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v7, v9}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    invoke-static {v7}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->getPlans()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v9, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/design/models/items/MembershipPlan;

    new-instance v12, Lq21/d$e;

    invoke-virtual {v11}, Lcom/whoop/design/models/items/MembershipPlan;->getPrice()Ljava/lang/String;

    move-result-object v13

    invoke-static {v11}, Llb1/n0;->m(Lcom/whoop/design/models/items/MembershipPlan;)Lq21/e;

    move-result-object v11

    invoke-direct {v12, v13, v11}, Lq21/d$e;-><init>(Ljava/lang/String;Lq21/e;)V

    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_5
    invoke-static {v7, v10}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->getFeatures()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v9, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v11, 0x0

    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_d

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    add-int/lit8 v15, v11, 0x1

    if-ltz v11, :cond_c

    check-cast v12, Ljava/lang/String;

    const/16 v16, 0x0

    new-instance v3, Lq21/d$f;

    invoke-direct {v3, v12}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->getPlans()Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/lang/Iterable;

    const/16 v17, 0x1

    new-instance v13, Ljava/util/ArrayList;

    const/16 v18, 0x0

    invoke-static {v12, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    move/from16 v14, v16

    :goto_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_b

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    add-int/lit8 v20, v14, 0x1

    if-ltz v14, :cond_a

    move-object/from16 v8, v19

    check-cast v8, Lcom/whoop/design/models/items/MembershipPlan;

    if-ne v14, v4, :cond_6

    move/from16 v1, v17

    goto :goto_8

    :cond_6
    move/from16 v1, v16

    :goto_8
    if-nez v11, :cond_7

    if-nez v14, :cond_7

    invoke-static {v8, v1}, Llb1/n0;->j(Lcom/whoop/design/models/items/MembershipPlan;Z)Lq21/d;

    move-result-object v1

    goto :goto_9

    :cond_7
    if-nez v14, :cond_9

    invoke-static {v8}, Llb1/n0;->n(Lcom/whoop/design/models/items/MembershipPlan;)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {v8}, Llb1/n0;->k(Lcom/whoop/design/models/items/MembershipPlan;)Lq21/d;

    move-result-object v1

    goto :goto_9

    :cond_8
    new-instance v1, Lq21/d$f;

    const-string v8, "-"

    invoke-direct {v1, v8}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    goto :goto_9

    :cond_9
    invoke-static {v8, v1}, Llb1/n0;->j(Lcom/whoop/design/models/items/MembershipPlan;Z)Lq21/d;

    move-result-object v1

    :goto_9
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v8, 0xa

    move-object/from16 v1, p0

    move/from16 v14, v20

    goto :goto_7

    :cond_a
    invoke-static {}, Lwb3/f;->d0()V

    throw v18

    :cond_b
    invoke-static {v3, v13}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v8, 0xa

    move-object/from16 v1, p0

    move v11, v15

    goto/16 :goto_6

    :cond_c
    const/16 v18, 0x0

    invoke-static {}, Lwb3/f;->d0()V

    throw v18

    :cond_d
    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    add-int/lit8 v22, v4, 0x1

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/util/List;

    aput-object v5, v1, v16

    aput-object v6, v1, v17

    const/4 v3, 0x2

    aput-object v7, v1, v3

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1, v10}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v23

    invoke-virtual {v2}, Lq21/e;->c()Li2/t;

    move-result-object v24

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->getButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {v0, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.whoop.design.atomic.atom.button.CardButtonState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lny0/h;

    move-object/from16 v25, v0

    goto :goto_a

    :cond_e
    move-object/from16 v25, v18

    :goto_a
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/MembershipComparisonTableModel;->getSecondaryButton()Lcom/whoop/design/models/items/SecondaryButtonModel;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getText()Lcom/whoop/design/util/TextResource;

    move-result-object v27

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getAction()Lcom/whoop/navigation/e;

    move-result-object v28

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-static {v0}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v1, Ly71/g;

    move-object/from16 v2, v18

    invoke-direct {v1, v0, v2, v3, v2}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v30, v1

    goto :goto_b

    :cond_f
    move-object/from16 v2, v18

    move-object/from16 v30, v2

    :goto_b
    new-instance v26, Lny0/p0;

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x3ff4

    const/16 v42, 0x0

    invoke-direct/range {v26 .. v42}, Lny0/p0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly71/g;Ly71/g;Ly81/e;Lj91/b;ZLjava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lj02/s;Lk81/a;ZLny0/m0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_c

    :cond_10
    move-object/from16 v2, v18

    move-object/from16 v26, v2

    :goto_c
    new-instance v21, Lq21/i;

    const/16 v27, 0x0

    const/16 v28, 0x20

    const/16 v29, 0x0

    invoke-direct/range {v21 .. v29}, Lq21/i;-><init>(ILjava/util/List;Li2/t;Lny0/h;Lny0/p0;Lq21/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v21
.end method

.method private static final i(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lcom/whoop/design/models/items/MembershipPlan;Z)Lq21/d;
    .locals 10

    invoke-static {p0}, Llb1/n0;->m(Lcom/whoop/design/models/items/MembershipPlan;)Lq21/e;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MembershipPlan;->getStyle()Ljava/lang/String;

    move-result-object p0

    const-string v1, "ADVANCED_LABS"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    if-nez p1, :cond_0

    sget-object p0, Llb1/n0$b;->w:Llb1/n0$b;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    sget-object p0, Llb1/n0$c;->w:Llb1/n0$c;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v6

    const/16 v8, 0x5e

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lq21/e;->b(Lq21/e;Ly81/e;Li2/t;Li2/t;Lq21/f;Lt0/i;Ly81/e;Ly81/e;ILjava/lang/Object;)Lq21/e;

    move-result-object v0

    :cond_0
    new-instance p0, Lq21/d$c;

    sget-object p1, Lgz0/m0;->TINY_CHECKMARK:Lgz0/m0;

    invoke-direct {p0, p1, v0}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    return-object p0
.end method

.method private static final k(Lcom/whoop/design/models/items/MembershipPlan;)Lq21/d;
    .locals 12

    new-instance v0, Lq21/d$c;

    sget-object v1, Lgz0/m0;->CROSS:Lgz0/m0;

    invoke-static {p0}, Llb1/n0;->m(Lcom/whoop/design/models/items/MembershipPlan;)Lq21/e;

    move-result-object v2

    sget-object p0, Llb1/n0$d;->w:Llb1/n0$d;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    sget-object p0, Llb1/n0$e;->w:Llb1/n0$e;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v8

    const/16 v10, 0x5e

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v11}, Lq21/e;->b(Lq21/e;Ly81/e;Li2/t;Li2/t;Lq21/f;Lt0/i;Ly81/e;Ly81/e;ILjava/lang/Object;)Lq21/e;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    return-object v0
.end method

.method private static final l(Lcom/whoop/design/models/items/MembershipPlan;)Lq21/d;
    .locals 8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MembershipPlan;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lq21/d$d;

    new-instance v1, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MembershipPlan;->getIconUrl()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1}, Lq21/d$d;-><init>(Lkd1/o;)V

    return-object v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/MembershipPlan;->getPlanText()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Lq21/d$b;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MembershipPlan;->getPlanText()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-direct {v0, p0}, Lq21/d$b;-><init>(Lcom/whoop/design/util/TextResource;)V

    return-object v0

    :cond_3
    :goto_1
    sget-object p0, Lq21/d$a;->a:Lq21/d$a;

    return-object p0
.end method

.method private static final m(Lcom/whoop/design/models/items/MembershipPlan;)Lq21/e;
    .locals 1

    sget-object v0, Lq21/e;->h:Lq21/e$c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MembershipPlan;->getStyle()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Lcom/whoop/design/models/items/MembershipPlan;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/MembershipPlan;->getStyle()Ljava/lang/String;

    move-result-object p0

    const-string v0, "ADVANCED_LABS"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final o(Lcom/whoop/design/models/items/ComparisonTableModel;)Lz01/d;
    .locals 6

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ComparisonTableModel;->getRows()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v3, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/ComparisonTableCell;

    invoke-static {v5}, Llb1/n0;->q(Lcom/whoop/design/models/items/ComparisonTableCell;)Lz01/d$a;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    new-instance v3, Lz01/d$b;

    invoke-direct {v3, v4}, Lz01/d$b;-><init>(Ljava/util/List;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ComparisonTableModel;->getHighlightedColumns()Ljava/util/Set;

    move-result-object p0

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    const/4 v0, 0x0

    goto :goto_3

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz01/d$b;

    invoke-virtual {v2}, Lz01/d$b;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz01/d$b;

    invoke-virtual {v3}, Lz01/d$b;->a()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    move-result v4

    if-gez v4, :cond_3

    move-object v2, v3

    goto :goto_2

    :cond_4
    move-object v0, v2

    :goto_3
    const/4 v2, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_4

    :cond_5
    move v0, v2

    :goto_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    if-le v3, v4, :cond_6

    invoke-static {v1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz01/d$b;

    invoke-virtual {v3}, Lz01/d$b;->a()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lz01/d$a$a;

    if-eqz v3, :cond_6

    move v2, v4

    :cond_6
    new-instance v3, Lz01/d;

    invoke-direct {v3, p0, v1, v0, v2}, Lz01/d;-><init>(Ljava/util/Set;Ljava/util/List;IZ)V

    return-object v3
.end method

.method public static final p()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/n0;->a:Llb1/y0;

    return-object v0
.end method

.method private static final q(Lcom/whoop/design/models/items/ComparisonTableCell;)Lz01/d$a;
    .locals 10

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ComparisonTableCell;->getCellType()Lcom/whoop/design/models/items/ComparisonTableCell$CellType;

    move-result-object v0

    sget-object v1, Llb1/n0$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_8

    const/4 v1, 0x2

    const-string v2, ""

    if-eq v0, v1, :cond_6

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ComparisonTableCell;->getContent()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Lz01/d$a$b;

    invoke-direct {v0, p0}, Lz01/d$a$b;-><init>(Lgz0/m0;)V

    return-object v0

    :cond_0
    sget-object p0, Lz01/d$a$a;->a:Lz01/d$a$a;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_2
    new-instance v0, Lz01/d$a$c;

    new-instance v3, Lkd1/o$c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ComparisonTableCell;->getContent()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    move-object v4, v2

    goto :goto_0

    :cond_3
    move-object v4, p0

    :goto_0
    const/16 v8, 0xe

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v3}, Lz01/d$a$c;-><init>(Lkd1/o;)V

    return-object v0

    :cond_4
    new-instance v0, Lz01/d$a$d;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ComparisonTableCell;->getContent()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_5

    goto :goto_1

    :cond_5
    move-object v2, p0

    :goto_1
    invoke-direct {v0, v2}, Lz01/d$a$d;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_6
    new-instance v0, Lz01/d$a$e;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ComparisonTableCell;->getContent()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_7

    goto :goto_2

    :cond_7
    move-object v2, p0

    :goto_2
    invoke-direct {v0, v2}, Lz01/d$a$e;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_8
    sget-object p0, Lz01/d$a$a;->a:Lz01/d$a$a;

    return-object p0
.end method
