.class public final Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/factory/PluginFactory;


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\'\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\u0089\u0001\u0010(\u001a\u00020\'2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u001c\u0010 \u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001e0\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001c2\u0012\u0010$\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020#0\"0!2\u0006\u0010&\u001a\u00020%H\u0002\u00a2\u0006\u0004\u0008(\u0010)J)\u0010-\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u0010**\u00020\u001f2\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00028\u00000+H\u0017\u00a2\u0006\u0004\u0008-\u0010.J\u0017\u00100\u001a\u00020/2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u00080\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00085\u00106\u001a\u0004\u00087\u00108\u00a8\u0006:"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;",
        "Lio/getstream/chat/android/client/plugin/factory/PluginFactory;",
        "Lio/getstream/chat/android/client/api/ChatClientConfig;",
        "config",
        "Landroid/content/Context;",
        "appContext",
        "<init>",
        "(Lio/getstream/chat/android/client/api/ChatClientConfig;Landroid/content/Context;)V",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;",
        "createStatePlugin",
        "(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "mutableGlobalState",
        "(Lio/getstream/chat/android/models/User;Lbc3/c0;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "client",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "logicRegistry",
        "Lio/getstream/chat/android/client/api/state/StateRegistry;",
        "stateRegistry",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "repos",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "Ll83/a0;",
        "",
        "sideEffect",
        "Lec3/l;",
        "",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "syncedEvents",
        "Lio/getstream/chat/android/client/api/MessageBufferConfig;",
        "bufferConfig",
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;",
        "createEventHandler",
        "(Lio/getstream/chat/android/models/User;Lbc3/c0;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lkotlin/jvm/functions/Function1;Lec3/l;Lio/getstream/chat/android/client/api/MessageBufferConfig;)Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;",
        "T",
        "Lj93/d;",
        "klass",
        "resolveDependency",
        "(Lj93/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/plugin/Plugin;",
        "get",
        "(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/plugin/Plugin;",
        "Lio/getstream/chat/android/client/api/ChatClientConfig;",
        "Landroid/content/Context;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
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
.field private final appContext:Landroid/content/Context;

.field private final config:Lio/getstream/chat/android/client/api/ChatClientConfig;

.field private final logger$delegate:Ll83/h;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/api/ChatClientConfig;Landroid/content/Context;)V
    .locals 1

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->config:Lio/getstream/chat/android/client/api/ChatClientConfig;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->appContext:Landroid/content/Context;

    const-string p1, "Chat:StatePluginFactory"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->logger$delegate:Ll83/h;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory$createStatePlugin$$inlined$CoroutineExceptionHandler$1;Lbc3/k1;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->createStatePlugin$lambda$3(Lkotlinx/coroutines/CoroutineExceptionHandler;Lbc3/k1;)Lq83/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->createEventHandler$lambda$6(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;

    return-object p0
.end method

.method private final createEventHandler(Lio/getstream/chat/android/models/User;Lbc3/c0;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lkotlin/jvm/functions/Function1;Lec3/l;Lio/getstream/chat/android/client/api/MessageBufferConfig;)Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Lbc3/c0;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
            "Lio/getstream/chat/android/client/api/state/StateRegistry;",
            "Lio/getstream/chat/android/client/setup/state/ClientState;",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
            "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
            "Lkotlin/jvm/functions/Function1;",
            "Lec3/l;",
            "Lio/getstream/chat/android/client/api/MessageBufferConfig;",
            ")",
            "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;"
        }
    .end annotation

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    new-instance v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;

    new-instance v2, Lio/getstream/chat/android/client/d;

    const/4 p1, 0x1

    invoke-direct {v2, p3, p1}, Lio/getstream/chat/android/client/d;-><init>(Lio/getstream/chat/android/client/ChatClient;I)V

    move-object v11, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    invoke-direct/range {v0 .. v11}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandlerSequential;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lkotlin/jvm/functions/Function1;Lec3/l;Lio/getstream/chat/android/client/api/MessageBufferConfig;Lbc3/c0;)V

    return-object v0
.end method

