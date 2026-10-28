.class public final Lp60/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lp60/a;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Liy1/c;",
        "metricWriter",
        "Ljb1/a;",
        "itemReducer",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;Liy1/c;Ljb1/a;)V",
        "Ll83/a0;",
        "c",
        "()V",
        "Lcom/whoop/design/models/celebration/CelebrationOverlayModel;",
        "model",
        "Li51/o;",
        "b",
        "(Lcom/whoop/design/models/celebration/CelebrationOverlayModel;)Li51/o;",
        "Ln60/b;",
        "domainState",
        "Lcom/whoop/achievements/celebration/d;",
        "a",
        "(Ln60/b;)Lcom/whoop/achievements/celebration/d;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Liy1/c;",
        "Ljb1/a;",
        "achievements_release"
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

.field private final b:Liy1/c;

.field private final c:Ljb1/a;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Liy1/c;Ljb1/a;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemReducer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lp60/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 3
    iput-object p2, p0, Lp60/a;->b:Liy1/c;

    .line 4
    iput-object p3, p0, Lp60/a;->c:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Liy1/c;Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    const/4 p4, 0x0

    .line 5
    invoke-static {p4, p3, p4}, Ljb1/c;->e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lp60/a;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Liy1/c;Ljb1/a;)V

    return-void
.end method

.method private final b(Lcom/whoop/design/models/celebration/CelebrationOverlayModel;)Li51/o;
    .locals 1

    iget-object v0, p0, Lp60/a;->c:Ljb1/a;

    invoke-virtual {v0, p1}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p1

    instance-of v0, p1, Li51/o;

    if-eqz v0, :cond_0

    check-cast p1, Li51/o;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final c()V
    .locals 9

    iget-object v0, p0, Lp60/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "celebration-render-failure-metric-android"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp60/a;->b:Liy1/c;

    sget-object v6, Lcom/whoop/metrics/domain/models/MetricPostType;->COUNT:Lcom/whoop/metrics/domain/models/MetricPostType;

    new-instance v1, Ljy1/a;

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "whoop.achievements.celebration_render_failure"

    const/4 v4, 0x0

    sget-object v5, Lm83/y;->w:Lm83/y;

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Liy1/c;->b(Ljy1/a;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ln60/b;)Lcom/whoop/achievements/celebration/d;
    .locals 1

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ln60/b$b;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/whoop/achievements/celebration/d$b;->a:Lcom/whoop/achievements/celebration/d$b;

    return-object p1

    :cond_0
    instance-of v0, p1, Ln60/b$a;

    if-eqz v0, :cond_1

    sget-object p1, Lcom/whoop/achievements/celebration/d$a;->a:Lcom/whoop/achievements/celebration/d$a;

    return-object p1

    :cond_1
    instance-of v0, p1, Ln60/b$c;

    if-eqz v0, :cond_3

    check-cast p1, Ln60/b$c;

    invoke-virtual {p1}, Ln60/b$c;->a()Lcom/whoop/design/models/celebration/CelebrationOverlayModel;

    move-result-object p1

    invoke-direct {p0, p1}, Lp60/a;->b(Lcom/whoop/design/models/celebration/CelebrationOverlayModel;)Li51/o;

    move-result-object p1

    if-eqz p1, :cond_2

    new-instance v0, Lcom/whoop/achievements/celebration/d$c;

    invoke-direct {v0, p1}, Lcom/whoop/achievements/celebration/d$c;-><init>(Li51/o;)V

    return-object v0

    :cond_2
    invoke-direct {p0}, Lp60/a;->c()V

    sget-object p1, Lcom/whoop/achievements/celebration/d$a;->a:Lcom/whoop/achievements/celebration/d$a;

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
