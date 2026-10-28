.class public final synthetic Lio/getstream/chat/android/client/api/state/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/client/api/state/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/api/state/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->v(Lio/getstream/chat/android/models/Message;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :pswitch_0
    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->k(Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->t(Lio/getstream/chat/android/models/ChannelUserRead;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->w(Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/util/Map;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->m(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->r(Lio/getstream/chat/android/models/ChannelData;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_5
    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->a(Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->d(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/SocketEventCollector;->a(Lio/getstream/chat/android/client/events/ChatEvent;)Ljava/util/Date;

    move-result-object p1

    return-object p1

    :pswitch_8
    check-cast p1, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;->c(Lio/getstream/chat/android/client/events/ChatEvent;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_9
    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;->a(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Poll;

    move-result-object p1

    return-object p1

    :pswitch_a
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->g(Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_b
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;->b(Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_c
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;->b(Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_d
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao_Impl;->b(Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_e
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->c(Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_f
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->b(Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_10
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->e(Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_11
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->b(Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_12
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->n(Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_13
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->c(Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_14
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->f(Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_15
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->l(Ltb/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_16
    check-cast p1, Ltb/a;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->e(Ltb/a;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1

    :pswitch_17
    check-cast p1, [Lio/getstream/chat/android/models/FilterObject;

    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->a([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p1

    return-object p1

    :pswitch_18
    check-cast p1, [Lio/getstream/chat/android/models/FilterObject;

    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->b([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p1

    return-object p1

    :pswitch_19
    check-cast p1, [Lio/getstream/chat/android/models/FilterObject;

    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/FilterDomainMappingKt;->c([Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/models/FilterObject;

    move-result-object p1

    return-object p1

    :pswitch_1a
    check-cast p1, Lbc3/k1;

    invoke-static {p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->b(Lbc3/k1;)Lbc3/l1;

    move-result-object p1

    return-object p1

    :pswitch_1b
    check-cast p1, Lbc3/k1;

    invoke-static {p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->d(Lbc3/k1;)Lbc3/l1;

    move-result-object p1

    return-object p1

    :pswitch_1c
    check-cast p1, Lbc3/k1;

    invoke-static {p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->g(Lbc3/k1;)Lbc3/l1;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
