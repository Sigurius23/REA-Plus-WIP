.class public final Lio/getstream/chat/android/client/utils/UserUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a8\u0006\u0005"
    }
    d2 = {
        "mergePartially",
        "Lio/getstream/chat/android/models/User;",
        "that",
        "isMoreUpToDateThan",
        "",
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
.method private static final isMoreUpToDateThan(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/User;)Z
    .locals 2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getCreatedAt()Ljava/util/Date;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object v0

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getCreatedAt()Ljava/util/Date;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object v1

    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v0

    if-gtz v0, :cond_5

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getUpdatedAt()Ljava/util/Date;

    move-result-object p0

    if-nez p0, :cond_2

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object p0

    :cond_2
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getUpdatedAt()Ljava/util/Date;

    move-result-object p1

    if-nez p1, :cond_3

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object p1

    :cond_3
    invoke-virtual {p0, p1}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result p0

    if-lez p0, :cond_4

    goto :goto_0

    :cond_4
    const/4 p0, 0x0

    return p0

    :cond_5
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final mergePartially(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/User;
    .locals 29
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "that"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/utils/UserUtilsKt;->isMoreUpToDateThan(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/User;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getRole()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getCreatedAt()Ljava/util/Date;

    move-result-object v12

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getUpdatedAt()Ljava/util/Date;

    move-result-object v13

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getLastActive()Ljava/util/Date;

    move-result-object v14

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getBanned()Ljava/lang/Boolean;

    move-result-object v9

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getImage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getPrivacySettings()Lio/getstream/chat/android/PrivacySettings;

    move-result-object v7

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getExtraData()Ljava/util/Map;

    move-result-object v25

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getMutes()Ljava/util/List;

    move-result-object v18

    const v27, 0x17ee351

    const/16 v28, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v1 .. v28}, Lio/getstream/chat/android/models/User;->copy$default(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILjava/lang/Object;)Lio/getstream/chat/android/models/User;

    move-result-object v0

    return-object v0

    :cond_0
    return-object p0
.end method
