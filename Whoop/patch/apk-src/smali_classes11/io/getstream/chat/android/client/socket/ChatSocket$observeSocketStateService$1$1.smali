.class final Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;",
        "state",
        "Ll83/a0;",
        "<anonymous>",
        "(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "io.getstream.chat.android.client.socket.ChatSocket$observeSocketStateService$1$1"
    f = "ChatSocket.kt"
    l = {
        0x7a,
        0x8c,
        0x8e,
        0x90,
        0xb0
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $$this$launch:Lbc3/c0;

.field final synthetic $socketListenerJob:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field

.field I$0:I

.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lio/getstream/chat/android/client/socket/ChatSocket;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/socket/ChatSocket;Lbc3/c0;Lkotlin/jvm/internal/g0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/socket/ChatSocket;",
            "Lbc3/c0;",
            "Lkotlin/jvm/internal/g0;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    iput-object p2, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->$$this$launch:Lbc3/c0;

    iput-object p3, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->$socketListenerJob:Lkotlin/jvm/internal/g0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/SocketListener;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->invokeSuspend$lambda$4(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/SocketListener;)Ll83/a0;

    return-void
.end method

.method public static synthetic h(Lio/getstream/chat/android/client/socket/SocketListener;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->invokeSuspend$lambda$5(Lio/getstream/chat/android/client/socket/SocketListener;)Ll83/a0;

    return-void
.end method

.method public static synthetic i(Lio/getstream/chat/android/client/socket/ChatSocket;Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/SocketListener;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->invokeSuspend$lambda$7(Lio/getstream/chat/android/client/socket/ChatSocket;Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/SocketListener;)Ll83/a0;

    return-void
.end method

.method private static final invokeSuspend$lambda$4(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/SocketListener;)Ll83/a0;
    .locals 0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;->getEvent()Lio/getstream/chat/android/client/events/ConnectedEvent;

    move-result-object p0

    invoke-virtual {p1, p0}, Lio/getstream/chat/android/client/socket/SocketListener;->onConnected(Lio/getstream/chat/android/client/events/ConnectedEvent;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final invokeSuspend$lambda$5(Lio/getstream/chat/android/client/socket/SocketListener;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/client/socket/SocketListener;->onConnecting()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final invokeSuspend$lambda$7(Lio/getstream/chat/android/client/socket/ChatSocket;Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/SocketListener;)Ll83/a0;
    .locals 0

    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getCause(Lio/getstream/chat/android/client/socket/ChatSocket;Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;)Lio/getstream/chat/android/client/clientstate/DisconnectCause;

    move-result-object p0

    invoke-virtual {p2, p0}, Lio/getstream/chat/android/client/socket/SocketListener;->onDisconnected(Lio/getstream/chat/android/client/clientstate/DisconnectCause;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;

    iget-object v1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    iget-object v2, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->$$this$launch:Lbc3/c0;

    iget-object v3, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->$socketListenerJob:Lkotlin/jvm/internal/g0;

    invoke-direct {v0, v1, v2, v3, p2}, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;-><init>(Lio/getstream/chat/android/client/socket/ChatSocket;Lbc3/c0;Lkotlin/jvm/internal/g0;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->invoke(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->label:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v7, :cond_1

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getLogger(Lio/getstream/chat/android/client/socket/ChatSocket;)Lb23/k;

    move-result-object p1

    iget-object v2, p1, Lb23/k;->c:Lb23/e;

    iget-object v8, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->z:Lb23/g;

    invoke-interface {v2, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v10, 0x0

    if-eqz v2, :cond_4

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v11, "[onSocketStateChanged] state: "

    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v9, v8, v2, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    instance-of p1, v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    const/4 v2, 0x0

    if-eqz p1, :cond_7

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getConnectionConf$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v3, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {v3}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getChatSocketStateService$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    move-result-object v3

    iput-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->L$0:Ljava/lang/Object;

    iput-object v10, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->L$1:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->I$0:I

    iput v7, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->label:I

    invoke-virtual {v3, p1, v2, p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->onReconnect(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_18

    goto/16 :goto_0

    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getLogger(Lio/getstream/chat/android/client/socket/ChatSocket;)Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->F:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[onSocketStateChanged] #reconnect; connectionConf is null"

    invoke-interface {v1, v4, v3, v2, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getClientDebugger$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/debugger/ChatClientDebugger;

    move-result-object p1

    if-eqz p1, :cond_18

    check-cast v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;->getReason()Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to reconnect socket on "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ln23/a;

    const-string v2, "connectionConf is null"

    invoke-direct {v1, v2}, Ln23/a;-><init>(Ljava/lang/String;)V

    const-string v2, "Chat:Socket"

    const-string v3, "onSocketStateChanged"

    invoke-interface {p1, v2, v3, v0, v1}, Lio/getstream/chat/android/client/debugger/ChatClientDebugger;->onNonFatalErrorOccurred(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ln23/e;)V

    goto/16 :goto_2

    :cond_7
    instance-of p1, v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    if-eqz p1, :cond_8

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getHealthMonitor$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/HealthMonitor;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/HealthMonitor;->ack()V

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    new-instance v1, Lio/getstream/chat/android/client/socket/a;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lio/getstream/chat/android/client/socket/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$callListeners(Lio/getstream/chat/android/client/socket/ChatSocket;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_2

    :cond_8
    instance-of p1, v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    if-eqz p1, :cond_c

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    new-instance v2, Lio/getstream/chat/android/client/socket/b;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v2}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$callListeners(Lio/getstream/chat/android/client/socket/ChatSocket;Lkotlin/jvm/functions/Function1;)V

    check-cast v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;->getConnectionType()Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    move-result-object p1

    sget-object v2, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    if-eq p1, v7, :cond_b

    if-eq p1, v6, :cond_a

    if-ne p1, v5, :cond_9

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    iget-object v2, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->$socketListenerJob:Lkotlin/jvm/internal/g0;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;->getConnectionConf()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->asReconnectionConf$stream_chat_android_client_release()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    iput-object v10, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->L$0:Ljava/lang/Object;

    iput v4, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->label:I

    invoke-static {p1, v2, v0, p0}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$observeSocketStateService$reconnect(Lio/getstream/chat/android/client/socket/ChatSocket;Lkotlin/jvm/internal/g0;Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_18

    goto/16 :goto_0

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    iget-object v2, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->$socketListenerJob:Lkotlin/jvm/internal/g0;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;->getConnectionConf()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->asReconnectionConf$stream_chat_android_client_release()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    iput-object v10, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->L$0:Ljava/lang/Object;

    iput v5, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->label:I

    invoke-static {p1, v2, v0, p0}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$observeSocketStateService$reconnect(Lio/getstream/chat/android/client/socket/ChatSocket;Lkotlin/jvm/internal/g0;Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_18

    goto/16 :goto_0

    :cond_b
    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    iget-object v2, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->$socketListenerJob:Lkotlin/jvm/internal/g0;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;->getConnectionConf()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    move-result-object v0

    iput-object v10, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->L$0:Ljava/lang/Object;

    iput v6, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->label:I

    invoke-static {p1, v2, v0, p0}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$observeSocketStateService$connectUser(Lio/getstream/chat/android/client/socket/ChatSocket;Lkotlin/jvm/internal/g0;Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_18

    goto/16 :goto_0

    :cond_c
    instance-of p1, v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;

    if-eqz p1, :cond_1a

    move-object p1, v0

    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;

    instance-of v4, p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    if-eqz v4, :cond_e

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getTokenManager$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/token/TokenManager;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/token/TokenManager;->expireToken()V

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getStreamWebSocket$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/StreamWebSocket;

    move-result-object p1

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/StreamWebSocket;->close()Z

    :cond_d
    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getHealthMonitor$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/HealthMonitor;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/HealthMonitor;->stop()V

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$disposeObservers(Lio/getstream/chat/android/client/socket/ChatSocket;)V

    goto/16 :goto_1

    :cond_e
    instance-of v4, p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    if-eqz v4, :cond_10

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getStreamWebSocket$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/StreamWebSocket;

    move-result-object p1

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/StreamWebSocket;->close()Z

    :cond_f
    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getHealthMonitor$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/HealthMonitor;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/HealthMonitor;->stop()V

    goto/16 :goto_1

    :cond_10
    instance-of v4, p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    if-eqz v4, :cond_12

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getStreamWebSocket$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/StreamWebSocket;

    move-result-object p1

    if-eqz p1, :cond_11

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/StreamWebSocket;->close()Z

    :cond_11
    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getHealthMonitor$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/HealthMonitor;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/HealthMonitor;->stop()V

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$disposeNetworkStateObserver(Lio/getstream/chat/android/client/socket/ChatSocket;)V

    goto :goto_1

    :cond_12
    instance-of v4, p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    if-eqz v4, :cond_14

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getTokenManager$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/token/TokenManager;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/token/TokenManager;->expireToken()V

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getStreamWebSocket$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/StreamWebSocket;

    move-result-object p1

    if-eqz p1, :cond_13

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/StreamWebSocket;->close()Z

    :cond_13
    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getHealthMonitor$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/HealthMonitor;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/HealthMonitor;->stop()V

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$disposeObservers(Lio/getstream/chat/android/client/socket/ChatSocket;)V

    goto :goto_1

    :cond_14
    instance-of v4, p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    if-eqz v4, :cond_15

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getHealthMonitor$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/HealthMonitor;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/HealthMonitor;->onDisconnected()V

    goto :goto_1

    :cond_15
    instance-of p1, p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    if-eqz p1, :cond_19

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getTokenManager$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/token/TokenManager;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/token/TokenManager;->expireToken()V

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getStreamWebSocket$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/StreamWebSocket;

    move-result-object p1

    if-eqz p1, :cond_16

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/StreamWebSocket;->close()Z

    :cond_16
    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getConnectionConf$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    move-result-object p1

    if-eqz p1, :cond_17

    iget-object v4, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {v4}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$getChatSocketStateService$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    move-result-object v4

    iput-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->L$0:Ljava/lang/Object;

    iput-object v10, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->L$1:Ljava/lang/Object;

    iput v2, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->I$0:I

    iput v3, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->label:I

    invoke-virtual {v4, p1, v2, p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->onReconnect(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_17

    :goto_0
    return-object v1

    :cond_17
    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->this$0:Lio/getstream/chat/android/client/socket/ChatSocket;

    new-instance v1, Lio/getstream/chat/android/client/socket/c;

    const/4 v2, 0x0

    invoke-direct {v1, v2, p1, v0}, Lio/getstream/chat/android/client/socket/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1, v1}, Lio/getstream/chat/android/client/socket/ChatSocket;->access$callListeners(Lio/getstream/chat/android/client/socket/ChatSocket;Lkotlin/jvm/functions/Function1;)V

    :cond_18
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_19
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
