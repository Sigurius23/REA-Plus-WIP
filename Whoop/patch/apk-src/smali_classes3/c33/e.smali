.class public final Lc33/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lc33/c;

.field public b:Lhc3/d;


# direct methods
.method public constructor <init>(Lc33/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc33/e;->a:Lc33/c;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()Lbc3/c0;
    .locals 5

    monitor-enter p0

    :try_start_0
    sget-object v0, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lt23/i3;->b:Lt23/j3;

    instance-of v1, v0, Lt23/b4;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lt23/b4;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_4

    iget-object v0, v0, Lt23/b4;->c0:La33/d;

    if-eqz v0, :cond_4

    iget-object v1, p0, Lc33/e;->b:Lhc3/d;

    if-eqz v1, :cond_1

    iget-object v3, v1, Lhc3/d;->w:Lq83/j;

    sget-object v4, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v3, v4}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v3

    check-cast v3, Lbc3/k1;

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lbc3/k1;->isActive()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    monitor-exit p0

    return-object v1

    :cond_1
    :try_start_1
    iget-object v1, v0, La33/d;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_2

    move-object v0, v2

    goto :goto_1

    :cond_2
    iget-object v1, v0, La33/d;->y:Ljava/lang/Object;

    check-cast v1, Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/c0;

    invoke-interface {v1}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v1

    iget-object v0, v0, La33/d;->y:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    sget-object v3, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v0, v3}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    new-instance v3, Lbc3/l1;

    invoke-direct {v3, v0}, Lbc3/l1;-><init>(Lbc3/k1;)V

    invoke-interface {v1, v3}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    if-nez v0, :cond_3

    monitor-exit p0

    return-object v2

    :cond_3
    :try_start_2
    iput-object v0, p0, Lc33/e;->b:Lhc3/d;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_4
    monitor-exit p0

    return-object v2

    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method
