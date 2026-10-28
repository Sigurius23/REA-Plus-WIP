.class public final synthetic Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/models/ChannelData;

.field public final synthetic y:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;I)V
    .locals 0

    iput p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/a;->x:Lio/getstream/chat/android/models/ChannelData;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/a;->y:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/a;->y:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;

    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/a;->x:Lio/getstream/chat/android/models/ChannelData;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->b(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/a;->y:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;

    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/a;->x:Lio/getstream/chat/android/models/ChannelData;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->a(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
