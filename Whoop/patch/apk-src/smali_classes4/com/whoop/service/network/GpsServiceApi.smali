.class public interface abstract Lcom/whoop/service/network/GpsServiceApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/service/network/GpsServiceApi;",
        "",
        "Lcom/whoop/domain/model/RouteSummaryDto;",
        "routeSummaryDto",
        "Lxg3/g;",
        "Lpg3/v0;",
        "",
        "postGpsData",
        "(Lcom/whoop/domain/model/RouteSummaryDto;)Lxg3/g;",
        "core_release"
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
.method public abstract postGpsData(Lcom/whoop/domain/model/RouteSummaryDto;)Lxg3/g;
    .param p1    # Lcom/whoop/domain/model/RouteSummaryDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/domain/model/RouteSummaryDto;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "gps-service/v1/gps"
    .end annotation
.end method
