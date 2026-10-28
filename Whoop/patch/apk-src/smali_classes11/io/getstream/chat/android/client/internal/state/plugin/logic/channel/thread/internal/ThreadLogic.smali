.class public final Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010 \n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0010H\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0010H\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u001d\u0010!\u001a\u00020\n2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u001dH\u0000\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0010H\u0000\u00a2\u0006\u0004\u0008\"\u0010\u0019J\u0017\u0010&\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008%\u0010\u000cJ\u001d\u0010(\u001a\u00020\n2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u001dH\u0000\u00a2\u0006\u0004\u0008\'\u0010 J\u0017\u0010*\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008)\u0010\u000cJ\u001d\u0010,\u001a\u00020\n2\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u001dH\u0000\u00a2\u0006\u0004\u0008+\u0010 J\u001d\u00100\u001a\u00020\n2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020-0\u001dH\u0000\u00a2\u0006\u0004\u0008/\u0010 J\u001d\u00103\u001a\u00020\n2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u0002010\u001dH\u0000\u00a2\u0006\u0004\u00082\u0010 J\'\u00108\u001a\u00020\n2\u0008\u00104\u001a\u0004\u0018\u00010\u000e2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u0002050\u001dH\u0000\u00a2\u0006\u0004\u00086\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<\u00a8\u0006="
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;",
        "",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;",
        "threadStateLogic",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;)V",
        "",
        "isLoadingMessages",
        "()Z",
        "isLoading",
        "Ll83/a0;",
        "setLoading$stream_chat_android_client_release",
        "(Z)V",
        "setLoading",
        "",
        "messageId",
        "Lio/getstream/chat/android/models/Message;",
        "getMessage$stream_chat_android_client_release",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;",
        "getMessage",
        "stateLogic$stream_chat_android_client_release",
        "()Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;",
        "stateLogic",
        "message",
        "deleteMessage$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/models/Message;)V",
        "deleteMessage",
        "upsertMessage$stream_chat_android_client_release",
        "upsertMessage",
        "",
        "messages",
        "upsertMessages$stream_chat_android_client_release",
        "(Ljava/util/List;)V",
        "upsertMessages",
        "removeLocalMessage$stream_chat_android_client_release",
        "removeLocalMessage",
        "isEnd",
        "setEndOfOlderMessages$stream_chat_android_client_release",
        "setEndOfOlderMessages",
        "updateOldestMessageInThread$stream_chat_android_client_release",
        "updateOldestMessageInThread",
        "setEndOfNewerMessages$stream_chat_android_client_release",
        "setEndOfNewerMessages",
        "updateNewestMessageInThread$stream_chat_android_client_release",
        "updateNewestMessageInThread",
        "Lio/getstream/chat/android/client/events/HasMessage;",
        "events",
        "handleMessageEvents$stream_chat_android_client_release",
        "handleMessageEvents",
        "Lio/getstream/chat/android/client/events/HasReminder;",
        "handleReminderEvents$stream_chat_android_client_release",
        "handleReminderEvents",
        "currentUserId",
        "Lio/getstream/chat/android/client/events/HasPoll;",
        "handlePollEvents$stream_chat_android_client_release",
        "(Ljava/lang/String;Ljava/util/List;)V",
        "handlePollEvents",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;",
        "mutableState",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;",
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
.field private final mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

.field private final threadStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;)V
    .locals 1

    const-string v0, "threadStateLogic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->threadStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;->writeThreadState()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->handlePollEvents$lambda$12$lambda$8(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->handlePollEvents$lambda$12$lambda$6(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->handlePollEvents$lambda$12$lambda$11(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->handlePollEvents$lambda$12$lambda$7(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->handlePollEvents$lambda$12$lambda$9(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->handlePollEvents$lambda$12$lambda$10(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;

    move-result-object p0

    return-object p0
.end method

