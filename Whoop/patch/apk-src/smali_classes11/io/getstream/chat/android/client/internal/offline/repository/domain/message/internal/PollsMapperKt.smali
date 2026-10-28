.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a8\u0010\n\u001a\u00020\u0000*\u00020\u00012\"\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0004H\u0080@\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0013\u0010\u0002\u001a\u00020\r*\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u000e\u001a\u0013\u0010\n\u001a\u00020\u000c*\u00020\rH\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000f\u001a\u0013\u0010\u0002\u001a\u00020\u0011*\u00020\u0010H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0012\u001a8\u0010\n\u001a\u00020\u0010*\u00020\u00112\"\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0004H\u0080@\u00a2\u0006\u0004\u0008\n\u0010\u0013\u001a\u0013\u0010\u0002\u001a\u00020\u0015*\u00020\u0014H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0016\u001a8\u0010\n\u001a\u00020\u0014*\u00020\u00152\"\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0004H\u0080@\u00a2\u0006\u0004\u0008\n\u0010\u0017\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0018H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0018*\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/getstream/chat/android/models/Poll;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;",
        "toEntity",
        "(Lio/getstream/chat/android/models/Poll;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;",
        "Lkotlin/Function2;",
        "",
        "Lq83/d;",
        "Lio/getstream/chat/android/models/User;",
        "",
        "getUser",
        "toModel",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/Option;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;",
        "(Lio/getstream/chat/android/models/Option;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;)Lio/getstream/chat/android/models/Option;",
        "Lio/getstream/chat/android/models/Vote;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;",
        "(Lio/getstream/chat/android/models/Vote;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/Answer;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;",
        "(Lio/getstream/chat/android/models/Answer;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/VotingVisibility;",
        "(Lio/getstream/chat/android/models/VotingVisibility;)Ljava/lang/String;",
        "toVotingVisibility",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/VotingVisibility;",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toEntity(Lio/getstream/chat/android/models/Answer;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;

    .line 55
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Answer;->getId()Ljava/lang/String;

    move-result-object v2

    .line 56
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Answer;->getPollId()Ljava/lang/String;

    move-result-object v3

    .line 57
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Answer;->getText()Ljava/lang/String;

    move-result-object v4

    .line 58
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Answer;->getCreatedAt()Ljava/util/Date;

    move-result-object v5

    .line 59
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Answer;->getUpdatedAt()Ljava/util/Date;

    move-result-object v6

    .line 60
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Answer;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p0

    :goto_0
    move-object v7, p0

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    goto :goto_0

    .line 61
    :goto_1
    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V

    return-object v1
.end method

