.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;
.super Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder<",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u0000 \u001e2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB;\u0008\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;",
        "decorators",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
        "listeners",
        "Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;",
        "style",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;",
        "binding",
        "<init>",
        "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;)V",
        "Ll83/a0;",
        "applyStyle",
        "()V",
        "data",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;",
        "diff",
        "bindData",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;",
        "getStyle",
        "()Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;",
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
.field private static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder$Companion;

.field private static final GIPHY_PREFIX:Ljava/lang/String; = "/giphy "


# instance fields
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;

.field private final style:Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;)V
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
            "Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;",
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;",
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
    invoke-virtual {p5}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string v0, "getRoot(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;-><init>(Landroid/view/View;Ljava/util/List;)V

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;

    if-eqz p3, :cond_0

    .line 7
    iget-object p1, p5, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->cancelButton:Landroid/widget/TextView;

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/g;

    const/4 p4, 0x0

    invoke-direct {p2, p3, p0, p4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/g;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    iget-object p1, p5, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->shuffleButton:Landroid/widget/TextView;

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/g;

    const/4 p4, 0x1

    invoke-direct {p2, p3, p0, p4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/g;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    iget-object p1, p5, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->sendButton:Landroid/widget/TextView;

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/g;

    const/4 p4, 0x2

    invoke-direct {p2, p3, p0, p4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/g;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p5

    const/4 p6, 0x0

    .line 2
    invoke-static {p5, p1, p6}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;

    move-result-object p5

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 3
    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;-><init>(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->lambda$4$lambda$3$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Landroid/view/View;)V

    return-void
.end method

.method private final applyStyle()V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->cardView:Lcom/google/android/material/card/MaterialCardView;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;->getCardBackgroundColor()I

    move-result v2

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->cardView:Lcom/google/android/material/card/MaterialCardView;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;->getCardElevation()F

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setElevation(F)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->horizontalDivider:Landroid/view/View;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;->getCardButtonDividerColor()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->verticalDivider1:Landroid/view/View;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;->getCardButtonDividerColor()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->verticalDivider2:Landroid/view/View;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;->getCardButtonDividerColor()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->giphyIconImageView:Landroid/widget/ImageView;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;->getGiphyIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->giphyLabelTextView:Landroid/widget/TextView;

    const-string v2, "giphyLabelTextView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;->getLabelTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->giphyQueryTextView:Landroid/widget/TextView;

    const-string v2, "giphyQueryTextView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;->getQueryTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->cancelButton:Landroid/widget/TextView;

    const-string v2, "cancelButton"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;->getCancelButtonTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->shuffleButton:Landroid/widget/TextView;

    const-string v2, "shuffleButton"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;->getShuffleButtonTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->sendButton:Landroid/widget/TextView;

    const-string v1, "sendButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;->getSendButtonTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->bindData$lambda$7$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;)Ll83/a0;

    return-void
.end method

.method private static final bindData$lambda$7$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;)Ll83/a0;
    .locals 1

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->loadingProgressBar:Landroid/widget/ProgressBar;

    const-string v0, "loadingProgressBar"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final bindData$lambda$7$lambda$6(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;)Ll83/a0;
    .locals 1

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->loadingProgressBar:Landroid/widget/ProgressBar;

    const-string v0, "loadingProgressBar"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->lambda$4$lambda$3$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->lambda$4$lambda$3$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->bindData$lambda$7$lambda$6(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;)Ll83/a0;

    return-void
.end method

.method private static final lambda$4$lambda$3$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getGiphySendListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;

    move-result-object p0

    new-instance p2, Lio/getstream/chat/android/ui/common/state/messages/list/CancelGiphy;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-direct {p2, p1}, Lio/getstream/chat/android/ui/common/state/messages/list/CancelGiphy;-><init>(Lio/getstream/chat/android/models/Message;)V

    invoke-interface {p0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;->onGiphySend(Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;)Z

    return-void
.end method

.method private static final lambda$4$lambda$3$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getGiphySendListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;

    move-result-object p0

    new-instance p2, Lio/getstream/chat/android/ui/common/state/messages/list/ShuffleGiphy;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-direct {p2, p1}, Lio/getstream/chat/android/ui/common/state/messages/list/ShuffleGiphy;-><init>(Lio/getstream/chat/android/models/Message;)V

    invoke-interface {p0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;->onGiphySend(Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;)Z

    return-void
.end method

.method private static final lambda$4$lambda$3$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;->getGiphySendListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;

    move-result-object p0

    new-instance p2, Lio/getstream/chat/android/ui/common/state/messages/list/SendGiphy;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->getData()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-direct {p2, p1}, Lio/getstream/chat/android/ui/common/state/messages/list/SendGiphy;-><init>(Lio/getstream/chat/android/models/Message;)V

    invoke-interface {p0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;->onGiphySend(Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;)Z

    return-void
.end method


# virtual methods
.method public final bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 9

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "diff"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-super {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    .line 3
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->applyStyle()V

    .line 4
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object p2

    .line 6
    invoke-static {p2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/Attachment;

    if-eqz p2, :cond_2

    .line 7
    sget-object v0, Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;->FIXED_HEIGHT:Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;

    invoke-static {p2, v0}, Lio/getstream/chat/android/ui/common/utils/GiphyInfoTypeKt;->giphyInfo(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/ui/common/utils/GiphyInfoType;)Lio/getstream/chat/android/ui/common/utils/GiphyInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/utils/GiphyInfo;->getUrl()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v0

    goto :goto_1

    .line 8
    :cond_1
    :goto_0
    invoke-static {p2}, Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;->getGiphyFallbackPreviewUrl(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 9
    :goto_1
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;

    iget-object v1, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->giphyPreview:Lcom/google/android/material/imageview/ShapeableImageView;

    const-string p2, "giphyPreview"

    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/h;

    const/4 p2, 0x0

    invoke-direct {v5, p0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/h;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;I)V

    new-instance v6, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/h;

    const/4 p2, 0x1

    invoke-direct {v6, p0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/h;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;I)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v8}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->load$default(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    .line 10
    :cond_2
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;->giphyQueryTextView:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object p1

    .line 12
    const-string v0, ""

    const/4 v1, 0x0

    .line 13
    const-string v2, "/giphy "

    invoke-static {p1, v2, v0, v1}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final bridge synthetic bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->bindData(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V

    return-void
.end method

.method public final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageGiphyBinding;

    return-object v0
.end method

.method public final getStyle()Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;

    return-object v0
.end method
