.class public final Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/a;


# instance fields
.field public final avatarFirstVote:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

.field public final avatarSecondVote:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

.field public final barrier:Landroidx/constraintlayout/widget/Barrier;

.field public final check:Landroidx/appcompat/widget/AppCompatImageView;

.field public final option:Landroidx/appcompat/widget/AppCompatTextView;

.field private final rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final votes:Landroidx/appcompat/widget/AppCompatTextView;

.field public final votesPercentage:Lcom/google/android/material/progressindicator/LinearProgressIndicator;


# direct methods
.method private constructor <init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Landroidx/constraintlayout/widget/Barrier;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Lcom/google/android/material/progressindicator/LinearProgressIndicator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p2, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->avatarFirstVote:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    iput-object p3, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->avatarSecondVote:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    iput-object p4, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->barrier:Landroidx/constraintlayout/widget/Barrier;

    iput-object p5, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->check:Landroidx/appcompat/widget/AppCompatImageView;

    iput-object p6, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->option:Landroidx/appcompat/widget/AppCompatTextView;

    iput-object p7, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->votes:Landroidx/appcompat/widget/AppCompatTextView;

    iput-object p8, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->votesPercentage:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;
    .locals 11

    sget v0, Lio/getstream/chat/android/ui/R$id;->avatarFirstVote:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    if-eqz v4, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->avatarSecondVote:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    if-eqz v5, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->barrier:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Landroidx/constraintlayout/widget/Barrier;

    if-eqz v6, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->check:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroidx/appcompat/widget/AppCompatImageView;

    if-eqz v7, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->option:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v8, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->votes:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Landroidx/appcompat/widget/AppCompatTextView;

    if-eqz v9, :cond_0

    sget v0, Lio/getstream/chat/android/ui/R$id;->votesPercentage:I

    invoke-static {p0, v0}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    if-eqz v10, :cond_0

    new-instance v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    move-object v3, p0

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-direct/range {v2 .. v10}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Landroidx/constraintlayout/widget/Barrier;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Lcom/google/android/material/progressindicator/LinearProgressIndicator;)V

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

.method public static inflate(Landroid/view/LayoutInflater;)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-static {p0, v0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;
    .locals 2

    .line 2
    sget v0, Lio/getstream/chat/android/ui/R$layout;->stream_ui_item_poll_answer:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    if-eqz p2, :cond_0

    .line 3
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    :cond_0
    invoke-static {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->bind(Landroid/view/View;)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method

.method public final getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->rootView:Landroidx/constraintlayout/widget/ConstraintLayout;

    return-object v0
.end method
