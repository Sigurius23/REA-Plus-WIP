.class public final Lbp1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lbp1/c;",
        "",
        "Landroidx/fragment/app/m0;",
        "fragment",
        "Lj02/o0;",
        "navigator",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Landroidx/fragment/app/m0;Lj02/o0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "b",
        "(Lcom/whoop/navigation/NavigationScreenModel;)Lcom/whoop/navigation/NavigationScreenModel;",
        "Lbp1/b;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lbp1/b;)V",
        "Landroidx/fragment/app/m0;",
        "Lj02/o0;",
        "c",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
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
.field private final a:Landroidx/fragment/app/m0;

.field private final b:Lj02/o0;

.field private final c:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/m0;Lj02/o0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "fragment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbp1/c;->a:Landroidx/fragment/app/m0;

    iput-object p2, p0, Lbp1/c;->b:Lj02/o0;

    iput-object p3, p0, Lbp1/c;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method private final b(Lcom/whoop/navigation/NavigationScreenModel;)Lcom/whoop/navigation/NavigationScreenModel;
    .locals 7

    instance-of v0, p1, Lcom/whoop/navigation/IntegrationsScreenModel;

    if-eqz v0, :cond_0

    move-object v1, p1

    check-cast v1, Lcom/whoop/navigation/IntegrationsScreenModel;

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const-string v3, "MCI_ONBOARDING"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/navigation/IntegrationsScreenModel;->copy$default(Lcom/whoop/navigation/IntegrationsScreenModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILjava/lang/Object;)Lcom/whoop/navigation/IntegrationsScreenModel;

    move-result-object p1

    :cond_0
    return-object p1
.end method


# virtual methods
.method public final a(Lbp1/b;)V
    .locals 14

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lbp1/b$a;->a:Lbp1/b$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lbp1/c;->a:Landroidx/fragment/app/m0;

    invoke-static {p1}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p1

    invoke-virtual {p1}, Lor2/s;->i()Z

    return-void

    :cond_0
    instance-of v0, p1, Lbp1/b$b;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lbp1/c;->a:Landroidx/fragment/app/m0;

    invoke-static {v0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0}, Leb/a0;->z()Z

    check-cast p1, Lbp1/b$b;

    invoke-virtual {p1}, Lbp1/b$b;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lbp1/c;->b:Lj02/o0;

    new-instance v0, Lj02/m0$l3;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v1, "PREGNANCY_STORY_V2"

    const-string v2, "MCI_ONBOARDING"

    const-wide/16 v3, 0x0

    invoke-direct/range {v0 .. v6}, Lj02/m0$l3;-><init>(Ljava/lang/String;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_1
    iget-object p1, p0, Lbp1/c;->b:Lj02/o0;

    new-instance v0, Lj02/m0$q3;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, ""

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lj02/m0$q3;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_2
    sget-object v0, Lbp1/b$c;->a:Lbp1/b$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p1, p0, Lbp1/c;->a:Landroidx/fragment/app/m0;

    invoke-static {p1}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p1

    invoke-virtual {p1}, Leb/a0;->z()Z

    iget-object p1, p0, Lbp1/c;->c:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v0, "hormonal-insights-arch-v2"

    invoke-interface {p1, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lbp1/c;->b:Lj02/o0;

    new-instance v0, Lcom/whoop/navigation/e;

    sget-object v1, Lcom/whoop/navigation/AppScreen$k2;->w:Lcom/whoop/navigation/AppScreen$k2;

    new-instance v2, Lcom/whoop/navigation/GenericScreenModel;

    new-instance v3, Lcom/whoop/navigation/models/ApiRequest;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const-string v4, "womens-health-service/v1/hormonal-insights/overview"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/navigation/models/ApiRequest;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lkotlinx/serialization/json/JsonElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v12, 0x1fe

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v2 .. v13}, Lcom/whoop/navigation/GenericScreenModel;-><init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x4

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_3
    iget-object p1, p0, Lbp1/c;->b:Lj02/o0;

    new-instance v0, Lj02/m0$v2;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lj02/m0$v2;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_4
    instance-of v0, p1, Lbp1/b$d;

    if-eqz v0, :cond_5

    check-cast p1, Lbp1/b$d;

    invoke-virtual {p1}, Lbp1/b$d;->a()Lcom/whoop/navigation/e;

    move-result-object v0

    iget-object p1, p0, Lbp1/c;->b:Lj02/o0;

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v1

    invoke-direct {p0, v1}, Lbp1/c;->b(Lcom/whoop/navigation/NavigationScreenModel;)Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v2

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/whoop/navigation/e;->b(Lcom/whoop/navigation/e;Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILjava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-interface {p1, v0}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
