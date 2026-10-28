.class public final Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0013\u0010\u000c\u001a\u00020\u000b*\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;",
        "event",
        "Ll83/a0;",
        "sendItemClickAnalytics",
        "(Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;)V",
        "",
        "convertToAnalyticsId",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;",
        "handleSegmentSelectedEvent",
        "(Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;)V",
        "",
        "isExpanded",
        "segmentId",
        "handleExpandableStatisticListEvent",
        "(ZLjava/lang/String;)V",
        "Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;",
        "sendAnalytics",
        "(Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;)V",
        "Lfi0/a;",
        "previousSegmentSelected",
        "Ljava/lang/String;",
        "profile_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final analytics:Lfi0/a;

.field private previousSegmentSelected:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->analytics:Lfi0/a;

    const-string p1, "1m"

    iput-object p1, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->previousSegmentSelected:Ljava/lang/String;

    return-void
.end method

.method private final convertToAnalyticsId(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "1m"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    :cond_0
    const-string v0, "3m"

    invoke-static {p1, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v0

    :cond_1
    const-string v0, "all_time"

    invoke-static {p1, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-eqz p1, :cond_2

    return-object v0

    :cond_2
    const-string p1, "unknown"

    return-object p1
.end method

.method private final handleExpandableStatisticListEvent(ZLjava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->analytics:Lfi0/a;

    invoke-static {p1, p2}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->activitySummaryCollapsed(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->analytics:Lfi0/a;

    invoke-static {p1, p2}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->activitySummaryExpanded(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final handleSegmentSelectedEvent(Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;)V
    .locals 5

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;->getSegmentItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm91/u;

    instance-of v3, v3, Ls51/d;

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;->getSelectedSegmentId()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Data_Highlight"

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_3

    :goto_1
    iget-object v0, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->analytics:Lfi0/a;

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;->getSelectedSegmentId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->convertToAnalyticsId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->dataHighlightsToggleTapped(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_3
    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/u;

    instance-of v1, v1, Lw51/h;

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_6
    :goto_2
    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;->getSelectedSegmentId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Activity_Summary"

    invoke-static {v0, v1, v4}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    :goto_3
    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;->getSelectedSegmentId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->previousSegmentSelected:Ljava/lang/String;

    iget-object v0, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->analytics:Lfi0/a;

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;->getSelectedSegmentId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->convertToAnalyticsId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->activitySummaryToggleTapped(Lfi0/a;Ljava/lang/String;)V

    :cond_7
    return-void
.end method

.method private final sendItemClickAnalytics(Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;)V
    .locals 1

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->getElement()Lm91/u;

    move-result-object p1

    instance-of v0, p1, Lcom/whoop/profile/presentation/NavigateToHealthspanViewState;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->analytics:Lfi0/a;

    invoke-static {p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->healthspanTapped(Lfi0/a;)V

    return-void

    :cond_0
    instance-of v0, p1, Lcom/whoop/profile/presentation/NavigateToStreaksViewState;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->analytics:Lfi0/a;

    invoke-static {p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->streaksTapped(Lfi0/a;)V

    return-void

    :cond_1
    instance-of p1, p1, Lcom/whoop/profile/presentation/NavigateToLevelsViewState;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->analytics:Lfi0/a;

    invoke-static {p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->levelsTapped(Lfi0/a;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final sendAnalytics(Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$BffAnalyticEvent;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->analytics:Lfi0/a;

    check-cast p1, Lcom/whoop/profile/presentation/ProfileEvent$BffAnalyticEvent;

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$BffAnalyticEvent;->getEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p1

    invoke-static {v0, p1}, Lfi0/b;->a(Lfi0/a;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-void

    :cond_0
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$ProfileScreenViewedAnalyticEvent;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->analytics:Lfi0/a;

    check-cast p1, Lcom/whoop/profile/presentation/ProfileEvent$ProfileScreenViewedAnalyticEvent;

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$ProfileScreenViewedAnalyticEvent;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$ProfileScreenViewedAnalyticEvent;->getMembershipAnalytics()Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->profileOpened(Lfi0/a;Ljava/lang/String;Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)V

    return-void

    :cond_1
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;

    invoke-direct {p0, p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->sendItemClickAnalytics(Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;)V

    return-void

    :cond_2
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$ScrolledToBottomAnalyticEvent;

    if-eqz v0, :cond_3

    iget-object p1, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->analytics:Lfi0/a;

    invoke-static {p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->hitBottomOfProfileEvent(Lfi0/a;)V

    return-void

    :cond_3
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$ProfileSaveTappedAnalyticEvent;

    if-eqz v0, :cond_4

    iget-object p1, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->analytics:Lfi0/a;

    invoke-static {p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->profileSaveTapped(Lfi0/a;)V

    return-void

    :cond_4
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$UsernameFieldTappedAnalyticEvent;

    if-eqz v0, :cond_5

    iget-object p1, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->analytics:Lfi0/a;

    invoke-static {p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->usernameFieldTapped(Lfi0/a;)V

    return-void

    :cond_5
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$UsernameSaveAttemptedAnalyticEvent;

    if-eqz v0, :cond_6

    iget-object p1, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->analytics:Lfi0/a;

    invoke-static {p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->usernameSaveAttempted(Lfi0/a;)V

    return-void

    :cond_6
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$HealthspanTappedAnalyticEvent;

    if-eqz v0, :cond_7

    iget-object p1, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->analytics:Lfi0/a;

    invoke-static {p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->healthspanTapped(Lfi0/a;)V

    return-void

    :cond_7
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$StreaksTappedAnalyticEvent;

    if-eqz v0, :cond_8

    iget-object p1, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->analytics:Lfi0/a;

    invoke-static {p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->streaksTapped(Lfi0/a;)V

    return-void

    :cond_8
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$LevelsTappedAnalyticEvent;

    if-eqz v0, :cond_9

    iget-object p1, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->analytics:Lfi0/a;

    invoke-static {p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->levelsTapped(Lfi0/a;)V

    return-void

    :cond_9
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$OtherProfileOpenedAnalyticEvent;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->analytics:Lfi0/a;

    check-cast p1, Lcom/whoop/profile/presentation/ProfileEvent$OtherProfileOpenedAnalyticEvent;

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$OtherProfileOpenedAnalyticEvent;->getMembershipAnalytics()Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsKt;->otherProfileOpened(Lfi0/a;Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)V

    return-void

    :cond_a
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;

    if-eqz v0, :cond_b

    check-cast p1, Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;

    invoke-direct {p0, p1}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->handleSegmentSelectedEvent(Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;)V

    return-void

    :cond_b
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;

    if-eqz v0, :cond_c

    check-cast p1, Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;->isExpanded()Z

    move-result p1

    iget-object v0, p0, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->previousSegmentSelected:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->convertToAnalyticsId(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->handleExpandableStatisticListEvent(ZLjava/lang/String;)V

    return-void

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
