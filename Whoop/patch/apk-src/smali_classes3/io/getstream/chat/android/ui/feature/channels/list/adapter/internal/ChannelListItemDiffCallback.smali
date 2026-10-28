.class public final Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemDiffCallback;
.super Landroidx/recyclerview/widget/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/u;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001b\u0010\u0008\u001a\u00020\u0007*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\r\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemDiffCallback;",
        "Landroidx/recyclerview/widget/u;",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;",
        "other",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;",
        "diff",
        "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;",
        "oldItem",
        "newItem",
        "",
        "areItemsTheSame",
        "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;)Z",
        "areContentsTheSame",
        "",
        "getChangePayload",
        "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;)Ljava/lang/Object;",
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


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemDiffCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemDiffCallback;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemDiffCallback;->INSTANCE:Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemDiffCallback;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final diff(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;
    .locals 13

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->getMembersExcludingCurrent$default(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v3

    invoke-static {v3, v1, v2, v1}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->getMembersExcludingCurrent$default(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v5, v0, 0x1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Channel;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v4, v0, 0x1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getRead()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Channel;->getRead()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v8, v0, 0x1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/ChannelKt;->getLastMessage(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v3

    invoke-static {v3}, Lio/getstream/chat/android/ui/utils/extensions/ChannelKt;->getLastMessage(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v7, v0, 0x1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    invoke-static {v0, v1, v2, v1}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->currentUserUnreadCount$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;ILjava/lang/Object;)I

    move-result v0

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v3

    invoke-static {v3, v1, v2, v1}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->currentUserUnreadCount$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;ILjava/lang/Object;)I

    move-result v1

    if-eq v0, v1, :cond_0

    move v9, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move v9, v0

    :goto_0
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getExtraData()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getExtraData()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v10, v0, 0x1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getTypingUsers()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getTypingUsers()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v11, v0, 0x1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getDraftMessage()Lio/getstream/chat/android/models/DraftMessage;

    move-result-object p1

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getDraftMessage()Lio/getstream/chat/android/models/DraftMessage;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 v12, p1, 0x1

    new-instance v3, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    move v6, v5

    invoke-direct/range {v3 .. v12}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;-><init>(ZZZZZZZZZ)V

    return-object v3
.end method


# virtual methods
.method public final areContentsTheSame(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;)Z
    .locals 2

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 3
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    .line 4
    check-cast p2, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    .line 5
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemDiffCallback;->diff(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->hasDifference()Z

    move-result p1

    if-nez p1, :cond_0

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    return v1
.end method

.method public final bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;

    check-cast p2, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemDiffCallback;->areContentsTheSame(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;)Z

    move-result p1

    return p1
.end method

.method public final areItemsTheSame(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;)Z
    .locals 2

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 3
    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    if-eqz v0, :cond_3

    .line 4
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object p1

    .line 5
    instance-of v0, p2, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    move-object p2, v1

    :cond_1
    check-cast p2, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    if-eqz p2, :cond_2

    .line 6
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v1

    :cond_2
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;

    check-cast p2, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemDiffCallback;->areItemsTheSame(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;)Z

    move-result p1

    return p1
.end method

.method public final getChangePayload(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;)Ljava/lang/Object;
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    .line 3
    check-cast p2, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    .line 4
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemDiffCallback;->diff(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;

    check-cast p2, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemDiffCallback;->getChangePayload(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
