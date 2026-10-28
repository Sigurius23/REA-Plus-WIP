.class public abstract Llb1/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "k",
        "()Llb1/y0;",
        "detailsGraphMapper",
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

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/d1;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/d1;->j(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/ComparisonBarsGraphModel;)Ly11/d;
    .locals 0

    invoke-static {p0}, Llb1/d1;->h(Lcom/whoop/design/models/ComparisonBarsGraphModel;)Ly11/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/ArrowStatModel;)Lly0/f;
    .locals 0

    invoke-static {p0}, Llb1/d1;->g(Lcom/whoop/design/models/items/ArrowStatModel;)Lly0/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/d1;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/design/models/items/DetailsMetricTileModel;)Lty0/c;
    .locals 0

    invoke-static {p0}, Llb1/d1;->i(Lcom/whoop/design/models/items/DetailsMetricTileModel;)Lty0/c;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/i0;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/items/ArrowStatModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/d1$a;

    invoke-direct {v3, v0}, Llb1/d1$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/i0;

    const/16 v2, 0x1b

    invoke-direct {v0, v2}, Llb1/i0;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/ComparisonBarsGraphModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/d1$b;

    invoke-direct {v3, v0}, Llb1/d1$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/i0;

    const/16 v2, 0x1c

    invoke-direct {v0, v2}, Llb1/i0;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/DetailsMetricTileModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/d1$c;

    invoke-direct {v2, v0}, Llb1/d1$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/items/ArrowStatModel;)Lly0/f;
    .locals 9

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ArrowStatModel;->getCurrentStatText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ArrowStatModel;->getHistoricStatText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ArrowStatModel;->getTrendState()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/models/TrendStateEnum;->UNKNOWN:Lcom/whoop/design/models/TrendStateEnum;

    invoke-static {}, Lcom/whoop/design/models/TrendStateEnum;->values()[Lcom/whoop/design/models/TrendStateEnum;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v7, 0x0

    :goto_1
    if-nez v7, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v7

    :goto_2
    invoke-static {v1}, Llb1/o;->a(Lcom/whoop/design/models/TrendStateEnum;)Lly0/a;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ArrowStatModel;->getHistoricStatAlignment()Ljava/lang/String;

    move-result-object p0

    const-string v0, "LEFT"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 v6, p0, 0x1

    new-instance v1, Lly0/f;

    const/4 v5, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v8}, Lly0/f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lly0/a;Lb91/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final h(Lcom/whoop/design/models/ComparisonBarsGraphModel;)Ly11/d;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/ComparisonBarsGraphModel;->getGraphType()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/models/ComparisonBarsGraphType;->OPPOSITE:Lcom/whoop/design/models/ComparisonBarsGraphType;

    invoke-static {}, Lcom/whoop/design/models/ComparisonBarsGraphType;->values()[Lcom/whoop/design/models/ComparisonBarsGraphType;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_1

    aget-object v6, v2, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_1
    if-nez v6, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v6

    :goto_2
    sget-object v0, Lcom/whoop/design/models/ComparisonBarsGraphType;->GRADIENT:Lcom/whoop/design/models/ComparisonBarsGraphType;

    if-ne v1, v0, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    move v0, v4

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/ComparisonBarsGraphModel;->getBars()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/BarsModel;

    invoke-virtual {v5}, Lcom/whoop/design/models/BarsModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v5}, Lcom/whoop/design/models/BarsModel;->isTitleOnTop()Z

    move-result v7

    invoke-virtual {v5}, Lcom/whoop/design/models/BarsModel;->getValueDisplay()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v5}, Lcom/whoop/design/models/BarsModel;->getSegments()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v5, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/design/models/SegmentModel;

    invoke-static {v10}, Llb1/o0;->a(Lcom/whoop/design/models/SegmentModel;)Ly11/e;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_4
    new-instance v5, Ly11/f;

    invoke-direct {v5, v6, v7, v8, v9}, Ly11/f;-><init>(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Ljava/util/List;)V

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    invoke-virtual {p0}, Lcom/whoop/design/models/ComparisonBarsGraphModel;->getLegendEntries()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_8

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/LegendEntryModel;

    new-instance v5, Ly11/s;

    invoke-virtual {v3}, Lcom/whoop/design/models/LegendEntryModel;->getStyle()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lcom/whoop/design/models/LegendEntryModel;->getLegendDisplay()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7, v4}, Llb1/q2;->d(Ljava/lang/String;Ljava/lang/String;Z)Ln21/e;

    move-result-object v6

    invoke-virtual {v3}, Lcom/whoop/design/models/LegendEntryModel;->getStatDisplay()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    if-nez v3, :cond_7

    :cond_6
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    :cond_7
    invoke-direct {v5, v6, v3}, Ly11/s;-><init>(Ln21/e;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_8
    sget-object v1, Lm83/y;->w:Lm83/y;

    :cond_9
    new-instance p0, Ly11/d;

    invoke-direct {p0, v0, v2, v1}, Ly11/d;-><init>(ZLjava/util/List;Ljava/util/List;)V

    return-object p0
.end method

.method private static final i(Lcom/whoop/design/models/items/DetailsMetricTileModel;)Lty0/c;
    .locals 6

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/m;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Llb1/m;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DetailsMetricTileModel;->getStyle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DetailsMetricTileModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x4

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v3, v4}, Llb1/q2;->e(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ln21/e;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DetailsMetricTileModel;->getArrowStat()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/ArrowStatModel;

    invoke-virtual {v0, v3}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type com.whoop.design.atomic.atom.arrowStat.ArrowStatState"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lly0/f;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lty0/c;

    invoke-direct {p0, v1, v2}, Lty0/c;-><init>(Ln21/e;Ljava/util/List;)V

    return-object p0
.end method

.method private static final j(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lly0/f;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Llb1/d1$d;

    invoke-direct {v1}, Llb1/d1$d;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/d1;->a:Llb1/y0;

    return-object v0
.end method
