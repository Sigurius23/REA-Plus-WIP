.class public final Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final reactionContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

.field private final rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

.field public final userNameTextView:Landroid/widget/TextView;

.field public final userReactionView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/SingleReactionView;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/SingleReactionView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;->reactionContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;->userNameTextView:Landroid/widget/TextView;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;->userReactionView:Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/SingleReactionView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;
    .locals 6

    move-object v1, p0

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    sget v0, Lio/getstream/chat/android/ui/R$id;->userAvatarView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    if-eqz v3, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->userNameTextView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->userReactionView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/SingleReactionView;

    if-eqz v5, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;

    move-object v2, v1

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/SingleReactionView;)V

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_item_user_reaction:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public final getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemUserReactionBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method
