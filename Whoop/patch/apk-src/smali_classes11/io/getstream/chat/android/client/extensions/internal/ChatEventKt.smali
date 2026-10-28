.class public final Lio/getstream/chat/android/client/extensions/internal/ChatEventKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "enrichIfNeeded",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final enrichIfNeeded(Lio/getstream/chat/android/client/events/ChatEvent;)Lio/getstream/chat/android/client/events/ChatEvent;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v1, v0, Lio/getstream/chat/android/client/events/NewMessageEvent;

    if-eqz v1, :cond_0

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/client/events/NewMessageEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->enrichWithCid(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v10

    const/16 v15, 0xf7f

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v2 .. v16}, Lio/getstream/chat/android/client/events/NewMessageEvent;->copy$default(Lio/getstream/chat/android/client/events/NewMessageEvent;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;IIILjava/lang/Integer;ILjava/lang/Object;)Lio/getstream/chat/android/client/events/NewMessageEvent;

    move-result-object v0

    return-object v0

    :cond_0
    instance-of v1, v0, Lio/getstream/chat/android/client/events/MessageDeletedEvent;

    if-eqz v1, :cond_1

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/client/events/MessageDeletedEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->enrichWithCid(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v9

    const/16 v14, 0x7bf

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->copy$default(Lio/getstream/chat/android/client/events/MessageDeletedEvent;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;ZLjava/lang/Integer;ZILjava/lang/Object;)Lio/getstream/chat/android/client/events/MessageDeletedEvent;

    move-result-object v0

    return-object v0

    :cond_1
    instance-of v1, v0, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    if-eqz v1, :cond_2

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->enrichWithCid(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v10

    const/16 v11, 0x7f

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v12}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->copy$default(Lio/getstream/chat/android/client/events/MessageUpdatedEvent;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;ILjava/lang/Object;)Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    move-result-object v0

    return-object v0

    :cond_2
    instance-of v1, v0, Lio/getstream/chat/android/client/events/ReactionNewEvent;

    if-eqz v1, :cond_3

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/client/events/ReactionNewEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/ReactionNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/ReactionNewEvent;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->enrichWithCid(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v10

    const/16 v12, 0x17f

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v2 .. v13}, Lio/getstream/chat/android/client/events/ReactionNewEvent;->copy$default(Lio/getstream/chat/android/client/events/ReactionNewEvent;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;ILjava/lang/Object;)Lio/getstream/chat/android/client/events/ReactionNewEvent;

    move-result-object v0

    return-object v0

    :cond_3
    instance-of v1, v0, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;

    if-eqz v1, :cond_4

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->enrichWithCid(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v10

    const/16 v12, 0x17f

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v2 .. v13}, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;->copy$default(Lio/getstream/chat/android/client/events/ReactionUpdateEvent;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;ILjava/lang/Object;)Lio/getstream/chat/android/client/events/ReactionUpdateEvent;

    move-result-object v0

    return-object v0

    :cond_4
    instance-of v1, v0, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;

    if-eqz v1, :cond_5

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->enrichWithCid(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v10

    const/16 v12, 0x17f

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v2 .. v13}, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;->copy$default(Lio/getstream/chat/android/client/events/ReactionDeletedEvent;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;ILjava/lang/Object;)Lio/getstream/chat/android/client/events/ReactionDeletedEvent;

    move-result-object v0

    return-object v0

    :cond_5
    instance-of v1, v0, Lio/getstream/chat/android/client/events/ChannelUpdatedEvent;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    move-object v3, v0

    check-cast v3, Lio/getstream/chat/android/client/events/ChannelUpdatedEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/ChannelUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/ChannelUpdatedEvent;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->enrichWithCid(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    :cond_6
    move-object v11, v2

    const/16 v12, 0x7f

    const/4 v13, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v13}, Lio/getstream/chat/android/client/events/ChannelUpdatedEvent;->copy$default(Lio/getstream/chat/android/client/events/ChannelUpdatedEvent;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;ILjava/lang/Object;)Lio/getstream/chat/android/client/events/ChannelUpdatedEvent;

    move-result-object v0

    return-object v0

    :cond_7
    instance-of v1, v0, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;

    if-eqz v1, :cond_9

    move-object v3, v0

    check-cast v3, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->enrichWithCid(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    :cond_8
    move-object v12, v2

    const/16 v13, 0xff

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v3 .. v14}, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;->copy$default(Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;ILjava/lang/Object;)Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;

    move-result-object v0

    return-object v0

    :cond_9
    instance-of v1, v0, Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;

    if-eqz v1, :cond_b

    move-object v3, v0

    check-cast v3, Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->enrichWithCid(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    :cond_a
    move-object v12, v2

    const/16 v13, 0xff

    const/4 v14, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v3 .. v14}, Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;->copy$default(Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;ILjava/lang/Object;)Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;

    move-result-object v0

    return-object v0

    :cond_b
    instance-of v1, v0, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;

    if-eqz v1, :cond_c

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->enrichWithCid(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v10

    const/16 v13, 0x37f

    const/4 v14, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v2 .. v14}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->copy$default(Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Message;IIILjava/lang/Object;)Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;

    move-result-object v0

    return-object v0

    :cond_c
    instance-of v1, v0, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;

    if-eqz v1, :cond_d

    move-object v2, v0

    check-cast v2, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;->getCid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->enrichWithCid(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v7

    const/16 v13, 0x3ef

    const/4 v14, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v2 .. v14}, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;->copy$default(Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;Ljava/util/Date;Ljava/lang/String;IIILjava/lang/Object;)Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;

    move-result-object v0

    :cond_d
    return-object v0
.end method
