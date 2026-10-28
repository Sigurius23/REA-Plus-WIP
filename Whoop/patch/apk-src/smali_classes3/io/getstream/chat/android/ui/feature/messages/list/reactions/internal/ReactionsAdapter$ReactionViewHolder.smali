.class public final Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ReactionViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;",
        "Landroidx/recyclerview/widget/o2;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;",
        "binding",
        "",
        "itemSize",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;",
        "reactionClickListener",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;ILio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;",
        "reactionItem",
        "Ll83/a0;",
        "bind",
        "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;",
        "I",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;

.field private final itemSize:I

.field private final reactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;

.field private reactionItem:Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;ILio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionClickListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;->getRoot()Landroid/widget/ImageView;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;

    iput p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;->itemSize:I

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;->reactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;->getRoot()Landroid/widget/ImageView;

    move-result-object p3

    const-string v0, "getRoot(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iput p2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iput p2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;->getRoot()Landroid/widget/ImageView;

    move-result-object p1

    new-instance p2, Ljo/j;

    const/16 p3, 0x13

    invoke-direct {p2, p0, p3}, Ljo/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static final _init_$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;->reactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;->reactionItem:Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;->getType()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/ReactionClickListener;->onReactionClick(Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p0, "reactionItem"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;->_init_$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;)V
    .locals 1

    const-string v0, "reactionItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;->reactionItem:Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionsAdapter$ReactionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageReactionBinding;->reactionIcon:Landroid/widget/ImageView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
