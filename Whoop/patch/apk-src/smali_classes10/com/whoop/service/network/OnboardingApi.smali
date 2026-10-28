.class public interface abstract Lcom/whoop/service/network/OnboardingApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\n\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ$\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u0007J \u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0008\u0008\u0001\u0010\u0010\u001a\u00020\u000fH\u00a7@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/service/network/OnboardingApi;",
        "",
        "",
        "country",
        "adminDivision",
        "Lcom/whoop/service/network/model/AgeGateResponse;",
        "getAgeGate",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "region",
        "Ll92/c;",
        "getTerms",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "termId",
        "Lcom/whoop/service/network/model/TermDetailsResponse;",
        "getTermDetails",
        "Lcom/whoop/service/network/model/AcceptUserConsentsPayload;",
        "body",
        "Lpg3/v0;",
        "Ll83/a0;",
        "acceptUserConsents",
        "(Lcom/whoop/service/network/model/AcceptUserConsentsPayload;Lq83/d;)Ljava/lang/Object;",
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
.method public abstract acceptUserConsents(Lcom/whoop/service/network/model/AcceptUserConsentsPayload;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/service/network/model/AcceptUserConsentsPayload;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/service/network/model/AcceptUserConsentsPayload;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "onboarding-service/v2/consents"
    .end annotation
.end method

.method public abstract getAgeGate(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "country"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "adminDivision"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/service/network/model/AgeGateResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v1/age-gate"
    .end annotation
.end method

.method public abstract getTermDetails(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "termId"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "region"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/service/network/model/TermDetailsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v2/consents/{termId}"
    .end annotation
.end method

.method public abstract getTerms(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "region"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll92/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "onboarding-service/v2/consents"
    .end annotation
.end method
