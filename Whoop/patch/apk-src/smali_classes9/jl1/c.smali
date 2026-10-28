.class public abstract Ljl1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0002*\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/navigation/e;",
        "action",
        "",
        "a",
        "(Lcom/whoop/navigation/e;)Ljava/lang/String;",
        "Lcom/whoop/navigation/GenericScreenModel;",
        "b",
        "(Lcom/whoop/navigation/GenericScreenModel;)Ljava/lang/String;",
        "home_release"
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
.method public static final a(Lcom/whoop/navigation/e;)Ljava/lang/String;
    .locals 2

    const-string v0, "action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/navigation/JournalScreenModel;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/whoop/navigation/JournalScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/JournalScreenModel;->getCycleId()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v1, v0, Lcom/whoop/navigation/AchievementMilestoneUnlockScreenModel;

    if-eqz v1, :cond_2

    check-cast v0, Lcom/whoop/navigation/AchievementMilestoneUnlockScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AchievementMilestoneUnlockScreenModel;->getAchievementType()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v0

    :cond_2
    instance-of v1, v0, Lcom/whoop/navigation/StreakCelebrationScreenModel;

    if-eqz v1, :cond_4

    check-cast v0, Lcom/whoop/navigation/StreakCelebrationScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/StreakCelebrationScreenModel;->getCelebrationType()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    return-object v0

    :cond_4
    instance-of v1, v0, Lcom/whoop/navigation/WeeklyPlanSummaryScreenModel;

    if-eqz v1, :cond_6

    check-cast v0, Lcom/whoop/navigation/WeeklyPlanSummaryScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/WeeklyPlanSummaryScreenModel;->getPlanId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5
    return-object v0

    :cond_6
    instance-of v1, v0, Lcom/whoop/navigation/MarketingConsentScreenModel;

    if-eqz v1, :cond_9

    check-cast v0, Lcom/whoop/navigation/MarketingConsentScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/MarketingConsentScreenModel;->getVersion()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    return-object v0

    :cond_8
    :goto_0
    invoke-virtual {p0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_9
    instance-of v1, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;

    if-eqz v1, :cond_b

    check-cast v0, Lcom/whoop/navigation/AiCoachChatScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getFingerprint()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_a

    invoke-virtual {p0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_a
    return-object v0

    :cond_b
    instance-of v1, v0, Lcom/whoop/navigation/HomeScreenModel;

    if-eqz v1, :cond_f

    check-cast v0, Lcom/whoop/navigation/HomeScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/HomeScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lcom/whoop/navigation/AiAction;->getFingerprint()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_c

    goto :goto_1

    :cond_c
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_d

    goto :goto_2

    :cond_d
    return-object v0

    :cond_e
    :goto_2
    invoke-virtual {p0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_f
    instance-of v1, v0, Lcom/whoop/navigation/GenericScreenModel;

    if-eqz v1, :cond_11

    check-cast v0, Lcom/whoop/navigation/GenericScreenModel;

    invoke-static {v0}, Ljl1/c;->b(Lcom/whoop/navigation/GenericScreenModel;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_10

    invoke-virtual {p0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_10
    return-object v0

    :cond_11
    invoke-virtual {p0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lcom/whoop/navigation/GenericScreenModel;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/navigation/GenericScreenModel;->getMetricEvents()Lcom/whoop/analytics/MetricEventModel;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/analytics/MetricEventModel;->getFeatureName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/whoop/navigation/GenericScreenModel;->getRequest()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/navigation/models/ApiRequest;->getPath()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
