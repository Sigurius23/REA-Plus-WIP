.class public final Lo02/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo02/d;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\u000c\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lo02/a;",
        "Lo02/d;",
        "<init>",
        "()V",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "navigationScreenModel",
        "Lj02/m0;",
        "e",
        "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;",
        "Lad3/c;",
        "a",
        "Lad3/c;",
        "json",
        "navigation_release"
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
.field private a:Lad3/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnm1/g;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lnm1/g;-><init>(I)V

    sget-object v1, Lad3/c;->d:Lad3/b;

    invoke-static {v1, v0}, Lts/o;->b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;

    move-result-object v0

    iput-object v0, p0, Lo02/a;->a:Lad3/c;

    return-void
.end method

.method public static synthetic c(Lad3/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lo02/a;->d(Lad3/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lad3/g;)Ll83/a0;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lad3/g;->c:Z

    iput-boolean v0, p0, Lad3/g;->g:Z

    iput-boolean v0, p0, Lad3/g;->l:Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;
    .locals 0

    invoke-virtual {p0, p1}, Lo02/a;->e(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;

    move-result-object p1

    return-object p1
.end method

.method public bridge b(Ljava/util/List;Ljava/util/Map;)Lo02/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lo02/d;",
            ">;",
            "Ljava/util/Map<",
            "Lj93/d;",
            "+",
            "Lkotlin/jvm/functions/Function1;",
            ">;)",
            "Lo02/d;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lo02/d;->b(Ljava/util/List;Ljava/util/Map;)Lo02/d;

    move-result-object p1

    return-object p1
.end method

.method public e(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "navigationScreenModel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lcom/whoop/navigation/CommonNavigationScreenModel;

    if-nez v2, :cond_0

    sget-object v1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object v1

    :cond_0
    move-object v2, v1

    check-cast v2, Lcom/whoop/navigation/CommonNavigationScreenModel;

    instance-of v3, v2, Lcom/whoop/navigation/AchievementsScreenModel;

    if-eqz v3, :cond_1

    new-instance v2, Lj02/m0$c;

    check-cast v1, Lcom/whoop/navigation/AchievementsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AchievementsScreenModel;->getSource()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/AchievementsScreenModel;->getMilestoneType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_1
    instance-of v3, v2, Lcom/whoop/navigation/AccessReconfirmBaselinesScreenModel;

    if-eqz v3, :cond_2

    new-instance v2, Lj02/m0$a;

    check-cast v1, Lcom/whoop/navigation/AccessReconfirmBaselinesScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AccessReconfirmBaselinesScreenModel;->getSource()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/AccessReconfirmBaselinesScreenModel;->getNextScreen()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_2
    instance-of v3, v2, Lcom/whoop/navigation/OmronAuthScreenModel;

    if-eqz v3, :cond_3

    new-instance v2, Lj02/m0$k3;

    check-cast v1, Lcom/whoop/navigation/OmronAuthScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/OmronAuthScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$k3;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_3
    instance-of v3, v2, Lcom/whoop/navigation/AchievementMilestoneUnlockScreenModel;

    if-eqz v3, :cond_4

    new-instance v2, Lj02/m0$b;

    check-cast v1, Lcom/whoop/navigation/AchievementMilestoneUnlockScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AchievementMilestoneUnlockScreenModel;->getAchievementType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$b;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_4
    instance-of v3, v2, Lcom/whoop/navigation/StreakCelebrationScreenModel;

    if-eqz v3, :cond_5

    new-instance v2, Lj02/m0$w4;

    check-cast v1, Lcom/whoop/navigation/StreakCelebrationScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/StreakCelebrationScreenModel;->getSource()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/StreakCelebrationScreenModel;->getCelebrationType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$w4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_5
    instance-of v3, v2, Lcom/whoop/navigation/DayZeroSplashScreenModel;

    if-eqz v3, :cond_6

    new-instance v2, Lj02/m0$x0;

    check-cast v1, Lcom/whoop/navigation/DayZeroSplashScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/DayZeroSplashScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$x0;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_6
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsActionPlanScreenModel;

    if-eqz v3, :cond_7

    new-instance v2, Lj02/m0$g;

    check-cast v1, Lcom/whoop/navigation/AdvancedLabsActionPlanScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsActionPlanScreenModel;->getTestId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$g;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_7
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsHormonalContextScreenModel;

    if-eqz v3, :cond_8

    new-instance v2, Lj02/m0$j;

    check-cast v1, Lcom/whoop/navigation/AdvancedLabsHormonalContextScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsHormonalContextScreenModel;->getTestId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$j;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_8
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsInsightsDeepDiveScreenModel;

    if-eqz v3, :cond_9

    new-instance v2, Lj02/m0$k;

    check-cast v1, Lcom/whoop/navigation/AdvancedLabsInsightsDeepDiveScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsInsightsDeepDiveScreenModel;->getInsightId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsInsightsDeepDiveScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_9
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsInsightsScreenModel;

    if-eqz v3, :cond_a

    new-instance v2, Lj02/m0$l;

    check-cast v1, Lcom/whoop/navigation/AdvancedLabsInsightsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsInsightsScreenModel;->getTestId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsInsightsScreenModel;->getSource()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsInsightsScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lj02/m0$l;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V

    return-object v2

    :cond_a
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsJoinScreenModel;

    if-eqz v3, :cond_b

    new-instance v2, Lj02/m0$m;

    check-cast v1, Lcom/whoop/navigation/AdvancedLabsJoinScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsJoinScreenModel;->getSource()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsJoinScreenModel;->getTestCount()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsJoinScreenModel;->getInitiallySelectedSegmentId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lj02/m0$m;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_b
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsManagementScreenModel;

    if-eqz v3, :cond_c

    new-instance v2, Lj02/m0$n;

    check-cast v1, Lcom/whoop/navigation/AdvancedLabsManagementScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsManagementScreenModel;->getSource()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsManagementScreenModel;->getNavigationStyle()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$n;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_c
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsPrimerScreenModel;

    if-eqz v3, :cond_d

    new-instance v2, Lj02/m0$q;

    check-cast v1, Lcom/whoop/navigation/AdvancedLabsPrimerScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsPrimerScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$q;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_d
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsEditBiomarkersScreenModel;

    if-eqz v3, :cond_e

    new-instance v2, Lj02/m0$h;

    check-cast v1, Lcom/whoop/navigation/AdvancedLabsEditBiomarkersScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsEditBiomarkersScreenModel;->getTestId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsEditBiomarkersScreenModel;->isAiConfirmation()Z

    move-result v1

    invoke-direct {v2, v3, v1}, Lj02/m0$h;-><init>(Ljava/lang/String;Z)V

    return-object v2

    :cond_e
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsEditTestDetailsScreenModel;

    if-eqz v3, :cond_f

    new-instance v2, Lj02/m0$i;

    check-cast v1, Lcom/whoop/navigation/AdvancedLabsEditTestDetailsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsEditTestDetailsScreenModel;->getTestId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$i;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_f
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsSchedulingFormScreenModel;

    if-eqz v3, :cond_10

    new-instance v2, Lj02/m0$s;

    check-cast v1, Lcom/whoop/navigation/AdvancedLabsSchedulingFormScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsSchedulingFormScreenModel;->getEpisodeId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsSchedulingFormScreenModel;->getBiomarkerTestId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsSchedulingFormScreenModel;->getTestType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lj02/m0$s;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_10
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsSchedulingStepScreenModel;

    if-eqz v3, :cond_11

    new-instance v2, Lj02/m0$t;

    check-cast v1, Lcom/whoop/navigation/AdvancedLabsSchedulingStepScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsSchedulingStepScreenModel;->getStepType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsSchedulingStepScreenModel;->getTestType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_11
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsNativeSchedulingScreenModel;

    if-eqz v3, :cond_12

    sget-object v1, Lj02/m0$o;->b:Lj02/m0$o;

    return-object v1

    :cond_12
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsScreenModel;

    if-eqz v3, :cond_13

    new-instance v2, Lj02/m0$p;

    check-cast v1, Lcom/whoop/navigation/AdvancedLabsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsScreenModel;->getSource()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$p;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V

    return-object v2

    :cond_13
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsTestResultsScreenModel;

    if-eqz v3, :cond_14

    new-instance v2, Lj02/m0$v;

    check-cast v1, Lcom/whoop/navigation/AdvancedLabsTestResultsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsTestResultsScreenModel;->getBiomarkerTestId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$v;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_14
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsTestHistoryScreenModel;

    if-eqz v3, :cond_15

    sget-object v1, Lj02/m0$u;->b:Lj02/m0$u;

    return-object v1

    :cond_15
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsTypeformWebviewScreenModel;

    if-eqz v3, :cond_16

    new-instance v2, Lj02/m0$w;

    check-cast v1, Lcom/whoop/navigation/AdvancedLabsTypeformWebviewScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsTypeformWebviewScreenModel;->getUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsTypeformWebviewScreenModel;->getTestTokenId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsTypeformWebviewScreenModel;->getTestType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lj02/m0$w;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_16
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsUploadTestScreenModel;

    if-eqz v3, :cond_17

    sget-object v1, Lj02/m0$y;->b:Lj02/m0$y;

    return-object v1

    :cond_17
    instance-of v3, v2, Lcom/whoop/navigation/AiCoachChatScreenModel;

    if-eqz v3, :cond_18

    sget-object v1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object v1

    :cond_18
    instance-of v3, v2, Lcom/whoop/navigation/AiInsightsScreenModel;

    if-eqz v3, :cond_19

    sget-object v1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object v1

    :cond_19
    instance-of v3, v2, Lcom/whoop/navigation/ActivityEditModel;

    if-eqz v3, :cond_1a

    sget-object v1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object v1

    :cond_1a
    instance-of v3, v2, Lcom/whoop/navigation/AddActivityModel;

    if-eqz v3, :cond_1b

    sget-object v1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object v1

    :cond_1b
    instance-of v3, v2, Lcom/whoop/navigation/AnnualUpsellSwitchModel;

    if-eqz v3, :cond_1c

    new-instance v2, Lj02/m0$c0;

    check-cast v1, Lcom/whoop/navigation/AnnualUpsellSwitchModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AnnualUpsellSwitchModel;->getSubscriptionType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$c0;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_1c
    instance-of v3, v2, Lcom/whoop/navigation/AuthenticatedWebViewModel;

    const-string v4, ""

    const/4 v5, 0x0

    if-eqz v3, :cond_22

    check-cast v1, Lcom/whoop/navigation/AuthenticatedWebViewModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AuthenticatedWebViewModel;->getConfirmDismissContent()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/navigation/AuthenticatedWebViewModel;->getUrl()Ljava/lang/String;

    move-result-object v8

    if-eqz v2, :cond_21

    new-instance v5, Lj02/j;

    const-string v3, "title"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_1d

    move-object v3, v4

    :cond_1d
    const-string v6, "message"

    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-nez v6, :cond_1e

    move-object v6, v4

    :cond_1e
    const-string v7, "cancel_title"

    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-nez v7, :cond_1f

    move-object v7, v4

    :cond_1f
    const-string v9, "confirm_title"

    invoke-interface {v2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_20

    goto :goto_0

    :cond_20
    move-object v4, v2

    :goto_0
    invoke-direct {v5, v3, v6, v7, v4}, Lj02/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_21
    move-object v9, v5

    invoke-virtual {v1}, Lcom/whoop/navigation/AuthenticatedWebViewModel;->getOnDismissDestination()Lcom/whoop/navigation/e;

    move-result-object v10

    new-instance v6, Lj02/m0$d0;

    const/4 v7, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v12}, Lj02/m0$d0;-><init>(Ljava/lang/String;Ljava/lang/String;Lj02/j;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :cond_22
    instance-of v3, v2, Lcom/whoop/navigation/AllBiomarkerRecordingsScreenModel;

    if-eqz v3, :cond_23

    new-instance v2, Lj02/m0$b0;

    check-cast v1, Lcom/whoop/navigation/AllBiomarkerRecordingsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AllBiomarkerRecordingsScreenModel;->getBiomarkerName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$b0;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_23
    instance-of v3, v2, Lcom/whoop/navigation/BehaviorDetailsScreenModel;

    if-eqz v3, :cond_24

    new-instance v2, Lj02/m0$f0;

    check-cast v1, Lcom/whoop/navigation/BehaviorDetailsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/BehaviorDetailsScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$f0;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_24
    instance-of v3, v2, Lcom/whoop/navigation/BehaviorImpactsScreenModel;

    if-eqz v3, :cond_25

    new-instance v2, Lj02/m0$e0;

    check-cast v1, Lcom/whoop/navigation/BehaviorImpactsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/BehaviorImpactsScreenModel;->getDetailId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/BehaviorImpactsScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$e0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_25
    instance-of v3, v2, Lcom/whoop/navigation/BiomarkerDetailsScreenModel;

    if-eqz v3, :cond_26

    new-instance v2, Lj02/m0$g0;

    check-cast v1, Lcom/whoop/navigation/BiomarkerDetailsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/BiomarkerDetailsScreenModel;->getBiomarkerId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/BiomarkerDetailsScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$g0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_26
    instance-of v3, v2, Lcom/whoop/navigation/BiomarkerSummaryScreenModel;

    if-eqz v3, :cond_27

    new-instance v2, Lj02/m0$h0;

    check-cast v1, Lcom/whoop/navigation/BiomarkerSummaryScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/BiomarkerSummaryScreenModel;->getStatusType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/BiomarkerSummaryScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$h0;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V

    return-object v2

    :cond_27
    instance-of v3, v2, Lcom/whoop/navigation/LimitedTimeOfferScreenModel;

    if-eqz v3, :cond_28

    new-instance v2, Lj02/m0$p2;

    check-cast v1, Lcom/whoop/navigation/LimitedTimeOfferScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/LimitedTimeOfferScreenModel;->getSource()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/LimitedTimeOfferScreenModel;->getOfferId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$p2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_28
    instance-of v3, v2, Lcom/whoop/navigation/LinkWorkoutScreenModel;

    if-eqz v3, :cond_29

    new-instance v2, Lj02/m0$q2;

    check-cast v1, Lcom/whoop/navigation/LinkWorkoutScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/LinkWorkoutScreenModel;->getActivityId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/LinkWorkoutScreenModel;->getEntryPoint()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/navigation/LinkWorkoutScreenModel;->getActivityName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lj02/m0$q2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_29
    instance-of v3, v2, Lcom/whoop/navigation/LogSymptomsScreenModel;

    if-eqz v3, :cond_2a

    new-instance v2, Lj02/m0$r2;

    check-cast v1, Lcom/whoop/navigation/LogSymptomsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/LogSymptomsScreenModel;->getSource()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/LogSymptomsScreenModel;->getRequestDate()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$r2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_2a
    instance-of v3, v2, Lcom/whoop/navigation/MultiConsentScreenModel;

    if-eqz v3, :cond_2b

    new-instance v2, Lj02/m0$d3;

    check-cast v1, Lcom/whoop/navigation/MultiConsentScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/MultiConsentScreenModel;->getConsentAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/MultiConsentScreenModel;->getTestType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$d3;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_2b
    instance-of v3, v2, Lcom/whoop/navigation/CardioDetailsScreenModel;

    if-eqz v3, :cond_2c

    new-instance v6, Lj02/m0$e;

    check-cast v1, Lcom/whoop/navigation/CardioDetailsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/CardioDetailsScreenModel;->getActivityId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/navigation/CardioDetailsScreenModel;->getEntryPoint()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/navigation/CardioDetailsScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v13

    const/16 v14, 0x1c

    const/4 v15, 0x0

    const-string v8, "CARDIO"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v15}, Lj02/m0$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :cond_2c
    instance-of v3, v2, Lcom/whoop/navigation/ChallengeLandingScreenModel;

    if-eqz v3, :cond_2d

    new-instance v2, Lj02/m0$i0;

    check-cast v1, Lcom/whoop/navigation/ChallengeLandingScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/ChallengeLandingScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$i0;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_2d
    instance-of v3, v2, Lcom/whoop/navigation/ChallengesScreenModel;

    if-eqz v3, :cond_2e

    new-instance v2, Lj02/m0$j0;

    check-cast v1, Lcom/whoop/navigation/ChallengesScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/ChallengesScreenModel;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$j0;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_2e
    instance-of v3, v2, Lcom/whoop/navigation/CoachScreenModel;

    if-eqz v3, :cond_2f

    sget-object v1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object v1

    :cond_2f
    instance-of v3, v2, Lcom/whoop/navigation/CoachSettingsScreenModel;

    if-eqz v3, :cond_30

    sget-object v1, Lj02/m0$n0;->b:Lj02/m0$n0;

    return-object v1

    :cond_30
    instance-of v3, v2, Lcom/whoop/navigation/CheckoutScreenModel;

    if-eqz v3, :cond_31

    new-instance v6, Lj02/m0$k0;

    check-cast v1, Lcom/whoop/navigation/CheckoutScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/CheckoutScreenModel;->getPath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/navigation/CheckoutScreenModel;->getPayload()Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/navigation/CheckoutScreenModel;->getPaymentMethodId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/navigation/CheckoutScreenModel;->getSkipConfirmation()Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/navigation/CheckoutScreenModel;->getCategory()Ljava/lang/String;

    move-result-object v11

    invoke-direct/range {v6 .. v11}, Lj02/m0$k0;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    return-object v6

    :cond_31
    instance-of v3, v2, Lcom/whoop/navigation/CommunityScreenModel;

    if-eqz v3, :cond_32

    new-instance v2, Lj02/m0$o0;

    check-cast v1, Lcom/whoop/navigation/CommunityScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/CommunityScreenModel;->getShareCode()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$o0;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_32
    sget-object v3, Lcom/whoop/navigation/ConnectivityNavigationScreenModel;->INSTANCE:Lcom/whoop/navigation/ConnectivityNavigationScreenModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_33

    new-instance v1, Lj02/m0$r0;

    const-string v2, "DEFAULT"

    invoke-direct {v1, v2}, Lj02/m0$r0;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_33
    instance-of v3, v2, Lcom/whoop/navigation/DownloadedFileExportScreenModel;

    if-eqz v3, :cond_34

    new-instance v2, Lj02/m0$z0;

    check-cast v1, Lcom/whoop/navigation/DownloadedFileExportScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/DownloadedFileExportScreenModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$z0;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_34
    sget-object v3, Lcom/whoop/navigation/CustomizeJournalScreenModel;->INSTANCE:Lcom/whoop/navigation/CustomizeJournalScreenModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_35

    sget-object v1, Lj02/m0$t0;->b:Lj02/m0$t0;

    return-object v1

    :cond_35
    sget-object v3, Lcom/whoop/navigation/CustomizeOverviewModel;->INSTANCE:Lcom/whoop/navigation/CustomizeOverviewModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_36

    sget-object v1, Lj02/m0$u0;->b:Lj02/m0$u0;

    return-object v1

    :cond_36
    sget-object v3, Lcom/whoop/navigation/CyclePatternHistoryScreenModel;->INSTANCE:Lcom/whoop/navigation/CyclePatternHistoryScreenModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_37

    sget-object v1, Lj02/m0$v0;->b:Lj02/m0$v0;

    return-object v1

    :cond_37
    instance-of v3, v2, Lcom/whoop/navigation/DayZeroPersonalizationScreenModel;

    const/4 v6, 0x1

    if-eqz v3, :cond_3c

    check-cast v1, Lcom/whoop/navigation/DayZeroPersonalizationScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/DayZeroPersonalizationScreenModel;->getFingerprint()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/navigation/DayZeroPersonalizationScreenModel;->getSourceId()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_38

    move-object v9, v4

    goto :goto_1

    :cond_38
    move-object v9, v2

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/navigation/DayZeroPersonalizationScreenModel;->getSourceType()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_39

    move-object v10, v4

    goto :goto_2

    :cond_39
    move-object v10, v2

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/navigation/DayZeroPersonalizationScreenModel;->getSource()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/navigation/DayZeroPersonalizationScreenModel;->getConversationSeedId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/navigation/DayZeroPersonalizationScreenModel;->getDismissible()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_3a

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    :cond_3a
    move v13, v6

    invoke-virtual {v1}, Lcom/whoop/navigation/DayZeroPersonalizationScreenModel;->getHeaderMetaData()Lcom/whoop/navigation/models/ChatHeaderMetadata;

    move-result-object v1

    if-eqz v1, :cond_3b

    iget-object v2, v0, Lo02/a;->a:Lad3/c;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lcom/whoop/navigation/models/ChatHeaderMetadata;->Companion:Lcom/whoop/navigation/models/ChatHeaderMetadata$Companion;

    invoke-virtual {v3}, Lcom/whoop/navigation/models/ChatHeaderMetadata$Companion;->serializer()Lwc3/c;

    move-result-object v3

    check-cast v3, Lwc3/j;

    invoke-virtual {v2, v3, v1}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    :cond_3b
    move-object v14, v5

    new-instance v7, Lj02/m0$w0;

    invoke-direct/range {v7 .. v14}, Lj02/m0$w0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    return-object v7

    :cond_3c
    instance-of v3, v2, Lcom/whoop/navigation/DeepDiveScreenModel;

    if-eqz v3, :cond_3d

    new-instance v2, Lj02/m0$y0;

    check-cast v1, Lcom/whoop/navigation/DeepDiveScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/DeepDiveScreenModel;->getPillar()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/DeepDiveScreenModel;->getDate()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/navigation/DeepDiveScreenModel;->getSource()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/navigation/DeepDiveScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v1

    invoke-direct {v2, v3, v4, v5, v1}, Lj02/m0$y0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V

    return-object v2

    :cond_3d
    instance-of v3, v2, Lcom/whoop/navigation/EditActivitiesDrawerScreenModel;

    if-eqz v3, :cond_3e

    new-instance v2, Lj02/m0$b1;

    check-cast v1, Lcom/whoop/navigation/EditActivitiesDrawerScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/EditActivitiesDrawerScreenModel;->getDate()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/EditActivitiesDrawerScreenModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$b1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_3e
    instance-of v3, v2, Lcom/whoop/navigation/ExtensionsScreenModel;

    if-eqz v3, :cond_3f

    new-instance v2, Lj02/m0$f1;

    check-cast v1, Lcom/whoop/navigation/ExtensionsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/ExtensionsScreenModel;->getPromoCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/ExtensionsScreenModel;->isOnTrial()Z

    move-result v1

    invoke-direct {v2, v3, v1}, Lj02/m0$f1;-><init>(Ljava/lang/String;Z)V

    return-object v2

    :cond_3f
    instance-of v3, v2, Lcom/whoop/navigation/PairDeviceScreenModel;

    if-eqz v3, :cond_40

    new-instance v2, Lj02/m0$n3;

    check-cast v1, Lcom/whoop/navigation/PairDeviceScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/PairDeviceScreenModel;->getCompletionDestination()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$n3;-><init>(Lcom/whoop/navigation/e;)V

    return-object v2

    :cond_40
    instance-of v3, v2, Lcom/whoop/navigation/MarketingConsentScreenModel;

    if-eqz v3, :cond_41

    new-instance v2, Lj02/m0$t2;

    check-cast v1, Lcom/whoop/navigation/MarketingConsentScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/MarketingConsentScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$t2;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_41
    instance-of v3, v2, Lcom/whoop/navigation/PasswordResetScreenModel;

    if-eqz v3, :cond_42

    new-instance v2, Lj02/m0$o3;

    check-cast v1, Lcom/whoop/navigation/PasswordResetScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/PasswordResetScreenModel;->getToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/PasswordResetScreenModel;->getExpires()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/navigation/PasswordResetScreenModel;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lj02/m0$o3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_42
    instance-of v3, v2, Lcom/whoop/navigation/PaymentMethodManagementScreenModel;

    if-eqz v3, :cond_43

    new-instance v2, Lj02/m0$p3;

    check-cast v1, Lcom/whoop/navigation/PaymentMethodManagementScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/PaymentMethodManagementScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$p3;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_43
    sget-object v3, Lcom/whoop/navigation/FamilyPlanScreenModel;->INSTANCE:Lcom/whoop/navigation/FamilyPlanScreenModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_44

    sget-object v1, Lj02/m0$j1;->b:Lj02/m0$j1;

    return-object v1

    :cond_44
    instance-of v3, v2, Lcom/whoop/navigation/FamilyPlanHubScreenModel;

    if-eqz v3, :cond_45

    new-instance v2, Lj02/m0$h1;

    check-cast v1, Lcom/whoop/navigation/FamilyPlanHubScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/FamilyPlanHubScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$h1;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_45
    instance-of v3, v2, Lcom/whoop/navigation/FamilyPlanInviteScreenModel;

    if-eqz v3, :cond_46

    new-instance v2, Lj02/m0$i1;

    check-cast v1, Lcom/whoop/navigation/FamilyPlanInviteScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/FamilyPlanInviteScreenModel;->isNewMember()Z

    move-result v3

    invoke-virtual {v1}, Lcom/whoop/navigation/FamilyPlanInviteScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$i1;-><init>(ZLjava/lang/String;)V

    return-object v2

    :cond_46
    instance-of v3, v2, Lcom/whoop/navigation/FeedbackSurveyScreenModel;

    if-eqz v3, :cond_47

    new-instance v2, Lj02/m0$k1;

    check-cast v1, Lcom/whoop/navigation/FeedbackSurveyScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/FeedbackSurveyScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$k1;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_47
    sget-object v3, Lcom/whoop/navigation/LabradorAboutScreenModel;->INSTANCE:Lcom/whoop/navigation/LabradorAboutScreenModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_48

    sget-object v1, Lj02/m0$f2;->b:Lj02/m0$f2;

    return-object v1

    :cond_48
    instance-of v3, v2, Lcom/whoop/navigation/LabradorDetailsScreenModel;

    if-eqz v3, :cond_49

    new-instance v7, Lj02/m0$g2;

    check-cast v1, Lcom/whoop/navigation/LabradorDetailsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/LabradorDetailsScreenModel;->getEcgReadingId()Ljava/lang/String;

    move-result-object v8

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/m0$g2;-><init>(Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_49
    sget-object v3, Lcom/whoop/navigation/LabradorDeviceLocationModel;->INSTANCE:Lcom/whoop/navigation/LabradorDeviceLocationModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4a

    sget-object v1, Lj02/m0$h2;->b:Lj02/m0$h2;

    return-object v1

    :cond_4a
    sget-object v3, Lcom/whoop/navigation/LabradorOnboardingModel;->INSTANCE:Lcom/whoop/navigation/LabradorOnboardingModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4b

    new-instance v1, Lj02/m0$i2;

    invoke-direct {v1, v4}, Lj02/m0$i2;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_4b
    instance-of v3, v2, Lcom/whoop/navigation/LabradorReadingModel;

    if-eqz v3, :cond_4c

    new-instance v2, Lj02/m0$j2;

    check-cast v1, Lcom/whoop/navigation/LabradorReadingModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/LabradorReadingModel;->getSelectedWrist()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$j2;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_4c
    sget-object v3, Lcom/whoop/navigation/LabradorRegistrationModel;->INSTANCE:Lcom/whoop/navigation/LabradorRegistrationModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4d

    sget-object v1, Lj02/m0$k2;->b:Lj02/m0$k2;

    return-object v1

    :cond_4d
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsPurchaseAddOnsScreenModel;

    if-eqz v3, :cond_4e

    new-instance v2, Lj02/m0$r;

    check-cast v1, Lcom/whoop/navigation/AdvancedLabsPurchaseAddOnsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsPurchaseAddOnsScreenModel;->getSource()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsPurchaseAddOnsScreenModel;->getTestCount()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsPurchaseAddOnsScreenModel;->getNavigationStyle()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lj02/m0$r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_4e
    sget-object v3, Lcom/whoop/navigation/LabradorResultsModel;->INSTANCE:Lcom/whoop/navigation/LabradorResultsModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4f

    sget-object v1, Lj02/m0$l2;->b:Lj02/m0$l2;

    return-object v1

    :cond_4f
    instance-of v3, v2, Lcom/whoop/navigation/FeatureEducationModel;

    if-eqz v3, :cond_52

    new-instance v7, Lj02/m0$f3;

    check-cast v1, Lcom/whoop/navigation/FeatureEducationModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/FeatureEducationModel;->getFeatureEducationName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/navigation/FeatureEducationModel;->getSource()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_50

    move-object v10, v4

    goto :goto_3

    :cond_50
    move-object v10, v2

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/navigation/FeatureEducationModel;->getScreenName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_51

    move-object v12, v4

    goto :goto_4

    :cond_51
    move-object v12, v1

    :goto_4
    const/16 v13, 0x8

    const/4 v14, 0x0

    const-string v9, ""

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v14}, Lj02/m0$f3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_52
    instance-of v3, v2, Lcom/whoop/navigation/AdvancedLabsUpdateTestsScreenModel;

    if-eqz v3, :cond_53

    new-instance v2, Lj02/m0$x;

    check-cast v1, Lcom/whoop/navigation/AdvancedLabsUpdateTestsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsUpdateTestsScreenModel;->getSource()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/AdvancedLabsUpdateTestsScreenModel;->getTestCount()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$x;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_53
    instance-of v3, v2, Lcom/whoop/navigation/GiftedScreenModel;

    if-eqz v3, :cond_54

    new-instance v2, Lj02/m0$o1;

    check-cast v1, Lcom/whoop/navigation/GiftedScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/GiftedScreenModel;->getSource()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/GiftedScreenModel;->getGiftCode()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$o1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_54
    instance-of v3, v2, Lcom/whoop/navigation/GiftingScreenModel;

    if-eqz v3, :cond_55

    new-instance v2, Lj02/m0$p1;

    check-cast v1, Lcom/whoop/navigation/GiftingScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/GiftingScreenModel;->getSource()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/GiftingScreenModel;->getGiftType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/navigation/GiftingScreenModel;->getTestCount()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/navigation/GiftingScreenModel;->getSelectedTier()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v5, v1}, Lj02/m0$p1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_55
    instance-of v3, v2, Lcom/whoop/navigation/GiftHubScreenModel;

    if-eqz v3, :cond_56

    new-instance v2, Lj02/m0$n1;

    check-cast v1, Lcom/whoop/navigation/GiftHubScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/GiftHubScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$n1;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_56
    instance-of v3, v2, Lcom/whoop/navigation/GenericScreenModel;

    if-eqz v3, :cond_58

    check-cast v1, Lcom/whoop/navigation/GenericScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/GenericScreenModel;->getRequest()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/navigation/GenericScreenModel;->getCachePolicy()Lcom/whoop/navigation/CachePolicyModel;

    move-result-object v2

    if-eqz v2, :cond_57

    new-instance v5, Lcom/whoop/navigation/GenericCachePolicy;

    invoke-virtual {v2}, Lcom/whoop/navigation/CachePolicyModel;->getEnabled()Z

    move-result v3

    invoke-virtual {v2}, Lcom/whoop/navigation/CachePolicyModel;->getCacheKey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/navigation/CachePolicyModel;->getScopes()Ljava/util/Set;

    move-result-object v2

    invoke-direct {v5, v3, v4, v2}, Lcom/whoop/navigation/GenericCachePolicy;-><init>(ZLjava/lang/String;Ljava/util/Set;)V

    :cond_57
    move-object v8, v5

    invoke-virtual {v1}, Lcom/whoop/navigation/GenericScreenModel;->getNavigationStyle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/navigation/GenericScreenModel;->getAnalyticEvents()Lcom/whoop/analytics/ScreenAnalyticEventModel;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/navigation/GenericScreenModel;->getMetricEvents()Lcom/whoop/analytics/MetricEventModel;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/navigation/GenericScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/navigation/GenericScreenModel;->getOnStartInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/navigation/GenericScreenModel;->getLoadingTopItems()Ljava/util/List;

    move-result-object v15

    invoke-virtual {v1}, Lcom/whoop/navigation/GenericScreenModel;->getErrorTopItems()Ljava/util/List;

    move-result-object v16

    new-instance v6, Lj02/m0$m1;

    const/4 v14, 0x0

    const/16 v17, 0x80

    const/16 v18, 0x0

    invoke-direct/range {v6 .. v18}, Lj02/m0$m1;-><init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :cond_58
    instance-of v3, v2, Lcom/whoop/navigation/CommunityFollowersScreenModel;

    if-eqz v3, :cond_59

    new-instance v1, Lj02/m0$o0;

    invoke-direct {v1, v5, v6, v5}, Lj02/m0$o0;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_59
    instance-of v3, v2, Lcom/whoop/navigation/CommunityUnavailableScreenModel;

    if-eqz v3, :cond_5a

    new-instance v7, Lj02/m0$e5;

    check-cast v1, Lcom/whoop/navigation/CommunityUnavailableScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/CommunityUnavailableScreenModel;->getSelectedTab()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lcom/whoop/navigation/models/ApiRequest;

    invoke-virtual {v1}, Lcom/whoop/navigation/CommunityUnavailableScreenModel;->getPath()Ljava/lang/String;

    move-result-object v10

    sget-object v11, Lcom/whoop/navigation/models/GenericHttpMethod;->GET:Lcom/whoop/navigation/models/GenericHttpMethod;

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lcom/whoop/navigation/models/ApiRequest;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lkotlinx/serialization/json/JsonElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v17, 0x1fc

    const/16 v18, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v7 .. v18}, Lj02/m0$e5;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_5a
    instance-of v3, v2, Lcom/whoop/navigation/CommunityTeamScreenModel;

    if-eqz v3, :cond_5b

    new-instance v2, Lj02/m0$p0;

    check-cast v1, Lcom/whoop/navigation/CommunityTeamScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/CommunityTeamScreenModel;->getId()I

    move-result v1

    invoke-direct {v2, v1}, Lj02/m0$p0;-><init>(I)V

    return-object v2

    :cond_5b
    instance-of v3, v2, Lcom/whoop/navigation/CommunityTeamsHubScreenModel;

    if-eqz v3, :cond_5c

    sget-object v1, Lj02/m0$q0;->b:Lj02/m0$q0;

    return-object v1

    :cond_5c
    instance-of v3, v2, Lcom/whoop/navigation/ClinicianVideoSchedulingIntakeScreenModel;

    if-eqz v3, :cond_5d

    new-instance v2, Lj02/m0$m0;

    check-cast v1, Lcom/whoop/navigation/ClinicianVideoSchedulingIntakeScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/ClinicianVideoSchedulingIntakeScreenModel;->getAppointmentType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/ClinicianVideoSchedulingIntakeScreenModel;->getAppointmentId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/navigation/ClinicianVideoSchedulingIntakeScreenModel;->getIntakeType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lj02/m0$m0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_5d
    instance-of v3, v2, Lcom/whoop/navigation/ClinicianSchedulingConfirmationScreenModel;

    if-eqz v3, :cond_5e

    new-instance v2, Lj02/m0$l0;

    check-cast v1, Lcom/whoop/navigation/ClinicianSchedulingConfirmationScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/ClinicianSchedulingConfirmationScreenModel;->getAppointmentId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$l0;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_5e
    instance-of v3, v2, Lcom/whoop/navigation/HealthMonitorScreenModel;

    if-eqz v3, :cond_5f

    new-instance v7, Lj02/m0$q1;

    check-cast v1, Lcom/whoop/navigation/HealthMonitorScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/HealthMonitorScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v12

    const/16 v13, 0xf

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v14}, Lj02/m0$q1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_5f
    instance-of v3, v2, Lcom/whoop/navigation/HealthReportScreenModel;

    if-eqz v3, :cond_60

    sget-object v1, Lj02/m0$r1;->b:Lj02/m0$r1;

    return-object v1

    :cond_60
    instance-of v3, v2, Lcom/whoop/navigation/HealthspanScreenModel;

    if-eqz v3, :cond_61

    new-instance v2, Lj02/m0$t1;

    check-cast v1, Lcom/whoop/navigation/HealthspanScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/HealthspanScreenModel;->getDate()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/HealthspanScreenModel;->getSource()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/navigation/HealthspanScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lj02/m0$t1;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V

    return-object v2

    :cond_61
    instance-of v3, v2, Lcom/whoop/navigation/HealthTabScreenModel;

    if-eqz v3, :cond_62

    new-instance v2, Lj02/m0$s1;

    check-cast v1, Lcom/whoop/navigation/HealthTabScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/HealthTabScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$s1;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_62
    instance-of v3, v2, Lcom/whoop/navigation/HeartScreenerModel;

    if-eqz v3, :cond_63

    new-instance v2, Lj02/m0$u1;

    check-cast v1, Lcom/whoop/navigation/HeartScreenerModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/HeartScreenerModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$u1;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_63
    instance-of v3, v2, Lcom/whoop/navigation/HiddenMetricsModel;

    if-eqz v3, :cond_64

    sget-object v1, Lj02/m0$u4;->b:Lj02/m0$u4;

    return-object v1

    :cond_64
    instance-of v3, v2, Lcom/whoop/navigation/HomeScreenModel;

    if-eqz v3, :cond_66

    check-cast v1, Lcom/whoop/navigation/HomeScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/HomeScreenModel;->getHomePillar()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_65

    new-instance v1, Lj02/m0$y1;

    invoke-direct {v1, v2}, Lj02/m0$y1;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_65
    new-instance v2, Lj02/m0$z1;

    invoke-virtual {v1}, Lcom/whoop/navigation/HomeScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$z1;-><init>(Lcom/whoop/navigation/AiAction;)V

    return-object v2

    :cond_66
    instance-of v3, v2, Lcom/whoop/navigation/HormonalInsightsOnboardingModel;

    if-eqz v3, :cond_68

    check-cast v1, Lcom/whoop/navigation/HormonalInsightsOnboardingModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/HormonalInsightsOnboardingModel;->getFeature()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_67

    new-instance v2, Lj02/m0$a2;

    invoke-direct {v2, v1}, Lj02/m0$a2;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_67
    new-instance v1, Lj02/m0$a2;

    invoke-direct {v1, v5, v6, v5}, Lj02/m0$a2;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_68
    instance-of v3, v2, Lcom/whoop/navigation/HormonalInsightsSettingsScreenModel;

    if-eqz v3, :cond_69

    sget-object v1, Lj02/m0$b2;->b:Lj02/m0$b2;

    return-object v1

    :cond_69
    instance-of v3, v2, Lcom/whoop/navigation/HrSettingsScreenModel;

    if-eqz v3, :cond_6a

    sget-object v1, Lj02/m0$c2;->b:Lj02/m0$c2;

    return-object v1

    :cond_6a
    instance-of v3, v2, Lcom/whoop/navigation/UniversalCheckoutScreenModel;

    if-eqz v3, :cond_6c

    check-cast v1, Lcom/whoop/navigation/UniversalCheckoutScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalCheckoutScreenModel;->getPath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalCheckoutScreenModel;->getPayload()Lcom/whoop/navigation/UniversalCheckoutPayload;

    move-result-object v2

    if-eqz v2, :cond_6b

    iget-object v3, v0, Lo02/a;->a:Lad3/c;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcom/whoop/navigation/UniversalCheckoutPayload;->Companion:Lcom/whoop/navigation/UniversalCheckoutPayload$a;

    invoke-virtual {v4}, Lcom/whoop/navigation/UniversalCheckoutPayload$a;->serializer()Lwc3/c;

    move-result-object v4

    check-cast v4, Lwc3/j;

    invoke-virtual {v3, v4, v2}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    :cond_6b
    move-object v8, v5

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalCheckoutScreenModel;->getSource()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalCheckoutScreenModel;->getMethod()Ljava/lang/String;

    move-result-object v10

    new-instance v6, Lj02/m0$k5;

    const/4 v11, 0x0

    const/16 v12, 0x10

    const/4 v13, 0x0

    invoke-direct/range {v6 .. v13}, Lj02/m0$k5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/x0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :cond_6c
    instance-of v3, v2, Lcom/whoop/navigation/CheckoutWithCartScreenModel;

    if-eqz v3, :cond_71

    check-cast v1, Lcom/whoop/navigation/CheckoutWithCartScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/CheckoutWithCartScreenModel;->getMethod()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6f

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6d

    goto :goto_5

    :cond_6d
    move-object v2, v5

    :goto_5
    if-nez v2, :cond_6e

    goto :goto_7

    :cond_6e
    :goto_6
    move-object v10, v2

    goto :goto_8

    :cond_6f
    :goto_7
    const-string v2, "GET"

    goto :goto_6

    :goto_8
    invoke-virtual {v1}, Lcom/whoop/navigation/CheckoutWithCartScreenModel;->getPath()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/navigation/CheckoutWithCartScreenModel;->getPayload()Lcom/whoop/navigation/CheckoutWithCartPayload;

    move-result-object v2

    if-eqz v2, :cond_70

    iget-object v3, v0, Lo02/a;->a:Lad3/c;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcom/whoop/navigation/CheckoutWithCartPayload;->Companion:Lcom/whoop/navigation/CheckoutWithCartPayload$a;

    invoke-virtual {v4}, Lcom/whoop/navigation/CheckoutWithCartPayload$a;->serializer()Lwc3/c;

    move-result-object v4

    check-cast v4, Lwc3/j;

    invoke-virtual {v3, v4, v2}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    :cond_70
    move-object v8, v5

    invoke-virtual {v1}, Lcom/whoop/navigation/CheckoutWithCartScreenModel;->getSource()Ljava/lang/String;

    move-result-object v9

    new-instance v6, Lj02/m0$k5;

    const/4 v11, 0x0

    const/16 v12, 0x10

    const/4 v13, 0x0

    invoke-direct/range {v6 .. v13}, Lj02/m0$k5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/x0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :cond_71
    instance-of v3, v2, Lcom/whoop/navigation/UniversalCheckoutShippingMethodScreenModel;

    if-eqz v3, :cond_72

    new-instance v2, Lj02/m0$n5;

    check-cast v1, Lcom/whoop/navigation/UniversalCheckoutShippingMethodScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalCheckoutShippingMethodScreenModel;->getCartId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalCheckoutShippingMethodScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$n5;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_72
    instance-of v3, v2, Lcom/whoop/navigation/UniversalCheckoutShippingAddressScreenModel;

    if-eqz v3, :cond_73

    new-instance v2, Lj02/m0$m5;

    check-cast v1, Lcom/whoop/navigation/UniversalCheckoutShippingAddressScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalCheckoutShippingAddressScreenModel;->getCartId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalCheckoutShippingAddressScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$m5;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_73
    instance-of v3, v2, Lcom/whoop/navigation/UniversalCartScreenModel;

    if-eqz v3, :cond_74

    new-instance v7, Lj02/m0$j5;

    check-cast v1, Lcom/whoop/navigation/UniversalCartScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalCartScreenModel;->getCartId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalCartScreenModel;->getSku()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalCartScreenModel;->getSource()Ljava/lang/String;

    move-result-object v10

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lj02/m0$j5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_74
    instance-of v3, v2, Lcom/whoop/navigation/UniversalBuyNowScreenModel;

    if-eqz v3, :cond_75

    new-instance v7, Lj02/m0$i5;

    check-cast v1, Lcom/whoop/navigation/UniversalBuyNowScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalBuyNowScreenModel;->getSku()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalBuyNowScreenModel;->getPackSku()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalBuyNowScreenModel;->getChildItemSkus()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalBuyNowScreenModel;->getWywSku()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalBuyNowScreenModel;->getBandSku()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalBuyNowScreenModel;->getClaspSku()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalBuyNowScreenModel;->getHookSku()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalBuyNowScreenModel;->getFastLinkSku()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1}, Lcom/whoop/navigation/UniversalBuyNowScreenModel;->getStoreDomain()Ljava/lang/String;

    move-result-object v16

    invoke-direct/range {v7 .. v16}, Lj02/m0$i5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v7

    :cond_75
    instance-of v3, v2, Lcom/whoop/navigation/URLScreenModel;

    if-eqz v3, :cond_76

    new-instance v2, Lj02/m0$h5;

    check-cast v1, Lcom/whoop/navigation/URLScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/URLScreenModel;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$h5;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_76
    instance-of v3, v2, Lcom/whoop/navigation/VideoCallScreenModel;

    if-eqz v3, :cond_77

    new-instance v2, Lj02/m0$p5;

    check-cast v1, Lcom/whoop/navigation/VideoCallScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/VideoCallScreenModel;->getCallId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$p5;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_77
    instance-of v3, v2, Lcom/whoop/navigation/InAppBrowserScreenModel;

    if-eqz v3, :cond_78

    new-instance v2, Lj02/m0$g1;

    check-cast v1, Lcom/whoop/navigation/InAppBrowserScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/InAppBrowserScreenModel;->getUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$g1;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_78
    instance-of v3, v2, Lcom/whoop/navigation/ProfileScreenModel;

    if-eqz v3, :cond_79

    check-cast v1, Lcom/whoop/navigation/ProfileScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/ProfileScreenModel;->getSource()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/navigation/ProfileScreenModel;->getTargetUserId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/ProfileScreenModel;->getCommunityId()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/navigation/ProfileScreenModel;->getEducationType()Ljava/lang/String;

    move-result-object v1

    new-instance v5, Lj02/m0$w3;

    invoke-direct {v5, v3, v4, v2, v1}, Lj02/m0$w3;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    return-object v5

    :cond_79
    instance-of v3, v2, Lcom/whoop/navigation/IntegrationsScreenModel;

    if-eqz v3, :cond_7a

    new-instance v2, Lj02/m0$d2;

    check-cast v1, Lcom/whoop/navigation/IntegrationsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/IntegrationsScreenModel;->getIntegrationId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/IntegrationsScreenModel;->getSource()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/navigation/IntegrationsScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lj02/m0$d2;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V

    return-object v2

    :cond_7a
    instance-of v3, v2, Lcom/whoop/navigation/IntegrationsDisclaimerScreenModel;

    if-eqz v3, :cond_7b

    sget-object v1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object v1

    :cond_7b
    instance-of v3, v2, Lcom/whoop/navigation/CustomizeBottomSheetScreenModel;

    if-eqz v3, :cond_7c

    sget-object v1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object v1

    :cond_7c
    instance-of v3, v2, Lcom/whoop/navigation/InterdayJournalScreenModel;

    if-eqz v3, :cond_7d

    sget-object v1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object v1

    :cond_7d
    instance-of v3, v2, Lcom/whoop/navigation/JournalScreenModel;

    if-eqz v3, :cond_7e

    sget-object v1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object v1

    :cond_7e
    sget-object v3, Lcom/whoop/navigation/LanguageSettingsScreenModel;->INSTANCE:Lcom/whoop/navigation/LanguageSettingsScreenModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7f

    sget-object v1, Lj02/m0$m2;->b:Lj02/m0$m2;

    return-object v1

    :cond_7f
    sget-object v3, Lcom/whoop/navigation/LegacyProCheckoutScreenModel;->INSTANCE:Lcom/whoop/navigation/LegacyProCheckoutScreenModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_80

    sget-object v1, Lj02/m0$n2;->b:Lj02/m0$n2;

    return-object v1

    :cond_80
    instance-of v3, v2, Lcom/whoop/navigation/LevelsScreenModel;

    if-eqz v3, :cond_81

    check-cast v1, Lcom/whoop/navigation/LevelsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/LevelsScreenModel;->getMemberLevelInfo()Lcom/whoop/navigation/MemberLevelInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/navigation/MemberLevelInfo;->getProgressionLevel()Lcom/whoop/navigation/ProgressionLevel;

    move-result-object v2

    new-instance v3, Lj02/m0$o2;

    invoke-virtual {v1}, Lcom/whoop/navigation/MemberLevelInfo;->getId()J

    move-result-wide v4

    invoke-virtual {v1}, Lcom/whoop/navigation/MemberLevelInfo;->getLevel()I

    move-result v6

    invoke-virtual {v1}, Lcom/whoop/navigation/MemberLevelInfo;->getExperience()I

    move-result v7

    invoke-virtual {v1}, Lcom/whoop/navigation/MemberLevelInfo;->getUserId()J

    move-result-wide v8

    invoke-virtual {v2}, Lcom/whoop/navigation/ProgressionLevel;->getTier()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lcom/whoop/navigation/ProgressionLevel;->getBadge()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2}, Lcom/whoop/navigation/ProgressionLevel;->getMiniBadge()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2}, Lcom/whoop/navigation/ProgressionLevel;->getMinimumExperience()I

    move-result v13

    invoke-virtual {v2}, Lcom/whoop/navigation/ProgressionLevel;->getMaximumExperience()Ljava/lang/Integer;

    move-result-object v14

    invoke-direct/range {v3 .. v14}, Lj02/m0$o2;-><init>(JIIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;)V

    return-object v3

    :cond_81
    instance-of v3, v2, Lcom/whoop/navigation/LoginScreenModel;

    if-eqz v3, :cond_82

    new-instance v2, Lj02/m0$s2;

    check-cast v1, Lcom/whoop/navigation/LoginScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/LoginScreenModel;->getShowCreateAccount()Z

    move-result v1

    invoke-direct {v2, v1}, Lj02/m0$s2;-><init>(Z)V

    return-object v2

    :cond_82
    instance-of v3, v2, Lcom/whoop/navigation/MciLogCalendarScreenModel;

    if-eqz v3, :cond_83

    new-instance v2, Lj02/m0$u2;

    check-cast v1, Lcom/whoop/navigation/MciLogCalendarScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/MciLogCalendarScreenModel;->getDate()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/MciLogCalendarScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$u2;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_83
    instance-of v3, v2, Lcom/whoop/navigation/MciOverviewScreenModel;

    if-eqz v3, :cond_84

    new-instance v7, Lj02/m0$v2;

    check-cast v1, Lcom/whoop/navigation/MciOverviewScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/MciOverviewScreenModel;->getDate()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/navigation/MciOverviewScreenModel;->getPreSelectedLogValue()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/navigation/MciOverviewScreenModel;->getAnalyticsSource()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/navigation/MciOverviewScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v12

    const/4 v9, 0x0

    invoke-direct/range {v7 .. v12}, Lj02/m0$v2;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V

    return-object v7

    :cond_84
    instance-of v3, v2, Lcom/whoop/navigation/MciPhaseCoachingScreenModel;

    if-eqz v3, :cond_85

    new-instance v2, Lj02/m0$w2;

    check-cast v1, Lcom/whoop/navigation/MciPhaseCoachingScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/MciPhaseCoachingScreenModel;->getPhase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/MciPhaseCoachingScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$w2;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V

    return-object v2

    :cond_85
    instance-of v3, v2, Lcom/whoop/navigation/MediaFocusModel;

    if-eqz v3, :cond_86

    new-instance v2, Lj02/m0$g3;

    check-cast v1, Lcom/whoop/navigation/MediaFocusModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/MediaFocusModel;->getVideoUrl()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$g3;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_86
    instance-of v3, v2, Lcom/whoop/navigation/MembershipAdjustmentScreenModel;

    if-eqz v3, :cond_87

    new-instance v2, Lj02/m0$y2;

    check-cast v1, Lcom/whoop/navigation/MembershipAdjustmentScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/MembershipAdjustmentScreenModel;->getStrapSerial()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/MembershipAdjustmentScreenModel;->getStrapSignature()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/navigation/MembershipAdjustmentScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lj02/m0$y2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_87
    instance-of v3, v2, Lcom/whoop/navigation/MembershipAdjustmentCheckoutScreenModel;

    if-eqz v3, :cond_89

    new-instance v2, Lj02/m0$x2;

    check-cast v1, Lcom/whoop/navigation/MembershipAdjustmentCheckoutScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/MembershipAdjustmentCheckoutScreenModel;->getPayload()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/MembershipAdjustmentCheckoutScreenModel;->getTrackingTier()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/navigation/MembershipAdjustmentCheckoutScreenModel;->getTrackingSource()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_88

    goto :goto_9

    :cond_88
    move-object v4, v1

    :goto_9
    invoke-direct {v2, v3, v5, v4}, Lj02/m0$x2;-><init>(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_89
    sget-object v3, Lcom/whoop/navigation/MembershipAndBillingScreenModel;->INSTANCE:Lcom/whoop/navigation/MembershipAndBillingScreenModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8a

    sget-object v1, Lj02/m0$z2;->b:Lj02/m0$z2;

    return-object v1

    :cond_8a
    sget-object v3, Lcom/whoop/navigation/MembershipManagementScreenModel;->INSTANCE:Lcom/whoop/navigation/MembershipManagementScreenModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8b

    sget-object v1, Lj02/m0$a3;->b:Lj02/m0$a3;

    return-object v1

    :cond_8b
    sget-object v3, Lcom/whoop/navigation/MenuScreenModel;->INSTANCE:Lcom/whoop/navigation/MenuScreenModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8c

    new-instance v1, Lj02/m0$b3;

    invoke-direct {v1, v5, v6, v5}, Lj02/m0$b3;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_8c
    instance-of v3, v2, Lcom/whoop/navigation/MfaSetupScreenModel;

    const/4 v7, 0x2

    if-eqz v3, :cond_8d

    new-instance v2, Lj02/m0$c3;

    check-cast v1, Lcom/whoop/navigation/MfaSetupScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/MfaSetupScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v5, v7, v5}, Lj02/m0$c3;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_8d
    sget-object v3, Lcom/whoop/navigation/MyAccountScreenModel;->INSTANCE:Lcom/whoop/navigation/MyAccountScreenModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8e

    sget-object v1, Lj02/m0$e3;->b:Lj02/m0$e3;

    return-object v1

    :cond_8e
    instance-of v3, v2, Lcom/whoop/navigation/NativePlanSwitchModel;

    if-eqz v3, :cond_8f

    new-instance v2, Lj02/m0$h3;

    check-cast v1, Lcom/whoop/navigation/NativePlanSwitchModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/NativePlanSwitchModel;->getSubscriptionType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$h3;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_8f
    instance-of v3, v2, Lcom/whoop/navigation/NativeStoreScreenModel;

    if-eqz v3, :cond_90

    new-instance v2, Lj02/m0$i3;

    check-cast v1, Lcom/whoop/navigation/NativeStoreScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/NativeStoreScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v5, v7, v5}, Lj02/m0$i3;-><init>(Ljava/lang/String;Leb/x0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_90
    instance-of v3, v2, Lcom/whoop/navigation/ProductDescriptionPageScreenModel;

    if-eqz v3, :cond_91

    check-cast v1, Lcom/whoop/navigation/ProductDescriptionPageScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/ProductDescriptionPageScreenModel;->getSlug()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/navigation/ProductDescriptionPageScreenModel;->getSku()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lo02/b;->a(Ljava/lang/String;Ljava/lang/String;)Ll83/k;

    move-result-object v2

    iget-object v3, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    new-instance v4, Lj02/m0$u3;

    invoke-virtual {v1}, Lcom/whoop/navigation/ProductDescriptionPageScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v3, v2, v1}, Lj02/m0$u3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v4

    :cond_91
    instance-of v3, v2, Lcom/whoop/navigation/ProductSizeGuideScreenModel;

    if-eqz v3, :cond_92

    new-instance v2, Lj02/m0$v3;

    check-cast v1, Lcom/whoop/navigation/ProductSizeGuideScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/ProductSizeGuideScreenModel;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$v3;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_92
    instance-of v3, v2, Lcom/whoop/navigation/OnboardingStoryScreenModel;

    if-eqz v3, :cond_93

    new-instance v2, Lj02/m0$l3;

    check-cast v1, Lcom/whoop/navigation/OnboardingStoryScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/OnboardingStoryScreenModel;->getOnboardingStoryName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/OnboardingStoryScreenModel;->getCycleId()J

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lj02/m0$l3;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    return-object v2

    :cond_93
    instance-of v3, v2, Lcom/whoop/navigation/PregnancyInsightsScreenModel;

    if-eqz v3, :cond_94

    new-instance v2, Lj02/m0$q3;

    check-cast v1, Lcom/whoop/navigation/PregnancyInsightsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/PregnancyInsightsScreenModel;->getDate()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/PregnancyInsightsScreenModel;->getSource()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/navigation/PregnancyInsightsScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lj02/m0$q3;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V

    return-object v2

    :cond_94
    instance-of v3, v2, Lcom/whoop/navigation/PregnancySettingsScreenModel;

    if-eqz v3, :cond_95

    new-instance v2, Lj02/m0$r3;

    check-cast v1, Lcom/whoop/navigation/PregnancySettingsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/PregnancySettingsScreenModel;->getPregnancyScreen()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/PregnancySettingsScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$r3;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_95
    instance-of v3, v2, Lcom/whoop/navigation/PreviousPregnancyScreenModel;

    if-eqz v3, :cond_96

    new-instance v2, Lj02/m0$s3;

    check-cast v1, Lcom/whoop/navigation/PreviousPregnancyScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/PreviousPregnancyScreenModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$s3;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_96
    instance-of v3, v2, Lcom/whoop/navigation/PrivacyScreenModel;

    if-eqz v3, :cond_97

    new-instance v1, Lj02/m0$t3;

    invoke-direct {v1, v5, v6, v5}, Lj02/m0$t3;-><init>(Lj02/u0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_97
    instance-of v3, v2, Lcom/whoop/navigation/EnterpriseProgramSettingsScreenModel;

    if-eqz v3, :cond_98

    new-instance v1, Lj02/m0$t3;

    sget-object v2, Lj02/u0;->ENTERPRISE_ONLY:Lj02/u0;

    invoke-direct {v1, v2}, Lj02/m0$t3;-><init>(Lj02/u0;)V

    return-object v1

    :cond_98
    instance-of v3, v2, Lcom/whoop/navigation/RecoveryDetailsScreenModel;

    if-eqz v3, :cond_99

    new-instance v8, Lj02/m0$e;

    check-cast v1, Lcom/whoop/navigation/RecoveryDetailsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/RecoveryDetailsScreenModel;->getActivityId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/navigation/RecoveryDetailsScreenModel;->getEntryPoint()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/navigation/RecoveryDetailsScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v15

    const/16 v16, 0x1c

    const/16 v17, 0x0

    const-string v10, "RECOVERY"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v8 .. v17}, Lj02/m0$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8

    :cond_99
    instance-of v3, v2, Lcom/whoop/navigation/ReferAFriendScreenModel;

    if-eqz v3, :cond_9a

    sget-object v1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object v1

    :cond_9a
    instance-of v3, v2, Lcom/whoop/navigation/ReferAFriendHubScreenModel;

    if-eqz v3, :cond_9b

    sget-object v1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object v1

    :cond_9b
    instance-of v3, v2, Lcom/whoop/navigation/ReferAFriendReceiverScreenModel;

    if-eqz v3, :cond_9c

    new-instance v2, Lj02/m0$x3;

    check-cast v1, Lcom/whoop/navigation/ReferAFriendReceiverScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/ReferAFriendReceiverScreenModel;->getCode()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$x3;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_9c
    instance-of v3, v2, Lcom/whoop/navigation/ReturnsScreenModel;

    if-eqz v3, :cond_9d

    sget-object v1, Lj02/m0$c4;->b:Lj02/m0$c4;

    return-object v1

    :cond_9d
    instance-of v3, v2, Lcom/whoop/navigation/SageScreenModel;

    if-eqz v3, :cond_9e

    new-instance v2, Lj02/m0$e4;

    check-cast v1, Lcom/whoop/navigation/SageScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/SageScreenModel;->getDate()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/SageScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$e4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_9e
    instance-of v3, v2, Lcom/whoop/navigation/SageManualEntryScreenModel;

    if-eqz v3, :cond_9f

    new-instance v2, Lj02/m0$d4;

    check-cast v1, Lcom/whoop/navigation/SageManualEntryScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/SageManualEntryScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$d4;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_9f
    instance-of v3, v2, Lcom/whoop/navigation/SageOnboardingScreenModel;

    if-eqz v3, :cond_a0

    sget-object v1, Lj02/m0$f4;->b:Lj02/m0$f4;

    return-object v1

    :cond_a0
    instance-of v3, v2, Lcom/whoop/navigation/SanguineWaitlistScreenModel;

    const/4 v6, 0x0

    if-eqz v3, :cond_a2

    new-instance v2, Lj02/m0$h4;

    check-cast v1, Lcom/whoop/navigation/SanguineWaitlistScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/SanguineWaitlistScreenModel;->getSource()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/SanguineWaitlistScreenModel;->getSignUpOnEntry()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_a1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    :cond_a1
    invoke-direct {v2, v3, v6}, Lj02/m0$h4;-><init>(Ljava/lang/String;Z)V

    return-object v2

    :cond_a2
    instance-of v3, v2, Lcom/whoop/navigation/SanguineWaitlistBiomarkersScreenModel;

    if-eqz v3, :cond_a3

    sget-object v1, Lj02/m0$g4;->b:Lj02/m0$g4;

    return-object v1

    :cond_a3
    instance-of v3, v2, Lcom/whoop/navigation/SeeAllRecordingsScreenModel;

    if-eqz v3, :cond_a4

    new-instance v2, Lj02/m0$i4;

    check-cast v1, Lcom/whoop/navigation/SeeAllRecordingsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/SeeAllRecordingsScreenModel;->getMeasurementId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$i4;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_a4
    sget-object v3, Lcom/whoop/navigation/ShepherdAboutModel;->INSTANCE:Lcom/whoop/navigation/ShepherdAboutModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a5

    sget-object v1, Lj02/m0$l4;->b:Lj02/m0$l4;

    return-object v1

    :cond_a5
    instance-of v3, v2, Lcom/whoop/navigation/ShepherdDetailsModel;

    if-eqz v3, :cond_a6

    new-instance v2, Lj02/m0$m4;

    check-cast v1, Lcom/whoop/navigation/ShepherdDetailsModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/ShepherdDetailsModel;->getDate()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/ShepherdDetailsModel;->getEducationName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$m4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_a6
    sget-object v3, Lcom/whoop/navigation/ShepherdHistoryModel;->INSTANCE:Lcom/whoop/navigation/ShepherdHistoryModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a7

    sget-object v1, Lj02/m0$n4;->b:Lj02/m0$n4;

    return-object v1

    :cond_a7
    sget-object v3, Lcom/whoop/navigation/ShepherdOnboardingModel;->INSTANCE:Lcom/whoop/navigation/ShepherdOnboardingModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a8

    new-instance v1, Lj02/m0$o4;

    invoke-direct {v1, v4}, Lj02/m0$o4;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_a8
    sget-object v3, Lcom/whoop/navigation/ShepherdRegistrationModel;->INSTANCE:Lcom/whoop/navigation/ShepherdRegistrationModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a9

    sget-object v1, Lj02/m0$p4;->b:Lj02/m0$p4;

    return-object v1

    :cond_a9
    sget-object v3, Lcom/whoop/navigation/ShepherdSettingsModel;->INSTANCE:Lcom/whoop/navigation/ShepherdSettingsModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_aa

    sget-object v1, Lj02/m0$q4;->b:Lj02/m0$q4;

    return-object v1

    :cond_aa
    instance-of v3, v2, Lcom/whoop/navigation/SleepDetailsScreenModel;

    if-eqz v3, :cond_ab

    new-instance v8, Lj02/m0$e;

    check-cast v1, Lcom/whoop/navigation/SleepDetailsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/SleepDetailsScreenModel;->getActivityId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/navigation/SleepDetailsScreenModel;->getEntryPoint()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/navigation/SleepDetailsScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v15

    const/16 v16, 0x1c

    const/16 v17, 0x0

    const-string v10, "SLEEP"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v8 .. v17}, Lj02/m0$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8

    :cond_ab
    instance-of v3, v2, Lcom/whoop/navigation/StartActivitySportModel;

    if-eqz v3, :cond_ac

    new-instance v8, Lj02/m0$t4;

    check-cast v1, Lcom/whoop/navigation/StartActivitySportModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/StartActivitySportModel;->getSportId()Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/navigation/StartActivitySportModel;->getAutoStartActivity()Ljava/lang/Boolean;

    move-result-object v10

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lj02/m0$t4;-><init>(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8

    :cond_ac
    sget-object v3, Lcom/whoop/navigation/StartActivityScreenModel;->INSTANCE:Lcom/whoop/navigation/StartActivityScreenModel;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_ad

    new-instance v8, Lj02/m0$t4;

    const/4 v12, 0x7

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lj02/m0$t4;-><init>(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8

    :cond_ad
    instance-of v3, v2, Lcom/whoop/navigation/StreaksExplainerModel;

    if-eqz v3, :cond_ae

    sget-object v1, Lj02/m0$x4;->b:Lj02/m0$x4;

    return-object v1

    :cond_ae
    instance-of v3, v2, Lcom/whoop/navigation/StrengthTrainerScreenModel;

    if-eqz v3, :cond_af

    new-instance v8, Lj02/m0$y4;

    check-cast v1, Lcom/whoop/navigation/StrengthTrainerScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/StrengthTrainerScreenModel;->getStartingId()Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/navigation/StrengthTrainerScreenModel;->getLinkActivityId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/navigation/StrengthTrainerScreenModel;->isFromWhoopCoach()Z

    move-result v11

    invoke-virtual {v1}, Lcom/whoop/navigation/StrengthTrainerScreenModel;->getEntryPoint()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/navigation/StrengthTrainerScreenModel;->getOpenTab()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/navigation/StrengthTrainerScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v14

    invoke-direct/range {v8 .. v14}, Lj02/m0$y4;-><init>(Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V

    return-object v8

    :cond_af
    instance-of v3, v2, Lcom/whoop/navigation/EditCustomExerciseModel;

    if-eqz v3, :cond_b0

    new-instance v2, Lj02/m0$d1;

    check-cast v1, Lcom/whoop/navigation/EditCustomExerciseModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/EditCustomExerciseModel;->getExerciseId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/EditCustomExerciseModel;->getEntryPoint()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$d1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_b0
    instance-of v3, v2, Lcom/whoop/navigation/ExerciseDetailsScreenModel;

    if-eqz v3, :cond_b1

    new-instance v8, Lj02/m0$e1;

    check-cast v1, Lcom/whoop/navigation/ExerciseDetailsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/ExerciseDetailsScreenModel;->getExerciseId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/navigation/ExerciseDetailsScreenModel;->getShowCTA()Z

    move-result v10

    invoke-virtual {v1}, Lcom/whoop/navigation/ExerciseDetailsScreenModel;->getEntryPoint()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/navigation/ExerciseDetailsScreenModel;->getEntryPointType()Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0x10

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v8 .. v15}, Lj02/m0$e1;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8

    :cond_b1
    instance-of v3, v2, Lcom/whoop/navigation/SleepPlannerScreenModel;

    if-eqz v3, :cond_b2

    new-instance v1, Lj02/m0$r4;

    const-string v2, "Overview Pillar - Entry Point"

    invoke-direct {v1, v2}, Lj02/m0$r4;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_b2
    instance-of v3, v2, Lcom/whoop/navigation/SmsSetupScreenModel;

    if-eqz v3, :cond_b3

    new-instance v2, Lj02/m0$s4;

    check-cast v1, Lcom/whoop/navigation/SmsSetupScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/SmsSetupScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$s4;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_b3
    instance-of v3, v2, Lcom/whoop/navigation/StressInterventionModel;

    if-eqz v3, :cond_b4

    new-instance v2, Lj02/m0$z4;

    check-cast v1, Lcom/whoop/navigation/StressInterventionModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/StressInterventionModel;->getInterventionType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$z4;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_b4
    instance-of v3, v2, Lcom/whoop/navigation/StressMonitorScreenModel;

    if-eqz v3, :cond_b5

    new-instance v8, Lj02/m0$a5;

    check-cast v1, Lcom/whoop/navigation/StressMonitorScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/StressMonitorScreenModel;->getDate()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/navigation/StressMonitorScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v11

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v8 .. v13}, Lj02/m0$a5;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8

    :cond_b5
    instance-of v3, v2, Lcom/whoop/navigation/SymptomPatternsScreenModel;

    if-eqz v3, :cond_b6

    new-instance v2, Lj02/m0$b5;

    check-cast v1, Lcom/whoop/navigation/SymptomPatternsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/SymptomPatternsScreenModel;->getFeatureType()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v5, v7, v5}, Lj02/m0$b5;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_b6
    instance-of v3, v2, Lcom/whoop/navigation/TiltModeScreenModel;

    if-eqz v3, :cond_b7

    new-instance v2, Lj02/m0$c5;

    check-cast v1, Lcom/whoop/navigation/TiltModeScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/TiltModeScreenModel;->getDate()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/TiltModeScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$c5;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_b7
    instance-of v3, v2, Lcom/whoop/navigation/TrendsScreenModel;

    if-eqz v3, :cond_b8

    sget-object v1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object v1

    :cond_b8
    instance-of v3, v2, Lcom/whoop/navigation/UpcycleLandingScreenModel;

    if-eqz v3, :cond_b9

    sget-object v1, Lj02/m0$o5;->b:Lj02/m0$o5;

    return-object v1

    :cond_b9
    instance-of v3, v2, Lcom/whoop/navigation/ReactivationUpsellScreenModel;

    if-eqz v3, :cond_ba

    sget-object v1, Lj02/m0$z3;->b:Lj02/m0$z3;

    return-object v1

    :cond_ba
    instance-of v3, v2, Lcom/whoop/navigation/WeightliftingDetailsScreenModel;

    if-eqz v3, :cond_bb

    new-instance v7, Lj02/m0$e;

    check-cast v1, Lcom/whoop/navigation/WeightliftingDetailsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/WeightliftingDetailsScreenModel;->getActivityId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/navigation/WeightliftingDetailsScreenModel;->getEntryPoint()Ljava/lang/String;

    move-result-object v13

    const/16 v15, 0x5c

    const/16 v16, 0x0

    const-string v9, "WEIGHTLIFTING_MSK"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v7 .. v16}, Lj02/m0$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_bb
    instance-of v3, v2, Lcom/whoop/navigation/WeekInReviewScreenModel;

    if-eqz v3, :cond_bc

    sget-object v1, Lj02/m0$q5;->b:Lj02/m0$q5;

    return-object v1

    :cond_bc
    instance-of v3, v2, Lcom/whoop/navigation/WeeklyPlanEditScreenModel;

    if-eqz v3, :cond_bd

    sget-object v1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object v1

    :cond_bd
    instance-of v3, v2, Lcom/whoop/navigation/WeeklyPlanOverviewScreenModel;

    if-eqz v3, :cond_be

    new-instance v2, Lj02/m0$s5;

    check-cast v1, Lcom/whoop/navigation/WeeklyPlanOverviewScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanOverviewScreenModel;->getScrollId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanOverviewScreenModel;->getSource()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanOverviewScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v1

    invoke-direct {v2, v6, v3, v4, v1}, Lj02/m0$s5;-><init>(ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V

    return-object v2

    :cond_be
    instance-of v3, v2, Lcom/whoop/navigation/WeeklyPlanPresetLandingScreenModel;

    if-eqz v3, :cond_bf

    new-instance v7, Lj02/m0$s5;

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lj02/m0$s5;-><init>(ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7

    :cond_bf
    instance-of v3, v2, Lcom/whoop/navigation/WeeklyPlanSummaryScreenModel;

    if-eqz v3, :cond_c0

    new-instance v2, Lj02/m0$v5;

    check-cast v1, Lcom/whoop/navigation/WeeklyPlanSummaryScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSummaryScreenModel;->getPlanId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSummaryScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Lj02/m0$v5;-><init>(Ljava/lang/String;Lcom/whoop/navigation/AiAction;)V

    return-object v2

    :cond_c0
    instance-of v3, v2, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;

    if-eqz v3, :cond_c2

    check-cast v1, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->getInitialSelection()Lcom/whoop/navigation/InitialSelectionModel;

    move-result-object v2

    if-eqz v2, :cond_c1

    iget-object v3, v0, Lo02/a;->a:Lad3/c;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lcom/whoop/navigation/InitialSelectionModel;->Companion:Lcom/whoop/navigation/InitialSelectionModel$a;

    invoke-virtual {v4}, Lcom/whoop/navigation/InitialSelectionModel$a;->serializer()Lwc3/c;

    move-result-object v4

    check-cast v4, Lwc3/j;

    invoke-virtual {v3, v4, v2}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    :cond_c1
    move-object v11, v5

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->getPlanName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->getLocked()Z

    move-result v9

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->getNoPlanShowMetricSelection()Z

    move-result v10

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->getAnalyticsSource()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->getDate()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->getSource()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->getPresetPlanCategory()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->getPlanTitle()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->getDescription()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->getExplanationTitle()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->getExplanation()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->getTemplateId()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->getCategory()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->getCarouselPlacement()Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v1}, Lcom/whoop/navigation/WeeklyPlanSetupScreenModel;->getDismissalType()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lj02/t;->a(Ljava/lang/String;)Lj02/v;

    move-result-object v22

    new-instance v6, Lj02/m0$u5;

    invoke-direct/range {v6 .. v22}, Lj02/m0$u5;-><init>(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/v;)V

    return-object v6

    :cond_c2
    instance-of v3, v2, Lcom/whoop/navigation/WhoopLabsHomeScreenModel;

    if-eqz v3, :cond_c3

    new-instance v2, Lj02/m0$x5;

    check-cast v1, Lcom/whoop/navigation/WhoopLabsHomeScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/WhoopLabsHomeScreenModel;->getCampaignId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/WhoopLabsHomeScreenModel;->getSessionId()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/navigation/WhoopLabsHomeScreenModel;->getCampaignFilter()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lj02/m0$x5;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    return-object v2

    :cond_c3
    instance-of v3, v2, Lcom/whoop/navigation/WhoopLabsScreenModel;

    if-eqz v3, :cond_c4

    new-instance v2, Lj02/m0$x5;

    check-cast v1, Lcom/whoop/navigation/WhoopLabsScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/WhoopLabsScreenModel;->getCampaignId()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/navigation/WhoopLabsScreenModel;->getSessionId()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/navigation/WhoopLabsScreenModel;->getCampaignFilter()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v4, v1}, Lj02/m0$x5;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    return-object v2

    :cond_c4
    instance-of v3, v2, Lcom/whoop/navigation/WhoopLiveScreenModel;

    if-eqz v3, :cond_cd

    new-instance v7, Lj02/m0$y5;

    check-cast v1, Lcom/whoop/navigation/WhoopLiveScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/WhoopLiveScreenModel;->getCycleId()Ljava/lang/Long;

    move-result-object v2

    const-wide/16 v8, 0x0

    if-eqz v2, :cond_c5

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    goto :goto_a

    :cond_c5
    move-wide v2, v8

    :goto_a
    invoke-virtual {v1}, Lcom/whoop/navigation/WhoopLiveScreenModel;->getLowerBound()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_c6

    move-object v10, v4

    goto :goto_b

    :cond_c6
    move-object v10, v5

    :goto_b
    invoke-virtual {v1}, Lcom/whoop/navigation/WhoopLiveScreenModel;->getUpperBound()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_c7

    move-object v11, v4

    goto :goto_c

    :cond_c7
    move-object v11, v5

    :goto_c
    invoke-virtual {v1}, Lcom/whoop/navigation/WhoopLiveScreenModel;->getDayStrain()Ljava/lang/Double;

    move-result-object v4

    if-eqz v4, :cond_c8

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    :goto_d
    move-wide v12, v4

    goto :goto_e

    :cond_c8
    const-wide/16 v4, 0x0

    goto :goto_d

    :goto_e
    invoke-virtual {v1}, Lcom/whoop/navigation/WhoopLiveScreenModel;->getRecoveryScore()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_c9

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move v14, v4

    goto :goto_f

    :cond_c9
    move v14, v6

    :goto_f
    invoke-virtual {v1}, Lcom/whoop/navigation/WhoopLiveScreenModel;->getSleepMilliseconds()Ljava/lang/Long;

    move-result-object v4

    if-eqz v4, :cond_ca

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    :cond_ca
    move-wide v15, v8

    invoke-virtual {v1}, Lcom/whoop/navigation/WhoopLiveScreenModel;->getCalories()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_cb

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move/from16 v17, v4

    goto :goto_10

    :cond_cb
    move/from16 v17, v6

    :goto_10
    invoke-virtual {v1}, Lcom/whoop/navigation/WhoopLiveScreenModel;->isComplete()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_cc

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    :cond_cc
    move-wide v8, v2

    move/from16 v18, v6

    invoke-direct/range {v7 .. v18}, Lj02/m0$y5;-><init>(JLjava/lang/String;Ljava/lang/String;DIJIZ)V

    return-object v7

    :cond_cd
    sget-object v3, Lcom/whoop/navigation/WhatToExpectScreenModel;->INSTANCE:Lcom/whoop/navigation/WhatToExpectScreenModel;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_ce

    sget-object v1, Lj02/m0$w5;->b:Lj02/m0$w5;

    return-object v1

    :cond_ce
    instance-of v3, v2, Lcom/whoop/navigation/WhoopShareScreenModel;

    if-eqz v3, :cond_d0

    new-instance v2, Lj02/m0$z5;

    check-cast v1, Lcom/whoop/navigation/WhoopShareScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/WhoopShareScreenModel;->getPath()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_cf

    goto :goto_11

    :cond_cf
    move-object v4, v3

    :goto_11
    invoke-virtual {v1}, Lcom/whoop/navigation/WhoopShareScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v4, v1}, Lj02/m0$z5;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    :cond_d0
    instance-of v3, v2, Lcom/whoop/navigation/YearInReviewScreenModel;

    if-eqz v3, :cond_d1

    new-instance v2, Lj02/m0$a6;

    check-cast v1, Lcom/whoop/navigation/YearInReviewScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/YearInReviewScreenModel;->getYear()I

    move-result v1

    invoke-direct {v2, v1}, Lj02/m0$a6;-><init>(I)V

    return-object v2

    :cond_d1
    instance-of v3, v2, Lcom/whoop/navigation/OrderConfirmationScreenModel;

    if-eqz v3, :cond_d2

    new-instance v2, Lj02/m0$m3;

    check-cast v1, Lcom/whoop/navigation/OrderConfirmationScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/OrderConfirmationScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lj02/m0$m3;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_d2
    instance-of v3, v2, Lcom/whoop/navigation/AfterActivationFinalScreensScreenModel;

    if-eqz v3, :cond_d3

    new-instance v4, Lj02/m0$d;

    check-cast v1, Lcom/whoop/navigation/AfterActivationFinalScreensScreenModel;

    invoke-virtual {v1}, Lcom/whoop/navigation/AfterActivationFinalScreensScreenModel;->getStartScreen()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/navigation/AfterActivationFinalScreensScreenModel;->getSource()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v4 .. v9}, Lj02/m0$d;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_d3
    instance-of v2, v2, Lcom/whoop/navigation/ActivationNavigationModel;

    if-eqz v2, :cond_d4

    new-instance v3, Lj02/m0$d;

    check-cast v1, Lcom/whoop/navigation/ActivationNavigationModel;

    invoke-interface {v1}, Lcom/whoop/navigation/ActivationNavigationModel;->getStartScreen()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x5

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lj02/m0$d;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_d4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
