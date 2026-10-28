.class public final Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/factory/PluginFactory;
.implements Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory$Provider;


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J)\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0008\u0008\u0000\u0010\u0017*\u00020\u00162\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0018H\u0017\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\"R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010#R\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)\u00a8\u0006+"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;",
        "Lio/getstream/chat/android/client/plugin/factory/PluginFactory;",
        "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory$Provider;",
        "Landroid/content/Context;",
        "appContext",
        "",
        "",
        "ignoredChannelTypes",
        "Lkotlin/Function0;",
        "",
        "now",
        "<init>",
        "(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;",
        "createOfflinePlugin",
        "(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;",
        "context",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;",
        "createDatabase",
        "(Landroid/content/Context;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;",
        "",
        "T",
        "Lj93/d;",
        "klass",
        "resolveDependency",
        "(Lj93/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;",
        "createRepositoryFactory",
        "(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;",
        "Lio/getstream/chat/android/client/plugin/Plugin;",
        "get",
        "(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/plugin/Plugin;",
        "Landroid/content/Context;",
        "Ljava/util/Set;",
        "Lc93/a;",
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

.field private final ignoredChannelTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private final now:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Set;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 2
    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ignoredChannelTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ignoredChannelTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;->appContext:Landroid/content/Context;

    .line 5
    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;->ignoredChannelTypes:Ljava/util/Set;

    .line 6
    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;->now:Lc93/a;

    .line 7
    const-string p1, "Chat:OfflinePluginFactory"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;->logger$delegate:Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 8
    sget-object p2, Lm83/a0;->w:Lm83/a0;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 9
    new-instance p3, Lga1/b;

    const/16 p4, 0x8

    invoke-direct {p3, p4}, Lga1/b;-><init>(I)V

    .line 10
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;-><init>(Landroid/content/Context;Ljava/util/Set;Lc93/a;)V

    return-void
.end method

.method private static final _init_$lambda$0()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic a(Lbc3/k1;)Lbc3/e2;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;->createRepositoryFactory$lambda$2(Lbc3/k1;)Lq83/j;

    move-result-object p0

    check-cast p0, Lbc3/e2;

    return-object p0
.end method

