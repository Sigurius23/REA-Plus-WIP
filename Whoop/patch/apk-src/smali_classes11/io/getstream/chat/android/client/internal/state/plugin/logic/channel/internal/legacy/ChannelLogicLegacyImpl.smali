.class public final Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000e\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J%\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u0016H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ&\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ&\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0004\u0008 \u0010!J(\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00162\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0004\u0008\"\u0010!J\u001e\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001f\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u001f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010(\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008)\u0010*J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010(\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008+\u0010*J\u0017\u0010,\u001a\u00020\u00112\u0006\u0010(\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008,\u0010*J@\u00103\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u0004H\u0096@\u00a2\u0006\u0004\u00083\u00104J\u001d\u00108\u001a\u00020\u00112\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020605H\u0016\u00a2\u0006\u0004\u00088\u00109J\u0017\u0010;\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008;\u0010<J\u0017\u0010?\u001a\u00020\u00112\u0006\u0010>\u001a\u00020=H\u0016\u00a2\u0006\u0004\u0008?\u0010@J\u0017\u0010A\u001a\u00020\u00112\u0006\u0010>\u001a\u00020=H\u0016\u00a2\u0006\u0004\u0008A\u0010@J\u0017\u0010D\u001a\u00020\u00112\u0006\u0010C\u001a\u00020BH\u0016\u00a2\u0006\u0004\u0008D\u0010EJ\u0019\u0010F\u001a\u00020\u00112\u0008\u0010(\u001a\u0004\u0018\u00010%H\u0016\u00a2\u0006\u0004\u0008F\u0010*J\u000f\u0010G\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008G\u0010HJ\u000f\u0010I\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008I\u0010HJ\u0011\u0010J\u001a\u0004\u0018\u00010=H\u0016\u00a2\u0006\u0004\u0008J\u0010KJ\u0019\u0010L\u001a\u00020\u00112\u0008\u0010>\u001a\u0004\u0018\u00010=H\u0016\u00a2\u0006\u0004\u0008L\u0010@J\u0019\u0010M\u001a\u00020\u00112\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008M\u0010NJ\u001d\u0010Q\u001a\u00020\u00112\u000c\u0010P\u001a\u0008\u0012\u0004\u0012\u00020O05H\u0016\u00a2\u0006\u0004\u0008Q\u00109J\u0017\u0010S\u001a\u00020\u00112\u0006\u0010R\u001a\u00020OH\u0016\u00a2\u0006\u0004\u0008S\u0010TJ&\u0010X\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010U\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020VH\u0082@\u00a2\u0006\u0004\u0008X\u0010YJ\u001e\u0010Z\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010W\u001a\u00020VH\u0082@\u00a2\u0006\u0004\u0008Z\u0010[J3\u0010^\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u001b2\u000c\u0010\\\u001a\u0008\u0012\u0004\u0012\u00020%052\u000c\u0010]\u001a\u0008\u0012\u0004\u0012\u00020%05H\u0002\u00a2\u0006\u0004\u0008^\u0010_J\u001a\u0010`\u001a\u0004\u0018\u00010\u00172\u0006\u0010W\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0004\u0008`\u0010\u0013JB\u0010b\u001a\u00020\u00112\u0006\u0010a\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00042\u0008\u0008\u0002\u00102\u001a\u00020\u0004H\u0082@\u00a2\u0006\u0004\u0008b\u0010cJ\u0017\u0010d\u001a\u00020\u00112\u0006\u0010a\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008d\u0010eJ\"\u0010h\u001a\u0004\u0018\u00010\u00172\u0006\u0010f\u001a\u00020\u000b2\u0006\u0010g\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0004\u0008h\u0010iJ,\u0010l\u001a\u0008\u0012\u0004\u0012\u00020\u0017052\u000c\u0010j\u001a\u0008\u0012\u0004\u0012\u00020\u000b052\u0006\u0010g\u001a\u00020kH\u0082@\u00a2\u0006\u0004\u0008l\u0010mJ!\u0010o\u001a\u00020V2\u0006\u0010\u001c\u001a\u00020\u001b2\u0008\u0010n\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008o\u0010pJ!\u0010q\u001a\u00020V2\u0006\u0010\u001c\u001a\u00020\u001b2\u0008\u0010n\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008q\u0010pJ\u0017\u0010s\u001a\u00020V2\u0006\u0010r\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008s\u0010tJ)\u0010v\u001a\u00020V2\u0006\u0010g\u001a\u00020u2\u0006\u0010\u001c\u001a\u00020\u001b2\u0008\u0010n\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008v\u0010wJ\u0019\u0010y\u001a\u0004\u0018\u00010%2\u0006\u0010x\u001a\u00020uH\u0002\u00a2\u0006\u0004\u0008y\u0010zR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010{R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010|R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010}R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010~R\u001c\u0010\u000c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u007fR\u0018\u0010\u0081\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0084\u0001\u0010\u0085\u0001R!\u0010\u008b\u0001\u001a\u00030\u0086\u00018BX\u0082\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u0087\u0001\u0010\u0088\u0001\u001a\u0006\u0008\u0089\u0001\u0010\u008a\u0001R\u0017\u0010\u008e\u0001\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u008f\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0090\u0001\u0010\u0091\u0001\u00a8\u0006\u0093\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "repos",
        "",
        "userPresence",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;",
        "stateLogic",
        "Lbc3/c0;",
        "coroutineScope",
        "Lkotlin/Function0;",
        "",
        "getCurrentUserId",
        "<init>",
        "(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;ZLio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Lbc3/c0;Lc93/a;)V",
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
        "channel",
        "messageLimit",
        "shouldRefreshMessages",
        "scrollUpdate",
        "isNotificationUpdate",
        "isChannelsStateUpdate",
        "updateDataForChannel",
        "(Lio/getstream/chat/android/models/Channel;IZZZZLq83/d;)Ljava/lang/Object;",
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
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "events",
        "handleEvents",
        "event",
        "handleEvent",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)V",
        "src",
        "Lio/getstream/chat/android/client/api/models/WatchChannelRequest;",
        "request",
        "runChannelQuery",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;",
        "runChannelQueryOnline",
        "(Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;",
        "loadedMessages",
        "requestedMessages",
        "fillTheGap",
        "(ILjava/util/List;Ljava/util/List;)V",
        "runChannelQueryOffline",
        "localChannel",
        "updateDataFromLocalChannel",
        "(Lio/getstream/chat/android/models/Channel;ZIZZZLq83/d;)Ljava/lang/Object;",
        "updateOldMessagesFromLocalChannel",
        "(Lio/getstream/chat/android/models/Channel;)V",
        "channelId",
        "pagination",
        "selectAndEnrichChannel",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;",
        "channelIds",
        "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
        "selectAndEnrichChannels",
        "(Ljava/util/List;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;",
        "baseMessageId",
        "olderWatchChannelRequest",
        "(ILjava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;",
        "newerWatchChannelRequest",
        "aroundMessageId",
        "aroundIdWatchChannelRequest",
        "(Ljava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;",
        "Lio/getstream/chat/android/client/api/models/Pagination;",
        "watchChannelRequest",
        "(Lio/getstream/chat/android/client/api/models/Pagination;ILjava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;",
        "direction",
        "getLoadMoreBaseMessage",
        "(Lio/getstream/chat/android/client/api/models/Pagination;)Lio/getstream/chat/android/models/Message;",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "Z",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;",
        "Lbc3/c0;",
        "Lc93/a;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;",
        "mutableState",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;",
        "eventHandler",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "getCid",
        "()Ljava/lang/String;",
        "cid",
        "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;",
        "getMessagesUpdateLogic",
        "()Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;",
        "messagesUpdateLogic",
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
.field private final coroutineScope:Lbc3/c0;

