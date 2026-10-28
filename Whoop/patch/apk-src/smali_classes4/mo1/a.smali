.class public final Lmo1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u0007*\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\'\u0010\u0019\u001a\u00020\u0018*\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\'\u0010\u001d\u001a\u00020\u001c*\u00020\u001b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lmo1/a;",
        "",
        "Lmo1/d;",
        "trackedBehaviorReducer",
        "<init>",
        "(Lmo1/d;)V",
        "Lio1/d$b;",
        "Llo1/c;",
        "h",
        "(Lio1/d$b;)Llo1/c;",
        "Lio1/d$e;",
        "Llo1/c$b;",
        "g",
        "(Lio1/d$e;)Llo1/c$b;",
        "Lio1/f;",
        "dialog",
        "i",
        "(Lio1/f;Llo1/c$b;)Llo1/c;",
        "",
        "",
        "b",
        "(Lio1/f;)Ljava/util/Map;",
        "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;",
        "selectionOverrides",
        "Le51/n;",
        "f",
        "(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Ljava/util/Map;)Le51/n;",
        "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;",
        "Le51/e;",
        "e",
        "(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;Ljava/util/Map;)Le51/e;",
        "domainResult",
        "d",
        "(Lio1/f;)Llo1/c;",
        "a",
        "Lmo1/d;",
        "Ljb1/a;",
        "Ljb1/a;",
        "defaultReducer",
        "hormonal-insights_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lmo1/d;

.field private final b:Ljb1/a;


