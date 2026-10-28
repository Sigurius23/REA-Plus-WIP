.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;
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
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B;\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u001fR\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010 \u001a\u0004\u0008!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'\u00a8\u0006)"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;",
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
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;",
        "binding",
        "<init>",
        "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;)V",
        "data",
        "Ll83/a0;",
        "updateHorizontalBias",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "initializeListeners",
        "()V",
        "setLinkMovementMethod",
        "Landroid/view/View;",
        "messageContainerView",
        "()Landroid/view/View;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;",
        "diff",
        "bindData",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
        "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

.field private final listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

.field private final logger$delegate:Ll83/h;

.field private final messageTextTransformer:Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;)V
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
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;",
            ")V"
        }
    .end annotation

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "decorators"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "messageTextTransformer"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "binding"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p5}, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string v0, "getRoot(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;-><init>(Landroid/view/View;Ljava/util/List;)V

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->messageTextTransformer:Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    .line 7
    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    .line 8
    const-string p1, "FileAttachmentListVH"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->logger$delegate:Ll83/h;

    .line 9
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->initializeListeners()V

    .line 10
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->setLinkMovementMethod()V

    .line 11
    iget-object p1, p5, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->fileAttachmentsView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;

    const-string p2, "fileAttachmentsView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x4

    invoke-static {p2}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result p2

    .line 12
    invoke-virtual {p1, p2, p2, p2, p2}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p5

    const/4 p6, 0x0

    .line 2
    invoke-static {p5, p1, p6}, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    move-result-object p5

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 3
    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Lio/getstream/chat/android/models/Attachment;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->initializeListeners$lambda$10$lambda$9$lambda$8(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Lio/getstream/chat/android/models/Attachment;)V

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->initializeListeners$lambda$10$lambda$9$lambda$7(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;)V

    return-void
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->initializeListeners$lambda$10$lambda$9$lambda$3(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Landroid/view/View;)Ll83/a0;

    return-void
.end method

.method public static synthetic d(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->initializeListeners$lambda$10$lambda$9$lambda$6(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->initializeListeners$lambda$10$lambda$9$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Landroid/view/View;)Z

    return-void
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->initializeListeners$lambda$10$lambda$9$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic g(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->initializeListeners$lambda$10$lambda$9$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Landroid/view/View;)Ll83/a0;

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final initializeListeners()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    if-eqz v1, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->reactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    new-instance v3, Lc9/c;

    const/16 v4, 0x9

    invoke-direct {v3, v4, v1, p0}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->setReactionClickListener(Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->footnote:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/d;

    const/4 v4, 0x0

    invoke-direct {v3, v1, p0, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;I)V

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->setOnThreadClickListener(Lkotlin/jvm/functions/Function1;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->footnote:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/d;

    const/4 v4, 0x1

    invoke-direct {v3, v1, p0, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/d;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;I)V

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->setOnTranslatedLabelClickListener(Lkotlin/jvm/functions/Function1;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->messageContainer:Landroid/widget/LinearLayout;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/c;

    invoke-direct {v3, v4, v1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    new-instance v2, Lb13/a;

    const/4 v3, 0x3

    invoke-direct {v2, v3, v1, p0}, Lb13/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->fileAttachmentsView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/o;

    const/4 v3, 0x2

    invoke-direct {v2, v1, p0, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/o;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;I)V

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->setAttachmentLongClickListener(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->fileAttachmentsView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/n;

    invoke-direct {v2, v1, p0, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/n;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;I)V

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->setAttachmentClickListener(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->fileAttachmentsView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder$initializeListeners$1$1$8;

    invoke-interface {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getAttachmentDownloadClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;

    move-result-object v1

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder$initializeListeners$1$1$8;-><init>(Ljava/lang/Object;)V

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder$sam$io_getstream_chat_android_ui_feature_messages_list_adapter_view_internal_AttachmentDownloadClickListener$0;

    invoke-direct {v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder$sam$io_getstream_chat_android_ui_feature_messages_list_adapter_view_internal_AttachmentDownloadClickListener$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->setAttachmentDownloadClickListener(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;)V

    :cond_0
    return-void
.end method

.method private static final initializeListeners$lambda$10$lambda$9$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Ljava/lang/String;)V
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

.method private static final initializeListeners$lambda$10$lambda$9$lambda$3(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Landroid/view/View;)Ll83/a0;
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

.method private static final initializeListeners$lambda$10$lambda$9$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Landroid/view/View;)Ll83/a0;
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

.method private static final initializeListeners$lambda$10$lambda$9$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Landroid/view/View;)Z
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

.method private static final initializeListeners$lambda$10$lambda$9$lambda$6(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Landroid/view/View;)V
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

.method private static final initializeListeners$lambda$10$lambda$9$lambda$7(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;)V
    .locals 0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getMessageLongClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;

    move-result-object p0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;->onMessageLongClick(Lio/getstream/chat/android/models/Message;)Z

    return-void
.end method

.method private static final initializeListeners$lambda$10$lambda$9$lambda$8(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Lio/getstream/chat/android/models/Attachment;)V
    .locals 1

    const-string v0, "attachment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getAttachmentClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;

    move-result-object p0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;->onAttachmentClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Attachment;)Z

    return-void
.end method

.method private final setLinkMovementMethod()V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    if-eqz v0, :cond_0

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod$Companion;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->messageText:Landroid/widget/TextView;

    const-string v3, "messageText"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v4, "messageContainer"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder$setLinkMovementMethod$1$1;

    invoke-interface {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getLinkClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;

    move-result-object v5

    invoke-direct {v4, v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder$setLinkMovementMethod$1$1;-><init>(Ljava/lang/Object;)V

    new-instance v5, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder$setLinkMovementMethod$1$2;

    invoke-interface {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getMentionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;

    move-result-object v0

    invoke-direct {v5, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder$setLinkMovementMethod$1$2;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, v2, v3, v4, v5}, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod$Companion;->set(Landroid/widget/TextView;Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method private final updateHorizontalBias(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->messageContainer:Landroid/widget/LinearLayout;

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
    .locals 5

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diff"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->getLogger()Lb23/k;

    move-result-object v0

    .line 3
    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    .line 4
    sget-object v2, Lb23/g;->y:Lb23/g;

    .line 5
    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    .line 6
    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[bindData] data: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", diff: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    .line 9
    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    :cond_0
    invoke-super {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    .line 11
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->updateHorizontalBias(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    .line 12
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->fileAttachmentsView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentsView;->setAttachments(Ljava/util/List;)V

    .line 13
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p2

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    if-lez p2, :cond_1

    .line 14
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->messageTextTransformer:Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->messageText:Landroid/widget/TextView;

    const-string v1, "messageText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v0, p1}, Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;->transformAndApply(Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    .line 15
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->messageText:Landroid/widget/TextView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 16
    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->messageText:Landroid/widget/TextView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final bridge synthetic bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    return-void
.end method

.method public final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    return-object v0
.end method

.method public final messageContainerView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v1, "messageContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
