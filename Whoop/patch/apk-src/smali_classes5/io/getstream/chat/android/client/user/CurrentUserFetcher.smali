.class public final Lio/getstream/chat/android/client/user/CurrentUserFetcher;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/user/CurrentUserFetcher$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001b\u0010\u000c\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ(\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0012*\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001e\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0019\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006&"
    }
    d2 = {
        "Lio/getstream/chat/android/client/user/CurrentUserFetcher;",
        "",
        "Lio/getstream/chat/android/client/network/NetworkStateProvider;",
        "networkStateProvider",
        "Lio/getstream/chat/android/client/socket/SocketFactory;",
        "socketFactory",
        "Lio/getstream/chat/android/client/api/ChatApiConfig;",
        "config",
        "<init>",
        "(Lio/getstream/chat/android/client/network/NetworkStateProvider;Lio/getstream/chat/android/client/socket/SocketFactory;Lio/getstream/chat/android/client/api/ChatApiConfig;)V",
        "Lio/getstream/chat/android/models/User;",
        "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;",
        "toConnectionConf",
        "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/api/ChatApiConfig;)Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;",
        "Lec3/l;",
        "Lio/getstream/chat/android/client/socket/StreamWebSocketEvent;",
        "",
        "timeMillis",
        "Ln23/h;",
        "firstUserWithTimeout",
        "(Lec3/l;JLq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/errors/ChatErrorCode;",
        "Ln23/c;",
        "toNetworkError",
        "(Lio/getstream/chat/android/client/errors/ChatErrorCode;)Ln23/c;",
        "currentUser",
        "fetch",
        "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/network/NetworkStateProvider;",
        "Lio/getstream/chat/android/client/socket/SocketFactory;",
        "Lio/getstream/chat/android/client/api/ChatApiConfig;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
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
.field private static final Companion:Lio/getstream/chat/android/client/user/CurrentUserFetcher$Companion;

.field private static final TIMEOUT_MS:J = 0x3a98L


# instance fields
.field private final config:Lio/getstream/chat/android/client/api/ChatApiConfig;

.field private final logger$delegate:Ll83/h;

.field private final networkStateProvider:Lio/getstream/chat/android/client/network/NetworkStateProvider;

.field private final socketFactory:Lio/getstream/chat/android/client/socket/SocketFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/user/CurrentUserFetcher$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/user/CurrentUserFetcher;->Companion:Lio/getstream/chat/android/client/user/CurrentUserFetcher$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/network/NetworkStateProvider;Lio/getstream/chat/android/client/socket/SocketFactory;Lio/getstream/chat/android/client/api/ChatApiConfig;)V
    .locals 1

    const-string v0, "networkStateProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "socketFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/user/CurrentUserFetcher;->networkStateProvider:Lio/getstream/chat/android/client/network/NetworkStateProvider;

    iput-object p2, p0, Lio/getstream/chat/android/client/user/CurrentUserFetcher;->socketFactory:Lio/getstream/chat/android/client/socket/SocketFactory;

    iput-object p3, p0, Lio/getstream/chat/android/client/user/CurrentUserFetcher;->config:Lio/getstream/chat/android/client/api/ChatApiConfig;

    const-string p1, "Chat:CurrentUserFetcher"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/user/CurrentUserFetcher;->logger$delegate:Ll83/h;

    return-void
.end method

