.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a8\u0010\n\u001a\u00020\u0000*\u00020\u00012\"\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0004H\u0080@\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/models/Member;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;",
        "toEntity",
        "(Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;",
        "Lkotlin/Function2;",
        "",
        "Lq83/d;",
        "Lio/getstream/chat/android/models/User;",
        "",
        "getUser",
        "toModel",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;",
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
.method public static final toEntity(Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;
    .locals 20

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getCreatedAt()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getUpdatedAt()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->isInvited()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_0
    move v6, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getInviteAcceptedAt()Ljava/util/Date;

    move-result-object v7

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getInviteRejectedAt()Ljava/util/Date;

    move-result-object v8

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getShadowBanned()Z

    move-result v9

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getBanned()Z

    move-result v10

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getChannelRole()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getNotificationsMuted()Ljava/lang/Boolean;

    move-result-object v12

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getStatus()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getBanExpires()Ljava/util/Date;

    move-result-object v14

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getExtraData()Ljava/util/Map;

    move-result-object v17

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getPinnedAt()Ljava/util/Date;

    move-result-object v15

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getArchivedAt()Ljava/util/Date;

    move-result-object v16

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    const/16 v18, 0x2

    const/16 v19, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v19}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;ZLjava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Member;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p2

    instance-of v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberMapperKt$toModel$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberMapperKt$toModel$1;

    iget v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberMapperKt$toModel$1;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberMapperKt$toModel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberMapperKt$toModel$1;

    invoke-direct {v1, v0}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberMapperKt$toModel$1;->result:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberMapperKt$toModel$1;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lc93/m;

    iget-object v1, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->getUserId()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v3, p0

    iput-object v3, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput v4, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberMapperKt$toModel$1;->label:I

    move-object/from16 v4, p1

    invoke-interface {v4, v0, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_3

    return-object v2

    :cond_3
    move-object v1, v3

    :goto_1
    move-object v3, v0

    check-cast v3, Lio/getstream/chat/android/models/User;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->getUpdatedAt()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->isInvited()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->getInviteAcceptedAt()Ljava/util/Date;

    move-result-object v7

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->getInviteRejectedAt()Ljava/util/Date;

    move-result-object v8

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->getShadowBanned()Z

    move-result v9

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->getBanned()Z

    move-result v10

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->getChannelRole()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->getNotificationsMuted()Ljava/lang/Boolean;

    move-result-object v12

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->getStatus()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->getBanExpires()Ljava/util/Date;

    move-result-object v14

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->getPinnedAt()Ljava/util/Date;

    move-result-object v15

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->getArchivedAt()Ljava/util/Date;

    move-result-object v16

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;->getExtraData()Ljava/util/Map;

    move-result-object v17

    new-instance v2, Lio/getstream/chat/android/models/Member;

    invoke-direct/range {v2 .. v17}, Lio/getstream/chat/android/models/Member;-><init>(Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;)V

    return-object v2
.end method
