.class public interface abstract Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001a\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0016\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u0005J6\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00022\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u000c2\u0014\u0008\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH\u00a7@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0014\u0010\u0005J\u001a\u0010\u0017\u001a\u00020\u00102\u0008\u0008\u0001\u0010\u0016\u001a\u00020\u0015H\u00a7@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;",
        "",
        "Lpg3/v0;",
        "Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;",
        "getSmartAlarmUserInfoResponseAlarmService",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;",
        "body",
        "postSmartAlarmUserInfoAlarmService",
        "(Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;",
        "pollSmartAlarmTriggerAlarmService",
        "Lud3/v0;",
        "",
        "",
        "headers",
        "Ll83/a0;",
        "sendSmartAlarmDiagnosticAlarmService",
        "(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;",
        "getDefaultWakeWindow",
        "Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;",
        "latestWakeTimeDto",
        "putNewStrapLatestWakeTime",
        "(Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;Lq83/d;)Ljava/lang/Object;",
        "smart-alarm_release"
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
.method public abstract getDefaultWakeWindow(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "smart-alarm-service/v1/user-info/default-wake-window"
    .end annotation
.end method

.method public abstract getSmartAlarmUserInfoResponseAlarmService(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "smart-alarm-service/v1/smartalarm/preferences"
    .end annotation
.end method

.method public abstract pollSmartAlarmTriggerAlarmService(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "smart-alarm-service/v1/smartalarm/poll"
    .end annotation
.end method

.method public abstract postSmartAlarmUserInfoAlarmService(Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "smart-alarm-service/v1/smartalarm/preferences"
    .end annotation
.end method

.method public abstract putNewStrapLatestWakeTime(Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/p;
        value = "smart-alarm-service/v1/strap-status"
    .end annotation
.end method

.method public abstract sendSmartAlarmDiagnosticAlarmService(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lud3/v0;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation runtime Lwg3/j;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lud3/v0;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
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

    .annotation runtime Lwg3/o;
        value = "smart-alarm-service/v1/smartalarm/wbl"
    .end annotation
.end method
