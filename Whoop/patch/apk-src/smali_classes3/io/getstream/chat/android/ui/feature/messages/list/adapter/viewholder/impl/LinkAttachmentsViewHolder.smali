.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;
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
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001BC\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010!R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\"R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010#\u001a\u0004\u0008$\u0010%R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010&\u001a\u0004\u0008\'\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;",
        "decorators",
        "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;",
        "messageTextTransformer",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
        "listeners",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "style",
        "<init>",
        "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V",
        "data",
        "Ll83/a0;",
        "updateHorizontalBias",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "initializeListeners",
        "()V",
        "setLinkMovementMethod",
        "applyLinkAttachmentViewStyle",
        "Landroid/view/View;",
        "messageContainerView",
        "()Landroid/view/View;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;",
        "diff",
        "bindData",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V",
        "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "getStyle",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;

.field private final listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

.field private final messageTextTransformer:Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

.field private final style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;",
            ">;",
            "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;",
            "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
            ")V"
        }
    .end annotation

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "decorators"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "messageTextTransformer"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "binding"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "style"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p5}, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string v0, "getRoot(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;-><init>(Landroid/view/View;Ljava/util/List;)V

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->messageTextTransformer:Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    .line 7
    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;

    .line 8
    iput-object p6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    .line 9
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->applyLinkAttachmentViewStyle()V

    .line 10
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->initializeListeners()V

    .line 11
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->setLinkMovementMethod()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_0

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p5

    const/4 p7, 0x0

    .line 2
    invoke-static {p5, p1, p7}, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;

    move-result-object p5

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 3
    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->initializeListeners$lambda$12$lambda$11$lambda$10(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Landroid/view/View;)Z

    return-void
.end method

