.class public interface abstract Lcom/whoop/home/domain/HomeApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0008\u0001\u0010\t\u001a\u00020\u0008H\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0016\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ \u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u0010H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J \u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0008\u0001\u0010\u0014\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J \u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0008\u0001\u0010\u0018\u001a\u00020\u0017H\u00a7@\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/home/domain/HomeApi;",
        "",
        "",
        "pillarType",
        "requestDate",
        "Lcom/whoop/home/domain/models/CalendarResponse;",
        "getHomeCalendar",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/home/domain/models/DismissTileRequest;",
        "dismiss",
        "Lpg3/v0;",
        "Ll83/a0;",
        "dismissTile",
        "(Lcom/whoop/home/domain/models/DismissTileRequest;Lq83/d;)Ljava/lang/Object;",
        "dismissBehaviorImpactTile",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;",
        "completeFeatureEducationBody",
        "completeFeatureEducation",
        "(Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;Lq83/d;)Ljava/lang/Object;",
        "id",
        "markAppNotificationAsExpired",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/home/domain/models/DismissAlertTileRequestBody;",
        "body",
        "dismissAlert",
        "(Lcom/whoop/home/domain/models/DismissAlertTileRequestBody;Lq83/d;)Ljava/lang/Object;",
        "home_release"
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
.method public abstract completeFeatureEducation(Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/home/domain/dayOneTransition/TransitionOverlayCompleteBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "onboarding-service/v1/feature-education-state"
    .end annotation
.end method

.method public abstract dismissAlert(Lcom/whoop/home/domain/models/DismissAlertTileRequestBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/home/domain/models/DismissAlertTileRequestBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/home/domain/models/DismissAlertTileRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "user-preferences-service/v1/components/dismissals"
    .end annotation
.end method

.method public abstract dismissBehaviorImpactTile(Lq83/d;)Ljava/lang/Object;
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
        value = "impact-service/v1/impact-tags"
    .end annotation
.end method

.method public abstract dismissTile(Lcom/whoop/home/domain/models/DismissTileRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/home/domain/models/DismissTileRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/home/domain/models/DismissTileRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "coaching-service/v1/tile-dismissal"
    .end annotation
.end method

.method public abstract getHomeCalendar(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "pillarType"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "date"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/home/domain/models/CalendarResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "home-service/v1/calendar/{pillarType}"
    .end annotation
.end method

.method public abstract markAppNotificationAsExpired(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "id"
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

    .annotation runtime Lwg3/p;
        value = "app-notifications-service/v1/app/notifications/{id}/expire"
    .end annotation
.end method
