.class public final Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u001e\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J&\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u00102\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0012H\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;",
        "Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "logic",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "Lio/getstream/chat/android/client/api/state/GlobalState;",
        "globalState",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/api/state/GlobalState;)V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "Ll83/a0;",
        "updateMessage",
        "(Lio/getstream/chat/android/models/Message;)V",
        "deleteMessage",
        "",
        "messageId",
        "Ln23/h;",
        "onMessageDeletePrecondition",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "onMessageDeleteRequest",
        "originalMessageId",
        "result",
        "onMessageDeleteResult",
        "(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "Lio/getstream/chat/android/client/api/state/GlobalState;",
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
.field private final clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

.field private final globalState:Lio/getstream/chat/android/client/api/state/GlobalState;

.field private final logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/api/state/GlobalState;)V
    .locals 1

    const-string v0, "logic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "globalState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->globalState:Lio/getstream/chat/android/client/api/state/GlobalState;

    return-void
.end method

.method private final deleteMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channelFromMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->deleteMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getActiveQueryThreadsLogic()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;

    invoke-virtual {v1, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->deleteMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->threadFromMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->deleteMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V

    :cond_2
    return-void
.end method

.method private final updateMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channelFromMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getActiveQueryThreadsLogic()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;

    invoke-virtual {v1, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->upsertMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->threadFromMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->upsertMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final onMessageDeletePrecondition(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channelFromMessageId(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->getMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {p2}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object p2

    check-cast p2, Lec3/h2;

    invoke-virtual {p2}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/User;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    :cond_1
    if-nez p1, :cond_2

    new-instance p1, Ln23/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, p2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_2
    invoke-static {p1, v0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->shouldDeleteRemote(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Ln23/h;

    move-result-object p2

    instance-of v0, p2, Ln23/f;

    if-eqz v0, :cond_3

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->deleteMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_3
    return-object p2
.end method

.method public final onMessageDeleteRequest(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channelFromMessageId(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->getMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v1}, Lio/getstream/chat/android/client/setup/state/ClientState;->isNetworkAvailable()Z

    move-result v1

    new-instance v24, Ljava/util/Date;

    invoke-direct/range {v24 .. v24}, Ljava/util/Date;-><init>()V

    if-nez v1, :cond_0

    sget-object v1, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    :goto_0
    move-object/from16 v18, v1

    goto :goto_1

    :cond_0
    sget-object v1, Lio/getstream/chat/android/models/SyncStatus;->IN_PROGRESS:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_0

    :goto_1
    const v53, 0xffff

    const/16 v54, 0x0

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

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

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

    const/16 v50, 0x0

    const/16 v51, 0x0

    const v52, -0x104001

    invoke-static/range {v3 .. v54}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->updateMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method public final onMessageDeleteResult(Ljava/lang/String;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Ln23/g;

    if-eqz v3, :cond_0

    move-object v1, v2

    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Message;

    sget-object v17, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

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

    const/16 v50, 0x0

    const/16 v51, -0x4001

    invoke-static/range {v2 .. v53}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->updateMessage(Lio/getstream/chat/android/models/Message;)V

    goto :goto_0

    :cond_0
    instance-of v2, v2, Ln23/f;

    if-eqz v2, :cond_2

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channelFromMessageId(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->getMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v3

    if-eqz v3, :cond_1

    sget-object v18, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    new-instance v25, Ljava/util/Date;

    invoke-direct/range {v25 .. v25}, Ljava/util/Date;-><init>()V

    const v53, 0xffff

    const/16 v54, 0x0

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

    const/16 v51, 0x0

    const v52, -0x204001

    invoke-static/range {v3 .. v54}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/DeleteMessageListenerState;->updateMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_1
    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_2
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
