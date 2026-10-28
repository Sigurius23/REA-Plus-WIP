.class public final Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory$Provider;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c0\u0002\u0018\u00002\u00020\u0001:\u0001&B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u007f\u0010\u0018\u001a\u00020\u00172\"\u0010\u0012\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r2$\u0010\u0014\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r2$\u0010\u0016\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\rH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ3\u0010\u001e\u001a\u00020\u001d2\"\u0010\u0012\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\rH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ3\u0010!\u001a\u00020 2\"\u0010\u0012\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\rH\u0016\u00a2\u0006\u0004\u0008!\u0010\"JY\u0010$\u001a\u00020#2\"\u0010\u0012\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r2$\u0010\u0014\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u000e\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\rH\u0016\u00a2\u0006\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory;",
        "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "createUserRepository",
        "()Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;",
        "createChannelConfigRepository",
        "()Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;",
        "createQueryChannelsRepository",
        "()Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;",
        "Lkotlin/Function2;",
        "",
        "Lq83/d;",
        "Lio/getstream/chat/android/models/User;",
        "",
        "getUser",
        "Lio/getstream/chat/android/models/Message;",
        "getMessage",
        "Lio/getstream/chat/android/models/Channel;",
        "getChannel",
        "Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;",
        "createThreadsRepository",
        "(Lc93/m;Lc93/m;Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;",
        "createSyncStateRepository",
        "()Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;",
        "createReactionRepository",
        "(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "createMessageRepository",
        "(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "createChannelRepository",
        "(Lc93/m;Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "Provider",
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
.field public static final INSTANCE:Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory;->INSTANCE:Lio/getstream/chat/android/client/persistance/repository/noop/NoOpRepositoryFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createChannelConfigRepository()Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/persistance/repository/noop/NoOpChannelConfigRepository;->INSTANCE:Lio/getstream/chat/android/client/persistance/repository/noop/NoOpChannelConfigRepository;

    return-object v0
.end method

.method public final createChannelRepository(Lc93/m;Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;
    .locals 1
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

    const-string p1, "getMessage"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/getstream/chat/android/client/persistance/repository/noop/NoOpChannelRepository;->INSTANCE:Lio/getstream/chat/android/client/persistance/repository/noop/NoOpChannelRepository;

    return-object p1
.end method

.method public final createMessageRepository(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/MessageRepository;
    .locals 1
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

    sget-object p1, Lio/getstream/chat/android/client/persistance/repository/noop/NoOpMessageRepository;->INSTANCE:Lio/getstream/chat/android/client/persistance/repository/noop/NoOpMessageRepository;

    return-object p1
.end method

.method public final createQueryChannelsRepository()Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/persistance/repository/noop/NoOpQueryChannelsRepository;->INSTANCE:Lio/getstream/chat/android/client/persistance/repository/noop/NoOpQueryChannelsRepository;

    return-object v0
.end method

.method public final createReactionRepository(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;
    .locals 1
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

    sget-object p1, Lio/getstream/chat/android/client/persistance/repository/noop/NoOpReactionRepository;->INSTANCE:Lio/getstream/chat/android/client/persistance/repository/noop/NoOpReactionRepository;

    return-object p1
.end method

.method public final createSyncStateRepository()Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/persistance/repository/noop/NoOpSyncStateRepository;->INSTANCE:Lio/getstream/chat/android/client/persistance/repository/noop/NoOpSyncStateRepository;

    return-object v0
.end method

.method public final createThreadsRepository(Lc93/m;Lc93/m;Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;
    .locals 1
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

    const-string p1, "getMessage"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "getChannel"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lio/getstream/chat/android/client/persistance/repository/noop/NoOpThreadsRepository;->INSTANCE:Lio/getstream/chat/android/client/persistance/repository/noop/NoOpThreadsRepository;

    return-object p1
.end method

.method public final createUserRepository()Lio/getstream/chat/android/client/persistance/repository/UserRepository;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/persistance/repository/noop/NoOpUserRepository;->INSTANCE:Lio/getstream/chat/android/client/persistance/repository/noop/NoOpUserRepository;

    return-object v0
.end method
