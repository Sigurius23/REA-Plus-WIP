.class public abstract Llb1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\"\u0017\u0010\u0014\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;",
        "Lm91/u;",
        "j",
        "(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;)Lm91/u;",
        "Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;",
        "Le51/p;",
        "k",
        "(Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;)Le51/p;",
        "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;",
        "Le51/e;",
        "i",
        "(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Le51/e;",
        "Ljb1/a;",
        "f",
        "()Ljb1/a;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "h",
        "()Llb1/y0;",
        "anchorSelectorMapper",
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

    new-instance v0, Llb1/a;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/j;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/j;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;)Lm91/u;
    .locals 0

    invoke-static {p0}, Llb1/j;->e(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;)Lm91/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/j;->g(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/a;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/j$a;

    invoke-direct {v2, v0}, Llb1/j$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;)Lm91/u;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/j;->j(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;)Lm91/u;

    move-result-object p0

    return-object p0
.end method

.method private static final f()Ljb1/a;
    .locals 2

    new-instance v0, Ll60/a;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Ll60/a;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method private static final g(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/b1;->a:Llb1/b1;

    invoke-virtual {v0}, Llb1/b1;->a()Llb1/y0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/j;->a:Llb1/y0;

    return-object v0
.end method

.method private static final i(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Le51/e;
    .locals 11

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Llb1/j;->f()Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getSpacingType()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    sget-object v1, Le51/d;->NORMAL:Le51/d;

    invoke-static {}, Le51/d;->values()[Le51/d;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_2

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_2
    const/4 v8, 0x0

    :goto_1
    if-nez v8, :cond_3

    move-object v5, v1

    goto :goto_2

    :cond_3
    move-object v5, v8

    :goto_2
    invoke-static {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelMappingKt;->resolveTitleTypography(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Lb91/c;

    move-result-object v6

    invoke-static {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelMappingKt;->resolveAnchorSectionHeaderState(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Lp31/p$a;

    move-result-object v7

    invoke-static {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelMappingKt;->resolveLeadingPadding(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)F

    move-result v8

    invoke-static {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelMappingKt;->resolveTrailingPadding(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)F

    move-result v9

    new-instance v1, Le51/e;

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v10}, Le51/e;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Le51/d;Lb91/c;Lp31/p$a;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final j(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;)Lm91/u;
    .locals 19

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getEmptyTile()Lcom/whoop/design/models/tiles/EmptyTileModel;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->isSearchActive()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getItems()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Llb1/i1;->c(Lcom/whoop/design/models/tiles/EmptyTileModel;)Lk11/f;

    move-result-object v3

    invoke-static {}, Le51/f;->a()F

    move-result v16

    const/16 v17, 0xfff

    const/16 v18, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v3 .. v18}, Lk11/f;->b(Lk11/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lhy0/h1;Lny0/h;Lny0/h;Lf01/q1;Lk11/a;ZZLcom/whoop/analytics/AnalyticEventModel;FILjava/lang/Object;)Lk11/f;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getTags()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;

    invoke-static {v5}, Llb1/j;->k(Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;)Le51/p;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;

    invoke-static {v3}, Llb1/j;->i(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Le51/e;

    move-result-object v3

    invoke-interface {v5, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getTags()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;->getId()Ljava/lang/String;

    move-result-object v2

    :cond_5
    move-object v6, v2

    invoke-static {v1}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModelMappingKt;->resolveTagsHorizontalInset(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;)F

    move-result v8

    new-instance v3, Le51/n;

    const/4 v7, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v10}, Le51/n;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Le51/m;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method private static final k(Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;)Le51/p;
    .locals 3

    new-instance v0, Le51/p;

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;->getNameDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Le51/p;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object v0
.end method
