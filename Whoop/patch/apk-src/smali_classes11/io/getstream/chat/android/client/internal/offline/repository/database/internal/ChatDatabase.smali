.class public abstract Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;
.super Landroidx/room/z0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008!\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH&\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH&\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010#\u001a\u00020\"H&\u00a2\u0006\u0004\u0008#\u0010$J\u000f\u0010&\u001a\u00020%H&\u00a2\u0006\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;",
        "Landroidx/room/z0;",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;",
        "queryChannelsDao",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;",
        "userDao",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;",
        "reactionDao",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;",
        "messageDao",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;",
        "replyMessageDao",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;",
        "channelStateDao",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;",
        "channelConfigDao",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;",
        "syncStateDao",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao;",
        "attachmentDao",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;",
        "pollDao",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;",
        "threadDao",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;",
        "threadOrderDao",
        "()Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;",
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
.field public static final Companion:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase$Companion;

.field private static volatile INSTANCES:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase$Companion;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;->INSTANCES:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/room/z0;-><init>()V

    return-void
.end method

.method public static final synthetic access$getINSTANCES$cp()Ljava/util/Map;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;->INSTANCES:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public abstract attachmentDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao;
.end method

.method public abstract channelConfigDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;
.end method

.method public abstract channelStateDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;
.end method

.method public abstract messageDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;
.end method

.method public abstract pollDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;
.end method

.method public abstract queryChannelsDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;
.end method

.method public abstract reactionDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;
.end method

.method public abstract replyMessageDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;
.end method

.method public abstract syncStateDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;
.end method

.method public abstract threadDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;
.end method

.method public abstract threadOrderDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;
.end method

.method public abstract userDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;
.end method
