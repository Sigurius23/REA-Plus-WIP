.class public final Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/SelfUserUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "Lio/getstream/chat/android/models/User;",
        "currentUser",
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUser;",
        "receivedUser",
        "Ll83/a0;",
        "updateCurrentUser",
        "(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUser;)V",
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
.method public static final updateCurrentUser(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUser;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "receivedUser"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUserFull;

    if-eqz v0, :cond_0

    check-cast p2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUserFull;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUserFull;->getMe()Lio/getstream/chat/android/models/User;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of v0, p2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUserPart;

    if-eqz v0, :cond_3

    if-eqz p1, :cond_1

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUserPart;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUserPart;->getMe()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/client/utils/UserUtilsKt;->mergePartially(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/User;)Lio/getstream/chat/android/models/User;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    check-cast p2, Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUserPart;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUserPart;->getMe()Lio/getstream/chat/android/models/User;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->isBanned()Z

    move-result p2

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->setBanned(Z)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getMutes()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->setMutedUsers(Ljava/util/List;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getChannelMutes()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->setChannelMutes(Ljava/util/List;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getTotalUnreadCount()I

    move-result p2

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->setTotalUnreadCount(I)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getUnreadChannels()I

    move-result p2

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->setChannelUnreadCount(I)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getUnreadThreads()I

    move-result p2

    invoke-virtual {p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->setUnreadThreadsCount(I)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getBlockedUserIds()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->setBlockedUserIds(Ljava/util/List;)V

    return-void

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
