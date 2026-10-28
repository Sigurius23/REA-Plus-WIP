.class public interface abstract Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008g\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J(\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u00a6@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u00a6@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J$\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00122\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0012H\u00a6@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001e\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u00a6@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u00a6@\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J*\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ&\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u00a6@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008 \u0010\u0006J\u0010\u0010!\u001a\u00020\u0004H\u00a6@\u00a2\u0006\u0004\u0008!\u0010\"\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006#\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;",
        "",
        "Lio/getstream/chat/android/models/Reaction;",
        "reaction",
        "Ll83/a0;",
        "insertReaction",
        "(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;",
        "",
        "userId",
        "messageId",
        "Ljava/util/Date;",
        "deletedAt",
        "updateReactionsForMessageByDeletedDate",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;",
        "",
        "id",
        "selectReactionById",
        "(ILq83/d;)Ljava/lang/Object;",
        "",
        "ids",
        "selectReactionsByIds",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/SyncStatus;",
        "syncStatus",
        "selectReactionIdsBySyncStatus",
        "(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;",
        "selectReactionsBySyncStatus",
        "reactionType",
        "selectUserReactionToMessage",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "selectUserReactionsToMessage",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "deleteReaction",
        "clear",
        "(Lq83/d;)Ljava/lang/Object;",
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

.method public abstract deleteReaction(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Reaction;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insertReaction(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Reaction;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectReactionById(ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectReactionIdsBySyncStatus(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectReactionsByIds(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectReactionsBySyncStatus(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectUserReactionToMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectUserReactionsToMessage(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract updateReactionsForMessageByDeletedDate(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
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
