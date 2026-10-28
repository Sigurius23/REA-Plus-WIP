.class public final Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J;\u0010\u0012\u001a\u00020\u00112\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\'\u0010\u0018\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\n\u0010\u0017\u001a\u0006\u0012\u0002\u0008\u00030\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\n*\u00020\n2\n\u0010\u0017\u001a\u0006\u0012\u0002\u0008\u00030\u0016H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ:\u0010\u001c\u001a\u00020\u00112\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ@\u0010\u001e\u001a\u00020\u00112\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0016H\u0096@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ2\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00162\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;",
        "Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "logic",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;)V",
        "",
        "cid",
        "Lio/getstream/chat/android/models/Reaction;",
        "reaction",
        "",
        "enforceUnique",
        "skipPush",
        "Lio/getstream/chat/android/models/User;",
        "currentUser",
        "Ll83/a0;",
        "saveReactionInState",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLjava/lang/Boolean;Lio/getstream/chat/android/models/User;)V",
        "Lio/getstream/chat/android/models/Message;",
        "originReaction",
        "Ln23/h;",
        "result",
        "updateReactionSyncStatus",
        "(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;Ln23/h;)Lio/getstream/chat/android/models/Message;",
        "updateSyncStatus",
        "(Lio/getstream/chat/android/models/Reaction;Ln23/h;)Lio/getstream/chat/android/models/Reaction;",
        "onSendReactionRequest",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "onSendReactionResult",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "onSendReactionPrecondition",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
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

.field private final logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;)V
    .locals 1

    const-string v0, "logic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    return-void
.end method

