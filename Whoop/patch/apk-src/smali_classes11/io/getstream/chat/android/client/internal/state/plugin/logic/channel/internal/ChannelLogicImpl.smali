.class public final Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010\u0012\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0010\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ%\u0010 \u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016\u00a2\u0006\u0004\u0008 \u0010!J&\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008$\u0010%J&\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0096@\u00a2\u0006\u0004\u0008\'\u0010(J(\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d2\u0008\u0010&\u001a\u0004\u0018\u00010\u00022\u0006\u0010#\u001a\u00020\"H\u0096@\u00a2\u0006\u0004\u0008)\u0010(J\u001e\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010&\u001a\u00020\u0002H\u0096@\u00a2\u0006\u0004\u0008*\u0010+J\u0019\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010&\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008-\u0010.J\u0017\u00100\u001a\u00020\u00182\u0006\u0010/\u001a\u00020,H\u0016\u00a2\u0006\u0004\u00080\u00101J\u0017\u00102\u001a\u00020\u00182\u0006\u0010/\u001a\u00020,H\u0016\u00a2\u0006\u0004\u00082\u00101J\u0017\u00103\u001a\u00020\u00182\u0006\u0010/\u001a\u00020,H\u0016\u00a2\u0006\u0004\u00083\u00101J\u001d\u00107\u001a\u00020\u00182\u000c\u00106\u001a\u0008\u0012\u0004\u0012\u00020504H\u0016\u00a2\u0006\u0004\u00087\u00108J\u0017\u0010:\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008:\u0010;J\u0017\u0010>\u001a\u00020\u00182\u0006\u0010=\u001a\u00020<H\u0016\u00a2\u0006\u0004\u0008>\u0010?J\u0017\u0010@\u001a\u00020\u00182\u0006\u0010=\u001a\u00020<H\u0016\u00a2\u0006\u0004\u0008@\u0010?J\u0017\u0010C\u001a\u00020\u00182\u0006\u0010B\u001a\u00020AH\u0016\u00a2\u0006\u0004\u0008C\u0010DJ\u0019\u0010E\u001a\u00020\u00182\u0008\u0010/\u001a\u0004\u0018\u00010,H\u0016\u00a2\u0006\u0004\u0008E\u00101J\u000f\u0010F\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008F\u0010GJ\u000f\u0010H\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008H\u0010GJ\u0011\u0010I\u001a\u0004\u0018\u00010<H\u0016\u00a2\u0006\u0004\u0008I\u0010JJ\u0019\u0010K\u001a\u00020\u00182\u0008\u0010=\u001a\u0004\u0018\u00010<H\u0016\u00a2\u0006\u0004\u0008K\u0010?J\u0019\u0010L\u001a\u00020\u00182\u0008\u0010&\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008L\u0010MJ@\u0010T\u001a\u00020\u00182\u0006\u0010N\u001a\u00020\u001e2\u0006\u0010O\u001a\u00020\"2\u0006\u0010P\u001a\u00020\u000c2\u0006\u0010Q\u001a\u00020\u000c2\u0006\u0010R\u001a\u00020\u000c2\u0006\u0010S\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008T\u0010UJ\u001d\u0010X\u001a\u00020\u00182\u000c\u0010W\u001a\u0008\u0012\u0004\u0012\u00020V04H\u0016\u00a2\u0006\u0004\u0008X\u00108J\u0017\u0010Z\u001a\u00020\u00182\u0006\u0010Y\u001a\u00020VH\u0016\u00a2\u0006\u0004\u0008Z\u0010[J\u001e\u0010^\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010]\u001a\u00020\\H\u0082@\u00a2\u0006\u0004\u0008^\u0010_J\u001f\u0010`\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010N\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008`\u0010aJ\"\u0010b\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010]\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0004\u0008b\u0010cJ+\u0010f\u001a\u00020\u000c2\u000c\u0010d\u001a\u0008\u0012\u0004\u0012\u00020,042\u000c\u0010e\u001a\u0008\u0012\u0004\u0012\u00020,04H\u0002\u00a2\u0006\u0004\u0008f\u0010gR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010h\u001a\u0004\u0008i\u0010jR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010k\u001a\u0004\u0008l\u0010mR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010nR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010oR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010pR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010qR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008t\u0010u\u00a8\u0006v"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;",
        "",
        "cid",
        "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;",
        "messagesUpdateLogic",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "repository",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;",
        "state",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "mutableGlobalState",
        "",
        "userPresence",
        "Lbc3/c0;",
        "coroutineScope",
        "Lkotlin/Function0;",
        "getCurrentUserId",
        "",
        "now",
        "<init>",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;ZLbc3/c0;Lc93/a;Lc93/a;)V",
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "query",
        "Ll83/a0;",
        "updateStateFromDatabase",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;",
        "setPaginationDirection",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Channel;",
        "result",
        "onQueryChannelResult",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Ln23/h;)V",
        "",
        "limit",
        "watch",
        "(IZLq83/d;)Ljava/lang/Object;",
        "messageId",
        "loadAfter",
        "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "loadBefore",
        "loadAround",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/Message;",
        "getMessage",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;",
        "message",
        "upsertMessage",
        "(Lio/getstream/chat/android/models/Message;)V",
        "updateLastMessageAt",
        "deleteMessage",
        "",
        "Lio/getstream/chat/android/models/Member;",
        "members",
        "upsertMembers",
        "(Ljava/util/List;)V",
        "hidden",
        "setHidden",
        "(Z)V",
        "Ljava/util/Date;",
        "date",
        "hideMessagesBefore",
        "(Ljava/util/Date;)V",
        "removeMessagesBefore",
        "Lio/getstream/chat/android/models/PushPreference;",
        "preference",
        "setPushPreference",
        "(Lio/getstream/chat/android/models/PushPreference;)V",
        "setRepliedMessage",
        "markRead",
        "()Z",
        "typingEventsEnabled",
        "getLastStartTypingEvent",
        "()Ljava/util/Date;",
        "setLastStartTypingEvent",
        "setKeystrokeParentMessageId",
        "(Ljava/lang/String;)V",
        "channel",
        "messageLimit",
        "shouldRefreshMessages",
        "scrollUpdate",
        "isNotificationUpdate",
        "isChannelsStateUpdate",
        "updateDataForChannel",
        "(Lio/getstream/chat/android/models/Channel;IZZZZLq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "events",
        "handleEvents",
        "event",
        "handleEvent",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)V",
        "Lio/getstream/chat/android/client/api/models/WatchChannelRequest;",
        "request",
        "queryChannel",
        "(Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;",
        "updateMessages",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lio/getstream/chat/android/models/Channel;)V",
        "fetchOfflineChannel",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;",
        "currentMessages",
        "incomingMessages",
        "hasGap",
        "(Ljava/util/List;Ljava/util/List;)Z",
        "Ljava/lang/String;",
        "getCid",
        "()Ljava/lang/String;",
        "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;",
        "getMessagesUpdateLogic",
        "()Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "Z",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;",
        "eventHandler",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;",
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

