.class public final synthetic Lio/getstream/chat/android/client/socket/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/socket/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/socket/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->k(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->b(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->f(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->m(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->U(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->V(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->J(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->x(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->q(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->e(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->Z(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->c0(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkAvailable;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->X(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->H(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->a(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->B(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->N(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->S(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->r(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->z(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Resume;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->c(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Resume;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    move-result-object p1

    return-object p1

    :pswitch_14
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->d(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    move-result-object p1

    return-object p1

    :pswitch_15
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->D(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    move-result-object p1

    return-object p1

    :pswitch_16
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->W(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->v(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->R(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->T(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->b0(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->h(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->l(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
