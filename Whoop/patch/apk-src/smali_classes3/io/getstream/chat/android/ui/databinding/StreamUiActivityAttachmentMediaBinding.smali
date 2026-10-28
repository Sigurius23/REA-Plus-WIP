.class public final Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final audioImageView:Landroid/widget/ImageView;

.field public final contentContainer:Landroid/widget/FrameLayout;

.field public final controls:Landroidx/media3/ui/LegacyPlayerControlView;

.field public final header:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final headerLeftActionButton:Landroid/widget/ImageView;

.field public final headerTitleTextView:Landroid/widget/TextView;

.field public final playerView:Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;

.field public final progressBar:Landroid/widget/ProgressBar;

.field private final rootView:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Landroidx/media3/ui/LegacyPlayerControlView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;Landroid/widget/ProgressBar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;->audioImageView:Landroid/widget/ImageView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;->contentContainer:Landroid/widget/FrameLayout;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;->controls:Landroidx/media3/ui/LegacyPlayerControlView;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;->header:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;->headerLeftActionButton:Landroid/widget/ImageView;

    iput-object p7, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;->headerTitleTextView:Landroid/widget/TextView;

    iput-object p8, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;->playerView:Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;

    iput-object p9, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;->progressBar:Landroid/widget/ProgressBar;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;
    .locals 12

    sget v0, Lio/getstream/chat/android/ui/R$id;->audioImageView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/ImageView;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->contentContainer:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/FrameLayout;

    if-eqz v5, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->controls:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroidx/media3/ui/LegacyPlayerControlView;

    if-eqz v6, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->header:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v7, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->headerLeftActionButton:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/widget/ImageView;

    if-eqz v8, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->headerTitleTextView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/widget/TextView;

    if-eqz v9, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->playerView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;

    if-eqz v10, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->progressBar:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Landroid/widget/ProgressBar;

    if-eqz v11, :cond_0

    new-instance v2, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;

    move-object v3, p0

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-direct/range {v2 .. v11}, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Landroidx/media3/ui/LegacyPlayerControlView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;Landroid/widget/ProgressBar;)V

    return-object v2

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

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_activity_attachment_media:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public final getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentMediaBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method