.field private final coroutineScope:Lbc3/c0;

.field private final eventHandler:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;

.field private final messagesUpdateLogic:Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

.field private final mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

.field private final repository:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

.field private final state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

.field private final userPresence:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;ZLbc3/c0;Lc93/a;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;",
            "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
            "Z",
            "Lbc3/c0;",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messagesUpdateLogic"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mutableGlobalState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getCurrentUserId"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->cid:Ljava/lang/String;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->messagesUpdateLogic:Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->repository:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    iput-object p5, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    iput-boolean p6, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->userPresence:Z

    iput-object p7, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->coroutineScope:Lbc3/c0;

    move-object p2, p1

    new-instance p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;

    move-object p3, p4

    move-object p4, p5

    move-object p5, p7

    move-object p6, p8

    move-object p7, p9

    invoke-direct/range {p1 .. p7}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lbc3/c0;Lc93/a;Lc93/a;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->eventHandler:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->updateDataForChannel$lambda$6(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$fetchOfflineChannel(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->fetchOfflineChannel(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$queryChannel(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->queryChannel(Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->onQueryChannelResult$lambda$0(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p0

    return-object p0
.end method

.method private final fetchOfflineChannel(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 45
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;

    iget v4, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;

    invoke-direct {v3, v0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;->label:I

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v5, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Channel;

    iget-object v4, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    iget-object v3, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;->L$0:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, v1

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    iget-object v5, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;->L$0:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v44, v5

    move-object v5, v1

    move-object/from16 v1, v44

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->repository:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v1, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;->L$0:Ljava/lang/Object;

    move-object/from16 v5, p2

    iput-object v5, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;->L$1:Ljava/lang/Object;

    iput v7, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;->label:I

    invoke-virtual {v2, v1, v3}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast v2, Lio/getstream/chat/android/models/Channel;

    const/4 v7, 0x0

    if-nez v2, :cond_5

    return-object v7

    :cond_5
    iget-object v8, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->repository:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    invoke-static {v5}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/MapperKt;->toAnyChannelPaginationRequest(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    move-result-object v5

    iput-object v7, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;->L$0:Ljava/lang/Object;

    iput-object v7, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;->L$1:Ljava/lang/Object;

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;->L$2:Ljava/lang/Object;

    iput v6, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$fetchOfflineChannel$1;->label:I

    invoke-virtual {v8, v1, v5, v3}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectMessagesForChannel(Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_6

    :goto_2
    return-object v4

    :cond_6
    move-object v5, v2

    move-object v2, v1

    :goto_3
    move-object/from16 v17, v2

    check-cast v17, Ljava/util/List;

    const/16 v42, 0x7

    const/16 v43, 0x0

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

    const/16 v41, -0x801

    invoke-static/range {v5 .. v43}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    return-object v1
.end method

.method private final hasGap(Ljava/util/List;Ljava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)Z"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    :goto_0
    move-object v1, v2

    goto :goto_1

    :cond_1
    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object v4

    invoke-static {v3, v4}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v3

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/Message;

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object v6

    invoke-static {v5, v6}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v6

    if-gez v6, :cond_3

    move-object v2, v4

    move-object v3, v5

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :goto_1
    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-static {p2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/Message;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_7

    if-eqz v1, :cond_7

    if-eqz p2, :cond_7

    instance-of p1, v0, Ljava/util/Collection;

    if-eqz p1, :cond_4

    move-object p1, v0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_6
    :goto_2
    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object p1

    invoke-static {p2, p1}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object p1

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object p2

    invoke-static {v1, p2}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result p1

    if-eqz p1, :cond_7

    const/4 p1, 0x1

    return p1

    :cond_7
    :goto_3
    const/4 p1, 0x0

    return p1
.end method

.method private static final onQueryChannelResult$lambda$0(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 24

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/ChannelData;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object/from16 v0, p1

    iget-object v0, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getChannelData()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/ChannelData;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/ChannelData;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v15

    const v22, 0xfdfff

    const/16 v23, 0x0

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v23}, Lio/getstream/chat/android/models/ChannelData;->copy$default(Lio/getstream/chat/android/models/ChannelData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object v0

    return-object v0

    :cond_0
    return-object p0
.end method

.method private final queryChannel(Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/WatchChannelRequest;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getPaginationManager()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->begin(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->cid:Ljava/lang/String;

    invoke-static {v0}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object v0

    iget-object v1, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    sget-object v2, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v0, p1, v3}, Lio/getstream/chat/android/client/ChatClient;->queryChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Z)Lo23/d;

    move-result-object p1

    invoke-interface {p1, p2}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private static final updateDataForChannel$lambda$6(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;Lio/getstream/chat/android/models/ChannelData;)Lio/getstream/chat/android/models/ChannelData;
    .locals 24

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/ChannelData;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object/from16 v0, p1

    iget-object v0, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getChannelData()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/ChannelData;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/ChannelData;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v15

    const v22, 0xfdfff

    const/16 v23, 0x0

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v23}, Lio/getstream/chat/android/models/ChannelData;->copy$default(Lio/getstream/chat/android/models/ChannelData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Map;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/DraftMessage;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object v0

    return-object v0

    :cond_0
    return-object p0
.end method

.method private final updateMessages(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lio/getstream/chat/android/models/Channel;)V
    .locals 5

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringMessages()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->clearCachedLatestMessages()V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setMessages(Ljava/util/List;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setInsideSearch(Z)V

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringAroundIdMessages()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getInsideSearch()Lec3/f2;

    move-result-object p1

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setMessages(Ljava/util/List;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->cacheLatestMessages()V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setMessages(Ljava/util/List;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setInsideSearch(Z)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringNewerMessages()Z

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v4

    invoke-static {v0, v4, v1, v3, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMessages$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Ljava/util/List;ZILjava/lang/Object;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->trimOldestMessages()V

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messagesLimit()I

    move-result p1

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le p1, v0, :cond_4

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->clearCachedLatestMessages()V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setInsideSearch(Z)V

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->filteringOlderMessages()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0, v1, v3, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMessages$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Ljava/util/List;ZILjava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->trimNewestMessages()V

    :cond_4
    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getPendingMessages()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/PendingMessage;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/PendingMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setPendingMessages(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final deleteMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->deleteMessage(Ljava/lang/String;)V

    return-void
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->cid:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastStartTypingEvent()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getLastStartTypingEvent()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public final getMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1
.end method

.method public final getMessagesUpdateLogic()Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->messagesUpdateLogic:Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

    return-object v0
.end method

.method public final handleEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->eventHandler:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->handle(Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void
.end method

.method public final handleEvents(Ljava/util/List;)V
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

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/events/ChatEvent;

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->handleEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final hideMessagesBefore(Ljava/util/Date;)V
    .locals 1

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->hideMessagesBefore(Ljava/util/Date;)V

    return-void
.end method

.method public final loadAfter(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;-><init>(I)V

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->setMessageFilterValue(Ljava/lang/String;)V

    sget-object p1, Lio/getstream/chat/android/client/api/models/Pagination;->GREATER_THAN:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->setMessageFilterDirection(Lio/getstream/chat/android/client/api/models/Pagination;)V

    iget-boolean p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->userPresence:Z

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->toWatchChannelRequest(Z)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->queryChannel(Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final loadAround(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    new-instance v0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->setMessageFilterValue(Ljava/lang/String;)V

    sget-object p1, Lio/getstream/chat/android/client/api/models/Pagination;->AROUND_ID:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->setMessageFilterDirection(Lio/getstream/chat/android/client/api/models/Pagination;)V

    iget-boolean p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->userPresence:Z

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->toWatchChannelRequest(Z)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    move-result-object p1

    invoke-virtual {p1, v3}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->setShouldRefresh(Z)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->queryChannel(Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final loadBefore(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getOldestMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :cond_1
    :goto_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;-><init>(I)V

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->setMessageFilterValue(Ljava/lang/String;)V

    sget-object p1, Lio/getstream/chat/android/client/api/models/Pagination;->LESS_THAN:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->setMessageFilterDirection(Lio/getstream/chat/android/client/api/models/Pagination;)V

    :cond_2
    iget-boolean p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->userPresence:Z

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->toWatchChannelRequest(Z)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->queryChannel(Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final markRead()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->markRead()Z

    move-result v0

    return v0
.end method

.method public final onQueryChannelResult(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Ln23/h;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Ln23/h;",
            ")V"
        }
    .end annotation

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messagesLimit()I

    move-result v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isNotificationUpdate()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getPaginationManager()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;

    move-result-object v2

    invoke-interface {v2, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->end(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Ln23/h;)V

    :cond_0
    instance-of v2, p2, Ln23/g;

    if-eqz v2, :cond_3

    check-cast p2, Ln23/g;

    iget-object p2, p2, Ln23/g;->a:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/Channel;

    invoke-static {p2}, Lio/getstream/chat/android/models/ChannelKt;->toChannelData(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    new-instance v4, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/a;

    const/4 v5, 0x1

    invoke-direct {v4, v2, p0, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/a;-><init>(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;I)V

    invoke-virtual {v3, v4}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateChannelData(Lkotlin/jvm/functions/Function1;)V

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getMemberCount()I

    move-result v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setMemberCount(I)V

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMembers(Ljava/util/List;)V

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getWatchers()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getWatcherCount()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertWatchers(Ljava/util/List;I)V

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getRead()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateReads(Ljava/util/List;)V

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getConfig()Lio/getstream/chat/android/models/Config;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setChannelConfig(Lio/getstream/chat/android/models/Config;)V

    if-lez v0, :cond_1

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->updateMessages(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lio/getstream/chat/android/models/Channel;)V

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getPinnedMessages()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addPinnedMessages(Ljava/util/List;)V

    if-nez v1, :cond_2

    if-eqz v0, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setRecoveryNeeded(Z)V

    :cond_2
    return-void

    :cond_3
    instance-of p1, p2, Ln23/f;

    if-eqz p1, :cond_4

    check-cast p2, Ln23/f;

    iget-object p1, p2, Ln23/f;->a:Ln23/e;

    invoke-static {p1}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->isPermanent(Ln23/e;)Z

    move-result p1

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setRecoveryNeeded(Z)V

    return-void

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final removeMessagesBefore(Ljava/util/Date;)V
    .locals 2

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->removeMessagesBefore(Ljava/util/Date;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public final setHidden(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setHidden(Z)V

    return-void
.end method

.method public final setKeystrokeParentMessageId(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setKeystrokeParentMessageId(Ljava/lang/String;)V

    return-void
.end method

.method public final setLastStartTypingEvent(Ljava/util/Date;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setLastStartTypingEvent(Ljava/util/Date;)V

    return-void
.end method

.method public final setPaginationDirection(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getPaginationManager()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->begin(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V

    return-void
.end method

.method public final setPushPreference(Lio/getstream/chat/android/models/PushPreference;)V
    .locals 1

    const-string v0, "preference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setPushPreference(Lio/getstream/chat/android/models/PushPreference;)V

    return-void
.end method

.method public final setRepliedMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setRepliedMessage(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public final typingEventsEnabled()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getChannelConfig()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Config;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getTypingEventsEnabled()Z

    move-result v0

    return v0
.end method

.method public final updateDataForChannel(Lio/getstream/chat/android/models/Channel;IZZZZLq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "IZZZZ",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p7, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;

    if-eqz v0, :cond_0

    move-object v0, p7

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;

    invoke-direct {v0, p0, p7}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;Lq83/d;)V

    :goto_0
    iget-object p7, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean p3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;->Z$0:Z

    iget p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;->I$0:I

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/ChannelData;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    invoke-static {p7}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p7}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p1}, Lio/getstream/chat/android/models/ChannelKt;->toChannelData(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/ChannelData;

    move-result-object p7

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    new-instance v4, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/a;

    const/4 v5, 0x0

    invoke-direct {v4, p7, p0, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/a;-><init>(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;I)V

    invoke-virtual {v2, v4}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateChannelData(Lkotlin/jvm/functions/Function1;)V

    iget-object p7, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMemberCount()I

    move-result v2

    invoke-virtual {p7, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setMemberCount(I)V

    iget-object p7, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p7, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMembers(Ljava/util/List;)V

    iget-object p7, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getWatchers()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getWatcherCount()I

    move-result v4

    invoke-virtual {p7, v2, v4}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertWatchers(Ljava/util/List;I)V

    iget-object p7, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getRead()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p7, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateReads(Ljava/util/List;)V

    iget-object p7, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getConfig()Lio/getstream/chat/android/models/Config;

    move-result-object v2

    invoke-virtual {p7, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setChannelConfig(Lio/getstream/chat/android/models/Config;)V

    iget-object p7, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getPendingMessages()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/PendingMessage;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/PendingMessage;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {p7, v4}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setPendingMessages(Ljava/util/List;)V

    if-lez p2, :cond_b

    sget-object p7, Lbc3/q0;->a:Lkc3/e;

    new-instance v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$sortedMessages$1;

    const/4 v4, 0x0

    invoke-direct {v2, p1, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$sortedMessages$1;-><init>(Lio/getstream/chat/android/models/Channel;Lq83/d;)V

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;->L$1:Ljava/lang/Object;

    iput p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;->I$0:I

    iput-boolean p3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;->Z$0:Z

    iput-boolean p4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;->Z$1:Z

    iput-boolean p5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;->Z$2:Z

    iput-boolean p6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;->Z$3:Z

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateDataForChannel$1;->label:I

    invoke-static {p7, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p7

    if-ne p7, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    check-cast p7, Ljava/util/List;

    iget-object p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p4}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getMessages()Lec3/f2;

    move-result-object p4

    invoke-interface {p4}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/util/List;

    const/4 p5, 0x0

    if-nez p3, :cond_9

    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_5

    goto :goto_4

    :cond_5
    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getInsideSearch()Lec3/f2;

    move-result-object p3

    invoke-interface {p3}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_6

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p2, p7, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertCachedLatestMessages(Ljava/util/List;Z)V

    goto :goto_6

    :cond_6
    invoke-direct {p0, p4, p7}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->hasGap(Ljava/util/List;Ljava/util/List;)Z

    move-result p3

    if-eqz p3, :cond_7

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p2, p7, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertCachedLatestMessages(Ljava/util/List;Z)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setInsideSearch(Z)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getPaginationManager()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;

    move-result-object p2

    invoke-interface {p2, p5}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->setEndOfNewerMessages(Z)V

    goto :goto_6

    :cond_7
    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p3, p7, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMessages(Ljava/util/List;Z)V

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getPaginationManager()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;

    move-result-object p3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p4

    if-ge p4, p2, :cond_8

    goto :goto_3

    :cond_8
    move v3, p5

    :goto_3
    invoke-interface {p3, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->setEndOfOlderMessages(Z)V

    goto :goto_6

    :cond_9
    :goto_4
    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p3, p7}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setMessages(Ljava/util/List;)V

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getPaginationManager()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;

    move-result-object p3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p4

    if-ge p4, p2, :cond_a

    goto :goto_5

    :cond_a
    move v3, p5

    :goto_5
    invoke-interface {p3, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->setEndOfOlderMessages(Z)V

    :cond_b
    :goto_6
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getPinnedMessages()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addPinnedMessages(Ljava/util/List;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final updateLastMessageAt(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateLastMessageAt(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public final updateStateFromDatabase(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->label:I

    :goto_0
    move-object v8, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->label:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    if-eqz v1, :cond_4

    if-eq v1, v4, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object v0, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Channel;

    iget-object v1, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, p0

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    iget-object v1, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_3
    iget-object p1, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isNotificationUpdate()Z

    move-result p2

    if-eqz p2, :cond_5

    return-object v9

    :cond_5
    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringMessages()Z

    move-result p2

    if-eqz p2, :cond_6

    return-object v9

    :cond_6
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->cid:Ljava/lang/String;

    iput-object p1, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->L$0:Ljava/lang/Object;

    iput v4, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->label:I

    invoke-direct {p0, p2, p1, v8}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->fetchOfflineChannel(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_7

    :goto_2
    move-object v1, p0

    goto :goto_5

    :cond_7
    :goto_3
    check-cast p2, Lio/getstream/chat/android/models/Channel;

    if-nez p2, :cond_8

    return-object v9

    :cond_8
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->repository:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->cid:Ljava/lang/String;

    iput-object p1, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->L$0:Ljava/lang/Object;

    iput-object p2, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->L$1:Ljava/lang/Object;

    iput v3, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->label:I

    invoke-virtual {v1, v4, v8}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectLocalOnlyMessagesForChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_9

    goto :goto_2

    :cond_9
    move-object v10, v1

    move-object v1, p1

    move-object p1, p2

    move-object p2, v10

    :goto_4
    check-cast p2, Ljava/util/List;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messagesLimit()I

    move-result v3

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isNotificationUpdate()Z

    move-result v6

    const/4 v1, 0x0

    iput-object v1, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->L$0:Ljava/lang/Object;

    iput-object p1, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->L$1:Ljava/lang/Object;

    iput-object p2, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->L$2:Ljava/lang/Object;

    iput v2, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl$updateStateFromDatabase$1;->label:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v7, 0x1

    move-object v1, p0

    move-object v2, p1

    invoke-virtual/range {v1 .. v8}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->updateDataForChannel(Lio/getstream/chat/android/models/Channel;IZZZZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    :goto_5
    return-object v0

    :cond_a
    move-object p1, p2

    move-object v0, v2

    :goto_6
    iget-object p2, v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getPaginationManager()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;

    move-result-object p2

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    invoke-interface {p2, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;->setOldestMessage(Lio/getstream/chat/android/models/Message;)V

    iget-object p2, v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setLocalOnlyMessages(Ljava/util/List;)V

    return-object v9
.end method

.method public final upsertMembers(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;)V"
        }
    .end annotation

    const-string v0, "members"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMembers(Ljava/util/List;)V

    return-void
.end method

.method public final upsertMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public final watch(IZLq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;-><init>(I)V

    invoke-virtual {v0, p2}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->toWatchChannelRequest(Z)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->setShouldRefresh(Z)V

    invoke-direct {p0, p1, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;->queryChannel(Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
