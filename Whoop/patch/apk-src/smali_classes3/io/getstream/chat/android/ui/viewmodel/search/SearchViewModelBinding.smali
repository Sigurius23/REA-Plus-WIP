.class public final Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModelBinding;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a#\u0010\u0008\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;",
        "Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;",
        "view",
        "Landroidx/lifecycle/g0;",
        "lifecycleOwner",
        "Ll83/a0;",
        "bind",
        "(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;Landroidx/lifecycle/g0;)V",
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
.method public static synthetic a(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModelBinding;->bindView$lambda$0(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;)Ll83/a0;

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;Ll83/a0;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModelBinding;->bindView$lambda$1(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;Ll83/a0;)Ll83/a0;

    return-void
.end method

.method public static final bind(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;Landroidx/lifecycle/g0;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycleOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->getState()Landroidx/lifecycle/p0;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/search/a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/ui/viewmodel/search/a;-><init>(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;I)V

    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModelBinding$sam$androidx_lifecycle_Observer$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModelBinding$sam$androidx_lifecycle_Observer$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p2, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;->getErrorEvents()Landroidx/lifecycle/p0;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/api/state/EventObserver;

    new-instance v2, Lio/getstream/chat/android/ui/viewmodel/search/a;

    const/4 v3, 0x1

    invoke-direct {v2, p1, v3}, Lio/getstream/chat/android/ui/viewmodel/search/a;-><init>(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;I)V

    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/api/state/EventObserver;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p2, v1}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModelBinding$bindView$3;

    invoke-direct {p2, p0}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModelBinding$bindView$3;-><init>(Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel;)V

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->setLoadMoreListener(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView$LoadMoreListener;)V

    return-void
.end method

.method private static final bindView$lambda$0(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;)Ll83/a0;
    .locals 2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoading()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->showLoading()V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->getQuery()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->getResults()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->showMessages(Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->isLoadingMore()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/viewmodel/search/SearchViewModel$State;->getResults()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->setPaginationEnabled(Z)V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final bindView$lambda$1(Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;Ll83/a0;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/search/list/SearchResultListView;->showError()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
