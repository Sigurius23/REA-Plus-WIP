.class public final Lcom/whoop/domain/model/WhoopUriKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "asUri",
        "Landroid/net/Uri;",
        "Lcom/whoop/domain/model/WhoopUri;",
        "essentials_release"
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
.method public static final asUri(Lcom/whoop/domain/model/WhoopUri;)Landroid/net/Uri;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/domain/model/AndroidUri;

    invoke-virtual {p0}, Lcom/whoop/domain/model/AndroidUri;->getUri()Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method
