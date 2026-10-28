.class public final synthetic Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;


# direct methods
.method public synthetic constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;I)V
    .locals 0

    iput p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;->w:I

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;->x:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;->w:I

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;->x:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;

    packed-switch v0, :pswitch_data_0

    sget v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->a:I

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao_Impl;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0

    :pswitch_0
    sget v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->a:I

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0

    :pswitch_1
    sget v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->a:I

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0

    :pswitch_2
    sget v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->a:I

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0

    :pswitch_3
    sget v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->a:I

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0

    :pswitch_4
    sget v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->a:I

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0

    :pswitch_5
    sget v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->a:I

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0

    :pswitch_6
    sget v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->a:I

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0

    :pswitch_7
    sget v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->a:I

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0

    :pswitch_8
    sget v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->a:I

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0

    :pswitch_9
    sget v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->a:I

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0

    :pswitch_a
    sget v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->a:I

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
