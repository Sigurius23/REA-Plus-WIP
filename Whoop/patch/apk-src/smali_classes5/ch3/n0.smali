.class public final Lch3/n0;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements Lxg3/i;
.implements Lxg3/t;
.implements Lxg3/h;


# static fields
.field public static final H:Ljava/lang/Object;


# instance fields
.field public volatile E:Z

.field public F:Z

.field public G:Z

.field public final w:Lxg3/s;

.field public x:Lch3/o0;

.field public final y:Ljava/util/concurrent/atomic/AtomicReference;

.field public z:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lch3/n0;->H:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxg3/s;)V
    .locals 2

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lch3/n0;->w:Lxg3/s;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lch3/n0;->H:Ljava/lang/Object;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lch3/n0;->y:Ljava/util/concurrent/atomic/AtomicReference;

    const-wide/high16 v0, -0x4000000000000000L    # -2.0

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->lazySet(J)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b()V
    .locals 4

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const-wide/high16 v0, -0x8000000000000000L

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndSet(J)J

    :cond_0
    return-void
.end method

.method public final c()V
    .locals 10

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lch3/n0;->F:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lch3/n0;->G:Z

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_0
    iput-boolean v1, p0, Lch3/n0;->F:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lch3/n0;->G:Z

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    :try_start_1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v4, v2, v4

    if-nez v4, :cond_1

    return-void

    :cond_1
    iget-object v4, p0, Lch3/n0;->y:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v4

    const-wide/16 v5, 0x0

    cmp-long v2, v2, v5

    if-lez v2, :cond_6

    sget-object v2, Lch3/n0;->H:Ljava/lang/Object;

    if-eq v4, v2, :cond_6

    iget-object v3, p0, Lch3/n0;->w:Lxg3/s;

    invoke-interface {v3, v4}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    iget-object v3, p0, Lch3/n0;->y:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_2
    invoke-virtual {v3, v4, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v7

    if-eq v7, v4, :cond_2

    :cond_4
    :goto_1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    cmp-long v4, v2, v5

    if-gez v4, :cond_5

    goto :goto_2

    :cond_5
    const-wide/16 v7, 0x1

    sub-long v7, v2, v7

    invoke-virtual {p0, v2, v3, v7, v8}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v2

    if-eqz v2, :cond_4

    :goto_2
    sget-object v4, Lch3/n0;->H:Ljava/lang/Object;

    goto :goto_3

    :catchall_1
    move-exception v1

    move v2, v0

    goto :goto_6

    :cond_6
    :goto_3
    sget-object v2, Lch3/n0;->H:Ljava/lang/Object;

    if-ne v4, v2, :cond_8

    iget-boolean v2, p0, Lch3/n0;->E:Z

    if-eqz v2, :cond_8

    iget-object v2, p0, Lch3/n0;->z:Ljava/lang/Throwable;

    if-eqz v2, :cond_7

    iget-object v3, p0, Lch3/n0;->w:Lxg3/s;

    invoke-interface {v3, v2}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_7
    iget-object v2, p0, Lch3/n0;->w:Lxg3/s;

    invoke-interface {v2}, Lxg3/h;->onCompleted()V

    :cond_8
    :goto_4
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-boolean v2, p0, Lch3/n0;->G:Z

    if-nez v2, :cond_9

    iput-boolean v0, p0, Lch3/n0;->F:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    return-void

    :catchall_2
    move-exception v2

    goto :goto_5

    :catchall_3
    move-exception v2

    move v1, v0

    goto :goto_5

    :cond_9
    :try_start_4
    iput-boolean v0, p0, Lch3/n0;->G:Z

    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_0

    :goto_5
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :catchall_4
    move-exception v2

    move-object v9, v2

    move v2, v1

    move-object v1, v9

    :goto_6
    if-nez v2, :cond_a

    monitor-enter p0

    :try_start_7
    iput-boolean v0, p0, Lch3/n0;->F:Z

    monitor-exit p0

    goto :goto_7

    :catchall_5
    move-exception v0

    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    throw v0

    :cond_a
    :goto_7
    throw v1

    :goto_8
    :try_start_8
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    throw v0
.end method

.method public final onCompleted()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/n0;->E:Z

    invoke-virtual {p0}, Lch3/n0;->c()V

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lch3/n0;->z:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lch3/n0;->E:Z

    invoke-virtual {p0}, Lch3/n0;->c()V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lch3/n0;->y:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lch3/n0;->c()V

    return-void
.end method

.method public final request(J)V
    .locals 10

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_5

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v4, v2, v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    const-wide/high16 v4, -0x4000000000000000L    # -2.0

    cmp-long v4, v2, v4

    const-wide v5, 0x7fffffffffffffffL

    if-nez v4, :cond_2

    move-wide v7, p1

    goto :goto_0

    :cond_2
    add-long v7, v2, p1

    cmp-long v9, v7, v0

    if-gez v9, :cond_3

    move-wide v7, v5

    :cond_3
    :goto_0
    invoke-virtual {p0, v2, v3, v7, v8}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z

    move-result v2

    if-eqz v2, :cond_0

    if-nez v4, :cond_4

    iget-object p1, p0, Lch3/n0;->x:Lch3/o0;

    invoke-virtual {p1, v5, v6}, Lxg3/s;->e(J)V

    :cond_4
    invoke-virtual {p0}, Lch3/n0;->c()V

    :cond_5
    :goto_1
    return-void
.end method
