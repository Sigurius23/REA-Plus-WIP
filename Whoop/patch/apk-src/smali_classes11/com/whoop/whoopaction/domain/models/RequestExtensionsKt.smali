.class public final Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a%\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003*\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/whoop/whoopaction/domain/models/Request;",
        "",
        "requestName",
        "Lz02/a;",
        "toActionApiRequest",
        "(Lcom/whoop/whoopaction/domain/models/Request;Ljava/lang/String;)Lz02/a;",
        "whoop-action_release"
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
.method public static final toActionApiRequest(Lcom/whoop/whoopaction/domain/models/Request;Ljava/lang/String;)Lz02/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/Request;",
            "Ljava/lang/String;",
            ")",
            "Lz02/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/whoopaction/domain/models/Request;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, La12/b;->e(Ljava/lang/String;)La12/a;

    move-result-object v0

    new-instance v1, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1;

    invoke-direct {v1, v0, p0, p1}, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt$toActionApiRequest$1;-><init>(La12/a;Lcom/whoop/whoopaction/domain/models/Request;Ljava/lang/String;)V

    return-object v1
.end method

.method public static synthetic toActionApiRequest$default(Lcom/whoop/whoopaction/domain/models/Request;Ljava/lang/String;ILjava/lang/Object;)Lz02/a;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lcom/whoop/whoopaction/domain/models/RequestExtensionsKt;->toActionApiRequest(Lcom/whoop/whoopaction/domain/models/Request;Ljava/lang/String;)Lz02/a;

    move-result-object p0

    return-object p0
.end method
