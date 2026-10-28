.class public final Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewControllerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u001aK\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a-\u0010\u0014\u001a\u00020\u0013*\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\"\u0018\u0010\u0019\u001a\u00020\u0004*\u00020\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001a\"\u0018\u0010\u001b\u001a\u00020\u0004*\u00020\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/getstream/chat/android/models/ChannelData;",
        "channelData",
        "Lio/getstream/chat/android/models/Member;",
        "singleMember",
        "",
        "isMuted",
        "",
        "Lio/getstream/chat/android/models/Mute;",
        "mutedUsers",
        "",
        "blockedUserIds",
        "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;",
        "buildChannelOptionList",
        "(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;ZLjava/util/List;Ljava/util/List;)Ljava/util/List;",
        "Lec3/p1;",
        "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState;",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;",
        "transformation",
        "Ll83/a0;",
        "updateContent",
        "(Lec3/p1;Lkotlin/jvm/functions/Function1;)V",
        "",
        "MINIMUM_VISIBLE_MEMBERS",
        "I",
        "isGroupChannel",
        "(Lio/getstream/chat/android/models/ChannelData;)Z",
        "isDistinct",
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


# static fields
.field private static final MINIMUM_VISIBLE_MEMBERS:I = 0x5


# direct methods
.method public static final synthetic access$buildChannelOptionList(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;ZLjava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewControllerKt;->buildChannelOptionList(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;ZLjava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isGroupChannel(Lio/getstream/chat/android/models/ChannelData;)Z
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewControllerKt;->isGroupChannel(Lio/getstream/chat/android/models/ChannelData;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$updateContent(Lec3/p1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewControllerKt;->updateContent(Lec3/p1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final buildChannelOptionList(Lio/getstream/chat/android/models/ChannelData;Lio/getstream/chat/android/models/Member;ZLjava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/ChannelData;",
            "Lio/getstream/chat/android/models/Member;",
            "Z",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Mute;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewControllerKt;->isGroupChannel(Lio/getstream/chat/android/models/ChannelData;)Z

    move-result v3

    if-nez v3, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewControllerKt;->isGroupChannel(Lio/getstream/chat/android/models/ChannelData;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelData;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v4

    const-string v5, "update-channel-members"

    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$AddMember;->INSTANCE:Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$AddMember;

    invoke-virtual {v0, v4}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_1
    const-string v4, "delete-channel"

    const-string v5, "mute-channel"

    if-eqz v3, :cond_7

    sget-object v3, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$PinnedMessages;->INSTANCE:Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$PinnedMessages;

    invoke-virtual {v0, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    sget-object v3, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$MediaAttachments;->INSTANCE:Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$MediaAttachments;

    invoke-virtual {v0, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    sget-object v3, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$FilesAttachments;->INSTANCE:Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$FilesAttachments;

    invoke-virtual {v0, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelData;->getOwnCapabilities()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    new-instance v3, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$MuteChannel;

    invoke-direct {v3, p2}, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$MuteChannel;-><init>(Z)V

    invoke-virtual {v0, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_2
    check-cast p3, Ljava/lang/Iterable;

    instance-of p2, p3, Ljava/util/Collection;

    if-eqz p2, :cond_4

    move-object p2, p3

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_4

    :cond_3
    move v1, v2

    goto :goto_2

    :cond_4
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/getstream/chat/android/models/Mute;

    invoke-virtual {p3}, Lio/getstream/chat/android/models/Mute;->getTarget()Lio/getstream/chat/android/models/User;

    move-result-object p3

    if-eqz p3, :cond_6

    invoke-virtual {p3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object p3

    goto :goto_1

    :cond_6
    const/4 p3, 0x0

    :goto_1
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v3

    invoke-static {p3, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    :goto_2
    new-instance p2, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$MuteUser;

    invoke-direct {p2, v1}, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$MuteUser;-><init>(Z)V

    invoke-virtual {v0, p2}, Ln83/c;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p4, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    new-instance p2, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$BlockUser;

    invoke-direct {p2, p1}, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$BlockUser;-><init>(Z)V

    invoke-virtual {v0, p2}, Ln83/c;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelData;->getOwnCapabilities()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_b

    sget-object p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$DeleteChannel;->INSTANCE:Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$DeleteChannel;

    invoke-virtual {v0, p0}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelData;->getOwnCapabilities()Ljava/util/Set;

    move-result-object p1

    const-string p3, "update-channel"

    invoke-interface {p1, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    new-instance p1, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$EditChannel;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelData;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p1, p3}, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$EditChannel;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_8
    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelData;->getOwnCapabilities()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    new-instance p1, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$MuteChannel;

    invoke-direct {p1, p2}, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$MuteChannel;-><init>(Z)V

    invoke-virtual {v0, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_9
    sget-object p1, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$PinnedMessages;->INSTANCE:Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$PinnedMessages;

    invoke-virtual {v0, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    sget-object p1, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$MediaAttachments;->INSTANCE:Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$MediaAttachments;

    invoke-virtual {v0, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    sget-object p1, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$FilesAttachments;->INSTANCE:Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$FilesAttachments;

    invoke-virtual {v0, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelData;->getOwnCapabilities()Ljava/util/Set;

    move-result-object p1

    const-string p2, "leave-channel"

    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    sget-object p1, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$LeaveChannel;->INSTANCE:Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$LeaveChannel;

    invoke-virtual {v0, p1}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_a
    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelData;->getOwnCapabilities()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_b

    sget-object p0, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$DeleteChannel;->INSTANCE:Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content$Option$DeleteChannel;

    invoke-virtual {v0, p0}, Ln83/c;->add(Ljava/lang/Object;)Z

    :cond_b
    :goto_3
    invoke-static {v0}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p0

    return-object p0
.end method

.method private static final isDistinct(Lio/getstream/chat/android/models/ChannelData;)Z
    .locals 2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelData;->getId()Ljava/lang/String;

    move-result-object p0

    const-string v0, "!members"

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method

.method private static final isGroupChannel(Lio/getstream/chat/android/models/ChannelData;)Z
    .locals 2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/ChannelData;->getMemberCount()I

    move-result v0

    const/4 v1, 0x2

    if-gt v0, v1, :cond_1

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/channel/info/ChannelInfoViewControllerKt;->isDistinct(Lio/getstream/chat/android/models/ChannelData;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static final updateContent(Lec3/p1;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/p1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    :cond_0
    move-object v0, p0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState;

    instance-of v3, v2, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState$Content;

    if-eqz v3, :cond_1

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/ui/common/state/channel/info/ChannelInfoViewState;

    :cond_1
    invoke-virtual {v0, v1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method
