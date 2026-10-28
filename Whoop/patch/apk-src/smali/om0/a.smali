.class public abstract Lom0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/cache/api/prefetch/PrefetchEntry;",
        "Lcom/whoop/cache/api/prefetch/PrefetchList;",
        "a",
        "(Lcom/whoop/cache/api/prefetch/PrefetchEntry;)Lcom/whoop/cache/api/prefetch/PrefetchList;",
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
.method public static final a(Lcom/whoop/cache/api/prefetch/PrefetchEntry;)Lcom/whoop/cache/api/prefetch/PrefetchList;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/cache/api/prefetch/PrefetchList;

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/whoop/cache/api/prefetch/PrefetchList;-><init>(Ljava/util/List;)V

    return-object v0
.end method
