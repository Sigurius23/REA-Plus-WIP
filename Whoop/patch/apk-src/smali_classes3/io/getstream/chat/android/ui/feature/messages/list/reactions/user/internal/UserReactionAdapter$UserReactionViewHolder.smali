.class public final Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "UserReactionViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000cJ\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0015R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;",
        "Landroidx/recyclerview/widget/o2;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;",
        "userReactionClickListener",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;",
        "messageOptionsUserReactionAlignment",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;)V",
        "Ll83/a0;",
        "bindUserAvatar",
        "()V",
        "bindUserName",
        "bindUserReaction",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;",
        "userReactionItem",
        "bind",
        "(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;",
        "Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;

.field private final messageOptionsUserReactionAlignment:Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;

.field private final userReactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;

.field private userReactionItem:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userReactionClickListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageOptionsUserReactionAlignment"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    .line 4
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;

    .line 5
    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->userReactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;

    .line 6
    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->messageOptionsUserReactionAlignment:Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;

    .line 7
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    new-instance p2, Lb30/k3;

    const/16 p3, 0x19

    invoke-direct {p2, p0, p3}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 1
    sget-object p3, Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;->BY_USER:Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->userReactionClickListener:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->userReactionItem:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionClickListener;->onUserReactionClick(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;)V

    return-void

    :cond_0
    const-string p0, "userReactionItem"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic a(Landroidx/constraintlayout/widget/p;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->bindUserReaction$lambda$3$lambda$1(Landroidx/constraintlayout/widget/p;)Ll83/a0;

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->_init_$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;Landroid/view/View;)V

    return-void
.end method

.method private final bindUserAvatar()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->userReactionItem:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v1, v3, v4, v2}, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;->setUser$default(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/models/User;ZILjava/lang/Object;)V

    return-void

    :cond_0
    const-string v0, "userReactionItem"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method private final bindUserName()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;->userNameTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->userReactionItem:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    const-string v0, "userReactionItem"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final bindUserReaction()V
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;->reactionContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v2, "reactionContainer"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lio/getstream/chat/android/ui/common/utils/extensions/a;

    const/16 v3, 0x18

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/common/utils/extensions/a;-><init>(I)V

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->updateConstraints(Landroidx/constraintlayout/widget/ConstraintLayout;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->messageOptionsUserReactionAlignment:Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->userReactionItem:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;

    const/4 v3, 0x0

    const-string v4, "userReactionItem"

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;->isMine()Z

    move-result v2

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignmentKt;->isStartAlignment(Lio/getstream/chat/android/ui/common/state/messages/list/MessageOptionsUserReactionAlignment;Z)Z

    move-result v1

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;->userReactionView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/SingleReactionView;

    const-string v5, "userReactionView"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    if-eqz v5, :cond_2

    check-cast v5, Landroidx/constraintlayout/widget/d;

    const/4 v6, 0x0

    if-nez v1, :cond_0

    iput v6, v5, Landroidx/constraintlayout/widget/d;->v:I

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/extensions/internal/ViewHolderKt;->getContext(Landroidx/recyclerview/widget/o2;)Landroid/content/Context;

    move-result-object v1

    sget v6, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_spacing_small:I

    invoke-static {v1, v6}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v5, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    goto :goto_0

    :cond_0
    iput v6, v5, Landroidx/constraintlayout/widget/d;->t:I

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/extensions/internal/ViewHolderKt;->getContext(Landroidx/recyclerview/widget/o2;)Landroid/content/Context;

    move-result-object v1

    sget v6, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_spacing_small:I

    invoke-static {v1, v6}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v5, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    :goto_0
    invoke-virtual {v2, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;->userReactionView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/SingleReactionView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->userReactionItem:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/SingleReactionView;->setReaction(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;)V

    return-void

    :cond_1
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3
.end method

.method private static final bindUserReaction$lambda$3$lambda$1(Landroidx/constraintlayout/widget/p;)Ll83/a0;
    .locals 2

    const-string v0, "$this$updateConstraints"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lio/getstream/chat/android/ui/R$id;->userReactionView:I

    const/4 v1, 0x6

    invoke-virtual {p0, v0, v1}, Landroidx/constraintlayout/widget/p;->c(II)V

    sget v0, Lio/getstream/chat/android/ui/R$id;->userReactionView:I

    const/4 v1, 0x7

    invoke-virtual {p0, v0, v1}, Landroidx/constraintlayout/widget/p;->c(II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;)V
    .locals 1

    const-string v0, "userReactionItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->userReactionItem:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->bindUserAvatar()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->bindUserName()V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionAdapter$UserReactionViewHolder;->bindUserReaction()V

    return-void
.end method
