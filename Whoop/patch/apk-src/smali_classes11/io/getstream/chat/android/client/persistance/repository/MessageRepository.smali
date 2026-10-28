.class public interface abstract Lio/getstream/chat/android/client/persistance/repository/MessageRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008g\u0018\u00002\u00020\u0001J(\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00a6@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ&\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001e\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J&\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J$\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0006H\u00a6@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0017\u0010\u0011J\u001e\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0018\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0019\u0010\u0011J\u001e\u0010\u001c\u001a\u00020\u001b2\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00a6@\u00a2\u0006\u0004\u0008\u001c\u0010\u0016J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ \u0010\"\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u00a6@\u00a2\u0006\u0004\u0008\"\u0010#J\u0018\u0010$\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008$\u0010\u0011J\u0018\u0010%\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0004\u0008%\u0010\u001fJ\u001e\u0010&\u001a\u00020\u001b2\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00a6@\u00a2\u0006\u0004\u0008&\u0010\u0016J\u001e\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010(\u001a\u00020\'H\u00a6@\u00a2\u0006\u0004\u0008)\u0010*J\u001e\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010(\u001a\u00020\'H\u00a6@\u00a2\u0006\u0004\u0008+\u0010*J\u0018\u0010-\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020,H\u00a6@\u00a2\u0006\u0004\u0008-\u0010.J\u0016\u0010/\u001a\u0008\u0012\u0004\u0012\u00020,0\u0006H\u00a6@\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00101\u001a\u0004\u0018\u00010,2\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u00081\u0010\u0011J\u001a\u00103\u001a\u0004\u0018\u00010,2\u0006\u00102\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u00083\u0010\u0011J\u0018\u00104\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020,H\u00a6@\u00a2\u0006\u0004\u00084\u0010.J\u0010\u00105\u001a\u00020\u001bH\u00a6@\u00a2\u0006\u0004\u00085\u00100J\u0018\u00106\u001a\u00020\u001b2\u0006\u0010\n\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u00086\u0010\u0011J\u0018\u00107\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u00087\u0010\u0011J\u0010\u00108\u001a\u00020\u001bH\u00a6@\u00a2\u0006\u0004\u00088\u00100J\u001e\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u00089\u0010\u0011\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006:\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistance/repository/MessageRepository;",
        "",
        "",
        "cid",
        "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
        "pagination",
        "",
        "Lio/getstream/chat/android/models/Message;",
        "selectMessagesForChannel",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;",
        "messageId",
        "",
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
        "pollId",
        "selectMessagesWithPoll",
        "messages",
        "Ll83/a0;",
        "insertMessages",
        "message",
        "insertMessage",
        "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
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
        "Lio/getstream/chat/android/models/DraftMessage;",
        "insertDraftMessage",
        "(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;",
        "selectDraftMessages",
        "(Lq83/d;)Ljava/lang/Object;",
        "selectDraftMessagesByCid",
        "parentId",
        "selectDraftMessageByParentId",
        "deleteDraftMessage",
        "evictMessages",
        "evictMessage",
        "deletePoll",
        "clear",
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


# virtual methods
.method public abstract clear(Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract deleteChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract deleteChannelMessages(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract deleteChannelMessagesBefore(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract deleteDraftMessage(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract deleteMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract deletePoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract evictMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract evictMessages(Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract insertDraftMessage(Lio/getstream/chat/android/models/DraftMessage;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract insertMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract insertMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectAllChannelUserMessages(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectAllUserMessages(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectDraftMessageByParentId(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectDraftMessages(Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectDraftMessagesByCid(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectLocalOnlyMessagesForChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectMessage(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectMessageBySyncState(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectMessageIdsBySyncState(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectMessages(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectMessagesForChannel(Ljava/lang/String;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectMessagesForThread(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectMessagesWithPoll(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method
