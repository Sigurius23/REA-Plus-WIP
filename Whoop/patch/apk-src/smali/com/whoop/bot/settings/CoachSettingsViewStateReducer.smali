.class public final Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;",
        "",
        "featureFlagChecker",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "reduce",
        "Lcom/whoop/bot/settings/CoachSettingsViewState;",
        "state",
        "Lcom/whoop/bot/settings/CoachSettingsDomainState;",
        "reduceSuccess",
        "Lcom/whoop/bot/settings/CoachSettingsViewState$Success;",
        "data",
        "Lcom/whoop/bot/settings/CoachSettingsResponse;",
        "settingItemMapper",
        "Lcom/whoop/bot/settings/SettingItem;",
        "coachSettingItem",
        "Lcom/whoop/bot/settings/CoachSettingItem;",
        "footerMapper",
        "Lcom/whoop/bot/settings/SettingFooter;",
        "coachSettingsFooter",
        "Lcom/whoop/bot/settings/CoachSettingsFooter;",
        "iconKeyToResourceId",
        "",
        "key",
        "",
        "bot_release"
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
.field private final featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method private final footerMapper(Lcom/whoop/bot/settings/CoachSettingsFooter;)Lcom/whoop/bot/settings/SettingFooter;
    .locals 6

    new-instance v0, Lcom/whoop/bot/settings/SettingFooter;

    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingsFooter;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingsFooter;->getBody()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingsFooter;->getCtaTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingsFooter;->getCtaIcon()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4}, Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;->iconKeyToResourceId(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingsFooter;->getCtaUrlLink()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/whoop/bot/settings/SettingFooter;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILjava/lang/String;)V

    return-object v0
.end method

.method private final iconKeyToResourceId(Ljava/lang/String;)I
    .locals 5

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result p1

    return p1

    :cond_2
    sget-object p1, Lx81/d;->a:Lx81/d;

    invoke-static {p1}, Lih0/d0;->E(Lx81/d;)I

    move-result p1

    return p1
.end method

