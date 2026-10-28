.class public final Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultLeadingContentBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final attachmentsButton:Landroid/widget/ImageView;

.field public final commandsButton:Landroid/widget/ImageView;

.field private final rootView:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultLeadingContentBinding;->rootView:Landroid/view/View;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultLeadingContentBinding;->attachmentsButton:Landroid/widget/ImageView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultLeadingContentBinding;->commandsButton:Landroid/widget/ImageView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultLeadingContentBinding;
    .locals 3

    sget v0, Lio/getstream/chat/android/ui/R$id;->attachmentsButton:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->commandsButton:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    if-eqz v2, :cond_0

    new-instance v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultLeadingContentBinding;

    invoke-direct {v0, p0, v1, v2}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultLeadingContentBinding;-><init>(Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/ImageView;)V

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

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultLeadingContentBinding;
    .locals 1

    if-eqz p1, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_message_composer_default_leading_content:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-static {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultLeadingContentBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultLeadingContentBinding;

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultLeadingContentBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
