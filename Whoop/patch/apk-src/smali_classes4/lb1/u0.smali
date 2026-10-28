.class public abstract Llb1/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\"\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/whoop/design/models/items/DataHighlightModel;",
        "model",
        "Ls51/d;",
        "c",
        "(Lcom/whoop/design/models/items/DataHighlightModel;)Ls51/d;",
        "Lcom/whoop/design/models/items/StreakBadgeModel;",
        "Ls51/o;",
        "k",
        "(Lcom/whoop/design/models/items/StreakBadgeModel;)Ls51/o;",
        "Lcom/whoop/design/models/items/NotableStatsModel;",
        "Ls51/h;",
        "h",
        "(Lcom/whoop/design/models/items/NotableStatsModel;)Ls51/h;",
        "Lcom/whoop/design/models/items/InfoModel;",
        "Ls51/e;",
        "g",
        "(Lcom/whoop/design/models/items/InfoModel;)Ls51/e;",
        "Lcom/whoop/design/models/items/ScoreGaugeRowModel;",
        "Ls51/m;",
        "j",
        "(Lcom/whoop/design/models/items/ScoreGaugeRowModel;)Ls51/m;",
        "Lcom/whoop/design/models/items/ScoreGaugeDialModel;",
        "Ls51/i;",
        "i",
        "(Lcom/whoop/design/models/items/ScoreGaugeDialModel;)Ls51/i;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "f",
        "()Llb1/y0;",
        "dataHighlightMapper",
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

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/u0;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/DataHighlightModel;)Ls51/d;
    .locals 0

    invoke-static {p0}, Llb1/u0;->e(Lcom/whoop/design/models/items/DataHighlightModel;)Ls51/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/u0;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/models/items/DataHighlightModel;)Ls51/d;
    .locals 10

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, v1}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DataHighlightModel;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DataHighlightModel;->getPillarGauges()Lcom/whoop/design/models/items/ScoreGaugeRowModel;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2}, Llb1/u0;->j(Lcom/whoop/design/models/items/ScoreGaugeRowModel;)Ls51/m;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v4, v2

    goto :goto_2

    :cond_1
    :goto_1
    new-instance v2, Ls51/m;

    const-string v4, "empty_pillar_gauges"

    sget-object v5, Lm83/y;->w:Lm83/y;

    invoke-direct {v2, v4, v5}, Ls51/m;-><init>(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/DataHighlightModel;->getStreaksDivider()Lcom/whoop/design/models/items/DividerModel;

    move-result-object v2

    const-string v5, "null cannot be cast to non-null type com.whoop.design.atomic.atom.DividerState"

    if-eqz v2, :cond_2

    invoke-virtual {v0, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lhy0/e;

    goto :goto_3

    :cond_2
    move-object v2, v1

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/DataHighlightModel;->getStreaks()Lcom/whoop/design/models/items/StreaksContainer;

    move-result-object v6

    const/16 v7, 0xa

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Lcom/whoop/design/models/items/StreaksContainer;->getStreakList()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_5

    move-object v8, v6

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_3

    goto :goto_4

    :cond_3
    move-object v6, v1

    :goto_4
    if-eqz v6, :cond_5

    check-cast v6, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v6, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/design/models/items/StreakBadgeModel;

    invoke-static {v9}, Llb1/u0;->k(Lcom/whoop/design/models/items/StreakBadgeModel;)Ls51/o;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_4
    move-object v6, v8

    goto :goto_6

    :cond_5
    move-object v6, v1

    :goto_6
    invoke-virtual {p0}, Lcom/whoop/design/models/items/DataHighlightModel;->getNotableStatsDivider()Lcom/whoop/design/models/items/DividerModel;

    move-result-object v8

    if-eqz v8, :cond_6

    invoke-virtual {v0, v8}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lhy0/e;

    goto :goto_7

    :cond_6
    move-object v0, v1

    :goto_7
    invoke-virtual {p0}, Lcom/whoop/design/models/items/DataHighlightModel;->getNotableStats()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_7

    check-cast v5, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v5, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v1, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/design/models/items/NotableStatsModel;

    invoke-static {v7}, Llb1/u0;->h(Lcom/whoop/design/models/items/NotableStatsModel;)Ls51/h;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_7
    move-object v8, v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DataHighlightModel;->getFooter()Ljava/lang/String;

    move-result-object v9

    move-object v5, v2

    new-instance v2, Ls51/d;

    move-object v7, v0

    invoke-direct/range {v2 .. v9}, Ls51/d;-><init>(Ljava/lang/String;Ls51/m;Lhy0/e;Ljava/util/List;Lhy0/e;Ljava/util/List;Ljava/lang/String;)V

    return-object v2
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/i0;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/DataHighlightModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/u0$a;

    invoke-direct {v2, v0}, Llb1/u0$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/DataHighlightModel;)Ls51/d;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/u0;->c(Lcom/whoop/design/models/items/DataHighlightModel;)Ls51/d;

    move-result-object p0

    return-object p0
.end method

.method public static final f()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/u0;->a:Llb1/y0;

    return-object v0
.end method

.method private static final g(Lcom/whoop/design/models/items/InfoModel;)Ls51/e;
    .locals 7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/InfoModel;->getInfoIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->EDUCATION:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_1
    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v5

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/InfoModel;->getInfoTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/InfoModel;->getInfoDescription()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ls51/e;

    invoke-direct {v2, v1, v0, p0}, Ls51/e;-><init>(Lgz0/m0;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2
.end method

.method private static final h(Lcom/whoop/design/models/items/NotableStatsModel;)Ls51/h;
    .locals 10

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NotableStatsModel;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NotableStatsModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    :cond_0
    move-object v2, v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NotableStatsModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/NotableStatsModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lgz0/m0;->WHOOP_LOGO_CIRCLE:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_3

    aget-object v7, v4, v6

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    move-object v7, v1

    :goto_1
    if-nez v7, :cond_4

    goto :goto_3

    :cond_4
    move-object v3, v7

    goto :goto_3

    :cond_5
    :goto_2
    move-object v3, v1

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/NotableStatsModel;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NotableStatsModel;->getSubtitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NotableStatsModel;->getInfo()Lcom/whoop/design/models/items/InfoModel;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, Llb1/u0;->g(Lcom/whoop/design/models/items/InfoModel;)Ls51/e;

    move-result-object v1

    :cond_6
    move-object v6, v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NotableStatsModel;->getCurrentValueDisplay()Lcom/whoop/design/models/items/CurrentValueDisplay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/CurrentValueDisplay;->getText()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NotableStatsModel;->getCurrentValueDisplay()Lcom/whoop/design/models/items/CurrentValueDisplay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/CurrentValueDisplay;->getUnit()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/NotableStatsModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v9

    new-instance v1, Ls51/h;

    invoke-direct/range {v1 .. v9}, Ls51/h;-><init>(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ls51/e;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method private static final i(Lcom/whoop/design/models/items/ScoreGaugeDialModel;)Ls51/i;
    .locals 12

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getScoreDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getScoreDisplaySuffix()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v4

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getTitleEndIcon()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    sget-object v6, Lgz0/m0;->WHOOP_LOGO_CIRCLE:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_2

    aget-object v10, v7, v9

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    move-object v4, v10

    goto :goto_2

    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    if-nez v4, :cond_3

    move-object v4, v6

    :cond_3
    move-object v5, v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getProgressFillStyle()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Llb1/u1;->t(Ljava/lang/String;)Li91/a;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getGaugeFillPercentage()F

    move-result v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getScoreTarget()Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getLowerOptimalPercentage()Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getHigherOptimalPercentage()Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ScoreGaugeDialModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v11

    move-object v4, v0

    new-instance v0, Ls51/i;

    invoke-direct/range {v0 .. v11}, Ls51/i;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;FLjava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/e;)V

    return-object v0
.end method

.method private static final j(Lcom/whoop/design/models/items/ScoreGaugeRowModel;)Ls51/m;
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ScoreGaugeRowModel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ScoreGaugeRowModel;->getGauges()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/ScoreGaugeDialModel;

    invoke-static {v2}, Llb1/u0;->i(Lcom/whoop/design/models/items/ScoreGaugeDialModel;)Ls51/i;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Ls51/m;

    invoke-direct {p0, v0, v1}, Ls51/m;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object p0
.end method

.method private static final k(Lcom/whoop/design/models/items/StreakBadgeModel;)Ls51/o;
    .locals 9

    invoke-virtual {p0}, Lcom/whoop/design/models/items/StreakBadgeModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/StreakBadgeModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lgz0/m0;->WHOOP_LOGO_CIRCLE:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    const/4 v6, 0x0

    if-ge v5, v4, :cond_1

    aget-object v7, v3, v5

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    move-object v7, v6

    :goto_1
    if-nez v7, :cond_2

    goto :goto_2

    :cond_2
    move-object v2, v7

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/StreakBadgeModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/StreakBadgeModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    :cond_3
    move-object v4, v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/StreakBadgeModel;->getStyle()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v5, -0x6d97ca8b

    if-eq v0, v5, :cond_8

    const v5, -0xfb906b

    if-eq v0, v5, :cond_6

    const v5, 0x4b536b7

    if-eq v0, v5, :cond_4

    goto :goto_4

    :cond_4
    const-string v0, "SLEEP"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_4

    :cond_5
    sget-object p0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->SLEEP:Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    :goto_3
    move-object v5, p0

    goto :goto_5

    :cond_6
    const-string v0, "RECOVERY"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_4

    :cond_7
    sget-object p0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->RECOVERY:Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    goto :goto_3

    :cond_8
    const-string v0, "STRAIN"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    :goto_4
    sget-object p0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->SLEEP:Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    goto :goto_3

    :cond_9
    sget-object p0, Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;->STRAIN:Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;

    goto :goto_3

    :goto_5
    new-instance v0, Ls51/o;

    invoke-direct/range {v0 .. v5}, Ls51/o;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/atomic/organism/datahighlight/StreaksBadgeStyle;)V

    return-object v0
.end method