# direct methods
.method public constructor <init>(Lmo1/d;)V
    .locals 1

    const-string v0, "trackedBehaviorReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmo1/a;->a:Lmo1/d;

    new-instance p1, Lmm1/h;

    const/16 v0, 0x14

    invoke-direct {p1, v0}, Lmm1/h;-><init>(I)V

    invoke-static {p1}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p1

    iput-object p1, p0, Lmo1/a;->b:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmo1/a;->c(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final b(Lio1/f;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio1/f;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    invoke-virtual {p1}, Lio1/f;->g()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "menstruation"

    invoke-virtual {v0, v2, v1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    :cond_0
    invoke-virtual {p1}, Lio1/f;->c()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v1, "cervical_mucus"

    invoke-virtual {v0, v1, p1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object p1

    return-object p1
.end method

.method private static final c(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final e(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;Ljava/util/Map;)Le51/e;
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Le51/e;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/16 v7, 0xa

    if-eqz v6, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v8, v6, Lcom/whoop/design/models/items/TrackedBehaviorModel;

    if-eqz v8, :cond_1

    iget-object v7, v0, Lmo1/a;->a:Lmo1/d;

    check-cast v6, Lcom/whoop/design/models/items/TrackedBehaviorModel;

    invoke-virtual {v7, v6}, Lmo1/d;->h(Lcom/whoop/design/models/items/TrackedBehaviorModel;)Lw71/t;

    move-result-object v6

    goto/16 :goto_2

    :cond_1
    instance-of v8, v6, Lcom/whoop/design/models/items/SelectableCellListModel;

    if-eqz v8, :cond_3

    move-object v9, v6

    check-cast v9, Lcom/whoop/design/models/items/SelectableCellListModel;

    invoke-virtual {v9}, Lcom/whoop/design/models/items/SelectableCellListModel;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v1, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v9}, Lcom/whoop/design/models/items/SelectableCellListModel;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v9}, Lcom/whoop/design/models/items/SelectableCellListModel;->getCells()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v8, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v13, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v14, v8

    check-cast v14, Lcom/whoop/design/models/items/SelectableCellModel;

    invoke-virtual {v14}, Lcom/whoop/design/models/items/SelectableCellModel;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v22

    const v33, 0x3ff7f

    const/16 v34, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-static/range {v14 .. v34}, Lcom/whoop/design/models/items/SelectableCellModel;->copy$default(Lcom/whoop/design/models/items/SelectableCellModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;Ljava/util/List;Ljava/lang/String;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/SelectableCellModel;

    move-result-object v8

    invoke-interface {v13, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    const/16 v22, 0xff7

    const/16 v23, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v9 .. v23}, Lcom/whoop/design/models/items/SelectableCellListModel;->copy$default(Lcom/whoop/design/models/items/SelectableCellListModel;Ljava/lang/String;IILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SelectableCellListSearchBehavior;ZLjava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/SelectableCellListModel;

    move-result-object v6

    iget-object v7, v0, Lmo1/a;->b:Ljb1/a;

    invoke-virtual {v7, v6}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v6

    goto :goto_2

    :cond_3
    iget-object v7, v0, Lmo1/a;->b:Ljb1/a;

    invoke-virtual {v7, v6}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v6

    :goto_2
    if-eqz v6, :cond_0

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_4
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v3, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm91/u;

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lv41/g0;->l(Lm91/u;Z)Lm91/u;

    move-result-object v2

    invoke-interface {v6, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getSpacingType()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    const-string v1, ""

    :cond_6
    sget-object v2, Le51/d;->NORMAL:Le51/d;

    invoke-static {}, Le51/d;->values()[Le51/d;

    move-result-object v3

    array-length v7, v3

    const/4 v8, 0x0

    :goto_4
    if-ge v8, v7, :cond_8

    aget-object v9, v3, v8

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    goto :goto_5

    :cond_7
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_8
    const/4 v9, 0x0

    :goto_5
    if-nez v9, :cond_9

    move-object v7, v2

    goto :goto_6

    :cond_9
    move-object v7, v9

    :goto_6
    invoke-static/range {p1 .. p1}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelMappingKt;->resolveTitleTypography(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Lb91/c;

    move-result-object v8

    invoke-static/range {p1 .. p1}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelMappingKt;->resolveAnchorSectionHeaderState(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Lp31/p$a;

    move-result-object v9

    invoke-static/range {p1 .. p1}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelMappingKt;->resolveLeadingPadding(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)F

    move-result v10

    invoke-static/range {p1 .. p1}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelMappingKt;->resolveTrailingPadding(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)F

    move-result v11

    new-instance v3, Le51/e;

    const/4 v12, 0x0

    invoke-direct/range {v3 .. v12}, Le51/e;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Le51/d;Lb91/c;Lp31/p$a;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method private final f(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Ljava/util/Map;)Le51/n;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Le51/n;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getTags()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;

    new-instance v4, Le51/p;

    invoke-virtual {v3}, Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;->getNameDisplay()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;->getId()Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Le51/p;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;

    invoke-direct {p0, v1, p2}, Lmo1/a;->e(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;Ljava/util/Map;)Le51/e;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getTags()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;->getId()Ljava/lang/String;

    move-result-object p1

    :goto_2
    move-object v4, p1

    goto :goto_3

    :cond_2
    const/4 p1, 0x0

    goto :goto_2

    :goto_3
    new-instance v1, Le51/n;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v8}, Le51/n;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Le51/m;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final g(Lio1/d$e;)Llo1/c$b;
    .locals 13

    instance-of p1, p1, Lio1/d$a;

    if-eqz p1, :cond_0

    const-string p1, "title"

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string p1, "description"

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string p1, "Confirm"

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string p1, "Cancel"

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget-object v8, Lj11/p;->LOTTIE:Lj11/p;

    new-instance v0, Llo1/c$b;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v12}, Llo1/c$b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Llo1/a;Llo1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final h(Lio1/d$b;)Llo1/c;
    .locals 10

    instance-of v0, p1, Lio1/d$c;

    if-eqz v0, :cond_0

    new-instance v1, Llo1/c;

    new-instance v2, Llo1/c$a;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Llo1/c$a;-><init>(Lsz0/q0;Llo1/a;Llo1/a;Llo1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Llo1/c;-><init>(Llo1/c$b;Llo1/c$a;Llo1/c$e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lio1/d$d;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    new-instance v2, Llo1/c;

    new-instance v3, Llo1/c$a;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v4

    new-instance v5, Llo1/a$g;

    invoke-direct {v5, v1}, Llo1/a$g;-><init>(Ljava/lang/String;)V

    sget-object v7, Llo1/a$d;->a:Llo1/a$d;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v9}, Llo1/c$a;-><init>(Lsz0/q0;Llo1/a;Llo1/a;Llo1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x5

    const/4 v7, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Llo1/c;-><init>(Llo1/c$b;Llo1/c$a;Llo1/c$e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_1
    instance-of v0, p1, Lio1/d$f;

    if-eqz v0, :cond_2

    new-instance v2, Llo1/c;

    new-instance v3, Llo1/c$a;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v4

    new-instance v5, Llo1/a$g;

    invoke-direct {v5, v1}, Llo1/a$g;-><init>(Ljava/lang/String;)V

    sget-object v7, Llo1/a$d;->a:Llo1/a$d;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v9}, Llo1/c$a;-><init>(Lsz0/q0;Llo1/a;Llo1/a;Llo1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v6, 0x5

    const/4 v7, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Llo1/c;-><init>(Llo1/c$b;Llo1/c$a;Llo1/c$e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_2
    instance-of p1, p1, Lio1/d$g;

    if-eqz p1, :cond_3

    new-instance v0, Llo1/c;

    new-instance v1, Llo1/c$a;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->g()Lsz0/q0;

    move-result-object v2

    sget-object v3, Llo1/a$d;->a:Llo1/a$d;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v5, v3

    invoke-direct/range {v1 .. v7}, Llo1/c$a;-><init>(Lsz0/q0;Llo1/a;Llo1/a;Llo1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x5

    const/4 v5, 0x0

    move-object v2, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Llo1/c;-><init>(Llo1/c$b;Llo1/c$a;Llo1/c$e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final i(Lio1/f;Llo1/c$b;)Llo1/c;
    .locals 23

    invoke-virtual/range {p1 .. p1}, Lio1/f;->h()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->getNavigationBar()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->getNavigationBar()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;->getRightButton()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBarButton;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBarButton;->getIcon()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v6, v5

    move v7, v4

    :goto_0
    if-ge v7, v6, :cond_1

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    move-object v1, v8

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    new-instance v3, Llo1/c$d;

    invoke-direct {v3, v1}, Llo1/c$d;-><init>(Lgz0/m0;)V

    move-object v1, v3

    :cond_2
    new-instance v6, Llo1/c$c;

    invoke-direct {v6, v2, v1}, Llo1/c$c;-><init>(Ljava/lang/String;Llo1/c$d;)V

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->getCategorySelector()Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    move-result-object v1

    invoke-direct/range {p0 .. p1}, Lmo1/a;->b(Lio1/f;)Ljava/util/Map;

    move-result-object v2

    move-object/from16 v3, p0

    invoke-direct {v3, v1, v2}, Lmo1/a;->f(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Ljava/util/Map;)Le51/n;

    move-result-object v8

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->getStyle()Lcom/whoop/design/models/items/CyclePhaseStyle;

    move-result-object v9

    new-instance v10, Lny0/a0;

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->getPrimaryButton()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;->getTextDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const/16 v21, 0x3fe

    const/16 v22, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v10 .. v22}, Lny0/a0;-><init>(Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lio1/f;->f()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual/range {p1 .. p1}, Lio1/f;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v4, 0x1

    :cond_3
    move v11, v4

    new-instance v5, Llo1/c$e;

    invoke-direct/range {v5 .. v11}, Llo1/c$e;-><init>(Llo1/c$c;Ljava/lang/String;Le51/n;Lcom/whoop/design/models/items/CyclePhaseStyle;Lny0/a0;Z)V

    move-object v9, v5

    goto :goto_2

    :cond_4
    move-object/from16 v3, p0

    move-object v9, v1

    :goto_2
    new-instance v6, Llo1/c;

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object/from16 v7, p2

    invoke-direct/range {v6 .. v11}, Llo1/c;-><init>(Llo1/c$b;Llo1/c$a;Llo1/c$e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method


# virtual methods
.method public final d(Lio1/f;)Llo1/c;
    .locals 2

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio1/f;->d()Lio1/d;

    move-result-object v0

    instance-of v1, v0, Lio1/d$b;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lio1/f;->d()Lio1/d;

    move-result-object p1

    check-cast p1, Lio1/d$b;

    invoke-direct {p0, p1}, Lmo1/a;->h(Lio1/d$b;)Llo1/c;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, v0, Lio1/d$e;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lio1/f;->d()Lio1/d;

    move-result-object v0

    check-cast v0, Lio1/d$e;

    invoke-direct {p0, v0}, Lmo1/a;->g(Lio1/d$e;)Llo1/c$b;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lmo1/a;->i(Lio1/f;Llo1/c$b;)Llo1/c;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lmo1/a;->i(Lio1/f;Llo1/c$b;)Llo1/c;

    move-result-object p1

    return-object p1
.end method
