.class public final Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;
.super Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0003J)\u0010\u000f\u001a\u001c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\r\u0012\u000e\u0012\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\r0\u000e0\u000cH\u0014\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00120\r0\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J1\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u000e2\u001a\u0010\u0015\u001a\u0016\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00120\r\u0012\u0004\u0012\u00020\u00120\u000cH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010)\u001a\u00020(H\u0016\u00a2\u0006\u0004\u0008)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016\u00a2\u0006\u0004\u0008,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016\u00a2\u0006\u0004\u0008/\u00100J\u000f\u00102\u001a\u000201H\u0016\u00a2\u0006\u0004\u00082\u00103J\u000f\u00105\u001a\u000204H\u0016\u00a2\u0006\u0004\u00085\u00106J\u000f\u00108\u001a\u000207H\u0016\u00a2\u0006\u0004\u00088\u00109J\u000f\u0010;\u001a\u00020:H\u0016\u00a2\u0006\u0004\u0008;\u0010<R\u001a\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u00190=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\u001a\u0010@\u001a\u0008\u0012\u0004\u0012\u00020\u001c0=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010?R\u001a\u0010A\u001a\u0008\u0012\u0004\u0012\u00020\u001f0=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010?R\u001a\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\"0=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010?R\u001a\u0010C\u001a\u0008\u0012\u0004\u0012\u00020%0=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u0010?R\u001a\u0010D\u001a\u0008\u0012\u0004\u0012\u00020(0=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010?R\u001a\u0010E\u001a\u0008\u0012\u0004\u0012\u00020+0=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010?R\u001a\u0010F\u001a\u0008\u0012\u0004\u0012\u00020.0=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010?R\u001a\u0010G\u001a\u0008\u0012\u0004\u0012\u0002010=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010?R\u001a\u0010H\u001a\u0008\u0012\u0004\u0012\u0002040=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010?R\u001a\u0010I\u001a\u0008\u0012\u0004\u0012\u0002070=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010?R\u001a\u0010J\u001a\u0008\u0012\u0004\u0012\u00020:0=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010?\u00a8\u0006K"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;",
        "Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;",
        "<init>",
        "()V",
        "Landroidx/room/g1;",
        "createOpenDelegate",
        "()Landroidx/room/g1;",
        "Landroidx/room/v;",
        "createInvalidationTracker",
        "()Landroidx/room/v;",
        "Ll83/a0;",
        "clearAllTables",
        "",
        "Lj93/d;",
        "",
        "getRequiredTypeConverterClasses",
        "()Ljava/util/Map;",
        "",
        "Lmb/a;",
        "getRequiredAutoMigrationSpecClasses",
        "()Ljava/util/Set;",
        "autoMigrationSpecs",
        "Lmb/b;",
        "createAutoMigrations",
        "(Ljava/util/Map;)Ljava/util/List;",
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
        "Ll83/h;",
        "_queryChannelsDao",
        "Ll83/h;",
        "_userDao",
        "_reactionDao",
        "_messageDao",
        "_replyMessageDao",
        "_channelDao",
        "_channelConfigDao",
        "_syncStateDao",
        "_attachmentDao",
        "_pollDao",
        "_threadDao",
        "_threadOrderDao",
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
.field public static final synthetic a:I


# instance fields
.field private final _attachmentDao:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final _channelConfigDao:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final _channelDao:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final _messageDao:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final _pollDao:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final _queryChannelsDao:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final _reactionDao:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final _replyMessageDao:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final _syncStateDao:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final _threadDao:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final _threadOrderDao:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private final _userDao:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase;-><init>()V

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_queryChannelsDao:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_userDao:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_reactionDao:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_messageDao:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;

    const/16 v1, 0x8

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_replyMessageDao:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;

    const/16 v1, 0x9

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_channelDao:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;

    const/16 v1, 0xa

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_channelConfigDao:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;

    const/16 v1, 0xb

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_syncStateDao:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_attachmentDao:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_pollDao:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_threadDao:Ll83/h;

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/a;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_threadOrderDao:Ll83/h;

    return-void
.end method

