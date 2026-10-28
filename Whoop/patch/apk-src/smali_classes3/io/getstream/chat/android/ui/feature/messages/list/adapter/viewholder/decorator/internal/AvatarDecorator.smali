.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;
.super Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/BaseDecorator;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\'\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\'\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008 \u0010!J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008#\u0010$J\u001f\u0010&\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020%2\u0006\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008&\u0010\'J\u001f\u0010)\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020(2\u0006\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008)\u0010*J\u001f\u0010,\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020+2\u0006\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008,\u0010-J\u001f\u0010/\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020.2\u0006\u0010\t\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u00101R\u001a\u00103\u001a\u0002028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00083\u00104\u001a\u0004\u00085\u00106\u00a8\u00067"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/BaseDecorator;",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;",
        "showAvatarPredicate",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;)V",
        "Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;",
        "avatarView",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "data",
        "Ll83/a0;",
        "setupAvatar",
        "(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "myAvatar",
        "theirAvatar",
        "",
        "isMine",
        "getAvatarView",
        "(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Z)Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;",
        "controlVisibility",
        "(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Z)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;",
        "viewHolder",
        "decorateCustomAttachmentsMessage",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;",
        "decorateGiphyAttachmentMessage",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;",
        "decorateFileAttachmentsMessage",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;",
        "decorateMediaAttachmentsMessage",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;",
        "decoratePlainTextMessage",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;",
        "decorateLinkAttachmentsMessage",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;",
        "decorateGiphyMessage",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;",
        "decorateDeletedMessage",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;",
        "decoratePollMessage",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;",
        "type",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;",
        "getType",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;",
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


# instance fields
.field private final showAvatarPredicate:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;

.field private final type:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;)V
    .locals 1

    const-string v0, "showAvatarPredicate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->showAvatarPredicate:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;

    sget-object p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type$BuiltIn;->AVATAR:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type$BuiltIn;

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->type:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;

    return-void
.end method

.method private final controlVisibility(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Z)V
    .locals 3

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-nez p3, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    if-eqz p3, :cond_1

    move v0, v1

    :cond_1
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final getAvatarView(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Z)Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;
    .locals 0

    if-eqz p3, :cond_0

    return-object p1

    :cond_0
    return-object p2
.end method

.method private final setupAvatar(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->showAvatarPredicate:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;

    invoke-interface {v0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$ShowAvatarPredicate;->shouldShow(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    :goto_0
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p2

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p2

    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v0, v2}, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;->setUser$default(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/models/User;ZILjava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final decorateCustomAttachmentsMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 5

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v1, "userAvatarMineView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    move-result-object v2

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v3, "userAvatarView"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v4

    invoke-direct {p0, v0, v2, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->controlVisibility(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Z)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {p0, v0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->setupAvatar(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final decorateDeletedMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 5

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;->userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v1, "userAvatarMineView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;

    move-result-object v2

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v3, "userAvatarView"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v4

    invoke-direct {p0, v0, v2, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->controlVisibility(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Z)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;->userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {p0, v0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->setupAvatar(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final decorateFileAttachmentsMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 5

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v1, "userAvatarMineView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    move-result-object v2

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v3, "userAvatarView"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v4

    invoke-direct {p0, v0, v2, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->controlVisibility(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Z)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {p0, v0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->setupAvatar(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final decorateGiphyAttachmentMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 5

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v1, "userAvatarMineView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

    move-result-object v2

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v3, "userAvatarView"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v4

    invoke-direct {p0, v0, v2, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->controlVisibility(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Z)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {p0, v0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->setupAvatar(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final decorateGiphyMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 1

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "data"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final decorateLinkAttachmentsMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 5

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v1, "userAvatarMineView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;

    move-result-object v2

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v3, "userAvatarView"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v4

    invoke-direct {p0, v0, v2, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->controlVisibility(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Z)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {p0, v0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->setupAvatar(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final decorateMediaAttachmentsMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 5

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;->userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v1, "userAvatarMineView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;

    move-result-object v2

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v3, "userAvatarView"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v4

    invoke-direct {p0, v0, v2, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->controlVisibility(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Z)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;->userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {p0, v0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->setupAvatar(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final decoratePlainTextMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 5

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v1, "userAvatarMineView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;

    move-result-object v2

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v3, "userAvatarView"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v4

    invoke-direct {p0, v0, v2, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->controlVisibility(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Z)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {p0, v0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->setupAvatar(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final decoratePollMessage(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 5

    const-string v0, "viewHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v1, "userAvatarMineView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;

    move-result-object v2

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v3, "userAvatarView"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v4

    invoke-direct {p0, v0, v2, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->controlVisibility(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Z)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-direct {p0, v0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->setupAvatar(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final getType()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/AvatarDecorator;->type:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;

    return-object v0
.end method
