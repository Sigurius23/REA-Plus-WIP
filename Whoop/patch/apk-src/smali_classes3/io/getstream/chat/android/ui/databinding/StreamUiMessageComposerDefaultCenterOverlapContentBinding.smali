.class public final Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final horizontalGuideline:Landroidx/constraintlayout/widget/Guideline;

.field public final recordingComplete:Landroid/widget/ImageView;

.field public final recordingDelete:Landroid/widget/ImageView;

.field public final recordingPlayback:Landroid/widget/ImageView;

.field public final recordingSlider:Landroid/widget/TextView;

.field public final recordingStop:Landroid/widget/ImageView;

.field public final recordingTimer:Landroid/widget/TextView;

.field public final recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

.field private final rootView:Landroid/view/View;

.field public final verticalGuideline:Landroidx/constraintlayout/widget/Guideline;


# direct methods
.method private constructor <init>(Landroid/view/View;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;Landroidx/constraintlayout/widget/Guideline;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->rootView:Landroid/view/View;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->horizontalGuideline:Landroidx/constraintlayout/widget/Guideline;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingComplete:Landroid/widget/ImageView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingDelete:Landroid/widget/ImageView;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingPlayback:Landroid/widget/ImageView;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingSlider:Landroid/widget/TextView;

    iput-object p7, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingStop:Landroid/widget/ImageView;

    iput-object p8, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingTimer:Landroid/widget/TextView;

    iput-object p9, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->recordingWaveform:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    iput-object p10, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->verticalGuideline:Landroidx/constraintlayout/widget/Guideline;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;
    .locals 13

    sget v0, Lio/getstream/chat/android/ui/R$id;->horizontalGuideline:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->recordingComplete:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/ImageView;

    if-eqz v5, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->recordingDelete:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/ImageView;

    if-eqz v6, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->recordingPlayback:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/ImageView;

    if-eqz v7, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->recordingSlider:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroid/widget/TextView;

    if-eqz v8, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->recordingStop:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/widget/ImageView;

    if-eqz v9, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->recordingTimer:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroid/widget/TextView;

    if-eqz v10, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->recordingWaveform:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;

    if-eqz v11, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->verticalGuideline:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v12, :cond_0

    new-instance v2, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    move-object v3, p0

    invoke-direct/range {v2 .. v12}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;-><init>(Landroid/view/View;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/WaveformView;Landroidx/constraintlayout/widget/Guideline;)V

    return-object v2

    :cond_0
    move-object v3, p0

    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

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

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;
    .locals 1

    if-eqz p1, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_message_composer_default_center_overlap_content:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-static {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "parent"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapContentBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
