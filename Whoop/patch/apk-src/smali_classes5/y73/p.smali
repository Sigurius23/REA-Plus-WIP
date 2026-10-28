.class public final Ly73/p;
.super Ll73/g;
.source "SourceFile"


# static fields
.field public static final b:Ly73/k;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    const-string v0, "rx2.single-priority"

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

    new-instance v2, Ly73/k;

    const-string v3, "RxSingleScheduler"

    invoke-direct {v2, v3, v0, v1}, Ly73/k;-><init>(Ljava/lang/String;IZ)V

    sput-object v2, Ly73/p;->b:Ly73/k;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Ly73/p;->a:Ljava/util/concurrent/atomic/AtomicReference;

    sget-boolean v1, Ly73/n;->a:Z

    const/4 v1, 0x1

    sget-object v2, Ly73/p;->b:Ly73/k;

    invoke-static {v1, v2}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    sget-boolean v2, Ly73/n;->a:Z

    if-eqz v2, :cond_0

    instance-of v2, v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    sget-object v3, Ly73/n;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a()Ll73/f;
    .locals 2

    new-instance v0, Ly73/o;

    iget-object v1, p0, Ly73/p;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {v0, v1}, Ly73/o;-><init>(Ljava/util/concurrent/ScheduledExecutorService;)V

    return-object v0
.end method

.method public final b(Lu73/a;)Ln73/b;
    .locals 5

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, Ly73/p;->a:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v2, Ly73/l;

    invoke-direct {v2, p1}, Ly73/l;-><init>(Lu73/a;)V

    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    const-wide/16 v3, 0x5

    invoke-interface {p1, v2, v3, v4, v0}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

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
