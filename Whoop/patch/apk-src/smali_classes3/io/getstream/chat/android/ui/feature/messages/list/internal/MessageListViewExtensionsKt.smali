.class public final Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListViewExtensionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a*\u0010\u0008\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a,\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a,\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a,\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a\"\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a\u001e\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a,\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00042\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a\u001e\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "canReplyToMessage",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "ownCapabilities",
        "",
        "",
        "canThreadReplyToMessage",
        "isInThread",
        "canCopyMessage",
        "canEditMessage",
        "currentUser",
        "Lio/getstream/chat/android/models/User;",
        "canDeleteMessage",
        "canFlagMessage",
        "canPinMessage",
        "canBlockUser",
        "canMarkAsUnread",
        "canRetryMessage",
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
.method public static final canBlockUser(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getBlockUserEnabled()Z

    move-result p0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->canBlockUser(ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method public static final canCopyMessage(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getCopyTextEnabled()Z

    move-result p0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->canCopyMessage(ZLio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method public static final canDeleteMessage(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getDeleteMessageEnabled()Z

    move-result p0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->canDeleteMessage(ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z

    move-result p0

    return p0
.end method

.method public static final canEditMessage(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getEditMessageEnabled()Z

    move-result p0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->canEditMessage(ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z

    move-result p0

    return p0
.end method

.method public static final canFlagMessage(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getFlagEnabled()Z

    move-result p0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->canFlagMessage(ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z

    move-result p0

    return p0
.end method

.method public static final canMarkAsUnread(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getMarkAsUnreadEnabled()Z

    move-result p0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->canMarkAsUnread(ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z

    move-result p0

    return p0
.end method

.method public static final canPinMessage(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getPinMessageEnabled()Z

    move-result p0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->canPinMessage(ZLio/getstream/chat/android/models/Message;Ljava/util/Set;)Z

    move-result p0

    return p0
.end method

.method public static final canReplyToMessage(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getReplyEnabled()Z

    move-result p0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->canReplyToMessage(ZLio/getstream/chat/android/models/Message;Ljava/util/Set;)Z

    move-result p0

    return p0
.end method

.method public static final canRetryMessage(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getRetryMessageEnabled()Z

    move-result p0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->canRetryMessage(ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method public static final canThreadReplyToMessage(Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;ZLio/getstream/chat/android/models/Message;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;",
            "Z",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;->getThreadsEnabled()Z

    move-result p0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->canThreadReplyToMessage(ZZLio/getstream/chat/android/models/Message;Ljava/util/Set;)Z

    move-result p0

    return p0
.end method
