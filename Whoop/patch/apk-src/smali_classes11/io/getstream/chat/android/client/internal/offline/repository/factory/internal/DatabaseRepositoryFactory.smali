.class public final Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015JY\u0010\u001d\u001a\u00020\u001c2\"\u0010\u0019\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00162$\u0010\u001b\u001a \u0008\u0001\u0012\u0004\u0012\u00020\t\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0016H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u007f\u0010%\u001a\u00020$2\"\u0010\u0019\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00162$\u0010\u001b\u001a \u0008\u0001\u0012\u0004\u0012\u00020\t\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00162$\u0010#\u001a \u0008\u0001\u0012\u0004\u0012\u00020\t\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0016H\u0016\u00a2\u0006\u0004\u0008%\u0010&J3\u0010(\u001a\u00020\'2\"\u0010\u0019\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0016H\u0016\u00a2\u0006\u0004\u0008(\u0010)J3\u0010+\u001a\u00020*2\"\u0010\u0019\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0016H\u0016\u00a2\u0006\u0004\u0008+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016\u00a2\u0006\u0004\u0008.\u0010/R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u00102R\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u00103R\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u00104R*\u00107\u001a\u0016\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u001806\u0012\u0004\u0012\u00020\u0018058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00087\u00108\u00a8\u00069"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;",
        "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;",
        "database",
        "Lio/getstream/chat/android/models/User;",
        "currentUser",
        "Lbc3/c0;",
        "scope",
        "",
        "",
        "ignoredChannelTypes",
        "Lkotlin/Function0;",
        "",
        "now",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;Lio/getstream/chat/android/models/User;Lbc3/c0;Ljava/util/Set;Lc93/a;)V",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "createUserRepository",
        "()Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;",
        "createChannelConfigRepository",
        "()Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;",
        "Lkotlin/Function2;",
        "Lq83/d;",
        "",
        "getUser",
        "Lio/getstream/chat/android/models/Message;",
        "getMessage",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "createChannelRepository",
        "(Lc93/m;Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;",
        "createQueryChannelsRepository",
        "()Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;",
        "Lio/getstream/chat/android/models/Channel;",
        "getChannel",
        "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;",
        "createThreadsRepository",
        "(Lc93/m;Lc93/m;Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "createMessageRepository",
        "(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;",
        "createReactionRepository",
        "(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;",
        "createSyncStateRepository",
        "()Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;",
        "Lio/getstream/chat/android/models/User;",
        "Lbc3/c0;",
        "Ljava/util/Set;",
        "Lc93/a;",
        "",
        "Ljava/lang/Class;",
        "repositoriesCache",
        "Ljava/util/Map;",
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
.field private final currentUser:Lio/getstream/chat/android/models/User;

.field private final database:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;

.field private final ignoredChannelTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final now:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private repositoriesCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final scope:Lbc3/c0;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;Lio/getstream/chat/android/models/User;Lbc3/c0;Ljava/util/Set;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;",
            "Lio/getstream/chat/android/models/User;",
            "Lbc3/c0;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "database"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentUser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ignoredChannelTypes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->database:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->currentUser:Lio/getstream/chat/android/models/User;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->scope:Lbc3/c0;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->ignoredChannelTypes:Ljava/util/Set;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->now:Lc93/a;

    .line 7
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->repositoriesCache:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;Lio/getstream/chat/android/models/User;Lbc3/c0;Ljava/util/Set;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 8
    new-instance p5, Lio/getstream/chat/android/client/k;

    const/4 p6, 0x2

    invoke-direct {p5, p6}, Lio/getstream/chat/android/client/k;-><init>(I)V

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 9
    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;Lio/getstream/chat/android/models/User;Lbc3/c0;Ljava/util/Set;Lc93/a;)V

    return-void
.end method

