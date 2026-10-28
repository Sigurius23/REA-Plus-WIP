.class public final Ll9/v0;
.super Ll9/a;
.source "SourceFile"


# instance fields
.field public final h:Lz8/e;

.field public final i:Lcom/whoop/data/repositories/c;

.field public final j:Lg9/h;

.field public final k:Ljc/b;

.field public final l:I

.field public final m:Lu8/p;

.field public n:Z

.field public o:J

.field public p:Z

.field public q:Z

.field public r:Lz8/n;

.field public s:Lu8/x;


# direct methods
.method public constructor <init>(Lu8/x;Lz8/e;Lcom/whoop/data/repositories/c;Lg9/h;Ljc/b;ILu8/p;)V
    .locals 0

    invoke-direct {p0}, Ll9/a;-><init>()V

    iput-object p1, p0, Ll9/v0;->s:Lu8/x;

    iput-object p2, p0, Ll9/v0;->h:Lz8/e;

    iput-object p3, p0, Ll9/v0;->i:Lcom/whoop/data/repositories/c;

    iput-object p4, p0, Ll9/v0;->j:Lg9/h;

    iput-object p5, p0, Ll9/v0;->k:Ljc/b;

    iput p6, p0, Ll9/v0;->l:I

    iput-object p7, p0, Ll9/v0;->m:Lu8/p;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ll9/v0;->n:Z

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Ll9/v0;->o:J

    return-void
.end method


# virtual methods
.method public final a(Ll9/c0;Lko/o;J)Ll9/a0;
    .locals 15

    move-object/from16 v0, p1

    iget-object v1, p0, Ll9/v0;->h:Lz8/e;

    invoke-interface {v1}, Lz8/e;->createDataSource()Lz8/f;

    move-result-object v2

    iget-object v1, p0, Ll9/v0;->r:Lz8/n;

    if-eqz v1, :cond_0

    invoke-interface {v2, v1}, Lz8/f;->addTransferListener(Lz8/n;)V

    :cond_0
    invoke-virtual {p0}, Ll9/v0;->g()Lu8/x;

    move-result-object v1

    iget-object v1, v1, Lu8/x;->b:Lu8/u;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ll9/s0;

    iget-object v4, v1, Lu8/u;->a:Landroid/net/Uri;

    iget-object v5, p0, Ll9/a;->g:Lc9/n;

    invoke-static {v5}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v5, p0, Ll9/v0;->i:Lcom/whoop/data/repositories/c;

    iget-object v5, v5, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v5, Lt9/r;

    move-object v6, v3

    new-instance v3, Lgm/r;

    invoke-direct {v3, v5}, Lgm/r;-><init>(Lt9/r;)V

    new-instance v5, Lg9/d;

    iget-object v7, p0, Ll9/a;->d:Lg9/d;

    iget-object v7, v7, Lg9/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    const/4 v9, 0x0

    invoke-direct {v5, v7, v9, v0}, Lg9/d;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILl9/c0;)V

    new-instance v7, Lg9/d;

    iget-object v10, p0, Ll9/a;->c:Lg9/d;

    iget-object v10, v10, Lg9/d;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v7, v10, v9, v0}, Lg9/d;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILl9/c0;)V

    iget-wide v0, v1, Lu8/u;->e:J

    invoke-static {v0, v1}, Lx8/t;->J(J)J

    move-result-wide v12

    const/4 v14, 0x0

    move-object v1, v4

    iget-object v4, p0, Ll9/v0;->j:Lg9/h;

    move-object v0, v6

    iget-object v6, p0, Ll9/v0;->k:Ljc/b;

    iget v10, p0, Ll9/v0;->l:I

    iget-object v11, p0, Ll9/v0;->m:Lu8/p;

    move-object v8, p0

    move-object/from16 v9, p2

    invoke-direct/range {v0 .. v14}, Ll9/s0;-><init>(Landroid/net/Uri;Lz8/f;Lgm/r;Lg9/h;Lg9/d;Ljc/b;Lg9/d;Ll9/v0;Lko/o;ILu8/p;JLq9/a;)V

    return-object v0
