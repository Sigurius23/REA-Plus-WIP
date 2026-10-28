.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;
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
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001BC\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0014J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010\"\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\"\u0010\u0014J\u000f\u0010#\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008#\u0010\u0014J\u000f\u0010$\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008$\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010&R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\'R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010(\u001a\u0004\u0008)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008,\u0010-\u00a8\u0006."
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;",
        "decorators",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
        "listeners",
        "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;",
        "messageTextTransformer",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;",
        "attachmentFactoryManager",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;",
        "binding",
        "<init>",
        "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;)V",
        "Ll83/a0;",
        "bindMessageText",
        "()V",
        "bindHorizontalBias",
        "data",
        "bindCustomAttachments",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "initializeListeners",
        "setLinkMovementMethod",
        "Landroid/view/View;",
        "messageContainerView",
        "()Landroid/view/View;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;",
        "diff",
        "bindData",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V",
        "unbind",
        "onDetachedFromWindow",
        "onAttachedToWindow",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
        "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;",
        "innerAttachmentViewHolder",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;",
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
.field private final attachmentFactoryManager:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;

.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

.field private innerAttachmentViewHolder:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;

.field private final listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

.field private final messageTextTransformer:Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;)V
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
            "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;",
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;",
            ")V"
        }
    .end annotation

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "decorators"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "messageTextTransformer"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "attachmentFactoryManager"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "binding"

    invoke-static {p6, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p6}, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string v0, "getRoot(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;-><init>(Landroid/view/View;Ljava/util/List;)V

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->messageTextTransformer:Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    .line 7
    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->attachmentFactoryManager:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;

    .line 8
    iput-object p6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    .line 9
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->initializeListeners()V

    .line 10
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->setLinkMovementMethod()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p6

    const/4 p7, 0x0

    .line 2
    invoke-static {p6, p1, p7}, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    move-result-object p6

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 3
    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->initializeListeners$lambda$9$lambda$8$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Landroid/view/View;)Ll83/a0;

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->initializeListeners$lambda$9$lambda$8$lambda$6(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Landroid/view/View;)Z

    return-void
.end method

.method private final bindCustomAttachments(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->attachmentFactoryManager:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v3

    const-string v4, "getRoot(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;->createViewHolder(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;->onBindViewHolder(Lio/getstream/chat/android/models/Message;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->attachmentsContainer:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->attachmentsContainer:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;->getItemView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->innerAttachmentViewHolder:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;

    return-void
.end method

.method private final bindHorizontalBias()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v1, "messageContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, Landroidx/constraintlayout/widget/d;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v2

    if-eqz v2, :cond_0

    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput v2, v1, Landroidx/constraintlayout/widget/d;->E:F

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final bindMessageText()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->messageText:Landroid/widget/TextView;

    const-string v1, "messageText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->messageTextTransformer:Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->messageText:Landroid/widget/TextView;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-interface {v0, v2, v1}, Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;->transformAndApply(Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->initializeListeners$lambda$9$lambda$8$lambda$3(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->initializeListeners$lambda$9$lambda$8$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->initializeListeners$lambda$9$lambda$8$lambda$7(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->initializeListeners$lambda$9$lambda$8$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Landroid/view/View;)Ll83/a0;

    return-void
.end method

.method private final initializeListeners()V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    if-eqz v1, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->messageContainer:Landroid/widget/LinearLayout;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/a;

    const/4 v4, 0x0

    invoke-direct {v3, v1, p0, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;I)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->reactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    new-instance v3, Lc9/c;

    const/16 v4, 0x8

    invoke-direct {v3, v4, v1, p0}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->setReactionClickListener(Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->footnote:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/b;

    const/4 v4, 0x0

    invoke-direct {v3, v1, p0, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;I)V

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->setOnThreadClickListener(Lkotlin/jvm/functions/Function1;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->footnote:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/b;

    const/4 v4, 0x1

    invoke-direct {v3, v1, p0, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/b;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;I)V

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->setOnTranslatedLabelClickListener(Lkotlin/jvm/functions/Function1;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->messageContainer:Landroid/widget/LinearLayout;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/c;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/a;

    const/4 v4, 0x1

    invoke-direct {v3, v1, p0, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;I)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget-object v2, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod$Companion;

    iget-object v3, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->messageText:Landroid/widget/TextView;

    const-string v4, "messageText"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v4, "messageContainer"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder$initializeListeners$1$1$7;

    invoke-interface {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getLinkClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;

    move-result-object v5

    invoke-direct {v4, v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder$initializeListeners$1$1$7;-><init>(Ljava/lang/Object;)V

    new-instance v5, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder$initializeListeners$1$1$8;

    invoke-interface {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getMentionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;

    move-result-object v1

    invoke-direct {v5, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder$initializeListeners$1$1$8;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v3, v0, v4, v5}, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod$Companion;->set(Landroid/widget/TextView;Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method private static final initializeListeners$lambda$9$lambda$8$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Landroid/view/View;)V
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

.method private static final initializeListeners$lambda$9$lambda$8$lambda$3(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Ljava/lang/String;)V
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

.method private static final initializeListeners$lambda$9$lambda$8$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Landroid/view/View;)Ll83/a0;
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

.method private static final initializeListeners$lambda$9$lambda$8$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Landroid/view/View;)Ll83/a0;
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

.method private static final initializeListeners$lambda$9$lambda$8$lambda$6(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Landroid/view/View;)Z
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

.method private static final initializeListeners$lambda$9$lambda$8$lambda$7(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Landroid/view/View;)V
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

.method private final setLinkMovementMethod()V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    if-eqz v0, :cond_0

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod$Companion;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->messageText:Landroid/widget/TextView;

    const-string v3, "messageText"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v4, "messageContainer"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder$setLinkMovementMethod$1$1;

    invoke-interface {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getLinkClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;

    move-result-object v5

    invoke-direct {v4, v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder$setLinkMovementMethod$1$1;-><init>(Ljava/lang/Object;)V

    new-instance v5, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder$setLinkMovementMethod$1$2;

    invoke-interface {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getMentionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;

    move-result-object v0

    invoke-direct {v5, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder$setLinkMovementMethod$1$2;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v3, v4, v5}, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod$Companion;->set(Landroid/widget/TextView;Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diff"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    .line 3
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->bindMessageText()V

    .line 4
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->bindHorizontalBias()V

    .line 5
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->bindCustomAttachments(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    return-void
.end method

.method public final bridge synthetic bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    return-void
.end method

.method public final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    return-object v0
.end method

.method public final messageContainerView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemCustomAttachmentsBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v1, "messageContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final onAttachedToWindow()V
    .locals 0

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    return-void
.end method

.method public final unbind()V
    .locals 0

    invoke-super {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->unbind()V

    return-void
.end method
