.class public final Lhc3/g;
.super Lbc3/z;
.source "SourceFile"

# interfaces
.implements Lbc3/k0;


# static fields
.field public static final synthetic G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final E:Lhc3/l;

.field public final F:Ljava/lang/Object;

.field private volatile synthetic runningWorkers$volatile:I

.field public final synthetic w:Lbc3/k0;

.field public final x:Lbc3/z;

.field public final y:I

.field public final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lhc3/g;

    const-string v1, "runningWorkers$volatile"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lhc3/g;->G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(Lbc3/z;ILjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lbc3/z;-><init>()V

    instance-of v0, p1, Lbc3/k0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lbc3/k0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Lbc3/h0;->a:Lbc3/k0;

    :cond_1
    iput-object v0, p0, Lhc3/g;->w:Lbc3/k0;

    iput-object p1, p0, Lhc3/g;->x:Lbc3/z;

    iput p2, p0, Lhc3/g;->y:I

    iput-object p3, p0, Lhc3/g;->z:Ljava/lang/String;

    new-instance p1, Lhc3/l;

    invoke-direct {p1}, Lhc3/l;-><init>()V

    iput-object p1, p0, Lhc3/g;->E:Lhc3/l;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhc3/g;->F:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final T()Z
    .locals 4

    iget-object v0, p0, Lhc3/g;->F:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lhc3/g;->G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result v2

    iget v3, p0, Lhc3/g;->y:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v2, v3, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :cond_0
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final dispatch(Lq83/j;Ljava/lang/Runnable;)V
    .locals 2

    iget-object p1, p0, Lhc3/g;->E:Lhc3/l;

    invoke-virtual {p1, p2}, Lhc3/l;->a(Ljava/lang/Runnable;)Z

    sget-object p1, Lhc3/g;->G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p2

    iget v0, p0, Lhc3/g;->y:I

    if-ge p2, v0, :cond_1

    invoke-virtual {p0}, Lhc3/g;->T()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lhc3/g;->s()Ljava/lang/Runnable;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    new-instance v0, Lcq/m;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p0, p2}, Lcq/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, p0, Lhc3/g;->x:Lbc3/z;

    invoke-static {p2, p0, v0}, Lhc3/b;->h(Lbc3/z;Lq83/j;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    throw p2

    :cond_1
    :goto_0
    return-void
.end method

.method public final dispatchYield(Lq83/j;Ljava/lang/Runnable;)V
    .locals 2

    iget-object p1, p0, Lhc3/g;->E:Lhc3/l;

    invoke-virtual {p1, p2}, Lhc3/l;->a(Ljava/lang/Runnable;)Z

    sget-object p1, Lhc3/g;->G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    move-result p2

    iget v0, p0, Lhc3/g;->y:I

    if-ge p2, v0, :cond_1

    invoke-virtual {p0}, Lhc3/g;->T()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lhc3/g;->s()Ljava/lang/Runnable;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    new-instance v0, Lcq/m;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p0, p2}, Lcq/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p2, p0, Lhc3/g;->x:Lbc3/z;

    invoke-virtual {p2, p0, v0}, Lbc3/z;->dispatchYield(Lq83/j;Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    throw p2

    :cond_1
    :goto_0
    return-void
.end method

.method public final i(JLjava/lang/Runnable;Lq83/j;)Lbc3/s0;
    .locals 1

    iget-object v0, p0, Lhc3/g;->w:Lbc3/k0;

    invoke-interface {v0, p1, p2, p3, p4}, Lbc3/k0;->i(JLjava/lang/Runnable;Lq83/j;)Lbc3/s0;

    move-result-object p1

    return-object p1
.end method

.method public final limitedParallelism(ILjava/lang/String;)Lbc3/z;
    .locals 1

    invoke-static {p1}, Lhc3/b;->a(I)V

    iget v0, p0, Lhc3/g;->y:I

    if-lt p1, v0, :cond_1

    if-eqz p2, :cond_0

    new-instance p1, Lhc3/r;

    invoke-direct {p1, p0, p2}, Lhc3/r;-><init>(Lbc3/z;Ljava/lang/String;)V

    return-object p1

    :cond_0
    return-object p0

    :cond_1
    invoke-super {p0, p1, p2}, Lbc3/z;->limitedParallelism(ILjava/lang/String;)Lbc3/z;

    move-result-object p1

    return-object p1
.end method

.method public final m(JLbc3/m;)V
    .locals 1

    iget-object v0, p0, Lhc3/g;->w:Lbc3/k0;

    invoke-interface {v0, p1, p2, p3}, Lbc3/k0;->m(JLbc3/m;)V

    return-void
.end method

.method public final s()Ljava/lang/Runnable;
    .locals 3

    :goto_0
    iget-object v0, p0, Lhc3/g;->E:Lhc3/l;

    invoke-virtual {v0}, Lhc3/l;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-nez v0, :cond_1

    iget-object v0, p0, Lhc3/g;->F:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lhc3/g;->G:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    iget-object v2, p0, Lhc3/g;->E:Lhc3/l;

    invoke-virtual {v2}, Lhc3/l;->b()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    monitor-exit v0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_1
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lhc3/g;->z:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lhc3/g;->x:Lbc3/z;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".limitedParallelism("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lhc3/g;->y:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Ldc/b;->r(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method
