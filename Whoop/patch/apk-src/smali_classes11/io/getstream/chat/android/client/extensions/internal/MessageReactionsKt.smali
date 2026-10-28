.class public final Lio/getstream/chat/android/client/extensions/internal/MessageReactionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a \u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "addMyReaction",
        "Lio/getstream/chat/android/models/Message;",
        "reaction",
        "Lio/getstream/chat/android/models/Reaction;",
        "enforceUnique",
        "",
        "removeMyReaction",
        "removeReactions",
        "userId",
        "",
        "type",
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
.method public static final addMyReaction(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;Z)Lio/getstream/chat/android/models/Message;
    .locals 53
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "reaction"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getUserId()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v2, v4, v3, v4}, Lio/getstream/chat/android/client/extensions/internal/MessageReactionsKt;->removeReactions$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getReactionScores()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getScore()I

    move-result v4

    add-int/2addr v4, v2

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getReactionScores()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-instance v6, Ll83/k;

    invoke-direct {v6, v5, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v6}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v14

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getReactionCounts()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getReactionCounts()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2, v5}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v13

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getReactionGroups()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/ReactionGroup;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lio/getstream/chat/android/models/ReactionGroup;->getSumScore()I

    move-result v2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getScore()I

    move-result v4

    add-int v6, v4, v2

    invoke-virtual {v3}, Lio/getstream/chat/android/models/ReactionGroup;->getCount()I

    move-result v2

    add-int/lit8 v5, v2, 0x1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getCreatedAt()Ljava/util/Date;

    move-result-object v2

    if-nez v2, :cond_3

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v2

    if-nez v2, :cond_3

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    :cond_3
    move-object v8, v2

    const/16 v9, 0x9

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v10}, Lio/getstream/chat/android/models/ReactionGroup;->copy$default(Lio/getstream/chat/android/models/ReactionGroup;Ljava/lang/String;IILjava/util/Date;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ReactionGroup;

    move-result-object v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    new-instance v3, Lio/getstream/chat/android/models/ReactionGroup;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getScore()I

    move-result v6

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getCreatedAt()Ljava/util/Date;

    move-result-object v2

    if-nez v2, :cond_5

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v2

    if-nez v2, :cond_5

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    :cond_5
    move-object v7, v2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getCreatedAt()Ljava/util/Date;

    move-result-object v2

    if-nez v2, :cond_6

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v2

    if-nez v2, :cond_6

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    :cond_6
    move-object v8, v2

    const/4 v5, 0x1

    invoke-direct/range {v3 .. v8}, Lio/getstream/chat/android/models/ReactionGroup;-><init>(Ljava/lang/String;IILjava/util/Date;Ljava/util/Date;)V

    move-object v2, v3

    :goto_1
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getReactionGroups()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v5}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v15

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getLatestReactions()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {v1, v2}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v18

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {v1, v2}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v19

    const v51, 0xffff

    const/16 v52, 0x0

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

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

    const v50, -0x33801

    move-object v1, v0

    invoke-static/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic addMyReaction$default(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;ZILjava/lang/Object;)Lio/getstream/chat/android/models/Message;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/extensions/internal/MessageReactionsKt;->addMyReaction(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;Z)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method public static final removeMyReaction(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Reaction;)Lio/getstream/chat/android/models/Message;
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reaction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getUserId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lio/getstream/chat/android/client/extensions/internal/MessageReactionsKt;->removeReactions(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method private static final removeReactions(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;
    .locals 56

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    if-eqz v1, :cond_2

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Reaction;->getUserId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v3}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    goto :goto_1

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getReactionScores()Ljava/util/Map;

    move-result-object v3

    invoke-static {v3}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getReactionCounts()Ljava/util/Map;

    move-result-object v4

    invoke-static {v4}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getReactionGroups()Ljava/util/Map;

    move-result-object v5

    invoke-static {v5}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v5

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_3
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getReactionScores()Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Reaction;->getScore()I

    move-result v9

    sub-int/2addr v8, v9

    if-lez v8, :cond_4

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v3, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_4
    invoke-virtual {v7}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v3, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getReactionCounts()Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    if-eqz v8, :cond_7

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    if-lez v8, :cond_6

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v4, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_6
    invoke-virtual {v7}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getReactionGroups()Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lio/getstream/chat/android/models/ReactionGroup;

    if-eqz v9, :cond_3

    invoke-virtual {v9}, Lio/getstream/chat/android/models/ReactionGroup;->getSumScore()I

    move-result v8

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Reaction;->getScore()I

    move-result v10

    sub-int v12, v8, v10

    invoke-virtual {v9}, Lio/getstream/chat/android/models/ReactionGroup;->getCount()I

    move-result v8

    add-int/lit8 v11, v8, -0x1

    const/16 v15, 0x19

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v9 .. v16}, Lio/getstream/chat/android/models/ReactionGroup;->copy$default(Lio/getstream/chat/android/models/ReactionGroup;Ljava/lang/String;IILjava/util/Date;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/ReactionGroup;

    move-result-object v8

    invoke-virtual {v8}, Lio/getstream/chat/android/models/ReactionGroup;->getSumScore()I

    move-result v9

    if-lez v9, :cond_8

    invoke-virtual {v8}, Lio/getstream/chat/android/models/ReactionGroup;->getCount()I

    move-result v9

    if-lez v9, :cond_8

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2

    :cond_8
    invoke-virtual {v7}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_2

    :cond_9
    if-eqz v1, :cond_a

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6, v2}, Lm83/s;->c1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    :goto_5
    move-object/from16 v22, v2

    goto :goto_6

    :cond_a
    sget-object v2, Lm83/y;->w:Lm83/y;

    goto :goto_5

    :goto_6
    if-eqz v1, :cond_d

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getLatestReactions()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v8}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-virtual {v8}, Lio/getstream/chat/android/models/Reaction;->getUserId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    goto :goto_7

    :cond_b
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_c
    move-object/from16 v21, v6

    goto :goto_9

    :cond_d
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getLatestReactions()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_e
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Reaction;->getUserId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :goto_9
    const v54, 0xffff

    const/16 v55, 0x0

    move-object/from16 v18, v5

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

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

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

    const v53, -0x33801

    move-object/from16 v17, v3

    move-object/from16 v16, v4

    move-object/from16 v4, p0

    invoke-static/range {v4 .. v55}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic removeReactions$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/Message;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/extensions/internal/MessageReactionsKt;->removeReactions(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method
