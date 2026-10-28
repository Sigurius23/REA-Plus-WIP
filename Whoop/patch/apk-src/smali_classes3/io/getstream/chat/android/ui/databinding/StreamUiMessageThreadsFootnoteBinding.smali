.class public final Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final bottomLine:Landroidx/constraintlayout/widget/Guideline;

.field public final firstMineUserImage:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

.field public final firstTheirUserImage:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

.field private final rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final secondMineUserImage:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

.field public final secondTheirUserImage:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

.field public final threadRepliesButton:Landroid/widget/TextView;

.field public final threadsFootnoteContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final threadsOrnamentLeft:Landroidx/appcompat/widget/AppCompatImageView;

.field public final threadsOrnamentRight:Landroidx/appcompat/widget/AppCompatImageView;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/Guideline;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->bottomLine:Landroidx/constraintlayout/widget/Guideline;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->firstMineUserImage:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->firstTheirUserImage:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->secondMineUserImage:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->secondTheirUserImage:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    iput-object p7, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->threadRepliesButton:Landroid/widget/TextView;

    iput-object p8, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->threadsFootnoteContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p9, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->threadsOrnamentLeft:Landroidx/appcompat/widget/AppCompatImageView;

    iput-object p10, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->threadsOrnamentRight:Landroidx/appcompat/widget/AppCompatImageView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;
    .locals 13

    sget v0, Lio/getstream/chat/android/ui/R$id;->bottomLine:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->firstMineUserImage:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    if-eqz v5, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->firstTheirUserImage:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    if-eqz v6, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->secondMineUserImage:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    if-eqz v7, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->secondTheirUserImage:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    if-eqz v8, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->threadRepliesButton:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/widget/TextView;

    if-eqz v9, :cond_0

    move-object v3, p0

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    sget v0, Lio/getstream/chat/android/ui/R$id;->threadsOrnamentLeft:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Landroidx/appcompat/widget/AppCompatImageView;

    if-eqz v11, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->threadsOrnamentRight:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Landroidx/appcompat/widget/AppCompatImageView;

    if-eqz v12, :cond_0

    new-instance v2, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;

    move-object v10, v3

    invoke-direct/range {v2 .. v12}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/Guideline;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_message_threads_footnote:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public final getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageThreadsFootnoteBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method
