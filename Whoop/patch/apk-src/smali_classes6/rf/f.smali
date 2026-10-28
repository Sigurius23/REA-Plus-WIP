.class public final Lrf/f;
.super Lud3/a0;
.source "SourceFile"


# instance fields
.field public final a:Lud3/q;

.field public final b:Lbg/g;

.field public final c:Lud3/u;

.field public final d:Lqf/b;

.field public final e:Lrg/f;

.field public final f:Log/g;

.field public g:Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;

.field public h:Z

.field public i:J

.field public j:Z

.field public k:Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;

.field public l:Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;


# direct methods
.method public constructor <init>(Lud3/q;Lbg/g;Lud3/u;Lqf/b;Lzd3/o;)V
    .locals 1

    const-string v0, "pool"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hr"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metrics"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrf/f;->a:Lud3/q;

    iput-object p2, p0, Lrf/f;->b:Lbg/g;

    iput-object p3, p0, Lrf/f;->c:Lud3/u;

    iput-object p4, p0, Lrf/f;->d:Lqf/b;

    iget-object p1, p5, Lzd3/o;->x:Lud3/o0;

    const-class p2, Lrf/w;

    invoke-virtual {p1, p2}, Lud3/o0;->c(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lrf/w;

    if-eqz p3, :cond_0

    iget-object p3, p3, Lrf/w;->b:Lq83/j;

    if-eqz p3, :cond_0

    invoke-static {p3}, Lbp/b;->w(Lq83/j;)Lmg/h;

    move-result-object p3

    goto :goto_0

    :cond_0
    sget-object p3, Lmg/h;->a:Lmg/g;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p3, Lmg/g;->b:Lmg/f;

    :goto_0
    invoke-interface {p3}, Lmg/h;->d()Lrg/n;

    move-result-object p3

    check-cast p3, Lrg/l;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p3, Lrg/d;->w:Lrg/d;

    sget-object p3, Lrg/h;->s:Lrg/g;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p3, Lrg/g;->b:Lrg/f;

    iput-object p3, p0, Lrf/f;->e:Lrg/f;

    invoke-virtual {p1, p2}, Lud3/o0;->c(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lrf/w;

    const-class p2, Lrf/o;

    if-eqz p1, :cond_2

    iget-object p1, p1, Lrf/w;->b:Lq83/j;

    if-eqz p1, :cond_2

    sget-object p3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p3, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    invoke-interface {p2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-static {p1, p2}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "logger<T> cannot be used on an anonymous object"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p1, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    sget-object p1, Log/f;->a:Log/d;

    :goto_1
    iput-object p1, p0, Lrf/f;->f:Log/g;

    sget-object p1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/4 p1, 0x0

    sget-object p2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p1, p2}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide p1

    iput-wide p1, p0, Lrf/f;->i:J

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "getLogger<T> cannot be used on an anonymous object"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final cacheConditionalHit(Lud3/j;Lud3/x0;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "cachedResponse"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lrf/b;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lrf/b;-><init>(I)V

    const/4 p2, 0x0

    iget-object v0, p0, Lrf/f;->f:Log/g;

    invoke-interface {v0, p2, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final cacheHit(Lud3/j;Lud3/x0;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "response"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lrf/b;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lrf/b;-><init>(I)V

    const/4 p2, 0x0

    iget-object v0, p0, Lrf/f;->f:Log/g;

    invoke-interface {v0, p2, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final cacheMiss(Lud3/j;)V
    .locals 2

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lrf/b;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Lrf/b;-><init>(I)V

    const/4 v0, 0x0

    iget-object v1, p0, Lrf/f;->f:Log/g;

    invoke-interface {v1, v0, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final callEnd(Lud3/j;)V
    .locals 7

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lrf/f;->d:Lqf/b;

    iget-object p1, p0, Lrf/f;->c:Lud3/u;

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lud3/u;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    int-to-long v5, v0

    :cond_0
    iget-wide v3, v2, Lqf/b;->E:J

    sget-object v1, Lqf/b;->R:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lud3/u;->d()I

    move-result p1

    int-to-long v5, p1

    :goto_0
    iget-wide v3, v2, Lqf/b;->F:J

    sget-object v1, Lqf/b;->S:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual/range {v1 .. v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p1

    move-wide v0, v5

    if-eqz p1, :cond_1

    iget-object p1, p0, Lrf/f;->f:Log/g;

    new-instance v0, Lrf/b;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lrf/b;-><init>(I)V

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    iget-object p1, p0, Lrf/f;->e:Lrg/f;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_1
    move-wide v5, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final callFailed(Lud3/j;Ljava/io/IOException;)V
    .locals 6

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "ioe"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lrf/f;->d:Lqf/b;

    iget-object p1, p0, Lrf/f;->c:Lud3/u;

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lud3/u;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    int-to-long v4, v0

    :cond_0
    iget-wide v2, v1, Lqf/b;->E:J

    sget-object v0, Lqf/b;->R:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lud3/u;->d()I

    move-result p1

    int-to-long v4, p1

    :goto_0
    iget-wide v2, v1, Lqf/b;->F:J

    sget-object v0, Lqf/b;->S:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p1

    move-wide v2, v4

    if-eqz p1, :cond_1

    iget-object p1, p0, Lrf/f;->f:Log/g;

    new-instance v0, Lrf/b;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lrf/b;-><init>(I)V

    invoke-interface {p1, p2, v0}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    iget-object p1, p0, Lrf/f;->e:Lrg/f;

    invoke-static {p1, p2}, Lrg/j;->m(Lrg/h;Ljava/lang/Exception;)V

    sget-object p1, Lrg/e;->w:[Lrg/e;

    return-void

    :cond_1
    move-wide v4, v2

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p2, v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method

.method public final callStart(Lud3/j;)V
    .locals 6

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/time/TimeSource$Monotonic;->INSTANCE:Lkotlin/time/TimeSource$Monotonic;

    invoke-virtual {p1}, Lkotlin/time/TimeSource$Monotonic;->markNow-z9LOYto()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;->box-impl(J)Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;

    move-result-object p1

    iput-object p1, p0, Lrf/f;->g:Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;

    iget-object v1, p0, Lrf/f;->d:Lqf/b;

    iget-object p1, p0, Lrf/f;->c:Lud3/u;

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lud3/u;->d:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    int-to-long v4, v0

    :cond_0
    iget-wide v2, v1, Lqf/b;->E:J

    sget-object v0, Lqf/b;->R:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lud3/u;->d()I

    move-result p1

    int-to-long v4, p1

    :goto_0
    iget-wide v2, v1, Lqf/b;->F:J

    sget-object v0, Lqf/b;->S:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p1

    move-wide v2, v4

    if-eqz p1, :cond_1

    iget-object p1, p0, Lrf/f;->f:Log/g;

    new-instance v0, Lrf/b;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lrf/b;-><init>(I)V

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void

    :cond_1
    move-wide v4, v2

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final canceled(Lud3/j;)V
    .locals 2

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lrf/b;

    const/4 v0, 0x6

    invoke-direct {p1, v0}, Lrf/b;-><init>(I)V

    const/4 v0, 0x0

    iget-object v1, p0, Lrf/f;->f:Log/g;

    invoke-interface {v1, v0, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final connectEnd(Lud3/j;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lud3/m0;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "inetSocketAddress"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "proxy"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lrf/c;

    const/4 v0, 0x0

    invoke-direct {p1, p2, p3, p4, v0}, Lrf/c;-><init>(Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lud3/m0;I)V

    const/4 p2, 0x0

    iget-object p3, p0, Lrf/f;->f:Log/g;

    invoke-interface {p3, p2, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final connectFailed(Lud3/j;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lud3/m0;Ljava/io/IOException;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "inetSocketAddress"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "proxy"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "ioe"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lrf/c;

    const/4 v0, 0x1

    invoke-direct {p1, p2, p3, p4, v0}, Lrf/c;-><init>(Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lud3/m0;I)V

    iget-object p3, p0, Lrf/f;->f:Log/g;

    invoke-interface {p3, p5, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object p1

    const-string p2, "getAddress(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/sentry/config/a;->b0(Ljava/net/InetAddress;)Lbg/f;

    iget-object p1, p0, Lrf/f;->b:Lbg/g;

    check-cast p1, Lbg/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final connectStart(Lud3/j;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "inetSocketAddress"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "proxy"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lce/d;

    const/16 v0, 0x9

    invoke-direct {p1, v0, p2, p3}, Lce/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p2, 0x0

    iget-object p3, p0, Lrf/f;->f:Log/g;

    invoke-interface {p3, p2, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final connectionAcquired(Lud3/j;Lud3/p;)V
    .locals 8

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "connection"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lrf/f;->d:Lqf/b;

    iget-object p1, p0, Lrf/f;->a:Lud3/q;

    iget-object v0, p1, Lud3/q;->a:Lzd3/q;

    iget-object v0, v0, Lzd3/q;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v0

    int-to-long v4, v0

    :cond_0
    iget-wide v2, v1, Lqf/b;->y:J

    sget-object v0, Lqf/b;->Q:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lud3/q;->b()I

    move-result p1

    int-to-long v4, p1

    :goto_0
    iget-wide v2, v1, Lqf/b;->x:J

    sget-object v0, Lqf/b;->P:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p1

    move-wide v2, v4

    if-eqz p1, :cond_5

    iget-object p1, p0, Lrf/f;->g:Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;

    if-eqz p1, :cond_4

    iget-boolean v0, p0, Lrf/f;->h:Z

    const/4 v2, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v0, :cond_1

    iput-boolean v4, p0, Lrf/f;->h:Z

    invoke-interface {p1}, Lkotlin/time/TimeMark;->elapsedNow-UwyO8pc()J

    move-result-wide v5

    iput-wide v5, p0, Lrf/f;->i:J

    iget-object v0, v1, Lqf/b;->H:Lqg/c;

    invoke-static {v0, v5, v6, v3, v2}, Le4/a;->N(Lqg/c;JLgf/c;I)V

    :cond_1
    iget-boolean v0, p0, Lrf/f;->j:Z

    if-nez v0, :cond_3

    iput-boolean v4, p0, Lrf/f;->j:Z

    iget-object v0, p0, Lrf/f;->k:Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lkotlin/time/TimeMark;->elapsedNow-UwyO8pc()J

    move-result-wide v4

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Lkotlin/time/TimeMark;->elapsedNow-UwyO8pc()J

    move-result-wide v4

    iget-wide v6, p0, Lrf/f;->i:J

    invoke-static {v4, v5, v6, v7}, Lkotlin/time/Duration;->minus-LRDsOJo(JJ)J

    move-result-wide v4

    :goto_1
    iget-object p1, v1, Lqf/b;->G:Lqg/c;

    invoke-static {p1, v4, v5, v3, v2}, Le4/a;->N(Lqg/c;JLgf/c;I)V

    :cond_3
    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    iget-object v0, p0, Lrf/f;->f:Log/g;

    new-instance v1, Lrf/d;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, p0, v2}, Lrf/d;-><init>(ILud3/p;Lrf/f;I)V

    invoke-interface {v0, v3, v1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    move-wide v4, v2

    goto :goto_0
.end method

.method public final connectionReleased(Lud3/j;Lud3/p;)V
    .locals 6

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "connection"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lrf/f;->d:Lqf/b;

    iget-object p1, p0, Lrf/f;->a:Lud3/q;

    iget-object v0, p1, Lud3/q;->a:Lzd3/q;

    iget-object v0, v0, Lzd3/q;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v0

    int-to-long v4, v0

    :cond_0
    iget-wide v2, v1, Lqf/b;->y:J

    sget-object v0, Lqf/b;->Q:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lud3/q;->b()I

    move-result p1

    int-to-long v4, p1

    :goto_0
    iget-wide v2, v1, Lqf/b;->x:J

    sget-object v0, Lqf/b;->P:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    invoke-virtual/range {v0 .. v5}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->compareAndSet(Ljava/lang/Object;JJ)Z

    move-result p1

    move-wide v2, v4

    if-eqz p1, :cond_1

    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    iget-object v0, p0, Lrf/f;->f:Log/g;

    new-instance v1, Lrf/d;

    const/4 v2, 0x1

    invoke-direct {v1, p1, p2, p0, v2}, Lrf/d;-><init>(ILud3/p;Lrf/f;I)V

    const/4 p1, 0x0

    invoke-interface {v0, p1, v1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void

    :cond_1
    move-wide v4, v2

    goto :goto_0
.end method

.method public final dnsEnd(Lud3/j;Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "domainName"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "inetAddressList"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lce/d;

    const/16 v0, 0xa

    invoke-direct {p1, v0, p2, p3}, Lce/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p2, 0x0

    iget-object p3, p0, Lrf/f;->f:Log/g;

    invoke-interface {p3, p2, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final dnsStart(Lud3/j;Ljava/lang/String;)V
    .locals 4

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "domainName"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/time/TimeSource$Monotonic;->INSTANCE:Lkotlin/time/TimeSource$Monotonic;

    invoke-virtual {p1}, Lkotlin/time/TimeSource$Monotonic;->markNow-z9LOYto()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;->box-impl(J)Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;

    move-result-object p1

    iput-object p1, p0, Lrf/f;->k:Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;

    iget-boolean p1, p0, Lrf/f;->h:Z

    const/4 v0, 0x0

    if-nez p1, :cond_1

    iget-object p1, p0, Lrf/f;->g:Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lkotlin/time/TimeMark;->elapsedNow-UwyO8pc()J

    move-result-wide v1

    iput-wide v1, p0, Lrf/f;->i:J

    iget-object p1, p0, Lrf/f;->d:Lqf/b;

    iget-object p1, p1, Lqf/b;->H:Lqg/c;

    const/4 v3, 0x6

    invoke-static {p1, v1, v2, v0, v3}, Le4/a;->N(Lqg/c;JLgf/c;I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lrf/f;->h:Z

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    new-instance p1, Lbg/j;

    const/16 v1, 0x9

    invoke-direct {p1, p2, v1}, Lbg/j;-><init>(Ljava/lang/Object;I)V

    iget-object p2, p0, Lrf/f;->f:Log/g;

    invoke-interface {p2, v0, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final proxySelectEnd(Lud3/j;Lud3/e0;Ljava/util/List;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "url"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "proxies"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lce/d;

    const/16 v0, 0xb

    invoke-direct {p1, v0, p2, p3}, Lce/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p2, 0x0

    iget-object p3, p0, Lrf/f;->f:Log/g;

    invoke-interface {p3, p2, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final proxySelectStart(Lud3/j;Lud3/e0;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "url"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lbg/j;

    const/16 v0, 0xa

    invoke-direct {p1, p2, v0}, Lbg/j;-><init>(Ljava/lang/Object;I)V

    const/4 p2, 0x0

    iget-object v0, p0, Lrf/f;->f:Log/g;

    invoke-interface {v0, p2, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final requestBodyEnd(Lud3/j;J)V
    .locals 2

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/time/TimeSource$Monotonic;->INSTANCE:Lkotlin/time/TimeSource$Monotonic;

    invoke-virtual {p1}, Lkotlin/time/TimeSource$Monotonic;->markNow-z9LOYto()J

    move-result-wide v0

    invoke-static {v0, v1}, Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;->box-impl(J)Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;

    move-result-object p1

    iput-object p1, p0, Lrf/f;->l:Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;

    new-instance p1, Lrf/e;

    const/4 v0, 0x0

    invoke-direct {p1, p2, p3, v0}, Lrf/e;-><init>(JI)V

    const/4 p2, 0x0

    iget-object p3, p0, Lrf/f;->f:Log/g;

    invoke-interface {p3, p2, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final requestBodyStart(Lud3/j;)V
    .locals 2

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lrf/b;

    const/4 v0, 0x7

    invoke-direct {p1, v0}, Lrf/b;-><init>(I)V

    const/4 v0, 0x0

    iget-object v1, p0, Lrf/f;->f:Log/g;

    invoke-interface {v1, v0, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final requestFailed(Lud3/j;Ljava/io/IOException;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "ioe"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lrf/b;

    const/16 v0, 0x8

    invoke-direct {p1, v0}, Lrf/b;-><init>(I)V

    iget-object v0, p0, Lrf/f;->f:Log/g;

    invoke-interface {v0, p2, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final requestHeadersEnd(Lud3/j;Lud3/o0;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "request"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p2, Lud3/o0;->d:Lud3/v0;

    if-nez p1, :cond_0

    sget-object p1, Lkotlin/time/TimeSource$Monotonic;->INSTANCE:Lkotlin/time/TimeSource$Monotonic;

    invoke-virtual {p1}, Lkotlin/time/TimeSource$Monotonic;->markNow-z9LOYto()J

    move-result-wide p1

    invoke-static {p1, p2}, Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;->box-impl(J)Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;

    move-result-object p1

    iput-object p1, p0, Lrf/f;->l:Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;

    :cond_0
    new-instance p1, Lrf/b;

    const/16 p2, 0x9

    invoke-direct {p1, p2}, Lrf/b;-><init>(I)V

    const/4 p2, 0x0

    iget-object v0, p0, Lrf/f;->f:Log/g;

    invoke-interface {v0, p2, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final requestHeadersStart(Lud3/j;)V
    .locals 2

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lrf/b;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lrf/b;-><init>(I)V

    const/4 v0, 0x0

    iget-object v1, p0, Lrf/f;->f:Log/g;

    invoke-interface {v1, v0, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final responseBodyEnd(Lud3/j;J)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lrf/e;

    const/4 v0, 0x1

    invoke-direct {p1, p2, p3, v0}, Lrf/e;-><init>(JI)V

    const/4 p2, 0x0

    iget-object p3, p0, Lrf/f;->f:Log/g;

    invoke-interface {p3, p2, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final responseBodyStart(Lud3/j;)V
    .locals 2

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lrf/b;

    const/16 v0, 0xb

    invoke-direct {p1, v0}, Lrf/b;-><init>(I)V

    const/4 v0, 0x0

    iget-object v1, p0, Lrf/f;->f:Log/g;

    invoke-interface {v1, v0, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final responseFailed(Lud3/j;Ljava/io/IOException;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "ioe"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lrf/b;

    const/16 v0, 0xc

    invoke-direct {p1, v0}, Lrf/b;-><init>(I)V

    iget-object v0, p0, Lrf/f;->f:Log/g;

    invoke-interface {v0, p2, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final responseHeadersEnd(Lud3/j;Lud3/x0;)V
    .locals 2

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "response"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p2, Lud3/x0;->G:Lud3/a1;

    invoke-virtual {p1}, Lud3/a1;->i()J

    move-result-wide p1

    new-instance v0, Lrf/e;

    const/4 v1, 0x2

    invoke-direct {v0, p1, p2, v1}, Lrf/e;-><init>(JI)V

    const/4 p1, 0x0

    iget-object p2, p0, Lrf/f;->f:Log/g;

    invoke-interface {p2, p1, v0}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final responseHeadersStart(Lud3/j;)V
    .locals 5

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrf/f;->l:Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlin/time/TimeMark;->elapsedNow-UwyO8pc()J

    move-result-wide v2

    iget-object v0, p0, Lrf/f;->d:Lqf/b;

    iget-object v0, v0, Lqf/b;->O:Lqg/c;

    const/4 v4, 0x6

    invoke-static {v0, v2, v3, v1, v4}, Le4/a;->N(Lqg/c;JLgf/c;I)V

    check-cast p1, Lzd3/o;

    iget-object p1, p1, Lzd3/o;->x:Lud3/o0;

    const-class v0, Lrf/w;

    invoke-virtual {p1, v0}, Lud3/o0;->c(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lrf/w;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lrf/w;->a:Ldg/a;

    if-eqz p1, :cond_0

    sget-object v0, Lpf/d;->a:Lgf/a;

    invoke-static {v2, v3}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Ldg/a;->c(Lgf/a;Ljava/lang/Object;)V

    :cond_0
    new-instance p1, Lrf/b;

    const/16 v0, 0xd

    invoke-direct {p1, v0}, Lrf/b;-><init>(I)V

    iget-object v0, p0, Lrf/f;->f:Log/g;

    invoke-interface {v0, v1, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final satisfactionFailure(Lud3/j;Lud3/x0;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "response"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lrf/b;

    const/16 p2, 0xe

    invoke-direct {p1, p2}, Lrf/b;-><init>(I)V

    const/4 p2, 0x0

    iget-object v0, p0, Lrf/f;->f:Log/g;

    invoke-interface {v0, p2, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final secureConnectEnd(Lud3/j;Lud3/c0;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lbg/j;

    const/16 v0, 0xb

    invoke-direct {p1, p2, v0}, Lbg/j;-><init>(Ljava/lang/Object;I)V

    const/4 p2, 0x0

    iget-object v0, p0, Lrf/f;->f:Log/g;

    invoke-interface {v0, p2, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method

.method public final secureConnectStart(Lud3/j;)V
    .locals 2

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lrf/b;

    const/16 v0, 0xf

    invoke-direct {p1, v0}, Lrf/b;-><init>(I)V

    const/4 v0, 0x0

    iget-object v1, p0, Lrf/f;->f:Log/g;

    invoke-interface {v1, v0, p1}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    return-void
.end method
