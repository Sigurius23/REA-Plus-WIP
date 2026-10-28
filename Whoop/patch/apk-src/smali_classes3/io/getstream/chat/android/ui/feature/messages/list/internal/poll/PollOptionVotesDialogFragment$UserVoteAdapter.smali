.class final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter;
.super Landroidx/recyclerview/widget/z0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "UserVoteAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$HeaderViewHolder;,
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$UserVoteDiffCallback;,
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$UserVoteViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/z0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0013\u0014\u0015B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter;",
        "Landroidx/recyclerview/widget/z0;",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem;",
        "Landroidx/recyclerview/widget/o2;",
        "<init>",
        "()V",
        "",
        "position",
        "getItemViewType",
        "(I)I",
        "Landroid/view/ViewGroup;",
        "parent",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;",
        "holder",
        "Ll83/a0;",
        "onBindViewHolder",
        "(Landroidx/recyclerview/widget/o2;I)V",
        "HeaderViewHolder",
        "UserVoteViewHolder",
        "UserVoteDiffCallback",
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


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$UserVoteDiffCallback;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$UserVoteDiffCallback;

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/z0;-><init>(Landroidx/recyclerview/widget/u;)V

    return-void
.end method


# virtual methods
.method public final getItemViewType(I)I
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem;

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$Header;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    instance-of p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$VoteItem;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem;

    instance-of v0, p2, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$Header;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$HeaderViewHolder;

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$Header;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$HeaderViewHolder;->bind(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$Header;)V

    return-void

    :cond_0
    instance-of v0, p2, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$VoteItem;

    if-eqz v0, :cond_1

    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$UserVoteViewHolder;

    check-cast p2, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$VoteItem;

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$PollOptionVotesListItem$VoteItem;->getVote()Lio/getstream/chat/android/models/Vote;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$UserVoteViewHolder;->bind(Lio/getstream/chat/android/models/Vote;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 2

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p2, :cond_0

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$HeaderViewHolder;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-static {v1, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemPollOptionHeaderBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemPollOptionHeaderBinding;

    move-result-object p1

    invoke-direct {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$HeaderViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemPollOptionHeaderBinding;)V

    return-object p2

    :cond_0
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$UserVoteViewHolder;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-static {v1, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;

    move-result-object p1

    invoke-direct {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollOptionVotesDialogFragment$UserVoteAdapter$UserVoteViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemResultUserBinding;)V

    return-object p2
.end method
