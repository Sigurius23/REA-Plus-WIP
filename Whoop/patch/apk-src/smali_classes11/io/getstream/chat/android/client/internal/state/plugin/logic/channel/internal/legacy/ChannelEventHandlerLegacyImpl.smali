.class public final Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandler;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010#R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010$R\u0014\u0010(\u001a\u00020%8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandler;",
        "",
        "cid",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;",
        "stateLogic",
        "Lkotlin/Function0;",
        "getCurrentUserId",
        "<init>",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Lc93/a;)V",
        "Lio/getstream/chat/android/client/events/CidEvent;",
        "event",
        "Ll83/a0;",
        "handleCidEvent",
        "(Lio/getstream/chat/android/client/events/CidEvent;)V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "",
        "preserveCreatedLocallyAt",
        "upsertMessage",
        "(Lio/getstream/chat/android/models/Message;Z)V",
        "id",
        "getMessage",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;",
        "messageId",
        "Lio/getstream/chat/android/models/MessageReminder;",
        "reminder",
        "updateReminder",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/MessageReminder;)V",
        "deleteReminder",
        "(Ljava/lang/String;)V",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "handle",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)V",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;",
        "Lc93/a;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;",
        "getMutableState",
        "()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;",
        "mutableState",
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
.field private final cid:Ljava/lang/String;

.field private final getCurrentUserId:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateLogic"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getCurrentUserId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->cid:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->getCurrentUserId:Lc93/a;

    return-void
.end method

.method private final deleteReminder(Ljava/lang/String;)V
    .locals 54

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->writeChannelState()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    const v52, 0xefff

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

    const/16 v51, -0x1

    invoke-static/range {v2 .. v53}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->upsertMessage$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)V

    return-void
.end method

.method private final getMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;
    .locals 54

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->writeChannelState()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getVisibleMessages$stream_chat_android_client_release()Lec3/f2;

    move-result-object v1

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    move-object/from16 v2, p1

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Message;

    if-eqz v2, :cond_0

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

    const/16 v51, -0x1

    invoke-static/range {v2 .. v53}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    return-object v1

    :cond_0
    const/4 v1, 0x0

    return-object v1
.end method

.method private final getMutableState()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->writeChannelState()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    move-result-object v0

    return-object v0
.end method

