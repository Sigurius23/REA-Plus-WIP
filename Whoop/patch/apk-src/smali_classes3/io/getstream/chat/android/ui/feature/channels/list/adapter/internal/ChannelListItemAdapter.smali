.class public final Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;
.super Landroidx/recyclerview/widget/z0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/z0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\'\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J-\u0010\u0017\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00082\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u001cJ\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;",
        "Landroidx/recyclerview/widget/z0;",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;",
        "viewHolderFactory",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;)V",
        "",
        "position",
        "holder",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;",
        "payload",
        "Ll83/a0;",
        "bind",
        "(ILio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;)V",
        "getItemViewType",
        "(I)I",
        "Landroid/view/ViewGroup;",
        "parent",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;",
        "onBindViewHolder",
        "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;I)V",
        "",
        "",
        "payloads",
        "(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;ILjava/util/List;)V",
        "",
        "cid",
        "Lio/getstream/chat/android/models/Channel;",
        "getChannel$stream_chat_android_ui_components_release",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;",
        "getChannel",
        "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;",
        "Companion",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter$Companion;

.field private static final EMPTY_CHANNEL_LIST_ITEM_PAYLOAD_DIFF:Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

.field private static final FULL_CHANNEL_LIST_ITEM_PAYLOAD_DIFF:Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;


# instance fields
.field private final viewHolderFactory:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;->Companion:Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter$Companion;

    new-instance v1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    const/4 v9, 0x1

    const/4 v10, 0x1

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x1

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;-><init>(ZZZZZZZZZ)V

    sput-object v1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;->FULL_CHANNEL_LIST_ITEM_PAYLOAD_DIFF:Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    new-instance v2, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;-><init>(ZZZZZZZZZ)V

    sput-object v2, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;->EMPTY_CHANNEL_LIST_ITEM_PAYLOAD_DIFF:Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;)V
    .locals 1

    const-string v0, "viewHolderFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemDiffCallback;->INSTANCE:Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemDiffCallback;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/z0;-><init>(Landroidx/recyclerview/widget/u;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;

    return-void
.end method

.method public static final synthetic access$getEMPTY_CHANNEL_LIST_ITEM_PAYLOAD_DIFF$cp()Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;->EMPTY_CHANNEL_LIST_ITEM_PAYLOAD_DIFF:Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    return-object v0
.end method

.method private final bind(ILio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;)V
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$LoadingMoreItem;

    if-nez v0, :cond_1

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    invoke-virtual {p2, p1, p3}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;->bind(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;)V

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    return-void
.end method


# virtual methods
.method public final getChannel$stream_chat_android_ui_components_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;
    .locals 3

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/z0;->getCurrentList()Ljava/util/List;

    move-result-object v0

    const-string v1, "getCurrentList(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter$getChannel$$inlined$filterIsInstance$1;->INSTANCE:Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter$getChannel$$inlined$filterIsInstance$1;

    invoke-static {v0, v1}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object v0

    new-instance v1, Lxb3/e;

    invoke-direct {v1, v0}, Lxb3/e;-><init>(Lxb3/f;)V

    :cond_0
    invoke-virtual {v1}, Lxb3/e;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lxb3/e;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem$ChannelItem;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v0, "Sequence contains no element matching the predicate."

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getItemViewType(I)I
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "getItem(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;->getItemViewType(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListItem;)I

    move-result p1

    return p1
.end method

.method public final bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;->onBindViewHolder(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;I)V

    return-void
.end method

.method public final bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;ILjava/util/List;)V
    .locals 0

    .line 2
    check-cast p1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;

    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;->onBindViewHolder(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;ILjava/util/List;)V

    return-void
.end method

.method public final onBindViewHolder(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget-object v0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;->FULL_CHANNEL_LIST_ITEM_PAYLOAD_DIFF:Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    invoke-direct {p0, p2, p1, v0}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;->bind(ILio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;)V

    return-void
.end method

.method public final onBindViewHolder(Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;ILjava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payloads"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    check-cast p3, Ljava/lang/Iterable;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_1
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_3

    .line 8
    sget-object p3, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;->FULL_CHANNEL_LIST_ITEM_PAYLOAD_DIFF:Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    invoke-static {p3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :cond_3
    check-cast v0, Ljava/lang/Iterable;

    .line 9
    sget-object p3, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;->EMPTY_CHANNEL_LIST_ITEM_PAYLOAD_DIFF:Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    .line 11
    invoke-virtual {p3, v1}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;->plus(Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;)Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;

    move-result-object p3

    goto :goto_2

    .line 12
    :cond_4
    invoke-direct {p0, p2, p1, p3}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;->bind(ILio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;Lio/getstream/chat/android/ui/feature/channels/list/adapter/ChannelListPayloadDiff;)V

    return-void
.end method

.method public final bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;
    .locals 1

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/channels/list/adapter/internal/ChannelListItemAdapter;->viewHolderFactory:Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/ChannelListItemViewHolderFactory;->createViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/channels/list/adapter/viewholder/BaseChannelListItemViewHolder;

    move-result-object p1

    return-object p1
.end method
