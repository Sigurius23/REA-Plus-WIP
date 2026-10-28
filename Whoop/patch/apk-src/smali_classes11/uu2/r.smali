.class public abstract Luu2/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001d\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0013\u0010\u000c\u001a\u00020\u0006*\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;",
        "Luu2/m;",
        "analyticsContext",
        "Luu2/o;",
        "f",
        "(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Luu2/m;)Luu2/o;",
        "Le51/n;",
        "Lm91/u;",
        "emptyStateItem",
        "b",
        "(Le51/n;Lm91/u;)Le51/n;",
        "Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;",
        "e",
        "(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;)Le51/n;",
        "Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;",
        "Le51/e;",
        "d",
        "(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Le51/e;",
        "Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;",
        "Le51/p;",
        "g",
        "(Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;)Le51/p;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "defaultDesignItemReducer",
        "weightlifting_release"
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
.field private static final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Luk2/a;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Luk2/a;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Luu2/r;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Luu2/r;->c(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Le51/n;Lm91/u;)Le51/n;
    .locals 12

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Le51/n;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move-object v1, p0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Le51/n;->c()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Le51/e;

    invoke-virtual {p0}, Le51/n;->c()Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v2, v0}, Lm83/s;->A0(ILjava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v1}, Le51/e;->e()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {p1, v2}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v4

    const/16 v10, 0xfb

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v11}, Le51/e;->b(Le51/e;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Le51/d;Lb91/c;Lp31/p$a;FFILjava/lang/Object;)Le51/e;

    move-result-object p1

    invoke-static {p1, v0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v3

    const/16 v7, 0x1d

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v8}, Le51/n;->b(Le51/n;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Le51/m;FILjava/lang/Object;)Le51/n;

    move-result-object p0

    return-object p0

    :goto_0
    return-object v1
.end method

.method private static final c(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Le51/e;
    .locals 12

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lwv2/a;->e()Ljb1/a;

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

    new-instance v1, Le51/e;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xc0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v11}, Le51/e;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/util/List;Le51/d;Lb91/c;Lp31/p$a;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final e(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;)Le51/n;
    .locals 9

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getTags()Ljava/util/List;

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

    invoke-static {v3}, Luu2/r;->g(Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;)Le51/p;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getItems()Ljava/util/List;

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

    invoke-static {v1}, Luu2/r;->d(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;)Le51/e;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getTags()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;->getId()Ljava/lang/String;

    move-result-object p0

    :goto_2
    move-object v4, p0

    goto :goto_3

    :cond_2
    const/4 p0, 0x0

    goto :goto_2

    :goto_3
    sget-object v5, Le51/m;->VIEWPORT_THRESHOLD:Le51/m;

    new-instance v1, Le51/n;

    const/4 v6, 0x0

    const/16 v7, 0x10

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v8}, Le51/n;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Le51/m;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final f(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Luu2/m;)Luu2/o;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Luu2/r;->a:Ljb1/a;

    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->getHeader()Lcom/whoop/design/models/items/CollapsableHeaderModel;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    instance-of v1, v0, Ll51/g;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ll51/g;

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    if-eqz v4, :cond_3

    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->getContent()Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    move-result-object v0

    invoke-static {v0}, Luu2/r;->e(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;)Le51/n;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->getEmptyStateCard()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {}, Lwv2/a;->e()Ljb1/a;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object v7, v2

    :goto_1
    invoke-static {v0, v7}, Luu2/r;->b(Le51/n;Lm91/u;)Le51/n;

    move-result-object v5

    new-instance v3, Luu2/o;

    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->getMetadata()Lcom/whoop/weightlifting/data/dto/MetaData;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-static {p0}, Lcom/whoop/coacheverywherecommon/models/a;->a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;

    move-result-object v2

    :cond_2
    move-object v8, p1

    move-object v6, v2

    invoke-direct/range {v3 .. v8}, Luu2/o;-><init>(Ll51/g;Le51/n;Lep0/j;Lm91/u;Luu2/m;)V

    return-object v3

    :cond_3
    invoke-virtual {p0}, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;->getHeader()Lcom/whoop/design/models/items/CollapsableHeaderModel;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p1, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-interface {p0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Expected CollapsableHeaderViewState from header model, got "

    invoke-static {p1, p0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static final g(Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;)Le51/p;
    .locals 6

    new-instance v0, Le51/p;

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;->getNameDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;->getId()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Le51/p;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
