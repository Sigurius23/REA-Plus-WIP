.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/persistance/repository/MessageRepository;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$Companion;,
        Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 j2\u00020\u0001:\u0001jBk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\"\u0010\u000f\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0011\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J(\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u000b2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ&\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u0008 \u0010!J\u001e\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\"\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008#\u0010$J&\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008%\u0010&J$\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u001aH\u0096@\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010*\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008*\u0010$J\u001e\u0010-\u001a\u00020,2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096@\u00a2\u0006\u0004\u0008-\u0010)J\u0018\u0010/\u001a\u00020,2\u0006\u0010.\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0004\u0008/\u00100J\u0018\u00102\u001a\u00020,2\u0006\u0010.\u001a\u000201H\u0096@\u00a2\u0006\u0004\u00082\u00103J\u0018\u00104\u001a\u00020,2\u0006\u0010.\u001a\u000201H\u0096@\u00a2\u0006\u0004\u00084\u00103J\u0016\u00105\u001a\u0008\u0012\u0004\u0012\u0002010\u001aH\u0096@\u00a2\u0006\u0004\u00085\u00106J\u001a\u00107\u001a\u0004\u0018\u0001012\u0006\u0010\u0017\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u00087\u0010$J\u001a\u00109\u001a\u0004\u0018\u0001012\u0006\u00108\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u00089\u0010$J \u0010<\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020:H\u0096@\u00a2\u0006\u0004\u0008<\u0010=J\u0018\u0010>\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008>\u0010$J\u0018\u0010?\u001a\u00020,2\u0006\u0010.\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0004\u0008?\u00100J\u001e\u0010@\u001a\u00020,2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096@\u00a2\u0006\u0004\u0008@\u0010)J\u001e\u0010C\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u001a2\u0006\u0010B\u001a\u00020AH\u0096@\u00a2\u0006\u0004\u0008C\u0010DJ\u001e\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010B\u001a\u00020AH\u0096@\u00a2\u0006\u0004\u0008E\u0010DJ\u001e\u0010G\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010F\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008G\u0010$J\u0018\u0010H\u001a\u00020,2\u0006\u0010\u001e\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008H\u0010$J\u0010\u0010I\u001a\u00020,H\u0096@\u00a2\u0006\u0004\u0008I\u00106J\u0018\u0010J\u001a\u00020,2\u0006\u0010F\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008J\u0010$J\u0010\u0010K\u001a\u00020,H\u0096@\u00a2\u0006\u0004\u0008K\u00106J\u001e\u0010L\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u000bH\u0096@\u00a2\u0006\u0004\u0008L\u0010$J\u001a\u0010M\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0004\u0008M\u0010$J(\u0010O\u001a\u0008\u0012\u0004\u0012\u00020N0\u001a2\u0006\u0010\u0017\u001a\u00020\u000b2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0082@\u00a2\u0006\u0004\u0008O\u0010\u001dJ$\u0010P\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u001aH\u0082@\u00a2\u0006\u0004\u0008P\u0010)J\u001a\u0010Q\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0004\u0008Q\u0010$J\u0017\u0010R\u001a\u00020,2\u0006\u0010.\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008R\u0010SJ\u0014\u0010T\u001a\u00020\u001b*\u00020NH\u0082@\u00a2\u0006\u0004\u0008T\u0010UJ\u001a\u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010F\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0004\u0008W\u0010$J\u0013\u0010X\u001a\u00020\u001b*\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008X\u0010YR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010ZR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010[R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\\R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010]R0\u0010\u000f\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010^R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010_R\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010`R \u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b0a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008b\u0010cR \u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b0a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008d\u0010cR\u001a\u0010f\u001a\u0008\u0012\u0004\u0012\u00020\u000b0e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008f\u0010`R\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008h\u0010i\u00a8\u0006k"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;",
        "messageDao",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;",
        "replyMessageDao",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;",
        "pollDao",
        "Lkotlin/Function2;",
        "",
        "Lq83/d;",
        "Lio/getstream/chat/android/models/User;",
        "",
        "getUser",
        "currentUser",
        "",
        "ignoredChannelTypes",
        "",
        "cacheSize",
        "<init>",
        "(Lbc3/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;Lc93/m;Lio/getstream/chat/android/models/User;Ljava/util/Set;I)V",
        "cid",
        "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
        "pagination",
        "",
        "Lio/getstream/chat/android/models/Message;",
        "selectMessagesForChannel",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;",
        "messageId",
        "limit",
        "selectMessagesForThread",
        "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "userId",
        "selectAllUserMessages",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "selectAllChannelUserMessages",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "messageIds",
        "selectMessages",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "selectMessage",
        "messages",
        "Ll83/a0;",
        "insertMessages",
        "message",
        "insertMessage",
        "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "insertDraftMessage",
        "(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;",
        "deleteDraftMessage",
        "selectDraftMessages",
        "(Lq83/d;)Ljava/lang/Object;",
        "selectDraftMessagesByCid",
        "parentId",
        "selectDraftMessageByParentId",
        "Ljava/util/Date;",
        "hideMessagesBefore",
        "deleteChannelMessagesBefore",
        "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;",
        "deleteChannelMessages",
        "deleteChannelMessage",
        "deleteMessages",
        "Lio/getstream/chat/android/models/SyncStatus;",
        "syncStatus",
        "selectMessageIdsBySyncState",
        "(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;",
        "selectMessageBySyncState",
        "pollId",
        "selectMessagesWithPoll",
        "evictMessage",
        "evictMessages",
        "deletePoll",
        "clear",
        "selectLocalOnlyMessagesForChannel",
        "selectRepliedMessage",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
        "selectMessagesEntitiesForChannel",
        "fetchMessagesFromDB",
        "fetchMessageFromDB",
        "updateCache",
        "(Lio/getstream/chat/android/models/Message;)V",
        "toMessage",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/Poll;",
        "getPoll",
        "filterReactions",
        "(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;",
        "Lc93/m;",
        "Lio/getstream/chat/android/models/User;",
        "Ljava/util/Set;",
        "La0/a0;",
        "messageCache",
        "La0/a0;",
        "replyMessageCache",
        "",
        "deletedMessageIds",
        "Lmc3/a;",
        "dbMutex",
        "Lmc3/a;",
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
.field private static final Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$Companion;

