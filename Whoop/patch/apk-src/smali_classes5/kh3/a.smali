.class public final Lkh3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/util/concurrent/atomic/AtomicReference;


# instance fields
.field public final a:Leh3/i;

.field public final b:Leh3/e;

.field public final c:Leh3/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Lkh3/a;->d:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v0}, Ljh3/f;->e()Ljh3/g;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lgh3/i;

    const-string v1, "RxComputationScheduler-"

    invoke-direct {v0, v1}, Lgh3/i;-><init>(Ljava/lang/String;)V

    new-instance v1, Leh3/i;

    invoke-direct {v1, v0}, Leh3/i;-><init>(Lgh3/i;)V

    iput-object v1, p0, Lkh3/a;->a:Leh3/i;

    new-instance v0, Lgh3/i;

    const-string v1, "RxIoScheduler-"

    invoke-direct {v0, v1}, Lgh3/i;-><init>(Ljava/lang/String;)V

    new-instance v1, Leh3/e;

    invoke-direct {v1, v0}, Leh3/e;-><init>(Lgh3/i;)V

    iput-object v1, p0, Lkh3/a;->b:Leh3/e;

    new-instance v0, Lgh3/i;

    const-string v1, "RxNewThreadScheduler-"

    invoke-direct {v0, v1}, Lgh3/i;-><init>(Ljava/lang/String;)V

    new-instance v1, Leh3/j;

    invoke-direct {v1, v0}, Leh3/j;-><init>(Lgh3/i;)V

    iput-object v1, p0, Lkh3/a;->c:Leh3/j;

    return-void
.end method

.method public static a()Lkh3/a;
    .locals 3

    :goto_0
    sget-object v0, Lkh3/a;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkh3/a;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    new-instance v1, Lkh3/a;

    invoke-direct {v1}, Lkh3/a;-><init>()V

    :cond_1
    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    monitor-enter v1

    :try_start_0
    iget-object v0, v1, Lkh3/a;->a:Leh3/i;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Leh3/q;->shutdown()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_3
    :goto_1
    iget-object v0, v1, Lkh3/a;->b:Leh3/e;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Leh3/q;->shutdown()V

    :cond_4
    iget-object v0, v1, Lkh3/a;->c:Leh3/j;

    instance-of v2, v0, Leh3/q;

    if-eqz v2, :cond_5

    check-cast v0, Leh3/q;

    invoke-interface {v0}, Leh3/q;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    monitor-exit v1

    goto :goto_0

    :goto_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
