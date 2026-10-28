.class final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$HeaderViewHolder;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "HeaderViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$HeaderViewHolder;",
        "Landroidx/recyclerview/widget/o2;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollOptionHeaderBinding;",
        "binding",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollOptionHeaderBinding;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$Header;",
        "item",
        "Ll83/a0;",
        "bind",
        "(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$Header;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemPollOptionHeaderBinding;",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollOptionHeaderBinding;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollOptionHeaderBinding;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollOptionHeaderBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$HeaderViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollOptionHeaderBinding;

    return-void
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$Header;)V
    .locals 3

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$HeaderViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollOptionHeaderBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollOptionHeaderBinding;->award:Landroid/widget/ImageView;

    const-string v1, "award"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$Header;->isWinner()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$HeaderViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemPollOptionHeaderBinding;

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollOptionHeaderBinding;->voteCount:Landroidx/appcompat/widget/AppCompatTextView;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollOptionHeaderBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, Lio/getstream/chat/android/ui/R$string;->stream_ui_poll_vote_counts:I

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$Header;->getVoteCount()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
