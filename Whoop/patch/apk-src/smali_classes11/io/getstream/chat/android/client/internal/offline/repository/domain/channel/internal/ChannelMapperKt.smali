.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0084\u0001\u0010\u000e\u001a\u00020\u0000*\u00020\u00012\"\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00042$\u0010\u000b\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00042$\u0010\r\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0004H\u0080@\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/models/Channel;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;",
        "toEntity",
        "(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;",
        "Lkotlin/Function2;",
        "",
        "Lq83/d;",
        "Lio/getstream/chat/android/models/User;",
        "",
        "getUser",
        "Lio/getstream/chat/android/models/Message;",
        "getMessage",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "getDraftMessage",
        "toModel",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;",
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
.method public static final toEntity(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;
    .locals 29

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getImage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getCooldown()I

    move-result v6

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getFilterTags()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getFrozen()Z

    move-result v9

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getCreatedAt()Ljava/util/Date;

    move-result-object v19

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getUpdatedAt()Ljava/util/Date;

    move-result-object v20

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getDeletedAt()Ljava/util/Date;

    move-result-object v21

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getExtraData()Ljava/util/Map;

    move-result-object v22

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v23

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getHidden()Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getHiddenMessagesBefore()Ljava/util/Date;

    move-result-object v11

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v0, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v7, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lio/getstream/chat/android/models/Member;

    invoke-static {v13}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberMapperKt;->toEntity(Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    move-result-object v13

    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v7, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    const/16 v13, 0x10

    if-ge v0, v13, :cond_1

    move v0, v13

    :cond_1
    new-instance v14, Ljava/util/LinkedHashMap;

    invoke-direct {v14, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v15, v7

    check-cast v15, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    invoke-virtual {v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->getUserId()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v14, v15, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-static {v14}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getMemberCount()I

    move-result v7

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getRead()Ljava/util/List;

    move-result-object v14

    check-cast v14, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    invoke-static {v14, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v15, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_3

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-static {v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadMapperKt;->toEntity(Lio/getstream/chat/android/models/ChannelUserRead;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;

    move-result-object v14

    invoke-virtual {v15, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-static {v15, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-static {v13}, Lm83/g0;->W(I)I

    move-result v13

    const/16 v14, 0x10

    if-ge v13, v14, :cond_4

    move v13, v14

    :cond_4
    new-instance v14, Ljava/util/LinkedHashMap;

    invoke-direct {v14, v13}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_5

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v16, v15

    check-cast v16, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;

    invoke-virtual/range {v16 .. v16}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;->getUserId()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v14, v12, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v12, 0xa

    goto :goto_3

    :cond_5
    invoke-static {v14}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v16

    invoke-static {v1}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->getLastMessage(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Message;

    move-result-object v12

    const/4 v13, 0x0

    if-eqz v12, :cond_6

    invoke-virtual {v12}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v18, v12

    goto :goto_4

    :cond_6
    move-object/from16 v18, v13

    :goto_4
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getLastMessageAt()Ljava/util/Date;

    move-result-object v12

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getCreatedBy()Lio/getstream/chat/android/models/User;

    move-result-object v14

    invoke-virtual {v14}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getWatchers()Ljava/util/List;

    move-result-object v15

    check-cast v15, Ljava/lang/Iterable;

    move-object/from16 v24, v13

    move v13, v7

    move-object v7, v14

    new-instance v14, Ljava/util/ArrayList;

    move-object/from16 v25, v0

    const/16 v0, 0xa

    invoke-static {v15, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v14, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/User;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_7
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Channel;->getWatcherCount()I

    move-result v15

    move-object/from16 v0, v24

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Channel;->getTeam()Ljava/lang/String;

    move-result-object v24

    move-object/from16 v17, v12

    move-object/from16 v12, v25

    const/16 v1, 0xa

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Channel;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v25

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Channel;->getMembership()Lio/getstream/chat/android/models/Member;

    move-result-object v26

    if-eqz v26, :cond_8

    invoke-static/range {v26 .. v26}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberMapperKt;->toEntity(Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    move-result-object v0

    :cond_8
    move-object/from16 v26, v0

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Channel;->getActiveLiveLocations()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v28, v2

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Location;

    invoke-static {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationMapperKt;->toEntity(Lio/getstream/chat/android/models/Location;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_9
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/models/Channel;->getMessageCount()Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v27, v1

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    move-object/from16 v2, v28

    move-object/from16 v28, v0

    invoke-direct/range {v1 .. v28}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/util/Date;Ljava/util/Map;ILjava/util/List;ILjava/util/Map;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/Set;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Ljava/util/List;Ljava/lang/Integer;)V

    return-object v1
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 56
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p4

    instance-of v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;

    iget v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;

    invoke-direct {v1, v0}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->result:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->label:I

    packed-switch v3, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$2:I

    iget v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$1:I

    iget-boolean v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->Z$0:Z

    iget v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$0:I

    iget-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/models/Member;

    iget-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    check-cast v10, Ljava/util/Set;

    iget-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    check-cast v11, Ljava/util/Date;

    iget-object v12, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    iget-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    check-cast v14, Lio/getstream/chat/android/models/User;

    iget-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    iget-object v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v5, Ljava/util/Date;

    move-object/from16 v16, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    move-object/from16 p0, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/SyncStatus;

    move-object/from16 p1, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 p2, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 p3, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v17, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v18, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v19, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v20, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v21, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v22, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v23, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    invoke-static/range {v16 .. v16}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, v23

    move-object/from16 v23, v18

    move-object/from16 v18, v1

    move-object/from16 v36, p0

    move-object/from16 v26, p1

    move-object/from16 v51, p2

    move-object/from16 v24, p3

    move-object v1, v0

    move/from16 v27, v3

    move-object/from16 v28, v4

    move-object/from16 v37, v5

    move-object/from16 v29, v7

    move/from16 v38, v8

    move-object/from16 v42, v9

    move-object/from16 v41, v10

    move-object/from16 v50, v11

    move-object/from16 v35, v12

    move-object/from16 v30, v13

    move-object/from16 v33, v14

    move-object/from16 v31, v15

    move-object/from16 v0, v16

    move-object/from16 v25, v17

    move-object/from16 v49, v19

    move-object/from16 v19, v21

    move-object/from16 v17, v22

    move/from16 v21, v2

    move/from16 v22, v6

    goto/16 :goto_f

    :pswitch_1
    move-object/from16 v16, v0

    iget v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$2:I

    iget v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$1:I

    iget-boolean v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->Z$0:Z

    iget v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$0:I

    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    check-cast v6, Ljava/util/Set;

    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    check-cast v7, Ljava/util/Date;

    iget-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/models/User;

    iget-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    iget-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v14, Ljava/util/Date;

    iget-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Boolean;

    move/from16 v17, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/SyncStatus;

    move-object/from16 p0, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 p1, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 p2, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 p3, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v18, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v19, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v20, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v21, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v22, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v23, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v24, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    invoke-static/range {v16 .. v16}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v25, v21

    move/from16 v21, v4

    move-object/from16 v4, v25

    move-object/from16 v28, v0

    move-object/from16 v25, v11

    move-object/from16 v26, v12

    move-object/from16 v27, v13

    move-object/from16 v0, v16

    move-object/from16 v12, p1

    move-object/from16 v13, p2

    move-object v11, v1

    move-object v1, v2

    move v2, v5

    move-object/from16 v16, v10

    move-object/from16 v5, v23

    move-object v10, v8

    move-object/from16 v23, v14

    move-object/from16 v14, p3

    move-object v8, v6

    move-object/from16 v6, v22

    move-object/from16 v22, v9

    move-object v9, v7

    move-object/from16 v7, v19

    move-object/from16 v19, v24

    move-object/from16 v24, v15

    move-object/from16 v15, p0

    goto/16 :goto_b

    :pswitch_2
    move-object/from16 v16, v0

    iget v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$3:I

    iget v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$2:I

    iget v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$1:I

    iget-boolean v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->Z$0:Z

    iget v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$0:I

    iget-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$26:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    iget-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    check-cast v10, Ljava/util/Collection;

    iget-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Iterable;

    iget-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Iterable;

    iget-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/models/User;

    iget-object v12, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    iget-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v14, Ljava/util/List;

    iget-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v15, Ljava/util/Date;

    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Boolean;

    move/from16 v18, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/SyncStatus;

    move-object/from16 p0, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    move-object/from16 p1, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 p2, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 p3, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 v19, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v20, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v21, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v22, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v23, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v24, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v25, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v26, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    invoke-static/range {v16 .. v16}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v27, v11

    move-object v11, v1

    move-object v1, v2

    move-object/from16 v2, v26

    move-object/from16 v26, v27

    move-object/from16 v27, v20

    move/from16 v20, v3

    move-object/from16 v3, v25

    move-object/from16 v25, v10

    move-object/from16 v10, v21

    move/from16 v21, v4

    move-object/from16 v4, v22

    move/from16 v22, v5

    move-object/from16 v5, v24

    move/from16 v24, v7

    move-object/from16 v7, v27

    move-object/from16 v27, v23

    move-object/from16 v23, v6

    move-object/from16 v6, v27

    move-object/from16 v28, v0

    move-object/from16 v27, v12

    move-object/from16 v29, v13

    move-object/from16 v30, v14

    move-object/from16 v0, v16

    move-object/from16 v16, p0

    move-object/from16 v12, p1

    move-object/from16 v13, p2

    move-object/from16 v14, p3

    goto/16 :goto_a

    :pswitch_3
    move-object/from16 v16, v0

    iget v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$1:I

    iget-boolean v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->Z$0:Z

    iget v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$0:I

    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v8, Ljava/util/Date;

    iget-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Boolean;

    iget-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v10, Lio/getstream/chat/android/models/SyncStatus;

    iget-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v11, Ljava/util/Map;

    iget-object v12, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v12, Ljava/util/Date;

    iget-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v13, Ljava/util/Date;

    iget-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v14, Ljava/util/Date;

    iget-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    move/from16 v18, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p0, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p1, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p2, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p3, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v19, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v20, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    invoke-static/range {v16 .. v16}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v26, v0

    move-object v0, v2

    move-object v2, v5

    move-object/from16 v25, v7

    move-object/from16 v27, v8

    move-object/from16 v21, v15

    move-object/from16 v5, p3

    move-object v7, v1

    move-object v8, v6

    move-object v15, v10

    move-object/from16 v1, v16

    move-object/from16 v10, p0

    move-object/from16 v6, p2

    move-object/from16 v16, v14

    move-object v14, v13

    move-object v13, v12

    move-object v12, v11

    move-object v11, v9

    move v9, v4

    move-object/from16 v4, v19

    move-object/from16 v19, v20

    move/from16 v20, v18

    move-object/from16 v18, p1

    goto/16 :goto_8

    :pswitch_4
    move-object/from16 v16, v0

    iget v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$3:I

    iget v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$2:I

    iget v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$1:I

    iget-boolean v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->Z$0:Z

    iget v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$0:I

    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    iget-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;

    iget-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    check-cast v9, Ljava/util/Collection;

    iget-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v12, Ljava/util/Date;

    iget-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Boolean;

    iget-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v14, Lio/getstream/chat/android/models/SyncStatus;

    iget-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v15, Ljava/util/Map;

    move/from16 v18, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 p0, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 p1, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v0, Ljava/util/Date;

    move-object/from16 p2, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p3, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v19, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v20, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v21, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v22, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v23, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v24, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    invoke-static/range {v16 .. v16}, Lts/o;->I(Ljava/lang/Object;)V

    move/from16 v25, v3

    move-object v3, v2

    move-object/from16 v2, v20

    move/from16 v20, v25

    move-object/from16 v25, v21

    move/from16 v21, v4

    move-object/from16 v4, v23

    move/from16 v23, v6

    move-object/from16 v6, v25

    move-object/from16 v25, v22

    move/from16 v22, v5

    move-object/from16 v5, v25

    move-object/from16 v28, v8

    move-object/from16 v25, v9

    move-object/from16 v26, v10

    move-object/from16 v27, v11

    move-object v9, v13

    move-object/from16 v10, v19

    move-object/from16 v13, p1

    move-object/from16 v11, p2

    move-object v8, v1

    move/from16 v19, v18

    move-object v1, v0

    move-object/from16 v18, v14

    move-object/from16 v0, v16

    move-object/from16 v14, p0

    move-object/from16 v16, p3

    goto/16 :goto_7

    :pswitch_5
    move-object/from16 v16, v0

    iget v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$1:I

    iget-boolean v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->Z$0:Z

    iget v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$0:I

    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v6, Ljava/util/Date;

    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Boolean;

    iget-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/models/SyncStatus;

    iget-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v9, Ljava/util/Map;

    iget-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v10, Ljava/util/Date;

    iget-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v11, Ljava/util/Date;

    iget-object v12, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v12, Ljava/util/Date;

    iget-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    iget-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    move/from16 v18, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p0, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p1, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 p2, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 p3, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    invoke-static/range {v16 .. v16}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v19, v0

    move-object/from16 v21, v6

    move-object/from16 v23, v7

    move-object/from16 v20, v15

    move-object/from16 v0, v16

    move-object/from16 v6, p0

    move-object v7, v1

    move-object v15, v13

    move-object/from16 v16, v14

    move-object/from16 v1, p3

    move-object v14, v2

    move v13, v4

    move-object v2, v5

    move-object/from16 v5, p1

    move-object/from16 v4, p2

    goto/16 :goto_4

    :pswitch_6
    move-object/from16 v16, v0

    iget v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$2:I

    iget v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$1:I

    iget-boolean v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->Z$0:Z

    iget v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$0:I

    iget-object v6, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    check-cast v6, Ljava/util/Collection;

    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    iget-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    iget-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v9, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v9, Ljava/util/Date;

    iget-object v10, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Boolean;

    iget-object v11, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/models/SyncStatus;

    iget-object v12, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v12, Ljava/util/Map;

    iget-object v13, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v13, Ljava/util/Date;

    iget-object v14, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v14, Ljava/util/Date;

    iget-object v15, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v15, Ljava/util/Date;

    move/from16 v18, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p0, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p1, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p2, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p3, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v19, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v20, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v21, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v22, v0

    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    invoke-static/range {v16 .. v16}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v23, v19

    move/from16 v19, v5

    move-object/from16 v5, v23

    move/from16 v27, v3

    move-object/from16 v24, v9

    move-object/from16 v23, v10

    move-object v10, v14

    move/from16 v28, v18

    move-object/from16 v3, v21

    move-object v9, v1

    move-object v14, v2

    move/from16 v18, v4

    move-object/from16 v21, v8

    move-object v2, v13

    move-object/from16 v4, v20

    move-object/from16 v8, p3

    move-object v1, v0

    move-object/from16 v20, v11

    move-object v13, v12

    move-object/from16 v0, v16

    move-object/from16 v12, p0

    move-object/from16 v11, p1

    move-object/from16 v16, p2

    goto/16 :goto_3

    :pswitch_7
    move-object/from16 v16, v0

    invoke-static/range {v16 .. v16}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getCooldown()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getChannelId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getImage()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getFilterTags()Ljava/util/List;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getFrozen()Z

    move-result v8

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getUpdatedAt()Ljava/util/Date;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getDeletedAt()Ljava/util/Date;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getExtraData()Ljava/util/Map;

    move-result-object v12

    invoke-static {v12}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getHidden()Ljava/lang/Boolean;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getHideMessagesBefore()Ljava/util/Date;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getMembers()Ljava/util/Map;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v16

    move/from16 v18, v0

    move-object/from16 v0, v16

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 v16, v1

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v19, v3

    move-object/from16 v20, v4

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v3, v0

    move-object/from16 v0, p0

    move-object/from16 p0, v3

    move-object/from16 v3, v16

    move-object/from16 v16, v2

    move-object v2, v11

    move-object v11, v7

    move-object v7, v3

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v21, v15

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object v15, v5

    move-object/from16 v5, v19

    move/from16 v19, v18

    move/from16 v18, v8

    move-object v8, v10

    move-object v10, v6

    move-object/from16 v6, v20

    move-object/from16 v20, v1

    move-object/from16 v1, p1

    :goto_1
    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_2

    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    move-object/from16 v23, v14

    move-object/from16 v14, v22

    check-cast v14, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    iput-object v0, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v3, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v4, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v5, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v6, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v15, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v10, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v11, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v9, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v8, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v2, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v12, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v13, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    move-object/from16 v22, v3

    move-object/from16 v3, v23

    iput-object v3, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    move-object/from16 v3, v21

    iput-object v3, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    const/4 v3, 0x0

    iput-object v3, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    iput-object v3, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    move-object/from16 v3, v20

    iput-object v3, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    move-object/from16 v20, v13

    move-object/from16 v13, p0

    iput-object v13, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    move-object/from16 v24, v13

    const/4 v13, 0x0

    iput-object v13, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    iput-object v13, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    iput-object v3, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    move/from16 v13, v19

    iput v13, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$0:I

    move-object/from16 v19, v3

    move/from16 v3, v18

    iput-boolean v3, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->Z$0:Z

    move/from16 v3, v27

    iput v3, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$1:I

    move/from16 v25, v3

    move/from16 v3, v28

    iput v3, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$2:I

    move/from16 v26, v3

    const/4 v3, 0x0

    iput v3, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$3:I

    const/4 v3, 0x1

    iput v3, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->label:I

    invoke-static {v14, v1, v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v14, v16

    if-ne v3, v14, :cond_1

    :goto_2
    move-object v1, v14

    goto/16 :goto_e

    :cond_1
    move-object/from16 v16, v1

    move-object v1, v0

    move-object v0, v3

    move-object/from16 v3, v22

    move-object/from16 v22, v16

    move-object/from16 v16, v15

    move/from16 v27, v25

    move/from16 v28, v26

    move-object v15, v9

    move-object v9, v7

    move-object/from16 v7, v24

    move-object/from16 v24, v21

    move-object/from16 v21, v19

    move/from16 v19, v13

    move-object v13, v12

    move-object v12, v11

    move-object v11, v10

    move-object v10, v8

    move-object v8, v6

    move-object/from16 v6, v21

    :goto_3
    check-cast v0, Lio/getstream/chat/android/models/Member;

    invoke-interface {v6, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v0, v1

    move-object/from16 p0, v7

    move-object v6, v8

    move-object v7, v9

    move-object v8, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object v9, v15

    move-object/from16 v15, v16

    move-object/from16 v13, v20

    move-object/from16 v20, v21

    move-object/from16 v1, v22

    move-object/from16 v21, v24

    move-object/from16 v16, v14

    move-object/from16 v14, v23

    goto/16 :goto_1

    :cond_2
    move-object/from16 v22, v20

    move-object/from16 v20, v13

    move/from16 v13, v19

    move-object/from16 v19, v22

    move-object/from16 v22, v3

    move-object/from16 v23, v14

    move-object/from16 v14, v16

    move-object/from16 v3, v19

    check-cast v3, Ljava/util/List;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getMemberCount()I

    move-result v14

    move/from16 p0, v14

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getLastMessageId()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_4

    iput-object v0, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    move-object/from16 v19, v0

    const/4 v0, 0x0

    iput-object v0, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v4, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v5, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v6, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v15, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v10, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v11, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v9, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v8, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v2, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v12, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    move-object/from16 v0, v20

    iput-object v0, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    move-object/from16 v0, v23

    iput-object v0, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    move-object/from16 v0, v21

    iput-object v0, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    iput-object v3, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    iput-object v0, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    iput-object v0, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    iput-object v0, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    iput-object v0, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    iput-object v0, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    iput v13, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$0:I

    move/from16 v0, v18

    iput-boolean v0, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->Z$0:Z

    move/from16 v0, p0

    iput v0, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$1:I

    const/4 v0, 0x0

    iput v0, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$2:I

    const/4 v0, 0x2

    iput v0, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->label:I

    move-object/from16 v0, v22

    invoke-interface {v0, v14, v7}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v14, v16

    if-ne v0, v14, :cond_3

    goto/16 :goto_2

    :cond_3
    move-object/from16 v16, v11

    move-object v11, v8

    move-object/from16 v8, v20

    move-object/from16 v20, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v12

    move-object v12, v9

    move-object/from16 v9, v16

    move-object/from16 v16, v10

    move-object v10, v2

    move-object v2, v3

    move/from16 v3, v18

    move/from16 v18, p0

    :goto_4
    check-cast v0, Lio/getstream/chat/android/models/Message;

    move-object/from16 v55, v19

    move-object/from16 v19, v0

    move-object/from16 v0, v55

    move/from16 v55, v3

    move-object v3, v2

    move-object v2, v10

    move-object/from16 v10, v16

    move-object/from16 v16, v20

    move-object/from16 v20, v8

    move-object v8, v11

    move-object v11, v15

    move/from16 v15, v18

    move/from16 v18, v55

    move-object/from16 v55, v12

    move-object v12, v9

    move-object/from16 v9, v55

    goto :goto_5

    :cond_4
    move-object/from16 v19, v0

    move-object/from16 v14, v16

    move-object/from16 v16, v15

    const/16 v19, 0x0

    move/from16 v15, p0

    :goto_5
    invoke-static/range {v19 .. v19}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getReads()Ljava/util/Map;

    move-result-object v22

    invoke-interface/range {v22 .. v22}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v22

    move-object/from16 p0, v0

    move-object/from16 v0, v22

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 p1, v1

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v2, v12

    move-object v12, v8

    move-object v8, v2

    move-object/from16 v2, v20

    move/from16 v20, v15

    move-object v15, v2

    move-object/from16 v25, p3

    move/from16 v22, v13

    move-object/from16 v2, v16

    move-object/from16 v24, v19

    move-object/from16 v3, v21

    const/16 v19, 0x0

    move-object/from16 v13, p2

    move-object/from16 v16, v14

    move/from16 v21, v18

    const/16 v18, 0x0

    move-object v14, v11

    move-object v11, v9

    move-object/from16 v9, v23

    move-object/from16 v23, v1

    move-object/from16 v1, p0

    move-object/from16 p0, v0

    move-object/from16 v0, p1

    :goto_6
    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v26

    if-eqz v26, :cond_6

    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v26

    move-object/from16 v27, v3

    move-object/from16 v3, v26

    check-cast v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;

    iput-object v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v0, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    move-object/from16 v26, v1

    const/4 v1, 0x0

    iput-object v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v4, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v5, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v6, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v2, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v10, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v14, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v11, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v12, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v13, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v8, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v15, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    iput-object v9, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    move-object/from16 v1, v27

    iput-object v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    move-object/from16 v1, v25

    iput-object v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    move-object/from16 v1, v24

    iput-object v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    iput-object v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    move-object/from16 v1, v23

    iput-object v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    move-object/from16 v23, v9

    move-object/from16 v9, p0

    iput-object v9, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    move-object/from16 v28, v9

    const/4 v9, 0x0

    iput-object v9, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    iput-object v9, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    iput-object v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    move/from16 v9, v22

    iput v9, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$0:I

    move-object/from16 v22, v1

    move/from16 v1, v21

    iput-boolean v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->Z$0:Z

    move/from16 v1, v20

    iput v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$1:I

    move/from16 v1, v19

    iput v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$2:I

    move/from16 v1, v18

    iput v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$3:I

    const/4 v1, 0x0

    iput v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$4:I

    const/4 v1, 0x3

    iput v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->label:I

    invoke-static {v3, v0, v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v3, v16

    if-ne v1, v3, :cond_5

    move-object v1, v3

    goto/16 :goto_e

    :cond_5
    move-object/from16 v16, v24

    move-object/from16 v24, v0

    move-object v0, v1

    move-object/from16 v1, v26

    move-object/from16 v26, v16

    move-object/from16 v16, v23

    move/from16 v23, v9

    move-object/from16 v9, v16

    move-object/from16 v16, v14

    move-object v14, v13

    move-object v13, v12

    move-object/from16 v12, v27

    move-object/from16 v27, v25

    move-object/from16 v25, v22

    move/from16 v22, v21

    move/from16 v21, v20

    move/from16 v20, v19

    move/from16 v19, v18

    move-object/from16 v18, v15

    move-object v15, v8

    move-object v8, v7

    move-object/from16 v7, v25

    :goto_7
    check-cast v0, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-interface {v7, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 p0, v16

    move-object/from16 v16, v3

    move-object v3, v12

    move-object v12, v13

    move-object v13, v14

    move-object/from16 v14, p0

    move-object v7, v8

    move-object v8, v15

    move-object/from16 v15, v18

    move/from16 v18, v19

    move/from16 v19, v20

    move/from16 v20, v21

    move/from16 v21, v22

    move/from16 v22, v23

    move-object/from16 v0, v24

    move-object/from16 v23, v25

    move-object/from16 v24, v26

    move-object/from16 v25, v27

    move-object/from16 p0, v28

    goto/16 :goto_6

    :cond_6
    move-object/from16 v26, v23

    move-object/from16 v23, v9

    move/from16 v9, v22

    move-object/from16 v22, v26

    move-object/from16 v26, v1

    move-object/from16 v27, v3

    move-object/from16 v3, v16

    move-object/from16 v1, v22

    check-cast v1, Ljava/util/List;

    invoke-virtual/range {v26 .. v26}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getCreatedByUserId()Ljava/lang/String;

    move-result-object v3

    move-object/from16 p0, v3

    move-object/from16 v3, v26

    iput-object v3, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v0, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    const/4 v3, 0x0

    iput-object v3, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v4, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v5, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v6, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v2, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v10, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v14, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v11, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v12, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v13, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v8, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v15, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    move-object/from16 v3, v23

    iput-object v3, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    move-object/from16 v18, v2

    move-object/from16 v2, v27

    iput-object v2, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    move-object/from16 v2, v25

    iput-object v2, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    move-object/from16 v2, v24

    iput-object v2, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    iput-object v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    move-object/from16 p1, v1

    const/4 v1, 0x0

    iput-object v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    iput-object v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    iput-object v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    iput-object v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    iput-object v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    iput-object v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    iput v9, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$0:I

    move/from16 v1, v21

    iput-boolean v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->Z$0:Z

    move/from16 v1, v20

    iput v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$1:I

    const/4 v1, 0x4

    iput v1, v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->label:I

    move-object/from16 v1, p0

    invoke-interface {v0, v1, v7}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v19, v0

    move-object/from16 v0, v16

    if-ne v1, v0, :cond_7

    move-object v1, v0

    goto/16 :goto_e

    :cond_7
    move-object/from16 v16, v11

    move-object v11, v3

    move/from16 v3, v21

    move-object/from16 v21, v14

    move-object v14, v12

    move-object v12, v8

    move-object v8, v2

    move-object/from16 v2, p1

    :goto_8
    check-cast v1, Lio/getstream/chat/android/models/User;

    invoke-virtual/range {v26 .. v26}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getWatcherIds()Ljava/util/List;

    move-result-object v22

    move-object/from16 p0, v1

    move-object/from16 v1, v22

    check-cast v1, Ljava/lang/Iterable;

    move-object/from16 p1, v2

    new-instance v2, Ljava/util/ArrayList;

    move/from16 p2, v3

    move-object/from16 p3, v4

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object/from16 v24, p0

    move-object/from16 v3, p3

    move-object/from16 p0, v1

    move-object/from16 v23, v2

    move/from16 v22, v9

    move-object v9, v11

    move-object/from16 v4, v18

    move-object/from16 v2, v19

    move-object/from16 v1, v26

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v11, v7

    move-object/from16 v26, v8

    move-object/from16 v8, v16

    move-object/from16 v7, v21

    move/from16 v21, p2

    move-object/from16 v16, v0

    move-object/from16 v0, v27

    move-object/from16 v27, v25

    move-object/from16 v25, p1

    :goto_9
    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v28

    if-eqz v28, :cond_9

    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v28

    move-object/from16 p1, v0

    move-object/from16 v0, v28

    check-cast v0, Ljava/lang/String;

    iput-object v1, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v2, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    move-object/from16 v28, v1

    const/4 v1, 0x0

    iput-object v1, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v3, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v5, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v6, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v4, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v10, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v7, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v8, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v14, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v13, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v12, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v15, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    iput-object v9, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    move-object/from16 v1, p1

    iput-object v1, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    move-object/from16 v1, v27

    iput-object v1, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    move-object/from16 v1, v26

    iput-object v1, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    move-object/from16 v1, v25

    iput-object v1, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    move-object/from16 v1, v24

    iput-object v1, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    iput-object v1, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    move-object/from16 v1, v23

    iput-object v1, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    move-object/from16 v23, v9

    move-object/from16 v9, p0

    iput-object v9, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    const/4 v9, 0x0

    iput-object v9, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    iput-object v9, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    iput-object v1, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$26:Ljava/lang/Object;

    move/from16 v9, v22

    iput v9, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$0:I

    move-object/from16 v22, v1

    move/from16 v1, v21

    iput-boolean v1, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->Z$0:Z

    move/from16 v1, v20

    iput v1, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$1:I

    move/from16 v1, v19

    iput v1, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$2:I

    move/from16 v1, v18

    iput v1, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$3:I

    const/4 v1, 0x0

    iput v1, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$4:I

    const/4 v1, 0x5

    iput v1, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->label:I

    invoke-interface {v2, v0, v11}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v16

    if-ne v0, v1, :cond_8

    goto/16 :goto_e

    :cond_8
    move-object/from16 v16, v15

    move-object/from16 v29, v26

    move-object/from16 v30, v27

    move-object/from16 v15, p1

    move-object/from16 v26, v24

    move-object/from16 v27, v25

    move/from16 v24, v9

    move-object/from16 v25, v22

    move-object/from16 v9, p0

    move/from16 v22, v21

    move/from16 v21, v20

    move/from16 v20, v19

    move-object/from16 v19, v8

    move-object/from16 v8, v25

    :goto_a
    check-cast v0, Lio/getstream/chat/android/models/User;

    invoke-interface {v8, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 p0, v9

    move-object v0, v15

    move-object/from16 v15, v16

    move-object/from16 v8, v19

    move/from16 v19, v20

    move/from16 v20, v21

    move/from16 v21, v22

    move-object/from16 v9, v23

    move/from16 v22, v24

    move-object/from16 v23, v25

    move-object/from16 v24, v26

    move-object/from16 v25, v27

    move-object/from16 v26, v29

    move-object/from16 v27, v30

    move-object/from16 v16, v1

    move-object/from16 v1, v28

    goto/16 :goto_9

    :cond_9
    move-object/from16 p1, v23

    move-object/from16 v23, v9

    move/from16 v9, v22

    move-object/from16 v22, p1

    move-object/from16 p1, v0

    move-object/from16 v28, v1

    move-object/from16 v1, v16

    move-object/from16 v0, v22

    check-cast v0, Ljava/util/List;

    invoke-virtual/range {v28 .. v28}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getWatcherCount()I

    move-result v1

    move-object/from16 v17, v2

    invoke-virtual/range {v28 .. v28}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getTeam()Ljava/lang/String;

    move-result-object v2

    move/from16 p0, v1

    invoke-virtual/range {v28 .. v28}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getLastMessageAt()Ljava/util/Date;

    move-result-object v1

    move/from16 v18, v9

    invoke-virtual/range {v28 .. v28}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v9

    move-object/from16 p2, v9

    invoke-virtual/range {v28 .. v28}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getMembership()Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    move-result-object v9

    if-eqz v9, :cond_b

    move-object/from16 p3, v9

    move-object/from16 v9, v28

    iput-object v9, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    const/4 v9, 0x0

    iput-object v9, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v9, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v3, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v5, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v6, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v4, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v10, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v7, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v8, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v14, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v13, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v12, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v15, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    move-object/from16 v9, v23

    iput-object v9, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    move-object/from16 v19, v3

    move-object/from16 v3, p1

    iput-object v3, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    move-object/from16 v3, v27

    iput-object v3, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    move-object/from16 v3, v26

    iput-object v3, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    move-object/from16 v3, v25

    iput-object v3, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    move-object/from16 v3, v24

    iput-object v3, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    iput-object v0, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    iput-object v2, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    iput-object v1, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    move-object/from16 v22, v0

    move-object/from16 v0, p2

    iput-object v0, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    iput-object v0, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    iput-object v0, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$26:Ljava/lang/Object;

    move/from16 v0, v18

    iput v0, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$0:I

    move/from16 v0, v21

    iput-boolean v0, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->Z$0:Z

    move/from16 v0, v20

    iput v0, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$1:I

    move/from16 v0, p0

    iput v0, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$2:I

    const/4 v0, 0x6

    iput v0, v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->label:I

    move-object v0, v1

    move-object/from16 v1, p3

    move-object/from16 p3, v0

    move-object/from16 v0, v17

    invoke-static {v1, v0, v11}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v16

    if-ne v0, v1, :cond_a

    goto/16 :goto_e

    :cond_a
    move/from16 v17, p0

    move-object/from16 v23, p1

    move-object/from16 v16, v3

    move-object/from16 v24, v9

    move/from16 v3, v20

    move-object/from16 v9, p3

    move-object/from16 v20, v10

    move-object v10, v2

    move/from16 v2, v18

    move-object/from16 v18, v8

    move-object/from16 v8, p2

    :goto_b
    check-cast v0, Lio/getstream/chat/android/models/Member;

    move-object/from16 v31, v19

    move/from16 v19, v3

    move-object/from16 v3, v23

    move-object/from16 v23, v8

    move-object/from16 v8, v18

    move/from16 v18, v17

    move-object/from16 v17, v31

    move-object/from16 v31, v9

    move-object/from16 v32, v10

    move-object/from16 v34, v16

    move-object/from16 v10, v20

    move/from16 v20, v21

    move-object/from16 v33, v22

    move-object/from16 v9, v24

    move-object/from16 v22, v0

    move-object/from16 v16, v1

    move/from16 v21, v2

    move-object/from16 v35, v25

    move-object/from16 v24, v26

    move-object v2, v11

    :goto_c
    move-object/from16 v11, v27

    move-object/from16 v0, v28

    goto :goto_d

    :cond_b
    move-object/from16 v22, v0

    move-object/from16 p3, v1

    move-object/from16 v19, v3

    move-object/from16 v9, v23

    move-object/from16 v3, v24

    move-object/from16 v23, p2

    move-object/from16 v31, p3

    move-object/from16 v32, v2

    move-object/from16 v34, v3

    move-object/from16 v17, v19

    move/from16 v19, v20

    move/from16 v20, v21

    move-object/from16 v33, v22

    const/16 v22, 0x0

    move-object/from16 v3, p1

    move/from16 v21, v18

    move/from16 v18, p0

    move-object v2, v11

    move-object/from16 v35, v25

    move-object/from16 v24, v26

    goto :goto_c

    :goto_d
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getChannelId()Ljava/lang/String;

    move-result-object v1

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    move-object/from16 p0, v0

    const/4 v0, 0x0

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    move-object/from16 v0, v24

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    move-object/from16 v0, v35

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    move-object/from16 v25, v0

    move-object/from16 v0, v34

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    move-object/from16 v26, v0

    move-object/from16 v0, v33

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    move-object/from16 v27, v0

    move-object/from16 v0, v32

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    move-object/from16 v28, v0

    move-object/from16 v0, v31

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    move-object/from16 v29, v0

    move-object/from16 v0, v23

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    move-object/from16 v0, v22

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->L$26:Ljava/lang/Object;

    move/from16 v0, v21

    iput v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$0:I

    move/from16 v0, v20

    iput-boolean v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->Z$0:Z

    move/from16 v0, v19

    iput v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$1:I

    move/from16 v0, v18

    iput v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->I$2:I

    const/4 v0, 0x7

    iput v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt$toModel$1;->label:I

    move-object/from16 v0, v17

    invoke-interface {v0, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v16

    if-ne v0, v1, :cond_c

    :goto_e
    return-object v1

    :cond_c
    move-object/from16 v1, p0

    move-object/from16 v37, v3

    move-object/from16 v17, v6

    move-object/from16 v49, v7

    move-object/from16 v36, v9

    move-object/from16 v51, v12

    move/from16 v38, v21

    move-object/from16 v42, v22

    move-object/from16 v41, v23

    move-object/from16 v31, v25

    move-object/from16 v33, v26

    move-object/from16 v30, v27

    move-object/from16 v35, v28

    move-object/from16 v50, v29

    move-object/from16 v23, v8

    move-object/from16 v29, v11

    move-object/from16 v25, v14

    move-object/from16 v26, v15

    move/from16 v21, v18

    move/from16 v27, v19

    move/from16 v22, v20

    move-object/from16 v28, v24

    move-object/from16 v19, v4

    move-object/from16 v18, v5

    move-object/from16 v20, v10

    move-object/from16 v24, v13

    :goto_f
    move-object/from16 v45, v0

    check-cast v45, Lio/getstream/chat/android/models/DraftMessage;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getActiveLiveLocations()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    invoke-static {v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;)Lio/getstream/chat/android/models/Location;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_d
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;->getMessageCount()Ljava/lang/Integer;

    move-result-object v47

    new-instance v16, Lio/getstream/chat/android/models/Channel;

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v48, 0x0

    const v52, -0x733d8000

    move-object/from16 v46, v2

    invoke-direct/range {v16 .. v54}, Lio/getstream/chat/android/models/Channel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v16

    const/4 v1, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v1, v3, v1}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->syncUnreadCountWithReads$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
