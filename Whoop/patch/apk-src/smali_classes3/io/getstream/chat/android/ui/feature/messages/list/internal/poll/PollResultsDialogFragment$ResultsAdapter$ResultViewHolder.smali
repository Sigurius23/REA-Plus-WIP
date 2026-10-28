.class final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ResultViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;",
        "Landroidx/recyclerview/widget/o2;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;",
        "binding",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Option;",
        "Ll83/a0;",
        "onShowAllVotesClick",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;Lkotlin/jvm/functions/Function1;)V",
        "Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;",
        "result",
        "bind",
        "(Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;

.field private final onShowAllVotesClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onShowAllVotesClick"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;->onShowAllVotesClick:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static a(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;->onShowAllVotesClick:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->getOption()Lio/getstream/chat/android/models/Option;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final bind$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;->onShowAllVotesClick:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->getOption()Lio/getstream/chat/android/models/Option;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;)V
    .locals 4

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;->option:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->getOption()Lio/getstream/chat/android/models/Option;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Option;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;->votes:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, Lio/getstream/chat/android/ui/R$string;->stream_ui_poll_vote_counts:I

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->getVoteCount()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;->optionList:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v0

    instance-of v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter;

    if-eqz v1, :cond_0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->getVotes()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/z0;->submitList(Ljava/util/List;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;->award:Landroid/widget/ImageView;

    const-string v1, "award"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->isWinner()Z

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    move v1, v3

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;->showAll:Landroidx/appcompat/widget/AppCompatButton;

    const-string v1, "showAll"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->getShowAllButton()Z

    move-result v1

    if-eqz v1, :cond_3

    move v2, v3

    :cond_3
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;->showAll:Landroidx/appcompat/widget/AppCompatButton;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/c;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/c;-><init>(Landroidx/recyclerview/widget/o2;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
