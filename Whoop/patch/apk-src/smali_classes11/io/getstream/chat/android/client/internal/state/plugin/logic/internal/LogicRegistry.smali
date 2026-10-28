.class public final Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 d2\u00020\u0001:\u0001dBW\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#H\u0000\u00a2\u0006\u0004\u0008 \u0010%J\u001d\u0010(\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020\u0016\u00a2\u0006\u0004\u0008(\u0010\u001bJ\u001f\u0010,\u001a\u00020)2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020\u0016H\u0000\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u0010.\u001a\u0004\u0018\u00010\u00192\u0006\u0010-\u001a\u00020\u0016\u00a2\u0006\u0004\u0008.\u0010/J\u0017\u00101\u001a\u0004\u0018\u0001002\u0006\u0010-\u001a\u00020\u0016\u00a2\u0006\u0004\u00081\u00102J\u001a\u00103\u001a\u0004\u0018\u0001002\u0006\u0010-\u001a\u00020\u0016H\u0086@\u00a2\u0006\u0004\u00083\u00104J\u0017\u00106\u001a\u0004\u0018\u00010\u00192\u0006\u00105\u001a\u000200\u00a2\u0006\u0004\u00086\u00107J\u0017\u00109\u001a\u0004\u0018\u0001082\u0006\u0010-\u001a\u00020\u0016\u00a2\u0006\u0004\u00089\u0010:J\u0017\u0010;\u001a\u0004\u0018\u0001082\u0006\u00105\u001a\u000200\u00a2\u0006\u0004\u0008;\u0010<J\u001f\u0010>\u001a\u00020=2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008>\u0010?J\u0015\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020@\u00a2\u0006\u0004\u0008C\u0010DJ%\u0010C\u001a\u00020B2\u0008\u0010F\u001a\u0004\u0018\u00010E2\u000c\u0010I\u001a\u0008\u0012\u0004\u0012\u00020H0G\u00a2\u0006\u0004\u0008C\u0010JJ\u0013\u0010L\u001a\u0008\u0012\u0004\u0012\u00020B0K\u00a2\u0006\u0004\u0008L\u0010MJ\u0015\u0010N\u001a\u0002082\u0006\u0010-\u001a\u00020\u0016\u00a2\u0006\u0004\u0008N\u0010:J\u0013\u0010O\u001a\u0008\u0012\u0004\u0012\u00020\u001f0K\u00a2\u0006\u0004\u0008O\u0010MJ\u001d\u0010P\u001a\u00020\u00082\u0006\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020\u0016\u00a2\u0006\u0004\u0008P\u0010QJ\u0013\u0010R\u001a\u0008\u0012\u0004\u0012\u00020\u00190K\u00a2\u0006\u0004\u0008R\u0010MJ\u0015\u0010S\u001a\u00020\u00082\u0006\u0010-\u001a\u00020\u0016\u00a2\u0006\u0004\u0008S\u0010TJ\r\u0010U\u001a\u00020)\u00a2\u0006\u0004\u0008U\u0010VR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010WR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010XR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010YR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010ZR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010[R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\\R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010]R\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010^R\u0014\u0010\u0013\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010ZR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001f0_8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010`R,\u0010b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160a\u0012\u0004\u0012\u00020\u00190_8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008b\u0010`R6\u0010c\u001a$\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010E\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020H\u0018\u00010G0a\u0012\u0004\u0012\u00020B0_8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008c\u0010`R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u0002080_8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010`\u00a8\u0006e"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;",
        "Lio/getstream/chat/android/client/api/state/StateRegistry;",
        "stateRegistry",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "mutableGlobalState",
        "",
        "userPresence",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "repos",
        "Lio/getstream/chat/android/client/ChatClient;",
        "client",
        "Lbc3/c0;",
        "coroutineScope",
        "Lkotlin/Function0;",
        "",
        "now",
        "useLegacyChannelLogic",
        "<init>",
        "(Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;ZLio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lc93/a;Z)V",
        "",
        "type",
        "id",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;",
        "legacyChannelLogic",
        "(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;",
        "channelLogic",
        "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
        "identifier",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;",
        "queryChannels$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;)Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;",
        "queryChannels",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
        "queryChannelsRequest",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;",
        "channelType",
        "channelId",
        "channel",
        "Ll83/a0;",
        "removeChannel$stream_chat_android_client_release",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "removeChannel",
        "messageId",
        "channelFromMessageId",
        "(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;",
        "Lio/getstream/chat/android/models/Message;",
        "getMessageById",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;",
        "getMessageByIdFromDb",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "message",
        "channelFromMessage",
        "(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;",
        "threadFromMessageId",
        "(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;",
        "threadFromMessage",
        "(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;",
        "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;",
        "channelStateLogic",
        "(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;",
        "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
        "query",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;",
        "threads",
        "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;",
        "Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Thread;",
        "sort",
        "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;",
        "",
        "getActiveQueryThreadsLogic",
        "()Ljava/util/List;",
        "thread",
        "getActiveQueryChannelsLogic",
        "isActiveChannel",
        "(Ljava/lang/String;Ljava/lang/String;)Z",
        "getActiveChannelsLogic",
        "isActiveThread",
        "(Ljava/lang/String;)Z",
        "clear",
        "()V",
        "Lio/getstream/chat/android/client/api/state/StateRegistry;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "Z",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lbc3/c0;",
        "Lc93/a;",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "Ll83/k;",
        "channels",
        "queryThreads",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$Companion;

