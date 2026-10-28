.class public final Lzk/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lul/b;


# static fields
.field public static final V:Lz5/b;


# instance fields
.field public final E:Lz5/b;

.field public final F:Lzk/q;

.field public final G:Lcl/b;

.field public final H:Lcl/b;

.field public final I:Lcl/b;

.field public final J:Ljava/util/concurrent/atomic/AtomicInteger;

.field public K:Lzk/r;

.field public L:Z

.field public M:Z

.field public N:Lzk/z;

.field public O:Lwk/a;

.field public P:Z

.field public Q:Lcom/bumptech/glide/load/engine/GlideException;

.field public R:Z

.field public S:Lzk/t;

.field public T:Lzk/i;

.field public volatile U:Z

.field public final w:Lzk/o;

.field public final x:Lul/d;

.field public final y:Lzk/s;

.field public final z:Lg5/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lz5/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lzk/p;->V:Lz5/b;

    return-void
.end method

.method public constructor <init>(Lcl/b;Lcl/b;Lcl/b;Lcl/b;Lzk/l;Lzk/l;Ls/m2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p3, Lzk/o;

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {p3, v0}, Lzk/o;-><init>(Ljava/util/ArrayList;)V

    iput-object p3, p0, Lzk/p;->w:Lzk/o;

    new-instance p3, Lul/d;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lzk/p;->x:Lul/d;

    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p3, p0, Lzk/p;->J:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Lzk/p;->G:Lcl/b;

    iput-object p2, p0, Lzk/p;->H:Lcl/b;

    iput-object p4, p0, Lzk/p;->I:Lcl/b;

    iput-object p5, p0, Lzk/p;->F:Lzk/q;

    iput-object p6, p0, Lzk/p;->y:Lzk/s;

    iput-object p7, p0, Lzk/p;->z:Lg5/d;

    sget-object p1, Lzk/p;->V:Lz5/b;

    iput-object p1, p0, Lzk/p;->E:Lz5/b;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Lpl/e;Ljava/util/concurrent/Executor;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lzk/p;->x:Lul/d;

    invoke-virtual {v0}, Lul/d;->b()V

    iget-object v0, p0, Lzk/p;->w:Lzk/o;

    iget-object v0, v0, Lzk/o;->w:Ljava/util/ArrayList;

    new-instance v1, Lzk/n;

    invoke-direct {v1, p1, p2}, Lzk/n;-><init>(Lpl/e;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Lzk/p;->P:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, Lzk/p;->e(I)V

    new-instance v0, Lzk/m;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lzk/m;-><init>(Lzk/p;Lpl/e;I)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, Lzk/p;->R:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1}, Lzk/p;->e(I)V

    new-instance v0, Lzk/m;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lzk/m;-><init>(Lzk/p;Lpl/e;I)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, Lzk/p;->U:Z

    xor-int/2addr p1, v1

    const-string p2, "Cannot add callbacks to a cancelled EngineJob"

    invoke-static {p1, p2}, Lpf/c;->n(ZLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final b()Lul/d;
    .locals 1

    iget-object v0, p0, Lzk/p;->x:Lul/d;

    return-object v0
.end method

.method public final c()V
    .locals 4

    invoke-virtual {p0}, Lzk/p;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lzk/p;->U:Z

    iget-object v1, p0, Lzk/p;->T:Lzk/i;

    iput-boolean v0, v1, Lzk/i;->b0:Z

    iget-object v0, v1, Lzk/i;->Z:Lzk/f;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lzk/f;->cancel()V

    :cond_1
    iget-object v0, p0, Lzk/p;->F:Lzk/q;

    iget-object v1, p0, Lzk/p;->K:Lzk/r;

    check-cast v0, Lzk/l;

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lzk/l;->a:Lzk/w;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v2, Lzk/w;->a:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final d()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lzk/p;->x:Lul/d;

    invoke-virtual {v0}, Lul/d;->b()V

    invoke-virtual {p0}, Lzk/p;->g()Z

    move-result v0

    const-string v1, "Not yet complete!"

    invoke-static {v0, v1}, Lpf/c;->n(ZLjava/lang/String;)V

    iget-object v0, p0, Lzk/p;->J:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Can\'t decrement below 0"

    invoke-static {v1, v2}, Lpf/c;->n(ZLjava/lang/String;)V

    if-nez v0, :cond_1

    iget-object v0, p0, Lzk/p;->S:Lzk/t;

    invoke-virtual {p0}, Lzk/p;->h()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lzk/t;->e()V

    :cond_2
    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized e(I)V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lzk/p;->g()Z

    move-result v0

    const-string v1, "Not yet complete!"

    invoke-static {v0, v1}, Lpf/c;->n(ZLjava/lang/String;)V

    iget-object v0, p0, Lzk/p;->J:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndAdd(I)I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lzk/p;->S:Lzk/t;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lzk/t;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized f(Lzk/r;ZZ)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lzk/p;->K:Lzk/r;

    iput-boolean p2, p0, Lzk/p;->L:Z

    iput-boolean p3, p0, Lzk/p;->M:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lzk/p;->R:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lzk/p;->P:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lzk/p;->U:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final declared-synchronized h()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lzk/p;->K:Lzk/r;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lzk/p;->w:Lzk/o;

    iget-object v0, v0, Lzk/o;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Lzk/p;->K:Lzk/r;

    iput-object v0, p0, Lzk/p;->S:Lzk/t;

    iput-object v0, p0, Lzk/p;->N:Lzk/z;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lzk/p;->R:Z

    iput-boolean v1, p0, Lzk/p;->U:Z

    iput-boolean v1, p0, Lzk/p;->P:Z

    iget-object v1, p0, Lzk/p;->T:Lzk/i;

    iget-object v2, v1, Lzk/i;->G:Ld9/f;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x1

    :try_start_1
    iput-boolean v3, v2, Ld9/f;->a:Z

    invoke-virtual {v2}, Ld9/f;->b()Z

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v2

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Lzk/i;->l()V

    :cond_0
    iput-object v0, p0, Lzk/p;->T:Lzk/i;

    iput-object v0, p0, Lzk/p;->Q:Lcom/bumptech/glide/load/engine/GlideException;

    iput-object v0, p0, Lzk/p;->O:Lwk/a;

    iget-object v0, p0, Lzk/p;->z:Lg5/d;

    invoke-interface {v0, p0}, Lg5/d;->a(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :goto_0
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0
.end method

.method public final declared-synchronized i(Lpl/e;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lzk/p;->x:Lul/d;

    invoke-virtual {v0}, Lul/d;->b()V

    iget-object v0, p0, Lzk/p;->w:Lzk/o;

    iget-object v0, v0, Lzk/o;->w:Ljava/util/ArrayList;

    new-instance v1, Lzk/n;

    sget-object v2, Ltl/f;->b:Ltl/e;

    invoke-direct {v1, p1, v2}, Lzk/n;-><init>(Lpl/e;Ljava/util/concurrent/Executor;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lzk/p;->w:Lzk/o;

    iget-object p1, p1, Lzk/o;->w:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lzk/p;->c()V

    iget-boolean p1, p0, Lzk/p;->P:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lzk/p;->R:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lzk/p;->J:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lzk/p;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized j(Lzk/i;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Lzk/p;->T:Lzk/i;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lzk/i;->h(I)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lzk/p;->M:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lzk/p;->I:Lcl/b;

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lzk/p;->H:Lcl/b;

    goto :goto_1

    :cond_2
    :goto_0
    iget-object v0, p0, Lzk/p;->G:Lcl/b;

    :goto_1
    invoke-virtual {v0, p1}, Lcl/b;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
