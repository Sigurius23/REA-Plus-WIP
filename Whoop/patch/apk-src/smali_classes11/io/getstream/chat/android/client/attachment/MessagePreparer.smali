.class public final Lio/getstream/chat/android/client/attachment/MessagePreparer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J&\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/client/attachment/MessagePreparer;",
        "",
        "clientState",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "channelStateLogicProvider",
        "Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;",
        "<init>",
        "(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;)V",
        "prepareMessage",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "channelId",
        "",
        "channelType",
        "user",
        "Lio/getstream/chat/android/models/User;",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final channelStateLogicProvider:Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;

.field private final clientState:Lio/getstream/chat/android/client/setup/state/ClientState;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;)V
    .locals 1

    const-string v0, "clientState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/attachment/MessagePreparer;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    iput-object p2, p0, Lio/getstream/chat/android/client/attachment/MessagePreparer;->channelStateLogicProvider:Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;

    return-void
.end method


# virtual methods
.method public final prepareMessage(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/Message;
    .locals 57

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "message"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "channelId"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "channelType"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "user"

    move-object/from16 v5, p4

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Lio/getstream/chat/android/client/attachment/MessagePreparer;->channelStateLogicProvider:Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;

    const/4 v6, 0x0

    if-eqz v4, :cond_0

    invoke-interface {v4, v3, v2}, Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;->channelStateLogic(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v6

    :goto_0
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lio/getstream/chat/android/client/attachment/MessagePreparerKt;->prepareForUpload(Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    invoke-static {v1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->ensureId(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object v5

    invoke-static {v1}, Lio/getstream/chat/android/client/utils/internal/MessageUtilsKt;->getMessageType(Lio/getstream/chat/android/models/Message;)Ljava/lang/String;

    move-result-object v21

    new-instance v7, Ljava/util/Date;

    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    invoke-static {v1, v7}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v28

    move-object v1, v12

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v7

    instance-of v7, v7, Lio/getstream/chat/android/models/Attachment$UploadState$Idle;

    if-eqz v7, :cond_2

    sget-object v1, Lio/getstream/chat/android/models/SyncStatus;->AWAITING_ATTACHMENTS:Lio/getstream/chat/android/models/SyncStatus;

    :goto_1
    move-object/from16 v20, v1

    goto :goto_3

    :cond_3
    :goto_2
    iget-object v1, v0, Lio/getstream/chat/android/client/attachment/MessagePreparer;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v1}, Lio/getstream/chat/android/client/setup/state/ClientState;->isNetworkAvailable()Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v1, Lio/getstream/chat/android/models/SyncStatus;->IN_PROGRESS:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_1

    :cond_4
    sget-object v1, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_1

    :goto_3
    const v55, 0xffff

    const/16 v56, 0x0

    move-object v1, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const v54, -0xc0c041

    move-object/from16 v29, p4

    invoke-static/range {v5 .. v56}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v6

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_5

    move-object v5, v6

    goto :goto_4

    :cond_5
    move-object v5, v1

    :goto_4
    if-eqz v5, :cond_6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->enrichWithCid(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    if-eqz v2, :cond_6

    move-object v6, v2

    :cond_6
    if-eqz v4, :cond_7

    invoke-interface {v4}, Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;->channelState()Lio/getstream/chat/android/client/channel/state/ChannelState;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-interface {v2}, Lio/getstream/chat/android/client/channel/state/ChannelState;->toChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-static {v6, v2}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->populateMentions(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    if-eqz v2, :cond_7

    move-object v6, v2

    :cond_7
    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getReplyMessageId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    if-eqz v4, :cond_8

    invoke-interface {v4, v1}, Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;->setRepliedMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_8
    return-object v6
.end method
