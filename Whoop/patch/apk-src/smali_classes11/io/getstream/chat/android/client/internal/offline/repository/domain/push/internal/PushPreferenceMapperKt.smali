.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "toEntity",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;",
        "Lio/getstream/chat/android/models/PushPreference;",
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
.method public static final toEntity(Lio/getstream/chat/android/models/PushPreference;)Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/PushPreference;->getLevel()Lio/getstream/chat/android/models/PushPreferenceLevel;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/models/PushPreferenceLevel;->getValue()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/PushPreference;->getDisabledUntil()Ljava/util/Date;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;-><init>(Ljava/lang/String;Ljava/util/Date;)V

    return-object v0
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;)Lio/getstream/chat/android/models/PushPreference;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/PushPreference;

    sget-object v1, Lio/getstream/chat/android/models/PushPreferenceLevel;->Companion:Lio/getstream/chat/android/models/PushPreferenceLevel$Companion;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;->getLevel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/models/PushPreferenceLevel$Companion;->fromValue(Ljava/lang/String;)Lio/getstream/chat/android/models/PushPreferenceLevel;

    move-result-object v1

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/push/internal/PushPreferenceEntity;->getDisabledUntil()Ljava/util/Date;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lio/getstream/chat/android/models/PushPreference;-><init>(Lio/getstream/chat/android/models/PushPreferenceLevel;Ljava/util/Date;)V

    return-object v0
.end method