.field private static final DEFAULT_MESSAGE_LIMIT:I = 0x64


# instance fields
.field private final currentUser:Lio/getstream/chat/android/models/User;

.field private final dbMutex:Lmc3/a;

.field private final deletedMessageIds:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final getUser:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final ignoredChannelTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final messageCache:La0/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La0/a0;"
        }
    .end annotation
.end field

.field private final messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

.field private final pollDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;

.field private final replyMessageCache:La0/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La0/a0;"
        }
    .end annotation
.end field

.field private final replyMessageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;

.field private final scope:Lbc3/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$Companion;

    return-void
.end method

.method public constructor <init>(Lbc3/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;Lc93/m;Lio/getstream/chat/android/models/User;Ljava/util/Set;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;",
            "Lc93/m;",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;I)V"
        }
    .end annotation

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "replyMessageDao"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pollDao"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getUser"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentUser"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ignoredChannelTypes"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->scope:Lbc3/c0;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->replyMessageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->pollDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->getUser:Lc93/m;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->currentUser:Lio/getstream/chat/android/models/User;

    .line 8
    iput-object p7, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->ignoredChannelTypes:Ljava/util/Set;

    .line 9
    new-instance p1, La0/a0;

    invoke-direct {p1, p8}, La0/a0;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageCache:La0/a0;

    .line 10
    new-instance p1, La0/a0;

    invoke-direct {p1, p8}, La0/a0;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->replyMessageCache:La0/a0;

    .line 11
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->deletedMessageIds:Ljava/util/Set;

    .line 12
    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->dbMutex:Lmc3/a;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;Lc93/m;Lio/getstream/chat/android/models/User;Ljava/util/Set;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/16 v0, 0x3e8

    move v9, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    goto :goto_1

    :cond_0
    move/from16 v9, p8

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {v1 .. v9}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;-><init>(Lbc3/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;Lc93/m;Lio/getstream/chat/android/models/User;Ljava/util/Set;I)V

    return-void
.end method

