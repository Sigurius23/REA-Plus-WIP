.class public final Lio/getstream/chat/android/client/socket/ChatSocket$networkStateListener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/network/NetworkStateProvider$NetworkStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/socket/ChatSocket;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/socket/SocketFactory;Lio/getstream/chat/android/client/scope/UserScope;Lio/getstream/chat/android/client/StreamLifecycleObserver;Lio/getstream/chat/android/client/network/NetworkStateProvider;Lio/getstream/chat/android/client/debugger/ChatClientDebugger;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0005\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "io/getstream/chat/android/client/socket/ChatSocket$networkStateListener$1",
        "Lio/getstream/chat/android/client/network/NetworkStateProvider$NetworkStateListener;",
        "Ll83/a0;",
        "onConnected",
        "(Lq83/d;)Ljava/lang/Object;",
        "onDisconnected",
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
.field final synthetic this$0:Lio/getstream/chat/android/client/socket/ChatSocket;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/socket/ChatSocket;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$networkStateListener$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onConnected(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket$networkStateListener$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {v0}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getChatSocketStateService$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->onNetworkAvailable(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onDisconnected(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket$networkStateListener$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {v0}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getChatSocketStateService$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->onNetworkNotAvailable(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
