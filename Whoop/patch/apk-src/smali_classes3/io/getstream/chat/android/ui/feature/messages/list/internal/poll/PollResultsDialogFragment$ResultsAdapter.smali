.class final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;
.super Landroidx/recyclerview/widget/z0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ResultsAdapter"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/z0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\n\u0008\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;",
        "Landroidx/recyclerview/widget/z0;",
        "Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Option;",
        "Ll83/a0;",
        "onShowAllVotesClick",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;",
        "holder",
        "position",
        "onBindViewHolder",
        "(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;I)V",
        "Lkotlin/jvm/functions/Function1;",
        "ResultViewHolder",
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
.field private final onShowAllVotesClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "onShowAllVotesClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/z0;-><init>(Landroidx/recyclerview/widget/u;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;->onShowAllVotesClick:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;->onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;I)V

    return-void
.end method

.method public final onBindViewHolder(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;I)V
    .locals 1

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/z0;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    const-string v0, "getItem(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;->bind(Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;)V

    return-void
.end method

.method public final bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;
    .locals 1

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;

    move-result-object p1

    .line 3
    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;->optionList:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$UserVoteAdapter;-><init>()V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    .line 4
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;->onShowAllVotesClick:Lkotlin/jvm/functions/Function1;

    .line 5
    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$ResultViewHolder;-><init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemResultBinding;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method
