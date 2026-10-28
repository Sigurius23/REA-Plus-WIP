.class public final Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J6\u0010\u0018\u001a\u00020\n2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00142\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "logic",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V",
        "",
        "cid",
        "Lio/getstream/chat/android/models/Message;",
        "processedMessage",
        "Ll83/a0;",
        "handleSendMessageSuccess",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V",
        "message",
        "Ln23/e;",
        "error",
        "handleSendMessageFailure",
        "(Lio/getstream/chat/android/models/Message;Ln23/e;)V",
        "updateState",
        "(Lio/getstream/chat/android/models/Message;)V",
        "Ln23/h;",
        "result",
        "channelType",
        "channelId",
        "onMessageSendResult",
        "(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
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
.field private final logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)V
    .locals 1

    const-string v0, "logic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    return-void
.end method

.method private final handleSendMessageFailure(Lio/getstream/chat/android/models/Message;Ln23/e;)V
    .locals 53

    invoke-static/range {p2 .. p2}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->isPermanent(Ln23/e;)Z

    move-result v0

    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    const-string v3, "Chat:SendMessageHandler"

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Lb23/i;->c:Lb23/j;

    const-string v4, "[handleSendMessageFailure] isPermanentError: "

    invoke-static {v4, v0}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-interface {v1, v2, v3, v4, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    if-eqz v0, :cond_1

    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->FAILED_PERMANENTLY:Lio/getstream/chat/android/models/SyncStatus;

    :goto_0
    move-object/from16 v16, v0

    goto :goto_1

    :cond_1
    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_0

    :goto_1
    new-instance v23, Ljava/util/Date;

    invoke-direct/range {v23 .. v23}, Ljava/util/Date;-><init>()V

    const v51, 0xffff

    const/16 v52, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

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

    const v50, -0x204001

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;->updateState(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method private final handleSendMessageSuccess(Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V
    .locals 53

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->enrichWithCid(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    sget-object v16, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    const v51, 0xffff

    const/16 v52, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

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

    const/16 v50, -0x4001

    invoke-static/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;->updateState(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method private final updateState(Lio/getstream/chat/android/models/Message;)V
    .locals 54

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v1

    :goto_0
    move-object/from16 v25, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    const v52, 0xffff

    const/16 v53, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

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

    const v51, -0x400001

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v53}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channelFromMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_1
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getActiveQueryThreadsLogic()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;

    invoke-virtual {v3, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->upsertMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V

    goto :goto_2

    :cond_2
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->threadFromMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->upsertMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V

    :cond_3
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getActiveQueryChannelsLogic()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->refreshChannelState$stream_chat_android_client_release(Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    return-void
.end method


# virtual methods
.method public final onMessageSendResult(Ln23/h;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string p5, ":"

    invoke-static {p2, p5, p3}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p4}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p3, p5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object p3

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    sget-object p5, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    if-ne p3, p5, :cond_1

    return-object v0

    :cond_1
    instance-of p3, p1, Ln23/g;

    if-eqz p3, :cond_2

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    invoke-direct {p0, p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;->handleSendMessageSuccess(Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V

    goto :goto_1

    :cond_2
    instance-of p2, p1, Ln23/f;

    if-eqz p2, :cond_3

    check-cast p1, Ln23/f;

    iget-object p1, p1, Ln23/f;->a:Ln23/e;

    invoke-direct {p0, p4, p1}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendMessageListenerState;->handleSendMessageFailure(Lio/getstream/chat/android/models/Message;Ln23/e;)V

    :goto_1
    return-object v0

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