.method private final reduceSuccess(Lcom/whoop/bot/settings/CoachSettingsResponse;)Lcom/whoop/bot/settings/CoachSettingsViewState$Success;
    .locals 13

    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingsResponse;->getSettings()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/whoop/bot/settings/CoachSettingItem;

    invoke-virtual {v3}, Lcom/whoop/bot/settings/CoachSettingItem;->getSettingKey()Ljava/lang/String;

    move-result-object v3

    const-string v4, "WHOOP_COACH"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "coach-tos-update-ai-opt-out"

    invoke-interface {v0, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    const/4 v3, 0x0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    move-object v1, v3

    :goto_1
    const/16 v0, 0xa

    if-eqz v1, :cond_3

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/bot/settings/CoachSettingItem;

    invoke-direct {p0, v5}, Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;->settingItemMapper(Lcom/whoop/bot/settings/CoachSettingItem;)Lcom/whoop/bot/settings/SettingItem;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    sget-object v4, Lm83/y;->w:Lm83/y;

    :cond_4
    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingsResponse;->getSettings()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcom/whoop/bot/settings/CoachSettingItem;

    invoke-virtual {v7}, Lcom/whoop/bot/settings/CoachSettingItem;->getSettingKey()Ljava/lang/String;

    move-result-object v7

    const-string v8, "WHOOP_COACH_MEMORY"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v5, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/bot/settings/CoachSettingItem;

    invoke-direct {p0, v5}, Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;->settingItemMapper(Lcom/whoop/bot/settings/CoachSettingItem;)Lcom/whoop/bot/settings/SettingItem;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingsResponse;->getSettings()Ljava/util/List;

    move-result-object v0

    iget-object v5, p0, Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-interface {v5, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_8

    goto :goto_5

    :cond_8
    move-object v0, v3

    :goto_5
    if-eqz v0, :cond_b

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/whoop/bot/settings/CoachSettingItem;

    invoke-virtual {v6}, Lcom/whoop/bot/settings/CoachSettingItem;->getSettingKey()Ljava/lang/String;

    move-result-object v6

    const-string v7, "WHOOP_COACH_DATA"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    goto :goto_6

    :cond_a
    move-object v5, v3

    :goto_6
    check-cast v5, Lcom/whoop/bot/settings/CoachSettingItem;

    goto :goto_7

    :cond_b
    move-object v5, v3

    :goto_7
    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingsResponse;->getSettings()Ljava/util/List;

    move-result-object v0

    iget-object v6, p0, Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;->featureFlagChecker:Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-interface {v6, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_8

    :cond_c
    move-object v0, v3

    :goto_8
    if-eqz v0, :cond_f

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lcom/whoop/bot/settings/CoachSettingItem;

    invoke-virtual {v6}, Lcom/whoop/bot/settings/CoachSettingItem;->getSettingKey()Ljava/lang/String;

    move-result-object v6

    const-string v7, "WHOOP_COACH_CONCISE"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    goto :goto_9

    :cond_e
    move-object v2, v3

    :goto_9
    check-cast v2, Lcom/whoop/bot/settings/CoachSettingItem;

    goto :goto_a

    :cond_f
    move-object v2, v3

    :goto_a
    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingsResponse;->getSettings()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcom/whoop/bot/settings/CoachSettingItem;

    invoke-virtual {v7}, Lcom/whoop/bot/settings/CoachSettingItem;->getSettingKey()Ljava/lang/String;

    move-result-object v7

    const-string v8, "WHOOP_COACH_RECOMMENDED_ACTIVITIES"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_10

    goto :goto_b

    :cond_11
    move-object v6, v3

    :goto_b
    check-cast v6, Lcom/whoop/bot/settings/CoachSettingItem;

    new-instance v0, Lcom/whoop/bot/settings/CoachSettingsDisplayState;

    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingsResponse;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    check-cast v4, Ljava/util/Collection;

    invoke-static {v4, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingsResponse;->getFooter()Lcom/whoop/bot/settings/CoachSettingsFooter;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;->footerMapper(Lcom/whoop/bot/settings/CoachSettingsFooter;)Lcom/whoop/bot/settings/SettingFooter;

    move-result-object p1

    invoke-direct {v0, v7, v1, p1}, Lcom/whoop/bot/settings/CoachSettingsDisplayState;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/bot/settings/SettingFooter;)V

    const/4 p1, 0x1

    if-eqz v5, :cond_13

    new-instance v1, Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;

    sget v4, Lwk0/b;->I0:I

    invoke-static {v4}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    invoke-virtual {v5}, Lcom/whoop/bot/settings/CoachSettingItem;->getActive()Z

    move-result v7

    if-eqz v7, :cond_12

    sget-object v7, Lcom/whoop/bot/settings/CoachingMode;->CUSTOMIZED:Lcom/whoop/bot/settings/CoachingMode;

    goto :goto_c

    :cond_12
    sget-object v7, Lcom/whoop/bot/settings/CoachingMode;->EDUCATION:Lcom/whoop/bot/settings/CoachingMode;

    :goto_c
    invoke-virtual {v5}, Lcom/whoop/bot/settings/CoachSettingItem;->getDisabled()Z

    move-result v5

    xor-int/2addr v5, p1

    invoke-direct {v1, v4, v7, v5}, Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/bot/settings/CoachingMode;Z)V

    goto :goto_d

    :cond_13
    move-object v1, v3

    :goto_d
    if-eqz v2, :cond_15

    new-instance v4, Lcom/whoop/bot/settings/CoachSettingsConciseState;

    sget v5, Lwk0/b;->i:I

    invoke-static {v5}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    invoke-virtual {v2}, Lcom/whoop/bot/settings/CoachSettingItem;->getActive()Z

    move-result v7

    if-eqz v7, :cond_14

    sget-object v7, Lcom/whoop/bot/settings/ConcisenessMode;->CONDENSED:Lcom/whoop/bot/settings/ConcisenessMode;

    goto :goto_e

    :cond_14
    sget-object v7, Lcom/whoop/bot/settings/ConcisenessMode;->DEFAULT:Lcom/whoop/bot/settings/ConcisenessMode;

    :goto_e
    invoke-virtual {v2}, Lcom/whoop/bot/settings/CoachSettingItem;->getDisabled()Z

    move-result v2

    xor-int/2addr v2, p1

    invoke-direct {v4, v5, v7, v2}, Lcom/whoop/bot/settings/CoachSettingsConciseState;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/bot/settings/ConcisenessMode;Z)V

    goto :goto_f

    :cond_15
    move-object v4, v3

    :goto_f
    new-instance v7, Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;

    sget v2, Lwk0/b;->v0:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v8

    if-eqz v6, :cond_16

    invoke-virtual {v6}, Lcom/whoop/bot/settings/CoachSettingItem;->getBody()Ljava/lang/String;

    move-result-object v3

    :cond_16
    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    if-eqz v6, :cond_17

    invoke-virtual {v6}, Lcom/whoop/bot/settings/CoachSettingItem;->getActive()Z

    move-result v2

    if-ne v2, p1, :cond_17

    sget-object v2, Lcom/whoop/bot/settings/RecommendedActivitiesMode;->ON:Lcom/whoop/bot/settings/RecommendedActivitiesMode;

    :goto_10
    move-object v10, v2

    goto :goto_11

    :cond_17
    sget-object v2, Lcom/whoop/bot/settings/RecommendedActivitiesMode;->OFF:Lcom/whoop/bot/settings/RecommendedActivitiesMode;

    goto :goto_10

    :goto_11
    const/4 v2, 0x0

    if-eqz v6, :cond_18

    invoke-virtual {v6}, Lcom/whoop/bot/settings/CoachSettingItem;->getDisabled()Z

    move-result v3

    if-nez v3, :cond_18

    move v11, p1

    goto :goto_12

    :cond_18
    move v11, v2

    :goto_12
    if-eqz v6, :cond_1a

    invoke-virtual {v6}, Lcom/whoop/bot/settings/CoachSettingItem;->getSettingKey()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_19

    goto :goto_14

    :cond_19
    :goto_13
    move-object v12, p1

    goto :goto_15

    :cond_1a
    :goto_14
    const-string p1, ""

    goto :goto_13

    :goto_15
    invoke-direct/range {v7 .. v12}, Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/bot/settings/RecommendedActivitiesMode;ZLjava/lang/String;)V

    new-instance p1, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    invoke-direct {p1, v0, v1, v4, v7}, Lcom/whoop/bot/settings/CoachSettingsViewState$Success;-><init>(Lcom/whoop/bot/settings/CoachSettingsDisplayState;Lcom/whoop/bot/settings/CoachSettingsCoachingModeState;Lcom/whoop/bot/settings/CoachSettingsConciseState;Lcom/whoop/bot/settings/CoachSettingsRecommendedActivitiesState;)V

    return-object p1
