.class public interface abstract Lcom/whoop/homecustomization/domain/HomeCustomizationApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J \u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\u0004J&\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000e\u0008\u0001\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u00a7@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0004\u00a8\u0006\u0013\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/homecustomization/domain/HomeCustomizationApi;",
        "",
        "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;",
        "getCustomizeOverview",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;",
        "saveDomainBody",
        "Lpg3/v0;",
        "Ll83/a0;",
        "updateCustomizeOverviewPrefs",
        "(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;",
        "getHomeCustomizationLegacy",
        "",
        "",
        "keyStats",
        "saveKeyStats",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "setCustomizeOnboardingStateToFalse",
        "home-customization_release"
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
.method public abstract getCustomizeOverview(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "home-service/v2/home/dashboard/customize"
    .end annotation
.end method

.method public abstract getHomeCustomizationLegacy(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/homecustomization/domain/legacy/models/HomeCustomizationResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "home-service/v1/home/overview/customize/key_statistics"
    .end annotation
.end method

.method public abstract saveKeyStats(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/util/List;
        .annotation runtime Lwg3/a;
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

    .annotation runtime Lwg3/p;
        value = "users-service/v1/users/preferences/key_statistics"
    .end annotation
.end method

.method public abstract setCustomizeOnboardingStateToFalse(Lq83/d;)Ljava/lang/Object;
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
        value = "users-service/v1/users/preferences/key_statistics"
    .end annotation
.end method

.method public abstract updateCustomizeOverviewPrefs(Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/homecustomization/domain/models/CustomizeOverviewDomainBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "user-preferences-service/v1/home/dashboard/customize"
    .end annotation
.end method
