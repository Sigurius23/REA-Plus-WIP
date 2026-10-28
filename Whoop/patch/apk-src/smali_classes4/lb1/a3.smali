.class public abstract Llb1/a3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/a3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\u0008*\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\"\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/whoop/design/models/items/KeyMetricTileModel;",
        "Lc41/y2;",
        "n",
        "(Lcom/whoop/design/models/items/KeyMetricTileModel;)Lc41/y2;",
        "Lc41/x2;",
        "o",
        "(Lcom/whoop/design/models/items/KeyMetricTileModel;)Lc41/x2;",
        "Lcom/whoop/design/atomic/atom/TrendTypeEnum;",
        "Lhy0/b2;",
        "p",
        "(Lcom/whoop/design/atomic/atom/TrendTypeEnum;)Lhy0/b2;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "g",
        "()Llb1/y0;",
        "metricMapper",
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

    new-instance v0, Llb1/t2;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Llb1/t2;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/a3;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/HorizontalStatModel;)Lsz0/q;
    .locals 0

    invoke-static {p0}, Llb1/a3;->m(Lcom/whoop/design/models/items/HorizontalStatModel;)Lsz0/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/a3;->h(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/a3;->k(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/design/models/items/KeyMetricCarouselModel;)Lv41/k;
    .locals 0

    invoke-static {p0}, Llb1/a3;->j(Lcom/whoop/design/models/items/KeyMetricCarouselModel;)Lv41/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/design/models/items/KeyMetricTileModel;)Lc41/w2;
    .locals 0

    invoke-static {p0}, Llb1/a3;->l(Lcom/whoop/design/models/items/KeyMetricTileModel;)Lc41/w2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/design/models/items/ContributorTileMetricModel;)Lc41/g1;
    .locals 0

    invoke-static {p0}, Llb1/a3;->i(Lcom/whoop/design/models/items/ContributorTileMetricModel;)Lc41/g1;

    move-result-object p0

    return-object p0
.end method

.method public static final g()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/a3;->a:Llb1/y0;

    return-object v0
.end method

