.class public final Lio/getstream/chat/android/client/socket/ChatSocketStateService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;,
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;,
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;,
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;,
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001:\u0004789:B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J4\u0010\n\u001a\u00020\u00082\"\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0086@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000cH\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00082\u0006\u0010\u0017\u001a\u00020\u0016H\u0086@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00082\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\u00082\u0006\u0010\u001b\u001a\u00020\u001aH\u0086@\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u001f\u0010\u0015J\u0010\u0010 \u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008 \u0010\u0015J\u0010\u0010!\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008!\u0010\u0015J\u0010\u0010\"\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\"\u0010\u0015J\u0010\u0010#\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008#\u0010\u0015R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(R\'\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020+0*8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008,\u0010&\u001a\u0004\u0008-\u0010.R\u0011\u00102\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u00080\u00101R\u0017\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u0002038F\u00a2\u0006\u0006\u001a\u0004\u00084\u00105\u00a8\u0006;"
    }
    d2 = {
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService;",
        "",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;",
        "initialState",
        "<init>",
        "(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;)V",
        "Lkotlin/Function2;",
        "Lq83/d;",
        "Ll83/a0;",
        "onNewState",
        "observer",
        "(Lc93/m;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;",
        "connectionConf",
        "",
        "forceReconnection",
        "onReconnect",
        "(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;ZLq83/d;)Ljava/lang/Object;",
        "onConnect",
        "(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lq83/d;)Ljava/lang/Object;",
        "onNetworkNotAvailable",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/events/ConnectedEvent;",
        "connectedEvent",
        "onConnectionEstablished",
        "(Lio/getstream/chat/android/client/events/ConnectedEvent;Lq83/d;)Ljava/lang/Object;",
        "Ln23/c;",
        "error",
        "onUnrecoverableError",
        "(Ln23/c;Lq83/d;)Ljava/lang/Object;",
        "onNetworkError",
        "onRequiredDisconnect",
        "onStop",
        "onWebSocketEventLost",
        "onNetworkAvailable",
        "onResume",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;",
        "stateMachine$delegate",
        "getStateMachine",
        "()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;",
        "stateMachine",
        "getCurrentState",
        "()Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;",
        "currentState",
        "Lec3/f2;",
        "getCurrentStateFlow",
        "()Lec3/f2;",
        "currentStateFlow",
        "ConnectionType",
        "RestartReason",
        "Event",
        "State",
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
.field private final logger$delegate:Ll83/h;

.field private final stateMachine$delegate:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;-><init>(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;)V
    .locals 2

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v0, "Chat:SocketState"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->logger$delegate:Ll83/h;

    .line 4
    new-instance v0, La11/l;

    const/16 v1, 0x17

    invoke-direct {v0, v1, p1, p0}, La11/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 5
    sget-object p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;-><init>(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;)V

    return-void
.end method

.method public static synthetic A(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$69(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    return-object p0
.end method

.method public static synthetic B(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$46(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    return-object p0
.end method

.method public static synthetic C(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$27(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    return-object p0
.end method

.method public static synthetic D(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$42$lambda$39(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    return-object p0
.end method

.method public static synthetic E(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$26(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    return-object p0
.end method

.method public static synthetic F(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/ChatSocketStateService;)Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/ChatSocketStateService;)Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$28(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    return-object p0
.end method

.method public static synthetic H(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$48(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    return-object p0
.end method

.method public static synthetic I(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/ChatSocketStateService;Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/ChatSocketStateService;Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;)Ll83/a0;

    return-void
.end method

.method public static synthetic J(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$55(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    return-object p0
.end method

.method public static synthetic K(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$18(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    return-object p0
.end method

.method public static synthetic M(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$65(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    return-object p0
.end method

.method public static synthetic N(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$14(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    return-object p0
.end method

.method public static synthetic O(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$19(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    return-object p0
.end method

.method public static synthetic P(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$64(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    return-object p0
.end method

.method public static synthetic Q(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$22(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    return-object p0
.end method

.method public static synthetic R(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$35(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    return-object p0
.end method

.method public static synthetic S(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$45(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    return-object p0
.end method

.method public static synthetic T(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$34(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    return-object p0
.end method

.method public static synthetic U(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$15(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    return-object p0
.end method

.method public static synthetic V(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$56(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    return-object p0
.end method

.method public static synthetic W(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$37(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    return-object p0
.end method

.method public static synthetic X(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$49(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    return-object p0
.end method

.method public static synthetic Y(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$29(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    return-object p0
.end method

.method public static synthetic Z(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$52(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    return-object p0
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$47(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    return-object p0
.end method

.method public static synthetic a0(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$68(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    return-object p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$62(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    return-object p0
.end method

.method public static synthetic b0(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$13(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    return-object p0
.end method

.method public static synthetic c(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Resume;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$42$lambda$41(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Resume;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    return-object p0
.end method

.method public static synthetic c0(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$51(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    return-object p0
.end method

.method public static synthetic d(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$42$lambda$40(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    return-object p0
.end method

.method public static synthetic e(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$23(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    return-object p0
.end method

.method public static synthetic f(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lio/getstream/chat/android/client/socket/ChatSocketStateService;Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$12(Lio/getstream/chat/android/client/socket/ChatSocketStateService;Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final getStateMachine()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine<",
            "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;",
            "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    return-object v0
.end method

.method public static synthetic h(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$33(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    return-object p0
.end method

.method public static synthetic i(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$67(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    return-object p0
.end method

.method public static synthetic j(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$17(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    return-object p0
.end method

.method public static synthetic k(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$63(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    return-object p0
.end method

.method public static synthetic l(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$32(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    return-object p0
.end method

.method public static synthetic m(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$57(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    return-object p0
.end method

.method public static synthetic n(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$20(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    return-object p0
.end method

.method public static synthetic o(Lio/getstream/chat/android/client/socket/ChatSocketStateService;Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$59(Lio/getstream/chat/android/client/socket/ChatSocketStateService;Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$31(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    return-object p0
.end method

.method public static synthetic q(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$53(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    return-object p0
.end method

.method public static synthetic r(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$44(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    return-object p0
.end method

.method public static synthetic s(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$24(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/ChatSocketStateService;)Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;
    .locals 2

    sget-object v0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->Companion:Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$Companion;

    new-instance v1, Lio/getstream/chat/android/client/socket/c;

    invoke-direct {v1, p0, p1}, Lio/getstream/chat/android/client/socket/c;-><init>(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/ChatSocketStateService;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$Companion;->invoke(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object p0

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/ChatSocketStateService;Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;)Ll83/a0;
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "$this$FiniteStateMachine"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p0

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->initialState(Ljava/lang/Object;)V

    new-instance v2, Lio/getstream/chat/android/client/socket/e;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lio/getstream/chat/android/client/socket/e;-><init>(Lio/getstream/chat/android/client/socket/ChatSocketStateService;I)V

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->defaultHandler(Lc93/m;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->getStateFunctions()Ljava/util/Map;

    move-result-object v2

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v4, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;

    invoke-direct {v5}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;-><init>()V

    new-instance v6, Lio/getstream/chat/android/client/socket/d;

    const/4 v7, 0x2

    invoke-direct {v6, v7}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual {v5}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v7

    const-class v8, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;

    invoke-virtual {v3, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const/4 v10, 0x2

    invoke-static {v10, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v7, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/getstream/chat/android/client/socket/d;

    const/16 v7, 0xd

    invoke-direct {v6, v7}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual {v5}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v7

    const-class v9, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;

    invoke-virtual {v3, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-static {v10, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v7, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/getstream/chat/android/client/socket/d;

    const/16 v7, 0x19

    invoke-direct {v6, v7}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual {v5}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v7

    const-class v11, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;

    invoke-virtual {v3, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-static {v10, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v7, v12, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/getstream/chat/android/client/socket/f;

    const/4 v7, 0x6

    invoke-direct {v6, v7}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual {v5}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v7

    const-class v12, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;

    invoke-virtual {v3, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-static {v10, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v7, v13, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/getstream/chat/android/client/socket/f;

    const/16 v7, 0xa

    invoke-direct {v6, v7}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual {v5}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v7

    const-class v13, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;

    invoke-virtual {v3, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    invoke-static {v10, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v7, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/getstream/chat/android/client/socket/f;

    const/16 v7, 0xc

    invoke-direct {v6, v7}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual {v5}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v7

    const-class v14, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;

    invoke-virtual {v3, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v15

    invoke-static {v10, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v7, v15, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/getstream/chat/android/client/socket/f;

    const/16 v7, 0xd

    invoke-direct {v6, v7}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual {v5}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v7

    const-class v15, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;

    invoke-virtual {v3, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {v10, v6}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v7, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lio/getstream/chat/android/client/socket/f;

    const/16 v6, 0xe

    invoke-direct {v1, v6}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual {v5}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v6

    const-class v7, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;

    move-object/from16 p0, v5

    invoke-virtual {v3, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v10, v1}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v6, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->get()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v2, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->getStateFunctions()Ljava/util/Map;

    move-result-object v1

    const-class v2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v4, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;

    invoke-direct {v4}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;-><init>()V

    new-instance v5, Lio/getstream/chat/android/client/socket/f;

    const/16 v6, 0xf

    invoke-direct {v5, v6}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual {v4}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v6

    move-object/from16 p0, v4

    invoke-virtual {v3, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v10, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/16 v5, 0x14

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/f;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/f;

    const/16 v5, 0xb

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/f;

    const/16 v5, 0x10

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/f;

    const/16 v5, 0x11

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/f;

    const/16 v5, 0x12

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/f;

    const/16 v5, 0x13

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->get()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->getStateFunctions()Ljava/util/Map;

    move-result-object v1

    const-class v2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v4, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;

    invoke-direct {v4}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;-><init>()V

    new-instance v5, Lio/getstream/chat/android/client/socket/f;

    const/16 v6, 0x14

    invoke-direct {v5, v6}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual {v4}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v6

    move-object/from16 p0, v4

    invoke-virtual {v3, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v10, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/4 v5, 0x3

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/4 v5, 0x4

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/4 v5, 0x5

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/4 v5, 0x6

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->get()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->getStateFunctions()Ljava/util/Map;

    move-result-object v1

    const-class v2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v4, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;

    invoke-direct {v4}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;-><init>()V

    new-instance v5, Lio/getstream/chat/android/client/socket/d;

    const/4 v6, 0x7

    invoke-direct {v5, v6}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual {v4}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v6

    move-object/from16 p0, v4

    invoke-virtual {v3, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v10, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/16 v5, 0x8

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/16 v5, 0x9

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    const-class v6, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Resume;

    invoke-virtual {v3, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->get()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->getStateFunctions()Ljava/util/Map;

    move-result-object v1

    const-class v2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v4, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;

    invoke-direct {v4}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;-><init>()V

    new-instance v5, Lio/getstream/chat/android/client/socket/d;

    const/16 v6, 0xa

    invoke-direct {v5, v6}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual {v4}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v6

    move-object/from16 p0, v4

    invoke-virtual {v3, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v10, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/16 v5, 0xb

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/16 v5, 0xc

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/16 v5, 0xe

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/16 v5, 0xf

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/16 v5, 0x10

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/16 v5, 0x11

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    const-class v6, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkAvailable;

    invoke-virtual {v3, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->get()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->getStateFunctions()Ljava/util/Map;

    move-result-object v1

    const-class v2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v4, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;

    invoke-direct {v4}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;-><init>()V

    new-instance v5, Lio/getstream/chat/android/client/socket/d;

    const/16 v6, 0x12

    invoke-direct {v5, v6}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual {v4}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v6

    move-object/from16 p0, v4

    invoke-virtual {v3, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v10, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v6, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/16 v5, 0x13

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/16 v5, 0x15

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/16 v5, 0x16

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/16 v5, 0x17

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/16 v5, 0x18

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/16 v5, 0x1a

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->get()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v1, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->getStateFunctions()Ljava/util/Map;

    move-result-object v1

    const-class v2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v4, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;

    invoke-direct {v4}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;-><init>()V

    new-instance v5, Lio/getstream/chat/android/client/socket/e;

    const/4 v6, 0x1

    invoke-direct {v5, v0, v6}, Lio/getstream/chat/android/client/socket/e;-><init>(Lio/getstream/chat/android/client/socket/ChatSocketStateService;I)V

    invoke-virtual {v4}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v3, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v5}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/getstream/chat/android/client/socket/d;

    const/16 v5, 0x1b

    invoke-direct {v0, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual {v4}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v0}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->get()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->getStateFunctions()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;

    invoke-direct {v2}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;-><init>()V

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/16 v5, 0x1c

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual {v2}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/d;

    const/16 v5, 0x1d

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/d;-><init>(I)V

    invoke-virtual {v2}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/f;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual {v2}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/f;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual {v2}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/f;

    const/4 v5, 0x3

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual {v2}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/f;

    const/4 v5, 0x4

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual {v2}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/f;

    const/4 v5, 0x5

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual {v2}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/f;

    const/4 v5, 0x7

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual {v2}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->get()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->getStateFunctions()Ljava/util/Map;

    move-result-object v0

    const-class v1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;

    invoke-direct {v2}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;-><init>()V

    new-instance v4, Lio/getstream/chat/android/client/socket/f;

    const/16 v5, 0x8

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual {v2}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/socket/f;

    const/16 v5, 0x9

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/socket/f;-><init>(I)V

    invoke-virtual {v2}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v3, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v10, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->get()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$12(Lio/getstream/chat/android/client/socket/ChatSocketStateService;Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 4

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getLogger()Lb23/k;

    move-result-object p0

    invoke-virtual {p0}, Lb23/k;->c()Lb23/e;

    move-result-object v0

    sget-object v1, Lb23/g;->F:Lb23/g;

    invoke-virtual {p0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb23/k;->a()Lb23/j;

    move-result-object v0

    invoke-virtual {p0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Cannot handle event "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " while being in inappropriate state "

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, v1, p0, p2}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$13(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionConf()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionType()Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;-><init>(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$14(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;->getConnectedEvent()Lio/getstream/chat/android/client/events/ConnectedEvent;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;-><init>(Lio/getstream/chat/android/client/events/ConnectedEvent;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$15(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$16(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$17(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;->getError()Ln23/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;-><init>(Ln23/c;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$18(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;->getError()Ln23/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;-><init>(Ln23/c;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$19(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$20(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$22(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionConf()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionType()Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;-><init>(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$23(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;->getConnectedEvent()Lio/getstream/chat/android/client/events/ConnectedEvent;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;-><init>(Lio/getstream/chat/android/client/events/ConnectedEvent;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$24(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$25(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$26(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;->getError()Ln23/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;-><init>(Ln23/c;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$27(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;->getError()Ln23/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;-><init>(Ln23/c;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$28(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$29(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$31(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;->getConnectedEvent()Lio/getstream/chat/android/client/events/ConnectedEvent;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;-><init>(Lio/getstream/chat/android/client/events/ConnectedEvent;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$32(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$33(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$34(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;->getError()Ln23/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;-><init>(Ln23/c;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$35(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;->getError()Ln23/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;-><init>(Ln23/c;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$36(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$37(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$42$lambda$39(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$42$lambda$40(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionConf()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionType()Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;-><init>(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$42$lambda$41(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Resume;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    sget-object p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;->LIFECYCLE_RESUME:Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;-><init>(Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$43(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionConf()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionType()Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;-><init>(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$44(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;->getConnectedEvent()Lio/getstream/chat/android/client/events/ConnectedEvent;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;-><init>(Lio/getstream/chat/android/client/events/ConnectedEvent;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$45(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;->getError()Ln23/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;-><init>(Ln23/c;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$46(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;->getError()Ln23/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;-><init>(Ln23/c;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$47(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$48(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$49(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    sget-object p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;->NETWORK_AVAILABLE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;-><init>(Lio/getstream/chat/android/client/socket/ChatSocketStateService$RestartReason;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$51(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionConf()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionType()Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;-><init>(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$52(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;->getConnectedEvent()Lio/getstream/chat/android/client/events/ConnectedEvent;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;-><init>(Lio/getstream/chat/android/client/events/ConnectedEvent;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$53(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$54(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;->getError()Ln23/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;-><init>(Ln23/c;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$55(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;->getError()Ln23/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;-><init>(Ln23/c;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$56(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$57(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$59(Lio/getstream/chat/android/client/socket/ChatSocketStateService;Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getCurrentState()Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$61$lambda$60(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 2

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionType()Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 p0, 0x3

    if-ne v0, p0, :cond_0

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionConf()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionType()Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;-><init>(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;)V

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    return-object p0

    :cond_2
    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionConf()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionType()Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;-><init>(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$62(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionConf()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionType()Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;-><init>(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$63(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;->getConnectedEvent()Lio/getstream/chat/android/client/events/ConnectedEvent;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;-><init>(Lio/getstream/chat/android/client/events/ConnectedEvent;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$64(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$65(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$66(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;->getError()Ln23/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;-><init>(Ln23/c;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$67(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;->getError()Ln23/c;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;-><init>(Ln23/c;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$68(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$69(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$71(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 2

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionType()Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 p0, 0x3

    if-ne v0, p0, :cond_0

    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionConf()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionType()Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;-><init>(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;)V

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    return-object p0

    :cond_2
    new-instance p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionConf()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;->getConnectionType()Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;-><init>(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;)V

    return-object p0
.end method

.method private static final stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$72(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    return-object p0
.end method

.method public static synthetic t(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$21$lambda$16(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    return-object p0
.end method

.method public static synthetic u(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$70$lambda$66(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    return-object p0
.end method

.method public static synthetic v(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$38$lambda$36(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    return-object p0
.end method

.method public static synthetic w(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$30$lambda$25(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    return-object p0
.end method

.method public static synthetic x(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$58$lambda$54(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    return-object p0
.end method

.method public static synthetic y(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$73$lambda$72(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    return-object p0
.end method

.method public static synthetic z(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->stateMachine_delegate$lambda$75$lambda$74$lambda$50$lambda$43(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    return-object p0
.end method


# virtual methods
.method public final getCurrentState()Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
    .locals 1

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getStateMachine()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->getState()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    return-object v0
.end method

.method public final getCurrentStateFlow()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getStateMachine()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->getStateFlow()Lec3/f2;

    move-result-object v0

    return-object v0
.end method

.method public final observer(Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$observer$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$observer$1;

    iget v1, v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$observer$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$observer$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$observer$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$observer$1;-><init>(Lio/getstream/chat/android/client/socket/ChatSocketStateService;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$observer$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$observer$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p1, v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$observer$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lc93/m;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getStateMachine()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object p2

    invoke-virtual {p2}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->getStateFlow()Lec3/f2;

    move-result-object p2

    new-instance v2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$sam$kotlinx_coroutines_flow_FlowCollector$0;

    invoke-direct {v2, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$sam$kotlinx_coroutines_flow_FlowCollector$0;-><init>(Lc93/m;)V

    const/4 p1, 0x0

    iput-object p1, v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$observer$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$observer$1;->label:I

    invoke-interface {p2, v2, v0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p1, Lkotlin/KotlinNothingValueException;

    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p1
.end method

.method public final onConnect(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->isReconnection()Z

    move-result v4

    const-string v5, "[onConnect] user.id: \'"

    const-string v6, "\', isReconnection: "

    invoke-static {v5, v3, v6, v4}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getStateMachine()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;

    sget-object v2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;->INITIAL_CONNECTION:Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;-><init>(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;)V

    invoke-virtual {v0, v1, p2}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->sendEvent(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onConnectionEstablished(Lio/getstream/chat/android/client/events/ConnectedEvent;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/events/ConnectedEvent;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ConnectedEvent;->getMe()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ConnectedEvent;->getConnectionId()Ljava/lang/String;

    move-result-object v4

    const-string v5, "[onConnected] user.id: \'"

    const-string v6, "\', connectionId: "

    invoke-static {v5, v3, v6, v4}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getStateMachine()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;-><init>(Lio/getstream/chat/android/client/events/ConnectedEvent;)V

    invoke-virtual {v0, v1, p2}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->sendEvent(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onNetworkAvailable(Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    const-string v3, "[onNetworkAvailable] no args"

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getStateMachine()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkAvailable;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkAvailable;

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->sendEvent(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onNetworkError(Ln23/c;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[onNetworkError] error: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getStateMachine()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;-><init>(Ln23/c;)V

    invoke-virtual {v0, v1, p2}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->sendEvent(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onNetworkNotAvailable(Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    const-string v3, "[onNetworkNotAvailable] no args"

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getStateMachine()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->sendEvent(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onReconnect(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;ZLq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->isReconnection()Z

    move-result v4

    const-string v5, "[onReconnect] user.id: \'"

    const-string v6, "\', isReconnection: "

    invoke-static {v5, v3, v6, v4}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getStateMachine()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;

    const/4 v2, 0x1

    if-ne p2, v2, :cond_1

    sget-object p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;->FORCE_RECONNECTION:Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    goto :goto_0

    :cond_1
    if-nez p2, :cond_3

    sget-object p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;->AUTOMATIC_RECONNECTION:Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;

    :goto_0
    invoke-direct {v1, p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;-><init>(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lio/getstream/chat/android/client/socket/ChatSocketStateService$ConnectionType;)V

    invoke-virtual {v0, v1, p3}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->sendEvent(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onRequiredDisconnect(Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    const-string v3, "[onRequiredDisconnect] no args"

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getStateMachine()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->sendEvent(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onResume(Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    const-string v3, "[onResume] no args"

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getStateMachine()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Resume;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Resume;

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->sendEvent(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onStop(Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    const-string v3, "[onStop] no args"

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getStateMachine()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->sendEvent(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onUnrecoverableError(Ln23/c;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[onUnrecoverableError] error: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getStateMachine()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;-><init>(Ln23/c;)V

    invoke-virtual {v0, v1, p2}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->sendEvent(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onWebSocketEventLost(Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    const-string v3, "[onWebSocketEventLost] no args"

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getStateMachine()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;->INSTANCE:Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->sendEvent(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
