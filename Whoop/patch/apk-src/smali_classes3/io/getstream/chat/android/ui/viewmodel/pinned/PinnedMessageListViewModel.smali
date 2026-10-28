.class public final Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\tR\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR#\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00100\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\r\u001a\u0004\u0008\u0012\u0010\u000f\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModel;",
        "Landroidx/lifecycle/w1;",
        "Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;",
        "controller",
        "<init>",
        "(Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;)V",
        "Ll83/a0;",
        "loadMore",
        "()V",
        "Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;",
        "Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/ui/common/state/pinned/PinnedMessageListState;",
        "state",
        "Landroidx/lifecycle/p0;",
        "getState",
        "()Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/client/api/state/Event;",
        "errorEvents",
        "getErrorEvents",
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
.field private final controller:Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;

.field private final errorEvents:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final state:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;)V
    .locals 4

    const-string v0, "controller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModel;->controller:Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->getState()Lec3/f2;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModel;->state:Landroidx/lifecycle/p0;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->getErrorEvents()Lec3/t1;

    move-result-object v0

    new-instance v3, Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModel$special$$inlined$map$1;

    invoke-direct {v3, v0}, Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModel$special$$inlined$map$1;-><init>(Lec3/l;)V

    invoke-static {v3, v1, v2}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModel;->errorEvents:Landroidx/lifecycle/p0;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->load()V

    return-void
.end method


# virtual methods
.method public final getErrorEvents()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModel;->errorEvents:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getState()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModel;->state:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final loadMore()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/pinned/PinnedMessageListViewModel;->controller:Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/feature/pinned/PinnedMessageListController;->loadMore()V

    return-void
.end method
