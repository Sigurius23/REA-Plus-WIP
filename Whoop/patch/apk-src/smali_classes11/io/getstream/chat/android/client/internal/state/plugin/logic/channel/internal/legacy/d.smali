.class public final synthetic Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/models/Message;

.field public final synthetic y:Z


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/models/Message;ZI)V
    .locals 0

    iput p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/d;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/d;->x:Lio/getstream/chat/android/models/Message;

    iput-boolean p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/d;->y:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/d;->y:Z

    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/d;->x:Lio/getstream/chat/android/models/Message;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->u(Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/d;->y:Z

    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/d;->x:Lio/getstream/chat/android/models/Message;

    invoke-static {v1, v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->b(Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
