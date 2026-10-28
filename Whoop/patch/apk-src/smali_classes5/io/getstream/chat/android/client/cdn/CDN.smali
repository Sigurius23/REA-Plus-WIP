.class public interface abstract Lio/getstream/chat/android/client/cdn/CDN;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0007\u0010\u0006\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0008\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/cdn/CDN;",
        "",
        "",
        "url",
        "Lio/getstream/chat/android/client/cdn/CDNRequest;",
        "imageRequest",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "fileRequest",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic fileRequest$suspendImpl(Lio/getstream/chat/android/client/cdn/CDN;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/cdn/CDN;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/cdn/CDNRequest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p0, Lio/getstream/chat/android/client/cdn/CDNRequest;

    const/4 p2, 0x0

    const/4 v0, 0x2

    invoke-direct {p0, p1, p2, v0, p2}, Lio/getstream/chat/android/client/cdn/CDNRequest;-><init>(Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method public static synthetic imageRequest$suspendImpl(Lio/getstream/chat/android/client/cdn/CDN;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/cdn/CDN;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/cdn/CDNRequest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p0, Lio/getstream/chat/android/client/cdn/CDNRequest;

    const/4 p2, 0x0

    const/4 v0, 0x2

    invoke-direct {p0, p1, p2, v0, p2}, Lio/getstream/chat/android/client/cdn/CDNRequest;-><init>(Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method


# virtual methods
.method public fileRequest(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/cdn/CDNRequest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/cdn/CDN;->fileRequest$suspendImpl(Lio/getstream/chat/android/client/cdn/CDN;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public imageRequest(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/cdn/CDNRequest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/cdn/CDN;->imageRequest$suspendImpl(Lio/getstream/chat/android/client/cdn/CDN;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
