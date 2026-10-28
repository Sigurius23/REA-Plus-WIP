.class public final Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final actionButton:Landroid/widget/ImageView;

.field public final fileSize:Landroid/widget/TextView;

.field public final fileTitle:Landroid/widget/TextView;

.field public final fileTypeIcon:Landroid/widget/ImageView;

.field public final playerView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;

.field public final progressBar:Landroid/widget/ProgressBar;

.field private final rootView:Landroid/widget/FrameLayout;

.field public final uploadingContainer:Landroidx/constraintlayout/widget/ConstraintLayout;


# direct methods
.method private constructor <init>(Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;Landroid/widget/ProgressBar;Landroidx/constraintlayout/widget/ConstraintLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;->rootView:Landroid/widget/FrameLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;->actionButton:Landroid/widget/ImageView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;->fileSize:Landroid/widget/TextView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;->fileTitle:Landroid/widget/TextView;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;->fileTypeIcon:Landroid/widget/ImageView;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;->playerView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;

    iput-object p7, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;->progressBar:Landroid/widget/ProgressBar;

    iput-object p8, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;->uploadingContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;
    .locals 11

    sget v0, Lio/getstream/chat/android/ui/R$id;->actionButton:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/ImageView;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->fileSize:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->fileTitle:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/TextView;

    if-eqz v6, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->fileTypeIcon:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/ImageView;

    if-eqz v7, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->playerView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;

    if-eqz v8, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->progressBar:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/widget/ProgressBar;

    if-eqz v9, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->uploadingContainer:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v10, :cond_0

    new-instance v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;

    move-object v3, p0

    check-cast v3, Landroid/widget/FrameLayout;

    invoke-direct/range {v2 .. v10}, Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;-><init>(Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioRecordPlayerView;Landroid/widget/ProgressBar;Landroidx/constraintlayout/widget/ConstraintLayout;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_item_recording_attachment:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;->rootView:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public final getRoot()Landroid/widget/FrameLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemRecordingAttachmentBinding;->rootView:Landroid/widget/FrameLayout;

    return-object v0
.end method
