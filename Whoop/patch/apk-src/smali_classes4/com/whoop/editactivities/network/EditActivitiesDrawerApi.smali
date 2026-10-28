.class public interface abstract Lcom/whoop/editactivities/network/EditActivitiesDrawerApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008f\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J&\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00042\u000e\u0008\u0001\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ*\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00042\u0008\u0008\u0001\u0010\r\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000e\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/editactivities/network/EditActivitiesDrawerApi;",
        "",
        "",
        "date",
        "Lpg3/v0;",
        "Lcom/whoop/editactivities/network/model/EditActivitiesDrawerResponse;",
        "getEditActivitiesDrawerContent",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "ids",
        "Ll83/a0;",
        "deleteActivities",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "startTime",
        "endTime",
        "mergeActivities",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
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
.method public abstract deleteActivities(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/util/List;
        .annotation runtime Lwg3/t;
            value = "id"
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
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "core-details-bff/v1/activities/merge"
    .end annotation
.end method

.method public abstract getEditActivitiesDrawerContent(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "date"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/editactivities/network/model/EditActivitiesDrawerResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "home-service/v1/home/activities/multi-modifications"
    .end annotation
.end method

.method public abstract mergeActivities(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "startTime"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "endTime"
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

    .annotation runtime Lwg3/n;
        value = "core-details-bff/v1/activities/merge"
    .end annotation
.end method
