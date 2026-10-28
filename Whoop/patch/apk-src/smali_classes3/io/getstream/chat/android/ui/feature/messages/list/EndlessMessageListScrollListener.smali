.class public final Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;
.super Landroidx/recyclerview/widget/z1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0014\u0018\u0000 \'2\u00020\u0001:\u0001\'B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\'\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\'\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0005\u00a2\u0006\u0004\u0008 \u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010!R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\"R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\"R\u0016\u0010#\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0016\u0010%\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010$R\u0016\u0010&\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010$\u00a8\u0006("
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;",
        "Landroidx/recyclerview/widget/z1;",
        "",
        "loadMoreThreshold",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "loadMoreAtTopListener",
        "loadMoreAtBottomListener",
        "<init>",
        "(ILc93/a;Lc93/a;)V",
        "dy",
        "Landroidx/recyclerview/widget/LinearLayoutManager;",
        "layoutManager",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "handleScroll",
        "(ILandroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V",
        "handleScrollDown",
        "(Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V",
        "handleScrollUp",
        "",
        "shouldFetch",
        "fetchAtBottom",
        "(Z)V",
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
        "paginationEnabled",
        "Z",
        "shouldFetchBottomMessages",
        "scrollStateReset",
        "Companion",
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


# static fields
.field private static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener$Companion;

.field private static final DEBUG:Z = false

.field private static final TAG:Ljava/lang/String; = "Chat:EndlessMessageScroll"


# instance fields
.field private final loadMoreAtBottomListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final loadMoreAtTopListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final loadMoreThreshold:I

.field private paginationEnabled:Z

.field private scrollStateReset:Z

.field private shouldFetchBottomMessages:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener$Companion;

    return-void
.end method

.method public constructor <init>(ILc93/a;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "loadMoreAtTopListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loadMoreAtBottomListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->loadMoreThreshold:I

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->loadMoreAtTopListener:Lc93/a;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->loadMoreAtBottomListener:Lc93/a;

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->scrollStateReset:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Load more threshold must not be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final handleScroll(ILandroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->paginationEnabled:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-ltz p1, :cond_1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->shouldFetchBottomMessages:Z

    if-eqz v0, :cond_1

    invoke-direct {p0, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->handleScrollDown(Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void

    :cond_1
    if-gez p1, :cond_2

    invoke-direct {p0, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->handleScrollUp(Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private final handleScrollDown(Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 3

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result p1

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-boolean v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->scrollStateReset:Z

    if-eqz v2, :cond_1

    iget v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->loadMoreThreshold:I

    sub-int/2addr v0, v2

    if-le p1, v0, :cond_1

    iput-boolean v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->scrollStateReset:Z

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->loadMoreAtBottomListener:Lc93/a;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/t0;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/feature/messages/list/t0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method private static final handleScrollDown$lambda$2(Lc93/a;)V
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private final handleScrollUp(Landroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result p1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->scrollStateReset:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->loadMoreThreshold:I

    if-gt p1, v0, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->scrollStateReset:Z

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->loadMoreAtTopListener:Lc93/a;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/t0;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/feature/messages/list/t0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method private static final handleScrollUp$lambda$3(Lc93/a;)V
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final disablePagination()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->paginationEnabled:Z

    return-void
.end method

.method public final enablePagination()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->paginationEnabled:Z

    return-void
.end method

.method public final fetchAtBottom(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->shouldFetchBottomMessages:Z

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
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->scrollStateReset:Z

    return-void
.end method

.method public final onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 1

    const-string p2, "recyclerView"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->paginationEnabled:Z

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object p2

    instance-of v0, p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v0, :cond_1

    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {p0, p3, p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/EndlessMessageListScrollListener;->handleScroll(ILandroidx/recyclerview/widget/LinearLayoutManager;Landroidx/recyclerview/widget/RecyclerView;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "EndlessScrollListener supports only LinearLayoutManager"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
