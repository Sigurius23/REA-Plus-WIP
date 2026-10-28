.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "toEntity",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;",
        "Lio/getstream/chat/android/PrivacySettings;",
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
.method public static final toEntity(Lio/getstream/chat/android/PrivacySettings;)Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/PrivacySettings;->getTypingIndicators()Lio/getstream/chat/android/TypingIndicators;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/TypingIndicatorsEntity;

    invoke-virtual {v0}, Lio/getstream/chat/android/TypingIndicators;->getEnabled()Z

    move-result v0

    invoke-direct {v2, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/TypingIndicatorsEntity;-><init>(Z)V

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {p0}, Lio/getstream/chat/android/PrivacySettings;->getReadReceipts()Lio/getstream/chat/android/ReadReceipts;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v3, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/ReadReceiptsEntity;

    invoke-virtual {v0}, Lio/getstream/chat/android/ReadReceipts;->getEnabled()Z

    move-result v0

    invoke-direct {v3, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/ReadReceiptsEntity;-><init>(Z)V

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    invoke-virtual {p0}, Lio/getstream/chat/android/PrivacySettings;->getDeliveryReceipts()Lio/getstream/chat/android/DeliveryReceipts;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DeliveryReceiptsEntity;

    invoke-virtual {p0}, Lio/getstream/chat/android/DeliveryReceipts;->getEnabled()Z

    move-result p0

    invoke-direct {v1, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DeliveryReceiptsEntity;-><init>(Z)V

    :cond_2
    new-instance p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;

    invoke-direct {p0, v2, v3, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/TypingIndicatorsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/ReadReceiptsEntity;Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DeliveryReceiptsEntity;)V

    return-object p0
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;)Lio/getstream/chat/android/PrivacySettings;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;->getTypingIndicators()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/TypingIndicatorsEntity;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v2, Lio/getstream/chat/android/TypingIndicators;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/TypingIndicatorsEntity;->getEnabled()Z

    move-result v0

    invoke-direct {v2, v0}, Lio/getstream/chat/android/TypingIndicators;-><init>(Z)V

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;->getReadReceipts()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/ReadReceiptsEntity;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v3, Lio/getstream/chat/android/ReadReceipts;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/ReadReceiptsEntity;->getEnabled()Z

    move-result v0

    invoke-direct {v3, v0}, Lio/getstream/chat/android/ReadReceipts;-><init>(Z)V

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/PrivacySettingsEntity;->getDeliveryReceipts()Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DeliveryReceiptsEntity;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v1, Lio/getstream/chat/android/DeliveryReceipts;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/DeliveryReceiptsEntity;->getEnabled()Z

    move-result p0

    invoke-direct {v1, p0}, Lio/getstream/chat/android/DeliveryReceipts;-><init>(Z)V

    :cond_2
    new-instance p0, Lio/getstream/chat/android/PrivacySettings;

    invoke-direct {p0, v2, v1, v3}, Lio/getstream/chat/android/PrivacySettings;-><init>(Lio/getstream/chat/android/TypingIndicators;Lio/getstream/chat/android/DeliveryReceipts;Lio/getstream/chat/android/ReadReceipts;)V

    return-object p0
.end method