.end method

.method private final settingItemMapper(Lcom/whoop/bot/settings/CoachSettingItem;)Lcom/whoop/bot/settings/SettingItem;
    .locals 8

    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingItem;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingItem;->getBody()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingItem;->getTag()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingItem;->getDisabled()Z

    move-result v0

    xor-int/lit8 v5, v0, 0x1

    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingItem;->getActive()Z

    move-result v6

    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingItem;->getSettingKey()Ljava/lang/String;

    move-result-object v7

    new-instance v1, Lcom/whoop/bot/settings/SettingItem;

    invoke-direct/range {v1 .. v7}, Lcom/whoop/bot/settings/SettingItem;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public final reduce(Lcom/whoop/bot/settings/CoachSettingsDomainState;)Lcom/whoop/bot/settings/CoachSettingsViewState;
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/bot/settings/CoachSettingsDomainState$Success;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/whoop/bot/settings/CoachSettingsDomainState$Success;

    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingsDomainState$Success;->getResponse()Lcom/whoop/bot/settings/CoachSettingsResponse;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/bot/settings/CoachSettingsViewStateReducer;->reduceSuccess(Lcom/whoop/bot/settings/CoachSettingsResponse;)Lcom/whoop/bot/settings/CoachSettingsViewState$Success;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lcom/whoop/bot/settings/CoachSettingsDomainState$Error;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsDomainState$Error;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lcom/whoop/bot/settings/CoachSettingsViewState$Error;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsViewState$Error;

    return-object p1

    :cond_1
    sget-object v0, Lcom/whoop/bot/settings/CoachSettingsDomainState$Loading;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsDomainState$Loading;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lcom/whoop/bot/settings/CoachSettingsViewState$Loading;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsViewState$Loading;

    return-object p1

    :cond_2
    sget-object v0, Lcom/whoop/bot/settings/CoachSettingsDomainState$Saved;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsDomainState$Saved;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p1, Lcom/whoop/bot/settings/CoachSettingsViewState$Saved;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsViewState$Saved;

    return-object p1

    :cond_3
    sget-object v0, Lcom/whoop/bot/settings/CoachSettingsDomainState$Saving;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsDomainState$Saving;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Lcom/whoop/bot/settings/CoachSettingsViewState$Saving;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsViewState$Saving;

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
