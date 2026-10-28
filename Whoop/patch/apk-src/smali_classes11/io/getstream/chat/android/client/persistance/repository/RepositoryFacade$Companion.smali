.class public final Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion;",
        "",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;",
        "factory",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/models/Config;",
        "defaultConfig",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "create",
        "(Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;Lbc3/c0;Lio/getstream/chat/android/models/Config;)Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion;Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;Lbc3/c0;Lio/getstream/chat/android/models/Config;ILjava/lang/Object;)Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;
    .locals 30

    and-int/lit8 v0, p4, 0x4

    if-eqz v0, :cond_0

    new-instance v1, Lio/getstream/chat/android/models/Config;

    const v28, 0x3ffffff

    const/16 v29, 0x0

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

    invoke-direct/range {v1 .. v29}, Lio/getstream/chat/android/models/Config;-><init>(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ZZZZZZZZZZZZZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    goto :goto_1

    :cond_0
    move-object/from16 v1, p3

    goto :goto_0

    :goto_1
    invoke-virtual {v0, v2, v3, v1}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion;->create(Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;Lbc3/c0;Lio/getstream/chat/android/models/Config;)Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final create(Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;Lbc3/c0;Lio/getstream/chat/android/models/Config;)Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;
    .locals 13
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "factory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultConfig"

    move-object/from16 v11, p3

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;->createUserRepository()Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    move-result-object v2

    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getUser$1;

    const/4 v1, 0x0

    invoke-direct {v0, v2, v1}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getUser$1;-><init>(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lq83/d;)V

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;->createMessageRepository(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/MessageRepository;

    move-result-object v7

    new-instance v1, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getMessage$1;

    invoke-direct {v1, v7}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getMessage$1;-><init>(Ljava/lang/Object;)V

    invoke-interface {p1, v0, v1}, Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;->createChannelRepository(Lc93/m;Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    move-result-object v4

    new-instance v3, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getChannel$1;

    invoke-direct {v3, v4}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade$Companion$create$getChannel$1;-><init>(Ljava/lang/Object;)V

    new-instance v5, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    invoke-interface {p1}, Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;->createChannelConfigRepository()Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;

    move-result-object v6

    move-object v8, v5

    invoke-interface {p1}, Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;->createQueryChannelsRepository()Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;

    move-result-object v5

    invoke-interface {p1, v0, v1, v3}, Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;->createThreadsRepository(Lc93/m;Lc93/m;Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;

    move-result-object v1

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;->createReactionRepository(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;

    move-result-object v0

    invoke-interface {p1}, Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;->createSyncStateRepository()Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;

    move-result-object v9

    const/4 v12, 0x0

    move-object v10, p2

    move-object v3, v6

    move-object v6, v1

    move-object v1, v8

    move-object v8, v0

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;-><init>(Lio/getstream/chat/android/client/persistance/repository/UserRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;Lio/getstream/chat/android/client/persistance/repository/MessageRepository;Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;Lbc3/c0;Lio/getstream/chat/android/models/Config;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