.method public static final synthetic access$fetchMessageFromDB(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->fetchMessageFromDB(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$fetchMessagesFromDB(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->fetchMessagesFromDB(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMessageDao$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    return-object p0
.end method

.method public static final synthetic access$getPoll(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->getPoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getReplyMessageDao$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->replyMessageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;

    return-object p0
.end method

.method public static final synthetic access$selectMessagesEntitiesForChannel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->selectMessagesEntitiesForChannel(Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$selectRepliedMessage(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->selectRepliedMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toMessage(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->toMessage(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final fetchMessageFromDB(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessageFromDB$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessageFromDB$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessageFromDB$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessageFromDB$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessageFromDB$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessageFromDB$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessageFromDB$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessageFromDB$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessageFromDB$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessageFromDB$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessageFromDB$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessageFromDB$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->select(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    if-eqz p2, :cond_6

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessageFromDB$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessageFromDB$1;->label:I

    invoke-direct {p0, p2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->toMessage(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p2, Lio/getstream/chat/android/models/Message;

    if-eqz p2, :cond_6

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->updateCache(Lio/getstream/chat/android/models/Message;)V

    return-object p2

    :cond_6
    return-object v5
.end method

.method private final fetchMessagesFromDB(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->I$1:I

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->I$0:I

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->L$7:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->L$6:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->L$4:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->L$3:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->L$2:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->select(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p2, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v4, p1

    move-object v7, p2

    move p1, v5

    move v2, p1

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->L$3:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->L$4:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->L$5:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->L$6:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->L$7:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->I$0:I

    iput p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->I$1:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->I$2:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$fetchMessagesFromDB$1;->label:I

    invoke-direct {p0, p2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->toMessage(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    move-object v8, v4

    :goto_4
    check-cast p2, Lio/getstream/chat/android/models/Message;

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->updateCache(Lio/getstream/chat/android/models/Message;)V

    invoke-interface {v4, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v4, v8

    goto :goto_2

    :cond_6
    check-cast v4, Ljava/util/List;

    return-object v4
.end method

.method private final filterReactions(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 57

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Reaction;->getDeletedAt()Ljava/util/Date;

    move-result-object v4

    if-nez v4, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/models/Reaction;

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->currentUser:Lio/getstream/chat/android/models/User;

    if-eqz v5, :cond_3

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Reaction;->getUserId()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->currentUser:Lio/getstream/chat/android/models/User;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    :cond_3
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getLatestReactions()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Reaction;->getDeletedAt()Ljava/util/Date;

    move-result-object v5

    if-nez v5, :cond_5

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    const v55, 0xffff

    const/16 v56, 0x0

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

    const v54, -0x30001

    move-object/from16 v5, p1

    move-object/from16 v23, v1

    move-object/from16 v22, v3

    invoke-static/range {v5 .. v56}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    return-object v1
.end method

.method private final getPoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Poll;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$getPoll$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$getPoll$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$getPoll$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$getPoll$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$getPoll$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$getPoll$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$getPoll$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$getPoll$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$getPoll$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$getPoll$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->pollDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$getPoll$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$getPoll$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;->getPoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;

    if-eqz p2, :cond_6

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->getUser:Lc93/m;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$getPoll$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$getPoll$1;->label:I

    invoke-static {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p2, Lio/getstream/chat/android/models/Poll;

    return-object p2

    :cond_6
    return-object v5
.end method

.method private final selectMessagesEntitiesForChannel(Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    :pswitch_0
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/Pagination;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p3

    :pswitch_1
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ljava/util/Date;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$3:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    goto :goto_1

    :pswitch_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/Pagination;

    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$1:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->getMessageFilterDirection()Lio/getstream/chat/android/client/api/models/Pagination;

    move-result-object p3

    goto :goto_2

    :cond_1
    move-object p3, v4

    :goto_2
    if-eqz p3, :cond_f

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->getMessageFilterValue()Ljava/lang/String;

    move-result-object v5

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->label:I

    invoke-interface {v2, v5, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->select(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    goto/16 :goto_7

    :cond_2
    move-object v7, v2

    move-object v2, p1

    move-object p1, p3

    move-object p3, v7

    :goto_3
    check-cast p3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;->getMessageInnerEntity()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v5

    goto :goto_4

    :cond_3
    move-object v5, v4

    :goto_4
    sget-object v6, Lm83/y;->w:Lm83/y;

    if-nez v5, :cond_4

    return-object v6

    :cond_4
    invoke-virtual {p2}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->getMessageLimit()I

    move-result p2

    invoke-virtual {p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;->getMessageInnerEntity()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    move-result-object p3

    invoke-virtual {p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object p3

    if-nez p1, :cond_5

    const/4 p1, -0x1

    goto :goto_5

    :cond_5
    sget-object v5, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v5, p1

    :goto_5
    const/4 v5, 0x2

    if-eq p1, v3, :cond_d

    const/4 v3, 0x3

    if-eq p1, v5, :cond_b

    const/4 v5, 0x4

    if-eq p1, v3, :cond_9

    const/4 v3, 0x5

    if-eq p1, v5, :cond_7

    if-ne p1, v3, :cond_6

    return-object v6

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_7
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$1:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$3:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$4:Ljava/lang/Object;

    iput p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->label:I

    invoke-interface {p1, v2, p2, p3, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->messagesForChannelOlderThan(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_7

    :cond_8
    return-object p1

    :cond_9
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$1:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$3:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$4:Ljava/lang/Object;

    iput p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->I$0:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->label:I

    invoke-interface {p1, v2, p2, p3, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->messagesForChannelEqualOrOlderThan(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_7

    :cond_a
    return-object p1

    :cond_b
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$1:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$3:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$4:Ljava/lang/Object;

    iput p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->label:I

    invoke-interface {p1, v2, p2, p3, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->messagesForChannelNewerThan(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_c

    goto :goto_7

    :cond_c
    return-object p1

    :cond_d
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$1:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$3:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$4:Ljava/lang/Object;

    iput p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->I$0:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->label:I

    invoke-interface {p1, v2, p2, p3, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->messagesForChannelEqualOrNewerThan(Ljava/lang/String;ILjava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_e

    goto :goto_7

    :cond_e
    return-object p1

    :cond_f
    iget-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    if-eqz p2, :cond_10

    invoke-virtual {p2}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->getMessageLimit()I

    move-result p2

    goto :goto_6

    :cond_10
    const/16 p2, 0x64

    :goto_6
    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$1:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->L$2:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesEntitiesForChannel$1;->label:I

    invoke-interface {p3, p1, p2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->messagesForChannel(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_11

    :goto_7
    return-object v1

    :cond_11
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final selectRepliedMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectRepliedMessage$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectRepliedMessage$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectRepliedMessage$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectRepliedMessage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectRepliedMessage$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectRepliedMessage$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectRepliedMessage$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectRepliedMessage$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectRepliedMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectRepliedMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->replyMessageCache:La0/a0;

    invoke-virtual {p2, p1}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/Message;

    if-nez p2, :cond_7

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->replyMessageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectRepliedMessage$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectRepliedMessage$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;->selectById(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;

    if-eqz p2, :cond_6

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->getUser:Lc93/m;

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectRepliedMessage$2;

    invoke-direct {v2, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectRepliedMessage$2;-><init>(Ljava/lang/Object;)V

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectRepliedMessage$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectRepliedMessage$1;->label:I

    invoke-static {p2, p1, v2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p2, Lio/getstream/chat/android/models/Message;

    return-object p2

    :cond_6
    return-object v5

    :cond_7
    return-object p2
.end method

.method private final toMessage(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$toMessage$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$toMessage$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$toMessage$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$toMessage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$toMessage$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$toMessage$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$toMessage$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$toMessage$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$toMessage$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;

    iget-object v0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$toMessage$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->getUser:Lc93/m;

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$toMessage$2;

    invoke-direct {v2, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$toMessage$2;-><init>(Ljava/lang/Object;)V

    new-instance v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$toMessage$3;

    invoke-direct {v4, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$toMessage$3;-><init>(Ljava/lang/Object;)V

    const/4 v5, 0x0

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$toMessage$1;->L$0:Ljava/lang/Object;

    iput-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$toMessage$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$toMessage$1;->label:I

    invoke-static {p1, p2, v2, v4, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    check-cast p2, Lio/getstream/chat/android/models/Message;

    invoke-direct {p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->filterReactions(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p1

    return-object p1
.end method

.method private final updateCache(Lio/getstream/chat/android/models/Message;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageCache:La0/a0;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->deletedMessageIds:Ljava/util/Set;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final clear(Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception p1

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->I$1:I

    iget v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->I$0:I

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lmc3/a;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object p1, v5

    goto/16 :goto_3

    :catchall_1
    move-exception p1

    move-object v0, v5

    goto/16 :goto_6

    :cond_3
    iget v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->I$1:I

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->I$0:I

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lmc3/a;

    :try_start_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move p1, v3

    move v3, v2

    move v2, p1

    move-object p1, v6

    goto :goto_2

    :catchall_2
    move-exception p1

    move-object v0, v6

    goto/16 :goto_6

    :cond_4
    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->I$0:I

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v7

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageCache:La0/a0;

    const/4 v2, -0x1

    invoke-virtual {p1, v2}, La0/a0;->i(I)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->replyMessageCache:La0/a0;

    invoke-virtual {p1, v2}, La0/a0;->i(I)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->dbMutex:Lmc3/a;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->I$0:I

    iput v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->label:I

    invoke-interface {p1, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    goto :goto_4

    :cond_6
    move v2, v3

    :goto_1
    :try_start_3
    iget-object v7, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->L$0:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->I$1:I

    iput v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->label:I

    invoke-interface {v7, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_7

    goto :goto_4

    :cond_7
    move v9, v3

    move v3, v2

    move v2, v9

    :goto_2
    iget-object v6, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->I$0:I

    iput v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->I$1:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->label:I

    invoke-interface {v6, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->deleteAllDrafts(Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    iget-object v5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->replyMessageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->I$0:I

    iput v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->I$1:I

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$clear$1;->label:I

    invoke-interface {v5, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageDao;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    if-ne v0, v1, :cond_9

    :goto_4
    return-object v1

    :cond_9
    move-object v0, p1

    :goto_5
    invoke-interface {v0, v8}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_3
    move-exception v0

    move-object v9, v0

    move-object v0, p1

    move-object p1, v9

    :goto_6
    invoke-interface {v0, v8}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public final deleteChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->deletedMessageIds:Ljava/util/Set;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageCache:La0/a0;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, La0/a0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->scope:Lbc3/c0;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->dbMutex:Lmc3/a;

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$deleteChannelMessage$2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$deleteChannelMessage$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lio/getstream/chat/android/models/Message;Lq83/d;)V

    invoke-static {v0, v1, v2, p2}, Lio/getstream/chat/android/client/internal/offline/extensions/CoroutineScopeExtensionsKt;->launchWithMutex(Lbc3/c0;Lmc3/a;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteChannelMessages(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageCache:La0/a0;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, La0/a0;->i(I)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->replyMessageCache:La0/a0;

    invoke-virtual {v0, v1}, La0/a0;->i(I)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->scope:Lbc3/c0;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->dbMutex:Lmc3/a;

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$deleteChannelMessages$2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$deleteChannelMessages$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Ljava/lang/String;Lq83/d;)V

    invoke-static {v0, v1, v2, p2}, Lio/getstream/chat/android/client/internal/offline/extensions/CoroutineScopeExtensionsKt;->launchWithMutex(Lbc3/c0;Lmc3/a;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteChannelMessagesBefore(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageCache:La0/a0;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, La0/a0;->i(I)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->replyMessageCache:La0/a0;

    invoke-virtual {v0, v1}, La0/a0;->i(I)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->scope:Lbc3/c0;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->dbMutex:Lmc3/a;

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$deleteChannelMessagesBefore$2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, p2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$deleteChannelMessagesBefore$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Ljava/lang/String;Ljava/util/Date;Lq83/d;)V

    invoke-static {v0, v1, v2, p3}, Lio/getstream/chat/android/client/internal/offline/extensions/CoroutineScopeExtensionsKt;->launchWithMutex(Lbc3/c0;Lmc3/a;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteDraftMessage(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/DraftMessage;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->deleteDraftMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->deletedMessageIds:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageCache:La0/a0;

    invoke-virtual {v2, v1}, La0/a0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->replyMessageCache:La0/a0;

    invoke-virtual {v2, v1}, La0/a0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->scope:Lbc3/c0;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->dbMutex:Lmc3/a;

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$deleteMessages$3;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v0, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$deleteMessages$3;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Ljava/util/List;Lq83/d;)V

    invoke-static {p1, v1, v2, p2}, Lio/getstream/chat/android/client/internal/offline/extensions/CoroutineScopeExtensionsKt;->launchWithMutex(Lbc3/c0;Lmc3/a;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deletePoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->pollDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;->deletePoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final evictMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageCache:La0/a0;

    invoke-virtual {p2, p1}, La0/a0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->replyMessageCache:La0/a0;

    invoke-virtual {p2, p1}, La0/a0;->e(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final evictMessages(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageCache:La0/a0;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, La0/a0;->i(I)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->replyMessageCache:La0/a0;

    invoke-virtual {p1, v0}, La0/a0;->i(I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertDraftMessage(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/DraftMessage;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertDraftMessage$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertDraftMessage$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertDraftMessage$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertDraftMessage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertDraftMessage$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertDraftMessage$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertDraftMessage$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertDraftMessage$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertDraftMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/DraftMessage;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertDraftMessage$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Message;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertDraftMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/DraftMessage;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/DraftMessage;->getReplyMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p2

    if-eqz p2, :cond_4

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertDraftMessage$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertDraftMessage$1;->L$1:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertDraftMessage$1;->I$0:I

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertDraftMessage$1;->label:I

    invoke-virtual {p0, p2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt;->toEntity(Lio/getstream/chat/android/models/DraftMessage;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;

    move-result-object p1

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertDraftMessage$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertDraftMessage$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertDraftMessage$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->insertDraftMessages(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->insertMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->label:I

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x1

    const/4 v7, 0x2

    const/4 v8, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v7, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$4:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$3:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v2, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$5:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$3:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$2:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$1:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$0:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_e

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_12

    :cond_4
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_5
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v11}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v11

    if-lez v11, :cond_5

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lio/getstream/chat/android/models/Message;

    iget-object v12, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->ignoredChannelTypes:Ljava/util/Set;

    invoke-virtual {v11}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v11

    const-string v13, ":"

    invoke-static {v11, v13}, Lyb3/r;->I0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v12, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_7

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_9
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v11, v9

    check-cast v11, Lio/getstream/chat/android/models/Message;

    iget-object v12, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->deletedMessageIds:Ljava/util/Set;

    invoke-virtual {v11}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v12, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_a
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_b
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lio/getstream/chat/android/models/Message;

    iget-object v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageCache:La0/a0;

    invoke-virtual {v12}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    invoke-static {v13, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b

    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_c
    new-instance v9, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v4, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v9, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lio/getstream/chat/android/models/Message;

    invoke-static {v12}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt;->toEntity(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    move-result-object v12

    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_d
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_e
    :goto_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_f

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v13}, Lio/getstream/chat/android/models/Message;->getReplyTo()Lio/getstream/chat/android/models/Message;

    move-result-object v13

    if-eqz v13, :cond_e

    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_f
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_7
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_11

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Lio/getstream/chat/android/models/Message;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->replyMessageCache:La0/a0;

    invoke-virtual {v15}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_10

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    const/4 v6, 0x1

    const/4 v7, 0x2

    goto :goto_7

    :cond_11
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v12, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_12

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lio/getstream/chat/android/models/Message;

    invoke-static {v12}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt;->toReplyEntity(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;

    move-result-object v12

    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_12
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_13
    :goto_9
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_14

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Lio/getstream/chat/android/models/Message;

    invoke-static {v14}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v14

    if-eqz v14, :cond_13

    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_14
    iget-object v12, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->deletedMessageIds:Ljava/util/Set;

    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v7, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v13, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_15

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v11}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_15
    invoke-interface {v12, v13}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-static {v4, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_16
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_18

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v11}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v11

    if-eqz v11, :cond_17

    invoke-static {v11}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt;->toEntity(Lio/getstream/chat/android/models/Poll;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;

    move-result-object v11

    goto :goto_c

    :cond_17
    move-object v11, v8

    :goto_c
    if-eqz v11, :cond_16

    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_18
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_19

    goto :goto_d

    :cond_19
    move-object v7, v8

    :goto_d
    if-eqz v7, :cond_1b

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->pollDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$2:Ljava/lang/Object;

    iput-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$3:Ljava/lang/Object;

    iput-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$5:Ljava/lang/Object;

    const/4 v11, 0x0

    iput v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->I$0:I

    const/4 v11, 0x1

    iput v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->label:I

    invoke-interface {v1, v7, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;->insertPolls(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_1a

    goto :goto_11

    :cond_1a
    move-object/from16 v16, v6

    move-object v6, v4

    move-object/from16 v4, v16

    :goto_e
    move-object/from16 v16, v6

    move-object v6, v4

    move-object/from16 v4, v16

    :cond_1b
    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Message;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->replyMessageCache:La0/a0;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11, v4}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_f

    :cond_1c
    check-cast v10, Ljava/lang/Iterable;

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Message;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageCache:La0/a0;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10, v4}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_10

    :cond_1d
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->scope:Lbc3/c0;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->dbMutex:Lmc3/a;

    new-instance v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;

    invoke-direct {v7, v6, v9, v0, v8}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$9;-><init>(Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$2:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$4:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->L$5:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$insertMessages$1;->label:I

    invoke-static {v1, v4, v7, v2}, Lio/getstream/chat/android/client/internal/offline/extensions/CoroutineScopeExtensionsKt;->launchWithMutex(Lbc3/c0;Lmc3/a;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_1e

    :goto_11
    return-object v3

    :cond_1e
    :goto_12
    return-object v5
.end method

.method public final selectAllChannelUserMessages(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->I$1:I

    iget p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->I$0:I

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$8:Ljava/lang/Object;

    check-cast v2, Ljava/util/Collection;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$7:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$5:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$4:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$3:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$2:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$0:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->label:I

    invoke-interface {p3, p1, p2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->selectByCidAndUserId(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p3, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 p2, 0xa

    invoke-static {p3, p2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v2, p1

    move-object v4, p2

    move p1, v5

    move p2, p1

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$2:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$3:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$4:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$5:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$6:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$7:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->L$8:Ljava/lang/Object;

    iput p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->I$0:I

    iput p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->I$1:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->I$2:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllChannelUserMessages$1;->label:I

    invoke-direct {p0, p3, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->toMessage(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    move-object v7, v2

    :goto_4
    check-cast p3, Lio/getstream/chat/android/models/Message;

    invoke-interface {v2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v2, v7

    goto :goto_2

    :cond_6
    check-cast v2, Ljava/util/List;

    return-object v2
.end method

.method public final selectAllUserMessages(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->I$1:I

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->I$0:I

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->L$7:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->L$6:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->L$4:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->L$3:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->L$2:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->selectByUserId(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p2, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v4, p1

    move-object v7, p2

    move p1, v5

    move v2, p1

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->L$3:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->L$4:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->L$5:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->L$6:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->L$7:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->I$0:I

    iput p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->I$1:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->I$2:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectAllUserMessages$1;->label:I

    invoke-direct {p0, p2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->toMessage(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    move-object v8, v4

    :goto_4
    check-cast p2, Lio/getstream/chat/android/models/Message;

    invoke-interface {v4, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v4, v8

    goto :goto_2

    :cond_6
    check-cast v4, Ljava/util/List;

    return-object v4
.end method

.method public final selectDraftMessageByParentId(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/DraftMessage;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessageByParentId$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessageByParentId$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessageByParentId$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessageByParentId$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessageByParentId$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessageByParentId$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessageByParentId$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessageByParentId$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessageByParentId$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessageByParentId$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessageByParentId$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessageByParentId$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->selectDraftMessageByParentId(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;

    if-eqz p2, :cond_6

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessageByParentId$2;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessageByParentId$2;-><init>(Ljava/lang/Object;)V

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessageByParentId$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessageByParentId$1;->label:I

    invoke-static {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p2, Lio/getstream/chat/android/models/DraftMessage;

    return-object p2

    :cond_6
    return-object v5
.end method

.method public final selectDraftMessages(Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/DraftMessage;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->I$1:I

    iget v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->I$0:I

    iget-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->L$6:Ljava/lang/Object;

    check-cast v6, Ljava/util/Collection;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->L$5:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->L$3:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->L$2:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->label:I

    invoke-interface {p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->selectDraftMessages(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {p1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v7, p1

    move-object v6, v2

    move v2, v5

    move v4, v2

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;

    new-instance v8, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$2$1;

    invoke-direct {v8, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$2$1;-><init>(Ljava/lang/Object;)V

    const/4 v9, 0x0

    iput-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->L$0:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->L$3:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->L$4:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->L$5:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->L$6:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->I$0:I

    iput v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->I$1:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->I$2:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessages$1;->label:I

    invoke-static {p1, v8, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    move-object v8, v6

    :goto_4
    check-cast p1, Lio/getstream/chat/android/models/DraftMessage;

    invoke-interface {v6, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v6, v8

    goto :goto_2

    :cond_6
    check-cast v6, Ljava/util/List;

    return-object v6
.end method

.method public final selectDraftMessagesByCid(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/DraftMessage;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessagesByCid$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessagesByCid$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessagesByCid$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessagesByCid$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessagesByCid$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessagesByCid$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessagesByCid$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessagesByCid$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessagesByCid$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessagesByCid$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessagesByCid$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessagesByCid$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->selectDraftMessageByCid(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;

    if-eqz p2, :cond_6

    new-instance p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessagesByCid$2;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessagesByCid$2;-><init>(Ljava/lang/Object;)V

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessagesByCid$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectDraftMessagesByCid$1;->label:I

    invoke-static {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p2, Lio/getstream/chat/android/models/DraftMessage;

    return-object p2

    :cond_6
    return-object v5
.end method

.method public final selectLocalOnlyMessagesForChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->label:I

    const/16 v3, 0xa

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->I$1:I

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->I$0:I

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->L$7:Ljava/lang/Object;

    check-cast v3, Ljava/util/Collection;

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->L$6:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->L$4:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->L$3:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->L$2:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    invoke-static {}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->getLocalOnlySyncStatuses()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/getstream/chat/android/models/SyncStatus;

    invoke-virtual {v9}, Lio/getstream/chat/android/models/SyncStatus;->getStatus()I

    move-result v9

    new-instance v10, Ljava/lang/Integer;

    invoke-direct {v10, v9}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-static {}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->getLocalOnlyMessageTypes()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->label:I

    invoke-interface {p2, p1, v8, v2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->selectBySyncStatusOrTypeForChannel(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_4

    :cond_5
    :goto_2
    check-cast p2, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    invoke-static {p2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v3, p1

    move-object v5, p2

    move p1, v6

    move v2, p1

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->L$2:Ljava/lang/Object;

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->L$3:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->L$4:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->L$5:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->L$6:Ljava/lang/Object;

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->L$7:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->I$0:I

    iput p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->I$1:I

    iput v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->I$2:I

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectLocalOnlyMessagesForChannel$1;->label:I

    invoke-direct {p0, p2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->toMessage(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    :goto_4
    return-object v1

    :cond_6
    move-object v8, v3

    :goto_5
    check-cast p2, Lio/getstream/chat/android/models/Message;

    invoke-interface {v3, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v3, v8

    goto :goto_3

    :cond_7
    check-cast v3, Ljava/util/List;

    return-object v3
.end method

.method public final selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageCache:La0/a0;

    invoke-virtual {v0, p1}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    if-nez v0, :cond_0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->fetchMessageFromDB(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final selectMessageBySyncState(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->label:I

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->label:I

    const/4 v7, 0x2

    const/4 v2, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v7, :cond_1

    iget p1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->I$1:I

    iget v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->I$0:I

    iget-object v2, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->L$7:Ljava/lang/Object;

    check-cast v2, Ljava/util/Collection;

    iget-object v3, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->L$6:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    iget-object v3, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->L$4:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v5, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/util/Collection;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/SyncStatus;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/SyncStatus;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    iput-object v9, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->L$0:Ljava/lang/Object;

    iput v2, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->label:I

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->selectBySyncStatus$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lio/getstream/chat/android/models/SyncStatus;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_4

    goto :goto_4

    :cond_4
    :goto_2
    check-cast p2, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v2, p1

    move-object v3, p2

    move p1, v8

    move v1, p1

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    iput-object v9, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->L$0:Ljava/lang/Object;

    iput-object v9, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->L$1:Ljava/lang/Object;

    iput-object v9, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->L$2:Ljava/lang/Object;

    iput-object v2, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->L$3:Ljava/lang/Object;

    iput-object v3, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->L$4:Ljava/lang/Object;

    iput-object v9, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->L$5:Ljava/lang/Object;

    iput-object v9, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->L$6:Ljava/lang/Object;

    iput-object v2, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->L$7:Ljava/lang/Object;

    iput v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->I$0:I

    iput p1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->I$1:I

    iput v8, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->I$2:I

    iput v7, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessageBySyncState$1;->label:I

    invoke-direct {p0, p2, v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->toMessage(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_5

    :goto_4
    return-object v0

    :cond_5
    move-object v5, v2

    :goto_5
    check-cast p2, Lio/getstream/chat/android/models/Message;

    invoke-interface {v2, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v2, v5

    goto :goto_3

    :cond_6
    check-cast v2, Ljava/util/List;

    return-object v2
.end method

.method public final selectMessageIdsBySyncState(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v1, p1

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->selectIdsBySyncStatus$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;Lio/getstream/chat/android/models/SyncStatus;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;->L$4:Ljava/lang/Object;

    check-cast p1, Ljava/util/Collection;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;->L$3:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {p2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageCache:La0/a0;

    invoke-virtual {v5, v4}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    new-instance v6, Ll83/k;

    invoke-direct {v6, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ll83/k;

    iget-object v6, v6, Ll83/k;->x:Ljava/lang/Object;

    if-eqz v6, :cond_4

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll83/k;

    iget-object v5, v5, Ll83/k;->x:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/models/Message;

    if-eqz v5, :cond_6

    invoke-virtual {p2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    new-instance p1, Ljava/util/ArrayList;

    invoke-static {v4, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll83/k;

    iget-object v4, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_9

    goto :goto_5

    :cond_9
    move-object p1, v4

    :goto_5
    if-eqz p1, :cond_c

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;->L$0:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;->L$1:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;->L$3:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;->L$4:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;->I$0:I

    iput v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;->I$1:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessages$1;->label:I

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->fetchMessagesFromDB(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    return-object v1

    :cond_a
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_6
    check-cast p2, Ljava/util/List;

    if-eqz p2, :cond_b

    check-cast p2, Ljava/lang/Iterable;

    goto :goto_7

    :cond_b
    move-object p2, p1

    :cond_c
    sget-object p1, Lm83/y;->w:Lm83/y;

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    :goto_7
    invoke-static {p1, p2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final selectMessagesForChannel(Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->I$1:I

    iget p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->I$0:I

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$8:Ljava/lang/Object;

    check-cast v2, Ljava/util/Collection;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$7:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$5:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$4:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$3:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$2:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$1:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$0:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->label:I

    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->selectMessagesEntitiesForChannel(Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p3, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 p2, 0xa

    invoke-static {p3, p2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v2, p1

    move-object v4, p2

    move p1, v5

    move p2, p1

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$2:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$3:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$4:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$5:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$6:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$7:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->L$8:Ljava/lang/Object;

    iput p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->I$0:I

    iput p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->I$1:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->I$2:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForChannel$1;->label:I

    invoke-direct {p0, p3, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->toMessage(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    move-object v7, v2

    :goto_4
    check-cast p3, Lio/getstream/chat/android/models/Message;

    invoke-interface {v2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v2, v7

    goto :goto_2

    :cond_6
    check-cast v2, Ljava/util/List;

    return-object v2
.end method

.method public final selectMessagesForThread(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->I$2:I

    iget p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->I$1:I

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->I$0:I

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->L$7:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->L$6:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->L$4:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->L$3:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->L$2:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->I$0:I

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->L$0:Ljava/lang/Object;

    iput p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->I$0:I

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->label:I

    invoke-interface {p3, p1, p2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->messagesForThread(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p3, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p3, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    move-object v4, p1

    move v2, p2

    move-object v7, p3

    move p1, v5

    move p2, p1

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->L$3:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->L$4:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->L$5:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->L$6:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->L$7:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->I$0:I

    iput p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->I$1:I

    iput p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->I$2:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->I$3:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesForThread$1;->label:I

    invoke-direct {p0, p3, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->toMessage(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    move-object v8, v4

    :goto_4
    check-cast p3, Lio/getstream/chat/android/models/Message;

    invoke-interface {v4, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v4, v8

    goto :goto_2

    :cond_6
    check-cast v4, Ljava/util/List;

    return-object v4
.end method

.method public final selectMessagesWithPoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->I$1:I

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->I$0:I

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->L$7:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->L$6:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->L$4:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->L$3:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->L$2:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->messageDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageDao;->selectMessagesWithPoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p2, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v4, p1

    move-object v7, p2

    move p1, v5

    move v2, p1

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->L$3:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->L$4:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->L$5:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->L$6:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->L$7:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->I$0:I

    iput p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->I$1:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->I$2:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository$selectMessagesWithPoll$1;->label:I

    invoke-direct {p0, p2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DatabaseMessageRepository;->toMessage(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    move-object v8, v4

    :goto_4
    check-cast p2, Lio/getstream/chat/android/models/Message;

    invoke-interface {v4, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v4, v8

    goto :goto_2

    :cond_6
    check-cast v4, Ljava/util/List;

    return-object v4
.end method
