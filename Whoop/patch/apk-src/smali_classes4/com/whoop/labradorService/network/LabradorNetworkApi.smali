.class public interface abstract Lcom/whoop/labradorService/network/LabradorNetworkApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008`\u0018\u00002\u00020\u0001J\\\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0001\u0010\n\u001a\u00020\t2\u0008\u0008\u0001\u0010\u000b\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/labradorService/network/LabradorNetworkApi;",
        "",
        "Lud3/v0;",
        "body",
        "",
        "encoding",
        "strapId",
        "hardwareVersion",
        "firmwareVersion",
        "",
        "binaryVersion",
        "contentLength",
        "Lpg3/v0;",
        "Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;",
        "uploadEcgData",
        "(Lud3/v0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "labrador-service_release"
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
.method public abstract uploadEcgData(Lud3/v0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;
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
            value = "X-WHOOP-Strap-Id"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-HW-Version"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-FW-Version"
        .end annotation
    .end param
    .param p6    # I
        .annotation runtime Lwg3/i;
            value = "X-WHOOP-Binary-Version"
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Lwg3/i;
            value = "Content-Length"
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
            "I",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "ecg-service/v1/ecg/metric/mobile"
    .end annotation
.end method
