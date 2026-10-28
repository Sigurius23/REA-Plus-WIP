.class public final synthetic Lio/getstream/chat/android/client/socket/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/socket/ChatSocketStateService;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/socket/ChatSocketStateService;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/socket/e;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/e;->x:Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/socket/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/e;->x:Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->o(Lio/getstream/chat/android/client/socket/ChatSocketStateService;Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;)Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    check-cast p2, Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/e;->x:Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->g(Lio/getstream/chat/android/client/socket/ChatSocketStateService;Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