.method private static final createEventHandler$lambda$6(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/ChatClient;->subscribe(Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;

    move-result-object p0

    return-object p0
.end method

.method private final createStatePlugin(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;
    .locals 5

    .line 42
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory$createStatePlugin$$inlined$CoroutineExceptionHandler$1;

    sget-object v1, Lbc3/a0;->w:Lbc3/a0;

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory$createStatePlugin$$inlined$CoroutineExceptionHandler$1;-><init>(Lbc3/a0;)V

    .line 43
    sget-object v1, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v1

    new-instance v2, Lhb2/c;

    const/16 v3, 0x11

    invoke-direct {v2, v0, v3}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/ChatClient;->inheritScope(Lkotlin/jvm/functions/Function1;)Lbc3/c0;

    move-result-object v0

    .line 44
    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v1, v2, v3, v4, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;-><init>(Ljava/lang/String;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, p1, v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->createStatePlugin(Lio/getstream/chat/android/models/User;Lbc3/c0;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;

    move-result-object p1

    return-object p1
.end method

.method private final createStatePlugin(Lio/getstream/chat/android/models/User;Lbc3/c0;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;
    .locals 21

    move-object/from16 v0, p0

    .line 1
    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->getLogger()Lb23/k;

    move-result-object v1

    .line 2
    invoke-virtual {v1}, Lb23/k;->c()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->x:Lb23/g;

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v1}, Lb23/k;->a()Lb23/j;

    move-result-object v2

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[createStatePlugin] user.id: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 5
    invoke-static {v2, v3, v1, v4}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    :cond_0
    sget-object v1, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v3

    .line 7
    invoke-virtual {v3}, Lio/getstream/chat/android/client/ChatClient;->getRepositoryFacade()Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-result-object v7

    .line 8
    invoke-virtual {v3}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object v4

    .line 9
    new-instance v9, Lio/getstream/chat/android/client/api/state/StateRegistry;

    move-object v5, v9

    .line 10
    invoke-interface {v4}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object v9

    .line 11
    invoke-virtual {v7}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->observeLatestUsers()Lec3/f2;

    move-result-object v10

    .line 12
    invoke-virtual/range {p3 .. p3}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->getActiveLiveLocations()Lec3/f2;

    move-result-object v11

    .line 13
    invoke-interface/range {p2 .. p2}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v1

    invoke-static {v1}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object v12

    .line 14
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->config:Lio/getstream/chat/android/client/api/ChatClientConfig;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/ChatClientConfig;->getNow()Lc93/a;

    move-result-object v13

    .line 15
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->config:Lio/getstream/chat/android/client/api/ChatClientConfig;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/ChatClientConfig;->getMessageLimitConfig()Lio/getstream/chat/android/client/api/MessageLimitConfig;

    move-result-object v15

    .line 16
    invoke-virtual/range {p3 .. p3}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->getMuted()Lec3/f2;

    move-result-object v16

    .line 17
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->config:Lio/getstream/chat/android/client/api/ChatClientConfig;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/ChatClientConfig;->getUseLegacyChannelLogic()Z

    move-result v17

    move-object/from16 v14, p2

    move-object v8, v5

    .line 18
    invoke-direct/range {v8 .. v17}, Lio/getstream/chat/android/client/api/state/StateRegistry;-><init>(Lec3/f2;Lec3/f2;Lec3/f2;Lbc3/k1;Lc93/a;Lbc3/c0;Lio/getstream/chat/android/client/api/MessageLimitConfig;Lec3/f2;Z)V

    .line 19
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v20

    .line 20
    new-instance v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    .line 21
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->config:Lio/getstream/chat/android/client/api/ChatClientConfig;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/ChatClientConfig;->getUserPresence()Z

    move-result v6

    .line 22
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->config:Lio/getstream/chat/android/client/api/ChatClientConfig;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/ChatClientConfig;->getNow()Lc93/a;

    move-result-object v10

    .line 23
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->config:Lio/getstream/chat/android/client/api/ChatClientConfig;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/ChatClientConfig;->getUseLegacyChannelLogic()Z

    move-result v11

    move-object/from16 v9, p2

    move-object v8, v3

    move-object v3, v5

    move-object/from16 v5, p3

    .line 24
    invoke-direct/range {v2 .. v11}, Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;-><init>(Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;ZLio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lc93/a;Z)V

    move-object v5, v3

    move-object v3, v8

    .line 25
    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/ChatClient;->setLogicRegistry(Lio/getstream/chat/android/client/channel/state/ChannelStateLogicProvider;)V

    .line 26
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    .line 27
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->config:Lio/getstream/chat/android/client/api/ChatClientConfig;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/ChatClientConfig;->getUserPresence()Z

    move-result v10

    .line 28
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->config:Lio/getstream/chat/android/client/api/ChatClientConfig;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/ChatClientConfig;->isAutomaticSyncOnReconnectEnabled()Z

    move-result v11

    .line 29
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->config:Lio/getstream/chat/android/client/api/ChatClientConfig;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/ChatClientConfig;->getSyncMaxThreshold()Lio/getstream/chat/android/models/TimeDuration;

    move-result-object v12

    .line 30
    invoke-virtual {v8}, Lio/getstream/chat/android/client/ChatClient;->getServerClockOffset()Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;

    move-result-object v14

    move-object v6, v2

    .line 31
    new-instance v2, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;

    .line 32
    new-instance v13, Lio/getstream/chat/android/client/k;

    const/4 v1, 0x4

    invoke-direct {v13, v1}, Lio/getstream/chat/android/client/k;-><init>(I)V

    const/16 v18, 0x6000

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v15, p2

    move-object v9, v5

    move-object v5, v4

    move-object v4, v8

    move-object v8, v6

    move-object/from16 v6, p3

    .line 33
    invoke-direct/range {v2 .. v19}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/api/state/StateRegistry;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;Lbc3/c0;Lio/getstream/chat/android/core/internal/coroutines/Tube;Lec3/p1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v12, v2

    move-object v3, v4

    move-object v4, v5

    move-object v2, v8

    move-object v5, v9

    .line 34
    invoke-virtual {v12}, Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;->getSyncedEvents()Lec3/l;

    move-result-object v10

    .line 35
    new-instance v9, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory$createStatePlugin$eventHandler$1;

    invoke-direct {v9, v12}, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory$createStatePlugin$eventHandler$1;-><init>(Ljava/lang/Object;)V

    .line 36
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->config:Lio/getstream/chat/android/client/api/ChatClientConfig;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/ChatClientConfig;->getMessageLimitConfig()Lio/getstream/chat/android/client/api/MessageLimitConfig;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/MessageLimitConfig;->getMessageBufferConfig()Lio/getstream/chat/android/client/api/MessageBufferConfig;

    move-result-object v11

    move-object/from16 v1, p1

    move-object v6, v4

    move-object v8, v7

    move-object/from16 v7, p3

    move-object v4, v2

    move-object/from16 v2, p2

    .line 37
    invoke-direct/range {v0 .. v11}, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->createEventHandler(Lio/getstream/chat/android/models/User;Lbc3/c0;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lkotlin/jvm/functions/Function1;Lec3/l;Lio/getstream/chat/android/client/api/MessageBufferConfig;)Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;

    move-result-object v11

    move-object v2, v4

    move-object v4, v6

    move-object v7, v8

    .line 38
    new-instance v1, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;

    move-object/from16 v14, p2

    invoke-direct {v1, v14, v2, v4, v7}, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandlerFactory;-><init>(Lbc3/c0;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;)V

    .line 39
    new-instance v4, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;

    .line 40
    iget-object v14, v0, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->config:Lio/getstream/chat/android/client/api/ChatClientConfig;

    move-object v9, v5

    move-object v8, v6

    move-object v10, v12

    move-object/from16 v13, v20

    move-object/from16 v12, p3

    move-object v5, v1

    move-object v6, v2

    .line 41
    invoke-direct/range {v4 .. v14}, Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;-><init>(Lio/getstream/chat/android/client/errorhandler/factory/ErrorHandlerFactory;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/internal/state/sync/internal/SyncManager;Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventHandler;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lec3/p1;Lio/getstream/chat/android/client/api/ChatClientConfig;)V

    return-object v4
.end method

.method private static final createStatePlugin$lambda$3(Lkotlinx/coroutines/CoroutineExceptionHandler;Lbc3/k1;)Lq83/j;
    .locals 1

    const-string v0, "parentJob"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbc3/e2;

    invoke-direct {v0, p1}, Lbc3/l1;-><init>(Lbc3/k1;)V

    sget-object p1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {p1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object p1

    invoke-static {v0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    invoke-interface {p1, p0}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p0

    return-object p0
.end method

.method private static final createStatePlugin$lambda$5()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final get(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/plugin/Plugin;
    .locals 6

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[get] user.id: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->createStatePlugin(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/state/plugin/internal/StatePlugin;

    move-result-object p1

    return-object p1
.end method

.method public final resolveDependency(Lj93/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lj93/d;",
            ")TT;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "klass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lio/getstream/chat/android/client/api/ChatClientConfig;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/factory/StreamStatePluginFactory;->config:Lio/getstream/chat/android/client/api/ChatClientConfig;

    const-string v0, "null cannot be cast to non-null type T of io.getstream.chat.android.client.internal.state.plugin.factory.StreamStatePluginFactory.resolveDependency"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
