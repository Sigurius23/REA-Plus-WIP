.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0008\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J(\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ$\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001b2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u001bH\u0096@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001e\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0096@\u00a2\u0006\u0004\u0008!\u0010\"J\u001e\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0096@\u00a2\u0006\u0004\u0008#\u0010\"J*\u0010%\u001a\u0004\u0018\u00010\u000c2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0004\u0008%\u0010&J&\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001b2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0096@\u00a2\u0006\u0004\u0008\'\u0010(J\u0018\u0010)\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008)\u0010\u0010J\u0010\u0010*\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010,R0\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010-\u00a8\u0006."
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ReactionRepository;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;",
        "reactionDao",
        "Lkotlin/Function2;",
        "",
        "Lq83/d;",
        "Lio/getstream/chat/android/models/User;",
        "",
        "getUser",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;Lc93/m;)V",
        "Lio/getstream/chat/android/models/Reaction;",
        "reaction",
        "Ll83/a0;",
        "insertReaction",
        "(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;",
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
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;",
        "Lc93/m;",
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


# instance fields
.field private final getUser:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final reactionDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;Lc93/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    const-string v0, "reactionDao"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getUser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;->reactionDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;->getUser:Lc93/m;

    return-void
.end method


# virtual methods
.method public final clear(Lq83/d;)Ljava/lang/Object;
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;->reactionDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteReaction(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;->reactionDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt;->toEntity(Lio/getstream/chat/android/models/Reaction;)Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;->delete(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertReaction(Lio/getstream/chat/android/models/Reaction;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;->reactionDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt;->toEntity(Lio/getstream/chat/android/models/Reaction;)Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;->insert(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "user id can\'t be empty when creating a reaction"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "type can\'t be empty when creating a reaction"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "message id can\'t be empty when creating a reaction"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final selectReactionById(ILq83/d;)Ljava/lang/Object;
    .locals 5
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

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionById$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionById$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionById$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionById$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionById$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionById$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionById$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionById$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionById$1;->I$0:I

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;->reactionDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;

    iput p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionById$1;->I$0:I

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionById$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;->selectReactionById(ILq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    if-eqz p2, :cond_6

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;->getUser:Lc93/m;

    iput p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionById$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionById$1;->label:I

    invoke-static {p2, v2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p2, Lio/getstream/chat/android/models/Reaction;

    return-object p2

    :cond_6
    const/4 p1, 0x0

    return-object p1
.end method

.method public final selectReactionIdsBySyncStatus(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;->reactionDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v1, p1

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;->selectIdsSyncStatus$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;Lio/getstream/chat/android/models/SyncStatus;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectReactionsByIds(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 10
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

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->I$1:I

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->I$0:I

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->L$7:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->L$6:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->L$4:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->L$3:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->L$2:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;->reactionDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;->selectReactionsByIds(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

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

    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    iget-object v8, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;->getUser:Lc93/m;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->L$2:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->L$3:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->L$4:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->L$5:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->L$6:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->L$7:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->I$0:I

    iput p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->I$1:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->I$2:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsByIds$1;->label:I

    invoke-static {p2, v8, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    move-object v8, v4

    :goto_4
    check-cast p2, Lio/getstream/chat/android/models/Reaction;

    invoke-interface {v4, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v4, v8

    goto :goto_2

    :cond_6
    check-cast v4, Ljava/util/List;

    return-object v4
.end method

.method public final selectReactionsBySyncStatus(Lio/getstream/chat/android/models/SyncStatus;Lq83/d;)Ljava/lang/Object;
    .locals 10
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

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->label:I

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->label:I

    const/4 v7, 0x2

    const/4 v2, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v7, :cond_1

    iget p1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->I$1:I

    iget v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->I$0:I

    iget-object v2, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->L$7:Ljava/lang/Object;

    check-cast v2, Ljava/util/Collection;

    iget-object v3, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->L$6:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    iget-object v3, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->L$4:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v5, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/util/Collection;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Iterable;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/SyncStatus;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/SyncStatus;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;->reactionDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;

    iput-object v9, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->L$0:Ljava/lang/Object;

    iput v2, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->label:I

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;->selectSyncStatus$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;Lio/getstream/chat/android/models/SyncStatus;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

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

    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;->getUser:Lc93/m;

    iput-object v9, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->L$0:Ljava/lang/Object;

    iput-object v9, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->L$1:Ljava/lang/Object;

    iput-object v9, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->L$2:Ljava/lang/Object;

    iput-object v2, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->L$3:Ljava/lang/Object;

    iput-object v3, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->L$4:Ljava/lang/Object;

    iput-object v9, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->L$5:Ljava/lang/Object;

    iput-object v9, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->L$6:Ljava/lang/Object;

    iput-object v2, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->L$7:Ljava/lang/Object;

    iput v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->I$0:I

    iput p1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->I$1:I

    iput v8, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->I$2:I

    iput v7, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectReactionsBySyncStatus$1;->label:I

    invoke-static {p2, v5, v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_5

    :goto_4
    return-object v0

    :cond_5
    move-object v5, v2

    :goto_5
    check-cast p2, Lio/getstream/chat/android/models/Reaction;

    invoke-interface {v2, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v2, v5

    goto :goto_3

    :cond_6
    check-cast v2, Ljava/util/List;

    return-object v2
.end method

.method public final selectUserReactionToMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    instance-of v0, p4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;

    invoke-direct {v0, p0, p4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;->reactionDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;->L$2:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;->label:I

    invoke-interface {p4, p1, p2, p3, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;->selectUserReactionToMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    if-eqz p4, :cond_6

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;->getUser:Lc93/m;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;->L$1:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionToMessage$1;->label:I

    invoke-static {p4, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p4, Lio/getstream/chat/android/models/Reaction;

    return-object p4

    :cond_6
    return-object v5
.end method

.method public final selectUserReactionsToMessage(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
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

    instance-of v0, p3, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->I$1:I

    iget p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->I$0:I

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$8:Ljava/lang/Object;

    check-cast v2, Ljava/util/Collection;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$7:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$5:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$4:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$3:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$2:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$0:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;->reactionDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->label:I

    invoke-interface {p3, p1, p2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;->selectUserReactionsToMessage(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

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

    check-cast p3, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    iget-object v7, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;->getUser:Lc93/m;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$2:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$3:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$4:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$5:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$6:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$7:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->L$8:Ljava/lang/Object;

    iput p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->I$0:I

    iput p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->I$1:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->I$2:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository$selectUserReactionsToMessage$1;->label:I

    invoke-static {p3, v7, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    :goto_3
    return-object v1

    :cond_5
    move-object v7, v2

    :goto_4
    check-cast p3, Lio/getstream/chat/android/models/Reaction;

    invoke-interface {v2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v2, v7

    goto :goto_2

    :cond_6
    check-cast v2, Ljava/util/List;

    return-object v2
.end method

.method public final updateReactionsForMessageByDeletedDate(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/DatabaseReactionRepository;->reactionDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionDao;->setDeleteAt(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
