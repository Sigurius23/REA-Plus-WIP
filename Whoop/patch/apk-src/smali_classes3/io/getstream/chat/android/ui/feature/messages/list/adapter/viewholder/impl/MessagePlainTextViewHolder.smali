.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;
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
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B;\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u001aR\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;",
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
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;",
        "binding",
        "<init>",
        "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;)V",
        "Landroid/view/View;",
        "messageContainerView",
        "()Landroid/view/View;",
        "data",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;",
        "diff",
        "Ll83/a0;",
        "bindData",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
        "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;

.field private final listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

.field private final messageTextTransformer:Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;)V
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
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;",
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
    invoke-virtual {p5}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string v0, "getRoot(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;-><init>(Landroid/view/View;Ljava/util/List;)V

    .line 5
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->listeners:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;

    .line 6
    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->messageTextTransformer:Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    .line 7
    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;

    if-eqz p3, :cond_0

    .line 8
    iget-object p1, p5, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->messageContainer:Landroid/widget/LinearLayout;

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/p;

    const/4 p4, 0x0

    invoke-direct {p2, p3, p0, p4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/p;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    iget-object p1, p5, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->reactionsView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;

    new-instance p2, Lc9/c;

    const/16 p4, 0xd

    invoke-direct {p2, p4, p3, p0}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;->setReactionClickListener(Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V

    .line 10
    iget-object p1, p5, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->footnote:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/q;

    const/4 p4, 0x0

    invoke-direct {p2, p3, p0, p4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/q;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;I)V

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->setOnThreadClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 11
    iget-object p1, p5, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->footnote:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/q;

    const/4 p4, 0x1

    invoke-direct {p2, p3, p0, p4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/q;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;I)V

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;->setOnTranslatedLabelClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 12
    iget-object p1, p5, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->messageContainer:Landroid/widget/LinearLayout;

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/c;

    const/4 p4, 0x4

    invoke-direct {p2, p4, p3, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 13
    iget-object p1, p5, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/p;

    const/4 p4, 0x1

    invoke-direct {p2, p3, p0, p4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/p;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    iget-object p1, p5, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->messageText:Landroid/widget/TextView;

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/p;

    const/4 p4, 0x2

    invoke-direct {p2, p3, p0, p4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/p;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    sget-object p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod$Companion;

    .line 16
    iget-object p2, p5, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->messageText:Landroid/widget/TextView;

    const-string p4, "messageText"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    iget-object p4, p5, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string p5, "messageContainer"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance p5, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder$1$1$8;

    invoke-interface {p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getLinkClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;

    move-result-object v0

    invoke-direct {p5, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder$1$1$8;-><init>(Ljava/lang/Object;)V

    .line 19
    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder$1$1$9;

    invoke-interface {p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getMentionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;

    move-result-object p3

    invoke-direct {v0, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder$1$1$9;-><init>(Ljava/lang/Object;)V

    .line 20
    invoke-virtual {p1, p2, p4, p5, v0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/LongClickFriendlyLinkMovementMethod$Companion;->set(Landroid/widget/TextView;Landroid/view/View;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p5

    const/4 p6, 0x0

    .line 2
    invoke-static {p5, p1, p6}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;

    move-result-object p5

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 3
    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->lambda$8$lambda$7$lambda$3(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Landroid/view/View;)Ll83/a0;

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->lambda$8$lambda$7$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Landroid/view/View;)Ll83/a0;

    return-void
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->lambda$8$lambda$7$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->lambda$8$lambda$7$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->lambda$8$lambda$7$lambda$6(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->lambda$8$lambda$7$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Landroid/view/View;)Z

    return-void
.end method

.method public static synthetic g(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->lambda$8$lambda$7$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Landroid/view/View;)V

    return-void
.end method

.method private static final lambda$8$lambda$7$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Landroid/view/View;)V
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

.method private static final lambda$8$lambda$7$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Ljava/lang/String;)V
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

.method private static final lambda$8$lambda$7$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Landroid/view/View;)Ll83/a0;
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

.method private static final lambda$8$lambda$7$lambda$3(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Landroid/view/View;)Ll83/a0;
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

.method private static final lambda$8$lambda$7$lambda$4(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Landroid/view/View;)Z
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

.method private static final lambda$8$lambda$7$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Landroid/view/View;)V
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

.method private static final lambda$8$lambda$7$lambda$6(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Landroid/view/View;)V
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
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->getText()Z

    move-result v0

    .line 4
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->getMentions()Z

    move-result v1

    .line 5
    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;->getShowOriginalText()Z

    move-result p2

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    if-nez p2, :cond_0

    return-void

    .line 6
    :cond_0
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;

    .line 7
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->messageTextTransformer:Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    iget-object v1, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->messageText:Landroid/widget/TextView;

    const-string v2, "messageText"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1, p1}, Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;->transformAndApply(Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V

    .line 8
    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v0, "messageContainer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_2

    check-cast v0, Landroidx/constraintlayout/widget/d;

    .line 10
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isTheirs()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    const/high16 p1, 0x3f800000    # 1.0f

    :goto_0
    iput p1, v0, Landroidx/constraintlayout/widget/d;->E:F

    .line 11
    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 12
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final bridge synthetic bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    return-void
.end method

.method public final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;

    return-object v0
.end method

.method public final messageContainerView()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessagePlainTextBinding;->messageContainer:Landroid/widget/LinearLayout;

    const-string v1, "messageContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
