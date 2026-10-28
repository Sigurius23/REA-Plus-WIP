.class public final Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final playIconCardView:Landroidx/cardview/widget/CardView;

.field public final playIconImageView:Landroid/widget/ImageView;

.field public final removeButton:Landroid/widget/ImageButton;

.field private final rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final thumbImageView:Lcom/google/android/material/imageview/ShapeableImageView;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/cardview/widget/CardView;Landroid/widget/ImageView;Landroid/widget/ImageButton;Lcom/google/android/material/imageview/ShapeableImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;->playIconCardView:Landroidx/cardview/widget/CardView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;->playIconImageView:Landroid/widget/ImageView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;->removeButton:Landroid/widget/ImageButton;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;->thumbImageView:Lcom/google/android/material/imageview/ShapeableImageView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;
    .locals 8

    sget v0, Lio/getstream/chat/android/ui/R$id;->playIconCardView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroidx/cardview/widget/CardView;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->playIconImageView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/ImageView;

    if-eqz v5, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->removeButton:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/ImageButton;

    if-eqz v6, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->thumbImageView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/google/android/material/imageview/ShapeableImageView;

    if-eqz v7, :cond_0

    new-instance v2, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;

    move-object v3, p0

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-direct/range {v2 .. v7}, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/cardview/widget/CardView;Landroid/widget/ImageView;Landroid/widget/ImageButton;Lcom/google/android/material/imageview/ShapeableImageView;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_media_attachment_preview:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public final getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method
