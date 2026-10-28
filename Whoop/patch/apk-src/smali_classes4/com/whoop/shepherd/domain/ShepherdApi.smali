.class public interface abstract Lcom/whoop/shepherd/domain/ShepherdApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\n\u001a\u00020\tH\u00a7@\u00a2\u0006\u0004\u0008\n\u0010\u0004J\u001a\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tH\u00a7@\u00a2\u0006\u0004\u0008\u0010\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\t2\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0013H\u00a7@\u00a2\u0006\u0004\u0008\u0014\u0010\u0004J\u001a\u0010\u0016\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0015H\u00a7@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\t2\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0015H\u00a7@\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0019H\u00a7@\u00a2\u0006\u0004\u0008\u001a\u0010\u0004J \u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c2\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u001bH\u00a7@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020 2\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008!\u0010\u000fJ\u0010\u0010#\u001a\u00020\"H\u00a7@\u00a2\u0006\u0004\u0008#\u0010\u0004J\u0010\u0010%\u001a\u00020$H\u00a7@\u00a2\u0006\u0004\u0008%\u0010\u0004\u00a8\u0006&\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/shepherd/domain/ShepherdApi;",
        "",
        "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;",
        "getShepherdToggleSettings",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsUpdateRequest;",
        "body",
        "updateShepherdToggleSettings",
        "(Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsUpdateRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;",
        "getShepherdNotificationHistory",
        "",
        "nextToken",
        "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;",
        "getShepherdHistory",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "clearAllHistory",
        "historyDate",
        "clearHistoryByDate",
        "Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;",
        "getTermsOfUseScreen",
        "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;",
        "updateShepherdSettings",
        "(Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;Lq83/d;)Ljava/lang/Object;",
        "updateShepherdSettingsLegacy",
        "Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;",
        "getWelcomeScreen",
        "Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;",
        "Lpg3/v0;",
        "Ll83/a0;",
        "saveTermsOfUse",
        "(Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;",
        "getShepherdHistoryDetail",
        "Lcom/whoop/shepherd/feature/registration/domain/models/ShepherdRegistrationResponse;",
        "getShepherdRegistrationScreen",
        "Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;",
        "getShepherdAboutScreen",
        "shepherd_release"
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
.method public abstract clearAllHistory(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "arrhythmia-service/v2/afibhistory/all"
    .end annotation
.end method

.method public abstract clearHistoryByDate(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "historyDate"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/b;
        value = "arrhythmia-service/v2/afibhistory/date"
    .end annotation
.end method

.method public abstract getShepherdAboutScreen(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/shepherd/feature/about/domain/models/ShepherdAboutResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "arrhythmia-service/v1/about"
    .end annotation
.end method

.method public abstract getShepherdHistory(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "next_token"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdPaginatedHistoryResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "arrhythmia-service/v2/afibhistory/paginated"
    .end annotation
.end method

.method public abstract getShepherdHistoryDetail(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "historyDate"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/shepherd/feature/detail/domain/models/ShepherdHistoryDetailResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "arrhythmia-service/v1/history/bff"
    .end annotation
.end method

.method public abstract getShepherdNotificationHistory(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "arrhythmia-service/v2/afibhistory/screen"
    .end annotation
.end method

.method public abstract getShepherdRegistrationScreen(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/shepherd/feature/registration/domain/models/ShepherdRegistrationResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "arrhythmia-service/v1/regulatory"
    .end annotation
.end method

.method public abstract getShepherdToggleSettings(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "arrhythmia-service/v2/settings"
    .end annotation
.end method

.method public abstract getTermsOfUseScreen(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "arrhythmia-service/v2/termsofuse"
    .end annotation
.end method

.method public abstract getWelcomeScreen(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/shepherd/feature/welcome/domain/models/ShepherdWelcomeScreenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "arrhythmia-service/v1/welcome/bff"
    .end annotation
.end method

.method public abstract saveTermsOfUse(Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/shepherd/feature/terms/domain/models/ShepherdTermsOfUseRequest;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "arrhythmia-service/v1/termsofuse"
    .end annotation
.end method

.method public abstract updateShepherdSettings(Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "arrhythmia-service/v2/settings"
    .end annotation
.end method

.method public abstract updateShepherdSettingsLegacy(Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdSettingsUpdateRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "arrhythmia-service/v2/settings"
    .end annotation
.end method

.method public abstract updateShepherdToggleSettings(Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsUpdateRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsUpdateRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsUpdateRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "arrhythmia-service/v2/settings"
    .end annotation
.end method
