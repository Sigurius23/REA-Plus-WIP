.class public final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$2;
.super Landroidx/recyclerview/widget/u;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter;-><init>(Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/u;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "io/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$2",
        "Landroidx/recyclerview/widget/u;",
        "Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;",
        "oldItem",
        "newItem",
        "",
        "areItemsTheSame",
        "(Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;)Z",
        "areContentsTheSame",
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
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final areContentsTheSame(Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;)Z
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;

    check-cast p2, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$2;->areContentsTheSame(Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;)Z

    move-result p1

    return p1
.end method

.method public final areItemsTheSame(Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;)Z
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->getOption()Lio/getstream/chat/android/models/Option;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Option;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;->getOption()Lio/getstream/chat/android/models/Option;

    move-result-object p2

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Option;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;

    check-cast p2, Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/PollResultsDialogFragment$ResultsAdapter$2;->areItemsTheSame(Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;Lio/getstream/chat/android/ui/common/state/messages/poll/PollResultsViewState$ResultItem;)Z

    move-result p1

    return p1
.end method
