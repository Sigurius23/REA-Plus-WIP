.class public final Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final dismissInputModeButton:Landroid/widget/ImageView;

.field public final inputModeHeaderContainer:Landroid/widget/FrameLayout;

.field public final inputModeImageView:Landroid/widget/ImageView;

.field public final inputModeTextView:Landroid/widget/TextView;

.field private final rootView:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/TextView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;->rootView:Landroid/view/View;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;->dismissInputModeButton:Landroid/widget/ImageView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;->inputModeHeaderContainer:Landroid/widget/FrameLayout;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;->inputModeImageView:Landroid/widget/ImageView;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;->inputModeTextView:Landroid/widget/TextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;
    .locals 8

    sget v0, Lio/getstream/chat/android/ui/R$id;->dismissInputModeButton:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/ImageView;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->inputModeHeaderContainer:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/FrameLayout;

    if-eqz v5, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->inputModeImageView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroid/widget/ImageView;

    if-eqz v6, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->inputModeTextView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_0

    new-instance v2, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;-><init>(Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/TextView;)V

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

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;
    .locals 1

    if-eqz p1, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_message_composer_default_header_content:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-static {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
