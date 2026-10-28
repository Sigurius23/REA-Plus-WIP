.class public interface abstract Lcom/whoop/metrics/domain/MetricsApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J4\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/metrics/domain/MetricsApi;",
        "",
        "",
        "sharedSecret",
        "metricPostType",
        "Lcom/whoop/metrics/domain/models/MetricsBody;",
        "metricsBody",
        "Lpg3/v0;",
        "Ll83/a0;",
        "postMetrics",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/metrics/domain/models/MetricsBody;Lq83/d;)Ljava/lang/Object;",
        "metrics_release"
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
.method public abstract postMetrics(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/metrics/domain/models/MetricsBody;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "Metric-Header-Key"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            value = "metricPostType"
        .end annotation
    .end param
    .param p3    # Lcom/whoop/metrics/domain/models/MetricsBody;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/metrics/domain/models/MetricsBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "mobile-metric-service/v1/statsd/{metricPostType}"
    .end annotation
.end method
