.class public interface abstract Lcom/whoop/tombstone/TombstoneApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J$\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\t\u001a\u00020\u00042\u0008\u0008\u0003\u0010\n\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/tombstone/TombstoneApi;",
        "",
        "",
        "releaseName",
        "",
        "versionCode",
        "Lcom/whoop/tombstone/ReleaseTombstoneResponse;",
        "isVersionValid",
        "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "offset",
        "limit",
        "Lcom/whoop/tombstone/PaginatedReleaseTombstoneResponse;",
        "getVersions",
        "(IILq83/d;)Ljava/lang/Object;",
        "tombstone_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lcom/whoop/tombstone/TombstoneApi;IILq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/16 p2, 0x32

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lcom/whoop/tombstone/TombstoneApi;->getVersions(IILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: getVersions"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract getVersions(IILq83/d;)Ljava/lang/Object;
    .param p1    # I
        .annotation runtime Lwg3/t;
            value = "offset"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/t;
            value = "limit"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lq83/d<",
            "-",
            "Lcom/whoop/tombstone/PaginatedReleaseTombstoneResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "tombstone-service/v1/mobile/release"
    .end annotation
.end method

.method public abstract isVersionValid(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation runtime Lwg3/s;
            encoded = false
            value = "releaseName"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lwg3/s;
            value = "versionCode"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Lcom/whoop/tombstone/ReleaseTombstoneResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "tombstone-service/v1/mobile/release/{releaseName}/version/{versionCode}"
    .end annotation
.end method
