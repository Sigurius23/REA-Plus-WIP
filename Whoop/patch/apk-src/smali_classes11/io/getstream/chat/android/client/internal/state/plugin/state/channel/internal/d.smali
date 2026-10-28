.class public final synthetic Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/d;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/d;->x:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/d;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/util/Map;

    check-cast p2, Ljava/util/Map;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/d;->x:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->q(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Ljava/util/Map;Ljava/util/Map;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    check-cast p2, Ljava/util/Map;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/d;->x:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->p(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lio/getstream/chat/android/models/ChannelData;Ljava/util/Map;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
