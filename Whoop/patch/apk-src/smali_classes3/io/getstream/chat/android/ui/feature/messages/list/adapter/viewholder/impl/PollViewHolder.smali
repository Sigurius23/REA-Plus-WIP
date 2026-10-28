.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;
.super Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder<",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0017R\u001a\u0010\r\u001a\u00020\u000c8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;",
        "decorators",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
        "messageListListeners",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "style",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;",
        "binding",
        "<init>",
        "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;)V",
        "data",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;",
        "diff",
        "Ll83/a0;",
        "bindData",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;",
        "getBinding$stream_chat_android_ui_components_release",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;

.field private final messageListListeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

.field private final style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;",
            ">;",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;",
            ")V"
        }
    .end annotation

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "decorators"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "style"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "binding"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p5}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string v0, "getRoot(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;-><init>(Landroid/view/View;Ljava/util/List;)V

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->messageListListeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    .line 7
    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p5

    const/4 p6, 0x0

    .line 2
    invoke-static {p5, p1, p6}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;

    move-result-object p5

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 3
    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->bindData$lambda$8$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Poll;)Ll83/a0;

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->bindData$lambda$8$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)Ll83/a0;

    return-void
.end method

.method private static final bindData$lambda$8$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)Ll83/a0;
    .locals 1

    const-string v0, "option"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->messageListListeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getOnPollOptionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-interface {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;->onPollOptionClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)Z

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final bindData$lambda$8$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Poll;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->messageListListeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getOnPollCloseClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;->onPollCloseClick(Lio/getstream/chat/android/models/Poll;)Z

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final bindData$lambda$8$lambda$3(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Poll;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->messageListListeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getOnViewPollResultClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;->onViewPollResultClick(Lio/getstream/chat/android/models/Poll;)Z

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final bindData$lambda$8$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/models/Poll;)Ll83/a0;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->messageListListeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getOnShowAllPollOptionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;->onShowAllPollOptionClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final bindData$lambda$8$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Poll;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->messageListListeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getOnSuggestPollOptionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;->onSuggestPollOptionClick(Lio/getstream/chat/android/models/Poll;)Z

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final bindData$lambda$8$lambda$6(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Poll;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->messageListListeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getOnAddPollCommentClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;->onAddPollCommentClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final bindData$lambda$8$lambda$7(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Poll;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->messageListListeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getOnViewPollCommentsClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;->onViewPollCommentsClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->bindData$lambda$8$lambda$3(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Poll;)Ll83/a0;

    return-void
.end method

.method public static synthetic d(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->bindData$lambda$8$lambda$6(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Poll;)Ll83/a0;

    return-void
.end method

.method public static synthetic e(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->bindData$lambda$8$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/models/Poll;)Ll83/a0;

    return-void
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->bindData$lambda$8$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Poll;)Ll83/a0;

    return-void
.end method

.method public static synthetic g(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Poll;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->bindData$lambda$8$lambda$7(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Poll;)Ll83/a0;

    return-void
.end method


# virtual methods
.method public final bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 3

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diff"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    .line 3
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->getPoll()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 5
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->pollView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v1

    invoke-virtual {p2, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->setPoll(Lio/getstream/chat/android/models/Poll;Z)V

    .line 6
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->pollView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/r;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v0, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/r;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/models/Poll;I)V

    invoke-virtual {p2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->setOnOptionClick(Lkotlin/jvm/functions/Function1;)V

    .line 7
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->pollView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/s;

    invoke-direct {v1, p0, v0, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/s;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/models/Poll;I)V

    invoke-virtual {p2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->setOnClosePollClick(Lkotlin/jvm/functions/Function1;)V

    .line 8
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->pollView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/s;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v0, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/s;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/models/Poll;I)V

    invoke-virtual {p2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->setOnViewPollResultsClick(Lkotlin/jvm/functions/Function1;)V

    .line 9
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->pollView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;

    new-instance v1, Lim1/a0;

    const/4 v2, 0x6

    invoke-direct {v1, p0, p1, v0, v2}, Lim1/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->setOnShowAllPollOptionClick(Lc93/a;)V

    .line 10
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->pollView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/s;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v0, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/s;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/models/Poll;I)V

    invoke-virtual {p2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->setOnSuggestOptionClick(Lkotlin/jvm/functions/Function1;)V

    .line 11
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->pollView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/r;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v0, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/r;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/models/Poll;I)V

    invoke-virtual {p2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->setOnAddCommentClick(Lkotlin/jvm/functions/Function1;)V

    .line 12
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;->pollView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/r;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p1, v0, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/r;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/models/Poll;I)V

    invoke-virtual {p2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollView;->setOnViewCommentsClick(Lkotlin/jvm/functions/Function1;)V

    :cond_1
    return-void
.end method

.method public final bridge synthetic bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    return-void
.end method

.method public final getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePollBinding;

    return-object v0
.end method
