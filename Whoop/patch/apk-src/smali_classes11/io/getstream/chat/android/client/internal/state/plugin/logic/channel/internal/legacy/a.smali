.class public final synthetic Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/events/HasChannel;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/events/HasChannel;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/a;->x:Lio/getstream/chat/android/client/events/HasChannel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/a;->x:Lio/getstream/chat/android/client/events/HasChannel;

    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->f(Lio/getstream/chat/android/client/events/HasChannel;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/a;->x:Lio/getstream/chat/android/client/events/HasChannel;

    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->g(Lio/getstream/chat/android/client/events/HasChannel;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
