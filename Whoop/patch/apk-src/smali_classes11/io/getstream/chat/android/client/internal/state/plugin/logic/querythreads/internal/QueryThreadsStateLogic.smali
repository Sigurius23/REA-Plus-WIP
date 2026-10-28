.class public final Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0017\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\"\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0010J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0014J\u0015\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u000b2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\rJ\u001d\u0010 \u001a\u00020\u000b2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0000\u00a2\u0006\u0004\u0008\u001f\u0010\rJ\u001d\u0010\"\u001a\u00020\u000b2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0000\u00a2\u0006\u0004\u0008!\u0010\rJ\u000f\u0010%\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008#\u0010$J\u0019\u0010*\u001a\u00020\u000b2\u0008\u0010\'\u001a\u0004\u0018\u00010&H\u0000\u00a2\u0006\u0004\u0008(\u0010)J\u0015\u0010.\u001a\u0008\u0012\u0004\u0012\u00020&0+H\u0000\u00a2\u0006\u0004\u0008,\u0010-J\u0017\u00101\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020&H\u0000\u00a2\u0006\u0004\u00080\u0010)J\u000f\u00103\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u00082\u0010$J\u0017\u00106\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u00085\u0010\u0014J\u0019\u0010;\u001a\u0004\u0018\u0001082\u0006\u00107\u001a\u00020&H\u0000\u00a2\u0006\u0004\u00089\u0010:J\u0017\u0010?\u001a\u00020\u000b2\u0006\u0010<\u001a\u000208H\u0000\u00a2\u0006\u0004\u0008=\u0010>J\u0017\u0010C\u001a\u00020\u000e2\u0006\u0010@\u001a\u000208H\u0000\u00a2\u0006\u0004\u0008A\u0010BJ\u0017\u0010F\u001a\u00020\u000b2\u0006\u0010D\u001a\u000208H\u0000\u00a2\u0006\u0004\u0008E\u0010>J\'\u0010O\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0000\u00a2\u0006\u0004\u0008M\u0010NJ\'\u0010S\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020&2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0000\u00a2\u0006\u0004\u0008Q\u0010RJ\u0017\u0010V\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020GH\u0000\u00a2\u0006\u0004\u0008T\u0010UR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010WR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010X\u00a8\u0006Y"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;",
        "",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;",
        "mutableState",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "mutableGlobalState",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V",
        "",
        "Lio/getstream/chat/android/models/Thread;",
        "threads",
        "Ll83/a0;",
        "upsertDraftMessages",
        "(Ljava/util/List;)V",
        "",
        "isLoading$stream_chat_android_client_release",
        "()Z",
        "isLoading",
        "loading",
        "setLoading$stream_chat_android_client_release",
        "(Z)V",
        "setLoading",
        "isLoadingMore$stream_chat_android_client_release",
        "isLoadingMore",
        "setLoadingMore$stream_chat_android_client_release",
        "setLoadingMore",
        "getThreads$stream_chat_android_client_release",
        "()Ljava/util/List;",
        "getThreads",
        "setThreads$stream_chat_android_client_release",
        "setThreads",
        "insertThreadsIfAbsent$stream_chat_android_client_release",
        "insertThreadsIfAbsent",
        "upsertThreads$stream_chat_android_client_release",
        "upsertThreads",
        "clearThreads$stream_chat_android_client_release",
        "()V",
        "clearThreads",
        "",
        "next",
        "setNext$stream_chat_android_client_release",
        "(Ljava/lang/String;)V",
        "setNext",
        "",
        "getUnseenThreadIds$stream_chat_android_client_release",
        "()Ljava/util/Set;",
        "getUnseenThreadIds",
        "id",
        "addUnseenThreadId$stream_chat_android_client_release",
        "addUnseenThreadId",
        "clearUnseenThreadIds$stream_chat_android_client_release",
        "clearUnseenThreadIds",
        "error",
        "setLoadingError$stream_chat_android_client_release",
        "setLoadingError",
        "messageId",
        "Lio/getstream/chat/android/models/Message;",
        "getMessage$stream_chat_android_client_release",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;",
        "getMessage",
        "message",
        "deleteMessage$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/models/Message;)V",
        "deleteMessage",
        "parent",
        "updateParent$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/models/Message;)Z",
        "updateParent",
        "reply",
        "upsertReply$stream_chat_android_client_release",
        "upsertReply",
        "Lio/getstream/chat/android/models/ThreadInfo;",
        "threadInfo",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "Ljava/util/Date;",
        "createdAt",
        "markThreadAsReadByUser$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/models/ThreadInfo;Lio/getstream/chat/android/models/User;Ljava/util/Date;)V",
        "markThreadAsReadByUser",
        "threadId",
        "markThreadAsUnreadByUser$stream_chat_android_client_release",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/util/Date;)V",
        "markThreadAsUnreadByUser",
        "updateThreadFromEvent$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/models/ThreadInfo;)V",
        "updateThreadFromEvent",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
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
.field private final mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

.field private final mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V
    .locals 1

    const-string v0, "mutableState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mutableGlobalState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    return-void
.end method

