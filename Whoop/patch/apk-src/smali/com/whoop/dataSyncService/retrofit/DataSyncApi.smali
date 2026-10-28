.class public interface abstract Lcom/whoop/dataSyncService/retrofit/DataSyncApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J6\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00022\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00062\u0014\u0008\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0008H\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/dataSyncService/retrofit/DataSyncApi;",
        "",
        "Lpg3/v0;",
        "Lcom/whoop/domain/model/MetricsProcessedTime;",
        "getMinHighWaterMark",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lud3/v0;",
        "body",
        "",
        "",
        "headers",
        "Ll83/a0;",
        "uploadRawData",
        "(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;",
        "data-sync-service_release"
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
.method public abstract getMinHighWaterMark(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/domain/model/MetricsProcessedTime;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "metrics-service/v1/consumerstats/mobile/highwatermark/min"
    .end annotation
.end method

.method public abstract uploadRawData(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
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
        value = "metrics-service/v1/metrics/sensor"
    .end annotation
.end method
