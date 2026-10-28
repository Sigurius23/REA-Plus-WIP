.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "toEntity",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;",
        "Lio/getstream/chat/android/models/Mute;",
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
.method public static final toEntity(Lio/getstream/chat/android/models/Mute;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Mute;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Mute;->getTarget()Lio/getstream/chat/android/models/User;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    :cond_1
    move-object v3, v2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Mute;->getCreatedAt()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Mute;->getUpdatedAt()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Mute;->getExpires()Ljava/util/Date;

    move-result-object v6

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V

    return-object v1
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;)Lio/getstream/chat/android/models/Mute;
    .locals 33

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;->getUserId()Ljava/lang/String;

    move-result-object v3

    const/4 v0, 0x0

    if-eqz v3, :cond_0

    new-instance v2, Lio/getstream/chat/android/models/User;

    const v28, 0x1fffffe

    const/16 v29, 0x0

    const/4 v4, 0x0

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v2 .. v29}, Lio/getstream/chat/android/models/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object v4, v0

    :goto_0
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;->getTargetId()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_1

    new-instance v5, Lio/getstream/chat/android/models/User;

    const v31, 0x1fffffe

    const/16 v32, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

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

    invoke-direct/range {v5 .. v32}, Lio/getstream/chat/android/models/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    move-object v5, v0

    :goto_1
    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;->getCreatedAt()Ljava/util/Date;

    move-result-object v6

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;->getUpdatedAt()Ljava/util/Date;

    move-result-object v7

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserMuteEntity;->getExpires()Ljava/util/Date;

    move-result-object v8

    new-instance v3, Lio/getstream/chat/android/models/Mute;

    invoke-direct/range {v3 .. v8}, Lio/getstream/chat/android/models/Mute;-><init>(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;)V

    return-object v3
.end method
