.class public final Lio/sentry/android/core/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcl/b;Lcl/b;Lcl/b;Lcl/b;Lzk/l;Lzk/l;)V
    .locals 2

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Laj/c;

    const/16 v1, 0x1c

    invoke-direct {v0, p0, v1}, Laj/c;-><init>(Ljava/lang/Object;I)V

    const/16 v1, 0x96

    .line 16
    invoke-static {v1, v0}, Lul/c;->a(ILul/a;)Ls/m2;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/android/core/d;->g:Ljava/lang/Object;

    .line 17
    iput-object p1, p0, Lio/sentry/android/core/d;->a:Ljava/lang/Object;

    .line 18
    iput-object p2, p0, Lio/sentry/android/core/d;->b:Ljava/lang/Object;

    .line 19
    iput-object p3, p0, Lio/sentry/android/core/d;->c:Ljava/lang/Object;

    .line 20
    iput-object p4, p0, Lio/sentry/android/core/d;->d:Ljava/lang/Object;

    .line 21
    iput-object p5, p0, Lio/sentry/android/core/d;->e:Ljava/lang/Object;

    .line 22
    iput-object p6, p0, Lio/sentry/android/core/d;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lqt/e;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 5

    .line 1
    new-instance v0, Lio/sentry/android/core/k0;

    invoke-direct {v0}, Lio/sentry/android/core/k0;-><init>()V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v1, p0, Lio/sentry/android/core/d;->d:Ljava/lang/Object;

    .line 4
    new-instance v1, Ljava/util/WeakHashMap;

    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v1, p0, Lio/sentry/android/core/d;->e:Ljava/lang/Object;

    .line 5
    new-instance v1, Lio/sentry/util/a;

    .line 6
    invoke-direct {v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 7
    iput-object v1, p0, Lio/sentry/android/core/d;->g:Ljava/lang/Object;

    .line 8
    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    .line 9
    new-instance v2, Lio/sentry/util/f;

    new-instance v3, Lcom/whoop/data/repositories/c;

    const/16 v4, 0xe

    invoke-direct {v3, v4, p1, v1}, Lcom/whoop/data/repositories/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v2, v3}, Lio/sentry/util/f;-><init>(Lio/sentry/util/e;)V

    .line 10
    iput-object v2, p0, Lio/sentry/android/core/d;->b:Ljava/lang/Object;

    .line 11
    new-instance p1, Lio/sentry/util/f;

    new-instance v1, Li5/c;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, Li5/c;-><init>(I)V

    invoke-direct {p1, v1}, Lio/sentry/util/f;-><init>(Lio/sentry/util/e;)V

    iput-object p1, p0, Lio/sentry/android/core/d;->a:Ljava/lang/Object;

    .line 12
    iput-object p2, p0, Lio/sentry/android/core/d;->c:Ljava/lang/Object;

    .line 13
    iput-object v0, p0, Lio/sentry/android/core/d;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/core/d;->g:Ljava/lang/Object;

    check-cast v0, Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0}, Lio/sentry/android/core/d;->c()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :cond_0
    :try_start_1
    new-instance v1, Lio/sentry/android/core/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/sentry/android/core/b;-><init>(Lio/sentry/android/core/d;Landroid/app/Activity;I)V

    const-string v2, "FrameMetricsAggregator.add"

    invoke-virtual {p0, v1, v2}, Lio/sentry/android/core/d;->d(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/sentry/android/core/d;->b()Lio/sentry/android/core/c;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Lio/sentry/android/core/d;->e:Ljava/lang/Object;

    check-cast v2, Ljava/util/WeakHashMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public b()Lio/sentry/android/core/c;
    .locals 8

    invoke-virtual {p0}, Lio/sentry/android/core/d;->c()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/d;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/util/f;

    invoke-virtual {v0}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    iget-object v0, p0, Lio/sentry/android/core/d;->a:Ljava/lang/Object;

    check-cast v0, Lio/sentry/util/f;

    invoke-virtual {v0}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/core/app/FrameMetricsAggregator;

    invoke-virtual {v0}, Landroidx/core/app/FrameMetricsAggregator;->getMetrics()[Landroid/util/SparseIntArray;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    array-length v2, v0

    if-lez v2, :cond_5

    aget-object v0, v0, v1

    if-eqz v0, :cond_5

    move v2, v1

    move v3, v2

    move v4, v3

    :goto_1
    invoke-virtual {v0}, Landroid/util/SparseIntArray;->size()I

    move-result v5

    if-ge v1, v5, :cond_4

    invoke-virtual {v0, v1}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v5

    invoke-virtual {v0, v1}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v6

    add-int/2addr v2, v6

    const/16 v7, 0x2bc

    if-le v5, v7, :cond_2

    add-int/2addr v4, v6

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    if-le v5, v7, :cond_3

    add-int/2addr v3, v6

    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    move v1, v2

    goto :goto_3

    :cond_5
    move v3, v1

    move v4, v3

    :goto_3
    new-instance v0, Lio/sentry/android/core/c;

    invoke-direct {v0, v1, v3, v4}, Lio/sentry/android/core/c;-><init>(III)V

    return-object v0
.end method

.method public c()Z
    .locals 2

    iget-object v0, p0, Lio/sentry/android/core/d;->c:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    iget-object v1, p0, Lio/sentry/android/core/d;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/util/f;

    invoke-virtual {v1}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableFramesTracking()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isEnablePerformanceV2()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d(Ljava/lang/Runnable;Ljava/lang/String;)V
    .locals 3

    :try_start_0
    sget-object v0, Lio/sentry/android/core/internal/util/e;->a:Lio/sentry/android/core/internal/util/e;

    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    iget-object v0, p0, Lio/sentry/android/core/d;->f:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/k0;

    new-instance v1, Landroidx/fragment/app/d;

    const/16 v2, 0xb

    invoke-direct {v1, p0, p1, p2, v2}, Landroidx/fragment/app/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object p1, v0, Lio/sentry/android/core/k0;->a:Ljava/lang/Object;

    check-cast p1, Landroid/os/Handler;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    if-eqz p2, :cond_1

    iget-object p1, p0, Lio/sentry/android/core/d;->c:Ljava/lang/Object;

    check-cast p1, Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v1, "Failed to execute "

    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, p2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
