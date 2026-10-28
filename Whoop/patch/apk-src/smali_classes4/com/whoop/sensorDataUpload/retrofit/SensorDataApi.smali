.class public interface abstract Lcom/whoop/sensorDataUpload/retrofit/SensorDataApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J`\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0001\u0010\t\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0001\u0010\u000c\u001a\u00020\nH\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/sensorDataUpload/retrofit/SensorDataApi;",
        "",
        "Lud3/v0;",
        "body",
        "",
        "encoding",
        "hardwareVersion",
        "firmwareVersion",
        "sigProcVersion",
        "strapId",
        "",
        "binaryVersion",
        "binaryFlags",
        "Lcom/whoop/domain/model/MetricsProcessedTime;",
        "uploadMetricsData",
        "(Lud3/v0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;",
        "sensor-data-upload_release"
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
.method public abstract uploadMetricsData(Lud3/v0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;
    .param p1    # Lud3/v0;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "Content-Encoding"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-HW-Version"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-FW-Version"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-DSP-Version"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Strap-Id"
        .end annotation
    .end param
    .param p7    # I
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Binary-Version"
        .end annotation
    .end param
    .param p8    # I
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Binary-Flags"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lud3/v0;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lq83/d<",
            "-",
            "Lcom/whoop/domain/model/MetricsProcessedTime;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "metrics-service/v1/metrics"
    .end annotation
.end method
