.class public interface abstract Lcom/whoop/whoopstatus/domain/WhoopStatusService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/whoopstatus/domain/WhoopStatusService;",
        "",
        "Lcom/whoop/whoopstatus/domain/model/WhoopStatusResponse;",
        "getWhoopStatus",
        "(Lq83/d;)Ljava/lang/Object;",
        "whoop-status_release"
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
.method public abstract getWhoopStatus(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whoopstatus/domain/model/WhoopStatusResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "status-service/v1/status/maintenance"
    .end annotation
.end method
