.class public final Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final mediaContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final mediaImageView:Landroid/widget/ImageView;

.field public final playButtonCardView:Landroidx/cardview/widget/CardView;

.field public final playButtonImageView:Landroid/widget/ImageView;

.field public final progressBar:Landroid/widget/ProgressBar;

.field private final rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final userAvatarCardView:Landroidx/cardview/widget/CardView;

.field public final userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroidx/cardview/widget/CardView;Landroid/widget/ImageView;Landroid/widget/ProgressBar;Landroidx/cardview/widget/CardView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->mediaContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->mediaImageView:Landroid/widget/ImageView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->playButtonCardView:Landroidx/cardview/widget/CardView;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->playButtonImageView:Landroid/widget/ImageView;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->progressBar:Landroid/widget/ProgressBar;

    iput-object p7, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->userAvatarCardView:Landroidx/cardview/widget/CardView;

    iput-object p8, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;
    .locals 9

    move-object v1, p0

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    sget v0, Lio/getstream/chat/android/ui/R$id;->mediaImageView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroid/widget/ImageView;

    if-eqz v3, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->playButtonCardView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Landroidx/cardview/widget/CardView;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->playButtonImageView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/ImageView;

    if-eqz v5, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->progressBar:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/widget/ProgressBar;

    if-eqz v6, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->userAvatarCardView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroidx/cardview/widget/CardView;

    if-eqz v7, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->userAvatarView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    if-eqz v8, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;

    move-object v2, v1

    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroidx/cardview/widget/CardView;Landroid/widget/ImageView;Landroid/widget/ProgressBar;Landroidx/cardview/widget/CardView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_item_media_attachment:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public final getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMediaAttachmentBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method
