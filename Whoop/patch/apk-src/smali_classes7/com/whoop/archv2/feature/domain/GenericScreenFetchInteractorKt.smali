.class public abstract Lcom/whoop/archv2/feature/domain/GenericScreenFetchInteractorKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lpi0/a;",
        "",
        "requestName",
        "Lcom/whoop/network/request/GetApiRequest;",
        "a",
        "(Lpi0/a;Ljava/lang/String;)Lcom/whoop/network/request/GetApiRequest;",
        "arch-v2_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lpi0/a;Ljava/lang/String;)Lcom/whoop/network/request/GetApiRequest;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lpi0/a;->a()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/navigation/models/ApiRequest;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La12/b;->e(Ljava/lang/String;)La12/a;

    move-result-object v0

    invoke-virtual {p0}, Lpi0/a;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "_manualRefresh"

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    new-instance v1, Lcom/whoop/archv2/feature/domain/GenericScreenFetchInteractorKt$toGetApiRequest$1;

    invoke-direct {v1, v0, p0, p1}, Lcom/whoop/archv2/feature/domain/GenericScreenFetchInteractorKt$toGetApiRequest$1;-><init>(La12/a;Lpi0/a;Ljava/lang/String;)V

    return-object v1
.end method
