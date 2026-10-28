.class public final Lio/getstream/chat/android/ui/widgets/internal/SnapToTopDataObserver;
.super Landroidx/recyclerview/widget/k1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\'\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/widgets/internal/SnapToTopDataObserver;",
        "Landroidx/recyclerview/widget/k1;",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "<init>",
        "(Landroidx/recyclerview/widget/RecyclerView;)V",
        "",
        "itemPosition",
        "Ll83/a0;",
        "autoScrollToTopIfNecessary",
        "(I)V",
        "fromPosition",
        "toPosition",
        "itemCount",
        "onItemRangeMoved",
        "(III)V",
        "positionStart",
        "onItemRangeInserted",
        "(II)V",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "Landroidx/recyclerview/widget/LinearLayoutManager;",
        "layoutManager",
        "Landroidx/recyclerview/widget/LinearLayoutManager;",
        "getLayoutManager",
        "()Landroidx/recyclerview/widget/LinearLayoutManager;",
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
.field private final layoutManager:Landroidx/recyclerview/widget/LinearLayoutManager;

.field private final recyclerView:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/internal/SnapToTopDataObserver;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object p1

    instance-of v0, p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/recyclerview/widget/LinearLayoutManager;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/internal/SnapToTopDataObserver;->layoutManager:Landroidx/recyclerview/widget/LinearLayoutManager;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Auto scroll only works with LinearLayoutManager"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final autoScrollToTopIfNecessary(I)V
    .locals 1

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/ui/widgets/internal/SnapToTopDataObserver;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/ui/widgets/internal/SnapToTopDataObserver;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/widgets/internal/SnapToTopDataObserver;->layoutManager:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/ui/widgets/internal/SnapToTopDataObserver;->layoutManager:Landroidx/recyclerview/widget/LinearLayoutManager;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->scrollToPosition(I)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final getLayoutManager()Landroidx/recyclerview/widget/LinearLayoutManager;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/SnapToTopDataObserver;->layoutManager:Landroidx/recyclerview/widget/LinearLayoutManager;

    return-object v0
.end method

.method public final onItemRangeInserted(II)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/widgets/internal/SnapToTopDataObserver;->autoScrollToTopIfNecessary(I)V

    return-void
.end method

.method public final onItemRangeMoved(III)V
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/widgets/internal/SnapToTopDataObserver;->autoScrollToTopIfNecessary(I)V

    return-void
.end method
