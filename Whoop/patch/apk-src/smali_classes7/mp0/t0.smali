.class public abstract Lmp0/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u001a%\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001f\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000f\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "",
        "isFeatureFlagEnabled",
        "Lnp0/n;",
        "wizardFlow",
        "Lnp0/m;",
        "wizardConductorViewState",
        "c",
        "(ZLnp0/n;Lnp0/m;)Z",
        "Lkp0/o;",
        "sleepGoalSetting",
        "Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;",
        "recommendedTimeInBedFormatted",
        "",
        "b",
        "(Lkp0/o;Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;)Ljava/lang/String;",
        "a",
        "sleep-coach_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lkp0/o;Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;)Ljava/lang/String;
    .locals 2

    const-string v0, "sleepGoalSetting"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recommendedTimeInBedFormatted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkp0/d;->z:Lkp0/d;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getGetBy()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;->getOptimalEndpointsFormatted()Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;->getEnd()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v1

    :cond_1
    sget-object v0, Lkp0/m;->z:Lkp0/m;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getPerform()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;->getOptimalEndpointsFormatted()Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;->getEnd()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v1

    :cond_3
    sget-object v0, Lkp0/l;->z:Lkp0/l;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getPeak()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;->getOptimalEndpointsFormatted()Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;->getEnd()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    return-object v1

    :cond_5
    instance-of v0, p0, Lkp0/k;

    if-nez v0, :cond_9

    instance-of v0, p0, Lkp0/q;

    if-eqz v0, :cond_6

    goto :goto_0

    :cond_6
    instance-of p0, p0, Lkp0/r;

    if-eqz p0, :cond_8

    invoke-virtual {p1}, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getHoursOfSleep()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    move-result-object p0

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;->getOptimalEndpointsFormatted()Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;

    move-result-object p0

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;->getEnd()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_7
    return-object v1

    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_9
    :goto_0
    invoke-virtual {p1}, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getOptimizeSleep()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    move-result-object p0

    if-eqz p0, :cond_a

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;->getOptimalEndpointsFormatted()Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;

    move-result-object p0

    if-eqz p0, :cond_a

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;->getEnd()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_a
    return-object v1
.end method

.method public static final b(Lkp0/o;Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;)Ljava/lang/String;
    .locals 2

    const-string v0, "sleepGoalSetting"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recommendedTimeInBedFormatted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkp0/d;->z:Lkp0/d;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getGetBy()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;->getOptimalEndpointsFormatted()Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;->getStart()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v1

    :cond_1
    sget-object v0, Lkp0/m;->z:Lkp0/m;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getPerform()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;->getOptimalEndpointsFormatted()Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;->getStart()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v1

    :cond_3
    sget-object v0, Lkp0/l;->z:Lkp0/l;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getPeak()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;->getOptimalEndpointsFormatted()Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;->getStart()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    return-object v1

    :cond_5
    instance-of v0, p0, Lkp0/k;

    if-nez v0, :cond_9

    instance-of v0, p0, Lkp0/q;

    if-eqz v0, :cond_6

    goto :goto_0

    :cond_6
    instance-of p0, p0, Lkp0/r;

    if-eqz p0, :cond_8

    invoke-virtual {p1}, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getHoursOfSleep()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    move-result-object p0

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;->getOptimalEndpointsFormatted()Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;

    move-result-object p0

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;->getStart()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_7
    return-object v1

    :cond_8
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_9
    :goto_0
    invoke-virtual {p1}, Lcom/whoop/sleep/coach/data/network/model/RecommendedTimeInBedFormatted;->getOptimizeSleep()Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;

    move-result-object p0

    if-eqz p0, :cond_a

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/FormattedTimeInBed;->getOptimalEndpointsFormatted()Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;

    move-result-object p0

    if-eqz p0, :cond_a

    invoke-virtual {p0}, Lcom/whoop/sleep/coach/data/network/model/OptimalEndpointsFormatted;->getStart()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_a
    return-object v1
.end method

.method public static final c(ZLnp0/n;Lnp0/m;)Z
    .locals 1

    const-string v0, "wizardFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wizardConductorViewState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lnp0/j;->b:Lnp0/j;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