.method private final applyLinkAttachmentViewStyle()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->linkAttachmentView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getLinkDescriptionMaxLines()I

    move-result v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->setLinkDescriptionMaxLines$stream_chat_android_ui_components_release(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getTextStyleLinkDescription()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->setDescriptionTextStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getTextStyleLinkTitle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->setTitleTextStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getTextStyleLinkLabel()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->setLabelTextStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->initializeListeners$lambda$12$lambda$11$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Landroid/view/View;)Ll83/a0;

    return-void
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->initializeListeners$lambda$12$lambda$11$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->initializeListeners$lambda$12$lambda$11$lambda$9(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic e(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->initializeListeners$lambda$12$lambda$11$lambda$3(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->initializeListeners$lambda$12$lambda$11$lambda$8(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic g(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->initializeListeners$lambda$12$lambda$11$lambda$7(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Landroid/view/View;)Z

    return-void
.end method

.method public static synthetic h(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->initializeListeners$lambda$12$lambda$11$lambda$6(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Landroid/view/View;)Ll83/a0;

    return-void
.end method

.method private final initializeListeners()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    if-eqz v1, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->messageContainer:Landroid/widget/LinearLayout;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/i;

    const/4 v4, 0x0

    invoke-direct {v3, v1, p0, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/i;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;I)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->reactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    new-instance v3, Lc9/c;

    const/16 v4, 0xb

    invoke-direct {v3, v4, v1, p0}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->setReactionClickListener(Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->footnote:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/j;

    const/4 v4, 0x0

    invoke-direct {v3, v1, p0, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/j;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;I)V

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->setOnThreadClickListener(Lkotlin/jvm/functions/Function1;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->footnote:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/j;

    const/4 v4, 0x1

    invoke-direct {v3, v1, p0, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/j;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;I)V

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->setOnTranslatedLabelClickListener(Lkotlin/jvm/functions/Function1;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->messageContainer:Landroid/widget/LinearLayout;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/k;

    const/4 v4, 0x0

    invoke-direct {v3, v1, p0, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/k;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;I)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/i;

    const/4 v4, 0x1

    invoke-direct {v3, v1, p0, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/i;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;I)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->linkAttachmentView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;

    new-instance v3, Lhn/p;

    const/16 v4, 0x8

    invoke-direct {v3, p0, v4}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->setLinkPreviewClickListener(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$LinkPreviewClickListener;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->linkAttachmentView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/k;

    const/4 v3, 0x1

    invoke-direct {v2, v1, p0, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/k;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;I)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_0
    return-void
.end method

.method private static final initializeListeners$lambda$12$lambda$11$lambda$10(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Landroid/view/View;)Z
    .locals 0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getMessageLongClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;

    move-result-object p0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;->onMessageLongClick(Lio/getstream/chat/android/models/Message;)Z

    const/4 p0, 0x1

    return p0
.end method

.method private static final initializeListeners$lambda$12$lambda$11$lambda$3(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getMessageClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;

    move-result-object p0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;->onMessageClick(Lio/getstream/chat/android/models/Message;)Z

    return-void
.end method

.method private static final initializeListeners$lambda$12$lambda$11$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Ljava/lang/String;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getReactionViewClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;

    move-result-object p0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;->onReactionViewClick(Lio/getstream/chat/android/models/Message;)Z

    return-void
.end method

.method private static final initializeListeners$lambda$12$lambda$11$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getThreadClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;

    move-result-object p0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;->onThreadClick(Lio/getstream/chat/android/models/Message;)Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final initializeListeners$lambda$12$lambda$11$lambda$6(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getTranslatedLabelClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;

    move-result-object p0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;->onTranslatedLabelClick(Lio/getstream/chat/android/models/Message;)Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final initializeListeners$lambda$12$lambda$11$lambda$7(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Landroid/view/View;)Z
    .locals 0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getMessageLongClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;

    move-result-object p0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;->onMessageLongClick(Lio/getstream/chat/android/models/Message;)Z

    const/4 p0, 0x1

    return p0
.end method

.method private static final initializeListeners$lambda$12$lambda$11$lambda$8(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getUserClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;

    move-result-object p0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;->onUserClick(Lio/getstream/chat/android/models/User;)Z

    return-void
.end method

.method private static final initializeListeners$lambda$12$lambda$11$lambda$9(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Ljava/lang/String;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getLinkClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;

    move-result-object p0

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;->onLinkClick(Ljava/lang/String;)Z

    return-void
.end method

.method private final setLinkMovementMethod()V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    if-eqz v0, :cond_0

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod$Companion;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->messageText:Landroid/widget/TextView;

    const-string v3, "messageText"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v4, "messageContainer"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder$setLinkMovementMethod$1$1;

    invoke-interface {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getLinkClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;

    move-result-object v5

    invoke-direct {v4, v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder$setLinkMovementMethod$1$1;-><init>(Ljava/lang/Object;)V

    new-instance v5, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder$setLinkMovementMethod$1$2;

    invoke-interface {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getMentionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;

    move-result-object v0

    invoke-direct {v5, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder$setLinkMovementMethod$1$2;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v3, v4, v5}, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod$Companion;->set(Landroid/widget/TextView;Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method private final updateHorizontalBias(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v1, "messageContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, Landroidx/constraintlayout/widget/d;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result p1

    if-eqz p1, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput p1, v1, Landroidx/constraintlayout/widget/d;->E:F

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 2

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diff"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    .line 3
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->updateHorizontalBias(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    .line 4
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p2

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    .line 5
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/models/Attachment;

    .line 6
    invoke-static {v1}, Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;->hasLink(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lio/getstream/chat/android/models/Attachment;

    if-eqz v0, :cond_2

    .line 7
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->linkAttachmentView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    invoke-virtual {p2, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->showLinkAttachment(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V

    .line 8
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->messageTextTransformer:Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->messageText:Landroid/widget/TextView;

    const-string v1, "messageText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v0, p1}, Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;->transformAndApply(Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    :cond_2
    return-void
.end method

.method public final bridge synthetic bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    return-void
.end method

.method public final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;

    return-object v0
.end method

.method public final getStyle()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;

    return-object v0
.end method

.method public final messageContainerView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemLinkAttachmentBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v1, "messageContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
