.class public final Lio/getstream/chat/android/client/token/CacheableTokenProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/token/TokenProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0008\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\u0008\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lio/getstream/chat/android/client/token/CacheableTokenProvider;",
        "Lio/getstream/chat/android/client/token/TokenProvider;",
        "tokenProvider",
        "<init>",
        "(Lio/getstream/chat/android/client/token/TokenProvider;)V",
        "cachedToken",
        "",
        "loadToken",
        "getCachedToken",
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
.field private volatile cachedToken:Ljava/lang/String;

.field private final tokenProvider:Lio/getstream/chat/android/client/token/TokenProvider;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/token/TokenProvider;)V
    .locals 1

    const-string v0, "tokenProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/token/CacheableTokenProvider;->tokenProvider:Lio/getstream/chat/android/client/token/TokenProvider;

    const-string p1, ""

    iput-object p1, p0, Lio/getstream/chat/android/client/token/CacheableTokenProvider;->cachedToken:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getCachedToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/token/CacheableTokenProvider;->cachedToken:Ljava/lang/String;

    return-object v0
.end method

.method public final loadToken()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/token/CacheableTokenProvider;->cachedToken:Ljava/lang/String;

    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lio/getstream/chat/android/client/token/CacheableTokenProvider;->cachedToken:Ljava/lang/String;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/client/token/CacheableTokenProvider;->tokenProvider:Lio/getstream/chat/android/client/token/TokenProvider;

    invoke-interface {v0}, Lio/getstream/chat/android/client/token/TokenProvider;->loadToken()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/client/token/CacheableTokenProvider;->cachedToken:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_1
    monitor-exit p0

    return-object v1

    :goto_2
    monitor-exit p0

    throw v0
.end method
