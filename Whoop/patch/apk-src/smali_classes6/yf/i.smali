.class public final Lyf/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/n;


# static fields
.field public static final synthetic I:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

.field public static final synthetic J:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

.field public static final synthetic K:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;


# instance fields
.field public volatile synthetic E:I

.field public volatile synthetic F:Ljava/lang/Object;

.field public volatile synthetic G:J

.field public final H:Lzf/c;

.field public final w:Ljava/lang/Object;

.field public final x:Lyf/k;

.field public final y:Lzf/d;

.field public volatile synthetic z:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "z"

    const-class v1, Lyf/i;

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lyf/i;->I:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-string v0, "E"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const-class v0, Ljava/lang/Object;

    const-string v2, "F"

    invoke-static {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lyf/i;->J:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const-string v0, "G"

    invoke-static {v1, v0}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object v0

    sput-object v0, Lyf/i;->K:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lyf/i;->w:Ljava/lang/Object;

    new-instance v0, Lyf/k;

    invoke-direct {v0}, Lyf/k;-><init>()V

    iput-object v0, p0, Lyf/i;->x:Lyf/k;

    new-instance v0, Lzf/d;

    invoke-direct {v0, p1}, Lzf/d;-><init>(I)V

    iput-object v0, p0, Lyf/i;->y:Lzf/d;

    const/4 p1, 0x0

    iput p1, p0, Lyf/i;->z:I

    iput p1, p0, Lyf/i;->E:I

    const/4 p1, 0x0

    iput-object p1, p0, Lyf/i;->F:Ljava/lang/Object;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lyf/i;->G:J

    new-instance v0, Lzf/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lzf/c;->a:Ljava/lang/Object;

    iput-object v0, p0, Lyf/i;->H:Lzf/c;

    return-void
.end method


# virtual methods
.method public final b(Lyf/k;JLs83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p4, Lyf/h;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lyf/h;

    iget v1, v0, Lyf/h;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lyf/h;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lyf/h;

    invoke-direct {v0, p0, p4}, Lyf/h;-><init>(Lyf/i;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lyf/h;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lyf/h;->F:I

    const-wide/16 v3, -0x1

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v8, :cond_1

    iget-wide p2, v0, Lyf/h;->y:J

    iget-object p1, v0, Lyf/h;->x:Lyf/i;

    iget-object v0, v0, Lyf/h;->w:Lyf/k;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    cmp-long p4, p2, v5

    if-ltz p4, :cond_c

    invoke-virtual {p0}, Lyf/i;->k()Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_b

    invoke-virtual {p0}, Lyf/i;->h()Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance p1, Ljava/lang/Long;

    invoke-direct {p1, v3, v4}, Ljava/lang/Long;-><init>(J)V

    return-object p1

    :cond_3
    if-nez p4, :cond_4

    new-instance p1, Ljava/lang/Long;

    invoke-direct {p1, v5, v6}, Ljava/lang/Long;-><init>(J)V

    return-object p1

    :cond_4
    :try_start_1
    sget-object p4, Lyf/i;->I:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p4, p0, v7, v8}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz p4, :cond_a

    :try_start_2
    iget-object p4, p0, Lyf/i;->y:Lzf/d;

    iget p4, p4, Lzf/d;->b:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    if-nez p4, :cond_8

    :try_start_3
    iput-object p1, v0, Lyf/h;->w:Lyf/k;

    iput-object p0, v0, Lyf/h;->x:Lyf/i;

    iput-wide p2, v0, Lyf/h;->y:J

    iput v8, v0, Lyf/h;->F:I

    invoke-virtual {p0, v8, v0}, Lyf/i;->i(ILs83/c;)Ljava/lang/Object;

    move-result-object p4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne p4, v1, :cond_5

    return-object v1

    :cond_5
    move-object v0, p1

    move-object p1, p0

    :goto_1
    :try_start_4
    invoke-virtual {p0}, Lyf/i;->k()Ljava/lang/Throwable;

    move-result-object p4

    if-nez p4, :cond_7

    invoke-virtual {p0}, Lyf/i;->h()Z

    move-result p4

    if-eqz p4, :cond_6

    new-instance p2, Ljava/lang/Long;

    invoke-direct {p2, v3, v4}, Ljava/lang/Long;-><init>(J)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    sget-object p3, Lyf/i;->I:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p3, p1, v8, v7}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    return-object p2

    :cond_6
    move-wide p3, p2

    move-object p2, p1

    move-object p1, v0

    goto :goto_3

    :cond_7
    :try_start_5
    throw p4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_1
    move-exception p2

    :goto_2
    move-object p1, p0

    goto :goto_6

    :cond_8
    move-wide p3, p2

    move-object p2, p0

    :goto_3
    :try_start_6
    iget-object v0, p0, Lyf/i;->y:Lzf/d;

    iget v0, v0, Lzf/d;->b:I

    int-to-long v0, v0

    invoke-static {v0, v1, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p3

    iget-object v0, p0, Lyf/i;->w:Ljava/lang/Object;

    monitor-enter v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    iget-object v1, p0, Lyf/i;->x:Lyf/k;

    invoke-virtual {p1, v1, p3, p4}, Lyf/k;->Y(Lyf/k;J)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :try_start_8
    monitor-exit v0

    cmp-long p1, p3, v5

    if-ltz p1, :cond_9

    long-to-int p1, p3

    iget-object v0, p2, Lyf/i;->y:Lzf/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lzf/d;->e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    neg-int v2, p1

    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndAdd(Ljava/lang/Object;I)I

    sget-object v1, Lzf/d;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndAdd(Ljava/lang/Object;I)I

    iget-object p1, p2, Lyf/i;->H:Lzf/c;

    invoke-virtual {p1}, Lzf/c;->a()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_5

    :goto_4
    move-object v9, p2

    move-object p2, p1

    move-object p1, v9

    goto :goto_6

    :cond_9
    :goto_5
    sget-object p1, Lyf/i;->I:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p1, p2, v8, v7}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    new-instance p1, Ljava/lang/Long;

    invoke-direct {p1, p3, p4}, Ljava/lang/Long;-><init>(J)V

    return-object p1

    :catchall_2
    move-exception p1

    goto :goto_4

    :catchall_3
    move-exception p1

    :try_start_9
    monitor-exit v0

    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catchall_4
    move-exception p1

    move-object p2, p1

    goto :goto_2

    :cond_a
    :try_start_a
    const-string p1, "Read operation already in progress"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :goto_6
    sget-object p3, Lyf/i;->I:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p3, p1, v8, v7}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    throw p2

    :cond_b
    throw v2

    :cond_c
    const-string p1, "Read limit must be >= 0, was "

    invoke-static {p2, p3, p1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final cancel()Z
    .locals 2

    invoke-virtual {p0}, Lyf/i;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Channel cancelled"

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lyf/i;->r(Ljava/lang/Throwable;)Z

    move-result v0

    return v0
.end method

.method public final h()Z
    .locals 1

    invoke-virtual {p0}, Lyf/i;->k()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lyf/i;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lyf/i;->y:Lzf/d;

    iget v0, v0, Lzf/d;->b:I

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final i(ILs83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lyf/g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lyf/g;

    iget v1, v0, Lyf/g;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lyf/g;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lyf/g;

    invoke-direct {v0, p0, p2}, Lyf/g;-><init>(Lyf/i;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lyf/g;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lyf/g;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lyf/g;->w:I

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    iget-object p2, p0, Lyf/i;->y:Lzf/d;

    iget p2, p2, Lzf/d;->b:I

    if-ge p2, p1, :cond_4

    invoke-virtual {p0}, Lyf/i;->h()Z

    move-result p2

    if-nez p2, :cond_4

    iget-object p2, p0, Lyf/i;->H:Lzf/c;

    new-instance v2, Lf1/x;

    const/4 v4, 0x7

    invoke-direct {v2, p0, p1, v4}, Lf1/x;-><init>(Ljava/lang/Object;II)V

    iput p1, v0, Lyf/g;->w:I

    iput v3, v0, Lyf/g;->z:I

    invoke-virtual {p2, v2, v0}, Lzf/c;->b(Lc93/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final k()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lyf/i;->F:Ljava/lang/Object;

    check-cast v0, Lyf/d;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lyf/d;->a:Ljava/lang/Throwable;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final m()Z
    .locals 1

    iget-object v0, p0, Lyf/i;->F:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final r(Ljava/lang/Throwable;)Z
    .locals 5

    invoke-virtual {p0}, Lyf/i;->m()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    if-nez p1, :cond_1

    sget-object v0, Lyf/j;->a:Lyf/d;

    goto :goto_0

    :cond_1
    new-instance v0, Lyf/d;

    invoke-direct {v0, p1}, Lyf/d;-><init>(Ljava/lang/Throwable;)V

    :cond_2
    :goto_0
    sget-object v2, Lyf/i;->J:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    const/4 v3, 0x0

    invoke-virtual {v2, p0, v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lyf/i;->s()Z

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lyf/i;->H:Lzf/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lzf/c;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/u;

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v0, p1}, Lbc3/u;->completeExceptionally(Ljava/lang/Throwable;)Z

    :goto_1
    const/4 p1, 0x1

    return p1

    :cond_5
    invoke-virtual {v2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    return v1
.end method

.method public final s()Z
    .locals 3

    iget-object v0, p0, Lyf/i;->y:Lzf/d;

    iget v0, v0, Lzf/d;->d:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lyf/i;->H:Lzf/c;

    invoke-virtual {v0}, Lzf/c;->a()V

    return v1

    :cond_0
    iget-object v0, p0, Lyf/i;->y:Lzf/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lzf/d;->g:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndSet(Ljava/lang/Object;I)I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    sget-object v2, Lzf/d;->e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->addAndGet(Ljava/lang/Object;I)I

    :goto_0
    iget-object v0, p0, Lyf/i;->H:Lzf/c;

    invoke-virtual {v0}, Lzf/c;->a()V

    const/4 v0, 0x1

    return v0
.end method
