.class public abstract Ldj1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00052\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u001d\u0010\u001a\u001a\u00020\u00192\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0005H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u001a\u0019\u0010\"\u001a\u00020\u00002\u0008\u0010!\u001a\u0004\u0018\u00010 H\u0002\u00a2\u0006\u0004\u0008\"\u0010#\"\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "",
        "isHormonalInsightsUpdatesEnabled",
        "Ljb1/a;",
        "B",
        "(Z)Ljb1/a;",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "items",
        "Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;",
        "heartScreenerInfo",
        "Lm91/u;",
        "u",
        "(Ljava/util/List;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;)Ljava/util/List;",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "logButton",
        "Lny0/h;",
        "Q",
        "(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;",
        "Lcom/whoop/health/domain/models/DataVisHeaderModel;",
        "model",
        "Lcj1/b;",
        "t",
        "(Lcom/whoop/health/domain/models/DataVisHeaderModel;)Lcj1/b;",
        "",
        "samples",
        "Lj71/c;",
        "P",
        "(Ljava/util/List;)Lj71/c;",
        "Lri1/g$e;",
        "Lcj1/i$b;",
        "R",
        "(Lri1/g$e;)Lcj1/i$b;",
        "",
        "shepherdHighWaterMark",
        "O",
        "(Ljava/lang/String;)Z",
        "a",
        "Ljb1/a;",
        "designItemReducer",
        "health_release"
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

    new-instance v0, Ldh0/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ldh0/a;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Ldj1/c;->a:Ljb1/a;

    return-void
.end method

