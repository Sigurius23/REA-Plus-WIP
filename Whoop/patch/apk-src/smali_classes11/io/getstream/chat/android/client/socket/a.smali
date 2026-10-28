.class public final synthetic Lio/getstream/chat/android/client/socket/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/socket/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/socket/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/a;->x:Ljava/lang/Object;

    check-cast v0, Ln23/e;

    check-cast p1, Lio/getstream/chat/android/client/socket/SocketListener;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->b(Ln23/e;Lio/getstream/chat/android/client/socket/SocketListener;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/socket/a;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/events/ChatEvent;

    check-cast p1, Lio/getstream/chat/android/client/socket/SocketListener;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->a(Lio/getstream/chat/android/client/events/ChatEvent;Lio/getstream/chat/android/client/socket/SocketListener;)V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/client/socket/a;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    check-cast p1, Lio/getstream/chat/android/client/socket/SocketListener;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1$1;->f(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;Lio/getstream/chat/android/client/socket/SocketListener;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
