.class public final Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final imageAttachmentContent:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final imageView:Lcom/google/android/material/imageview/ShapeableImageView;

.field public final loadImage:Landroid/widget/FrameLayout;

.field public final loadingProgressBar:Landroid/widget/ProgressBar;

.field public final moreCount:Landroid/widget/FrameLayout;

.field public final moreCountLabel:Landroid/widget/TextView;

.field public final playIconCardView:Landroidx/cardview/widget/CardView;

.field public final playIconImageView:Landroid/widget/ImageView;

.field private final rootView:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/google/android/material/imageview/ShapeableImageView;Landroid/widget/FrameLayout;Landroid/widget/ProgressBar;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroidx/cardview/widget/CardView;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->imageAttachmentContent:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->imageView:Lcom/google/android/material/imageview/ShapeableImageView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->loadImage:Landroid/widget/FrameLayout;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->loadingProgressBar:Landroid/widget/ProgressBar;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->moreCount:Landroid/widget/FrameLayout;

    iput-object p7, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->moreCountLabel:Landroid/widget/TextView;

    iput-object p8, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->playIconCardView:Landroidx/cardview/widget/CardView;

    iput-object p9, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->playIconImageView:Landroid/widget/ImageView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;
    .locals 10

    move-object v1, p0

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    sget v0, Lio/getstream/chat/android/ui/R$id;->imageView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/google/android/material/imageview/ShapeableImageView;

    if-eqz v3, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->loadImage:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Landroid/widget/FrameLayout;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->loadingProgressBar:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/ProgressBar;

    if-eqz v5, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->moreCount:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/widget/FrameLayout;

    if-eqz v6, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->moreCountLabel:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->playIconCardView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroidx/cardview/widget/CardView;

    if-eqz v8, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->playIconImageView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroid/widget/ImageView;

    if-eqz v9, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    move-object v2, v1

    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/google/android/material/imageview/ShapeableImageView;Landroid/widget/FrameLayout;Landroid/widget/ProgressBar;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroidx/cardview/widget/CardView;Landroid/widget/ImageView;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_media_attachment_view:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public final getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method
