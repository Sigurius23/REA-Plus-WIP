.class public final Lio/getstream/chat/android/ui/common/utils/extensions/MessageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u001a\u000c\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "isMine",
        "",
        "Lio/getstream/chat/android/models/Message;",
        "chatClient",
        "Lio/getstream/chat/android/client/ChatClient;",
        "currentUser",
        "Lio/getstream/chat/android/models/User;",
        "shouldShowMessageStatusIndicator",
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
.method public static final isMine(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/client/ChatClient;)Z
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object p1

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/User;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final isMine(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Z
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final shouldShowMessageStatusIndicator(Lio/getstream/chat/android/models/Message;)Z
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isEphemeral(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object p0

    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->FAILED_PERMANENTLY:Lio/getstream/chat/android/models/SyncStatus;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