.method private final createDatabase(Landroid/content/Context;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase$Companion;

    invoke-virtual {p2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase$Companion;->getDatabase(Landroid/content/Context;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;

    move-result-object p1

    return-object p1
.end method

.method private final createOfflinePlugin(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;
    .locals 27

    invoke-direct/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->x:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[createOfflinePlugin] user.id: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    invoke-static {v1}, Lio/getstream/chat/android/client/ChatClient;->access$setOFFLINE_SUPPORT_ENABLED$cp(Z)V

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object v2

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getRepositoryFacade()Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-result-object v3

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase;

    invoke-direct {v0, v3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryChannelListenerDatabase;-><init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;)V

    new-instance v7, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ThreadQueryListenerDatabase;

    invoke-direct {v7, v3, v3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ThreadQueryListenerDatabase;-><init>(Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/UserRepository;)V

    new-instance v8, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase;

    invoke-direct {v8, v3, v3, v2}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/EditMessageListenerDatabase;-><init>(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/setup/state/ClientState;)V

    new-instance v9, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase;

    invoke-direct {v9, v3, v3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/HideChannelListenerDatabase;-><init>(Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V

    new-instance v10, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase;

    invoke-direct {v10, v2, v3, v3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteReactionListenerDatabase;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V

    move-object/from16 v11, p0

    iget-object v6, v11, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;->ignoredChannelTypes:Ljava/util/Set;

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;

    move-object v4, v3

    move-object v5, v3

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendReactionListenerDatabase;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/UserRepository;Ljava/util/Set;)V

    new-instance v12, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;

    invoke-direct {v12, v2, v3, v3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageListenerDatabase;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/UserRepository;)V

    new-instance v13, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase;

    invoke-direct {v13, v2, v3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteMessageForMeListenerDatabase;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V

    new-instance v15, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;

    invoke-direct {v15, v3, v3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendMessageListenerDatabase;-><init>(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V

    new-instance v4, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase;

    invoke-direct {v4, v3, v3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/SendAttachmentsListenerDatabase;-><init>(Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;)V

    new-instance v14, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase;

    invoke-direct {v14, v3, v3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/ShuffleGiphyListenerDatabase;-><init>(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V

    new-instance v5, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase;

    invoke-direct {v5, v3, v3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryMembersListenerDatabase;-><init>(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;)V

    new-instance v6, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;

    invoke-direct {v6, v2, v3, v3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/UserRepository;)V

    move-object/from16 v16, v0

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteChannelListenerDatabase;

    invoke-direct {v0, v2, v3, v3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DeleteChannelListenerDatabase;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/UserRepository;)V

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/GetMessageListenerDatabase;

    invoke-direct {v2, v3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/GetMessageListenerDatabase;-><init>(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;)V

    move-object/from16 v19, v0

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase;

    invoke-direct {v0, v3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/FetchCurrentUserListenerDatabase;-><init>(Lio/getstream/chat/android/client/persistance/repository/UserRepository;)V

    move-object/from16 v21, v0

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryThreadsListenerDatabase;

    invoke-direct {v0, v3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/QueryThreadsListenerDatabase;-><init>(Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;)V

    move-object/from16 v22, v0

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase;

    invoke-direct {v0, v3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/DraftMessageListenerDatabase;-><init>(Lio/getstream/chat/android/client/persistance/repository/MessageRepository;)V

    move-object/from16 v18, v6

    move-object/from16 v6, v16

    move-object/from16 v16, v4

    new-instance v4, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;

    const/high16 v25, 0x80000

    const/16 v26, 0x0

    const/16 v24, 0x0

    move-object/from16 v23, v0

    move-object v11, v1

    move-object/from16 v20, v2

    move-object/from16 v17, v5

    move-object/from16 v5, p1

    invoke-direct/range {v4 .. v26}, Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;-><init>(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/plugin/listeners/QueryChannelListener;Lio/getstream/chat/android/client/plugin/listeners/ThreadQueryListener;Lio/getstream/chat/android/client/plugin/listeners/EditMessageListener;Lio/getstream/chat/android/client/plugin/listeners/HideChannelListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteReactionListener;Lio/getstream/chat/android/client/plugin/listeners/SendReactionListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteMessageForMeListener;Lio/getstream/chat/android/client/plugin/listeners/ShuffleGiphyListener;Lio/getstream/chat/android/client/plugin/listeners/SendMessageListener;Lio/getstream/chat/android/client/plugin/listeners/SendAttachmentListener;Lio/getstream/chat/android/client/plugin/listeners/QueryMembersListener;Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;Lio/getstream/chat/android/client/plugin/listeners/DeleteChannelListener;Lio/getstream/chat/android/client/plugin/listeners/GetMessageListener;Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;Lio/getstream/chat/android/client/plugin/listeners/QueryThreadsListener;Lio/getstream/chat/android/client/plugin/listeners/DraftMessageListener;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method

.method private static final createRepositoryFactory$lambda$2(Lbc3/k1;)Lq83/j;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbc3/e2;

    invoke-direct {v0, p0}, Lbc3/l1;-><init>(Lbc3/k1;)V

    return-object v0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final createRepositoryFactory(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;
    .locals 10

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;->getLogger()Lb23/k;

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

    const-string v4, "[createRepositoryFactory] user.id: \'"

    const-string v5, "\'"

    invoke-static {v4, v3, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    new-instance v4, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;->appContext:Landroid/content/Context;

    invoke-direct {p0, v0, p1}, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;->createDatabase(Landroid/content/Context;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;

    move-result-object v5

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    new-instance v1, Lh00/l0;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lh00/l0;-><init>(I)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/ChatClient;->inheritScope(Lkotlin/jvm/functions/Function1;)Lbc3/c0;

    move-result-object v7

    iget-object v8, p0, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;->ignoredChannelTypes:Ljava/util/Set;

    iget-object v9, p0, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;->now:Lc93/a;

    move-object v6, p1

    invoke-direct/range {v4 .. v9}, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;Lio/getstream/chat/android/models/User;Lbc3/c0;Ljava/util/Set;Lc93/a;)V

    return-object v4
.end method

.method public final get(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/plugin/Plugin;
    .locals 6

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;->getLogger()Lb23/k;

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
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/offline/plugin/factory/StreamOfflinePluginFactory;->createOfflinePlugin(Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/client/internal/offline/plugin/OfflinePlugin;

    move-result-object p1

    return-object p1
.end method

.method public final resolveDependency(Lj93/d;)Ljava/lang/Object;
    .locals 1
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

    const/4 p1, 0x0

    return-object p1
.end method