.method private static final A(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final B(Z)Ljb1/a;
    .locals 2

    new-instance v0, Lb30/x4;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lb30/x4;-><init>(ZI)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final C(ZLjb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb30/x4;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lb30/x4;-><init>(ZI)V

    invoke-virtual {p1, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(ZLlb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldh0/a;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ldh0/a;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/health/domain/models/DataVisualizationCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Ldj1/c$e;

    invoke-direct {v3, v0}, Ldj1/c$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Ldh0/a;

    const/16 v2, 0x9

    invoke-direct {v0, v2}, Ldh0/a;-><init>(I)V

    const-class v2, Lcom/whoop/health/domain/models/EntryPointLockedCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Ldj1/c$f;

    invoke-direct {v3, v0}, Ldj1/c$f;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Ldh0/a;

    const/16 v2, 0xa

    invoke-direct {v0, v2}, Ldh0/a;-><init>(I)V

    const-class v2, Lcom/whoop/health/domain/models/ProgressBarDescriptionCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Ldj1/c$g;

    invoke-direct {v3, v0}, Ldj1/c$g;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lb30/x4;

    const/4 v2, 0x5

    invoke-direct {v0, p0, v2}, Lb30/x4;-><init>(ZI)V

    const-class p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;

    invoke-virtual {v1, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    new-instance v2, Ldj1/c$h;

    invoke-direct {v2, v0}, Ldj1/c$h;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Ldh0/a;

    const/16 v0, 0xb

    invoke-direct {p0, v0}, Ldh0/a;-><init>(I)V

    const-class v0, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v2, Ldj1/c$i;

    invoke-direct {v2, p0}, Ldj1/c$i;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Ldh0/a;

    const/16 v0, 0xc

    invoke-direct {p0, v0}, Ldh0/a;-><init>(I)V

    const-class v0, Lcom/whoop/health/domain/models/HealthspanHeroMetricModel;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Ldj1/c$j;

    invoke-direct {v1, p0}, Ldj1/c$j;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0, v1}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lcom/whoop/health/domain/models/DataVisualizationCardModel;)Lcj1/e;
    .locals 13

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->getHeader()Lcom/whoop/health/domain/models/DataVisHeaderModel;

    move-result-object v0

    invoke-static {v0}, Ldj1/c;->t(Lcom/whoop/health/domain/models/DataVisHeaderModel;)Lcj1/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->getHeartScreenerUpdatedAtInfo()Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

    move-result-object v2

    invoke-static {v1, v2}, Ldj1/c;->u(Ljava/util/List;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->getNavigation()Lcom/whoop/navigation/e;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    sget-object v5, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/health/domain/models/DataVisualizationCardModel;->getHeartScreenerUpdatedAtInfo()Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;->getShepherdHighWaterMark()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;->getLabradorHighWaterMark()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;->getShepherdState()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    invoke-static {}, Lcj1/w;->values()[Lcj1/w;

    move-result-object v8

    array-length v9, v8

    move v10, v7

    :goto_2
    if-ge v10, v9, :cond_3

    aget-object v11, v8, v10

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_3
    move-object v11, v3

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;->getLabradorState()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-static {}, Lcj1/s;->values()[Lcj1/s;

    move-result-object v6

    array-length v8, v6

    :goto_4
    if-ge v7, v8, :cond_5

    aget-object v9, v6, v7

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    move-object v3, v9

    goto :goto_5

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_5
    :goto_5
    new-instance p0, Lcj1/n;

    invoke-direct {p0, v4, v5, v11, v3}, Lcj1/n;-><init>(Ljava/lang/String;Ljava/lang/String;Lcj1/w;Lcj1/s;)V

    move-object v3, p0

    :cond_6
    new-instance p0, Lcj1/e;

    invoke-direct {p0, v0, v1, v2, v3}, Lcj1/e;-><init>(Lcj1/b;Ljava/util/List;Lcom/whoop/navigation/e;Lcj1/n;)V

    return-object p0
.end method

.method private static final F(Lcom/whoop/health/domain/models/EntryPointLockedCardModel;)Lfj1/c;
    .locals 15

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldh0/a;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Ldh0/a;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/EntryPointLockedCardModel;->getCardName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, ""

    :cond_0
    move-object v3, v1

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/EntryPointLockedCardModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/EntryPointLockedCardModel;->getTitleImage()Ljava/lang/String;

    move-result-object v6

    const/4 v1, 0x0

    if-eqz v6, :cond_1

    new-instance v5, Lkd1/o$c;

    sget-object v2, Lgz0/m0;->WHOOP_LOGO:Lgz0/m0;

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v8

    const/16 v10, 0xa

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_1
    move-object v5, v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/health/domain/models/EntryPointLockedCardModel;->getEndIcon()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    sget-object v6, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_3

    aget-object v10, v7, v9

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_3
    move-object v10, v1

    :goto_2
    if-nez v10, :cond_4

    goto :goto_3

    :cond_4
    move-object v6, v10

    :goto_3
    move-object v7, v6

    goto :goto_4

    :cond_5
    move-object v7, v1

    :goto_4
    invoke-virtual {p0}, Lcom/whoop/health/domain/models/EntryPointLockedCardModel;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/EntryPointLockedCardModel;->getBackgroundImage()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_6

    new-instance v8, Lkd1/o$c;

    sget-object v2, Lgz0/m0;->WHOOP_LOGO:Lgz0/m0;

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v11

    const/16 v13, 0xa

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_5

    :cond_6
    move-object v8, v1

    :goto_5
    invoke-virtual {p0}, Lcom/whoop/health/domain/models/EntryPointLockedCardModel;->getLastUpdated()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move-object v9, v2

    goto :goto_6

    :cond_7
    move-object v9, v1

    :goto_6
    invoke-virtual {p0}, Lcom/whoop/health/domain/models/EntryPointLockedCardModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v10

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/EntryPointLockedCardModel;->getNavigationTag()Lcom/whoop/design/models/items/TagModel;

    move-result-object p0

    if-eqz p0, :cond_8

    invoke-virtual {v0, p0}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    :cond_8
    move-object v11, v1

    new-instance v2, Lfj1/c;

    invoke-direct/range {v2 .. v11}, Lfj1/c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Lm91/u;)V

    return-object v2
.end method

.method private static final G(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lcom/whoop/health/domain/models/ProgressBarDescriptionCardModel;)Lfj1/m;
    .locals 15

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/ProgressBarDescriptionCardModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/ProgressBarDescriptionCardModel;->getEndIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    sget-object v4, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v6, v5

    move v7, v1

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
    move-object v8, v3

    :goto_1
    if-nez v8, :cond_2

    goto :goto_2

    :cond_2
    move-object v4, v8

    goto :goto_2

    :cond_3
    move-object v4, v3

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/health/domain/models/ProgressBarDescriptionCardModel;->getBody()Lcom/whoop/health/domain/models/ProgressPlotDescription;

    move-result-object v0

    move-object v5, v3

    move-object v3, v4

    new-instance v4, Lfj1/i;

    invoke-virtual {v0}, Lcom/whoop/health/domain/models/ProgressPlotDescription;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v0}, Lcom/whoop/health/domain/models/ProgressPlotDescription;->getMetricTitle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v0}, Lcom/whoop/health/domain/models/ProgressPlotDescription;->getStyle()Llz0/d;

    move-result-object v0

    invoke-static {v0}, Llz0/c;->h(Llz0/d;)Ly81/f;

    move-result-object v0

    invoke-direct {v4, v6, v7, v0}, Lfj1/i;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/ProgressBarDescriptionCardModel;->getPlot()Lcom/whoop/design/models/items/PregnancyTilePlot;

    move-result-object v0

    const/16 v6, 0xa

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/whoop/design/models/items/PregnancyTilePlot;->getProgressBars()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_5

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v0, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/design/models/items/PregnancyProgressBarModel;

    new-instance v9, Llz0/a;

    invoke-virtual {v8}, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->getStyle()Llz0/d;

    move-result-object v10

    invoke-static {v10}, Llz0/c;->h(Llz0/d;)Ly81/f;

    move-result-object v10

    invoke-virtual {v8}, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->getRangeMin()D

    move-result-wide v11

    double-to-float v11, v11

    invoke-virtual {v8}, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->getRangeMax()D

    move-result-wide v12

    double-to-float v12, v12

    invoke-virtual {v8}, Lcom/whoop/design/models/items/PregnancyProgressBarModel;->getCurrentValue()Ljava/lang/Double;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    double-to-float v8, v13

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    move-object v13, v8

    goto :goto_4

    :cond_4
    move-object v13, v5

    :goto_4
    const/4 v14, 0x0

    invoke-direct/range {v9 .. v14}, Llz0/a;-><init>(Ly81/f;FFLjava/lang/Float;Z)V

    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    move-object v7, v5

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/health/domain/models/ProgressBarDescriptionCardModel;->getPlot()Lcom/whoop/design/models/items/PregnancyTilePlot;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/whoop/design/models/items/PregnancyTilePlot;->getLabels()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_9

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v0, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/models/items/PregnancyProgressLabelModel;

    invoke-virtual {v6}, Lcom/whoop/design/models/items/PregnancyProgressLabelModel;->getLabel()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v6}, Lcom/whoop/design/models/items/PregnancyProgressLabelModel;->getXposition()D

    move-result-wide v9

    double-to-float v9, v9

    invoke-virtual {v6}, Lcom/whoop/design/models/items/PregnancyProgressLabelModel;->getStyle()Llz0/d;

    move-result-object v10

    sget-object v11, Llz0/d;->INACTIVE:Llz0/d;

    if-ne v10, v11, :cond_7

    invoke-virtual {v6}, Lcom/whoop/design/models/items/PregnancyProgressLabelModel;->getStyle()Llz0/d;

    move-result-object v10

    invoke-static {v10}, Llz0/c;->h(Llz0/d;)Ly81/f;

    move-result-object v10

    goto :goto_6

    :cond_7
    sget-object v10, Ly81/f;->BRAND_WHITE:Ly81/f;

    :goto_6
    invoke-virtual {v6}, Lcom/whoop/design/models/items/PregnancyProgressLabelModel;->getStyle()Llz0/d;

    move-result-object v6

    if-eq v6, v11, :cond_8

    const/4 v6, 0x1

    goto :goto_7

    :cond_8
    move v6, v1

    :goto_7
    new-instance v11, Llz0/b;

    invoke-direct {v11, v9, v8, v10, v6}, Llz0/b;-><init>(FLcom/whoop/design/util/TextResource;Ly81/f;Z)V

    invoke-interface {v5, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_9
    invoke-virtual {p0}, Lcom/whoop/health/domain/models/ProgressBarDescriptionCardModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v8

    new-instance v1, Lfj1/m;

    move-object v6, v7

    move-object v7, v5

    const/4 v5, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v10}, Lfj1/m;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lfj1/i;Ls21/i;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final I(ZLcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;)Lcj1/v;
    .locals 20

    const-string v0, "model"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->getEndIcon()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const/4 v8, 0x0

    if-ge v7, v5, :cond_1

    aget-object v9, v4, v7

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    move-object v9, v8

    :goto_1
    if-nez v9, :cond_2

    goto :goto_2

    :cond_2
    move-object v3, v9

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->getBody()Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;->getTitle()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object v10, v4

    goto :goto_3

    :cond_3
    move-object v10, v8

    :goto_3
    invoke-virtual {v0}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;->getMetricTitle()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object v12, v4

    goto :goto_4

    :cond_4
    move-object v12, v8

    :goto_4
    invoke-virtual {v0}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;->getIcon()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v7, v5

    move v9, v6

    :goto_5
    if-ge v9, v7, :cond_6

    aget-object v11, v5, v9

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5

    goto :goto_6

    :cond_5
    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_6
    move-object v11, v8

    :goto_6
    move-object v13, v11

    goto :goto_7

    :cond_7
    move-object v13, v8

    :goto_7
    invoke-virtual {v0}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;->getStatusText()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object v14, v4

    goto :goto_8

    :cond_8
    move-object v14, v8

    :goto_8
    invoke-virtual {v0}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;->getStatus()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/whoop/design/models/items/CyclePhaseStyle;->values()[Lcom/whoop/design/models/items/CyclePhaseStyle;

    move-result-object v5

    array-length v7, v5

    move v9, v6

    :goto_9
    if-ge v9, v7, :cond_a

    aget-object v11, v5, v9

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_9

    goto :goto_a

    :cond_9
    add-int/lit8 v9, v9, 0x1

    goto :goto_9

    :cond_a
    move-object v11, v8

    :goto_a
    invoke-static {v11}, Llb1/s0;->a(Lcom/whoop/design/models/items/CyclePhaseStyle;)Ly81/f;

    move-result-object v15

    invoke-virtual {v0}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;->getSupertitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v11, v0

    goto :goto_b

    :cond_b
    move-object v11, v8

    :goto_b
    new-instance v4, Lcj1/t;

    move-object v9, v4

    invoke-direct/range {v9 .. v15}, Lcj1/t;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    invoke-virtual {v1}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->getGraph()Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    move-result-object v9

    if-eqz p0, :cond_c

    sget-object v0, Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;->HEALTH_TAB_V2:Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    :goto_c
    move-object v15, v0

    goto :goto_d

    :cond_c
    sget-object v0, Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;->HEALTH_TAB:Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    goto :goto_c

    :goto_d
    const/16 v18, 0xdb

    const/16 v19, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v9 .. v19}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->copy$default(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;Lcom/whoop/design/models/items/TickMarksStyle;ZLjava/util/List;Ljava/util/List;Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;Lcom/whoop/design/models/items/ExpectedAnnotationModel;Lcom/whoop/design/models/items/TickMarkFooterModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    move-result-object v0

    invoke-static {v0}, Llb1/t0;->a(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;)Lf11/e;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->getFooter()Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;->getIcon()Ljava/lang/String;

    move-result-object v7

    sget-object v9, Lgz0/m0;->MENSTRUAL_CYCLE:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v10

    array-length v11, v10

    :goto_e
    if-ge v6, v11, :cond_e

    aget-object v12, v10, v6

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    goto :goto_f

    :cond_d
    add-int/lit8 v6, v6, 0x1

    goto :goto_e

    :cond_e
    move-object v12, v8

    :goto_f
    if-nez v12, :cond_f

    goto :goto_10

    :cond_f
    move-object v9, v12

    :goto_10
    invoke-virtual {v0}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v6, Lcj1/u;

    invoke-direct {v6, v9, v0}, Lcj1/u;-><init>(Lgz0/m0;Lcom/whoop/design/util/TextResource;)V

    move-object v0, v8

    goto :goto_11

    :cond_10
    move-object v0, v8

    move-object v6, v0

    :goto_11
    invoke-virtual {v1}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->getLogButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v7

    if-eqz v7, :cond_11

    invoke-static {v7}, Ldj1/c;->Q(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;

    move-result-object v7

    goto :goto_12

    :cond_11
    move-object v7, v0

    :goto_12
    invoke-virtual {v1}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->getTrend()Lcom/whoop/design/models/items/ImpactModel;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-static {v1}, Llb1/g2;->d(Lcom/whoop/design/models/items/ImpactModel;)Lhy0/c2;

    move-result-object v0

    :cond_12
    move-object v9, v0

    new-instance v1, Lcj1/v;

    invoke-direct/range {v1 .. v9}, Lcj1/v;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcj1/t;Lf11/e;Lcj1/u;Lny0/h;Lcom/whoop/navigation/e;Lhy0/c2;)V

    return-object v1
.end method

.method private static final J(Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;)Lcj1/r;
    .locals 17

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->getCardName()Ljava/lang/String;

    move-result-object v0

    const-string v2, ""

    if-nez v0, :cond_0

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object v4, v0

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->getCardName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    move-object v5, v2

    goto :goto_1

    :cond_1
    move-object v5, v0

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->getEndIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    sget-object v7, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v8

    array-length v9, v8

    const/4 v10, 0x0

    :goto_2
    if-ge v10, v9, :cond_3

    aget-object v11, v8, v10

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_3
    const/4 v11, 0x0

    :goto_3
    if-nez v11, :cond_4

    goto :goto_4

    :cond_4
    move-object v7, v11

    goto :goto_4

    :cond_5
    const/4 v7, 0x0

    :goto_4
    new-instance v0, Lcj1/o;

    invoke-virtual {v1}, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->getBodyContent()Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;->getText()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_6

    move-object v8, v2

    :cond_6
    invoke-virtual {v1}, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->getBodyContent()Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;->getImageUrl()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_7

    invoke-static {v9}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v9

    if-nez v9, :cond_8

    :cond_7
    sget-object v9, Lkd1/o$b;->b:Lkd1/o$b;

    :cond_8
    invoke-virtual {v1}, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->getBodyContent()Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/health/domain/models/HorizontalRecordsTileBodyContentModel;->getPill()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v0, v8, v9, v10}, Lcj1/o;-><init>(Ljava/lang/String;Lkd1/o;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->getTitle()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_a

    invoke-virtual {v1}, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->getTag()Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;

    move-result-object v8

    if-eqz v8, :cond_9

    invoke-virtual {v8}, Lcom/whoop/health/domain/models/HorizontalRecordsTileTagModel;->getTitle()Ljava/lang/String;

    move-result-object v8

    goto :goto_5

    :cond_9
    const/4 v8, 0x0

    :cond_a
    :goto_5
    invoke-virtual {v1}, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->getFooter()Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;

    move-result-object v9

    if-eqz v9, :cond_14

    invoke-virtual {v9}, Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;->getStartTitle()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_b

    move-object v10, v2

    :cond_b
    invoke-virtual {v9}, Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;->getEndTitle()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9}, Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;->getIcon()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_f

    sget-object v13, Lgz0/m0;->TINY_ELLIPSE:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v14

    array-length v15, v14

    const/4 v3, 0x0

    :goto_6
    if-ge v3, v15, :cond_d

    aget-object v16, v14, v3

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    goto :goto_7

    :cond_c
    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_d
    const/16 v16, 0x0

    :goto_7
    if-nez v16, :cond_e

    goto :goto_8

    :cond_e
    move-object/from16 v13, v16

    goto :goto_8

    :cond_f
    const/4 v13, 0x0

    :goto_8
    invoke-virtual {v9}, Lcom/whoop/health/domain/models/HorizontalRecordsTileFooterModel;->getStatus()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_10

    goto :goto_9

    :cond_10
    move-object v2, v3

    :goto_9
    sget-object v3, Lcj1/q;->PENDING:Lcj1/q;

    invoke-static {}, Lcj1/q;->values()[Lcj1/q;

    move-result-object v6

    array-length v9, v6

    const/4 v12, 0x0

    :goto_a
    if-ge v12, v9, :cond_12

    aget-object v14, v6, v12

    invoke-virtual {v14}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_11

    move-object v6, v14

    goto :goto_b

    :cond_11
    add-int/lit8 v12, v12, 0x1

    goto :goto_a

    :cond_12
    const/4 v6, 0x0

    :goto_b
    if-nez v6, :cond_13

    goto :goto_c

    :cond_13
    move-object v3, v6

    :goto_c
    new-instance v6, Lcj1/p;

    invoke-direct {v6, v10, v11, v13, v3}, Lcj1/p;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcj1/q;)V

    move-object v9, v6

    goto :goto_d

    :cond_14
    const/4 v9, 0x0

    :goto_d
    invoke-virtual {v1}, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->getCta()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v11

    new-instance v3, Lcj1/r;

    move-object v6, v7

    move-object v7, v0

    invoke-direct/range {v3 .. v11}, Lcj1/r;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcj1/o;Ljava/lang/String;Lcj1/p;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-object v3
.end method

.method private static final K(Lcom/whoop/health/domain/models/HealthspanHeroMetricModel;)Lej1/y;
    .locals 12

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldh0/a;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ldh0/a;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/HealthspanHeroMetricModel;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    move-object v0, v4

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Lny0/h;

    if-eqz v5, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lny0/h;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object v1

    move-object v7, v1

    goto :goto_1

    :cond_2
    move-object v7, v2

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/health/domain/models/HealthspanHeroMetricModel;->isCalibrating()Z

    move-result v3

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/HealthspanHeroMetricModel;->getHasOnboarded()Z

    move-result v5

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v6, 0x0

    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    move v8, v6

    goto :goto_2

    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/u;

    instance-of v1, v1, Lc51/s;

    if-eqz v1, :cond_5

    const/4 v0, 0x1

    move v8, v0

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/health/domain/models/HealthspanHeroMetricModel;->getStyle()Ljava/lang/String;

    move-result-object p0

    sget-object v0, Lcom/whoop/health/domain/models/HealthspanHeroMetricStyle;->UNLOCKED:Lcom/whoop/health/domain/models/HealthspanHeroMetricStyle;

    invoke-static {}, Lcom/whoop/health/domain/models/HealthspanHeroMetricStyle;->values()[Lcom/whoop/health/domain/models/HealthspanHeroMetricStyle;

    move-result-object v1

    array-length v9, v1

    :goto_3
    if-ge v6, v9, :cond_7

    aget-object v10, v1, v6

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    move-object v2, v10

    goto :goto_4

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    if-nez v2, :cond_8

    move-object v6, v0

    goto :goto_5

    :cond_8
    move-object v6, v2

    :goto_5
    new-instance v2, Lcj1/m;

    invoke-direct/range {v2 .. v8}, Lcj1/m;-><init>(ZLjava/util/List;ZLcom/whoop/health/domain/models/HealthspanHeroMetricStyle;Lcom/whoop/navigation/e;Z)V

    new-instance p0, Lej1/y;

    invoke-direct {p0, v2}, Lej1/y;-><init>(Lcj1/m;)V

    return-object p0
.end method

.method private static final L(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldh0/a;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ldh0/a;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldh0/a;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ldh0/a;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ldj1/c$k;

    invoke-direct {v2, v0}, Ldj1/c$k;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;)Lc51/s;
    .locals 15

    const-string v0, "amoebaModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lc51/n;

    const/16 v13, 0x7ff

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v1 .. v14}, Lc51/n;-><init>(FFLc51/w;Lc51/e;Lc51/y;Lc51/t;Ljava/util/List;Ll83/k;FLc51/x;Lc51/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/high16 v0, 0x3f400000    # 0.75f

    invoke-virtual {v1, v0}, Lc51/n;->p(F)Lc51/n;

    move-result-object v0

    new-instance v1, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;

    invoke-direct {v1, v0}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;-><init>(Lc51/n;)V

    new-instance v0, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p0, v2, v2, v3}, Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult$Result;-><init>(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Lc51/p;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Z)V

    invoke-virtual {v1, v0}, Lcom/whoop/design/models/items/amoeba/reducers/AmoebaViewStateReducer;->reduce(Lcom/whoop/design/models/items/amoeba/AmoebaDomainResult;)Lc51/s;

    move-result-object p0

    return-object p0
.end method

.method private static final O(Ljava/lang/String;)Z
    .locals 4

    sget-object v0, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-static {v0}, Lorg/joda/time/DateTime;->now(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/joda/time/DateTime;->minusDays(I)Lorg/joda/time/DateTime;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz p0, :cond_0

    :try_start_0
    sget-object v3, Lor2/u;->b:Lor2/u$a;

    invoke-virtual {v3}, Lor2/u$a;->f()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v3

    invoke-static {p0, v3}, Lorg/joda/time/DateTime;->parse(Ljava/lang/String;Lorg/joda/time/format/DateTimeFormatter;)Lorg/joda/time/DateTime;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    if-eqz v2, :cond_1

    invoke-virtual {v0, v2}, Lorg/joda/time/base/AbstractInstant;->isAfter(Lorg/joda/time/ReadableInstant;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private static final P(Ljava/util/List;)Lj71/c;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)",
            "Lj71/c;"
        }
    .end annotation

    const v0, 0x3e4ccccd    # 0.2f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const v1, 0x3ecccccd    # 0.4f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const v2, 0x3f19999a    # 0.6f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const v3, 0x3f4ccccd    # 0.8f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v9

    new-instance v8, Lj61/f;

    const/16 v16, 0x7e

    const/16 v17, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v8 .. v17}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Lj61/h;

    new-instance v6, Lh2/c;

    const v0, 0x3ccccccd    # 0.025f

    const v2, 0x3ca3d70a    # 0.02f

    invoke-direct {v6, v0, v2, v2, v2}, Lh2/c;-><init>(FFFF)V

    const/16 v16, 0x1fcf

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v1 .. v17}, Lj61/h;-><init>(Lg61/b;Lg61/b;Lg61/b;Lg61/b;Lh2/c;Ljava/util/List;Ljava/util/List;Lj61/g;ZZLg61/g;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lj71/c;

    const/4 v0, 0x6

    move-object/from16 v3, p0

    invoke-static {v3, v2, v2, v0, v2}, Lrk1/b;->b(Ljava/util/List;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)Lj71/b$g;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    const/16 v14, 0xc

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-object v10, v1

    invoke-direct/range {v9 .. v15}, Lj71/c;-><init>(Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v9
.end method

.method private static final Q(Lcom/whoop/design/models/items/CardButtonModel;)Lny0/h;
    .locals 28

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    sget-object v3, Lgz0/m0;->ADD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

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
    move-object v7, v2

    :goto_1
    if-nez v7, :cond_2

    goto :goto_2

    :cond_2
    move-object v3, v7

    goto :goto_2

    :cond_3
    move-object v3, v2

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    if-nez v0, :cond_4

    new-instance v4, Lcom/whoop/navigation/e;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v4

    goto :goto_3

    :cond_4
    move-object v8, v0

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v20

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CardButtonModel;->getDismissEvent()Lcom/whoop/navigation/DismissEventModel;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0}, Lj02/u;->a(Lcom/whoop/navigation/DismissEventModel;)Lj02/s;

    move-result-object v2

    :cond_5
    move-object/from16 v21, v2

    new-instance v0, Lny0/h;

    const v26, 0x1e79f7c

    const/16 v27, 0x0

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v0 .. v27}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final R(Lri1/g$e;)Lcj1/i$b;
    .locals 13

    instance-of p0, p0, Lri1/g$a;

    if-eqz p0, :cond_0

    sget p0, Lks0/a;->d:I

    invoke-static {p0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    sget p0, Lks0/a;->b:I

    invoke-static {p0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    sget p0, Lks0/a;->c:I

    invoke-static {p0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    sget-object v8, Lj11/p;->LOTTIE:Lj11/p;

    sget-object v9, Lcj1/g$e;->a:Lcj1/g$e;

    new-instance v0, Lcj1/i$b;

    const/16 v11, 0xc

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v10, v9

    invoke-direct/range {v0 .. v12}, Lcj1/i$b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lcj1/g;Lcj1/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static synthetic a(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Lcom/whoop/health/domain/models/ScreenerStatusTileBodyModel;)Lej1/j0;
    .locals 0

    invoke-static {p0, p1}, Ldj1/c;->z(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Lcom/whoop/health/domain/models/ScreenerStatusTileBodyModel;)Lej1/j0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ZLjb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ldj1/c;->C(ZLjb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Lcom/whoop/health/domain/models/ImageVisualizationCardBodyModel;)Lej1/c0;
    .locals 0

    invoke-static {p0, p1}, Ldj1/c;->y(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Lcom/whoop/health/domain/models/ImageVisualizationCardBodyModel;)Lej1/c0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ZLlb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ldj1/c;->D(ZLlb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/health/domain/models/DataVisualizationCardModel;)Lcj1/e;
    .locals 0

    invoke-static {p0}, Ldj1/c;->E(Lcom/whoop/health/domain/models/DataVisualizationCardModel;)Lcj1/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/health/domain/models/HealthspanHeroMetricModel;)Lej1/y;
    .locals 0

    invoke-static {p0}, Ldj1/c;->K(Lcom/whoop/health/domain/models/HealthspanHeroMetricModel;)Lej1/y;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldj1/c;->L(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;)Lcj1/a;
    .locals 0

    invoke-static {p0}, Ldj1/c;->x(Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;)Lcj1/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;)Lc51/s;
    .locals 0

    invoke-static {p0}, Ldj1/c;->N(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;)Lc51/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ldj1/c;->w(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/whoop/health/domain/models/EntryPointLockedCardModel;)Lfj1/c;
    .locals 0

    invoke-static {p0}, Ldj1/c;->F(Lcom/whoop/health/domain/models/EntryPointLockedCardModel;)Lfj1/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ldj1/c;->v(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldj1/c;->M(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldj1/c;->A(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldj1/c;->G(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/whoop/health/domain/models/ProgressBarDescriptionCardModel;)Lfj1/m;
    .locals 0

    invoke-static {p0}, Ldj1/c;->H(Lcom/whoop/health/domain/models/ProgressBarDescriptionCardModel;)Lfj1/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(ZLcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;)Lcj1/v;
    .locals 0

    invoke-static {p0, p1}, Ldj1/c;->I(ZLcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;)Lcj1/v;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;)Lcj1/r;
    .locals 0

    invoke-static {p0}, Ldj1/c;->J(Lcom/whoop/health/domain/models/HorizontalRecordsTileModel;)Lcj1/r;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s(Lri1/g$e;)Lcj1/i$b;
    .locals 0

    invoke-static {p0}, Ldj1/c;->R(Lri1/g$e;)Lcj1/i$b;

    move-result-object p0

    return-object p0
.end method

.method private static final t(Lcom/whoop/health/domain/models/DataVisHeaderModel;)Lcj1/b;
    .locals 8

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/DataVisHeaderModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/DataVisHeaderModel;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/DataVisHeaderModel;->getIcon()Ljava/lang/String;

    move-result-object p0

    sget-object v2, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v3

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v6, v3, v5

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result p0

    new-instance v2, Lcj1/b;

    invoke-direct {v2, v0, v1, p0}, Lcj1/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;I)V

    return-object v2
.end method

.method private static final u(Ljava/util/List;Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;",
            ")",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    new-instance v0, Ldj1/b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Ldj1/b;-><init>(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final v(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lny0/h;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Ldj1/c$a;

    invoke-direct {v1}, Ldj1/c$a;-><init>()V

    invoke-virtual {p1, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Ldj1/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ldj1/b;-><init>(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;I)V

    invoke-virtual {p1, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldh0/a;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ldh0/a;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Ldj1/c$b;

    invoke-direct {v3, v0}, Ldj1/c$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Ldj1/b;

    const/4 v2, 0x2

    invoke-direct {v0, p0, v2}, Ldj1/b;-><init>(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;I)V

    const-class v2, Lcom/whoop/health/domain/models/ImageVisualizationCardBodyModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Ldj1/c$c;

    invoke-direct {v3, v0}, Ldj1/c$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Ldj1/b;

    const/4 v2, 0x3

    invoke-direct {v0, p0, v2}, Ldj1/b;-><init>(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;I)V

    const-class p0, Lcom/whoop/health/domain/models/ScreenerStatusTileBodyModel;

    invoke-virtual {v1, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    new-instance v1, Ldj1/c$d;

    invoke-direct {v1, v0}, Ldj1/c$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0, v1}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;)Lcj1/a;
    .locals 26

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->getGraph()Lcom/whoop/design/models/items/graph/GraphModel;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    sget-object v3, Ldj1/c;->a:Ljb1/a;

    invoke-virtual {v3, v0}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v0

    const-string v3, "null cannot be cast to non-null type com.whoop.design.atomic.organism.graph.state.GraphState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lj71/c;

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->getCardSupplementalInfo()Lcom/whoop/health/domain/models/CardSupplementalInfo;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/health/domain/models/CardSupplementalInfo;->getTrailingEcgSamples()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-static {v0}, Ldj1/c;->P(Ljava/util/List;)Lj71/c;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v2

    goto :goto_0

    :cond_2
    move-object v7, v2

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->getTrend()Lcom/whoop/design/models/items/ImpactModel;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v8, Lhy0/c2;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ImpactModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ImpactModel;->getBackgroundEnabled()Z

    move-result v10

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ImpactModel;->getTrend()Lhy0/b2;

    move-result-object v11

    const/16 v24, 0x7ff0

    const/16 v25, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v8 .. v25}, Lhy0/c2;-><init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v8

    goto :goto_2

    :cond_3
    move-object v6, v2

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->getPrefixCta()Lcom/whoop/design/models/items/CtaTileModel;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, Llb1/a5;->d0(Lcom/whoop/design/models/items/CtaTileModel;)Ld11/i;

    move-result-object v0

    new-instance v3, Lcj1/d;

    sget-object v4, Lcj1/c;->Companion:Lcj1/c$f;

    invoke-virtual {v0}, Ld11/i;->G()Lkd1/l;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcj1/c$f;->a(Lkd1/l;)Lcj1/c;

    move-result-object v4

    invoke-direct {v3, v0, v4}, Lcj1/d;-><init>(Ld11/i;Lcj1/c;)V

    move-object v8, v3

    goto :goto_3

    :cond_4
    move-object v8, v2

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->getSuffixCta()Lcom/whoop/design/models/items/CtaTileModel;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0}, Llb1/a5;->d0(Lcom/whoop/design/models/items/CtaTileModel;)Ld11/i;

    move-result-object v0

    new-instance v2, Lcj1/d;

    sget-object v3, Lcj1/c;->Companion:Lcj1/c$f;

    invoke-virtual {v0}, Ld11/i;->G()Lkd1/l;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcj1/c$f;->a(Lkd1/l;)Lcj1/c;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lcj1/d;-><init>(Ld11/i;Lcj1/c;)V

    :cond_5
    move-object v9, v2

    invoke-virtual {v1}, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->getHeading()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v3, Lcj1/a;

    invoke-direct/range {v3 .. v9}, Lcj1/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/c2;Lj71/c;Lcj1/d;Lcj1/d;)V

    return-object v3
.end method

.method private static final y(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Lcom/whoop/health/domain/models/ImageVisualizationCardBodyModel;)Lej1/c0;
    .locals 24

    const-string v0, "model"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;->getShepherdHighWaterMark()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    invoke-static {v2}, Ldj1/c;->O(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lcom/whoop/health/domain/models/ImageVisualizationTrend;

    sget v3, Loi1/a;->c:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    const/4 v4, 0x1

    sget-object v5, Lhy0/b2;->NONE:Lhy0/b2;

    invoke-direct {v2, v3, v4, v5, v0}, Lcom/whoop/health/domain/models/ImageVisualizationTrend;-><init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;Ljava/lang/String;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/health/domain/models/ImageVisualizationCardBodyModel;->getTrends()Ljava/util/List;

    move-result-object v0

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/health/domain/models/ImageVisualizationCardBodyModel;->getSubtitle()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/health/domain/models/ImageVisualizationCardBodyModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/health/domain/models/ImageVisualizationTrend;

    invoke-virtual {v5}, Lcom/whoop/health/domain/models/ImageVisualizationTrend;->getTitleDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v5}, Lcom/whoop/health/domain/models/ImageVisualizationTrend;->getBackgroundEnabled()Z

    move-result v8

    invoke-virtual {v5}, Lcom/whoop/health/domain/models/ImageVisualizationTrend;->getTrend()Lhy0/b2;

    move-result-object v9

    new-instance v6, Lhy0/c2;

    const/16 v22, 0x7fb0

    const/16 v23, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v6 .. v23}, Lhy0/c2;-><init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    new-instance v7, Lkd1/o$c;

    invoke-virtual {v1}, Lcom/whoop/health/domain/models/ImageVisualizationCardBodyModel;->getImageUrl()Ljava/lang/String;

    move-result-object v8

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lej1/c0;

    invoke-direct {v0, v2, v3, v4, v7}, Lej1/c0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lkd1/o;)V

    return-object v0
.end method

.method private static final z(Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;Lcom/whoop/health/domain/models/ScreenerStatusTileBodyModel;)Lej1/j0;
    .locals 14

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/health/domain/models/ScreenerStatusTileBodyModel;->getHeartScreenerStatuses()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/health/domain/models/HeartScreenerStatus;

    invoke-virtual {v2}, Lcom/whoop/health/domain/models/HeartScreenerStatus;->getFeature()Ljava/lang/String;

    move-result-object v3

    const-string v4, "SHEPHERD"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v3, :cond_4

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/health/domain/models/HeartScreenerUpdatedAtInfoModel;->getShepherdHighWaterMark()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_0
    move-object v3, v5

    :goto_1
    invoke-static {v3}, Ldj1/c;->O(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v2}, Lcom/whoop/health/domain/models/HeartScreenerStatus;->getDescription()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v6, Lgz0/m0;->REMOVE:Lgz0/m0;

    sget-object v7, Lhy0/b2;->NO_CHANGE:Lhy0/b2;

    invoke-virtual {v2}, Lcom/whoop/health/domain/models/HeartScreenerStatus;->getFeature()Ljava/lang/String;

    move-result-object v2

    sget-object v8, Lej1/g0;->SHEPHERD:Lej1/g0;

    invoke-static {}, Lej1/g0;->values()[Lej1/g0;

    move-result-object v9

    array-length v10, v9

    :goto_2
    if-ge v4, v10, :cond_2

    aget-object v11, v9, v4

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    move-object v5, v11

    goto :goto_3

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    :goto_3
    if-nez v5, :cond_3

    goto :goto_4

    :cond_3
    move-object v8, v5

    :goto_4
    new-instance v2, Lej1/z;

    invoke-direct {v2, v3, v8, v6, v7}, Lej1/z;-><init>(Lcom/whoop/design/util/TextResource;Lej1/g0;Lgz0/m0;Lhy0/b2;)V

    goto/16 :goto_e

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/health/domain/models/HeartScreenerStatus;->getDescription()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v2}, Lcom/whoop/health/domain/models/HeartScreenerStatus;->getMiniStatus()Lcom/whoop/health/domain/models/MiniStatus;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/health/domain/models/MiniStatus;->getIcon()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lgz0/m0;->TINY_ELLIPSE:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v8

    array-length v9, v8

    move v10, v4

    :goto_5
    if-ge v10, v9, :cond_6

    aget-object v11, v8, v10

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    goto :goto_6

    :cond_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    :cond_6
    move-object v11, v5

    :goto_6
    if-nez v11, :cond_7

    goto :goto_7

    :cond_7
    move-object v7, v11

    :goto_7
    invoke-virtual {v2}, Lcom/whoop/health/domain/models/HeartScreenerStatus;->getMiniStatus()Lcom/whoop/health/domain/models/MiniStatus;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/health/domain/models/MiniStatus;->getStyle()Ljava/lang/String;

    move-result-object v6

    sget-object v8, Lhy0/b2;->NONE:Lhy0/b2;

    invoke-static {}, Lhy0/b2;->values()[Lhy0/b2;

    move-result-object v9

    array-length v10, v9

    move v11, v4

    :goto_8
    if-ge v11, v10, :cond_9

    aget-object v12, v9, v11

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    goto :goto_9

    :cond_8
    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    :cond_9
    move-object v12, v5

    :goto_9
    if-nez v12, :cond_a

    goto :goto_a

    :cond_a
    move-object v8, v12

    :goto_a
    invoke-virtual {v2}, Lcom/whoop/health/domain/models/HeartScreenerStatus;->getFeature()Ljava/lang/String;

    move-result-object v2

    sget-object v6, Lej1/g0;->LABRADOR:Lej1/g0;

    invoke-static {}, Lej1/g0;->values()[Lej1/g0;

    move-result-object v9

    array-length v10, v9

    :goto_b
    if-ge v4, v10, :cond_c

    aget-object v11, v9, v4

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    move-object v5, v11

    goto :goto_c

    :cond_b
    add-int/lit8 v4, v4, 0x1

    goto :goto_b

    :cond_c
    :goto_c
    if-nez v5, :cond_d

    goto :goto_d

    :cond_d
    move-object v6, v5

    :goto_d
    new-instance v2, Lej1/z;

    invoke-direct {v2, v3, v6, v7, v8}, Lej1/z;-><init>(Lcom/whoop/design/util/TextResource;Lej1/g0;Lgz0/m0;Lhy0/b2;)V

    :goto_e
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_e
    invoke-virtual {p1}, Lcom/whoop/health/domain/models/ScreenerStatusTileBodyModel;->getSpanningText()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    new-instance p1, Lej1/j0;

    invoke-direct {p1, v1, p0}, Lej1/j0;-><init>(Ljava/util/List;Lcom/whoop/design/util/TextResource;)V

    return-object p1
.end method
