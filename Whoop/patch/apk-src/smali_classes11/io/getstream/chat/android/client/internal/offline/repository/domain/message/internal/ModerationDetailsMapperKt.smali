.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsMapperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000c\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "toEntity",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;",
        "Lio/getstream/chat/android/models/MessageModerationDetails;",
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
.method public static final toEntity(Lio/getstream/chat/android/models/MessageModerationDetails;)Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/MessageModerationDetails;->getOriginalText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/MessageModerationDetails;->getAction()Lio/getstream/chat/android/models/MessageModerationAction;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/MessageModerationAction;->getRawValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/MessageModerationDetails;->getErrorMsg()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;)Lio/getstream/chat/android/models/MessageModerationDetails;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/models/MessageModerationDetails;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;->getOriginalText()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lio/getstream/chat/android/models/MessageModerationAction;->Companion:Lio/getstream/chat/android/models/MessageModerationAction$Companion;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/models/MessageModerationAction$Companion;->fromRawValue(Ljava/lang/String;)Lio/getstream/chat/android/models/MessageModerationAction;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/ModerationDetailsEntity;->getErrorMsg()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lio/getstream/chat/android/models/MessageModerationDetails;-><init>(Ljava/lang/String;Lio/getstream/chat/android/models/MessageModerationAction;Ljava/lang/String;)V

    return-object v0
.end method
