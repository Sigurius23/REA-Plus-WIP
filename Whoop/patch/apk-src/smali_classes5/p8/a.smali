.class public final Lp8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final H:Ljava/util/concurrent/ThreadPoolExecutor;

.field public static I:Lp8/e;

.field public static volatile J:Ljava/util/concurrent/ThreadPoolExecutor;


# instance fields
.field public final E:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final F:Ljava/util/concurrent/CountDownLatch;

.field public final synthetic G:Lro/d;

.field public final w:Lio/seon/androidsdk/service/j;

.field public final x:Lp8/c;

.field public volatile y:I

.field public final z:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v7, Lp8/b;

    invoke-direct {v7}, Lp8/b;-><init>()V

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v0, 0xa

    invoke-direct {v6, v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v3, 0x1

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v1, 0x5

    const/16 v2, 0x80

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v0, Lp8/a;->H:Ljava/util/concurrent/ThreadPoolExecutor;

    sput-object v0, Lp8/a;->J:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public constructor <init>(Lro/d;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp8/a;->G:Lro/d;

    const/4 p1, 0x1

    iput p1, p0, Lp8/a;->y:I

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lp8/a;->z:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lp8/a;->E:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Lio/seon/androidsdk/service/j;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lio/seon/androidsdk/service/j;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lp8/a;->w:Lio/seon/androidsdk/service/j;

    new-instance v1, Lp8/c;

    invoke-direct {v1, p0, v0}, Lp8/c;-><init>(Lp8/a;Lio/seon/androidsdk/service/j;)V

    iput-object v1, p0, Lp8/a;->x:Lp8/c;

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v0, p1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lp8/a;->F:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    const-class v0, Lp8/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lp8/a;->I:Lp8/e;

    if-nez v1, :cond_0

    new-instance v1, Lp8/e;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v1, Lp8/a;->I:Lp8/e;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    sget-object v1, Lp8/a;->I:Lp8/e;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lp8/d;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lp8/d;-><init>(Lp8/a;[Ljava/lang/Object;)V

    const/4 p1, 0x1

    invoke-virtual {v1, p1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final run()V
    .locals 1

    iget-object v0, p0, Lp8/a;->G:Lro/d;

    invoke-virtual {v0}, Lro/d;->c()V

    return-void
.end method
