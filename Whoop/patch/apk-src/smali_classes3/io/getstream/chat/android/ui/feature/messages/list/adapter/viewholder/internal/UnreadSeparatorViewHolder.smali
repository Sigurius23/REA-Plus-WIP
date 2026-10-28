.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/UnreadSeparatorViewHolder;
.super Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder<",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0019R\u001a\u0010\r\u001a\u00020\u000c8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/UnreadSeparatorViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;",
        "decorators",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
        "messageListListeners",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "style",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;",
        "binding",
        "<init>",
        "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;)V",
        "data",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;",
        "diff",
        "Ll83/a0;",
        "bindData",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V",
        "onAttachedToWindow",
        "()V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;",
        "getBinding$stream_chat_android_ui_components_release",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;

.field private final messageListListeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

.field private final style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;)V
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
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;",
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
    invoke-virtual {p5}, Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object p1

    const-string v0, "getRoot(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;-><init>(Landroid/view/View;Ljava/util/List;)V

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/UnreadSeparatorViewHolder;->messageListListeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/UnreadSeparatorViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    .line 7
    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/UnreadSeparatorViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p5

    const/4 p6, 0x0

    .line 2
    invoke-static {p5, p1, p6}, Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;

    move-result-object p5

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 3
    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/UnreadSeparatorViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;)V

    return-void
.end method


# virtual methods
.method public final bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diff"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    .line 3
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/UnreadSeparatorViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;->getRoot()Landroid/widget/FrameLayout;

    move-result-object p1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/UnreadSeparatorViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getUnreadSeparatorBackgroundColor()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 4
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/UnreadSeparatorViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;->unreadSeparatorLabel:Landroid/widget/TextView;

    const-string p2, "unreadSeparatorLabel"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/UnreadSeparatorViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getUnreadSeparatorTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p2

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    .line 5
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/UnreadSeparatorViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;->unreadSeparatorLabel:Landroid/widget/TextView;

    .line 6
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget v0, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_unread_separator:I

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 7
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final bridge synthetic bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/UnreadSeparatorViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    return-void
.end method

.method public final getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/UnreadSeparatorViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;

    return-object v0
.end method

.method public final onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->onAttachedToWindow()V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/UnreadSeparatorViewHolder;->messageListListeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getUnreadLabelReachedListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;->onUnreadLabelReached()V

    :cond_0
    return-void
.end method