.method private static final _attachmentDao$lambda$8(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0
.end method

.method private static final _channelConfigDao$lambda$6(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0
.end method

.method private static final _channelDao$lambda$5(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0
.end method

.method private static final _messageDao$lambda$3(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0
.end method

.method private static final _pollDao$lambda$9(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0
.end method

.method private static final _queryChannelsDao$lambda$0(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0
.end method

.method private static final _reactionDao$lambda$2(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0
.end method

.method private static final _replyMessageDao$lambda$4(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0
.end method

.method private static final _syncStateDao$lambda$7(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao_Impl;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao_Impl;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0
.end method

.method private static final _threadDao$lambda$10(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0
.end method

.method private static final _threadOrderDao$lambda$11(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0
.end method

.method private static final _userDao$lambda$1(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;-><init>(Landroidx/room/z0;)V

    return-object v0
.end method

.method public static final synthetic access$internalInitInvalidationTracker(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;Ltb/a;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/room/z0;->internalInitInvalidationTracker(Ltb/a;)V

    return-void
.end method


# virtual methods
.method public final attachmentDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_attachmentDao:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao;

    return-object v0
.end method

.method public final channelConfigDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_channelConfigDao:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;

    return-object v0
.end method

.method public final channelStateDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_channelDao:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;

    return-object v0
.end method

.method public final clearAllTables()V
    .locals 15

    const-string v13, "stream_chat_thread_order"

    const-string v14, "stream_chat_draft_message_entity"

    const-string v0, "stream_channel_query"

    const-string v1, "stream_chat_message"

    const-string v2, "stream_chat_reply_message"

    const-string v3, "attachment_inner_entity"

    const-string v4, "reply_attachment_inner_entity"

    const-string v5, "stream_chat_user"

    const-string v6, "stream_chat_reaction"

    const-string v7, "stream_chat_channel_state"

    const-string v8, "stream_chat_channel_config"

    const-string v9, "command_inner_entity"

    const-string v10, "stream_sync_state"

    const-string v11, "stream_chat_poll"

    const-string v12, "stream_chat_thread"

    filled-new-array/range {v0 .. v14}, [Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Landroidx/room/z0;->performClear(Z[Ljava/lang/String;)V

    return-void
.end method

.method public final createAutoMigrations(Ljava/util/Map;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lj93/d;",
            "+",
            "Lmb/a;",
            ">;)",
            "Ljava/util/List<",
            "Lmb/b;",
            ">;"
        }
    .end annotation

    const-string v0, "autoMigrationSpecs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1
.end method

.method public final createInvalidationTracker()Landroidx/room/v;
    .locals 18

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v2, Landroidx/room/v;

    const-string v16, "stream_chat_thread_order"

    const-string v17, "stream_chat_draft_message_entity"

    const-string v3, "stream_channel_query"

    const-string v4, "stream_chat_message"

    const-string v5, "stream_chat_reply_message"

    const-string v6, "attachment_inner_entity"

    const-string v7, "reply_attachment_inner_entity"

    const-string v8, "stream_chat_user"

    const-string v9, "stream_chat_reaction"

    const-string v10, "stream_chat_channel_state"

    const-string v11, "stream_chat_channel_config"

    const-string v12, "command_inner_entity"

    const-string v13, "stream_sync_state"

    const-string v14, "stream_chat_poll"

    const-string v15, "stream_chat_thread"

    filled-new-array/range {v3 .. v17}, [Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, p0

    invoke-direct {v2, v4, v0, v1, v3}, Landroidx/room/v;-><init>(Landroidx/room/z0;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;)V

    return-object v2
.end method

.method public final createOpenDelegate()Landroidx/room/g1;
    .locals 1

    .line 1
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl$createOpenDelegate$_openDelegate$1;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl$createOpenDelegate$_openDelegate$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;)V

    return-object v0
.end method

.method public final createOpenDelegate()Landroidx/room/h1;
    .locals 1

    .line 2
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl$createOpenDelegate$_openDelegate$1;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl$createOpenDelegate$_openDelegate$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;)V

    return-object v0
.end method

.method public final getRequiredAutoMigrationSpecClasses()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lj93/d;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    return-object v0
.end method

.method public final getRequiredTypeConverterClasses()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lj93/d;",
            "Ljava/util/List<",
            "Lj93/d;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    sget-object v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao_Impl$Companion;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    sget-object v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao_Impl$Companion;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    sget-object v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao_Impl$Companion;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    sget-object v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao_Impl$Companion;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    sget-object v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao_Impl$Companion;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    sget-object v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao_Impl$Companion;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    sget-object v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao_Impl$Companion;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    sget-object v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao_Impl$Companion;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    sget-object v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentDao_Impl$Companion;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    sget-object v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$Companion;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    sget-object v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao_Impl$Companion;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    sget-object v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao_Impl$Companion;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final messageDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_messageDao:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    return-object v0
.end method

.method public final pollDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_pollDao:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;

    return-object v0
.end method

.method public final queryChannelsDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_queryChannelsDao:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsDao;

    return-object v0
.end method

.method public final reactionDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_reactionDao:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;

    return-object v0
.end method

.method public final replyMessageDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_replyMessageDao:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;

    return-object v0
.end method

.method public final syncStateDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_syncStateDao:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/syncState/internal/SyncStateDao;

    return-object v0
.end method

.method public final threadDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_threadDao:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadDao;

    return-object v0
.end method

.method public final threadOrderDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_threadOrderDao:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadOrderDao;

    return-object v0
.end method

.method public final userDao()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/database/internal/ChatDatabase_Impl;->_userDao:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;

    return-object v0
.end method
