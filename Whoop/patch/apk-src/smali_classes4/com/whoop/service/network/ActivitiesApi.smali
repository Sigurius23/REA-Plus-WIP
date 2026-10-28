.class public interface abstract Lcom/whoop/service/network/ActivitiesApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\'\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J%\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0008\u0008\u0001\u0010\n\u001a\u00020\tH\'\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ \u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00032\u0008\u0008\u0001\u0010\n\u001a\u00020\tH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ \u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00032\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J \u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00032\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u0014H\u00a7@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0016\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019H\u00a7@\u00a2\u0006\u0004\u0008\u001b\u0010\u0008J\u0016\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u0019H\u00a7@\u00a2\u0006\u0004\u0008\u001d\u0010\u0008J \u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u00032\u0008\u0008\u0001\u0010\u0015\u001a\u00020\u001eH\u00a7@\u00a2\u0006\u0004\u0008 \u0010!J%\u0010%\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020$0\u00030\u00022\u0008\u0008\u0001\u0010#\u001a\u00020\"H\'\u00a2\u0006\u0004\u0008%\u0010&\u00a8\u0006\'\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/service/network/ActivitiesApi;",
        "",
        "Lxg3/g;",
        "Lpg3/v0;",
        "Lcom/whoop/service/network/model/UserState;",
        "getUserState",
        "()Lxg3/g;",
        "getUserStateSuspend",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/request/UserStateRequestBody;",
        "userState",
        "setUserStateWithRxJava",
        "(Lcom/whoop/data/remote/domain/request/UserStateRequestBody;)Lxg3/g;",
        "Ll83/a0;",
        "setUserState",
        "(Lcom/whoop/data/remote/domain/request/UserStateRequestBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/request/UserCreatedWorkoutDto;",
        "workout",
        "addWorkout",
        "(Lcom/whoop/data/remote/domain/request/UserCreatedWorkoutDto;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/addactivity/network/CreateActivityRequest;",
        "body",
        "Lcom/whoop/addactivity/network/CreateActivityResponse;",
        "postWorkoutV2",
        "(Lcom/whoop/addactivity/network/CreateActivityRequest;Lq83/d;)Ljava/lang/Object;",
        "",
        "Lcom/whoop/addactivity/network/model/Activity;",
        "getActivities",
        "Lcom/whoop/addactivity/network/model/RecentActivity;",
        "getRecentActivities",
        "Lcom/whoop/addactivity/network/CreateActivityRequestV1;",
        "Lcom/whoop/addactivity/network/CoreDetailsActivityResponse;",
        "createActivity",
        "(Lcom/whoop/addactivity/network/CreateActivityRequestV1;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/service/network/model/cycles/PostSleepDtoV2;",
        "sleep",
        "Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;",
        "postSleepV2",
        "(Lcom/whoop/service/network/model/cycles/PostSleepDtoV2;)Lxg3/g;",
        "core_release"
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
.method public abstract addWorkout(Lcom/whoop/data/remote/domain/request/UserCreatedWorkoutDto;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/data/remote/domain/request/UserCreatedWorkoutDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/request/UserCreatedWorkoutDto;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "activities-service/v1/user-state/workout"
    .end annotation
.end method

.method public abstract createActivity(Lcom/whoop/addactivity/network/CreateActivityRequestV1;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/addactivity/network/CreateActivityRequestV1;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/addactivity/network/CreateActivityRequestV1;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/addactivity/network/CoreDetailsActivityResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "core-details-bff/v2/create-activity"
    .end annotation
.end method

.method public abstract getActivities(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/addactivity/network/model/Activity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "activities-service/v2/activity-types"
    .end annotation
.end method

.method public abstract getRecentActivities(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/addactivity/network/model/RecentActivity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "core-details-bff/v2/activity-type/user-created"
    .end annotation
.end method

.method public abstract getUserState()Lxg3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/UserState;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "activities-service/v1/user-state"
    .end annotation
.end method

.method public abstract getUserStateSuspend(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/UserState;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "activities-service/v1/user-state"
    .end annotation
.end method

.method public abstract postSleepV2(Lcom/whoop/service/network/model/cycles/PostSleepDtoV2;)Lxg3/g;
    .param p1    # Lcom/whoop/service/network/model/cycles/PostSleepDtoV2;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/network/model/cycles/PostSleepDtoV2;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/cycles/SleepActivityResponseV2;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "sleep-service/v1"
    .end annotation
.end method

.method public abstract postWorkoutV2(Lcom/whoop/addactivity/network/CreateActivityRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/addactivity/network/CreateActivityRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/addactivity/network/CreateActivityRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/addactivity/network/CreateActivityResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "core-details-bff/v0/create-activity"
    .end annotation
.end method

.method public abstract setUserState(Lcom/whoop/data/remote/domain/request/UserStateRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/data/remote/domain/request/UserStateRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/request/UserStateRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "activities-service/v1/user-state"
    .end annotation
.end method

.method public abstract setUserStateWithRxJava(Lcom/whoop/data/remote/domain/request/UserStateRequestBody;)Lxg3/g;
    .param p1    # Lcom/whoop/data/remote/domain/request/UserStateRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/request/UserStateRequestBody;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/UserState;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "activities-service/v1/user-state"
    .end annotation
.end method
