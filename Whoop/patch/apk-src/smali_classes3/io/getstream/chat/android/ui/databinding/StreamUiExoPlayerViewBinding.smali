.class public final Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final exoAdOverlay:Landroid/widget/FrameLayout;

.field public final exoArtwork:Landroid/widget/ImageView;

.field public final exoBuffering:Landroid/widget/ProgressBar;

.field public final exoContentFrame:Landroidx/media3/ui/AspectRatioFrameLayout;

.field public final exoControllerPlaceholder:Landroid/view/View;

.field public final exoErrorMessage:Landroid/widget/TextView;

.field public final exoImage:Landroid/widget/ImageView;

.field public final exoOverlay:Landroid/widget/FrameLayout;

.field public final exoShutter:Landroid/view/View;

.field public final exoSubtitles:Landroidx/media3/ui/SubtitleView;

.field private final rootView:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/view/View;Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/ProgressBar;Landroidx/media3/ui/AspectRatioFrameLayout;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Landroid/view/View;Landroidx/media3/ui/SubtitleView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;->rootView:Landroid/view/View;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;->exoAdOverlay:Landroid/widget/FrameLayout;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;->exoArtwork:Landroid/widget/ImageView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;->exoBuffering:Landroid/widget/ProgressBar;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;->exoContentFrame:Landroidx/media3/ui/AspectRatioFrameLayout;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;->exoControllerPlaceholder:Landroid/view/View;

    iput-object p7, p0, Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;->exoErrorMessage:Landroid/widget/TextView;

    iput-object p8, p0, Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;->exoImage:Landroid/widget/ImageView;

    iput-object p9, p0, Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;->exoOverlay:Landroid/widget/FrameLayout;

    iput-object p10, p0, Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;->exoShutter:Landroid/view/View;

    iput-object p11, p0, Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;->exoSubtitles:Landroidx/media3/ui/SubtitleView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;
    .locals 14

    const v0, 0x7f0a044f

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/FrameLayout;

    if-eqz v4, :cond_0

    const v0, 0x7f0a0450

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/ImageView;

    if-eqz v5, :cond_0

    const v0, 0x7f0a0454

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/ProgressBar;

    if-eqz v6, :cond_0

    const v0, 0x7f0a0457

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/media3/ui/AspectRatioFrameLayout;

    if-eqz v7, :cond_0

    const v0, 0x7f0a0459

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v8

    if-eqz v8, :cond_0

    const v0, 0x7f0a045c

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/widget/TextView;

    if-eqz v9, :cond_0

    const v0, 0x7f0a0463

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroid/widget/ImageView;

    if-eqz v10, :cond_0

    const v0, 0x7f0a046a

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Landroid/widget/FrameLayout;

    if-eqz v11, :cond_0

    const v0, 0x7f0a0479

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v12

    if-eqz v12, :cond_0

    const v0, 0x7f0a047c

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Landroidx/media3/ui/SubtitleView;

    if-eqz v13, :cond_0

    new-instance v2, Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;

    move-object v3, p0

    invoke-direct/range {v2 .. v13}, Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;-><init>(Landroid/view/View;Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/ProgressBar;Landroidx/media3/ui/AspectRatioFrameLayout;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Landroid/view/View;Landroidx/media3/ui/SubtitleView;)V

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

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;
    .locals 1

    if-eqz p1, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_exo_player_view:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-static {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiExoPlayerViewBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
