.class public final Lcom/whoop/profile/navigation/ProfileActionRouter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010!\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lcom/whoop/profile/navigation/ProfileActionRouter;",
        "",
        "Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;",
        "analytics",
        "Lad3/c;",
        "json",
        "<init>",
        "(Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;Lad3/c;)V",
        "Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;",
        "event",
        "Lcom/whoop/profile/presentation/ProfileEvent;",
        "processItemClick",
        "(Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;)Lcom/whoop/profile/presentation/ProfileEvent;",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "interaction",
        "processGenericInteraction",
        "(Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/profile/presentation/ProfileEvent;",
        "Lny0/h;",
        "state",
        "processCardButtonState",
        "(Lny0/h;)Lcom/whoop/profile/presentation/ProfileEvent;",
        "Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;",
        "processAppDrivenNavigation",
        "(Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;)Lcom/whoop/profile/presentation/ProfileEvent;",
        "Lcom/whoop/navigation/e;",
        "navigationAction",
        "processNavigationAction",
        "(Lcom/whoop/navigation/e;)Lcom/whoop/profile/presentation/ProfileEvent;",
        "Lm91/u;",
        "element",
        "Ll83/a0;",
        "fireAnalyticsForElement",
        "(Lm91/u;)V",
        "route",
        "(Lcom/whoop/profile/presentation/ProfileEvent;)Lcom/whoop/profile/presentation/ProfileEvent;",
        "Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;",
        "Lad3/c;",
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
.field private final analytics:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

.field private final json:Lad3/c;


