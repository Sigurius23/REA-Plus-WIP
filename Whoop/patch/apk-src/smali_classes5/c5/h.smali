.class public abstract Lc5/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La0/a0;

.field public static final b:Ljava/util/concurrent/ThreadPoolExecutor;

.field public static final c:Ljava/lang/Object;

.field public static final d:La0/f1;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, La0/a0;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, La0/a0;-><init>(I)V

    sput-object v0, Lc5/h;->a:La0/a0;

    new-instance v9, Lc5/k;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/concurrent/ThreadPoolExecutor;

    const/16 v0, 0x2710

    int-to-long v5, v0

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    sput-object v2, Lc5/h;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lc5/h;->c:Ljava/lang/Object;

    new-instance v0, La0/f1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/f1;-><init>(I)V

    sput-object v0, Lc5/h;->d:La0/f1;

    return-void
.end method

.method public static a(ILjava/util/List;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc5/d;

    iget-object v2, v2, Lc5/d;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_0

    const-string v2, ";"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)Lc5/g;
    .locals 8

    sget-object v0, Lc5/h;->a:La0/a0;

    const-string v1, "getFontSync"

    invoke-static {v1}, Lpf/c;->Z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v0, p0}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    new-instance p0, Lc5/g;

    invoke-direct {p0, v1}, Lc5/g;-><init>(Landroid/graphics/Typeface;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object p0

    :cond_0
    :try_start_1
    invoke-static {p1, p2}, Lc5/c;->a(Landroid/content/Context;Ljava/util/List;)Lbd3/v;

    move-result-object p2
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    iget-object v1, p2, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget p2, p2, Lbd3/v;->x:I

    const/4 v2, 0x1

    const/4 v3, -0x3

    const/4 v4, 0x0

    if-eqz p2, :cond_2

    if-eq p2, v2, :cond_1

    :goto_0
    move p2, v3

    goto :goto_3

    :cond_1
    const/4 p2, -0x2

    goto :goto_3

    :cond_2
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lc5/i;

    if-eqz p2, :cond_7

    array-length v5, p2

    if-nez v5, :cond_3

    goto :goto_2

    :cond_3
    array-length v5, p2

    move v6, v4

    :goto_1
    if-ge v6, v5, :cond_6

    aget-object v7, p2, v6

    iget v7, v7, Lc5/i;->e:I

    if-eqz v7, :cond_5

    if-gez v7, :cond_4

    goto :goto_0

    :cond_4
    move p2, v7

    goto :goto_3

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_6
    move p2, v4

    goto :goto_3

    :cond_7
    :goto_2
    move p2, v2

    :goto_3
    if-eqz p2, :cond_8

    new-instance p0, Lc5/g;

    invoke-direct {p0, p2}, Lc5/g;-><init>(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object p0

    :cond_8
    :try_start_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p2

    if-le p2, v2, :cond_9

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt p2, v2, :cond_9

    sget-object p2, Lv4/e;->a:Lts/o;

    const-string p2, "TypefaceCompat.createFromFontInfoWithFallback"

    invoke-static {p2}, Lpf/c;->Z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    sget-object p2, Lv4/e;->a:Lts/o;

    invoke-virtual {p2, p1, v1, p3}, Lts/o;->o(Landroid/content/Context;Ljava/util/List;I)Landroid/graphics/Typeface;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_4

    :catchall_0
    move-exception p0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p0

    :cond_9
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Lc5/i;

    sget-object v1, Lv4/e;->a:Lts/o;

    const-string v1, "TypefaceCompat.createFromFontInfo"

    invoke-static {v1}, Lpf/c;->Z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    sget-object v1, Lv4/e;->a:Lts/o;

    invoke-virtual {v1, p1, p2, p3}, Lts/o;->n(Landroid/content/Context;[Lc5/i;I)Landroid/graphics/Typeface;

    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    :goto_4
    if-eqz p1, :cond_a

    invoke-virtual {v0, p0, p1}, La0/a0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lc5/g;

    invoke-direct {p0, p1}, Lc5/g;-><init>(Landroid/graphics/Typeface;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object p0

    :cond_a
    :try_start_8
    new-instance p0, Lc5/g;

    invoke-direct {p0, v3}, Lc5/g;-><init>(I)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object p0

    :catchall_1
    move-exception p0

    :try_start_9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p0

    :catch_0
    new-instance p0, Lc5/g;

    const/4 p1, -0x1

    invoke-direct {p0, p1}, Lc5/g;-><init>(I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object p0

    :catchall_2
    move-exception p0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p0
.end method

.method public static c(Landroid/content/Context;Ljava/util/List;ILio/sentry/internal/debugmeta/c;)Landroid/graphics/Typeface;
    .locals 7

    invoke-static {p2, p1}, Lc5/h;->a(ILjava/util/List;)Ljava/lang/String;

    move-result-object v1

    sget-object v0, Lc5/h;->a:La0/a0;

    invoke-virtual {v0, v1}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Typeface;

    if-eqz v0, :cond_0

    iget-object p0, p3, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    check-cast p0, Lc5/l;

    iget-object p1, p3, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    check-cast p1, Lty/c;

    new-instance p2, Lds/s;

    const/4 p3, 0x3

    invoke-direct {p2, p3, p1, v0}, Lds/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Lc5/l;->execute(Ljava/lang/Runnable;)V

    return-object v0

    :cond_0
    new-instance v0, Lc5/f;

    const/4 v2, 0x0

    invoke-direct {v0, p3, v2}, Lc5/f;-><init>(Ljava/lang/Object;I)V

    sget-object p3, Lc5/h;->c:Ljava/lang/Object;

    monitor-enter p3

    :try_start_0
    sget-object v2, Lc5/h;->d:La0/f1;

    invoke-virtual {v2, v1}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    const/4 v6, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit p3

    return-object v6

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v1, v3}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lc5/e;

    const/4 v5, 0x1

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    invoke-direct/range {v0 .. v5}, Lc5/e;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    sget-object p0, Lc5/h;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance p1, Lc5/f;

    const/4 p2, 0x1

    invoke-direct {p1, v1, p2}, Lc5/f;-><init>(Ljava/lang/Object;I)V

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    if-nez p2, :cond_2

    new-instance p2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    goto :goto_0

    :cond_2
    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    :goto_0
    new-instance p3, Lc5/m;

    invoke-direct {p3}, Lc5/m;-><init>()V

    iput-object v0, p3, Lc5/m;->x:Ljava/lang/Object;

    iput-object p1, p3, Lc5/m;->y:Ljava/lang/Object;

    iput-object p2, p3, Lc5/m;->z:Ljava/lang/Object;

    invoke-interface {p0, p3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v6

    :goto_1
    :try_start_1
    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static d(Landroid/content/Context;Lc5/d;Lio/sentry/internal/debugmeta/c;II)Landroid/graphics/Typeface;
    .locals 9

    iget-object v1, p2, Lio/sentry/internal/debugmeta/c;->x:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lty/c;

    iget-object v1, p2, Lio/sentry/internal/debugmeta/c;->y:Ljava/lang/Object;

    move-object v8, v1

    check-cast v8, Lc5/l;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    aget-object v1, v1, v4

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {p3, v1}, Lc5/h;->a(ILjava/util/List;)Ljava/lang/String;

    move-result-object v2

    sget-object v1, Lc5/h;->a:La0/a0;

    invoke-virtual {v1, v2}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    new-instance v0, Lds/s;

    const/4 v2, 0x3

    invoke-direct {v0, v2, v7, v1}, Lds/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v0}, Lc5/l;->execute(Ljava/lang/Runnable;)V

    return-object v1

    :cond_0
    const/4 v1, -0x1

    if-ne p4, v1, :cond_1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v1

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    aget-object v1, v1, v4

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-static {v2, p0, v1, p3}, Lc5/h;->b(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)Lc5/g;

    move-result-object v1

    invoke-virtual {p2, v1}, Lio/sentry/internal/debugmeta/c;->D(Lc5/g;)V

    iget-object v0, v1, Lc5/g;->a:Landroid/graphics/Typeface;

    return-object v0

    :cond_1
    new-instance v1, Lc5/e;

    const/4 v6, 0x0

    move-object v3, p0

    move-object v4, p1

    move v5, p3

    invoke-direct/range {v1 .. v6}, Lc5/e;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    :try_start_0
    sget-object v2, Lc5/h;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-interface {v2, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3

    int-to-long v2, p4

    :try_start_1
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2, v3, v4}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2

    :try_start_2
    check-cast v1, Lc5/g;

    invoke-virtual {p2, v1}, Lio/sentry/internal/debugmeta/c;->D(Lc5/g;)V

    iget-object v0, v1, Lc5/g;->a:Landroid/graphics/Typeface;

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :catch_2
    new-instance v0, Ljava/lang/InterruptedException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_0
    throw v0

    :goto_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3

    :catch_3
    new-instance v0, Lc5/a;

    const/4 v1, 0x0

    const/4 v2, -0x3

    invoke-direct {v0, v7, v2, v1}, Lc5/a;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v8, v0}, Lc5/l;->execute(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    return-object v0
.end method