.end method

.method public final declared-synchronized g()Lu8/x;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ll9/v0;->s:Lu8/x;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final i()V
    .locals 0

    return-void
.end method

.method public final k(Lz8/n;)V
    .locals 2

    iput-object p1, p0, Ll9/v0;->r:Lz8/n;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Ll9/a;->g:Lc9/n;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v1, p0, Ll9/v0;->j:Lg9/h;

    invoke-interface {v1, p1, v0}, Lg9/h;->b(Landroid/os/Looper;Lc9/n;)V

    invoke-interface {v1}, Lg9/h;->prepare()V

    invoke-virtual {p0}, Ll9/v0;->s()V

    return-void
.end method

.method public final m(Ll9/a0;)V
    .locals 7

    check-cast p1, Ll9/s0;

    iget-boolean v0, p1, Ll9/s0;->W:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p1, Ll9/s0;->T:[Ll9/y0;

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    invoke-virtual {v4}, Ll9/y0;->g()V

    iget-object v5, v4, Ll9/y0;->h:Le10/k0;

    if-eqz v5, :cond_0

    iget-object v6, v4, Ll9/y0;->e:Lg9/d;

    invoke-virtual {v5, v6}, Le10/k0;->K(Lg9/d;)V

    iput-object v1, v4, Ll9/y0;->h:Le10/k0;

    iput-object v1, v4, Ll9/y0;->g:Lu8/p;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p1, Ll9/s0;->L:Lp9/k;

    invoke-virtual {v0, p1}, Lp9/k;->b(Lp9/j;)V

    iget-object v0, p1, Ll9/s0;->Q:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, p1, Ll9/s0;->R:Ll9/z;

    const/4 v0, 0x1

    iput-boolean v0, p1, Ll9/s0;->o0:Z

    return-void
.end method

.method public final o()V
    .locals 1

    iget-object v0, p0, Ll9/v0;->j:Lg9/h;

    invoke-interface {v0}, Lg9/h;->release()V

    return-void
.end method

.method public final declared-synchronized r(Lu8/x;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Ll9/v0;->s:Lu8/x;
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

.method public final s()V
    .locals 6

    new-instance v0, Ll9/d1;

    iget-wide v1, p0, Ll9/v0;->o:J

    iget-boolean v3, p0, Ll9/v0;->p:Z

    iget-boolean v4, p0, Ll9/v0;->q:Z

    invoke-virtual {p0}, Ll9/v0;->g()Lu8/x;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Ll9/d1;-><init>(JZZLu8/x;)V

    iget-boolean v1, p0, Ll9/v0;->n:Z

    if-eqz v1, :cond_0

    new-instance v1, Ll9/t0;

    invoke-direct {v1, v0}, Ll9/r;-><init>(Lu8/o0;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {p0, v0}, Ll9/a;->l(Lu8/o0;)V

    return-void
.end method

.method public final t(JLt9/e0;Z)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    iget-wide p1, p0, Ll9/v0;->o:J

    :cond_0
    invoke-interface {p3}, Lt9/e0;->e()Z

    move-result p3

    iget-boolean v0, p0, Ll9/v0;->n:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Ll9/v0;->o:J

    cmp-long v0, v0, p1

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ll9/v0;->p:Z

    if-ne v0, p3, :cond_1

    iget-boolean v0, p0, Ll9/v0;->q:Z

    if-ne v0, p4, :cond_1

    return-void

    :cond_1
    iput-wide p1, p0, Ll9/v0;->o:J

    iput-boolean p3, p0, Ll9/v0;->p:Z

    iput-boolean p4, p0, Ll9/v0;->q:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Ll9/v0;->n:Z

    invoke-virtual {p0}, Ll9/v0;->s()V

    return-void
.end method
