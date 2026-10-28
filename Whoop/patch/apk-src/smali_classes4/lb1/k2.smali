.class public abstract Llb1/k2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\nH\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\"\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/design/models/items/InsightsItemModel;",
        "model",
        "Lj21/i;",
        "f",
        "(Lcom/whoop/design/models/items/InsightsItemModel;)Lj21/i;",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "button",
        "Lny0/h;",
        "j",
        "(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;",
        "Lcom/whoop/design/models/items/InsightsItemListModel;",
        "Lj21/h;",
        "e",
        "(Lcom/whoop/design/models/items/InsightsItemListModel;)Lj21/h;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "d",
        "()Llb1/y0;",
        "insightsItemMapper",
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

    new-instance v0, Llb1/t1;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Llb1/t1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/k2;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/k2;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/InsightsItemListModel;)Lj21/h;
    .locals 0

    invoke-static {p0}, Llb1/k2;->i(Lcom/whoop/design/models/items/InsightsItemListModel;)Lj21/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/InsightsItemModel;)Lj21/i;
    .locals 0

    invoke-static {p0}, Llb1/k2;->h(Lcom/whoop/design/models/items/InsightsItemModel;)Lj21/i;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/k2;->a:Llb1/y0;

    return-object v0
.end method

.method public static final e(Lcom/whoop/design/models/items/InsightsItemListModel;)Lj21/h;
    .locals 2

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/InsightsItemListModel;->getItems()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/items/InsightsItemModel;

    invoke-static {v1}, Llb1/k2;->f(Lcom/whoop/design/models/items/InsightsItemModel;)Lj21/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lj21/h;

    invoke-direct {p0, v0}, Lj21/h;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method public static final f(Lcom/whoop/design/models/items/InsightsItemModel;)Lj21/i;
    .locals 20

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v2}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/InsightsItemModel;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/InsightsItemModel;->getTrend()Lcom/whoop/design/models/items/ImpactModel;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v3

    const-string v5, "null cannot be cast to non-null type com.whoop.design.atomic.atom.TrendViewState"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v3

    check-cast v5, Lhy0/c2;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/InsightsItemModel;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/design/models/items/InsightsItemModel;->getTitleColor()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v8

    array-length v9, v8

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v9, :cond_1

    aget-object v11, v8, v10

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_1
    move-object v11, v2

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/design/models/items/InsightsItemModel;->getTitleStyle()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-static {}, Lb91/c;->values()[Lb91/c;

    move-result-object v8

    array-length v9, v8

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v9, :cond_3

    aget-object v12, v8, v10

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_3
    move-object v12, v2

    :goto_3
    move-object v8, v12

    goto :goto_4

    :cond_4
    move-object v8, v2

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/design/models/items/InsightsItemModel;->getDescription()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/design/models/items/InsightsItemModel;->getActionRecommendation()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/design/models/items/InsightsItemModel;->getCallout()Lcom/whoop/design/models/InfoCalloutTileModel;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v0, v3}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v3

    const-string v12, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.InfoCalloutState"

    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lc41/p2;

    goto :goto_5

    :cond_5
    move-object v3, v2

    :goto_5
    invoke-virtual {v1}, Lcom/whoop/design/models/items/InsightsItemModel;->getActionButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v12

    if-eqz v12, :cond_6

    invoke-static {v12}, Llb1/k2;->j(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;

    move-result-object v12

    goto :goto_6

    :cond_6
    move-object v12, v2

    :goto_6
    invoke-virtual {v1}, Lcom/whoop/design/models/items/InsightsItemModel;->getRightIcon()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/design/models/items/InsightsItemModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/design/models/items/InsightsItemModel;->getTextAlignment()Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_a

    invoke-static {}, Lj21/j;->values()[Lj21/j;

    move-result-object v2

    array-length v7, v2

    const/4 v1, 0x0

    :goto_7
    if-ge v1, v7, :cond_8

    aget-object v18, v2, v1

    move/from16 v19, v1

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_8

    :cond_7
    add-int/lit8 v1, v19, 0x1

    goto :goto_7

    :cond_8
    const/16 v18, 0x0

    :goto_8
    if-nez v18, :cond_9

    goto :goto_a

    :cond_9
    :goto_9
    move-object/from16 v15, v18

    goto :goto_b

    :cond_a
    :goto_a
    sget-object v18, Lj21/j;->CENTER:Lj21/j;

    goto :goto_9

    :goto_b
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/InsightsItemModel;->getExpandableContent()Lcom/whoop/design/models/items/ExpandableContentModel;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v0, v1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    instance-of v1, v0, Lv51/c;

    if-eqz v1, :cond_b

    check-cast v0, Lv51/c;

    goto :goto_c

    :cond_b
    const/4 v0, 0x0

    :goto_c
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/InsightsItemModel;->getIconStyle()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_f

    invoke-static {}, Lj21/c;->values()[Lj21/c;

    move-result-object v2

    array-length v7, v2

    move-object/from16 v18, v0

    const/4 v0, 0x0

    :goto_d
    if-ge v0, v7, :cond_d

    aget-object v17, v2, v0

    move/from16 v19, v0

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    move-object/from16 v2, v17

    goto :goto_e

    :cond_c
    add-int/lit8 v0, v19, 0x1

    goto :goto_d

    :cond_d
    const/4 v2, 0x0

    :goto_e
    if-nez v2, :cond_e

    goto :goto_10

    :cond_e
    :goto_f
    move-object/from16 v17, v2

    move-object v7, v11

    move-object v11, v3

    goto :goto_11

    :cond_f
    move-object/from16 v18, v0

    :goto_10
    sget-object v2, Lj21/c;->MEDIUM:Lj21/c;

    goto :goto_f

    :goto_11
    new-instance v3, Lj21/i;

    move-object/from16 v16, v18

    invoke-direct/range {v3 .. v17}, Lj21/i;-><init>(Ljava/lang/String;Lhy0/c2;Ljava/lang/String;Ly81/f;Lb91/c;Ljava/lang/String;Ljava/lang/String;Lc41/p2;Lny0/h;Lgz0/m0;Lcom/whoop/navigation/e;Lj21/j;Lv51/c;Lj21/c;)V

    return-object v3
.end method

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/t1;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Llb1/t1;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/items/InsightsItemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/k2$a;

    invoke-direct {v3, v0}, Llb1/k2$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/t1;

    const/16 v2, 0x14

    invoke-direct {v0, v2}, Llb1/t1;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/InsightsItemListModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/k2$b;

    invoke-direct {v2, v0}, Llb1/k2$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/design/models/items/InsightsItemModel;)Lj21/i;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/k2;->f(Lcom/whoop/design/models/items/InsightsItemModel;)Lj21/i;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lcom/whoop/design/models/items/InsightsItemListModel;)Lj21/h;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/k2;->e(Lcom/whoop/design/models/items/InsightsItemListModel;)Lj21/h;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;
    .locals 28

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getCardName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getFeatureType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getStyle()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lny0/p;->DEFAULT:Lny0/p;

    invoke-static {}, Lny0/p;->values()[Lny0/p;

    move-result-object v4

    array-length v7, v4

    const/4 v8, 0x0

    :goto_0
    const/4 v9, 0x0

    if-ge v8, v7, :cond_1

    aget-object v10, v4, v8

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_1
    move-object v10, v9

    :goto_1
    if-nez v10, :cond_2

    move-object v7, v3

    goto :goto_2

    :cond_2
    move-object v7, v10

    :goto_2
    new-instance v8, Lcom/whoop/navigation/e;

    const/4 v14, 0x7

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v10, v8

    invoke-direct/range {v10 .. v15}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v9

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getId()Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->isEnabled()Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :goto_3
    move/from16 v17, v3

    goto :goto_4

    :cond_3
    const/4 v3, 0x1

    goto :goto_3

    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v20

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getDismissEvent()Lcom/whoop/navigation/DismissEventModel;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-static {v3}, Lj02/u;->a(Lcom/whoop/navigation/DismissEventModel;)Lj02/s;

    move-result-object v0

    :cond_4
    move-object/from16 v21, v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getGenericInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v23

    new-instance v0, Lny0/h;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const v26, 0x1a67e0c

    const/16 v27, 0x0

    invoke-direct/range {v0 .. v27}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
