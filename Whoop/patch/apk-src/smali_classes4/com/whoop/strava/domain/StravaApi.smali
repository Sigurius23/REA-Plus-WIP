.class public interface abstract Lcom/whoop/strava/domain/StravaApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\u000c\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000b\u001a\u00020\nH\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0016\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u00a7@\u00a2\u0006\u0004\u0008\u0010\u0010\u0004\u00a8\u0006\u0011\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/strava/domain/StravaApi;",
        "",
        "Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;",
        "getBffSettings",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;",
        "userSettingsInformationRequest",
        "Lcom/whoop/strava/domain/models/StravaDefaultResponse;",
        "upsertSettings",
        "(Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;",
        "authorizeRequest",
        "authorize",
        "(Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;Lq83/d;)Ljava/lang/Object;",
        "Lpg3/v0;",
        "Ll83/a0;",
        "deauthorize",
        "strava_release"
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
.method public abstract authorize(Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/strava/domain/models/StravaAuthorizeRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/strava/domain/models/StravaDefaultResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "social-service/v1/strava/bff/authorize"
    .end annotation
.end method

.method public abstract deauthorize(Lq83/d;)Ljava/lang/Object;
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

    .annotation runtime Lwg3/b;
        value = "social-service/v1/strava/bff/deauthorize"
    .end annotation
.end method

.method public abstract getBffSettings(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "social-service/v1/strava/bff/settings"
    .end annotation
.end method

.method public abstract upsertSettings(Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/strava/domain/models/StravaUserSettingsInformationRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/strava/domain/models/StravaDefaultResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "social-service/v1/strava/bff/settings"
    .end annotation
.end method
