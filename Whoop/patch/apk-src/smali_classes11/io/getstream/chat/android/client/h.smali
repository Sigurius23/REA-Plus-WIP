.class public final synthetic Lio/getstream/chat/android/client/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/ChatEventListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lio/getstream/chat/android/client/ChatEventListener;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lio/getstream/chat/android/client/ChatEventListener;I)V
    .locals 0

    iput p3, p0, Lio/getstream/chat/android/client/h;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/h;->x:Ljava/lang/Object;

    iput-object p2, p0, Lio/getstream/chat/android/client/h;->y:Lio/getstream/chat/android/client/ChatEventListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/client/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/h;->x:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/channel/ChannelClient;

    iget-object v1, p0, Lio/getstream/chat/android/client/h;->y:Lio/getstream/chat/android/client/ChatEventListener;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/channel/ChannelClient;->a(Lio/getstream/chat/android/client/channel/ChannelClient;Lio/getstream/chat/android/client/ChatEventListener;Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/h;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/g0;

    iget-object v1, p0, Lio/getstream/chat/android/client/h;->y:Lio/getstream/chat/android/client/ChatEventListener;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/ChatClient;->m(Landroidx/lifecycle/g0;Lio/getstream/chat/android/client/ChatEventListener;Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/client/h;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/g0;

    iget-object v1, p0, Lio/getstream/chat/android/client/h;->y:Lio/getstream/chat/android/client/ChatEventListener;

    invoke-static {v0, v1, p1}, Lio/getstream/chat/android/client/ChatClient;->c(Landroidx/lifecycle/g0;Lio/getstream/chat/android/client/ChatEventListener;Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
