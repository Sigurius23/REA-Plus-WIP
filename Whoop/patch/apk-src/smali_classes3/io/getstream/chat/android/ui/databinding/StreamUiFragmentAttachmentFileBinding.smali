.class public final Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final audioAccessImageView:Landroid/widget/ImageView;

.field public final audioAccessTextView:Landroid/widget/TextView;

.field public final dialogContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final emptyPlaceholderTextView:Landroid/widget/TextView;

.field public final fileManagerImageView:Landroid/widget/ImageView;

.field public final grantPermissionsInclude:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentPermissionViewBinding;

.field public final progressBar:Landroid/widget/ProgressBar;

.field public final recentFilesRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field public final recentFilesTextView:Landroid/widget/TextView;

.field private final rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final visualMediaAccessImageView:Landroid/widget/ImageView;

.field public final visualMediaAccessTextView:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentPermissionViewBinding;Landroid/widget/ProgressBar;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->audioAccessImageView:Landroid/widget/ImageView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->audioAccessTextView:Landroid/widget/TextView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->dialogContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->emptyPlaceholderTextView:Landroid/widget/TextView;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->fileManagerImageView:Landroid/widget/ImageView;

    iput-object p7, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->grantPermissionsInclude:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentPermissionViewBinding;

    iput-object p8, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->progressBar:Landroid/widget/ProgressBar;

    iput-object p9, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->recentFilesRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p10, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->recentFilesTextView:Landroid/widget/TextView;

    iput-object p11, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->visualMediaAccessImageView:Landroid/widget/ImageView;

    iput-object p12, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->visualMediaAccessTextView:Landroid/widget/TextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;
    .locals 15

    sget v0, Lio/getstream/chat/android/ui/R$id;->audioAccessImageView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/ImageView;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->audioAccessTextView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_0

    move-object v3, p0

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    sget v0, Lio/getstream/chat/android/ui/R$id;->emptyPlaceholderTextView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->fileManagerImageView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/widget/ImageView;

    if-eqz v8, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->grantPermissionsInclude:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentPermissionViewBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentPermissionViewBinding;

    move-result-object v9

    sget v0, Lio/getstream/chat/android/ui/R$id;->progressBar:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroid/widget/ProgressBar;

    if-eqz v10, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->recentFilesRecyclerView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v11, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->recentFilesTextView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Landroid/widget/TextView;

    if-eqz v12, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->visualMediaAccessImageView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Landroid/widget/ImageView;

    if-eqz v13, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->visualMediaAccessTextView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Landroid/widget/TextView;

    if-eqz v14, :cond_0

    new-instance v2, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;

    move-object v6, v3

    invoke-direct/range {v2 .. v14}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentPermissionViewBinding;Landroid/widget/ProgressBar;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_fragment_attachment_file:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public final getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiFragmentAttachmentFileBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method
