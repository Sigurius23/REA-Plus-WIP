.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a8\u0010\n\u001a\u00020\u0000*\u00020\u00012\"\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0004H\u0080@\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/models/ChannelUserRead;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;",
        "toEntity",
        "(Lio/getstream/chat/android/models/ChannelUserRead;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;",
        "Lkotlin/Function2;",
        "",
        "Lq83/d;",
        "Lio/getstream/chat/android/models/User;",
        "",
        "getUser",
        "toModel",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;",
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
.method public static final toEntity(Lio/getstream/chat/android/models/ChannelUserRead;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelUserRead;->getUserId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReceivedEventDate()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelUserRead;->getUnreadMessages()I

    move-result v4

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastRead()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastDeliveredAt()Ljava/util/Date;

    move-result-object v7

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelUserRead;->getLastDeliveredMessageId()Ljava/lang/String;

    move-result-object v8

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;-><init>(Ljava/lang/String;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    return-object v1
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;",
            "Lc93/m;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/ChannelUserRead;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadMapperKt$toModel$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadMapperKt$toModel$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadMapperKt$toModel$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadMapperKt$toModel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadMapperKt$toModel$1;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadMapperKt$toModel$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadMapperKt$toModel$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    check-cast p0, Lc93/m;

    iget-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;->getUserId()Ljava/lang/String;

    move-result-object p2

    iput-object p0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadMapperKt$toModel$1;->L$0:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadMapperKt$toModel$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadMapperKt$toModel$1;->label:I

    invoke-interface {p1, p2, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    move-object v1, p2

    check-cast v1, Lio/getstream/chat/android/models/User;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;->getLastReceivedEventDate()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;->getUnreadMessages()I

    move-result v3

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;->getLastRead()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;->getLastReadMessageId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;->getLastDeliveredAt()Ljava/util/Date;

    move-result-object v6

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;->getLastDeliveredMessageId()Ljava/lang/String;

    move-result-object v7

    new-instance v0, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/models/ChannelUserRead;-><init>(Lio/getstream/chat/android/models/User;Ljava/util/Date;ILjava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    return-object v0
.end method
