.class public interface abstract Lcom/whoop/weeklyplan/api/WeeklyPlanApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00052\u0010\u0008\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\"\u0010\t\u001a\u00020\u00082\u0010\u0008\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\u0007J*\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0008\u0001\u0010\n\u001a\u00020\u00032\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J*\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0008\u0001\u0010\n\u001a\u00020\u00032\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u0011H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J*\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0008\u0001\u0010\n\u001a\u00020\u00032\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u0014H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J*\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0008\u0001\u0010\n\u001a\u00020\u00032\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J \u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0008\u0001\u0010\n\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ \u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0008\u0001\u0010\n\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ \u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0008\u0001\u0010\n\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ4\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0008\u0001\u0010\n\u001a\u00020\u00032\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u001e2\u0008\u0008\u0001\u0010 \u001a\u00020\u001fH\u00a7@\u00a2\u0006\u0004\u0008!\u0010\"J \u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0008\u0001\u0010\n\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0004\u0008#\u0010\u001bJ\u001a\u0010&\u001a\u00020%2\u0008\u0008\u0001\u0010$\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0004\u0008&\u0010\u001bJ\u001a\u0010(\u001a\u00020\'2\u0008\u0008\u0001\u0010$\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0004\u0008(\u0010\u001bJ4\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0008\u0008\u0001\u0010\n\u001a\u00020\u00032\u0008\u0008\u0001\u0010*\u001a\u00020)2\u0008\u0008\u0001\u0010 \u001a\u00020\u001fH\u00a7@\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u0010/\u001a\u00020.2\u0008\u0008\u0001\u0010-\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0004\u0008/\u0010\u001bJ\u001a\u00101\u001a\u0002002\u0008\u0008\u0001\u0010\n\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0004\u00081\u0010\u001b\u00a8\u00062\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;",
        "",
        "",
        "",
        "screen",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;",
        "customizeWeeklyPlanV2",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponseKotlinx;",
        "customizeWeeklyPlanKotlinx",
        "planId",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;",
        "updateTargetsBody",
        "Lpg3/v0;",
        "Ll83/a0;",
        "confirmTargetStrainOrSleepV2",
        "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;",
        "confirmTargetBehaviorsV2",
        "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;",
        "confirmTargetActivitiesV2",
        "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;Lq83/d;)Ljava/lang/Object;",
        "targetGoalType",
        "deleteStrainOrSleepGoalV2",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "deleteActivityGoalV2",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "deleteBehaviorGoalV2",
        "dismissSummary",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;",
        "",
        "migrateSmartAlarm",
        "savePresetPlan",
        "(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;ZLq83/d;)Ljava/lang/Object;",
        "cancelPlan",
        "planName",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;",
        "getHubAndSpoke",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;",
        "getHubAndSpokeKotlinx",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;",
        "body",
        "saveHubAndSpoke",
        "(Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;ZLq83/d;)Ljava/lang/Object;",
        "date",
        "Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometileResponse;",
        "getHomeTileData",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;",
        "getSummary",
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


# virtual methods
.method public abstract cancelPlan(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "planId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "progression-service/v1/weekly-plan/{planId}"
    .end annotation
.end method

.method public abstract confirmTargetActivitiesV2(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "planId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "progression-service/v2/weekly-plan/{planId}/goal/activity"
    .end annotation
.end method

.method public abstract confirmTargetBehaviorsV2(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "planId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "progression-service/v2/weekly-plan/{planId}/goal/behavior"
    .end annotation
.end method

.method public abstract confirmTargetStrainOrSleepV2(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "planId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "progression-service/v2/weekly-plan/{planId}/goal/target"
    .end annotation
.end method

.method public abstract customizeWeeklyPlanKotlinx(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/util/List;
        .annotation runtime Lwg3/t;
            value = "screens"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponseKotlinx;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "progression-service/v2/weekly-plan/setup"
    .end annotation
.end method

.method public abstract customizeWeeklyPlanV2(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/util/List;
        .annotation runtime Lwg3/t;
            value = "screens"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "progression-service/v2/weekly-plan/setup"
    .end annotation
.end method

.method public abstract deleteActivityGoalV2(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "planId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "progression-service/v2/weekly-plan/{planId}/goal/activity"
    .end annotation
.end method

.method public abstract deleteBehaviorGoalV2(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "planId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "progression-service/v2/weekly-plan/{planId}/goal/behavior"
    .end annotation
.end method

.method public abstract deleteStrainOrSleepGoalV2(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "planId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "targetGoalType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "progression-service/v2/weekly-plan/{planId}/goal/target/{targetGoalType}"
    .end annotation
.end method

.method public abstract dismissSummary(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "planId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "progression-service/v1/weekly-plan/{planId}/summary"
    .end annotation
.end method

.method public abstract getHomeTileData(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "date"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometileResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "progression-service/v2/weekly-plan/home-tile/{date}"
    .end annotation
.end method

.method public abstract getHubAndSpoke(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "planName"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "progression-service/v2/weekly-plan/setup/overview/{planName}"
    .end annotation
.end method

.method public abstract getHubAndSpokeKotlinx(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "planName"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponseKotlinx;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "progression-service/v2/weekly-plan/setup/overview/{planName}"
    .end annotation
.end method

.method public abstract getSummary(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "planId"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "progression-service/v2/weekly-plan/{planId}/summary"
    .end annotation
.end method

.method public abstract saveHubAndSpoke(Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;ZLq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "planId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime Lwg3/t;
            value = "migrate_smart_alarm"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;",
            "Z",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "progression-service/v2/weekly-plan/{planId}"
    .end annotation
.end method

.method public abstract savePresetPlan(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;ZLq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "planId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .param p3    # Z
        .annotation runtime Lwg3/t;
            value = "migrate_smart_alarm"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/SavePresetPlan;",
            "Z",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "progression-service/v1/weekly-plan/{planId}"
    .end annotation
.end method
