.class public final synthetic Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

.field public final synthetic y:Lio/getstream/chat/android/models/Message;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;I)V
    .locals 0

    iput p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;->x:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;->y:Lio/getstream/chat/android/models/Message;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;->y:Lio/getstream/chat/android/models/Message;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;->x:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->i(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;->y:Lio/getstream/chat/android/models/Message;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;->x:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->d(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;->y:Lio/getstream/chat/android/models/Message;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;->x:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->A(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;->y:Lio/getstream/chat/android/models/Message;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;->x:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->h(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;->y:Lio/getstream/chat/android/models/Message;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/a;->x:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->q(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