.method private static final handlePollEvents$lambda$12$lambda$10(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Lio/getstream/chat/android/models/Poll;

    return-object p0
.end method

.method private static final handlePollEvents$lambda$12$lambda$11(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Lio/getstream/chat/android/models/Poll;

    return-object p0
.end method

.method private static final handlePollEvents$lambda$12$lambda$6(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Lio/getstream/chat/android/models/Poll;

    return-object p0
.end method

.method private static final handlePollEvents$lambda$12$lambda$7(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Lio/getstream/chat/android/models/Poll;

    return-object p0
.end method

.method private static final handlePollEvents$lambda$12$lambda$8(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Lio/getstream/chat/android/models/Poll;

    return-object p0
.end method

.method private static final handlePollEvents$lambda$12$lambda$9(Lkotlin/jvm/internal/g0;Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Lio/getstream/chat/android/models/Poll;

    return-object p0
.end method


# virtual methods
.method public final deleteMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->threadStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;->deleteMessage(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public final getMessage$stream_chat_android_client_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;
    .locals 54

    move-object/from16 v0, p1

    const-string v1, "messageId"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p0

    iget-object v2, v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->getRawMessage()Lec3/f2;

    move-result-object v2

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

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

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final handleMessageEvents$stream_chat_android_client_release(Ljava/util/List;)V
    .locals 58
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/client/events/HasMessage;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "events"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/client/events/HasMessage;

    invoke-interface {v3}, Lio/getstream/chat/android/client/events/HasMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->getMessage$stream_chat_android_client_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v5

    if-nez v5, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    move-object/from16 v24, v5

    goto :goto_3

    :cond_1
    :goto_2
    invoke-interface {v3}, Lio/getstream/chat/android/client/events/HasMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v5

    goto :goto_1

    :goto_3
    invoke-interface {v3}, Lio/getstream/chat/android/client/events/HasMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v5

    const/4 v6, 0x0

    if-nez v5, :cond_2

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v5

    :cond_2
    move-object/from16 v49, v5

    goto :goto_4

    :cond_3
    move-object/from16 v49, v6

    :goto_4
    instance-of v4, v3, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    if-eqz v4, :cond_6

    check-cast v3, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    move-object v4, v6

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v6

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->getMessages()Lec3/f2;

    move-result-object v5

    invoke-interface {v5}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v8}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v9

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Message;->getReplyMessageId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move-object v4, v7

    :cond_5
    move-object/from16 v37, v4

    check-cast v37, Lio/getstream/chat/android/models/Message;

    const v56, 0xfbff

    const/16 v57, 0x0

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

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const v55, -0x40020001

    invoke-static/range {v6 .. v57}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v3

    goto :goto_5

    :cond_6
    invoke-interface {v3}, Lio/getstream/chat/android/client/events/HasMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v6

    const v56, 0xffff

    const/16 v57, 0x0

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

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const v55, -0x20001

    invoke-static/range {v6 .. v57}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v3

    :goto_5
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->upsertMessages$stream_chat_android_client_release(Ljava/util/List;)V

    return-void
.end method

.method public final handlePollEvents$stream_chat_android_client_release(Ljava/lang/String;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/client/events/HasPoll;",
            ">;)V"
        }
    .end annotation

    const-string v0, "events"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_3

    :cond_1
    new-instance v1, Lkotlin/jvm/internal/g0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v0, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/client/events/HasPoll;

    invoke-interface {v4}, Lio/getstream/chat/android/client/events/HasPoll;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/client/events/HasPoll;

    instance-of v3, v2, Lio/getstream/chat/android/client/events/AnswerCastedEvent;

    if-eqz v3, :cond_4

    check-cast v2, Lio/getstream/chat/android/client/events/AnswerCastedEvent;

    new-instance v3, Lbd3/k0;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, Lbd3/k0;-><init>(Lkotlin/jvm/internal/g0;I)V

    invoke-static {v2, v3}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/AnswerCastedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v2

    goto :goto_2

    :cond_4
    instance-of v3, v2, Lio/getstream/chat/android/client/events/PollClosedEvent;

    if-eqz v3, :cond_5

    check-cast v2, Lio/getstream/chat/android/client/events/PollClosedEvent;

    new-instance v3, Lbd3/k0;

    const/4 v4, 0x2

    invoke-direct {v3, v1, v4}, Lbd3/k0;-><init>(Lkotlin/jvm/internal/g0;I)V

    invoke-static {v2, v3}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/PollClosedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v2

    goto :goto_2

    :cond_5
    instance-of v3, v2, Lio/getstream/chat/android/client/events/PollUpdatedEvent;

    if-eqz v3, :cond_6

    check-cast v2, Lio/getstream/chat/android/client/events/PollUpdatedEvent;

    new-instance v3, Lbd3/k0;

    const/4 v4, 0x3

    invoke-direct {v3, v1, v4}, Lbd3/k0;-><init>(Lkotlin/jvm/internal/g0;I)V

    invoke-static {v2, v3}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/PollUpdatedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v2

    goto :goto_2

    :cond_6
    instance-of v3, v2, Lio/getstream/chat/android/client/events/VoteRemovedEvent;

    if-eqz v3, :cond_7

    check-cast v2, Lio/getstream/chat/android/client/events/VoteRemovedEvent;

    new-instance v3, Lbd3/k0;

    const/4 v4, 0x4

    invoke-direct {v3, v1, v4}, Lbd3/k0;-><init>(Lkotlin/jvm/internal/g0;I)V

    invoke-static {v2, v3}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/VoteRemovedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v2

    goto :goto_2

    :cond_7
    instance-of v3, v2, Lio/getstream/chat/android/client/events/VoteCastedEvent;

    if-eqz v3, :cond_8

    check-cast v2, Lio/getstream/chat/android/client/events/VoteCastedEvent;

    new-instance v3, Lbd3/k0;

    const/4 v4, 0x5

    invoke-direct {v3, v1, v4}, Lbd3/k0;-><init>(Lkotlin/jvm/internal/g0;I)V

    invoke-static {v2, p1, v3}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/VoteCastedEvent;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v2

    goto :goto_2

    :cond_8
    instance-of v3, v2, Lio/getstream/chat/android/client/events/VoteChangedEvent;

    if-eqz v3, :cond_9

    check-cast v2, Lio/getstream/chat/android/client/events/VoteChangedEvent;

    new-instance v3, Lbd3/k0;

    const/4 v4, 0x6

    invoke-direct {v3, v1, v4}, Lbd3/k0;-><init>(Lkotlin/jvm/internal/g0;I)V

    invoke-static {v2, p1, v3}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/VoteChangedEvent;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v2

    goto :goto_2

    :cond_9
    instance-of v2, v2, Lio/getstream/chat/android/client/events/PollDeletedEvent;

    if-eqz v2, :cond_a

    const/4 v2, 0x0

    :goto_2
    iput-object v2, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_b
    iget-object p1, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    iget-object p2, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/Poll;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->updateParentMessagePoll(Lio/getstream/chat/android/models/Poll;)V

    :cond_c
    :goto_3
    return-void
.end method

.method public final handleReminderEvents$stream_chat_android_client_release(Ljava/util/List;)V
    .locals 57
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/client/events/HasReminder;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "events"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/client/events/HasReminder;

    invoke-interface {v3}, Lio/getstream/chat/android/client/events/HasReminder;->getReminder()Lio/getstream/chat/android/models/MessageReminder;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/MessageReminder;->getMessageId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->getMessage$stream_chat_android_client_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v5

    instance-of v4, v3, Lio/getstream/chat/android/client/events/ReminderCreatedEvent;

    const/4 v6, 0x0

    if-nez v4, :cond_2

    instance-of v4, v3, Lio/getstream/chat/android/client/events/ReminderUpdatedEvent;

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    instance-of v3, v3, Lio/getstream/chat/android/client/events/ReminderDeletedEvent;

    if-eqz v3, :cond_3

    if-eqz v5, :cond_3

    const v55, 0xefff

    const/16 v56, 0x0

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

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, -0x1

    invoke-static/range {v5 .. v56}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v6

    goto :goto_2

    :cond_2
    :goto_1
    if-eqz v5, :cond_3

    invoke-interface {v3}, Lio/getstream/chat/android/client/events/HasReminder;->getReminder()Lio/getstream/chat/android/models/MessageReminder;

    move-result-object v3

    invoke-static {v3}, Lio/getstream/chat/android/client/extensions/internal/MessageReminderKt;->toMessageReminderInfo(Lio/getstream/chat/android/models/MessageReminder;)Lio/getstream/chat/android/models/MessageReminderInfo;

    move-result-object v50

    const v55, 0xefff

    const/16 v56, 0x0

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

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, -0x1

    invoke-static/range {v5 .. v56}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v6

    :cond_3
    :goto_2
    if-eqz v6, :cond_0

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->upsertMessages$stream_chat_android_client_release(Ljava/util/List;)V

    :cond_5
    return-void
.end method

.method public final isLoadingMessages()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->getLoading()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final removeLocalMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->threadStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;->deleteMessage(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public final setEndOfNewerMessages$stream_chat_android_client_release(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->setEndOfNewerMessages(Z)V

    return-void
.end method

.method public final setEndOfOlderMessages$stream_chat_android_client_release(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->setEndOfOlderMessages(Z)V

    return-void
.end method

.method public final setLoading$stream_chat_android_client_release(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->setLoading(Z)V

    return-void
.end method

.method public final stateLogic$stream_chat_android_client_release()Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->threadStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;

    return-object v0
.end method

.method public final updateNewestMessageInThread$stream_chat_android_client_release(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)V"
        }
    .end annotation

    const-string v0, "messages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic$updateNewestMessageInThread$$inlined$sortedBy$1;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Message;

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->getNewestInThread()Lec3/f2;

    move-result-object p1

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Message;

    :cond_0
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->setNewestInThread(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public final updateOldestMessageInThread$stream_chat_android_client_release(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)V"
        }
    .end annotation

    const-string v0, "messages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic$updateOldestMessageInThread$$inlined$sortedBy$1;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Message;

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->getOldestInThread()Lec3/f2;

    move-result-object p1

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Message;

    :cond_0
    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->setOldestInThread(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public final upsertMessage$stream_chat_android_client_release(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->upsertMessages$stream_chat_android_client_release(Ljava/util/List;)V

    return-void
.end method

.method public final upsertMessages$stream_chat_android_client_release(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)V"
        }
    .end annotation

    const-string v0, "messages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->threadStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;->upsertMessages(Ljava/util/List;)V

    return-void
.end method
