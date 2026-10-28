.class public final Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u0018\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\rH\u0082@\u00a2\u0006\u0004\u0008%\u0010&J\u001d\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\n0\'2\u0006\u0010$\u001a\u00020\rH\u0000\u00a2\u0006\u0004\u0008(\u0010)J\u0018\u0010,\u001a\u00020\n2\u0006\u0010$\u001a\u00020\rH\u0080@\u00a2\u0006\u0004\u0008+\u0010&J&\u00101\u001a\u00020\n2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020-0\'2\u0006\u0010$\u001a\u00020\rH\u0080@\u00a2\u0006\u0004\u0008/\u00100J\u001d\u00106\u001a\u00020\n2\u000c\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u000802H\u0000\u00a2\u0006\u0004\u00084\u00105J\u0019\u0010:\u001a\u0004\u0018\u00010\u00142\u0006\u00107\u001a\u00020 H\u0000\u00a2\u0006\u0004\u00088\u00109J\u0017\u0010<\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\u00a2\u0006\u0004\u0008;\u0010\u0017J\u0017\u0010>\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000\u00a2\u0006\u0004\u0008=\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010@R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008B\u0010C\u001a\u0004\u0008D\u0010ER\u001c\u0010H\u001a\u0008\u0012\u0004\u0012\u00020 0G8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u0010I\u00a8\u0006J"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;",
        "",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;",
        "stateLogic",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;",
        "databaseLogic",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;)V",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "event",
        "Ll83/a0;",
        "handleEvent",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)V",
        "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
        "",
        "isNextPageRequest",
        "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Z",
        "Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;",
        "onNewThreadMessageNotification",
        "(Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;)V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "updateParentOrReply",
        "(Lio/getstream/chat/android/models/Message;)V",
        "Lio/getstream/chat/android/client/events/MessageReadEvent;",
        "markThreadAsRead",
        "(Lio/getstream/chat/android/client/events/MessageReadEvent;)V",
        "Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;",
        "(Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;)V",
        "Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;",
        "markThreadAsUnread",
        "(Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;)V",
        "",
        "cid",
        "deleteThreadsFromChannel",
        "(Ljava/lang/String;)V",
        "request",
        "queryThreadsOffline",
        "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;",
        "Ln23/h;",
        "onQueryThreadsPrecondition$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Ln23/h;",
        "onQueryThreadsPrecondition",
        "onQueryThreadsRequest$stream_chat_android_client_release",
        "onQueryThreadsRequest",
        "Lio/getstream/chat/android/models/QueryThreadsResult;",
        "result",
        "onQueryThreadsResult$stream_chat_android_client_release",
        "(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;",
        "onQueryThreadsResult",
        "",
        "events",
        "handleEvents$stream_chat_android_client_release",
        "(Ljava/util/List;)V",
        "handleEvents",
        "messageId",
        "getMessage$stream_chat_android_client_release",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;",
        "getMessage",
        "upsertMessage$stream_chat_android_client_release",
        "upsertMessage",
        "deleteMessage$stream_chat_android_client_release",
        "deleteMessage",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "",
        "threadIdsInSession",
        "Ljava/util/List;",
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
.field private final databaseLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;

.field private final logger$delegate:Ll83/h;

.field private final stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