# direct methods
.method public constructor <init>(Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;Lad3/c;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/navigation/ProfileActionRouter;->analytics:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    iput-object p2, p0, Lcom/whoop/profile/navigation/ProfileActionRouter;->json:Lad3/c;

    return-void
.end method

.method private final fireAnalyticsForElement(Lm91/u;)V
    .locals 1

    instance-of v0, p1, Lcom/whoop/profile/view/components/StreaksTileViewState;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/navigation/ProfileActionRouter;->analytics:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    sget-object v0, Lcom/whoop/profile/presentation/ProfileEvent$StreaksTappedAnalyticEvent;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$StreaksTappedAnalyticEvent;

    invoke-virtual {p1, v0}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->sendAnalytics(Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;)V

    return-void

    :cond_0
    instance-of v0, p1, Lcom/whoop/profile/presentation/NavigateToHealthspanViewState;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/whoop/profile/navigation/ProfileActionRouter;->analytics:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    sget-object v0, Lcom/whoop/profile/presentation/ProfileEvent$HealthspanTappedAnalyticEvent;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$HealthspanTappedAnalyticEvent;

    invoke-virtual {p1, v0}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->sendAnalytics(Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;)V

    return-void

    :cond_1
    instance-of v0, p1, Lcom/whoop/profile/presentation/NavigateToStreaksViewState;

    if-eqz v0, :cond_2

    iget-object p1, p0, Lcom/whoop/profile/navigation/ProfileActionRouter;->analytics:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    sget-object v0, Lcom/whoop/profile/presentation/ProfileEvent$StreaksTappedAnalyticEvent;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$StreaksTappedAnalyticEvent;

    invoke-virtual {p1, v0}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->sendAnalytics(Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;)V

    return-void

    :cond_2
    instance-of p1, p1, Lcom/whoop/profile/presentation/NavigateToLevelsViewState;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/whoop/profile/navigation/ProfileActionRouter;->analytics:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    sget-object v0, Lcom/whoop/profile/presentation/ProfileEvent$LevelsTappedAnalyticEvent;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$LevelsTappedAnalyticEvent;

    invoke-virtual {p1, v0}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->sendAnalytics(Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;)V

    :cond_3
    return-void
.end method

.method private final processAppDrivenNavigation(Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;)Lcom/whoop/profile/presentation/ProfileEvent;
    .locals 1

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;->getItemViewState()Lm91/u;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/whoop/profile/navigation/ProfileActionRouter;->fireAnalyticsForElement(Lm91/u;)V

    return-object p1
.end method

.method private final processCardButtonState(Lny0/h;)Lcom/whoop/profile/presentation/ProfileEvent;
    .locals 3

    invoke-virtual {p1}, Lny0/h;->c()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    invoke-virtual {p1}, Lny0/h;->e()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/whoop/design/models/modal/AnyModal;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/whoop/design/models/modal/AnyModal;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Lny0/h;->n()Lj02/s;

    move-result-object v2

    if-eqz v0, :cond_1

    new-instance v1, Lcom/whoop/profile/presentation/ProfileEvent$ExecuteWhoopAction;

    invoke-virtual {p1}, Lny0/h;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lcom/whoop/profile/presentation/ProfileEvent$ExecuteWhoopAction;-><init>(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)V

    return-object v1

    :cond_1
    if-eqz v1, :cond_2

    new-instance v0, Lcom/whoop/profile/presentation/ProfileEvent$PresentDesignModal;

    invoke-virtual {p1}, Lny0/h;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/whoop/profile/presentation/ProfileEvent$PresentDesignModal;-><init>(Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;)V

    return-object v0

    :cond_2
    if-eqz v2, :cond_3

    new-instance p1, Lcom/whoop/profile/presentation/ProfileEvent$PerformDismissNavigation;

    invoke-direct {p1, v2}, Lcom/whoop/profile/presentation/ProfileEvent$PerformDismissNavigation;-><init>(Lj02/s;)V

    return-object p1

    :cond_3
    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/profile/navigation/ProfileActionRouter;->processNavigationAction(Lcom/whoop/navigation/e;)Lcom/whoop/profile/presentation/ProfileEvent;

    move-result-object p1

    return-object p1
.end method

.method private final processGenericInteraction(Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/profile/presentation/ProfileEvent;
    .locals 3

    sget-object v0, Lcom/whoop/profile/domain/ProfileGenericInteractionHandler;->INSTANCE:Lcom/whoop/profile/domain/ProfileGenericInteractionHandler;

    iget-object v1, p0, Lcom/whoop/profile/navigation/ProfileActionRouter;->json:Lad3/c;

    invoke-virtual {v0, p1, v1}, Lcom/whoop/profile/domain/ProfileGenericInteractionHandler;->resolve(Lcom/whoop/navigation/models/GenericInteraction;Lad3/c;)Lcom/whoop/profile/domain/ProfileInteractionResolution;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/profile/domain/ProfileInteractionResolution;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/whoop/profile/navigation/ProfileActionRouter;->analytics:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    new-instance v2, Lcom/whoop/profile/presentation/ProfileEvent$BffAnalyticEvent;

    invoke-direct {v2, v0}, Lcom/whoop/profile/presentation/ProfileEvent$BffAnalyticEvent;-><init>(Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-virtual {v1, v2}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->sendAnalytics(Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;)V

    :cond_0
    instance-of v0, p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$PresentModal;

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/whoop/profile/presentation/ProfileEvent$PresentDesignModal;

    check-cast p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$PresentModal;

    invoke-virtual {p1}, Lcom/whoop/profile/domain/ProfileInteractionResolution$PresentModal;->getModal()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p1

    invoke-direct {v0, p1, v2, v1, v2}, Lcom/whoop/profile/presentation/ProfileEvent$PresentDesignModal;-><init>(Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$PerformAction;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/whoop/profile/presentation/ProfileEvent$ExecuteWhoopAction;

    check-cast p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$PerformAction;

    invoke-virtual {p1}, Lcom/whoop/profile/domain/ProfileInteractionResolution$PerformAction;->getAction()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    invoke-direct {v0, p1, v2, v1, v2}, Lcom/whoop/profile/presentation/ProfileEvent$ExecuteWhoopAction;-><init>(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;

    invoke-virtual {p1}, Lcom/whoop/profile/domain/ProfileInteractionResolution$Navigate;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/profile/navigation/ProfileActionRouter;->processNavigationAction(Lcom/whoop/navigation/e;)Lcom/whoop/profile/presentation/ProfileEvent;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, p1, Lcom/whoop/profile/domain/ProfileInteractionResolution$None;

    if-eqz p1, :cond_4

    return-object v2

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final processItemClick(Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;)Lcom/whoop/profile/presentation/ProfileEvent;
    .locals 6

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->getElement()Lm91/u;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/whoop/profile/navigation/ProfileActionRouter;->fireAnalyticsForElement(Lm91/u;)V

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->getEvent()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/design/item/DesignItemInteraction;

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    check-cast v0, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-virtual {v0}, Lcom/whoop/design/item/DesignItemInteraction;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v4, p0, Lcom/whoop/profile/navigation/ProfileActionRouter;->analytics:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    new-instance v5, Lcom/whoop/profile/presentation/ProfileEvent$BffAnalyticEvent;

    invoke-direct {v5, v1}, Lcom/whoop/profile/presentation/ProfileEvent$BffAnalyticEvent;-><init>(Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-virtual {v4, v5}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->sendAnalytics(Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;)V

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/design/item/DesignItemInteraction;->getActionArgument()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p1, v0, v3, v2, v3}, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;->copy$default(Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;Ljava/lang/Object;Lm91/u;ILjava/lang/Object;)Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/profile/navigation/ProfileActionRouter;->processItemClick(Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;)Lcom/whoop/profile/presentation/ProfileEvent;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v3

    :cond_2
    instance-of p1, v0, Lcom/whoop/whoopaction/domain/models/Action;

    if-eqz p1, :cond_3

    new-instance p1, Lcom/whoop/profile/presentation/ProfileEvent$ExecuteWhoopAction;

    check-cast v0, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-direct {p1, v0, v3, v2, v3}, Lcom/whoop/profile/presentation/ProfileEvent$ExecuteWhoopAction;-><init>(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_3
    instance-of p1, v0, Lk11/e$a;

    if-eqz p1, :cond_4

    new-instance p1, Lcom/whoop/profile/presentation/ProfileEvent$ExecuteWhoopAction;

    check-cast v0, Lk11/e$a;

    invoke-virtual {v0}, Lk11/e$a;->b()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    invoke-direct {p1, v0, v3, v2, v3}, Lcom/whoop/profile/presentation/ProfileEvent$ExecuteWhoopAction;-><init>(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_4
    instance-of p1, v0, Lcom/whoop/design/models/modal/AnyModal;

    if-eqz p1, :cond_5

    new-instance p1, Lcom/whoop/profile/presentation/ProfileEvent$PresentDesignModal;

    check-cast v0, Lcom/whoop/design/models/modal/AnyModal;

    invoke-direct {p1, v0, v3, v2, v3}, Lcom/whoop/profile/presentation/ProfileEvent$PresentDesignModal;-><init>(Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_5
    instance-of p1, v0, Lny0/h;

    if-eqz p1, :cond_6

    check-cast v0, Lny0/h;

    invoke-direct {p0, v0}, Lcom/whoop/profile/navigation/ProfileActionRouter;->processCardButtonState(Lny0/h;)Lcom/whoop/profile/presentation/ProfileEvent;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of p1, v0, Lcom/whoop/navigation/e;

    if-eqz p1, :cond_7

    check-cast v0, Lcom/whoop/navigation/e;

    invoke-direct {p0, v0}, Lcom/whoop/profile/navigation/ProfileActionRouter;->processNavigationAction(Lcom/whoop/navigation/e;)Lcom/whoop/profile/presentation/ProfileEvent;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of p1, v0, Lk11/e$b;

    if-eqz p1, :cond_8

    check-cast v0, Lk11/e$b;

    invoke-virtual {v0}, Lk11/e$b;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/profile/navigation/ProfileActionRouter;->processNavigationAction(Lcom/whoop/navigation/e;)Lcom/whoop/profile/presentation/ProfileEvent;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of p1, v0, Lq31/b;

    if-eqz p1, :cond_9

    new-instance p1, Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;

    check-cast v0, Lq31/b;

    invoke-virtual {v0}, Lq31/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lq31/b;->a()Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v1, v0}, Lcom/whoop/profile/presentation/ProfileEvent$SegmentSelected;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object p1

    :cond_9
    instance-of p1, v0, Lw51/c;

    if-eqz p1, :cond_a

    new-instance p1, Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;

    check-cast v0, Lw51/c;

    invoke-virtual {v0}, Lw51/c;->a()Z

    move-result v0

    invoke-direct {p1, v0}, Lcom/whoop/profile/presentation/ProfileEvent$ExpandableStatisticListEvent;-><init>(Z)V

    return-object p1

    :cond_a
    instance-of p1, v0, Lm91/u;

    if-eqz p1, :cond_b

    new-instance p1, Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;

    check-cast v0, Lm91/u;

    invoke-direct {p1, v0}, Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;-><init>(Lm91/u;)V

    return-object p1

    :cond_b
    instance-of p1, v0, Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz p1, :cond_c

    check-cast v0, Lcom/whoop/navigation/models/GenericInteraction;

    invoke-direct {p0, v0}, Lcom/whoop/profile/navigation/ProfileActionRouter;->processGenericInteraction(Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/profile/presentation/ProfileEvent;

    move-result-object p1

    return-object p1

    :cond_c
    return-object v3
.end method

.method private final processNavigationAction(Lcom/whoop/navigation/e;)Lcom/whoop/profile/presentation/ProfileEvent;
    .locals 8

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/navigation/AppScreen$r2;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/whoop/profile/navigation/ProfileActionRouter;->analytics:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    sget-object v1, Lcom/whoop/profile/presentation/ProfileEvent$HealthspanTappedAnalyticEvent;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$HealthspanTappedAnalyticEvent;

    invoke-virtual {v0, v1}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->sendAnalytics(Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;)V

    goto :goto_0

    :cond_0
    instance-of v0, v0, Lcom/whoop/navigation/AppScreen$n3;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whoop/profile/navigation/ProfileActionRouter;->analytics:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    sget-object v1, Lcom/whoop/profile/presentation/ProfileEvent$LevelsTappedAnalyticEvent;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$LevelsTappedAnalyticEvent;

    invoke-virtual {v0, v1}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->sendAnalytics(Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;)V

    :cond_1
    :goto_0
    new-instance v2, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v4, "profile"

    const/4 v5, 0x0

    move-object v3, p1

    invoke-direct/range {v2 .. v7}, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method


# virtual methods
.method public final route(Lcom/whoop/profile/presentation/ProfileEvent;)Lcom/whoop/profile/presentation/ProfileEvent;
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/profile/navigation/ProfileActionRouter;->analytics:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    move-object v1, p1

    check-cast v1, Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;

    invoke-virtual {v0, v1}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->sendAnalytics(Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;)V

    :cond_0
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;

    invoke-direct {p0, v0}, Lcom/whoop/profile/navigation/ProfileActionRouter;->processItemClick(Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;)Lcom/whoop/profile/presentation/ProfileEvent;

    move-result-object v0

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;

    invoke-direct {p0, v0}, Lcom/whoop/profile/navigation/ProfileActionRouter;->processAppDrivenNavigation(Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;)Lcom/whoop/profile/presentation/ProfileEvent;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, p1

    :goto_0
    instance-of v1, v0, Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;

    if-eqz v1, :cond_3

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/whoop/profile/navigation/ProfileActionRouter;->analytics:Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    move-object v1, v0

    check-cast v1, Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;

    invoke-virtual {p1, v1}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;->sendAnalytics(Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;)V

    :cond_3
    return-object v0
.end method
