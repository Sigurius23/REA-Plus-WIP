.class public final Lio/getstream/chat/android/client/extensions/internal/PollKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0007\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0007\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00082\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0007\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\t2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0007\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0007\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u000b2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0007\u001a\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0001H\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "processPoll",
        "Lio/getstream/chat/android/models/Poll;",
        "Lio/getstream/chat/android/client/events/VoteChangedEvent;",
        "currentUserId",
        "",
        "getOldPoll",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/client/events/VoteCastedEvent;",
        "Lio/getstream/chat/android/client/events/VoteRemovedEvent;",
        "Lio/getstream/chat/android/client/events/AnswerCastedEvent;",
        "Lio/getstream/chat/android/client/events/PollClosedEvent;",
        "Lio/getstream/chat/android/client/events/PollUpdatedEvent;",
        "getVotesUnlessAnonymous",
        "",
        "Lio/getstream/chat/android/models/Vote;",
        "option",
        "Lio/getstream/chat/android/models/Option;",
        "getWinner",
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
.method public static final getVotesUnlessAnonymous(Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Poll;",
            "Lio/getstream/chat/android/models/Option;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Vote;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/models/Poll;->getVotes(Lio/getstream/chat/android/models/Option;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Poll;->getVotingVisibility()Lio/getstream/chat/android/models/VotingVisibility;

    move-result-object p0

    sget-object v0, Lio/getstream/chat/android/models/VotingVisibility;->ANONYMOUS:Lio/getstream/chat/android/models/VotingVisibility;

    if-ne p0, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    if-nez p1, :cond_1

    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0

    :cond_1
    return-object p1
.end method

.method public static final getWinner(Lio/getstream/chat/android/models/Poll;)Lio/getstream/chat/android/models/Option;
    .locals 8
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Poll;->getOptions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_2

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    move-object v4, v1

    check-cast v4, Lio/getstream/chat/android/models/Option;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Poll;->getVoteCountsByOption()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Option;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    goto :goto_0

    :cond_2
    move v4, v3

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/models/Option;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Poll;->getVoteCountsByOption()Ljava/util/Map;

    move-result-object v7

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Option;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_1

    :cond_4
    move v6, v3

    :goto_1
    if-ge v4, v6, :cond_5

    move-object v1, v5

    move v4, v6

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_3

    :goto_2
    check-cast v1, Lio/getstream/chat/android/models/Option;

    if-eqz v1, :cond_d

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Poll;->getVoteCountsByOption()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Option;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_3

    :cond_6
    move v0, v3

    :goto_3
    if-lez v0, :cond_c

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Poll;->getOptions()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    instance-of v5, v4, Ljava/util/Collection;

    if-eqz v5, :cond_7

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_7

    move v5, v3

    goto :goto_6

    :cond_7
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v5, v3

    :cond_8
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/models/Option;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Poll;->getVoteCountsByOption()Ljava/util/Map;

    move-result-object v7

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Option;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_5

    :cond_9
    move v6, v3

    :goto_5
    if-ne v6, v0, :cond_8

    add-int/lit8 v5, v5, 0x1

    if-ltz v5, :cond_a

    goto :goto_4

    :cond_a
    invoke-static {}, Lwb3/f;->c0()V

    throw v2

    :cond_b
    :goto_6
    const/4 p0, 0x1

    if-ne v5, p0, :cond_c

    move v3, p0

    :cond_c
    if-eqz v3, :cond_d

    return-object v1

    :cond_d
    return-object v2
.end method

.method public static final processPoll(Lio/getstream/chat/android/client/events/AnswerCastedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/events/AnswerCastedEvent;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/models/Poll;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "<this>"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "getOldPoll"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/AnswerCastedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Poll;

    if-eqz v0, :cond_1

    .line 43
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getAnswers()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    const/16 v3, 0xa

    .line 44
    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, Lm83/g0;->W(I)I

    move-result v3

    const/16 v4, 0x10

    if-ge v3, v4, :cond_0

    move v3, v4

    .line 45
    :cond_0
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 46
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 47
    move-object v5, v3

    check-cast v5, Lio/getstream/chat/android/models/Answer;

    .line 48
    invoke-virtual {v5}, Lio/getstream/chat/android/models/Answer;->getId()Ljava/lang/String;

    move-result-object v5

    .line 49
    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 50
    :cond_1
    sget-object v4, Lm83/z;->w:Lm83/z;

    .line 51
    :cond_2
    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/AnswerCastedEvent;->getNewAnswer()Lio/getstream/chat/android/models/Answer;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Answer;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/AnswerCastedEvent;->getNewAnswer()Lio/getstream/chat/android/models/Answer;

    move-result-object v3

    .line 52
    new-instance v5, Ll83/k;

    invoke-direct {v5, v1, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 53
    invoke-static {v4, v5}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v1

    .line 54
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/events/AnswerCastedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v2

    .line 55
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v20

    if-eqz v0, :cond_4

    .line 56
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getOwnVotes()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move-object v15, v0

    goto :goto_3

    :cond_4
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/events/AnswerCastedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getOwnVotes()Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :goto_3
    const v23, 0xdefff

    const/16 v24, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    .line 57
    invoke-static/range {v2 .. v24}, Lio/getstream/chat/android/models/Poll;->copy$default(Lio/getstream/chat/android/models/Poll;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    return-object v0
.end method

.method public static final processPoll(Lio/getstream/chat/android/client/events/PollClosedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/events/PollClosedEvent;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/models/Poll;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "<this>"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "getOldPoll"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/PollClosedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lio/getstream/chat/android/models/Poll;

    if-eqz v3, :cond_1

    const v24, 0xf7fff

    const/16 v25, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

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

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v3 .. v25}, Lio/getstream/chat/android/models/Poll;->copy$default(Lio/getstream/chat/android/models/Poll;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/PollClosedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    return-object v0
.end method

.method public static final processPoll(Lio/getstream/chat/android/client/events/PollUpdatedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/events/PollUpdatedEvent;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/models/Poll;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "<this>"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "getOldPoll"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/PollUpdatedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Poll;

    .line 60
    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/PollUpdatedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    if-eqz v0, :cond_1

    .line 61
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getOwnVotes()Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v14, v3

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/PollUpdatedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Poll;->getOwnVotes()Ljava/util/List;

    move-result-object v3

    goto :goto_0

    :goto_2
    if-eqz v0, :cond_3

    .line 62
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getAnswers()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_4

    :cond_2
    :goto_3
    move-object/from16 v19, v0

    goto :goto_5

    :cond_3
    :goto_4
    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/PollUpdatedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getAnswers()Ljava/util/List;

    move-result-object v0

    goto :goto_3

    :goto_5
    const v22, 0xdefff

    const/16 v23, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    .line 63
    invoke-static/range {v1 .. v23}, Lio/getstream/chat/android/models/Poll;->copy$default(Lio/getstream/chat/android/models/Poll;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    return-object v0
.end method

.method public static final processPoll(Lio/getstream/chat/android/client/events/VoteCastedEvent;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/events/VoteCastedEvent;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/models/Poll;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    move-object/from16 v0, p2

    const-string v1, "<this>"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "getOldPoll"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/VoteCastedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Poll;

    const/16 v1, 0x10

    const/16 v3, 0xa

    if-eqz v0, :cond_1

    .line 9
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getOwnVotes()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_1

    check-cast v4, Ljava/lang/Iterable;

    .line 10
    invoke-static {v4, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-static {v5}, Lm83/g0;->W(I)I

    move-result v5

    if-ge v5, v1, :cond_0

    move v5, v1

    .line 11
    :cond_0
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 12
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 13
    move-object v7, v5

    check-cast v7, Lio/getstream/chat/android/models/Vote;

    .line 14
    invoke-virtual {v7}, Lio/getstream/chat/android/models/Vote;->getId()Ljava/lang/String;

    move-result-object v7

    .line 15
    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 16
    :cond_1
    sget-object v6, Lm83/z;->w:Lm83/z;

    .line 17
    :cond_2
    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/VoteCastedEvent;->getNewVote()Lio/getstream/chat/android/models/Vote;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Vote;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    const/4 v7, 0x0

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    :goto_1
    move-object/from16 v8, p1

    goto :goto_2

    :cond_3
    move-object v5, v7

    goto :goto_1

    :goto_2
    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_3

    :cond_4
    move-object v4, v7

    :goto_3
    invoke-static {v4}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .line 18
    invoke-static {v4, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, Lm83/g0;->W(I)I

    move-result v3

    if-ge v3, v1, :cond_5

    goto :goto_4

    :cond_5
    move v1, v3

    .line 19
    :goto_4
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 20
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 21
    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/Vote;

    .line 22
    invoke-virtual {v5}, Lio/getstream/chat/android/models/Vote;->getId()Ljava/lang/String;

    move-result-object v5

    .line 23
    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 24
    :cond_6
    invoke-static {v6, v3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v1

    .line 25
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/events/VoteCastedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v2

    .line 26
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v15

    if-eqz v0, :cond_8

    .line 27
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getAnswers()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_7

    goto :goto_7

    :cond_7
    :goto_6
    move-object/from16 v20, v0

    goto :goto_8

    :cond_8
    :goto_7
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/events/VoteCastedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getAnswers()Ljava/util/List;

    move-result-object v0

    goto :goto_6

    :goto_8
    const v23, 0xdefff

    const/16 v24, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    .line 28
    invoke-static/range {v2 .. v24}, Lio/getstream/chat/android/models/Poll;->copy$default(Lio/getstream/chat/android/models/Poll;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    return-object v0
.end method

.method public static final processPoll(Lio/getstream/chat/android/client/events/VoteChangedEvent;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/events/VoteChangedEvent;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/models/Poll;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    move-object/from16 v0, p2

    const-string v1, "<this>"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "getOldPoll"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/VoteChangedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Poll;

    .line 2
    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/VoteChangedEvent;->getNewVote()Lio/getstream/chat/android/models/Vote;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Vote;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    :goto_0
    move-object/from16 v5, p1

    goto :goto_1

    :cond_0
    move-object v3, v4

    goto :goto_0

    :goto_1
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_2

    :cond_1
    move-object v1, v4

    :goto_2
    if-eqz v1, :cond_2

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    goto :goto_3

    :cond_2
    if-eqz v0, :cond_3

    .line 3
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getOwnVotes()Ljava/util/List;

    move-result-object v4

    .line 4
    :cond_3
    :goto_3
    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/VoteChangedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v5

    if-nez v4, :cond_4

    .line 5
    sget-object v4, Lm83/y;->w:Lm83/y;

    :cond_4
    move-object/from16 v18, v4

    if-eqz v0, :cond_6

    .line 6
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getAnswers()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_5

    :cond_5
    :goto_4
    move-object/from16 v23, v0

    goto :goto_6

    :cond_6
    :goto_5
    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/VoteChangedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getAnswers()Ljava/util/List;

    move-result-object v0

    goto :goto_4

    :goto_6
    const v26, 0xdefff

    const/16 v27, 0x0

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

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    .line 7
    invoke-static/range {v5 .. v27}, Lio/getstream/chat/android/models/Poll;->copy$default(Lio/getstream/chat/android/models/Poll;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    return-object v0
.end method

.method public static final processPoll(Lio/getstream/chat/android/client/events/VoteRemovedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/events/VoteRemovedEvent;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lio/getstream/chat/android/models/Poll;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "<this>"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "getOldPoll"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/VoteRemovedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Poll;

    if-eqz v0, :cond_1

    .line 30
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getOwnVotes()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    const/16 v3, 0xa

    .line 31
    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, Lm83/g0;->W(I)I

    move-result v3

    const/16 v4, 0x10

    if-ge v3, v4, :cond_0

    move v3, v4

    .line 32
    :cond_0
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 33
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 34
    move-object v5, v3

    check-cast v5, Lio/getstream/chat/android/models/Vote;

    .line 35
    invoke-virtual {v5}, Lio/getstream/chat/android/models/Vote;->getId()Ljava/lang/String;

    move-result-object v5

    .line 36
    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 37
    :cond_1
    sget-object v4, Lm83/z;->w:Lm83/z;

    :cond_2
    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/VoteRemovedEvent;->getRemovedVote()Lio/getstream/chat/android/models/Vote;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Vote;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lm83/g0;->Z(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    .line 38
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/events/VoteRemovedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v2

    .line 39
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v15

    if-eqz v0, :cond_4

    .line 40
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getAnswers()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move-object/from16 v20, v0

    goto :goto_3

    :cond_4
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/events/VoteRemovedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getAnswers()Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :goto_3
    const v23, 0xdefff

    const/16 v24, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    .line 41
    invoke-static/range {v2 .. v24}, Lio/getstream/chat/android/models/Poll;->copy$default(Lio/getstream/chat/android/models/Poll;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/models/VotingVisibility;ZLjava/lang/Integer;ZZILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;ZILjava/util/List;Lio/getstream/chat/android/models/User;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    return-object v0
.end method
