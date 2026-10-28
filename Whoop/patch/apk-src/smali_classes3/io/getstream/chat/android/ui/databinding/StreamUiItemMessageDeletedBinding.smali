.class public final Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final deleteLabel:Landroid/widget/TextView;

.field public final footnote:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

.field public final gapView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;

.field public final marginEnd:Landroidx/constraintlayout/widget/Guideline;

.field public final marginStart:Landroidx/constraintlayout/widget/Guideline;

.field public final messageContainer:Landroid/widget/LinearLayout;

.field private final rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final threadGuideline:Landroid/widget/Space;

.field public final userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

.field public final userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/LinearLayout;Landroid/widget/Space;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;->deleteLabel:Landroid/widget/TextView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;->footnote:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;->gapView:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;->marginEnd:Landroidx/constraintlayout/widget/Guideline;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;->marginStart:Landroidx/constraintlayout/widget/Guideline;

    iput-object p7, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;->messageContainer:Landroid/widget/LinearLayout;

    iput-object p8, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;->threadGuideline:Landroid/widget/Space;

    iput-object p9, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;->userAvatarMineView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    iput-object p10, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;
    .locals 13

    sget v0, Lio/getstream/chat/android/ui/R$id;->deleteLabel:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->footnote:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;

    if-eqz v5, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->gapView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;

    if-eqz v6, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->marginEnd:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v7, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->marginStart:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroidx/constraintlayout/widget/Guideline;

    if-eqz v8, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->messageContainer:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroid/widget/LinearLayout;

    if-eqz v9, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->threadGuideline:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Landroid/widget/Space;

    if-eqz v10, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->userAvatarMineView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    if-eqz v11, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->userAvatarView:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    if-eqz v12, :cond_0

    new-instance v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;

    move-object v3, p0

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-direct/range {v2 .. v12}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FootnoteView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GapView;Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Landroid/widget/LinearLayout;Landroid/widget/Space;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_item_message_deleted:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public final getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method
