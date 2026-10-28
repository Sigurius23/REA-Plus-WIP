.class public final Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;
.super Landroidx/recyclerview/widget/z1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\'\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\'\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\'\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u001c\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001dR\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\"\u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;",
        "Landroidx/recyclerview/widget/z1;",
        "",
        "loadMoreThreshold",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "loadMoreListener",
        "<init>",
        "(ILc93/a;)V",
        "dy",
        "Landroidx/recyclerview/widget/LinearLayoutManager;",
        "layoutManager",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "checkScrollUp",
        "(ILandroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V",
        "checkScrollDown",
        "handleScrollUp",
        "(Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V",
        "handleScrollDown",
        "dx",
        "onScrolled",
        "(Landroidx/recyclerview/widget/RecyclerView;II)V",
        "newState",
        "onScrollStateChanged",
        "(Landroidx/recyclerview/widget/RecyclerView;I)V",
        "enablePagination",
        "()V",
        "disablePagination",
        "I",
        "Lc93/a;",
        "",
        "paginationEnabled",
        "Z",
        "scrollStateReset",
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
.field private final loadMoreListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final loadMoreThreshold:I

.field private paginationEnabled:Z

.field private scrollStateReset:Z


# direct methods
.method public constructor <init>(ILc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "loadMoreListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->loadMoreThreshold:I

    iput-object p2, p0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->loadMoreListener:Lc93/a;

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->scrollStateReset:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Load more threshold must not be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->handleScrollUp$lambda$1(Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;)V

    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->handleScrollDown$lambda$2(Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;)V

    return-void
.end method

.method private final checkScrollDown(ILandroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    if-gtz p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p2, p3}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->handleScrollDown(Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method private final checkScrollUp(ILandroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    if-ltz p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p2, p3}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->handleScrollUp(Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method private final handleScrollDown(Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/u1;->getItemCount()I

    move-result p1

    iget-boolean v1, p0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->scrollStateReset:Z

    if-eqz v1, :cond_0

    iget v1, p0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->loadMoreThreshold:I

    sub-int/2addr p1, v1

    if-gt p1, v0, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->scrollStateReset:Z

    new-instance p1, Lio/getstream/chat/android/ui/widgets/a;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lio/getstream/chat/android/ui/widgets/a;-><init>(Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;I)V

    invoke-virtual {p2, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method private static final handleScrollDown$lambda$2(Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;)V
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->paginationEnabled:Z

    if-eqz v0, :cond_0

    iget-object p0, p0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->loadMoreListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private final handleScrollUp(Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result p1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->scrollStateReset:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->loadMoreThreshold:I

    if-gt p1, v0, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->scrollStateReset:Z

    new-instance p1, Lio/getstream/chat/android/ui/widgets/a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lio/getstream/chat/android/ui/widgets/a;-><init>(Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;I)V

    invoke-virtual {p2, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method private static final handleScrollUp$lambda$1(Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;)V
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->paginationEnabled:Z

    if-eqz v0, :cond_0

    iget-object p0, p0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->loadMoreListener:Lc93/a;

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public final disablePagination()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->paginationEnabled:Z

    return-void
.end method

.method public final enablePagination()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->paginationEnabled:Z

    return-void
.end method

.method public final onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    if-eqz p2, :cond_0

    if-eq p2, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->scrollStateReset:Z

    return-void
.end method

.method public final onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 1

    const-string p2, "recyclerView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p2, p0, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->paginationEnabled:Z

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object p2

    instance-of v0, p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v0, :cond_2

    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->getReverseLayout()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p3, p2, p1}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->checkScrollUp(ILandroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void

    :cond_1
    invoke-direct {p0, p3, p2, p1}, Lio/getstream/chat/android/ui/widgets/EndlessScrollListener;->checkScrollDown(ILandroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "EndlessScrollListener supports only LinearLayoutManager"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