.method private static final h(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/t2;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Llb1/t2;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/design/models/items/ContributorTileMetricModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/a3$b;

    invoke-direct {v3, v0}, Llb1/a3$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/t2;

    const/16 v2, 0xf

    invoke-direct {v0, v2}, Llb1/t2;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/KeyMetricCarouselModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/a3$c;

    invoke-direct {v3, v0}, Llb1/a3$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/t2;

    const/16 v2, 0x10

    invoke-direct {v0, v2}, Llb1/t2;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/KeyMetricTileModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Llb1/a3$d;

    invoke-direct {v3, v0}, Llb1/a3$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Llb1/t2;

    const/16 v2, 0x11

    invoke-direct {v0, v2}, Llb1/t2;-><init>(I)V

    const-class v2, Lcom/whoop/design/models/items/HorizontalStatModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/a3$e;

    invoke-direct {v2, v0}, Llb1/a3$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lcom/whoop/design/models/items/ContributorTileMetricModel;)Lc41/g1;
    .locals 13

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ContributorTileMetricModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ContributorTileMetricModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/a;->b(Lcom/whoop/design/util/TextResource;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v3, "DeepDiveMetric_"

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ContributorTileMetricModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ContributorTileMetricModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ContributorTileMetricModel;->getMetricStyle()Ljava/lang/String;

    move-result-object v0

    const/4 v6, 0x0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ContributorTileMetricModel;->getMetricStyle()Ljava/lang/String;

    move-result-object v0

    sget-object v7, Lc41/h1;->DATA:Lc41/h1;

    invoke-static {}, Lc41/h1;->values()[Lc41/h1;

    move-result-object v8

    array-length v9, v8

    move v10, v6

    :goto_1
    if-ge v10, v9, :cond_2

    aget-object v11, v8, v10

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_2
    move-object v11, v1

    :goto_2
    if-nez v11, :cond_3

    goto :goto_3

    :cond_3
    move-object v7, v11

    :goto_3
    if-nez v7, :cond_5

    :cond_4
    sget-object v7, Lc41/h1;->DATA:Lc41/h1;

    :cond_5
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ContributorTileMetricModel;->getMetricStyle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    sget-object v8, Lc41/h1;->DATA:Lc41/h1;

    invoke-static {}, Lc41/h1;->values()[Lc41/h1;

    move-result-object v9

    array-length v10, v9

    :goto_4
    if-ge v6, v10, :cond_7

    aget-object v11, v9, v6

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_7
    move-object v11, v1

    :goto_5
    if-nez v11, :cond_8

    goto :goto_6

    :cond_8
    move-object v8, v11

    :goto_6
    sget-object v0, Llb1/a3$a;->a:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v0, v0, v6

    const/4 v6, 0x1

    if-eq v0, v6, :cond_a

    const/4 v6, 0x2

    if-eq v0, v6, :cond_9

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ContributorTileMetricModel;->getStatus()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_7

    :cond_9
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ContributorTileMetricModel;->getStatus()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v8}, Lc41/h1;->getTextDefault()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v0, v6}, Lcom/whoop/design/util/b;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_7

    :cond_a
    invoke-virtual {v8}, Lc41/h1;->getTextDefault()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :goto_7
    if-nez v0, :cond_c

    :cond_b
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ContributorTileMetricModel;->getStatus()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :cond_c
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ContributorTileMetricModel;->getStatusSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ContributorTileMetricModel;->getStatusIcon()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_d

    invoke-static {v6}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v6

    move-object v9, v6

    goto :goto_8

    :cond_d
    move-object v9, v1

    :goto_8
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ContributorTileMetricModel;->getStatusType()Llb1/r0;

    move-result-object v6

    if-eqz v6, :cond_e

    invoke-virtual {v6}, Llb1/r0;->getStatusColor()Ly81/f;

    move-result-object v6

    move-object v10, v6

    goto :goto_9

    :cond_e
    move-object v10, v1

    :goto_9
    invoke-virtual {p0}, Lcom/whoop/design/models/items/ContributorTileMetricModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v11

    invoke-virtual {p0}, Lcom/whoop/design/models/items/ContributorTileMetricModel;->getBarStyles()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_f

    check-cast p0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {p0, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/models/LegendStyle;

    invoke-static {v6}, Llb1/r2;->a(Lcom/whoop/design/models/LegendStyle;)Ly81/f;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_f
    move-object v12, v1

    new-instance v1, Lc41/g1;

    move-object v6, v7

    move-object v7, v0

    invoke-direct/range {v1 .. v12}, Lc41/g1;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lc41/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Ly81/f;Lcom/whoop/navigation/e;Ljava/util/List;)V

    return-object v1
.end method

.method private static final j(Lcom/whoop/design/models/items/KeyMetricCarouselModel;)Lv41/k;
    .locals 5

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llb1/z2;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    new-instance v1, Lv41/k;

    new-instance v2, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/KeyMetricCarouselModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    new-instance v3, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/KeyMetricCarouselModel;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/KeyMetricCarouselModel;->getKeyMetricTile()Ljava/util/List;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<com.whoop.design.atomic.molecule.tile.KeyMetricTileState>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2, v3, p0}, Lv41/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    return-object v1
.end method

