.class public final Lio/getstream/chat/android/ui/common/utils/extensions/MessageFooterVisibilityKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\u0007"
    }
    d2 = {
        "shouldShowMessageFooter",
        "",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;",
        "message",
        "Lio/getstream/chat/android/models/Message;",
        "isLastMessageInGroup",
        "nextMessage",
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
.method public static final shouldShowMessageFooter(Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility;Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/models/Message;)Z
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    if-nez p3, :cond_0

    sget-object p3, Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$Never;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$Never;

    invoke-virtual {p0, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    return p1

    :cond_0
    sget-object p3, Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$Always;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$Always;

    invoke-virtual {p0, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    return p1

    :cond_1
    sget-object p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$LastInGroup;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$LastInGroup;

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return p2

    :cond_2
    sget-object p1, Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$Never;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/MessageFooterVisibility$Never;

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, 0x0

    return p0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
