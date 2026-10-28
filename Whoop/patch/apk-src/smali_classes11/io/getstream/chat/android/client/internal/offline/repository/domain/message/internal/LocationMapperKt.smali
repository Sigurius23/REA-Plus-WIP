.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "toModel",
        "Lio/getstream/chat/android/models/Location;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;",
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
.method public static final toEntity(Lio/getstream/chat/android/models/Location;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Location;->getMessageId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Location;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Location;->getUserId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Location;->getEndAt()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Location;->getLatitude()D

    move-result-wide v6

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Location;->getLongitude()D

    move-result-wide v8

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Location;->getDeviceId()Ljava/lang/String;

    move-result-object v10

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;DDLjava/lang/String;)V

    return-object v1
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;)Lio/getstream/chat/android/models/Location;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;->getMessageId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;->getUserId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;->getEndAt()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;->getLatitude()D

    move-result-wide v6

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;->getLongitude()D

    move-result-wide v8

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/LocationEntity;->getDeviceId()Ljava/lang/String;

    move-result-object v10

    new-instance v1, Lio/getstream/chat/android/models/Location;

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/models/Location;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;DDLjava/lang/String;)V

    return-object v1
.end method
