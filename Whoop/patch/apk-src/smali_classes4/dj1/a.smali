.class public final Ldj1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u000c*\u00020\u000f2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J=\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u0018H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u000fH\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010#R\u0014\u0010&\u001a\u00020$8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Ldj1/a;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lsl1/c;",
        "connectivityTileViewStateReducer",
        "Lyg2/c;",
        "liveHrMonitorReducer",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lsl1/c;Lyg2/c;)V",
        "Lri1/g$b;",
        "currentDialogType",
        "Lcj1/i;",
        "d",
        "(Lri1/g$b;)Lcj1/i;",
        "Lri1/h;",
        "Lcj1/i$b;",
        "dialog",
        "e",
        "(Lri1/h;Lcj1/i$b;)Lcj1/i;",
        "La11/r;",
        "connectivityTileItem",
        "Ln71/q;",
        "liveHrMonitorItem",
        "",
        "Lm91/u;",
        "itemsFromResponse",
        "a",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;La11/r;Ln71/q;Ljava/util/List;)Ljava/util/List;",
        "domainResult",
        "c",
        "(Lri1/h;)Lcj1/i;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "b",
        "Lsl1/c;",
        "Lyg2/c;",
        "Ljb1/a;",
        "()Ljb1/a;",
        "reducer",
        "health_release"
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
.field private final a:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final b:Lsl1/c;

.field private final c:Lyg2/c;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lsl1/c;Lyg2/c;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectivityTileViewStateReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "liveHrMonitorReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldj1/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 3
    iput-object p2, p0, Ldj1/a;->b:Lsl1/c;

    .line 4
    iput-object p3, p0, Ldj1/a;->c:Lyg2/c;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lsl1/c;Lyg2/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 5
    new-instance p2, Lsl1/c;

    invoke-direct {p2}, Lsl1/c;-><init>()V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 6
    new-instance p3, Lyg2/c;

    invoke-direct {p3}, Lyg2/c;-><init>()V

    .line 7
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Ldj1/a;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lsl1/c;Lyg2/c;)V

    return-void
.end method

.method private final a(Lcom/whoop/data/repositories/FeatureFlagChecker;La11/r;Ln71/q;Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/FeatureFlagChecker;",
            "La11/r;",
            "Ln71/q;",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;)",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    const-string v1, "health-tab-no-hr"

    invoke-interface {p1, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    invoke-virtual {p2}, La11/r;->o()Z

    move-result v1

    if-eqz p1, :cond_0

    if-eqz v1, :cond_4

    invoke-virtual {v0, p2}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v0, p2}, Ln83/c;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_1

    invoke-virtual {v0, p3}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p2, Lm91/c0;

    invoke-direct {p2, v3, v3, v2, p1}, Lm91/c0;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, p2}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {v0, p3}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance p2, Lm91/c0;

    invoke-direct {p2, v3, v3, v2, p1}, Lm91/c0;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, p2}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_4
    :goto_0
    check-cast p4, Ljava/util/Collection;

    invoke-virtual {v0, p4}, Ln83/c;->addAll(Ljava/util/Collection;)Z

    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p1

    return-object p1
.end method

