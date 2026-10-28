.class public final Lio/getstream/chat/android/client/persistance/repository/noop/NoOpMessageRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/persistance/repository/MessageRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\t\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J$\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0096@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001e\u0010\u000f\u001a\u00020\u000e2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0004H\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\tJ\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J \u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u000cJ\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\u0019\u0010\u0012J\u001e\u0010\u001a\u001a\u00020\u000e2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0004H\u0096@\u00a2\u0006\u0004\u0008\u001a\u0010\tJ\u001e\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ\u001e\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010 \u001a\u00020\u0005H\u0096@\u00a2\u0006\u0004\u0008!\u0010\u000cJ\u0018\u0010#\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\"H\u0096@\u00a2\u0006\u0004\u0008#\u0010$J\u0016\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\"0\u0004H\u0096@\u00a2\u0006\u0004\u0008%\u0010&J\u001a\u0010\'\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0013\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0004\u0008\'\u0010\u000cJ\u001a\u0010)\u001a\u0004\u0018\u00010\"2\u0006\u0010(\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0004\u0008)\u0010\u000cJ\u0018\u0010*\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\"H\u0096@\u00a2\u0006\u0004\u0008*\u0010$J\u0010\u0010+\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008+\u0010&J\u0018\u0010,\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0004\u0008,\u0010\u000cJ\u0018\u0010-\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0005H\u0096@\u00a2\u0006\u0004\u0008-\u0010\u000cJ\u0010\u0010.\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008.\u0010&J(\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0013\u001a\u00020\u00052\u0008\u00100\u001a\u0004\u0018\u00010/H\u0096@\u00a2\u0006\u0004\u00081\u00102J&\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\n\u001a\u00020\u00052\u0006\u00104\u001a\u000203H\u0096@\u00a2\u0006\u0004\u00085\u00106J\u001e\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u00107\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0004\u00088\u0010\u000cJ&\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u00107\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0004\u00089\u0010:J\u001e\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0013\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0004\u0008;\u0010\u000c\u00a8\u0006<"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistance/repository/noop/NoOpMessageRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "<init>",
        "()V",
        "",
        "",
        "messageIds",
        "Lio/getstream/chat/android/models/Message;",
        "selectMessages",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "messageId",
        "selectMessage",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "messages",
        "Ll83/a0;",
        "insertMessages",
        "message",
        "insertMessage",
        "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "cid",
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
        "Lio/getstream/chat/android/models/DraftMessage;",
        "deleteDraftMessage",
        "(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;",
        "selectDraftMessages",
        "(Lq83/d;)Ljava/lang/Object;",
        "selectDraftMessagesByCid",
        "parentId",
        "selectDraftMessageByParentId",
        "insertDraftMessage",
        "evictMessages",
        "evictMessage",
        "deletePoll",
        "clear",
        "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
        "pagination",
        "selectMessagesForChannel",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;",
        "",
        "limit",
        "selectMessagesForThread",
        "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "userId",
        "selectAllUserMessages",
        "selectAllChannelUserMessages",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "selectLocalOnlyMessagesForChannel",
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
.field public static final INSTANCE:Lio/getstream/chat/android/client/persistance/repository/noop/NoOpMessageRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/noop/NoOpMessageRepository;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/persistance/repository/noop/NoOpMessageRepository;->INSTANCE:Lio/getstream/chat/android/client/persistance/repository/noop/NoOpMessageRepository;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear(Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteChannelMessages(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteChannelMessagesBefore(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteDraftMessage(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deletePoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final evictMessages(Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertDraftMessage(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final selectAllChannelUserMessages(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final selectAllUserMessages(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final selectDraftMessageByParentId(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    const/4 p1, 0x0

    return-object p1
.end method

.method public final selectDraftMessages(Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final selectDraftMessagesByCid(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    const/4 p1, 0x0

    return-object p1
.end method

.method public final selectLocalOnlyMessagesForChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    const/4 p1, 0x0

    return-object p1
.end method

.method public final selectMessageBySyncState(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final selectMessageIdsBySyncState(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final selectMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final selectMessagesForChannel(Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final selectMessagesForThread(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final selectMessagesWithPoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method
