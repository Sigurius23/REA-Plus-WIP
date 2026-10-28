.class public interface abstract Lcom/whoop/firmwareUpdateService/data/api/OtaFirmwareUpdateApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J*\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0001\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ$\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0006\u001a\u00020\nH\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ6\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u000e2\n\u0008\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/firmwareUpdateService/data/api/OtaFirmwareUpdateApi;",
        "",
        "",
        "deviceName",
        "",
        "Lcom/whoop/firmwareUpdateService/data/models/ChipFirmwareVersion;",
        "body",
        "Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareConfig;",
        "getDesiredDeviceFirmwareConfig",
        "(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/firmwareUpdateService/data/models/DownloadFwFilePayload;",
        "Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareUpdate;",
        "downloadFirmwareUpdate",
        "(Ljava/lang/String;Lcom/whoop/firmwareUpdateService/data/models/DownloadFwFilePayload;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/firmwareUpdateService/data/models/ReportFwUpdateResultPayload;",
        "auxiliaryDeviceId",
        "Lpg3/v0;",
        "Ll83/a0;",
        "reportFirmwareUpdateResult",
        "(Ljava/lang/String;Lcom/whoop/firmwareUpdateService/data/models/ReportFwUpdateResultPayload;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "firmware-update-service_release"
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
.method public abstract downloadFirmwareUpdate(Ljava/lang/String;Lcom/whoop/firmwareUpdateService/data/models/DownloadFwFilePayload;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "deviceName"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/firmwareUpdateService/data/models/DownloadFwFilePayload;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/firmwareUpdateService/data/models/DownloadFwFilePayload;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareUpdate;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "firmware-service/v4/firmware/version"
    .end annotation
.end method

.method public abstract getDesiredDeviceFirmwareConfig(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "deviceName"
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/firmwareUpdateService/data/models/ChipFirmwareVersion;",
            ">;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareConfig;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "firmware-service/v4/firmware/check"
    .end annotation
.end method

.method public abstract reportFirmwareUpdateResult(Ljava/lang/String;Lcom/whoop/firmwareUpdateService/data/models/ReportFwUpdateResultPayload;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/t;
            value = "deviceName"
        .end annotation
    .end param
    .param p2    # Lcom/whoop/firmwareUpdateService/data/models/ReportFwUpdateResultPayload;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Auxiliary-Device-Id"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/firmwareUpdateService/data/models/ReportFwUpdateResultPayload;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "firmware-service/v4/firmware/result"
    .end annotation
.end method
