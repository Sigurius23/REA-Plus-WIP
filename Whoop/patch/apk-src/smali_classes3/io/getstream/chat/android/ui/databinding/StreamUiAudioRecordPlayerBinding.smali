.class public final Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final audioFileIcon:Landroidx/appcompat/widget/AppCompatImageView;

.field public final audioFileIconContainer:Landroid/widget/FrameLayout;

.field public final audioSeekBar:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;

.field public final audioSpeedButton:Landroidx/appcompat/widget/AppCompatTextView;

.field public final duration:Landroidx/appcompat/widget/AppCompatTextView;

.field public final playButton:Landroidx/appcompat/widget/AppCompatImageButton;

.field public final playbackProgressContainer:Landroid/widget/FrameLayout;

.field public final progressBar:Landroid/widget/ProgressBar;

.field private final rootView:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/FrameLayout;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatImageButton;Landroid/widget/FrameLayout;Landroid/widget/ProgressBar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->rootView:Landroid/view/View;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioFileIcon:Landroidx/appcompat/widget/AppCompatImageView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioFileIconContainer:Landroid/widget/FrameLayout;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSeekBar:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->audioSpeedButton:Landroidx/appcompat/widget/AppCompatTextView;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->duration:Landroidx/appcompat/widget/AppCompatTextView;

    iput-object p7, p0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->playButton:Landroidx/appcompat/widget/AppCompatImageButton;

    iput-object p8, p0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->playbackProgressContainer:Landroid/widget/FrameLayout;

    iput-object p9, p0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->progressBar:Landroid/widget/ProgressBar;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;
    .locals 12

    sget v0, Lio/getstream/chat/android/ui/R$id;->audioFileIcon:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroidx/appcompat/widget/AppCompatImageView;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->audioFileIconContainer:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/FrameLayout;

    if-eqz v5, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->audioSeekBar:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;

    if-eqz v6, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->audioSpeedButton:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v7, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->duration:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v8, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->playButton:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroidx/appcompat/widget/AppCompatImageButton;

    if-eqz v9, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->playbackProgressContainer:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroid/widget/FrameLayout;

    if-eqz v10, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->progressBar:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Landroid/widget/ProgressBar;

    if-eqz v11, :cond_0

    new-instance v2, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;

    move-object v3, p0

    invoke-direct/range {v2 .. v11}, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;-><init>(Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/FrameLayout;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AudioWavesSeekBar;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatImageButton;Landroid/widget/FrameLayout;Landroid/widget/ProgressBar;)V

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

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;
    .locals 1

    if-eqz p1, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_audio_record_player:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-static {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiAudioRecordPlayerBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