.method private static final k(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lcom/whoop/design/models/items/KeyMetricTileModel;)Lc41/w2;
    .locals 24

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/KeyMetricTileModel;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    move-object v3, v0

    invoke-static {v1}, Llb1/a3;->n(Lcom/whoop/design/models/items/KeyMetricTileModel;)Lc41/y2;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/KeyMetricTileModel;->getKeyMetricTileIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v5, 0x1

    invoke-static {v0, v2, v5, v2}, Lgz0/n0;->f(Ljava/lang/String;Lgz0/m0;ILjava/lang/Object;)I

    move-result v0

    invoke-static {v1}, Llb1/a3;->o(Lcom/whoop/design/models/items/KeyMetricTileModel;)Lc41/x2;

    move-result-object v7

    new-instance v8, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/KeyMetricTileModel;->getKeyMetricTileTitleDisplay()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v8, v6}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/KeyMetricTileModel;->getKeyMetricTileStatValueDisplay()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_1

    new-instance v6, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/KeyMetricTileModel;->getKeyMetricTileStatValueDisplay()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v6, v9}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    :goto_0
    move-object v10, v6

    goto :goto_1

    :cond_1
    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v9, Lgy0/f;->g0:I

    const/4 v10, 0x2

    invoke-direct {v6, v9, v2, v10, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :goto_1
    sget-object v11, Ly81/f;->WHITE_10:Ly81/f;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/KeyMetricTileModel;->getKeyMetricTileTrendBar()Lcom/whoop/design/models/items/TrendBarModel;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-static {v6}, Llb1/e5;->e(Lcom/whoop/design/models/items/TrendBarModel;)Li41/d;

    move-result-object v6

    move-object v12, v6

    goto :goto_2

    :cond_2
    move-object v12, v2

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/design/models/items/KeyMetricTileModel;->getPlaceholderMessageDisplay()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/design/models/items/KeyMetricTileModel;->getKeyMetricTileStatValueDisplay()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v9, 0x6

    const/4 v14, 0x0

    if-lt v6, v9, :cond_3

    move v15, v5

    goto :goto_3

    :cond_3
    move v15, v14

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/design/models/items/KeyMetricTileModel;->getKeyMetricTileDialogContent()Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;->getTrendTitleDisplay()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v1}, Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;->getTrendType()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lhy0/b2;->NONE:Lhy0/b2;

    invoke-static {}, Lhy0/b2;->values()[Lhy0/b2;

    move-result-object v9

    array-length v2, v9

    :goto_4
    if-ge v14, v2, :cond_5

    aget-object v19, v9, v14

    move/from16 v23, v0

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_5

    :cond_4
    add-int/lit8 v14, v14, 0x1

    move/from16 v0, v23

    goto :goto_4

    :cond_5
    move/from16 v23, v0

    const/16 v19, 0x0

    :goto_5
    if-nez v19, :cond_6

    move-object/from16 v19, v6

    :cond_6
    invoke-virtual {v1}, Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;->getDescription()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v1}, Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;->getDisclaimer()Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v1}, Lcom/whoop/design/models/items/KeyMetricTileModelDialogContentModel;->getSecondaryButton()Lcom/whoop/design/models/items/SecondaryButtonModel;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {v0}, Llb1/d4;->p(Lcom/whoop/design/models/items/SecondaryButtonModel;)Lny0/p0;

    move-result-object v2

    move-object/from16 v22, v2

    goto :goto_6

    :cond_7
    const/16 v22, 0x0

    :goto_6
    new-instance v16, Lc41/s2;

    invoke-direct/range {v16 .. v22}, Lc41/s2;-><init>(Ljava/lang/String;Ljava/lang/String;Lhy0/b2;Ljava/lang/String;Ljava/lang/String;Lny0/p0;)V

    move-object/from16 v14, v16

    goto :goto_7

    :cond_8
    move/from16 v23, v0

    const/4 v14, 0x0

    :goto_7
    new-instance v1, Lc41/w2;

    const/16 v16, 0x91

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    move/from16 v5, v23

    invoke-direct/range {v1 .. v17}, Lc41/w2;-><init>(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final m(Lcom/whoop/design/models/items/HorizontalStatModel;)Lsz0/q;
    .locals 16

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/HorizontalStatModel;->getStatTitleSuffixDisplay()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v2, "%"

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "\\d"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    const-string v3, "compile(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lsz0/h1;->TEXT:Lsz0/h1;

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v0, Lsz0/h1;->NUMBER:Lsz0/h1;

    :goto_1
    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    move-object v6, v0

    goto :goto_4

    :cond_3
    :goto_3
    sget-object v0, Lsz0/h1;->TEXT:Lsz0/h1;

    goto :goto_2

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/design/models/items/HorizontalStatModel;->getStatMainValueDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/design/models/items/HorizontalStatModel;->getStatTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/design/models/items/HorizontalStatModel;->getStatTitleSuffixDisplay()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v5, v0

    goto :goto_5

    :cond_4
    move-object v5, v2

    :goto_5
    invoke-virtual {v1}, Lcom/whoop/design/models/items/HorizontalStatModel;->getStatTrendType()Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/HorizontalStatModel;->getStatComparisonDisplay()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v2, Lsz0/g1;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/HorizontalStatModel;->getStatComparisonDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/HorizontalStatModel;->getStatTrendType()Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    move-result-object v4

    invoke-static {v4}, Llb1/a3;->p(Lcom/whoop/design/atomic/atom/TrendTypeEnum;)Lhy0/b2;

    move-result-object v4

    invoke-direct {v2, v0, v4}, Lsz0/g1;-><init>(Lcom/whoop/design/util/TextResource;Lhy0/b2;)V

    :cond_5
    move-object v7, v2

    invoke-virtual {v1}, Lcom/whoop/design/models/items/HorizontalStatModel;->getStatIconDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    new-instance v1, Lsz0/q;

    const/16 v14, 0xf81

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lsz0/q;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZLy81/f;Ly81/f;Lsz0/f1;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final n(Lcom/whoop/design/models/items/KeyMetricTileModel;)Lc41/y2;
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/KeyMetricTileModel;->getKeyMetricTileSuffixDisplay()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "%"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lc41/y2$b;->a:Lc41/y2$b;

    goto :goto_0

    :cond_0
    new-instance v0, Lc41/y2$c;

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/KeyMetricTileModel;->getKeyMetricTileSuffixDisplay()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    invoke-direct {v0, v1}, Lc41/y2$c;-><init>(Lcom/whoop/design/util/TextResource;)V

    move-object p0, v0

    :goto_0
    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    return-object p0

    :cond_2
    :goto_1
    sget-object p0, Lc41/y2$a;->a:Lc41/y2$a;

    return-object p0
.end method

.method private static final o(Lcom/whoop/design/models/items/KeyMetricTileModel;)Lc41/x2;
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/KeyMetricTileModel;->getKeyMetricTileTrendType()Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Llb1/a3;->p(Lcom/whoop/design/atomic/atom/TrendTypeEnum;)Lhy0/b2;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lhy0/b2;->NEUTRAL:Lhy0/b2;

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/KeyMetricTileModel;->getKeyMetricTileTrendDisplay()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v1, Lcom/whoop/design/util/TextResource$e;

    invoke-direct {v1, p0}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    :goto_0
    new-instance p0, Lc41/x2;

    invoke-direct {p0, v0, v1}, Lc41/x2;-><init>(Lhy0/b2;Lcom/whoop/design/util/TextResource;)V

    return-object p0
.end method

.method private static final p(Lcom/whoop/design/atomic/atom/TrendTypeEnum;)Lhy0/b2;
    .locals 1

    sget-object v0, Llb1/a3$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :pswitch_0
    sget-object p0, Lhy0/b2;->ALERT_RANGE:Lhy0/b2;

    return-object p0

    :pswitch_1
    sget-object p0, Lhy0/b2;->CONCERN_RANGE:Lhy0/b2;

    return-object p0

    :pswitch_2
    sget-object p0, Lhy0/b2;->POSITIVE_RANGE:Lhy0/b2;

    return-object p0

    :pswitch_3
    sget-object p0, Lhy0/b2;->NEUTRAL:Lhy0/b2;

    return-object p0

    :pswitch_4
    sget-object p0, Lhy0/b2;->NEGATIVE:Lhy0/b2;

    return-object p0

    :pswitch_5
    sget-object p0, Lhy0/b2;->POSITIVE:Lhy0/b2;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
