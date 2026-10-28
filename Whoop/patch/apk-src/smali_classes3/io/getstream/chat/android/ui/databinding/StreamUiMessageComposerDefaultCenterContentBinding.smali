.class public final Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final attachmentsRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field public final messageEditText:Landroidx/appcompat/widget/AppCompatEditText;

.field public final messageInputContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final messageReplyView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;

.field private final rootView:Landroid/view/View;


# direct methods
.method private constructor <init>(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/constraintlayout/widget/ConstraintLayout;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->rootView:Landroid/view/View;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->attachmentsRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageEditText:Landroidx/appcompat/widget/AppCompatEditText;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageInputContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->messageReplyView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;
    .locals 8

    sget v0, Lio/getstream/chat/android/ui/R$id;->attachmentsRecyclerView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->messageEditText:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroidx/appcompat/widget/AppCompatEditText;

    if-eqz v5, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->messageInputContainer:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v6, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->messageReplyView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;

    if-eqz v7, :cond_0

    new-instance v2, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;-><init>(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/constraintlayout/widget/ConstraintLayout;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;)V

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

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;
    .locals 1

    if-eqz p1, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_message_composer_default_center_content:I

    invoke-virtual {p0, v0, p1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-static {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;

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

    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultCenterContentBinding;->rootView:Landroid/view/View;

    return-object v0
.end method
