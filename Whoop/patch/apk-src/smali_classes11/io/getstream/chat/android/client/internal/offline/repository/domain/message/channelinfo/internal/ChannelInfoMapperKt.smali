.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "toEntity",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;",
        "Lio/getstream/chat/android/models/ChannelInfo;",
        "toModel",
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
.method public static final toEntity(Lio/getstream/chat/android/models/ChannelInfo;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelInfo;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelInfo;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelInfo;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelInfo;->getMemberCount()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelInfo;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    return-object v1
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;)Lio/getstream/chat/android/models/ChannelInfo;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/models/ChannelInfo;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;->getMemberCount()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    move v5, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/channelinfo/internal/ChannelInfoEntity;->getName()Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lio/getstream/chat/android/models/ChannelInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
