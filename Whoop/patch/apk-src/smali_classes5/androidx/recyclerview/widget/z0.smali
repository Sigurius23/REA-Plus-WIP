.class public abstract Landroidx/recyclerview/widget/z0;
.super Landroidx/recyclerview/widget/i1;
.source "SourceFile"


# instance fields
.field final mDiffer:Landroidx/recyclerview/widget/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/recyclerview/widget/h;"
        }
    .end annotation
.end field

.field private final mListener:Landroidx/recyclerview/widget/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/recyclerview/widget/f;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/u;)V
    .locals 6

    invoke-direct {p0}, Landroidx/recyclerview/widget/i1;-><init>()V

    new-instance v0, Landroidx/recyclerview/widget/y0;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/y0;-><init>(Landroidx/recyclerview/widget/z0;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/z0;->mListener:Landroidx/recyclerview/widget/f;

    new-instance v1, Landroidx/recyclerview/widget/h;

    new-instance v2, Landroidx/recyclerview/widget/c;

    invoke-direct {v2, p0}, Landroidx/recyclerview/widget/c;-><init>(Ljava/lang/Object;)V

    sget-object v3, Landroidx/recyclerview/widget/d;->a:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    sget-object v4, Landroidx/recyclerview/widget/d;->b:Ljava/util/concurrent/ExecutorService;

    if-nez v4, :cond_0

    const/4 v4, 0x2

    invoke-static {v4}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v4

    check-cast v4, Ljava/util/concurrent/ExecutorService;

    sput-object v4, Landroidx/recyclerview/widget/d;->b:Ljava/util/concurrent/ExecutorService;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v3, Landroidx/recyclerview/widget/d;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Lqg3/d;

    const/4 v5, 0x3

    invoke-direct {v4, v5, v3, p1}, Lqg3/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v1, v2, v4}, Landroidx/recyclerview/widget/h;-><init>(Landroidx/recyclerview/widget/c;Lqg3/d;)V

    iput-object v1, p0, Landroidx/recyclerview/widget/z0;->mDiffer:Landroidx/recyclerview/widget/h;

    iget-object p1, v1, Landroidx/recyclerview/widget/h;->d:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :goto_1
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public final getCurrentList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/z0;->mDiffer:Landroidx/recyclerview/widget/h;

    iget-object v0, v0, Landroidx/recyclerview/widget/h;->f:Ljava/util/List;

    return-object v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/z0;->mDiffer:Landroidx/recyclerview/widget/h;

    iget-object v0, v0, Landroidx/recyclerview/widget/h;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getItemCount()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/z0;->mDiffer:Landroidx/recyclerview/widget/h;

    iget-object v0, v0, Landroidx/recyclerview/widget/h;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final onCurrentListChanged(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public final submitList(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/z0;->mDiffer:Landroidx/recyclerview/widget/h;

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/h;->b(Ljava/util/List;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final submitList(Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    .line 3
    iget-object v0, p0, Landroidx/recyclerview/widget/z0;->mDiffer:Landroidx/recyclerview/widget/h;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/h;->b(Ljava/util/List;Ljava/lang/Runnable;)V

    return-void
.end method
