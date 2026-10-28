.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u00aa\u0001\u0010\u0010\u001a\u00020\u0000*\u00020\u00012\"\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00042$\u0010\u000b\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00042$\u0010\r\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00042$\u0010\u000f\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0004H\u0080@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0013\u0010\u0002\u001a\u00020\u0013*\u00020\u0012H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0014\u001a8\u0010\u0010\u001a\u00020\u0012*\u00020\u00132\"\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0004H\u0080@\u00a2\u0006\u0004\u0008\u0010\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/models/Thread;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;",
        "toEntity",
        "(Lio/getstream/chat/android/models/Thread;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;",
        "Lkotlin/Function2;",
        "",
        "Lq83/d;",
        "Lio/getstream/chat/android/models/User;",
        "",
        "getUser",
        "Lio/getstream/chat/android/models/Message;",
        "getMessage",
        "Lio/getstream/chat/android/models/Channel;",
        "getChannel",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "getDraftMessage",
        "toModel",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/ThreadParticipant;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;",
        "(Lio/getstream/chat/android/models/ThreadParticipant;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;",
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
.method public static final toEntity(Lio/getstream/chat/android/models/Thread;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;
    .locals 16

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getParentMessageId()Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getCid()Ljava/lang/String;

    move-result-object v3

    .line 3
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getCreatedByUserId()Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getActiveParticipantCount()I

    move-result v5

    .line 5
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getParticipantCount()I

    move-result v6

    .line 6
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getThreadParticipants()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 7
    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v0, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 9
    check-cast v9, Lio/getstream/chat/android/models/ThreadParticipant;

    .line 10
    invoke-static {v9}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt;->toEntity(Lio/getstream/chat/android/models/ThreadParticipant;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;

    move-result-object v9

    .line 11
    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getLastMessageAt()Ljava/util/Date;

    move-result-object v0

    .line 13
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getCreatedAt()Ljava/util/Date;

    move-result-object v9

    .line 14
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getUpdatedAt()Ljava/util/Date;

    move-result-object v10

    .line 15
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getDeletedAt()Ljava/util/Date;

    move-result-object v11

    .line 16
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getTitle()Ljava/lang/String;

    move-result-object v12

    .line 17
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getRead()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    .line 18
    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v13, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_1

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .line 20
    check-cast v15, Lio/getstream/chat/android/models/ChannelUserRead;

    .line 21
    invoke-static {v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadMapperKt;->toEntity(Lio/getstream/chat/android/models/ChannelUserRead;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;

    move-result-object v15

    .line 22
    invoke-interface {v14, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 23
    :cond_1
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getLatestReplies()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    move-object v15, v14

    .line 24
    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v13, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v14, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 26
    check-cast v13, Lio/getstream/chat/android/models/Message;

    .line 27
    invoke-virtual {v13}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v13

    .line 28
    invoke-interface {v14, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 29
    :cond_2
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Thread;->getExtraData()Ljava/util/Map;

    move-result-object v1

    move-object v13, v15

    move-object v15, v1

    .line 30
    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    move-object v8, v0

    invoke-direct/range {v1 .. v15}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V

    return-object v1
.end method

.method public static final toEntity(Lio/getstream/chat/android/models/ThreadParticipant;)Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;

    .line 32
    invoke-virtual {p0}, Lio/getstream/chat/android/models/ThreadParticipant;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    .line 33
    invoke-virtual {p0}, Lio/getstream/chat/android/models/ThreadParticipant;->getLastThreadMessageAt()Ljava/util/Date;

    move-result-object p0

    .line 34
    invoke-direct {v0, v1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;-><init>(Ljava/lang/String;Ljava/util/Date;)V

    return-object v0
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 71
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Thread;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p2

    move-object/from16 v1, p5

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;

    .line 1
    invoke-direct {v2, v1}, Ls83/c;-><init>(Lq83/d;)V

    .line 2
    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    .line 3
    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->label:I

    packed-switch v4, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$1:I

    iget v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$0:I

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v7, Ljava/util/Date;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v8, Ljava/util/Date;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v9, Ljava/util/Date;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v10, Ljava/util/Date;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v12, Lio/getstream/chat/android/models/User;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v14, Lio/getstream/chat/android/models/Channel;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    move/from16 p0, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    move-object/from16 p1, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p2, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v11

    move-object v11, v10

    move-object v10, v2

    move v2, v3

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    move-object v4, v14

    move-object v3, v15

    move-object/from16 v5, p2

    move-object v15, v6

    move-object v14, v7

    move-object v7, v13

    move-object/from16 v6, p1

    move-object v13, v8

    move-object v8, v12

    move-object v12, v9

    move/from16 v9, p0

    goto/16 :goto_c

    :pswitch_1
    iget v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$4:I

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$3:I

    iget v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$2:I

    iget v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$1:I

    iget v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$0:I

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    check-cast v10, Ljava/util/Iterator;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Iterable;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    check-cast v11, Ljava/util/Collection;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v13, Ljava/lang/String;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v14, Ljava/util/Date;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v15, Ljava/util/Date;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v6, Ljava/util/Date;

    iget-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v7, Ljava/util/Date;

    move/from16 p0, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p1, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/User;

    move-object/from16 p2, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p3, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Channel;

    move-object/from16 p4, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v17, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    move-object/from16 v18, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v19, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v20, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v21, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v22, v18

    move/from16 v18, p0

    move-object/from16 p0, v20

    move/from16 v20, v5

    move-object/from16 v5, v19

    move/from16 v19, v4

    move-object v4, v7

    move-object v7, v6

    move-object v6, v2

    move-object/from16 v2, v22

    move-object/from16 v22, v11

    move-object v11, v0

    move-object/from16 v0, v22

    move/from16 v22, v8

    move/from16 v23, v9

    move-object/from16 v24, v12

    move-object/from16 v27, v13

    move-object/from16 v12, p1

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move-object v13, v3

    move-object/from16 v3, p2

    goto/16 :goto_a

    :pswitch_2
    iget v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$3:I

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$2:I

    iget v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$1:I

    iget v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$0:I

    iget-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    check-cast v9, Ljava/util/Collection;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    check-cast v11, Ljava/util/Date;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v12, Ljava/util/Date;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v13, Ljava/util/Date;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v14, Ljava/util/Date;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    move/from16 v17, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/User;

    move-object/from16 p0, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p1, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Channel;

    move-object/from16 p2, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 p3, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/models/Message;

    move-object/from16 p4, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v18, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v19, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v20, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 v21, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move/from16 v22, v5

    move/from16 v23, v6

    move-object/from16 v26, v8

    move-object/from16 v24, v9

    move-object/from16 v25, v10

    move-object v9, v12

    move-object/from16 v5, v18

    move-object/from16 v10, v21

    move-object v12, v0

    move-object v6, v2

    move/from16 v21, v4

    move-object v8, v7

    move-object v0, v14

    move-object v4, v15

    move/from16 v18, v17

    move-object/from16 v14, p1

    move-object/from16 v15, p2

    move-object/from16 v2, p4

    move-object v7, v3

    move-object/from16 v17, v13

    move-object/from16 v13, p0

    move-object/from16 v3, p3

    goto/16 :goto_8

    :pswitch_3
    iget v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$3:I

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$2:I

    iget v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$1:I

    iget v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$0:I

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    check-cast v10, Ljava/util/Collection;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Iterable;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Iterable;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/models/User;

    iget-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v13, Lio/getstream/chat/android/models/Channel;

    iget-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v15, Lio/getstream/chat/android/models/Message;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    move/from16 v18, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 p0, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 p1, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    move-object/from16 p2, v0

    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v19, v12

    move-object v12, v0

    move-object v0, v3

    move-object v3, v14

    move-object/from16 v14, v19

    move-object/from16 v20, p1

    move-object/from16 v19, v10

    move/from16 v21, v18

    move-object/from16 v10, p0

    move-object/from16 v18, v13

    move-object v13, v11

    move-object/from16 v11, p2

    goto/16 :goto_6

    :pswitch_4
    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/models/Channel;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/models/Message;

    iget-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v8, Lc93/m;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v9, Lc93/m;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v9, Lc93/m;

    iget-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v10, Lc93/m;

    iget-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_5
    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/models/Message;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v6, Lc93/m;

    iget-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v7, Lc93/m;

    iget-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v7, Lc93/m;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v8, Lc93/m;

    iget-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, v8

    move-object v11, v9

    move-object v8, v6

    move-object v9, v7

    move-object v6, v4

    move-object v7, v5

    move-object v5, v0

    goto/16 :goto_3

    :pswitch_6
    iget-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    check-cast v4, Lc93/m;

    iget-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v5, Lc93/m;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v6, Lc93/m;

    iget-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lc93/m;

    iget-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v70, v1

    move-object v1, v0

    move-object v0, v6

    move-object v6, v7

    move-object v7, v5

    move-object v5, v8

    move-object/from16 v8, v70

    goto :goto_2

    :pswitch_7
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    .line 4
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->getParentMessageId()Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->getParentMessageId()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v5, p0

    iput-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    move-object/from16 v6, p1

    iput-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    move-object/from16 v7, p3

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    move-object/from16 v8, p4

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    const/4 v9, 0x1

    iput v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->label:I

    invoke-interface {v0, v4, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_1

    :goto_1
    move-object v6, v3

    goto/16 :goto_b

    :cond_1
    move-object/from16 v70, v8

    move-object v8, v4

    move-object/from16 v4, v70

    :goto_2
    check-cast v8, Lio/getstream/chat/android/models/Message;

    if-nez v8, :cond_2

    new-instance v18, Lio/getstream/chat/android/models/Message;

    const v68, 0xffff

    const/16 v69, 0x0

    const/16 v19, 0x0

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

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, -0x1

    invoke-direct/range {v18 .. v69}, Lio/getstream/chat/android/models/Message;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v8, v18

    .line 6
    :cond_2
    invoke-virtual {v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->getCid()Ljava/lang/String;

    move-result-object v9

    .line 7
    invoke-virtual {v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->getCid()Ljava/lang/String;

    move-result-object v10

    iput-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    const/4 v11, 0x0

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    const/4 v11, 0x2

    iput v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->label:I

    invoke-interface {v7, v10, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_3

    goto/16 :goto_1

    :cond_3
    move-object v10, v7

    move-object v7, v1

    move-object v1, v10

    move-object v11, v5

    move-object v10, v6

    move-object v6, v8

    move-object v5, v9

    move-object v9, v0

    move-object v8, v4

    .line 8
    :goto_3
    move-object v4, v1

    check-cast v4, Lio/getstream/chat/android/models/Channel;

    .line 9
    invoke-virtual {v11}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->getCreatedByUserId()Ljava/lang/String;

    move-result-object v0

    .line 10
    invoke-virtual {v11}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->getCreatedByUserId()Ljava/lang/String;

    move-result-object v1

    iput-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    const/4 v12, 0x0

    iput-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v0, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    const/4 v12, 0x3

    iput v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->label:I

    invoke-interface {v10, v1, v2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_4

    goto/16 :goto_1

    .line 11
    :cond_4
    :goto_4
    check-cast v1, Lio/getstream/chat/android/models/User;

    .line 12
    invoke-virtual {v11}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->getActiveParticipantCount()I

    move-result v12

    .line 13
    invoke-virtual {v11}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->getParticipantCount()I

    move-result v13

    .line 14
    invoke-virtual {v11}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->getThreadParticipants()Ljava/util/List;

    move-result-object v14

    check-cast v14, Ljava/lang/Iterable;

    .line 15
    new-instance v15, Ljava/util/ArrayList;

    move-object/from16 p0, v0

    move-object/from16 p1, v1

    const/16 v0, 0xa

    invoke-static {v14, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 v18, v3

    move-object v14, v4

    move-object v3, v5

    move-object v1, v6

    move-object v5, v7

    move v7, v12

    move v6, v13

    const/16 v19, 0x0

    move-object/from16 v13, p0

    move-object/from16 v12, p1

    move-object v4, v0

    const/4 v0, 0x0

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move/from16 v21, v0

    .line 17
    move-object/from16 v0, v20

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;

    .line 18
    iput-object v11, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v10, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    move-object/from16 v20, v9

    const/4 v9, 0x0

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v14, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v13, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v12, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    iput-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    iput-object v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    iput-object v15, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    iput v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$0:I

    iput v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$1:I

    move/from16 v9, v21

    iput v9, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$2:I

    move-object/from16 v21, v1

    move/from16 v1, v19

    iput v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$3:I

    const/4 v1, 0x0

    iput v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$4:I

    const/4 v1, 0x4

    iput v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->label:I

    invoke-static {v0, v10, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v0, v18

    if-ne v1, v0, :cond_5

    move-object v6, v0

    goto/16 :goto_b

    :cond_5
    move/from16 v18, v9

    move-object v9, v4

    move/from16 v4, v18

    move-object/from16 v18, v14

    move-object v14, v13

    move-object v13, v12

    move-object v12, v11

    move-object v11, v10

    move-object v10, v8

    move-object v8, v15

    move-object/from16 v15, v21

    move/from16 v21, v19

    move-object/from16 v19, v8

    :goto_6
    check-cast v1, Lio/getstream/chat/android/models/ThreadParticipant;

    .line 19
    invoke-interface {v8, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v8, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v1, v15

    move-object/from16 v14, v18

    move-object/from16 v15, v19

    move/from16 v19, v21

    move-object/from16 v18, v0

    move v0, v4

    move-object v4, v9

    move-object/from16 v9, v20

    goto/16 :goto_5

    :cond_6
    move-object/from16 v21, v1

    move-object/from16 v20, v9

    move-object/from16 v0, v18

    .line 20
    check-cast v15, Ljava/util/List;

    .line 21
    invoke-static {v15}, Lio/getstream/chat/android/client/extensions/internal/ThreadKt;->sortedByLastReply(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .line 22
    invoke-virtual {v11}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->getLastMessageAt()Ljava/util/Date;

    move-result-object v4

    .line 23
    invoke-virtual {v11}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v9

    .line 24
    invoke-virtual {v11}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->getUpdatedAt()Ljava/util/Date;

    move-result-object v15

    .line 25
    invoke-virtual {v11}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->getDeletedAt()Ljava/util/Date;

    move-result-object v18

    .line 26
    invoke-virtual {v11}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->getTitle()Ljava/lang/String;

    move-result-object v19

    .line 27
    invoke-virtual {v11}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->getRead()Ljava/util/List;

    move-result-object v22

    move-object/from16 p0, v1

    move-object/from16 v1, v22

    check-cast v1, Ljava/lang/Iterable;

    move-object/from16 v22, v2

    .line 28
    new-instance v2, Ljava/util/ArrayList;

    move-object/from16 v23, v3

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v3, v4

    move-object/from16 v4, p0

    move-object/from16 p0, v1

    move-object/from16 v1, v20

    move/from16 v20, v6

    move-object/from16 v6, v22

    move-object/from16 v22, v2

    move-object/from16 v2, v21

    move/from16 v21, v7

    move-object/from16 v7, v18

    move-object/from16 v18, v0

    move-object v0, v3

    move-object v3, v15

    move-object v15, v9

    move-object v9, v3

    move-object/from16 v3, v23

    const/16 v17, 0x0

    move-object/from16 v23, v19

    const/16 v19, 0x0

    :goto_7
    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v24

    if-eqz v24, :cond_8

    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v24

    move-object/from16 v25, v7

    .line 30
    move-object/from16 v7, v24

    check-cast v7, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;

    .line 31
    iput-object v11, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    iput-object v10, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    move-object/from16 v24, v1

    const/4 v1, 0x0

    iput-object v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v8, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v5, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v2, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v3, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v14, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v13, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v12, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v4, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v15, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    iput-object v9, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    move-object/from16 v1, v25

    iput-object v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    move-object/from16 v25, v0

    move-object/from16 v0, v23

    iput-object v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    iput-object v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    move-object/from16 v0, v22

    iput-object v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    move-object/from16 v22, v1

    move-object/from16 v1, p0

    iput-object v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    move-object/from16 v26, v1

    const/4 v1, 0x0

    iput-object v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    iput-object v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    iput-object v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    move/from16 v1, v21

    iput v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$0:I

    move-object/from16 v21, v0

    move/from16 v0, v20

    iput v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$1:I

    move/from16 v0, v19

    iput v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$2:I

    move/from16 v0, v17

    iput v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$3:I

    const/4 v0, 0x0

    iput v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$4:I

    const/4 v0, 0x5

    iput v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->label:I

    invoke-static {v7, v10, v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v7, v18

    if-ne v0, v7, :cond_7

    move-object v6, v7

    goto/16 :goto_b

    :cond_7
    move/from16 v18, v1

    move-object v1, v0

    move-object/from16 v0, v25

    move-object/from16 v25, v23

    move/from16 v23, v18

    move/from16 v18, v17

    move-object/from16 v17, v15

    move-object v15, v14

    move-object v14, v13

    move-object v13, v12

    move-object v12, v11

    move-object/from16 v11, v22

    move/from16 v22, v20

    move-object/from16 v20, v24

    move-object/from16 v24, v21

    move/from16 v21, v19

    move-object/from16 v19, v8

    move-object/from16 v8, v24

    :goto_8
    check-cast v1, Lio/getstream/chat/android/models/ChannelUserRead;

    .line 32
    invoke-interface {v8, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 p0, v18

    move-object/from16 v18, v7

    move-object v7, v11

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move-object/from16 v15, v17

    move/from16 v17, p0

    move-object/from16 v8, v19

    move-object/from16 v1, v20

    move/from16 v19, v21

    move/from16 v20, v22

    move/from16 v21, v23

    move-object/from16 v22, v24

    move-object/from16 v23, v25

    move-object/from16 p0, v26

    goto/16 :goto_7

    :cond_8
    move-object/from16 v25, v0

    move-object/from16 v24, v1

    move/from16 v1, v21

    move-object/from16 v21, v22

    move-object/from16 v22, v7

    move-object/from16 v7, v18

    .line 33
    move-object/from16 v0, v21

    check-cast v0, Ljava/util/List;

    .line 34
    invoke-virtual {v11}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->getLatestReplyIds()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    .line 35
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    .line 36
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-object/from16 p0, v10

    move-object v7, v15

    move/from16 v21, v20

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v10, v3

    move-object v15, v9

    move-object v3, v12

    move-object v9, v14

    move-object/from16 v14, v22

    move/from16 v22, v1

    move-object v12, v4

    move-object/from16 v1, v24

    move-object/from16 v4, v25

    move-object/from16 v24, v0

    move-object v0, v8

    move-object v8, v13

    move-object/from16 v13, v23

    move-object/from16 v23, v17

    const/16 v17, 0x0

    :goto_9
    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v25

    if-eqz v25, :cond_b

    invoke-interface/range {p0 .. p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v25

    move-object/from16 v26, v13

    .line 37
    move-object/from16 v13, v25

    check-cast v13, Ljava/lang/String;

    .line 38
    iput-object v11, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    move-object/from16 v25, v11

    const/4 v11, 0x0

    iput-object v11, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v11, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v5, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v2, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v10, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v9, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v8, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v3, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v12, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v4, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v7, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    iput-object v15, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    iput-object v14, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    move-object/from16 v11, v26

    iput-object v11, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    move-object/from16 v26, v0

    move-object/from16 v0, v24

    iput-object v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    iput-object v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    move-object/from16 v27, v11

    move-object/from16 v11, v23

    iput-object v11, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    iput-object v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    move-object/from16 v11, p0

    iput-object v11, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    iput-object v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    iput-object v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    iput-object v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    move/from16 v0, v22

    iput v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$0:I

    move-object/from16 v22, v11

    move/from16 v11, v21

    iput v11, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$1:I

    move/from16 v11, v20

    iput v11, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$2:I

    move/from16 v11, v19

    iput v11, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$3:I

    move/from16 v11, v17

    iput v11, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$4:I

    const/4 v11, 0x0

    iput v11, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$5:I

    iput v11, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$6:I

    const/4 v11, 0x6

    iput v11, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->label:I

    invoke-interface {v1, v13, v6}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object/from16 v13, v18

    if-ne v11, v13, :cond_9

    move-object v6, v13

    goto/16 :goto_b

    :cond_9
    move-object/from16 p0, v23

    move/from16 v23, v0

    move-object/from16 v0, p0

    move/from16 v18, v17

    move-object/from16 p0, v26

    move-object/from16 v17, v10

    move-object/from16 v10, v22

    move/from16 v22, v21

    move-object/from16 v21, v1

    move-object v1, v11

    move-object/from16 v11, v25

    :goto_a
    check-cast v1, Lio/getstream/chat/android/models/Message;

    if-eqz v1, :cond_a

    .line 39
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_a
    move-object/from16 v1, v21

    move/from16 v21, v22

    move/from16 v22, v23

    move-object/from16 v23, v0

    move-object/from16 v0, p0

    move-object/from16 p0, v10

    move-object/from16 v10, v17

    move/from16 v17, v18

    move-object/from16 v18, v13

    move-object/from16 v13, v27

    goto/16 :goto_9

    :cond_b
    move-object/from16 v26, v0

    move-object/from16 v25, v11

    move-object/from16 v27, v13

    move-object/from16 v13, v18

    move/from16 v0, v22

    .line 40
    move-object/from16 v1, v23

    check-cast v1, Ljava/util/List;

    .line 41
    invoke-virtual/range {v25 .. v25}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->getParentMessageId()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v13, v25

    iput-object v13, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    const/4 v13, 0x0

    iput-object v13, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v13, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v13, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput-object v13, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$4:Ljava/lang/Object;

    iput-object v5, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$5:Ljava/lang/Object;

    iput-object v2, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$6:Ljava/lang/Object;

    iput-object v10, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$7:Ljava/lang/Object;

    iput-object v9, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$8:Ljava/lang/Object;

    iput-object v8, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$9:Ljava/lang/Object;

    iput-object v3, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$10:Ljava/lang/Object;

    iput-object v12, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$11:Ljava/lang/Object;

    iput-object v4, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$12:Ljava/lang/Object;

    iput-object v7, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$13:Ljava/lang/Object;

    iput-object v15, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$14:Ljava/lang/Object;

    iput-object v14, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$15:Ljava/lang/Object;

    move-object/from16 v13, v27

    iput-object v13, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$16:Ljava/lang/Object;

    move-object/from16 v17, v2

    move-object/from16 v2, v24

    iput-object v2, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$17:Ljava/lang/Object;

    iput-object v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$18:Ljava/lang/Object;

    move-object/from16 p0, v1

    const/4 v1, 0x0

    iput-object v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$19:Ljava/lang/Object;

    iput-object v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$20:Ljava/lang/Object;

    iput-object v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$21:Ljava/lang/Object;

    iput-object v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$22:Ljava/lang/Object;

    iput-object v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$23:Ljava/lang/Object;

    iput-object v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$24:Ljava/lang/Object;

    iput-object v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->L$25:Ljava/lang/Object;

    iput v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$0:I

    move/from16 v1, v21

    iput v1, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->I$1:I

    move/from16 v16, v0

    const/4 v0, 0x7

    iput v0, v6, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$1;->label:I

    move-object/from16 v0, v26

    invoke-interface {v0, v11, v6}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v6, v18

    if-ne v0, v6, :cond_c

    :goto_b
    return-object v6

    :cond_c
    move-object v6, v8

    move-object v8, v3

    move-object v3, v10

    move-object v10, v12

    move-object v12, v7

    move-object v7, v6

    move-object v6, v15

    move-object v15, v13

    move-object v13, v6

    move-object v11, v4

    move-object v4, v9

    move-object/from16 v6, v17

    move v9, v1

    move-object/from16 v17, v2

    move/from16 v2, v16

    move-object/from16 v16, p0

    move-object v1, v0

    move-object/from16 v0, v25

    .line 42
    :goto_c
    move-object/from16 v18, v1

    check-cast v18, Lio/getstream/chat/android/models/DraftMessage;

    .line 43
    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadEntity;->getExtraData()Ljava/util/Map;

    move-result-object v19

    .line 44
    new-instance v1, Lio/getstream/chat/android/models/Thread;

    invoke-direct/range {v1 .. v19}, Lio/getstream/chat/android/models/Thread;-><init>(ILjava/lang/String;Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Lio/getstream/chat/android/models/Message;Ljava/lang/String;Lio/getstream/chat/android/models/User;ILjava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/DraftMessage;Ljava/util/Map;)V

    return-object v1

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

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/ThreadParticipant;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$5;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$5;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$5;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$5;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$5;

    .line 45
    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    .line 46
    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$5;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    .line 47
    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$5;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$5;->L$1:Ljava/lang/Object;

    check-cast p0, Lc93/m;

    iget-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$5;->L$0:Ljava/lang/Object;

    check-cast p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    .line 48
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;->getUserId()Ljava/lang/String;

    move-result-object p2

    iput-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$5;->L$0:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$5;->L$1:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadMapperKt$toModel$5;->label:I

    invoke-interface {p1, p2, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    .line 49
    :cond_3
    :goto_1
    check-cast p2, Lio/getstream/chat/android/models/User;

    .line 50
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/threads/internal/ThreadParticipantEntity;->getLastThreadMessageAt()Ljava/util/Date;

    move-result-object p0

    .line 51
    new-instance p1, Lio/getstream/chat/android/models/ThreadParticipant;

    invoke-direct {p1, p2, p0}, Lio/getstream/chat/android/models/ThreadParticipant;-><init>(Lio/getstream/chat/android/models/User;Ljava/util/Date;)V

    return-object p1
.end method
