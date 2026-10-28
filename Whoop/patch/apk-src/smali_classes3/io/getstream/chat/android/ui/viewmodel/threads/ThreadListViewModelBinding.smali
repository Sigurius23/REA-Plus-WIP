.class public final Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModelBinding;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a#\u0010\u0008\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;",
        "Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;",
        "view",
        "Landroidx/lifecycle/g0;",
        "lifecycleOwner",
        "Ll83/a0;",
        "bind",
        "(Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;Landroidx/lifecycle/g0;)V",
        "bindView",
        "stream-chat-android-ui-components_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModelBinding;->bindView$lambda$0(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;)Ll83/a0;

    return-void
.end method

.method public static final bind(Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;->getState()Landroidx/lifecycle/p0;

    move-result-object v0

    new-instance v1, Lhb2/c;

    const/16 v2, 0x1d

    invoke-direct {v1, p1, v2}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModelBinding$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModelBinding$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p2, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModelBinding$bindView$2;

    invoke-direct {p2, p0}, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModelBinding$bindView$2;-><init>(Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;)V

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->setUnreadThreadsBannerClickListener(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$UnreadThreadsBannerClickListener;)V

    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModelBinding$bindView$3;

    invoke-direct {p2, p0}, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModelBinding$bindView$3;-><init>(Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;)V

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->setLoadMoreListener(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$LoadMoreListener;)V

    return-void
.end method

.method private static final bindView$lambda$0(Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;)Ll83/a0;
    .locals 2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->getThreads()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->showLoading()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->getThreads()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoadingMore()Z

    move-result v1

    invoke-virtual {p0, v0, v1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->showThreads(Ljava/util/List;Z)V

    :goto_0
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->getUnseenThreadsCount()I

    move-result p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;->showUnreadThreadsBanner(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
