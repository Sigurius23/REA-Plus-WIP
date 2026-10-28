.class public final Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final giphyLabel:Landroid/widget/ImageView;

.field public final imageView:Lcom/google/android/material/imageview/ShapeableImageView;

.field public final loadImage:Landroid/widget/FrameLayout;

.field public final loadingProgressBar:Landroid/widget/ProgressBar;

.field public final mediaAttachmentContent:Landroidx/constraintlayout/widget/ConstraintLayout;

.field private final rootView:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Lcom/google/android/material/imageview/ShapeableImageView;Landroid/widget/FrameLayout;Landroid/widget/ProgressBar;Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;->giphyLabel:Landroid/widget/ImageView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;->imageView:Lcom/google/android/material/imageview/ShapeableImageView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;->loadImage:Landroid/widget/FrameLayout;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;->loadingProgressBar:Landroid/widget/ProgressBar;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;->mediaAttachmentContent:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;
    .locals 9

    sget v0, Lio/getstream/chat/android/ui/R$id;->giphyLabel:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/ImageView;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->imageView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/google/android/material/imageview/ShapeableImageView;

    if-eqz v5, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->loadImage:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/FrameLayout;

    if-eqz v6, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->loadingProgressBar:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/ProgressBar;

    if-eqz v7, :cond_0

    move-object v3, p0

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance v2, Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;

    move-object v8, v3

    invoke-direct/range {v2 .. v8}, Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Lcom/google/android/material/imageview/ShapeableImageView;Landroid/widget/FrameLayout;Landroid/widget/ProgressBar;Landroidx/constraintlayout/widget/ConstraintLayout;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_giphy_media_attachment_view:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public final getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiGiphyMediaAttachmentViewBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method
