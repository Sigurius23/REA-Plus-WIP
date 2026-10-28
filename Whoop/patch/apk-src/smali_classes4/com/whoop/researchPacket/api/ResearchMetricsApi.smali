.class public interface abstract Lcom/whoop/researchPacket/api/ResearchMetricsApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0007\u0008f\u0018\u00002\u00020\u0001Jf\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0001\u0010\t\u001a\u00020\u00042\u0008\u0008\u0001\u0010\n\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ6\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0010H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J6\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0010H\u00a7@\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J6\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0010H\u00a7@\u00a2\u0006\u0004\u0008\u0015\u0010\u0013J6\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0010H\u00a7@\u00a2\u0006\u0004\u0008\u0016\u0010\u0013\u00a8\u0006\u0017\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/researchPacket/api/ResearchMetricsApi;",
        "",
        "Lud3/v0;",
        "body",
        "",
        "type",
        "encoding",
        "firmwareVersion",
        "binaryVersion",
        "sigProcVersion",
        "binaryFlags",
        "hardwareVersion",
        "Lpg3/v0;",
        "Ll83/a0;",
        "uploadResearchPackets",
        "(Lud3/v0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "headers",
        "uploadR20RawData",
        "(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;",
        "uploadR21RawData",
        "uploadRev2RawData",
        "uploadDataSettings",
        "research-packet_release"
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
.method public abstract uploadDataSettings(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
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
        value = "research-metrics-service/v1/data-settings/upload"
    .end annotation
.end method

.method public abstract uploadR20RawData(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
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
        value = "research-metrics-service/v1/optical/upload"
    .end annotation
.end method

.method public abstract uploadR21RawData(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
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
        value = "research-metrics-service/v1/imu/upload"
    .end annotation
.end method

.method public abstract uploadResearchPackets(Lud3/v0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lud3/v0;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "Content-Type"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "Content-Encoding"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-FW-Version"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Binary-Version"
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-DSP-Version"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Binary-Flags"
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-HW-Version"
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
            "Ljava/lang/String;",
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
        value = "research-metrics-service/v1/research/upload"
    .end annotation
.end method

.method public abstract uploadRev2RawData(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
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
        value = "research-metrics-service/v1/raw/upload"
    .end annotation
.end method
