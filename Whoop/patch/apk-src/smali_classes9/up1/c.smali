.class public abstract Lup1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "i",
        "()Ljb1/a;",
        "settingsTileReducer",
        "hormonal-insights_release"
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

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Luk2/a;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lup1/c;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;)Lbo1/b;
    .locals 0

    invoke-static {p0}, Lup1/c;->p(Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;)Lbo1/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsPrivacy;)Ltp1/i;
    .locals 0

    invoke-static {p0}, Lup1/c;->o(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsPrivacy;)Ltp1/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;)Ltp1/k;
    .locals 0

    invoke-static {p0}, Lup1/c;->l(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;)Ltp1/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/DateSelectedTileModel;)Lso1/h;
    .locals 0

    invoke-static {p0}, Lup1/c;->q(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/DateSelectedTileModel;)Lso1/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;)Ltp1/l;
    .locals 0

    invoke-static {p0}, Lup1/c;->n(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;)Ltp1/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lup1/c;->k(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsMenuItemModel;)Ltp1/g;
    .locals 0

    invoke-static {p0}, Lup1/c;->m(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsMenuItemModel;)Ltp1/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lup1/c;->j(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final i()Ljb1/a;
    .locals 1

    sget-object v0, Lup1/c;->a:Ljb1/a;

    return-object v0
.end method

.method private static final j(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Luk2/a;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Luk2/a;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Luk2/a;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Luk2/a;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lup1/c$a;

    invoke-direct {v3, v0}, Lup1/c$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Luk2/a;

    const/16 v2, 0x8

    invoke-direct {v0, v2}, Luk2/a;-><init>(I)V

    const-class v2, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsMenuItemModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lup1/c$b;

    invoke-direct {v3, v0}, Lup1/c$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Luk2/a;

    const/16 v2, 0x9

    invoke-direct {v0, v2}, Luk2/a;-><init>(I)V

    const-class v2, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lup1/c$c;

    invoke-direct {v3, v0}, Lup1/c$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Luk2/a;

    const/16 v2, 0xa

    invoke-direct {v0, v2}, Luk2/a;-><init>(I)V

    const-class v2, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsPrivacy;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lup1/c$d;

    invoke-direct {v3, v0}, Lup1/c$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Luk2/a;

    const/16 v2, 0xb

    invoke-direct {v0, v2}, Luk2/a;-><init>(I)V

    const-class v2, Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lup1/c$e;

    invoke-direct {v3, v0}, Lup1/c$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Luk2/a;

    const/16 v2, 0xc

    invoke-direct {v0, v2}, Luk2/a;-><init>(I)V

    const-class v2, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/DateSelectedTileModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lup1/c$f;

    invoke-direct {v2, v0}, Lup1/c$f;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;)Ltp1/k;
    .locals 9

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;->getTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;->getDescriptionDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;->getEnabled()Z

    move-result v2

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;->getType()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3

    sget-object v3, Ltp1/r;->HORMONAL_INSIGHTS:Ltp1/r;

    invoke-static {}, Ltp1/r;->values()[Ltp1/r;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    move-object v3, v7

    :goto_2
    if-nez v3, :cond_4

    :cond_3
    sget-object v3, Ltp1/r;->HORMONAL_INSIGHTS:Ltp1/r;

    :cond_4
    new-instance p0, Ltp1/k;

    invoke-direct {p0, v0, v1, v2, v3}, Ltp1/k;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLtp1/r;)V

    return-object p0
.end method

.method private static final m(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsMenuItemModel;)Ltp1/g;
    .locals 10

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsMenuItemModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsMenuItemModel;->getLeftIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    move v6, v1

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
    move-object v7, v3

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsMenuItemModel;->getRightIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    move v6, v1

    :goto_2
    if-ge v6, v5, :cond_3

    aget-object v8, v4, v6

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_3
    move-object v8, v3

    :goto_3
    move-object v4, v8

    goto :goto_4

    :cond_4
    move-object v4, v3

    :goto_4
    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsMenuItemModel;->getType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {}, Ltp1/h;->values()[Ltp1/h;

    move-result-object v5

    array-length v6, v5

    :goto_5
    if-ge v1, v6, :cond_6

    aget-object v8, v5, v1

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    move-object v3, v8

    goto :goto_6

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_6
    :goto_6
    move-object v6, v3

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsMenuItemModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v5

    new-instance v1, Ltp1/g;

    move-object v3, v7

    invoke-direct/range {v1 .. v6}, Ltp1/g;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lgz0/m0;Lcom/whoop/navigation/e;Ltp1/h;)V

    return-object v1
.end method

.method private static final n(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;)Ltp1/l;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;->getDescriptionDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;->getIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->TINY_INFORMATION:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    const/4 v7, 0x0

    if-ge v6, v4, :cond_1

    aget-object v8, v3, v6

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    move-object v8, v7

    :goto_1
    if-nez v8, :cond_2

    move-object v3, v1

    goto :goto_2

    :cond_2
    move-object v3, v8

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;->getCtaTextDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;->getCtaIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    sget-object v1, Lgz0/m0;->ARROW_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v6

    array-length v8, v6

    :goto_3
    if-ge v5, v8, :cond_4

    aget-object v9, v6, v5

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_3

    move-object v7, v9

    goto :goto_4

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_4
    :goto_4
    if-nez v7, :cond_5

    move-object v7, v1

    :cond_5
    move-object v5, v7

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;->getCtaDestination()Lcom/whoop/navigation/e;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;->getDismissable()Z

    move-result v7

    new-instance v1, Ltp1/l;

    invoke-direct/range {v1 .. v7}, Ltp1/l;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;Z)V

    return-object v1
.end method

.method private static final o(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsPrivacy;)Ltp1/i;
    .locals 10

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsPrivacy;->getTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsPrivacy;->getDescriptionDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsPrivacy;->getCtaTextDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsPrivacy;->getCtaIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lgz0/m0;->ARROW_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_1

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    :goto_1
    if-nez v8, :cond_2

    move-object v5, v1

    goto :goto_2

    :cond_2
    move-object v5, v8

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsPrivacy;->getCtaUrl()Ljava/lang/String;

    move-result-object v6

    new-instance v1, Ltp1/i;

    invoke-direct/range {v1 .. v6}, Ltp1/i;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Ljava/lang/String;)V

    return-object v1
.end method

.method private static final p(Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;)Lbo1/b;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbo1/a;->a:Lbo1/a;

    invoke-virtual {v0, p0}, Lbo1/a;->a(Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;)Lbo1/b;

    move-result-object p0

    return-object p0
.end method

.method private static final q(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/DateSelectedTileModel;)Lso1/h;
    .locals 2

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lso1/h;

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/DateSelectedTileModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/DateSelectedTileModel;->getDueDateDisplay()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lso1/h;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method
