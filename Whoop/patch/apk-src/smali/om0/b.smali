.class public abstract Lom0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/cache/api/prefetch/PrefetchEntry;",
        "Lcom/whoop/network/request/GetApiRequest;",
        "a",
        "(Lcom/whoop/cache/api/prefetch/PrefetchEntry;)Lcom/whoop/network/request/GetApiRequest;",
        "cache_release"
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
.method public static final a(Lcom/whoop/cache/api/prefetch/PrefetchEntry;)Lcom/whoop/network/request/GetApiRequest;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/cache/api/prefetch/PrefetchEntry;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La12/b;->e(Ljava/lang/String;)La12/a;

    move-result-object p0

    new-instance v0, Lcom/whoop/cache/api/prefetch/PrefetchRequest;

    invoke-virtual {p0}, La12/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, La12/a;->b()Ljava/util/Map;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lcom/whoop/cache/api/prefetch/PrefetchRequest;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method
