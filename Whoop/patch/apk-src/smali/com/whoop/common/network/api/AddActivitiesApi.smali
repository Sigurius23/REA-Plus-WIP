.class public interface abstract Lcom/whoop/common/network/api/AddActivitiesApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008f\u0018\u00002\u00020\u0001J*\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ*\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\tJ*\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\r\u001a\u00020\u000cH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ \u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00062\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/common/network/api/AddActivitiesApi;",
        "",
        "",
        "activityId",
        "Lcom/whoop/addactivity/network/EditedActivityPayload;",
        "coreEditDetails",
        "Lpg3/v0;",
        "Lcom/whoop/addactivity/network/CoreDetailsActivityResponse;",
        "editCardioActivity",
        "(Ljava/lang/String;Lcom/whoop/addactivity/network/EditedActivityPayload;Lq83/d;)Ljava/lang/Object;",
        "Ll83/a0;",
        "editRecoveryActivity",
        "Lcom/whoop/edit/network/model/EditSleepModel;",
        "editSleepModel",
        "editSleep",
        "(Ljava/lang/String;Lcom/whoop/edit/network/model/EditSleepModel;Lq83/d;)Ljava/lang/Object;",
        "sleepId",
        "deleteSleep",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "add-activity_release"
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
.method public abstract deleteSleep(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "activityId"
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
        value = "core-details-bff/v2/sleep-details/{activityId}"
    .end annotation
.end method

.method public abstract editCardioActivity(Ljava/lang/String;Lcom/whoop/addactivity/network/EditedActivityPayload;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "activityId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/addactivity/network/EditedActivityPayload;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/addactivity/network/EditedActivityPayload;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/addactivity/network/CoreDetailsActivityResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "core-details-bff/v2/cardio-details"
    .end annotation
.end method

.method public abstract editRecoveryActivity(Ljava/lang/String;Lcom/whoop/addactivity/network/EditedActivityPayload;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "recoveryActivityId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/addactivity/network/EditedActivityPayload;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/addactivity/network/EditedActivityPayload;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "core-details-bff/v1/recovery-details"
    .end annotation
.end method

.method public abstract editSleep(Ljava/lang/String;Lcom/whoop/edit/network/model/EditSleepModel;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "activityId"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/edit/network/model/EditSleepModel;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/edit/network/model/EditSleepModel;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "core-details-bff/v2/sleep-details/{activityId}"
    .end annotation
.end method