.field private final eventHandler:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;

.field private final getCurrentUserId:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private final mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

.field private final repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

.field private final stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

.field private final userPresence:Z


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;ZLio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Lbc3/c0;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
            "Z",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;",
            "Lbc3/c0;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "repos"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateLogic"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getCurrentUserId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-boolean p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->userPresence:Z

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->coroutineScope:Lbc3/c0;

    iput-object p5, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->getCurrentUserId:Lc93/a;

    invoke-virtual {p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->writeChannelState()Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    new-instance p2, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getCid()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p3, p5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Lc93/a;)V

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->eventHandler:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;

    const-string p1, "Chat:ChannelLogicDB"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->logger$delegate:Ll83/h;

    return-void
.end method

.method public static final synthetic access$fillTheGap(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;ILjava/util/List;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->fillTheGap(ILjava/util/List;Ljava/util/List;)V

    return-void
.end method

.method public static final access$newerWatchChannelRequest(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;ILjava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lio/getstream/chat/android/client/api/models/Pagination;->GREATER_THAN:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-direct {p0, v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->watchChannelRequest(Lio/getstream/chat/android/client/api/models/Pagination;ILjava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    move-result-object p0

    return-object p0
.end method

.method public static final access$olderWatchChannelRequest(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;ILjava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lio/getstream/chat/android/client/api/models/Pagination;->LESS_THAN:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-direct {p0, v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->watchChannelRequest(Lio/getstream/chat/android/client/api/models/Pagination;ILjava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$runChannelQuery(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->runChannelQuery(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$runChannelQueryOffline(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->runChannelQueryOffline(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$runChannelQueryOnline(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->runChannelQueryOnline(Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$selectAndEnrichChannel(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->selectAndEnrichChannel(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$selectAndEnrichChannels(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;Ljava/util/List;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->selectAndEnrichChannels(Ljava/util/List;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateDataFromLocalChannel(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;Lio/getstream/chat/android/models/Channel;ZIZZZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p7}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->updateDataFromLocalChannel(Lio/getstream/chat/android/models/Channel;ZIZZZLq83/d;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final aroundIdWatchChannelRequest(Ljava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;
    .locals 4

    new-instance v0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v1, Lio/getstream/chat/android/client/api/models/Pagination;->AROUND_ID:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->setMessageFilterDirection(Lio/getstream/chat/android/client/api/models/Pagination;)V

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->setMessageFilterValue(Ljava/lang/String;)V

    iget-boolean p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->userPresence:Z

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->toWatchChannelRequest(Z)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    move-result-object p1

    invoke-virtual {p1, v3}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->setShouldRefresh(Z)V

    return-object p1
.end method

.method private final fillTheGap(ILjava/util/List;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    if-gtz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->coroutineScope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;

    const/4 v6, 0x0

    move-object v4, p0

    move v5, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$fillTheGap$1;-><init>(Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;ILq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    :goto_0
    return-void
.end method

.method private final getLoadMoreBaseMessage(Lio/getstream/chat/android/client/api/models/Pagination;)Lio/getstream/chat/android/models/Message;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getSortedMessages()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_1

    return-object v2

    :cond_1
    sget-object v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_4

    const/4 v1, 0x2

    if-eq p1, v1, :cond_4

    const/4 v1, 0x3

    if-eq p1, v1, :cond_3

    const/4 v1, 0x4

    if-eq p1, v1, :cond_3

    const/4 v1, 0x5

    if-ne p1, v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    :goto_1
    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Message;

    return-object p1

    :cond_4
    invoke-static {v0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Message;

    return-object p1
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final newerWatchChannelRequest(ILjava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/api/models/Pagination;->GREATER_THAN:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-direct {p0, v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->watchChannelRequest(Lio/getstream/chat/android/client/api/models/Pagination;ILjava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    move-result-object p1

    return-object p1
.end method

.method private final olderWatchChannelRequest(ILjava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/api/models/Pagination;->LESS_THAN:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-direct {p0, v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->watchChannelRequest(Lio/getstream/chat/android/client/api/models/Pagination;ILjava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    move-result-object p1

    return-object p1
.end method

.method private final runChannelQuery(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/models/WatchChannelRequest;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    iget-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->L$2:Ljava/lang/Object;

    check-cast p2, Ljava/util/List;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    iget-object v0, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->L$1:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->getLogger()Lb23/k;

    move-result-object p3

    iget-object v2, p3, Lb23/k;->c:Lb23/e;

    iget-object v6, p3, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object p3, p3, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v8, "[runChannelQuery] #"

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "; request: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, v7, v6, p1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getMessageList()Lec3/f2;

    move-result-object p1

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->L$2:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->label:I

    invoke-direct {p0, p2, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->runChannelQueryOffline(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast p3, Lio/getstream/chat/android/models/Channel;

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->L$2:Ljava/lang/Object;

    iput-object p3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->L$3:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQuery$1;->label:I

    invoke-direct {p0, p2, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->runChannelQueryOnline(Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    move-object v1, p2

    move-object p2, p1

    move-object p1, p3

    move-object p3, v0

    :goto_3
    check-cast p3, Ln23/h;

    instance-of v0, p3, Ln23/g;

    if-eqz v0, :cond_7

    move-object v2, p3

    check-cast v2, Ln23/g;

    iget-object v2, v2, Ln23/g;->a:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messagesLimit()I

    move-result v1

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v2

    invoke-direct {p0, v1, p2, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->fillTheGap(ILjava/util/List;Ljava/util/List;)V

    goto :goto_4

    :cond_7
    instance-of p2, p3, Ln23/f;

    if-eqz p2, :cond_a

    :goto_4
    if-eqz v0, :cond_8

    goto :goto_5

    :cond_8
    if-eqz p1, :cond_9

    new-instance p2, Ln23/g;

    invoke-direct {p2, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p2

    :cond_9
    :goto_5
    return-object p3

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final runChannelQueryOffline(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;->label:I

    :goto_0
    move-object v8, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    iget-object p1, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    iget-object v0, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringNewerMessages()Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringAroundIdMessages()Z

    move-result p2

    if-eqz p2, :cond_5

    :cond_4
    move-object v1, v4

    goto/16 :goto_5

    :cond_5
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getCid()Ljava/lang/String;

    move-result-object p2

    iput-object p1, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;->L$0:Ljava/lang/Object;

    iput v3, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;->label:I

    invoke-direct {p0, p2, p1, v8}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->selectAndEnrichChannel(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_6

    goto/16 :goto_4

    :cond_6
    :goto_2
    check-cast p2, Lio/getstream/chat/android/models/Channel;

    if-eqz p2, :cond_4

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v5, v1, Lb23/k;->c:Lb23/e;

    iget-object v6, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->x:Lb23/g;

    invoke-interface {v5, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    const-string v10, "[runChannelQueryOffline] completed; channel.cid: "

    const-string v11, ", channel.messages.size: "

    invoke-static {v9, v10, v5, v11}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v7, v6, v5, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->filteringOlderMessages()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->updateOldMessagesFromLocalChannel(Lio/getstream/chat/android/models/Channel;)V

    return-object p2

    :cond_8
    move v1, v3

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isNotificationUpdate()Z

    move-result v3

    move-object v5, v4

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->messagesLimit()I

    move-result v4

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringMessages()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_9

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringAroundIdMessages()Z

    move-result v6

    if-nez v6, :cond_9

    move-object v12, v5

    move v5, v1

    move-object v1, v12

    goto :goto_3

    :cond_9
    move-object v1, v5

    move v5, v7

    :goto_3
    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->getShouldRefresh()Z

    move-result v6

    iput-object v1, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;->L$0:Ljava/lang/Object;

    iput-object p2, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;->L$1:Ljava/lang/Object;

    iput-object v1, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;->L$2:Ljava/lang/Object;

    iput v7, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;->I$0:I

    iput v2, v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$runChannelQueryOffline$1;->label:I

    const/4 v7, 0x1

    move-object v1, p0

    move-object v2, p2

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->updateDataFromLocalChannel(Lio/getstream/chat/android/models/Channel;ZIZZZLq83/d;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    if-ne p1, v0, :cond_a

    :goto_4
    return-object v0

    :cond_a
    return-object v2

    :goto_5
    return-object v1
.end method

.method private final runChannelQueryOnline(Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;
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

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getChannelType()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getChannelId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, p1, v3}, Lio/getstream/chat/android/client/ChatClient;->queryChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Z)Lo23/d;

    move-result-object p1

    invoke-interface {p1, p2}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final selectAndEnrichChannel(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    instance-of v0, p3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannel$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannel$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannel$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannel$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannel$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannel$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannel$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannel$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p2}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/MapperKt;->toAnyChannelPaginationRequest(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    move-result-object p2

    const/4 p3, 0x0

    iput-object p3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannel$1;->L$0:Ljava/lang/Object;

    iput-object p3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannel$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannel$1;->label:I

    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->selectAndEnrichChannels(Ljava/util/List;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ljava/util/List;

    const/4 p1, 0x0

    invoke-static {p1, p3}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final selectAndEnrichChannels(Ljava/util/List;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannels$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannels$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannels$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannels$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannels$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannels$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannels$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannels$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannels$1;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannels$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    const/4 v2, 0x0

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannels$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannels$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl$selectAndEnrichChannels$1;->label:I

    invoke-virtual {p3, p1, p2, v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectChannels(Ljava/util/List;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p3, Ljava/util/Collection;

    invoke-static {p3, p2}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->applyPagination(Ljava/util/Collection;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final updateDataFromLocalChannel(Lio/getstream/chat/android/models/Channel;ZIZZZLq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "ZIZZZ",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->x:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v2

    const-string v5, ", messageLimit: "

    const-string v6, ", scrollUpdate: "

    const-string v7, "[updateDataFromLocalChannel] localChannel.cid: "

    invoke-static {p3, v7, v2, v5, v6}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, ", shouldRefreshMessages: "

    const-string v6, ", isChannelsStateUpdate: "

    invoke-static {v2, p4, v5, p5, v6}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    move v6, p6

    invoke-virtual {v2, p6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-interface {v1, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    move v6, p6

    :goto_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getHidden()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->setHidden(Z)V

    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getHiddenMessagesBefore()Ljava/util/Date;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->hideMessagesBefore(Ljava/util/Date;)V

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move v5, p2

    move v2, p3

    move v4, p4

    move v3, p5

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->updateDataForChannel(Lio/getstream/chat/android/models/Channel;IZZZZLq83/d;)Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic updateDataFromLocalChannel$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;Lio/getstream/chat/android/models/Channel;ZIZZZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 8

    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move-object v7, p7

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->updateDataFromLocalChannel(Lio/getstream/chat/android/models/Channel;ZIZZZLq83/d;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final updateOldMessagesFromLocalChannel(Lio/getstream/chat/android/models/Channel;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v1

    const-string v4, "[updateOldMessagesFromLocalChannel] localChannel.cid: "

    invoke-static {v4, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getHidden()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->setHidden(Z)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateOldMessagesFromChannel(Lio/getstream/chat/android/models/Channel;)V

    return-void
.end method

.method private final watchChannelRequest(Lio/getstream/chat/android/client/api/models/Pagination;ILjava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;
    .locals 8

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[watchChannelRequest] pagination: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", limit: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", baseMessageId: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    if-nez p3, :cond_3

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->getLoadMoreBaseMessage(Lio/getstream/chat/android/client/api/models/Pagination;)Lio/getstream/chat/android/models/Message;

    move-result-object p3

    if-eqz p3, :cond_2

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->x:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v5

    const-string v6, "[watchChannelRequest] baseMessage("

    const-string v7, "): "

    invoke-static {v6, v1, v7, v5}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v3, v2, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-virtual {p3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_2
    move-object p3, v4

    :cond_3
    :goto_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;

    invoke-direct {v0, p2}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;-><init>(I)V

    if-eqz p3, :cond_4

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->setMessageFilterDirection(Lio/getstream/chat/android/client/api/models/Pagination;)V

    invoke-virtual {v0, p3}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->setMessageFilterValue(Ljava/lang/String;)V

    :cond_4
    iget-boolean p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->userPresence:Z

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->toWatchChannelRequest(Z)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final deleteMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 7

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v4

    const-string v5, "[deleteMessage] message.id: "

    const-string v6, ", message.text: "

    invoke-static {v5, v1, v6, v4}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->deleteMessage(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public final getCid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getCid()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getLastStartTypingEvent()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLastStartTypingEvent()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public final getMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;
    .locals 54

    move-object/from16 v0, p1

    const-string v1, "messageId"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p0

    iget-object v2, v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getVisibleMessages$stream_chat_android_client_release()Lec3/f2;

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

.method public final getMessagesUpdateLogic()Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    return-object v0
.end method

.method public final handleEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 8

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->getCurrentUserId:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getCid()Ljava/lang/String;

    move-result-object v2

    const-string v5, ", currentUserId: "

    const-string v6, ", event: "

    const-string v7, "[handleEvent] cid: "

    invoke-static {v7, v2, v5, v0, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->eventHandler:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelEventHandlerLegacyImpl;->handle(Lio/getstream/chat/android/client/events/ChatEvent;)V

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

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->handleEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final hideMessagesBefore(Ljava/util/Date;)V
    .locals 1

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->hideMessagesBefore(Ljava/util/Date;)V

    return-void
.end method

.method public final loadAfter(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 5
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[loadAfter] messageId: "

    const-string v4, ", limit: "

    invoke-static {p2, v1, p1, v4}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->loadingNewerMessages()V

    sget-object v0, Lio/getstream/chat/android/client/api/models/Pagination;->GREATER_THAN:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-direct {p0, v0, p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->watchChannelRequest(Lio/getstream/chat/android/client/api/models/Pagination;ILjava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    move-result-object p1

    const-string p2, "loadAfter"

    invoke-direct {p0, p2, p1, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->runChannelQuery(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final loadAround(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[loadAround] messageId: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const-string v0, "loadAround"

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->aroundIdWatchChannelRequest(Ljava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    move-result-object p1

    invoke-direct {p0, v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->runChannelQuery(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final loadBefore(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 5
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[loadBefore] messageId: "

    const-string v4, ", limit: "

    invoke-static {p2, v1, p1, v4}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->loadingOlderMessages()V

    sget-object v0, Lio/getstream/chat/android/client/api/models/Pagination;->LESS_THAN:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-direct {p0, v0, p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->watchChannelRequest(Lio/getstream/chat/android/client/api/models/Pagination;ILjava/lang/String;)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    move-result-object p1

    const-string p2, "loadBefore"

    invoke-direct {p0, p2, p1, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->runChannelQuery(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final markRead()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->markRead()Z

    move-result v0

    return v0
.end method

.method public final onQueryChannelResult(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Ln23/h;)V
    .locals 1
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

    instance-of v0, p2, Ln23/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast p2, Ln23/g;

    iget-object p2, p2, Ln23/g;->a:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v0, p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->propagateChannelQuery(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V

    return-void

    :cond_0
    instance-of p1, p2, Ln23/f;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    check-cast p2, Ln23/f;

    iget-object p2, p2, Ln23/f;->a:Ln23/e;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->propagateQueryError(Ln23/e;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final removeMessagesBefore(Ljava/util/Date;)V
    .locals 3

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->removeMessagesBefore$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Ljava/util/Date;Lio/getstream/chat/android/models/Message;ILjava/lang/Object;)V

    return-void
.end method

.method public final setHidden(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->setHidden(Z)V

    return-void
.end method

.method public final setKeystrokeParentMessageId(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setKeystrokeParentMessageId$stream_chat_android_client_release(Ljava/lang/String;)V

    return-void
.end method

.method public final setLastStartTypingEvent(Ljava/util/Date;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->setLastStartTypingEvent(Ljava/util/Date;)V

    return-void
.end method

.method public final setPaginationDirection(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->filteringOlderMessages()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->loadingOlderMessages()V

    return-void

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringNewerMessages()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->loadingNewerMessages()V

    return-void

    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringMessages()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->loadingNewestMessages()V

    :cond_2
    return-void
.end method

.method public final setPushPreference(Lio/getstream/chat/android/models/PushPreference;)V
    .locals 1

    const-string v0, "preference"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->setPushPreference(Lio/getstream/chat/android/models/PushPreference;)V

    return-void
.end method

.method public final setRepliedMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->setRepliedMessage(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public final typingEventsEnabled()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getChannelConfig()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Config;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Config;->getTypingEventsEnabled()Z

    move-result v0

    return v0
.end method

.method public final updateDataForChannel(Lio/getstream/chat/android/models/Channel;IZZZZLq83/d;)Ljava/lang/Object;
    .locals 10
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    const/16 v8, 0x40

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move/from16 v6, p6

    invoke-static/range {v0 .. v9}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateDataForChannel$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Lio/getstream/chat/android/models/Channel;IZZZZZILjava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final updateLastMessageAt(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->updateLastMessageAt(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public final updateStateFromDatabase(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 5
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[updateStateFromDatabase] request: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isNotificationUpdate()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->syncMuteState$stream_chat_android_client_release()V

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->isFilteringNewerMessages()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->runChannelQueryOffline(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertMembers(Ljava/util/List;)V

    return-void
.end method

.method public final upsertMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 7

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v4

    const-string v5, "[upsertMessage] message.id: "

    const-string v6, ", message.text: "

    invoke-static {v5, v1, v6, v4}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public final watch(IZLq83/d;)Ljava/lang/Object;
    .locals 6
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->z:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "[watch] messagesLimit: "

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", userPresence: "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->getLoading()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->getLogger()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object p3, p1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {p2, v2, p3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    const-string v0, "Another request to watch this channel is in progress. Ignoring this request."

    if-eqz p2, :cond_1

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-interface {p1, v2, p3, v0, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    new-instance p1, Ln23/f;

    new-instance p2, Ln23/a;

    invoke-direct {p2, v0}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->stateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;->loadingNewestMessages()V

    new-instance v0, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;-><init>(I)V

    invoke-virtual {v0, p2}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->toWatchChannelRequest(Z)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->setShouldRefresh(Z)V

    const-string p2, "watch"

    invoke-direct {p0, p2, p1, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;->runChannelQuery(Ljava/lang/String;Lio/getstream/chat/android/client/api/models/WatchChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
