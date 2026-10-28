.class public interface abstract Lcom/whoop/user/journey/sources/data/UserJourneyApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u0008\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0016\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\tJ \u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\r\u0010\u0006J*\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u000f\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/user/journey/sources/data/UserJourneyApi;",
        "",
        "",
        "year",
        "Lcom/whoop/user/journey/model/UserJourneyContentModelV2;",
        "getYearInReviewSteps",
        "(ILq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/user/journey/model/UserJourneyContentModel;",
        "getWeekInReviewSteps",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lpg3/v0;",
        "Ll83/a0;",
        "sendWirSeen",
        "sendYirSeen",
        "Lcom/whoop/user/journey/model/TimeCapsuleRequest;",
        "request",
        "saveTimeCapsule",
        "(ILcom/whoop/user/journey/model/TimeCapsuleRequest;Lq83/d;)Ljava/lang/Object;",
        "user-journey_release"
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
.method public abstract getWeekInReviewSteps(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/user/journey/model/UserJourneyContentModel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "user-journey-service/v1/user-journey/first-week-in-review"
    .end annotation
.end method

.method public abstract getYearInReviewSteps(ILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/t;
            value = "year"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lcom/whoop/user/journey/model/UserJourneyContentModelV2;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "user-journey-service/v2/bff/user-journey/year-in-review"
    .end annotation
.end method

.method public abstract saveTimeCapsule(ILcom/whoop/user/journey/model/TimeCapsuleRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/t;
            value = "year"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/user/journey/model/TimeCapsuleRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/whoop/user/journey/model/TimeCapsuleRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "user-journey-service/v2/user-journey/year-in-review/time-capsule"
    .end annotation
.end method

.method public abstract sendWirSeen(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "user-journey-service/v1/user-journey/first-week-in-review/is-seen"
    .end annotation
.end method

.method public abstract sendYirSeen(ILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/t;
            value = "year"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "user-journey-service/v1/user-journey/year-in-review/is-seen"
    .end annotation
.end method