.method private final upsertDraftMessages(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;)V"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Thread;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Thread;->getDraft()Lio/getstream/chat/android/models/DraftMessage;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->updateDraftMessage(Lio/getstream/chat/android/models/DraftMessage;)V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public final addUnseenThreadId$stream_chat_android_client_release(Ljava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->addUnseenThreadId$stream_chat_android_client_release(Ljava/lang/String;)V

    return-void
.end method

.method public final clearThreads$stream_chat_android_client_release()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->clearThreads$stream_chat_android_client_release()V

    return-void
.end method

.method public final clearUnseenThreadIds$stream_chat_android_client_release()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->clearUnseenThreadIds$stream_chat_android_client_release()V

    return-void
.end method

.method public final deleteMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->getThreadMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->deleteThread$stream_chat_android_client_release(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->deleteMessageFromThread$stream_chat_android_client_release(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final getMessage$stream_chat_android_client_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;
    .locals 3

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->getThreadMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Thread;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v1

    :cond_1
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Thread;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Thread;->getLatestReplies()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_4
    const/4 v1, 0x0

    :goto_2
    check-cast v1, Lio/getstream/chat/android/models/Message;

    return-object v1
.end method

.method public final getThreads$stream_chat_android_client_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->getThreads()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getUnseenThreadIds$stream_chat_android_client_release()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->getUnseenThreadIds()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method

.method public final insertThreadsIfAbsent$stream_chat_android_client_release(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;)V"
        }
    .end annotation

    const-string v0, "threads"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->upsertDraftMessages(Ljava/util/List;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->insertThreadsIfAbsent$stream_chat_android_client_release(Ljava/util/List;)V

    return-void
.end method

.method public final isLoading$stream_chat_android_client_release()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->getLoading()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final isLoadingMore$stream_chat_android_client_release()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->getLoadingMore()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final markThreadAsReadByUser$stream_chat_android_client_release(Lio/getstream/chat/android/models/ThreadInfo;Lio/getstream/chat/android/models/User;Ljava/util/Date;)V
    .locals 2

    const-string v0, "threadInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->getThreadMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ThreadInfo;->getParentMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Thread;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {v0, p1, p2, p3}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->markAsReadByUser(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/ThreadInfo;Lio/getstream/chat/android/models/User;Ljava/util/Date;)Lio/getstream/chat/android/models/Thread;

    move-result-object p1

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->upsertThreads$stream_chat_android_client_release(Ljava/util/List;)V

    return-void
.end method

.method public final markThreadAsUnreadByUser$stream_chat_android_client_release(Ljava/lang/String;Lio/getstream/chat/android/models/User;Ljava/util/Date;)V
    .locals 1

    const-string v0, "threadId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "user"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createdAt"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->getThreadMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Thread;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-static {p1, p2, p3}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->markAsUnreadByUser(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/User;Ljava/util/Date;)Lio/getstream/chat/android/models/Thread;

    move-result-object p1

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->upsertThreads$stream_chat_android_client_release(Ljava/util/List;)V

    return-void
.end method

.method public final setLoading$stream_chat_android_client_release(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->setLoading$stream_chat_android_client_release(Z)V

    return-void
.end method

.method public final setLoadingError$stream_chat_android_client_release(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->setLoadingError$stream_chat_android_client_release(Z)V

    return-void
.end method

.method public final setLoadingMore$stream_chat_android_client_release(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->setLoadingMore$stream_chat_android_client_release(Z)V

    return-void
.end method

.method public final setNext$stream_chat_android_client_release(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->setNext$stream_chat_android_client_release(Ljava/lang/String;)V

    return-void
.end method

.method public final setThreads$stream_chat_android_client_release(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;)V"
        }
    .end annotation

    const-string v0, "threads"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->upsertDraftMessages(Ljava/util/List;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->setThreads$stream_chat_android_client_release(Ljava/util/List;)V

    return-void
.end method

.method public final updateParent$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)Z
    .locals 2

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->getThreadMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Thread;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {v0, p1}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->updateParent(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Thread;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->upsertThreads$stream_chat_android_client_release(Ljava/util/List;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final updateThreadFromEvent$stream_chat_android_client_release(Lio/getstream/chat/android/models/ThreadInfo;)V
    .locals 2

    const-string v0, "threadInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->getThreadMap()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/ThreadInfo;->getParentMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Thread;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {v0, p1}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->applyThreadUpdatedEventChanges(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/ThreadInfo;)Lio/getstream/chat/android/models/Thread;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->upsertThreads$stream_chat_android_client_release(Ljava/util/List;)V

    return-void
.end method

.method public final upsertReply$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V
    .locals 2

    const-string v0, "reply"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->getThreadMap()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Thread;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0, p1}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->upsertReply(Lio/getstream/chat/android/models/Thread;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Thread;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->upsertThreads$stream_chat_android_client_release(Ljava/util/List;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final upsertThreads$stream_chat_android_client_release(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;)V"
        }
    .end annotation

    const-string v0, "threads"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->upsertDraftMessages(Ljava/util/List;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->upsertThreads$stream_chat_android_client_release(Ljava/util/List;)V

    return-void
.end method
