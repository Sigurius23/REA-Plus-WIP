.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a8\u0010\n\u001a\u00020\u0000*\u00020\u00012\"\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0004H\u0080@\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/models/Reaction;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
        "toEntity",
        "(Lio/getstream/chat/android/models/Reaction;)Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
        "Lkotlin/Function2;",
        "",
        "Lq83/d;",
        "Lio/getstream/chat/android/models/User;",
        "",
        "getUser",
        "toModel",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;",
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
.method public static final toEntity(Lio/getstream/chat/android/models/Reaction;)Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;
    .locals 15

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Reaction;->getMessageId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Reaction;->fetchUserId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Reaction;->getScore()I

    move-result v5

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Reaction;->getCreatedAt()Ljava/util/Date;

    move-result-object v6

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Reaction;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v7

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Reaction;->getUpdatedAt()Ljava/util/Date;

    move-result-object v8

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Reaction;->getDeletedAt()Ljava/util/Date;

    move-result-object v9

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Reaction;->getExtraData()Ljava/util/Map;

    move-result-object v13

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Reaction;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v14

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Reaction;->getEnforceUnique()Z

    move-result v10

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Reaction;->getSkipPush()Z

    move-result v11

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Reaction;->getEmojiCode()Ljava/lang/String;

    move-result-object v12

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    invoke-direct/range {v1 .. v14}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;)V

    return-object v1
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p2

    instance-of v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt$toModel$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt$toModel$1;

    iget v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt$toModel$1;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt$toModel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt$toModel$1;

    invoke-direct {v1, v0}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt$toModel$1;->result:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt$toModel$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt$toModel$1;->I$0:I

    iget-object v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v5, Lc93/m;

    iget-object v1, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, v4

    move-object v4, v3

    move-object v3, v5

    move v5, v2

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->getMessageId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->getScore()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->getUserId()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v7, p0

    iput-object v7, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    const/4 v8, 0x0

    iput-object v8, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt$toModel$1;->L$2:Ljava/lang/Object;

    iput-object v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt$toModel$1;->L$3:Ljava/lang/Object;

    iput v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt$toModel$1;->I$0:I

    iput v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionMapperKt$toModel$1;->label:I

    move-object/from16 v4, p1

    invoke-interface {v4, v6, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    return-object v2

    :cond_3
    move-object v4, v3

    move-object v3, v0

    move-object v0, v1

    move-object v1, v7

    :goto_1
    move-object v6, v0

    check-cast v6, Lio/getstream/chat/android/models/User;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->getExtraData()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v13

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v8

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v9

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->getUpdatedAt()Ljava/util/Date;

    move-result-object v10

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->getDeletedAt()Ljava/util/Date;

    move-result-object v11

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object v12

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->getUserId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->getEnforceUnique()Z

    move-result v14

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->getSkipPush()Z

    move-result v15

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;->getEmojiCode()Ljava/lang/String;

    move-result-object v16

    new-instance v2, Lio/getstream/chat/android/models/Reaction;

    invoke-direct/range {v2 .. v16}, Lio/getstream/chat/android/models/Reaction;-><init>(Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;Ljava/util/Map;ZZLjava/lang/String;)V

    return-object v2
.end method
