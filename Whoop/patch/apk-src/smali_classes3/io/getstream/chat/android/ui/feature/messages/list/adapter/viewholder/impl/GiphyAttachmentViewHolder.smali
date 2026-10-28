.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;
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
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B;\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010 R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;",
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
        "markdown",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;",
        "binding",
        "<init>",
        "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;)V",
        "Ll83/a0;",
        "initializeListeners",
        "()V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;",
        "mediaAttachmentView",
        "data",
        "imageCorners",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V",
        "Landroid/view/View;",
        "messageContainerView",
        "()Landroid/view/View;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;",
        "diff",
        "bindData",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
        "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

.field private final listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

.field private final markdown:Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;)V
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
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;",
            ")V"
        }
    .end annotation

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "decorators"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "markdown"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "binding"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-virtual {p5}, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string v0, "getRoot(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;-><init>(Landroid/view/View;Ljava/util/List;)V

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->markdown:Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    .line 7
    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

    .line 8
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->initializeListeners()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p5

    const/4 p6, 0x0

    .line 2
    invoke-static {p5, p1, p6}, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

    move-result-object p5

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 3
    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->initializeListeners$lambda$8$lambda$7$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Landroid/view/View;)Ll83/a0;

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->initializeListeners$lambda$8$lambda$7$lambda$6(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->initializeListeners$lambda$8$lambda$7$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->initializeListeners$lambda$8$lambda$7$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Landroid/view/View;)Z

    return-void
.end method

.method public static synthetic e(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p1, p0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->initializeListeners$lambda$8$lambda$7$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->initializeListeners$lambda$8$lambda$7$lambda$3(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Landroid/view/View;)Ll83/a0;

    return-void
.end method

.method private final imageCorners(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 5

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-static {v0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isReply(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator$Companion;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator;->access$getDEFAULT_CORNER_RADIUS$cp()F

    move-result v0

    :goto_0
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-static {v2}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isReply(Lio/getstream/chat/android/models/Message;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    sget-object v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator$Companion;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator;->access$getDEFAULT_CORNER_RADIUS$cp()F

    move-result v2

    :goto_1
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-static {v3}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->hasText(Lio/getstream/chat/android/models/Message;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {p2}, Lio/getstream/chat/android/ui/utils/extensions/MessageItemKt;->isBottomPosition(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    sget-object v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator$Companion;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator;->access$getDEFAULT_CORNER_RADIUS$cp()F

    move-result v3

    goto :goto_3

    :cond_3
    :goto_2
    move v3, v1

    :goto_3
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v4

    invoke-static {v4}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->hasText(Lio/getstream/chat/android/models/Message;)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isTheirs()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-static {p2}, Lio/getstream/chat/android/ui/utils/extensions/MessageItemKt;->isBottomPosition(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Z

    move-result p2

    if-eqz p2, :cond_4

    goto :goto_4

    :cond_4
    sget-object p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator$Companion;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator;->access$getDEFAULT_CORNER_RADIUS$cp()F

    move-result v1

    :cond_5
    :goto_4
    invoke-virtual {p1, v0, v2, v3, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;->setImageShapeByCorners(FFFF)V

    return-void
.end method

.method private final initializeListeners()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    if-eqz v1, :cond_0

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->messageContainer:Landroid/widget/LinearLayout;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/e;

    invoke-direct {v3, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->reactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    new-instance v3, Lc9/c;

    const/16 v4, 0xa

    invoke-direct {v3, v4, v1, p0}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->setReactionClickListener(Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->footnote:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/f;

    const/4 v4, 0x0

    invoke-direct {v3, v1, p0, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/f;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;I)V

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->setOnThreadClickListener(Lkotlin/jvm/functions/Function1;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->footnote:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/f;

    const/4 v4, 0x1

    invoke-direct {v3, v1, p0, v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/f;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;I)V

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->setOnTranslatedLabelClickListener(Lkotlin/jvm/functions/Function1;)V

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->messageContainer:Landroid/widget/LinearLayout;

    new-instance v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/c;

    const/4 v4, 0x2

    invoke-direct {v3, v4, v1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/e;

    invoke-direct {v2, v1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/e;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method private static final initializeListeners$lambda$8$lambda$7$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p2

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/Attachment;

    if-eqz p2, :cond_0

    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getAttachmentClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;

    move-result-object p1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p0

    invoke-interface {p1, p0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;->onAttachmentClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Attachment;)Z

    :cond_0
    return-void
.end method

.method private static final initializeListeners$lambda$8$lambda$7$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Ljava/lang/String;)V
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

.method private static final initializeListeners$lambda$8$lambda$7$lambda$3(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Landroid/view/View;)Ll83/a0;
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

.method private static final initializeListeners$lambda$8$lambda$7$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Landroid/view/View;)Ll83/a0;
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

.method private static final initializeListeners$lambda$8$lambda$7$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Landroid/view/View;)Z
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

.method private static final initializeListeners$lambda$8$lambda$7$lambda$6(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Landroid/view/View;)V
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


# virtual methods
.method public final bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 5

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diff"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    .line 3
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->messageText:Landroid/widget/TextView;

    const-string v0, "messageText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    .line 4
    :goto_0
    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->markdown:Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->messageText:Landroid/widget/TextView;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, v1, p1}, Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;->transformAndApply(Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    .line 6
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v0, "messageContainer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_7

    check-cast v1, Landroidx/constraintlayout/widget/d;

    .line 8
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isTheirs()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    const/high16 v3, 0x3f800000    # 1.0f

    :goto_1
    iput v3, v1, Landroidx/constraintlayout/widget/d;->E:F

    .line 9
    invoke-virtual {p2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->mediaAttachmentView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;

    const-string v1, "mediaAttachmentView"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->imageCorners(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    .line 11
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->mediaAttachmentView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;

    .line 12
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;->isStyleInitialized$stream_chat_android_ui_components_release()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    .line 13
    :cond_2
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;->getStyle$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->getSizingMode()Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;

    move-result-object v1

    sget-object v3, Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;->ADAPTIVE:Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;

    if-ne v1, v3, :cond_3

    goto :goto_2

    .line 14
    :cond_3
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;->getStyle$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->getSizingMode()Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;

    move-result-object v1

    sget-object v3, Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;->FIXED_SIZE:Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;

    if-ne v1, v3, :cond_4

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;->getStyle$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->getWidth()I

    move-result v1

    const/4 v4, -0x1

    if-ne v1, v4, :cond_4

    goto :goto_2

    .line 15
    :cond_4
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;->getStyle$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;

    move-result-object p2

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/GiphyMediaAttachmentViewStyle;->getSizingMode()Lio/getstream/chat/android/ui/common/utils/GiphySizingMode;

    move-result-object p2

    if-ne p2, v3, :cond_5

    const/4 v2, -0x2

    .line 16
    :cond_5
    :goto_2
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->messageContainer:Landroid/widget/LinearLayout;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 18
    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 19
    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 20
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    .line 21
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->mediaAttachmentView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p2, p1, v1, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;->showGiphy$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GiphyMediaAttachmentView;Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;ILjava/lang/Object;)V

    return-void

    .line 22
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 23
    :cond_7
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final bridge synthetic bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    return-void
.end method

.method public final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

    return-object v0
.end method

.method public final messageContainerView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemGiphyAttachmentBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v1, "messageContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
