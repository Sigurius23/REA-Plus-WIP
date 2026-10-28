.class public final Lh6/d;
.super Lwb3/f;
.source "SourceFile"


# instance fields
.field public final synthetic c:Lh6/e;


# direct methods
.method public constructor <init>(Lh6/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh6/d;->c:Lh6/e;

    return-void
.end method


# virtual methods
.method public final S(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lh6/d;->c:Lh6/e;

    iget-object v0, v0, Lh6/e;->a:Lh6/j;

    invoke-virtual {v0, p1}, Lh6/j;->f(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final T(Lzt/q;)V
    .locals 6

    iget-object v0, p0, Lh6/d;->c:Lh6/e;

    iput-object p1, v0, Lh6/e;->c:Lzt/q;

    new-instance p1, La3/p;

    iget-object v1, v0, Lh6/e;->c:Lzt/q;

    iget-object v2, v0, Lh6/e;->a:Lh6/j;

    iget-object v3, v2, Lh6/j;->g:Lio/sentry/hints/j;

    iget-object v2, v2, Lh6/j;->i:Lh6/c;

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x22

    if-lt v4, v5, :cond_0

    invoke-static {}, Lh6/o;->a()Ljava/util/Set;

    move-result-object v4

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/room/c1;->x()Ljava/util/Set;

    move-result-object v4

    :goto_0
    invoke-direct {p1, v1, v3, v2, v4}, La3/p;-><init>(Lzt/q;Lio/sentry/hints/j;Lh6/c;Ljava/util/Set;)V

    iput-object p1, v0, Lh6/e;->b:La3/p;

    iget-object p1, v0, Lh6/e;->a:Lh6/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p1, Lh6/j;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v1, 0x1

    :try_start_0
    iput v1, p1, Lh6/j;->c:I

    iget-object v1, p1, Lh6/j;->b:La0/h;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p1, Lh6/j;->b:La0/h;

    invoke-virtual {v1}, La0/h;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p1, Lh6/j;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    iget-object v1, p1, Lh6/j;->d:Landroid/os/Handler;

    new-instance v2, Lh6/h;

    iget p1, p1, Lh6/j;->c:I

    const/4 v3, 0x0

    invoke-direct {v2, v0, p1, v3}, Lh6/h;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v0

    iget-object p1, p1, Lh6/j;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v0
.end method