.method private final d(Lri1/g$b;)Lcj1/i;
    .locals 17

    move-object/from16 v0, p1

    sget-object v1, Lri1/g$c;->a:Lri1/g$c;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v2, Lcj1/i;

    new-instance v3, Lcj1/i$c;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v4

    const/16 v15, 0x2ff

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    invoke-static/range {v4 .. v16}, Lsz0/q0;->d(Lsz0/q0;Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILjava/lang/Object;)Lsz0/q0;

    move-result-object v4

    const/4 v7, 0x6

    invoke-direct/range {v3 .. v8}, Lcj1/i$c;-><init>(Lsz0/q0;Lcj1/g;Lcj1/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v7, 0xe

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v8}, Lcj1/i;-><init>(Lcj1/i$c;Lcj1/i$d;Lcj1/i$a;Lcom/whoop/health/domain/models/HealthTabScrollBackgroundStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_0
    sget-object v1, Lri1/g$d;->a:Lri1/g$d;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_1

    new-instance v5, Lcj1/i;

    new-instance v6, Lcj1/i$c;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v7

    new-instance v8, Lcj1/g$m;

    invoke-direct {v8, v4, v3, v2}, Lcj1/g$m;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcj1/i$c;-><init>(Lsz0/q0;Lcj1/g;Lcj1/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v10, 0xe

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v11}, Lcj1/i;-><init>(Lcj1/i$c;Lcj1/i$d;Lcj1/i$a;Lcom/whoop/health/domain/models/HealthTabScrollBackgroundStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_1
    sget-object v1, Lri1/g$f;->a:Lri1/g$f;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v5, Lcj1/i;

    new-instance v6, Lcj1/i$c;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v7

    new-instance v8, Lcj1/g$m;

    invoke-direct {v8, v4, v3, v2}, Lcj1/g$m;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcj1/i$c;-><init>(Lsz0/q0;Lcj1/g;Lcj1/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v10, 0xe

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v11}, Lcj1/i;-><init>(Lcj1/i$c;Lcj1/i$d;Lcj1/i$a;Lcom/whoop/health/domain/models/HealthTabScrollBackgroundStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private final e(Lri1/h;Lcj1/i$b;)Lcj1/i;
    .locals 12

    invoke-virtual {p0}, Ldj1/a;->b()Ljb1/a;

    move-result-object v0

    invoke-virtual {p1}, Lri1/h;->f()Lcom/whoop/health/domain/models/HealthTabResponse;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/whoop/health/domain/models/HealthTabResponse;->getSections()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/health/domain/models/HealthTabSectionModel;

    invoke-virtual {v3}, Lcom/whoop/health/domain/models/HealthTabSectionModel;->getItems()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v2, v3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    sget-object v2, Lm83/y;->w:Lm83/y;

    :cond_1
    invoke-virtual {v0, v2}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Ldj1/a;->b:Lsl1/c;

    invoke-virtual {p1}, Lri1/h;->c()Lsl1/b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lsl1/c;->a(Lsl1/b;)La11/r;

    move-result-object v1

    invoke-virtual {p1}, Lri1/h;->f()Lcom/whoop/health/domain/models/HealthTabResponse;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/whoop/health/domain/models/HealthTabResponse;->getShowLiveHr()Ljava/lang/Boolean;

    move-result-object v2

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    goto :goto_1

    :cond_2
    move v2, v3

    :goto_1
    const/4 v4, 0x0

    if-nez v2, :cond_3

    iget-object v2, p0, Ldj1/a;->c:Lyg2/c;

    invoke-virtual {p1}, Lri1/h;->g()Lyg2/d;

    move-result-object v5

    invoke-virtual {v2, v5}, Lyg2/c;->b(Lyg2/d;)Ln71/q;

    move-result-object v2

    goto :goto_2

    :cond_3
    move-object v2, v4

    :goto_2
    iget-object v5, p0, Ldj1/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p0, v5, v1, v2, v0}, Ldj1/a;->a(Lcom/whoop/data/repositories/FeatureFlagChecker;La11/r;Ln71/q;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    new-instance v7, Lcj1/i$d;

    invoke-virtual {p1}, Lri1/h;->h()Z

    move-result v1

    invoke-virtual {p1}, Lri1/h;->h()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p1}, Lri1/h;->e()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, 0x1

    goto :goto_3

    :cond_4
    move v2, v3

    :goto_3
    invoke-direct {v7, v0, v1, v2, p2}, Lcj1/i$d;-><init>(Ljava/util/List;ZZLcj1/i$b;)V

    invoke-virtual {p1}, Lri1/h;->f()Lcom/whoop/health/domain/models/HealthTabResponse;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lcom/whoop/health/domain/models/HealthTabResponse;->getAnalytics()Lcom/whoop/health/domain/models/AnalyticsData;

    move-result-object p2

    if-eqz p2, :cond_5

    new-instance v0, Lcj1/i$a;

    invoke-virtual {p2}, Lcom/whoop/health/domain/models/AnalyticsData;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/whoop/health/domain/models/AnalyticsData;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, v1, p2}, Lcj1/i$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v8, v0

    goto :goto_4

    :cond_5
    move-object v8, v4

    :goto_4
    invoke-virtual {p1}, Lri1/h;->f()Lcom/whoop/health/domain/models/HealthTabResponse;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/whoop/health/domain/models/HealthTabResponse;->getScrollBackgroundStyle()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_8

    sget-object p2, Lcom/whoop/health/domain/models/HealthTabScrollBackgroundStyle;->NONE:Lcom/whoop/health/domain/models/HealthTabScrollBackgroundStyle;

    invoke-static {}, Lcom/whoop/health/domain/models/HealthTabScrollBackgroundStyle;->values()[Lcom/whoop/health/domain/models/HealthTabScrollBackgroundStyle;

    move-result-object v0

    array-length v1, v0

    :goto_5
    if-ge v3, v1, :cond_7

    aget-object v2, v0, v3

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    move-object v4, v2

    goto :goto_6

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_7
    :goto_6
    if-nez v4, :cond_8

    move-object v4, p2

    :cond_8
    move-object v9, v4

    new-instance v5, Lcj1/i;

    const/4 v6, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v11}, Lcj1/i;-><init>(Lcj1/i$c;Lcj1/i$d;Lcj1/i$a;Lcom/whoop/health/domain/models/HealthTabScrollBackgroundStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method


# virtual methods
.method public final b()Ljb1/a;
    .locals 2

    iget-object v0, p0, Ldj1/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "hormonal-insights-updates"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ldj1/c;->B(Z)Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method public final c(Lri1/h;)Lcj1/i;
    .locals 2

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lri1/h;->d()Lri1/g;

    move-result-object v0

    instance-of v1, v0, Lri1/g$b;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lri1/h;->d()Lri1/g;

    move-result-object p1

    check-cast p1, Lri1/g$b;

    invoke-direct {p0, p1}, Ldj1/a;->d(Lri1/g$b;)Lcj1/i;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, v0, Lri1/g$e;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lri1/h;->d()Lri1/g;

    move-result-object v0

    check-cast v0, Lri1/g$e;

    invoke-static {v0}, Ldj1/c;->s(Lri1/g$e;)Lcj1/i$b;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Ldj1/a;->e(Lri1/h;Lcj1/i$b;)Lcj1/i;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ldj1/a;->e(Lri1/h;Lcj1/i$b;)Lcj1/i;

    move-result-object p1

    return-object p1
.end method