.method public static final toEntity(Lio/getstream/chat/android/models/Option;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;

    .line 43
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Option;->getId()Ljava/lang/String;

    move-result-object v1

    .line 44
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Option;->getText()Ljava/lang/String;

    move-result-object v2

    .line 45
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Option;->getExtraData()Ljava/util/Map;

    move-result-object p0

    .line 46
    invoke-direct {v0, v1, v2, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method

.method public static final toEntity(Lio/getstream/chat/android/models/Poll;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;
    .locals 22

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getName()Ljava/lang/String;

    move-result-object v3

    .line 3
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getDescription()Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getOptions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 5
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 7
    check-cast v7, Lio/getstream/chat/android/models/Option;

    .line 8
    invoke-static {v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt;->toEntity(Lio/getstream/chat/android/models/Option;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;

    move-result-object v7

    .line 9
    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getVotes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 11
    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v0, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v13, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 13
    check-cast v7, Lio/getstream/chat/android/models/Vote;

    .line 14
    invoke-static {v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt;->toEntity(Lio/getstream/chat/android/models/Vote;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;

    move-result-object v7

    .line 15
    invoke-interface {v13, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 16
    :cond_1
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getCreatedAt()Ljava/util/Date;

    move-result-object v15

    .line 17
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getUpdatedAt()Ljava/util/Date;

    move-result-object v16

    .line 18
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getVotingVisibility()Lio/getstream/chat/android/models/VotingVisibility;

    move-result-object v0

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt;->toEntity(Lio/getstream/chat/android/models/VotingVisibility;)Ljava/lang/String;

    move-result-object v0

    .line 19
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getEnforceUniqueVote()Z

    move-result v7

    .line 20
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getMaxVotesAllowed()Ljava/lang/Integer;

    move-result-object v8

    .line 21
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getAllowUserSuggestedOptions()Z

    move-result v9

    .line 22
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getAllowAnswers()Z

    move-result v10

    .line 23
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getVoteCount()I

    move-result v11

    .line 24
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getVoteCountsByOption()Ljava/util/Map;

    move-result-object v12

    .line 25
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getOwnVotes()Ljava/util/List;

    move-result-object v14

    check-cast v14, Ljava/lang/Iterable;

    move-object/from16 v17, v0

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v14, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 28
    check-cast v14, Lio/getstream/chat/android/models/Vote;

    .line 29
    invoke-static {v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt;->toEntity(Lio/getstream/chat/android/models/Vote;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;

    move-result-object v14

    .line 30
    invoke-interface {v0, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 31
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Poll;->getClosed()Z

    move-result v1

    .line 32
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Poll;->getAnswersCount()I

    move-result v18

    .line 33
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Poll;->getAnswers()Ljava/util/List;

    move-result-object v14

    check-cast v14, Ljava/lang/Iterable;

    move-object/from16 v19, v0

    .line 34
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v14, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 36
    check-cast v14, Lio/getstream/chat/android/models/Answer;

    .line 37
    invoke-static {v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt;->toEntity(Lio/getstream/chat/android/models/Answer;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;

    move-result-object v14

    .line 38
    invoke-interface {v0, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 39
    :cond_3
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Poll;->getCreatedBy()Lio/getstream/chat/android/models/User;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v6

    :goto_4
    move-object/from16 v20, v6

    goto :goto_5

    :cond_4
    const/4 v6, 0x0

    goto :goto_4

    .line 40
    :goto_5
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Poll;->getExtraData()Ljava/util/Map;

    move-result-object v21

    move-object/from16 v6, v17

    move/from16 v17, v1

    .line 41
    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;

    move-object/from16 v14, v19

    move-object/from16 v19, v0

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Ljava/lang/String;Ljava/util/Map;)V

    return-object v1
.end method

.method public static final toEntity(Lio/getstream/chat/android/models/Vote;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Vote;->getId()Ljava/lang/String;

    move-result-object v2

    .line 48
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Vote;->getOptionId()Ljava/lang/String;

    move-result-object v4

    .line 49
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Vote;->getPollId()Ljava/lang/String;

    move-result-object v3

    .line 50
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Vote;->getCreatedAt()Ljava/util/Date;

    move-result-object v5

    .line 51
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Vote;->getUpdatedAt()Ljava/util/Date;

    move-result-object v6

    .line 52
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Vote;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p0

    :goto_0
    move-object v7, p0

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    goto :goto_0

    .line 53
    :goto_1
    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;

    invoke-direct/range {v1 .. v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V

    return-object v1
.end method

.method public static final toEntity(Lio/getstream/chat/android/models/VotingVisibility;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    sget-object v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    .line 63
    const-string p0, "public"

    return-object p0

    .line 64
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 65
    :cond_1
    const-string p0, "anonymous"

    return-object p0
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;)Lio/getstream/chat/android/models/Option;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    new-instance v0, Lio/getstream/chat/android/models/Option;

    .line 69
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;->getId()Ljava/lang/String;

    move-result-object v1

    .line 70
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;->getText()Ljava/lang/String;

    move-result-object v2

    .line 71
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;->getExtraData()Ljava/util/Map;

    move-result-object p0

    .line 72
    invoke-direct {v0, v1, v2, p0}, Lio/getstream/chat/android/models/Option;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-object v0
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Answer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p2

    instance-of v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;

    iget v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;

    .line 1
    invoke-direct {v1, v0}, Ls83/c;-><init>(Lq83/d;)V

    .line 2
    :goto_0
    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->result:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    .line 3
    iget v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->L$7:Ljava/lang/Object;

    check-cast v2, Ljava/util/Date;

    iget-object v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->L$6:Ljava/lang/Object;

    check-cast v3, Ljava/util/Date;

    iget-object v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->L$5:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->L$4:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->L$3:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->L$1:Ljava/lang/Object;

    check-cast v7, Lc93/m;

    iget-object v1, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    .line 4
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;->getId()Ljava/lang/String;

    move-result-object v6

    .line 5
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;->getPollId()Ljava/lang/String;

    move-result-object v5

    .line 6
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;->getText()Ljava/lang/String;

    move-result-object v0

    .line 7
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v3

    .line 8
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;->getUpdatedAt()Ljava/util/Date;

    move-result-object v7

    .line 9
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;->getUserId()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    if-eqz v8, :cond_4

    iput-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->L$0:Ljava/lang/Object;

    iput-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->L$1:Ljava/lang/Object;

    iput-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->L$2:Ljava/lang/Object;

    iput-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->L$3:Ljava/lang/Object;

    iput-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->L$4:Ljava/lang/Object;

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->L$5:Ljava/lang/Object;

    iput-object v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->L$6:Ljava/lang/Object;

    iput-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->L$7:Ljava/lang/Object;

    const/4 v9, 0x0

    iput v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->I$0:I

    iput v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$9;->label:I

    move-object/from16 v4, p1

    invoke-interface {v4, v8, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    return-object v2

    :cond_3
    move-object v4, v0

    move-object v0, v1

    move-object v2, v7

    :goto_1
    move-object v9, v0

    check-cast v9, Lio/getstream/chat/android/models/User;

    move-object v15, v2

    move-object v13, v4

    :goto_2
    move-object v14, v3

    move-object v12, v5

    move-object v11, v6

    move-object/from16 v16, v9

    goto :goto_3

    :cond_4
    move-object v13, v0

    move-object v15, v7

    goto :goto_2

    .line 10
    :goto_3
    new-instance v10, Lio/getstream/chat/android/models/Answer;

    invoke-direct/range {v10 .. v16}, Lio/getstream/chat/android/models/Answer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;)V

    return-object v10
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 50
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Poll;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p2

    instance-of v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;

    iget v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;

    .line 11
    invoke-direct {v1, v0}, Ls83/c;-><init>(Lq83/d;)V

    .line 12
    :goto_0
    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->result:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    .line 13
    iget v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->label:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v3, :cond_5

    if-eq v3, v7, :cond_4

    if-eq v3, v6, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    iget v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$1:I

    iget-boolean v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$3:Z

    iget v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$0:I

    iget-boolean v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$2:Z

    iget-boolean v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$1:Z

    iget-boolean v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$0:Z

    iget-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v10, Ljava/util/Map;

    iget-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Integer;

    iget-object v12, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v12, Lio/getstream/chat/android/models/VotingVisibility;

    iget-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v13, Ljava/util/Date;

    iget-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v14, Ljava/util/Date;

    iget-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    move-object/from16 p2, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p0, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p1, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v16, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v17, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;

    invoke-static/range {p2 .. p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v26, v9

    move-object v1, v11

    move-object/from16 v18, v15

    move-object/from16 v11, v17

    move-object/from16 v9, p1

    move-object/from16 v17, v0

    move-object v15, v8

    move-object/from16 v8, p0

    move-object/from16 v0, p2

    goto/16 :goto_9

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move-object/from16 p2, v0

    iget v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$3:I

    iget v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$2:I

    iget v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$1:I

    iget-boolean v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$3:Z

    iget v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$0:I

    iget-boolean v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$2:Z

    iget-boolean v12, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$1:Z

    iget-boolean v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$0:Z

    iget-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    check-cast v14, Ljava/util/Collection;

    iget-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    check-cast v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;

    iget-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v15, Ljava/util/Iterator;

    iget-object v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;

    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Iterable;

    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Iterable;

    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v9, Ljava/util/Map;

    iget-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    move/from16 p0, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/VotingVisibility;

    move-object/from16 p1, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v19, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v20, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v21, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v22, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v23, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v24, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v25, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v26, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;

    invoke-static/range {p2 .. p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v27, v23

    move/from16 v23, v3

    move-object v3, v9

    move-object/from16 v9, v27

    move-object/from16 v27, v24

    move/from16 v24, v6

    move-object v6, v10

    move-object/from16 v10, v27

    move-object/from16 v27, v20

    move/from16 v20, v13

    move-object/from16 v13, v27

    move/from16 v27, v8

    move/from16 v28, v11

    move/from16 v29, v12

    move-object/from16 v8, v22

    move-object/from16 v11, v25

    move/from16 v22, p0

    move-object v12, v2

    move-object/from16 v25, v4

    move-object/from16 v2, v26

    move-object v4, v1

    move/from16 v26, v7

    move-object/from16 v7, p1

    move-object v1, v0

    move-object/from16 v0, p2

    goto/16 :goto_7

    :cond_3
    move-object/from16 p2, v0

    iget v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$2:I

    iget v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$1:I

    iget v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$0:I

    iget-boolean v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$2:Z

    iget-boolean v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$1:Z

    iget-boolean v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$0:Z

    iget-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    check-cast v10, Ljava/util/Collection;

    iget-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;

    iget-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v11, Ljava/util/Iterator;

    iget-object v12, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v12, Ljava/util/Collection;

    iget-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    iget-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    iget-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v13, Ljava/util/Map;

    iget-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Integer;

    iget-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v15, Lio/getstream/chat/android/models/VotingVisibility;

    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v6, Ljava/util/Date;

    iget-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v8, Ljava/util/Date;

    move/from16 v21, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p0, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p1, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v22, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v23, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v24, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v25, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;

    invoke-static/range {p2 .. p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v26, v23

    move-object/from16 v23, v0

    move-object v0, v2

    move-object v2, v11

    move-object/from16 v11, v26

    move/from16 v26, v4

    move-object v4, v1

    move-object/from16 v1, v25

    move/from16 v25, v26

    move-object/from16 v26, v15

    move v15, v9

    move-object/from16 v9, v22

    move-object/from16 v22, v26

    move/from16 v27, v3

    move/from16 v26, v5

    move-object v5, v14

    move/from16 v28, v21

    move-object/from16 v3, p0

    move-object v14, v8

    move-object/from16 v21, v12

    move-object/from16 v12, v24

    move-object/from16 v8, p1

    move/from16 v24, v7

    move-object/from16 v7, p2

    goto/16 :goto_5

    :cond_4
    move-object/from16 p2, v0

    iget v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$1:I

    iget v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$0:I

    iget-object v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;

    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;

    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v6, Ljava/util/Collection;

    iget-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v12, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v12, Lc93/m;

    iget-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v13, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;

    invoke-static/range {p2 .. p2}, Lts/o;->I(Ljava/lang/Object;)V

    move v14, v3

    move-object v3, v1

    move-object v1, v12

    move-object v12, v11

    move-object v11, v10

    move-object v10, v9

    move-object v9, v8

    move v8, v14

    move v14, v0

    move-object/from16 v0, p2

    goto/16 :goto_3

    :cond_5
    move-object/from16 p2, v0

    invoke-static/range {p2 .. p2}, Lts/o;->I(Ljava/lang/Object;)V

    .line 14
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getId()Ljava/lang/String;

    move-result-object v0

    .line 15
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getName()Ljava/lang/String;

    move-result-object v3

    .line 16
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getDescription()Ljava/lang/String;

    move-result-object v4

    .line 17
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getOptions()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 18
    new-instance v6, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v5, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 20
    check-cast v8, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;

    .line 21
    invoke-static {v8}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/OptionEntity;)Lio/getstream/chat/android/models/Option;

    move-result-object v8

    .line 22
    invoke-interface {v6, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 23
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getVotes()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    .line 24
    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v5, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move-object v11, v0

    move-object v10, v3

    move-object v9, v4

    move-object v4, v8

    const/4 v12, 0x0

    move-object/from16 v0, p0

    move-object v3, v1

    move-object v8, v6

    const/4 v6, 0x0

    move-object/from16 v1, p1

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 26
    check-cast v13, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;

    .line 27
    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v1, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v8, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    const/4 v14, 0x0

    iput-object v14, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v14, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v4, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v5, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v14, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v14, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v4, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput v6, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$0:I

    iput v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$1:I

    const/4 v14, 0x0

    iput v14, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$2:I

    iput v7, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->label:I

    invoke-static {v13, v1, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v2, :cond_7

    move-object v12, v2

    goto/16 :goto_8

    :cond_7
    move-object v14, v13

    move-object v13, v0

    move-object v0, v14

    move v14, v12

    move-object v12, v11

    move-object v11, v10

    move-object v10, v9

    move-object v9, v8

    move v8, v6

    move-object v6, v4

    :goto_3
    check-cast v0, Lio/getstream/chat/android/models/Vote;

    .line 28
    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v4, v6

    move v6, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v0, v13

    move v12, v14

    goto :goto_2

    .line 29
    :cond_8
    check-cast v4, Ljava/util/List;

    .line 30
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v5

    .line 31
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getUpdatedAt()Ljava/util/Date;

    move-result-object v6

    .line 32
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getVotingVisibility()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt;->toVotingVisibility(Ljava/lang/String;)Lio/getstream/chat/android/models/VotingVisibility;

    move-result-object v7

    .line 33
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getEnforceUniqueVote()Z

    move-result v12

    .line 34
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getMaxVotesAllowed()Ljava/lang/Integer;

    move-result-object v13

    .line 35
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getAllowUserSuggestedOptions()Z

    move-result v14

    .line 36
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getAllowAnswers()Z

    move-result v15

    .line 37
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getVoteCount()I

    move-result v21

    .line 38
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getVoteCountsByOption()Ljava/util/Map;

    move-result-object v22

    .line 39
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getOwnVotes()Ljava/util/List;

    move-result-object v23

    move-object/from16 v24, v0

    move-object/from16 v0, v23

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v23, v1

    .line 40
    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v25, v3

    move-object/from16 p0, v4

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move/from16 p2, v12

    move-object v12, v5

    move-object v5, v13

    move/from16 v13, p2

    move-object/from16 v3, p0

    move-object/from16 p0, v0

    move-object/from16 p2, v2

    move-object/from16 v2, v22

    move-object/from16 v0, v24

    move-object/from16 v4, v25

    const/16 v27, 0x0

    const/16 v28, 0x0

    move/from16 v22, v15

    move-object v15, v7

    move v7, v14

    move-object v14, v1

    move-object/from16 v1, v23

    :goto_4
    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v23

    if-eqz v23, :cond_a

    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v23

    move/from16 v24, v7

    .line 42
    move-object/from16 v7, v23

    check-cast v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;

    .line 43
    iput-object v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v11, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v10, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v9, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v8, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v3, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v12, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v6, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v15, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v5, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v2, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    move-object/from16 v23, v0

    const/4 v0, 0x0

    iput-object v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    iput-object v14, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    move-object/from16 v25, v2

    move-object/from16 v2, p0

    iput-object v2, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    iput-object v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    iput-object v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    iput-object v14, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    iput-boolean v13, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$0:Z

    move/from16 v0, v24

    iput-boolean v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$1:Z

    move/from16 v0, v22

    iput-boolean v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$2:Z

    move/from16 v0, v21

    iput v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$0:I

    move/from16 v0, v27

    iput v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$1:I

    move/from16 v26, v0

    move/from16 v0, v28

    iput v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$2:I

    move/from16 v27, v0

    const/4 v0, 0x0

    iput v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$3:I

    const/4 v0, 0x2

    iput v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->label:I

    invoke-static {v7, v1, v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v0, p2

    if-ne v7, v0, :cond_9

    move-object v12, v0

    goto/16 :goto_8

    :cond_9
    move/from16 v28, v27

    move/from16 v27, v26

    move/from16 v26, v22

    move-object/from16 v22, v15

    move v15, v13

    move-object/from16 v13, v25

    move/from16 v25, v21

    move-object/from16 v21, v14

    move-object v14, v12

    move-object v12, v11

    move-object v11, v10

    move-object/from16 v10, v21

    :goto_5
    check-cast v7, Lio/getstream/chat/android/models/Vote;

    .line 44
    invoke-interface {v10, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 p2, v0

    move-object/from16 p0, v2

    move-object v10, v11

    move-object v11, v12

    move-object v2, v13

    move-object v12, v14

    move v13, v15

    move-object/from16 v14, v21

    move-object/from16 v15, v22

    move-object/from16 v0, v23

    move/from16 v7, v24

    move/from16 v21, v25

    move/from16 v22, v26

    goto/16 :goto_4

    :cond_a
    move-object/from16 v23, v0

    move-object/from16 v25, v2

    move/from16 v24, v7

    move-object/from16 v0, p2

    .line 45
    check-cast v14, Ljava/util/List;

    .line 46
    invoke-virtual/range {v23 .. v23}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getClosed()Z

    move-result v2

    .line 47
    invoke-virtual/range {v23 .. v23}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getAnswersCount()I

    move-result v7

    .line 48
    invoke-virtual/range {v23 .. v23}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getAnswers()Ljava/util/List;

    move-result-object v19

    move-object/from16 v26, v1

    move-object/from16 v1, v19

    check-cast v1, Ljava/lang/Iterable;

    move/from16 p0, v2

    .line 49
    new-instance v2, Ljava/util/ArrayList;

    move-object/from16 v19, v3

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 50
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object/from16 p2, v6

    move-object v6, v5

    move-object/from16 v5, p2

    move-object/from16 p2, v0

    move-object v0, v14

    move-object/from16 v14, v19

    move-object/from16 v3, v25

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v25, v24

    move/from16 v24, v22

    move/from16 v22, p0

    move-object/from16 p0, v1

    move-object/from16 v1, v23

    move/from16 v23, v21

    move/from16 v21, v7

    move-object v7, v15

    move v15, v13

    move-object v13, v12

    move-object v12, v2

    move-object/from16 v2, v26

    :goto_6
    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v26

    if-eqz v26, :cond_c

    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v26

    move/from16 v27, v15

    .line 51
    move-object/from16 v15, v26

    check-cast v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;

    .line 52
    iput-object v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v2, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v11, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v10, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v9, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v8, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v14, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v5, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v7, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v6, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v3, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    move-object/from16 v26, v0

    const/4 v0, 0x0

    iput-object v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    iput-object v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    iput-object v12, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    move-object/from16 v28, v3

    move-object/from16 v3, p0

    iput-object v3, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    iput-object v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    iput-object v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    iput-object v12, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    move/from16 v0, v27

    iput-boolean v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$0:Z

    move-object/from16 v27, v3

    move/from16 v3, v25

    iput-boolean v3, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$1:Z

    move-object/from16 v25, v12

    move/from16 v12, v24

    iput-boolean v12, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$2:Z

    move/from16 v12, v23

    iput v12, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$0:I

    move/from16 v12, v22

    iput-boolean v12, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$3:Z

    move/from16 v12, v21

    iput v12, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$1:I

    move/from16 v12, v20

    iput v12, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$2:I

    move/from16 v12, v19

    iput v12, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$3:I

    const/4 v12, 0x0

    iput v12, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$4:I

    const/4 v12, 0x3

    iput v12, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->label:I

    invoke-static {v15, v2, v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/AnswerEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v12, p2

    if-ne v15, v12, :cond_b

    goto/16 :goto_8

    :cond_b
    move/from16 v29, v20

    move/from16 v20, v0

    move-object v0, v15

    move-object/from16 v15, v27

    move/from16 v27, v23

    move/from16 v23, v29

    move/from16 v29, v19

    move-object/from16 v19, v5

    move-object/from16 v5, v26

    move/from16 v26, v22

    move/from16 v22, v29

    move/from16 v29, v3

    move-object/from16 v3, v28

    move/from16 v28, v24

    move/from16 v24, v21

    move-object/from16 v21, v14

    move-object/from16 v14, v25

    :goto_7
    check-cast v0, Lio/getstream/chat/android/models/Answer;

    .line 53
    invoke-interface {v14, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v0, v5

    move-object/from16 p2, v12

    move-object/from16 p0, v15

    move-object/from16 v5, v19

    move/from16 v15, v20

    move-object/from16 v14, v21

    move/from16 v19, v22

    move/from16 v20, v23

    move/from16 v21, v24

    move-object/from16 v12, v25

    move/from16 v22, v26

    move/from16 v23, v27

    move/from16 v24, v28

    move/from16 v25, v29

    goto/16 :goto_6

    :cond_c
    move-object/from16 v26, v0

    move-object/from16 v28, v3

    move v0, v15

    move/from16 v3, v25

    move-object/from16 v25, v12

    move-object/from16 v12, p2

    .line 54
    move-object/from16 v15, v25

    check-cast v15, Ljava/util/List;

    .line 55
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getCreatedById()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_e

    iput-object v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    move-object/from16 v17, v1

    const/4 v1, 0x0

    iput-object v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v11, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v10, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v9, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v8, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v14, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v13, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v5, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v7, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v6, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    move-object/from16 v1, v28

    iput-object v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    move-object/from16 v1, v26

    iput-object v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v15, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    iput-object v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    iput-object v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    iput-object v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    iput-object v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    iput-object v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    iput-boolean v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$0:Z

    iput-boolean v3, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$1:Z

    move/from16 v1, v24

    iput-boolean v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$2:Z

    move/from16 v27, v0

    move/from16 v0, v23

    iput v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$0:I

    move/from16 v0, v22

    iput-boolean v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->Z$3:Z

    move/from16 v0, v21

    iput v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$1:I

    const/4 v0, 0x0

    iput v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->I$2:I

    const/4 v0, 0x4

    iput v0, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$1;->label:I

    invoke-interface {v2, v12, v4}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v12, p2

    if-ne v0, v12, :cond_d

    :goto_8
    return-object v12

    :cond_d
    move-object v12, v7

    move-object/from16 v16, v10

    move-object/from16 v18, v14

    move/from16 v2, v21

    move/from16 v4, v23

    move/from16 v7, v27

    move-object/from16 v10, v28

    move-object v14, v13

    move-object v13, v5

    move v5, v1

    move-object v1, v6

    move v6, v3

    move/from16 v3, v22

    :goto_9
    check-cast v0, Lio/getstream/chat/android/models/User;

    move-object/from16 v48, v0

    move-object/from16 v36, v1

    move/from16 v46, v2

    move/from16 v45, v3

    move/from16 v39, v4

    move/from16 v38, v5

    move/from16 v37, v6

    move/from16 v35, v7

    move-object/from16 v40, v10

    move-object/from16 v34, v12

    move-object/from16 v44, v13

    move-object/from16 v43, v14

    move-object/from16 v31, v16

    move-object/from16 v41, v18

    :goto_a
    move-object/from16 v33, v8

    move-object/from16 v32, v9

    move-object/from16 v30, v11

    move-object/from16 v47, v15

    move-object/from16 v1, v17

    move-object/from16 v42, v26

    goto :goto_b

    :cond_e
    move/from16 v27, v0

    move-object/from16 v17, v1

    const/4 v1, 0x0

    move-object/from16 v48, v1

    move/from16 v37, v3

    move-object/from16 v44, v5

    move-object/from16 v36, v6

    move-object/from16 v34, v7

    move-object/from16 v31, v10

    move-object/from16 v43, v13

    move-object/from16 v41, v14

    move/from16 v46, v21

    move/from16 v45, v22

    move/from16 v39, v23

    move/from16 v38, v24

    move/from16 v35, v27

    move-object/from16 v40, v28

    goto :goto_a

    .line 56
    :goto_b
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;->getExtraData()Ljava/util/Map;

    move-result-object v49

    .line 57
    new-instance v29, Lio/getstream/chat/android/models/Poll;

    invoke-direct/range {v29 .. v49}, Lio/getstream/chat/android/models/Poll;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;)V

    return-object v29
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Vote;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p2

    instance-of v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;

    iget v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;

    .line 58
    invoke-direct {v1, v0}, Ls83/c;-><init>(Lq83/d;)V

    .line 59
    :goto_0
    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->result:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    .line 60
    iget v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->L$7:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->L$6:Ljava/lang/Object;

    check-cast v2, Ljava/util/Date;

    iget-object v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->L$5:Ljava/lang/Object;

    check-cast v3, Ljava/util/Date;

    iget-object v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->L$1:Ljava/lang/Object;

    check-cast v7, Lc93/m;

    iget-object v1, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    .line 61
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;->getId()Ljava/lang/String;

    move-result-object v6

    .line 62
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;->getOptionId()Ljava/lang/String;

    move-result-object v5

    .line 63
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;->getPollId()Ljava/lang/String;

    move-result-object v0

    .line 64
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v3

    .line 65
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;->getUpdatedAt()Ljava/util/Date;

    move-result-object v7

    .line 66
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/VoteEntity;->getUserId()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    if-eqz v8, :cond_4

    iput-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->L$0:Ljava/lang/Object;

    iput-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->L$1:Ljava/lang/Object;

    iput-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->L$2:Ljava/lang/Object;

    iput-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->L$3:Ljava/lang/Object;

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->L$4:Ljava/lang/Object;

    iput-object v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->L$5:Ljava/lang/Object;

    iput-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->L$6:Ljava/lang/Object;

    iput-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->L$7:Ljava/lang/Object;

    const/4 v9, 0x0

    iput v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->I$0:I

    iput v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollsMapperKt$toModel$7;->label:I

    move-object/from16 v4, p1

    invoke-interface {v4, v8, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    return-object v2

    :cond_3
    move-object v4, v0

    move-object v0, v1

    move-object v2, v7

    :goto_1
    move-object v9, v0

    check-cast v9, Lio/getstream/chat/android/models/User;

    move-object v15, v2

    move-object v12, v4

    :goto_2
    move-object v14, v3

    move-object v13, v5

    move-object v11, v6

    move-object/from16 v16, v9

    goto :goto_3

    :cond_4
    move-object v12, v0

    move-object v15, v7

    goto :goto_2

    .line 67
    :goto_3
    new-instance v10, Lio/getstream/chat/android/models/Vote;

    invoke-direct/range {v10 .. v16}, Lio/getstream/chat/android/models/Vote;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;)V

    return-object v10
.end method

.method public static final toVotingVisibility(Ljava/lang/String;)Lio/getstream/chat/android/models/VotingVisibility;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "public"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lio/getstream/chat/android/models/VotingVisibility;->PUBLIC:Lio/getstream/chat/android/models/VotingVisibility;

    return-object p0

    :cond_0
    const-string v0, "anonymous"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lio/getstream/chat/android/models/VotingVisibility;->ANONYMOUS:Lio/getstream/chat/android/models/VotingVisibility;

    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown voting visibility: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
