.class public final synthetic Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/models/User;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/models/User;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/f;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/f;->x:Lio/getstream/chat/android/models/User;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/f;->x:Lio/getstream/chat/android/models/User;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->d(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/f;->x:Lio/getstream/chat/android/models/User;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->g(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
