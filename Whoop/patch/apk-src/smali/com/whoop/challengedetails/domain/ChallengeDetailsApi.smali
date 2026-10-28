.class public interface abstract Lcom/whoop/challengedetails/domain/ChallengeDetailsApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/challengedetails/domain/ChallengeDetailsApi;",
        "",
        "",
        "name",
        "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;",
        "getChallengeDetails",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/challengedetails/domain/models/JoinChallengeRequest;",
        "body",
        "Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;",
        "joinChallenge",
        "(Lcom/whoop/challengedetails/domain/models/JoinChallengeRequest;Lq83/d;)Ljava/lang/Object;",
        "challenge-details_release"
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
.method public abstract getChallengeDetails(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "name"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "user-journey-service/v1/challenges/details/{name}"
    .end annotation
.end method

.method public abstract joinChallenge(Lcom/whoop/challengedetails/domain/models/JoinChallengeRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/challengedetails/domain/models/JoinChallengeRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/challengedetails/domain/models/JoinChallengeRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "user-journey-service/v1/challenges/join"
    .end annotation
.end method
