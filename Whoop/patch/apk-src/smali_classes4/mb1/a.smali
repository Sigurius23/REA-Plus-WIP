.class public abstract Lmb1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\"\u0017\u0010\u0019\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;",
        "Luz0/i;",
        "h",
        "(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;)Luz0/i;",
        "Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;",
        "Luz0/o;",
        "j",
        "(Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;)Luz0/o;",
        "Lcom/whoop/design/models/items/activityrecommendation/ZoneInfoModel;",
        "Luz0/p;",
        "k",
        "(Lcom/whoop/design/models/items/activityrecommendation/ZoneInfoModel;)Luz0/p;",
        "Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;",
        "Luz0/l;",
        "i",
        "(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;)Luz0/l;",
        "",
        "Luz0/b;",
        "g",
        "(Ljava/lang/String;)Luz0/b;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "f",
        "()Llb1/y0;",
        "activityRecommendationTileMapper",
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

    new-instance v0, Llb1/z4;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Lmb1/a;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmb1/a;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmb1/a;->l(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;)Luz0/i;
    .locals 0

    invoke-static {p0}, Lmb1/a;->e(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;)Luz0/i;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/z4;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Llb1/z4;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lmb1/a$a;

    invoke-direct {v2, v0}, Lmb1/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;)Luz0/i;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lmb1/a;->h(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;)Luz0/i;

    move-result-object p0

    return-object p0
.end method

.method public static final f()Llb1/y0;
    .locals 1

    sget-object v0, Lmb1/a;->a:Llb1/y0;

    return-object v0
.end method

.method private static final g(Ljava/lang/String;)Luz0/b;
    .locals 2

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "toUpperCase(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x78ae7c8b

    if-eq v0, v1, :cond_3

    const v1, 0x12734

    if-eq v0, v1, :cond_2

    const v1, 0x21d5a2

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "HIGH"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p0, Luz0/b;->HIGH:Luz0/b;

    return-object p0

    :cond_2
    const-string v0, "LOW"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    sget-object p0, Luz0/b;->LOW:Luz0/b;

    return-object p0

    :cond_3
    const-string v0, "MEDIUM"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    :cond_4
    :goto_0
    sget-object p0, Luz0/b;->UNKNOWN:Luz0/b;

    return-object p0

    :cond_5
    sget-object p0, Luz0/b;->MEDIUM:Luz0/b;

    return-object p0
.end method

.method public static final h(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;)Luz0/i;
    .locals 16

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->isSelected()Z

    move-result v3

    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getIconUrl()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    new-instance v4, Lkd1/o$c;

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    new-instance v4, Lkd1/o$a;

    sget-object v0, Lgz0/m0;->ACTIVITY:Lgz0/m0;

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-direct {v4, v0}, Lkd1/o$a;-><init>(I)V

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getActivityTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getActivityStrain()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getActivityDuration()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getActivityDurationUnit()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getActivityDurationLabel()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getTargetZones()Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;

    move-result-object v0

    const/4 v10, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lmb1/a;->j(Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;)Luz0/o;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v10

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getIntensityStyle()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_2

    invoke-static {v11}, Lmb1/a;->g(Ljava/lang/String;)Luz0/b;

    move-result-object v11

    goto :goto_2

    :cond_2
    move-object v11, v10

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getIntensityTitle()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getIntensitySubtitle()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getButtonViewState()Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;

    move-result-object v14

    if-eqz v14, :cond_3

    invoke-static {v14}, Lmb1/a;->i(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;)Luz0/l;

    move-result-object v14

    goto :goto_3

    :cond_3
    move-object v14, v10

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;->getContent()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v10, Lm01/c;

    const/16 v15, 0x14

    invoke-direct {v10, v15}, Lm01/c;-><init>(I)V

    invoke-static {v10}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v10

    invoke-virtual {v10, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v10

    :cond_4
    move-object v15, v10

    new-instance v1, Luz0/i;

    move-object v10, v0

    invoke-direct/range {v1 .. v15}, Luz0/i;-><init>(Ljava/lang/String;ZLkd1/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Luz0/o;Luz0/b;Ljava/lang/String;Ljava/lang/String;Luz0/l;Lm91/u;)V

    return-object v1
.end method

.method private static final i(Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;)Luz0/l;
    .locals 2

    new-instance v0, Luz0/l;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;->isSelectedCtaTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationButtonModel;->getNotSelectedCtaTitle()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Luz0/l;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final j(Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;)Luz0/o;
    .locals 5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;->getIndicatorPosition()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;->getTargetZoneStyle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;->getTargetZoneTitle()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    const-string v2, ""

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/activityrecommendation/TargetZonesModel;->getTargetZones()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/activityrecommendation/ZoneInfoModel;

    invoke-static {v4}, Lmb1/a;->k(Lcom/whoop/design/models/items/activityrecommendation/ZoneInfoModel;)Luz0/p;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance p0, Luz0/o;

    invoke-direct {p0, v0, v1, v2, v3}, Luz0/o;-><init>(FLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object p0
.end method

.method private static final k(Lcom/whoop/design/models/items/activityrecommendation/ZoneInfoModel;)Luz0/p;
    .locals 8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/activityrecommendation/ZoneInfoModel;->getSize()F

    move-result v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/activityrecommendation/ZoneInfoModel;->getStyle()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Luz0/k;->STRAIN_ZONE_2:Luz0/k;

    invoke-static {}, Luz0/k;->values()[Luz0/k;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    move-object v2, v6

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/activityrecommendation/ZoneInfoModel;->getTitle()Ljava/lang/String;

    move-result-object p0

    new-instance v1, Luz0/p;

    invoke-direct {v1, v0, v2, p0}, Luz0/p;-><init>(FLuz0/k;Ljava/lang/String;)V

    return-object v1
.end method

.method private static final l(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
