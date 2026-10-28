.class public final Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\nR\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;",
        "Landroidx/lifecycle/w1;",
        "Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;",
        "controller",
        "<init>",
        "(Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;)V",
        "Ll83/a0;",
        "load",
        "()V",
        "loadNextPage",
        "Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;",
        "Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;",
        "state",
        "Landroidx/lifecycle/p0;",
        "getState",
        "()Landroidx/lifecycle/p0;",
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
.field private final controller:Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;

.field private final state:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;)V
    .locals 2

    const-string v0, "controller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;->controller:Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->getState()Lec3/f2;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p1, v0, v1}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;->state:Landroidx/lifecycle/p0;

    return-void
.end method


# virtual methods
.method public final getState()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;->state:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final load()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;->controller:Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->load()V

    return-void
.end method

.method public final loadNextPage()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/threads/ThreadListViewModel;->controller:Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->loadNextPage()V

    return-void
.end method
