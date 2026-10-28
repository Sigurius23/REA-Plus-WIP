.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0084\u0001\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\"\u0010\u0006\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00012$\u0010\u0008\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00012$\u0010\n\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0080@\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0013\u0010\r\u001a\u00020\u0000*\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a^\u0010\u000b\u001a\u00020\u0007*\u00020\u000f2\"\u0010\u0006\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00012$\u0010\n\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0080@\u00a2\u0006\u0004\u0008\u000b\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\u000f*\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u0013\u0010\r\u001a\u00020\u0014*\u00020\u0013H\u0000\u00a2\u0006\u0004\u0008\r\u0010\u0015\u001a:\u0010\u000b\u001a\u00020\u0013*\u00020\u00142$\u0010\u0016\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0080@\u00a2\u0006\u0004\u0008\u000b\u0010\u0017\u001a\u0013\u0010\r\u001a\u00020\u0019*\u00020\u0018H\u0000\u00a2\u0006\u0004\u0008\r\u0010\u001a\u001a\u0013\u0010\u000b\u001a\u00020\u0018*\u00020\u0019H\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
        "Lkotlin/Function2;",
        "",
        "Lq83/d;",
        "Lio/getstream/chat/android/models/User;",
        "",
        "getUser",
        "Lio/getstream/chat/android/models/Message;",
        "getReply",
        "Lio/getstream/chat/android/models/Poll;",
        "getPoll",
        "toModel",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;",
        "toEntity",
        "(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;",
        "toReplyEntity",
        "(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;",
        "(Lio/getstream/chat/android/models/DraftMessage;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;",
        "getMessage",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/MessageReminderInfo;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;",
        "(Lio/getstream/chat/android/models/MessageReminderInfo;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;)Lio/getstream/chat/android/models/MessageReminderInfo;",
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
.method public static final toEntity(Lio/getstream/chat/android/models/DraftMessage;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    invoke-virtual {p0}, Lio/getstream/chat/android/models/DraftMessage;->getId()Ljava/lang/String;

    move-result-object v2

    .line 83
    invoke-virtual {p0}, Lio/getstream/chat/android/models/DraftMessage;->getCid()Ljava/lang/String;

    move-result-object v3

    .line 84
    invoke-virtual {p0}, Lio/getstream/chat/android/models/DraftMessage;->getParentId()Ljava/lang/String;

    move-result-object v5

    .line 85
    invoke-virtual {p0}, Lio/getstream/chat/android/models/DraftMessage;->getMentionedUsersIds()Ljava/util/List;

    move-result-object v6

    .line 86
    invoke-virtual {p0}, Lio/getstream/chat/android/models/DraftMessage;->getSilent()Z

    move-result v7

    .line 87
    invoke-virtual {p0}, Lio/getstream/chat/android/models/DraftMessage;->getShowInChannel()Z

    move-result v8

    .line 88
    invoke-virtual {p0}, Lio/getstream/chat/android/models/DraftMessage;->getReplyMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v9, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 89
    :goto_1
    invoke-virtual {p0}, Lio/getstream/chat/android/models/DraftMessage;->getText()Ljava/lang/String;

    move-result-object v4

    .line 90
    invoke-virtual {p0}, Lio/getstream/chat/android/models/DraftMessage;->getCommand()Ljava/lang/String;

    move-result-object v10

    .line 91
    invoke-virtual {p0}, Lio/getstream/chat/android/models/DraftMessage;->getArgs()Ljava/lang/String;

    move-result-object v11

    .line 92
    invoke-virtual {p0}, Lio/getstream/chat/android/models/DraftMessage;->getExtraData()Ljava/util/Map;

    move-result-object v12

    .line 93
    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-object v1
.end method

.method public static final toEntity(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;
    .locals 48

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    .line 2
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v4

    .line 3
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    .line 4
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v6

    .line 5
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getHtml()Ljava/lang/String;

    move-result-object v7

    .line 6
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v9

    .line 7
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getType()Ljava/lang/String;

    move-result-object v8

    .line 8
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getReplyCount()I

    move-result v10

    .line 9
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getDeletedReplyCount()I

    move-result v11

    .line 10
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getCreatedAt()Ljava/util/Date;

    move-result-object v12

    .line 11
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v13

    .line 12
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getUpdatedAt()Ljava/util/Date;

    move-result-object v14

    .line 13
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getUpdatedLocallyAt()Ljava/util/Date;

    move-result-object v15

    .line 14
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getDeletedAt()Ljava/util/Date;

    move-result-object v16

    .line 15
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v22

    .line 16
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getCommand()Ljava/lang/String;

    move-result-object v23

    .line 17
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getExtraData()Ljava/util/Map;

    move-result-object v29

    .line 18
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getReactionCounts()Ljava/util/Map;

    move-result-object v19

    .line 19
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getReactionScores()Ljava/util/Map;

    move-result-object v20

    .line 20
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getReactionGroups()Ljava/util/Map;

    move-result-object v0

    .line 21
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v17

    move-object/from16 v18, v0

    invoke-static/range {v17 .. v17}, Lm83/g0;->W(I)I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 22
    invoke-interface/range {v18 .. v18}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    .line 24
    check-cast v17, Ljava/util/Map$Entry;

    move-object/from16 v18, v0

    .line 25
    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    .line 26
    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lio/getstream/chat/android/models/ReactionGroup;

    invoke-static/range {v17 .. v17}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupMapperKt;->toEntity(Lio/getstream/chat/android/models/ReactionGroup;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;

    move-result-object v1

    .line 27
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, p0

    move-object/from16 v0, v18

    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getShadowed()Z

    move-result v24

    .line 29
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getI18n()Ljava/util/Map;

    move-result-object v25

    .line 30
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getMentionedUsers()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 31
    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v21, v2

    const/16 v2, 0xa

    move-object/from16 v17, v3

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 33
    check-cast v3, Lio/getstream/chat/android/models/User;

    .line 34
    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    .line 35
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 36
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getMentionedUsersIds()Ljava/util/List;

    move-result-object v18

    .line 37
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getReplyTo()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    move-object/from16 v30, v0

    goto :goto_4

    :cond_3
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getReplyMessageId()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    .line 38
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getThreadParticipants()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 39
    new-instance v3, Ljava/util/ArrayList;

    move-object/from16 v26, v1

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 41
    check-cast v1, Lio/getstream/chat/android/models/User;

    .line 42
    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    .line 43
    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 44
    :cond_4
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getShowInChannel()Z

    move-result v0

    .line 45
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getSilent()Z

    move-result v28

    .line 46
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getChannelInfo()Lio/getstream/chat/android/models/ChannelInfo;

    move-result-object v1

    const/16 v47, 0x0

    if-eqz v1, :cond_5

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoMapperKt;->toEntity(Lio/getstream/chat/android/models/ChannelInfo;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    move-result-object v1

    move-object/from16 v27, v1

    goto :goto_6

    :cond_5
    move-object/from16 v27, v47

    .line 47
    :goto_6
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v31

    .line 48
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getPinnedAt()Ljava/util/Date;

    move-result-object v32

    .line 49
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object v33

    .line 50
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getPinnedBy()Lio/getstream/chat/android/models/User;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v34, v1

    goto :goto_7

    :cond_6
    move-object/from16 v34, v47

    .line 51
    :goto_7
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getSkipPushNotification()Z

    move-result v36

    .line 52
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getSkipEnrichUrl()Z

    move-result v37

    .line 53
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getModerationDetails()Lio/getstream/chat/android/models/MessageModerationDetails;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsMapperKt;->toEntity(Lio/getstream/chat/android/models/MessageModerationDetails;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v1

    move-object/from16 v38, v1

    goto :goto_8

    :cond_7
    move-object/from16 v38, v47

    .line 54
    :goto_8
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getModeration()Lio/getstream/chat/android/models/Moderation;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationMapperKt;->toEntity(Lio/getstream/chat/android/models/Moderation;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    move-result-object v1

    move-object/from16 v39, v1

    goto :goto_9

    :cond_8
    move-object/from16 v39, v47

    .line 55
    :goto_9
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getMessageTextUpdatedAt()Ljava/util/Date;

    move-result-object v40

    .line 56
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v41, v1

    goto :goto_a

    :cond_9
    move-object/from16 v41, v47

    .line 57
    :goto_a
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getReminder()Lio/getstream/chat/android/models/MessageReminderInfo;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt;->toEntity(Lio/getstream/chat/android/models/MessageReminderInfo;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v1

    move-object/from16 v43, v1

    goto :goto_b

    :cond_a
    move-object/from16 v43, v47

    .line 58
    :goto_b
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getRestrictedVisibility()Ljava/util/List;

    move-result-object v42

    .line 59
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getSharedLocation()Lio/getstream/chat/android/models/Location;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationMapperKt;->toEntity(Lio/getstream/chat/android/models/Location;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-result-object v1

    move-object/from16 v44, v1

    goto :goto_c

    :cond_b
    move-object/from16 v44, v47

    .line 60
    :goto_c
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getChannelRole()Ljava/lang/String;

    move-result-object v45

    .line 61
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getDeletedForMe()Z

    move-result v46

    move v1, v2

    .line 62
    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    move-object/from16 v35, v3

    move-object/from16 v3, v17

    move-object/from16 v17, v26

    move/from16 v26, v0

    invoke-direct/range {v2 .. v46}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;ZZLio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;Ljava/lang/String;Z)V

    .line 63
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 64
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v4, 0x0

    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v4, 0x1

    if-ltz v4, :cond_c

    .line 66
    check-cast v5, Lio/getstream/chat/android/models/Attachment;

    .line 67
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7, v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentMapperKt;->toEntity(Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;I)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;

    move-result-object v4

    .line 68
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v4, v6

    goto :goto_d

    :cond_c
    invoke-static {}, Lwb3/f;->d0()V

    throw v47

    .line 69
    :cond_d
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getLatestReactions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 70
    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 71
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 72
    check-cast v5, Lio/getstream/chat/android/models/Reaction;

    .line 73
    invoke-static {v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt;->toEntity(Lio/getstream/chat/android/models/Reaction;)Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    move-result-object v5

    .line 74
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_e

    .line 75
    :cond_e
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 76
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 78
    check-cast v1, Lio/getstream/chat/android/models/Reaction;

    .line 79
    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt;->toEntity(Lio/getstream/chat/android/models/Reaction;)Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    move-result-object v1

    .line 80
    invoke-interface {v5, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_f

    .line 81
    :cond_f
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-direct {v0, v2, v3, v5, v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public static final toEntity(Lio/getstream/chat/android/models/MessageReminderInfo;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    .line 95
    invoke-virtual {p0}, Lio/getstream/chat/android/models/MessageReminderInfo;->getRemindAt()Ljava/util/Date;

    move-result-object v1

    .line 96
    invoke-virtual {p0}, Lio/getstream/chat/android/models/MessageReminderInfo;->getCreatedAt()Ljava/util/Date;

    move-result-object v2

    .line 97
    invoke-virtual {p0}, Lio/getstream/chat/android/models/MessageReminderInfo;->getUpdatedAt()Ljava/util/Date;

    move-result-object p0

    .line 98
    invoke-direct {v0, v1, v2, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;-><init>(Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V

    return-object v0
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;)Lio/getstream/chat/android/models/MessageReminderInfo;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    new-instance v0, Lio/getstream/chat/android/models/MessageReminderInfo;

    .line 165
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;->getRemindAt()Ljava/util/Date;

    move-result-object v1

    .line 166
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v2

    .line 167
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;->getUpdatedAt()Ljava/util/Date;

    move-result-object p0

    .line 168
    invoke-direct {v0, v1, v2, p0}, Lio/getstream/chat/android/models/MessageReminderInfo;-><init>(Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V

    return-object v0
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/DraftMessage;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p2

    instance-of v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;

    iget v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;

    .line 1
    invoke-direct {v1, v0}, Ls83/c;-><init>(Lq83/d;)V

    .line 2
    :goto_0
    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->result:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    .line 3
    iget v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-boolean v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->Z$1:Z

    iget-boolean v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->Z$0:Z

    iget-object v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->L$6:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->L$5:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->L$4:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->L$3:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->L$2:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->L$1:Ljava/lang/Object;

    check-cast v8, Lc93/m;

    iget-object v1, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;

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
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getId()Ljava/lang/String;

    move-result-object v7

    .line 5
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getCid()Ljava/lang/String;

    move-result-object v6

    .line 6
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getParentId()Ljava/lang/String;

    move-result-object v5

    .line 7
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getMentionedUsersIds()Ljava/util/List;

    move-result-object v0

    .line 8
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getSilent()Z

    move-result v3

    .line 9
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getShowInChannel()Z

    move-result v8

    .line 10
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getReplyMessageId()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    move-object/from16 v11, p0

    if-eqz v9, :cond_4

    iput-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->L$0:Ljava/lang/Object;

    iput-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->L$1:Ljava/lang/Object;

    iput-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->L$2:Ljava/lang/Object;

    iput-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->L$3:Ljava/lang/Object;

    iput-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->L$4:Ljava/lang/Object;

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->L$5:Ljava/lang/Object;

    iput-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->L$6:Ljava/lang/Object;

    iput-boolean v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->Z$0:Z

    iput-boolean v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->Z$1:Z

    const/4 v10, 0x0

    iput v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->I$0:I

    iput v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$5;->label:I

    move-object/from16 v4, p1

    invoke-interface {v4, v9, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    return-object v2

    :cond_3
    move-object v4, v0

    move-object v0, v1

    move v2, v8

    move-object v1, v11

    :goto_1
    move-object v10, v0

    check-cast v10, Lio/getstream/chat/android/models/Message;

    move v11, v2

    move-object v8, v4

    :goto_2
    move-object v4, v6

    move-object v12, v10

    move v10, v3

    move-object v6, v5

    move-object v3, v7

    goto :goto_3

    :cond_4
    move-object v1, v11

    move v11, v8

    move-object v8, v0

    goto :goto_2

    .line 11
    :goto_3
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getText()Ljava/lang/String;

    move-result-object v5

    .line 12
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getCommand()Ljava/lang/String;

    move-result-object v13

    .line 13
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getArgs()Ljava/lang/String;

    move-result-object v14

    .line 14
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/DraftMessageEntity;->getExtraData()Ljava/util/Map;

    move-result-object v9

    .line 15
    new-instance v2, Lio/getstream/chat/android/models/DraftMessage;

    const/16 v15, 0x10

    const/16 v16, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v16}, Lio/getstream/chat/android/models/DraftMessage;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;ZZLio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 137
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;

    .line 16
    invoke-direct {v2, v1}, Ls83/c;-><init>(Lq83/d;)V

    .line 17
    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    .line 18
    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->label:I

    packed-switch v4, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-boolean v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$5:Z

    iget-boolean v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$4:Z

    iget-boolean v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$3:Z

    iget-boolean v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$2:Z

    iget-boolean v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$1:Z

    iget-boolean v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$0:Z

    iget v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$2:I

    iget v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$1:I

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$40:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$39:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$38:Ljava/lang/Object;

    check-cast v12, Ljava/util/Date;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$37:Ljava/lang/Object;

    check-cast v13, Lio/getstream/chat/android/models/Moderation;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$36:Ljava/lang/Object;

    check-cast v14, Lio/getstream/chat/android/models/MessageModerationDetails;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$35:Ljava/lang/Object;

    check-cast v15, Lio/getstream/chat/android/models/User;

    iget-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$34:Ljava/lang/Object;

    check-cast v7, Ljava/util/Date;

    move/from16 p0, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$33:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 p1, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$32:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 p2, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$31:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/ChannelInfo;

    move-object/from16 p3, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$30:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v16, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$29:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v17, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$28:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    move-object/from16 v18, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$27:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v19, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$26:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v20, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v21, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v22, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 v23, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/SyncStatus;

    move-object/from16 v24, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 v25, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 v26, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 v27, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v28, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v29, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v30, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v31, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v32, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v33, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v34, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v35, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v36, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v37, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v38, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/User;

    move-object/from16 v39, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v40, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v41, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    move-object/from16 v42, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, v37

    move-object/from16 v37, v12

    move-object v12, v0

    move-object/from16 v0, v26

    move-object/from16 v26, v22

    move-object/from16 v22, v0

    move-object/from16 v0, v25

    move-object/from16 v25, v23

    move-object/from16 v23, v0

    move/from16 v2, p0

    move/from16 v44, v4

    move/from16 v43, v5

    move-object/from16 v4, v39

    move-object/from16 v5, v41

    move-object/from16 v0, v42

    move/from16 v42, v6

    move/from16 v41, v8

    move-object/from16 v39, v14

    move-object/from16 v14, v33

    move-object/from16 v33, p3

    move-object v6, v1

    move-object v8, v7

    move-object/from16 v1, p1

    move v7, v3

    move-object/from16 v3, v40

    move-object/from16 v40, v15

    move-object v15, v11

    move-object/from16 v11, v38

    move-object/from16 v38, v13

    move-object/from16 v13, v34

    move-object/from16 v34, p2

    goto/16 :goto_1b

    :pswitch_1
    iget-boolean v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$3:Z

    iget-boolean v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$2:Z

    iget-boolean v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$1:Z

    iget-boolean v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$0:Z

    iget v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$2:I

    iget v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$1:I

    iget v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$0:I

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$35:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$34:Ljava/lang/Object;

    check-cast v11, Ljava/util/Date;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$33:Ljava/lang/Object;

    check-cast v12, Ljava/util/Date;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$32:Ljava/lang/Object;

    check-cast v13, Ljava/util/Map;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$31:Ljava/lang/Object;

    check-cast v14, Lio/getstream/chat/android/models/ChannelInfo;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$30:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$29:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    move/from16 v17, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$28:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    move-object/from16 p0, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$27:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p1, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$26:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p2, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p3, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v18, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 v19, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/SyncStatus;

    move-object/from16 v20, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 v21, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 v22, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 v23, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v24, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v25, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v26, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v27, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v28, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v29, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v30, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v31, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v32, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v33, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v34, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/User;

    move-object/from16 v35, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v36, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v37, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    move-object/from16 v38, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v39, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, v34

    move-object/from16 v34, v11

    move-object v11, v0

    move-object/from16 v0, v33

    move-object/from16 v33, v12

    move-object v12, v0

    move-object/from16 v0, v26

    move-object/from16 v26, v19

    move-object/from16 v19, v0

    move-object/from16 v0, v24

    move-object/from16 v24, v21

    move-object/from16 v21, v0

    move-object/from16 v0, v23

    move-object/from16 v23, v22

    move-object/from16 v22, v0

    move-object v0, v3

    move-object/from16 v40, v13

    move-object/from16 v41, v14

    move-object/from16 v42, v15

    move-object/from16 v13, v30

    move-object/from16 v3, v36

    move-object/from16 v30, p1

    move v14, v8

    move/from16 v36, v9

    move v15, v10

    move v8, v4

    move v9, v5

    move-object v10, v6

    move/from16 v5, v17

    move-object/from16 v17, v25

    move-object/from16 v4, p0

    move-object v6, v1

    move-object/from16 v25, v20

    move-object/from16 v20, v38

    move-object/from16 v1, p3

    move/from16 v38, v7

    move-object v7, v2

    move-object/from16 v2, p2

    goto/16 :goto_14

    :pswitch_2
    iget v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$4:I

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$3:I

    iget-boolean v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$0:Z

    iget v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$2:I

    iget v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$1:I

    iget v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$0:I

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$37:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$35:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$34:Ljava/lang/Object;

    check-cast v10, Ljava/util/Map;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$33:Ljava/lang/Object;

    check-cast v11, Ljava/util/Collection;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$32:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$31:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$30:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$29:Ljava/lang/Object;

    check-cast v13, Lio/getstream/chat/android/models/Message;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$28:Ljava/lang/Object;

    check-cast v14, Ljava/util/List;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$27:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    move/from16 v17, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$26:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p0, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p1, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 p2, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/SyncStatus;

    move-object/from16 p3, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 v18, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 v19, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 v20, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v21, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v22, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v23, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;

    move-object/from16 v24, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v25, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v26, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v27, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v28, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v29, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v30, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v31, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v32, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/User;

    move-object/from16 v33, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v34, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v35, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    move-object/from16 v36, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v37, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v38, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v99, p0

    move-object/from16 v98, p1

    move-object/from16 v97, p2

    move-object/from16 v96, p3

    move/from16 v109, v4

    move/from16 v104, v5

    move/from16 v105, v6

    move/from16 v106, v7

    move/from16 v107, v8

    move-object/from16 v108, v10

    move-object/from16 v103, v12

    move-object/from16 v102, v13

    move-object/from16 v101, v14

    move-object/from16 v100, v15

    move/from16 v110, v17

    move-object/from16 v95, v18

    move-object/from16 v94, v19

    move-object/from16 v93, v20

    move-object/from16 v17, v22

    move-object/from16 v19, v23

    move-object/from16 v0, v24

    move-object/from16 v15, v25

    move-object/from16 v6, v26

    move-object/from16 v14, v27

    move-object/from16 v13, v28

    move-object/from16 v10, v29

    move-object/from16 v7, v30

    move-object/from16 v12, v31

    move-object/from16 v4, v33

    move-object/from16 v5, v35

    move-object v8, v1

    move-object v1, v3

    move-object/from16 v3, v34

    move-object/from16 v34, v9

    move-object/from16 v9, v37

    :goto_1
    move-object/from16 v92, v21

    goto/16 :goto_11

    :pswitch_3
    iget-boolean v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$0:Z

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$2:I

    iget v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$1:I

    iget v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$0:I

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$29:Ljava/lang/Object;

    check-cast v8, Ljava/util/Map;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$28:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$27:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$26:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    check-cast v13, Ljava/util/Map;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    check-cast v14, Lio/getstream/chat/android/models/SyncStatus;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    check-cast v15, Ljava/util/Map;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    check-cast v5, Ljava/util/Map;

    move/from16 v18, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 p0, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p1, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p2, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p3, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v19, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v20, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v21, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v22, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v23, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v24, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v25, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v26, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/User;

    move-object/from16 v27, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v28, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v29, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    move-object/from16 v30, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v31, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v32, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, v25

    move-object/from16 v25, v12

    move-object v12, v0

    move/from16 v35, v4

    move/from16 v33, v7

    move-object/from16 v34, v15

    move-object/from16 v15, v19

    move-object/from16 v7, v24

    move-object/from16 v0, v32

    move-object/from16 v24, p0

    move-object/from16 v19, p3

    move-object v4, v2

    move-object v2, v3

    move-object/from16 v32, v14

    move-object/from16 v14, v21

    move-object v3, v1

    move-object/from16 v21, v11

    move-object/from16 v11, v26

    move-object/from16 v1, p1

    move-object/from16 v26, v13

    move-object/from16 v13, v22

    move-object/from16 v22, p2

    goto/16 :goto_d

    :pswitch_4
    iget v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$4:I

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$3:I

    iget-boolean v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$0:Z

    iget v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$2:I

    iget v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$1:I

    iget v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$0:I

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$33:Ljava/lang/Object;

    check-cast v9, Ljava/util/Map;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$32:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$30:Ljava/lang/Object;

    check-cast v10, Ljava/util/Iterator;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$29:Ljava/lang/Object;

    check-cast v11, Ljava/util/Collection;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$28:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$27:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$26:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    check-cast v14, Ljava/util/Map;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    check-cast v15, Lio/getstream/chat/android/models/SyncStatus;

    move/from16 v18, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 p0, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 p1, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 p2, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p3, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v19, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v20, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;

    move-object/from16 v21, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v22, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v23, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v24, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v25, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v26, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v27, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v28, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v29, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/User;

    move-object/from16 v30, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v31, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v32, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    move-object/from16 v33, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v34, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v35, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v36, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v89, p0

    move-object/from16 v80, p1

    move-object/from16 v77, p2

    move-object/from16 v76, p3

    move/from16 v90, v4

    move/from16 v78, v5

    move/from16 v79, v6

    move/from16 v81, v7

    move/from16 v82, v8

    move-object/from16 v83, v9

    move-object/from16 v84, v11

    move-object/from16 v85, v12

    move-object/from16 v86, v13

    move-object/from16 v87, v14

    move-object/from16 v88, v15

    move/from16 v91, v18

    move-object/from16 v75, v19

    move-object/from16 v19, v20

    move-object/from16 v0, v21

    move-object/from16 v21, v22

    move-object/from16 v6, v23

    move-object/from16 v14, v24

    move-object/from16 v13, v25

    move-object/from16 v7, v27

    move-object/from16 v12, v28

    move-object/from16 v11, v29

    move-object/from16 v4, v30

    move-object/from16 v5, v32

    move-object/from16 v9, v34

    move-object/from16 v8, v35

    move-object v15, v3

    move-object/from16 v32, v10

    move-object/from16 v10, v26

    move-object/from16 v3, v31

    goto/16 :goto_c

    :pswitch_5
    iget v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$4:I

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$3:I

    iget-boolean v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$0:Z

    iget v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$2:I

    iget v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$1:I

    iget v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$0:I

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$32:Ljava/lang/Object;

    check-cast v9, Ljava/util/Map;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$31:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$29:Ljava/lang/Object;

    check-cast v10, Ljava/util/Iterator;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$28:Ljava/lang/Object;

    check-cast v11, Ljava/util/Collection;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$27:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$26:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    check-cast v13, Ljava/util/Map;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    check-cast v14, Lio/getstream/chat/android/models/SyncStatus;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    check-cast v15, Ljava/util/Map;

    move/from16 v18, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 p0, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 p1, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p2, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p3, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v19, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;

    move-object/from16 v20, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v21, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v22, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v23, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v24, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v25, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v26, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v27, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v28, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/User;

    move-object/from16 v29, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v30, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v31, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    move-object/from16 v32, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v33, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v34, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v35, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v62, p0

    move-object/from16 v61, p1

    move-object/from16 v60, p2

    move-object/from16 v59, p3

    move/from16 v73, v4

    move/from16 v63, v5

    move/from16 v64, v6

    move/from16 v65, v7

    move/from16 v66, v8

    move-object/from16 v67, v9

    move-object/from16 v68, v11

    move-object/from16 v69, v12

    move-object/from16 v70, v13

    move-object/from16 v71, v14

    move-object/from16 v72, v15

    move/from16 v74, v18

    move-object/from16 v0, v20

    move-object/from16 v6, v21

    move-object/from16 v14, v23

    move-object/from16 v13, v24

    move-object/from16 v7, v26

    move-object/from16 v12, v27

    move-object/from16 v11, v28

    move-object/from16 v4, v29

    move-object/from16 v5, v31

    move-object/from16 v9, v33

    move-object/from16 v8, v34

    move-object v15, v2

    move-object/from16 v31, v10

    move-object/from16 v10, v25

    move-object v2, v1

    move-object v1, v3

    move-object/from16 v3, v22

    goto/16 :goto_a

    :pswitch_6
    iget v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$4:I

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$3:I

    iget-boolean v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$0:Z

    iget v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$2:I

    iget v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$1:I

    iget v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$0:I

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$31:Ljava/lang/Object;

    check-cast v9, Ljava/util/Map;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$30:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$28:Ljava/lang/Object;

    check-cast v10, Ljava/util/Iterator;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$27:Ljava/lang/Object;

    check-cast v11, Ljava/util/Collection;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$26:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    check-cast v12, Ljava/util/Map;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    check-cast v13, Lio/getstream/chat/android/models/SyncStatus;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    check-cast v14, Ljava/util/Map;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    check-cast v15, Ljava/util/Map;

    move/from16 v18, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 p0, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p1, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p2, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p3, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;

    move-object/from16 v19, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v20, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v21, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v22, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v23, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v24, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v25, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v26, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v27, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/User;

    move-object/from16 v28, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v29, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v30, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    move-object/from16 v31, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v32, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v33, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v34, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v43, v20

    move-object/from16 v20, v0

    move-object/from16 v0, v19

    move-object/from16 v19, v43

    move-object/from16 v46, p0

    move-object/from16 v45, p1

    move-object/from16 v44, p2

    move-object/from16 v43, p3

    move/from16 v57, v4

    move/from16 v47, v5

    move/from16 v48, v6

    move/from16 v49, v7

    move/from16 v50, v8

    move-object/from16 v51, v9

    move-object/from16 v52, v11

    move-object/from16 v53, v12

    move-object/from16 v54, v13

    move-object/from16 v55, v14

    move-object/from16 v56, v15

    move/from16 v58, v18

    move-object/from16 v14, v22

    move-object/from16 v13, v23

    move-object/from16 v7, v25

    move-object/from16 v12, v26

    move-object/from16 v11, v27

    move-object/from16 v4, v28

    move-object/from16 v5, v30

    move-object/from16 v6, v31

    move-object/from16 v9, v32

    move-object/from16 v8, v33

    move-object v15, v3

    move-object/from16 v32, v10

    move-object/from16 v10, v24

    move-object v3, v2

    move-object/from16 v2, v29

    goto/16 :goto_7

    :pswitch_7
    iget v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$0:I

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    iget-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v7, Lc93/m;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v8, Lc93/m;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v9, Lc93/m;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v136, v10

    move v10, v0

    move-object v0, v9

    move-object v9, v7

    move-object/from16 v7, v136

    goto :goto_2

    :pswitch_8
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    .line 19
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;->getMessageInnerEntity()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;

    move-result-object v6

    .line 20
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getId()Ljava/lang/String;

    move-result-object v5

    .line 21
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getCid()Ljava/lang/String;

    move-result-object v4

    .line 22
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getUserId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v7, p0

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    move-object/from16 v8, p2

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    move-object/from16 v9, p3

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    const/4 v10, 0x0

    iput v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$0:I

    const/4 v10, 0x1

    iput v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->label:I

    invoke-interface {v0, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_1

    move-object v0, v3

    goto/16 :goto_1a

    :cond_1
    const/4 v10, 0x0

    :goto_2
    check-cast v1, Lio/getstream/chat/android/models/User;

    .line 23
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getText()Ljava/lang/String;

    move-result-object v11

    .line 24
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getHtml()Ljava/lang/String;

    move-result-object v12

    .line 25
    invoke-virtual {v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;->getAttachments()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    .line 26
    new-instance v14, Ljava/util/ArrayList;

    move-object/from16 p0, v0

    const/16 v15, 0xa

    invoke-static {v13, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v14, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 28
    check-cast v13, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;

    .line 29
    invoke-static {v13}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;)Lio/getstream/chat/android/models/Attachment;

    move-result-object v13

    .line 30
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 31
    :cond_2
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getType()Ljava/lang/String;

    move-result-object v0

    .line 32
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getReplyCount()I

    move-result v13

    .line 33
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getDeletedReplyCount()I

    move-result v15

    .line 34
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v18

    .line 35
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v19

    .line 36
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getUpdatedAt()Ljava/util/Date;

    move-result-object v20

    .line 37
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getUpdatedLocallyAt()Ljava/util/Date;

    move-result-object v21

    .line 38
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getDeletedAt()Ljava/util/Date;

    move-result-object v22

    .line 39
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getParentId()Ljava/lang/String;

    move-result-object v23

    .line 40
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getCommand()Ljava/lang/String;

    move-result-object v24

    .line 41
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getExtraData()Ljava/util/Map;

    move-result-object v25

    .line 42
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getReactionCounts()Ljava/util/Map;

    move-result-object v26

    .line 43
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getReactionScores()Ljava/util/Map;

    move-result-object v27

    invoke-static/range {v27 .. v27}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v27

    .line 44
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getReactionGroups()Ljava/util/Map;

    move-result-object v28

    move-object/from16 p1, v0

    .line 45
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface/range {v28 .. v28}, Ljava/util/Map;->size()I

    move-result v29

    move-object/from16 p2, v1

    invoke-static/range {v29 .. v29}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 46
    invoke-interface/range {v28 .. v28}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 47
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v28

    if-eqz v28, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v28

    .line 48
    check-cast v28, Ljava/util/Map$Entry;

    move-object/from16 p3, v1

    .line 49
    invoke-interface/range {v28 .. v28}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    .line 50
    invoke-interface/range {v28 .. v28}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v28

    check-cast v28, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;

    move-object/from16 v29, v2

    invoke-static/range {v28 .. v28}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;)Lio/getstream/chat/android/models/ReactionGroup;

    move-result-object v2

    .line 51
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, p3

    move-object/from16 v2, v29

    goto :goto_4

    :cond_3
    move-object/from16 v29, v2

    .line 52
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v1

    .line 53
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getShadowed()Z

    move-result v2

    .line 54
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getI18n()Ljava/util/Map;

    move-result-object v28

    .line 55
    invoke-virtual {v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;->getLatestReactions()Ljava/util/List;

    move-result-object v30

    move-object/from16 p3, v0

    move-object/from16 v0, v30

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v30, v1

    .line 56
    new-instance v1, Ljava/util/ArrayList;

    move/from16 v31, v2

    move-object/from16 v32, v4

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 v4, p2

    move-object/from16 v51, p3

    move-object/from16 v52, v1

    move/from16 v50, v10

    move/from16 v49, v13

    move-object/from16 v44, v14

    move/from16 v48, v15

    move-object/from16 v10, v18

    move-object/from16 v13, v19

    move-object/from16 v14, v20

    move-object/from16 v19, v22

    move-object/from16 v43, v23

    move-object/from16 v45, v24

    move-object/from16 v46, v25

    move-object/from16 v56, v26

    move-object/from16 v55, v27

    move-object/from16 v53, v28

    move-object/from16 v54, v30

    move/from16 v47, v31

    move-object/from16 v2, v32

    const/16 v57, 0x0

    const/16 v58, 0x0

    move-object/from16 v1, p0

    move-object/from16 p0, v0

    move-object/from16 v18, v3

    move-object v0, v7

    move-object/from16 v3, v29

    move-object/from16 v7, p1

    :goto_5
    move-object/from16 v15, v21

    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_5

    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v21, v15

    .line 58
    move-object/from16 v15, v20

    check-cast v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    .line 59
    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v1, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v8, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v6, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v5, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v4, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v7, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v13, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v14, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    move-object/from16 v20, v0

    move-object/from16 v0, v21

    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    move-object/from16 v0, v19

    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    move-object/from16 v0, v52

    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    move-object/from16 v22, v2

    move-object/from16 v2, v43

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    move-object/from16 v23, v2

    move-object/from16 v2, v44

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    move-object/from16 v24, v2

    move-object/from16 v2, v45

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    move-object/from16 v25, v2

    move-object/from16 v2, v46

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    move-object/from16 v26, v2

    move-object/from16 v2, v56

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    move-object/from16 v27, v2

    move-object/from16 v2, v55

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    move-object/from16 v28, v2

    move-object/from16 v2, v54

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    move-object/from16 v29, v2

    move-object/from16 v2, v53

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    move-object/from16 v30, v2

    const/4 v2, 0x0

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$26:Ljava/lang/Object;

    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$27:Ljava/lang/Object;

    move-object/from16 v31, v0

    move-object/from16 v0, p0

    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$28:Ljava/lang/Object;

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$29:Ljava/lang/Object;

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$30:Ljava/lang/Object;

    move-object/from16 v2, v51

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$31:Ljava/lang/Object;

    move-object/from16 v32, v0

    move/from16 v0, v50

    iput v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$0:I

    move/from16 v33, v0

    move/from16 v0, v49

    iput v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$1:I

    move/from16 v34, v0

    move/from16 v0, v48

    iput v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$2:I

    move/from16 v35, v0

    move/from16 v0, v47

    iput-boolean v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$0:Z

    move/from16 v36, v0

    move/from16 v0, v57

    iput v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$3:I

    move/from16 v37, v0

    move/from16 v0, v58

    iput v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$4:I

    move/from16 v38, v0

    const/4 v0, 0x0

    iput v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$5:I

    const/4 v0, 0x2

    iput v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->label:I

    invoke-static {v15, v1, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v15, v18

    if-ne v0, v15, :cond_4

    :goto_6
    move-object v0, v15

    goto/16 :goto_1a

    :cond_4
    move-object/from16 v51, v2

    move-object/from16 v2, v22

    move-object/from16 v43, v23

    move-object/from16 v44, v24

    move-object/from16 v45, v25

    move-object/from16 v46, v26

    move-object/from16 v56, v27

    move-object/from16 v55, v28

    move-object/from16 v54, v29

    move-object/from16 v53, v30

    move-object/from16 v52, v31

    move/from16 v50, v33

    move/from16 v49, v34

    move/from16 v48, v35

    move/from16 v47, v36

    move/from16 v57, v37

    move/from16 v58, v38

    move-object/from16 v34, v1

    move-object v1, v0

    move-object/from16 v0, v52

    :goto_7
    check-cast v1, Lio/getstream/chat/android/models/Reaction;

    .line 60
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v18, v15

    move-object/from16 v0, v20

    move-object/from16 p0, v32

    move-object/from16 v1, v34

    goto/16 :goto_5

    :cond_5
    move-object/from16 v20, v0

    move-object/from16 v22, v2

    move-object/from16 v21, v15

    move-object/from16 v15, v18

    move-object/from16 v23, v43

    move-object/from16 v24, v44

    move-object/from16 v25, v45

    move-object/from16 v26, v46

    move/from16 v36, v47

    move/from16 v35, v48

    move/from16 v34, v49

    move/from16 v33, v50

    move-object/from16 v2, v51

    move-object/from16 v31, v52

    move-object/from16 v30, v53

    move-object/from16 v29, v54

    move-object/from16 v28, v55

    move-object/from16 v27, v56

    .line 61
    move-object/from16 v52, v31

    check-cast v52, Ljava/util/List;

    .line 62
    invoke-virtual/range {v20 .. v20}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageEntity;->getOwnReactions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v18, v1

    .line 63
    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v20, v2

    move-object/from16 v31, v3

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 64
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 p0, v0

    move-object/from16 v68, v1

    move-object v0, v6

    move-object/from16 v1, v18

    move-object/from16 v6, v19

    move-object/from16 v67, v20

    move-object/from16 v3, v21

    move-object/from16 v2, v22

    move-object/from16 v19, v23

    move-object/from16 v59, v24

    move-object/from16 v60, v25

    move-object/from16 v61, v26

    move-object/from16 v62, v27

    move-object/from16 v72, v28

    move-object/from16 v71, v29

    move-object/from16 v70, v30

    move/from16 v66, v33

    move/from16 v65, v34

    move/from16 v64, v35

    move/from16 v63, v36

    move-object/from16 v69, v52

    const/16 v73, 0x0

    const/16 v74, 0x0

    move-object/from16 v18, v15

    move-object/from16 v15, v31

    :goto_8
    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_7

    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v21, v6

    .line 65
    move-object/from16 v6, v20

    check-cast v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    move-object/from16 p1, v6

    const/4 v6, 0x0

    .line 66
    iput-object v6, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v1, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v8, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v9, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v0, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v5, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v2, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v4, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v11, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v12, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v7, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v10, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v13, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v14, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    iput-object v3, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    move-object/from16 v6, v21

    iput-object v6, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    move-object/from16 v20, v0

    move-object/from16 v0, v68

    iput-object v0, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    move-object/from16 v21, v2

    move-object/from16 v2, v19

    iput-object v2, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    move-object/from16 v2, v59

    iput-object v2, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    move-object/from16 v22, v2

    move-object/from16 v2, v60

    iput-object v2, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    move-object/from16 v23, v2

    move-object/from16 v2, v61

    iput-object v2, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    move-object/from16 v24, v2

    move-object/from16 v2, v62

    iput-object v2, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    move-object/from16 v25, v2

    move-object/from16 v2, v72

    iput-object v2, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    move-object/from16 v26, v2

    move-object/from16 v2, v71

    iput-object v2, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    move-object/from16 v27, v2

    move-object/from16 v2, v70

    iput-object v2, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    move-object/from16 v28, v2

    move-object/from16 v2, v69

    iput-object v2, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    move-object/from16 v29, v2

    const/4 v2, 0x0

    iput-object v2, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$26:Ljava/lang/Object;

    iput-object v2, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$27:Ljava/lang/Object;

    iput-object v0, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$28:Ljava/lang/Object;

    move-object/from16 v30, v0

    move-object/from16 v0, p0

    iput-object v0, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$29:Ljava/lang/Object;

    iput-object v2, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$30:Ljava/lang/Object;

    iput-object v2, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$31:Ljava/lang/Object;

    move-object/from16 v2, v67

    iput-object v2, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$32:Ljava/lang/Object;

    move-object/from16 v31, v0

    move/from16 v0, v66

    iput v0, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$0:I

    move/from16 v32, v0

    move/from16 v0, v65

    iput v0, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$1:I

    move/from16 v33, v0

    move/from16 v0, v64

    iput v0, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$2:I

    move/from16 v34, v0

    move/from16 v0, v63

    iput-boolean v0, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$0:Z

    move/from16 v35, v0

    move/from16 v0, v73

    iput v0, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$3:I

    move/from16 v36, v0

    move/from16 v0, v74

    iput v0, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$4:I

    move/from16 v37, v0

    const/4 v0, 0x0

    iput v0, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$5:I

    const/4 v0, 0x3

    iput v0, v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->label:I

    move-object/from16 v0, p1

    invoke-static {v0, v1, v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v38, v1

    move-object/from16 v1, v18

    if-ne v0, v1, :cond_6

    :goto_9
    move-object v0, v1

    goto/16 :goto_1a

    :cond_6
    move-object/from16 v67, v2

    move-object/from16 v59, v22

    move-object/from16 v60, v23

    move-object/from16 v61, v24

    move-object/from16 v62, v25

    move-object/from16 v72, v26

    move-object/from16 v71, v27

    move-object/from16 v70, v28

    move-object/from16 v69, v29

    move-object/from16 v68, v30

    move/from16 v66, v32

    move/from16 v65, v33

    move/from16 v64, v34

    move/from16 v63, v35

    move/from16 v73, v36

    move/from16 v74, v37

    move-object/from16 v35, v38

    move-object v2, v0

    move-object/from16 v32, v20

    move-object/from16 v30, v21

    move-object/from16 v0, v68

    :goto_a
    check-cast v2, Lio/getstream/chat/android/models/Reaction;

    .line 67
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v18, v1

    move-object/from16 v2, v30

    move-object/from16 p0, v31

    move-object/from16 v0, v32

    move-object/from16 v1, v35

    goto/16 :goto_8

    :cond_7
    move-object/from16 v20, v0

    move-object/from16 v38, v1

    move-object/from16 v21, v2

    move-object/from16 v1, v18

    move-object/from16 v22, v59

    move-object/from16 v23, v60

    move-object/from16 v24, v61

    move-object/from16 v25, v62

    move/from16 v35, v63

    move/from16 v34, v64

    move/from16 v33, v65

    move/from16 v32, v66

    move-object/from16 v2, v67

    move-object/from16 v30, v68

    move-object/from16 v29, v69

    move-object/from16 v28, v70

    move-object/from16 v27, v71

    move-object/from16 v26, v72

    .line 68
    move-object/from16 v68, v30

    check-cast v68, Ljava/util/List;

    .line 69
    invoke-virtual/range {v20 .. v20}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getRemoteMentionedUserIds()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v18, v2

    .line 70
    new-instance v2, Ljava/util/ArrayList;

    move-object/from16 v30, v3

    move-object/from16 v31, v4

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 71
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 p0, v0

    move-object/from16 v84, v2

    move-object/from16 v83, v18

    move-object/from16 v0, v20

    move-object/from16 v3, v21

    move-object/from16 v75, v22

    move-object/from16 v76, v23

    move-object/from16 v77, v24

    move-object/from16 v80, v25

    move-object/from16 v89, v26

    move-object/from16 v88, v27

    move-object/from16 v87, v28

    move-object/from16 v86, v29

    move-object/from16 v4, v31

    move/from16 v82, v32

    move/from16 v81, v33

    move/from16 v79, v34

    move/from16 v78, v35

    move-object/from16 v2, v38

    move-object/from16 v85, v68

    const/16 v90, 0x0

    const/16 v91, 0x0

    move-object/from16 v18, v1

    move-object v1, v15

    move-object v15, v6

    move-object/from16 v6, v30

    :goto_b
    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_9

    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v21, v15

    .line 72
    move-object/from16 v15, v20

    check-cast v15, Ljava/lang/String;

    move-object/from16 p1, v15

    const/4 v15, 0x0

    .line 73
    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v12, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    iput-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    move-object/from16 v15, v21

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    move-object/from16 v20, v8

    move-object/from16 v8, v84

    iput-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    move-object/from16 v15, v19

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    move-object/from16 v15, v75

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    move-object/from16 v22, v15

    move-object/from16 v15, v76

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    move-object/from16 v23, v15

    move-object/from16 v15, v77

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    move-object/from16 v24, v15

    move-object/from16 v15, v80

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    move-object/from16 v25, v15

    move-object/from16 v15, v89

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    move-object/from16 v26, v15

    move-object/from16 v15, v88

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    move-object/from16 v27, v15

    move-object/from16 v15, v87

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    move-object/from16 v28, v15

    move-object/from16 v15, v86

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    move-object/from16 v29, v15

    move-object/from16 v15, v85

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$26:Ljava/lang/Object;

    move-object/from16 v30, v15

    const/4 v15, 0x0

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$27:Ljava/lang/Object;

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$28:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$29:Ljava/lang/Object;

    move-object/from16 v31, v8

    move-object/from16 v8, p0

    iput-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$30:Ljava/lang/Object;

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$31:Ljava/lang/Object;

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$32:Ljava/lang/Object;

    move-object/from16 v15, v83

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$33:Ljava/lang/Object;

    move-object/from16 v32, v8

    move/from16 v8, v82

    iput v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$0:I

    move/from16 v33, v8

    move/from16 v8, v81

    iput v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$1:I

    move/from16 v34, v8

    move/from16 v8, v79

    iput v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$2:I

    move/from16 v35, v8

    move/from16 v8, v78

    iput-boolean v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$0:Z

    move/from16 v36, v8

    move/from16 v8, v90

    iput v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$3:I

    move/from16 v37, v8

    move/from16 v8, v91

    iput v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$4:I

    move/from16 v38, v8

    const/4 v8, 0x0

    iput v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$5:I

    const/4 v8, 0x4

    iput v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->label:I

    move-object/from16 v8, p1

    invoke-interface {v2, v8, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v39, v15

    move-object/from16 v15, v18

    if-ne v8, v15, :cond_8

    goto/16 :goto_6

    :cond_8
    move-object/from16 v75, v22

    move-object/from16 v76, v23

    move-object/from16 v77, v24

    move-object/from16 v80, v25

    move-object/from16 v89, v26

    move-object/from16 v88, v27

    move-object/from16 v87, v28

    move-object/from16 v86, v29

    move-object/from16 v85, v30

    move-object/from16 v84, v31

    move/from16 v82, v33

    move/from16 v81, v34

    move/from16 v79, v35

    move/from16 v78, v36

    move/from16 v90, v37

    move/from16 v91, v38

    move-object/from16 v83, v39

    move-object/from16 v33, v0

    move-object/from16 v36, v2

    move-object/from16 v0, v84

    move-object v2, v1

    move-object v1, v8

    move-object/from16 v8, v20

    :goto_c
    check-cast v1, Lio/getstream/chat/android/models/User;

    .line 74
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v1, v2

    move-object/from16 v18, v15

    move-object/from16 v15, v21

    move-object/from16 p0, v32

    move-object/from16 v0, v33

    move-object/from16 v2, v36

    goto/16 :goto_b

    :cond_9
    move-object/from16 v20, v8

    move-object/from16 v21, v15

    move-object/from16 v15, v18

    move-object/from16 v22, v75

    move-object/from16 v23, v76

    move-object/from16 v24, v77

    move/from16 v36, v78

    move/from16 v35, v79

    move-object/from16 v25, v80

    move/from16 v34, v81

    move/from16 v33, v82

    move-object/from16 v39, v83

    move-object/from16 v31, v84

    move-object/from16 v30, v85

    move-object/from16 v29, v86

    move-object/from16 v28, v87

    move-object/from16 v27, v88

    move-object/from16 v26, v89

    .line 75
    move-object/from16 v8, v31

    check-cast v8, Ljava/util/List;

    .line 76
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getMentionedUsersId()Ljava/util/List;

    move-result-object v15

    move-object/from16 p0, v15

    .line 77
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getReplyToId()Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_b

    move-object/from16 p1, v15

    const/4 v15, 0x0

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v12, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    iput-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    move-object/from16 v15, v21

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    move-object/from16 v21, v0

    move-object/from16 v0, v19

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    move-object/from16 v0, v22

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    move-object/from16 v0, v23

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    move-object/from16 v0, v24

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    move-object/from16 v0, v25

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    move-object/from16 v0, v26

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    move-object/from16 v0, v27

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    move-object/from16 v0, v28

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    move-object/from16 v0, v29

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    move-object/from16 v0, v30

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$26:Ljava/lang/Object;

    move-object/from16 v0, p0

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$27:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$28:Ljava/lang/Object;

    move-object/from16 v31, v2

    move-object/from16 v2, v39

    iput-object v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$29:Ljava/lang/Object;

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$30:Ljava/lang/Object;

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$31:Ljava/lang/Object;

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$32:Ljava/lang/Object;

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$33:Ljava/lang/Object;

    move/from16 v0, v33

    iput v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$0:I

    move/from16 v0, v34

    iput v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$1:I

    move/from16 v0, v35

    iput v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$2:I

    move/from16 v0, v36

    iput-boolean v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$0:Z

    const/4 v0, 0x0

    iput v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$3:I

    const/4 v0, 0x5

    iput v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->label:I

    move-object/from16 v0, v20

    move-object/from16 v2, p1

    invoke-interface {v0, v2, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v2, v18

    if-ne v0, v2, :cond_a

    move-object v0, v2

    goto/16 :goto_1a

    :cond_a
    move-object/from16 v18, v29

    move-object/from16 v29, v5

    move-object/from16 v5, v25

    move-object/from16 v25, v18

    move-object/from16 v18, v30

    move-object/from16 v30, v21

    move-object/from16 v21, v18

    move-object/from16 v20, v6

    move-object/from16 v32, v27

    move/from16 v6, v34

    move/from16 v18, v36

    move-object/from16 v27, v4

    move-object/from16 v34, v26

    move-object/from16 v26, v28

    move-object v4, v1

    move-object/from16 v28, v3

    move-object/from16 v1, v23

    move-object v3, v0

    move-object/from16 v23, v10

    move-object/from16 v0, v31

    move-object v10, v8

    move-object/from16 v31, v9

    move-object/from16 v8, v39

    move-object/from16 v9, p0

    :goto_d
    check-cast v3, Lio/getstream/chat/android/models/Message;

    move-object/from16 v76, v1

    move-object v1, v4

    move-object/from16 v80, v5

    move/from16 v81, v6

    move-object/from16 v83, v8

    move-object v8, v10

    move/from16 v78, v18

    move-object/from16 v6, v20

    move-object/from16 v85, v21

    move-object/from16 v10, v23

    move-object/from16 v86, v25

    move-object/from16 v87, v26

    move-object/from16 v4, v27

    move-object/from16 v5, v29

    move-object/from16 v88, v32

    move-object/from16 v89, v34

    move-object/from16 v18, v9

    move-object/from16 v9, v31

    move-object/from16 v31, v0

    move-object/from16 v0, v30

    :goto_e
    move-object/from16 v75, v22

    move-object/from16 v77, v24

    move/from16 v82, v33

    move/from16 v79, v35

    goto :goto_f

    :cond_b
    move-object/from16 v31, v2

    move-object/from16 v2, v18

    move-object/from16 v15, v21

    move-object/from16 v21, v0

    move-object/from16 v18, p0

    move-object/from16 v76, v23

    move-object/from16 v80, v25

    move-object/from16 v89, v26

    move-object/from16 v88, v27

    move-object/from16 v87, v28

    move-object/from16 v86, v29

    move-object/from16 v85, v30

    move/from16 v81, v34

    move/from16 v78, v36

    move-object/from16 v83, v39

    move-object/from16 v28, v3

    const/4 v3, 0x0

    goto :goto_e

    .line 78
    :goto_f
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getReplyToId()Ljava/lang/String;

    move-result-object v20

    .line 79
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getThreadParticipantsIds()Ljava/util/List;

    move-result-object v21

    move-object/from16 p0, v0

    move-object/from16 v0, v21

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 p1, v1

    .line 80
    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 p2, v3

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 81
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v3, v0

    move-object/from16 v0, p0

    move-object/from16 p0, v3

    move-object/from16 v102, p2

    move-object/from16 v100, v8

    move-object/from16 v101, v18

    move-object/from16 v103, v20

    move-object/from16 v3, v28

    move-object/from16 v17, v75

    move-object/from16 v92, v76

    move-object/from16 v93, v77

    move/from16 v104, v78

    move/from16 v105, v79

    move-object/from16 v94, v80

    move/from16 v106, v81

    move/from16 v107, v82

    move-object/from16 v108, v83

    move-object/from16 v99, v85

    move-object/from16 v98, v86

    move-object/from16 v97, v87

    move-object/from16 v96, v88

    move-object/from16 v95, v89

    const/16 v109, 0x0

    const/16 v110, 0x0

    move-object v8, v1

    move-object/from16 v18, v2

    move-object/from16 v1, v31

    move-object/from16 v2, p1

    :goto_10
    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_d

    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v21, v8

    .line 82
    move-object/from16 v8, v20

    check-cast v8, Ljava/lang/String;

    move-object/from16 p1, v8

    const/4 v8, 0x0

    .line 83
    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    iput-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    move-object/from16 v8, v21

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    move-object/from16 v20, v15

    move-object/from16 v15, v19

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    move-object/from16 v15, v17

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    move-object/from16 v15, v92

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    move-object/from16 v21, v15

    move-object/from16 v15, v93

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    move-object/from16 v22, v15

    move-object/from16 v15, v94

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    move-object/from16 v23, v15

    move-object/from16 v15, v95

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    move-object/from16 v24, v15

    move-object/from16 v15, v96

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    move-object/from16 v25, v15

    move-object/from16 v15, v97

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    move-object/from16 v26, v15

    move-object/from16 v15, v98

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    move-object/from16 v27, v15

    move-object/from16 v15, v99

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$26:Ljava/lang/Object;

    move-object/from16 v28, v15

    move-object/from16 v15, v100

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$27:Ljava/lang/Object;

    move-object/from16 v29, v15

    move-object/from16 v15, v101

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$28:Ljava/lang/Object;

    move-object/from16 v30, v15

    move-object/from16 v15, v102

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$29:Ljava/lang/Object;

    move-object/from16 v31, v15

    move-object/from16 v15, v103

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$30:Ljava/lang/Object;

    move-object/from16 v32, v15

    const/4 v15, 0x0

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$31:Ljava/lang/Object;

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$32:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$33:Ljava/lang/Object;

    move-object/from16 v15, v108

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$34:Ljava/lang/Object;

    move-object/from16 v33, v8

    move-object/from16 v8, p0

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$35:Ljava/lang/Object;

    move-object/from16 v34, v8

    const/4 v8, 0x0

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$36:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$37:Ljava/lang/Object;

    move/from16 v8, v107

    iput v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$0:I

    move/from16 v35, v8

    move/from16 v8, v106

    iput v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$1:I

    move/from16 v36, v8

    move/from16 v8, v105

    iput v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$2:I

    move/from16 v37, v8

    move/from16 v8, v104

    iput-boolean v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$0:Z

    move/from16 v38, v8

    move/from16 v8, v109

    iput v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$3:I

    move/from16 v39, v8

    move/from16 v8, v110

    iput v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$4:I

    move/from16 v40, v8

    const/4 v8, 0x0

    iput v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$5:I

    const/4 v8, 0x6

    iput v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->label:I

    move-object/from16 v8, p1

    invoke-interface {v1, v8, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v41, v1

    move-object/from16 v1, v18

    if-ne v8, v1, :cond_c

    goto/16 :goto_9

    :cond_c
    move-object/from16 v108, v15

    move-object/from16 v15, v20

    move-object/from16 v93, v22

    move-object/from16 v94, v23

    move-object/from16 v95, v24

    move-object/from16 v96, v25

    move-object/from16 v97, v26

    move-object/from16 v98, v27

    move-object/from16 v99, v28

    move-object/from16 v100, v29

    move-object/from16 v101, v30

    move-object/from16 v102, v31

    move-object/from16 v103, v32

    move/from16 v107, v35

    move/from16 v106, v36

    move/from16 v105, v37

    move/from16 v104, v38

    move/from16 v109, v39

    move/from16 v110, v40

    move-object/from16 v38, v41

    move-object/from16 v36, v0

    move-object/from16 v32, v11

    move-object/from16 v0, v33

    move-object v11, v0

    goto/16 :goto_1

    :goto_11
    check-cast v8, Lio/getstream/chat/android/models/User;

    .line 84
    invoke-interface {v0, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v18, v1

    move-object v8, v11

    move-object/from16 v11, v32

    move-object/from16 p0, v34

    move-object/from16 v0, v36

    move-object/from16 v1, v38

    goto/16 :goto_10

    :cond_d
    move-object/from16 v41, v1

    move-object/from16 v33, v8

    move-object/from16 v20, v15

    move-object/from16 v1, v18

    move-object/from16 v21, v92

    move-object/from16 v22, v93

    move-object/from16 v23, v94

    move-object/from16 v24, v95

    move-object/from16 v25, v96

    move-object/from16 v26, v97

    move-object/from16 v27, v98

    move-object/from16 v28, v99

    move-object/from16 v29, v100

    move-object/from16 v30, v101

    move-object/from16 v31, v102

    move-object/from16 v32, v103

    move/from16 v38, v104

    move/from16 v37, v105

    move/from16 v36, v106

    move/from16 v35, v107

    move-object/from16 v15, v108

    .line 85
    move-object/from16 v8, v33

    check-cast v8, Ljava/util/List;

    .line 86
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getShowInChannel()Z

    move-result v1

    move/from16 p0, v1

    .line 87
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getSilent()Z

    move-result v1

    .line 88
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getChannelInfo()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    move-result-object v33

    if-eqz v33, :cond_e

    invoke-static/range {v33 .. v33}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;)Lio/getstream/chat/android/models/ChannelInfo;

    move-result-object v33

    move/from16 p1, v1

    move-object/from16 v1, v33

    :goto_12
    move-object/from16 v33, v15

    goto :goto_13

    :cond_e
    move/from16 p1, v1

    const/4 v1, 0x0

    goto :goto_12

    .line 89
    :goto_13
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getPinned()Z

    move-result v15

    move/from16 p2, v15

    .line 90
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getPinnedAt()Ljava/util/Date;

    move-result-object v15

    move-object/from16 p3, v15

    .line 91
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getPinExpires()Ljava/util/Date;

    move-result-object v15

    move-object/from16 v34, v15

    .line 92
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getPinnedByUserId()Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_10

    move-object/from16 v39, v15

    const/4 v15, 0x0

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    iput-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    move-object/from16 v15, v20

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    move-object/from16 v20, v0

    move-object/from16 v0, v19

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    move-object/from16 v0, v17

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    move-object/from16 v0, v21

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    move-object/from16 v0, v22

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    move-object/from16 v0, v23

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    move-object/from16 v0, v24

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    move-object/from16 v0, v25

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    move-object/from16 v0, v26

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    move-object/from16 v0, v27

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    move-object/from16 v0, v28

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    move-object/from16 v0, v29

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$26:Ljava/lang/Object;

    move-object/from16 v0, v30

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$27:Ljava/lang/Object;

    move-object/from16 v0, v31

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$28:Ljava/lang/Object;

    move-object/from16 v0, v32

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$29:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$30:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$31:Ljava/lang/Object;

    move-object/from16 v0, v33

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$32:Ljava/lang/Object;

    move-object/from16 v0, p3

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$33:Ljava/lang/Object;

    move-object/from16 v0, v34

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$34:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$35:Ljava/lang/Object;

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$36:Ljava/lang/Object;

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$37:Ljava/lang/Object;

    move/from16 v0, v35

    iput v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$0:I

    move/from16 v0, v36

    iput v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$1:I

    move/from16 v0, v37

    iput v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$2:I

    move/from16 v0, v38

    iput-boolean v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$0:Z

    move/from16 v0, p0

    iput-boolean v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$1:Z

    move/from16 v0, p1

    iput-boolean v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$2:Z

    move/from16 v0, p2

    iput-boolean v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$3:Z

    const/4 v0, 0x0

    iput v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$3:I

    const/4 v0, 0x7

    iput v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->label:I

    move-object/from16 v0, v39

    move-object/from16 v39, v1

    move-object v1, v0

    move-object/from16 v0, v41

    invoke-interface {v0, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v0, v18

    if-ne v1, v0, :cond_f

    goto/16 :goto_1a

    :cond_f
    move-object/from16 v18, v6

    move-object v6, v1

    move-object/from16 v1, v28

    move-object/from16 v28, v18

    move-object/from16 v42, v8

    move-object/from16 v18, v27

    move-object/from16 v40, v33

    move-object/from16 v41, v39

    move/from16 v8, p1

    move-object/from16 v33, p3

    move-object/from16 v39, v9

    move-object/from16 v27, v15

    move/from16 v15, v35

    move/from16 v9, p0

    move-object/from16 v35, v4

    move-object/from16 v4, v31

    move-object/from16 v31, v10

    move-object/from16 v10, v32

    move-object/from16 v32, v7

    move-object v7, v2

    move-object/from16 v2, v29

    move-object/from16 v29, v14

    move/from16 v14, v37

    move-object/from16 v37, v5

    move/from16 v5, p2

    :goto_14
    check-cast v6, Lio/getstream/chat/android/models/User;

    move-object/from16 v115, v1

    move-object/from16 v116, v2

    move-object/from16 v120, v4

    move/from16 v125, v5

    move-object/from16 v133, v6

    move/from16 v126, v8

    move/from16 v127, v9

    move-object/from16 v121, v10

    move/from16 v130, v14

    move/from16 v134, v15

    move-object/from16 v114, v18

    move-object/from16 v15, v27

    move-object/from16 v6, v28

    move-object/from16 v14, v29

    move-object/from16 v10, v31

    move-object/from16 v124, v33

    move-object/from16 v4, v35

    move-object/from16 v5, v37

    move-object/from16 v131, v39

    move-object/from16 v118, v40

    move-object/from16 v123, v41

    move-object/from16 v122, v42

    move-object/from16 v18, v0

    move-object v0, v7

    move-object/from16 v7, v32

    :goto_15
    move-object/from16 v8, v17

    move-object/from16 v2, v19

    move-object/from16 v1, v20

    move-object/from16 v19, v21

    move-object/from16 v17, v22

    move-object/from16 v111, v23

    move-object/from16 v112, v24

    move-object/from16 v113, v25

    move-object/from16 v119, v26

    move-object/from16 v117, v30

    move-object/from16 v128, v34

    move/from16 v132, v36

    move/from16 v129, v38

    goto :goto_16

    :cond_10
    move-object/from16 v39, v1

    move-object/from16 v15, v20

    move-object/from16 v20, v0

    move/from16 v127, p0

    move/from16 v126, p1

    move/from16 v125, p2

    move-object/from16 v124, p3

    move-object v0, v2

    move-object/from16 v122, v8

    move-object/from16 v131, v9

    move-object/from16 v114, v27

    move-object/from16 v115, v28

    move-object/from16 v116, v29

    move-object/from16 v120, v31

    move-object/from16 v121, v32

    move-object/from16 v118, v33

    move/from16 v134, v35

    move/from16 v130, v37

    move-object/from16 v123, v39

    const/16 v133, 0x0

    goto :goto_15

    .line 93
    :goto_16
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getSkipEnrichUrl()Z

    move-result v9

    move/from16 p0, v9

    .line 94
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getSkipPushNotification()Z

    move-result v9

    .line 95
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getModerationDetails()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v20

    if-eqz v20, :cond_11

    invoke-static/range {v20 .. v20}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;)Lio/getstream/chat/android/models/MessageModerationDetails;

    move-result-object v20

    move/from16 p1, v9

    move-object/from16 v9, v20

    goto :goto_17

    :cond_11
    move/from16 p1, v9

    const/4 v9, 0x0

    .line 96
    :goto_17
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getModeration()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    move-result-object v20

    if-eqz v20, :cond_12

    invoke-static/range {v20 .. v20}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationMapperKt;->toDomain(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;)Lio/getstream/chat/android/models/Moderation;

    move-result-object v20

    move-object/from16 v135, v20

    :goto_18
    move-object/from16 v20, v9

    goto :goto_19

    :cond_12
    const/16 v135, 0x0

    goto :goto_18

    .line 97
    :goto_19
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getMessageTextUpdatedAt()Ljava/util/Date;

    move-result-object v9

    move-object/from16 p2, v9

    .line 98
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getRestrictedVisibility()Ljava/util/List;

    move-result-object v9

    move-object/from16 p3, v9

    .line 99
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getPollId()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_14

    move-object/from16 v21, v9

    const/4 v9, 0x0

    iput-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v11, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v12, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v13, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v14, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    iput-object v15, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    move-object/from16 v9, v19

    iput-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    move-object/from16 v19, v1

    move-object/from16 v1, v17

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    move-object/from16 v1, v111

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    move-object/from16 v22, v1

    move-object/from16 v1, v112

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    move-object/from16 v23, v1

    move-object/from16 v1, v113

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    move-object/from16 v24, v1

    move-object/from16 v1, v119

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    move-object/from16 v25, v1

    move-object/from16 v1, v114

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    move-object/from16 v26, v1

    move-object/from16 v1, v115

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    move-object/from16 v27, v1

    move-object/from16 v1, v116

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$26:Ljava/lang/Object;

    move-object/from16 v28, v1

    move-object/from16 v1, v117

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$27:Ljava/lang/Object;

    move-object/from16 v29, v1

    move-object/from16 v1, v120

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$28:Ljava/lang/Object;

    move-object/from16 v30, v1

    move-object/from16 v1, v121

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$29:Ljava/lang/Object;

    move-object/from16 v31, v1

    move-object/from16 v1, v122

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$30:Ljava/lang/Object;

    move-object/from16 v32, v1

    move-object/from16 v1, v123

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$31:Ljava/lang/Object;

    move-object/from16 v33, v1

    move-object/from16 v1, v118

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$32:Ljava/lang/Object;

    move-object/from16 v34, v1

    move-object/from16 v1, v124

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$33:Ljava/lang/Object;

    move-object/from16 v35, v1

    move-object/from16 v1, v128

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$34:Ljava/lang/Object;

    move-object/from16 v36, v1

    move-object/from16 v1, v133

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$35:Ljava/lang/Object;

    move-object/from16 v37, v1

    move-object/from16 v1, v20

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$36:Ljava/lang/Object;

    move-object/from16 v1, v135

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$37:Ljava/lang/Object;

    move-object/from16 v38, v1

    move-object/from16 v1, p2

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$38:Ljava/lang/Object;

    move-object/from16 v1, p3

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$39:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->L$40:Ljava/lang/Object;

    move/from16 v1, v134

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$0:I

    move/from16 v1, v132

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$1:I

    move/from16 v39, v1

    move/from16 v1, v130

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$2:I

    move/from16 v40, v1

    move/from16 v1, v129

    iput-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$0:Z

    move/from16 v41, v1

    move/from16 v1, v127

    iput-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$1:Z

    move/from16 v42, v1

    move/from16 v1, v126

    iput-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$2:Z

    move/from16 v43, v1

    move/from16 v1, v125

    iput-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$3:Z

    move/from16 v44, v1

    move/from16 v1, p0

    iput-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$4:Z

    move/from16 v1, p1

    iput-boolean v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->Z$5:Z

    const/4 v1, 0x0

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->I$3:I

    const/16 v1, 0x8

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$1;->label:I

    move-object/from16 v16, v2

    move-object/from16 v2, v21

    move-object/from16 v1, v131

    invoke-interface {v1, v2, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v0, v18

    if-ne v1, v0, :cond_13

    :goto_1a
    return-object v0

    :cond_13
    move/from16 v2, p1

    move-object/from16 v0, v19

    move-object/from16 v21, v27

    move-object/from16 v19, v29

    move-object/from16 v18, v30

    move-object/from16 v29, v8

    move-object/from16 v30, v16

    move-object/from16 v27, v17

    move-object/from16 v17, v31

    move-object/from16 v16, v32

    move-object/from16 v8, v36

    move-object/from16 v32, v6

    move-object/from16 v36, v7

    move-object/from16 v31, v15

    move/from16 v7, p0

    move-object/from16 v15, p3

    move-object v6, v1

    move-object/from16 v1, v35

    move-object/from16 v35, v10

    move/from16 v10, v39

    move-object/from16 v39, v20

    move-object/from16 v20, v28

    move-object/from16 v28, v9

    move/from16 v9, v40

    move-object/from16 v40, v37

    move-object/from16 v37, p2

    :goto_1b
    check-cast v6, Lio/getstream/chat/android/models/Poll;

    move-object/from16 v79, v1

    move/from16 v83, v2

    move-object/from16 v88, v6

    move/from16 v84, v7

    move-object/from16 v80, v8

    move/from16 v56, v9

    move/from16 v55, v10

    move-object/from16 v89, v15

    move-object/from16 v82, v16

    move-object/from16 v77, v17

    move-object/from16 v76, v18

    move-object/from16 v53, v19

    move-object/from16 v54, v20

    move-object/from16 v63, v21

    move-object/from16 v70, v27

    move-object/from16 v51, v28

    move-object/from16 v52, v29

    move-object/from16 v50, v30

    move-object/from16 v66, v31

    move-object/from16 v67, v32

    move-object/from16 v64, v35

    move-object/from16 v61, v36

    move-object/from16 v87, v37

    move-object/from16 v85, v39

    move-object/from16 v81, v40

    move-object v1, v0

    :goto_1c
    move-object/from16 v47, v3

    move-object/from16 v69, v4

    move-object/from16 v46, v5

    move-object/from16 v48, v11

    move-object/from16 v49, v12

    move-object/from16 v68, v13

    move-object/from16 v65, v14

    move-object/from16 v57, v22

    move-object/from16 v58, v23

    move-object/from16 v60, v24

    move-object/from16 v73, v25

    move-object/from16 v62, v26

    move-object/from16 v75, v33

    move-object/from16 v59, v34

    move-object/from16 v86, v38

    move/from16 v72, v41

    move/from16 v74, v42

    move/from16 v71, v43

    move/from16 v78, v44

    goto/16 :goto_1d

    :cond_14
    move-object/from16 v16, v2

    move-object/from16 v9, v19

    move-object/from16 v22, v111

    move-object/from16 v23, v112

    move-object/from16 v24, v113

    move-object/from16 v26, v114

    move-object/from16 v27, v115

    move-object/from16 v28, v116

    move-object/from16 v29, v117

    move-object/from16 v34, v118

    move-object/from16 v25, v119

    move-object/from16 v30, v120

    move-object/from16 v31, v121

    move-object/from16 v32, v122

    move-object/from16 v33, v123

    move-object/from16 v35, v124

    move/from16 v44, v125

    move/from16 v43, v126

    move/from16 v42, v127

    move-object/from16 v36, v128

    move/from16 v41, v129

    move/from16 v40, v130

    move/from16 v39, v132

    move-object/from16 v37, v133

    move-object/from16 v38, v135

    move-object/from16 v19, v1

    move/from16 v84, p0

    move/from16 v83, p1

    move-object/from16 v87, p2

    move-object/from16 v89, p3

    move-object/from16 v67, v6

    move-object/from16 v61, v7

    move-object/from16 v52, v8

    move-object/from16 v51, v9

    move-object/from16 v64, v10

    move-object/from16 v66, v15

    move-object/from16 v50, v16

    move-object/from16 v70, v17

    move-object/from16 v85, v20

    move-object/from16 v63, v27

    move-object/from16 v54, v28

    move-object/from16 v53, v29

    move-object/from16 v76, v30

    move-object/from16 v77, v31

    move-object/from16 v82, v32

    move-object/from16 v79, v35

    move-object/from16 v80, v36

    move-object/from16 v81, v37

    move/from16 v55, v39

    move/from16 v56, v40

    const/16 v88, 0x0

    goto/16 :goto_1c

    .line 100
    :goto_1d
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getReminder()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;)Lio/getstream/chat/android/models/MessageReminderInfo;

    move-result-object v2

    move-object/from16 v90, v2

    goto :goto_1e

    :cond_15
    const/16 v90, 0x0

    .line 101
    :goto_1e
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getSharedLocation()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-result-object v0

    if-eqz v0, :cond_16

    invoke-static {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;)Lio/getstream/chat/android/models/Location;

    move-result-object v7

    move-object/from16 v91, v7

    goto :goto_1f

    :cond_16
    const/16 v91, 0x0

    .line 102
    :goto_1f
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getChannelRole()Ljava/lang/String;

    move-result-object v92

    .line 103
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageInnerEntity;->getDeletedForMe()Z

    move-result v93

    .line 104
    new-instance v45, Lio/getstream/chat/android/models/Message;

    invoke-direct/range {v45 .. v93}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;Z)V

    return-object v45

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 80
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;",
            "Lc93/m;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Message;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;

    iget v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;

    .line 105
    invoke-direct {v2, v1}, Ls83/c;-><init>(Lq83/d;)V

    .line 106
    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    .line 107
    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->label:I

    const/4 v5, 0x5

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v4, :cond_6

    if-eq v4, v9, :cond_5

    if-eq v4, v8, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-boolean v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$3:Z

    iget-boolean v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$2:Z

    iget-boolean v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$1:Z

    iget-boolean v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$0:Z

    iget v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$2:I

    iget v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$1:I

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$31:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$30:Ljava/lang/Object;

    check-cast v8, Ljava/util/Date;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$29:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$28:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/models/MessageModerationDetails;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$27:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/models/User;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$26:Ljava/lang/Object;

    check-cast v13, Ljava/util/Date;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$25:Ljava/lang/Object;

    check-cast v14, Ljava/util/Date;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$24:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$23:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    move/from16 p0, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$22:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p1, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$21:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p2, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$20:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 v16, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$19:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/SyncStatus;

    move-object/from16 v17, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$18:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v18, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$17:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v19, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$16:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v20, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$15:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v21, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$14:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v22, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$13:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v23, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$12:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v24, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$11:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v25, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$10:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v26, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$9:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v27, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$8:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v28, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$7:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/User;

    move-object/from16 v29, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v30, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v31, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$4:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;

    move-object/from16 v32, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$3:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, v8

    move v8, v6

    move-object/from16 v6, v24

    move-object/from16 v24, v12

    move-object/from16 v12, v22

    move-object/from16 v22, v11

    move-object v11, v9

    move v9, v7

    move-object/from16 v7, v26

    move-object/from16 v26, v13

    move-object/from16 v13, v18

    move-object/from16 v18, v10

    move-object v10, v0

    move/from16 v35, p0

    move-object v2, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v20

    move-object/from16 v0, v32

    move-object/from16 v20, p2

    move-object/from16 v32, v15

    move-object/from16 v15, v25

    move-object/from16 v25, v14

    move-object/from16 v14, v21

    move-object/from16 v21, p1

    goto/16 :goto_e

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-boolean v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$3:Z

    iget-boolean v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$2:Z

    iget-boolean v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$1:Z

    iget-boolean v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$0:Z

    iget v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$2:I

    iget v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$1:I

    iget v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$0:I

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$28:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$27:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$26:Ljava/lang/Object;

    check-cast v13, Ljava/util/Date;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$25:Ljava/lang/Object;

    check-cast v14, Ljava/util/Date;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$24:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$23:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$22:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    move/from16 v18, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$21:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p0, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$20:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 p1, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$19:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/SyncStatus;

    move-object/from16 p2, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$18:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v19, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$17:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v20, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$16:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v21, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$15:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v22, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$14:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v23, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$13:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v24, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$12:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v25, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$11:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v26, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$10:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v27, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$9:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v28, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$8:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v29, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$7:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/User;

    move-object/from16 v30, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v31, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v32, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$4:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;

    move-object/from16 v33, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$3:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v34, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, v3

    move-object v3, v2

    move-object v2, v0

    move-object v0, v13

    move-object v13, v12

    move-object/from16 v12, v23

    move-object/from16 v23, v14

    move-object/from16 v14, v22

    move-object/from16 v22, v0

    move/from16 v35, v7

    move-object/from16 v36, v15

    move-object/from16 v15, v26

    move-object/from16 v7, v27

    move-object/from16 v0, v33

    move-object/from16 v27, p0

    move-object/from16 v26, p1

    move/from16 v33, v9

    move v9, v8

    move v8, v6

    move-object/from16 v6, v25

    move-object/from16 v25, p2

    goto/16 :goto_8

    :cond_3
    iget v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$4:I

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$3:I

    iget-boolean v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$0:Z

    iget v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$2:I

    iget v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$1:I

    iget v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$0:I

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$31:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$30:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$28:Ljava/lang/Object;

    check-cast v12, Ljava/util/Iterator;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$27:Ljava/lang/Object;

    check-cast v13, Ljava/util/Collection;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$26:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Iterable;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$25:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Iterable;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$24:Ljava/lang/Object;

    check-cast v14, Ljava/util/List;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$23:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$22:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$21:Ljava/lang/Object;

    check-cast v7, Ljava/util/Map;

    move/from16 v20, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$20:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/SyncStatus;

    move-object/from16 p0, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$19:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p1, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$18:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p2, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$17:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v21, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$16:Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;

    move-object/from16 v22, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$15:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v23, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$14:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v24, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$13:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v25, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$12:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v26, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$11:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v27, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$10:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v28, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$9:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v29, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$8:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v30, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$7:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/User;

    move-object/from16 v31, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v32, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v33, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$4:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;

    move-object/from16 v34, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$3:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v35, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v36, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, v3

    move-object v3, v2

    move-object v2, v0

    move-object/from16 v49, p0

    move-object/from16 v48, p1

    move/from16 v59, v4

    move/from16 v53, v5

    move-object/from16 v51, v6

    move-object/from16 v50, v7

    move/from16 v54, v8

    move/from16 v55, v9

    move/from16 v56, v10

    move-object/from16 v58, v11

    move-object/from16 v52, v14

    move-object/from16 v57, v15

    move/from16 v60, v20

    move-object/from16 v0, v22

    move-object/from16 v9, v25

    move-object/from16 v6, v26

    move-object/from16 v15, v27

    move-object/from16 v7, v28

    move-object/from16 v11, v29

    move-object/from16 v10, v30

    move-object/from16 v4, v31

    move-object/from16 v5, v33

    move-object/from16 v8, v35

    move-object/from16 v20, p2

    move-object v14, v13

    :goto_1
    move-object/from16 v13, v23

    goto/16 :goto_7

    :cond_4
    iget v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$4:I

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$3:I

    iget-boolean v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$0:Z

    iget v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$2:I

    iget v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$1:I

    iget v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$0:I

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$29:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$27:Ljava/lang/Object;

    check-cast v11, Ljava/util/Iterator;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$26:Ljava/lang/Object;

    check-cast v12, Ljava/util/Collection;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$25:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$24:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$23:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$22:Ljava/lang/Object;

    check-cast v14, Ljava/util/List;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$21:Ljava/lang/Object;

    check-cast v15, Ljava/util/Map;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$20:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/models/SyncStatus;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$19:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    move/from16 v22, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$18:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p0, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$17:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p1, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$16:Ljava/lang/Object;

    check-cast v0, Ljava/util/Collection;

    move-object/from16 p2, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$15:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v23, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$14:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v24, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$13:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v25, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$12:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v26, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$11:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v27, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$10:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v28, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$9:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v29, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$8:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v30, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$7:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/User;

    move-object/from16 v31, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v32, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v33, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$4:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;

    move-object/from16 v34, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$3:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v35, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v36, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, v3

    move-object v3, v1

    move-object v1, v0

    move-object/from16 v0, p2

    move/from16 v46, v4

    move/from16 v37, v5

    move/from16 v38, v6

    move/from16 v39, v7

    move-object/from16 v40, v8

    move/from16 v41, v9

    move-object/from16 v42, v10

    move-object/from16 v43, v13

    move-object/from16 v44, v14

    move-object/from16 v45, v15

    move/from16 v47, v22

    move-object/from16 v13, v23

    move-object/from16 v9, v25

    move-object/from16 v6, v26

    move-object/from16 v15, v27

    move-object/from16 v7, v28

    move-object/from16 v10, v30

    move-object/from16 v5, v31

    move-object/from16 v31, v32

    move-object/from16 v8, v35

    move-object/from16 v23, p0

    move-object v4, v2

    move-object v2, v11

    move-object v14, v12

    move-object/from16 v12, v24

    move-object/from16 v11, v29

    move-object/from16 v24, p1

    goto/16 :goto_5

    :cond_5
    iget v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$0:I

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$6:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$5:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$4:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;

    iget-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$3:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$2:Ljava/lang/Object;

    check-cast v8, Lc93/m;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$1:Ljava/lang/Object;

    check-cast v9, Lc93/m;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$0:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v79, v9

    move v9, v0

    move-object/from16 v0, v79

    goto :goto_2

    :cond_6
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    .line 108
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;->getReplyMessageInnerEntity()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;

    move-result-object v6

    .line 109
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getId()Ljava/lang/String;

    move-result-object v5

    .line 110
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getCid()Ljava/lang/String;

    move-result-object v4

    .line 111
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getUserId()Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$0:Ljava/lang/Object;

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$1:Ljava/lang/Object;

    move-object/from16 v7, p2

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$2:Ljava/lang/Object;

    move-object/from16 v8, p0

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$3:Ljava/lang/Object;

    iput-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$4:Ljava/lang/Object;

    iput-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$5:Ljava/lang/Object;

    iput-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$6:Ljava/lang/Object;

    const/4 v10, 0x0

    iput v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$0:I

    iput v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->label:I

    invoke-interface {v0, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    move-object v2, v3

    goto/16 :goto_d

    :cond_7
    move-object v9, v8

    move-object v8, v7

    move-object v7, v9

    const/4 v9, 0x0

    :goto_2
    check-cast v1, Lio/getstream/chat/android/models/User;

    .line 112
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getText()Ljava/lang/String;

    move-result-object v10

    .line 113
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getHtml()Ljava/lang/String;

    move-result-object v11

    .line 114
    invoke-virtual {v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;->getAttachments()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    .line 115
    new-instance v12, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v7, v13}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v12, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 116
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 117
    check-cast v13, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;

    .line 118
    invoke-static {v13}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;)Lio/getstream/chat/android/models/Attachment;

    move-result-object v13

    .line 119
    invoke-interface {v12, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 120
    :cond_8
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getType()Ljava/lang/String;

    move-result-object v7

    .line 121
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getReplyCount()I

    move-result v13

    .line 122
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getDeletedReplyCount()I

    move-result v14

    .line 123
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v15

    .line 124
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v22

    .line 125
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getUpdatedAt()Ljava/util/Date;

    move-result-object v23

    .line 126
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getUpdatedLocallyAt()Ljava/util/Date;

    move-result-object v24

    .line 127
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getDeletedAt()Ljava/util/Date;

    move-result-object v25

    .line 128
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getParentId()Ljava/lang/String;

    move-result-object v26

    .line 129
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getCommand()Ljava/lang/String;

    move-result-object v27

    .line 130
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v28

    .line 131
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getShadowed()Z

    move-result v29

    .line 132
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getI18n()Ljava/util/Map;

    move-result-object v30

    .line 133
    new-instance v31, Ljava/util/ArrayList;

    invoke-direct/range {v31 .. v31}, Ljava/util/ArrayList;-><init>()V

    .line 134
    new-instance v32, Ljava/util/ArrayList;

    invoke-direct/range {v32 .. v32}, Ljava/util/ArrayList;-><init>()V

    .line 135
    invoke-virtual {v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getRemoteMentionedUserIds()Ljava/util/List;

    move-result-object v33

    move-object/from16 p0, v0

    move-object/from16 v0, v33

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 p1, v1

    .line 136
    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v33, v2

    move-object/from16 p2, v4

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 137
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 v4, p1

    move-object/from16 v2, p2

    move/from16 v41, v9

    move/from16 v39, v13

    move/from16 v38, v14

    move-object/from16 v9, v23

    move-object/from16 v13, v25

    move-object/from16 v42, v27

    move-object/from16 v40, v28

    move/from16 v37, v29

    move-object/from16 v45, v30

    move-object/from16 v44, v31

    move-object/from16 v43, v32

    const/16 v46, 0x0

    const/16 v47, 0x0

    move-object v14, v1

    move-object/from16 v23, v12

    move-object/from16 v12, v24

    move-object/from16 v24, v26

    move-object/from16 v1, p0

    move-object/from16 p0, v0

    move-object v0, v6

    move-object/from16 v6, v22

    move-object/from16 v22, v3

    move-object/from16 v3, v33

    :goto_4
    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v25

    if-eqz v25, :cond_a

    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v25

    move-object/from16 v26, v14

    .line 138
    move-object/from16 v14, v25

    check-cast v14, Ljava/lang/String;

    move-object/from16 p1, v14

    const/4 v14, 0x0

    .line 139
    iput-object v14, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$0:Ljava/lang/Object;

    iput-object v1, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$1:Ljava/lang/Object;

    iput-object v8, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$2:Ljava/lang/Object;

    iput-object v14, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$3:Ljava/lang/Object;

    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$4:Ljava/lang/Object;

    iput-object v5, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$5:Ljava/lang/Object;

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$6:Ljava/lang/Object;

    iput-object v4, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$7:Ljava/lang/Object;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$8:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$9:Ljava/lang/Object;

    iput-object v7, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$10:Ljava/lang/Object;

    iput-object v15, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$11:Ljava/lang/Object;

    iput-object v6, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$12:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$13:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$14:Ljava/lang/Object;

    iput-object v13, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$15:Ljava/lang/Object;

    move-object/from16 v14, v26

    iput-object v14, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$16:Ljava/lang/Object;

    move-object/from16 v25, v0

    move-object/from16 v0, v24

    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$17:Ljava/lang/Object;

    move-object/from16 v0, v23

    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$18:Ljava/lang/Object;

    move-object/from16 v0, v42

    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$19:Ljava/lang/Object;

    move-object/from16 v26, v0

    move-object/from16 v0, v40

    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$20:Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, v45

    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$21:Ljava/lang/Object;

    move-object/from16 v28, v0

    move-object/from16 v0, v44

    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$22:Ljava/lang/Object;

    move-object/from16 v29, v0

    move-object/from16 v0, v43

    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$23:Ljava/lang/Object;

    move-object/from16 v30, v0

    const/4 v0, 0x0

    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$24:Ljava/lang/Object;

    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$25:Ljava/lang/Object;

    iput-object v14, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$26:Ljava/lang/Object;

    move-object/from16 v31, v2

    move-object/from16 v2, p0

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$27:Ljava/lang/Object;

    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$28:Ljava/lang/Object;

    iput-object v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$29:Ljava/lang/Object;

    move/from16 v0, v41

    iput v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$0:I

    move/from16 v32, v0

    move/from16 v0, v39

    iput v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$1:I

    move/from16 v33, v0

    move/from16 v0, v38

    iput v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$2:I

    move/from16 v34, v0

    move/from16 v0, v37

    iput-boolean v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$0:Z

    move/from16 v35, v0

    move/from16 v0, v46

    iput v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$3:I

    move/from16 v36, v0

    move/from16 v0, v47

    iput v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$4:I

    move/from16 v37, v0

    const/4 v0, 0x0

    iput v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$5:I

    const/4 v0, 0x2

    iput v0, v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->label:I

    move-object/from16 v0, p1

    invoke-interface {v1, v0, v3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v38, v1

    move-object/from16 v1, v22

    if-ne v0, v1, :cond_9

    move-object v2, v1

    goto/16 :goto_d

    :cond_9
    move-object/from16 v42, v26

    move-object/from16 v40, v27

    move-object/from16 v45, v28

    move-object/from16 v44, v29

    move-object/from16 v43, v30

    move/from16 v41, v32

    move/from16 v39, v33

    move/from16 v46, v36

    move/from16 v47, v37

    move-object/from16 v36, v38

    move-object/from16 v33, v5

    move/from16 v38, v34

    move/from16 v37, v35

    move-object v5, v4

    move-object/from16 v34, v25

    move-object v4, v3

    move-object v3, v0

    move-object v0, v14

    :goto_5
    check-cast v3, Lio/getstream/chat/android/models/User;

    .line 140
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v22, v1

    move-object/from16 p0, v2

    move-object v3, v4

    move-object v4, v5

    move-object/from16 v2, v31

    move-object/from16 v5, v33

    move-object/from16 v0, v34

    move-object/from16 v1, v36

    goto/16 :goto_4

    :cond_a
    move-object/from16 v25, v0

    move-object/from16 v31, v2

    move/from16 v35, v37

    move/from16 v34, v38

    move/from16 v33, v39

    move-object/from16 v27, v40

    move/from16 v32, v41

    move-object/from16 v26, v42

    move-object/from16 v30, v43

    move-object/from16 v29, v44

    move-object/from16 v28, v45

    move-object/from16 v38, v1

    move-object/from16 v1, v22

    .line 141
    check-cast v14, Ljava/util/List;

    .line 142
    invoke-virtual/range {v25 .. v25}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getMentionedUsersId()Ljava/util/List;

    move-result-object v0

    .line 143
    invoke-virtual/range {v25 .. v25}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getThreadParticipantsIds()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    move-object/from16 p0, v0

    .line 144
    new-instance v0, Ljava/util/ArrayList;

    move-object/from16 v20, v3

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 145
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object/from16 v52, p0

    move-object/from16 p0, v2

    move-object/from16 v58, v14

    move-object/from16 v1, v20

    move-object/from16 v20, v23

    move-object/from16 v21, v24

    move-object/from16 v48, v26

    move-object/from16 v49, v27

    move-object/from16 v50, v28

    move-object/from16 v51, v29

    move-object/from16 v57, v30

    move-object/from16 v3, v31

    move/from16 v56, v32

    move/from16 v55, v33

    move/from16 v54, v34

    move/from16 v53, v35

    move-object/from16 v2, v38

    const/16 v59, 0x0

    const/16 v60, 0x0

    move-object v14, v0

    move-object/from16 v0, v25

    :goto_6
    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v23

    if-eqz v23, :cond_c

    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v23

    move-object/from16 v24, v14

    .line 146
    move-object/from16 v14, v23

    check-cast v14, Ljava/lang/String;

    move-object/from16 p1, v14

    const/4 v14, 0x0

    .line 147
    iput-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$0:Ljava/lang/Object;

    iput-object v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$1:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$2:Ljava/lang/Object;

    iput-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$3:Ljava/lang/Object;

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$4:Ljava/lang/Object;

    iput-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$5:Ljava/lang/Object;

    iput-object v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$6:Ljava/lang/Object;

    iput-object v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$7:Ljava/lang/Object;

    iput-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$8:Ljava/lang/Object;

    iput-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$9:Ljava/lang/Object;

    iput-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$10:Ljava/lang/Object;

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$11:Ljava/lang/Object;

    iput-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$12:Ljava/lang/Object;

    iput-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$13:Ljava/lang/Object;

    iput-object v12, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$14:Ljava/lang/Object;

    iput-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$15:Ljava/lang/Object;

    move-object/from16 v14, v24

    iput-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$16:Ljava/lang/Object;

    move-object/from16 v23, v13

    move-object/from16 v13, v21

    iput-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$17:Ljava/lang/Object;

    move-object/from16 v13, v20

    iput-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$18:Ljava/lang/Object;

    move-object/from16 v13, v48

    iput-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$19:Ljava/lang/Object;

    move-object/from16 v24, v13

    move-object/from16 v13, v49

    iput-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$20:Ljava/lang/Object;

    move-object/from16 v25, v13

    move-object/from16 v13, v50

    iput-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$21:Ljava/lang/Object;

    move-object/from16 v26, v13

    move-object/from16 v13, v51

    iput-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$22:Ljava/lang/Object;

    move-object/from16 v27, v13

    move-object/from16 v13, v57

    iput-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$23:Ljava/lang/Object;

    move-object/from16 v28, v13

    move-object/from16 v13, v52

    iput-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$24:Ljava/lang/Object;

    move-object/from16 v29, v13

    const/4 v13, 0x0

    iput-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$25:Ljava/lang/Object;

    iput-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$26:Ljava/lang/Object;

    iput-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$27:Ljava/lang/Object;

    move-object/from16 v30, v14

    move-object/from16 v14, p0

    iput-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$28:Ljava/lang/Object;

    iput-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$29:Ljava/lang/Object;

    move-object/from16 v31, v14

    move-object/from16 v14, v58

    iput-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$30:Ljava/lang/Object;

    iput-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$31:Ljava/lang/Object;

    move/from16 v13, v56

    iput v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$0:I

    move/from16 v32, v13

    move/from16 v13, v55

    iput v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$1:I

    move/from16 v33, v13

    move/from16 v13, v54

    iput v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$2:I

    move/from16 v34, v13

    move/from16 v13, v53

    iput-boolean v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$0:Z

    move/from16 v35, v13

    move/from16 v13, v59

    iput v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$3:I

    move/from16 v36, v13

    move/from16 v13, v60

    iput v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$4:I

    move/from16 v37, v13

    const/4 v13, 0x0

    iput v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$5:I

    const/4 v13, 0x3

    iput v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->label:I

    move-object/from16 v13, p1

    invoke-interface {v2, v13, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v38, v2

    move-object/from16 v2, v22

    if-ne v13, v2, :cond_b

    goto/16 :goto_d

    :cond_b
    move-object/from16 v58, v14

    move-object/from16 v48, v24

    move-object/from16 v49, v25

    move-object/from16 v50, v26

    move-object/from16 v51, v27

    move-object/from16 v57, v28

    move-object/from16 v52, v29

    move-object/from16 v14, v30

    move/from16 v56, v32

    move/from16 v55, v33

    move/from16 v54, v34

    move/from16 v53, v35

    move/from16 v59, v36

    move/from16 v60, v37

    move-object/from16 v36, v38

    move-object/from16 v34, v0

    move-object/from16 v32, v3

    move-object/from16 v24, v12

    move-object v0, v14

    move-object/from16 v12, v31

    move-object v3, v1

    move-object v1, v13

    goto/16 :goto_1

    :goto_7
    check-cast v1, Lio/getstream/chat/android/models/User;

    .line 148
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v22, v2

    move-object v1, v3

    move-object/from16 p0, v12

    move-object/from16 v12, v24

    move-object/from16 v3, v32

    move-object/from16 v0, v34

    move-object/from16 v2, v36

    goto/16 :goto_6

    :cond_c
    move-object/from16 v38, v2

    move-object/from16 v23, v13

    move-object/from16 v30, v14

    move-object/from16 v2, v22

    move-object/from16 v24, v48

    move-object/from16 v25, v49

    move-object/from16 v26, v50

    move-object/from16 v27, v51

    move-object/from16 v29, v52

    move/from16 v35, v53

    move/from16 v34, v54

    move/from16 v33, v55

    move/from16 v32, v56

    move-object/from16 v28, v57

    move-object/from16 v14, v58

    .line 149
    move-object/from16 v13, v30

    check-cast v13, Ljava/util/List;

    .line 150
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getShowInChannel()Z

    move-result v2

    move/from16 p0, v2

    .line 151
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getSilent()Z

    move-result v2

    move/from16 p1, v2

    .line 152
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getPinned()Z

    move-result v2

    move/from16 p2, v2

    .line 153
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getPinnedAt()Ljava/util/Date;

    move-result-object v2

    move-object/from16 v19, v14

    .line 154
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getPinExpires()Ljava/util/Date;

    move-result-object v14

    move-object/from16 v30, v14

    .line 155
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getPinnedByUserId()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_e

    move-object/from16 v31, v14

    const/4 v14, 0x0

    iput-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$0:Ljava/lang/Object;

    iput-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$1:Ljava/lang/Object;

    iput-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$2:Ljava/lang/Object;

    iput-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$3:Ljava/lang/Object;

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$4:Ljava/lang/Object;

    iput-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$5:Ljava/lang/Object;

    iput-object v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$6:Ljava/lang/Object;

    iput-object v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$7:Ljava/lang/Object;

    iput-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$8:Ljava/lang/Object;

    iput-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$9:Ljava/lang/Object;

    iput-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$10:Ljava/lang/Object;

    iput-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$11:Ljava/lang/Object;

    iput-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$12:Ljava/lang/Object;

    iput-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$13:Ljava/lang/Object;

    iput-object v12, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$14:Ljava/lang/Object;

    move-object/from16 v14, v23

    iput-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$15:Ljava/lang/Object;

    move-object/from16 v23, v0

    move-object/from16 v0, v21

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$16:Ljava/lang/Object;

    move-object/from16 v0, v20

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$17:Ljava/lang/Object;

    move-object/from16 v0, v24

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$18:Ljava/lang/Object;

    move-object/from16 v0, v25

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$19:Ljava/lang/Object;

    move-object/from16 v0, v26

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$20:Ljava/lang/Object;

    move-object/from16 v0, v27

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$21:Ljava/lang/Object;

    move-object/from16 v0, v28

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$22:Ljava/lang/Object;

    move-object/from16 v0, v29

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$23:Ljava/lang/Object;

    iput-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$24:Ljava/lang/Object;

    iput-object v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$25:Ljava/lang/Object;

    move-object/from16 v0, v30

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$26:Ljava/lang/Object;

    move-object/from16 v0, v19

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$27:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$28:Ljava/lang/Object;

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$29:Ljava/lang/Object;

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$30:Ljava/lang/Object;

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$31:Ljava/lang/Object;

    move/from16 v0, v32

    iput v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$0:I

    move/from16 v0, v33

    iput v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$1:I

    move/from16 v0, v34

    iput v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$2:I

    move/from16 v0, v35

    iput-boolean v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$0:Z

    move/from16 v0, p0

    iput-boolean v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$1:Z

    move/from16 v0, p1

    iput-boolean v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$2:Z

    move/from16 v0, p2

    iput-boolean v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$3:Z

    const/4 v0, 0x0

    iput v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$3:I

    const/4 v0, 0x4

    iput v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->label:I

    move-object/from16 v18, v2

    move-object/from16 v2, v31

    move-object/from16 v0, v38

    invoke-interface {v0, v2, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v2, v22

    if-ne v0, v2, :cond_d

    goto/16 :goto_d

    :cond_d
    move/from16 v22, v32

    move-object/from16 v32, v5

    move-object/from16 v5, v29

    move-object/from16 v29, v10

    move/from16 v10, v22

    move-object/from16 v22, v28

    move-object/from16 v28, v11

    move-object/from16 v11, v22

    move-object/from16 v31, v3

    move-object/from16 v36, v13

    move-object/from16 v13, v19

    move-object/from16 v19, v24

    move-object/from16 v22, v30

    move-object v3, v1

    move-object/from16 v30, v4

    move-object/from16 v24, v9

    move/from16 v9, v34

    move/from16 v4, p1

    move-object v1, v0

    move-object/from16 v34, v8

    move-object/from16 v0, v23

    move/from16 v8, p0

    move-object/from16 v23, v18

    move/from16 v18, p2

    :goto_8
    check-cast v1, Lio/getstream/chat/android/models/User;

    move-object/from16 v72, v1

    move/from16 v65, v4

    move-object/from16 v73, v5

    move/from16 v66, v8

    move/from16 v68, v9

    move/from16 v77, v10

    move-object/from16 v63, v11

    move-object/from16 v71, v13

    move/from16 v64, v18

    move-object/from16 v13, v19

    move-object/from16 v74, v22

    move-object/from16 v75, v23

    move-object/from16 v9, v24

    move-object/from16 v11, v28

    move-object/from16 v10, v29

    move-object/from16 v4, v30

    move-object/from16 v5, v32

    move-object/from16 v70, v34

    move-object/from16 v76, v36

    move-object/from16 v22, v2

    move-object v2, v3

    move-object/from16 v3, v31

    :goto_9
    move-object/from16 v8, v20

    move-object/from16 v1, v21

    move-object/from16 v18, v25

    move-object/from16 v61, v26

    move-object/from16 v62, v27

    move/from16 v69, v33

    move/from16 v67, v35

    goto :goto_a

    :cond_e
    move-object/from16 v18, v2

    move-object/from16 v14, v23

    move-object/from16 v23, v0

    move/from16 v66, p0

    move/from16 v65, p1

    move/from16 v64, p2

    move-object v2, v1

    move-object/from16 v70, v8

    move-object/from16 v76, v13

    move-object/from16 v75, v18

    move-object/from16 v71, v19

    move-object/from16 v13, v24

    move-object/from16 v63, v28

    move-object/from16 v73, v29

    move-object/from16 v74, v30

    move/from16 v77, v32

    move/from16 v68, v34

    const/16 v72, 0x0

    goto :goto_9

    .line 156
    :goto_a
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getModerationDetails()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v19

    if-eqz v19, :cond_f

    invoke-static/range {v19 .. v19}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;)Lio/getstream/chat/android/models/MessageModerationDetails;

    move-result-object v19

    move-object/from16 v78, v19

    :goto_b
    move-object/from16 v19, v13

    goto :goto_c

    :cond_f
    const/16 v78, 0x0

    goto :goto_b

    .line 157
    :goto_c
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getMessageTextUpdatedAt()Ljava/util/Date;

    move-result-object v13

    move-object/from16 p0, v13

    .line 158
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getPollId()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_11

    move-object/from16 p1, v13

    const/4 v13, 0x0

    iput-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$0:Ljava/lang/Object;

    iput-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$1:Ljava/lang/Object;

    iput-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$2:Ljava/lang/Object;

    iput-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$3:Ljava/lang/Object;

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$4:Ljava/lang/Object;

    iput-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$5:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$6:Ljava/lang/Object;

    iput-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$7:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$8:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$9:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$10:Ljava/lang/Object;

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$11:Ljava/lang/Object;

    iput-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$12:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$13:Ljava/lang/Object;

    iput-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$14:Ljava/lang/Object;

    iput-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$15:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$16:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$17:Ljava/lang/Object;

    move-object/from16 v13, v19

    iput-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$18:Ljava/lang/Object;

    move-object/from16 p2, v0

    move-object/from16 v0, v18

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$19:Ljava/lang/Object;

    move-object/from16 v0, v61

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$20:Ljava/lang/Object;

    move-object/from16 v19, v0

    move-object/from16 v0, v62

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$21:Ljava/lang/Object;

    move-object/from16 v20, v0

    move-object/from16 v0, v63

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$22:Ljava/lang/Object;

    move-object/from16 v21, v0

    move-object/from16 v0, v73

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$23:Ljava/lang/Object;

    move-object/from16 v23, v0

    move-object/from16 v0, v76

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$24:Ljava/lang/Object;

    move-object/from16 v24, v0

    move-object/from16 v0, v75

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$25:Ljava/lang/Object;

    move-object/from16 v25, v0

    move-object/from16 v0, v74

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$26:Ljava/lang/Object;

    move-object/from16 v26, v0

    move-object/from16 v0, v72

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$27:Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, v78

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$28:Ljava/lang/Object;

    move-object/from16 v28, v0

    move-object/from16 v0, v71

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$29:Ljava/lang/Object;

    move-object/from16 v29, v0

    move-object/from16 v0, p0

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$30:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->L$31:Ljava/lang/Object;

    move/from16 v0, v77

    iput v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$0:I

    move/from16 v0, v69

    iput v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$1:I

    move/from16 v30, v0

    move/from16 v0, v68

    iput v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$2:I

    move/from16 v31, v0

    move/from16 v0, v67

    iput-boolean v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$0:Z

    move/from16 v32, v0

    move/from16 v0, v66

    iput-boolean v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$1:Z

    move/from16 v33, v0

    move/from16 v0, v65

    iput-boolean v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$2:Z

    move/from16 v34, v0

    move/from16 v0, v64

    iput-boolean v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->Z$3:Z

    move/from16 v35, v0

    const/4 v0, 0x0

    iput v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->I$3:I

    const/4 v0, 0x5

    iput v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt$toModel$3;->label:I

    move-object/from16 v16, v1

    move-object/from16 v0, v70

    move-object/from16 v1, p1

    invoke-interface {v0, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v2, v22

    if-ne v1, v2, :cond_10

    :goto_d
    return-object v2

    :cond_10
    move-object/from16 v0, p2

    move-object v2, v1

    move-object/from16 v17, v18

    move-object/from16 v1, v19

    move-object/from16 v22, v27

    move-object/from16 v18, v28

    move-object/from16 v19, v8

    move-object/from16 v28, v10

    move-object/from16 v27, v11

    move-object/from16 v11, v29

    move/from16 v8, v31

    move-object/from16 v10, p0

    move-object/from16 v29, v4

    move-object/from16 v31, v5

    move/from16 v5, v32

    move/from16 v4, v33

    move-object/from16 v32, v24

    move-object/from16 v24, v23

    move-object/from16 v23, v9

    move/from16 v9, v30

    move-object/from16 v30, v3

    move/from16 v3, v34

    :goto_e
    check-cast v2, Lio/getstream/chat/android/models/Poll;

    move-object/from16 v34, v27

    move/from16 v27, v3

    move-object/from16 v3, v30

    move/from16 v30, v4

    move-object/from16 v4, v28

    move/from16 v28, v5

    move-object/from16 v5, v34

    move-object/from16 v34, v12

    move v12, v8

    move-object/from16 v8, v19

    move-object/from16 v19, v21

    move-object/from16 v21, v23

    move-object/from16 v23, v34

    move-object/from16 v44, v2

    move-object/from16 v43, v10

    move-object v10, v11

    move-object/from16 v41, v18

    move-object/from16 v37, v22

    move-object/from16 v2, v31

    move-object/from16 v38, v32

    move/from16 v34, v35

    move v11, v9

    move-object/from16 v9, v24

    move-object/from16 v35, v25

    move-object/from16 v25, v29

    move-object/from16 v29, v1

    move-object/from16 v24, v6

    move-object/from16 v6, v16

    move-object/from16 v16, v17

    move-object/from16 v18, v20

    move-object/from16 v36, v26

    move-object/from16 v22, v14

    move-object/from16 v20, v15

    move-object/from16 v17, v7

    move-object v7, v13

    goto/16 :goto_f

    :cond_11
    move-object/from16 p2, v0

    move-object/from16 v16, v1

    move-object/from16 v13, v19

    move-object/from16 v19, v61

    move-object/from16 v20, v62

    move-object/from16 v21, v63

    move/from16 v35, v64

    move/from16 v34, v65

    move/from16 v33, v66

    move/from16 v32, v67

    move/from16 v31, v68

    move/from16 v30, v69

    move-object/from16 v29, v71

    move-object/from16 v27, v72

    move-object/from16 v23, v73

    move-object/from16 v26, v74

    move-object/from16 v25, v75

    move-object/from16 v24, v76

    move-object/from16 v28, v78

    move-object/from16 v43, p0

    move-object v2, v5

    move-object v5, v11

    move-object/from16 v38, v24

    move-object/from16 v37, v27

    move-object/from16 v41, v28

    move/from16 v11, v30

    move/from16 v28, v32

    move/from16 v30, v33

    move/from16 v27, v34

    move/from16 v34, v35

    const/16 v44, 0x0

    move-object/from16 v24, v6

    move-object/from16 v6, v16

    move-object/from16 v16, v18

    move-object/from16 v35, v25

    move-object/from16 v25, v4

    move-object v4, v10

    move-object/from16 v10, v29

    move-object/from16 v29, v19

    move-object/from16 v19, v21

    move-object/from16 v21, v9

    move-object/from16 v9, v23

    move-object/from16 v23, v12

    move/from16 v12, v31

    move-object/from16 v17, v7

    move-object v7, v13

    move-object/from16 v22, v14

    move-object/from16 v36, v26

    move-object/from16 v18, v20

    move-object/from16 v20, v15

    .line 159
    :goto_f
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getRestrictedVisibility()Ljava/util/List;

    move-result-object v45

    .line 160
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getChannelInfo()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;)Lio/getstream/chat/android/models/ChannelInfo;

    move-result-object v1

    move-object/from16 v31, v1

    goto :goto_10

    :cond_12
    const/16 v31, 0x0

    .line 161
    :goto_10
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getReminder()Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v1

    if-eqz v1, :cond_13

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;)Lio/getstream/chat/android/models/MessageReminderInfo;

    move-result-object v1

    move-object/from16 v46, v1

    goto :goto_11

    :cond_13
    const/16 v46, 0x0

    .line 162
    :goto_11
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;->getChannelRole()Ljava/lang/String;

    move-result-object v48

    .line 163
    new-instance v1, Lio/getstream/chat/android/models/Message;

    const v51, 0xa160

    const/16 v52, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v26, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v47, 0x0

    const/16 v49, 0x0

    const v50, 0x1003800

    invoke-direct/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final toReplyEntity(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;
    .locals 42

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getHtml()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v9

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getType()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getReplyCount()I

    move-result v10

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getDeletedReplyCount()I

    move-result v11

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getCreatedAt()Ljava/util/Date;

    move-result-object v12

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v13

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getUpdatedAt()Ljava/util/Date;

    move-result-object v14

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getUpdatedLocallyAt()Ljava/util/Date;

    move-result-object v15

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getDeletedAt()Ljava/util/Date;

    move-result-object v16

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getParentId()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getCommand()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getShadowed()Z

    move-result v21

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getI18n()Ljava/util/Map;

    move-result-object v22

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getMentionedUsers()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v1, 0xa

    move-object/from16 v17, v3

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/User;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getMentionedUsersIds()Ljava/util/List;

    move-result-object v18

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getThreadParticipants()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    move-object/from16 v23, v2

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/User;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getShowInChannel()Z

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getSilent()Z

    move-result v25

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v27

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getPinnedAt()Ljava/util/Date;

    move-result-object v28

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object v29

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getPinnedBy()Lio/getstream/chat/android/models/User;

    move-result-object v2

    const/16 v41, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v30, v2

    goto :goto_2

    :cond_2
    move-object/from16 v30, v41

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getModerationDetails()Lio/getstream/chat/android/models/MessageModerationDetails;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsMapperKt;->toEntity(Lio/getstream/chat/android/models/MessageModerationDetails;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    move-result-object v2

    move-object/from16 v32, v2

    goto :goto_3

    :cond_3
    move-object/from16 v32, v41

    :goto_3
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v34, v2

    goto :goto_4

    :cond_4
    move-object/from16 v34, v41

    :goto_4
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getReminder()Lio/getstream/chat/android/models/MessageReminderInfo;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/MessageMapperKt;->toEntity(Lio/getstream/chat/android/models/MessageReminderInfo;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;

    move-result-object v2

    move-object/from16 v36, v2

    goto :goto_5

    :cond_5
    move-object/from16 v36, v41

    :goto_5
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getChannelRole()Ljava/lang/String;

    move-result-object v37

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;

    const/16 v39, 0x1

    const/16 v40, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/high16 v38, 0x40a00000    # 5.0f

    move-object/from16 v31, v3

    move-object/from16 v3, v17

    move-object/from16 v17, v23

    move/from16 v23, v0

    invoke-direct/range {v2 .. v40}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/SyncStatus;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;ZLio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;ZLjava/util/Map;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReminderInfoEntity;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v1, 0x1

    if-ltz v1, :cond_6

    check-cast v4, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentMapperKt;->toReplyEntity(Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;I)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v1, v5

    goto :goto_6

    :cond_6
    invoke-static {}, Lwb3/f;->d0()V

    throw v41

    :cond_7
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;

    invoke-direct {v0, v2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReplyMessageInnerEntity;Ljava/util/List;)V

    return-object v0
.end method
