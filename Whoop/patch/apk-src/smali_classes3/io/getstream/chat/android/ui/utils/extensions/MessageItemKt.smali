.class public final Lio/getstream/chat/android/ui/utils/extensions/MessageItemKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u000c\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u000c\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0001\u00a8\u0006\u0005"
    }
    d2 = {
        "isBottomPosition",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "isNotBottomPosition",
        "isErrorOrFailed",
        "stream-chat-android-ui-components_release"
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
.method public static final isBottomPosition(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Z
    .locals 2
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;->BOTTOM:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getPosition()Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    move-result-object v1

    if-eq v0, v1, :cond_1

    sget-object v0, Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;->NONE:Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getPosition()Lio/getstream/chat/android/ui/common/state/messages/list/MessagePosition;

    move-result-object p0

    if-ne v0, p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final isErrorOrFailed(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Z
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p0

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isErrorOrFailed(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final isNotBottomPosition(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Z
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/MessageItemKt;->isBottomPosition(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method
