.class public Leh3/k;
.super Lxg3/j;
.source "SourceFile"


# static fields
.field public static final E:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final F:Ljava/util/concurrent/atomic/AtomicReference;

.field public static volatile G:Ljava/lang/Object;

.field public static final H:Ljava/lang/Object;

.field public static final y:Z

.field public static final z:I


# instance fields
.field public final w:Ljava/util/concurrent/ScheduledExecutorService;

.field public volatile x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Leh3/k;->H:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Leh3/k;->E:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    sput-object v0, Leh3/k;->F:Ljava/util/concurrent/atomic/AtomicReference;

    const-string v0, "rx.scheduler.jdk6.purge-frequency-millis"

    const/16 v1, 0x3e8

    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    sput v0, Leh3/k;->z:I

    const-string v0, "rx.scheduler.jdk6.purge-force"

    invoke-static {v0}, Ljava/lang/Boolean;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    sget v1, Lgh3/f;->a:I

    if-nez v0, :cond_1

    if-eqz v1, :cond_0

    const/16 v0, 0x15

    if-lt v1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Leh3/k;->y:Z

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ThreadFactory;)V
    .locals 12

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    invoke-static {v0, p1}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    invoke-static {p1}, Leh3/k;->g(Ljava/util/concurrent/ScheduledExecutorService;)Z

    move-result v1

    if-nez v1, :cond_2

    instance-of v1, p1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-eqz v1, :cond_2

    move-object v1, p1

    check-cast v1, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    :goto_0
    sget-object v2, Leh3/k;->F:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/concurrent/ScheduledExecutorService;

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    new-instance v3, Lgh3/i;

    const-string v4, "RxSchedulerPurge-"

    invoke-direct {v3, v4}, Lgh3/i;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v3}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v5

    invoke-static {v2, v5}, Ld13/a;->y(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/ScheduledExecutorService;)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v6, Lcom/google/android/gms/common/api/n;

    const/4 v0, 0x1

    invoke-direct {v6, v0}, Lcom/google/android/gms/common/api/n;-><init>(I)V

    sget v0, Leh3/k;->z:I

    int-to-long v7, v0

    sget-object v11, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    move-wide v9, v7

    invoke-interface/range {v5 .. v11}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    :goto_1
    sget-object v0, Leh3/k;->E:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_1
    invoke-interface {v5}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    goto :goto_0

    :cond_2
    :goto_2
    iput-object p1, p0, Leh3/k;->w:Ljava/util/concurrent/ScheduledExecutorService;

    return-void
.end method

.method public static e(Ljava/util/concurrent/ScheduledExecutorService;)Ljava/lang/reflect/Method;
    .locals 7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "setRemoveOnCancelPolicy"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x1

    if-ne v5, v6, :cond_0

    aget-object v4, v4, v1

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v4, v5, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static g(Ljava/util/concurrent/ScheduledExecutorService;)Z
    .locals 3

    sget-boolean v0, Leh3/k;->y:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    instance-of v0, p0, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    if-eqz v0, :cond_3

    sget-object v0, Leh3/k;->G:Ljava/lang/Object;

    sget-object v2, Leh3/k;->H:Ljava/lang/Object;

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_2

    invoke-static {p0}, Leh3/k;->e(Ljava/util/concurrent/ScheduledExecutorService;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_1

    move-object v2, v0

    :cond_1
    sput-object v2, Leh3/k;->G:Ljava/lang/Object;

    goto :goto_0

    :cond_2
    check-cast v0, Ljava/lang/reflect/Method;

    goto :goto_0

    :cond_3
    invoke-static {p0}, Leh3/k;->e(Ljava/util/concurrent/ScheduledExecutorService;)Ljava/lang/reflect/Method;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_4

    :try_start_0
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_2

    :catch_2
    move-exception p0

    goto :goto_3

    :goto_1
    invoke-static {p0}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    goto :goto_4

    :goto_2
    invoke-static {p0}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    goto :goto_4

    :goto_3
    invoke-static {p0}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    :cond_4
    :goto_4
    return v1
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Leh3/k;->x:Z

    return v0
.end method

.method public final b()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Leh3/k;->x:Z

    iget-object v0, p0, Leh3/k;->w:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    iget-object v0, p0, Leh3/k;->w:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v1, Leh3/k;->E:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final c(Lbh3/a;)Lxg3/t;
    .locals 3

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v0, v1, v2}, Leh3/k;->d(Lbh3/a;JLjava/util/concurrent/TimeUnit;)Lxg3/t;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lbh3/a;JLjava/util/concurrent/TimeUnit;)Lxg3/t;
    .locals 1

    iget-boolean v0, p0, Leh3/k;->x:Z

    if-eqz v0, :cond_0

    sget-object p1, Lmh3/e;->a:Lmh3/d;

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Leh3/k;->f(Lbh3/a;JLjava/util/concurrent/TimeUnit;)Leh3/p;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lbh3/a;JLjava/util/concurrent/TimeUnit;)Leh3/p;
    .locals 3

    sget-object v0, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v0}, Ljh3/f;->e()Ljh3/g;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Leh3/p;

    invoke-direct {v0, p1}, Leh3/p;-><init>(Lbh3/a;)V

    const-wide/16 v1, 0x0

    cmp-long p1, p2, v1

    iget-object v1, p0, Leh3/k;->w:Ljava/util/concurrent/ScheduledExecutorService;

    if-gtz p1, :cond_0

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-interface {v1, v0, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Leh3/p;->c(Ljava/util/concurrent/Future;)V

    return-object v0
.end method
