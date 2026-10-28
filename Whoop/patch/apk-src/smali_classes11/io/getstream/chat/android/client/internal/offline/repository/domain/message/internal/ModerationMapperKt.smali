.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "toEntity",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;",
        "Lio/getstream/chat/android/models/Moderation;",
        "toDomain",
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
.method public static final toDomain(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;)Lio/getstream/chat/android/models/Moderation;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/models/Moderation;

    sget-object v0, Lio/getstream/chat/android/models/ModerationAction;->Companion:Lio/getstream/chat/android/models/ModerationAction$Companion;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/models/ModerationAction$Companion;->fromValue(Ljava/lang/String;)Lio/getstream/chat/android/models/ModerationAction;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;->getOriginalText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;->getTextHarms()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;->getImageHarms()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;->getBlocklistMatched()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;->getSemanticFilterMatched()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;->getPlatformCircumvented()Z

    move-result v8

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/models/Moderation;-><init>(Lio/getstream/chat/android/models/ModerationAction;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public static final toEntity(Lio/getstream/chat/android/models/Moderation;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Moderation;->getAction()Lio/getstream/chat/android/models/ModerationAction;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/ModerationAction;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Moderation;->getOriginalText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Moderation;->getTextHarms()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Moderation;->getImageHarms()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Moderation;->getBlocklistMatched()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Moderation;->getSemanticFilterMatched()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Moderation;->getPlatformCircumvented()Z

    move-result v8

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v1
.end method
