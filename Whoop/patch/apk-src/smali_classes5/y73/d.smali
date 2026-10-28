.class public final Ly73/d;
.super Ll73/g;
.source "SourceFile"


# static fields
.field public static final b:Ly73/b;

.field public static final c:Ly73/k;

.field public static final d:I

.field public static final e:Ly73/c;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    const-string v1, "rx2.computation-threads"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lez v1, :cond_1

    if-le v1, v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :cond_1
    :goto_0
    sput v0, Ly73/d;->d:I

    new-instance v0, Ly73/c;

    new-instance v1, Ly73/k;

    const-string v3, "RxComputationShutdown"

    invoke-direct {v1, v3}, Ly73/k;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ly73/j;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    sput-object v0, Ly73/d;->e:Ly73/c;

    invoke-virtual {v0}, Ly73/j;->dispose()V

    const-string v0, "rx2.computation-priority"

    const/4 v1, 0x5

    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xa

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-instance v3, Ly73/k;

    const-string v4, "RxComputationThreadPool"

    invoke-direct {v3, v4, v0, v1}, Ly73/k;-><init>(Ljava/lang/String;IZ)V

    sput-object v3, Ly73/d;->c:Ly73/k;

    new-instance v0, Ly73/b;

    invoke-direct {v0, v2, v3}, Ly73/b;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    sput-object v0, Ly73/d;->b:Ly73/b;

    iget-object v0, v0, Ly73/b;->b:[Ly73/c;

    array-length v1, v0

    :goto_1
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ly73/j;->dispose()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Ly73/d;->b:Ly73/b;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ly73/d;->a:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Ly73/b;

    sget v3, Ly73/d;->d:I

    sget-object v4, Ly73/d;->c:Ly73/k;

    invoke-direct {v2, v3, v4}, Ly73/b;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    :cond_0
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v1, :cond_0

    iget-object v0, v2, Ly73/b;->b:[Ly73/c;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ly73/j;->dispose()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public final a()Ll73/f;
    .locals 8

    new-instance v0, Ly73/a;

    iget-object v1, p0, Ly73/d;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly73/b;

    iget v2, v1, Ly73/b;->a:I

    if-nez v2, :cond_0

    sget-object v1, Ly73/d;->e:Ly73/c;

    goto :goto_0

    :cond_0
    iget-object v3, v1, Ly73/b;->b:[Ly73/c;

    iget-wide v4, v1, Ly73/b;->c:J

    const-wide/16 v6, 0x1

    add-long/2addr v6, v4

    iput-wide v6, v1, Ly73/b;->c:J

    int-to-long v1, v2

    rem-long/2addr v4, v1

    long-to-int v1, v4

    aget-object v1, v3, v1

    :goto_0
    invoke-direct {v0, v1}, Ly73/a;-><init>(Ly73/c;)V

    return-object v0
.end method

.method public final b(Lu73/a;)Ln73/b;
    .locals 8

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, Ly73/d;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly73/b;

    iget v2, v1, Ly73/b;->a:I

    if-nez v2, :cond_0

    sget-object v1, Ly73/d;->e:Ly73/c;

    goto :goto_0

    :cond_0
    iget-object v3, v1, Ly73/b;->b:[Ly73/c;

    iget-wide v4, v1, Ly73/b;->c:J

    const-wide/16 v6, 0x1

    add-long/2addr v6, v4

    iput-wide v6, v1, Ly73/b;->c:J

    int-to-long v1, v2

    rem-long/2addr v4, v1

    long-to-int v1, v4

    aget-object v1, v3, v1

    :goto_0
    iget-object v1, v1, Ly73/j;->w:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v2, Ly73/l;

    invoke-direct {v2, p1}, Ly73/l;-><init>(Lu73/a;)V

    const-wide/16 v3, 0x5

    :try_start_0
    invoke-interface {v1, v2, v3, v4, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    invoke-virtual {v2, p1}, Ly73/l;->a(Ljava/util/concurrent/Future;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception p1

    invoke-static {p1}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    sget-object p1, Lq73/d;->w:Lq73/d;

    return-object p1
.end method