.method private final saveReactionInState(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLjava/lang/Boolean;Lio/getstream/chat/android/models/User;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v0}, Lio/getstream/chat/android/client/setup/state/ClientState;->isNetworkAvailable()Z

    move-result v0

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    invoke-static {p2, p5, v0, p3, p4}, Lio/getstream/chat/android/client/extensions/internal/ReactionKt;->enrichWithDataBeforeSending(Lio/getstream/chat/android/models/Reaction;Lio/getstream/chat/android/models/User;ZZZ)Lio/getstream/chat/android/models/Reaction;

    move-result-object p4

    if-eqz p1, :cond_1

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object p1

    iget-object p5, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p5, Ljava/lang/String;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {v0, p5, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p1, p5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channelFromMessageId(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p1

    :goto_1
    const/4 p5, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->getMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0, p4, p3}, Lio/getstream/chat/android/client/extensions/internal/MessageReactionsKt;->addMyReaction(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;Z)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, p5

    :goto_2
    if-eqz v0, :cond_3

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getActiveQueryThreadsLogic()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->getMessage$stream_chat_android_client_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-static {v1, p4, p3}, Lio/getstream/chat/android/client/extensions/internal/MessageReactionsKt;->addMyReaction(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;Z)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    goto :goto_4

    :cond_5
    move-object v1, p5

    :goto_4
    if-eqz v1, :cond_4

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->upsertMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V

    goto :goto_3

    :cond_6
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->threadFromMessageId(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->getMessage$stream_chat_android_client_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-static {p2, p4, p3}, Lio/getstream/chat/android/client/extensions/internal/MessageReactionsKt;->addMyReaction(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;Z)Lio/getstream/chat/android/models/Message;

    move-result-object p5

    :cond_7
    if-eqz p5, :cond_8

    invoke-virtual {p1, p5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->upsertMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V

    :cond_8
    return-void
.end method

.method private final updateReactionSyncStatus(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;Ln23/h;)Lio/getstream/chat/android/models/Message;
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lio/getstream/chat/android/models/Reaction;",
            "Ln23/h;",
            ")",
            "Lio/getstream/chat/android/models/Message;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Reaction;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/Reaction;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-direct {v0, v5, v1}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->updateSyncStatus(Lio/getstream/chat/android/models/Reaction;Ln23/h;)Lio/getstream/chat/android/models/Reaction;

    move-result-object v5

    :cond_0
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getLatestReactions()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Reaction;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/Reaction;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-direct {v0, v4, v1}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->updateSyncStatus(Lio/getstream/chat/android/models/Reaction;Ln23/h;)Lio/getstream/chat/android/models/Reaction;

    move-result-object v4

    :cond_2
    invoke-interface {v5, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    const v53, 0xffff

    const/16 v54, 0x0

    const/4 v4, 0x0

    move-object/from16 v20, v5

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

    const/16 v51, 0x0

    const v52, -0x30001

    move-object/from16 v21, v3

    move-object/from16 v3, p1

    invoke-static/range {v3 .. v54}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    return-object v1
.end method

.method private final updateSyncStatus(Lio/getstream/chat/android/models/Reaction;Ln23/h;)Lio/getstream/chat/android/models/Reaction;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Reaction;",
            "Ln23/h;",
            ")",
            "Lio/getstream/chat/android/models/Reaction;"
        }
    .end annotation

    move-object/from16 v0, p2

    instance-of v1, v0, Ln23/g;

    if-eqz v1, :cond_0

    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    :goto_0
    move-object v11, v0

    goto :goto_1

    :cond_0
    instance-of v1, v0, Ln23/f;

    if-eqz v1, :cond_2

    check-cast v0, Ln23/f;

    iget-object v0, v0, Ln23/f;->a:Ln23/e;

    invoke-static {v0}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->isPermanent(Ln23/e;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->FAILED_PERMANENTLY:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_0

    :cond_1
    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_0

    :goto_1
    const/16 v16, 0x3dff

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v17}, Lio/getstream/chat/android/models/Reaction;->copy$default(Lio/getstream/chat/android/models/Reaction;Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;Ljava/util/Map;ZZLjava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/Reaction;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method


# virtual methods
.method public final onSendReactionPrecondition(Ljava/lang/String;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/models/Reaction;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-nez p2, :cond_0

    new-instance p1, Ln23/f;

    new-instance p2, Ln23/a;

    const-string p3, "Current user is null!"

    invoke-direct {p2, p3}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_0
    invoke-virtual {p3}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ln23/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, p2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_2
    :goto_0
    new-instance p1, Ln23/f;

    new-instance p2, Ln23/a;

    const-string p3, "Reaction::messageId and Reaction::type cannot be empty!"

    invoke-direct {p2, p3}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1
.end method

.method public final onSendReactionRequest(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Reaction;",
            "ZZ",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p4

    move-object p6, p5

    move-object p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p6}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->saveReactionInState(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLjava/lang/Boolean;Lio/getstream/chat/android/models/User;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onSendReactionResult(Ljava/lang/String;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/models/User;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Reaction;",
            "Z",
            "Lio/getstream/chat/android/models/User;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object p1

    iget-object p3, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast p3, Ljava/lang/String;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p4, p3, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channelFromMessageId(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->getMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-direct {p0, p3, p2, p5}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->updateReactionSyncStatus(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;Ln23/h;)Lio/getstream/chat/android/models/Message;

    move-result-object p3

    invoke-interface {p1, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->getActiveQueryThreadsLogic()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->getMessage$stream_chat_android_client_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object p4

    if-eqz p4, :cond_3

    invoke-direct {p0, p4, p2, p5}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->updateReactionSyncStatus(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;Ln23/h;)Lio/getstream/chat/android/models/Message;

    move-result-object p4

    goto :goto_2

    :cond_3
    const/4 p4, 0x0

    :goto_2
    if-eqz p4, :cond_2

    invoke-virtual {p3, p4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->upsertMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->logic:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->threadFromMessageId(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->getMessage$stream_chat_android_client_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object p3

    if-eqz p3, :cond_5

    invoke-direct {p0, p3, p2, p5}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/SendReactionListenerState;->updateReactionSyncStatus(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;Ln23/h;)Lio/getstream/chat/android/models/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->upsertMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V

    :cond_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