.method public static final synthetic access$firstUserWithTimeout(Lio/getstream/chat/android/client/user/CurrentUserFetcher;Lec3/l;JLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/user/CurrentUserFetcher;->firstUserWithTimeout(Lec3/l;JLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final firstUserWithTimeout(Lec3/l;JLq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "J",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lio/getstream/chat/android/client/user/CurrentUserFetcher$firstUserWithTimeout$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lio/getstream/chat/android/client/user/CurrentUserFetcher$firstUserWithTimeout$1;

    iget v1, v0, Lio/getstream/chat/android/client/user/CurrentUserFetcher$firstUserWithTimeout$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/user/CurrentUserFetcher$firstUserWithTimeout$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/user/CurrentUserFetcher$firstUserWithTimeout$1;

    invoke-direct {v0, p0, p4}, Lio/getstream/chat/android/client/user/CurrentUserFetcher$firstUserWithTimeout$1;-><init>(Lio/getstream/chat/android/client/user/CurrentUserFetcher;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lio/getstream/chat/android/client/user/CurrentUserFetcher$firstUserWithTimeout$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/user/CurrentUserFetcher$firstUserWithTimeout$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/user/CurrentUserFetcher$firstUserWithTimeout$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lec3/l;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p4, Lio/getstream/chat/android/client/user/CurrentUserFetcher$firstUserWithTimeout$2;

    const/4 v2, 0x0

    invoke-direct {p4, p1, v2}, Lio/getstream/chat/android/client/user/CurrentUserFetcher$firstUserWithTimeout$2;-><init>(Lec3/l;Lq83/d;)V

    iput-object v2, v0, Lio/getstream/chat/android/client/user/CurrentUserFetcher$firstUserWithTimeout$1;->L$0:Ljava/lang/Object;

    iput-wide p2, v0, Lio/getstream/chat/android/client/user/CurrentUserFetcher$firstUserWithTimeout$1;->J$0:J

    iput v3, v0, Lio/getstream/chat/android/client/user/CurrentUserFetcher$firstUserWithTimeout$1;->label:I

    invoke-static {p2, p3, p4, v0}, Lbc3/k2;->d(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Ln23/h;

    if-nez p4, :cond_4

    new-instance p1, Ln23/f;

    new-instance p2, Ln23/a;

    const-string p3, "Timeout while fetching current user"

    invoke-direct {p2, p3}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_4
    return-object p4
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/user/CurrentUserFetcher;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final toConnectionConf(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/api/ChatApiConfig;)Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;
    .locals 2

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/ChatApiConfig;->isAnonymous()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$AnonymousConnectionConf;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/ChatApiConfig;->getWssUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/ChatApiConfig;->getApiKey()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, v1, p2, p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$AnonymousConnectionConf;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;)V

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    new-instance v0, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$UserConnectionConf;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/ChatApiConfig;->getWssUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/ChatApiConfig;->getApiKey()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, v1, p2, p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$UserConnectionConf;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;)V

    :goto_0
    invoke-virtual {v0}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->asReconnectionConf$stream_chat_android_client_release()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    return-object v0

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final toNetworkError(Lio/getstream/chat/android/client/errors/ChatErrorCode;)Ln23/c;
    .locals 4

    new-instance v0, Ln23/c;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/errors/ChatErrorCode;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/errors/ChatErrorCode;->getCode()I

    move-result p1

    const/4 v2, 0x0

    const/16 v3, 0xc

    invoke-direct {v0, v1, p1, v2, v3}, Ln23/c;-><init>(Ljava/lang/String;III)V

    return-object v0
.end method


# virtual methods
.method public final fetch(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "[fetch] failed: "

    const-string v1, "[fetch] completed: "

    instance-of v2, p2, Lio/getstream/chat/android/client/user/CurrentUserFetcher$fetch$1;

    if-eqz v2, :cond_0

    move-object v2, p2

    check-cast v2, Lio/getstream/chat/android/client/user/CurrentUserFetcher$fetch$1;

    iget v3, v2, Lio/getstream/chat/android/client/user/CurrentUserFetcher$fetch$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/user/CurrentUserFetcher$fetch$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/user/CurrentUserFetcher$fetch$1;

    invoke-direct {v2, p0, p2}, Lio/getstream/chat/android/client/user/CurrentUserFetcher$fetch$1;-><init>(Lio/getstream/chat/android/client/user/CurrentUserFetcher;Lq83/d;)V

    :goto_0
    iget-object p2, v2, Lio/getstream/chat/android/client/user/CurrentUserFetcher$fetch$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/user/CurrentUserFetcher$fetch$1;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object p1, v2, Lio/getstream/chat/android/client/user/CurrentUserFetcher$fetch$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/socket/StreamWebSocket;

    iget-object v2, v2, Lio/getstream/chat/android/client/user/CurrentUserFetcher$fetch$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/User;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception p2

    goto/16 :goto_4

    :catch_0
    move-exception p2

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/user/CurrentUserFetcher;->getLogger()Lb23/k;

    move-result-object p2

    invoke-virtual {p2}, Lb23/k;->c()Lb23/e;

    move-result-object v4

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-virtual {p2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v6, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p2}, Lb23/k;->a()Lb23/j;

    move-result-object v4

    invoke-virtual {p2}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p2

    const-string v7, "[fetch] no args"

    invoke-static {v4, v6, p2, v7}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    iget-object p2, p0, Lio/getstream/chat/android/client/user/CurrentUserFetcher;->networkStateProvider:Lio/getstream/chat/android/client/network/NetworkStateProvider;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->isConnected()Z

    move-result p2

    if-nez p2, :cond_5

    invoke-direct {p0}, Lio/getstream/chat/android/client/user/CurrentUserFetcher;->getLogger()Lb23/k;

    move-result-object p1

    invoke-virtual {p1}, Lb23/k;->c()Lb23/e;

    move-result-object p2

    sget-object v0, Lb23/g;->E:Lb23/g;

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Lb23/k;->a()Lb23/j;

    move-result-object p2

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p1

    const-string v1, "[fetch] rejected (no internet connection)"

    invoke-static {p2, v0, p1, v1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    new-instance p1, Ln23/f;

    sget-object p2, Lio/getstream/chat/android/client/errors/ChatErrorCode;->NETWORK_FAILED:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/user/CurrentUserFetcher;->toNetworkError(Lio/getstream/chat/android/client/errors/ChatErrorCode;)Ln23/c;

    move-result-object p2

    invoke-direct {p1, p2}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_5
    const/4 p2, 0x0

    :try_start_1
    iget-object v4, p0, Lio/getstream/chat/android/client/user/CurrentUserFetcher;->socketFactory:Lio/getstream/chat/android/client/socket/SocketFactory;

    iget-object v6, p0, Lio/getstream/chat/android/client/user/CurrentUserFetcher;->config:Lio/getstream/chat/android/client/api/ChatApiConfig;

    invoke-direct {p0, p1, v6}, Lio/getstream/chat/android/client/user/CurrentUserFetcher;->toConnectionConf(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/api/ChatApiConfig;)Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    move-result-object p1

    invoke-virtual {v4, p1}, Lio/getstream/chat/android/client/socket/SocketFactory;->createSocket(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Lio/getstream/chat/android/client/socket/StreamWebSocket;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/StreamWebSocket;->listen()Lec3/l;

    move-result-object v4

    iput-object p2, v2, Lio/getstream/chat/android/client/user/CurrentUserFetcher$fetch$1;->L$0:Ljava/lang/Object;

    iput-object p1, v2, Lio/getstream/chat/android/client/user/CurrentUserFetcher$fetch$1;->L$1:Ljava/lang/Object;

    iput v5, v2, Lio/getstream/chat/android/client/user/CurrentUserFetcher$fetch$1;->label:I

    const-wide/16 v5, 0x3a98

    invoke-direct {p0, v4, v5, v6, v2}, Lio/getstream/chat/android/client/user/CurrentUserFetcher;->firstUserWithTimeout(Lec3/l;JLq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v3, :cond_6

    return-object v3

    :cond_6
    :goto_1
    move-object v2, p2

    check-cast v2, Ln23/h;

    invoke-direct {p0}, Lio/getstream/chat/android/client/user/CurrentUserFetcher;->getLogger()Lb23/k;

    move-result-object v3

    invoke-virtual {v3}, Lb23/k;->c()Lb23/e;

    move-result-object v4

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-virtual {v3}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual {v3}, Lb23/k;->a()Lb23/j;

    move-result-object v4

    invoke-virtual {v3}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v5, v3, v1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    check-cast p2, Ln23/h;
    :try_end_2
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_b

    :try_start_3
    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/StreamWebSocket;->close()Z
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catchall_1
    move-exception p1

    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    goto :goto_4

    :catch_1
    move-exception p1

    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    :goto_2
    :try_start_4
    invoke-direct {p0}, Lio/getstream/chat/android/client/user/CurrentUserFetcher;->getLogger()Lb23/k;

    move-result-object v1

    invoke-virtual {v1}, Lb23/k;->c()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {v1}, Lb23/k;->a()Lb23/j;

    move-result-object v2

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v3, v1, v0}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_8
    new-instance v0, Ln23/f;

    new-instance v1, Ln23/d;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_9

    const-string v2, ""

    :cond_9
    invoke-direct {v1, v2, p2}, Ln23/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Ln23/f;-><init>(Ln23/e;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz p1, :cond_a

    :try_start_5
    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/StreamWebSocket;->close()Z
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_2

    :catch_2
    :cond_a
    move-object p2, v0

    :catch_3
    :cond_b
    :goto_3
    return-object p2

    :goto_4
    if-eqz p1, :cond_c

    :try_start_6
    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/StreamWebSocket;->close()Z
    :try_end_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_4

    :catch_4
    :cond_c
    throw p2
.end method
