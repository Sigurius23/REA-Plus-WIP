.class public final Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u000c\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u000c\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u000c\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0016\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0002\u001a\u000c\u0010\t\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0012\u0010\n\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u001a\u0012\u0010\r\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u001a\u0012\u0010\u000f\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u001a\u0012\u0010\u0011\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u001a\u0012\u0010\u0012\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u001a$\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00022\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u001a,\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00022\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u001a\u0016\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0002\u001a.\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0015\u001a\u00020\u00022\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u001a.\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0015\u001a\u00020\u00022\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u001a.\u0010\u0010\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0015\u001a\u00020\u00022\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u001a$\u0010\u0011\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00022\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u001a(\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%\u001a \u0010&\u001a\u00020\u00012\u0006\u0010\'\u001a\u00020\u00012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0015\u001a\u00020\u0002\u001a.\u0010\u0012\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u00012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0015\u001a\u00020\u00022\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u001a \u0010)\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0015\u001a\u00020\u0002\u00a8\u0006+"
    }
    d2 = {
        "isMessageFailed",
        "",
        "Lio/getstream/chat/android/models/Message;",
        "isSynced",
        "isTextOnly",
        "hasLinks",
        "isOwnMessage",
        "currentUser",
        "Lio/getstream/chat/android/models/User;",
        "isGiphyCommand",
        "canEditOwnMessage",
        "",
        "",
        "canEditAnyMessage",
        "canDeleteOwnMessage",
        "canDeleteAnyMessage",
        "canFlagMessage",
        "canPinMessage",
        "canMarkAsUnread",
        "canReplyToMessage",
        "replyEnabled",
        "message",
        "ownCapabilities",
        "canThreadReplyToMessage",
        "threadsEnabled",
        "isInThread",
        "canCopyMessage",
        "copyTextEnabled",
        "canEditMessage",
        "editMessageEnabled",
        "canDeleteMessage",
        "deleteMessageEnabled",
        "flagEnabled",
        "pinMessageEnabled",
        "canMuteUser",
        "muteUserEnabled",
        "channel",
        "Lio/getstream/chat/android/models/Channel;",
        "canBlockUser",
        "blockUserEnabled",
        "markAsUnreadEnabled",
        "canRetryMessage",
        "retryMessageEnabled",
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
.method public static final canBlockUser(ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-static {p2, p1}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->isOwnMessage(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final canCopyMessage(ZLio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_1

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->isTextOnly(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    if-nez p0, :cond_0

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->hasLinks(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private static final canDeleteAnyMessage(Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "delete-any-message"

    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final canDeleteMessage(ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_2

    invoke-static {p2, p1}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->isOwnMessage(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "delete-own-message"

    invoke-interface {p3, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    :cond_0
    const-string p0, "delete-any-message"

    invoke-interface {p3, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private static final canDeleteOwnMessage(Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "delete-own-message"

    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final canEditAnyMessage(Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "update-any-message"

    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final canEditMessage(ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_2

    invoke-static {p2, p1}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->isOwnMessage(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "update-own-message"

    invoke-interface {p3, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    :cond_0
    const-string p0, "update-any-message"

    invoke-interface {p3, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    :cond_1
    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getCommand()Ljava/lang/String;

    move-result-object p0

    const-string p1, "giphy"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    invoke-static {p2}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isPoll(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    if-nez p0, :cond_2

    invoke-static {p2}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->hasSharedLocation(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    if-nez p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private static final canEditOwnMessage(Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "update-own-message"

    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final canFlagMessage(Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "flag-message"

    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final canFlagMessage(ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    .line 2
    const-string p0, "flag-message"

    invoke-interface {p3, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 3
    invoke-static {p2, p1}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->isOwnMessage(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final canMarkAsUnread(Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "read-events"

    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final canMarkAsUnread(ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lio/getstream/chat/android/models/User;",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    .line 2
    const-string p0, "read-events"

    invoke-interface {p3, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 3
    invoke-static {p2, p1}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->isOwnMessage(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final canMuteUser(ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Channel;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channel"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Channel;->getConfig()Lio/getstream/chat/android/models/Config;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Config;->getMuteEnabled()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p2, p1}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->isOwnMessage(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final canPinMessage(Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "pin-message"

    invoke-interface {p0, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static final canPinMessage(ZLio/getstream/chat/android/models/Message;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    .line 2
    invoke-static {p1}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->isSynced(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 3
    const-string p0, "pin-message"

    invoke-interface {p2, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final canReplyToMessage(ZLio/getstream/chat/android/models/Message;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->isSynced(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    if-nez p0, :cond_0

    const-string p0, "quote-message"

    invoke-interface {p2, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final canRetryMessage(ZLio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-static {p2, p1}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->isOwnMessage(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p2}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->isMessageFailed(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final canThreadReplyToMessage(ZZLio/getstream/chat/android/models/Message;Ljava/util/Set;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lio/getstream/chat/android/models/Message;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ownCapabilities"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    if-nez p1, :cond_0

    invoke-static {p2}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isThreadReply(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    if-nez p0, :cond_0

    invoke-static {p2}, Lio/getstream/chat/android/ui/common/utils/CapabilitiesHelperKt;->isSynced(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "send-reply"

    invoke-interface {p3, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final hasLinks(Lio/getstream/chat/android/models/Message;)Z
    .locals 3

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;->hasLink(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v0}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isGiphy(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method private static final isGiphyCommand(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getCommand()Ljava/lang/String;

    move-result-object p0

    const-string v0, "giphy"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final isMessageFailed(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object p0

    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->FAILED_PERMANENTLY:Lio/getstream/chat/android/models/SyncStatus;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final isOwnMessage(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Z
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static final isSynced(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getSyncStatus()Lio/getstream/chat/android/models/SyncStatus;

    move-result-object p0

    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final isTextOnly(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
