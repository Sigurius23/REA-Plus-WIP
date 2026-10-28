.class public final synthetic Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/e;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/e;->x:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/e;->x:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->c(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Ljava/util/List;)Ljava/util/LinkedHashMap;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/e;->x:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->n(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Ljava/util/List;)Ljava/util/LinkedHashMap;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/e;->x:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->a(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/e;->x:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->m(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
