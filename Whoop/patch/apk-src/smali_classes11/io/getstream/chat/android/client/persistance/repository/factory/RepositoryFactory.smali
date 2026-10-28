.class public interface abstract Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory$Provider;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008g\u0018\u00002\u00020\u0001:\u0001#J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007JY\u0010\u0010\u001a\u00020\u000f2\"\u0010\u000c\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00082$\u0010\u000e\u001a \u0008\u0001\u0012\u0004\u0012\u00020\t\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0008H&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u007f\u0010\u0018\u001a\u00020\u00172\"\u0010\u000c\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00082$\u0010\u000e\u001a \u0008\u0001\u0012\u0004\u0012\u00020\t\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00082$\u0010\u0016\u001a \u0008\u0001\u0012\u0004\u0012\u00020\t\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0008H&\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J3\u0010\u001b\u001a\u00020\u001a2\"\u0010\u000c\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0008H&\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ3\u0010\u001e\u001a\u00020\u001d2\"\u0010\u000c\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0008H&\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H&\u00a2\u0006\u0004\u0008!\u0010\"\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006$\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistance/repository/factory/RepositoryFactory;",
        "",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "createUserRepository",
        "()Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;",
        "createChannelConfigRepository",
        "()Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;",
        "Lkotlin/Function2;",
        "",
        "Lq83/d;",
        "Lio/getstream/chat/android/models/User;",
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


# virtual methods
.method public abstract createChannelConfigRepository()Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;
.end method

.method public abstract createChannelRepository(Lc93/m;Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            "Lc93/m;",
            ")",
            "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;"
        }
    .end annotation
.end method

.method public abstract createMessageRepository(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/MessageRepository;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            ")",
            "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;"
        }
    .end annotation
.end method

.method public abstract createQueryChannelsRepository()Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;
.end method

.method public abstract createReactionRepository(Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            ")",
            "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;"
        }
    .end annotation
.end method

.method public abstract createSyncStateRepository()Lio/getstream/chat/android/client/persistance/repository/SyncStateRepository;
.end method

.method public abstract createThreadsRepository(Lc93/m;Lc93/m;Lc93/m;)Lio/getstream/chat/android/client/persistance/repository/ThreadsRepository;
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
.end method

.method public abstract createUserRepository()Lio/getstream/chat/android/client/persistance/repository/UserRepository;
.end method
