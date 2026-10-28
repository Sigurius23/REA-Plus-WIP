.class public final Lio/getstream/chat/android/ui/common/feature/messages/composer/capabilities/MessageComposerCapabilitiesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "canSendMessage",
        "",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;",
        "canUploadFile",
        "stream-chat-android-ui-common_release"
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
.method public static final canSendMessage(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v0

    const-string v1, "send-message"

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v1

    const-string v2, "send-reply"

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getMessageMode()Lio/getstream/chat/android/ui/common/state/messages/MessageMode;

    move-result-object v2

    instance-of v2, v2, Lio/getstream/chat/android/ui/common/state/messages/MessageMode$MessageThread;

    if-eqz v2, :cond_0

    move v0, v1

    :cond_0
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getSendEnabled()Z

    move-result p0

    if-eqz p0, :cond_1

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final canUploadFile(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getOwnCapabilities()Ljava/util/Set;

    move-result-object p0

    const-string v0, "upload-file"

    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
