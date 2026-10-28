.class public interface abstract Lio/getstream/chat/android/client/token/TokenManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\u0008\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0008\u0010\u0004J\u000f\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000cH&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0010\u0010\u0007J\u000f\u0010\u0011\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u0011\u0010\u000b\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0012\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/token/TokenManager;",
        "",
        "Ll83/a0;",
        "ensureTokenLoaded",
        "()V",
        "",
        "loadSync",
        "()Ljava/lang/String;",
        "expireToken",
        "",
        "hasTokenProvider",
        "()Z",
        "Lio/getstream/chat/android/client/token/CacheableTokenProvider;",
        "provider",
        "setTokenProvider",
        "(Lio/getstream/chat/android/client/token/CacheableTokenProvider;)V",
        "getToken",
        "hasToken",
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


# virtual methods
.method public abstract ensureTokenLoaded()V
.end method

.method public abstract expireToken()V
.end method

.method public abstract getToken()Ljava/lang/String;
.end method

.method public abstract hasToken()Z
.end method

.method public abstract hasTokenProvider()Z
.end method

.method public abstract loadSync()Ljava/lang/String;
.end method

.method public abstract setTokenProvider(Lio/getstream/chat/android/client/token/CacheableTokenProvider;)V
.end method
