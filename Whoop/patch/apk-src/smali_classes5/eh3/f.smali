.class public final Leh3/f;
.super Lxg3/j;
.source "SourceFile"


# instance fields
.field public final w:Lgh3/m;

.field public final x:Lmh3/c;

.field public final y:Lgh3/m;

.field public final z:Leh3/h;


# direct methods
.method public constructor <init>(Leh3/h;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lgh3/m;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Leh3/f;->w:Lgh3/m;

    new-instance v1, Lmh3/c;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Leh3/f;->x:Lmh3/c;

    new-instance v2, Lgh3/m;

    const/4 v3, 0x2

    new-array v3, v3, [Lxg3/t;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    iput-object v0, v2, Lgh3/m;->w:Ljava/util/LinkedList;

    iput-object v2, p0, Leh3/f;->y:Lgh3/m;

    iput-object p1, p0, Leh3/f;->z:Leh3/h;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Leh3/f;->y:Lgh3/m;

    iget-boolean v0, v0, Lgh3/m;->x:Z

    return v0
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Leh3/f;->y:Lgh3/m;

    invoke-virtual {v0}, Lgh3/m;->b()V

    return-void
.end method

.method public final c(Lbh3/a;)Lxg3/t;
    .locals 3

    iget-object v0, p0, Leh3/f;->y:Lgh3/m;

    iget-boolean v0, v0, Lgh3/m;->x:Z

    if-eqz v0, :cond_0

    sget-object p1, Lmh3/e;->a:Lmh3/d;

    return-object p1

    :cond_0
    iget-object v0, p0, Leh3/f;->z:Leh3/h;

    new-instance v1, Ldx/b;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0, p1}, Ldx/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Leh3/f;->w:Lgh3/m;

    iget-object v0, v0, Leh3/k;->w:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v2, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v2}, Ljh3/f;->e()Ljh3/g;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Leh3/p;

    invoke-direct {v2, v1, p1}, Leh3/p;-><init>(Lbh3/a;Lgh3/m;)V

    invoke-virtual {p1, v2}, Lgh3/m;->c(Lxg3/t;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-virtual {v2, p1}, Leh3/p;->c(Ljava/util/concurrent/Future;)V

    return-object v2
.end method

.method public final d(Lbh3/a;JLjava/util/concurrent/TimeUnit;)Lxg3/t;
    .locals 5

    iget-object v0, p0, Leh3/f;->y:Lgh3/m;

    iget-boolean v0, v0, Lgh3/m;->x:Z

    if-eqz v0, :cond_0

    sget-object p1, Lmh3/e;->a:Lmh3/d;

    return-object p1

    :cond_0
    iget-object v0, p0, Leh3/f;->z:Leh3/h;

    new-instance v1, Lch3/y;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lch3/y;-><init>(Lxg3/t;Ljava/lang/Object;I)V

    iget-object p1, p0, Leh3/f;->x:Lmh3/c;

    iget-object v0, v0, Leh3/k;->w:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v2, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v2}, Ljh3/f;->e()Ljh3/g;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Leh3/p;

    invoke-direct {v2, v1, p1}, Leh3/p;-><init>(Lbh3/a;Lmh3/c;)V

    invoke-virtual {p1, v2}, Lmh3/c;->c(Lxg3/t;)V

    const-wide/16 v3, 0x0

    cmp-long p1, p2, v3

    if-gtz p1, :cond_1

    invoke-interface {v0, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-interface {v0, v2, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    :goto_0
    invoke-virtual {v2, p1}, Leh3/p;->c(Ljava/util/concurrent/Future;)V

    return-object v2
.end method
