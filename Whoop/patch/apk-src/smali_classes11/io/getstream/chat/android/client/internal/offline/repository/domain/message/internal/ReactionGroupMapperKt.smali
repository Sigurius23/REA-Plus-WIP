.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "toModel",
        "Lio/getstream/chat/android/models/ReactionGroup;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;",
        "toEntity",
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
.method public static final toEntity(Lio/getstream/chat/android/models/ReactionGroup;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ReactionGroup;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ReactionGroup;->getCount()I

    move-result v3

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ReactionGroup;->getSumScore()I

    move-result v4

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ReactionGroup;->getFirstReactionAt()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ReactionGroup;->getLastReactionAt()Ljava/util/Date;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;-><init>(Ljava/lang/String;IILjava/util/Date;Ljava/util/Date;)V

    return-object v1
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;)Lio/getstream/chat/android/models/ReactionGroup;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/models/ReactionGroup;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;->getCount()I

    move-result v3

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;->getSumScore()I

    move-result v4

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;->getFirstReactionAt()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ReactionGroupEntity;->getLastReactionAt()Ljava/util/Date;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/models/ReactionGroup;-><init>(Ljava/lang/String;IILjava/util/Date;Ljava/util/Date;)V

    return-object v1
.end method