.field private static final MESSAGE_LIMIT:I = 0x1e


# instance fields
.field private final channels:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ll83/k;",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;",
            ">;"
        }
    .end annotation
.end field

.field private final client:Lio/getstream/chat/android/client/ChatClient;

.field private final clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

.field private final coroutineScope:Lbc3/c0;

.field private final mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

.field private final now:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final queryChannels:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;",
            ">;"
        }
    .end annotation
.end field

.field private final queryThreads:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ll83/k;",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;",
            ">;"
        }
    .end annotation
.end field

.field private final repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

.field private final stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

.field private final threads:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;",
            ">;"
        }
    .end annotation
.end field

.field private final useLegacyChannelLogic:Z

.field private final userPresence:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->Companion:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$Companion;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;ZLio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lc93/a;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/state/StateRegistry;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
            "Z",
            "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lbc3/c0;",
            "Lc93/a;",
            "Z)V"
        }
    .end annotation

    const-string v0, "stateRegistry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mutableGlobalState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repos"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "client"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    iput-boolean p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->userPresence:Z

    iput-object p5, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object p6, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->client:Lio/getstream/chat/android/client/ChatClient;

    iput-object p7, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->coroutineScope:Lbc3/c0;

    iput-object p8, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->now:Lc93/a;

    iput-boolean p9, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->useLegacyChannelLogic:Z

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->queryChannels:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channels:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->queryThreads:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->threads:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->legacyChannelLogic$lambda$8$lambda$7(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getRepos$p(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    return-object p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channelLogic$lambda$10$lambda$9(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final channelLogic(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;
    .locals 13

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channels:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {v2, p1, p2}, Lio/getstream/chat/android/client/api/state/StateRegistry;->channelState$stream_chat_android_client_release(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    move-result-object v7

    new-instance v5, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelMessagesUpdateLogicImpl;

    invoke-direct {v5, v7}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelMessagesUpdateLogicImpl;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;)V

    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;

    const-string v2, ":"

    invoke-static {p1, v2, p2}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v6, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-object v8, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    iget-boolean v9, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->userPresence:Z

    iget-object v10, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->coroutineScope:Lbc3/c0;

    new-instance v11, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/a;

    const/4 p1, 0x0

    invoke-direct {v11, p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/a;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;I)V

    iget-object v12, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->now:Lc93/a;

    invoke-direct/range {v3 .. v12}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogicImpl;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;ZLbc3/c0;Lc93/a;Lc93/a;)V

    invoke-interface {v0, v1, v3}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    move-object v2, p1

    :cond_1
    :goto_0
    check-cast v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    return-object v2
.end method

.method private static final channelLogic$lambda$10$lambda$9(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {p0}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object p0

    check-cast p0, Lec3/h2;

    invoke-virtual {p0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/models/User;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private final legacyChannelLogic(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;
    .locals 13

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channels:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {v2, p1, p2}, Lio/getstream/chat/android/client/api/state/StateRegistry;->legacyChannelState$stream_chat_android_client_release(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    move-result-object v5

    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    iget-object v6, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    new-instance v7, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;

    invoke-direct {v7, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;)V

    iget-object v9, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->now:Lc93/a;

    iget-object v10, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->coroutineScope:Lbc3/c0;

    const/16 v11, 0x10

    const/4 v12, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v12}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/SearchLogic;Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;Lc93/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;

    iget-object v7, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iget-boolean v8, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->userPresence:Z

    iget-object v10, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->coroutineScope:Lbc3/c0;

    new-instance v11, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/a;

    const/4 p1, 0x1

    invoke-direct {v11, p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/a;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;I)V

    move-object v9, v3

    invoke-direct/range {v6 .. v11}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelLogicLegacyImpl;-><init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;ZLio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/legacy/ChannelStateLogic;Lbc3/c0;Lc93/a;)V

    invoke-interface {v0, v1, v6}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    move-object v2, v6

    goto :goto_0

    :cond_0
    move-object v2, p1

    :cond_1
    :goto_0
    check-cast v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    return-object v2
.end method

.method private static final legacyChannelLogic$lambda$8$lambda$7(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {p0}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object p0

    check-cast p0, Lec3/h2;

    invoke-virtual {p0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/models/User;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;
    .locals 1

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->useLegacyChannelLogic:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->legacyChannelLogic(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channelLogic(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p1

    return-object p1
.end method

.method public final channelFromMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getShowInChannel()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object p1

    iget-object v0, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p1

    return-object p1
.end method

.method public final channelFromMessageId(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;
    .locals 3

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channels:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    invoke-interface {v2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->getMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    return-object v1
.end method

.method public final channelStateLogic(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;
    .locals 1

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->getMessagesUpdateLogic()Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;

    move-result-object p1

    return-object p1
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->queryChannels:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channels:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->queryThreads:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->threads:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->destroy()V

    return-void
.end method

.method public final getActiveChannelsLogic()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channels:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getActiveQueryChannelsLogic()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->queryChannels:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getActiveQueryThreadsLogic()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->queryThreads:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channelFromMessageId(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->getMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->threadFromMessageId(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->getMessage$stream_chat_android_client_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getMessageByIdFromDb(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 58
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$getMessageByIdFromDb$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$getMessageByIdFromDb$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$getMessageByIdFromDb$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$getMessageByIdFromDb$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$getMessageByIdFromDb$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$getMessageByIdFromDb$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$getMessageByIdFromDb$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$getMessageByIdFromDb$1;->label:I

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v2, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$getMessageByIdFromDb$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    iput-object v5, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$getMessageByIdFromDb$1;->L$0:Ljava/lang/Object;

    iput v6, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$getMessageByIdFromDb$1;->label:I

    move-object/from16 v4, p1

    invoke-virtual {v1, v4, v2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_3

    return-object v3

    :cond_3
    :goto_1
    move-object v6, v1

    check-cast v6, Lio/getstream/chat/android/models/Message;

    if-eqz v6, :cond_4

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

    const/16 v54, 0x0

    const/16 v55, -0x1

    invoke-static/range {v6 .. v57}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    return-object v1

    :cond_4
    return-object v5
.end method

.method public final isActiveChannel(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channels:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final isActiveThread(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->threads:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final queryChannels$stream_chat_android_client_release(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;
    .locals 1

    const-string v0, "queryChannelsRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifierKt;->getIdentifier(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->queryChannels$stream_chat_android_client_release(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;)Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;

    move-result-object p1

    return-object p1
.end method

.method public final queryChannels$stream_chat_android_client_release(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;)Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;
    .locals 5

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->queryChannels:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    .line 3
    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    .line 4
    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {v2, p1}, Lio/getstream/chat/android/client/api/state/StateRegistry;->queryChannels(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;)Lio/getstream/chat/android/client/api/state/QueryChannelsState;

    move-result-object v2

    .line 5
    check-cast v2, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    .line 6
    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    .line 7
    iget-object v4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->coroutineScope:Lbc3/c0;

    .line 8
    invoke-direct {v1, v2, v3, p0, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lbc3/c0;)V

    .line 9
    new-instance v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;

    .line 10
    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    .line 11
    invoke-direct {v2, v3, v3, v3, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;-><init>(Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;)V

    .line 12
    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;

    .line 13
    iget-object v4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->client:Lio/getstream/chat/android/client/ChatClient;

    .line 14
    invoke-direct {v3, p1, v4, v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;)V

    .line 15
    invoke-interface {v0, p1, v3}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    move-object v1, v3

    goto :goto_0

    :cond_0
    move-object v1, p1

    .line 16
    :cond_1
    :goto_0
    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;

    return-object v1
.end method

.method public final removeChannel$stream_chat_android_client_release(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->channels:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final thread(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;
    .locals 6

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->threads:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {v1, p1}, Lio/getstream/chat/android/client/api/state/StateRegistry;->mutableThread$stream_chat_android_client_release(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;)V

    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadStateLogic;)V

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->coroutineScope:Lbc3/c0;

    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v1, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry$thread$1$1$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Ljava/lang/String;Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;Lq83/d;)V

    const/4 v5, 0x3

    invoke-static {v2, v4, v4, v3, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, p1

    :cond_1
    :goto_0
    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    return-object v1
.end method

.method public final threadFromMessage(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->thread(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final threadFromMessageId(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;
    .locals 3

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->threads:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    invoke-virtual {v2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;->getMessage$stream_chat_android_client_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/thread/internal/ThreadLogic;

    return-object v1
.end method

.method public final threads(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;
    .locals 1

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->getFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->threads(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;

    move-result-object p1

    return-object p1
.end method

.method public final threads(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;)",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;"
        }
    .end annotation

    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->queryThreads:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    .line 5
    new-instance v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;

    .line 6
    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;

    .line 7
    iget-object v4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {v4, p1, p2}, Lio/getstream/chat/android/client/api/state/StateRegistry;->mutableQueryThreads$stream_chat_android_client_release(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    move-result-object p1

    .line 8
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    .line 9
    invoke-direct {v3, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V

    .line 10
    new-instance p1, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;

    .line 11
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;->repos:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    .line 12
    invoke-direct {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;-><init>(Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;)V

    .line 13
    invoke-direct {v2, v3, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsStateLogic;Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsDatabaseLogic;)V

    .line 14
    invoke-interface {v0, v1, v2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, p1

    .line 15
    :cond_1
    :goto_0
    check-cast v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querythreads/internal/QueryThreadsLogic;

    return-object v2
.end method
