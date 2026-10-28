.class public final Lch3/f;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lxg3/i;
.implements Lxg3/t;


# static fields
.field public static final M:Ljava/lang/Object;


# instance fields
.field public final E:[Ljava/lang/Object;

.field public final F:Lhh3/d;

.field public volatile G:Z

.field public volatile H:Z

.field public final I:Ljava/util/concurrent/atomic/AtomicLong;

.field public final J:Ljava/util/concurrent/atomic/AtomicReference;

.field public K:I

.field public L:I

.field public final w:Lxg3/s;

.field public final x:Lbh3/i;

.field public final y:[Lch3/e;

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lch3/f;->M:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxg3/s;Lbh3/i;II)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lch3/f;->w:Lxg3/s;

    iput-object p2, p0, Lch3/f;->x:Lbh3/i;

    iput p4, p0, Lch3/f;->z:I

    new-array p1, p3, [Ljava/lang/Object;

    iput-object p1, p0, Lch3/f;->E:[Ljava/lang/Object;

    sget-object p2, Lch3/f;->M:Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    new-array p1, p3, [Lch3/e;

    iput-object p1, p0, Lch3/f;->y:[Lch3/e;

    new-instance p1, Lhh3/d;

    invoke-direct {p1, p4}, Lhh3/d;-><init>(I)V

    iput-object p1, p0, Lch3/f;->F:Lhh3/d;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lch3/f;->I:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lch3/f;->J:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lch3/f;->G:Z

    return v0
.end method

.method public final b()V
    .locals 1

    iget-boolean v0, p0, Lch3/f;->G:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/f;->G:Z

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lch3/f;->F:Lhh3/d;

    invoke-virtual {p0, v0}, Lch3/f;->c(Ljava/util/Queue;)V

    :cond_0
    return-void
.end method

.method public final c(Ljava/util/Queue;)V
    .locals 3

    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    iget-object p1, p0, Lch3/f;->y:[Lch3/e;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    invoke-virtual {v2}, Lxg3/s;->b()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(ZZLxg3/s;Ljava/util/Queue;)Z
    .locals 2

    iget-boolean v0, p0, Lch3/f;->G:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0, p4}, Lch3/f;->c(Ljava/util/Queue;)V

    return v1

    :cond_0
    if-eqz p1, :cond_2

    iget-object p1, p0, Lch3/f;->J:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    if-eqz p1, :cond_1

    invoke-virtual {p0, p4}, Lch3/f;->c(Ljava/util/Queue;)V

    invoke-interface {p3, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return v1

    :cond_1
    if-eqz p2, :cond_2

    invoke-interface {p3}, Lxg3/h;->onCompleted()V

    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final e(ILjava/lang/Object;)V
    .locals 8

    iget-object v0, p0, Lch3/f;->y:[Lch3/e;

    aget-object v0, v0, p1

    monitor-enter p0

    :try_start_0
    iget-object v1, p0, Lch3/f;->E:[Ljava/lang/Object;

    array-length v2, v1

    aget-object v3, v1, p1

    iget v4, p0, Lch3/f;->K:I

    sget-object v5, Lch3/f;->M:Ljava/lang/Object;

    if-ne v3, v5, :cond_0

    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Lch3/f;->K:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_0
    :goto_0
    iget v6, p0, Lch3/f;->L:I

    if-nez p2, :cond_1

    add-int/lit8 v6, v6, 0x1

    iput v6, p0, Lch3/f;->L:I

    goto :goto_1

    :cond_1
    invoke-static {p2}, Lch3/d;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    aput-object v7, v1, p1

    :goto_1
    const/4 p1, 0x1

    if-ne v4, v2, :cond_2

    move v1, p1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    if-eq v6, v2, :cond_5

    if-nez p2, :cond_3

    if-ne v3, v5, :cond_3

    goto :goto_3

    :cond_3
    if-eqz p2, :cond_4

    if-eqz v1, :cond_4

    iget-object p1, p0, Lch3/f;->F:Lhh3/d;

    iget-object v2, p0, Lch3/f;->E:[Ljava/lang/Object;

    invoke-virtual {v2}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Lhh3/d;->a(Lch3/e;Ljava/lang/Object;)V

    goto :goto_4

    :cond_4
    if-nez p2, :cond_6

    iget-object v2, p0, Lch3/f;->J:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_6

    iput-boolean p1, p0, Lch3/f;->H:Z

    goto :goto_4

    :cond_5
    :goto_3
    iput-boolean p1, p0, Lch3/f;->H:Z

    :cond_6
    :goto_4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_7

    if-eqz p2, :cond_7

    const-wide/16 p1, 0x1

    invoke-virtual {v0, p1, p2}, Lxg3/s;->e(J)V

    return-void

    :cond_7
    invoke-virtual {p0}, Lch3/f;->f()V

    return-void

    :goto_5
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final f()V
    .locals 18

    move-object/from16 v1, p0

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v2, v1, Lch3/f;->F:Lhh3/d;

    iget-object v3, v1, Lch3/f;->w:Lxg3/s;

    iget-object v0, v1, Lch3/f;->I:Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v4, 0x1

    move v5, v4

    :cond_1
    iget-boolean v6, v1, Lch3/f;->H:Z

    invoke-virtual {v2}, Lhh3/d;->isEmpty()Z

    move-result v7

    invoke-virtual {v1, v6, v7, v3, v2}, Lch3/f;->d(ZZLxg3/s;Ljava/util/Queue;)Z

    move-result v6

    if-eqz v6, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v6

    const-wide/16 v10, 0x0

    :goto_0
    cmp-long v12, v10, v6

    if-eqz v12, :cond_5

    iget-boolean v12, v1, Lch3/f;->H:Z

    invoke-virtual {v2}, Lhh3/d;->peek()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lch3/e;

    const/4 v14, 0x0

    if-nez v13, :cond_3

    move v15, v4

    goto :goto_1

    :cond_3
    move v15, v14

    :goto_1
    invoke-virtual {v1, v12, v15, v3, v2}, Lch3/f;->d(ZZLxg3/s;Ljava/util/Queue;)Z

    move-result v12

    if-eqz v12, :cond_4

    goto :goto_3

    :cond_4
    if-eqz v15, :cond_6

    :cond_5
    const-wide/16 v16, 0x0

    goto :goto_2

    :cond_6
    invoke-virtual {v2}, Lhh3/d;->poll()Ljava/lang/Object;

    invoke-virtual {v2}, Lhh3/d;->poll()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, [Ljava/lang/Object;

    if-nez v12, :cond_7

    iput-boolean v4, v1, Lch3/f;->G:Z

    invoke-virtual {v1, v2}, Lch3/f;->c(Ljava/util/Queue;)V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Broken queue?! Sender received but not the array."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v0}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_7
    :try_start_0
    iget-object v15, v1, Lch3/f;->x:Lbh3/i;

    check-cast v15, Lro/i;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v16, 0x0

    array-length v8, v12

    const/4 v9, 0x2

    if-ne v8, v9, :cond_8

    iget-object v8, v15, Lro/i;->x:Ljava/lang/Object;

    check-cast v8, Lbh3/h;

    aget-object v9, v12, v14

    aget-object v12, v12, v4

    invoke-interface {v8, v9, v12}, Lbh3/h;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v3, v8}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    const-wide/16 v8, 0x1

    invoke-virtual {v13, v8, v9}, Lxg3/s;->e(J)V

    add-long/2addr v10, v8

    goto :goto_0

    :cond_8
    :try_start_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v5, "Func2 expecting 2 arguments."

    invoke-direct {v0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    iput-boolean v4, v1, Lch3/f;->G:Z

    invoke-virtual {v1, v2}, Lch3/f;->c(Ljava/util/Queue;)V

    invoke-interface {v3, v0}, Lxg3/h;->onError(Ljava/lang/Throwable;)V

    return-void

    :goto_2
    cmp-long v8, v10, v16

    if-eqz v8, :cond_9

    const-wide v8, 0x7fffffffffffffffL

    cmp-long v6, v6, v8

    if-eqz v6, :cond_9

    invoke-static {v0, v10, v11}, Lch3/d;->d(Ljava/util/concurrent/atomic/AtomicLong;J)J

    :cond_9
    neg-int v5, v5

    invoke-virtual {v1, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v5

    if-nez v5, :cond_1

    :goto_3
    return-void
.end method

.method public final request(J)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lch3/f;->I:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lch3/d;->b(Ljava/util/concurrent/atomic/AtomicLong;J)J

    invoke-virtual {p0}, Lch3/f;->f()V

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "n >= required but it was "

    invoke-static {p1, p2, v1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
