.class public final Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final attachmentActionsButton:Landroid/widget/ImageView;

.field public final attachmentDateTextView:Landroid/widget/TextView;

.field public final bottomBar:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final centerContent:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final closeButton:Landroid/widget/ImageView;

.field public final galleryOverviewButton:Landroid/widget/ImageView;

.field public final galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

.field public final mediaInformationTextView:Landroid/widget/TextView;

.field public final progressBar:Landroid/widget/ProgressBar;

.field private final rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final shareMediaButton:Landroid/widget/ImageView;

.field public final toolbar:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final userTextView:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroidx/viewpager2/widget/ViewPager2;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->attachmentActionsButton:Landroid/widget/ImageView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->attachmentDateTextView:Landroid/widget/TextView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->bottomBar:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->centerContent:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->closeButton:Landroid/widget/ImageView;

    iput-object p7, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryOverviewButton:Landroid/widget/ImageView;

    iput-object p8, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->galleryViewPager:Landroidx/viewpager2/widget/ViewPager2;

    iput-object p9, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->mediaInformationTextView:Landroid/widget/TextView;

    iput-object p10, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->progressBar:Landroid/widget/ProgressBar;

    iput-object p11, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->shareMediaButton:Landroid/widget/ImageView;

    iput-object p12, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->toolbar:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p13, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->userTextView:Landroid/widget/TextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;
    .locals 17

    move-object/from16 v0, p0

    sget v1, Lio/getstream/chat/android/ui/R$id;->attachmentActionsButton:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/ImageView;

    if-eqz v5, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->attachmentDateTextView:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/widget/TextView;

    if-eqz v6, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->bottomBar:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v7, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->centerContent:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v8, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->closeButton:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Landroid/widget/ImageView;

    if-eqz v9, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->galleryOverviewButton:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Landroid/widget/ImageView;

    if-eqz v10, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->galleryViewPager:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Landroidx/viewpager2/widget/ViewPager2;

    if-eqz v11, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->mediaInformationTextView:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Landroid/widget/TextView;

    if-eqz v12, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->progressBar:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Landroid/widget/ProgressBar;

    if-eqz v13, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->shareMediaButton:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Landroid/widget/ImageView;

    if-eqz v14, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->toolbar:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v15, :cond_0

    sget v1, Lio/getstream/chat/android/ui/R$id;->userTextView:I

    invoke-static {v0, v1}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    move-object/from16 v16, v2

    check-cast v16, Landroid/widget/TextView;

    if-eqz v16, :cond_0

    new-instance v3, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    move-object v4, v0

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-direct/range {v3 .. v16}, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroidx/viewpager2/widget/ViewPager2;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;)V

    return-object v3

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "Missing required view with ID: "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_activity_attachment_gallery:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public final getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiActivityAttachmentGalleryBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method