.method private static final _init_$lambda$0()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final createChannelConfigRepository()Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->repositoriesCache:Ljava/util/Map;

    const-class v1, Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/DatabaseChannelConfigRepository;

    if-eqz v2, :cond_0

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/DatabaseChannelConfigRepository;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/DatabaseChannelConfigRepository;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->database:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;->channelConfigDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;

    move-result-object v2

    invoke-direct {v0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/DatabaseChannelConfigRepository;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;)V

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->repositoriesCache:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final createChannelRepository(Lc93/m;Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            "Lc93/m;",
            ")",
            "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;"
        }
    .end annotation

    const-string v0, "getUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->repositoriesCache:Ljava/util/Map;

    const-class v1, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;

    if-eqz v2, :cond_0

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->createMessageRepository(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    move-result-object v2

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->scope:Lbc3/c0;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->database:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;->channelStateDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;

    move-result-object v5

    new-instance v8, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory$createChannelRepository$1$1;

    invoke-direct {v8, v2}, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory$createChannelRepository$1$1;-><init>(Ljava/lang/Object;)V

    iget-object v9, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->now:Lc93/a;

    const/16 v11, 0x40

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v3 .. v12}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;-><init>(Lbc3/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;Lc93/m;Lc93/m;Lc93/m;Lc93/a;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->repositoriesCache:Ljava/util/Map;

    invoke-interface {p1, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v3
.end method

.method public final createMessageRepository(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/MessageRepository;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            ")",
            "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;"
        }
    .end annotation

    const-string v0, "getUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->repositoriesCache:Ljava/util/Map;

    const-class v1, Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;

    if-eqz v2, :cond_0

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->scope:Lbc3/c0;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->database:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;->messageDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    move-result-object v4

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->database:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;->replyMessageDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;

    move-result-object v5

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->database:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;->pollDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;

    move-result-object v6

    iget-object v8, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->currentUser:Lio/getstream/chat/android/models/User;

    iget-object v9, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->ignoredChannelTypes:Ljava/util/Set;

    const/16 v10, 0x3e8

    move-object v7, p1

    invoke-direct/range {v2 .. v10}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;-><init>(Lbc3/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;Lc93/m;Lio/getstream/chat/android/models/User;Ljava/util/Set;I)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->repositoriesCache:Ljava/util/Map;

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method

.method public final createQueryChannelsRepository()Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->repositoriesCache:Ljava/util/Map;

    const-class v1, Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;

    if-eqz v2, :cond_0

    check-cast v0, Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->database:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;->queryChannelsDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;

    move-result-object v2

    invoke-direct {v0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;)V

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->repositoriesCache:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public final createReactionRepository(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            ")",
            "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;"
        }
    .end annotation

    const-string v0, "getUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->repositoriesCache:Ljava/util/Map;

    const-class v1, Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;

    if-eqz v2, :cond_0

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->database:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;->reactionDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;

    move-result-object v2

    invoke-direct {v0, v2, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;Lc93/m;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->repositoriesCache:Ljava/util/Map;

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final createSyncStateRepository()Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->repositoriesCache:Ljava/util/Map;

    const-class v1, Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository;

    if-eqz v2, :cond_0

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->database:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;->syncStateDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;

    move-result-object v2

    invoke-direct {v0, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/DatabaseSyncStateRepository;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;)V

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->repositoriesCache:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final createThreadsRepository(Lc93/m;Lc93/m;Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/m;",
            ")",
            "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;"
        }
    .end annotation

    const-string v0, "getUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getChannel"

    move-object v6, p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->repositoriesCache:Ljava/util/Map;

    const-class v11, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    invoke-interface {v0, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    if-eqz v1, :cond_0

    check-cast v0, Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual/range {p0 .. p1}, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->createMessageRepository(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    move-result-object v1

    if-nez v0, :cond_1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->database:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;->threadDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->database:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;->threadOrderDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;

    move-result-object v3

    new-instance v7, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory$createThreadsRepository$1$1;

    invoke-direct {v7, v1}, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory$createThreadsRepository$1$1;-><init>(Ljava/lang/Object;)V

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v4, p1

    move-object v5, p2

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/DatabaseThreadsRepository;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;Lc93/m;Lc93/m;Lc93/m;Lc93/m;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->repositoriesCache:Ljava/util/Map;

    invoke-interface {v0, v11, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_1
    return-object v0
.end method

.method public final createUserRepository()Lio/getstream/chat/android/client/persistance/repository/UserRepository;
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->repositoriesCache:Ljava/util/Map;

    const-class v1, Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;

    if-eqz v2, :cond_0

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->scope:Lbc3/c0;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->database:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;->userDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;

    move-result-object v3

    const/16 v4, 0x3e8

    invoke-direct {v0, v2, v3, v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DatabaseUserRepository;-><init>(Lbc3/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;I)V

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/factory/internal/DatabaseRepositoryFactory;->repositoriesCache:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
