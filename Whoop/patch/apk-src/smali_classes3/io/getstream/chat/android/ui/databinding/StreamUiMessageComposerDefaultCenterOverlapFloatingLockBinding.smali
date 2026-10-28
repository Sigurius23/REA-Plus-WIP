.class public final Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field private final rootView:Landroid/widget/ImageView;


# direct methods
.method private constructor <init>(Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding;->rootView:Landroid/widget/ImageView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding;

    check-cast p0, Landroid/widget/ImageView;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding;-><init>(Landroid/widget/ImageView;)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "rootView"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_message_composer_default_center_overlap_floating_lock:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding;->rootView:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final getRoot()Landroid/widget/ImageView;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterOverlapFloatingLockBinding;->rootView:Landroid/widget/ImageView;

    return-object v0
.end method
