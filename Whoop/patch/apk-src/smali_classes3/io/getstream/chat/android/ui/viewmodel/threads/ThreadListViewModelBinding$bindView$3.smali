.class final synthetic Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModelBinding$bindView$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$LoadMoreListener;
.implements Lkotlin/jvm/internal/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModelBinding;->bind(Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView;Landroidx/lifecycle/g0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $tmp0:Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModelBinding$bindView$3;->$tmp0:Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/threads/list/ThreadListView$LoadMoreListener;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lkotlin/jvm/internal/f;

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object v0

    check-cast p1, Lkotlin/jvm/internal/f;

    invoke-interface {p1}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    return v1
.end method

.method public final getFunctionDelegate()Ll83/e;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll83/e;"
        }
    .end annotation

    new-instance v0, Lkotlin/jvm/internal/i;

    iget-object v4, p0, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModelBinding$bindView$3;->$tmp0:Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;

    const-string v6, "loadNextPage()V"

    const/4 v2, 0x0

    const/4 v1, 0x0

    const-class v3, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;

    const-string v5, "loadNextPage"

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-interface {p0}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final onLoadMore()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModelBinding$bindView$3;->$tmp0:Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;->loadNextPage()V

    return-void
.end method
