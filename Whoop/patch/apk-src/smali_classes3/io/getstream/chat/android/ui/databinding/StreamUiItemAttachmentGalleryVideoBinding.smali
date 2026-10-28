.class public final Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final playButtonCardView:Landroidx/cardview/widget/CardView;

.field public final playButtonImageView:Landroid/widget/ImageView;

.field public final playerView:Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;

.field public final progressBar:Landroid/widget/ProgressBar;

.field private final rootView:Landroid/widget/FrameLayout;

.field public final thumbnailImageView:Landroid/widget/ImageView;


# direct methods
.method private constructor <init>(Landroid/widget/FrameLayout;Landroidx/cardview/widget/CardView;Landroid/widget/ImageView;Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;Landroid/widget/ProgressBar;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->rootView:Landroid/widget/FrameLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->playButtonCardView:Landroidx/cardview/widget/CardView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->playButtonImageView:Landroid/widget/ImageView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->playerView:Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->progressBar:Landroid/widget/ProgressBar;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->thumbnailImageView:Landroid/widget/ImageView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;
    .locals 9

    sget v0, Lio/getstream/chat/android/ui/R$id;->playButtonCardView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroidx/cardview/widget/CardView;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->playButtonImageView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/ImageView;

    if-eqz v5, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->playerView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;

    if-eqz v6, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->progressBar:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/ProgressBar;

    if-eqz v7, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->thumbnailImageView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/widget/ImageView;

    if-eqz v8, :cond_0

    new-instance v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    move-object v3, p0

    check-cast v3, Landroid/widget/FrameLayout;

    invoke-direct/range {v2 .. v8}, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;-><init>(Landroid/widget/FrameLayout;Landroidx/cardview/widget/CardView;Landroid/widget/ImageView;Lio/getstream/chat/android/ui/widgets/internal/StreamPlayerView;Landroid/widget/ProgressBar;Landroid/widget/ImageView;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_item_attachment_gallery_video:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->rootView:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public final getRoot()Landroid/widget/FrameLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->rootView:Landroid/widget/FrameLayout;

    return-object v0
.end method
