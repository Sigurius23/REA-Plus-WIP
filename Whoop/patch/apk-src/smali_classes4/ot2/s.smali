.class public final Lot2/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\'\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lot2/s;",
        "",
        "Ljt2/q;",
        "metricSliderMatcher",
        "<init>",
        "(Ljt2/q;)V",
        "Ljt2/d;",
        "accumulator",
        "Ljt2/m$i;",
        "domainState",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;",
        "matchedContributor",
        "Lcom/whoop/design/util/TextResource;",
        "a",
        "(Ljt2/d;Ljt2/m$i;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;)Lcom/whoop/design/util/TextResource;",
        "Ljt2/q;",
        "weekly-plan_release"
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
.field private final a:Ljt2/q;


# direct methods
.method public constructor <init>(Ljt2/q;)V
    .locals 1

    const-string v0, "metricSliderMatcher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lot2/s;->a:Ljt2/q;

    return-void
.end method


# virtual methods
.method public final a(Ljt2/d;Ljt2/m$i;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;)Lcom/whoop/design/util/TextResource;
    .locals 5

    const-string v0, "accumulator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "domainState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matchedContributor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getGoalType()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v0

    invoke-virtual {p1}, Ljt2/d;->l()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljt2/r;

    invoke-virtual {v3}, Ljt2/r;->c()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v3

    invoke-virtual {p3}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getGoalType()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v4

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Ljt2/r;

    invoke-virtual {p2}, Ljt2/m$i;->b()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getGoalScreens()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object p3, p2

    check-cast p3, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    invoke-virtual {p3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getGoal()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object p3

    if-ne p3, v0, :cond_2

    goto :goto_1

    :cond_3
    move-object p2, v2

    :goto_1
    check-cast p2, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljt2/r;->b()D

    move-result-wide v3

    iget-object p1, p0, Lot2/s;->a:Ljt2/q;

    double-to-float p3, v3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Ljt2/q;->a(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Ljava/lang/Float;)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_5

    :cond_4
    const-string p1, ""

    :cond_5
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljt2/r;->c()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-static {p1, p2}, Lot2/v;->b(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1

    :cond_6
    return-object v2
.end method
