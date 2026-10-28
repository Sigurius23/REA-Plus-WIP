.class public final Lio/getstream/chat/android/client/token/TokenManagerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/token/TokenManager;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/token/TokenManagerImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0008J\u000f\u0010\u0011\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0003R\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00158\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/chat/android/client/token/TokenManagerImpl;",
        "Lio/getstream/chat/android/client/token/TokenManager;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "ensureTokenLoaded",
        "",
        "loadSync",
        "()Ljava/lang/String;",
        "Lio/getstream/chat/android/client/token/CacheableTokenProvider;",
        "provider",
        "setTokenProvider",
        "(Lio/getstream/chat/android/client/token/CacheableTokenProvider;)V",
        "",
        "hasTokenProvider",
        "()Z",
        "getToken",
        "hasToken",
        "expireToken",
        "token",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/client/token/TokenProvider;",
        "Lio/getstream/chat/android/client/token/TokenProvider;",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/client/token/TokenManagerImpl$Companion;

.field public static final EMPTY_TOKEN:Ljava/lang/String; = ""


# instance fields
.field private provider:Lio/getstream/chat/android/client/token/TokenProvider;

.field private volatile token:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/token/TokenManagerImpl$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/token/TokenManagerImpl;->Companion:Lio/getstream/chat/android/client/token/TokenManagerImpl$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lio/getstream/chat/android/client/token/TokenManagerImpl;->token:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ensureTokenLoaded()V
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/client/token/TokenManagerImpl;->hasToken()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/client/token/TokenManagerImpl;->loadSync()Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public final expireToken()V
    .locals 1

    const-string v0, ""

    iput-object v0, p0, Lio/getstream/chat/android/client/token/TokenManagerImpl;->token:Ljava/lang/String;

    return-void
.end method

.method public final getToken()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/token/TokenManagerImpl;->token:Ljava/lang/String;

    return-object v0
.end method

.method public final hasToken()Z
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/token/TokenManagerImpl;->token:Ljava/lang/String;

    const-string v1, ""

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final hasTokenProvider()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/token/TokenManagerImpl;->provider:Lio/getstream/chat/android/client/token/TokenProvider;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final loadSync()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/token/TokenManagerImpl;->provider:Lio/getstream/chat/android/client/token/TokenProvider;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/getstream/chat/android/client/token/TokenProvider;->loadToken()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/token/TokenManagerImpl;->token:Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, "provider"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final setTokenProvider(Lio/getstream/chat/android/client/token/CacheableTokenProvider;)V
    .locals 1

    const-string v0, "provider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/token/TokenManagerImpl;->provider:Lio/getstream/chat/android/client/token/TokenProvider;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/token/CacheableTokenProvider;->getCachedToken()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/token/TokenManagerImpl;->token:Ljava/lang/String;

    return-void
.end method