.method private final handleCidEvent(Lio/getstream/chat/android/client/events/CidEvent;)V
    .locals 59

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lio/getstream/chat/android/client/events/NewMessageEvent;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    check-cast v1, Lio/getstream/chat/android/client/events/NewMessageEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->getCurrentUserId:Lc93/a;

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v4

    invoke-direct {v0, v4, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->upsertMessage(Lio/getstream/chat/android/models/Message;Z)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateCurrentUserRead(Ljava/util/Date;Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getShadowed()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->setHidden(Z)V

    :cond_0
    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getChannelMessageCount()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateMessageCount(I)V

    :cond_1
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateLastMessageAt(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_2
    instance-of v2, v1, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_5

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->writeChannelState()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getInsideSearch()Lec3/f2;

    move-result-object v2

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_3

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-static {v0, v2, v3, v4, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->upsertMessage$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)V

    :cond_3
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateCurrentUserRead(Ljava/util/Date;Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getShadowed()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->setHidden(Z)V

    :cond_4
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateLastMessageAt(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_5
    instance-of v2, v1, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    if-eqz v2, :cond_9

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->writeChannelState()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    move-result-object v2

    check-cast v1, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v6

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v6

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v6

    if-nez v6, :cond_6

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v6

    :cond_6
    move-object/from16 v50, v6

    goto :goto_0

    :cond_7
    move-object/from16 v50, v5

    :goto_0
    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getReplyMessageId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->writeChannelState()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    move-result-object v6

    invoke-virtual {v6, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    if-eqz v2, :cond_8

    :goto_1
    move-object/from16 v38, v2

    goto :goto_2

    :cond_8
    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getReplyTo()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    goto :goto_1

    :goto_2
    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v7

    const v57, 0xfbff

    const/16 v58, 0x0

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

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const v56, -0x40000001    # -1.9999999f

    invoke-static/range {v7 .. v58}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-static {v0, v1, v3, v4, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->upsertMessage$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)V

    return-void

    :cond_9
    instance-of v2, v1, Lio/getstream/chat/android/client/events/MessageDeletedEvent;

    if-eqz v2, :cond_b

    check-cast v1, Lio/getstream/chat/android/client/events/MessageDeletedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getHardDelete()Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->deleteMessage(Lio/getstream/chat/android/models/Message;)V

    goto :goto_3

    :cond_a
    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-static {v0, v2, v3, v4, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->upsertMessage$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)V

    :goto_3
    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getChannelMessageCount()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_31

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateMessageCount(I)V

    return-void

    :cond_b
    instance-of v2, v1, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;

    if-eqz v2, :cond_c

    check-cast v1, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-static {v0, v1, v3, v4, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->upsertMessage$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)V

    return-void

    :cond_c
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ReactionNewEvent;

    if-eqz v2, :cond_d

    check-cast v1, Lio/getstream/chat/android/client/events/ReactionNewEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ReactionNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-static {v0, v1, v3, v4, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->upsertMessage$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)V

    return-void

    :cond_d
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;

    if-eqz v2, :cond_e

    check-cast v1, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-static {v0, v1, v3, v4, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->upsertMessage$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)V

    return-void

    :cond_e
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;

    if-eqz v2, :cond_f

    check-cast v1, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-static {v0, v1, v3, v4, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->upsertMessage$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)V

    return-void

    :cond_f
    instance-of v2, v1, Lio/getstream/chat/android/client/events/MemberAddedEvent;

    if-eqz v2, :cond_10

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/MemberAddedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MemberAddedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->addMember(Lio/getstream/chat/android/models/Member;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MemberAddedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->getCurrentUserId:Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_31

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MemberAddedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->addMembership(Lio/getstream/chat/android/models/Member;)V

    return-void

    :cond_10
    instance-of v2, v1, Lio/getstream/chat/android/client/events/MemberRemovedEvent;

    if-eqz v2, :cond_11

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/MemberRemovedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MemberRemovedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->deleteMember(Lio/getstream/chat/android/models/Member;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MemberRemovedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->getCurrentUserId:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_31

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->removeMembership()V

    return-void

    :cond_11
    instance-of v2, v1, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;

    if-eqz v2, :cond_12

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertMember(Lio/getstream/chat/android/models/Member;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateMembership(Lio/getstream/chat/android/models/Member;)V

    return-void

    :cond_12
    instance-of v2, v1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;

    if-eqz v2, :cond_13

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertMembers(Ljava/util/List;)V

    return-void

    :cond_13
    instance-of v2, v1, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;

    if-eqz v2, :cond_14

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Channel;->getMemberCount()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->setMembers(Ljava/util/List;I)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Channel;->getWatchers()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getWatcherCount()I

    move-result v1

    invoke-virtual {v2, v3, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->setWatchers(Ljava/util/List;I)V

    return-void

    :cond_14
    instance-of v2, v1, Lio/getstream/chat/android/client/events/UserStartWatchingEvent;

    if-eqz v2, :cond_15

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/UserStartWatchingEvent;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertWatcher(Lio/getstream/chat/android/client/events/UserStartWatchingEvent;)V

    return-void

    :cond_15
    instance-of v2, v1, Lio/getstream/chat/android/client/events/UserStopWatchingEvent;

    if-eqz v2, :cond_16

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/UserStopWatchingEvent;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->deleteWatcher(Lio/getstream/chat/android/client/events/UserStopWatchingEvent;)V

    return-void

    :cond_16
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ChannelUpdatedEvent;

    if-eqz v2, :cond_17

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/HasChannel;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateChannelData(Lio/getstream/chat/android/client/events/HasChannel;)V

    return-void

    :cond_17
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;

    if-eqz v2, :cond_18

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/HasChannel;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateChannelData(Lio/getstream/chat/android/client/events/HasChannel;)V

    return-void

    :cond_18
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;

    const/4 v6, 0x1

    if-eqz v2, :cond_19

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v2, v6}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->setHidden(Z)V

    check-cast v1, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;->getClearHistory()Z

    move-result v2

    if-eqz v2, :cond_31

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v1

    invoke-static {v2, v1, v5, v4, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->removeMessagesBefore$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Ljava/util/Date;Lio/getstream/chat/android/models/Message;ILjava/lang/Object;)V

    return-void

    :cond_19
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ChannelVisibleEvent;

    if-eqz v2, :cond_1a

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v1, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->setHidden(Z)V

    return-void

    :cond_1a
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;

    if-eqz v2, :cond_1b

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v3

    invoke-static {v2, v3, v5, v4, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->removeMessagesBefore$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Ljava/util/Date;Lio/getstream/chat/android/models/Message;ILjava/lang/Object;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->deleteChannel(Ljava/util/Date;)V

    return-void

    :cond_1b
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;

    if-eqz v2, :cond_1c

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->removeMessagesBefore(Ljava/util/Date;Lio/getstream/chat/android/models/Message;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/HasChannel;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateChannelData(Lio/getstream/chat/android/client/events/HasChannel;)V

    return-void

    :cond_1c
    instance-of v2, v1, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;

    if-eqz v2, :cond_1d

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v3

    invoke-static {v2, v3, v5, v4, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->removeMessagesBefore$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Ljava/util/Date;Lio/getstream/chat/android/models/Message;ILjava/lang/Object;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/HasChannel;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateChannelData(Lio/getstream/chat/android/client/events/HasChannel;)V

    return-void

    :cond_1d
    instance-of v2, v1, Lio/getstream/chat/android/client/events/TypingStartEvent;

    if-eqz v2, :cond_1e

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/TypingStartEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/TypingStartEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->setTyping(Ljava/lang/String;Lio/getstream/chat/android/client/events/TypingStartEvent;)V

    return-void

    :cond_1e
    instance-of v2, v1, Lio/getstream/chat/android/client/events/TypingStopEvent;

    if-eqz v2, :cond_1f

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/TypingStopEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/TypingStopEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->setTyping(Ljava/lang/String;Lio/getstream/chat/android/client/events/TypingStartEvent;)V

    return-void

    :cond_1f
    instance-of v2, v1, Lio/getstream/chat/android/client/events/MessageReadEvent;

    if-eqz v2, :cond_20

    check-cast v1, Lio/getstream/chat/android/client/events/MessageReadEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageReadEvent;->getThread()Lio/getstream/chat/android/models/ThreadInfo;

    move-result-object v2

    if-nez v2, :cond_31

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;->toChannelUserRead(Lio/getstream/chat/android/client/events/MessageReadEvent;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateRead(Lio/getstream/chat/android/models/ChannelUserRead;)V

    return-void

    :cond_20
    instance-of v2, v1, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;

    if-eqz v2, :cond_21

    check-cast v1, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;->getThread()Lio/getstream/chat/android/models/ThreadInfo;

    move-result-object v2

    if-nez v2, :cond_31

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;->toChannelUserRead(Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateRead(Lio/getstream/chat/android/models/ChannelUserRead;)V

    return-void

    :cond_21
    instance-of v2, v1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;

    if-eqz v2, :cond_22

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;->toChannelUserRead(Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateRead(Lio/getstream/chat/android/models/ChannelUserRead;)V

    return-void

    :cond_22
    instance-of v2, v1, Lio/getstream/chat/android/client/events/MessageDeliveredEvent;

    if-eqz v2, :cond_23

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/MessageDeliveredEvent;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;->toChannelUserRead(Lio/getstream/chat/android/client/events/MessageDeliveredEvent;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateDelivered(Lio/getstream/chat/android/models/ChannelUserRead;)V

    return-void

    :cond_23
    instance-of v2, v1, Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;

    if-eqz v2, :cond_24

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->addMember(Lio/getstream/chat/android/models/Member;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/HasChannel;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateChannelData(Lio/getstream/chat/android/client/events/HasChannel;)V

    return-void

    :cond_24
    instance-of v2, v1, Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;

    if-eqz v2, :cond_25

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->deleteMember(Lio/getstream/chat/android/models/Member;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/HasChannel;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateChannelData(Lio/getstream/chat/android/client/events/HasChannel;)V

    return-void

    :cond_25
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;

    if-eqz v2, :cond_26

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;->getExpiration()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;->getShadow()Z

    move-result v1

    invoke-virtual {v2, v3, v6, v4, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateMemberBanned(Ljava/lang/String;ZLjava/util/Date;Z)V

    return-void

    :cond_26
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ChannelUserUnbannedEvent;

    if-eqz v2, :cond_27

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/ChannelUserUnbannedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ChannelUserUnbannedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3, v5, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateMemberBanned(Ljava/lang/String;ZLjava/util/Date;Z)V

    return-void

    :cond_27
    instance-of v2, v1, Lio/getstream/chat/android/client/events/PollClosedEvent;

    if-eqz v2, :cond_28

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/PollClosedEvent;

    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl$handleCidEvent$3;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-direct {v3, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl$handleCidEvent$3;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v3}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/PollClosedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertPoll(Lio/getstream/chat/android/models/Poll;)V

    return-void

    :cond_28
    instance-of v2, v1, Lio/getstream/chat/android/client/events/PollUpdatedEvent;

    if-eqz v2, :cond_29

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/PollUpdatedEvent;

    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl$handleCidEvent$4;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-direct {v3, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl$handleCidEvent$4;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v3}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/PollUpdatedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertPoll(Lio/getstream/chat/android/models/Poll;)V

    return-void

    :cond_29
    instance-of v2, v1, Lio/getstream/chat/android/client/events/PollDeletedEvent;

    if-eqz v2, :cond_2a

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/PollDeletedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/PollDeletedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->deletePoll(Lio/getstream/chat/android/models/Poll;)V

    return-void

    :cond_2a
    instance-of v2, v1, Lio/getstream/chat/android/client/events/VoteCastedEvent;

    if-eqz v2, :cond_2b

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/VoteCastedEvent;

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->getCurrentUserId:Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v4, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl$handleCidEvent$5;

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl$handleCidEvent$5;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v3, v4}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/VoteCastedEvent;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertPoll(Lio/getstream/chat/android/models/Poll;)V

    return-void

    :cond_2b
    instance-of v2, v1, Lio/getstream/chat/android/client/events/VoteChangedEvent;

    if-eqz v2, :cond_2c

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/VoteChangedEvent;

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->getCurrentUserId:Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v4, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl$handleCidEvent$6;

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl$handleCidEvent$6;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v3, v4}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/VoteChangedEvent;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertPoll(Lio/getstream/chat/android/models/Poll;)V

    return-void

    :cond_2c
    instance-of v2, v1, Lio/getstream/chat/android/client/events/VoteRemovedEvent;

    if-eqz v2, :cond_2d

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/VoteRemovedEvent;

    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl$handleCidEvent$7;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-direct {v3, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl$handleCidEvent$7;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v3}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/VoteRemovedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertPoll(Lio/getstream/chat/android/models/Poll;)V

    return-void

    :cond_2d
    instance-of v2, v1, Lio/getstream/chat/android/client/events/AnswerCastedEvent;

    if-eqz v2, :cond_2e

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast v1, Lio/getstream/chat/android/client/events/AnswerCastedEvent;

    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl$handleCidEvent$8;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-direct {v3, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl$handleCidEvent$8;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v3}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/AnswerCastedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertPoll(Lio/getstream/chat/android/models/Poll;)V

    return-void

    :cond_2e
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ReminderCreatedEvent;

    if-eqz v2, :cond_2f

    check-cast v1, Lio/getstream/chat/android/client/events/ReminderCreatedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ReminderCreatedEvent;->getMessageId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ReminderCreatedEvent;->getReminder()Lio/getstream/chat/android/models/MessageReminder;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->updateReminder(Ljava/lang/String;Lio/getstream/chat/android/models/MessageReminder;)V

    return-void

    :cond_2f
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ReminderUpdatedEvent;

    if-eqz v2, :cond_30

    check-cast v1, Lio/getstream/chat/android/client/events/ReminderUpdatedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ReminderUpdatedEvent;->getMessageId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ReminderUpdatedEvent;->getReminder()Lio/getstream/chat/android/models/MessageReminder;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->updateReminder(Ljava/lang/String;Lio/getstream/chat/android/models/MessageReminder;)V

    return-void

    :cond_30
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ReminderDeletedEvent;

    if-eqz v2, :cond_31

    check-cast v1, Lio/getstream/chat/android/client/events/ReminderDeletedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ReminderDeletedEvent;->getMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->deleteReminder(Ljava/lang/String;)V

    :cond_31
    return-void
.end method

.method private final updateReminder(Ljava/lang/String;Lio/getstream/chat/android/models/MessageReminder;)V
    .locals 54

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->writeChannelState()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    invoke-static/range {p2 .. p2}, Lio/getstream/chat/android/client/extensions/internal/MessageReminderKt;->toMessageReminderInfo(Lio/getstream/chat/android/models/MessageReminder;)Lio/getstream/chat/android/models/MessageReminderInfo;

    move-result-object v47

    const v52, 0xefff

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

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, -0x1

    invoke-static/range {v2 .. v53}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->upsertMessage$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)V

    return-void
.end method

.method private final upsertMessage(Lio/getstream/chat/android/models/Message;Z)V
    .locals 55

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->getMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    if-eqz p2, :cond_1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v2

    :goto_0
    move-object/from16 v26, v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v2

    goto :goto_0

    :goto_1
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    move-object/from16 v21, v1

    goto :goto_4

    :cond_3
    :goto_3
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v1

    goto :goto_2

    :goto_4
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

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

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

    const v52, -0x420001

    move-object/from16 v3, p1

    invoke-static/range {v3 .. v54}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->delsertPinnedMessage(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public static synthetic upsertMessage$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;Lio/getstream/chat/android/models/Message;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->upsertMessage(Lio/getstream/chat/android/models/Message;Z)V

    return-void
.end method


# virtual methods
.method public final handle(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lio/getstream/chat/android/client/events/CidEvent;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/client/events/CidEvent;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->handleCidEvent(Lio/getstream/chat/android/client/events/CidEvent;)V

    return-void

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/client/events/UserPresenceChangedEvent;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast p1, Lio/getstream/chat/android/client/events/UserPresenceChangedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserPresenceChangedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertUserPresence(Lio/getstream/chat/android/models/User;)V

    return-void

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/client/events/UserUpdatedEvent;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast p1, Lio/getstream/chat/android/client/events/UserUpdatedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserUpdatedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertUserPresence(Lio/getstream/chat/android/models/User;)V

    return-void

    :cond_2
    instance-of v0, p1, Lio/getstream/chat/android/client/events/MarkAllReadEvent;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast p1, Lio/getstream/chat/android/client/events/MarkAllReadEvent;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;->toChannelUserRead(Lio/getstream/chat/android/client/events/MarkAllReadEvent;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateRead(Lio/getstream/chat/android/models/ChannelUserRead;)V

    return-void

    :cond_3
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationChannelMutesUpdatedEvent;

    if-eqz v0, :cond_8

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationChannelMutesUpdatedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationChannelMutesUpdatedEvent;->getMe()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getChannelMutes()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/ChannelMute;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/ChannelMute;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_6
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->cid:Ljava/lang/String;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    :cond_7
    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateMute(Z)V

    return-void

    :cond_8
    instance-of v0, p1, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast p1, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;->getHardDelete()Z

    move-result v2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->deleteMessagesFromUser(Ljava/lang/String;ZLjava/util/Date;)V

    :cond_9
    return-void
.end method
