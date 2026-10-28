.class public final Lio/getstream/chat/android/client/cdn/internal/CDNDataSourceFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz8/e;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/client/cdn/internal/CDNDataSourceFactory;",
        "Lz8/e;",
        "Lio/getstream/chat/android/client/cdn/CDN;",
        "cdn",
        "upstreamFactory",
        "<init>",
        "(Lio/getstream/chat/android/client/cdn/CDN;Lz8/e;)V",
        "Lz8/f;",
        "createDataSource",
        "()Lz8/f;",
        "Lio/getstream/chat/android/client/cdn/CDN;",
        "Lz8/e;",
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


# instance fields
.field private final cdn:Lio/getstream/chat/android/client/cdn/CDN;

.field private final upstreamFactory:Lz8/e;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/cdn/CDN;Lz8/e;)V
    .locals 1

    const-string v0, "cdn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upstreamFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/cdn/internal/CDNDataSourceFactory;->cdn:Lio/getstream/chat/android/client/cdn/CDN;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/cdn/internal/CDNDataSourceFactory;->upstreamFactory:Lz8/e;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/cdn/CDN;Lz8/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    new-instance p2, Lce3/a0;

    const/4 p3, 0x3

    invoke-direct {p2, p3}, Lce3/a0;-><init>(I)V

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/cdn/internal/CDNDataSourceFactory;-><init>(Lio/getstream/chat/android/client/cdn/CDN;Lz8/e;)V

    return-void
.end method


# virtual methods
.method public final createDataSource()Lz8/f;
    .locals 3

    new-instance v0, Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;

    iget-object v1, p0, Lio/getstream/chat/android/client/cdn/internal/CDNDataSourceFactory;->cdn:Lio/getstream/chat/android/client/cdn/CDN;

    iget-object v2, p0, Lio/getstream/chat/android/client/cdn/internal/CDNDataSourceFactory;->upstreamFactory:Lz8/e;

    invoke-interface {v2}, Lz8/e;->createDataSource()Lz8/f;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/client/cdn/internal/CDNDataSource;-><init>(Lio/getstream/chat/android/client/cdn/CDN;Lz8/f;)V

    return-object v0
.end method
