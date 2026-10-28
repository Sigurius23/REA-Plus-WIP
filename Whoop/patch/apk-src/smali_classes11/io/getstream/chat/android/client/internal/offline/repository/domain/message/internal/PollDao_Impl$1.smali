.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$1;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/k;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\u00020\u0003H\u0014\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "io/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$1",
        "Landroidx/room/k;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;",
        "",
        "createQuery",
        "()Ljava/lang/String;",
        "Ltb/c;",
        "statement",
        "entity",
        "Ll83/a0;",
        "bind",
        "(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;)V",
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
.field final synthetic this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bind(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;)V
    .locals 4

    const-string v0, "statement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x2

    .line 3
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    const/4 v0, 0x3

    .line 4
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    .line 5
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->access$get__optionConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/OptionConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getOptions()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/OptionConverter;->optionListToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_0

    .line 6
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    const/4 v0, 0x5

    .line 8
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getVotingVisibility()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ltb/c;->L(ILjava/lang/String;)V

    .line 9
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getEnforceUniqueVote()Z

    move-result v0

    const/4 v1, 0x6

    int-to-long v2, v0

    .line 10
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 11
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getMaxVotesAllowed()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_1

    .line 12
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    .line 13
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 14
    :goto_1
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getAllowUserSuggestedOptions()Z

    move-result v0

    const/16 v1, 0x8

    int-to-long v2, v0

    .line 15
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 16
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getAllowAnswers()Z

    move-result v0

    const/16 v1, 0x9

    int-to-long v2, v0

    .line 17
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 18
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getVoteCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0xa

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 19
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->access$get__mapConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getVoteCountsByOption()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;->mapToString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xb

    if-nez v0, :cond_2

    .line 20
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    .line 21
    :cond_2
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 22
    :goto_2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->access$get__voteConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getVotes()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;->voteListToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xc

    if-nez v0, :cond_3

    .line 23
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    .line 24
    :cond_3
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 25
    :goto_3
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->access$get__voteConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getOwnVotes()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;->voteListToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xd

    if-nez v0, :cond_4

    .line 26
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_4

    .line 27
    :cond_4
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 28
    :goto_4
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0xe

    if-nez v0, :cond_5

    .line 29
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_5

    .line 30
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 31
    :goto_5
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->access$get__dateConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getUpdatedAt()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;->dateToTimestamp(Ljava/util/Date;)Ljava/lang/Long;

    move-result-object v0

    const/16 v1, 0xf

    if-nez v0, :cond_6

    .line 32
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_6

    .line 33
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 34
    :goto_6
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getClosed()Z

    move-result v0

    const/16 v1, 0x10

    int-to-long v2, v0

    .line 35
    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    .line 36
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getAnswersCount()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x11

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    .line 37
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->access$get__answerConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getAnswers()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;->answerListToString(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x12

    if-nez v0, :cond_7

    .line 38
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_7

    .line 39
    :cond_7
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 40
    :goto_7
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getCreatedById()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x13

    if-nez v0, :cond_8

    .line 41
    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_8

    .line 42
    :cond_8
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    .line 43
    :goto_8
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$1;->this$0:Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;->access$get__extraDataConverter$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;)Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getExtraData()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {v0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;->mapToString(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p2

    const/16 v0, 0x14

    if-nez p2, :cond_9

    .line 44
    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    return-void

    .line 45
    :cond_9
    invoke-interface {p1, v0, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public final bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$1;->bind(Ltb/c;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;)V

    return-void
.end method

.method public final createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `stream_chat_poll` (`id`,`name`,`description`,`options`,`votingVisibility`,`enforceUniqueVote`,`maxVotesAllowed`,`allowUserSuggestedOptions`,`allowAnswers`,`voteCount`,`voteCountsByOption`,`votes`,`ownVotes`,`createdAt`,`updatedAt`,`closed`,`answersCount`,`answers`,`createdById`,`extraData`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
