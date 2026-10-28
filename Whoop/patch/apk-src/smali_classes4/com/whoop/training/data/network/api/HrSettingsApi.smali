.class public interface abstract Lcom/whoop/training/data/network/api/HrSettingsApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0006\u001a\u00020\nH\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/training/data/network/api/HrSettingsApi;",
        "",
        "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;",
        "fetchHrSettings",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/training/data/network/request/maxhr/MaxHrRequest;",
        "body",
        "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsZonesResponse;",
        "updateMaxHr",
        "(Lcom/whoop/training/data/network/request/maxhr/MaxHrRequest;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/training/data/network/request/hrsettings/CustomHrZonesRequest;",
        "postCustomZones",
        "(Lcom/whoop/training/data/network/request/hrsettings/CustomHrZonesRequest;Lq83/d;)Ljava/lang/Object;",
        "training_release"
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
.method public abstract fetchHrSettings(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "hr-zones-service/v1/bff/settings"
    .end annotation
.end method

.method public abstract postCustomZones(Lcom/whoop/training/data/network/request/hrsettings/CustomHrZonesRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/training/data/network/request/hrsettings/CustomHrZonesRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/training/data/network/request/hrsettings/CustomHrZonesRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsZonesResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "hr-zones-service/v1/bff/custom"
    .end annotation
.end method

.method public abstract updateMaxHr(Lcom/whoop/training/data/network/request/maxhr/MaxHrRequest;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/training/data/network/request/maxhr/MaxHrRequest;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/training/data/network/request/maxhr/MaxHrRequest;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/training/data/network/response/hrsettings/HrSettingsZonesResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "hr-zones-service/v1/maxhr"
    .end annotation
.end method
