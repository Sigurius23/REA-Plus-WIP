.class public final synthetic Lio/getstream/chat/android/client/socket/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/socket/f;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/socket/f;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->p(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->Y(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->G(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->C(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->E(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->Q(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->n(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->O(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->L(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->w(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->j(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->y(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    move-result-object p1

    return-object p1

    :pswitch_b
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->K(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p1

    return-object p1

    :pswitch_c
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->A(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    move-result-object p1

    return-object p1

    :pswitch_d
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->t(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$RestartConnection;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    move-result-object p1

    return-object p1

    :pswitch_e
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->a0(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    move-result-object p1

    return-object p1

    :pswitch_f
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->i(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    move-result-object p1

    return-object p1

    :pswitch_10
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->u(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    move-result-object p1

    return-object p1

    :pswitch_11
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->M(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    move-result-object p1

    return-object p1

    :pswitch_12
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->P(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    move-result-object p1

    return-object p1

    :pswitch_13
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;

    invoke-static {p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->s(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connecting;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
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
