.class public final synthetic Lio/getstream/chat/android/client/socket/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lio/getstream/chat/android/client/socket/c;->w:I

    iput-object p2, p0, Lio/getstream/chat/android/client/socket/c;->y:Ljava/lang/Object;

    iput-object p3, p0, Lio/getstream/chat/android/client/socket/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/ChatSocketStateService;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lio/getstream/chat/android/client/socket/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/c;->x:Ljava/lang/Object;

    iput-object p2, p0, Lio/getstream/chat/android/client/socket/c;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/client/socket/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/c;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/socket/SocketFactory;

    iget-object v1, p0, Lio/getstream/chat/android/client/socket/c;->x:Ljava/lang/Object;

    check-cast v1, Lud3/o0;

    check-cast p1, Lud3/f1;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/socket/SocketFactory;->a(Lio/getstream/chat/android/client/socket/SocketFactory;Lud3/o0;Lud3/f1;)Lle3/g;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/socket/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    iget-object v1, p0, Lio/getstream/chat/android/client/socket/c;->y:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    check-cast p1, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->I(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/ChatSocketStateService;Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/client/socket/c;->y:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/socket/ChatSocket;

    iget-object v1, p0, Lio/getstream/chat/android/client/socket/c;->x:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    check-cast p1, Lio/getstream/chat/android/client/socket/SocketListener;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->i(Lio/getstream/chat/android/client/socket/ChatSocket;Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/SocketListener;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
