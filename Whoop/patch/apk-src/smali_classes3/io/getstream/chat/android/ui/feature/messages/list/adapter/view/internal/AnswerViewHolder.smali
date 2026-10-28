.class final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;
.super Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder<",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u000b*\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0017R \u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;",
        "binding",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Option;",
        "Ll83/a0;",
        "onOptionClick",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;Lkotlin/jvm/functions/Function1;)V",
        "",
        "optionVotes",
        "totalVotes",
        "drawProgress",
        "(II)V",
        "drawVotes",
        "",
        "invertVoteCount",
        "(Z)I",
        "pollItem",
        "bind",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;",
        "Lkotlin/jvm/functions/Function1;",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

.field private final onOptionClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onOptionClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItemViewHolder;-><init>(Lec/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->onOptionClick:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->bind$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;Landroid/view/View;)V

    return-void
.end method

.method private static final bind$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;->getVoteCount()I

    move-result p2

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;->isVotedByUser()Z

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    add-int/2addr p2, v0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;->getTotalVotes()I

    move-result v0

    invoke-direct {p1, p2, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->drawVotes(II)V

    iget-object p2, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->check:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p2}, Landroid/view/View;->isEnabled()Z

    move-result v0

    xor-int/2addr v0, v1

    invoke-virtual {p2, v0}, Landroid/view/View;->setEnabled(Z)V

    iget-object p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->onOptionClick:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;->getOption()Lio/getstream/chat/android/models/Option;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final drawProgress(II)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->votesPercentage:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    if-nez p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    int-to-float p1, p1

    int-to-float p2, p2

    div-float/2addr p1, p2

    const/16 p2, 0x64

    int-to-float p2, p2

    mul-float/2addr p1, p2

    float-to-int p1, p1

    :goto_0
    invoke-virtual {v0, p1}, Lfr/d;->setProgress(I)V

    return-void
.end method

.method private final drawVotes(II)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->votes:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->drawProgress(II)V

    return-void
.end method

.method private final invertVoteCount(Z)I
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;)V
    .locals 6

    const-string v0, "pollItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;->getClosed()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->check:Landroidx/appcompat/widget/AppCompatImageView;

    const-string v1, "check"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;->getClosed()Z

    move-result v1

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-nez v1, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    .line 4
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 5
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;->getClosed()Z

    move-result v0

    if-nez v0, :cond_1

    .line 6
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;

    const/4 v5, 0x0

    invoke-direct {v1, v5, p1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->check:Landroidx/appcompat/widget/AppCompatImageView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;->isVotedByUser()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 8
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->option:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;->getOption()Lio/getstream/chat/android/models/Option;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Option;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->votesPercentage:Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 10
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;->isVotedByUser()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 11
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_green:I

    invoke-static {v1, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    goto :goto_1

    .line 12
    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v5, Lio/getstream/chat/android/ui/R$color;->stream_ui_accent_blue:I

    invoke-static {v1, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    :goto_1
    filled-new-array {v1}, [I

    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lcom/google/android/material/progressindicator/LinearProgressIndicator;->setIndicatorColor([I)V

    .line 14
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;->getVoteCount()I

    move-result v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;->getTotalVotes()I

    move-result v1

    invoke-direct {p0, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->drawVotes(II)V

    .line 15
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;->getVotes()Ljava/util/List;

    move-result-object v0

    .line 16
    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Vote;

    if-eqz v0, :cond_3

    .line 17
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Vote;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 18
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->avatarFirstVote:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    .line 19
    invoke-virtual {v1, v0, v4}, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;->setUser(Lio/getstream/chat/android/models/User;Z)V

    .line 20
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 21
    :cond_3
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->avatarFirstVote:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v1, "avatarFirstVote"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 23
    :goto_2
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;->getVotes()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 24
    invoke-static {p1, v2}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    .line 25
    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Vote;

    if-eqz p1, :cond_4

    .line 26
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Vote;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 27
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->avatarSecondVote:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    .line 28
    invoke-virtual {v0, p1, v4}, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;->setUser(Lio/getstream/chat/android/models/User;Z)V

    .line 29
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 30
    :cond_4
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollAnswerBinding;->avatarSecondVote:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v0, "avatarSecondVote"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final bridge synthetic bind(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AnswerViewHolder;->bind(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/PollItem$Answer;)V

    return-void
.end method
