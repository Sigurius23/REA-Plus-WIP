.class public final Lio/sentry/android/core/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/b0;


# instance fields
.field public final w:Landroid/content/Context;

.field public final x:Lio/sentry/android/core/k0;

.field public final y:Lio/sentry/android/core/SentryAndroidOptions;

.field public final z:Ljava/util/concurrent/Future;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/k0;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    iput-object p1, p0, Lio/sentry/android/core/l0;->w:Landroid/content/Context;

    iput-object p2, p0, Lio/sentry/android/core/l0;->x:Lio/sentry/android/core/k0;

    const-string p1, "The options object is required."

    invoke-static {p3, p1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Lio/sentry/android/core/l0;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    :try_start_0
    new-instance p2, Lcom/iterable/iterableapi/m1;

    const/4 v0, 0x3

    invoke-direct {p2, v0, p0, p3}, Lcom/iterable/iterableapi/m1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p2
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    invoke-virtual {p3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p3

    sget-object v0, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v1, "Device info caching task rejected."

    invoke-interface {p3, v0, v1, p2}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p2, 0x0

    :goto_0
    iput-object p2, p0, Lio/sentry/android/core/l0;->z:Ljava/util/concurrent/Future;

    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/r4;Lio/sentry/g0;)V
    .locals 8

    iget-object v0, p1, Lio/sentry/r4;->x:Lio/sentry/protocol/c;

    invoke-virtual {v0}, Lio/sentry/protocol/c;->d()Lio/sentry/protocol/a;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lio/sentry/protocol/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :cond_0
    iget-object v1, p0, Lio/sentry/android/core/l0;->w:Landroid/content/Context;

    sget-object v2, Lio/sentry/android/core/j0;->c:Lio/sentry/android/core/util/a;

    invoke-virtual {v2, v1}, Lio/sentry/android/core/util/a;->b(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v0, Lio/sentry/protocol/a;->E:Ljava/lang/String;

    invoke-static {}, Lio/sentry/android/core/performance/g;->c()Lio/sentry/android/core/performance/g;

    move-result-object v1

    iget-object v2, p0, Lio/sentry/android/core/l0;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v1, v2}, Lio/sentry/android/core/performance/g;->b(Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/performance/h;

    move-result-object v1

    invoke-virtual {v1}, Lio/sentry/android/core/performance/h;->b()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Lio/sentry/android/core/performance/h;->b()Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v2, Lio/sentry/u5;

    iget-wide v4, v1, Lio/sentry/android/core/performance/h;->x:J

    const-wide/32 v6, 0xf4240

    mul-long/2addr v4, v6

    invoke-direct {v2, v4, v5}, Lio/sentry/u5;-><init>(J)V

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    if-nez v2, :cond_2

    move-object v1, v3

    goto :goto_1

    :cond_2
    iget-wide v1, v2, Lio/sentry/u5;->w:J

    long-to-double v1, v1

    const-wide v4, 0x412e848000000000L    # 1000000.0

    div-double/2addr v1, v4

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Double;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljc/x;->P(J)Ljava/util/Date;

    move-result-object v1

    :goto_1
    iput-object v1, v0, Lio/sentry/protocol/a;->x:Ljava/util/Date;

    :cond_3
    invoke-static {p2}, Lhg3/i;->X(Lio/sentry/g0;)Z

    move-result p2

    if-nez p2, :cond_4

    iget-object p2, v0, Lio/sentry/protocol/a;->K:Ljava/lang/Boolean;

    if-nez p2, :cond_4

    sget-object p2, Lio/sentry/android/core/e0;->E:Lio/sentry/android/core/e0;

    iget-object p2, p2, Lio/sentry/android/core/e0;->z:Ljava/lang/Boolean;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, v0, Lio/sentry/protocol/a;->K:Ljava/lang/Boolean;

    :cond_4
    iget-object p2, p0, Lio/sentry/android/core/l0;->w:Landroid/content/Context;

    iget-object v1, p0, Lio/sentry/android/core/l0;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    iget-object v4, p0, Lio/sentry/android/core/l0;->x:Lio/sentry/android/core/k0;

    invoke-static {p2, v2, v4}, Lio/sentry/android/core/j0;->e(Landroid/content/Context;Lio/sentry/v0;Lio/sentry/android/core/k0;)Landroid/content/pm/PackageInfo;

    move-result-object p2

    if-eqz p2, :cond_9

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p1, Lio/sentry/r4;->L:Ljava/lang/String;

    if-nez v4, :cond_5

    iput-object v2, p1, Lio/sentry/r4;->L:Ljava/lang/String;

    :cond_5
    iget-object v2, p0, Lio/sentry/android/core/l0;->z:Ljava/util/concurrent/Future;

    const/4 v4, 0x0

    const-string v5, "Failed to retrieve device info"

    if-eqz v2, :cond_6

    :try_start_0
    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/android/core/n0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, v2

    goto :goto_2

    :catchall_0
    move-exception v2

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v6, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v1, v6, v5, v2}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_6
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    new-array v6, v4, [Ljava/lang/Object;

    invoke-interface {v1, v2, v5, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_2
    iget-object v1, p2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object v1, v0, Lio/sentry/protocol/a;->w:Ljava/lang/String;

    iget-object v1, p2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v1, v0, Lio/sentry/protocol/a;->F:Ljava/lang/String;

    invoke-virtual {p2}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/a;->G:Ljava/lang/String;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-object v2, p2, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    iget-object p2, p2, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    if-eqz v2, :cond_8

    array-length v5, v2

    if-lez v5, :cond_8

    if-eqz p2, :cond_8

    array-length v5, p2

    if-lez v5, :cond_8

    :goto_3
    array-length v5, v2

    if-ge v4, v5, :cond_8

    aget-object v5, v2, v4

    const/16 v6, 0x2e

    invoke-virtual {v5, v6}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    aget v6, p2, v4

    const/4 v7, 0x2

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_7

    const-string v6, "granted"

    goto :goto_4

    :cond_7
    const-string v6, "not_granted"

    :goto_4
    invoke-virtual {v1, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_8
    iput-object v1, v0, Lio/sentry/protocol/a;->H:Ljava/util/AbstractMap;

    if-eqz v3, :cond_9

    :try_start_1
    iget-object p2, v3, Lio/sentry/android/core/n0;->f:Lbd3/k;

    if-eqz p2, :cond_9

    iget-boolean v1, p2, Lbd3/k;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/a;->L:Ljava/lang/Boolean;

    iget-object p2, p2, Lbd3/k;->c:Ljava/lang/Object;

    check-cast p2, [Ljava/lang/String;

    if-eqz p2, :cond_9

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    iput-object p2, v0, Lio/sentry/protocol/a;->M:Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    :cond_9
    iget-object p1, p1, Lio/sentry/r4;->x:Lio/sentry/protocol/c;

    invoke-virtual {p1, v0}, Lio/sentry/protocol/c;->m(Lio/sentry/protocol/a;)V

    return-void
.end method

.method public final b(Lio/sentry/s6;Lio/sentry/g0;)Lio/sentry/s6;
    .locals 1

    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/l0;->d(Lio/sentry/r4;Lio/sentry/g0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/l0;->a(Lio/sentry/r4;Lio/sentry/g0;)V

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lio/sentry/android/core/l0;->c(Lio/sentry/r4;ZZ)V

    return-object p1
.end method

.method public final c(Lio/sentry/r4;ZZ)V
    .locals 8

    iget-object v0, p1, Lio/sentry/r4;->I:Lio/sentry/protocol/h0;

    if-nez v0, :cond_0

    new-instance v0, Lio/sentry/protocol/h0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p1, Lio/sentry/r4;->I:Lio/sentry/protocol/h0;

    :cond_0
    iget-object v1, v0, Lio/sentry/protocol/h0;->x:Ljava/lang/String;

    if-nez v1, :cond_1

    iget-object v1, p0, Lio/sentry/android/core/l0;->w:Landroid/content/Context;

    invoke-static {v1}, Lio/sentry/android/core/t0;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/h0;->x:Ljava/lang/String;

    :cond_1
    iget-object v1, v0, Lio/sentry/protocol/h0;->z:Ljava/lang/String;

    iget-object v2, p0, Lio/sentry/android/core/l0;->y:Lio/sentry/android/core/SentryAndroidOptions;

    if-nez v1, :cond_2

    invoke-virtual {v2}, Lio/sentry/q6;->isSendDefaultPii()Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "{{auto}}"

    iput-object v1, v0, Lio/sentry/protocol/h0;->z:Ljava/lang/String;

    :cond_2
    iget-object v0, p1, Lio/sentry/r4;->x:Lio/sentry/protocol/c;

    invoke-virtual {v0}, Lio/sentry/protocol/c;->e()Lio/sentry/protocol/f;

    move-result-object v1

    const-string v3, "Failed to retrieve device info"

    iget-object v4, p0, Lio/sentry/android/core/l0;->z:Ljava/util/concurrent/Future;

    const/4 v5, 0x0

    if-nez v1, :cond_6

    if-eqz v4, :cond_3

    :try_start_0
    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/android/core/n0;

    invoke-virtual {v1, p2, p3}, Lio/sentry/android/core/n0;->a(ZZ)Lio/sentry/protocol/f;

    move-result-object p2

    invoke-virtual {v0, p2}, Lio/sentry/protocol/c;->o(Lio/sentry/protocol/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p3

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {p3, v1, v3, p2}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object p3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    new-array v1, v5, [Ljava/lang/Object;

    invoke-interface {p2, p3, v3, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {v0}, Lio/sentry/protocol/c;->g()Lio/sentry/protocol/p;

    move-result-object p2

    if-eqz v4, :cond_4

    :try_start_1
    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/sentry/android/core/n0;

    iget-object p3, p3, Lio/sentry/android/core/n0;->g:Lio/sentry/protocol/p;

    invoke-virtual {v0, p3}, Lio/sentry/protocol/c;->r(Lio/sentry/protocol/p;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p3

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v6, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v7, "Failed to retrieve os system"

    invoke-interface {v1, v6, v7, p3}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p3

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    new-array v6, v5, [Ljava/lang/Object;

    invoke-interface {p3, v1, v3, v6}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    if-eqz p2, :cond_6

    iget-object p3, p2, Lio/sentry/protocol/p;->w:Ljava/lang/String;

    if-eqz p3, :cond_5

    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "os_"

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p3

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p3, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    goto :goto_2

    :cond_5
    const-string p3, "os_1"

    :goto_2
    invoke-virtual {v0, p2, p3}, Lio/sentry/protocol/c;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :cond_6
    if-eqz v4, :cond_8

    :try_start_2
    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/sentry/android/core/n0;

    iget-object p2, p2, Lio/sentry/android/core/n0;->e:Lbd3/u;

    if-eqz p2, :cond_9

    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    const-string v0, "isSideLoaded"

    iget-boolean v1, p2, Lbd3/u;->w:Z

    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p2, Lbd3/u;->x:Ljava/lang/String;

    if-eqz p2, :cond_7

    const-string v0, "installerStore"

    invoke-virtual {p3, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    invoke-virtual {p3}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_9

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p1, v0, p3}, Lio/sentry/r4;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception p1

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object p3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v0, "Error getting side loaded info."

    invoke-interface {p2, p3, v0, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_4

    :cond_8
    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    new-array p3, v5, [Ljava/lang/Object;

    invoke-interface {p1, p2, v3, p3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_9
    :goto_4
    return-void
.end method

.method public final d(Lio/sentry/r4;Lio/sentry/g0;)Z
    .locals 2

    invoke-static {p2}, Lhg3/i;->k0(Lio/sentry/g0;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    iget-object p2, p0, Lio/sentry/android/core/l0;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-object p1, p1, Lio/sentry/r4;->w:Lio/sentry/protocol/v;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Event was cached so not applying data relevant to the current app execution/version: %s"

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final h(Lio/sentry/e5;Lio/sentry/g0;)Lio/sentry/e5;
    .locals 8

    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/l0;->d(Lio/sentry/r4;Lio/sentry/g0;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/l0;->a(Lio/sentry/r4;Lio/sentry/g0;)V

    invoke-virtual {p1}, Lio/sentry/e5;->e()Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {p2}, Lhg3/i;->X(Lio/sentry/g0;)Z

    move-result p2

    invoke-virtual {p1}, Lio/sentry/e5;->e()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/protocol/c0;

    sget-object v4, Lio/sentry/android/core/internal/util/e;->a:Lio/sentry/android/core/internal/util/e;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v3, Lio/sentry/protocol/c0;->w:Ljava/lang/Long;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v6

    invoke-virtual {v6}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v6

    invoke-static {v6}, Lio/sentry/android/core/internal/util/e;->d(Ljava/lang/Thread;)J

    move-result-wide v6

    cmp-long v4, v6, v4

    if-nez v4, :cond_1

    move v4, v1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    iget-object v5, v3, Lio/sentry/protocol/c0;->F:Ljava/lang/Boolean;

    if-nez v5, :cond_2

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iput-object v5, v3, Lio/sentry/protocol/c0;->F:Ljava/lang/Boolean;

    :cond_2
    if-nez p2, :cond_0

    iget-object v5, v3, Lio/sentry/protocol/c0;->H:Ljava/lang/Boolean;

    if-nez v5, :cond_0

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, v3, Lio/sentry/protocol/c0;->H:Ljava/lang/Boolean;

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p1, v1, v0}, Lio/sentry/android/core/l0;->c(Lio/sentry/r4;ZZ)V

    invoke-virtual {p1}, Lio/sentry/e5;->d()Ljava/util/ArrayList;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v1, :cond_5

    invoke-static {p2, v1}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/protocol/u;

    const-string v1, "java.lang"

    iget-object v2, v0, Lio/sentry/protocol/u;->y:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v0, v0, Lio/sentry/protocol/u;->E:Lio/sentry/protocol/b0;

    if-eqz v0, :cond_5

    iget-object v0, v0, Lio/sentry/protocol/b0;->w:Ljava/util/List;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/protocol/z;

    const-string v2, "com.android.internal.os.RuntimeInit$MethodAndArgsCaller"

    iget-object v1, v1, Lio/sentry/protocol/z;->F:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {p2}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    :cond_5
    return-object p1
.end method

.method public final i(Lio/sentry/protocol/d0;Lio/sentry/g0;)Lio/sentry/protocol/d0;
    .locals 1

    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/l0;->d(Lio/sentry/r4;Lio/sentry/g0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lio/sentry/android/core/l0;->a(Lio/sentry/r4;Lio/sentry/g0;)V

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lio/sentry/android/core/l0;->c(Lio/sentry/r4;ZZ)V

    return-object p1
.end method