.field private threadIdsInSession:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;)V
    .locals 1

    const-string v0, "stateLogic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "databaseLogic"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->databaseLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;

    const-string p1, "Chat:QueryThreadsLogic"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->logger$delegate:Ll83/h;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->threadIdsInSession:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$queryThreadsOffline(Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->queryThreadsOffline(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final deleteThreadsFromChannel(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->getThreads$stream_chat_android_client_release()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Thread;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Thread;->getCid()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->setThreads$stream_chat_android_client_release(Ljava/util/List;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final handleEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 1

    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;->getCid()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->deleteThreadsFromChannel(Ljava/lang/String;)V

    return-void

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;

    if-eqz v0, :cond_1

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->onNewThreadMessageNotification(Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;)V

    return-void

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;

    if-eqz v0, :cond_2

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->markThreadAsUnread(Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;)V

    return-void

    :cond_2
    instance-of v0, p1, Lio/getstream/chat/android/client/events/MessageReadEvent;

    if-eqz v0, :cond_3

    check-cast p1, Lio/getstream/chat/android/client/events/MessageReadEvent;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->markThreadAsRead(Lio/getstream/chat/android/client/events/MessageReadEvent;)V

    return-void

    :cond_3
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;

    if-eqz v0, :cond_4

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->markThreadAsRead(Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;)V

    return-void

    :cond_4
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ThreadUpdatedEvent;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    check-cast p1, Lio/getstream/chat/android/client/events/ThreadUpdatedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ThreadUpdatedEvent;->getThread()Lio/getstream/chat/android/models/ThreadInfo;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->updateThreadFromEvent$stream_chat_android_client_release(Lio/getstream/chat/android/models/ThreadInfo;)V

    return-void

    :cond_5
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NewMessageEvent;

    if-eqz v0, :cond_6

    check-cast p1, Lio/getstream/chat/android/client/events/NewMessageEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->updateParentOrReply(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_6
    instance-of v0, p1, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    if-eqz v0, :cond_7

    check-cast p1, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->updateParentOrReply(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_7
    instance-of v0, p1, Lio/getstream/chat/android/client/events/MessageDeletedEvent;

    if-eqz v0, :cond_8

    check-cast p1, Lio/getstream/chat/android/client/events/MessageDeletedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->updateParentOrReply(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_8
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ReactionNewEvent;

    if-eqz v0, :cond_9

    check-cast p1, Lio/getstream/chat/android/client/events/ReactionNewEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ReactionNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->updateParentOrReply(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_9
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;

    if-eqz v0, :cond_a

    check-cast p1, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->updateParentOrReply(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_a
    instance-of v0, p1, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;

    if-eqz v0, :cond_b

    check-cast p1, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->updateParentOrReply(Lio/getstream/chat/android/models/Message;)V

    :cond_b
    return-void
.end method

.method private final isNextPageRequest(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Z
    .locals 0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->getNext()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final markThreadAsRead(Lio/getstream/chat/android/client/events/MessageReadEvent;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/MessageReadEvent;->getThread()Lio/getstream/chat/android/models/ThreadInfo;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    .line 3
    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/MessageReadEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    .line 4
    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/MessageReadEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object p1

    .line 5
    invoke-virtual {v1, v0, v2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->markThreadAsReadByUser$stream_chat_android_client_release(Lio/getstream/chat/android/models/ThreadInfo;Lio/getstream/chat/android/models/User;Ljava/util/Date;)V

    return-void
.end method

.method private final markThreadAsRead(Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;)V
    .locals 3

    .line 6
    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;->getThread()Lio/getstream/chat/android/models/ThreadInfo;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 7
    :cond_0
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    .line 8
    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    .line 9
    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object p1

    .line 10
    invoke-virtual {v1, v0, v2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->markThreadAsReadByUser$stream_chat_android_client_release(Lio/getstream/chat/android/models/ThreadInfo;Lio/getstream/chat/android/models/User;Ljava/util/Date;)V

    return-void
.end method

.method private final markThreadAsUnread(Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;)V
    .locals 3

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->getThreadId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {v1, v0, v2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->markThreadAsUnreadByUser$stream_chat_android_client_release(Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/util/Date;)V

    return-void
.end method

.method private final onNewThreadMessageNotification(Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;)V
    .locals 2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->getThreads$stream_chat_android_client_release()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Thread;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    return-void

    :cond_3
    :goto_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->addUnseenThreadId$stream_chat_android_client_release(Ljava/lang/String;)V

    return-void
.end method

.method private final queryThreadsOffline(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/FilterObject;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/FilterObject;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->getFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object p2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object v2

    iget-object v7, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->databaseLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->L$2:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->label:I

    invoke-virtual {v7, p2, v2, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;->getLocalThreadsOrder$stream_chat_android_client_release(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/Iterable;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->getLimit()I

    move-result p1

    invoke-static {p2, p1}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_5

    return-object v5

    :cond_5
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->databaseLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->L$2:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic$queryThreadsOffline$1;->label:I

    invoke-virtual {p2, p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;->getLocalThreads$stream_chat_android_client_release(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_7

    return-object v5

    :cond_7
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->insertThreadsIfAbsent$stream_chat_android_client_release(Ljava/util/List;)V

    return-object v5
.end method

.method private final updateParentOrReply(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->updateParent$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->upsertReply$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final deleteMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->deleteMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public final getMessage$stream_chat_android_client_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->getMessage$stream_chat_android_client_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1
.end method

.method public final handleEvents$stream_chat_android_client_release(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;)V"
        }
    .end annotation

    const-string v0, "events"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->handleEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final onQueryThreadsPrecondition$stream_chat_android_client_release(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Ln23/h;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->isLoading$stream_chat_android_client_release()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v0, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    const-string v4, "Already loading the threads, ignoring all other load requests."

    if-eqz v0, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-interface {p1, v3, v2, v4, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    new-instance p1, Ln23/f;

    new-instance v0, Ln23/a;

    invoke-direct {v0, v4}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->isLoadingMore$stream_chat_android_client_release()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->getNext()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v2, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v0, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    const-string v4, "Already loading the next page of threads, ignoring all other next page requests."

    if-eqz v0, :cond_2

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-interface {p1, v3, v2, v4, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    new-instance p1, Ln23/f;

    new-instance v0, Ln23/a;

    invoke-direct {v0, v4}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_3
    new-instance p1, Ln23/g;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, v0}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final onQueryThreadsRequest$stream_chat_android_client_release(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->isNextPageRequest(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Z

    move-result v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {p1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->setLoadingMore$stream_chat_android_client_release(Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->setLoadingError$stream_chat_android_client_release(Z)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->setLoading$stream_chat_android_client_release(Z)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->getUnseenThreadIds$stream_chat_android_client_release()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->clearUnseenThreadIds$stream_chat_android_client_release()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->getThreads$stream_chat_android_client_release()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->queryThreadsOffline(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    :goto_0
    return-object v1
.end method

.method public final onQueryThreadsResult$stream_chat_android_client_release(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->setLoadingMore$stream_chat_android_client_release(Z)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->setLoading$stream_chat_android_client_release(Z)V

    instance-of v0, p1, Ln23/g;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_3

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->isNextPageRequest(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Z

    move-result v0

    const/16 v2, 0xa

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    move-object v3, p1

    check-cast v3, Ln23/g;

    iget-object v3, v3, Ln23/g;->a:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/QueryThreadsResult;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/QueryThreadsResult;->getThreads()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->upsertThreads$stream_chat_android_client_release(Ljava/util/List;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->threadIdsInSession:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/QueryThreadsResult;->getThreads()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v3, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/Thread;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0, v4}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_2

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    move-object v3, p1

    check-cast v3, Ln23/g;

    iget-object v3, v3, Ln23/g;->a:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/QueryThreadsResult;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/QueryThreadsResult;->getThreads()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->setThreads$stream_chat_android_client_release(Ljava/util/List;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->clearUnseenThreadIds$stream_chat_android_client_release()V

    invoke-virtual {v3}, Lio/getstream/chat/android/models/QueryThreadsResult;->getThreads()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Thread;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {v3}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->threadIdsInSession:Ljava/util/List;

    :goto_2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/QueryThreadsResult;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/QueryThreadsResult;->getNext()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->setNext$stream_chat_android_client_release(Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->databaseLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->getFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object p2

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->threadIdsInSession:Ljava/util/List;

    invoke-virtual {p1, v0, p2, v2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;->setLocalThreadsOrder$stream_chat_android_client_release(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_5

    return-object p1

    :cond_3
    instance-of p1, p1, Ln23/f;

    if-eqz p1, :cond_6

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->isNextPageRequest(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    const/4 p3, 0x1

    invoke-virtual {p1, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->setLoadingError$stream_chat_android_client_release(Z)V

    :cond_4
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->getLogger()Lb23/k;

    move-result-object p1

    iget-object p3, p1, Lb23/k;->c:Lb23/e;

    iget-object v0, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-interface {p3, v2, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_5

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v3, "[queryThreadsResult] with request: "

    invoke-direct {p3, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " failed."

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    invoke-interface {p1, v2, v0, p2, p3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    return-object v1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final upsertMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;->updateParentOrReply(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method
