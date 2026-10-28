.class final Lio/getstream/chat/android/client/socket/ChatSocket$healthMonitor$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/socket/ChatSocket;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/socket/SocketFactory;Lio/getstream/chat/android/client/scope/UserScope;Lio/getstream/chat/android/client/StreamLifecycleObserver;Lio/getstream/chat/android/client/network/NetworkStateProvider;Lio/getstream/chat/android/client/debugger/ChatClientDebugger;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "<anonymous>",
        "()V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.socket.ChatSocket$healthMonitor$1"
    f = "ChatSocket.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/socket/ChatSocket;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/socket/ChatSocket;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/socket/ChatSocket;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/socket/ChatSocket$healthMonitor$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$healthMonitor$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/socket/ChatSocket$healthMonitor$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$healthMonitor$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-direct {v0, v1, p1}, Lio/getstream/chat/android/client/socket/ChatSocket$healthMonitor$1;-><init>(Lio/getstream/chat/android/client/socket/ChatSocket;Lq83/d;)V

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocket$healthMonitor$1;->invoke(Lq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
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

    .line 2
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocket$healthMonitor$1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocket$healthMonitor$1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/socket/ChatSocket$healthMonitor$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket$healthMonitor$1;->label:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$healthMonitor$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getChatSocketStateService$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getCurrentState()Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p1

    instance-of v0, p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;->getEvent()Lio/getstream/chat/android/client/events/ConnectedEvent;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket$healthMonitor$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->sendEvent$stream_chat_android_client_release(Lio/getstream/chat/android/client/events/ChatEvent;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v0}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getServerClockOffset$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->onHealthCheckSent$stream_chat_android_client_release()V

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
