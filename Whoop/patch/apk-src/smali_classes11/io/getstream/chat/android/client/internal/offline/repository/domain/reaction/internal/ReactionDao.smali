.class public interface abstract Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008a\u0018\u0000 $2\u00020\u0001:\u0001$J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0008\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ$\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000bH\u00a7@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ(\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J(\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J*\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u00a7@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ&\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u00a7@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ(\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001dH\u00a7@\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008!\u0010\u0006J\u0010\u0010\"\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\"\u0010#\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006%\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;",
        "",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
        "reactionEntity",
        "Ll83/a0;",
        "insert",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lq83/d;)Ljava/lang/Object;",
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
        "limit",
        "selectIdsSyncStatus",
        "(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;",
        "selectSyncStatus",
        "",
        "reactionType",
        "messageId",
        "userId",
        "selectUserReactionToMessage",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "selectUserReactionsToMessage",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Ljava/util/Date;",
        "deletedAt",
        "setDeleteAt",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;",
        "delete",
        "deleteAll",
        "(Lq83/d;)Ljava/lang/Object;",
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
.field public static final synthetic Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao$Companion;->$$INSTANCE:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao$Companion;

    sput-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;->Companion:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao$Companion;

    return-void
.end method

.method public static synthetic selectIdsSyncStatus$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;Lio/getstream/chat/android/models/SyncStatus;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, -0x1

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;->selectIdsSyncStatus(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: selectIdsSyncStatus"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic selectSyncStatus$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;Lio/getstream/chat/android/models/SyncStatus;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, -0x1

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;->selectSyncStatus(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: selectSyncStatus"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract delete(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract deleteAll(Lq83/d;)Ljava/lang/Object;
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

.method public abstract insert(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectIdsSyncStatus(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;)",
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
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
            ">;)",
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
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectSyncStatus(Lio/getstream/chat/android/models/SyncStatus;ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/SyncStatus;",
            "I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
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
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
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
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract setDeleteAt(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
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
