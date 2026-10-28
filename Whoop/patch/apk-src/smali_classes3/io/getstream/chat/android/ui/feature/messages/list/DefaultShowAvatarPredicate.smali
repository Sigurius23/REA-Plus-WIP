.class public final Lio/getstream/chat/android/ui/feature/messages/list/DefaultShowAvatarPredicate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/DefaultShowAvatarPredicate;",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;",
        "<init>",
        "()V",
        "shouldShow",
        "",
        "messageItem",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final shouldShow(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Z
    .locals 1

    const-string v0, "messageItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isTheirs()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getShowMessageFooter()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/MessageItemKt;->isBottomPosition(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
